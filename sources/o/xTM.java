package o;

import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.trade.model.IndexSourceData;
import com.okinc.unify_trade.trade.model.WatchMarketData;
import kotlin.Result;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xTM {
    public static final xTM AEQbTJ = new xTM();
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xTN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xTM.EZpvd();
        }
    });
    public static final int KWHzl = 8;

    private xTM() {
    }

    public final qTB AEQbTJ() {
        return (qTB) OLrzqt.getValue();
    }

    public static final qTB EZpvd() {
        return (qTB) C43251rlk.copydefault(qTB.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [59=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(@NotNull WatchMarketData watchMarketData) {
        Intrinsics.checkNotNullParameter(watchMarketData, "");
        java.lang.String instType = watchMarketData.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                return !instType.equals("MARGIN") ? "" : KWHzl(watchMarketData);
            case -1956807563:
                return !instType.equals("OPTION") ? "" : formatOptionChargePrice$default(this, watchMarketData, false, 2, null);
            case 2074257:
                return instType.equals("COIN") ? copydefault((MarketDataSource) watchMarketData) : "";
            case 2552066:
                return !instType.equals("SPOT") ? "" : KWHzl(watchMarketData);
            case 2558355:
                if (!instType.equals("SWAP")) {
                    return "";
                }
                break;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return EZpvd((MarketDataSource) watchMarketData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [71=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(@NotNull WatchMarketData watchMarketData) {
        Intrinsics.checkNotNullParameter(watchMarketData, "");
        java.lang.String instType = watchMarketData.getInstType();
        switch (instType.hashCode()) {
            case -2027980370:
                return !instType.equals("MARGIN") ? "" : EZpvd(watchMarketData, true);
            case -1956807563:
                return !instType.equals("OPTION") ? "" : OLrzqt(watchMarketData, true);
            case 2074257:
                return instType.equals("COIN") ? copydefault((MarketDataSource) watchMarketData) : "";
            case 2552066:
                return !instType.equals("SPOT") ? "" : EZpvd(watchMarketData, true);
            case 2558355:
                if (!instType.equals("SWAP")) {
                    return "";
                }
                break;
            case 214415088:
                if (!instType.equals("FUTURES")) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return copydefault(watchMarketData, true);
    }

    public final java.lang.String KWHzl(@NotNull MarketDataSource marketDataSource) {
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        java.lang.String tickerPrice = marketDataSource.getTickerPrice();
        if (tickerPrice != null && tickerPrice.length() != 0) {
            pWO.KWHzl().copydefault();
            AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketDataSource.getInstType());
            xMS xmsGEmmrt = abstractC54531xLwKWHzl != null ? abstractC54531xLwKWHzl.gEmmrt(marketDataSource.getIndex()) : null;
            if (xmsGEmmrt != null) {
                java.lang.String tickerPrice2 = marketDataSource.getTickerPrice();
                C54536xML c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(tickerPrice2 != null ? tickerPrice2 : "");
                if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "--";
    }

    public static /* synthetic */ java.lang.String formatSpotCupTicker$default(xTM xtm, MarketDataSource marketDataSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return xtm.EZpvd(marketDataSource, z);
    }

    public final java.lang.String EZpvd(@NotNull MarketDataSource marketDataSource, boolean z) {
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        return formatTickerPrice$default(this, marketDataSource.getTickerPrice(), marketDataSource.getQuoteCupTickerPrice(), marketDataSource.getCupTickerPrice(), interfaceC54581xNrCopydefault, false, 16, null);
    }

    public static /* synthetic */ java.lang.String formatTickerPrice$default(xTM xtm, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC54581xNr interfaceC54581xNr, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return xtm.AEQbTJ(str, str2, str3, interfaceC54581xNr, z);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC54581xNr interfaceC54581xNr, boolean z) {
        java.lang.Object objM7377constructorimpl;
        xMW xmwKWHzl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) ? null : java.lang.String.valueOf(java.lang.Double.parseDouble(str) * java.lang.Double.parseDouble(str2)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String str4 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (str4 != null) {
            str = str4;
        } else if (str3 != null) {
            str = str3;
        } else if (str == null) {
            str = "";
        }
        if (z) {
            return AEQbTJ(str);
        }
        if (interfaceC54581xNr == null || (xmwKWHzl = interfaceC54581xNr.KWHzl()) == null) {
            return "";
        }
        C54536xML c54536xMLAYXKKw = xmwKWHzl.AYXKKw(str);
        c54536xMLAYXKKw.values();
        java.lang.String strEZpvd = c54536xMLAYXKKw.AkhnZx().isConnected().djBIcL().EZpvd(true);
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if ((interfaceC54581xNrOLrzqt == null || !interfaceC54581xNrOLrzqt.AEQbTJ(new xNE())) && (interfaceC54581xNrOLrzqt == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null))) {
            return str.length() == 0 ? "--" : AEQbTJ().KWHzl(str);
        }
        xMW xmwKWHzl = interfaceC54581xNrOLrzqt.KWHzl();
        if (xmwKWHzl == null) {
            return "";
        }
        C54536xML c54536xMLAYXKKw = xmwKWHzl.AYXKKw(str);
        c54536xMLAYXKKw.values();
        java.lang.String strEZpvd = c54536xMLAYXKKw.AkhnZx().isConnected().djBIcL().EZpvd(true);
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        xMW xmwKWHzl;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String strEZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (interfaceC54581xNrCopydefault == null || (xmwKWHzl = interfaceC54581xNrCopydefault.KWHzl()) == null) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        C54536xML c54536xMLAYXKKw = xmwKWHzl.AYXKKw(str);
        if (c54536xMLAYXKKw == null) {
            return "";
        }
        c54536xMLAYXKKw.values();
        C54536xML c54536xMLAkhnZx = c54536xMLAYXKKw.AkhnZx();
        return (c54536xMLAkhnZx == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (strEZpvd = c54536xMLDjBIcL.EZpvd(true)) == null) ? "" : strEZpvd;
    }

    public final java.lang.String OLrzqt(@NotNull MarketDataSource marketDataSource) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        java.lang.String tickerPrice = marketDataSource.getTickerPrice();
        if (tickerPrice == null || tickerPrice.length() == 0) {
            return "--";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        xMW xmwKWHzl = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.KWHzl() : null;
        if (xmwKWHzl != null) {
            java.lang.String tickerPrice2 = marketDataSource.getTickerPrice();
            if (tickerPrice2 == null) {
                tickerPrice2 = "";
            }
            c54536xMLAYXKKw = xmwKWHzl.AYXKKw(tickerPrice2);
        } else {
            c54536xMLAYXKKw = null;
        }
        if (c54536xMLAYXKKw != null) {
            c54536xMLAYXKKw.values();
        }
        return (c54536xMLAYXKKw == null || (c54536xMLAkhnZx = c54536xMLAYXKKw.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final java.lang.String copydefault(@NotNull MarketDataSource marketDataSource) {
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if ((interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.AEQbTJ(new xNE())) || (interfaceC54581xNrOLrzqt != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null))) {
            return OLrzqt(marketDataSource);
        }
        java.lang.String tickerPrice = marketDataSource.getTickerPrice();
        return (tickerPrice == null || tickerPrice.length() == 0) ? "--" : AEQbTJ().KWHzl(tickerPrice);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: o.xLw */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(@NotNull MarketDataSource marketDataSource) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketDataSource.getInstType());
        java.lang.String instId = marketDataSource.getInstId();
        BizInstrument bizInstrumentValueOf = (instId == null || abstractC54531xLwKWHzl == 0) ? null : abstractC54531xLwKWHzl.valueOf(instId);
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPositiveContract()) {
            if (!(abstractC54531xLwKWHzl instanceof InterfaceC54532xLx)) {
                return "";
            }
            xMS xmsGEmmrt = abstractC54531xLwKWHzl.gEmmrt(marketDataSource.getIndex());
            java.lang.String tickerPrice = marketDataSource.getTickerPrice();
            return C54536xML.toSafeString$default(xmsGEmmrt.AYXKKw(tickerPrice != null ? tickerPrice : "").djBIcL(), false, 1, null);
        }
        if (!(abstractC54531xLwKWHzl instanceof InterfaceC54532xLx)) {
            return "";
        }
        xMS xmsCopydefault = ((InterfaceC54532xLx) abstractC54531xLwKWHzl).copydefault(marketDataSource.getIndex());
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AEQbTJ("USD")) == null) {
            Triple<java.lang.String, java.lang.String, java.lang.Integer> tripleCopydefault = ((qTB) C43251rlk.copydefault(qTB.class)).copydefault("USD");
            xmsCopydefault.KWHzl(tripleCopydefault.getFirst(), tripleCopydefault.getSecond(), java.lang.String.valueOf(tripleCopydefault.getThird().intValue()), tripleCopydefault.getFirst(), tripleCopydefault.getSecond(), java.lang.String.valueOf(tripleCopydefault.getThird().intValue()), true);
        }
        java.lang.String tickerPrice2 = marketDataSource.getTickerPrice();
        return C54536xML.toSafeString$default(xmsCopydefault.AYXKKw(tickerPrice2 != null ? tickerPrice2 : "").values().AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    public final java.lang.String AEQbTJ(@NotNull MarketDataSource marketDataSource) {
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        java.lang.String tickerPrice = marketDataSource.getTickerPrice();
        if (tickerPrice == null || tickerPrice.length() == 0) {
            return "--";
        }
        pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketDataSource.getInstType());
        java.lang.String instId = marketDataSource.getInstId();
        BizInstrument bizInstrumentValueOf = (instId == null || abstractC54531xLwKWHzl == null) ? null : abstractC54531xLwKWHzl.valueOf(instId);
        if (bizInstrumentValueOf != null && bizInstrumentValueOf.isPositiveContract()) {
            if (!(abstractC54531xLwKWHzl instanceof InterfaceC54532xLx)) {
                return "";
            }
            xMS xmsGEmmrt = abstractC54531xLwKWHzl.gEmmrt(marketDataSource.getIndex());
            java.lang.String tickerPrice2 = marketDataSource.getTickerPrice();
            return C54536xML.toSafeString$default(xmsGEmmrt.AYXKKw(tickerPrice2 != null ? tickerPrice2 : "").djBIcL(), false, 1, null);
        }
        if (!(abstractC54531xLwKWHzl instanceof InterfaceC54532xLx)) {
            return "";
        }
        xMS xmsGEmmrt2 = abstractC54531xLwKWHzl.gEmmrt(marketDataSource.getIndex());
        java.lang.String tickerPrice3 = marketDataSource.getTickerPrice();
        return C54536xML.toSafeString$default(xmsGEmmrt2.AYXKKw(tickerPrice3 != null ? tickerPrice3 : "").values().AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    public static /* synthetic */ java.lang.String formatFutureChargePrice$default(xTM xtm, MarketDataSource marketDataSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return xtm.copydefault(marketDataSource, z);
    }

    public final java.lang.String copydefault(@NotNull MarketDataSource marketDataSource, boolean z) {
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketDataSource.getInstType());
        java.lang.String instId = marketDataSource.getInstId();
        BizInstrument bizInstrumentValueOf = (instId == null || abstractC54531xLwKWHzl == null) ? null : abstractC54531xLwKWHzl.valueOf(instId);
        if (bizInstrumentValueOf != null && Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE)) {
            if ((interfaceC54581xNrCopydefault != null && interfaceC54581xNrCopydefault.AEQbTJ(new xNE())) || (interfaceC54581xNrCopydefault != null && InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrCopydefault, null, 1, null))) {
                return AEQbTJ(marketDataSource);
            }
            qTB qtbAEQbTJ = AEQbTJ();
            java.lang.String tickerPrice = marketDataSource.getTickerPrice();
            return qtbAEQbTJ.KWHzl(tickerPrice != null ? tickerPrice : "");
        }
        return AEQbTJ(marketDataSource.getTickerPrice(), marketDataSource.getQuoteCupTickerPrice(), marketDataSource.getTickerPrice(), interfaceC54581xNrCopydefault, z);
    }

    public static /* synthetic */ java.lang.String formatOptionChargePrice$default(xTM xtm, MarketDataSource marketDataSource, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return xtm.OLrzqt(marketDataSource, z);
    }

    public final java.lang.String OLrzqt(@NotNull MarketDataSource marketDataSource, boolean z) {
        xMS xmsGEmmrt;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(marketDataSource, "");
        java.lang.String tickerPrice = marketDataSource.getTickerPrice();
        if (tickerPrice == null || tickerPrice.length() == 0) {
            return "--";
        }
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl(marketDataSource.getInstType());
        if (abstractC54531xLwKWHzl == null || (xmsGEmmrt = abstractC54531xLwKWHzl.gEmmrt(marketDataSource.getIndex())) == null) {
            return "";
        }
        java.lang.String tickerPrice2 = marketDataSource.getTickerPrice();
        if (tickerPrice2 == null) {
            tickerPrice2 = "";
        }
        C54536xML c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(tickerPrice2);
        return (c54536xMLAYXKKw == null || (c54536xMLAkhnZx = c54536xMLAYXKKw.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final java.lang.String copydefault(@NotNull IndexSourceData indexSourceData) {
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        java.lang.String strAEQbTJ = TaskDescription.AEQbTJ(indexSourceData.getInstId()).AEQbTJ();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
            java.lang.String symbol = (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ.getSymbol();
            if (symbol == null) {
                return ((qTB) C43251rlk.copydefault(qTB.class)).KWHzl(indexSourceData.getTickerPx());
            }
            return symbol + pTB.formatLocalized$default(indexSourceData.getTickerPx(), null, 1, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        return (interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AYXKKw(upperCase) : null) + pTB.formatLocalized$default(indexSourceData.getTickerPx(), null, 1, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull IndexSourceData indexSourceData) {
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAkhnZx;
        C54536xML c54536xMLIsConnected;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        xMW xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
        if (xmwKWHzl != null) {
            java.lang.String cupPrice = indexSourceData.getCupPrice();
            if (cupPrice == null) {
                cupPrice = "";
            }
            c54536xMLAYXKKw = xmwKWHzl.AYXKKw(cupPrice);
        } else {
            c54536xMLAYXKKw = null;
        }
        if (c54536xMLAYXKKw != null) {
            c54536xMLAYXKKw.values();
        }
        return (c54536xMLAYXKKw == null || (c54536xMLAkhnZx = c54536xMLAYXKKw.AkhnZx()) == null || (c54536xMLIsConnected = c54536xMLAkhnZx.isConnected()) == null || (c54536xMLDjBIcL = c54536xMLIsConnected.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "" : safeString$default;
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull IndexSourceData indexSourceData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(indexSourceData, "");
        java.lang.String strAEQbTJ = TaskDescription.AEQbTJ(indexSourceData.getInstId()).AEQbTJ();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USD") && Intrinsics.EZpvd((java.lang.Object) upperCase, (java.lang.Object) "USD")) ? false : true;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String strValues;
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 != null && str2.length() != 0) {
            str = C33129mqd.subS$default(str, str2, null, null, null, 14, null);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        xMW xmwKWHzl = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.KWHzl() : null;
        return (xmwKWHzl == null || (strValues = xmwKWHzl.values(str)) == null) ? "" : strValues;
    }
}
