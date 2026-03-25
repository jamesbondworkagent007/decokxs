package o;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.bmi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10346bmi {
    public static final C10346bmi KWHzl = new C10346bmi();

    private C10346bmi() {
    }

    public static /* synthetic */ java.lang.String formatRatePercent$default(C10346bmi c10346bmi, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c10346bmi.KWHzl(str, z);
    }

    public final java.lang.String KWHzl(java.lang.String str, boolean z) {
        java.lang.String iCUPercent$default;
        boolean zAEQbTJ = C33129mqd.AEQbTJ(str, 0);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if (zAEQbTJ && C33129mqd.gEmmrt(str, java.lang.Double.valueOf(1.0E-4d))) {
            iCUPercent$default = "<" + pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(1.0E-4d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        } else if (!C33129mqd.gEmmrt(str, 0) || !C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(-1.0E-4d))) {
            iCUPercent$default = pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.FLOOR, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        } else if (z) {
            iCUPercent$default = "-<" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        } else {
            iCUPercent$default = "<" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        if (!z || !C33129mqd.AEQbTJ(str, 0)) {
            return iCUPercent$default;
        }
        return Marker.ANY_NON_NULL_MARKER + iCUPercent$default;
    }

    public final java.lang.String AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return pTB.formatDownToMax$default(bigDecimal, 0, null, 3, null);
    }

    public static /* synthetic */ java.lang.String formatRatePercentWithoutPercentageSign$default(C10346bmi c10346bmi, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c10346bmi.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        BigDecimal bigDecimalFARcdN;
        java.lang.String strAEQbTJ;
        if (str == null || (bigDecimalFARcdN = C59443zhD.fARcdN(str)) == null) {
            bigDecimalFARcdN = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalFARcdN.compareTo(bigDecimal) > 0 && bigDecimalFARcdN.compareTo(new BigDecimal("0.0001")) < 0) {
            strAEQbTJ = "<" + AEQbTJ(new BigDecimal("0.01"));
        } else if (bigDecimalFARcdN.compareTo(bigDecimal) < 0 && bigDecimalFARcdN.compareTo(new BigDecimal("-0.0001")) > 0) {
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            strAEQbTJ = "<" + AEQbTJ(bigDecimal);
            if (z) {
                strAEQbTJ = "-" + strAEQbTJ;
            }
        } else {
            Intrinsics.copydefault(bigDecimalFARcdN);
            BigDecimal bigDecimalMultiply = bigDecimalFARcdN.multiply(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            strAEQbTJ = AEQbTJ(bigDecimalMultiply);
        }
        if (!z || bigDecimalFARcdN.compareTo(bigDecimal) <= 0) {
            return strAEQbTJ;
        }
        return Marker.ANY_NON_NULL_MARKER + strAEQbTJ;
    }

    public static /* synthetic */ java.lang.String formatPlatformListCurrencyData$default(C10346bmi c10346bmi, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c10346bmi.OLrzqt(str, z, z2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.valueOf(str, 0)) {
            java.lang.String localizedWithMinPrecision$default = pTB.formatLocalizedWithMinPrecision$default("0", 2, null, 2, null);
            if (!z) {
                return localizedWithMinPrecision$default;
            }
            return C54864xYd.AEQbTJ.AhwBna() + localizedWithMinPrecision$default;
        }
        if (C33129mqd.AEQbTJ(str, 1000000) && z2) {
            java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
            if (!z) {
                return upToMax$default;
            }
            return C54864xYd.AEQbTJ.AhwBna() + upToMax$default;
        }
        return formatCurrencyData$default(this, str, null, null, null, 14, null);
    }

    public static /* synthetic */ java.lang.String formatCurrencyData$default(C10346bmi c10346bmi, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c10346bmi.copydefault(str, num, num2, bool);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue = num != null ? num.intValue() : 2;
        int iIntValue2 = num2 != null ? num2.intValue() : 2;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C54864xYd c54864xYd = C54864xYd.AEQbTJ;
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c54864xYd.OLrzqt()), null, null, null, 14, null);
        if (C33129mqd.valueOf(strMulS$default, 0)) {
            return c54864xYd.AhwBna() + pTB.formatLocalizedWithMinPrecision$default("0", 0, null, 2, null);
        }
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, iIntValue))), iIntValue, null, 2, null);
        if (C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + c54864xYd.AhwBna() + upToMax$default;
        }
        return c54864xYd.AhwBna() + limitFmtNoZeroWithKMB$default(this, strMulS$default, iIntValue2, 0, zBooleanValue, false, 20, null);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54864xYd c54864xYd = C54864xYd.AEQbTJ;
        java.lang.String strGEmmrt = c54864xYd.gEmmrt();
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, 2))), 2, null, 2, null);
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c54864xYd.OLrzqt()), null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + upToMax$default + " " + strGEmmrt;
        }
        return limitFmtNoZeroWithKMBMoreThanMillion$default(this, strMulS$default, 2, 2, false, false, 24, null) + " " + strGEmmrt;
    }

    public static /* synthetic */ java.lang.String formatCurrencyDataToDollar$default(C10346bmi c10346bmi, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c10346bmi.EZpvd(str, z);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.AEQbTJ(str, 0) && C33129mqd.gEmmrt(str, java.lang.Double.valueOf(0.01d))) {
            return "<$0.01";
        }
        java.lang.String strLimitFmtNoZeroWithKMBWithoutFormatLocalized$default = limitFmtNoZeroWithKMBWithoutFormatLocalized$default(this, str, 2, 2, false, 8, null);
        if (!z) {
            return strLimitFmtNoZeroWithKMBWithoutFormatLocalized$default;
        }
        return "$" + strLimitFmtNoZeroWithKMBWithoutFormatLocalized$default;
    }

    public static /* synthetic */ java.lang.String formatZeroCurrencyData$default(C10346bmi c10346bmi, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c10346bmi.EZpvd(z);
    }

    public final java.lang.String EZpvd(boolean z) {
        java.lang.String localized$default = pTB.formatLocalized$default("0", null, 1, null);
        if (!z) {
            return localized$default;
        }
        return C54864xYd.AEQbTJ.AhwBna() + localized$default;
    }

    public static /* synthetic */ java.lang.String formatZeroCurrencyDataWithSymbol$default(C10346bmi c10346bmi, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c10346bmi.AEQbTJ(z);
    }

    public final java.lang.String AEQbTJ(boolean z) {
        java.lang.String strGEmmrt = C54864xYd.AEQbTJ.gEmmrt();
        java.lang.String localized$default = pTB.formatLocalized$default("0", null, 1, null);
        if (!z) {
            return localized$default;
        }
        return localized$default + " " + strGEmmrt;
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMB$default(C10346bmi c10346bmi, java.lang.String str, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        return c10346bmi.copydefault(str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? 2 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, int i2, boolean z, boolean z2) {
        java.lang.String downToMax$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).toPlainString();
        if (z2) {
            str2 = C54864xYd.AEQbTJ.AhwBna() + " ";
        }
        if (C33129mqd.AEQbTJ(plainString, 0) && C33129mqd.gEmmrt(plainString, java.lang.Double.valueOf(1.0E-6d))) {
            downToMax$default = "<" + pTB.formatLocalized$default("0.000001", null, 1, null);
        } else if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000)) {
            downToMax$default = pTB.formatICUCompact$default(C33129mqd.EZpvd(plainString), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(i2), null, null, 12, null);
        } else if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000) && z) {
            downToMax$default = pTB.formatICUCompact$default(C33129mqd.EZpvd(plainString), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(i2), null, null, 12, null);
        } else {
            downToMax$default = pTB.formatDownToMax$default(C33129mqd.EZpvd(plainString), i, null, 2, null);
        }
        return str2 + downToMax$default;
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMBMoreThanMillion$default(C10346bmi c10346bmi, java.lang.String str, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        return c10346bmi.KWHzl(str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? 2 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.AEQbTJ(C33129mqd.EZpvd(str).toPlainString(), 1000000)) {
            return limitFmtNoZeroWithKMB$default(this, str, i, i2, z, false, 16, null);
        }
        if (z2) {
            return C54864xYd.AEQbTJ.AhwBna() + pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMBWithoutFormatLocalized$default(C10346bmi c10346bmi, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return c10346bmi.EZpvd(str, i, i2, z);
    }

    public final java.lang.String EZpvd(java.lang.String str, int i, int i2, boolean z) {
        java.lang.String plainString = C33129mqd.EZpvd(str).toPlainString();
        if (C33129mqd.AEQbTJ(plainString, 0) && C33129mqd.gEmmrt(plainString, java.lang.Double.valueOf(1.0E-6d))) {
            return "<$0.000001";
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000000, null, null, null, 14, null)), i2, null, 2, null) + "B";
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000, null, null, null, 14, null)), i2, null, 2, null) + "M";
        }
        if (!C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000) || !z) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), i, null, 2, null);
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000, null, null, null, 14, null)), i2, null, 2, null) + "K";
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroAndUpWithKMB$default(C10346bmi c10346bmi, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return c10346bmi.AEQbTJ(str, i, i2, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).toPlainString();
        if (C33129mqd.AEQbTJ(plainString, 0) && C33129mqd.gEmmrt(plainString, java.lang.Double.valueOf(1.0E-6d))) {
            return "<" + pTB.formatLocalized$default("1.0E-6", null, 1, null);
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000000, null, null, null, 14, null)), i2, null, 2, null) + "B";
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000, null, null, null, 14, null)), i2, null, 2, null) + "M";
        }
        if (!C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000) || !z) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), i, null, 2, null);
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000, null, null, null, 14, null)), i2, null, 2, null) + "K";
    }

    public final int EZpvd(@NotNull BigDecimal bigDecimal, int i, int i2, int i3, int i4, int i5, @NotNull java.lang.String str) {
        BigDecimal bigDecimalMovePointRight;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i6 = i2 - i3;
        if (i6 > 0) {
            bigDecimalMovePointRight = bigDecimal.movePointLeft(i6);
        } else {
            bigDecimalMovePointRight = bigDecimal.movePointRight(i3 - i2);
        }
        double dLog = java.lang.Math.log(bigDecimalMovePointRight.doubleValue()) / java.lang.Math.log(C33129mqd.AEQbTJ(str));
        double d = i;
        return C56548yJl.EZpvd((int) (java.lang.Math.floor(dLog / d) * d), i4, i5);
    }

    public static /* synthetic */ BigDecimal calculatePriceAtTick$default(C10346bmi c10346bmi, int i, int i2, int i3, int i4, int i5, java.lang.String str, int i6, java.lang.Object obj) {
        if ((i6 & 8) != 0) {
            i4 = -887272;
        }
        int i7 = i4;
        if ((i6 & 16) != 0) {
            i5 = 887272;
        }
        int i8 = i5;
        if ((i6 & 32) != 0) {
            str = "1.0001";
        }
        return c10346bmi.copydefault(i, i2, i3, i7, i8, str);
    }

    public final BigDecimal copydefault(int i, int i2, int i3, int i4, int i5, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MathContext mathContext = new MathContext(10, RoundingMode.HALF_UP);
        BigDecimal bigDecimalPow = new BigDecimal(str).pow(C56548yJl.EZpvd(i, i4, i5), mathContext);
        int i6 = i2 - i3;
        if (i6 > 0) {
            BigDecimal bigDecimalStripTrailingZeros = bigDecimalPow.movePointRight(i6).stripTrailingZeros();
            Intrinsics.copydefault(bigDecimalStripTrailingZeros);
            return bigDecimalStripTrailingZeros;
        }
        BigDecimal bigDecimalStripTrailingZeros2 = bigDecimalPow.movePointLeft(i3 - i2).stripTrailingZeros();
        Intrinsics.copydefault(bigDecimalStripTrailingZeros2);
        return bigDecimalStripTrailingZeros2;
    }

    public static /* synthetic */ java.lang.String getFormattedCurrencyAmountForDailyYield$default(C10346bmi c10346bmi, boolean z, boolean z2, java.lang.String str, boolean z3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        return c10346bmi.copydefault(z, z2, str, z3);
    }

    public final java.lang.String copydefault(boolean z, boolean z2, java.lang.String str, boolean z3) {
        if (z) {
            if (z3) {
                return formatZeroCurrencyDataWithSymbol$default(this, false, 1, null);
            }
            return EZpvd(false);
        }
        if (z2 || !C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        if (z3) {
            Intrinsics.copydefault((java.lang.Object) str);
            return OLrzqt(str);
        }
        Intrinsics.copydefault((java.lang.Object) str);
        return limitFmtNoZeroWithKMBMoreThanMillion$default(this, str, 6, 2, false, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatProductDetailItemContent$default(C10346bmi c10346bmi, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c10346bmi.EZpvd(i, str, z);
    }

    public final java.lang.String EZpvd(int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return i != 0 ? str : str.length() == 0 ? "--" : formatCurrencyData$default(this, str, null, null, java.lang.Boolean.valueOf(z), 6, null);
    }
}
