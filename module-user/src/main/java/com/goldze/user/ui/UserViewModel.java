package com.goldze.user.ui;

import android.app.Activity;
import android.content.Context;
import android.databinding.ObservableField;
import android.text.TextUtils;

import com.alibaba.android.arouter.launcher.ARouter;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.bus.RxBus;

/**
 * Created by goldze on 2018/6/21.
 */

public class UserViewModel extends BaseViewModel {
    public ObservableField<String> nameObservable = new ObservableField();

    public UserViewModel(Context context, String name) {
        super(context);
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
            ((Activity) context).finish();
        }
    });
}
