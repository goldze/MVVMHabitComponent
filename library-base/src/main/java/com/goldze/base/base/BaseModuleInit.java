package com.goldze.base.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.goldze.base.BuildConfig;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by goldze on 2018/6/21 0021.
 * 基础库自身初始化操作
 */

public class BaseModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        //开启打印日志
        KLog.init(true);
        //初始化阿里路由框架
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application); // 尽可能早，推荐在Application中初始化
        KLog.e("基础层初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("基础层初始化 -- onInitLow");
        return false;
    }
}
