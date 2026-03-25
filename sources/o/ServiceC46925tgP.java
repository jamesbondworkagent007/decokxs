package o;

import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/* JADX INFO: renamed from: o.tgP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ServiceC46925tgP extends FirebaseMessagingService {
    public volatile InterfaceC46918tgI EZpvd;

    public final InterfaceC46918tgI AEQbTJ() {
        if (this.EZpvd == null) {
            synchronized (this) {
                if (this.EZpvd == null) {
                    this.EZpvd = new C46922tgM(this);
                }
            }
        }
        return this.EZpvd;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(@androidx.annotation.NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        pUU.KWHzl("OKexFirebaseService", "onMessageReceived");
        if (remoteMessage.getData().containsKey("af-uinstall-tracking")) {
            pUU.KWHzl("OKexFirebaseService", "af-uinstall-tracking message");
        } else {
            OLrzqt(remoteMessage);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(@androidx.annotation.NonNull java.lang.String str) {
        super.onNewToken(str);
        pUU.KWHzl("OKexFirebaseService", "onNewToken token: " + str);
        AppsFlyerLib.getInstance().updateServerUninstallToken(getApplicationContext(), str);
        KWHzl(str);
    }

    public final void OLrzqt(RemoteMessage remoteMessage) {
        try {
            C46993the.copydefault.copydefault();
            pUU.KWHzl("OKexFirebaseService", "onMessageReceivedForJPush, start");
            AEQbTJ().EZpvd(remoteMessage);
        } catch (java.lang.Throwable th) {
            pUU.copydefault("OKexFirebaseService", "onMessageReceivedForJPush,t:" + th);
        }
    }

    public final void KWHzl(java.lang.String str) {
        pUU.EZpvd("OKexFirebaseService", "onNewTokenForJPush token: " + str);
        try {
            AEQbTJ().KWHzl(str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OKexFirebaseService", e);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
