package com.engagelab.privates.common.cache;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes14.dex */
public class MTCommonConfig {
    private static final String APP_CHANNEL = "app_channel";
    private static final String APP_KEY = "app_key";
    private static final String DEVICE_ID = "device_id";
    private static final String NAME = "com.engagelab.privates.common.prefs";
    private static final String SDK_VERSION_CODE = "sdk_version_code";
    private static final String SDK_VERSION_NAME = "sdk_version_name";
    private static SharedPreferences sharedPreferences;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppChannel(Context context) {
        return getSP(context).getString(APP_CHANNEL, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppKey(Context context) {
        return getSP(context).getString(APP_KEY, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getDeviceId(Context context) {
        return getSP(context).getString(DEVICE_ID, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getSdkVersionCode(Context context) {
        return getSP(context).getInt(SDK_VERSION_CODE, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getSdkVersionName(Context context) {
        return getSP(context).getString(SDK_VERSION_NAME, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setAppChannel(Context context, String str) {
        getSP(context).edit().putString(APP_CHANNEL, str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setAppKey(Context context, String str) {
        getSP(context).edit().putString(APP_KEY, str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setDeviceId(Context context, String str) {
        getSP(context).edit().putString(DEVICE_ID, str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setSdkVersionCode(Context context, int i) {
        getSP(context).edit().putInt(SDK_VERSION_CODE, i).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setSdkVersionName(Context context, String str) {
        getSP(context).edit().putString(SDK_VERSION_NAME, str).commit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static SharedPreferences getSP(Context context) {
        if (sharedPreferences == null) {
            sharedPreferences = context.getSharedPreferences(NAME, 0);
        }
        return sharedPreferences;
    }
}
