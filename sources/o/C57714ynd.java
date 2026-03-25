package o;

import android.app.Application;
import com.onesignal.OSFocusHandler;

/* JADX INFO: renamed from: o.ynd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57714ynd implements Application.ActivityLifecycleCallbacks {
    public static C57712ynb EZpvd;
    public static android.content.ComponentCallbacks KWHzl;
    public static C57714ynd OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C57712ynb copydefault() {
        return EZpvd;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    public static void AEQbTJ(@androidx.annotation.NonNull android.app.Application application) {
        if (OLrzqt == null) {
            C57714ynd c57714ynd = new C57714ynd();
            OLrzqt = c57714ynd;
            application.registerActivityLifecycleCallbacks(c57714ynd);
        }
        if (EZpvd == null) {
            EZpvd = new C57712ynb(new OSFocusHandler());
        }
        if (KWHzl == null) {
            android.content.ComponentCallbacks componentCallbacks = new android.content.ComponentCallbacks() { // from class: o.ynd.5
                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(android.content.res.Configuration configuration) {
                    C57714ynd.EZpvd.copydefault(configuration, C57714ynd.EZpvd.copydefault());
                }
            };
            KWHzl = componentCallbacks;
            application.registerComponentCallbacks(componentCallbacks);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.OLrzqt(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.copydefault(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.KWHzl(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.AEQbTJ(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.djBIcL(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        C57712ynb c57712ynb = EZpvd;
        if (c57712ynb != null) {
            c57712ynb.EZpvd(activity);
        }
    }
}
