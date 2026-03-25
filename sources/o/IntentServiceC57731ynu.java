package o;

import androidx.legacy.content.WakefulBroadcastReceiver;
import com.onesignal.OneSignal;
import o.C57692ynH;

/* JADX INFO: renamed from: o.ynu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class IntentServiceC57731ynu extends android.app.IntentService {
    public IntentServiceC57731ynu() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(final android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        OneSignal.fetchVPNInfo(this);
        C57692ynH.OLrzqt(this, extras, new C57692ynH.Application() { // from class: o.ynu.5
            @Override // o.C57692ynH.Application
            public void copydefault(@androidx.annotation.Nullable C57692ynH.ActionBar actionBar) {
                WakefulBroadcastReceiver.completeWakefulIntent(intent);
            }
        });
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
