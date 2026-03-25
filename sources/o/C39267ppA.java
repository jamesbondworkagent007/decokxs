package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ppA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39267ppA {
    public void OLrzqt(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        java.lang.String strKWHzl = pFN.OLrzqt.KWHzl();
        if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "kline_dark")) {
            abstractActivityC33041mov.getDelegate().setLocalNightMode(2);
        } else if (Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "kline_white")) {
            abstractActivityC33041mov.getDelegate().setLocalNightMode(1);
        }
    }

    public boolean OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white");
    }
}
