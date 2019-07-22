package com.hxs.xposedreddevil;

import com.hxs.xposedreddevil.contentprovider.PropertiesUtils;
import com.hxs.xposedreddevil.hook.RedHook;
import com.hxs.xposedreddevil.hook.RevokeMsgHook;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

import static com.hxs.xposedreddevil.utils.Constant.RED_FILE;

public class RedDevil implements IXposedHookLoadPackage {

    @Override
    public void handleLoadPackage(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        System.out.println("微信版本:" + PropertiesUtils.getValue(RED_FILE, "wechatversion", ""));
        RedHook.getInstance().init(lpparam);
        RevokeMsgHook.getInstance().init(lpparam);
    }
}