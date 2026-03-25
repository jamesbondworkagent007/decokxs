package o;

import com.appsflyer.deeplink.DeepLinkResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32853mlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32853mlS {
    public static java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public static java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public static java.util.Map<java.lang.String, java.lang.String> gEmmrt;
    public static final C32853mlS EZpvd = new C32853mlS();
    public static final java.util.ArrayList<Activity> copydefault = new java.util.ArrayList<>();
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mlS$Activity */
    public interface Activity {
        void AEQbTJ(java.lang.String str);

        void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map);

        void OLrzqt(java.lang.String str);

        void copydefault(@NotNull DeepLinkResult deepLinkResult);

        void copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map);
    }

    /* JADX INFO: renamed from: o.mlS$StateListAnimator */
    public static class StateListAnimator implements Activity {
        @Override // o.C32853mlS.Activity
        public void AEQbTJ(java.lang.String str) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32853mlS.Activity
        public void AEQbTJ(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
        }

        @Override // o.C32853mlS.Activity
        public void OLrzqt(java.lang.String str) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32853mlS.Activity
        public void copydefault(@NotNull DeepLinkResult deepLinkResult) {
            Intrinsics.checkNotNullParameter(deepLinkResult, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C32853mlS.Activity
        public void copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
        }
    }

    private C32853mlS() {
    }

    public final void AEQbTJ(@NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        gEmmrt = map;
        KWHzl = map;
        OLrzqt(new Function1() { // from class: o.mlO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32853mlS.EZpvd(map, (C32853mlS.Activity) obj);
            }
        });
    }

    public static final Unit EZpvd(java.util.Map map, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.AEQbTJ((java.util.Map<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        OLrzqt(new Function1() { // from class: o.mlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32853mlS.AEQbTJ(str, (C32853mlS.Activity) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        gEmmrt = map;
        OLrzqt = map;
        OLrzqt(new Function1() { // from class: o.mlP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32853mlS.KWHzl(map, (C32853mlS.Activity) obj);
            }
        });
    }

    public static final Unit KWHzl(java.util.Map map, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.copydefault((java.util.Map<java.lang.String, java.lang.String>) map);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        OLrzqt(new Function1() { // from class: o.mlW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32853mlS.OLrzqt(str, (C32853mlS.Activity) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull final DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        OLrzqt(new Function1() { // from class: o.mlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32853mlS.KWHzl(deepLinkResult, (C32853mlS.Activity) obj);
            }
        });
    }

    public static final Unit KWHzl(DeepLinkResult deepLinkResult, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.copydefault(deepLinkResult);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        copydefault.add(activity);
    }

    public final void OLrzqt(Function1<? super Activity, Unit> function1) {
        java.util.Iterator<T> it = copydefault.iterator();
        while (it.hasNext()) {
            function1.invoke((Activity) it.next());
        }
    }
}
