package com.just.agentweb;

/* JADX INFO: loaded from: classes14.dex */
class LogUtils {
    private static final String PREFIX = "agentweb-";

    public static void e(String str, String str2, Throwable th) {
    }

    public static boolean isDebug() {
        return AgentWebConfig.DEBUG;
    }

    public static void i(String str, String str2) {
        if (isDebug()) {
            PREFIX.concat(str);
        }
    }

    public static void v(String str, String str2) {
        if (isDebug()) {
            PREFIX.concat(str);
        }
    }

    public static void safeCheckCrash(String str, String str2, Throwable th) {
        if (isDebug()) {
            throw new RuntimeException(PREFIX.concat(str) + " " + str2, th);
        }
        PREFIX.concat(str);
    }

    public static void e(String str, String str2) {
        if (isDebug()) {
            PREFIX.concat(str);
        }
    }
}
