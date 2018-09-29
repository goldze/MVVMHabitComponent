package com.goldze.main.ui.adapter;

import android.databinding.Observable;
import android.databinding.ViewDataBinding;
import android.view.View;
import android.view.ViewGroup;

import com.goldze.main.databinding.ItemViewpagerBinding;
import com.goldze.main.ui.viewmodel.ViewPagerItemViewModel;

import me.goldze.mvvmhabit.utils.KLog;
import me.goldze.mvvmhabit.utils.ToastUtils;
import me.tatarka.bindingcollectionadapter2.BindingViewPagerAdapter;

/**
 * Created by goldze on 2018/6/21.
 */

public class ViewPagerBindingAdapter extends BindingViewPagerAdapter<ViewPagerItemViewModel> {

    @Override
    public void onBindBinding(final ViewDataBinding binding, int variableId, int layoutRes, int position, ViewPagerItemViewModel item) {
        super.onBindBinding(binding, variableId, layoutRes, position, item);
        //这里强转成ViewPagerItemViewModel对应的ViewDataBinding，
        final ItemViewpagerBinding _binding = (ItemViewpagerBinding) binding;
        KLog.e("onBindBinding：" + _binding.tvContent.getText().toString());
        /**
         * 这个位置要注意,Observable是add一个Callback，如果页面不停的切换,onBindBinding会调用多次，所以会不停的add,
         * 导致回调方法onPropertyChanged执行多次
         * */
        final Observable.OnPropertyChangedCallback callback = new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                KLog.e("onClickObservable：" + _binding.tvContent.getText().toString());
                ToastUtils.showShort(_binding.tvContent.getText().toString());
            }
        };
        item.uc.onClickObservable.addOnPropertyChangedCallback(callback);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
