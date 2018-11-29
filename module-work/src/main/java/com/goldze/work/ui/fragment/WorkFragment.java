package com.goldze.work.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.goldze.base.router.RouterFragmentPath;
import com.goldze.work.R;
import com.goldze.work.BR;
import com.goldze.work.databinding.FragmentWorkBinding;
import com.goldze.work.ui.viewmodel.WorkViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;


/**
 * Created by goldze on 2018/6/21
 */
@Route(path = RouterFragmentPath.Work.WORK_WORK)
public class WorkFragment extends BaseFragment<FragmentWorkBinding, WorkViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_work;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}
