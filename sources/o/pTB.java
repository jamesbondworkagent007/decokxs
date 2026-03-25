package o;

import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.util.MeasureUnit;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pTB {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return formatICUCompact$default(number, roundingMode, c38307pTy, null, null, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return formatRoundToFixed$default(bigDecimal, i, null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return formatPercentWithSymbol$default(bigDecimal, i, i2, roundingMode, null, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return formatPercent$default(bigDecimal, i, 0, null, null, 14, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return formatPercent$default(bigDecimal, i, i2, roundingMode, null, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return formatLocalized$default(str, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return formatStringWithPercent$default(str, null, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return toLocalizationStringWithMaxPrecision$default(str, i, roundingMode, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, int i) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return formatDownToFixed$default(bigDecimal, i, null, 2, null);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.lang.String string = NumberFormatter.EZpvd(locale).KWHzl(c38307pTy.EZpvd()).OLrzqt(roundingMode).KWHzl(displaySign.toSignDisplay()).EZpvd(number).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return pTF.KWHzl.copydefault(string);
        } catch (java.lang.Exception e) {
            pUU.OLrzqt("NumberFormat", "formatICUNumberInternal", e);
            return number.toString();
        } catch (java.lang.LinkageError e2) {
            pUU.OLrzqt("NumberFormat", "formatICUNumberInternal, LinkageError", e2);
            return number.toString();
        }
    }

    public static /* synthetic */ java.lang.String formatICUNumber$default(java.lang.Number number, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(number, roundingMode, c38307pTy, displaySign, locale);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return EZpvd(number, roundingMode, c38307pTy, displaySign, locale);
    }

    public static /* synthetic */ java.lang.String formatICUPercent$default(java.lang.Number number, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.lang.Double d, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 8) != 0) {
            d = null;
        }
        java.lang.Double d2 = d;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(number, roundingMode, c38307pTy2, displaySign2, d2, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, java.lang.Double d, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return EZpvd(number, true, roundingMode, c38307pTy, displaySign, d, locale);
    }

    public static /* synthetic */ java.lang.String formatICUPermille$default(java.lang.Number number, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.lang.Double d, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 8) != 0) {
            d = null;
        }
        java.lang.Double d2 = d;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(number, roundingMode, c38307pTy2, displaySign2, d2, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, java.lang.Double d, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return EZpvd(number, false, roundingMode, c38307pTy, displaySign, d, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, boolean z, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, java.lang.Double d, @NotNull java.util.Locale locale) {
        MeasureUnit measureUnit;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            if (z) {
                measureUnit = C7257agS.EZpvd;
            } else {
                measureUnit = C7257agS.KWHzl;
            }
            java.lang.String string = NumberFormatter.EZpvd(locale).KWHzl(c38307pTy.EZpvd()).OLrzqt(roundingMode).KWHzl(measureUnit).OLrzqt(C7235afx.EZpvd(d != null ? d.doubleValue() : 1.0d)).KWHzl(displaySign.toSignDisplay()).EZpvd(number).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return pTF.KWHzl.copydefault(string);
        } catch (java.lang.LinkageError e) {
            pUU.OLrzqt("NumberFormat", "formatPercentOrPermille", e);
            return KWHzl(number, z, roundingMode, c38307pTy, displaySign, d, locale);
        }
    }

    public static final java.lang.String KWHzl(java.lang.Number number, boolean z, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.lang.Double d, java.util.Locale locale) {
        java.lang.String str = z ? "%" : "‰";
        try {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(number);
            if (d != null) {
                bigDecimalEZpvd = bigDecimalEZpvd.multiply(new BigDecimal(d.doubleValue()));
            }
            BigDecimal scale = bigDecimalEZpvd.setScale(2, roundingMode);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str2 = java.lang.String.format(locale, "%s%s", java.util.Arrays.copyOf(new java.lang.Object[]{scale, str}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("NumberFormat", "fallbackPercent", e);
            return number.toString();
        }
    }

    public static /* synthetic */ java.lang.String formatPercent$default(BigDecimal bigDecimal, int i, RoundingMode roundingMode, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i2 & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(bigDecimal, i, roundingMode, locale);
    }

    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return EZpvd(bigDecimal, i, i, roundingMode, locale);
    }

    public static /* synthetic */ java.lang.String formatPercent$default(BigDecimal bigDecimal, int i, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return KWHzl(bigDecimal, i, roundingMode);
    }

    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        return EZpvd(bigDecimal, i, i, roundingMode, locale);
    }

    public static /* synthetic */ java.lang.String formatPercent$default(BigDecimal bigDecimal, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        if ((i3 & 4) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i3 & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(bigDecimal, i, i2, roundingMode, locale);
    }

    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            return pTF.KWHzl.copydefault(OLrzqt(bigDecimal, roundingMode, C38307pTy.Companion.KWHzl(i2, i), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), locale));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    public static /* synthetic */ java.lang.String formatPercentWithSymbol$default(BigDecimal bigDecimal, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        if ((i3 & 4) != 0) {
            roundingMode = RoundingMode.UP;
        }
        if ((i3 & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(bigDecimal, i, i2, roundingMode, locale);
    }

    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            return pTF.KWHzl.copydefault(OLrzqt(bigDecimal, roundingMode, C38307pTy.Companion.KWHzl(i2, i), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), locale));
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    public static /* synthetic */ java.lang.String formatUpToMax$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return djBIcL(bigDecimal, i, locale);
    }

    public static final java.lang.String djBIcL(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.AEQbTJ(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.UP, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatUpToFixed$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(bigDecimal, i, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.EZpvd(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.UP, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatDownToMax$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(bigDecimal, i, locale);
    }

    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.AEQbTJ(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.DOWN, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatDownToFixed$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(bigDecimal, i, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.EZpvd(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.DOWN, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatRoundToMax$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(bigDecimal, i, locale);
    }

    public static final java.lang.String copydefault(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.AEQbTJ(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.HALF_UP, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatRoundToFixed$default(BigDecimal bigDecimal, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(bigDecimal, i, locale);
    }

    public static final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal, int i, @NotNull java.util.Locale locale) {
        C38307pTy c38307pTyOLrzqt;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(locale, "");
        if (i >= 0) {
            c38307pTyOLrzqt = C38307pTy.Companion.EZpvd(i);
        } else {
            c38307pTyOLrzqt = C38307pTy.Companion.OLrzqt(i);
        }
        return EZpvd(bigDecimal, RoundingMode.HALF_EVEN, c38307pTyOLrzqt, DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String formatLocalized$default(java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(str, locale);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            return KWHzl(OLrzqt((java.lang.Object) str), 100, locale);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static /* synthetic */ java.lang.String formatLocalizedWithMinPrecision$default(java.lang.String str, int i, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, i, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            return EZpvd(OLrzqt((java.lang.Object) str), RoundingMode.HALF_DOWN, C38307pTy.Companion.KWHzl(i, 100), DisplaySign.AUTO, locale);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static final BigDecimal AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt((java.lang.Object) str);
    }

    public static /* synthetic */ java.lang.String formatStringWithPercent$default(java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return pTF.KWHzl.copydefault(C59449zhJ.replace$default(OLrzqt(OLrzqt((java.lang.Object) "0"), RoundingMode.UP, C38307pTy.Companion.EZpvd(0), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), locale), "0", str, false, 4, (java.lang.Object) null));
    }

    public static /* synthetic */ java.lang.String toLocalizationStringWithPrecision$default(java.lang.String str, int i, int i2, RoundingMode roundingMode, java.util.Locale locale, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, i, i2, roundingMode, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return EZpvd(OLrzqt((java.lang.Object) str), roundingMode, C38307pTy.Companion.KWHzl(i, i2), DisplaySign.AUTO, locale);
    }

    public static /* synthetic */ java.lang.String toLocalizationStringWithMaxPrecision$default(java.lang.String str, int i, RoundingMode roundingMode, java.util.Locale locale, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(str, i, roundingMode, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return OLrzqt(str, 0, i, roundingMode, locale);
    }

    public static final BigDecimal OLrzqt(java.lang.Object obj) {
        BigDecimal bigDecimal;
        try {
            if (obj == null) {
                bigDecimal = new BigDecimal("0.0");
            } else {
                bigDecimal = obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(obj.toString());
            }
            return bigDecimal;
        } catch (java.lang.Exception unused) {
            return new BigDecimal("0.0");
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.lang.String string = NumberFormatter.EZpvd(locale).OLrzqt(C7230afs.AEQbTJ()).KWHzl(c38307pTy.EZpvd()).OLrzqt(roundingMode).KWHzl(displaySign.toSignDisplay()).EZpvd(NumberFormatter.GroupingStrategy.AUTO).EZpvd(number).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return pTF.KWHzl.copydefault(string);
        } catch (java.lang.LinkageError e) {
            pUU.OLrzqt("NumberFormat", "formatICUCompactInternal", e);
            return number.toString();
        }
    }

    public static /* synthetic */ java.lang.String formatICUCompact$default(java.lang.Number number, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(number, roundingMode, c38307pTy, displaySign, locale);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return OLrzqt(number, roundingMode, c38307pTy, displaySign, locale);
    }

    public static /* synthetic */ java.lang.String formatSubscriptNumber$default(java.lang.Number number, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 2) != 0) {
            c38307pTy = C38307pTy.Companion.copydefault(1, 5);
        }
        if ((i & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(number, roundingMode, c38307pTy, displaySign, locale);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTz.toSubscript$default(java.lang.String, int, java.util.Locale, int, java.lang.Object):java.lang.String */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C38308pTz.toSubscript$default(copydefault(number, roundingMode, c38307pTy, displaySign, locale), 0, locale, 2, null);
    }
}
