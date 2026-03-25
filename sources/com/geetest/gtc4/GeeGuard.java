package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public class GeeGuard {

    public interface CallbackHandler {
        void onCompletion(Integer num, GeeGuardReceipt geeGuardReceipt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static GeeGuardReceipt fetchReceipt(Context context, String str) {
        return v3.f523a.a(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static String getData(Context context, GeeGuardConfiguration geeGuardConfiguration) {
        return Core.getData(context.getApplicationContext(), geeGuardConfiguration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getLogEnabled() {
        return p3.f491a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getVersion() {
        return "2.7.1.1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void register(Context context, String str) {
        v3.f523a.a(context, str, (String) null, (CallbackHandler) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setLogEnabled(boolean z) {
        p3.f491a = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void submitReceipt(Context context, String str, int i, CallbackHandler callbackHandler) {
        v3.f523a.b(context, str, i, callbackHandler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static GeeGuardReceipt fetchReceipt(Context context, String str, String str2) {
        return r3.a(context, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void register(Context context, String str, CallbackHandler callbackHandler) {
        v3.f523a.a(context, str, (String) null, callbackHandler);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void submitReceipt(Context context, String str, CallbackHandler callbackHandler) {
        v3.f523a.b(context, str, 5000, callbackHandler);
    }

    public static void register(Context context, String str, String str2) {
        v3.f523a.a(context, str, str2, (CallbackHandler) null);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, int i, CallbackHandler callbackHandler) {
        r3.a(context, str, str2, i, "https://riskct.geetest.com/g2/api/v1/client_report", callbackHandler);
    }

    @Deprecated
    public static void submitReceipt(Context context, String str, String str2, CallbackHandler callbackHandler) {
        r3.a(context, str, str2, 5000, "https://riskct.geetest.com/g2/api/v1/client_report", callbackHandler);
    }
}
