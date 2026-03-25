package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54862xYb {
    public static final RoundingMode EZpvd = RoundingMode.DOWN;

    /* JADX INFO: renamed from: o.xYb$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RoundingMode.values().length];
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RoundingMode.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[CurrencyDisplayStyle.values().length];
            try {
                iArr2[CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[DisplaySign.values().length];
            try {
                iArr3[DisplaySign.AUTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[DisplaySign.ALWAYS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[DisplaySign.EXCEPT_ZERO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr3;
        }
    }

    public static final BigDecimal KWHzl(java.lang.Object obj, java.lang.Object obj2) {
        BigDecimal bigDecimalAdd = C33129mqd.copydefault(obj).add(C33129mqd.copydefault(obj2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        return bigDecimalAdd;
    }

    public static final BigDecimal AEQbTJ(java.lang.Object obj, java.lang.Object obj2) {
        BigDecimal bigDecimalSubtract = C33129mqd.copydefault(obj).subtract(C33129mqd.copydefault(obj2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
        return bigDecimalSubtract;
    }

    public static final BigDecimal OLrzqt(java.lang.Object obj, java.lang.Object obj2) {
        BigDecimal bigDecimalMultiply = C33129mqd.copydefault(obj).multiply(C33129mqd.copydefault(obj2));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
        return bigDecimalMultiply;
    }

    public static /* synthetic */ BigDecimal divB$default(java.lang.Object obj, java.lang.Object obj2, int i, RoundingMode roundingMode, int i2, java.lang.Object obj3) {
        if ((i2 & 2) != 0) {
            i = 24;
        }
        if ((i2 & 4) != 0) {
            roundingMode = EZpvd;
        }
        return KWHzl(obj, obj2, i, roundingMode);
    }

    public static final BigDecimal KWHzl(java.lang.Object obj, java.lang.Object obj2, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (obj2 == null || obj == null || C33129mqd.copydefault(obj2).compareTo(BigDecimal.ZERO) == 0) {
            return new BigDecimal("0");
        }
        BigDecimal bigDecimalDivide = C33129mqd.copydefault(obj).divide(C33129mqd.copydefault(obj2), i, roundingMode);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "");
        return bigDecimalDivide;
    }

    public static final BigDecimal copydefault(int i) {
        return divB$default(1, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(i)))), 0, null, 6, null);
    }

    public static /* synthetic */ java.lang.String convertToString$default(BigDecimal bigDecimal, boolean z, java.lang.Integer num, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            roundingMode = EZpvd;
        }
        return KWHzl(bigDecimal, z, num, roundingMode);
    }

    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, boolean z, java.lang.Integer num, @NotNull RoundingMode roundingMode) {
        java.lang.String plainString;
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (num != null) {
            bigDecimal = bigDecimal.setScale(num.intValue(), roundingMode);
        }
        if (z) {
            plainString = bigDecimal.toPlainString();
        } else if (C33129mqd.OLrzqt(bigDecimal, "0")) {
            plainString = "0";
        } else {
            plainString = bigDecimal.stripTrailingZeros().toPlainString();
        }
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public static /* synthetic */ java.lang.String formatToString$default(BigDecimal bigDecimal, boolean z, java.lang.Integer num, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            roundingMode = EZpvd;
        }
        return OLrzqt(bigDecimal, z, num, roundingMode);
    }

    public static final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, boolean z, java.lang.Integer num, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return KWHzl(bigDecimal, roundingMode, z, java.lang.Integer.valueOf(num != null ? num.intValue() : 24));
    }

    public static /* synthetic */ java.lang.String convertToBigIntegerString$default(java.lang.String str, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            roundingMode = EZpvd;
        }
        return KWHzl(str, z, roundingMode);
    }

    public static final java.lang.String KWHzl(java.lang.String str, boolean z, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str == null || str.length() == 0) {
            return z ? "0" : "";
        }
        return KWHzl(pTB.OLrzqt((java.lang.Object) str), false, (java.lang.Integer) 0, roundingMode);
    }

    public static /* synthetic */ java.lang.String convertToBigIntegerString$default(BigDecimal bigDecimal, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            roundingMode = EZpvd;
        }
        return OLrzqt(bigDecimal, z, roundingMode);
    }

    public static final java.lang.String OLrzqt(BigDecimal bigDecimal, boolean z, @NotNull RoundingMode roundingMode) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return (bigDecimal == null || (strKWHzl = KWHzl(bigDecimal, false, (java.lang.Integer) 0, roundingMode)) == null) ? z ? "0" : "" : strKWHzl;
    }

    public static /* synthetic */ java.lang.String convertToBigDecimalString$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return KWHzl(str, z);
    }

    public static final java.lang.String KWHzl(java.lang.String str, boolean z) {
        if (str == null || str.length() == 0) {
            return z ? "0.0" : "";
        }
        return convertToString$default(pTB.OLrzqt((java.lang.Object) str), false, null, null, 7, null);
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || str.length() == 0) ? "" : KWHzl(pTB.OLrzqt((java.lang.Object) str), EZpvd, false, (java.lang.Integer) 0);
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        return (str == null || str.length() == 0) ? "" : formatToString$default(pTB.OLrzqt((java.lang.Object) str), false, null, null, 7, null);
    }

    public static final BigDecimal KWHzl(@NotNull BigDecimal bigDecimal, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        BigDecimal scale = bigDecimal.setScale(0, RoundingMode.DOWN);
        BigDecimal bigDecimalAdd = scale.add(bigDecimal.subtract(scale).round(new MathContext(i, roundingMode)));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "");
        return bigDecimalAdd;
    }

    public static /* synthetic */ java.lang.String formatAmtWithSign$default(BigDecimal bigDecimal, C38307pTy c38307pTy, java.lang.String str, boolean z, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return KWHzl(bigDecimal, c38307pTy, str, z, displaySign);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xYc.formatFiatSymbolSafe$default(java.lang.Number, java.lang.String, java.math.RoundingMode, o.pTy, com.okinc.localization.util.format.DisplaySign, com.okinc.localization.util.currency.Notation, java.util.Locale, int, java.lang.Object):java.lang.String */
    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, @NotNull C38307pTy c38307pTy, @NotNull java.lang.String str, boolean z, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        if (z) {
            return C54863xYc.formatFiatSymbolSafe$default(bigDecimal, str, RoundingMode.DOWN, c38307pTy, displaySign, null, null, 48, null);
        }
        return C54863xYc.formatCryptoSymbolSafe$default(bigDecimal, str, RoundingMode.DOWN, c38307pTy, displaySign, null, null, 48, null);
    }

    public static /* synthetic */ java.lang.String formatAmtWithSymbol$default(BigDecimal bigDecimal, C38307pTy c38307pTy, java.lang.String str, boolean z, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return copydefault(bigDecimal, c38307pTy, str, z, displaySign);
    }

    public static final java.lang.String copydefault(@NotNull BigDecimal bigDecimal, @NotNull C38307pTy c38307pTy, @NotNull java.lang.String str, boolean z, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        if (z) {
            return C54863xYc.formatFiatCodeSafe$default(bigDecimal, str, RoundingMode.DOWN, c38307pTy, displaySign, null, null, 48, null);
        }
        return C54863xYc.formatCryptoCodeSafe$default(bigDecimal, str, RoundingMode.DOWN, c38307pTy, displaySign, null, null, 48, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTB.formatRoundToFixed$default(java.math.BigDecimal, int, java.util.Locale, int, java.lang.Object):java.lang.String */
    public static final java.lang.String KWHzl(@NotNull BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        int iIntValue = num != null ? num.intValue() : bigDecimal.scale();
        int i = StateListAnimator.EZpvd[roundingMode.ordinal()];
        if (i == 1) {
            if (z) {
                return pTB.formatDownToFixed$default(bigDecimal, iIntValue, null, 2, null);
            }
            return pTB.formatDownToMax$default(bigDecimal, iIntValue, null, 2, null);
        }
        if (i != 2) {
            if (z) {
                return pTB.formatRoundToFixed$default(bigDecimal, iIntValue, null, 2, null);
            }
            return pTB.formatRoundToMax$default(bigDecimal, iIntValue, null, 2, null);
        }
        if (z) {
            return pTB.formatUpToFixed$default(bigDecimal, iIntValue, null, 2, null);
        }
        return pTB.formatUpToMax$default(bigDecimal, iIntValue, null, 2, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull CurrencyPrependSign currencyPrependSign, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CurrencyDisplayStyle currencyDisplayStyle) {
        Intrinsics.checkNotNullParameter(currencyPrependSign, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(currencyDisplayStyle, "");
        java.lang.String value = currencyPrependSign.getValue();
        int i = StateListAnimator.OLrzqt[currencyDisplayStyle.ordinal()];
        if (i == 1) {
            return value + str + " " + str2;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return value + str;
        }
        if (C59449zhJ.startsWith$default(str, "<", false, 2, null)) {
            return value + "<" + str2 + StringsKt__StringsKt.KWHzl(str, (java.lang.CharSequence) "<");
        }
        return value + str2 + str;
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        java.lang.String stringPrependSign$default = getStringPrependSign$default(str, false, 1, null);
        int i = StateListAnimator.KWHzl[displaySign.ordinal()];
        if (i == 1) {
            return C33129mqd.valueOf(str, 0) ? EZpvd(str, true) : "";
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (C33129mqd.OLrzqt(str, "0")) {
                return "";
            }
        }
        return stringPrependSign$default;
    }

    public static /* synthetic */ java.lang.String getStringPrependSign$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return EZpvd(str, z);
    }

    public static final java.lang.String EZpvd(java.lang.String str, boolean z) {
        if (C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            return "-";
        }
        return ((C59449zhJ.startsWith$default(str, Marker.ANY_NON_NULL_MARKER, false, 2, null) || C33129mqd.AEQbTJ(str, 0)) && !z) ? Marker.ANY_NON_NULL_MARKER : "";
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() <= -1) {
            numValueOf = null;
        }
        return KWHzl(bigDecimalEZpvd, true, java.lang.Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0), RoundingMode.DOWN);
    }

    public static final java.lang.String KWHzl(int i, double d) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Double.valueOf(d));
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() <= -1) {
            numValueOf = null;
        }
        return KWHzl(bigDecimalEZpvd, true, java.lang.Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0), RoundingMode.HALF_UP);
    }

    public static final java.lang.String KWHzl(double d, int i) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Double.valueOf(d));
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() <= -1) {
            numValueOf = null;
        }
        return KWHzl(bigDecimalEZpvd, roundingMode, true, java.lang.Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0));
    }

    public static final boolean KWHzl(@NotNull BigDecimal bigDecimal, @NotNull BigDecimal bigDecimal2, @NotNull BigDecimal bigDecimal3) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        return bigDecimal.compareTo(bigDecimal2) >= 0 && bigDecimal.compareTo(bigDecimal3) < 0;
    }
}
