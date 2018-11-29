package com.goldze.main.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

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
                inMain();
            }
        }, 3 * 1000);
    }

    /**
     * 进入主页面
     */
    private void inMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
