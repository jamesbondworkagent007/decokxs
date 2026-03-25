package o;

import com.onesignal.JobIntentService;
import com.onesignal.OneSignal;
import o.C57692ynH;

/* JADX INFO: renamed from: o.ynq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ServiceC57727ynq extends JobIntentService {
    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ boolean EZpvd() {
        return super.EZpvd();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ android.os.IBinder onBind(@androidx.annotation.NonNull android.content.Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(@androidx.annotation.Nullable android.content.Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.onesignal.JobIntentService
    public void copydefault(@androidx.annotation.NonNull android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        OneSignal.fetchVPNInfo(this);
        C57692ynH.OLrzqt(this, extras, new C57692ynH.Application() { // from class: o.ynq.5
            @Override // o.C57692ynH.Application
            public void copydefault(@androidx.annotation.Nullable C57692ynH.ActionBar actionBar) {
            }
        });
    }

    public static void OLrzqt(android.content.Context context, android.content.Intent intent) {
        JobIntentService.EZpvd(context, ServiceC57727ynq.class, 123890, intent, false);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
