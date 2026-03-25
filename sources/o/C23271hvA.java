package o;

import android.icu.text.NumberFormat;
import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.business.dexlogic.utils.amountformat.DataLevelManager;
import com.okinc.business.dexlogic.utils.amountformat.PrecisionTypes;
import com.okinc.localization.util.format.DisplaySign;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.hvA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23271hvA {
    public static final C23271hvA copydefault = new C23271hvA();

    /* JADX INFO: renamed from: o.hvA$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PrecisionTypes.values().length];
            try {
                iArr[PrecisionTypes.LIQUIDITY_SIGN_NUMBERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PrecisionTypes.MARKET_HISTORY_SIGN_NUMBERS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C23271hvA() {
    }

    public static /* synthetic */ java.lang.String formatTokenCode$default(C23271hvA c23271hvA, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, java.lang.String str2, DisplaySign displaySign, int i, java.lang.Object obj) {
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
        return c23271hvA.AEQbTJ(str, z3, roundingMode2, z4, str3, displaySign);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110 A[LOOP:1: B:42:0x0110->B:46:0x011d, LOOP_START, PHI: r3
  0x0110: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:41:0x010e, B:46:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str2, @NotNull DisplaySign displaySign) {
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
        if (C23313hvq.copydefault(C23311hvo.copydefault(str), 0)) {
            if (str2.length() <= 0) {
                return "0";
            }
            return "0 " + str2;
        }
        if (z && C23313hvq.EZpvd(C23311hvo.copydefault(str), 1000000000000000L)) {
            if (str2.length() <= 0) {
                return ">999T";
            }
            return ">999T " + str2;
        }
        if (!C23313hvq.EZpvd(C23311hvo.copydefault(str), "1")) {
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
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) str2, false, 2, (java.lang.Object) null) || str2.length() <= 0) {
            return string;
        }
        return string + " " + str2;
    }

    public static /* synthetic */ java.lang.String getShowData$default(C23271hvA c23271hvA, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c23271hvA.KWHzl(str, z4, roundingMode2, z2, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Triple<java.lang.String, java.lang.String, DataLevelManager.BigLevel> tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(str, OrderDetailListItem.SLIP_OUT, z2);
        if (!z3) {
            return KWHzl(tripleOLrzqt, z, roundingMode);
        }
        return copydefault(tripleOLrzqt, z, roundingMode);
    }

    public static /* synthetic */ java.lang.String getShowDataWithSymbol$default(C23271hvA c23271hvA, java.lang.String str, java.lang.String str2, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return c23271hvA.EZpvd(str, str2, z4, roundingMode, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strKWHzl = KWHzl(DataLevelManager.EZpvd.OLrzqt(str, OrderDetailListItem.SLIP_OUT, z2), z, roundingMode);
        if (z3) {
            str2 = str2.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str2, "");
            sb = new java.lang.StringBuilder();
        } else {
            sb = new java.lang.StringBuilder();
        }
        sb.append(strKWHzl);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String getSwapFormatAmount$default(C23271hvA c23271hvA, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "12";
        }
        return c23271hvA.EZpvd(str, str2);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C23313hvq.KWHzl(str2, "12")) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null);
        }
        if (C23313hvq.KWHzl(str, "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna("12")), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null);
    }

    public static /* synthetic */ java.lang.String getSwapFormatAmountWithSymbol$default(C23271hvA c23271hvA, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "12";
        }
        return c23271hvA.KWHzl(str, str2, str3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C23313hvq.KWHzl(str3, "12")) {
            return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(str3)), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null) + " " + str2;
        }
        if (C23313hvq.KWHzl(C23311hvo.copydefault(str), "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + " " + str2;
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna("12")), java.lang.Boolean.TRUE, RoundingMode.DOWN), null, 1, null) + " " + str2;
    }

    public final java.lang.String KWHzl(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        C23313hvq.OLrzqt(triple.getFirst());
        java.lang.String strCopydefault = C23311hvo.copydefault(triple.getFirst());
        if (strCopydefault.length() == 0) {
            return "";
        }
        if (C23313hvq.copydefault(strCopydefault, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (C23313hvq.KWHzl(strCopydefault, "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int iOLrzqt = C23313hvq.EZpvd(strCopydefault, "0.000001") ? 6 : OLrzqt(strCopydefault);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = C23313hvq.djBIcL(triple.getSecond(), java.lang.Integer.valueOf(iOLrzqt));
        } else {
            objValueOf = java.lang.Integer.valueOf(iOLrzqt);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(objValueOf)), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public final int OLrzqt(java.lang.String str) {
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

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strOLrzqt = OLrzqt(DataLevelManager.EZpvd.OLrzqt(str, str3, z2), z, str4, roundingMode);
        java.lang.String upperCase = str2.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return strOLrzqt + " " + upperCase;
    }

    public static /* synthetic */ java.lang.String getShowData$default(C23271hvA c23271hvA, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
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
        return c23271hvA.copydefault(str, z3, roundingMode2, z2, (i & 16) != 0 ? OrderDetailListItem.SLIP_OUT : str2, (i & 32) != 0 ? OrderDetailListItem.SLIP_OUT : str3);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(DataLevelManager.EZpvd.OLrzqt(str, str2, z2), z, str3, roundingMode);
    }

    public final java.lang.String OLrzqt(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, java.lang.String str, RoundingMode roundingMode) {
        if (triple.getFirst().length() == 0) {
            return "";
        }
        if (C23313hvq.OLrzqt(triple.getFirst(), "0") & C23313hvq.KWHzl(triple.getFirst(), "0.000001")) {
            return "<" + pTB.formatLocalized$default("0.000001", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(C23313hvq.djBIcL(triple.getSecond(), str))), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String getCoinShowData$default(C23271hvA c23271hvA, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = OrderDetailListItem.SLIP_OUT;
        }
        return c23271hvA.copydefault(str, str2);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(DataLevelManager.EZpvd.OLrzqt(str, str2), false, str2, RoundingMode.DOWN);
    }

    public static /* synthetic */ java.lang.String getNumberICUWithPrecision$default(C23271hvA c23271hvA, java.lang.String str, PrecisionTypes precisionTypes, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            precisionTypes = PrecisionTypes.LIQUIDITY_SIGN_NUMBERS;
        }
        return c23271hvA.KWHzl(str, precisionTypes);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull PrecisionTypes precisionTypes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(precisionTypes, "");
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.001d))) {
            return C23319hvw.getNumberICU$default(str, RoundingMode.DOWN, EZpvd(str, precisionTypes), null, null, 12, null);
        }
        return getShowData$default(this, str, false, RoundingMode.DOWN, false, true, 10, null);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyWithPrecision$default(C23271hvA c23271hvA, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c23271hvA.AEQbTJ(str, roundingMode);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hvB.getShowDataWithPrefix$default(o.hvB, java.lang.String, boolean, boolean, java.math.RoundingMode, boolean, int, java.lang.Object):java.lang.String */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.01d))) {
            return C23272hvB.KWHzl.EZpvd(str, roundingMode, C38307pTy.Companion.KWHzl(0, 2));
        }
        return C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, RoundingMode.DOWN, false, 6, null);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyWithPrecisionOrFailureSting$default(C23271hvA c23271hvA, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c23271hvA.EZpvd(str, roundingMode);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str.length() == 0) {
            return "--";
        }
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.01d))) {
            return C23272hvB.KWHzl.EZpvd(str, roundingMode, C38307pTy.Companion.KWHzl(0, 2));
        }
        return C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str, false, false, RoundingMode.DOWN, true, 6, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        java.lang.Double dValueOf = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        return C23313hvq.KWHzl(java.lang.Double.valueOf(dAEQbTJ), dValueOf) ? "-" : C23313hvq.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), dValueOf) ? Marker.ANY_NON_NULL_MARKER : "";
    }

    public static /* synthetic */ C38307pTy getPrecision$default(C23271hvA c23271hvA, java.lang.String str, PrecisionTypes precisionTypes, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            precisionTypes = PrecisionTypes.LIQUIDITY_SIGN_NUMBERS;
        }
        return c23271hvA.EZpvd(str, precisionTypes);
    }

    public final C38307pTy EZpvd(java.lang.String str, PrecisionTypes precisionTypes) {
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), (java.lang.Object) 1000)) {
            return C38307pTy.Companion.KWHzl(0, 2);
        }
        if (!C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.001d))) {
            return C38307pTy.Companion.KWHzl(0, 6);
        }
        int i = TaskDescription.EZpvd[precisionTypes.ordinal()];
        if (i == 1 || i == 2) {
            return C38307pTy.Companion.KWHzl(0, 6);
        }
        return C38307pTy.Companion.KWHzl(0, 2);
    }

    public final java.lang.String copydefault(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        C23313hvq.OLrzqt(triple.getFirst());
        java.lang.String strCopydefault = C23311hvo.copydefault(triple.getFirst());
        if (strCopydefault.length() == 0) {
            return "";
        }
        if (C23313hvq.copydefault(strCopydefault, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (C23313hvq.KWHzl(strCopydefault, java.lang.Double.valueOf(1.0E-12d))) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int decimalDigits$default = C23313hvq.EZpvd(strCopydefault, java.lang.Double.valueOf(1.0E-6d)) & C23313hvq.KWHzl(strCopydefault, "1") ? 6 : C23319hvw.getDecimalDigits$default(strCopydefault, false, 2, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = C23313hvq.djBIcL(triple.getSecond(), java.lang.Integer.valueOf(decimalDigits$default));
        } else {
            objValueOf = java.lang.Integer.valueOf(decimalDigits$default);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(objValueOf)), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String dexFormatPercentage$default(C23271hvA c23271hvA, java.lang.String str, int i, RoundingMode roundingMode, java.util.Locale locale, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i2 & 8) != 0) {
            locale = java.util.Locale.getDefault();
        }
        java.util.Locale locale2 = locale;
        if ((i2 & 16) != 0) {
            z = true;
        }
        return c23271hvA.AEQbTJ(str, i3, roundingMode2, locale2, z);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode, @NotNull java.util.Locale locale, boolean z) {
        BigDecimal bigDecimal;
        java.lang.String iCUCompact$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(locale, "");
        try {
            bigDecimal = new BigDecimal(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59449zhJ.replace$default(str, "%", "", false, 4, (java.lang.Object) null)).toString());
        } catch (java.lang.NumberFormatException e) {
            java.lang.String name = copydefault.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            C43296rmc.KWHzl(name, e.toString());
            bigDecimal = new BigDecimal(0);
        }
        BigDecimal scale = bigDecimal.setScale(i, roundingMode);
        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        numberInstance.setMinimumFractionDigits(i);
        numberInstance.setMaximumFractionDigits(i);
        numberInstance.setGroupingUsed(true);
        if (C23313hvq.EZpvd(bigDecimal, "1000")) {
            iCUCompact$default = pTB.formatICUCompact$default(bigDecimal, roundingMode, C38307pTy.Companion.KWHzl(0, i), null, null, 12, null);
        } else {
            iCUCompact$default = numberInstance.format(scale);
        }
        java.lang.String str2 = z ? Marker.ANY_NON_NULL_MARKER : "";
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            return str2 + iCUCompact$default + "%";
        }
        if (bigDecimal.compareTo(bigDecimal2) >= 0) {
            return "0%";
        }
        return iCUCompact$default + "%";
    }
}
