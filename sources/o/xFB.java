package o;

import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.gson.JsonObject;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.subscribe.BizDexOrderReq;
import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54411xHk;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFB extends xGQ<java.util.List<? extends TradeAllOrderApi>> implements InterfaceC55705xow {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public volatile boolean AYXKKw;
    public boolean AhwBna;
    public final CopyOnWriteArrayList<TradeAllOrderApi> AkhnZx;
    public java.lang.String DbNXlk;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public final LinkedBlockingDeque<java.lang.String> djBIcL;
    public final java.lang.String ejfBZ;
    public AbstractC57556yke fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public final CopyOnWriteArrayList<AbstractC55721xpL> isConnected;
    public final CopyOnWriteArrayList<TradeAllOrderApi> valueOf;
    public final C54260xBv values;

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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public xFB(@NotNull java.lang.String str, @NotNull AbstractC55721xpL abstractC55721xpL) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55721xpL, "");
        this.ejfBZ = str;
        this.KWHzl = "TradeDexAllOrderTask";
        this.valueOf = new CopyOnWriteArrayList<>();
        this.AkhnZx = new CopyOnWriteArrayList<>();
        this.DbNXlk = "";
        this.djBIcL = new LinkedBlockingDeque<>();
        this.values = new C54260xBv();
        this.isConnected = new CopyOnWriteArrayList<>();
        EZpvd(abstractC55721xpL);
        isConnected();
    }

    public final BizDexOrderReq copydefault() {
        AbstractC55721xpL abstractC55721xpL = (AbstractC55721xpL) CollectionsKt___CollectionsKt.firstOrNull(this.isConnected);
        if (abstractC55721xpL != null) {
            return abstractC55721xpL.KWHzl();
        }
        return null;
    }

    private final void isConnected() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || newProxyInstance.fARcdN()) {
            this.AYXKKw = false;
            BizDexOrderReq bizDexOrderReqCopydefault = copydefault();
            if (bizDexOrderReqCopydefault == null) {
                return;
            }
            C54260xBv c54260xBv = this.values;
            c54260xBv.KWHzl(bizDexOrderReqCopydefault);
            c54260xBv.KWHzl(new Function1() { // from class: o.xFz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xFB.copydefault(this.EZpvd, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c54260xBv, 0L, 1, null);
            pUU.KWHzl(this.KWHzl, "startHttp");
            if (this.AhwBna || !bizDexOrderReqCopydefault.getHasWs()) {
                return;
            }
            djBIcL();
        }
    }

    public static final Unit copydefault(xFB xfb, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfb.copydefault = true;
        java.lang.String str = xfb.KWHzl;
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        int code = responseData.getCode();
        java.util.List list = (java.util.List) responseData.getData();
        pUU.KWHzl(str, "it.isSucceedAndDataValid:" + z + " code:" + code + " data:" + (list != null ? java.lang.Integer.valueOf(list.size()) : null));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            xfb.AEQbTJ = false;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            xfb.AEQbTJ((java.util.List<? extends TradeAllOrderApi>) data, xfb.AhwBna);
            xfb.AYXKKw = true;
        } else {
            xfb.AEQbTJ = true;
            pUU.KWHzl(xfb.KWHzl, "errorMsg:" + responseData.getMsg());
            xfb.OLrzqt(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.lang.String str, java.util.List<? extends TradeAllOrderApi> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
        pUU.KWHzl(this.KWHzl, "onResult size:" + list.size() + " content:" + list);
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            ((AbstractC55721xpL) it.next()).copydefault(str, list, interfaceC55705xow, bool);
        }
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizDexOrderReq bizDexOrderReqCopydefault = copydefault();
        if (bizDexOrderReqCopydefault != null && bizDexOrderReqCopydefault.getHasWs()) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.addAll(this.isConnected);
            KWHzl();
            this.isConnected.clear();
            this.OLrzqt = false;
            this.isConnected.addAll(copyOnWriteArrayList);
        }
        java.lang.String str = this.KWHzl;
        BizDexOrderReq bizDexOrderReqCopydefault2 = copydefault();
        java.lang.Boolean boolValueOf = bizDexOrderReqCopydefault2 != null ? java.lang.Boolean.valueOf(bizDexOrderReqCopydefault2.getHasWs()) : null;
        pUU.EZpvd(str, "refresh req?.hasWs " + boolValueOf + " mAlreadyStop " + this.OLrzqt + " orderListeners " + this.isConnected.size() + "}");
        isConnected();
    }

    private final void AEQbTJ(java.util.List<? extends TradeAllOrderApi> list, boolean z) {
        BizDexOrderReq bizDexOrderReqCopydefault;
        KWHzl(list);
        CopyOnWriteArrayList<TradeAllOrderApi> copyOnWriteArrayList = this.valueOf;
        int size = list.size();
        BizDexOrderReq bizDexOrderReqCopydefault2 = copydefault();
        KWHzl("http", copyOnWriteArrayList, this, java.lang.Boolean.valueOf(size < C33129mqd.AhwBna(bizDexOrderReqCopydefault2 != null ? bizDexOrderReqCopydefault2.getLimit() : null)));
        java.lang.String str = this.KWHzl;
        BizDexOrderReq bizDexOrderReqCopydefault3 = copydefault();
        pUU.KWHzl(str, "updateRequestOrders isLoadMore:" + z + " req?.hasWs:" + (bizDexOrderReqCopydefault3 != null ? java.lang.Boolean.valueOf(bizDexOrderReqCopydefault3.getHasWs()) : null));
        if (z || (bizDexOrderReqCopydefault = copydefault()) == null || !bizDexOrderReqCopydefault.getHasWs()) {
            return;
        }
        pUU.KWHzl(this.KWHzl, "startWsTimer");
        KWHzl(700L);
    }

    private final void KWHzl(java.util.List<? extends TradeAllOrderApi> list) {
        this.valueOf.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KWHzl, " taskKey:" + this.ejfBZ + " data: " + str + " ");
        OLrzqt(true);
        this.djBIcL.put(str);
        this.DbNXlk = str;
        fIwbmz();
    }

    private final void fIwbmz() {
        C55749xpn c55749xpn = C55749xpn.OLrzqt;
        c55749xpn.OLrzqt(c55749xpn.AEQbTJ());
        c55749xpn.KWHzl(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void djBIcL() {
        JsonObject jsonObject;
        java.lang.String chainIndex;
        java.lang.String tokenAddress;
        boolean z = this.OLrzqt;
        if (z) {
            this.OLrzqt = !z;
            return;
        }
        BizDexOrderReq bizDexOrderReqCopydefault = copydefault();
        if (bizDexOrderReqCopydefault == null || !bizDexOrderReqCopydefault.getSupportDex()) {
            jsonObject = null;
        } else {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("ordType", "dexMarket,dexLimit,dexTpsl");
            BizDexOrderReq bizDexOrderReqCopydefault2 = copydefault();
            java.lang.String str = "";
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (bizDexOrderReqCopydefault2 != null ? bizDexOrderReqCopydefault2.getTokenAddress() : null))) {
                BizDexOrderReq bizDexOrderReqCopydefault3 = copydefault();
                if (bizDexOrderReqCopydefault3 == null || (tokenAddress = bizDexOrderReqCopydefault3.getTokenAddress()) == null) {
                    tokenAddress = "";
                }
                jsonObject2.addProperty("tokenAddress", tokenAddress);
            }
            BizDexOrderReq bizDexOrderReqCopydefault4 = copydefault();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (bizDexOrderReqCopydefault4 != null ? bizDexOrderReqCopydefault4.getChainIndex() : null))) {
                BizDexOrderReq bizDexOrderReqCopydefault5 = copydefault();
                if (bizDexOrderReqCopydefault5 != null && (chainIndex = bizDexOrderReqCopydefault5.getChainIndex()) != null) {
                    str = chainIndex;
                }
                jsonObject2.addProperty("chainIndex", str);
            }
            jsonObject = jsonObject2;
        }
        BizDexOrderReq bizDexOrderReqCopydefault6 = copydefault();
        java.lang.String instType = bizDexOrderReqCopydefault6 != null ? bizDexOrderReqCopydefault6.getInstType() : null;
        BizDexOrderReq bizDexOrderReqCopydefault7 = copydefault();
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "group-order-priv", new WsArgV5("group-order-priv", bizDexOrderReqCopydefault7 != null ? bizDexOrderReqCopydefault7.getInstId() : null, null, instType, null, null, null, jsonObject, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null), (Function1) null, 4, (java.lang.Object) null);
        this.fetchVPNInfo = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        pUU.KWHzl(this.KWHzl, "startWs");
        pUU.KWHzl(this.KWHzl, "taskKey:" + this.ejfBZ + " CHANNEL_ALL_ORDERS: group-order-priv subscribe");
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradeAllOrderApi> bD_() {
        if (!this.AYXKKw) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.djBIcL.isEmpty()) {
            arrayList.add(this.djBIcL.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<AllOrderDataInfo> listKWHzl = AllOrderDataInfo.Companion.KWHzl((java.lang.String) next);
            if (listKWHzl != null) {
                java.util.Iterator<T> it2 = listKWHzl.iterator();
                while (it2.hasNext()) {
                    TradeAllOrderApi tradeAllOrderApiConvertDataByOrderType = ((AllOrderDataInfo) it2.next()).convertDataByOrderType(false);
                    if (tradeAllOrderApiConvertDataByOrderType != null) {
                        C55749xpn.OLrzqt.EZpvd(tradeAllOrderApiConvertDataByOrderType.getOrtType());
                        EZpvd(tradeAllOrderApiConvertDataByOrderType);
                    }
                }
            }
        }
        this.AkhnZx.clear();
        java.util.List<AllOrderDataInfo> listKWHzl2 = AllOrderDataInfo.Companion.KWHzl(this.DbNXlk);
        if (listKWHzl2 != null) {
            java.util.Iterator<T> it3 = listKWHzl2.iterator();
            while (it3.hasNext()) {
                TradeAllOrderApi tradeAllOrderApiConvertDataByOrderType2 = ((AllOrderDataInfo) it3.next()).convertDataByOrderType(false);
                if (tradeAllOrderApiConvertDataByOrderType2 != null) {
                    this.AkhnZx.add(tradeAllOrderApiConvertDataByOrderType2);
                }
            }
        }
        if (getNewProxyInstance()) {
            return this.valueOf;
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl("WebSocket", this.valueOf, this, null);
        for (TradeAllOrderApi tradeAllOrderApi : this.AkhnZx) {
            if (tradeAllOrderApi instanceof TradeOrderData) {
                TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
                pUU.KWHzl(this.KWHzl, "amend order ws data: " + tradeAllOrderApi + "--" + tradeOrderData.getOrdId() + "-" + tradeOrderData.getAmendResult());
                for (AbstractC55721xpL abstractC55721xpL : this.isConnected) {
                    C54411xHk.StateListAnimator stateListAnimator = C54411xHk.Companion;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.copydefault(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ())), tradeOrderData.getAmendResult())) {
                        abstractC55721xpL.AEQbTJ(tradeAllOrderApi);
                    }
                }
            }
        }
    }

    public final void EZpvd(@NotNull TradeAllOrderApi tradeAllOrderApi) {
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
        if (tradeAllOrderApi.isDexOrder()) {
            OLrzqt(tradeAllOrderApi);
        } else {
            AEQbTJ(tradeAllOrderApi);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [309=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r0.equals("starting") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0.equals("order_failed") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r0.equals("pause") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r0.equals("stop") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        if (r0.equals("canceled") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
    
        if (r0.equals("filled") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        if (r0.equals("completed") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (r0.equals("effective") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
    
        if (r0.equals("partially_effective") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        if (r0.equals("part_deal") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (r0.equals("no_close_position") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        KWHzl(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00de, code lost:
    
        if (r0.equals("stopped") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e1, code lost:
    
        com.okinc.rxutils.RxBus.KWHzl("trade_balance_refresh");
        r6.getStateByAll();
        r6.getInstIdByALl();
        copydefault(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.equals("stopping") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r0.equals("running") == false) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(TradeAllOrderApi tradeAllOrderApi) {
        java.lang.String stateByAll = tradeAllOrderApi.getStateByAll();
        switch (stateByAll.hashCode()) {
            case -1884319283:
                break;
            case -1821824562:
                break;
            case -1809526472:
                break;
            case -1784744586:
                break;
            case -1468651097:
                break;
            case -1402931637:
                break;
            case -1274499742:
                break;
            case -123173735:
                break;
            case 3322092:
                if (stateByAll.equals("live")) {
                    int iAYXKKw = AYXKKw(tradeAllOrderApi);
                    if (iAYXKKw != -1) {
                        pUU.KWHzl(this.KWHzl, "updateCexOrder change  instId->" + tradeAllOrderApi.getInstIdByALl());
                        EZpvd(tradeAllOrderApi, iAYXKKw);
                    } else {
                        tradeAllOrderApi.getInstIdByALl();
                        this.valueOf.add(0, tradeAllOrderApi);
                        RxBus.KWHzl("trade_balance_refresh");
                    }
                }
                KWHzl(tradeAllOrderApi);
                break;
            case 3540994:
                break;
            case 22875123:
                if (stateByAll.equals("partially_filled")) {
                    gEmmrt(tradeAllOrderApi);
                }
                KWHzl(tradeAllOrderApi);
                break;
            case 106440182:
                break;
            case 651875918:
                break;
            case 1316806720:
                break;
            case 1550783935:
                break;
            case 1715648628:
                break;
            default:
                KWHzl(tradeAllOrderApi);
                break;
        }
    }

    public final void OLrzqt(TradeAllOrderApi tradeAllOrderApi) {
        java.lang.String state;
        java.lang.String chainIndex;
        java.lang.String tokenAddress;
        java.lang.String chainIndex2;
        java.lang.String tokenAddress2;
        DexOrderDetail dexOrderDetail = tradeAllOrderApi.getDexOrderDetail();
        java.lang.String state2 = dexOrderDetail != null ? dexOrderDetail.getState() : null;
        java.lang.String str = "";
        if (Intrinsics.EZpvd((java.lang.Object) state2, (java.lang.Object) DexOrderDetail.State.PENDING.getStateName())) {
            int iAYXKKw = AYXKKw(tradeAllOrderApi);
            if (iAYXKKw == -1) {
                DexOrderDetail dexOrderDetail2 = tradeAllOrderApi.getDexOrderDetail();
                if (dexOrderDetail2 != null) {
                    dexOrderDetail2.getChainIndex();
                }
                DexOrderDetail dexOrderDetail3 = tradeAllOrderApi.getDexOrderDetail();
                if (dexOrderDetail3 != null) {
                    dexOrderDetail3.getTokenAddress();
                }
                this.valueOf.add(0, tradeAllOrderApi);
                RxBus.KWHzl("trade_balance_refresh");
                return;
            }
            java.lang.String str2 = this.KWHzl;
            DexOrderDetail dexOrderDetail4 = tradeAllOrderApi.getDexOrderDetail();
            if (dexOrderDetail4 == null || (chainIndex2 = dexOrderDetail4.getChainIndex()) == null) {
                chainIndex2 = "";
            }
            DexOrderDetail dexOrderDetail5 = tradeAllOrderApi.getDexOrderDetail();
            if (dexOrderDetail5 != null && (tokenAddress2 = dexOrderDetail5.getTokenAddress()) != null) {
                str = tokenAddress2;
            }
            pUU.KWHzl(str2, "updateDexOrder update chainId->" + chainIndex2 + "tokenAddress->" + str);
            EZpvd(tradeAllOrderApi, iAYXKKw);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) state2, (java.lang.Object) DexOrderDetail.State.FILLED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state2, (java.lang.Object) DexOrderDetail.State.FAILED.getStateName()) || Intrinsics.EZpvd((java.lang.Object) state2, (java.lang.Object) DexOrderDetail.State.CANCELED.getStateName())) {
            RxBus.KWHzl("OKT_DEX_MAX_AVAILABLE_REFRESH");
            java.lang.String str3 = this.KWHzl;
            DexOrderDetail dexOrderDetail6 = tradeAllOrderApi.getDexOrderDetail();
            if (dexOrderDetail6 == null || (state = dexOrderDetail6.getState()) == null) {
                state = "";
            }
            DexOrderDetail dexOrderDetail7 = tradeAllOrderApi.getDexOrderDetail();
            if (dexOrderDetail7 == null || (chainIndex = dexOrderDetail7.getChainIndex()) == null) {
                chainIndex = "";
            }
            DexOrderDetail dexOrderDetail8 = tradeAllOrderApi.getDexOrderDetail();
            if (dexOrderDetail8 != null && (tokenAddress = dexOrderDetail8.getTokenAddress()) != null) {
                str = tokenAddress;
            }
            pUU.KWHzl(str3, "updateDexOrder " + state + " remove  chainId->" + chainIndex + "tokenAddress->" + str);
            copydefault(tradeAllOrderApi);
        }
    }

    private final void copydefault(TradeAllOrderApi tradeAllOrderApi) {
        int iAYXKKw = AYXKKw(tradeAllOrderApi);
        if (iAYXKKw != -1) {
            CopyOnWriteArrayList<TradeAllOrderApi> copyOnWriteArrayList = this.valueOf;
            copyOnWriteArrayList.remove(copyOnWriteArrayList.get(iAYXKKw));
        }
    }

    private final void EZpvd(TradeAllOrderApi tradeAllOrderApi, int i) {
        java.lang.String uTimeValue = this.valueOf.get(i).getUTimeValue();
        java.lang.String uTimeValue2 = tradeAllOrderApi.getUTimeValue();
        if (C33129mqd.copydefault(uTimeValue2, uTimeValue)) {
            pUU.KWHzl(this.KWHzl, "updateOrder instId->" + tradeAllOrderApi.getInstIdByALl() + " oldTime:" + uTimeValue + " newTime:" + uTimeValue2);
            this.valueOf.set(i, tradeAllOrderApi);
        }
    }

    public final void KWHzl() {
        java.lang.String str = this.KWHzl;
        java.lang.String str2 = this.ejfBZ;
        pUU.KWHzl(str, "taskKey:" + str2 + " release taskKey:" + str2);
        AbstractC57556yke abstractC57556yke = this.fetchVPNInfo;
        if (abstractC57556yke == null) {
            this.OLrzqt = true;
        }
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("group-order-priv", this.fetchVPNInfo);
        this.fetchVPNInfo = null;
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.values.AYXKKw();
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            OLrzqt((AbstractC55721xpL) it.next());
        }
        C55749xpn.OLrzqt.EZpvd((java.lang.String) null);
        this.AkhnZx.clear();
        this.valueOf.clear();
    }

    public final void EZpvd(@NotNull AbstractC55721xpL abstractC55721xpL) {
        Intrinsics.checkNotNullParameter(abstractC55721xpL, "");
        if (Intrinsics.EZpvd((java.lang.Object) abstractC55721xpL.AEQbTJ(), (java.lang.Object) this.ejfBZ)) {
            valueOf();
            if (this.copydefault) {
                if (this.AEQbTJ) {
                    isConnected();
                } else {
                    abstractC55721xpL.copydefault("http", this.valueOf, this, null);
                }
            }
            this.isConnected.add(abstractC55721xpL);
            java.lang.String str = this.KWHzl;
            java.lang.String str2 = this.ejfBZ;
            boolean z = this.isConnected.size() == 1;
            pUU.KWHzl(str, "taskKey:" + str2 + " isFirstAdd:" + z + "; isHttpDataInit:" + this.copydefault + "; isHttpError:" + this.AEQbTJ + "； addListener registeredSource:" + abstractC55721xpL.OLrzqt());
        }
    }

    private final void valueOf() {
        C55749xpn c55749xpn = C55749xpn.OLrzqt;
        c55749xpn.copydefault(fetchVPNInfo());
        c55749xpn.EZpvd(values());
        c55749xpn.OLrzqt(DbNXlk());
    }

    private final Function0<java.lang.String> fetchVPNInfo() {
        return new Function0() { // from class: o.xFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFB.djBIcL(this.OLrzqt);
            }
        };
    }

    public static final java.lang.String djBIcL(xFB xfb) {
        OKWsConnectionState oKWsConnectionStateEZpvd;
        java.lang.String strName;
        AbstractC57556yke abstractC57556yke = xfb.fetchVPNInfo;
        if (abstractC57556yke == null || (oKWsConnectionStateEZpvd = abstractC57556yke.EZpvd()) == null || (strName = oKWsConnectionStateEZpvd.name()) == null) {
            return null;
        }
        java.lang.String lowerCase = strName.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private final Function0<java.lang.Long> DbNXlk() {
        return new Function0() { // from class: o.xFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFB.copydefault(this.OLrzqt);
            }
        };
    }

    public static final java.lang.Long copydefault(xFB xfb) {
        AbstractC57556yke abstractC57556yke = xfb.fetchVPNInfo;
        if (abstractC57556yke != null) {
            return java.lang.Long.valueOf(abstractC57556yke.copydefault());
        }
        return null;
    }

    private final Function0<java.lang.String> values() {
        return new Function0() { // from class: o.xFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFB.AEQbTJ(this.EZpvd);
            }
        };
    }

    public static final java.lang.String AEQbTJ(xFB xfb) {
        AbstractC57556yke abstractC57556yke = xfb.fetchVPNInfo;
        if (abstractC57556yke != null) {
            return abstractC57556yke.AEQbTJ();
        }
        return null;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55721xpL) {
            java.util.Iterator<AbstractC55721xpL> it = this.isConnected.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault(), (java.lang.Object) ((AbstractC55721xpL) obj).copydefault())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            this.isConnected.remove(i);
            java.lang.String str = this.KWHzl;
            java.lang.String str2 = this.ejfBZ;
            pUU.KWHzl(str, "taskKey:" + str2 + " removeListener taskKey:" + str2 + " registeredSource:" + ((AbstractC55721xpL) obj).OLrzqt());
            if (this.isConnected.size() == 0) {
                KWHzl();
                return true;
            }
        }
        return false;
    }

    private final void OLrzqt(java.lang.String str) {
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            ((AbstractC55721xpL) it.next()).AEQbTJ(str);
        }
    }

    private final void KWHzl(TradeAllOrderApi tradeAllOrderApi) {
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) ((TradeAllOrderApi) obj).getOrderIdByAll())) {
                pUU.KWHzl(this.KWHzl, "checkAddOrEditOrder instId->" + tradeAllOrderApi.getInstIdByALl());
                EZpvd(tradeAllOrderApi, i);
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        this.valueOf.add(0, tradeAllOrderApi);
    }

    private final int AYXKKw(TradeAllOrderApi tradeAllOrderApi) {
        java.util.Iterator<TradeAllOrderApi> it = this.valueOf.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) it.next().getOrderIdByAll())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void gEmmrt(TradeAllOrderApi tradeAllOrderApi) {
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) ((TradeAllOrderApi) obj).getOrderIdByAll())) {
                pUU.KWHzl(this.KWHzl, "replaceOrdersItem instId->" + tradeAllOrderApi.getInstIdByALl());
                EZpvd(tradeAllOrderApi, i);
            }
            i++;
        }
    }
}
