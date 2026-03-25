package o;

import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.unify_trade.dex.util.format.OKTDexLevelManager;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes12.dex */
public final class xHR {
    public static final xHR EZpvd = new xHR();

    private xHR() {
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.pTw.formatFiatCodeWithSubscriptStyle$default(java.lang.Number, java.lang.String, java.math.RoundingMode, o.pTy, com.okinc.localization.util.format.DisplaySign, java.util.Locale, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x01f4 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0 A[LOOP:1: B:95:0x01e0->B:99:0x01ed, LOOP_START, PHI: r1
  0x01e0: PHI (r1v23 int) = (r1v22 int), (r1v25 int) binds: [B:94:0x01de, B:99:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull DisplaySign displaySign, boolean z6) {
        java.lang.String str2;
        java.lang.String fiatSymbol$default;
        java.lang.CharSequence charSequenceSubSequence;
        int length;
        C38307pTy c38307pTyKWHzl;
        java.lang.String str3;
        java.lang.String showOriginData$default = str;
        java.lang.CharSequence charSequenceSubSequence2 = "";
        Intrinsics.checkNotNullParameter(showOriginData$default, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(displaySign, "");
        if (str.length() == 0 && z3) {
            return "--";
        }
        java.lang.String symbol = z2 ? EZpvd().getSymbol() : "$";
        java.lang.String str4 = (z5 || z4) ? "" : symbol;
        if (z4) {
            str2 = " " + (z2 ? EZpvd().getIsoCode() : "USD");
        } else {
            str2 = "";
        }
        if (xHM.KWHzl(xHN.EZpvd(str), 0)) {
            java.lang.String localizedWithMinPrecision$default = z2 ? pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null) : "0.00";
            return (displaySign == DisplaySign.ALWAYS ? Marker.ANY_NON_NULL_MARKER : "") + str4 + localizedWithMinPrecision$default + str2;
        }
        if (z2 && !z6) {
            showOriginData$default = getShowOriginData$default(this, showOriginData$default, null, 2, null);
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(xHN.EZpvd(showOriginData$default));
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(showOriginData$default);
        if (xHM.EZpvd(bigDecimalEZpvd, 1000000000000000L)) {
            if (xHM.AEQbTJ(bigDecimalEZpvd2, "0")) {
                if (displaySign != DisplaySign.ALWAYS) {
                    str3 = displaySign == DisplaySign.EXCEPT_ZERO ? Marker.ANY_NON_NULL_MARKER : "";
                }
                return ">" + str3 + str4 + "999T" + str2;
            }
            return "<-" + str4 + "999T" + str2;
        }
        if (xHM.OLrzqt(bigDecimalEZpvd, "10")) {
            if (xHM.OLrzqt(bigDecimalEZpvd, "1")) {
                c38307pTyKWHzl = C38307pTy.Companion.copydefault(1, 5);
            } else {
                c38307pTyKWHzl = C38307pTy.Companion.KWHzl(0, 4);
            }
            C38307pTy c38307pTy = c38307pTyKWHzl;
            if (z4) {
                fiatSymbol$default = C38305pTw.formatFiatCodeWithSubscriptStyle$default(bigDecimalEZpvd2, z2 ? EZpvd().getIsoCode() : "USD", roundingMode, c38307pTy, displaySign, null, 16, null);
            } else {
                fiatSymbol$default = C38305pTw.formatFiatSymbolWithSubscriptStyle$default(bigDecimalEZpvd2, z2 ? EZpvd().getIsoCode() : "USD", roundingMode, c38307pTy, displaySign, null, 16, null);
            }
        } else {
            C38307pTy c38307pTyKWHzl2 = C38307pTy.Companion.KWHzl(0, 2);
            if (z4) {
                fiatSymbol$default = C38305pTw.formatFiatCode$default(bigDecimalEZpvd2, z2 ? EZpvd().getIsoCode() : "USD", roundingMode, c38307pTyKWHzl2, displaySign, z ? Notation.COMPACT_SHORT : Notation.DEFAULT, null, 32, null);
            } else {
                fiatSymbol$default = C38305pTw.formatFiatSymbol$default(bigDecimalEZpvd2, z2 ? EZpvd().getIsoCode() : "USD", roundingMode, c38307pTyKWHzl2, displaySign, z ? Notation.COMPACT_SHORT : Notation.DEFAULT, null, 32, null);
            }
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) fiatSymbol$default, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null)) {
            int length2 = fiatSymbol$default.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i = length2 - 1;
                    if (fiatSymbol$default.charAt(length2) != '0') {
                        charSequenceSubSequence = fiatSymbol$default.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    length2 = i;
                }
                charSequenceSubSequence = "";
                java.lang.String string = charSequenceSubSequence.toString();
                length = string.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        if (string.charAt(length) != '.') {
                            charSequenceSubSequence2 = string.subSequence(0, length + 1);
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                fiatSymbol$default = charSequenceSubSequence2.toString();
            } else {
                charSequenceSubSequence = "";
                java.lang.String string2 = charSequenceSubSequence.toString();
                length = string2.length() - 1;
                if (length >= 0) {
                }
                fiatSymbol$default = charSequenceSubSequence2.toString();
            }
        }
        return z5 ? C59449zhJ.replace$default(fiatSymbol$default, symbol, "", false, 4, (java.lang.Object) null) : fiatSymbol$default;
    }

    public static /* synthetic */ java.lang.String getShowOriginData$default(xHR xhr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "18";
        }
        return xhr.KWHzl(str, str2);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xHM.mulCheckS$default(str, java.lang.Double.valueOf(EZpvd().getUsdToThisRate()), java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), null, null, 12, null);
    }

    public static /* synthetic */ java.lang.String getFormattedLocalCurrencyInICU$default(xHR xhr, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return xhr.AEQbTJ(str, roundingMode, c38307pTy, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xHM.mulCheckS$default(java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Boolean, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Class process forced to load method for inline: o.xHN.getFormattedNumberICU$default(java.lang.String, java.math.RoundingMode, o.pTy, com.okinc.localization.util.format.DisplaySign, java.util.Locale, boolean, boolean, int, java.lang.Object):java.lang.String */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String formattedNumberICU$default = xHN.getFormattedNumberICU$default(xHM.mulCheckS$default(str, java.lang.Double.valueOf(EZpvd().getUsdToThisRate()), null, null, null, 14, null), roundingMode, c38307pTy, null, null, z, false, 12, null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) formattedNumberICU$default, (java.lang.CharSequence) "<", false, 2, (java.lang.Object) null)) {
            return C59449zhJ.replace$default(formattedNumberICU$default, "<", "<" + EZpvd().getSymbol(), false, 4, (java.lang.Object) null);
        }
        return EZpvd().getSymbol() + formattedNumberICU$default;
    }

    public static /* synthetic */ java.lang.String getShowDataWithPrefix$default(xHR xhr, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z3 = true;
        }
        return xhr.OLrzqt(str, z4, z5, roundingMode2, z3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, OKTDexLevelManager.BigLevel> tripleAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (xHM.AEQbTJ(xHN.EZpvd(str), 0) & xHM.OLrzqt(xHN.EZpvd(str), "0.000000000001")) {
            return "<" + EZpvd().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        java.lang.String showOriginData$default = getShowOriginData$default(this, str, null, 2, null);
        if (z2) {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.copydefault(showOriginData$default, "18", true);
        } else {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.AEQbTJ(showOriginData$default, "18");
        }
        java.lang.String strEZpvd = EZpvd(tripleAEQbTJ, z, roundingMode, z3);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strEZpvd, (java.lang.CharSequence) EZpvd().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strEZpvd;
        }
        return EZpvd().getSymbol() + strEZpvd;
    }

    public final ValuationCurrencyBean EZpvd() {
        ValuationCurrencyBean valuationCurrencyBeanZLjUOn;
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
        return (interfaceC46553tYp == null || (valuationCurrencyBeanZLjUOn = interfaceC46553tYp.zLjUOn()) == null) ? new ValuationCurrencyBean() : valuationCurrencyBeanZLjUOn;
    }

    public final int KWHzl() {
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
        return interfaceC46553tYp != null ? interfaceC46553tYp.OcIXYQ() : new ValuationCurrencyBean().getPrecision();
    }

    public static /* synthetic */ java.lang.String getShowDataWithTriggerPricePrefix$default(xHR xhr, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z3 = true;
        }
        return xhr.EZpvd(str, z4, z5, roundingMode2, z3);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, OKTDexLevelManager.BigLevel> tripleAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (xHM.AEQbTJ(xHN.EZpvd(str), 0) & xHM.OLrzqt(xHN.EZpvd(str), "0.000000000001")) {
            return "<" + EZpvd().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        java.lang.String showOriginData$default = getShowOriginData$default(this, str, null, 2, null);
        if (z2) {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.copydefault(showOriginData$default, "18", true);
        } else {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.AEQbTJ(showOriginData$default, "18");
        }
        java.lang.String strAEQbTJ = AEQbTJ(tripleAEQbTJ, z, roundingMode, z3);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strAEQbTJ, (java.lang.CharSequence) EZpvd().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strAEQbTJ;
        }
        return EZpvd().getSymbol() + strAEQbTJ;
    }

    public static /* synthetic */ java.lang.String formatTriggerPricePriceString$default(xHR xhr, Triple triple, boolean z, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return xhr.AEQbTJ((Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel>) triple, z, roundingMode, z2);
    }

    public final java.lang.String AEQbTJ(Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode, boolean z2) {
        int i;
        xHM.copydefault(triple.getFirst());
        java.lang.String strEZpvd = xHN.EZpvd(triple.getFirst());
        if (z2) {
            if (xHM.KWHzl(strEZpvd, "0")) {
                return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
            }
        } else if (xHM.KWHzl(strEZpvd, "0")) {
            return "0";
        }
        if (xHM.AEQbTJ(strEZpvd, "1")) {
            i = 6;
        } else {
            xHM.OLrzqt(strEZpvd, "1");
            i = 12;
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String formatPriceString$default(xHR xhr, Triple triple, boolean z, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return xhr.EZpvd(triple, z, roundingMode, z2);
    }

    public final java.lang.String EZpvd(@NotNull Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, @NotNull RoundingMode roundingMode, boolean z2) {
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        xHM.copydefault(triple.getFirst());
        java.lang.String strEZpvd = xHN.EZpvd(triple.getFirst());
        int i = 3;
        if (z2) {
            if (strEZpvd.length() == 0 || xHM.KWHzl(strEZpvd, "0")) {
                return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
            }
        } else if (strEZpvd.length() == 0 || xHM.KWHzl(strEZpvd, "0")) {
            return "0";
        }
        if (xHM.EZpvd(strEZpvd, "0.1")) {
            i = 2;
        } else {
            if (!(xHM.OLrzqt(strEZpvd, "0.1") & xHM.EZpvd(strEZpvd, "0.01"))) {
                if (xHM.OLrzqt(strEZpvd, "0.01") && xHM.EZpvd(strEZpvd, "0.001")) {
                    i = 4;
                } else {
                    if (xHM.OLrzqt(strEZpvd, "0.001") && xHM.EZpvd(strEZpvd, "0.0001")) {
                        i = 5;
                    } else {
                        if (xHM.OLrzqt(strEZpvd, "0.0001") && xHM.EZpvd(strEZpvd, "0.00001")) {
                            i = 6;
                        } else {
                            if (xHM.OLrzqt(strEZpvd, "0.00001") && xHM.EZpvd(strEZpvd, "0.000001")) {
                                i = 7;
                            } else {
                                if (xHM.OLrzqt(strEZpvd, "0.000001") && xHM.EZpvd(strEZpvd, "0.0000001")) {
                                    i = 8;
                                } else {
                                    if (xHM.OLrzqt(strEZpvd, "0.0000001") && xHM.EZpvd(strEZpvd, "0.00000001")) {
                                        i = 9;
                                    } else {
                                        if (xHM.OLrzqt(strEZpvd, "0.00000001") && xHM.EZpvd(strEZpvd, "0.000000001")) {
                                            i = 10;
                                        } else {
                                            if (xHM.OLrzqt(strEZpvd, "0.000000001") && xHM.EZpvd(strEZpvd, "0.0000000001")) {
                                                i = 11;
                                            } else {
                                                if ((!xHM.EZpvd(strEZpvd, "0.00000000001") || !xHM.OLrzqt(strEZpvd, "0.0000000001")) && xHM.OLrzqt(strEZpvd, "0.000000000001")) {
                                                    return "<" + EZpvd().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
                                                }
                                                i = 12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String getShowUSDData$default(xHR xhr, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xhr.AEQbTJ(str, z4, z5, roundingMode, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, OKTDexLevelManager.BigLevel> tripleAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.KWHzl(str, java.lang.String.valueOf(KWHzl()));
        } else {
            tripleAEQbTJ = OKTDexLevelManager.EZpvd.AEQbTJ(str, "18");
        }
        java.lang.String priceString$default = formatPriceString$default(this, tripleAEQbTJ, z2, roundingMode, false, 8, null);
        if (!z3) {
            return priceString$default;
        }
        return new ValuationCurrencyBean().getSymbol() + priceString$default;
    }

    public static /* synthetic */ java.lang.String getShowDataForCoinListValue$default(xHR xhr, java.lang.String str, boolean z, java.lang.String str2, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "2";
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return xhr.OLrzqt(str, z, str2, roundingMode);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strOLrzqt = OLrzqt(OKTDexLevelManager.EZpvd.KWHzl(xHM.mulCheckS$default(str, java.lang.Double.valueOf(EZpvd().getUsdToThisRate()), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), java.lang.String.valueOf(EZpvd().getPrecision())), z, str2, roundingMode);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) EZpvd().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strOLrzqt;
        }
        return EZpvd().getSymbol() + strOLrzqt;
    }

    public final java.lang.String OLrzqt(Triple<java.lang.String, java.lang.String, ? extends OKTDexLevelManager.BigLevel> triple, boolean z, java.lang.String str, RoundingMode roundingMode) {
        if (xHM.KWHzl(triple.getFirst(), "0")) {
            return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
        }
        if (xHM.AEQbTJ(triple.getFirst(), "0") & xHM.OLrzqt(triple.getFirst(), "0.01")) {
            return "<" + EZpvd().getSymbol() + pTB.formatLocalized$default("0.01", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(xHM.gEmmrt(triple.getSecond(), str))), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }
}
