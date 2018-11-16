package com.goldze.base.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 * Created by goldze on 2018/6/21
 */

public class RouterActivityPath {
    /**
     * 宿主组件
     */
    public static class App {
        /*主界面*/
        public static final String APP_MAIN = "/app/Main";
    }

    /**
     * 身份验证组件
     */
    public static class Sign {
        /*登录界面*/
        public static final String SIGN_LOGIN = "/sign/Login";
    }

    /**
     * 用户组件
     */
    public static class User {
        /*用户详情*/
        public static final String USER_USERDETAIL = "/user/UserDetail";
    }
}
