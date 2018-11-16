package com.goldze.msg.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.goldze.base.router.RouterFragmentPath;
import com.goldze.msg.R;
import com.goldze.msg.BR;
import com.goldze.msg.databinding.FragmentMsgBinding;
import com.goldze.msg.ui.viewmodel.MsgViewModel;

import me.goldze.mvvmhabit.base.BaseFragment;


/**
 * Created by goldze on 2018/6/21
 */
@Route(path = RouterFragmentPath.Msg.MSG_MSG)
public class MsgFragment extends BaseFragment<FragmentMsgBinding, MsgViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_msg;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
    }
}
