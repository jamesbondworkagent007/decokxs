package o;

import android.app.Application;
import android.view.ViewTreeObserver;
import com.okinc.base.thread.TPM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38002pIp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38005pIs implements Application.ActivityLifecycleCallbacks {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public volatile boolean AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd = new java.util.ArrayList();
    public volatile boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public C38005pIs(boolean z) {
        this.KWHzl = z;
    }

    /* JADX INFO: renamed from: o.pIs$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pIs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name = activity.getClass().getName();
        pIF.log$default("onActivityCreated:" + this.EZpvd.size() + " isColdInit:" + this.KWHzl + " isRun:" + this.AEQbTJ + "->" + name + " ", false, "Lifecycle:", null, 5, null);
        if (this.EZpvd.size() == 1 && this.KWHzl) {
            this.KWHzl = false;
            android.view.View decorView = activity.getWindow() == null ? null : activity.getWindow().getDecorView();
            if (decorView instanceof android.view.ViewGroup) {
                android.view.ViewTreeObserver viewTreeObserver = ((android.view.ViewGroup) decorView).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: o.pIy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                        public final void onWindowFocusChanged(boolean z) {
                            C38005pIs.EZpvd(this.EZpvd, z);
                        }
                    });
                }
                pIF.log$default("DecorView addOnWindowFocusChangeListener success " + name, false, "Lifecycle:", null, 5, null);
            } else {
                pIF.log$default("DecorView is not ViewGroup", false, "Lifecycle:", null, 5, null);
            }
            AEQbTJ();
        }
        if (this.EZpvd.size() > 3 || this.EZpvd.contains(name)) {
            return;
        }
        java.util.List<java.lang.String> list = this.EZpvd;
        Intrinsics.copydefault((java.lang.Object) name);
        list.add(name);
    }

    public static final void EZpvd(C38005pIs c38005pIs, boolean z) {
        pIF.log$default("finishStartUp onWindowFocusChanged hasFocus:" + z, true, "Lifecycle:", null, 4, null);
        if (z) {
            c38005pIs.AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        synchronized (this) {
            long jEZpvd = ((long) 10000) - EZpvd();
            if (jEZpvd < 0) {
                pIF.log$default("checkStartUpTask execute immediate " + jEZpvd + " ", true, "Lifecycle:", null, 4, null);
                KWHzl();
            } else {
                pIF.log$default("checkStartUpTask runOnUiThreadDelayed DelayedTime:" + jEZpvd + " ", true, "Lifecycle:", null, 4, null);
                TPM.AEQbTJ.copydefault(new java.lang.Runnable() { // from class: o.pIt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C38005pIs.OLrzqt(this.copydefault);
                    }
                }, jEZpvd);
            }
        }
    }

    public static final void OLrzqt(C38005pIs c38005pIs) {
        c38005pIs.KWHzl();
    }

    public final long EZpvd() {
        return android.os.SystemClock.elapsedRealtime() - C38002pIp.Companion.copydefault();
    }

    public final void KWHzl() {
        synchronized (this) {
            if (this.AEQbTJ) {
                pIF.log$default("finishStartUp isRun:" + this.AEQbTJ + " execute time:" + EZpvd(), true, "Lifecycle:", null, 4, null);
                return;
            }
            pIF.log$default("finishStartUp success execute time:" + EZpvd(), false, "Lifecycle:", null, 4, null);
            this.AEQbTJ = true;
            TPM.AEQbTJ.AhwBna().execute(new java.lang.Runnable() { // from class: o.pIw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C38005pIs.OLrzqt();
                }
            });
            C38002pIp.Application application = C38002pIp.Companion;
            application.getFieldNames();
            application.EZpvd();
            application.iwGUEr().OLrzqt(false);
        }
    }

    public static final void OLrzqt() {
        pIF.log$default("uploadCrash -> " + java.lang.Thread.currentThread(), false, "Lifecycle:", null, 4, null);
        C38002pIp.Companion.copydefault(false);
    }
}
