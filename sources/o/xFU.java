package o;

import com.okinc.biz.StrategyType;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.subscribe.BizTradeOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C54411xHk;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFU extends xGQ<java.util.List<? extends TradeOrderData>> implements InterfaceC55705xow {
    public volatile boolean AEQbTJ;
    public AbstractC55729xpT AYXKKw;
    public final CopyOnWriteArrayList<TradeOrderData> AhwBna;
    public final C54317xDy AkhnZx;
    public final java.lang.String DbNXlk;
    public boolean EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public final LinkedBlockingDeque<java.lang.String> copydefault;
    public java.lang.String djBIcL;
    public final C54318xDz fetchVPNInfo;
    public final CopyOnWriteArrayList<TradeOrderData> gEmmrt;
    public final xDA valueOf;
    public AbstractC57556yke values;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends TradeOrderData> list) {
        copydefault((java.util.List<TradeOrderData>) list);
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xFU(@NotNull java.lang.String str, AbstractC55729xpT abstractC55729xpT) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
        this.AYXKKw = abstractC55729xpT;
        this.KWHzl = "TradeOrderTask";
        this.gEmmrt = new CopyOnWriteArrayList<>();
        this.AhwBna = new CopyOnWriteArrayList<>();
        this.djBIcL = "";
        this.copydefault = new LinkedBlockingDeque<>();
        this.AkhnZx = new C54317xDy();
        this.fetchVPNInfo = new C54318xDz();
        this.valueOf = new xDA();
        copydefault((TradeOrderData) null);
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizTradeOrderReq bizTradeOrderReqKWHzl;
        AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
        if (abstractC55729xpT != null && (bizTradeOrderReqKWHzl = abstractC55729xpT.KWHzl()) != null && bizTradeOrderReqKWHzl.getHasWs()) {
            copydefault();
            this.EZpvd = false;
        }
        copydefault((TradeOrderData) null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (this.gEmmrt.size() > 0) {
            copydefault((TradeOrderData) CollectionsKt___CollectionsKt.AubY(this.gEmmrt));
        }
    }

    public final void copydefault(TradeOrderData tradeOrderData) {
        java.lang.String ordId;
        java.lang.String str;
        java.lang.String limit;
        this.AEQbTJ = false;
        AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
        java.lang.String strOLrzqt = abstractC55729xpT != null ? abstractC55729xpT.OLrzqt() : null;
        if (tradeOrderData == null) {
            this.gEmmrt.clear();
            ordId = null;
        } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "filledTime")) {
            ordId = tradeOrderData.getUTime();
        } else {
            ordId = tradeOrderData.getOrdId();
        }
        this.OLrzqt = ordId != null;
        AbstractC55729xpT abstractC55729xpT2 = this.AYXKKw;
        BizTradeOrderReq bizTradeOrderReqKWHzl = abstractC55729xpT2 != null ? abstractC55729xpT2.KWHzl() : null;
        AbstractC55729xpT abstractC55729xpT3 = this.AYXKKw;
        java.lang.Boolean boolValueOf = abstractC55729xpT3 != null ? java.lang.Boolean.valueOf(abstractC55729xpT3.EZpvd()) : null;
        str = "20";
        if (bizTradeOrderReqKWHzl != null && !bizTradeOrderReqKWHzl.isHistory()) {
            C54317xDy c54317xDy = this.AkhnZx;
            c54317xDy.AYXKKw(!Intrinsics.EZpvd((java.lang.Object) bizTradeOrderReqKWHzl.getInstType(), (java.lang.Object) "ANY") ? bizTradeOrderReqKWHzl.getInstType() : null);
            c54317xDy.OLrzqt(bizTradeOrderReqKWHzl.getInstFamily());
            c54317xDy.EZpvd(bizTradeOrderReqKWHzl.getInstId());
            c54317xDy.valueOf(bizTradeOrderReqKWHzl.getOrderType());
            c54317xDy.values(bizTradeOrderReqKWHzl.getState());
            c54317xDy.copydefault(ordId);
            java.lang.String limit2 = bizTradeOrderReqKWHzl.getLimit();
            c54317xDy.djBIcL(limit2 != null ? limit2 : "20");
            c54317xDy.gEmmrt(bizTradeOrderReqKWHzl.getStartTime());
            c54317xDy.AEQbTJ(bizTradeOrderReqKWHzl.getEndTime());
            c54317xDy.AhwBna(bizTradeOrderReqKWHzl.getSide());
            c54317xDy.KWHzl(bizTradeOrderReqKWHzl.getDirection());
            c54317xDy.DbNXlk(bizTradeOrderReqKWHzl.getTdMode());
            c54317xDy.KWHzl(new Function1() { // from class: o.xFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xFU.KWHzl(this.AEQbTJ, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c54317xDy, 0L, 1, null);
            return;
        }
        if (Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.TRUE)) {
            xDA xda = this.valueOf;
            xda.valueOf((Intrinsics.EZpvd((java.lang.Object) (bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstType() : null), (java.lang.Object) "ANY") || bizTradeOrderReqKWHzl == null) ? null : bizTradeOrderReqKWHzl.getInstType());
            xda.AEQbTJ(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstFamily() : null);
            xda.djBIcL(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstId() : null);
            xda.AYXKKw(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getOrderType() : null);
            xda.AkhnZx(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getState() : null);
            xda.EZpvd(ordId);
            if (bizTradeOrderReqKWHzl != null && (limit = bizTradeOrderReqKWHzl.getLimit()) != null) {
                str = limit;
            }
            xda.AhwBna(str);
            xda.isConnected(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getStartTime() : null);
            xda.copydefault(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getEndTime() : null);
            xda.gEmmrt(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getSide() : null);
            xda.KWHzl(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getDirection() : null);
            xda.values(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getTdMode() : null);
            xda.fetchVPNInfo(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.get_sortType() : null);
            xda.OLrzqt(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getConvertType() : null);
            xda.KWHzl(new Function1() { // from class: o.xFZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xFU.AEQbTJ(this.AEQbTJ, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(xda, 0L, 1, null);
            return;
        }
        C54318xDz c54318xDz = this.fetchVPNInfo;
        c54318xDz.AYXKKw((Intrinsics.EZpvd((java.lang.Object) (bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstType() : null), (java.lang.Object) "ANY") || bizTradeOrderReqKWHzl == null) ? null : bizTradeOrderReqKWHzl.getInstType());
        c54318xDz.EZpvd(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstFamily() : null);
        c54318xDz.copydefault(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getInstId() : null);
        c54318xDz.djBIcL(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getOrderType() : null);
        c54318xDz.values(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getState() : null);
        c54318xDz.KWHzl(ordId);
        c54318xDz.AhwBna("20");
        c54318xDz.DbNXlk(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getStartTime() : null);
        c54318xDz.AEQbTJ(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getEndTime() : null);
        c54318xDz.valueOf(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getSide() : null);
        c54318xDz.OLrzqt(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getDirection() : null);
        c54318xDz.isConnected(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.getTdMode() : null);
        c54318xDz.gEmmrt(bizTradeOrderReqKWHzl != null ? bizTradeOrderReqKWHzl.get_sortType() : null);
        c54318xDz.KWHzl(new Function1() { // from class: o.xGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFU.valueOf(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54318xDz, 0L, 1, null);
    }

    public static final Unit KWHzl(xFU xfu, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfu.EZpvd((ResponseData<java.util.List<TradeOrderData>>) responseData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(xFU xfu, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfu.EZpvd((ResponseData<java.util.List<TradeOrderData>>) responseData);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(xFU xfu, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfu.EZpvd((ResponseData<java.util.List<TradeOrderData>>) responseData);
        return Unit.INSTANCE;
    }

    private final void copydefault(java.util.List<TradeOrderData> list, boolean z) {
        AbstractC55729xpT abstractC55729xpT;
        BizTradeOrderReq bizTradeOrderReqKWHzl;
        AEQbTJ2(list);
        AbstractC55729xpT abstractC55729xpT2 = this.AYXKKw;
        if (abstractC55729xpT2 != null) {
            abstractC55729xpT2.KWHzl("http", this.gEmmrt, this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55729xpT = this.AYXKKw) == null || (bizTradeOrderReqKWHzl = abstractC55729xpT.KWHzl()) == null || !bizTradeOrderReqKWHzl.getHasWs()) {
            return;
        }
        gEmmrt();
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    private final void AEQbTJ2(java.util.List<TradeOrderData> list) {
        this.gEmmrt.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    private final void gEmmrt() {
        BizTradeOrderReq bizTradeOrderReqKWHzl;
        BizTradeOrderReq bizTradeOrderReqKWHzl2;
        boolean z = this.EZpvd;
        if (z) {
            this.EZpvd = !z;
            return;
        }
        AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
        java.lang.String instId = null;
        java.lang.String instType = (abstractC55729xpT == null || (bizTradeOrderReqKWHzl2 = abstractC55729xpT.KWHzl()) == null) ? null : bizTradeOrderReqKWHzl2.getInstType();
        AbstractC55729xpT abstractC55729xpT2 = this.AYXKKw;
        if (abstractC55729xpT2 != null && (bizTradeOrderReqKWHzl = abstractC55729xpT2.KWHzl()) != null) {
            instId = bizTradeOrderReqKWHzl.getInstId();
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "orders", new WsArgV5("orders", instId, null, instType, null, null, null, null, 244, null), (Function1) null, 4, (java.lang.Object) null);
        this.values = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KWHzl, "channel orders taskKey:" + this.DbNXlk + "  data: " + str + " -- ");
        OLrzqt(true);
        this.copydefault.put(str);
        this.djBIcL = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradeOrderData> bD_() {
        java.util.ArrayList arrayList;
        BizTradeOrderReq bizTradeOrderReqKWHzl;
        if (!this.AEQbTJ) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!this.copydefault.isEmpty()) {
            arrayList2.add(this.copydefault.take());
        }
        java.util.Iterator it = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<TradeOrderData> listAEQbTJ = TradeOrderData.Companion.AEQbTJ((java.lang.String) next);
            if (listAEQbTJ != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ) {
                    StrategyType strategyType = C56119xwm.AEQbTJ().get(((TradeOrderData) obj).getOrdType());
                    AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
                    if (strategyType == ((abstractC55729xpT == null || (bizTradeOrderReqKWHzl = abstractC55729xpT.KWHzl()) == null) ? null : bizTradeOrderReqKWHzl.getOriginType())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                OLrzqt((java.util.List<TradeOrderData>) arrayList);
            }
        }
        this.AhwBna.clear();
        java.util.List<TradeOrderData> listAEQbTJ2 = TradeOrderData.Companion.AEQbTJ(this.djBIcL);
        if (listAEQbTJ2 != null) {
            java.util.Iterator<T> it2 = listAEQbTJ2.iterator();
            while (it2.hasNext()) {
                this.AhwBna.add((TradeOrderData) it2.next());
            }
        }
        return this.gEmmrt;
    }

    public void copydefault(@NotNull java.util.List<TradeOrderData> list) {
        AbstractC55729xpT abstractC55729xpT;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55729xpT abstractC55729xpT2 = this.AYXKKw;
        if (abstractC55729xpT2 != null) {
            abstractC55729xpT2.KWHzl("WebSocket", this.gEmmrt, this, null);
        }
        for (TradeOrderData tradeOrderData : this.AhwBna) {
            if (tradeOrderData != null) {
                pUU.KWHzl(this.KWHzl, "amend order ws data: " + tradeOrderData + "--" + tradeOrderData.getOrdId() + "-" + tradeOrderData.getAmendResult());
                C54411xHk.StateListAnimator stateListAnimator = C54411xHk.Companion;
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.copydefault(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ())), tradeOrderData.getAmendResult()) && (abstractC55729xpT = this.AYXKKw) != null) {
                    abstractC55729xpT.OLrzqt(tradeOrderData);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [285=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(@NotNull java.util.List<TradeOrderData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (TradeOrderData tradeOrderData : list) {
            java.lang.String state = tradeOrderData.getState();
            switch (state.hashCode()) {
                case -1274499742:
                    if (state.equals("filled")) {
                        RxBus.KWHzl("trade_balance_refresh");
                        tradeOrderData.getInstId();
                        AEQbTJ(tradeOrderData);
                    }
                    break;
                case -123173735:
                    if (state.equals("canceled")) {
                        tradeOrderData.getInstId();
                        AEQbTJ(tradeOrderData);
                        RxBus.KWHzl("trade_balance_refresh");
                    }
                    break;
                case 3322092:
                    if (state.equals("live")) {
                        int iEZpvd = EZpvd(tradeOrderData);
                        if (iEZpvd == -1) {
                            tradeOrderData.getInstId();
                            this.gEmmrt.add(0, tradeOrderData);
                            RxBus.KWHzl("trade_balance_refresh");
                        } else {
                            tradeOrderData.getInstId();
                            this.gEmmrt.set(iEZpvd, tradeOrderData);
                        }
                    }
                    break;
                case 22875123:
                    if (state.equals("partially_filled")) {
                        tradeOrderData.getInstId();
                        tradeOrderData.getAccFillSz();
                        KWHzl(tradeOrderData);
                    }
                    break;
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55729xpT) {
            java.lang.String strCopydefault = ((AbstractC55729xpT) obj).copydefault();
            AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55729xpT != null ? abstractC55729xpT.copydefault() : null))) {
                return false;
            }
        }
        copydefault();
        return true;
    }

    public final void copydefault() {
        AbstractC57556yke abstractC57556yke = this.values;
        if (abstractC57556yke == null) {
            this.EZpvd = true;
        }
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("orders", this.values);
        this.values = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.fetchVPNInfo.AYXKKw();
        this.AkhnZx.AYXKKw();
        this.valueOf.AYXKKw();
        this.AhwBna.clear();
        this.gEmmrt.clear();
    }

    private final void EZpvd(ResponseData<java.util.List<TradeOrderData>> responseData) {
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            AbstractC55729xpT abstractC55729xpT = this.AYXKKw;
            if (abstractC55729xpT != null) {
                abstractC55729xpT.EZpvd(responseData.getMsg());
                return;
            }
            return;
        }
        this.AEQbTJ = true;
        java.util.List<TradeOrderData> data = responseData.getData();
        Intrinsics.copydefault(data);
        copydefault(data, this.OLrzqt);
    }

    private final void KWHzl(TradeOrderData tradeOrderData) {
        int i = 0;
        for (java.lang.Object obj : this.gEmmrt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrdId(), (java.lang.Object) ((TradeOrderData) obj).getOrdId())) {
                this.gEmmrt.set(i, tradeOrderData);
            }
            i++;
        }
    }

    private final void AEQbTJ(TradeOrderData tradeOrderData) {
        java.util.Iterator<TradeOrderData> it = this.gEmmrt.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrdId(), (java.lang.Object) it.next().getOrdId())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            CopyOnWriteArrayList<TradeOrderData> copyOnWriteArrayList = this.gEmmrt;
            copyOnWriteArrayList.remove(copyOnWriteArrayList.get(i));
        }
    }

    private final int EZpvd(TradeOrderData tradeOrderData) {
        java.util.Iterator<TradeOrderData> it = this.gEmmrt.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrdId(), (java.lang.Object) it.next().getOrdId())) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
