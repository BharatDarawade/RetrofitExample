package com.example.bharatd.retrofitexample.util;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by BharatD on 07-09-2018.
 */

public class CheckAppInstallation {

    public Boolean checkFbInstalled(Context context) {
        PackageManager pm = context.getPackageManager();
        boolean flag = false;
        try {
            pm.getPackageInfo("com.facebook.katana",
                    PackageManager.GET_ACTIVITIES);
            flag = true;
        } catch (PackageManager.NameNotFoundException e) {
            flag = false;
        }
        return flag;

    }
}