package com.goldze.main.ui.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;

import com.alibaba.android.arouter.launcher.ARouter;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;
import me.goldze.mvvmhabit.bus.RxSubscriptions;

/**
 * Created by goldze on 2018/6/21.
 */

public class TabBar1ViewModel extends BaseViewModel {
    public ObservableField<String> textObservable = new ObservableField("TAB");
    public TabBar1ViewModel(Context context) {
        super(context);
    }

    //订阅者
    private Disposable mSubscription;

    //注册RxBus
    @Override
    public void registerRxBus() {
        super.registerRxBus();
        //组件间通信采用RxBus，注册接受用户组件回传的值
        mSubscription = RxBus.getDefault().toObservable(String.class)
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String content) throws Exception {
                        textObservable.set(content);
                    }
                });
        //将订阅者加入管理站
        RxSubscriptions.add(mSubscription);
    }

    //进入用户组件
    public BindingCommand startUserComponent = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance()
                    .build("/user/User")
                    .withString("name", "goldze")
                    .navigation();
        }
    });

    //移除RxBus
    @Override
    public void removeRxBus() {
        super.removeRxBus();
        //将订阅者从管理站中移除
        RxSubscriptions.remove(mSubscription);
    }
}
