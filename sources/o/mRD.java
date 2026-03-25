package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.dexkline.dexlogic.utils.amountformat.DataLevelManager;
import com.okinc.dexkline.dexlogic.utils.amountformat.PrecisionTypes;
import com.okinc.localization.util.format.DisplaySign;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mRD {
    public static final mRD OLrzqt = new mRD();

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    private mRD() {
    }

    public static /* synthetic */ java.lang.String formatTokenCode$default(mRD mrd, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, java.lang.String str2, DisplaySign displaySign, int i, java.lang.Object obj) {
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
        return mrd.EZpvd(str, z3, roundingMode2, z4, str3, displaySign);
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
        if (mRE.copydefault(C32163mRv.EZpvd(str), 0)) {
            return "0";
        }
        if (z && mRE.KWHzl(C32163mRv.EZpvd(str), 1000000000000000L)) {
            return ">999T" + str2;
        }
        if (!mRE.KWHzl(C32163mRv.EZpvd(str), "1")) {
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

    public static /* synthetic */ java.lang.String getShowData$default(mRD mrd, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        if ((i & 4) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 8) != 0) {
            z2 = true;
        }
        return mrd.KWHzl(str, z4, roundingMode2, z2, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Triple<java.lang.String, java.lang.String, DataLevelManager.BigLevel> tripleOLrzqt = DataLevelManager.copydefault.OLrzqt(str, OrderDetailListItem.SLIP_OUT, z2);
        if (!z3) {
            return KWHzl(tripleOLrzqt, z, roundingMode);
        }
        return copydefault(tripleOLrzqt, z, roundingMode);
    }

    public static /* synthetic */ java.lang.String getShowDataWithSymbol$default(mRD mrd, java.lang.String str, java.lang.String str2, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return mrd.copydefault(str, str2, z4, roundingMode, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3) {
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strKWHzl = KWHzl(DataLevelManager.copydefault.OLrzqt(str, OrderDetailListItem.SLIP_OUT, z2), z, roundingMode);
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

    public final java.lang.String KWHzl(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        mRE.AEQbTJ((java.lang.Object) triple.getFirst());
        java.lang.String strEZpvd = C32163mRv.EZpvd(triple.getFirst());
        if (strEZpvd.length() == 0) {
            return "";
        }
        if (mRE.copydefault(strEZpvd, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (mRE.EZpvd(strEZpvd, "0.000000000001")) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int iOLrzqt = mRE.KWHzl(strEZpvd, "0.000001") ? 6 : OLrzqt(strEZpvd);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = mRE.djBIcL(triple.getSecond(), java.lang.Integer.valueOf(iOLrzqt));
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

    public static /* synthetic */ java.lang.String getNumberICUWithPrecision$default(mRD mrd, java.lang.String str, PrecisionTypes precisionTypes, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            precisionTypes = PrecisionTypes.LIQUIDITY_SIGN_NUMBERS;
        }
        return mrd.AEQbTJ(str, precisionTypes);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull PrecisionTypes precisionTypes) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(precisionTypes, "");
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.001d))) {
            return mRA.getNumberICU$default(str, RoundingMode.DOWN, EZpvd(str, precisionTypes), null, null, 12, null);
        }
        return getShowData$default(this, str, false, RoundingMode.DOWN, false, true, 10, null);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyWithPrecision$default(mRD mrd, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return mrd.KWHzl(str, roundingMode);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.01d))) {
            return mRJ.AEQbTJ.KWHzl(str, roundingMode, C38307pTy.Companion.KWHzl(0, 2));
        }
        return mRJ.getShowDataWithPrefix$default(mRJ.AEQbTJ, str, false, false, RoundingMode.DOWN, false, 6, null);
    }

    public static /* synthetic */ C38307pTy getPrecision$default(mRD mrd, java.lang.String str, PrecisionTypes precisionTypes, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            precisionTypes = PrecisionTypes.LIQUIDITY_SIGN_NUMBERS;
        }
        return mrd.EZpvd(str, precisionTypes);
    }

    public final C38307pTy EZpvd(java.lang.String str, PrecisionTypes precisionTypes) {
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), (java.lang.Object) 1000)) {
            return C38307pTy.Companion.KWHzl(0, 2);
        }
        if (!C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(0.001d))) {
            return C38307pTy.Companion.KWHzl(0, 6);
        }
        int i = StateListAnimator.KWHzl[precisionTypes.ordinal()];
        if (i == 1 || i == 2) {
            return C38307pTy.Companion.KWHzl(0, 6);
        }
        return C38307pTy.Companion.KWHzl(0, 2);
    }

    public final java.lang.String copydefault(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode) {
        java.lang.Object objValueOf;
        mRE.AEQbTJ((java.lang.Object) triple.getFirst());
        java.lang.String strEZpvd = C32163mRv.EZpvd(triple.getFirst());
        if (strEZpvd.length() == 0) {
            return "";
        }
        if (mRE.copydefault(strEZpvd, "0")) {
            return pTB.formatLocalized$default("0", null, 1, null) + triple.getThird().getUnit();
        }
        if (mRE.EZpvd(strEZpvd, java.lang.Double.valueOf(1.0E-12d))) {
            return "<" + pTB.formatLocalized$default("0.000000000001", null, 1, null) + triple.getThird().getUnit();
        }
        int decimalDigits$default = mRE.KWHzl(strEZpvd, java.lang.Double.valueOf(1.0E-6d)) & mRE.EZpvd(strEZpvd, "1") ? 6 : mRA.getDecimalDigits$default(strEZpvd, false, 2, null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) triple.getThird().getUnit())) {
            objValueOf = mRE.djBIcL(triple.getSecond(), java.lang.Integer.valueOf(decimalDigits$default));
        } else {
            objValueOf = java.lang.Integer.valueOf(decimalDigits$default);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(objValueOf)), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }
}
