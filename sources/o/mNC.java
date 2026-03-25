package o;

import android.app.Application;
import androidx.core.content.ContextCompat;
import com.okinc.p2p.api.OtcExtraKeys;

/* JADX INFO: loaded from: classes8.dex */
public class mNC extends android.content.BroadcastReceiver implements Application.ActivityLifecycleCallbacks {
    public static int AEQbTJ;
    public static mNJ EZpvd;
    public int AYXKKw;
    public android.os.Handler KWHzl;
    public boolean OLrzqt;
    public java.lang.Class[] copydefault;
    public int djBIcL;
    public boolean gEmmrt;
    public mNL valueOf;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        this.AYXKKw++;
    }

    public mNC(android.content.Context context, boolean z, java.lang.Class[] clsArr, mNL mnl) {
        this.gEmmrt = z;
        this.copydefault = clsArr;
        AEQbTJ++;
        this.valueOf = mnl;
        this.KWHzl = new android.os.Handler();
        ((android.app.Application) context).registerActivityLifecycleCallbacks(this);
        ContextCompat.registerReceiver(context, this, new android.content.IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), 2);
    }

    public final boolean KWHzl(android.app.Activity activity) {
        java.lang.Class[] clsArr = this.copydefault;
        if (clsArr == null) {
            return true;
        }
        for (java.lang.Class cls : clsArr) {
            if (cls.isInstance(activity)) {
                return this.gEmmrt;
            }
        }
        return !this.gEmmrt;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        mNJ mnj = EZpvd;
        if (mnj != null) {
            int i = AEQbTJ - 1;
            AEQbTJ = i;
            if (i == 0) {
                mnj.KWHzl();
                EZpvd = null;
            }
        }
        this.djBIcL++;
        if (KWHzl(activity)) {
            this.valueOf.AEQbTJ();
        } else {
            this.valueOf.EZpvd();
        }
        if (this.OLrzqt) {
            this.OLrzqt = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        this.djBIcL--;
        this.KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.mNC.3
            @Override // java.lang.Runnable
            public void run() {
                if (mNC.this.djBIcL == 0) {
                    mNC.this.OLrzqt = true;
                    mNC.this.valueOf.KWHzl();
                }
            }
        }, 300L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        int i = this.AYXKKw - 1;
        this.AYXKKw = i;
        if (i == 0) {
            this.valueOf.KWHzl();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(intent.getStringExtra(OtcExtraKeys.REASON))) {
            this.valueOf.KWHzl();
        }
    }
}
