package o;

import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizInfo;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.IdxCcyConfig;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.InstrumentInfo;
import com.okinc.unify_trade.biz.TradeConfigData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xUl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54764xUl implements InterfaceC54763xUk {
    public final CoroutineScope AEQbTJ;
    public final FavoriteBizInfo EZpvd;
    public final java.util.HashMap<java.lang.String, AbstractC54531xLw> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [87=5, 97=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C54764xUl(@NotNull FavoriteBizInfo favoriteBizInfo) {
        java.util.List<IdxCcyConfig> idxCcyConfig;
        java.util.List<IdxConfig> idxConfig;
        Intrinsics.checkNotNullParameter(favoriteBizInfo, "");
        this.EZpvd = favoriteBizInfo;
        this.copydefault = new java.util.HashMap<>();
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        pWO.KWHzl().EZpvd(favoriteBizInfo != null ? new FavoriteBizInfo(null, null, favoriteBizInfo.getMCoinList()) : null);
        java.util.ArrayList<InstrumentInfo> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList3 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList4 = new java.util.ArrayList<>();
        java.util.ArrayList<InstrumentInfo> arrayList5 = new java.util.ArrayList<>();
        FavoriteBizInst mBizInstList = favoriteBizInfo.getMBizInstList();
        if (mBizInstList != null) {
            if (!mBizInstList.getSPOT().isEmpty()) {
                arrayList.addAll(mBizInstList.getSPOT());
            }
            if (!mBizInstList.getSWAP().isEmpty()) {
                arrayList3.addAll(mBizInstList.getSWAP());
            }
            if (!mBizInstList.getFUTURES().isEmpty()) {
                arrayList4.addAll(mBizInstList.getFUTURES());
            }
            if (!mBizInstList.getOPTION().isEmpty()) {
                arrayList5.addAll(mBizInstList.getOPTION());
            }
            if (!mBizInstList.getMARGIN().isEmpty()) {
                arrayList2.addAll(mBizInstList.getMARGIN());
            }
        }
        TradeConfigData tradeConfigData = new TradeConfigData((java.util.ArrayList) null, (java.util.ArrayList) null, 3, (DefaultConstructorMarker) null);
        TradeConfigData tradeConfigData2 = new TradeConfigData((java.util.ArrayList) null, (java.util.ArrayList) null, 3, (DefaultConstructorMarker) null);
        TradeConfigData tradeConfigData3 = new TradeConfigData((java.util.ArrayList) null, (java.util.ArrayList) null, 3, (DefaultConstructorMarker) null);
        TradeConfigData tradeConfigData4 = new TradeConfigData((java.util.ArrayList) null, (java.util.ArrayList) null, 3, (DefaultConstructorMarker) null);
        TradeConfigData tradeConfigData5 = new TradeConfigData((java.util.ArrayList) null, (java.util.ArrayList) null, 3, (DefaultConstructorMarker) null);
        FavoriteBizConfig mBizConfigList = favoriteBizInfo.getMBizConfigList();
        if (mBizConfigList != null && (idxConfig = mBizConfigList.getIdxConfig()) != null) {
            java.util.Iterator it = idxConfig.iterator();
            while (it.hasNext()) {
                java.util.Iterator it2 = it;
                IdxConfig idxConfig2 = (IdxConfig) it.next();
                java.util.ArrayList<InstrumentInfo> arrayList6 = arrayList4;
                java.lang.String instType = idxConfig2.getInstType();
                switch (instType.hashCode()) {
                    case -2027980370:
                        if (instType.equals("MARGIN")) {
                            tradeConfigData2.putIdxConfig(AEQbTJ(idxConfig2));
                        }
                        break;
                    case -1956807563:
                        if (instType.equals("OPTION")) {
                            tradeConfigData5.putIdxConfig(AEQbTJ(idxConfig2));
                        }
                        break;
                    case 2552066:
                        if (instType.equals("SPOT")) {
                            tradeConfigData.putIdxConfig(AEQbTJ(idxConfig2));
                        }
                        break;
                    case 2558355:
                        if (instType.equals("SWAP")) {
                            tradeConfigData3.putIdxConfig(AEQbTJ(idxConfig2));
                        }
                        break;
                    case 214415088:
                        if (instType.equals("FUTURES")) {
                            tradeConfigData4.putIdxConfig(AEQbTJ(idxConfig2));
                        }
                        break;
                }
                it = it2;
                arrayList4 = arrayList6;
            }
        }
        java.util.ArrayList<InstrumentInfo> arrayList7 = arrayList4;
        FavoriteBizConfig mBizConfigList2 = this.EZpvd.getMBizConfigList();
        if (mBizConfigList2 != null && (idxCcyConfig = mBizConfigList2.getIdxCcyConfig()) != null) {
            java.util.Iterator it3 = idxCcyConfig.iterator();
            while (it3.hasNext()) {
                IdxCcyConfig idxCcyConfig2 = (IdxCcyConfig) it3.next();
                java.util.Iterator it4 = it3;
                java.lang.String instType2 = idxCcyConfig2.getInstType();
                switch (instType2.hashCode()) {
                    case -2027980370:
                        if (instType2.equals("MARGIN")) {
                            tradeConfigData2.putIdxCcyConfig(idxCcyConfig2);
                        }
                        break;
                    case -1956807563:
                        if (instType2.equals("OPTION")) {
                            tradeConfigData5.putIdxCcyConfig(idxCcyConfig2);
                        }
                        break;
                    case 2552066:
                        if (instType2.equals("SPOT")) {
                            tradeConfigData.putIdxCcyConfig(idxCcyConfig2);
                        }
                        break;
                    case 2558355:
                        if (instType2.equals("SWAP")) {
                            tradeConfigData3.putIdxCcyConfig(idxCcyConfig2);
                        }
                        break;
                    case 214415088:
                        if (instType2.equals("FUTURES")) {
                            tradeConfigData4.putIdxCcyConfig(idxCcyConfig2);
                        }
                        break;
                }
                it3 = it4;
            }
        }
        AEQbTJ("SPOT", arrayList, tradeConfigData);
        AEQbTJ("MARGIN", arrayList2, tradeConfigData2);
        AEQbTJ("SWAP", arrayList3, tradeConfigData3);
        AEQbTJ("FUTURES", arrayList7, tradeConfigData4);
        AEQbTJ("OPTION", arrayList5, tradeConfigData5);
    }

    public final IdxConfig AEQbTJ(@NotNull IdxConfig idxConfig) {
        Intrinsics.checkNotNullParameter(idxConfig, "");
        return idxConfig.copy((1704783 & 1) != 0 ? idxConfig.referId : null, (1704783 & 2) != 0 ? idxConfig.instType : null, (1704783 & 4) != 0 ? idxConfig.baseDig : null, (1704783 & 8) != 0 ? idxConfig.quoteDig : null, (1704783 & 16) != 0 ? idxConfig.feeDig : "", (1704783 & 32) != 0 ? idxConfig.quoteFeeDig : "", (1704783 & 64) != 0 ? idxConfig.marginDig : null, (1704783 & 128) != 0 ? idxConfig.profitDig : "", (1704783 & 256) != 0 ? idxConfig.contractDig : null, (1704783 & 512) != 0 ? idxConfig.sheetDig : null, (1704783 & 1024) != 0 ? idxConfig.greeksDig : "", (1704783 & 2048) != 0 ? idxConfig.fundingFeeDig : "", (1704783 & 4096) != 0 ? idxConfig.positionDig : "", (1704783 & 8192) != 0 ? idxConfig.marketMaxSz : "", (1704783 & 16384) != 0 ? idxConfig.marketStopMaxSz : "", (1704783 & 32768) != 0 ? idxConfig.marketEntrustMaxSz : "", (1704783 & 65536) != 0 ? idxConfig.marketPlanEntrustMaxSz : "", (1704783 & 131072) != 0 ? idxConfig.tickConfig : null, (1704783 & 262144) != 0 ? idxConfig.depthLvl : yDY.AhwBna(), (1704783 & 524288) != 0 ? idxConfig.displayId : null, (1704783 & 1048576) != 0 ? idxConfig.baseDigDisplay : null);
    }

    public final void AEQbTJ(java.lang.String str, java.util.ArrayList<InstrumentInfo> arrayList, TradeConfigData tradeConfigData) {
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC54531xLw abstractC54531xLwKWHzl = KWHzl(str);
        if (abstractC54531xLwKWHzl == null || !AbstractC54531xLw.isInitFun$default(abstractC54531xLwKWHzl, false, 1, null)) {
            if (abstractC54531xLwKWHzl != null) {
                abstractC54531xLwKWHzl.KWHzl(arrayList);
            }
            if (abstractC54531xLwKWHzl != null) {
                abstractC54531xLwKWHzl.EZpvd(tradeConfigData.getIdxConfig());
            }
            if (abstractC54531xLwKWHzl != null) {
                abstractC54531xLwKWHzl.AEQbTJ(tradeConfigData.getIdxCcyConfig());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [151=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.InterfaceC54763xUk
    public AbstractC54531xLw KWHzl(@NotNull java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        AbstractC54531xLw xld = null;
        if (interfaceC54581xNrOLrzqt == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt2.djBIcL(str)) != null && AbstractC54531xLw.isInitFun$default(abstractC54531xLwDjBIcL, false, 1, null)) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt3 != null) {
                return interfaceC54581xNrOLrzqt3.djBIcL(str);
            }
            return null;
        }
        java.util.HashMap<java.lang.String, AbstractC54531xLw> map = this.copydefault;
        AbstractC54531xLw abstractC54531xLw = map.get(str);
        if (abstractC54531xLw == null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        xld = new xLD(interfaceC54581xNrOLrzqt.djBIcL());
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        xld = new xLJ(interfaceC54581xNrOLrzqt.djBIcL());
                    }
                    break;
                case 2552066:
                    if (str.equals("SPOT")) {
                        xld = new xLL(interfaceC54581xNrOLrzqt.djBIcL());
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        xld = new xLU(interfaceC54581xNrOLrzqt.djBIcL());
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        xld = new xLC(interfaceC54581xNrOLrzqt.djBIcL());
                    }
                    break;
            }
            map.put(str, xld);
            abstractC54531xLw = xld;
        }
        return abstractC54531xLw;
    }

    @Override // o.InterfaceC54763xUk
    public void AEQbTJ(InterfaceC54763xUk interfaceC54763xUk) {
        if (Intrinsics.EZpvd(interfaceC54763xUk, this)) {
            AbstractC54531xLw abstractC54531xLw = this.copydefault.get("SPOT");
            final xLL xll = abstractC54531xLw instanceof xLL ? (xLL) abstractC54531xLw : null;
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.xUm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C54764xUl.AEQbTJ(xll);
                }
            });
            this.copydefault.clear();
        }
    }

    public static final void AEQbTJ(xLL xll) {
        if (xll != null) {
            xll.wlaJM();
        }
    }

    public final void AEQbTJ(FavoriteBizInfo favoriteBizInfo) {
        synchronized (this) {
            if (favoriteBizInfo != null) {
                InterfaceC54763xUk.Companion.copydefault(this);
            }
        }
    }
}
