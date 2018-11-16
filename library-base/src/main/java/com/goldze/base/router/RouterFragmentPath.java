package com.goldze.base.router;

/**
 * 用于组件开发中，ARouter多Fragment跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by goldze on 2018/6/21
 */

public class RouterFragmentPath {
    /**
     * 首页组件
     */
    public static class Home {
        /*首页*/
        public static final String HOME_HOME = "/home/Home";
    }

    /**
     * 工作组件
     */
    public static class Work {
        /*工作*/
        public static final String WORK_WORK = "/work/Work";
    }
    /**
     * 消息组件
     */
    public static class Msg {
        /*消息*/
        public static final String MSG_MSG = "/msg/Msg";
    }
    /**
     * 用户组件
     */
    public static class User {
        /*我的*/
        public static final String USER_ME = "/user/Me";
    }
}
