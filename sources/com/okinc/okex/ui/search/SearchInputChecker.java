package com.okinc.okex.ui.search;

import android.content.Context;
import o.C44712scB;

/* JADX INFO: loaded from: classes10.dex */
public class SearchInputChecker {
    public static native boolean keyFromJNICheck(Context context, String str);

    static {
        C44712scB.OLrzqt();
    }

    public static boolean copydefault(Context context, String str) {
        if (C44712scB.copydefault()) {
            return keyFromJNICheck(context, str);
        }
        return false;
    }
}
