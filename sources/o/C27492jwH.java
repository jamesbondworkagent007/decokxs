package o;

import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.jwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27492jwH {
    public static final C27492jwH OLrzqt = new C27492jwH();

    private C27492jwH() {
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        boolean zGEmmrt = C33129mqd.gEmmrt(str, 0);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if (zGEmmrt) {
            return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        if (C33129mqd.gEmmrt(str, java.lang.Double.valueOf(1.0E-4d)) && C33129mqd.AEQbTJ(str, 0)) {
            return "<" + pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(1.0E-4d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        boolean zGEmmrt = C33129mqd.gEmmrt(str, 0);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if (zGEmmrt) {
            return "<" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        if (C33129mqd.gEmmrt(str, java.lang.Double.valueOf(1.0E-4d)) && C33129mqd.AEQbTJ(str, 0)) {
            return "<" + pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(1.0E-4d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
    }

    public static /* synthetic */ java.lang.String formatRatePercent$default(C27492jwH c27492jwH, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c27492jwH.AEQbTJ(str, z);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, boolean z) {
        java.lang.String iCUPercent$default;
        boolean zAEQbTJ = C33129mqd.AEQbTJ(str, 0);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if (zAEQbTJ && C33129mqd.gEmmrt(str, java.lang.Double.valueOf(1.0E-4d))) {
            iCUPercent$default = "<" + pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Double.valueOf(1.0E-4d)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        } else if (C33129mqd.gEmmrt(str, 0) && C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(-1.0E-4d))) {
            if (z) {
                iCUPercent$default = "-<" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
            } else {
                iCUPercent$default = "<" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
            }
        } else if (C33129mqd.AEQbTJ(str, 100)) {
            iCUPercent$default = ">" + pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 100), RoundingMode.FLOOR, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        } else {
            iCUPercent$default = pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.FLOOR, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        if (!z || !C33129mqd.AEQbTJ(str, 0)) {
            return iCUPercent$default;
        }
        return Marker.ANY_NON_NULL_MARKER + iCUPercent$default;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.contentEquals(str2)) {
            return C33069mpW.copydefault(C25493ixk.FragmentManager.QfsBiF, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", formatRatePercent$default(this, str, false, 2, null))));
        }
        return C33069mpW.copydefault(C25493ixk.FragmentManager.QVAiDq, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", formatRatePercent$default(this, str, false, 2, null)), C56390yDp.OLrzqt("num2", formatRatePercent$default(this, str2, false, 2, null))));
    }

    public final java.lang.String EZpvd(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return pTB.formatDownToMax$default(bigDecimal, 0, null, 3, null);
    }

    public static /* synthetic */ java.lang.String formatRatePercentWithoutPercentageSign$default(C27492jwH c27492jwH, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c27492jwH.OLrzqt(str, z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        BigDecimal bigDecimalFARcdN;
        java.lang.String strEZpvd;
        if (str == null || (bigDecimalFARcdN = C59443zhD.fARcdN(str)) == null) {
            bigDecimalFARcdN = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalFARcdN.compareTo(bigDecimal) > 0 && bigDecimalFARcdN.compareTo(new BigDecimal("0.0001")) < 0) {
            strEZpvd = "<" + EZpvd(new BigDecimal("0.01"));
        } else if (bigDecimalFARcdN.compareTo(bigDecimal) < 0 && bigDecimalFARcdN.compareTo(new BigDecimal("-0.0001")) > 0) {
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            strEZpvd = "<" + EZpvd(bigDecimal);
            if (z) {
                strEZpvd = "-" + strEZpvd;
            }
        } else {
            Intrinsics.copydefault(bigDecimalFARcdN);
            BigDecimal bigDecimalMultiply = bigDecimalFARcdN.multiply(new BigDecimal(100));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            strEZpvd = EZpvd(bigDecimalMultiply);
        }
        if (!z || bigDecimalFARcdN.compareTo(bigDecimal) <= 0) {
            return strEZpvd;
        }
        return Marker.ANY_NON_NULL_MARKER + strEZpvd;
    }

    public final java.lang.String djBIcL(java.lang.String str) {
        boolean zAEQbTJ = C33129mqd.AEQbTJ(str, 0);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if ((zAEQbTJ && C33129mqd.gEmmrt(str, java.lang.Double.valueOf(1.0E-5d))) || (C33129mqd.gEmmrt(str, 0) && C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(-1.0E-5d)))) {
            return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) 0), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        if (C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(1.0E-4d)) || C33129mqd.gEmmrt(str, java.lang.Double.valueOf(-1.0E-4d))) {
            return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.FLOOR, C38307pTy.Companion.KWHzl(0, 2), null, dValueOf, null, 20, null);
        }
        return pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), RoundingMode.FLOOR, C38307pTy.Companion.KWHzl(0, 3), null, dValueOf, null, 20, null);
    }

    public static /* synthetic */ java.lang.String formatTvl$default(C27492jwH c27492jwH, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c27492jwH.EZpvd(str, z, z2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        C27490jwF c27490jwF = C27490jwF.EZpvd;
        java.lang.String strLimitFmtNoZeroWithKMB$default = limitFmtNoZeroWithKMB$default(this, C33129mqd.mulS$default(str, java.lang.Double.valueOf(c27490jwF.EZpvd()), null, null, null, 14, null), 0, 0, true, false, 22, null);
        if (z) {
            strLimitFmtNoZeroWithKMB$default = c27490jwF.djBIcL() + strLimitFmtNoZeroWithKMB$default;
        }
        if (!z2) {
            return strLimitFmtNoZeroWithKMB$default;
        }
        return strLimitFmtNoZeroWithKMB$default + " " + C33070mpX.AYXKKw(C25493ixk.FragmentManager.getStatusCode);
    }

    public static /* synthetic */ java.lang.String formatPlatformListCurrencyData$default(C27492jwH c27492jwH, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c27492jwH.copydefault(str, z, z2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.valueOf(str, 0)) {
            java.lang.String localizedWithMinPrecision$default = pTB.formatLocalizedWithMinPrecision$default("0", 2, null, 2, null);
            if (!z) {
                return localizedWithMinPrecision$default;
            }
            return C27490jwF.EZpvd.djBIcL() + localizedWithMinPrecision$default;
        }
        if (C33129mqd.AEQbTJ(str, 1000000) && z2) {
            java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
            if (!z) {
                return upToMax$default;
            }
            return C27490jwF.EZpvd.djBIcL() + upToMax$default;
        }
        return formatCurrencyData$default(this, str, null, null, null, 14, null);
    }

    public static /* synthetic */ java.lang.String formatCurrencyData$default(C27492jwH c27492jwH, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c27492jwH.OLrzqt(str, num, num2, bool);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue = num != null ? num.intValue() : C27490jwF.EZpvd.copydefault();
        int iIntValue2 = num2 != null ? num2.intValue() : 2;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C27490jwF c27490jwF = C27490jwF.EZpvd;
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c27490jwF.EZpvd()), null, null, null, 14, null);
        if (C33129mqd.valueOf(strMulS$default, 0)) {
            return c27490jwF.djBIcL() + pTB.formatLocalizedWithMinPrecision$default("0", 0, null, 2, null);
        }
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, iIntValue))), iIntValue, null, 2, null);
        if (C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + c27490jwF.djBIcL() + upToMax$default;
        }
        return c27490jwF.djBIcL() + limitFmtNoZeroWithKMB$default(this, strMulS$default, iIntValue2, 0, zBooleanValue, false, 20, null);
    }

    public static /* synthetic */ java.lang.String formatCurrencyAppendSymbol$default(C27492jwH c27492jwH, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c27492jwH.KWHzl(str, num, num2, bool);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue = num != null ? num.intValue() : C27490jwF.EZpvd.copydefault();
        int iIntValue2 = num2 != null ? num2.intValue() : 2;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        C27490jwF c27490jwF = C27490jwF.EZpvd;
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c27490jwF.EZpvd()), null, null, null, 14, null);
        if (C33129mqd.valueOf(strMulS$default, 0)) {
            return pTB.formatLocalizedWithMinPrecision$default("0", 0, null, 2, null) + c27490jwF.AYXKKw();
        }
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, iIntValue))), iIntValue, null, 2, null);
        if (C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + upToMax$default + c27490jwF.djBIcL();
        }
        return limitFmtNoZeroWithKMB$default(this, strMulS$default, iIntValue2, 0, zBooleanValue, false, 20, null) + c27490jwF.djBIcL();
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27490jwF c27490jwF = C27490jwF.EZpvd;
        int iCopydefault = c27490jwF.copydefault();
        java.lang.String strAYXKKw = c27490jwF.AYXKKw();
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, iCopydefault))), iCopydefault, null, 2, null);
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c27490jwF.EZpvd()), null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + upToMax$default + " " + strAYXKKw;
        }
        return limitFmtNoZeroWithKMB$default(this, strMulS$default, iCopydefault, iCopydefault, false, false, 24, null) + " " + strAYXKKw;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C27490jwF c27490jwF = C27490jwF.EZpvd;
        int iCopydefault = c27490jwF.copydefault();
        java.lang.String strAYXKKw = c27490jwF.AYXKKw();
        java.lang.String upToMax$default = pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Double.valueOf(((double) 1) / java.lang.Math.pow(10.0d, iCopydefault))), iCopydefault, null, 2, null);
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, java.lang.Double.valueOf(c27490jwF.EZpvd()), null, null, null, 14, null);
        if (C33129mqd.AEQbTJ(strMulS$default, 0) && C33129mqd.gEmmrt(strMulS$default, upToMax$default)) {
            return "<" + upToMax$default + " " + strAYXKKw;
        }
        return limitFmtNoZeroWithKMBMoreThanMillion$default(this, strMulS$default, iCopydefault, iCopydefault, false, false, 24, null) + " " + strAYXKKw;
    }

    public static /* synthetic */ java.lang.String formatCurrencyDataToDollar$default(C27492jwH c27492jwH, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c27492jwH.EZpvd(str, z);
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

    public static /* synthetic */ java.lang.String formatZeroCurrencyData$default(C27492jwH c27492jwH, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c27492jwH.OLrzqt(z);
    }

    public final java.lang.String OLrzqt(boolean z) {
        java.lang.String localized$default = pTB.formatLocalized$default("0", null, 1, null);
        if (!z) {
            return localized$default;
        }
        return C27490jwF.EZpvd.djBIcL() + localized$default;
    }

    public static /* synthetic */ java.lang.String formatZeroCurrencyDataWithSymbol$default(C27492jwH c27492jwH, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c27492jwH.KWHzl(z);
    }

    public final java.lang.String KWHzl(boolean z) {
        java.lang.String strAYXKKw = C27490jwF.EZpvd.AYXKKw();
        java.lang.String localized$default = pTB.formatLocalized$default("0", null, 1, null);
        if (!z) {
            return localized$default;
        }
        return localized$default + " " + strAYXKKw;
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMB$default(C27492jwH c27492jwH, java.lang.String str, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        return c27492jwH.OLrzqt(str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? 2 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, int i2, boolean z, boolean z2) {
        java.lang.String downToMax$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).toPlainString();
        if (z2) {
            str2 = C27490jwF.EZpvd.djBIcL() + " ";
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

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH c27492jwH, java.lang.String str, int i, int i2, boolean z, boolean z2, int i3, java.lang.Object obj) {
        return c27492jwH.AEQbTJ(str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? 2 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.AEQbTJ(C33129mqd.EZpvd(str).toPlainString(), 1000000)) {
            return limitFmtNoZeroWithKMB$default(this, str, i, i2, z, false, 16, null);
        }
        if (z2) {
            return C27490jwF.EZpvd.djBIcL() + pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(str), 0, null, 2, null);
    }

    public static /* synthetic */ java.lang.String limitFmtNoZeroWithKMBWithoutFormatLocalized$default(C27492jwH c27492jwH, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return c27492jwH.copydefault(str, i, i2, z);
    }

    public final java.lang.String copydefault(java.lang.String str, int i, int i2, boolean z) {
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

    public static /* synthetic */ java.lang.String limitFmtNoZeroAndUpWithKMB$default(C27492jwH c27492jwH, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return c27492jwH.AEQbTJ(str, i, i2, z);
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

    public final java.lang.String valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).toPlainString();
        if (C33129mqd.AEQbTJ(plainString, 0) && C33129mqd.gEmmrt(plainString, java.lang.Double.valueOf(1.0E-5d))) {
            return "<" + pTB.formatLocalized$default("1.0E-5", null, 1, null);
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 0) && C33129mqd.valueOf(plainString, 1)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), 5, null, 2, null);
        }
        if (C33129mqd.AEQbTJ(plainString, 1) && C33129mqd.gEmmrt(plainString, 1000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), 6 - (((int) java.lang.Math.log10(C33129mqd.AEQbTJ(plainString))) + 1), null, 2, null);
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000000, null, null, null, 14, null)), 15 - (((int) java.lang.Math.log10(C33129mqd.AEQbTJ(plainString))) + 1), null, 2, null) + "B";
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000, null, null, null, 14, null)), 12 - (((int) java.lang.Math.log10(C33129mqd.AEQbTJ(plainString))) + 1), null, 2, null) + "M";
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), 6, null, 2, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(str).round(new MathContext(i, RoundingMode.DOWN)).toPlainString();
        if (C33129mqd.AEQbTJ(plainString, 0) && C33129mqd.gEmmrt(plainString, java.lang.Double.valueOf(1.0E-6d))) {
            return "<" + pTB.formatLocalized$default("1.0E-6", null, 1, null);
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000000, null, null, null, 14, null)), i, null, 2, null) + "B";
        }
        if (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000000, null, null, null, 14, null)), i, null, 2, null) + "M";
        }
        if (!C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 10000)) {
            return pTB.formatUpToMax$default(C33129mqd.EZpvd(plainString), i, null, 2, null);
        }
        return pTB.formatUpToMax$default(C33129mqd.EZpvd(C33129mqd.divS$default(plainString, 1000, null, null, null, 14, null)), i, null, 2, null) + "K";
    }

    public final int copydefault(@NotNull BigDecimal bigDecimal, int i, int i2, int i3, int i4, int i5, @NotNull java.lang.String str) {
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

    public static /* synthetic */ BigDecimal calculatePriceAtTick$default(C27492jwH c27492jwH, int i, int i2, int i3, int i4, int i5, java.lang.String str, int i6, java.lang.Object obj) {
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
        return c27492jwH.EZpvd(i, i2, i3, i7, i8, str);
    }

    public final BigDecimal EZpvd(int i, int i2, int i3, int i4, int i5, @NotNull java.lang.String str) {
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

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatLocalized$default(C33129mqd.mulS$default(str, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null);
    }

    public final java.lang.String EZpvd(java.lang.Integer num, @NotNull java.lang.String str) {
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (num != null && num.intValue() == 1) {
            str2 = "+ ";
        } else if (num != null && num.intValue() == 2) {
            str2 = "- ";
        }
        return str2 + str;
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j));
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.Math.max(0L, java.util.concurrent.TimeUnit.MILLISECONDS.toDays(j - calendar.getTimeInMillis()))));
        Date time = calendar2.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt("date", pTA.formatSimpleDate$default(time, null, 1, null)), C56390yDp.OLrzqt("num", strGEmmrt));
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.divS$default(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, i)), null, null, null, 14, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "";
        }
        if (C33129mqd.copydefault(str, "60")) {
            return C33129mqd.copydefault(str).divide(C33129mqd.copydefault("60"), 0, RoundingMode.DOWN) + " " + C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialDaTmkG);
        }
        return str + " " + C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialODCBUN);
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.gEmmrt(C33129mqd.EZpvd(str).setScale(0, RoundingMode.CEILING));
    }

    public static /* synthetic */ java.lang.String getFormattedCurrencyAmountForDailyYield$default(C27492jwH c27492jwH, boolean z, boolean z2, java.lang.String str, boolean z3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z3 = false;
        }
        return c27492jwH.copydefault(z, z2, str, z3);
    }

    public final java.lang.String copydefault(boolean z, boolean z2, java.lang.String str, boolean z3) {
        if (z) {
            if (z3) {
                return formatZeroCurrencyDataWithSymbol$default(this, false, 1, null);
            }
            return OLrzqt(false);
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

    public final java.lang.String KWHzl(boolean z, boolean z2, java.lang.String str, java.lang.String str2) {
        if (z) {
            return OLrzqt(false);
        }
        if (z2 || str == null || str.length() == 0) {
            return "--";
        }
        if (str2 == null || str2.length() == 0) {
            return limitFmtNoZeroWithKMBMoreThanMillion$default(this, str, 6, 2, false, false, 24, null);
        }
        return limitFmtNoZeroWithKMBMoreThanMillion$default(this, str2, 6, 2, false, false, 24, null) + " ~ " + limitFmtNoZeroWithKMBMoreThanMillion$default(this, str, 6, 2, false, false, 24, null);
    }

    public static /* synthetic */ java.lang.String formatProductDetailItemContent$default(C27492jwH c27492jwH, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c27492jwH.copydefault(i, str, z);
    }

    public final java.lang.String copydefault(int i, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return i != 0 ? str : str.length() == 0 ? "--" : formatCurrencyData$default(this, str, null, null, java.lang.Boolean.valueOf(z), 6, null);
    }

    public final int AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (C33129mqd.AEQbTJ(bigDecimal, C33129mqd.EZpvd("1000"))) {
            return 2;
        }
        return C33129mqd.gEmmrt(bigDecimal, C33129mqd.EZpvd("0.0001")) ? 8 : 6;
    }

    public static final boolean KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        InterfaceC9731bbC interfaceC9731bbCKWHzl = C27586jxw.OLrzqt.KWHzl(investTokenWithAmount.getChainId(), investTokenWithAmount.getTokenAddress());
        return interfaceC9731bbCKWHzl != null && interfaceC9731bbCKWHzl.getNewProxyInstance();
    }

    public static final int EZpvd(InvestTokenWithAmount investTokenWithAmount) {
        boolean zIsBaseToken = investTokenWithAmount.isBaseToken();
        boolean zKWHzl = KWHzl(investTokenWithAmount);
        if (zIsBaseToken || zKWHzl) {
            return zIsBaseToken ? 1 : 0;
        }
        return 2;
    }

    public final boolean copydefault(InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2) {
        int iEZpvd;
        int iEZpvd2;
        return investTokenWithAmount == null || investTokenWithAmount2 == null || ((iEZpvd = EZpvd(investTokenWithAmount)) != (iEZpvd2 = EZpvd(investTokenWithAmount2)) && iEZpvd2 > iEZpvd);
    }

    public final java.util.List<FromToken> KWHzl(@NotNull java.util.List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InvestTokenWithAmount investTokenWithAmount : list) {
            arrayList.add(new FromToken(investTokenWithAmount.isBaseToken(), investTokenWithAmount.getTokenAddress(), C33129mqd.mulS$default(investTokenWithAmount.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount.getMinInvestAmount().length() == 0 ? "0" : C33129mqd.mulS$default(investTokenWithAmount.getMinInvestAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount.getTokenLogo(), limitFmtNoZeroWithKMBMoreThanMillion$default(OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null), investTokenWithAmount.getTokenSymbol()));
        }
        return arrayList;
    }
}
