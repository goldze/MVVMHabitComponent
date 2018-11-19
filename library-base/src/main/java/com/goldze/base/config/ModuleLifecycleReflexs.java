package com.goldze.base.config;

/**
 * Created by goldze on 2018/6/21 0021.
 * 组件生命周期反射类名管理，在这里注册需要初始化的组件，通过反射动态调用各个组件的初始化方法
 * 注意：以下模块中初始化的Module类不能被混淆
 */

public class ModuleLifecycleReflexs {
    private static final String BaseInit = "com.goldze.base.base.BaseModuleInit";
    //登录验证模块
    private static final String SignInit = "com.goldze.sign.SignModuleInit";
    //首页业务模块
    private static final String HomeInit = "com.goldze.home.HomeModuleInit";
    //工作业务模块
    private static final String WorkInit = "com.goldze.work.WorkModuleInit";
    //消息业务模块
    private static final String MsgInit = "com.goldze.msg.MsgModuleInit";
    //用户业务模块
    private static final String UserInit = "com.goldze.user.UserModuleInit";

    public static String[] initModuleNames = {BaseInit, SignInit, HomeInit, WorkInit, MsgInit,UserInit};
}
