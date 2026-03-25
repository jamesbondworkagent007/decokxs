package o;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.okapm.Apm;
import com.okinc.okapm.common.AppStartMode;
import com.okinc.okapm.common.Lifecycle;
import com.okinc.okapm.internal.ApmImpl$appLifecycleCallback$2$1;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.rWK;
import o.rWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rVP implements com.okinc.okapm.Apm {
    public final InterfaceC56387yDm AEQbTJ;
    public final Apm.StateListAnimator AhwBna;
    public final android.app.Application EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public rWL copydefault;
    public rWK gEmmrt;
    public rWJ valueOf;

    public rVP(@NotNull android.app.Application application, @NotNull Apm.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = application;
        this.AhwBna = stateListAnimator;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVP.AYXKKw(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVP.AhwBna(this.copydefault);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rVP.valueOf(this.KWHzl);
            }
        });
    }

    public void AEQbTJ() {
        pUU.KWHzl("Monitor.APM", "Initialized -> " + this.AhwBna);
        ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(OLrzqt());
        this.EZpvd.registerActivityLifecycleCallbacks(copydefault());
        if (this.AhwBna.copydefault()) {
            rVZ rvz = new rVZ();
            this.valueOf = rvz;
            rvz.EZpvd(this);
        }
        if (this.AhwBna.EZpvd()) {
            rVW rvw = new rVW(null, null, 3, null);
            this.gEmmrt = rvw;
            rvw.EZpvd(this);
            rVV rvv = new rVV();
            this.copydefault = rvv;
            rvv.EZpvd(this);
        }
    }

    public final ApmImpl$appLifecycleCallback$2$1 OLrzqt() {
        return (ApmImpl$appLifecycleCallback$2$1) this.OLrzqt.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.okinc.okapm.internal.ApmImpl$appLifecycleCallback$2$1] */
    public static final ApmImpl$appLifecycleCallback$2$1 AYXKKw(final rVP rvp) {
        return new DefaultLifecycleObserver() { // from class: com.okinc.okapm.internal.ApmImpl$appLifecycleCallback$2$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                rWL rwl = this.copydefault.copydefault;
                if (rwl != null) {
                    rwl.KWHzl();
                }
                rWK rwk = this.copydefault.gEmmrt;
                if (rwk != null) {
                    rwk.copydefault(Lifecycle.Foreground);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                rWL rwl = this.copydefault.copydefault;
                if (rwl != null) {
                    rwl.AEQbTJ();
                }
                rWK rwk = this.copydefault.gEmmrt;
                if (rwk != null) {
                    rwk.copydefault(Lifecycle.Background);
                }
            }
        };
    }

    public static final class TaskDescription implements Application.ActivityLifecycleCallbacks {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bundle, "");
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

        public TaskDescription() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (activity instanceof FragmentActivity) {
                ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(rVP.this.KWHzl());
            }
            rWJ rwj = rVP.this.valueOf;
            if (rwj != null) {
                rwj.KWHzl(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (rVP.this.OLrzqt(activity)) {
                rWJ rwj = rVP.this.valueOf;
                if (rwj != null) {
                    rwj.AEQbTJ(activity);
                }
                rWK rwk = rVP.this.gEmmrt;
                if (rwk != null) {
                    java.lang.String strKWHzl = rVN.KWHzl(activity);
                    Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
                    rwk.AEQbTJ(strKWHzl);
                }
                if (activity instanceof FragmentActivity) {
                    ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(rVP.this.KWHzl(), true);
                }
            }
        }
    }

    public final TaskDescription copydefault() {
        return (TaskDescription) this.KWHzl.getValue();
    }

    public static final TaskDescription AhwBna(rVP rvp) {
        return rvp.new TaskDescription();
    }

    @Override // o.rWC
    public void copydefault(@NotNull rVR rvr) {
        Intrinsics.checkNotNullParameter(rvr, "");
        rvr.KWHzl().put("isE2E", java.lang.String.valueOf(this.AhwBna.AEQbTJ()));
        Function1<rVR, Unit> function1OLrzqt = this.AhwBna.OLrzqt();
        if (function1OLrzqt != null) {
            function1OLrzqt.invoke(rvr);
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapKWHzl = rvr.KWHzl();
        mapKWHzl.put("app_mode", "");
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = mapKWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(setEntrySet, ",", null, null, 0, null, new Function1() { // from class: o.rVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rVP.AEQbTJ((Map.Entry) obj);
            }
        }, 30, null);
        pUU.KWHzl("Monitor.APM", "{\"" + rvr.AEQbTJ() + "\":{\"attributes\":{" + strJoinToString$default + "},\"source\":\"" + rvr.EZpvd() + "\",\"timestamp\":" + java.lang.System.currentTimeMillis() + ",\"sid\":\"" + this.AhwBna.KWHzl() + "\"}}");
    }

    public static final java.lang.CharSequence AEQbTJ(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        java.lang.Object key = entry.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object value = entry.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + ((java.lang.String) key) + "\":\"" + ((java.lang.String) value) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }

    @Override // com.okinc.okapm.Apm
    public void AEQbTJ(@NotNull AppStartMode appStartMode) {
        Intrinsics.checkNotNullParameter(appStartMode, "");
        rWK rwk = this.gEmmrt;
        if (rwk != null) {
            rwk.OLrzqt(appStartMode);
        }
    }

    public final void KWHzl(int i, @NotNull java.lang.String str, boolean z) {
        rWJ rwj;
        Intrinsics.checkNotNullParameter(str, "");
        if (!z || (rwj = this.valueOf) == null) {
            return;
        }
        rwj.EZpvd(i, str);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        rWJ rwj = this.valueOf;
        if (rwj != null) {
            rwj.EZpvd(fragment);
        }
    }

    public static final class ActionBar extends FragmentManager.FragmentLifecycleCallbacks {
        public ActionBar() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
            rWJ rwj;
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(view, "");
            super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            if (rVP.this.OLrzqt(fragment) && (rwj = rVP.this.valueOf) != null) {
                rwj.OLrzqt(fragment, view);
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            rWJ rwj = rVP.this.valueOf;
            if (rwj != null) {
                rwj.KWHzl(fragment);
            }
        }
    }

    public final ActionBar KWHzl() {
        return (ActionBar) this.AEQbTJ.getValue();
    }

    public static final ActionBar valueOf(rVP rvp) {
        return rvp.new ActionBar();
    }

    public final boolean OLrzqt(java.lang.Object obj) {
        java.lang.String name = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        if (C59449zhJ.startsWith$default(name, "com.okinc.debugbox.", false, 2, null)) {
            return false;
        }
        java.lang.String name2 = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "");
        if (C59449zhJ.startsWith$default(name2, "com.okinc.okdebugger.", false, 2, null)) {
            return false;
        }
        java.lang.String name3 = obj.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name3, "");
        return !StringsKt__StringsKt.contains$default((java.lang.CharSequence) name3, (java.lang.CharSequence) "MLNDebugActivity", false, 2, (java.lang.Object) null);
    }
}
