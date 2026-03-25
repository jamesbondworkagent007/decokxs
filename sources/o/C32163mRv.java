package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32163mRv {
    public static /* synthetic */ java.lang.String formatPercent$default(java.lang.String str, boolean z, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i3 & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(str, z, i4, i5, roundingMode2, locale);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        mRE.AEQbTJ((java.lang.Object) str);
        if (!z) {
            str = mRE.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        return pTB.EZpvd(C33129mqd.EZpvd(str), i, i2, roundingMode, locale);
    }

    public static /* synthetic */ java.lang.String formatPercentWithSymbol$default(java.lang.String str, boolean z, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i3 & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(str, z, i4, i5, roundingMode2, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        mRE.AEQbTJ((java.lang.Object) str);
        if (!z) {
            str = mRE.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        return pTF.KWHzl.AEQbTJ(pTB.KWHzl(C33129mqd.EZpvd(str), i, i2, roundingMode, locale));
    }

    public static /* synthetic */ java.lang.String formatPercentWithoutSymbol$default(java.lang.String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            bigDecimal = null;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        return EZpvd(str, z, i, bigDecimal, z2, num);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, int i, BigDecimal bigDecimal, boolean z2, java.lang.Integer num) {
        BigDecimal bigDecimalEZpvd;
        java.lang.String strDivCheckS$default = str;
        Intrinsics.checkNotNullParameter(strDivCheckS$default, "");
        if (Intrinsics.EZpvd((java.lang.Object) strDivCheckS$default, (java.lang.Object) "--")) {
            return strDivCheckS$default;
        }
        mRE.AEQbTJ((java.lang.Object) str);
        if (!z) {
            strDivCheckS$default = mRE.divCheckS$default(str, 100, null, null, null, 14, null);
        }
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(strDivCheckS$default);
        if (bigDecimal != null) {
            bigDecimalEZpvd = C33129mqd.EZpvd(z ? bigDecimal : mRE.divCheckS$default(bigDecimal, 100, null, null, null, 14, null));
        } else {
            bigDecimalEZpvd = bigDecimalEZpvd2;
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalEZpvd2.compareTo(bigDecimal2) > 0 && bigDecimalEZpvd2.compareTo(bigDecimalEZpvd) < 0) {
            return "<" + pTB.formatICUPercent$default(C33129mqd.EZpvd(bigDecimalEZpvd), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(num != null ? num.intValue() : i, i), null, java.lang.Double.valueOf(100.0d), null, 20, null);
        }
        if (z2 && Intrinsics.EZpvd(bigDecimalEZpvd2, bigDecimal2)) {
            return "0%";
        }
        return pTB.formatICUPercent$default(bigDecimalEZpvd2, RoundingMode.DOWN, C38307pTy.Companion.KWHzl(num != null ? num.intValue() : i, i), null, java.lang.Double.valueOf(100.0d), null, 20, null);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(str, 0) ? C59449zhJ.replace$default(str, "-", "", false, 4, (java.lang.Object) null) : str;
    }
}
