package com.okinc.breakpad;

/* JADX INFO: loaded from: classes3.dex */
public class OKBreakpad {
    public static native void setupNativeCrashesListener(String str);

    public static native void testNativeDereferenceNullPointer();

    public static native void testNativeStackOverflowCrash();

    static {
        System.loadLibrary("breakpad-core");
    }
}
