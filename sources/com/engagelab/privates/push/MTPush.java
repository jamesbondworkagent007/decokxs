package com.engagelab.privates.push;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.a0;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.b0;
import com.engagelab.privates.common.c0;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.d0;
import com.engagelab.privates.common.f0;
import com.engagelab.privates.common.i0;
import com.engagelab.privates.common.j0;
import com.engagelab.privates.common.k0;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.z;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes2.dex */
public class MTPush extends MTObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f352a = MTCommonConstants.getLogTag() + "PUSH";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        switch (i) {
            case 3001:
                c0.b().a(context, i, bundle);
                break;
            case 3002:
            case 3003:
            case 3004:
            case 3005:
                d0.b().a(context, i, bundle);
                break;
            case 3006:
                z.a().a(context, bundle);
                break;
            case MTPushConstants.PlatformNode.CODE_UPLOAD_TOKEN_SUCCESS /* 3007 */:
            case MTPushConstants.PlatformNode.CODE_GET_TOKEN_SUCCESS /* 3008 */:
            case 3009:
            case 3010:
            case 3020:
            default:
                MTCommonPrivatesApi.sendMessage(context, f352a, i, bundle);
                break;
            case MTPushConstants.MainWhat.TAG_ADD /* 3011 */:
            case MTPushConstants.MainWhat.TAG_DELETE /* 3012 */:
            case MTPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
            case MTPushConstants.MainWhat.TAG_QUERY /* 3014 */:
            case MTPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
            case MTPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                k0.b().a(context, i, bundle);
                break;
            case MTPushConstants.MainWhat.ALIAS_SET /* 3017 */:
            case MTPushConstants.MainWhat.ALIAS_GET /* 3018 */:
            case MTPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                i0.b().a(context, i, bundle);
                break;
            case MTPushConstants.MainWhat.ON_PLATFORM_TOKEN /* 3021 */:
                f0.b().e(context, bundle);
                break;
            case MTPushConstants.MainWhat.ON_PLATFORM_NODE /* 3022 */:
                f0.b().b(context, bundle);
                break;
            case MTPushConstants.MainWhat.ON_MOBILE_NUMBER /* 3023 */:
                j0.b().a(context, i, bundle);
                break;
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public short getSdkFlag() {
        return (short) 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkName() {
        return HiAnalyticsConstant.BI_KEY_SDK_VER;
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public int getSdkPriority() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String getSdkVersion() {
        return MTPushPrivatesApi.SDK_VERSION_NAME;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{f352a};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleDelayMessage(Context context, int i, Bundle bundle) {
        switch (i) {
            case 26:
                j0.b().a(context, bundle);
                break;
            case 27:
                f0.b().c(context, bundle);
                break;
            case 28:
                k0.b().a(context, bundle);
                break;
            case 29:
                i0.b().a(context, bundle);
                break;
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSdk() {
        return true;
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        if (i == 3102 || i == 3103 || i == 3797 || i == 3798 || i == 3978 || i == 3979 || i == 3 || i == 59 || i == 2001 || i == 2999) {
            return true;
        }
        switch (i) {
            case MTPushConstants.RemoteWhat.DELETE_GEOFENCE /* 3880 */:
            case MTPushConstants.RemoteWhat.ADD_GEOFENCE /* 3881 */:
            case MTPushConstants.RemoteWhat.SET_GEOFENCE_INTERVAL /* 3882 */:
            case MTPushConstants.RemoteWhat.SET_GEOFENCE_COUNT /* 3883 */:
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE /* 3884 */:
            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE /* 3885 */:
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT /* 3886 */:
            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT /* 3887 */:
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT /* 3888 */:
            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT /* 3889 */:
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME /* 3890 */:
            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME /* 3891 */:
            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME /* 3892 */:
            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME /* 3893 */:
            case MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION /* 3894 */:
            case MTPushConstants.RemoteWhat.SHOW_NOTIFICATION /* 3895 */:
            case MTPushConstants.RemoteWhat.ON_NOTIFICATION_MESSAGE /* 3896 */:
            case MTPushConstants.RemoteWhat.ON_CUSTOM_MESSAGE /* 3897 */:
            case MTPushConstants.RemoteWhat.TURN_OFF_PUSH /* 3898 */:
            case MTPushConstants.RemoteWhat.TURN_ON_PUSH /* 3899 */:
                return true;
            default:
                switch (i) {
                    case MTPushConstants.RemoteWhat.ON_NOTIFICATION_STATE /* 3994 */:
                    case MTPushConstants.RemoteWhat.ON_NOTIFICATION_OPENED /* 3995 */:
                    case MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED /* 3996 */:
                    case MTPushConstants.RemoteWhat.ON_NOTIFICATION_CLICKED /* 3997 */:
                    case MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
                    case MTPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED /* 3999 */:
                        return true;
                    default:
                        switch (i) {
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                return true;
                            default:
                                switch (i) {
                                    case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
                                    case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                                    case MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
                                    case MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                                        return true;
                                    default:
                                        switch (i) {
                                            case 3001:
                                            case 3002:
                                            case 3003:
                                            case 3004:
                                            case 3005:
                                            case 3006:
                                                return true;
                                            default:
                                                switch (i) {
                                                    case MTPushConstants.MainWhat.TAG_ADD /* 3011 */:
                                                    case MTPushConstants.MainWhat.TAG_DELETE /* 3012 */:
                                                    case MTPushConstants.MainWhat.TAG_UPDATE /* 3013 */:
                                                    case MTPushConstants.MainWhat.TAG_QUERY /* 3014 */:
                                                    case MTPushConstants.MainWhat.TAG_DELETE_ALL /* 3015 */:
                                                    case MTPushConstants.MainWhat.TAG_QUERY_ALL /* 3016 */:
                                                    case MTPushConstants.MainWhat.ALIAS_SET /* 3017 */:
                                                    case MTPushConstants.MainWhat.ALIAS_GET /* 3018 */:
                                                    case MTPushConstants.MainWhat.ALIAS_CLEAR /* 3019 */:
                                                        return true;
                                                    default:
                                                        switch (i) {
                                                            case MTPushConstants.MainWhat.ON_PLATFORM_TOKEN /* 3021 */:
                                                            case MTPushConstants.MainWhat.ON_PLATFORM_NODE /* 3022 */:
                                                            case MTPushConstants.MainWhat.ON_MOBILE_NUMBER /* 3023 */:
                                                                return true;
                                                            default:
                                                                switch (i) {
                                                                    case MTPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                                                                    case MTPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                                                                    case MTPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                                                                    case MTPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                                                                        return true;
                                                                    default:
                                                                        return false;
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        if (i == 3) {
            b0.a().a(context, bundle);
        }
        if (i == 59) {
            d0.b().c(context, bundle);
            return;
        }
        if (i == 2001) {
            f0.b().a(context);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTPushConstants.RemoteWhat.ON_GEOFENCE, null);
            return;
        }
        if (i == 2997) {
            z.a().b(context, 0);
            return;
        }
        if (i == 2999) {
            f0.b().c(context);
            z.a().e(context);
            z.a().b(context, 2);
            return;
        }
        if (i == 3978) {
            j0.b().b(context, i, bundle);
            return;
        }
        if (i == 3979) {
            f0.b().f(context, bundle);
            return;
        }
        switch (i) {
            case 26:
                j0.b().b(context, bundle);
                break;
            case 27:
                f0.b().d(context, bundle);
                break;
            case 28:
                k0.b().b(context, bundle);
                break;
            case 29:
                i0.b().b(context, bundle);
                break;
            default:
                switch (i) {
                    case MTCommonConstants.RemoteWhat.TO_BACKGROUND /* 1994 */:
                        a0.a().a(context);
                        break;
                    case MTCommonConstants.RemoteWhat.TO_FOREGROUND /* 1995 */:
                        a0.a().b(context);
                        z.a().b(context, 1);
                        break;
                    case MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED /* 1996 */:
                        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
                        break;
                    case MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED /* 1997 */:
                        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
                        break;
                    default:
                        switch (i) {
                            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_BADGE /* 3884 */:
                                z.a().f(context);
                                break;
                            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_BADGE /* 3885 */:
                                z.a().c(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_COUNT /* 3886 */:
                                z.a().g(context);
                                break;
                            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_COUNT /* 3887 */:
                                z.a().d(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_LAYOUT /* 3888 */:
                                z.a().b(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_LAYOUT /* 3889 */:
                                z.a().e(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SILENCE_TIME /* 3890 */:
                                z.a().i(context);
                                break;
                            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_SILENCE_TIME /* 3891 */:
                                z.a().g(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.RESET_NOTIFICATION_SHOW_TIME /* 3892 */:
                                z.a().h(context);
                                break;
                            case MTPushConstants.RemoteWhat.SET_NOTIFICATION_SHOW_TIME /* 3893 */:
                                z.a().f(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.CLEAR_NOTIFICATION /* 3894 */:
                                d0.b().b(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.SHOW_NOTIFICATION /* 3895 */:
                                d0.b().d(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.ON_NOTIFICATION_MESSAGE /* 3896 */:
                                d0.b().a(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.ON_CUSTOM_MESSAGE /* 3897 */:
                                c0.b().a(context, bundle);
                                break;
                            case MTPushConstants.RemoteWhat.TURN_OFF_PUSH /* 3898 */:
                                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.TURN_OFF_CONNECT, null);
                                MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.TURN_OFF_PLATFORM_PUSH, null);
                                break;
                            case MTPushConstants.RemoteWhat.TURN_ON_PUSH /* 3899 */:
                                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.TURN_ON_CONNECT, null);
                                MTCommonPrivatesApi.sendMessageToMainProcess(context, 3102, null);
                                break;
                            default:
                                switch (i) {
                                    case MTPushConstants.RemoteWhat.ALIAS_CLEAR /* 3981 */:
                                    case MTPushConstants.RemoteWhat.ALIAS_GET /* 3982 */:
                                    case MTPushConstants.RemoteWhat.ALIAS_SET /* 3983 */:
                                        i0.b().b(context, i, bundle);
                                        break;
                                    case MTPushConstants.RemoteWhat.TAG_QUERY_ALL /* 3984 */:
                                    case MTPushConstants.RemoteWhat.TAG_DELETE_ALL /* 3985 */:
                                    case MTPushConstants.RemoteWhat.TAG_QUERY /* 3986 */:
                                    case MTPushConstants.RemoteWhat.TAG_UPDATE /* 3987 */:
                                    case MTPushConstants.RemoteWhat.TAG_DELETE /* 3988 */:
                                    case MTPushConstants.RemoteWhat.TAG_ADD /* 3989 */:
                                        k0.b().b(context, i, bundle);
                                        break;
                                    default:
                                        switch (i) {
                                            case MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED /* 3998 */:
                                                z.a().b(context, 3);
                                                break;
                                            case MTPushConstants.RemoteWhat.ON_CUSTOM_ARRIVED /* 3999 */:
                                                c0.b().b(context, i, bundle);
                                                break;
                                        }
                                        d0.b().b(context, i, bundle);
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }
}
