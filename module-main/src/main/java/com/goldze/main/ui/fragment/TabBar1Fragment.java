package com.goldze.main.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.goldze.main.BR;
import com.goldze.main.R;
import com.goldze.main.ui.viewmodel.TabBar1ViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Created by goldze on 2018/6/21
 */

public class TabBar1Fragment extends BaseFragment {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_tab1;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public TabBar1ViewModel initViewModel() {
        return new TabBar1ViewModel(getContext());
    }
}
