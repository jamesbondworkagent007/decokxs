package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rVN {
    public static final java.lang.String KWHzl(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj.getClass().getName();
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.substringAfterLast$default(str, '.', (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ void reportFullyDrawn$default(android.app.Activity activity, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = KWHzl(activity);
        }
        AEQbTJ(activity, z, str);
    }

    public static final void AEQbTJ(@NotNull android.app.Activity activity, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iIdentityHashCode = java.lang.System.identityHashCode(activity);
        com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
        rVP rvp = apmAEQbTJ instanceof rVP ? (rVP) apmAEQbTJ : null;
        if (rvp != null) {
            rvp.KWHzl(iIdentityHashCode, str, z);
        }
    }

    public static /* synthetic */ void reportFullyDrawn$default(androidx.fragment.app.Fragment fragment, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = KWHzl(fragment);
        }
        EZpvd(fragment, z, str);
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iIdentityHashCode = java.lang.System.identityHashCode(fragment);
        com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
        rVP rvp = apmAEQbTJ instanceof rVP ? (rVP) apmAEQbTJ : null;
        if (rvp != null) {
            rvp.KWHzl(iIdentityHashCode, str, z);
        }
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
        rVP rvp = apmAEQbTJ instanceof rVP ? (rVP) apmAEQbTJ : null;
        if (rvp != null) {
            rvp.EZpvd(fragment);
        }
    }
}
