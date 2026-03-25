package o;

import androidx.lifecycle.LifecycleService;
import com.okinc.oklive.app.ui.service.LiveFloatingWindowService;

/* JADX INFO: loaded from: classes24.dex */
public abstract class sVd extends LifecycleService implements InterfaceC58208ywu {
    public volatile C58198ywk EZpvd;
    public final java.lang.Object AEQbTJ = new java.lang.Object();
    public boolean OLrzqt = false;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        AEQbTJ();
        super.onCreate();
    }

    public C58198ywk KWHzl() {
        return new C58198ywk(this);
    }

    public final C58198ywk EZpvd() {
        if (this.EZpvd == null) {
            synchronized (this.AEQbTJ) {
                if (this.EZpvd == null) {
                    this.EZpvd = KWHzl();
                }
            }
        }
        return this.EZpvd;
    }

    public void AEQbTJ() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        ((InterfaceC44579sVg) aA_()).EZpvd((LiveFloatingWindowService) C58163ywB.EZpvd(this));
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return EZpvd().aA_();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
