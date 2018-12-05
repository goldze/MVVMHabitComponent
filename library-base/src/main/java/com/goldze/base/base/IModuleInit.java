package com.goldze.base.base;

import android.app.Application;

/**
 * Created by goldze on 2018/6/21 0021.
 * 动态配置Application，有需要初始化的组件实现该接口，统一在主app的Application中初始化
 */

public interface IModuleInit {
    //初始化优先的
    boolean onInitAhead(Application application);

    //初始化靠后的
    boolean onInitLow(Application application);
}
