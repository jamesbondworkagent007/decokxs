package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.dex.util.format.OKTDexLevelManager;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xHO {
    public static final xHO KWHzl = new xHO();

    private xHO() {
    }

    public static /* synthetic */ java.lang.String formatTokenCode$default(xHO xho, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, java.lang.String str2, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return xho.EZpvd(str, z3, roundingMode2, z4, str3, displaySign);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef A[LOOP:1: B:35:0x00ef->B:39:0x00fc, LOOP_START, PHI: r3
  0x00ef: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:34:0x00ed, B:39:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str2, @NotNull DisplaySign displaySign) {
        java.lang.String string;
        java.lang.CharSequence charSequenceSubSequence;
        int length;
        java.lang.CharSequence charSequenceSubSequence2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        if (str.length() == 0 && z2) {
            return "--";
        }
        if (xHM.KWHzl(xHN.EZpvd(str), 0)) {
            return "0";
        }
        if (z && xHM.EZpvd(xHN.EZpvd(str), 1000000000000000L)) {
            return ">999T" + str2;
        }
        if (!xHM.EZpvd(xHN.EZpvd(str), "1")) {
            string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C38305pTw.formatCryptoCodeWithSubscriptStyle$default(C33129mqd.EZpvd(str), "", roundingMode, C38307pTy.Companion.copydefault(5, 5), displaySign, null, 16, null)).toString();
        } else if (z) {
            string = pTB.formatICUCompact$default(C33129mqd.EZpvd(str), roundingMode, C38307pTy.Companion.KWHzl(0, 2), displaySign, null, 8, null);
        } else {
            string = pTB.formatICUNumber$default(C33129mqd.EZpvd(str), roundingMode, C38307pTy.Companion.KWHzl(0, 2), displaySign, null, 8, null);
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        charSequenceSubSequence = string.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    length2 = i;
                }
                charSequenceSubSequence = "";
                java.lang.String string2 = charSequenceSubSequence.toString();
                length = string2.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        if (string2.charAt(length) != '.') {
                            charSequenceSubSequence2 = string2.subSequence(0, length + 1);
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                string = charSequenceSubSequence2.toString();
            } else {
                charSequenceSubSequence = "";
                java.lang.String string22 = charSequenceSubSequence.toString();
                length = string22.length() - 1;
                if (length >= 0) {
                }
                string = charSequenceSubSequence2.toString();
            }
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null)) {
            return string;
        }
        return string + str2;
    }

    public static /* synthetic */ java.lang.String getShowData$default(xHO xho, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return xho.OLrzqt(str, z4, roundingMode2, z2, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Triple<java.lang.String, java.lang.String, OKTDexLevelManager.BigLevel> tripleCopydefault = OKTDexLevelManager.EZpvd.copydefault(str, OrderDetailListItem.SLIP_OUT, z2);
        if (!z3) {
            return copydefault(tripleCopydefault, z, roundingMode);
        }
        return AEQbTJ(tripleCopydefault, z, roundingMode);
    }

    public static /* synthetic */ java.lang.String getShowDataWithSymbol$default(xHO xho, java.lang.String str, java.lang.String str2, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return xho.copydefault(str, str2, z4, roundingMode, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strCopydefault = copydefault(OKTDexLevelManager.EZpvd.copydefault(str, OrderDetailListItem.SLIP_OUT, z2), z, roundingMode);
        if (z3) {
            str2 = str2.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            sb = new java.lang.StringBuilder();
        } else {
            sb = new java.lang.StringBuilder();
        }
        sb.append(strCopydefault);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String getSwapFormatAmount$default(xHO xho, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "12";
        }
        return xho.AEQbTJ(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (xHM.OLrzqt(str2, "12")) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null);
        }
        if (xHM.OLrzqt(str, "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna("12")), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null);
    }

    public static /* synthetic */ java.lang.String getSwapFormatAmountWithSymbol$default(xHO xho, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "12";
        }
        return xho.copydefault(str, str2, str3);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (xHM.OLrzqt(str3, "12")) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str3)), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null) + " " + str2;
        }
        if (xHM.OLrzqt(xHN.EZpvd(str), "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + " " + str2;
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna("12")), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null) + " " + str2;
    }

    public final java.lang.String copydefault(Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        xHM.copydefault(triple.getFirst());
        java.lang.String strEZpvd = xHN.EZpvd(triple.getFirst());
        if (strEZpvd.length() == 0) {
            return "";
        }
        if (xHM.KWHzl(strEZpvd, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (xHM.OLrzqt(strEZpvd, "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int iEZpvd = xHM.EZpvd(strEZpvd, "0.000001") ? 6 : EZpvd(strEZpvd);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = xHM.gEmmrt(triple.getSecond(), java.lang.Integer.valueOf(iEZpvd));
        } else {
            objValueOf = java.lang.Integer.valueOf(iEZpvd);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(objValueOf)), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public final int EZpvd(java.lang.String str) {
        try {
            int i = 0;
            char[] charArray = ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null).get(1)).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "");
            int length = charArray.length;
            int i2 = 0;
            while (i < length) {
                if (java.lang.Character.getNumericValue(charArray[i]) != 0) {
                    return i2 + 2;
                }
                i++;
                i2++;
            }
            return 6;
        } catch (java.lang.Exception unused) {
            return 6;
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strCopydefault = copydefault(OKTDexLevelManager.EZpvd.copydefault(str, str3, z2), z, str4, roundingMode);
        java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return strCopydefault + " " + upperCase;
    }

    public static /* synthetic */ java.lang.String getShowData$default(xHO xho, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return xho.EZpvd(str, z3, roundingMode2, z2, (i & 16) != 0 ? OrderDetailListItem.SLIP_OUT : str2, (i & 32) != 0 ? OrderDetailListItem.SLIP_OUT : str3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return copydefault(OKTDexLevelManager.EZpvd.copydefault(str, str2, z2), z, str3, roundingMode);
    }

    public final java.lang.String copydefault(Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, java.lang.String str, RoundingMode roundingMode) {
        if (triple.getFirst().length() == 0) {
            return "";
        }
        if (xHM.AEQbTJ(triple.getFirst(), "0") & xHM.OLrzqt(triple.getFirst(), "0.000001")) {
            return "<" + pTB.formatLocalized$default("0.000001", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(xHM.gEmmrt(triple.getSecond(), str))), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String getCoinShowData$default(xHO xho, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = OrderDetailListItem.SLIP_OUT;
        }
        return xho.copydefault(str, str2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return copydefault(OKTDexLevelManager.EZpvd.AEQbTJ(str, str2), false, str2, RoundingMode.DOWN);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyWithPrecision$default(xHO xho, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xho.copydefault(str, roundingMode);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.01d))) {
            return xHR.getFormattedLocalCurrencyInICU$default(xHR.EZpvd, str, roundingMode, C38307pTy.Companion.KWHzl(0, 2), false, 8, null);
        }
        return xHR.getShowDataWithPrefix$default(xHR.EZpvd, str, false, false, RoundingMode.DOWN, false, 6, null);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyWithPrecisionOrFailureSting$default(xHO xho, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xho.OLrzqt(str, roundingMode);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str.length() == 0) {
            return "--";
        }
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.01d))) {
            return xHR.getFormattedLocalCurrencyInICU$default(xHR.EZpvd, str, roundingMode, C38307pTy.Companion.KWHzl(0, 2), false, 8, null);
        }
        return xHR.getShowDataWithPrefix$default(xHR.EZpvd, str, false, false, RoundingMode.DOWN, true, 6, null);
    }

    public final java.lang.String AEQbTJ(Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        xHM.copydefault(triple.getFirst());
        java.lang.String strEZpvd = xHN.EZpvd(triple.getFirst());
        if (strEZpvd.length() == 0) {
            return "";
        }
        if (xHM.KWHzl(strEZpvd, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (xHM.OLrzqt(strEZpvd, java.lang.Double.valueOf(1.0E-12d))) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int decimalDigits$default = xHM.EZpvd(strEZpvd, java.lang.Double.valueOf(1.0E-6d)) & xHM.OLrzqt(strEZpvd, "1") ? 6 : xHN.getDecimalDigits$default(strEZpvd, false, 1, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = xHM.gEmmrt(triple.getSecond(), java.lang.Integer.valueOf(decimalDigits$default));
        } else {
            objValueOf = java.lang.Integer.valueOf(decimalDigits$default);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(objValueOf)), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }
}
