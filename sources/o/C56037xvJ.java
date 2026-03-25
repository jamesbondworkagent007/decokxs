package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56037xvJ {
    public static final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str3, 0)) {
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwner), C56033xvF.getBotPrice$default(str, str2, str3 == null ? "" : str3, true, false, RoundingMode.HALF_UP, null, 80, null));
        }
        if (C33129mqd.AEQbTJ(str4, 0)) {
            xMR xmr = xMR.copydefault;
            if (str4 == null) {
                str4 = "";
            }
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.pause), xmr.EZpvd(str4, 2, 2, RoundingMode.DOWN));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.onBackPressed), "--");
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str3, 0)) {
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setContent), C56033xvF.getBotPrice$default(str, str2, str3 == null ? "" : str3, true, false, RoundingMode.HALF_UP, null, 80, null));
        }
        if (C33129mqd.AEQbTJ(str4, 0)) {
            xMR xmr = xMR.copydefault;
            if (str4 == null) {
                str4 = "";
            }
            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.resume), xmr.EZpvd(str4, 2, 2, RoundingMode.DOWN));
        }
        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.getLifecycle), "--");
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str3, 0)) {
            return C56033xvF.getBotPrice$default(str, str2, str3 == null ? "" : str3, false, false, RoundingMode.HALF_UP, null, 88, null);
        }
        if (C33129mqd.AEQbTJ(str4, 0)) {
            return xMR.formatPercent$default(xMR.copydefault, str4 == null ? "" : str4, 0, RoundingMode.DOWN, 2, null);
        }
        return "--";
    }
}
