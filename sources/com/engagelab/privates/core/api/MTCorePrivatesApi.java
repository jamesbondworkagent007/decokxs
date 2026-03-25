package com.engagelab.privates.core.api;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.v;
import com.engagelab.privates.common.w;
import com.engagelab.privates.core.global.MTCoreGlobal;

/* JADX INFO: loaded from: classes2.dex */
public class MTCorePrivatesApi {
    public static final int SDK_VERSION_CODE = 439;
    public static final String SDK_VERSION_NAME = "4.3.9";
    private static final String TAG = "MTCorePrivatesApi";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configAddress(Context context, Address address) {
        if (MTGlobal.IS_FOR_ENGAGELAB) {
            return;
        }
        if (context == null) {
            MTCoreGlobal.setAddress(address);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setAddress(address);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configAppChannel(Context context, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "configAppChannel context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "configAppChannel appChannel can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.setAppChannel(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configAppKey(Context context, String str) {
        if (context == null) {
            MTCommonLog.e(TAG, "configAppKey context can't be null, please check it");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.e(TAG, "configAppKey appKey can't be empty, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.setAppKey(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configConnectRetryCount(Context context, int i) {
        if (context == null) {
            MTCoreGlobal.setConnectRetryCount(i);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setConnectRetryCount(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configDebugMode(Context context, boolean z) {
        if (context == null) {
            MTGlobal.setDebugMode(z);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.setDebugMode(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configHeartbeatInterval(Context context, long j) {
        if (context == null) {
            MTCoreGlobal.setHeartbeatInterval(j);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setHeartbeatInterval(j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configSM4(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "configSM4 context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTGlobal.setEncryptType(2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configWakeAndBeWake(Context context, boolean z) {
        if (context == null) {
            MTCommonLog.e(TAG, "configWakeAndBeWake context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setWakeAndBeWakeState(z);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getLoginCode(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "getLoginCode context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getLoginCode(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return w.d(context.getApplicationContext());
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getPassword(Context context) {
        if (context != null) {
            return MTGlobal.isMainProcess(context.getApplicationContext()) ? MTCoreGlobal.getPassword(context) : MTGlobal.isRemoteProcess(context.getApplicationContext()) ? w.e(context.getApplicationContext()) : "";
        }
        MTCommonLog.e(TAG, "getPassword context can't be null, please check it");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getRegisterCode(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "getRegisterCode context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getRegisterCode(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return w.g(context.getApplicationContext());
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getRegistrationId(Context context) {
        if (context != null) {
            return MTGlobal.isMainProcess(context.getApplicationContext()) ? MTCoreGlobal.getRegistrationId(context) : MTGlobal.isRemoteProcess(context.getApplicationContext()) ? w.h(context.getApplicationContext()) : "";
        }
        MTCommonLog.e(TAG, "getRegistrationId context can't be null, please check it");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int getSeedId(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "getSeedId context can't be null, please check it");
            return 0;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getSeedId(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return w.i(context.getApplicationContext());
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getServerTime(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "getServerTime context can't be null, please check it");
            return 0L;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getServerTime(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return w.j(context.getApplicationContext());
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long getUserId(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "getUserId context can't be null, please check it");
            return 0L;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            return MTCoreGlobal.getUserId(context);
        }
        if (MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return w.o(context.getApplicationContext());
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isConnectContinue(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "isConnectContinue context can't be null, please check it");
            return false;
        }
        if (!MTGlobal.isMainProcess(context.getApplicationContext()) && !MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            return false;
        }
        for (String str : MTObservable.getInstance().observeNameQueue) {
            if (TextUtils.equals(str, "com.engagelab.privates.push.MTPush") || TextUtils.equals(str, "com.engagelab.privates.message.MTMessage")) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setReportCacheFileMaximum(int i) {
        if (i >= 0) {
            v.c = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setTcpSSl(boolean z) {
        MTGlobal.setTcpSSL(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setWakeAndBeWakeEnable(Context context, boolean z) {
        configWakeAndBeWake(context, z);
    }
}
