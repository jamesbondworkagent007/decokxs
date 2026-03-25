package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xYg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54867xYg {
    public static /* synthetic */ java.lang.String formatFeeRate$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = "Sat/b";
        }
        return OLrzqt(str, str2);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strKWHzl = C54862xYb.KWHzl(pTB.OLrzqt((java.lang.Object) str), RoundingMode.UP, false, (java.lang.Integer) 2);
        if (str2 == null) {
            return strKWHzl;
        }
        return strKWHzl + " " + str2;
    }
}
