package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xMR {
    public static final xMR copydefault = new xMR();

    private xMR() {
    }

    public static /* synthetic */ java.lang.String formatPercent$default(xMR xmr, java.lang.String str, int i, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return xmr.AEQbTJ(str, i, roundingMode);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return pTB.KWHzl(OLrzqt((java.lang.Object) str), i, roundingMode);
    }

    public static /* synthetic */ java.lang.String formatPercent$default(xMR xmr, java.lang.String str, int i, int i2, RoundingMode roundingMode, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return xmr.EZpvd(str, i, i2, roundingMode);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i, int i2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return pTB.formatPercent$default(OLrzqt((java.lang.Object) str), i, i2, roundingMode, null, 8, null);
    }

    public static /* synthetic */ java.lang.String formatPercentWithSymbol$default(xMR xmr, java.lang.String str, int i, int i2, RoundingMode roundingMode, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 2;
        }
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        if ((i3 & 8) != 0) {
            roundingMode = RoundingMode.UP;
        }
        return xmr.copydefault(str, i, i2, roundingMode);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, int i2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return pTB.formatPercentWithSymbol$default(OLrzqt((java.lang.Object) str), i, i2, roundingMode, null, 8, null);
    }

    public static /* synthetic */ java.lang.String formatUpToMax$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.AhwBna(str, i);
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatUpToMax$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatUpToFixed$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.AYXKKw(str, i);
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatUpToFixed$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatDownToMax$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.copydefault(str, i);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatDownToMax$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatDownToFixed$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.OLrzqt(str, i);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatDownToFixed$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatRoundToMax$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.EZpvd(str, i);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatRoundToMax$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public static /* synthetic */ java.lang.String formatFloorToMax$default(xMR xmr, java.lang.String str, int i, java.util.Locale locale, DisplaySign displaySign, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        if ((i2 & 8) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return xmr.EZpvd(str, i, locale, displaySign);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i, @NotNull java.util.Locale locale, @NotNull DisplaySign displaySign) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        return pTB.copydefault(OLrzqt((java.lang.Object) str), RoundingMode.FLOOR, C38307pTy.Companion.AEQbTJ(i), displaySign, locale);
    }

    public static /* synthetic */ java.lang.String formatRoundToFixed$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.AEQbTJ(str, i);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatRoundToFixed$default(OLrzqt((java.lang.Object) str), i, null, 2, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatLocalized$default(str, null, 1, null);
    }

    public static /* synthetic */ java.lang.String formatLocalizedWithMinPrecision$default(xMR xmr, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return xmr.KWHzl(str, i);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTB.formatLocalizedWithMinPrecision$default(str, i, null, 2, null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, int i, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return pTB.toLocalizationStringWithMaxPrecision$default(str, i, roundingMode, null, 4, null);
    }

    public final BigDecimal OLrzqt(java.lang.Object obj) {
        return pTB.OLrzqt(obj);
    }

    public static /* synthetic */ java.lang.String formatHundredfold$default(xMR xmr, java.lang.String str, int i, boolean z, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xmr.copydefault(str, i, z, roundingMode);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, int i, boolean z, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.gEmmrt(str, 100, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), roundingMode);
    }

    public static /* synthetic */ java.lang.String formatHundredQuot$default(xMR xmr, java.lang.String str, int i, boolean z, RoundingMode roundingMode, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xmr.OLrzqt(str, i, z, roundingMode);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, int i, boolean z, RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.OLrzqt(str, 100, java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(z), roundingMode);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33129mqd.valueOf(str, 0) ? C59449zhJ.replace$default(str, "-", "", false, 4, (java.lang.Object) null) : str;
    }

    public static /* synthetic */ java.lang.String formatICUNumber$default(xMR xmr, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
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
        return xmr.EZpvd(str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return pTB.copydefault(C33129mqd.EZpvd(str), roundingMode, c38307pTy, displaySign, locale);
    }

    public static /* synthetic */ java.lang.String formatContractAmount$default(xMR xmr, java.lang.String str, BizInstrument bizInstrument, boolean z, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xmr.KWHzl(str, bizInstrument, z, roundingMode);
    }

    public final java.lang.String KWHzl(java.lang.String str, BizInstrument bizInstrument, boolean z, @NotNull RoundingMode roundingMode) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String lotSize;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strFARcdN = null;
        if ((bizInstrument != null ? bizInstrument.getInstType() : null) == null) {
            strFARcdN = "0";
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) != null) {
                strFARcdN = abstractC54531xLwOLrzqt.fARcdN(bizInstrument.getInstFamily());
            }
        }
        if (bizInstrument == null || (lotSize = bizInstrument.getLotSize()) == null) {
            lotSize = "1";
        }
        if (z) {
            return (C33129mqd.AEQbTJ(str, 0) && C33129mqd.valueOf(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.AEQbTJ(str))), lotSize)) ? lotSize : (C33129mqd.gEmmrt(str, 0) && C33129mqd.valueOf(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.AEQbTJ(str))), lotSize)) ? C33129mqd.gEmmrt(java.lang.Double.valueOf(-C33129mqd.AEQbTJ(lotSize))) : C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(strFARcdN)), java.lang.Boolean.FALSE, roundingMode);
        }
        return C33129mqd.AEQbTJ(str, java.lang.Integer.valueOf(C33129mqd.AhwBna(strFARcdN)), java.lang.Boolean.FALSE, roundingMode);
    }

    public static /* synthetic */ java.lang.String formatICUPercent$default(xMR xmr, BigDecimal bigDecimal, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.lang.Double d, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.UP;
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
            d = null;
        }
        java.lang.Double d2 = d;
        if ((i & 32) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return xmr.OLrzqt(bigDecimal, roundingMode2, c38307pTy2, displaySign2, d2, locale);
    }

    public final java.lang.String OLrzqt(@NotNull BigDecimal bigDecimal, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, java.lang.Double d, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return pTB.OLrzqt(bigDecimal, roundingMode, c38307pTy, displaySign, d, locale);
    }

    public static /* synthetic */ java.lang.String formatICUCompact$default(xMR xmr, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, DisplaySign displaySign, java.util.Locale locale, int i, java.lang.Object obj) {
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
        return xmr.copydefault(str, roundingMode2, c38307pTy2, displaySign2, locale);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, @NotNull DisplaySign displaySign, @NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        Intrinsics.checkNotNullParameter(locale, "");
        return pTB.KWHzl(C33129mqd.EZpvd(str), roundingMode, c38307pTy, displaySign, locale);
    }
}
