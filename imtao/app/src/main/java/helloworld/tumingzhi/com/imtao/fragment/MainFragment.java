package helloworld.tumingzhi.com.imtao.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import helloworld.tumingzhi.com.imtao.R;
import helloworld.tumingzhi.com.imtao.adapter.MainHeaderAdAdapter;
import helloworld.tumingzhi.com.imtao.adapter.MainMenuAdapter;
import helloworld.tumingzhi.com.imtao.adapter.SecondMenuAdapter;
import helloworld.tumingzhi.com.imtao.util.DataUtil;
import android.support.v7.widget.RecyclerView;

/**
 * 主界面视图
 */

public class MainFragment extends android.support.v4.app.Fragment{

    protected int[] icons={R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,R.mipmap.header_pic_ad1};
    protected ViewPager mVPagerHeaderAd;//广告头部

    //菜单图标
    protected int [] menuIons={R.mipmap.menu_airport,R.mipmap.menu_hatol,
            R.mipmap.menu_trav,R.mipmap.menu_nearby,R.mipmap.menu_ticket,
            R.mipmap.menu_train,R.mipmap.menu_car,R.mipmap.menu_course};
    String [] menus;
    //二级菜单图标
    protected int [] menuIons2={R.mipmap.menu_second_ticket,R.mipmap.menu_second_service,
            R.mipmap.menu_second_airport};
    String [] menus2;

    protected RecyclerView mRecycleViewMenu;//主菜单
    protected RecyclerView sRecycleViewMenu;//二级菜单
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus=this.getActivity().getResources().getStringArray(R.array.main_menu);
        menus2=this.getActivity().getResources().getStringArray(R.array.second_menu);

        mVPagerHeaderAd=getView().findViewById(R.id.vpager_main_header);

        mRecycleViewMenu=getView().findViewById(R.id.recycleview_main_menu);
        sRecycleViewMenu=getView().findViewById(R.id.recycleview_second_menu);

        MainHeaderAdAdapter adapter=new MainHeaderAdAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(),icons));
        mVPagerHeaderAd.setAdapter(adapter);

        //菜单
        //布局样式
        mRecycleViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter=new MainMenuAdapter(getActivity(),DataUtil.getMainMenus(menuIons,menus));
        mRecycleViewMenu.setAdapter(mainMenuAdapter);

        //二级菜单
        sRecycleViewMenu.setLayoutManager(new GridLayoutManager(getActivity(),3));
        SecondMenuAdapter secondMenuAdapter=new SecondMenuAdapter(getActivity(),DataUtil.getMainMenus(menuIons2,menus2));
        sRecycleViewMenu.setAdapter(secondMenuAdapter);
    }
}
