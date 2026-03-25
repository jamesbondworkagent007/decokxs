package com.engagelab.privates.core;

import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkRequest;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.m;
import com.engagelab.privates.common.n;
import com.engagelab.privates.common.o;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.v;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.google.api.client.http.HttpMethods;

/* JADX INFO: loaded from: classes2.dex */
public class MTCore extends MTObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f351a = MTCommonConstants.getLogTag() + "CORE";
    public static final String b = MTCommonConstants.getLogTag() + "REPORT";
    public static final String c = MTCommonConstants.getLogTag() + HttpMethods.CONNECT;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        if (i == 2001) {
            o.a().b(context);
            return;
        }
        if (i == 2002) {
            o.a().c(context);
            return;
        }
        if (i == 2103) {
            o.a().b(context, bundle);
            return;
        }
        if (i == 2233) {
            MTCommonPrivatesApi.sendMessage(context, b, i, bundle);
            return;
        }
        if (i == 2993) {
            String str = c;
            MTCommonPrivatesApi.releaseHandler(context, str);
            MTCommonPrivatesApi.sendMessage(context, str, i, bundle);
        } else if (i != 2994) {
            String str2 = f351a;
            MTCommonPrivatesApi.buildHandler(context, str2, (int) (MTCoreGlobal.getHeartbeatInterval() + WorkRequest.MIN_BACKOFF_MILLIS));
            MTCommonPrivatesApi.sendMessage(context, str2, i, bundle);
        } else {
            String str3 = c;
            MTCommonPrivatesApi.buildHandler(context, str3, (int) (MTCoreGlobal.getHeartbeatInterval() + WorkRequest.MIN_BACKOFF_MILLIS));
            MTCommonPrivatesApi.sendMessage(context, str3, i, bundle);
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public short getSdkFlag() {
        return (short) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkName() {
        return "core_sdk_ver";
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public int getSdkPriority() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkVersion() {
        return "4.3.9";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{f351a, b, c};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleDelayMessage(Context context, int i, Bundle bundle) {
        if (i == 2) {
            o.a().a(context);
        } else if (i == 2990) {
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
        } else {
            if (i != 2992) {
                return;
            }
            o.a().e(context);
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSdk() {
        return true;
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        if (i == 2 || i == 19 || i == 25 || i == 2222 || i == 2233 || i == 1998 || i == 1999 || i == 2001 || i == 2002 || i == 2998 || i == 2999) {
            return true;
        }
        switch (i) {
            case MTCommonConstants.RemoteWhat.START_CONNECT /* 1993 */:
            case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
            case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                return true;
            default:
                switch (i) {
                    case MTCoreConstants.MainWhat.ON_REGISTER_INTO /* 2101 */:
                    case MTCoreConstants.MainWhat.ON_LOGIN_INTO /* 2102 */:
                    case MTCoreConstants.MainWhat.ON_REGISTER_SUCCESS /* 2103 */:
                        return true;
                    default:
                        switch (i) {
                            case MTCoreConstants.RemoteWhat.RETRY_CONNECT /* 2990 */:
                            case MTCoreConstants.RemoteWhat.STOP_HEARTBEAT /* 2991 */:
                            case MTCoreConstants.RemoteWhat.START_HEARTBEAT /* 2992 */:
                            case MTCoreConstants.RemoteWhat.STOP_CONNECT /* 2993 */:
                            case MTCoreConstants.RemoteWhat.START_CONNECT /* 2994 */:
                            case MTCoreConstants.RemoteWhat.TURN_OFF_CONNECT /* 2995 */:
                            case MTCoreConstants.RemoteWhat.TURN_ON_CONNECT /* 2996 */:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        if (i == 19) {
            o.a().a(context, bundle);
            return;
        }
        if (i == 25) {
            m.a().a(context, bundle);
            return;
        }
        if (i == 1999) {
            m.a().b(context);
            m.a().a(context);
            return;
        }
        if (i == 2222) {
            o.a().c(context, bundle);
            return;
        }
        if (i == 2233) {
            v.a().a(context, bundle);
            return;
        }
        if (i == 2101) {
            m.a().c(context, bundle);
            return;
        }
        if (i == 2102) {
            m.a().b(context, bundle);
            return;
        }
        if (i != 2998) {
            if (i != 2999) {
                switch (i) {
                    case MTCommonConstants.RemoteWhat.START_CONNECT /* 1993 */:
                        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
                        break;
                    case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
                        n.a().a(context);
                        break;
                    case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                        n.a().b(context);
                        break;
                    default:
                        switch (i) {
                            case MTCoreConstants.RemoteWhat.RETRY_CONNECT /* 2990 */:
                                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
                                break;
                            case MTCoreConstants.RemoteWhat.STOP_CONNECT /* 2993 */:
                                o.a().f(context);
                                break;
                            case MTCoreConstants.RemoteWhat.START_CONNECT /* 2994 */:
                                o.a().d(context);
                                break;
                            case MTCoreConstants.RemoteWhat.TURN_OFF_CONNECT /* 2995 */:
                                o.a().h(context);
                                break;
                            case MTCoreConstants.RemoteWhat.TURN_ON_CONNECT /* 2996 */:
                                o.a().i(context);
                                break;
                        }
                        break;
                }
                return;
            }
            o.a().e(context);
            return;
        }
        o.a().g(context);
    }
}
