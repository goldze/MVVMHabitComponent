package com.goldze.user.ui.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.alibaba.android.arouter.launcher.ARouter;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;

/**
 * Created by goldze on 2018/6/21.
 */

public class UserDetailViewModel extends BaseViewModel {
    public ObservableField<String> nameObservable = new ObservableField();

    public UserDetailViewModel(@NonNull Application application) {
        super(application);
    }

    public void setName(String name) {
        nameObservable.set(name);
    }

    //回传参数
    public BindingCommand backOnClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            if (!TextUtils.isEmpty(nameObservable.get())) {
                //RxBus解耦组件通信
                RxBus.getDefault().post(nameObservable.get());
            }
            finish();
        }
    });
}
