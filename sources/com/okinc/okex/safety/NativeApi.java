package com.okinc.okex.safety;

import o.C44712scB;

/* JADX INFO: loaded from: classes10.dex */
public class NativeApi {
    public static native String decryptAccount(String str);

    public static native byte[] decryptBody(String str, long j, String str2);

    public static native byte[] decryptBodyOptimized(String str, long j, String str2);

    public static native String decryptCommon(String str);

    public static native String decryptToken(String str);

    public static native String encryptAccount(String str);

    public static native String encryptBody(String str, long j, String str2);

    public static native String encryptBodyOptimized(String str, long j, String str2);

    public static native String encryptCommon(String str);

    public static native String encryptContent(String str);

    public static native String encryptToken(String str);

    public static native String getCryptoHandlerAesSecretKey();

    public static native String getDohRsaPrivacy();

    public static native String netApiSignature(String str, long j, String str2);

    public static String AEQbTJ() {
        try {
            return getCryptoHandlerAesSecretKey();
        } catch (UnsatisfiedLinkError unused) {
            return "";
        }
    }

    static {
        C44712scB.OLrzqt();
    }
}
