package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.utils.amountformat.DataLevelManager;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.hvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23272hvB {
    public static final C23272hvB KWHzl = new C23272hvB();

    private C23272hvB() {
    }

    public static /* synthetic */ java.lang.String formatScientificCurrency$default(C23272hvB c23272hvB, java.lang.String str, boolean z, RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, DisplaySign displaySign, boolean z6, boolean z7, int i, java.lang.Object obj) {
        return c23272hvB.AEQbTJ(str, (i & 1) != 0 ? false : z, (i & 2) != 0 ? RoundingMode.HALF_UP : roundingMode, (i & 4) != 0 ? true : z2, (i & 8) == 0 ? z3 : true, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? DisplaySign.AUTO : displaySign, (i & 128) != 0 ? false : z6, (i & 256) == 0 ? z7 : false);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x0208 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f4 A[LOOP:1: B:96:0x01f4->B:100:0x0201, LOOP_START, PHI: r2
  0x01f4: PHI (r2v23 int) = (r2v22 int), (r2v25 int) binds: [B:95:0x01f2, B:100:0x0201] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull RoundingMode roundingMode, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull DisplaySign displaySign, boolean z6, boolean z7) {
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
        java.lang.String symbol = z2 ? OLrzqt().getSymbol() : "$";
        java.lang.String str4 = (z5 || z4) ? "" : symbol;
        if (z4) {
            str2 = " " + (z2 ? OLrzqt().getIsoCode() : "USD");
        } else {
            str2 = "";
        }
        if (C23313hvq.copydefault(C23311hvo.copydefault(str), 0)) {
            java.lang.String localizedWithMinPrecision$default = z2 ? pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null) : "0.00";
            return (displaySign == DisplaySign.ALWAYS ? Marker.ANY_NON_NULL_MARKER : "") + str4 + localizedWithMinPrecision$default + str2;
        }
        if (z2 && !z6) {
            if (z7) {
                showOriginData$default = AEQbTJ(showOriginData$default, C33129mqd.gEmmrt(java.lang.Integer.valueOf(OLrzqt().getPrecision())));
            } else {
                showOriginData$default = getShowOriginData$default(this, showOriginData$default, null, 2, null);
            }
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(C23311hvo.copydefault(showOriginData$default));
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(showOriginData$default);
        if (C23313hvq.EZpvd(bigDecimalEZpvd, 1000000000000000L)) {
            if (C23313hvq.OLrzqt(bigDecimalEZpvd2, "0")) {
                if (displaySign != DisplaySign.ALWAYS) {
                    str3 = displaySign == DisplaySign.EXCEPT_ZERO ? Marker.ANY_NON_NULL_MARKER : "";
                }
                return ">" + str3 + str4 + "999T" + str2;
            }
            return "<-" + str4 + "999T" + str2;
        }
        if (C23313hvq.KWHzl(bigDecimalEZpvd, "10")) {
            if (C23313hvq.KWHzl(bigDecimalEZpvd, "1")) {
                c38307pTyKWHzl = C38307pTy.Companion.copydefault(1, 5);
            } else {
                c38307pTyKWHzl = C38307pTy.Companion.KWHzl(0, 4);
            }
            C38307pTy c38307pTy = c38307pTyKWHzl;
            if (z4) {
                fiatSymbol$default = C38305pTw.formatFiatCodeWithSubscriptStyle$default(bigDecimalEZpvd2, z2 ? OLrzqt().getIsoCode() : "USD", roundingMode, c38307pTy, displaySign, null, 16, null);
            } else {
                fiatSymbol$default = C38305pTw.formatFiatSymbolWithSubscriptStyle$default(bigDecimalEZpvd2, z2 ? OLrzqt().getIsoCode() : "USD", roundingMode, c38307pTy, displaySign, null, 16, null);
            }
        } else {
            C38307pTy c38307pTyKWHzl2 = C38307pTy.Companion.KWHzl(0, 2);
            if (z4) {
                fiatSymbol$default = C38305pTw.formatFiatCode$default(bigDecimalEZpvd2, z2 ? OLrzqt().getIsoCode() : "USD", roundingMode, c38307pTyKWHzl2, displaySign, z ? Notation.COMPACT_SHORT : Notation.DEFAULT, null, 32, null);
            } else {
                fiatSymbol$default = C38305pTw.formatFiatSymbol$default(bigDecimalEZpvd2, z2 ? OLrzqt().getIsoCode() : "USD", roundingMode, c38307pTyKWHzl2, displaySign, z ? Notation.COMPACT_SHORT : Notation.DEFAULT, null, 32, null);
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

    public static /* synthetic */ java.lang.String getShowOriginData$default(C23272hvB c23272hvB, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "18";
        }
        return c23272hvB.AEQbTJ(str, str2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23313hvq.mulCheckS$default(str, java.lang.Double.valueOf(OLrzqt().getUsdToThisRate()), java.lang.Integer.valueOf(C33129mqd.AhwBna(str2)), null, null, 12, null);
    }

    public static /* synthetic */ java.lang.String getLocalCurrencyInICU$default(C23272hvB c23272hvB, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        return c23272hvB.EZpvd(str, roundingMode, c38307pTy);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(str, java.lang.Double.valueOf(OLrzqt().getUsdToThisRate()), null, null, null, 14, null);
        return OLrzqt().getSymbol() + pTB.formatICUCompact$default(C33129mqd.EZpvd(strMulCheckS$default), roundingMode, c38307pTy, null, null, 12, null);
    }

    public static /* synthetic */ java.lang.String getFormattedLocalCurrencyInICU$default(C23272hvB c23272hvB, java.lang.String str, RoundingMode roundingMode, C38307pTy c38307pTy, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        if ((i & 4) != 0) {
            c38307pTy = C38307pTy.Companion.EZpvd(2);
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return c23272hvB.OLrzqt(str, roundingMode, c38307pTy, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hvw.getFormattedNumberICU$default(java.lang.String, java.math.RoundingMode, o.pTy, com.okinc.localization.util.format.DisplaySign, java.util.Locale, boolean, boolean, int, java.lang.Object):java.lang.String */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode, @NotNull C38307pTy c38307pTy, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(c38307pTy, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String formattedNumberICU$default = C23319hvw.getFormattedNumberICU$default(C23313hvq.mulCheckS$default(str, java.lang.Double.valueOf(OLrzqt().getUsdToThisRate()), null, null, null, 14, null), roundingMode, c38307pTy, null, null, z, false, 12, null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) formattedNumberICU$default, (java.lang.CharSequence) "<", false, 2, (java.lang.Object) null)) {
            return C59449zhJ.replace$default(formattedNumberICU$default, "<", "<" + OLrzqt().getSymbol(), false, 4, (java.lang.Object) null);
        }
        return OLrzqt().getSymbol() + formattedNumberICU$default;
    }

    public static /* synthetic */ java.lang.String getShowDataWithPrefix$default(C23272hvB c23272hvB, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z3 = true;
        }
        return c23272hvB.KWHzl(str, z4, z5, roundingMode2, z3);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, DataLevelManager.BigLevel> tripleOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (C23313hvq.OLrzqt(C23311hvo.copydefault(str), 0) & C23313hvq.KWHzl(C23311hvo.copydefault(str), "0.000000000001")) {
            return "<" + OLrzqt().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        java.lang.String showOriginData$default = getShowOriginData$default(this, str, null, 2, null);
        if (z2) {
            tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(showOriginData$default, "18", true);
        } else {
            tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(showOriginData$default, "18");
        }
        java.lang.String strCopydefault = copydefault(tripleOLrzqt, z, roundingMode, z3);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strCopydefault, (java.lang.CharSequence) OLrzqt().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strCopydefault;
        }
        return OLrzqt().getSymbol() + strCopydefault;
    }

    public final ValuationCurrencyBean OLrzqt() {
        ValuationCurrencyBean valuationCurrencyBeanZLjUOn;
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
        return (interfaceC46553tYp == null || (valuationCurrencyBeanZLjUOn = interfaceC46553tYp.zLjUOn()) == null) ? new ValuationCurrencyBean() : valuationCurrencyBeanZLjUOn;
    }

    public final int EZpvd() {
        InterfaceC46553tYp interfaceC46553tYp = (InterfaceC46553tYp) C43251rlk.OLrzqt(InterfaceC46553tYp.class);
        return interfaceC46553tYp != null ? interfaceC46553tYp.OcIXYQ() : new ValuationCurrencyBean().getPrecision();
    }

    public static /* synthetic */ java.lang.String getShowDataWithTriggerPricePrefix$default(C23272hvB c23272hvB, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        RoundingMode roundingMode2 = roundingMode;
        if ((i & 16) != 0) {
            z3 = true;
        }
        return c23272hvB.AEQbTJ(str, z4, z5, roundingMode2, z3);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, DataLevelManager.BigLevel> tripleOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (C23313hvq.OLrzqt(C23311hvo.copydefault(str), 0) & C23313hvq.KWHzl(C23311hvo.copydefault(str), "0.000000000001")) {
            return "<" + OLrzqt().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
        }
        java.lang.String showOriginData$default = getShowOriginData$default(this, str, null, 2, null);
        if (z2) {
            tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(showOriginData$default, "18", true);
        } else {
            tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(showOriginData$default, "18");
        }
        java.lang.String strAEQbTJ = AEQbTJ(tripleOLrzqt, z, roundingMode, z3);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strAEQbTJ, (java.lang.CharSequence) OLrzqt().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strAEQbTJ;
        }
        return OLrzqt().getSymbol() + strAEQbTJ;
    }

    public static /* synthetic */ java.lang.String formatTriggerPricePriceString$default(C23272hvB c23272hvB, Triple triple, boolean z, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c23272hvB.AEQbTJ(triple, z, roundingMode, z2);
    }

    public final java.lang.String AEQbTJ(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, RoundingMode roundingMode, boolean z2) {
        int i;
        C23313hvq.OLrzqt(triple.getFirst());
        java.lang.String strCopydefault = C23311hvo.copydefault(triple.getFirst());
        if (z2) {
            if (C23313hvq.copydefault(strCopydefault, "0")) {
                return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
            }
        } else if (C23313hvq.copydefault(strCopydefault, "0")) {
            return "0";
        }
        if (C23313hvq.OLrzqt(strCopydefault, "1")) {
            i = 6;
        } else {
            C23313hvq.KWHzl(strCopydefault, "1");
            i = 12;
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(i), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public static /* synthetic */ java.lang.String formatPriceString$default(C23272hvB c23272hvB, Triple triple, boolean z, RoundingMode roundingMode, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c23272hvB.copydefault((Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel>) triple, z, roundingMode, z2);
    }

    public final java.lang.String copydefault(@NotNull Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, @NotNull RoundingMode roundingMode, boolean z2) {
        Intrinsics.checkNotNullParameter(triple, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        C23313hvq.OLrzqt(triple.getFirst());
        java.lang.String strCopydefault = C23311hvo.copydefault(triple.getFirst());
        int i = 3;
        if (z2) {
            if (strCopydefault.length() == 0 || C23313hvq.copydefault(strCopydefault, "0")) {
                return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
            }
        } else if (strCopydefault.length() == 0 || C23313hvq.copydefault(strCopydefault, "0")) {
            return "0";
        }
        if (C23313hvq.EZpvd(strCopydefault, "0.1")) {
            i = 2;
        } else {
            if (!(C23313hvq.KWHzl(strCopydefault, "0.1") & C23313hvq.EZpvd(strCopydefault, "0.01"))) {
                if (C23313hvq.KWHzl(strCopydefault, "0.01") && C23313hvq.EZpvd(strCopydefault, "0.001")) {
                    i = 4;
                } else {
                    if (C23313hvq.KWHzl(strCopydefault, "0.001") && C23313hvq.EZpvd(strCopydefault, "0.0001")) {
                        i = 5;
                    } else {
                        if (C23313hvq.KWHzl(strCopydefault, "0.0001") && C23313hvq.EZpvd(strCopydefault, "0.00001")) {
                            i = 6;
                        } else {
                            if (C23313hvq.KWHzl(strCopydefault, "0.00001") && C23313hvq.EZpvd(strCopydefault, "0.000001")) {
                                i = 7;
                            } else {
                                if (C23313hvq.KWHzl(strCopydefault, "0.000001") && C23313hvq.EZpvd(strCopydefault, "0.0000001")) {
                                    i = 8;
                                } else {
                                    if (C23313hvq.KWHzl(strCopydefault, "0.0000001") && C23313hvq.EZpvd(strCopydefault, "0.00000001")) {
                                        i = 9;
                                    } else {
                                        if (C23313hvq.KWHzl(strCopydefault, "0.00000001") && C23313hvq.EZpvd(strCopydefault, "0.000000001")) {
                                            i = 10;
                                        } else {
                                            if (C23313hvq.KWHzl(strCopydefault, "0.000000001") && C23313hvq.EZpvd(strCopydefault, "0.0000000001")) {
                                                i = 11;
                                            } else {
                                                if ((!C23313hvq.EZpvd(strCopydefault, "0.00000000001") || !C23313hvq.KWHzl(strCopydefault, "0.0000000001")) && C23313hvq.KWHzl(strCopydefault, "0.000000000001")) {
                                                    return "<" + OLrzqt().getSymbol() + pTB.formatLocalized$default("0.000000000001", null, 1, null);
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

    public static /* synthetic */ java.lang.String getShowUSDData$default(C23272hvB c23272hvB, java.lang.String str, boolean z, boolean z2, RoundingMode roundingMode, boolean z3, int i, java.lang.Object obj) {
        boolean z4 = (i & 2) != 0 ? false : z;
        boolean z5 = (i & 4) != 0 ? false : z2;
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c23272hvB.OLrzqt(str, z4, z5, roundingMode, (i & 16) != 0 ? false : z3);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull RoundingMode roundingMode, boolean z3) {
        Triple<java.lang.String, java.lang.String, DataLevelManager.BigLevel> tripleOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (z) {
            tripleOLrzqt = DataLevelManager.EZpvd.KWHzl(str, java.lang.String.valueOf(EZpvd()));
        } else {
            tripleOLrzqt = DataLevelManager.EZpvd.OLrzqt(str, "18");
        }
        java.lang.String priceString$default = formatPriceString$default(this, tripleOLrzqt, z2, roundingMode, false, 8, null);
        if (!z3) {
            return priceString$default;
        }
        return new ValuationCurrencyBean().getSymbol() + priceString$default;
    }

    public static /* synthetic */ java.lang.String getShowDataForCoinListValue$default(C23272hvB c23272hvB, java.lang.String str, boolean z, java.lang.String str2, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str2 = "2";
        }
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c23272hvB.EZpvd(str, z, str2, roundingMode);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        java.lang.String strCopydefault = copydefault(DataLevelManager.EZpvd.KWHzl(C23313hvq.mulCheckS$default(str, java.lang.Double.valueOf(OLrzqt().getUsdToThisRate()), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), java.lang.String.valueOf(OLrzqt().getPrecision())), z, str2, roundingMode);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strCopydefault, (java.lang.CharSequence) OLrzqt().getSymbol(), false, 2, (java.lang.Object) null)) {
            return strCopydefault;
        }
        return OLrzqt().getSymbol() + strCopydefault;
    }

    public final java.lang.String copydefault(Triple<java.lang.String, java.lang.String, ? extends DataLevelManager.BigLevel> triple, boolean z, java.lang.String str, RoundingMode roundingMode) {
        if (C23313hvq.copydefault(triple.getFirst(), "0")) {
            return pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
        }
        if (C23313hvq.OLrzqt(triple.getFirst(), "0") & C23313hvq.KWHzl(triple.getFirst(), "0.01")) {
            return "<" + OLrzqt().getSymbol() + pTB.formatLocalized$default("0.01", null, 1, null);
        }
        return pTB.formatLocalized$default(C33129mqd.AEQbTJ(triple.getFirst(), java.lang.Integer.valueOf(C33129mqd.AhwBna(C23313hvq.djBIcL(triple.getSecond(), str))), java.lang.Boolean.valueOf(!z), roundingMode), null, 1, null) + triple.getThird().getUnit();
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "--";
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        ValuationCurrencyBean valuationCurrencyBeanOLrzqt = OLrzqt();
        if (!C23313hvq.copydefault(C33129mqd.EZpvd(java.lang.Double.valueOf(valuationCurrencyBeanOLrzqt.getUsdToThisRate())), 0)) {
            bigDecimalEZpvd = C33129mqd.EZpvd(C23313hvq.mulCheckS$default(bigDecimalEZpvd, java.lang.Double.valueOf(valuationCurrencyBeanOLrzqt.getUsdToThisRate()), null, null, null, 14, null));
        }
        java.lang.String symbol = OLrzqt().getSymbol();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (C23313hvq.copydefault(bigDecimalEZpvd, bigDecimal)) {
            return symbol + pTB.formatLocalizedWithMinPrecision$default("0.00", 0, null, 3, null);
        }
        if (C23313hvq.KWHzl(C23313hvq.KWHzl(bigDecimalEZpvd, bigDecimal) ? C33129mqd.EZpvd(C23313hvq.mulCheckS$default(bigDecimalEZpvd, MultiTransferSignData.DEFAULT_INTERVAL, null, null, null, 14, null)) : bigDecimalEZpvd, new BigDecimal("0.01"))) {
            return (C23313hvq.KWHzl(bigDecimalEZpvd, bigDecimal) ? "-" : Marker.ANY_NON_NULL_MARKER) + "<" + symbol + pTB.formatLocalizedWithMinPrecision$default("0.01", 0, null, 3, null);
        }
        return formatScientificCurrency$default(this, str, true, RoundingMode.DOWN, true, false, false, false, DisplaySign.ALWAYS, false, true, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null);
    }
}
