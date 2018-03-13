package helloworld.tumingzhi.com.imtao.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by DELL on 2018/2/1.
 */

public class MainHeaderAdAdapter extends PagerAdapter {

    protected Context context;
    protected List<ImageView> images;
    public  MainHeaderAdAdapter(Context context, List<ImageView> images){
        this.context=context;
        this.images=images;
    }
    @Override
    public int getCount() {
        //不为空返回images.size()   为空返回0
        return null!=images?images.size():0;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(images.get(position));
        return images.get(position);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(images.get(position));
    }
}
