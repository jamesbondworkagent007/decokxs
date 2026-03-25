package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.JsonObject;
import com.okinc.biz.StrategyType;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.subscribe.BizDexAlgoOrderReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFA extends xGQ<java.util.List<? extends BizTradeStrategyInfo>> implements InterfaceC55705xow {
    public final LinkedBlockingDeque<java.lang.String> AEQbTJ;
    public AbstractC55724xpO AYXKKw;
    public final CopyOnWriteArrayList<BizTradeStrategyInfo> AhwBna;
    public final C54254xBp EZpvd;
    public volatile boolean KWHzl;
    public boolean OLrzqt;
    public final java.lang.String copydefault;
    public java.lang.String djBIcL;
    public final CopyOnWriteArrayList<BizTradeStrategyInfo> gEmmrt;
    public AbstractC57556yke isConnected;
    public boolean valueOf;
    public final java.lang.String values;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xFA(@NotNull java.lang.String str, AbstractC55724xpO abstractC55724xpO) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        this.AYXKKw = abstractC55724xpO;
        this.copydefault = "TradeDexOrderTask";
        this.AhwBna = new CopyOnWriteArrayList<>();
        this.gEmmrt = new CopyOnWriteArrayList<>();
        this.djBIcL = "";
        this.AEQbTJ = new LinkedBlockingDeque<>();
        this.EZpvd = new C54254xBp();
        valueOf();
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ;
        AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
        if (abstractC55724xpO != null && (bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO.AEQbTJ()) != null && bizDexAlgoOrderReqAEQbTJ.getHasWs()) {
            copydefault();
            this.OLrzqt = false;
        }
        valueOf();
    }

    private final void valueOf() {
        this.KWHzl = false;
        AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO != null ? abstractC55724xpO.AEQbTJ() : null;
        C54254xBp c54254xBp = this.EZpvd;
        if (bizDexAlgoOrderReqAEQbTJ != null) {
            c54254xBp.copydefault(bizDexAlgoOrderReqAEQbTJ);
        } else {
            pUU.EZpvd(this.copydefault, "req is null");
        }
        c54254xBp.KWHzl(new Function1() { // from class: o.xFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFA.AEQbTJ(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54254xBp, 0L, 1, null);
    }

    public static final Unit AEQbTJ(xFA xfa, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfa.EZpvd((ResponseData<java.util.List<TradeStrategyOrderData>>) responseData);
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.util.List<? extends BizTradeStrategyInfo> list, boolean z) {
        AbstractC55724xpO abstractC55724xpO;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ;
        OLrzqt(list, z);
        AbstractC55724xpO abstractC55724xpO2 = this.AYXKKw;
        if (abstractC55724xpO2 != null) {
            abstractC55724xpO2.KWHzl("http", new java.util.ArrayList<>(this.AhwBna), this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55724xpO = this.AYXKKw) == null || (bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO.AEQbTJ()) == null || !bizDexAlgoOrderReqAEQbTJ.getHasWs()) {
            return;
        }
        gEmmrt();
    }

    public final void OLrzqt(java.util.List<? extends BizTradeStrategyInfo> list, boolean z) {
        if (!z) {
            this.AhwBna.clear();
        }
        this.AhwBna.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    private final void gEmmrt() {
        JsonObject jsonObject;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ2;
        java.lang.String chainIndex;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ3;
        java.lang.String tokenAddress;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ4;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ5;
        boolean z = this.OLrzqt;
        if (z) {
            this.OLrzqt = !z;
            return;
        }
        AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
        java.lang.String chainIndex2 = null;
        if (abstractC55724xpO == null || (bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO.AEQbTJ()) == null || !bizDexAlgoOrderReqAEQbTJ.getSupportDex()) {
            jsonObject = null;
        } else {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("ordType", "dexTpsl");
            AbstractC55724xpO abstractC55724xpO2 = this.AYXKKw;
            java.lang.String str = "";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((abstractC55724xpO2 == null || (bizDexAlgoOrderReqAEQbTJ5 = abstractC55724xpO2.AEQbTJ()) == null) ? null : bizDexAlgoOrderReqAEQbTJ5.getTokenAddress()))) {
                AbstractC55724xpO abstractC55724xpO3 = this.AYXKKw;
                if (abstractC55724xpO3 == null || (bizDexAlgoOrderReqAEQbTJ4 = abstractC55724xpO3.AEQbTJ()) == null || (tokenAddress = bizDexAlgoOrderReqAEQbTJ4.getTokenAddress()) == null) {
                    tokenAddress = "";
                }
                jsonObject2.addProperty("tokenAddress", tokenAddress);
            }
            AbstractC55724xpO abstractC55724xpO4 = this.AYXKKw;
            if (abstractC55724xpO4 != null && (bizDexAlgoOrderReqAEQbTJ3 = abstractC55724xpO4.AEQbTJ()) != null) {
                chainIndex2 = bizDexAlgoOrderReqAEQbTJ3.getChainIndex();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) chainIndex2)) {
                AbstractC55724xpO abstractC55724xpO5 = this.AYXKKw;
                if (abstractC55724xpO5 != null && (bizDexAlgoOrderReqAEQbTJ2 = abstractC55724xpO5.AEQbTJ()) != null && (chainIndex = bizDexAlgoOrderReqAEQbTJ2.getChainIndex()) != null) {
                    str = chainIndex;
                }
                jsonObject2.addProperty("chainIndex", str);
            }
            jsonObject = jsonObject2;
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "orders-trading-dex", new WsArgV5("orders-trading-dex", null, null, "ANY", null, null, null, jsonObject, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), (Function1) null, 4, (java.lang.Object) null);
        this.isConnected = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.copydefault, "channel orders taskKey:" + this.values + "  data: " + str + " -- ");
        OLrzqt(true);
        this.AEQbTJ.put(str);
        this.djBIcL = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizTradeStrategyInfo> bD_() {
        java.util.ArrayList<BizTradeStrategyInfo> arrayList;
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ;
        if (!this.KWHzl) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!this.AEQbTJ.isEmpty()) {
            arrayList2.add(this.AEQbTJ.take());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<BizTradeStrategyInfo> listEZpvd = TradeStrategyOrderData.Companion.EZpvd((java.lang.String) next);
            if (listEZpvd != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listEZpvd) {
                    BizTradeStrategyInfo bizTradeStrategyInfo = (BizTradeStrategyInfo) obj;
                    if (!bizTradeStrategyInfo.isDexOrder()) {
                        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
                        if (orderType != null) {
                            StrategyType strategyType = C56119xwm.AEQbTJ().get(orderType);
                            AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
                            if (strategyType == ((abstractC55724xpO == null || (bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO.AEQbTJ()) == null) ? null : bizDexAlgoOrderReqAEQbTJ.getOriginType())) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (BizTradeStrategyInfo bizTradeStrategyInfo2 : arrayList) {
                    arrayList3.add(bizTradeStrategyInfo2);
                    this.gEmmrt.add(bizTradeStrategyInfo2);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            EZpvd(arrayList3);
        }
        return this.AhwBna;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
        if (abstractC55724xpO != null) {
            abstractC55724xpO.KWHzl("WebSocket", new java.util.ArrayList<>(this.AhwBna), this, null);
        }
    }

    public final void EZpvd(@NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (BizTradeStrategyInfo bizTradeStrategyInfo : list) {
            if (bizTradeStrategyInfo.isDexOrder()) {
                KWHzl(bizTradeStrategyInfo);
            } else {
                copydefault(bizTradeStrategyInfo);
            }
        }
    }

    public final void KWHzl(BizTradeStrategyInfo bizTradeStrategyInfo) {
        DexOrderDetail dexOrderDetail = bizTradeStrategyInfo.getDexOrderDetail();
        java.lang.String state = dexOrderDetail != null ? dexOrderDetail.getState() : null;
        if (Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) DexOrderDetail.State.PENDING.getStateName())) {
            int iEZpvd = EZpvd(bizTradeStrategyInfo);
            if (iEZpvd == -1) {
                pUU.EZpvd(this.copydefault, "updateDexOrder " + dexOrderDetail.getState() + " add  chainId->" + dexOrderDetail.getChainIndex() + "tokenAddress->" + dexOrderDetail.getTokenAddress());
                this.AhwBna.add(0, bizTradeStrategyInfo);
                RxBus.KWHzl("trade_balance_refresh");
                return;
            }
            pUU.EZpvd(this.copydefault, "updateDexOrder " + dexOrderDetail.getState() + " change  chainId->" + dexOrderDetail.getChainIndex() + "tokenAddress->" + dexOrderDetail.getTokenAddress());
            this.AhwBna.set(iEZpvd, bizTradeStrategyInfo);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) DexOrderDetail.State.FILLED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) DexOrderDetail.State.FAILED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) DexOrderDetail.State.CANCELED.getStateName())) {
            RxBus.KWHzl("OKT_DEX_MAX_AVAILABLE_REFRESH");
            pUU.EZpvd(this.copydefault, "updateDexOrder " + dexOrderDetail.getState() + " remove  chainId->" + dexOrderDetail.getChainIndex() + "tokenAddress->" + dexOrderDetail.getTokenAddress());
            copydefault(bizTradeStrategyInfo.getOrderAlgoIdAll());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [304=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderState = bizTradeStrategyInfo.getOrderState();
        switch (orderState.hashCode()) {
            case -1809526472:
                if (orderState.equals("part_deal")) {
                    copydefault(bizTradeStrategyInfo.getOrderAlgoIdAll());
                    break;
                }
                break;
            case -1784744586:
                if (orderState.equals("partially_effective") && yDV.valueOf(new java.lang.String[]{"oco", "conditional"}, bizTradeStrategyInfo.getOrderType())) {
                    OLrzqt(bizTradeStrategyInfo);
                }
                break;
            case -1468651097:
                if (orderState.equals("effective")) {
                    copydefault(bizTradeStrategyInfo.getOrderAlgoIdAll());
                    break;
                }
                break;
            case -123173735:
                if (orderState.equals("canceled")) {
                    copydefault(bizTradeStrategyInfo.getOrderAlgoIdAll());
                    break;
                }
                break;
            case 3322092:
                if (orderState.equals("live")) {
                    int iEZpvd = EZpvd(bizTradeStrategyInfo);
                    if (iEZpvd != -1) {
                        this.AhwBna.set(iEZpvd, bizTradeStrategyInfo);
                    } else {
                        this.AhwBna.add(0, bizTradeStrategyInfo);
                    }
                }
                break;
            case 651875918:
                if (orderState.equals("order_failed")) {
                    copydefault(bizTradeStrategyInfo.getOrderAlgoIdAll());
                    break;
                }
                break;
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55724xpO) {
            java.lang.String strCopydefault = ((AbstractC55724xpO) obj).copydefault();
            AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55724xpO != null ? abstractC55724xpO.copydefault() : null))) {
                return false;
            }
        }
        copydefault();
        return true;
    }

    public final void copydefault() {
        AbstractC57556yke abstractC57556yke = this.isConnected;
        if (abstractC57556yke == null) {
            this.OLrzqt = true;
        }
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("orders-trading-dex", this.isConnected);
        this.isConnected = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.EZpvd.AYXKKw();
        this.gEmmrt.clear();
        this.AhwBna.clear();
    }

    private final void EZpvd(ResponseData<java.util.List<TradeStrategyOrderData>> responseData) {
        BizDexAlgoOrderReq bizDexAlgoOrderReqAEQbTJ;
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            AbstractC55724xpO abstractC55724xpO = this.AYXKKw;
            if (abstractC55724xpO != null) {
                abstractC55724xpO.copydefault(responseData.getMsg());
                return;
            }
            return;
        }
        this.KWHzl = true;
        java.util.List<TradeStrategyOrderData> data = responseData.getData();
        Intrinsics.copydefault(data);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : data) {
            TradeStrategyOrderData tradeStrategyOrderData = (TradeStrategyOrderData) obj;
            if (!tradeStrategyOrderData.isDexOrder()) {
                java.lang.String orderType = tradeStrategyOrderData.getOrderType();
                if (orderType != null) {
                    StrategyType strategyType = C56119xwm.AEQbTJ().get(orderType);
                    AbstractC55724xpO abstractC55724xpO2 = this.AYXKKw;
                    if (strategyType == ((abstractC55724xpO2 == null || (bizDexAlgoOrderReqAEQbTJ = abstractC55724xpO2.AEQbTJ()) == null) ? null : bizDexAlgoOrderReqAEQbTJ.getOriginType())) {
                    }
                }
            }
            arrayList.add(obj);
        }
        KWHzl(arrayList, this.valueOf);
    }

    public final void OLrzqt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : this.AhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderAlgoIdAll(), (java.lang.Object) ((BizTradeStrategyInfo) obj).getOrderAlgoIdAll())) {
                this.AhwBna.set(i, bizTradeStrategyInfo);
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        this.AhwBna.add(0, bizTradeStrategyInfo);
    }

    public final void copydefault(java.lang.String str) {
        java.util.Iterator<BizTradeStrategyInfo> it = this.AhwBna.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) it.next().getOrderAlgoIdAll())) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            this.AhwBna.remove(i);
        }
    }

    public final int EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.Iterator<BizTradeStrategyInfo> it = this.AhwBna.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderAlgoIdAll(), (java.lang.Object) it.next().getOrderAlgoIdAll())) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
