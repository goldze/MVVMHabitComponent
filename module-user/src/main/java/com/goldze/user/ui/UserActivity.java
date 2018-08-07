package com.goldze.user.ui;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.goldze.user.BR;
import com.goldze.user.R;
import com.goldze.user.databinding.ActivityUserBinding;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.bus.RxBus;

/**
 * Created by goldze on 2018/6/21.
 */
@Route(path = "/user/User")
public class UserActivity extends BaseActivity<ActivityUserBinding, UserViewModel> {
    //拿到路由过来的参数
    @Autowired()
    String name;

    @Override
    public void initParam() {
        //注入路由框架，拿到Autowired值，必须在initParam方法中注入，不然传到ViewModel里面的name为空
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_user;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public UserViewModel initViewModel() {
        //View持有ViewModel的引用 (这里暂时没有用Dagger2解耦)
        return new UserViewModel(this, name);
    }

}

