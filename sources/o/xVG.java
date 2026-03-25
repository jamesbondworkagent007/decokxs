package o;

import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVG {
    public static final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || str.length() == 0) ? "--" : str;
    }

    public static /* synthetic */ java.lang.String formatPercent$default(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, DisplaySign displaySign, int i, double d, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str2 = "--";
        }
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i2 & 4) != 0) {
            displaySign = DisplaySign.EXCEPT_ZERO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i2 & 8) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            d = 100.0d;
        }
        return EZpvd(str, str2, roundingMode2, displaySign2, i3, d);
    }

    public static final java.lang.String EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull RoundingMode roundingMode, @NotNull DisplaySign displaySign, int i, double d) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return (str == null || str.length() == 0) ? str2 : pTB.formatICUPercent$default(C33129mqd.EZpvd(str), roundingMode, C38307pTy.Companion.KWHzl(i, 2), displaySign, java.lang.Double.valueOf(d), null, 16, null);
    }

    public static /* synthetic */ int formatTextColor$default(java.lang.String str, android.content.Context context, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return AEQbTJ(str, context, bool);
    }

    public static final int AEQbTJ(java.lang.String str, @NotNull android.content.Context context, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "");
        if (bool != null && Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (C33129mqd.gEmmrt(str, 0)) {
            return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }
}
