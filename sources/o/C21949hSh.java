package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21949hSh {
    public static final C21949hSh EZpvd = new C21949hSh();

    private C21949hSh() {
    }

    public static /* synthetic */ java.lang.String getTokenPrice$default(C21949hSh c21949hSh, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c21949hSh.KWHzl(str, z);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            return "--";
        }
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, RoundingMode.DOWN, false, false, false, false, null, false, false, 509, null);
        if (z) {
            return scientificCurrency$default;
        }
        return "≈" + scientificCurrency$default;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_SIZE_PERCENT, null);
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (str.length() == 0 || C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, RoundingMode.DOWN, false, false, false, false, null, false, false, 509, null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
    }
}
