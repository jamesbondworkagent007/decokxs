package o;

import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.CoinLoanCheckBoxBean;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.manager.TradeQuoteCcyLoan;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xVo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54794xVo {
    public static final C54794xVo copydefault = new C54794xVo();

    private C54794xVo() {
    }

    public final AbstractC54531xLw OLrzqt(BizInstrument bizInstrument) {
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
            instType = "";
        }
        return interfaceC54581xNrOLrzqt.OLrzqt(instType);
    }

    public final java.lang.String EZpvd(BizInstrument bizInstrument) {
        java.lang.String strDjBIcL;
        AbstractC54531xLw abstractC54531xLwOLrzqt = OLrzqt(bizInstrument);
        return (abstractC54531xLwOLrzqt == null || bizInstrument == null || (strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(bizInstrument)) == null) ? "" : strDjBIcL;
    }

    public final boolean OLrzqt(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT");
    }

    public final boolean copydefault(java.lang.String str) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLF xlf = abstractC54531xLwOLrzqt instanceof xLF ? (xLF) abstractC54531xLwOLrzqt : null;
        if (xlf != null) {
            if (str == null) {
                str = "";
            }
            if (xlf.KWHzl(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean AhwBna() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.zuBGHE()) ? false : true;
    }

    public final boolean valueOf() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.fJNWhG()) ? false : true;
    }

    public final boolean AYXKKw() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.AuCTel()) ? false : true;
    }

    public final boolean KWHzl() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.AhwBna()) ? false : true;
    }

    public final boolean EZpvd() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.gEmmrt()) ? false : true;
    }

    public final boolean KWHzl(BizInstrument bizInstrument) {
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = null;
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "cross");
    }

    public final boolean AhwBna(BizInstrument bizInstrument) {
        MarginModeManager marginModeManagerIsConnected;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = null;
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated");
    }

    public final boolean AEQbTJ() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode");
    }

    public final boolean OLrzqt() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            return false;
        }
        return newProxyInstance.gHZMYf();
    }

    public final boolean AEQbTJ(BizInstrument bizInstrument) {
        return KWHzl(bizInstrument) & CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("SWAP", "FUTURES")), bizInstrument != null ? bizInstrument.getInstType() : null) & KWHzl();
    }

    public final boolean KWHzl(java.lang.String str) {
        xOV xovCopydefault = copydefault();
        return xovCopydefault != null && xovCopydefault.EZpvd() && OLrzqt() && copydefault(str);
    }

    public final boolean djBIcL(BizInstrument bizInstrument) {
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
            if (KWHzl(bizInstrument != null ? bizInstrument.getInstId() : null) && KWHzl(bizInstrument)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean gEmmrt(BizInstrument bizInstrument) {
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        return true;
                    }
                    break;
                case -1956807563:
                    instType.equals("OPTION");
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        return KWHzl(bizInstrument != null ? bizInstrument.getInstId() : null);
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        if (!AEQbTJ(bizInstrument)) {
                        }
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                    }
                    break;
            }
        }
        return false;
    }

    public final xOV copydefault() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) {
            return null;
        }
        return newProxyInstance.EZpvd();
    }

    public static /* synthetic */ boolean needShowLendAmount$default(C54794xVo c54794xVo, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c54794xVo.KWHzl(z, str);
    }

    public final boolean KWHzl(boolean z, java.lang.String str) {
        return z & ((OLrzqt(str) & OLrzqt() & AYXKKw()) | Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) & (!KWHzl());
    }

    public final java.lang.String copydefault(BizInstrument bizInstrument) {
        CoinLoanCheckBoxBean coinLoanCheckBoxBeanCopydefault;
        java.util.List<TradeQuoteCcyLoan> tradeQuoteCcyList;
        java.lang.String instId;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.util.ArrayList arrayList = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
        if (xll != null) {
            if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                instId = "";
            }
            coinLoanCheckBoxBeanCopydefault = xll.copydefault(instId);
        } else {
            coinLoanCheckBoxBeanCopydefault = null;
        }
        if (coinLoanCheckBoxBeanCopydefault != null && (tradeQuoteCcyList = coinLoanCheckBoxBeanCopydefault.getTradeQuoteCcyList()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : tradeQuoteCcyList) {
                if (Intrinsics.EZpvd(((TradeQuoteCcyLoan) obj).getBuyCheckBox(), java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TradeQuoteCcyLoan) it.next()).getTradeQuoteCcy());
            }
        }
        java.util.ArrayList arrayList3 = arrayList;
        return (arrayList3 == null || arrayList3.isEmpty()) ? "" : CollectionsKt___CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ boolean isSpotBuySideSupportLoan$default(C54794xVo c54794xVo, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c54794xVo.AEQbTJ(bizInstrument, str);
    }

    public final boolean AEQbTJ(BizInstrument bizInstrument, java.lang.String str) {
        CoinLoanCheckBoxBean coinLoanCheckBoxBeanCopydefault;
        java.util.List<TradeQuoteCcyLoan> tradeQuoteCcyList;
        java.lang.String instId;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        TradeQuoteCcyLoan tradeQuoteCcyLoan = null;
        java.lang.Object obj = null;
        tradeQuoteCcyLoan = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
        if (xll != null) {
            if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                instId = "";
            }
            coinLoanCheckBoxBeanCopydefault = xll.copydefault(instId);
        } else {
            coinLoanCheckBoxBeanCopydefault = null;
        }
        if (str == null || str.length() == 0) {
            if (coinLoanCheckBoxBeanCopydefault != null) {
                return Intrinsics.EZpvd(coinLoanCheckBoxBeanCopydefault.getBuyCheckBox(), java.lang.Boolean.TRUE);
            }
            return false;
        }
        if (coinLoanCheckBoxBeanCopydefault != null && (tradeQuoteCcyList = coinLoanCheckBoxBeanCopydefault.getTradeQuoteCcyList()) != null) {
            java.util.Iterator<T> it = tradeQuoteCcyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TradeQuoteCcyLoan) next).getTradeQuoteCcy(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            tradeQuoteCcyLoan = (TradeQuoteCcyLoan) obj;
        }
        if (tradeQuoteCcyLoan != null) {
            return Intrinsics.EZpvd(tradeQuoteCcyLoan.getBuyCheckBox(), java.lang.Boolean.TRUE);
        }
        if (coinLoanCheckBoxBeanCopydefault != null) {
            return Intrinsics.EZpvd(coinLoanCheckBoxBeanCopydefault.getBuyCheckBox(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public static /* synthetic */ boolean isSpotSellSideSupportLoan$default(C54794xVo c54794xVo, BizInstrument bizInstrument, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c54794xVo.KWHzl(bizInstrument, str);
    }

    public final boolean KWHzl(BizInstrument bizInstrument, java.lang.String str) {
        CoinLoanCheckBoxBean coinLoanCheckBoxBeanCopydefault;
        java.util.List<TradeQuoteCcyLoan> tradeQuoteCcyList;
        java.lang.String instId;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        TradeQuoteCcyLoan tradeQuoteCcyLoan = null;
        java.lang.Object obj = null;
        tradeQuoteCcyLoan = null;
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLL xll = abstractC54531xLwOLrzqt instanceof xLL ? (xLL) abstractC54531xLwOLrzqt : null;
        if (xll != null) {
            if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
                instId = "";
            }
            coinLoanCheckBoxBeanCopydefault = xll.copydefault(instId);
        } else {
            coinLoanCheckBoxBeanCopydefault = null;
        }
        if (str == null || str.length() == 0) {
            if (coinLoanCheckBoxBeanCopydefault != null) {
                return Intrinsics.EZpvd(coinLoanCheckBoxBeanCopydefault.getSellCheckBox(), java.lang.Boolean.TRUE);
            }
            return false;
        }
        if (coinLoanCheckBoxBeanCopydefault != null && (tradeQuoteCcyList = coinLoanCheckBoxBeanCopydefault.getTradeQuoteCcyList()) != null) {
            java.util.Iterator<T> it = tradeQuoteCcyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TradeQuoteCcyLoan) next).getTradeQuoteCcy(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            tradeQuoteCcyLoan = (TradeQuoteCcyLoan) obj;
        }
        if (tradeQuoteCcyLoan != null) {
            return Intrinsics.EZpvd(tradeQuoteCcyLoan.getSellCheckBox(), java.lang.Boolean.TRUE);
        }
        if (coinLoanCheckBoxBeanCopydefault != null) {
            return Intrinsics.EZpvd(coinLoanCheckBoxBeanCopydefault.getSellCheckBox(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public static /* synthetic */ boolean isSupportSettlement$default(C54794xVo c54794xVo, java.lang.String str, java.lang.String str2, TradePositionManager.MarginModeType marginModeType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            marginModeType = null;
        }
        return c54794xVo.AEQbTJ(str, str2, marginModeType);
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2, TradePositionManager.MarginModeType marginModeType) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") && (marginModeType == TradePositionManager.MarginModeType.CROSSED || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "cross"));
    }

    public final boolean valueOf(BizInstrument bizInstrument) {
        C54606xOp c54606xOpOcIXYQ;
        if (bizInstrument != null && bizInstrument.isUSDUMContract() && C55697xoo.OLrzqt.isConnected()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.util.List<java.lang.String> listDjSkpj = (interfaceC54581xNrOLrzqt == null || (c54606xOpOcIXYQ = interfaceC54581xNrOLrzqt.OcIXYQ()) == null) ? null : c54606xOpOcIXYQ.djSkpj();
            if (listDjSkpj == null || listDjSkpj.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
