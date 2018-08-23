package com.goldze.main.ui.adapter;

import android.databinding.Observable;
import android.databinding.ViewDataBinding;
import android.view.View;

import com.goldze.main.databinding.ItemViewpagerBinding;
import com.goldze.main.ui.viewmodel.ViewPagerItemViewModel;

import me.goldze.mvvmhabit.utils.KLog;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

/**
 * Created by goldze on 2018/6/21.
 */

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {
    private ItemViewpagerBinding _binding;

    @Override
    public void onBindBinding(ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);
        //这里强转成ViewPagerItemViewModel对应的ViewDataBinding，
        _binding = (ItemViewpagerBinding) binding;
        KLog.e("onBindBinding：" + _binding.tvContent.getText().toString());
        item.uc.onClickObservable.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                KLog.e("onClickObservable：" + _binding.tvContent.getText().toString());
                ToastUtils.showShort(_binding.tvContent.getText().toString());
            }
        });
    }
}
