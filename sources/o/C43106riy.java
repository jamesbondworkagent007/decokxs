package o;

import android.app.Application;
import com.immomo.mls.fun.lt.SIApplication;

/* JADX INFO: renamed from: o.riy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43106riy implements Application.ActivityLifecycleCallbacks {
    public int EZpvd = 0;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        OLrzqt();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        int i = this.EZpvd + 1;
        this.EZpvd = i;
        if (i == 1) {
            SIApplication.copydefault(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        OLrzqt();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        OLrzqt();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        int i = this.EZpvd - 1;
        this.EZpvd = i;
        if (i == 0) {
            SIApplication.copydefault(false);
        }
    }

    public final void OLrzqt() {
        java.lang.System.out.print("aa");
    }
}
