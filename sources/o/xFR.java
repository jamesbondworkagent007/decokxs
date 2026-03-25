package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.JsonObject;
import com.okinc.biz.StrategyType;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.subscribe.BizDexOrderReq;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
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
public final class xFR extends xGQ<java.util.List<? extends TradeOrderData>> implements InterfaceC55705xow {
    public volatile boolean AEQbTJ;
    public boolean AYXKKw;
    public java.lang.String AhwBna;
    public AbstractC57556yke DbNXlk;
    public boolean EZpvd;
    public final java.lang.String KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public final C54256xBr copydefault;
    public AbstractC55728xpS djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final CopyOnWriteArrayList<TradeOrderData> gEmmrt;
    public final CopyOnWriteArrayList<TradeOrderData> valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
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

    public xFR(@NotNull java.lang.String str, AbstractC55728xpS abstractC55728xpS) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
        this.djBIcL = abstractC55728xpS;
        this.KWHzl = "TradeDexOrderTask";
        this.gEmmrt = new CopyOnWriteArrayList<>();
        this.valueOf = new CopyOnWriteArrayList<>();
        this.AhwBna = "";
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.copydefault = new C54256xBr();
        gEmmrt();
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizDexOrderReq bizDexOrderReqKWHzl;
        AbstractC55728xpS abstractC55728xpS = this.djBIcL;
        if (abstractC55728xpS != null && (bizDexOrderReqKWHzl = abstractC55728xpS.KWHzl()) != null && bizDexOrderReqKWHzl.getHasWs()) {
            copydefault();
            this.EZpvd = false;
        }
        gEmmrt();
    }

    private final void gEmmrt() {
        this.AEQbTJ = false;
        AbstractC55728xpS abstractC55728xpS = this.djBIcL;
        BizDexOrderReq bizDexOrderReqKWHzl = abstractC55728xpS != null ? abstractC55728xpS.KWHzl() : null;
        C54256xBr c54256xBr = this.copydefault;
        if (bizDexOrderReqKWHzl != null) {
            c54256xBr.KWHzl(bizDexOrderReqKWHzl);
        } else {
            pUU.EZpvd(this.KWHzl, "req is null");
        }
        c54256xBr.KWHzl(new Function1() { // from class: o.xFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFR.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54256xBr, 0L, 1, null);
    }

    public static final Unit OLrzqt(xFR xfr, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfr.KWHzl((ResponseData<java.util.List<TradeOrderData>>) responseData);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.util.List<TradeOrderData> list, boolean z) {
        AbstractC55728xpS abstractC55728xpS;
        BizDexOrderReq bizDexOrderReqKWHzl;
        EZpvd(list);
        AbstractC55728xpS abstractC55728xpS2 = this.djBIcL;
        if (abstractC55728xpS2 != null) {
            abstractC55728xpS2.KWHzl("http", this.gEmmrt, this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55728xpS = this.djBIcL) == null || (bizDexOrderReqKWHzl = abstractC55728xpS.KWHzl()) == null || !bizDexOrderReqKWHzl.getHasWs()) {
            return;
        }
        djBIcL();
    }

    private final void EZpvd(java.util.List<TradeOrderData> list) {
        this.gEmmrt.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    private final void djBIcL() {
        JsonObject jsonObject;
        BizDexOrderReq bizDexOrderReqKWHzl;
        BizDexOrderReq bizDexOrderReqKWHzl2;
        BizDexOrderReq bizDexOrderReqKWHzl3;
        BizDexOrderReq bizDexOrderReqKWHzl4;
        java.lang.String chainIndex;
        BizDexOrderReq bizDexOrderReqKWHzl5;
        java.lang.String tokenAddress;
        BizDexOrderReq bizDexOrderReqKWHzl6;
        BizDexOrderReq bizDexOrderReqKWHzl7;
        boolean z = this.EZpvd;
        if (z) {
            this.EZpvd = !z;
            return;
        }
        AbstractC55728xpS abstractC55728xpS = this.djBIcL;
        java.lang.String instId = null;
        if (abstractC55728xpS == null || (bizDexOrderReqKWHzl3 = abstractC55728xpS.KWHzl()) == null || !bizDexOrderReqKWHzl3.getSupportDex()) {
            jsonObject = null;
        } else {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("ordType", "dexMarket,dexLimit");
            AbstractC55728xpS abstractC55728xpS2 = this.djBIcL;
            java.lang.String str = "";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((abstractC55728xpS2 == null || (bizDexOrderReqKWHzl7 = abstractC55728xpS2.KWHzl()) == null) ? null : bizDexOrderReqKWHzl7.getTokenAddress()))) {
                AbstractC55728xpS abstractC55728xpS3 = this.djBIcL;
                if (abstractC55728xpS3 == null || (bizDexOrderReqKWHzl6 = abstractC55728xpS3.KWHzl()) == null || (tokenAddress = bizDexOrderReqKWHzl6.getTokenAddress()) == null) {
                    tokenAddress = "";
                }
                jsonObject2.addProperty("tokenAddress", tokenAddress);
            }
            AbstractC55728xpS abstractC55728xpS4 = this.djBIcL;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((abstractC55728xpS4 == null || (bizDexOrderReqKWHzl5 = abstractC55728xpS4.KWHzl()) == null) ? null : bizDexOrderReqKWHzl5.getChainIndex()))) {
                AbstractC55728xpS abstractC55728xpS5 = this.djBIcL;
                if (abstractC55728xpS5 != null && (bizDexOrderReqKWHzl4 = abstractC55728xpS5.KWHzl()) != null && (chainIndex = bizDexOrderReqKWHzl4.getChainIndex()) != null) {
                    str = chainIndex;
                }
                jsonObject2.addProperty("chainIndex", str);
            }
            jsonObject = jsonObject2;
        }
        AbstractC55728xpS abstractC55728xpS6 = this.djBIcL;
        java.lang.String instType = (abstractC55728xpS6 == null || (bizDexOrderReqKWHzl2 = abstractC55728xpS6.KWHzl()) == null) ? null : bizDexOrderReqKWHzl2.getInstType();
        AbstractC55728xpS abstractC55728xpS7 = this.djBIcL;
        if (abstractC55728xpS7 != null && (bizDexOrderReqKWHzl = abstractC55728xpS7.KWHzl()) != null) {
            instId = bizDexOrderReqKWHzl.getInstId();
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "orders-trading-dex", new WsArgV5("orders-trading-dex", instId, null, instType, null, null, null, jsonObject, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), (Function1) null, 4, (java.lang.Object) null);
        this.DbNXlk = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KWHzl, "channel orders taskKey:" + this.fetchVPNInfo + "  data: " + str + " -- ");
        OLrzqt(true);
        this.OLrzqt.put(str);
        this.AhwBna = str;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradeOrderData> bD_() {
        java.util.ArrayList arrayList;
        BizDexOrderReq bizDexOrderReqKWHzl;
        if (!this.AEQbTJ) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!this.OLrzqt.isEmpty()) {
            arrayList2.add(this.OLrzqt.take());
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
                    StrategyType strategyType = C56119xwm.AEQbTJ().get(((TradeOrderData) obj).getOrderType());
                    AbstractC55728xpS abstractC55728xpS = this.djBIcL;
                    if (strategyType == ((abstractC55728xpS == null || (bizDexOrderReqKWHzl = abstractC55728xpS.KWHzl()) == null) ? null : bizDexOrderReqKWHzl.getOriginType())) {
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
        this.valueOf.clear();
        java.util.List<TradeOrderData> listAEQbTJ2 = TradeOrderData.Companion.AEQbTJ(this.AhwBna);
        if (listAEQbTJ2 != null) {
            java.util.Iterator<T> it2 = listAEQbTJ2.iterator();
            while (it2.hasNext()) {
                this.valueOf.add((TradeOrderData) it2.next());
            }
        }
        return this.gEmmrt;
    }

    public void copydefault(@NotNull java.util.List<TradeOrderData> list) {
        AbstractC55728xpS abstractC55728xpS;
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55728xpS abstractC55728xpS2 = this.djBIcL;
        if (abstractC55728xpS2 != null) {
            abstractC55728xpS2.KWHzl("WebSocket", this.gEmmrt, this, null);
        }
        for (TradeOrderData tradeOrderData : this.valueOf) {
            if (tradeOrderData != null) {
                pUU.KWHzl(this.KWHzl, "amend order ws data: " + tradeOrderData + "--" + tradeOrderData.getOrdId() + "-" + tradeOrderData.getAmendResult());
                C54411xHk.StateListAnimator stateListAnimator = C54411xHk.Companion;
                if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.copydefault(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ())), tradeOrderData.getAmendResult()) && (abstractC55728xpS = this.djBIcL) != null) {
                    abstractC55728xpS.OLrzqt(tradeOrderData);
                }
            }
        }
    }

    public final void OLrzqt(@NotNull java.util.List<TradeOrderData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (TradeOrderData tradeOrderData : list) {
            if (tradeOrderData.isDexOrder()) {
                OLrzqt(tradeOrderData);
            } else {
                EZpvd(tradeOrderData);
            }
        }
    }

    public final void OLrzqt(TradeOrderData tradeOrderData) {
        java.lang.String state;
        java.lang.String chainIndex;
        java.lang.String tokenAddress;
        java.lang.String state2;
        java.lang.String chainIndex2;
        java.lang.String tokenAddress2;
        java.lang.String state3;
        java.lang.String chainIndex3;
        java.lang.String tokenAddress3;
        DexOrderDetail dexOrderDetail = tradeOrderData.getDexOrderDetail();
        java.lang.String state4 = dexOrderDetail != null ? dexOrderDetail.getState() : null;
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) DexOrderDetail.State.PENDING.getStateName())) {
            int iAEQbTJ = AEQbTJ(tradeOrderData);
            if (iAEQbTJ == -1) {
                java.lang.String str2 = this.KWHzl;
                DexOrderDetail dexOrderDetail2 = tradeOrderData.getDexOrderDetail();
                if (dexOrderDetail2 == null || (state3 = dexOrderDetail2.getState()) == null) {
                    state3 = "";
                }
                DexOrderDetail dexOrderDetail3 = tradeOrderData.getDexOrderDetail();
                if (dexOrderDetail3 == null || (chainIndex3 = dexOrderDetail3.getChainIndex()) == null) {
                    chainIndex3 = "";
                }
                DexOrderDetail dexOrderDetail4 = tradeOrderData.getDexOrderDetail();
                if (dexOrderDetail4 != null && (tokenAddress3 = dexOrderDetail4.getTokenAddress()) != null) {
                    str = tokenAddress3;
                }
                pUU.EZpvd(str2, "updateDexOrder " + state3 + " add  chainId->" + chainIndex3 + "tokenAddress->" + str);
                this.gEmmrt.add(0, tradeOrderData);
                RxBus.KWHzl("trade_balance_refresh");
                return;
            }
            java.lang.String str3 = this.KWHzl;
            DexOrderDetail dexOrderDetail5 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail5 == null || (state2 = dexOrderDetail5.getState()) == null) {
                state2 = "";
            }
            DexOrderDetail dexOrderDetail6 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail6 == null || (chainIndex2 = dexOrderDetail6.getChainIndex()) == null) {
                chainIndex2 = "";
            }
            DexOrderDetail dexOrderDetail7 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail7 != null && (tokenAddress2 = dexOrderDetail7.getTokenAddress()) != null) {
                str = tokenAddress2;
            }
            pUU.EZpvd(str3, "updateDexOrder " + state2 + " change  chainId->" + chainIndex2 + "tokenAddress->" + str);
            this.gEmmrt.set(iAEQbTJ, tradeOrderData);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) DexOrderDetail.State.FILLED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) DexOrderDetail.State.FAILED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) DexOrderDetail.State.CANCELED.getStateName())) {
            RxBus.KWHzl("OKT_DEX_MAX_AVAILABLE_REFRESH");
            java.lang.String str4 = this.KWHzl;
            DexOrderDetail dexOrderDetail8 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail8 == null || (state = dexOrderDetail8.getState()) == null) {
                state = "";
            }
            DexOrderDetail dexOrderDetail9 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail9 == null || (chainIndex = dexOrderDetail9.getChainIndex()) == null) {
                chainIndex = "";
            }
            DexOrderDetail dexOrderDetail10 = tradeOrderData.getDexOrderDetail();
            if (dexOrderDetail10 != null && (tokenAddress = dexOrderDetail10.getTokenAddress()) != null) {
                str = tokenAddress;
            }
            pUU.EZpvd(str4, "updateDexOrder " + state + " remove  chainId->" + chainIndex + "tokenAddress->" + str);
            KWHzl(tradeOrderData);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [275=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(TradeOrderData tradeOrderData) {
        java.lang.String state = tradeOrderData.getState();
        switch (state.hashCode()) {
            case -1274499742:
                if (state.equals("filled")) {
                    RxBus.KWHzl("trade_balance_refresh");
                    pUU.EZpvd(this.KWHzl, "updateCexOrder 完全成交 remove  instId->" + tradeOrderData.getInstId());
                    KWHzl(tradeOrderData);
                    break;
                }
                break;
            case -123173735:
                if (state.equals("canceled")) {
                    pUU.EZpvd(this.KWHzl, "updateCexOrder cancel remove  instId->" + tradeOrderData.getInstId());
                    KWHzl(tradeOrderData);
                    RxBus.KWHzl("trade_balance_refresh");
                    break;
                }
                break;
            case 3322092:
                if (state.equals("live")) {
                    int iAEQbTJ = AEQbTJ(tradeOrderData);
                    if (iAEQbTJ != -1) {
                        pUU.EZpvd(this.KWHzl, "updateCexOrder change  instId->" + tradeOrderData.getInstId());
                        this.gEmmrt.set(iAEQbTJ, tradeOrderData);
                    } else {
                        pUU.EZpvd(this.KWHzl, "updateCexOrder add  instId->" + tradeOrderData.getInstId());
                        this.gEmmrt.add(0, tradeOrderData);
                        RxBus.KWHzl("trade_balance_refresh");
                    }
                    break;
                }
                break;
            case 22875123:
                if (state.equals("partially_filled")) {
                    pUU.EZpvd(this.KWHzl, "updateCexOrder 部分成交 modify  instId->" + tradeOrderData.getInstId() + "  成交数量->" + tradeOrderData.getAccFillSz());
                    copydefault(tradeOrderData);
                    break;
                }
                break;
        }
    }

    public final void KWHzl(TradeOrderData tradeOrderData) {
        int iAEQbTJ = AEQbTJ(tradeOrderData);
        if (iAEQbTJ != -1) {
            CopyOnWriteArrayList<TradeOrderData> copyOnWriteArrayList = this.gEmmrt;
            copyOnWriteArrayList.remove(copyOnWriteArrayList.get(iAEQbTJ));
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55728xpS) {
            java.lang.String strEZpvd = ((AbstractC55728xpS) obj).EZpvd();
            AbstractC55728xpS abstractC55728xpS = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55728xpS != null ? abstractC55728xpS.EZpvd() : null))) {
                return false;
            }
        }
        copydefault();
        return true;
    }

    public final void copydefault() {
        AbstractC57556yke abstractC57556yke = this.DbNXlk;
        if (abstractC57556yke == null) {
            this.EZpvd = true;
        }
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("orders-trading-dex", this.DbNXlk);
        this.DbNXlk = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.copydefault.AYXKKw();
        this.valueOf.clear();
        this.gEmmrt.clear();
    }

    private final void KWHzl(ResponseData<java.util.List<TradeOrderData>> responseData) {
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            AbstractC55728xpS abstractC55728xpS = this.djBIcL;
            if (abstractC55728xpS != null) {
                abstractC55728xpS.OLrzqt(responseData.getMsg());
                return;
            }
            return;
        }
        this.AEQbTJ = true;
        java.util.List<TradeOrderData> data = responseData.getData();
        Intrinsics.copydefault(data);
        AEQbTJ(data, this.AYXKKw);
    }

    public final void copydefault(TradeOrderData tradeOrderData) {
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

    public final int AEQbTJ(TradeOrderData tradeOrderData) {
        java.util.Iterator<TradeOrderData> it = this.gEmmrt.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeOrderData.getOrderIdByAll(), (java.lang.Object) it.next().getOrderIdByAll())) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
