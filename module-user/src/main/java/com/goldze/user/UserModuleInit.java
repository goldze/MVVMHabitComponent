package com.goldze.user;

import android.app.Application;

import com.goldze.base.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by goldze on 2018/6/21 0021.
 */

public class UserModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("用户模块初始 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("用户模块初始 -- onInitLow");
        return false;
    }
}
