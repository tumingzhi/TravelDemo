package helloworld.tumingzhi.com.imtao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import helloworld.tumingzhi.com.imtao.R;
import helloworld.tumingzhi.com.imtao.entity.Menu;

/**
 * Created by DELL on 2018/2/1.
 */

public class SecondMenuAdapter extends RecyclerView.Adapter<SecondMenuAdapter.SecondMenuViewholder> {


    protected Context context;
    protected  List<Menu> menus;
    public SecondMenuAdapter(Context context, List<Menu> menus){
        this.context=context;
        this.menus=menus;
    }
    @Override
    public SecondMenuViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SecondMenuViewholder(LayoutInflater.from(context).inflate(R.layout.item_second_menu,null));
    }

    @Override
    public void onBindViewHolder(SecondMenuViewholder holder, int position) {

        Menu menu=menus.get(position);
        holder.mImgMenulcon.setImageResource(menu.icon);
        holder.mTxtMenuName.setText(menu.menuName);
    }

    @Override
    public int getItemCount() {
        return null!=menus?menus.size():0;
    }

    class SecondMenuViewholder extends RecyclerView.ViewHolder{

        public ImageView mImgMenulcon;
        public TextView mTxtMenuName;
        public SecondMenuViewholder(View itemView) {
            super(itemView);
            mImgMenulcon=itemView.findViewById(R.id.img_menu_icon);
            mTxtMenuName=itemView.findViewById(R.id.txt_menu_name);
        }
    }
}
