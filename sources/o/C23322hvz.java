package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23322hvz {
    public static /* synthetic */ java.lang.String toLocalizedNumber$default(java.lang.Number number, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return EZpvd(number, z, roundingMode, z2, z3);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl(number.toString(), z, roundingMode, z2, z3);
    }

    public static /* synthetic */ java.lang.String toLocalizedNumber$default(java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return KWHzl(str, z, roundingMode, z2, z3);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C23271hvA.copydefault.KWHzl(str, z, roundingMode, z2, z3);
    }

    public static /* synthetic */ java.lang.String toLocalizedNumberWithSymbol$default(java.lang.String str, java.lang.String str2, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return KWHzl(str, str2, z4, roundingMode2, z2, (i & 16) != 0 ? false : z3);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C23271hvA.copydefault.EZpvd(str, str2, z, roundingMode, z2, z3);
    }

    public static /* synthetic */ java.lang.String toLocalizedCurrencyNumberWithPrefix$default(java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        return OLrzqt(str, z, roundingMode, z2, z3);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return C23272hvB.KWHzl.KWHzl(str, z, z2, roundingMode, z3);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, true, null, true, false, 348, null);
    }
}
