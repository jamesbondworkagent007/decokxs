package o;

import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46367tRs {
    public static /* synthetic */ kotlin.Pair formatCommonPNL$default(java.lang.Number number, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return AEQbTJ(number, str, i, z);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.Number number, java.lang.String str, @androidx.annotation.ColorRes int i, boolean z) {
        Intrinsics.checkNotNullParameter(number, "");
        java.lang.String strKWHzl = KWHzl(number, str);
        BigDecimal scale = C33129mqd.EZpvd(number).setScale(2, RoundingMode.DOWN);
        Intrinsics.copydefault(scale);
        return C56390yDp.OLrzqt(strKWHzl, java.lang.Integer.valueOf(C46368tRt.EZpvd(scale, i, z)));
    }

    /* JADX INFO: renamed from: formatCommonPNL-aKjyv6w$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8759formatCommonPNLaKjyv6w$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return copydefault(str, str2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return formatCommonPNL$default(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, i, false, 4, null);
    }

    public static /* synthetic */ java.lang.String formatCommonPNLPlain$default(java.lang.Number number, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return KWHzl(number, str);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.Number number, java.lang.String str) {
        Intrinsics.checkNotNullParameter(number, "");
        return AEQbTJ(pTB.formatICUNumber$default(number, null, C38307pTy.Companion.EZpvd(2), DisplaySign.EXCEPT_ZERO, null, 9, null), str);
    }

    /* JADX INFO: renamed from: formatCommonPNLWithPrecision-xEPvtRM$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8761formatCommonPNLWithPrecisionxEPvtRM$default(java.lang.String str, int i, java.lang.String str2, DisplaySign displaySign, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return copydefault(str, i, str2, displaySign);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, int i, java.lang.String str2, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return AEQbTJ(pTF.KWHzl.AEQbTJ(pTB.formatICUNumber$default(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), null, C38307pTy.Companion.EZpvd(i), displaySign, null, 9, null)), str2);
    }

    /* JADX INFO: renamed from: formatCommonPNLPlain-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8760formatCommonPNLPlainHYcmJmU$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        return EZpvd(str, str2);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2);
    }

    public static /* synthetic */ kotlin.Pair formatCommonPrice$default(java.lang.Number number, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return KWHzl(number, str, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.Number number, java.lang.String str, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(number, "");
        java.lang.String commonPricePlain$default = formatCommonPricePlain$default(number, null, 1, null);
        BigDecimal scale = C33129mqd.EZpvd(number).setScale(2, RoundingMode.DOWN);
        java.lang.String strAEQbTJ = AEQbTJ(commonPricePlain$default, str);
        Intrinsics.copydefault(scale);
        return C56390yDp.OLrzqt(strAEQbTJ, java.lang.Integer.valueOf(C46368tRt.getRateColor$default(scale, i, false, 2, null)));
    }

    /* JADX INFO: renamed from: formatCommonPrice-aKjyv6w$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8762formatCommonPriceaKjyv6w$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return OLrzqt(str, str2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, i);
    }

    public static /* synthetic */ java.lang.String formatCommonPricePlain$default(java.lang.Number number, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return copydefault(number, str);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.Number number, java.lang.String str) {
        Intrinsics.checkNotNullParameter(number, "");
        return AEQbTJ(pTF.KWHzl.AEQbTJ(pTB.formatICUNumber$default(number, null, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, null, 9, null)), str);
    }

    /* JADX INFO: renamed from: formatCommonPricePlain-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8763formatCommonPricePlainHYcmJmU$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        return djBIcL(str, str2);
    }

    public static final java.lang.String djBIcL(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2);
    }

    public static /* synthetic */ kotlin.Pair formatCommonFees$default(java.lang.Number number, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return AEQbTJ(number, str, i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tRt.getRateColor$default(java.lang.Number, int, boolean, int, java.lang.Object):int */
    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.Number number, java.lang.String str, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(number, "");
        java.lang.String commonFeesPlain$default = formatCommonFeesPlain$default(number, null, 1, null);
        BigDecimal scale = C33129mqd.EZpvd(number).setScale(4, RoundingMode.DOWN);
        java.lang.String strAEQbTJ = AEQbTJ(commonFeesPlain$default, str);
        Intrinsics.copydefault(scale);
        return C56390yDp.OLrzqt(strAEQbTJ, java.lang.Integer.valueOf(C46368tRt.getRateColor$default(scale, i, false, 2, null)));
    }

    /* JADX INFO: renamed from: formatCommonFees-aKjyv6w$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8757formatCommonFeesaKjyv6w$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str2 = null;
        }
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return AEQbTJ(str, str2, i);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, i);
    }

    public static /* synthetic */ java.lang.String formatCommonFeesPlain$default(java.lang.Number number, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return OLrzqt(number, str);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Number number, java.lang.String str) {
        Intrinsics.checkNotNullParameter(number, "");
        if (C33129mqd.EZpvd(number).setScale(4, RoundingMode.DOWN).compareTo(BigDecimal.ZERO) == 0) {
            return AEQbTJ(pTB.formatICUNumber$default(0, null, C38307pTy.Companion.EZpvd(2), DisplaySign.AUTO, null, 9, null), str);
        }
        return AEQbTJ(pTB.formatICUNumber$default(number, null, C38307pTy.Companion.KWHzl(2, 4), DisplaySign.AUTO, null, 9, null), str);
    }

    /* JADX INFO: renamed from: formatCommonFeesPlain-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8758formatCommonFeesPlainHYcmJmU$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        return KWHzl(str, str2);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2);
    }

    public static /* synthetic */ kotlin.Pair formatRatio$default(java.lang.Number number, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return OLrzqt(number, z);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(@NotNull java.lang.Number number, boolean z) {
        Intrinsics.checkNotNullParameter(number, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.mulD$default(number, 100, null, null, null, 14, null)));
        RoundingMode roundingMode = RoundingMode.DOWN;
        BigDecimal scale = bigDecimalEZpvd.setScale(2, roundingMode);
        Intrinsics.checkNotNullExpressionValue(scale, "");
        int rateColor$default = C46368tRt.getRateColor$default(scale, 0, false, 3, null);
        return C56390yDp.OLrzqt(pTB.formatICUPercent$default(number, roundingMode, C38307pTy.Companion.KWHzl(2, 2), AEQbTJ(z), java.lang.Double.valueOf(100.0d), null, 16, null), java.lang.Integer.valueOf(rateColor$default));
    }

    /* JADX INFO: renamed from: formatRatio-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ kotlin.Pair m8765formatRatioHYcmJmU$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return copydefault(str, z);
    }

    public static final kotlin.Pair<java.lang.String, java.lang.Integer> copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), z);
    }

    /* JADX INFO: renamed from: formatLocalCurrency-aKjyv6w$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8764formatLocalCurrencyaKjyv6w$default(java.lang.String str, DisplaySign displaySign, Notation notation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 2) != 0) {
            notation = Notation.DEFAULT;
        }
        return OLrzqt(str, displaySign, notation);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull DisplaySign displaySign, @NotNull Notation notation) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        return formatLocalCurrency$default(C33129mqd.EZpvd(str), displaySign, notation, null, 4, null);
    }

    public static /* synthetic */ java.lang.String formatLocalCurrency$default(java.lang.Number number, DisplaySign displaySign, Notation notation, C38307pTy c38307pTy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        if ((i & 2) != 0) {
            notation = Notation.DEFAULT;
        }
        if ((i & 4) != 0) {
            c38307pTy = null;
        }
        return EZpvd(number, displaySign, notation, c38307pTy);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.Number number, @NotNull DisplaySign displaySign, @NotNull Notation notation, C38307pTy c38307pTy) {
        xMW xmwKWHzl;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(notation, "");
        InterfaceC54581xNr interfaceC54581xNrEZpvd = C46392tSq.EZpvd.EZpvd();
        if (interfaceC54581xNrEZpvd == null || (xmwKWHzl = interfaceC54581xNrEZpvd.KWHzl()) == null) {
            return "--";
        }
        C54536xML c54536xMLFJNWhG = xmwKWHzl.AYXKKw(C33129mqd.gEmmrt(C33129mqd.EZpvd(number))).fJNWhG();
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(c54536xMLFJNWhG.gEmmrt(), C54536xML.toSafeNoSignString$default(c54536xMLFJNWhG, false, 1, null));
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd((java.lang.String) pairOLrzqt.component2());
        if (c38307pTy == null) {
            c38307pTy = C38307pTy.Companion.EZpvd(C38306pTx.AEQbTJ.AEQbTJ(str));
        }
        return C38305pTw.formatFiatSymbol$default(bigDecimalEZpvd, str, null, c38307pTy, displaySign, notation, null, 34, null);
    }

    public static /* synthetic */ java.lang.String formatPercentTruncateWithSymbol$default(float f, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return AEQbTJ(f, i);
    }

    public static final java.lang.String AEQbTJ(float f, int i) {
        return pTB.formatICUPercent$default(pTB.OLrzqt(java.lang.Float.valueOf(f)), RoundingMode.DOWN, C38307pTy.Companion.KWHzl(2, i), DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 16, null);
    }

    public static /* synthetic */ java.lang.String formatPercentTruncateWithSymbol$default(java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        return AEQbTJ(str, i, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return (z && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : AEQbTJ(C33129mqd.djBIcL(str), i);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return str2 == null ? str : OLrzqt(pTF.KWHzl.AEQbTJ(str), str2);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + " " + str2;
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str2 + str;
    }

    public static final DisplaySign AEQbTJ(boolean z) {
        return z ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO;
    }

    /* JADX INFO: renamed from: pnlDollarFormat-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8766pnlDollarFormatHYcmJmU$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return AEQbTJ(str, z);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z) {
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        java.lang.String precision;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C46392tSq.EZpvd.AhwBna().OLrzqt();
        return C38305pTw.formatFiatSymbol$default(pTB.OLrzqt(PlanetNumericString.OLrzqt(str)), "USD", RoundingMode.DOWN, C38307pTy.Companion.EZpvd((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) == null || (precision = valuationCurrencyDataAEQbTJ.getPrecision()) == null) ? 2 : C33129mqd.AhwBna(precision)), z ? DisplaySign.EXCEPT_ZERO : DisplaySign.AUTO, null, null, 48, null);
    }

    public static /* synthetic */ java.lang.String formatLeverage$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return OLrzqt(str, z);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        if (C33129mqd.valueOf(bigDecimalEZpvd.setScale(2, RoundingMode.DOWN), 0)) {
            return "";
        }
        java.lang.String downToMax$default = pTB.formatDownToMax$default(bigDecimalEZpvd, 2, null, 2, null);
        if (!z) {
            return downToMax$default;
        }
        return downToMax$default + "x";
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = OLrzqt(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)), str2, str3);
        return pairOLrzqt.getSecond().length() == 0 ? tRD.copydefault() : str.length() == 0 ? C56390yDp.OLrzqt("--", pairOLrzqt.getSecond()) : pairOLrzqt;
    }

    public static final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.Number number, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BizInstrument suggestedInstrument$default;
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLCopydefault2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C46392tSq c46392tSq = C46392tSq.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrEZpvd = c46392tSq.EZpvd();
        if (interfaceC54581xNrEZpvd == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrEZpvd, str, str2, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            return C56390yDp.OLrzqt("", "");
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c46392tSq.AhwBna().OLrzqt();
        xMV xmvCreateSizeConverterWithIndex$default = (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) == null) ? null : AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        java.lang.String safeString$default = (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(C33129mqd.gEmmrt(number))) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLCopydefault2 = c54536xMLDjBIcL.copydefault()) == null) ? null : C54536xML.toSafeString$default(c54536xMLCopydefault2, false, 1, null);
        if (safeString$default == null) {
            safeString$default = "";
        }
        java.lang.String strEZpvd = xmvCreateSizeConverterWithIndex$default != null ? xmvCreateSizeConverterWithIndex$default.EZpvd() : null;
        return C56390yDp.OLrzqt(safeString$default, strEZpvd != null ? strEZpvd : "");
    }
}
