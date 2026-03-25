package o;

import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.huawei.business.MTHuaweiBusiness;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.tgR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ServiceC46927tgR extends HmsMessageService {
    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(java.lang.String str) {
        super.onNewToken(str);
        pUU.KWHzl("OKexHmsService", "onNewToken : " + str);
        copydefault(str);
        EZpvd(str, null);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onNewToken(java.lang.String str, android.os.Bundle bundle) {
        super.onNewToken(str, bundle);
        pUU.KWHzl("OKexHmsService", "onNewTokenBundle : " + str);
        copydefault(str);
        EZpvd(str, bundle);
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        pUU.KWHzl("OKexHmsService", "onMessageReceived");
        OLrzqt(remoteMessage);
        AEQbTJ(remoteMessage);
    }

    public final void copydefault(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                MTCommonLog.d("MTHuaweiCallback", "onTokenFailed:onNewToken token is empty");
                MTHuaweiBusiness.getInstance().onNode(getApplicationContext(), 3004, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 2);
            } else {
                MTCommonLog.d("MTHuaweiCallback", "onTokenSuccess:onNewToken token is " + str);
                MTHuaweiBusiness.getInstance().onToken(getApplicationContext(), str, 2);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKexHmsService", e);
        }
    }

    public final void EZpvd(java.lang.String str, android.os.Bundle bundle) {
        try {
            if (str.isEmpty()) {
                return;
            }
            OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "HmsMessageServiceOneSignal onNewToken refresh token:" + str);
            C57831ypo.KWHzl(this, str, bundle);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKexHmsService", e);
        }
    }

    public final void OLrzqt(RemoteMessage remoteMessage) {
        try {
            C57831ypo.copydefault(this, remoteMessage);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKexHmsService", e);
        }
    }

    public final void AEQbTJ(RemoteMessage remoteMessage) {
        RemoteMessage.Notification notification = remoteMessage != null ? remoteMessage.getNotification() : null;
        if (notification != null) {
            java.lang.String title = notification.getTitle();
            java.lang.String body = notification.getBody();
            int notifyId = notification.getNotifyId();
            if (title == null) {
                title = "";
            }
            if (body == null) {
                body = "";
            }
            C46934tgY.AEQbTJ.OLrzqt(com.okinc.okpush.sdk.utils.NotificationChannel.OneSignalHMS, new C46914tgE(java.lang.String.valueOf(notifyId), title, body, ""));
            return;
        }
        C46934tgY.AEQbTJ.OLrzqt(com.okinc.okpush.sdk.utils.NotificationChannel.OneSignalHMS, null);
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
