package o;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.okinc.lib.monitor.MonitorManager$logApm$1;
import com.okinc.lib.monitor.bean.FragmentInfo;
import com.okinc.lib.monitor.window.WindowObserver;
import com.okinc.lib.utils.OkUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C38053pKm;
import o.C6833aWo;
import o.pJI;
import o.pJQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pJI implements pJH {
    public static volatile pJI OLrzqt;
    public final java.util.List<com.okinc.lib.monitor.bean.ActivityInfo> AEQbTJ;
    public final pJE AYXKKw;
    public final java.util.List<WeakReference<FragmentInfo>> AhwBna;
    public final CoroutineScope DbNXlk;
    public final java.util.HashMap<java.lang.String, pJG> copydefault;
    public volatile boolean djBIcL;
    public pJR gEmmrt;
    public WindowObserver.Application valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public static int EZpvd = -1;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlinx.coroutines.CoroutineDispatcher) A[MD:(kotlinx.coroutines.CoroutineDispatcher):void (m)] call: o.pJI.<init>(kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ pJI(CoroutineDispatcher coroutineDispatcher, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final pJI KWHzl() {
        return Companion.copydefault();
    }

    @Override // o.pJH
    public void copydefault() {
    }

    public pJI(CoroutineDispatcher coroutineDispatcher) {
        this.AYXKKw = new pJE();
        this.copydefault = new java.util.HashMap<>();
        this.AhwBna = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.DbNXlk = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    public final void AhwBna() {
        if (this.djBIcL) {
            this.AYXKKw.copydefault();
        }
    }

    public final void gEmmrt() {
        if (this.djBIcL) {
            this.AYXKKw.AEQbTJ();
        }
    }

    public final void djBIcL() {
        if (this.djBIcL) {
            this.AYXKKw.KWHzl();
        }
    }

    public final void AYXKKw() {
        if (this.djBIcL) {
            this.AYXKKw.OLrzqt(new pJT() { // from class: o.pJF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.pJT
                public final void OLrzqt(com.okinc.lib.monitor.bean.ActivityInfo activityInfo) {
                    pJI.copydefault(this.OLrzqt, activityInfo);
                }
            });
        }
    }

    public static final void copydefault(pJI pji, com.okinc.lib.monitor.bean.ActivityInfo activityInfo) {
        pji.AEQbTJ.add(activityInfo);
        pJR pjr = pji.gEmmrt;
        if (pjr != null) {
            pjr.EZpvd(activityInfo);
        }
    }

    public final void KWHzl(java.lang.String str) {
        if (this.copydefault.containsKey(str)) {
            this.copydefault.get(str);
        } else {
            this.copydefault.put(str, new pJG());
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault.remove(fragment.getClass().getName());
    }

    public final void EZpvd(WeakReference<androidx.fragment.app.Fragment> weakReference, java.lang.String str, final java.lang.String str2) {
        pJG pjg = this.copydefault.get(str2);
        if (pjg != null) {
            pjg.EZpvd(weakReference, str, str2, new pJS() { // from class: o.pJL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.pJS
                public final void EZpvd(FragmentInfo fragmentInfo) {
                    pJI.KWHzl(this.OLrzqt, str2, fragmentInfo);
                }
            });
        }
    }

    public static final void KWHzl(pJI pji, java.lang.String str, FragmentInfo fragmentInfo) {
        pji.AhwBna.add(new WeakReference<>(fragmentInfo));
        pji.copydefault.remove(str);
        pJR pjr = pji.gEmmrt;
        if (pjr != null) {
            pjr.KWHzl(fragmentInfo);
        }
    }

    public final void values() {
        if (this.djBIcL) {
            this.AYXKKw.EZpvd();
        }
    }

    public final void OLrzqt(int i, pJR pjr) {
        this.gEmmrt = pjr;
        boolean zEZpvd = C38055pKo.EZpvd(i, 0);
        boolean zEZpvd2 = C38055pKo.EZpvd(i, 1);
        if (zEZpvd) {
            AEQbTJ();
        }
        if (zEZpvd2) {
            valueOf();
        }
    }

    public final void valueOf() {
        pUU.KWHzl("Monitor.Lifecycle", "initWindowManager start ");
        EZpvd = android.view.ViewConfiguration.get(OkUtils.copydefault()).getScaledTouchSlop();
        C38043pKc.AEQbTJ().EZpvd(OkUtils.copydefault());
        this.valueOf = new Application();
        WindowObserver windowObserverCopydefault = C38043pKc.AEQbTJ().copydefault();
        windowObserverCopydefault.addWindowObserverListener(this.valueOf);
        int size = windowObserverCopydefault.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = windowObserverCopydefault.get(i);
            android.view.Window window = (android.view.Window) view.getTag(pJQ.ActionBar.KWHzl);
            if (window == null) {
                windowObserverCopydefault.bindWindow(view);
                window = (android.view.Window) view.getTag(pJQ.ActionBar.KWHzl);
            }
            if (window != null && !(window.getCallback() instanceof WindowCallbackC38041pKa)) {
                AEQbTJ(window);
            }
        }
    }

    public static final class Application implements WindowObserver.Application {
        @Override // com.okinc.lib.monitor.window.WindowObserver.Application
        public void copydefault(android.view.Window window) {
        }

        public Application() {
        }

        @Override // com.okinc.lib.monitor.window.WindowObserver.Application
        public void KWHzl(android.view.Window window) {
            pJI.this.AEQbTJ(window);
        }
    }

    public final void AEQbTJ(android.view.Window window) {
        if (window == null || (window.getCallback() instanceof WindowCallbackC38041pKa)) {
            return;
        }
        window.setCallback(new C38047pKg(window));
    }

    public final void AEQbTJ() {
        synchronized (this) {
            pUU.KWHzl("Monitor.Lifecycle", "initMonitorRenderTime start");
            if (this.djBIcL) {
                return;
            }
            pJW.KWHzl(OkUtils.copydefault());
            C38053pKm.copydefault().KWHzl(OkUtils.copydefault());
            C38053pKm.copydefault().copydefault(new TaskDescription());
            this.djBIcL = true;
            OkUtils.copydefault().registerActivityLifecycleCallbacks(new Activity());
        }
    }

    public static final class TaskDescription implements C38053pKm.ActionBar {
        public TaskDescription() {
        }

        @Override // o.C38053pKm.ActionBar
        public void OLrzqt(android.app.Activity activity) {
            if (activity != null) {
                pUU.KWHzl("Monitor.Lifecycle", "onForeground " + activity.getClass().getName());
            }
        }

        @Override // o.C38053pKm.ActionBar
        public void AEQbTJ(android.app.Activity activity) {
            pJI.this.values();
        }
    }

    public static final class Activity implements Application.ActivityLifecycleCallbacks {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        public Activity() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            pJI.this.AYXKKw.copydefault(true);
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(new C38026pJm(), true);
            }
        }

        public static final Unit copydefault(android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("Monitor.Lifecycle", "onActivityResumed " + activity.getClass().getName() + ", " + str);
            return Unit.INSTANCE;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(final android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            pJI.this.OLrzqt(new Function1() { // from class: o.pJN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pJI.Activity.copydefault(activity, (java.lang.String) obj);
                }
            });
        }

        public static final Unit valueOf(android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.valueOf("Monitor.Lifecycle", "onActivitySaveInstanceState " + activity.getClass().getName() + ", " + str);
            return Unit.INSTANCE;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(final android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
            pJI.this.OLrzqt(new Function1() { // from class: o.pJK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pJI.Activity.valueOf(activity, (java.lang.String) obj);
                }
            });
        }

        public static final Unit OLrzqt(android.app.Activity activity, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("Monitor.Lifecycle", "onActivityDestroyed " + activity.getClass().getName() + ", " + str);
            return Unit.INSTANCE;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(final android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            pJI.this.OLrzqt(new Function1() { // from class: o.pJO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pJI.Activity.OLrzqt(activity, (java.lang.String) obj);
                }
            });
        }
    }

    @Override // o.pJH
    public void OLrzqt() {
        synchronized (this) {
            if (this.djBIcL) {
                C38053pKm.copydefault().OLrzqt(OkUtils.copydefault());
                this.djBIcL = false;
            }
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pJI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final pJI AEQbTJ(@NotNull CoroutineDispatcher coroutineDispatcher) {
            Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
            if (pJI.OLrzqt == null) {
                synchronized (pJI.class) {
                    if (pJI.OLrzqt == null) {
                        StateListAnimator stateListAnimator = pJI.Companion;
                        pJI.OLrzqt = new pJI(coroutineDispatcher, null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            pJI pji = pJI.OLrzqt;
            Intrinsics.copydefault(pji);
            return pji;
        }

        public final pJI copydefault() {
            if (pJI.OLrzqt == null) {
                synchronized (pJI.class) {
                    if (pJI.OLrzqt == null) {
                        StateListAnimator stateListAnimator = pJI.Companion;
                        pJI.OLrzqt = new pJI(pJM.copydefault(), null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            pJI pji = pJI.OLrzqt;
            Intrinsics.copydefault(pji);
            return pji;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.pJM.OLrzqt(long):java.lang.String */
        public final java.lang.String EZpvd() {
            try {
                C6833aWo.ActionBar actionBarIwGUEr = C6833aWo.AEQbTJ.iwGUEr();
                return ("threads=" + InterfaceC38042pKb.Companion.EZpvd()) + ", used=" + pJM.AEQbTJ(actionBarIwGUEr.valueOf()) + ", avail=" + pJM.AEQbTJ(actionBarIwGUEr.copydefault()) + ", headRoom=" + pJM.AEQbTJ(actionBarIwGUEr.EZpvd());
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
    }

    public final void OLrzqt(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(this.DbNXlk, null, null, new MonitorManager$logApm$1(function1, null), 3, null);
    }
}
