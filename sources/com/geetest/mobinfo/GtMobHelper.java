package com.geetest.mobinfo;

import android.content.Context;

/* JADX INFO: loaded from: classes17.dex */
public class GtMobHelper implements GtMobInterface {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        System.loadLibrary("deepknow-lib");
    }

    public static native byte[] getExtraData(Context context, String str);

    public static native byte[] getPostParamForDeepknow(ConfigInterface configInterface, Context context);
}
