package o;

import com.ibm.icu.impl.number.CustomSymbolCurrency;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import com.okinc.localization.util.currency.CurrencyProxy;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38305pTw {

    /* JADX INFO: renamed from: o.pTw$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NumberFormatter.UnitWidth.values().length];
            try {
                iArr[NumberFormatter.UnitWidth.ISO_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NumberFormatter.UnitWidth.NARROW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        return formatFiatSymbol$default(number, str, roundingMode, c38307pTy, displaySign, notation, null, 32, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        return formatFiatSymbolWithSubscriptStyle$default(number, str, roundingMode, c38307pTy, null, null, 24, null);
    }

    public static /* synthetic */ java.lang.String formatFiatCode$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return OLrzqt(number, C38306pTx.AEQbTJ.OLrzqt(str), NumberFormatter.UnitWidth.ISO_CODE, roundingMode, c38307pTy, displaySign, notation, locale);
    }

    public static /* synthetic */ java.lang.String formatFiatSymbol$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Function1<java.lang.String, java.lang.String> currencySymbolCallback = CurrencyProxy.INSTANCE.getCurrencySymbolCallback();
        java.lang.String strInvoke = currencySymbolCallback != null ? currencySymbolCallback.invoke(str) : null;
        if (strInvoke != null) {
            return KWHzl(number, strInvoke, roundingMode, c38307pTy, displaySign, notation, locale);
        }
        return OLrzqt(number, C38306pTx.AEQbTJ.OLrzqt(str), NumberFormatter.UnitWidth.NARROW, roundingMode, c38307pTy, displaySign, notation, locale);
    }

    public static /* synthetic */ java.lang.String formatCryptoCode$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return copydefault(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return OLrzqt(number, new CustomSymbolCurrency(str, str, str), NumberFormatter.UnitWidth.ISO_CODE, roundingMode, c38307pTy, displaySign, notation, locale);
    }

    public static /* synthetic */ java.lang.String formatCryptoSymbol$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            notation = Notation.DEFAULT;
        }
        Notation notation2 = notation;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(number, str, roundingMode2, c38307pTy2, displaySign2, notation2, locale);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull Notation notation, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return OLrzqt(number, new CustomSymbolCurrency(str, str, str), NumberFormatter.UnitWidth.NARROW, roundingMode, c38307pTy, displaySign, notation, locale);
    }

    public static final java.lang.String OLrzqt(java.lang.Number number, Currency currency, NumberFormatter.UnitWidth unitWidth, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, Notation notation, java.util.Locale locale) {
        java.lang.String string;
        try {
            C7232afu c7232afuOLrzqt = NumberFormatter.EZpvd(locale).OLrzqt(notation.toICUNotation$OKBase_okbase()).EZpvd(NumberFormatter.GroupingStrategy.AUTO).KWHzl(c38307pTy.EZpvd()).KWHzl(displaySign.toSignDisplay()).OLrzqt(roundingMode);
            if (ULocale.forLocale(locale).isRightToLeft()) {
                string = c7232afuOLrzqt.EZpvd(number).toString() + " \u200f" + C59449zhJ.replace$default(C59449zhJ.replace$default(OLrzqt(currency, unitWidth, locale), "\u200e", "", false, 4, (java.lang.Object) null), "\u200f", "", false, 4, (java.lang.Object) null) + (char) 8206;
            } else if (unitWidth == NumberFormatter.UnitWidth.ISO_CODE) {
                string = c7232afuOLrzqt.EZpvd(number).toString() + (char) 160 + currency.getCurrencyCode();
            } else {
                string = c7232afuOLrzqt.KWHzl(currency).copydefault(unitWidth).EZpvd(number).toString();
                Intrinsics.copydefault((java.lang.Object) string);
            }
            return pTF.KWHzl.copydefault(string);
        } catch (java.lang.LinkageError e) {
            pUU.OLrzqt("CurrencyFormat", "currencyFormat, LinkageError", e);
            return number.toString();
        }
    }

    public static /* synthetic */ java.lang.String formatFiatCodeWithSubscriptStyle$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return KWHzl(number, str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C38308pTz.toSubscript$default(formatFiatCode$default(number, str, roundingMode, c38307pTy, displaySign, null, locale, 16, null), 0, locale, 2, null);
    }

    public static /* synthetic */ java.lang.String formatFiatSymbolWithSubscriptStyle$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return EZpvd(number, str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C38308pTz.toSubscript$default(formatFiatSymbol$default(number, str, roundingMode, c38307pTy, displaySign, null, locale, 16, null), 0, locale, 2, null);
    }

    public static /* synthetic */ java.lang.String formatCryptoCodeWithSubscriptStyle$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return AEQbTJ(number, str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C38308pTz.toSubscript$default(formatCryptoCode$default(number, str, roundingMode, c38307pTy, displaySign, null, locale, 16, null), 0, locale, 2, null);
    }

    public static /* synthetic */ java.lang.String formatCryptoSymbolWithSubscriptStyle$default(java.lang.Number number, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        C38307pTy c38307pTy2 = c38307pTy;
        if ((i & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        DisplaySign displaySign2 = displaySign;
        if ((i & 16) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return OLrzqt(number, str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return C38308pTz.toSubscript$default(formatCryptoSymbol$default(number, str, roundingMode, c38307pTy, displaySign, null, locale, 16, null), 0, locale, 2, null);
    }

    public static final java.lang.String OLrzqt(Currency currency, NumberFormatter.UnitWidth unitWidth, java.util.Locale locale) {
        int i = Application.OLrzqt[unitWidth.ordinal()];
        if (i == 1) {
            java.lang.String currencyCode = currency.getCurrencyCode();
            Intrinsics.copydefault((java.lang.Object) currencyCode);
            return currencyCode;
        }
        if (i == 2) {
            java.lang.String name = currency.getName(locale, 3, (boolean[]) null);
            Intrinsics.copydefault((java.lang.Object) name);
            return name;
        }
        throw new java.lang.IllegalArgumentException("Unsupported unit width: " + unitWidth);
    }
}
