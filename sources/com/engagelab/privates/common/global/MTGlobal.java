package com.engagelab.privates.common.global;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.cache.MTCommonConfig;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.component.MTCommonService;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.DeviceUtil;
import com.engagelab.privates.common.utils.StringUtil;
import com.engagelab.privates.common.utils.SystemUtil;
import com.google.android.exoplayer2.C;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class MTGlobal {
    private static final String APP_CHANNEL = "ENGAGELAB_PRIVATES_CHANNEL";
    private static final String APP_KEY = "ENGAGELAB_PRIVATES_APPKEY";
    private static final String APP_PROCESS = "ENGAGELAB_PRIVATES_PROCESS";
    private static final String APP_TRANSFER = "ENGAGELAB_PRIVATES_TRANSFER";
    private static final String INTENT_COMMON_RECEIVER = "com.engagelab.privates.intent.USER_RECEIVER";
    private static final String INTENT_COMMON_SERVICE = "com.engagelab.privates.intent.USER_SERVICE";
    public static boolean IS_FOR_BINANCE = false;
    public static boolean IS_FOR_CHINALIFE = false;
    public static boolean IS_FOR_ENGAGELAB = false;
    public static boolean IS_FOR_PINGANBANK = false;
    public static boolean IS_FOR_PINGANTECH = false;
    public static boolean IS_FOR_SGM = false;
    public static boolean IS_FOR_SPDBAND = false;
    private static AtomicBoolean IS_MAIN_PROCESS = null;
    private static final String TAG = "MTGlobal";
    private static String appChannel = null;
    private static String appKey = null;
    private static String appProcess = null;
    private static String appTransfer = null;
    private static int appVersionCode = 0;
    private static String appVersionName = null;
    private static MTCommonReceiver commonReceiver = null;
    private static MTCommonService commonService = null;
    public static Context context = null;
    private static String countryCode = null;
    private static String currentActivityName = "";
    private static int encryptType = 0;
    private static boolean isDebugMode = false;
    public static boolean isNeedRemoteProcess = false;
    private static AtomicBoolean isRemoteProcess = null;
    private static boolean isTcpSSL = false;
    private static boolean lifecycleState = false;
    private static String networkName = "unknown";
    private static String networkRadio = "";
    private static boolean networkState = false;
    private static int networkType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppChannel(Context context2) {
        if (TextUtils.isEmpty(appChannel)) {
            appChannel = getMetaData(context2, APP_CHANNEL);
        }
        return appChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppKey(Context context2) {
        if (TextUtils.isEmpty(appKey)) {
            appKey = getMetaData(context2, APP_KEY);
        }
        return appKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppProcess(Context context2) {
        if (TextUtils.isEmpty(appProcess)) {
            appProcess = getMetaData(context2, APP_PROCESS);
        }
        return appProcess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getAppVersionName(Context context2) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        try {
            String str = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            appVersionName = str;
            return str;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getAppVersionName failed: " + th.getMessage());
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MTCommonReceiver getCommonReceiver(Context context2) {
        MTCommonReceiver commonReceiverImpl = getCommonReceiverImpl(context2);
        if (commonReceiverImpl == null) {
            MTCommonLog.w(TAG, "getCommonReceiver is null");
        }
        return commonReceiverImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static MTCommonService getCommonService(Context context2) {
        MTCommonService commonServiceImpl = getCommonServiceImpl(context2);
        if (commonServiceImpl == null) {
            MTCommonLog.w(TAG, "getCommonService is null");
        }
        return commonServiceImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getCountryCode(Context context2) {
        if (TextUtils.isEmpty(countryCode)) {
            countryCode = SystemUtil.getCountry(context2);
        }
        return countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getCurrentActivityName() {
        return currentActivityName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getDebugMode() {
        return isDebugMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getDeviceId(Context context2) {
        String str;
        String deviceId = MTCommonConfig.getDeviceId(context2);
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        try {
            String androidId = DeviceUtil.getAndroidId(context2);
            String string = UUID.randomUUID().toString();
            str = StringUtil.get32MD5String(System.currentTimeMillis() + " " + androidId + " " + (Build.PRODUCT.toLowerCase() + "_" + Build.TIME) + string);
        } catch (Throwable unused) {
            str = StringUtil.get32MD5String(System.currentTimeMillis() + " " + UUID.randomUUID().toString() + "  ");
        }
        MTCommonConfig.setDeviceId(context2, str);
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getEncryptType() {
        return encryptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getLifecycleState() {
        return lifecycleState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getMainProcessName(Context context2) {
        return context2.getPackageName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMetaData(Context context2, String str) {
        Bundle bundle;
        Object obj;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            return (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get(str)) == null) ? "" : String.valueOf(obj);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getMetaData failed " + th.getMessage());
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getNetworkName() {
        return networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String getNetworkRadio() {
        return networkRadio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getNetworkState() {
        return networkState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int getNetworkType() {
        return networkType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getRemoteProcessName(Context context2, Class<?> cls) {
        try {
            return context2.getPackageManager().getServiceInfo(new ComponentName(context2.getPackageName(), cls.getCanonicalName()), 128).processName;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getRemoteProcessName failed " + th.getMessage());
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean getTcpSSL() {
        return isTcpSSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getTransfer(Context context2) {
        if (TextUtils.isEmpty(appTransfer)) {
            appTransfer = getMetaData(context2, APP_TRANSFER);
        }
        return appTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setAppChannel(String str) {
        appChannel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setAppKey(String str) {
        appKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setCountryCode(String str) {
        countryCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setCurrentActivityName(String str) {
        currentActivityName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setDebugMode(boolean z) {
        isDebugMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setDeviceId(Context context2, String str) {
        MTCommonConfig.setDeviceId(context2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setEncryptType(int i) {
        encryptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setLifecycleState(boolean z) {
        lifecycleState = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setNetworkName(String str) {
        networkName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setNetworkRadio(String str) {
        networkRadio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setNetworkState(boolean z) {
        networkState = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setNetworkType(int i) {
        networkType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setTcpSSL(boolean z) {
        isTcpSSL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static String getCurrentProcessName(Context context2) {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
        } catch (Throwable th2) {
            MTCommonLog.w(TAG, "getCurrentProcessName failed " + th2.getMessage());
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th3) {
            MTCommonLog.w(TAG, "getCurrentProcessName failed " + th3.getMessage());
        }
        try {
            fileInputStream = new FileInputStream("/proc/self/cmdline");
            try {
                byte[] bArr = new byte[256];
                int i = 0;
                while (true) {
                    int i2 = fileInputStream.read();
                    if (i2 <= 0 || i >= 256) {
                        break;
                    }
                    bArr[i] = (byte) i2;
                    i++;
                }
                if (i > 0) {
                    String str = new String(bArr, 0, i, C.UTF8_NAME);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        MTCommonLog.w(TAG, "getCurrentProcessName failed " + th4.getMessage());
                    }
                    return str;
                }
                try {
                    fileInputStream.close();
                    return "";
                } catch (Throwable th5) {
                    MTCommonLog.w(TAG, "getCurrentProcessName failed " + th5.getMessage());
                    return "";
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    MTCommonLog.w(TAG, "getCurrentProcessName failed " + th.getMessage());
                    if (fileInputStream == null) {
                        return "";
                    }
                    try {
                        fileInputStream.close();
                        return "";
                    } catch (Throwable th7) {
                        MTCommonLog.w(TAG, "getCurrentProcessName failed " + th7.getMessage());
                        return "";
                    }
                } catch (Throwable th8) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th9) {
                            MTCommonLog.w(TAG, "getCurrentProcessName failed " + th9.getMessage());
                        }
                    }
                    throw th8;
                }
            }
        } catch (Throwable th10) {
            fileInputStream = null;
            th = th10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static boolean hasPermission(Context context2, String str) {
        return context2.checkSelfPermission(str) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static boolean isMainProcess(Context context2) {
        AtomicBoolean atomicBoolean = IS_MAIN_PROCESS;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        IS_MAIN_PROCESS = new AtomicBoolean(false);
        try {
            if (TextUtils.equals(getCurrentProcessName(context2), getMainProcessName(context2))) {
                IS_MAIN_PROCESS.set(true);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "isMainProcess failed " + th.getMessage());
        }
        return IS_MAIN_PROCESS.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static boolean isRemoteProcess(Context context2) {
        AtomicBoolean atomicBoolean = isRemoteProcess;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        isRemoteProcess = new AtomicBoolean(false);
        try {
            String currentProcessName = getCurrentProcessName(context2);
            if (TextUtils.isEmpty(currentProcessName)) {
                isRemoteProcess.set(true);
            }
            if (TextUtils.equals(currentProcessName, getRemoteProcessName(context2, getCommonService(context2).getClass()))) {
                isRemoteProcess.set(true);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "isRemoteProcess failed " + th.getMessage());
        }
        return isRemoteProcess.get();
    }

    public static int getAppVersionCode(Context context2) {
        int i = appVersionCode;
        if (i != 0) {
            return i;
        }
        try {
            int i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
            appVersionCode = i2;
            return i2;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getAppVersionCode failed: " + th.getMessage());
            return 0;
        }
    }

    private static MTCommonReceiver getCommonReceiverImpl(Context context2) {
        MTCommonReceiver mTCommonReceiver = commonReceiver;
        if (mTCommonReceiver != null) {
            return mTCommonReceiver;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_RECEIVER);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryBroadcastReceivers(intent, 0).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null) {
                    String str = activityInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (MTCommonReceiver.class.isAssignableFrom(cls)) {
                            MTCommonReceiver mTCommonReceiver2 = (MTCommonReceiver) cls.newInstance();
                            commonReceiver = mTCommonReceiver2;
                            return mTCommonReceiver2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getCommonReceiver failed " + th.getMessage());
            return null;
        }
    }

    private static MTCommonService getCommonServiceImpl(Context context2) {
        MTCommonService mTCommonService = commonService;
        if (mTCommonService != null) {
            return mTCommonService;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(INTENT_COMMON_SERVICE);
            intent.setPackage(context2.getPackageName());
            Iterator<ResolveInfo> it = context2.getPackageManager().queryIntentServices(intent, 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.name;
                    if (!TextUtils.isEmpty(str)) {
                        Class<?> cls = Class.forName(str);
                        if (MTCommonService.class.isAssignableFrom(cls)) {
                            MTCommonService mTCommonService2 = (MTCommonService) cls.newInstance();
                            commonService = mTCommonService2;
                            return mTCommonService2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "getCommonService failed " + th.getMessage());
            return null;
        }
    }
}
