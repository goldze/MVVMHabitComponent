package com.goldze.component.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;

import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by goldze on 2017/8/17 0017.
 * 冷启动
 */

public class SplashActivity extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                inSign();
            }
        }, 3 * 1000);
    }

    /**
     * 跳转登录界面
     */
    private void inSign() {
        //使用路由框架，跳转到Sign组件的登录页
        ARouter.getInstance().build("/sign/Login").navigation();
        finish();
    }
}
