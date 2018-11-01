package com.goldze.main.ui.viewmodel;

import android.content.Context;
import android.databinding.ObservableBoolean;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.base.ItemViewModel;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;
import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by goldze on 2018/7/18.
 */

public class ViewPagerItemViewModel extends ItemViewModel {
    public String text;
    public UIChangeObservable uc = new UIChangeObservable();

    public class UIChangeObservable {
        //点击事件的观察者
        public ObservableBoolean onClickObservable = new ObservableBoolean(false);

    }

    public ViewPagerItemViewModel(@NonNull BaseViewModel viewModel, String text) {
        super(viewModel);
        this.text = text;
    }

    public BindingCommand onClick = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            //点击之后将逻辑转到adapter中处理
            uc.onClickObservable.set(!uc.onClickObservable.get());
        }
    });
}
