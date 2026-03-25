package o;

import android.app.Application;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.components.report.EventAction;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okapm.common.AppStartMode;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rWF implements Application.ActivityLifecycleCallbacks {
    public static boolean EZpvd;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final java.lang.String OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public boolean djBIcL;
    public boolean valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static Function0<Unit> KWHzl = new Function0() { // from class: o.rWH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rWF.copydefault();
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    public rWF(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AhwBna = true;
        this.AYXKKw = true;
        this.copydefault = new java.util.ArrayList();
        this.AhwBna = z;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rWF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(boolean z) {
            rWF.EZpvd = z;
        }

        public final boolean OLrzqt() {
            return rWF.EZpvd;
        }

        public final void OLrzqt(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            rWF.KWHzl = function0;
        }
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPreCreated(activity, bundle);
        if (this.AhwBna && this.copydefault.isEmpty()) {
            if (!(activity instanceof InterfaceC32628mhF)) {
                this.valueOf = true;
            }
            C42548rWy c42548rWy = C42548rWy.AEQbTJ;
            c42548rWy.KWHzl("activity_start");
            if (c42548rWy.valueOf() > 1000) {
                this.valueOf = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull android.app.Activity activity, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name = activity.getClass().getName();
        if (this.copydefault.size() == 1 && this.AhwBna) {
            pUU.KWHzl("dexguard", "======> activityList" + this.copydefault + "  acName:" + name + " \nisForeground: " + this.AYXKKw + " hasRunIdle: " + EZpvd + " UnusualLaunch: " + this.valueOf);
            android.view.View decorView = activity.getWindow() == null ? null : activity.getWindow().getDecorView();
            if (!(decorView instanceof android.view.ViewGroup)) {
                pUU.KWHzl("dexguard", "DecorView is not ViewGroup");
                firstRenderFinished$default(this, null, 1, null);
            } else {
                android.view.View view = new android.view.View(activity);
                view.setBackgroundColor(Color.parseColor("#000000"));
                view.getViewTreeObserver().addOnPreDrawListener(new Activity(view, this, name));
                ((android.view.ViewGroup) decorView).addView(view, 1, 1);
                view.bringToFront();
                pUU.KWHzl("dexguard", "DecorView addOnPreDrawListener success " + name);
            }
            this.AhwBna = false;
        }
        if (this.copydefault.size() > 3 || this.copydefault.contains(name)) {
            return;
        }
        java.util.List<java.lang.String> list = this.copydefault;
        Intrinsics.copydefault((java.lang.Object) name);
        list.add(name);
    }

    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ rWF OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        public Activity(android.view.View view, rWF rwf, java.lang.String str) {
            this.EZpvd = view;
            this.OLrzqt = rwf;
            this.copydefault = str;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            rWF rwf;
            android.view.View view;
            this.EZpvd.getViewTreeObserver().removeOnPreDrawListener(this);
            try {
                if (!this.OLrzqt.AYXKKw() || rWF.Companion.OLrzqt() || !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AubY(this.OLrzqt.copydefault), (java.lang.Object) this.copydefault) || this.OLrzqt.valueOf) {
                    this.OLrzqt.AhwBna = false;
                    rwf = this.OLrzqt;
                    view = this.EZpvd;
                } else {
                    pUU.KWHzl("dexguard", "======> addOnPreDrawListener onPreDraw");
                    C42548rWy c42548rWy = C42548rWy.AEQbTJ;
                    c42548rWy.KWHzl("activity_end");
                    pUU.copydefault("dexguard", "\nisFirstLaunch:" + this.OLrzqt.gEmmrt() + " \nAppLaunchTime:" + c42548rWy.AkhnZx() + " \nAppAttachTime:" + c42548rWy.copydefault() + " \nAppInstallProviderTime:" + c42548rWy.djBIcL() + " \nAppCreateTime:" + c42548rWy.AhwBna() + " \nActivityRenderTime:" + c42548rWy.EZpvd() + " \nLastActivityRenderTime:" + c42548rWy.DbNXlk());
                    this.OLrzqt.AhwBna();
                    rwf = this.OLrzqt;
                    view = this.EZpvd;
                }
                rwf.KWHzl(view);
                return true;
            } catch (java.lang.Throwable th) {
                this.OLrzqt.KWHzl(this.EZpvd);
                throw th;
            }
        }
    }

    public static /* synthetic */ void firstRenderFinished$default(rWF rwf, android.view.View view, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            view = null;
        }
        rwf.KWHzl(view);
    }

    public final void KWHzl(android.view.View view) {
        ReportManager.AEQbTJ.EZpvd(this.OLrzqt);
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.rWE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    rWF.EZpvd();
                }
            });
        } else {
            KWHzl.invoke();
            C42548rWy.KWHzl();
        }
    }

    public static final void EZpvd() {
        KWHzl.invoke();
        C42548rWy.KWHzl();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        super.onActivityPostPaused(activity);
        if (this.AhwBna && this.copydefault.size() == 1) {
            C42548rWy.AEQbTJ.KWHzl("first_activity_start");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.OLrzqt("======> ActivityLifecycleCallbacks ==>" + activity.getClass().getName() + " onActivityStarted isPassInit:" + this.AhwBna);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.OLrzqt("======> ActivityLifecycleCallbacks ==>" + activity.getClass().getName() + " onActivityResumed isPassInit:" + this.AhwBna);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.OLrzqt("======> ActivityLifecycleCallbacks ==>" + activity.getClass().getName() + " onActivityStopped isPassInit:" + this.AhwBna);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.OLrzqt("======> ActivityLifecycleCallbacks ==>" + activity.getClass().getName() + " onActivityDestroyed isPassInit:" + this.AhwBna);
    }

    public final void AhwBna() {
        java.lang.String type = EventAction.APP_LAUNCH_TIME.getType();
        java.util.List<java.lang.String> list = this.copydefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) it.next());
            sb.append("-");
        }
        Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C42548rWy c42548rWy = C42548rWy.AEQbTJ;
        linkedHashMap.put("app_launch_time", java.lang.String.valueOf(c42548rWy.AkhnZx()));
        linkedHashMap.put("application_attach", java.lang.String.valueOf(c42548rWy.copydefault()));
        linkedHashMap.put("application_install_provider", java.lang.String.valueOf(c42548rWy.djBIcL()));
        linkedHashMap.put("application_create", java.lang.String.valueOf(c42548rWy.AhwBna()));
        linkedHashMap.put("activity_render", java.lang.String.valueOf(c42548rWy.EZpvd()));
        linkedHashMap.put("finish_render", java.lang.String.valueOf(c42548rWy.DbNXlk()));
        C42543rWt c42543rWt = C42543rWt.KWHzl;
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("launch_start")), "create_app", "launch_start");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("launch_start")), "app_launch_measure", "launch_start");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("application_attach_base_context_start")), "app_launch_measure", "application_attach_base_context_start");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("application_attach_base_context_end")), "app_launch_measure", "application_attach_base_context_end");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("application_create_start")), "app_launch_measure", "application_create_start");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("application_create_end")), "app_launch_measure", "application_create_end");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("activity_start")), "app_launch_measure", "activity_start");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("activity_end")), "app_launch_measure", "activity_end");
        c42543rWt.valueOf().invoke(java.lang.String.valueOf(c42548rWy.copydefault("activity_end")), "end_app", "activity_end");
        if (this.djBIcL) {
            linkedHashMap.put("start_mode", AppStartMode.OnFirst.getValue());
        } else {
            linkedHashMap.put("start_mode", AppStartMode.OnCold.getValue());
        }
        java.lang.String str = (java.lang.String) C32935mmv.KWHzl.get("app_mode_realtime_okx");
        if (str == null) {
            str = "unknown";
        }
        linkedHashMap.put("app_mode", str);
        linkedHashMap.put(MetricsSQLiteCacheKt.METRICS_PARAMS, c42548rWy.AYXKKw() ? "async" : "sync");
        EventData eventData = new EventData();
        eventData.setAct(type);
        eventData.setPath(string);
        eventData.setAttribute(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
