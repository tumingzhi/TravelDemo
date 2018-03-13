package helloworld.tumingzhi.com.imtao.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import helloworld.tumingzhi.com.imtao.LoginActivity;
import helloworld.tumingzhi.com.imtao.R;

/**
 * 我的界面视图
 */

public class MeFragment extends android.support.v4.app.Fragment{
    protected Button mBtnLogin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_me,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBtnLogin=getView().findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //登录
                Intent login=new Intent(getActivity(), LoginActivity.class);
                startActivity(login);
            }
        });
    }
}
