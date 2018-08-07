package com.goldze.component;

import com.goldze.base.config.ModuleLifecycleConfig;

import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by goldze on 2018/6/21 0021.
 */

public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        //开启打印日志
        KLog.init(true);
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
