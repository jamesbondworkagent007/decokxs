package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public final class Core {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        System.loadLibrary("gtc4core");
    }

    public static native String getData(Context context);

    public static native String getData(Context context, GeeGuardConfiguration geeGuardConfiguration);
}
