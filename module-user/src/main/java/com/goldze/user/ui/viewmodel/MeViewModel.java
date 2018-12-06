package com.goldze.user.ui.viewmodel;

import android.app.Application;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.goldze.base.contract._Login;
import com.goldze.base.global.SPKeyGlobal;
import com.goldze.base.router.RouterActivityPath;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;
import me.goldze.mvvmhabit.bus.RxSubscriptions;
import me.goldze.mvvmhabit.utils.SPUtils;

/**
 * Created by goldze on 2018/6/21.
 */

public class MeViewModel extends BaseViewModel {
    public ObservableInt loginBtnVisible = new ObservableInt();
    public ObservableField<String> userInfoObservable = new ObservableField();
    private Disposable subscribe;

    public MeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onCreate() {
        initData();
    }

    public void initData() {
        String userInfo = SPUtils.getInstance().getString(SPKeyGlobal.USER_INFO);
        if (!TextUtils.isEmpty(userInfo)) {
            userInfoObservable.set(userInfo);
            loginBtnVisible.set(View.GONE);
        } else {
            loginBtnVisible.set(View.VISIBLE);
        }
    }

    //登录按钮点击事件
    public BindingCommand startLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //采用ARouter+RxBus实现组件间通信
            ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN).navigation();
            subscribe = RxBus.getDefault().toObservable(_Login.class)
                    .subscribe(new Consumer<_Login>() {
                        @Override
                        public void accept(_Login l) throws Exception {
                            //登录成功后重新刷新数据
                            initData();
                            //解除注册
                            RxSubscriptions.remove(subscribe);
                        }
                    });
            RxSubscriptions.add(subscribe);
        }
    });
    //退出登录按钮点击事件
    public BindingCommand outLoginOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            SPUtils.getInstance().put(SPKeyGlobal.USER_INFO, "");
            initData();
        }
    });
}
