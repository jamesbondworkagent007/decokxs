package o;

import com.okinc.biz.TacticsType;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56059xvf {
    public static final C56059xvf EZpvd = new C56059xvf();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xvi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56059xvf.copydefault();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xvg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C56059xvf.EZpvd();
        }
    });
    public static final int AEQbTJ = 8;

    private C56059xvf() {
    }

    public static final xLY copydefault() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    public final xLY gEmmrt() {
        return (xLY) copydefault.getValue();
    }

    public final java.util.List<java.lang.String> valueOf() {
        return (java.util.List) KWHzl.getValue();
    }

    public static final java.util.List EZpvd() {
        return yDY.gEmmrt("grid", "contract_grid", "spot_dca", "contract_dca", "infinite_grid", "smart_arbitrage", "dcd_bot", "signal_bot", "recurring", "smart_portfolio", "arbitrage", "smart_iceberg", "twap", "ai_bot");
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, SmartArbListItem smartArbListItem, @NotNull java.lang.String str2) {
        java.lang.String instType;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dcd_bot") ? "SPOT" : str2;
        }
        SmartArbPlanLeg smartArbPlanLeg = null;
        java.lang.Object obj = null;
        smartArbPlanLeg = null;
        if (smartArbListItem != null && (planLeg = smartArbListItem.getPlanLeg()) != null) {
            java.util.Iterator<T> it = planLeg.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SmartArbPlanLeg) next).getInstType(), (java.lang.Object) "SWAP")) {
                    obj = next;
                    break;
                }
            }
            smartArbPlanLeg = (SmartArbPlanLeg) obj;
        }
        return (smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null) ? "SWAP" : instType;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, SmartArbListItem smartArbListItem, @NotNull java.lang.String str2) {
        java.lang.String instId;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            return str2;
        }
        SmartArbPlanLeg smartArbPlanLeg = null;
        java.lang.Object obj = null;
        smartArbPlanLeg = null;
        if (smartArbListItem != null && (planLeg = smartArbListItem.getPlanLeg()) != null) {
            java.util.Iterator<T> it = planLeg.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SmartArbPlanLeg) next).getInstType(), (java.lang.Object) "SWAP")) {
                    obj = next;
                    break;
                }
            }
            smartArbPlanLeg = (SmartArbPlanLeg) obj;
        }
        return (smartArbPlanLeg == null || (instId = smartArbPlanLeg.getInstId()) == null) ? "" : instId;
    }

    public final java.lang.String djBIcL() {
        BizInstrument bizInstrumentIsConnected = isConnected();
        if (bizInstrumentIsConnected != null) {
            return bizInstrumentIsConnected.getInstId();
        }
        return null;
    }

    public final java.lang.String AYXKKw() {
        BizInstrument bizInstrumentIsConnected = isConnected();
        if (bizInstrumentIsConnected != null) {
            return bizInstrumentIsConnected.getInstType();
        }
        return null;
    }

    public final BizInstrument isConnected() {
        return gEmmrt().EZpvd();
    }

    public final xMS OLrzqt() {
        BizInstrument bizInstrumentIsConnected = isConnected();
        if (bizInstrumentIsConnected == null) {
            return null;
        }
        return C54797xVr.copydefault.AEQbTJ(bizInstrumentIsConnected.getInstId(), bizInstrumentIsConnected.getInstType());
    }

    public static /* synthetic */ C54571xNh createAmtConvert$default(C56059xvf c56059xvf, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return c56059xvf.EZpvd(str, z);
    }

    public final C54571xNh EZpvd(java.lang.String str, boolean z) {
        BizInstrument bizInstrumentIsConnected = isConnected();
        if (bizInstrumentIsConnected == null) {
            return null;
        }
        if (yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentIsConnected.getInstType())) {
            return C54566xNc.OLrzqt(bizInstrumentIsConnected.getInstType(), bizInstrumentIsConnected.getInstFamily(), z ? bizInstrumentIsConnected.getQuoteSymbol() : null);
        }
        return C54797xVr.createAmtConvertor$default(C54797xVr.copydefault, bizInstrumentIsConnected.getInstId(), bizInstrumentIsConnected.getInstType(), str, z, null, 16, null);
    }

    public static /* synthetic */ C54571xNh createAmtConvertForAvailableAmt$default(C56059xvf c56059xvf, java.lang.String str, boolean z, BizInstrument bizInstrument, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            bizInstrument = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return c56059xvf.copydefault(str, z, bizInstrument, str2);
    }

    public final C54571xNh copydefault(java.lang.String str, boolean z, BizInstrument bizInstrument, java.lang.String str2) {
        if (bizInstrument == null && (bizInstrument = isConnected()) == null) {
            return null;
        }
        if (yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrument.getInstType())) {
            return C54566xNc.OLrzqt(bizInstrument.getInstType(), bizInstrument.getInstFamily(), z ? bizInstrument.getQuoteSymbol() : null);
        }
        return C54797xVr.copydefault.KWHzl(bizInstrument.getInstId(), bizInstrument.getInstType(), str, z, str2);
    }

    public final boolean AuCTel() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        xLF xlf = abstractC54531xLwOLrzqt instanceof xLF ? (xLF) abstractC54531xLwOLrzqt : null;
        if (xlf != null) {
            java.lang.String strDjBIcL = djBIcL();
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            if (xlf.KWHzl(strDjBIcL)) {
                return true;
            }
        }
        return false;
    }

    public final boolean fIwbmz() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.zuBGHE()) ? false : true;
    }

    public final boolean AkhnZx() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.AuCTel()) ? false : true;
    }

    public final boolean values() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "net_mode");
    }

    public final boolean DbNXlk() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode");
    }

    public final boolean fetchVPNInfo() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            return false;
        }
        return newProxyInstance.gHZMYf();
    }

    public final boolean fJNWhG() {
        xOV xovAhwBna = AhwBna();
        return xovAhwBna != null && xovAhwBna.EZpvd() && fetchVPNInfo() && AuCTel();
    }

    public final xOV AhwBna() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) {
            return null;
        }
        return newProxyInstance.EZpvd();
    }

    public final java.util.List<TacticsType> copydefault(@NotNull java.lang.String str) {
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        TacticsType tacticsTypeAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && (listAEQbTJ = xorCopydefault.AEQbTJ()) != null) {
            for (OrderCategory orderCategory : listAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) orderCategory.getStrategyType(), (java.lang.Object) "smart_arbitrage")) {
                    if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ANY") && (tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(orderCategory.getStrategyType())) != null) {
                        arrayList.add(tacticsTypeAEQbTJ);
                    }
                } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) orderCategory.getInstTypeList(), (java.lang.CharSequence) str, false, 2, (java.lang.Object) null) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "ANY")) {
                    TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ(orderCategory.getStrategyType());
                    if (tacticsTypeAEQbTJ2 != null) {
                        arrayList.add(tacticsTypeAEQbTJ2);
                    }
                }
            }
        }
        return arrayList;
    }
}
