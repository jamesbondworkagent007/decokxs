package o;

import android.app.Application;
import android.os.Build;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48846udQ {
    public static boolean EZpvd;
    public static android.app.Application KWHzl;
    public static final C48846udQ OLrzqt = new C48846udQ();
    public static final java.util.HashSet<android.util.Pair<android.net.Uri, java.lang.String>> AhwBna = new java.util.HashSet<>(10);
    public static final androidx.collection.ArraySet<Activity> gEmmrt = new androidx.collection.ArraySet<>(0, 1, null);
    public static final ActionBar AEQbTJ = new ActionBar();
    public static final int copydefault = 8;

    /* JADX INFO: renamed from: o.udQ$Activity */
    public interface Activity {
        void AEQbTJ(@NotNull java.lang.String str, @NotNull android.net.Uri uri);
    }

    private C48846udQ() {
    }

    /* JADX INFO: renamed from: o.udQ$ActionBar */
    public static final class ActionBar implements Application.ActivityLifecycleCallbacks {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

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
        public void onActivityStopped(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            if (C48846udQ.EZpvd) {
                return;
            }
            if ((!(activity instanceof InterfaceC48850udU) || ((InterfaceC48850udU) activity).canScreenshot()) && (activity instanceof ComponentActivity) && EZpvd(activity)) {
                C48846udQ.OLrzqt.AEQbTJ((ComponentActivity) activity);
            }
        }

        public final boolean EZpvd(android.app.Activity activity) {
            return Build.VERSION.SDK_INT < 33 && ContextCompat.checkSelfPermission(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        }
    }

    public final boolean EZpvd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return gEmmrt.add(activity);
    }

    public final InterfaceC58217yxC AEQbTJ(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        AbstractC58247yxg<android.util.Pair<android.net.Uri, java.lang.String>> abstractC58247yxgObserveOn = C48848udS.EZpvd(componentActivity).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
        AbstractC58247yxg abstractC58247yxgOLrzqt = C58156yvv.OLrzqt(abstractC58247yxgObserveOn, componentActivity, Lifecycle.Event.ON_STOP);
        final Function1 function1 = new Function1() { // from class: o.udW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48846udQ.KWHzl((android.util.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.udZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48846udQ.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.udX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48846udQ.KWHzl((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCSubscribe = abstractC58247yxgOLrzqt.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.udV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C48846udQ.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCSubscribe, "");
        return interfaceC58217yxCSubscribe;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.util.Pair pair) {
        C48846udQ c48846udQ = OLrzqt;
        Intrinsics.copydefault(pair);
        c48846udQ.KWHzl((android.util.Pair<android.net.Uri, java.lang.String>) pair, new Function1() { // from class: o.udY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48846udQ.AEQbTJ((android.util.Pair) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.util.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        OLrzqt.OLrzqt(pair);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        EZpvd = true;
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt(android.util.Pair<android.net.Uri, java.lang.String> pair) {
        java.lang.Object obj = pair.first;
        java.lang.Object obj2 = pair.second;
        Objects.toString(obj);
        Objects.toString(obj2);
        for (Activity activity : gEmmrt) {
            java.lang.Object obj3 = pair.second;
            Intrinsics.checkNotNullExpressionValue(obj3, "");
            java.lang.Object obj4 = pair.first;
            Intrinsics.checkNotNullExpressionValue(obj4, "");
            activity.AEQbTJ((java.lang.String) obj3, (android.net.Uri) obj4);
        }
    }

    public final void EZpvd(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        KWHzl = application;
        application.registerActivityLifecycleCallbacks(AEQbTJ);
    }

    public final void KWHzl(android.util.Pair<android.net.Uri, java.lang.String> pair, Function1<? super android.util.Pair<android.net.Uri, java.lang.String>, Unit> function1) {
        java.util.HashSet<android.util.Pair<android.net.Uri, java.lang.String>> hashSet = AhwBna;
        if (hashSet.contains(pair)) {
            return;
        }
        if (hashSet.size() > 10) {
            hashSet.clear();
        }
        hashSet.add(pair);
        function1.invoke(pair);
    }
}
