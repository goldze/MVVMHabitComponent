package com.goldze.main.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.goldze.main.BR;
import com.goldze.main.R;
import com.goldze.main.databinding.FragmentTab2Binding;
import com.goldze.main.ui.viewmodel.TabBar2ViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;

/**
 * Created by goldze on 2018/6/21
 */

public class TabBar2Fragment extends BaseFragment<FragmentTab2Binding, TabBar2ViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_tab2;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public TabBar2ViewModel initViewModel() {
        return new TabBar2ViewModel(getContext());
    }

    @Override
    public void initData() {
        // 使用 TabLayout 和 ViewPager 相关联
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
    }
}
