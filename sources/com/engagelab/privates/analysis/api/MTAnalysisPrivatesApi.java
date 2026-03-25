package com.engagelab.privates.analysis.api;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.analysis.MTAnalysis;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.e;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.h;
import com.engagelab.privates.common.j;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class MTAnalysisPrivatesApi {
    public static int SDK_VERSION_CODE = 439;
    public static String SDK_VERSION_NAME = "4.3.9";
    private static final String TAG = "MTAnalysisPrivatesApi";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void bindAccount(Context context, Account account) {
        onAccount(context.getApplicationContext(), account);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void clearCommonProperty(Context context) {
        clearStaticProperty(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearDynamicProperty(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "clearDynamicProperty context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTAnalysis());
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.CLEAR_DYNAMIC_PROPERTY, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void clearStaticProperty(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "clearStaticProperty context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTAnalysis());
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.CLEAR_STATIC_PROPERTY, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void config(Context context, Config config) {
        if (context == null) {
            MTCommonLog.e(TAG, "setConfig context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            j.a(config);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "init context can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.init(context.getApplicationContext(), false);
            if (MTGlobal.isMainProcess(context.getApplicationContext())) {
                MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTCore());
                MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTAnalysis());
                MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.INIT, null);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void onAccount(Context context, Account account) {
        if (context == null) {
            MTCommonLog.e(TAG, "onAccount context can't be null, please check it");
            return;
        }
        if (account == null) {
            MTCommonLog.e(TAG, "onAccount account can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MTAnalysisConstants.Account.KEY_ACCOUNT, account);
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.ON_ACCOUNT, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void onEvent(Context context, Event event) {
        if (context == null) {
            MTCommonLog.e(TAG, "onEvent context can't be null, please check it");
        }
        if (event == null) {
            MTCommonLog.e(TAG, "onEvent event can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            String name = event.getName();
            if (TextUtils.isEmpty(name)) {
                return;
            }
            name.hashCode();
            switch (name) {
                case "exposure":
                    e.a().a(context.getApplicationContext(), (ExposureEvent) event);
                    break;
                case "third_msg_status":
                case "active":
                case "active_launch":
                case "active_terminate":
                case "msg_status":
                case "custom_event":
                case "crash_log":
                case "identify_account":
                    MTCommonLog.e(TAG, "the event name [" + name + "] is invalid");
                    break;
                default:
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("event", event);
                    MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.ON_EVENT, bundle);
                    break;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reportCache(Context context) {
        if (context == null) {
            MTCommonLog.e(TAG, "reportCache context can't be null, please check it");
        } else if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.ON_REPORT, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setAnalysisConfig(Context context, Config config) {
        config(context, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setChannel(Context context, String str) {
        MTCorePrivatesApi.configAppKey(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setCommonProperty(Context context, Map<String, Object> map) {
        setStaticProperty(context, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setConfig(Context context, Config config) {
        config(context, config);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void setDebugMode(boolean z) {
        MTCorePrivatesApi.configDebugMode(null, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setDynamicProperty(Context context, Map<String, Object> map) {
        if (context == null) {
            MTCommonLog.e(TAG, "setDynamicProperty context can't be null, please check it");
            return;
        }
        if (map == null) {
            MTCommonLog.e(TAG, "setDynamicProperty map can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    bundle.putByte(key, ((Byte) value).byteValue());
                }
                if (value instanceof Short) {
                    bundle.putShort(key, ((Short) value).shortValue());
                }
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                }
                if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                }
                if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                }
                if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                }
                if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                }
                if (value instanceof String) {
                    bundle.putString(key, (String) value);
                }
            }
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTAnalysis());
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.SET_DYNAMIC_PROPERTY, bundle);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setReportCacheFileMaximum(int i) {
        if (i >= 0) {
            h.c = i;
        }
    }

    @Deprecated
    public static void setReportInBgEnable(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setStaticProperty(Context context, Map<String, Object> map) {
        if (context == null) {
            MTCommonLog.e(TAG, "setStaticProperty context can't be null, please check it");
            return;
        }
        if (map == null) {
            MTCommonLog.e(TAG, "setStaticProperty map can't be null, please check it");
            return;
        }
        if (MTGlobal.isMainProcess(context.getApplicationContext())) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Byte) {
                    bundle.putByte(key, ((Byte) value).byteValue());
                }
                if (value instanceof Short) {
                    bundle.putShort(key, ((Short) value).shortValue());
                }
                if (value instanceof Integer) {
                    bundle.putInt(key, ((Integer) value).intValue());
                }
                if (value instanceof Long) {
                    bundle.putLong(key, ((Long) value).longValue());
                }
                if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                }
                if (value instanceof Float) {
                    bundle.putFloat(key, ((Float) value).floatValue());
                }
                if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                }
                if (value instanceof String) {
                    bundle.putString(key, (String) value);
                }
            }
            MTCommonPrivatesApi.observer(context.getApplicationContext(), new MTAnalysis());
            MTCommonPrivatesApi.sendMessage(context.getApplicationContext(), MTAnalysis.f319a, MTAnalysisConstants.MainWhat.SET_STATIC_PROPERTY, bundle);
        }
    }

    @Deprecated
    public static void startCrashHandler(Context context) {
    }

    @Deprecated
    public static void stopCrashHandler(Context context) {
    }

    @Deprecated
    public static void unbindAccount(Context context) {
    }
}
