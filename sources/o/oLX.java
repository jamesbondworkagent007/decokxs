package o;

import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oLX {
    public static final android.util.ArrayMap<java.lang.String, java.lang.Integer> KWHzl;

    public static final java.lang.String AEQbTJ(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrdType(), (java.lang.Object) "market")) {
            return C33129mqd.AEQbTJ(tradeOrderData.getAvgPx(), 0) ? tradeOrderData.getAvgPx() : tradeOrderData.getPx();
        }
        return tradeOrderData.getPx();
    }

    public static final boolean OLrzqt(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        java.lang.String tgtCcy = tradeOrderData.getTgtCcy();
        if (tgtCcy == null || tgtCcy.length() == 0) {
            return C59449zhJ.gEmmrt(tradeOrderData.getSide(), "buy", true);
        }
        return Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getTgtCcy(), (java.lang.Object) "quote_ccy");
    }

    public static final boolean gEmmrt(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        return OLrzqt(tradeOrderData) & yDY.gEmmrt("SPOT", "MARGIN").contains(tradeOrderData.getInstType()) & Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrdType(), (java.lang.Object) "market");
    }

    public static /* synthetic */ java.lang.String getEntrustAmount$default(TradeOrderData tradeOrderData, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return copydefault(tradeOrderData, z);
    }

    public static final java.lang.String copydefault(@NotNull TradeOrderData tradeOrderData, boolean z) {
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String safeString$default;
        C54536xML c54536xMLIsConnected2;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAEQbTJ2;
        java.lang.String strValueOf;
        java.lang.String upperCase;
        C54536xML c54536xMLDjBIcL3;
        C54536xML c54536xMLIsConnected3;
        C54536xML c54536xMLDjBIcL4;
        C54536xML c54536xMLAEQbTJ3;
        java.lang.String quoteSymbol;
        java.lang.String upperCase2;
        C54536xML c54536xMLDjBIcL5;
        C54536xML c54536xMLIsConnected4;
        C54536xML c54536xMLDjBIcL6;
        C54536xML c54536xMLFetchVPNInfo2;
        C54536xML c54536xMLAEQbTJ4;
        java.lang.String quoteSymbol2;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        if (copydefault(tradeOrderData)) {
            strValueOf = java.lang.String.valueOf(xMR.copydefault.AhwBna(tradeOrderData.getSz(), 4));
            if (z) {
                strValueOf = strValueOf + " " + tradeOrderData.getInstId();
            }
        } else {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(tradeOrderData.getInstType()) : null;
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tradeOrderData.getInstType(), tradeOrderData.getInstId(), null, null, 12, null) : null;
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            java.lang.String strAEQbTJ = (instFamily == null || instFamily.length() == 0) ? xUW.KWHzl.AEQbTJ(tradeOrderData.getInstId()) : suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (!gEmmrt(tradeOrderData)) {
                if (abstractC54531xLwOLrzqt != null) {
                    c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ != null ? strAEQbTJ : "", null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default = null;
                }
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    c54571xNhCreateTradeConverterWithIndex$default.AhwBna(AEQbTJ(tradeOrderData));
                }
                if (tradeOrderData.isHistory() && Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getInstType(), (java.lang.Object) "FUTURES") && C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderData.getCtVal())) {
                    if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                        java.lang.String ctVal = tradeOrderData.getCtVal();
                        Intrinsics.copydefault((java.lang.Object) ctVal);
                        c54571xNhCreateTradeConverterWithIndex$default.valueOf(ctVal);
                    }
                } else if (tradeOrderData.isHistory() && Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getInstType(), (java.lang.Object) "OPTION") && C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderData.getCtVal()) && c54571xNhCreateTradeConverterWithIndex$default != null) {
                    java.lang.String ctVal2 = tradeOrderData.getCtVal();
                    Intrinsics.copydefault((java.lang.Object) ctVal2);
                    c54571xNhCreateTradeConverterWithIndex$default.AEQbTJ(ctVal2);
                }
                C54536xML c54536xMLDjBIcL7 = c54571xNhCreateTradeConverterWithIndex$default != null ? c54571xNhCreateTradeConverterWithIndex$default.djBIcL(tradeOrderData.getSz()) : null;
                if (z) {
                    if (c54536xMLDjBIcL7 != null && (c54536xMLIsConnected2 = c54536xMLDjBIcL7.isConnected()) != null && (c54536xMLDjBIcL2 = c54536xMLIsConnected2.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) != null && (c54536xMLAEQbTJ2 = c54536xMLFetchVPNInfo.AEQbTJ()) != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ2, false, 1, null);
                        strValueOf = safeString$default;
                    }
                    strValueOf = null;
                } else {
                    if (c54536xMLDjBIcL7 != null && (c54536xMLIsConnected = c54536xMLDjBIcL7.isConnected()) != null && (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) != null && (c54536xMLAEQbTJ = c54536xMLDjBIcL.AEQbTJ()) != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null);
                        strValueOf = safeString$default;
                    }
                    strValueOf = null;
                }
            } else if (z) {
                if (abstractC54531xLwOLrzqt != null) {
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    if (suggestedInstrument$default == null || (quoteSymbol2 = suggestedInstrument$default.getQuoteSymbol()) == null) {
                        upperCase2 = null;
                    } else {
                        upperCase2 = quoteSymbol2.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                    }
                    C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, upperCase2);
                    if (c54571xNhAhwBna != null && (c54536xMLDjBIcL5 = c54571xNhAhwBna.djBIcL(tradeOrderData.getSz())) != null && (c54536xMLIsConnected4 = c54536xMLDjBIcL5.isConnected()) != null && (c54536xMLDjBIcL6 = c54536xMLIsConnected4.djBIcL()) != null && (c54536xMLFetchVPNInfo2 = c54536xMLDjBIcL6.fetchVPNInfo()) != null && (c54536xMLAEQbTJ4 = c54536xMLFetchVPNInfo2.AEQbTJ()) != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ4, false, 1, null);
                        strValueOf = safeString$default;
                    }
                }
                strValueOf = null;
            } else {
                if (abstractC54531xLwOLrzqt != null) {
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
                        upperCase = null;
                    } else {
                        upperCase = quoteSymbol.toUpperCase(java.util.Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    }
                    C54571xNh c54571xNhAhwBna2 = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, upperCase);
                    if (c54571xNhAhwBna2 != null && (c54536xMLDjBIcL3 = c54571xNhAhwBna2.djBIcL(tradeOrderData.getSz())) != null && (c54536xMLIsConnected3 = c54536xMLDjBIcL3.isConnected()) != null && (c54536xMLDjBIcL4 = c54536xMLIsConnected3.djBIcL()) != null && (c54536xMLAEQbTJ3 = c54536xMLDjBIcL4.AEQbTJ()) != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ3, false, 1, null);
                        strValueOf = safeString$default;
                    }
                }
                strValueOf = null;
            }
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf)) {
            return "--";
        }
        Intrinsics.copydefault((java.lang.Object) strValueOf);
        return strValueOf;
    }

    public static final java.lang.String KWHzl(@NotNull TradeOrderData tradeOrderData) {
        xMW xmwKWHzl;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLEZpvd;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        xMW xmwKWHzl2;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLEZpvd2;
        C54536xML c54536xMLCopydefault2;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String safeNoSignString$default = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        java.lang.String symbol = ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn().getSymbol();
        double dAEQbTJ = C33129mqd.AEQbTJ((interfaceC54581xNrOLrzqt == null || (xmwKWHzl2 = interfaceC54581xNrOLrzqt.KWHzl()) == null || (c54536xMLAYXKKw2 = xmwKWHzl2.AYXKKw(tradeOrderData.getNotionalUsd())) == null || (c54536xMLEZpvd2 = c54536xMLAYXKKw2.EZpvd("2")) == null || (c54536xMLCopydefault2 = c54536xMLEZpvd2.copydefault()) == null) ? null : C54536xML.toSafeNoSignString$default(c54536xMLCopydefault2, false, 1, null));
        if (interfaceC54581xNrOLrzqt != null && (xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl()) != null && (c54536xMLAYXKKw = xmwKWHzl.AYXKKw(tradeOrderData.getNotionalUsd())) != null && (c54536xMLEZpvd = c54536xMLAYXKKw.EZpvd("2")) != null && (c54536xMLCopydefault = c54536xMLEZpvd.copydefault()) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null) {
            safeNoSignString$default = C54536xML.toSafeNoSignString$default(c54536xMLDjBIcL, false, 1, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Double.valueOf(dAEQbTJ), (java.lang.Object) 0)) {
            return "--";
        }
        return symbol + safeNoSignString$default;
    }

    public static final C54536xML AEQbTJ(@NotNull java.lang.String str, C54536xML c54536xML) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C59449zhJ.gEmmrt(str, "buy", true)) {
            if (c54536xML != null) {
                return c54536xML.copydefault();
            }
        } else if (c54536xML != null) {
            return c54536xML.AuCTel();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String EZpvd(@NotNull TradeOrderData tradeOrderData) {
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tradeOrderData.getInstType(), tradeOrderData.getInstId(), null, null, 12, null) : null;
        java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        java.lang.String strAEQbTJ = (instFamily == null || instFamily.length() == 0) ? xUW.KWHzl.AEQbTJ(tradeOrderData.getInstId()) : suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tradeOrderData.getInstType())) == null) {
            c54536xMLAYXKKw = null;
        } else {
            xMS xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(strAEQbTJ != null ? strAEQbTJ : "");
            if (xmsGEmmrt != null) {
                c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(tradeOrderData.getPx());
            }
        }
        C54536xML c54536xMLAEQbTJ = AEQbTJ(tradeOrderData.getSide(), c54536xMLAYXKKw);
        return (c54536xMLAEQbTJ == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAEQbTJ, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public static final boolean copydefault(@NotNull TradeOrderData tradeOrderData) {
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        return C59449zhJ.gEmmrt(tradeOrderData.getInstType(), "SPOT", true) && yDY.gEmmrt("adl", "twap", "full_liquidation", "partial_liquidation").contains(tradeOrderData.getCategory());
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String copydefault(@NotNull TradeOrderData tradeOrderData, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C54571xNh c54571xNhCreateTradeConverterWithIndex$default;
        java.lang.String strValues;
        java.lang.String upperCase;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLAEQbTJ;
        java.lang.String quoteSymbol;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (copydefault(tradeOrderData)) {
            strValues = xMR.copydefault.AhwBna(str, 4) + " " + tradeOrderData.getInstId();
        } else {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(tradeOrderData.getInstType()) : null;
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tradeOrderData.getInstType(), tradeOrderData.getInstId(), null, null, 12, null) : null;
            java.lang.String instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            java.lang.String strAEQbTJ = (instFamily == null || instFamily.length() == 0) ? xUW.KWHzl.AEQbTJ(tradeOrderData.getInstId()) : suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            if (!gEmmrt(tradeOrderData)) {
                if (abstractC54531xLwOLrzqt != null) {
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null);
                } else {
                    c54571xNhCreateTradeConverterWithIndex$default = null;
                }
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str2);
                }
                if (tradeOrderData.isHistory() && Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getInstType(), (java.lang.Object) "FUTURES") && C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderData.getCtVal())) {
                    if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                        java.lang.String ctVal = tradeOrderData.getCtVal();
                        Intrinsics.copydefault((java.lang.Object) ctVal);
                        c54571xNhCreateTradeConverterWithIndex$default.valueOf(ctVal);
                    }
                } else if (tradeOrderData.isHistory() && Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getInstType(), (java.lang.Object) "OPTION") && C33129mqd.OLrzqt((java.lang.CharSequence) tradeOrderData.getCtVal()) && c54571xNhCreateTradeConverterWithIndex$default != null) {
                    java.lang.String ctVal2 = tradeOrderData.getCtVal();
                    Intrinsics.copydefault((java.lang.Object) ctVal2);
                    c54571xNhCreateTradeConverterWithIndex$default.AEQbTJ(ctVal2);
                }
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    strValues = c54571xNhCreateTradeConverterWithIndex$default.values(str);
                }
            } else if (abstractC54531xLwOLrzqt == null) {
                strValues = null;
            } else {
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
                    upperCase = null;
                } else {
                    upperCase = quoteSymbol.toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                }
                C54571xNh c54571xNhAhwBna = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, upperCase);
                if (c54571xNhAhwBna != null && (c54536xMLDjBIcL = c54571xNhAhwBna.djBIcL(str)) != null && (c54536xMLIsConnected = c54536xMLDjBIcL.isConnected()) != null && (c54536xMLDjBIcL2 = c54536xMLIsConnected.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL2.fetchVPNInfo()) != null && (c54536xMLAEQbTJ = c54536xMLFetchVPNInfo.AEQbTJ()) != null) {
                    strValues = C54536xML.toSafeNoSignString$default(c54536xMLAEQbTJ, false, 1, null);
                }
            }
        }
        return strValues == null ? "" : strValues;
    }

    public static final java.lang.String OLrzqt(@NotNull TradeOrderData tradeOrderData, TradeOrderData tradeOrderData2, @NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strOLrzqt;
        java.lang.String px;
        java.lang.String strIwGUEr;
        java.lang.String px2;
        java.lang.String instId;
        java.lang.String instType;
        InterfaceC54577xNn interfaceC54577xNn;
        Intrinsics.checkNotNullParameter(tradeOrderData, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.lang.String strCopydefault = null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null) ? null : interfaceC54577xNn.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (tradeOrderData2 == null || (instType = tradeOrderData2.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        if (abstractC54531xLwOLrzqt != null) {
            if (tradeOrderData2 == null || (instId = tradeOrderData2.getInstId()) == null) {
                instId = "";
            }
            strCopydefault = abstractC54531xLwOLrzqt.copydefault(abstractC54531xLwOLrzqt.valueOf(instId));
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
            xOW newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance();
            if (newProxyInstance == null || (strIwGUEr = newProxyInstance.iwGUEr()) == null) {
                strIwGUEr = "";
            }
            return Intrinsics.EZpvd((java.lang.Object) strIwGUEr, (java.lang.Object) "2") ? (tradeOrderData2 == null || (px2 = tradeOrderData2.getPx()) == null) ? "" : px2 : str;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "inverse")) {
            return str;
        }
        xOW newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance();
        if (newProxyInstance2 == null || (strOLrzqt = newProxyInstance2.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        return Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0") ? (tradeOrderData2 == null || (px = tradeOrderData2.getPx()) == null) ? "" : px : str;
    }

    static {
        android.util.ArrayMap<java.lang.String, java.lang.Integer> arrayMap = new android.util.ArrayMap<>();
        arrayMap.put("live", java.lang.Integer.valueOf(C35964oKf.Fragment.OqhRBM));
        arrayMap.put("effective", java.lang.Integer.valueOf(C55688xof.Application.getContract));
        arrayMap.put("canceled", java.lang.Integer.valueOf(C55688xof.Application.provides));
        arrayMap.put("order_failed", java.lang.Integer.valueOf(C55688xof.Application.BackHandlerKtBackHandlerbackCallback11));
        KWHzl = arrayMap;
    }
}
