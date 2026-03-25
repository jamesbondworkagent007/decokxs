package o;

import o.C57762yoY;

/* JADX INFO: renamed from: o.ypK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ServiceC57801ypK extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        C57762yoY.valueOf().OLrzqt(this, new C57762yoY.Activity(this));
        return 1;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
