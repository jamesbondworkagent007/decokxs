package o;

import android.view.ViewTreeObserver;
import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.rVZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rVZ implements rWJ {
    public rWC AEQbTJ;
    public volatile boolean copydefault;
    public final java.lang.String EZpvd = "Monitor.APM";
    public final java.util.HashMap<java.lang.Integer, kotlin.Pair<java.lang.Long, java.lang.Long>> AYXKKw = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.Integer, java.lang.String> djBIcL = new java.util.HashMap<>();
    public final java.util.HashMap<java.lang.Integer, java.lang.String> OLrzqt = new java.util.HashMap<>();
    public volatile long KWHzl = android.os.SystemClock.uptimeMillis();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    @Override // o.rWM
    public void EZpvd(@NotNull rWC rwc) {
        Intrinsics.checkNotNullParameter(rwc, "");
        this.KWHzl = android.os.SystemClock.uptimeMillis();
        this.AEQbTJ = rwc;
    }

    @Override // o.rWJ
    public void AEQbTJ(@NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C6795aWC.AEQbTJ(EZpvd(), (Function0<Unit>) new Function0() { // from class: o.rWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVZ.KWHzl(activity, this);
            }
        });
    }

    public static final Unit KWHzl(android.app.Activity activity, rVZ rvz) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        int iIdentityHashCode = java.lang.System.identityHashCode(activity);
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        if (viewFindViewById == null) {
            return Unit.INSTANCE;
        }
        java.lang.String strKWHzl = rVN.KWHzl(activity);
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        if (strKWHzl.length() == 0) {
            return Unit.INSTANCE;
        }
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(rvz.new Activity(viewFindViewById, jUptimeMillis, iIdentityHashCode, strKWHzl));
        return Unit.INSTANCE;
    }

    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        public Activity(android.view.View view, long j, int i, java.lang.String str) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = i;
            this.OLrzqt = str;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            java.lang.String strEZpvd = rVZ.this.EZpvd();
            final android.view.View view = this.copydefault;
            final rVZ rvz = rVZ.this;
            final long j = this.KWHzl;
            final int i = this.AEQbTJ;
            final java.lang.String str = this.OLrzqt;
            C6795aWC.AEQbTJ(strEZpvd, (Function0<Unit>) new Function0() { // from class: o.rWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rVZ.Activity.AEQbTJ(view, this, rvz, j, i, str);
                }
            });
            return true;
        }

        public static final Unit AEQbTJ(android.view.View view, Activity activity, rVZ rvz, long j, int i, java.lang.String str) {
            view.getViewTreeObserver().removeOnPreDrawListener(activity);
            if (!rvz.copydefault) {
                rvz.copydefault = true;
                rvz.copydefault();
            }
            long jUptimeMillis = android.os.SystemClock.uptimeMillis() - j;
            rvz.AYXKKw.put(java.lang.Integer.valueOf(i), new kotlin.Pair(java.lang.Long.valueOf(j), java.lang.Long.valueOf(jUptimeMillis)));
            Intrinsics.copydefault((java.lang.Object) str);
            rvz.copydefault(str, jUptimeMillis);
            rvz.EZpvd(i);
            return Unit.INSTANCE;
        }
    }

    @Override // o.rWJ
    public void OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final android.view.View view) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(view, "");
        C6795aWC.AEQbTJ(EZpvd(), (Function0<Unit>) new Function0() { // from class: o.rWd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVZ.EZpvd(fragment, view, this);
            }
        });
    }

    public static final Unit EZpvd(androidx.fragment.app.Fragment fragment, android.view.View view, rVZ rvz) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        int iIdentityHashCode = java.lang.System.identityHashCode(fragment);
        java.lang.String strKWHzl = rVN.KWHzl(fragment);
        Intrinsics.copydefault((java.lang.Object) strKWHzl);
        if (strKWHzl.length() == 0) {
            return Unit.INSTANCE;
        }
        view.getViewTreeObserver().addOnPreDrawListener(rvz.new ActionBar(view, jUptimeMillis, fragment, strKWHzl, iIdentityHashCode));
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ int copydefault;

        public ActionBar(android.view.View view, long j, androidx.fragment.app.Fragment fragment, java.lang.String str, int i) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = fragment;
            this.EZpvd = str;
            this.copydefault = i;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            java.lang.String strEZpvd = rVZ.this.EZpvd();
            final android.view.View view = this.AEQbTJ;
            final long j = this.OLrzqt;
            final androidx.fragment.app.Fragment fragment = this.KWHzl;
            final rVZ rvz = rVZ.this;
            final java.lang.String str = this.EZpvd;
            final int i = this.copydefault;
            C6795aWC.AEQbTJ(strEZpvd, (Function0<Unit>) new Function0() { // from class: o.rWi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return rVZ.ActionBar.KWHzl(view, this, j, fragment, rvz, str, i);
                }
            });
            return true;
        }

        public static final Unit KWHzl(android.view.View view, ActionBar actionBar, long j, androidx.fragment.app.Fragment fragment, rVZ rvz, java.lang.String str, int i) {
            view.getViewTreeObserver().removeOnPreDrawListener(actionBar);
            long jUptimeMillis = android.os.SystemClock.uptimeMillis() - j;
            if (fragment.isVisible() && C42528rWe.KWHzl(fragment)) {
                Intrinsics.copydefault((java.lang.Object) str);
                rvz.copydefault(str, jUptimeMillis);
                rvz.AYXKKw.put(java.lang.Integer.valueOf(i), new kotlin.Pair(java.lang.Long.valueOf(j), java.lang.Long.valueOf(jUptimeMillis)));
                rvz.EZpvd(i);
            }
            return Unit.INSTANCE;
        }
    }

    public final void copydefault() {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = this.KWHzl;
        Apm.TaskDescription.Activity activity = Apm.TaskDescription.Companion;
        AppStartMode appStartMode = AppStartMode.OnLaunch;
        java.lang.String value = appStartMode.getValue();
        Apm.TaskDescription taskDescriptionOLrzqt = activity.OLrzqt(Apm.EventGroupType.APP_LIFECYCLE.getValue(), Apm.EventType.APP_TTID.getValue(), value, C56424yEw.gEmmrt(C56390yDp.OLrzqt("source", appStartMode.getValue()), C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(jUptimeMillis - j))));
        rWC rwc = this.AEQbTJ;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
    }

    public final void copydefault(java.lang.String str, long j) {
        Apm.TaskDescription taskDescriptionOLrzqt = Apm.TaskDescription.Companion.OLrzqt(Apm.EventGroupType.PAGE_LIFECYCLE.getValue(), Apm.EventType.VIEW_TTID.getValue(), str, C56424yEw.AYXKKw(C56390yDp.OLrzqt("path", str), C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(j))));
        rWC rwc = this.AEQbTJ;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
    }

    public final void KWHzl(java.lang.String str, long j, long j2) {
        long jMax = java.lang.Math.max(android.os.SystemClock.uptimeMillis() - j, j2);
        Apm.TaskDescription taskDescriptionOLrzqt = Apm.TaskDescription.Companion.OLrzqt(Apm.EventGroupType.PAGE_LIFECYCLE.getValue(), Apm.EventType.VIEW_TTFD.getValue(), str, C56424yEw.AYXKKw(C56390yDp.OLrzqt("path", str), C56390yDp.OLrzqt("totalTime", java.lang.String.valueOf(jMax))));
        rWC rwc = this.AEQbTJ;
        if (rwc != null) {
            rwc.copydefault(taskDescriptionOLrzqt);
        }
    }

    @Override // o.rWJ
    public void EZpvd(final int i, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C6795aWC.AEQbTJ(EZpvd(), (Function0<Unit>) new Function0() { // from class: o.rWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVZ.KWHzl(str, this, i);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, rVZ rvz, int i) {
        if (str.length() > 0 && Intrinsics.EZpvd((java.lang.Object) rvz.djBIcL.get(java.lang.Integer.valueOf(i)), (java.lang.Object) str)) {
            pUU.KWHzl(rvz.EZpvd(), "TTFD={path=" + rVN.AEQbTJ(str) + "[" + i + "]} already reported");
            rvz.OLrzqt.remove(java.lang.Integer.valueOf(i));
            return Unit.INSTANCE;
        }
        kotlin.Pair<java.lang.Long, java.lang.Long> pairRemove = rvz.AYXKKw.remove(java.lang.Integer.valueOf(i));
        if (pairRemove != null) {
            rvz.KWHzl(str, pairRemove.component1().longValue(), pairRemove.component2().longValue());
            rvz.djBIcL.put(java.lang.Integer.valueOf(i), str);
        } else {
            rvz.OLrzqt.put(java.lang.Integer.valueOf(i), str);
            pUU.KWHzl(rvz.EZpvd(), "reportFullyDrawn pending: " + rVN.AEQbTJ(str) + "[" + i + "] (TTID not ready)");
        }
        return Unit.INSTANCE;
    }

    @Override // o.rWJ
    public void KWHzl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        copydefault(java.lang.System.identityHashCode(activity));
    }

    @Override // o.rWJ
    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        copydefault(java.lang.System.identityHashCode(fragment));
    }

    public final void copydefault(int i) {
        this.AYXKKw.remove(java.lang.Integer.valueOf(i));
        this.djBIcL.remove(java.lang.Integer.valueOf(i));
        this.OLrzqt.remove(java.lang.Integer.valueOf(i));
    }

    public final void EZpvd(int i) {
        java.lang.String strRemove = this.OLrzqt.remove(java.lang.Integer.valueOf(i));
        if (strRemove == null) {
            return;
        }
        pUU.KWHzl(EZpvd(), "resolvePendingTTFD: " + rVN.AEQbTJ(strRemove) + "[" + i + "]");
        EZpvd(i, strRemove);
    }

    @Override // o.rWJ
    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        try {
            java.lang.String strKWHzl = rVN.KWHzl(fragment);
            Intrinsics.copydefault((java.lang.Object) strKWHzl);
            if (strKWHzl.length() == 0) {
                return;
            }
            int iIdentityHashCode = java.lang.System.identityHashCode(fragment);
            if (fragment.isVisible() && C42528rWe.KWHzl(fragment)) {
                this.AYXKKw.put(java.lang.Integer.valueOf(iIdentityHashCode), new kotlin.Pair<>(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()), 0L));
                pUU.KWHzl(EZpvd(), "resetTrackPageLoading: " + rVN.AEQbTJ(strKWHzl) + "[" + iIdentityHashCode + "]");
            } else {
                pUU.KWHzl(EZpvd(), "resetTrackPageLoading: " + rVN.AEQbTJ(strKWHzl) + "[" + iIdentityHashCode + "] not visible");
            }
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ(EZpvd(), "resetTrackPageLoading error", th);
        }
    }
}
