package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.PendingOrderLine;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xvo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56068xvo {
    public static final C56068xvo copydefault = new C56068xvo();

    /* JADX INFO: renamed from: o.xvo$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RoundingMode.values().length];
            try {
                iArr[RoundingMode.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundingMode.HALF_UP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    private C56068xvo() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        if (C33129mqd.copydefault(str, "0.00001") && C33129mqd.gEmmrt(str, "0.0001")) {
            return xMR.formatHundredfold$default(xMR.copydefault, "0.0001", 0, false, RoundingMode.DOWN, 6, null);
        }
        return xMR.formatHundredfold$default(xMR.copydefault, str, 0, false, RoundingMode.FLOOR, 6, null);
    }

    public static /* synthetic */ java.lang.String fmtPnlPercent$default(C56068xvo c56068xvo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c56068xvo.copydefault(str, z);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "--";
        }
        if (C33129mqd.copydefault(str, "0.00001") && C33129mqd.gEmmrt(str, "0.0001")) {
            if (z) {
                return xMR.formatPercentWithSymbol$default(xMR.copydefault, "0.0001", 0, 0, RoundingMode.DOWN, 6, null);
            }
            return xMR.formatPercent$default(xMR.copydefault, "0.0001", 0, RoundingMode.DOWN, 2, null);
        }
        if (z) {
            return xMR.formatPercentWithSymbol$default(xMR.copydefault, str, 0, 0, RoundingMode.FLOOR, 6, null);
        }
        return xMR.formatPercent$default(xMR.copydefault, str, 0, RoundingMode.FLOOR, 2, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return "";
        }
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(strAYXKKw);
        if (abstractC54531xLwOLrzqt == null) {
            return "";
        }
        BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
        if (bizInstrumentIsConnected == null || (instFamily = bizInstrumentIsConnected.getInstFamily()) == null) {
            instFamily = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) ? "" : safeString$default;
    }

    public static /* synthetic */ java.lang.String getForcedClosePrice$default(C56068xvo c56068xvo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return c56068xvo.OLrzqt(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        RoundingMode roundingMode;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "long") || Intrinsics.EZpvd((java.lang.Object) str4, (java.lang.Object) "neutral")) {
            roundingMode = RoundingMode.UP;
        } else {
            roundingMode = RoundingMode.DOWN;
        }
        return AEQbTJ(str, str2, str3, roundingMode, z, z2);
    }

    public static /* synthetic */ java.lang.String getProcessedPrice$default(C56068xvo c56068xvo, java.lang.String str, java.lang.String str2, java.lang.String str3, RoundingMode roundingMode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return c56068xvo.AEQbTJ(str, str2, str3, roundingMode, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull RoundingMode roundingMode, boolean z, boolean z2) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        xMS xmsGEmmrt;
        C54536xML c54536xMLAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            java.lang.String strAEQbTJ = xUW.KWHzl.AEQbTJ(str2);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str)) != null && (xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ)) != null && (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(str3)) != null) {
                int i = StateListAnimator.OLrzqt[roundingMode.ordinal()];
                if (i == 1) {
                    c54536xMLAYXKKw.AuCTel();
                } else if (i == 2) {
                    c54536xMLAYXKKw.OLrzqt();
                } else if (i == 3) {
                    c54536xMLAYXKKw.isConnected();
                } else {
                    c54536xMLAYXKKw.copydefault();
                }
                if (z2) {
                    c54536xMLAYXKKw.AkhnZx();
                }
                if (z) {
                    c54536xMLAYXKKw.fetchVPNInfo();
                }
                c54536xMLAYXKKw.djBIcL();
                java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                if (safeString$default != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }

    public static /* synthetic */ java.lang.String getAvgPrice$default(C56068xvo c56068xvo, xMS xms, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c56068xvo.OLrzqt(xms, str, z);
    }

    public final java.lang.String OLrzqt(xMS xms, java.lang.String str, boolean z) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && xms != null && (c54536xMLAYXKKw = xms.AYXKKw(str)) != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) != null) {
            if (z) {
                c54536xMLAuCTel.fetchVPNInfo();
            }
            java.lang.String safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null);
            if (safeString$default != null) {
                return safeString$default;
            }
        }
        return "--";
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, java.lang.String str5, @NotNull RoundingMode roundingMode, java.lang.String str6) {
        java.lang.String displayQuoteSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null) : null;
        java.lang.String strAEQbTJ = AEQbTJ(str4, str2, str, z);
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || str3.length() == 0) {
            return "--";
        }
        java.lang.String strCopydefault = copydefault(str3, strAEQbTJ, roundingMode, str5);
        if (z3 && C33129mqd.AEQbTJ(str3, "0")) {
            strCopydefault = Marker.ANY_NON_NULL_MARKER + strCopydefault;
        }
        if (!z2) {
            return strCopydefault;
        }
        if (suggestedInstrument$default != null && (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) != null) {
            strAEQbTJ = displayQuoteSymbol;
        }
        if (str6 != null && str6.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
            strAEQbTJ = str6;
        }
        return strCopydefault + " " + strAEQbTJ;
    }

    public static /* synthetic */ kotlin.Pair getProfitAndColorPair$default(C56068xvo c56068xvo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c56068xvo.AEQbTJ(str, z);
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, boolean z) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (z && C33129mqd.AEQbTJ(str, "0")) {
            str2 = Marker.ANY_NON_NULL_MARKER + str;
        } else {
            str2 = str;
        }
        return C56390yDp.OLrzqt(str2, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) str)));
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2, boolean z3, java.lang.String str5, @NotNull RoundingMode roundingMode, java.lang.String str6, java.lang.Integer num) {
        boolean z4;
        BizInstrument suggestedInstrument$default;
        java.lang.String str7;
        java.lang.String displayQuoteSymbol;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str, null, null, 12, null);
            z4 = z;
        } else {
            z4 = z;
            suggestedInstrument$default = null;
        }
        java.lang.String strAEQbTJ = AEQbTJ(str4, str2, str, z4);
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || str3.length() == 0) {
            return C56390yDp.OLrzqt("--", java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) null)));
        }
        java.lang.String strAEQbTJ2 = AEQbTJ(str3, strAEQbTJ, roundingMode, str5, num);
        if (z3 && C33129mqd.AEQbTJ(str3, "0")) {
            str7 = Marker.ANY_NON_NULL_MARKER + strAEQbTJ2;
        } else {
            str7 = strAEQbTJ2;
        }
        if (z2) {
            if (suggestedInstrument$default != null && (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) != null) {
                strAEQbTJ = displayQuoteSymbol;
            }
            if (str6 != null && str6.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
                strAEQbTJ = str6;
            }
            str7 = str7 + " " + strAEQbTJ;
        }
        return C56390yDp.OLrzqt(str7, java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) strAEQbTJ2)));
    }

    public static /* synthetic */ boolean getAutoEarnStatus$default(C56068xvo c56068xvo, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return c56068xvo.copydefault(str, str2, bool);
    }

    public final boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        return !Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? !((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "earning") && C33129mqd.OLrzqt((java.lang.CharSequence) str2)) || (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.AEQbTJ(str, "0"))) : !(C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.copydefault(str, "0"));
    }

    public static /* synthetic */ java.lang.String getSymbol$default(C56068xvo c56068xvo, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return c56068xvo.AEQbTJ(str, str2, str3, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x003a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0052 */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, boolean z) {
        java.lang.String tradeSymbol;
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str2, str3, null, null, 12, null) : null;
        Function0 function0 = new Function0() { // from class: o.xvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56068xvo.EZpvd(str3, str2);
            }
        };
        Function0 function02 = new Function0() { // from class: o.xvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C56068xvo.KWHzl(str3, str2);
            }
        };
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) {
            return str;
        }
        if (z) {
            tradeSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
            str4 = tradeSymbol != null ? tradeSymbol : "";
            int length = str4.length();
            java.lang.Object objInvoke = str4;
            if (length == 0) {
                objInvoke = function0.invoke();
            }
            return (java.lang.String) objInvoke;
        }
        tradeSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null;
        str4 = tradeSymbol != null ? tradeSymbol : "";
        int length2 = str4.length();
        java.lang.Object objInvoke2 = str4;
        if (length2 == 0) {
            objInvoke2 = function02.invoke();
        }
        return (java.lang.String) objInvoke2;
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault = C56078xvy.copydefault(str, str2);
        if (strCopydefault.length() != 0) {
            return strCopydefault;
        }
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String strKWHzl = C56078xvy.KWHzl(str, str2);
        if (strKWHzl.length() != 0) {
            return strKWHzl;
        }
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public final int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        java.lang.Integer numValueOf;
        TradeCoinInfo tradeCoinInfoAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str, 0) && C33129mqd.gEmmrt(str, 1)) {
            numValueOf = java.lang.Integer.valueOf(OLrzqt(str, 0.1d));
        } else {
            numValueOf = (C33129mqd.AEQbTJ(str, -1) && C33129mqd.gEmmrt(str, 0)) ? java.lang.Integer.valueOf(OLrzqt(str, -0.1d)) : null;
        }
        if (str3 == null) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            str3 = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(str2)) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        }
        return java.lang.Math.max(numValueOf != null ? numValueOf.intValue() : 0, (str3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3)) ? 4 : C33129mqd.AhwBna(str3));
    }

    public static /* synthetic */ java.lang.String handleRawDigit$default(C56068xvo c56068xvo, java.lang.String str, java.lang.String str2, RoundingMode roundingMode, java.lang.String str3, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        return c56068xvo.AEQbTJ(str, str2, roundingMode, str3, num);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, java.lang.String str3, java.lang.Integer num) {
        int iCopydefault = copydefault(str, str2, str3);
        if (!((C33129mqd.AEQbTJ(str, 0) && C33129mqd.gEmmrt(str, "0.00000001")) || (C33129mqd.AEQbTJ(str, "-0.00000001") && C33129mqd.gEmmrt(str, 0))) || iCopydefault <= 8) {
            return C33129mqd.formatS$default(str, java.lang.Integer.valueOf(iCopydefault), null, roundingMode, 2, null);
        }
        return C33129mqd.AEQbTJ(str, 0) ? "0.00000001" : "-0.00000001";
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, java.lang.String str3) {
        return xMR.copydefault.copydefault(handleRawDigit$default(this, str, str2, roundingMode, str3, null, 16, null));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2, boolean z, @NotNull java.lang.String str3, @NotNull RoundingMode roundingMode, boolean z2) {
        java.lang.String str4;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str.length() == 0) {
            return "--";
        }
        java.lang.String strCopydefault = copydefault(str, str3, roundingMode, str2);
        if (z2 && C33129mqd.AEQbTJ(str, "0")) {
            str4 = Marker.ANY_NON_NULL_MARKER + strCopydefault;
        } else {
            str4 = strCopydefault;
        }
        if (!z) {
            return str4;
        }
        return str4 + " " + str3;
    }

    public final int OLrzqt(java.lang.String str, double d) {
        int i = 1;
        double d2 = d;
        while (true) {
            if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(d), 0)) {
                if (C33129mqd.AEQbTJ(str, java.lang.Double.valueOf(d2))) {
                    break;
                }
                d2 /= (double) 10;
                i++;
            } else {
                if (C33129mqd.gEmmrt(str, java.lang.Double.valueOf(d2)) || i > 8) {
                    break;
                }
                d2 /= (double) 10;
                i++;
            }
        }
        return i > 8 ? i : java.lang.Math.min(i + 2, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PendingOrderLine OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        java.lang.String str11;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iHashCode = str.hashCode();
        int i = 0;
        if (iHashCode != -1574173039) {
            if (iHashCode != -512749997) {
                if (C33129mqd.AEQbTJ(str2, "0") && C33129mqd.AEQbTJ(str3, str2) && C33129mqd.AEQbTJ(str4, "0")) {
                    if (!Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "1")) {
                        java.lang.String strDivS$default = C33129mqd.divS$default(C33129mqd.subS$default(str3, str2, null, null, null, 14, null), str4, null, null, null, 14, null);
                        int iAhwBna = C33129mqd.AhwBna(str4);
                        if (iAhwBna >= 0) {
                            while (true) {
                                arrayList.add(C33129mqd.addS$default(str2, C33129mqd.mulS$default(java.lang.Integer.valueOf(i), strDivS$default, null, null, null, 14, null), null, null, null, 14, null));
                                if (i == iAhwBna) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "2")) {
                        double dPow = java.lang.Math.pow(C33129mqd.divD$default(str3, str2, null, null, null, 14, null), C33129mqd.divD$default(1, str4, null, null, null, 14, null));
                        int iAhwBna2 = C33129mqd.AhwBna(str4);
                        if (iAhwBna2 >= 0) {
                            while (true) {
                                arrayList.add(C33129mqd.mulS$default(str2, java.lang.Double.valueOf(java.lang.Math.pow(dPow, i)), null, null, null, 14, null));
                                if (i == iAhwBna2) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } else if (C33129mqd.AEQbTJ(str2, "0")) {
                if (!Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "1")) {
                }
            }
        } else if (str.equals("infinite_grid") && C33129mqd.AEQbTJ(str2, "0") && C33129mqd.AEQbTJ(str8, "0")) {
            int iMax = java.lang.Math.max(new BigDecimal(str2).scale(), 2);
            java.lang.String str12 = str7 != null ? str7 : "0";
            if (str6 == null || str6.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
                str11 = str10;
            } else {
                str11 = str10;
                str12 = str6;
            }
            java.lang.String str13 = C33129mqd.copydefault(str11, str7) ? str11 : "2147483647";
            double dAddD$default = C33129mqd.addD$default(1, str8, null, null, null, 14, null);
            java.lang.String strMulS$default = C33129mqd.mulS$default(str12, java.lang.Double.valueOf(java.lang.Math.pow(dAddD$default, -1)), null, null, null, 14, null);
            int i2 = 1;
            while (i2 <= 25 && C33129mqd.gEmmrt(strMulS$default, str12) && C33129mqd.AEQbTJ(strMulS$default, str2)) {
                arrayList.add(0, C33129mqd.AEQbTJ(strMulS$default, java.lang.Integer.valueOf(iMax), java.lang.Boolean.FALSE, RoundingMode.UP));
                i2++;
                strMulS$default = C33129mqd.mulS$default(str12, java.lang.Double.valueOf(java.lang.Math.pow(dAddD$default, -i2)), null, null, null, 14, null);
            }
            int size = arrayList.size();
            int i3 = 1;
            java.lang.String strMulS$default2 = C33129mqd.mulS$default(str12, java.lang.Double.valueOf(java.lang.Math.pow(dAddD$default, 1)), null, null, null, 14, null);
            while (i3 <= size && C33129mqd.AEQbTJ(strMulS$default2, str12) && C33129mqd.gEmmrt(strMulS$default2, str13)) {
                arrayList.add(C33129mqd.AEQbTJ(strMulS$default2, java.lang.Integer.valueOf(iMax), java.lang.Boolean.FALSE, RoundingMode.UP));
                i3++;
                strMulS$default2 = C33129mqd.mulS$default(str12, java.lang.Double.valueOf(java.lang.Math.pow(dAddD$default, i3)), null, null, null, 14, null);
            }
            pUU.KWHzl("BotKlineHelper", "infinite realCalculatePx is " + str12);
        }
        return new PendingOrderLine(str, str6, str9 == null ? "long" : str9, arrayList);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = StringsKt__StringsKt.EZpvd(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.CharSequence) "%");
        java.lang.String str3 = Marker.ANY_NON_NULL_MARKER;
        if (C59449zhJ.startsWith$default(strEZpvd, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
            str2 = Marker.ANY_NON_NULL_MARKER;
        } else {
            str2 = "-";
            if (!C59449zhJ.startsWith$default(strEZpvd, "-", false, 2, null)) {
                str2 = "";
            }
        }
        if (str2.length() > 0) {
            strEZpvd = strEZpvd.substring(1);
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
        }
        BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(strEZpvd);
        if (bigDecimalFARcdN == null) {
            return str;
        }
        java.lang.String plainString = bigDecimalFARcdN.stripTrailingZeros().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        java.lang.String strOLrzqt = StringsKt__StringsKt.OLrzqt(plainString, '.');
        if (str2.length() != 0) {
            str3 = str2;
        }
        return str3 + strOLrzqt + "%";
    }
}
