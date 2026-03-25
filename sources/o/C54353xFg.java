package o;

import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.api.subscribe.orders.AllOrderDataInfo;
import com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C54411xHk;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54353xFg extends xGQ<java.util.List<? extends TradeAllOrderApi>> implements InterfaceC55705xow {
    public final java.lang.String AEQbTJ;
    public final C54316xDx AYXKKw;
    public boolean AhwBna;
    public java.lang.String AkhnZx;
    public final xDC DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public volatile boolean OLrzqt;
    public boolean copydefault;
    public final LinkedBlockingDeque<java.lang.String> djBIcL;
    public final java.lang.String fIwbmz;
    public final CopyOnWriteArrayList<AbstractC55723xpN> fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public AbstractC57556yke isConnected;
    public final CopyOnWriteArrayList<TradeAllOrderApi> valueOf;
    public final CopyOnWriteArrayList<TradeAllOrderApi> values;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public C54353xFg(@NotNull java.lang.String str, @NotNull AbstractC55723xpN abstractC55723xpN) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55723xpN, "");
        this.fIwbmz = str;
        this.AEQbTJ = "TradeAllOrderTask";
        this.valueOf = new CopyOnWriteArrayList<>();
        this.values = new CopyOnWriteArrayList<>();
        this.AkhnZx = "";
        this.djBIcL = new LinkedBlockingDeque<>();
        this.DbNXlk = new xDC();
        this.AYXKKw = new C54316xDx();
        this.fetchVPNInfo = new CopyOnWriteArrayList<>();
        OLrzqt(abstractC55723xpN);
        copydefault((TradeAllOrderApi) null);
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public final BizAllOrderReq djBIcL() {
        AbstractC55723xpN abstractC55723xpN = (AbstractC55723xpN) CollectionsKt___CollectionsKt.firstOrNull(this.fetchVPNInfo);
        if (abstractC55723xpN != null) {
            return abstractC55723xpN.KWHzl();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(TradeAllOrderApi tradeAllOrderApi) {
        boolean z;
        java.lang.String markByPage;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || newProxyInstance.fARcdN()) {
            this.OLrzqt = false;
            BizAllOrderReq bizAllOrderReqDjBIcL = djBIcL();
            if (bizAllOrderReqDjBIcL == null || !Intrinsics.EZpvd(bizAllOrderReqDjBIcL.isHistory(), java.lang.Boolean.TRUE)) {
                z = false;
            } else {
                BizAllOrderReq bizAllOrderReqDjBIcL2 = djBIcL();
                if (Intrinsics.EZpvd((java.lang.Object) (bizAllOrderReqDjBIcL2 != null ? bizAllOrderReqDjBIcL2.getSortType() : null), (java.lang.Object) "filledTime")) {
                    z = true;
                }
            }
            if (tradeAllOrderApi == null) {
                this.valueOf.clear();
                markByPage = null;
            } else if (z) {
                markByPage = tradeAllOrderApi.getUTimeValue();
            } else {
                markByPage = tradeAllOrderApi.getMarkByPage();
            }
            this.AhwBna = markByPage != null;
            BizAllOrderReq bizAllOrderReqDjBIcL3 = djBIcL();
            if (bizAllOrderReqDjBIcL3 == null) {
                return;
            }
            if (bizAllOrderReqDjBIcL3.isHistory() != null) {
                java.lang.Boolean boolIsHistory = bizAllOrderReqDjBIcL3.isHistory();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(boolIsHistory, bool)) {
                    xDC xdc = this.DbNXlk;
                    xdc.copydefault(!Intrinsics.EZpvd((java.lang.Object) bizAllOrderReqDjBIcL3.getInstType(), (java.lang.Object) "ANY") ? bizAllOrderReqDjBIcL3.getInstType() : null);
                    xdc.EZpvd(bizAllOrderReqDjBIcL3.getInstId());
                    xdc.AEQbTJ(markByPage);
                    xdc.OLrzqt(bizAllOrderReqDjBIcL3.getLimit());
                    xdc.KWHzl(new Function1() { // from class: o.xFf
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C54353xFg.EZpvd(this.OLrzqt, (ResponseData) obj);
                        }
                    });
                    xKK.Activity.execute$default(xdc, 0L, 1, null);
                    pUU.KWHzl(this.AEQbTJ, "startHttp");
                } else {
                    C54316xDx c54316xDx = this.AYXKKw;
                    c54316xDx.EZpvd(!Intrinsics.EZpvd((java.lang.Object) bizAllOrderReqDjBIcL3.getInstType(), (java.lang.Object) "ANY") ? bizAllOrderReqDjBIcL3.getInstType() : null);
                    c54316xDx.copydefault(bizAllOrderReqDjBIcL3.getInstId());
                    c54316xDx.OLrzqt(markByPage);
                    c54316xDx.valueOf(bizAllOrderReqDjBIcL3.getLimit());
                    c54316xDx.AEQbTJ(bizAllOrderReqDjBIcL3.getBegin());
                    c54316xDx.KWHzl(bizAllOrderReqDjBIcL3.getEnd());
                    c54316xDx.copydefault(bizAllOrderReqDjBIcL3.getHideCanceled());
                    c54316xDx.AYXKKw(bizAllOrderReqDjBIcL3.getSortType());
                    c54316xDx.OLrzqt(java.lang.Boolean.valueOf(Intrinsics.EZpvd(bizAllOrderReqDjBIcL3.is90Days(), bool)));
                    c54316xDx.KWHzl(new Function1() { // from class: o.xFj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C54353xFg.AEQbTJ(this.KWHzl, (ResponseData) obj);
                        }
                    });
                    xKK.Activity.execute$default(c54316xDx, 0L, 1, null);
                }
            }
            if (this.AhwBna || !Intrinsics.EZpvd(bizAllOrderReqDjBIcL3.getHasWs(), java.lang.Boolean.TRUE)) {
                return;
            }
            DbNXlk();
        }
    }

    public static final Unit EZpvd(C54353xFg c54353xFg, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c54353xFg.KWHzl = true;
        java.lang.String str = c54353xFg.AEQbTJ;
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        int code = responseData.getCode();
        java.util.List list = (java.util.List) responseData.getData();
        pUU.KWHzl(str, "it.isSucceedAndDataValid:" + z + " code:" + code + " data:" + (list != null ? java.lang.Integer.valueOf(list.size()) : null));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            c54353xFg.copydefault = false;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c54353xFg.copydefault((java.util.List<? extends TradeAllOrderApi>) data, c54353xFg.AhwBna);
            c54353xFg.OLrzqt = true;
        } else {
            c54353xFg.copydefault = true;
            pUU.KWHzl(c54353xFg.AEQbTJ, "errorMsg:" + responseData.getMsg());
            c54353xFg.copydefault(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54353xFg c54353xFg, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c54353xFg.KWHzl = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c54353xFg.copydefault((java.util.List<? extends TradeAllOrderApi>) data, c54353xFg.AhwBna);
            c54353xFg.OLrzqt = true;
        } else {
            c54353xFg.copydefault(responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.util.List<? extends TradeAllOrderApi> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
        pUU.KWHzl("TradeAllOrderTask", "onResult size:" + list.size() + " content:" + list);
        java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            ((AbstractC55723xpN) it.next()).OLrzqt(str, list, interfaceC55705xow, bool);
        }
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizAllOrderReq bizAllOrderReqDjBIcL = djBIcL();
        if (bizAllOrderReqDjBIcL != null && Intrinsics.EZpvd(bizAllOrderReqDjBIcL.getHasWs(), java.lang.Boolean.TRUE)) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            copyOnWriteArrayList.addAll(this.fetchVPNInfo);
            isConnected();
            this.fetchVPNInfo.clear();
            this.EZpvd = false;
            this.fetchVPNInfo.addAll(copyOnWriteArrayList);
        }
        java.lang.String str = this.AEQbTJ;
        BizAllOrderReq bizAllOrderReqDjBIcL2 = djBIcL();
        java.lang.Boolean hasWs = bizAllOrderReqDjBIcL2 != null ? bizAllOrderReqDjBIcL2.getHasWs() : null;
        pUU.EZpvd(str, "refresh req?.hasWs " + hasWs + " mAlreadyStop " + this.EZpvd + " orderListeners " + this.fetchVPNInfo.size() + "}");
        copydefault((TradeAllOrderApi) null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (this.valueOf.size() > 0) {
            copydefault((TradeAllOrderApi) CollectionsKt___CollectionsKt.AubY(this.valueOf));
        }
    }

    private final void copydefault(java.util.List<? extends TradeAllOrderApi> list, boolean z) {
        BizAllOrderReq bizAllOrderReqDjBIcL;
        copydefault(list);
        CopyOnWriteArrayList<TradeAllOrderApi> copyOnWriteArrayList = this.valueOf;
        int size = list.size();
        BizAllOrderReq bizAllOrderReqDjBIcL2 = djBIcL();
        KWHzl("http", copyOnWriteArrayList, this, java.lang.Boolean.valueOf(size < C33129mqd.AhwBna(bizAllOrderReqDjBIcL2 != null ? bizAllOrderReqDjBIcL2.getLimit() : null)));
        java.lang.String str = this.AEQbTJ;
        BizAllOrderReq bizAllOrderReqDjBIcL3 = djBIcL();
        pUU.KWHzl(str, "updateRequestOrders isLoadMore:" + z + " req?.hasWs:" + (bizAllOrderReqDjBIcL3 != null ? bizAllOrderReqDjBIcL3.getHasWs() : null));
        if (z || (bizAllOrderReqDjBIcL = djBIcL()) == null || !Intrinsics.EZpvd(bizAllOrderReqDjBIcL.getHasWs(), java.lang.Boolean.TRUE)) {
            return;
        }
        pUU.KWHzl(this.AEQbTJ, "startWsTimer");
        KWHzl(700L);
    }

    private final void copydefault(java.util.List<? extends TradeAllOrderApi> list) {
        this.valueOf.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.AEQbTJ, " taskKey:" + this.fIwbmz + " CHANNEL_ALL_ORDERS data: " + str + " ");
        OLrzqt(true);
        this.djBIcL.put(str);
        this.AkhnZx = str;
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        C55749xpn c55749xpn = C55749xpn.OLrzqt;
        c55749xpn.OLrzqt(c55749xpn.AEQbTJ());
        c55749xpn.KWHzl(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void DbNXlk() {
        boolean z = this.EZpvd;
        if (z) {
            this.EZpvd = !z;
            return;
        }
        BizAllOrderReq bizAllOrderReqDjBIcL = djBIcL();
        java.lang.String instType = bizAllOrderReqDjBIcL != null ? bizAllOrderReqDjBIcL.getInstType() : null;
        BizAllOrderReq bizAllOrderReqDjBIcL2 = djBIcL();
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "group-order-priv", new WsArgV5("group-order-priv", bizAllOrderReqDjBIcL2 != null ? bizAllOrderReqDjBIcL2.getInstId() : null, null, instType, null, null, null, null, 244, null), (Function1) null, 4, (java.lang.Object) null);
        this.isConnected = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        pUU.KWHzl(this.AEQbTJ, "startWs");
        pUU.KWHzl(this.AEQbTJ, "taskKey:" + this.fIwbmz + " CHANNEL_ALL_ORDERS: group-order-priv subscribe");
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradeAllOrderApi> bD_() {
        if (!this.OLrzqt) {
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
                        AYXKKw(tradeAllOrderApiConvertDataByOrderType);
                    }
                }
            }
        }
        this.values.clear();
        java.util.List<AllOrderDataInfo> listKWHzl2 = AllOrderDataInfo.Companion.KWHzl(this.AkhnZx);
        if (listKWHzl2 != null) {
            java.util.Iterator<T> it3 = listKWHzl2.iterator();
            while (it3.hasNext()) {
                TradeAllOrderApi tradeAllOrderApiConvertDataByOrderType2 = ((AllOrderDataInfo) it3.next()).convertDataByOrderType(false);
                if (tradeAllOrderApiConvertDataByOrderType2 != null) {
                    this.values.add(tradeAllOrderApiConvertDataByOrderType2);
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
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<? extends TradeAllOrderApi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl("WebSocket", this.valueOf, this, null);
        for (TradeAllOrderApi tradeAllOrderApi : this.values) {
            if (tradeAllOrderApi instanceof TradeOrderData) {
                TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
                pUU.KWHzl(this.AEQbTJ, "amend order ws data: " + tradeAllOrderApi + "--" + tradeOrderData.getOrdId() + "-" + tradeOrderData.getAmendResult());
                for (AbstractC55723xpN abstractC55723xpN : this.fetchVPNInfo) {
                    C54411xHk.StateListAnimator stateListAnimator = C54411xHk.Companion;
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.copydefault(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ())), tradeOrderData.getAmendResult())) {
                        abstractC55723xpN.AEQbTJ(tradeAllOrderApi);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [284=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.equals("starting") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0.equals("order_failed") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r0.equals("pause") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r0.equals("stop") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r0.equals("canceled") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (r0.equals("filled") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r0.equals("completed") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r0.equals("effective") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (r0.equals("partially_effective") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r0.equals("part_deal") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r0.equals("no_close_position") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        KWHzl(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e3, code lost:
    
        if (r0.equals("stopped") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e6, code lost:
    
        com.okinc.rxutils.RxBus.KWHzl("trade_balance_refresh");
        r6.getStateByAll();
        r6.getInstIdByALl();
        OLrzqt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0.equals("stopping") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0.equals("running") == false) goto L59;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(@NotNull TradeAllOrderApi tradeAllOrderApi) {
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
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
                    int iAEQbTJ = AEQbTJ(tradeAllOrderApi);
                    if (iAEQbTJ != -1) {
                        pUU.KWHzl(this.AEQbTJ, "updateWsOrder change  instId->" + tradeAllOrderApi.getInstIdByALl());
                        OLrzqt(tradeAllOrderApi, iAEQbTJ);
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
                    EZpvd(tradeAllOrderApi);
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

    public final void OLrzqt(TradeAllOrderApi tradeAllOrderApi, int i) {
        java.lang.String uTimeValue = this.valueOf.get(i).getUTimeValue();
        java.lang.String uTimeValue2 = tradeAllOrderApi.getUTimeValue();
        if (C33129mqd.copydefault(uTimeValue2, uTimeValue)) {
            pUU.KWHzl(this.AEQbTJ, "updateOrder instId->" + tradeAllOrderApi.getInstIdByALl() + " oldTime:" + uTimeValue + " newTime:" + uTimeValue2);
            this.valueOf.set(i, tradeAllOrderApi);
        }
    }

    public final void isConnected() {
        java.lang.String str = this.AEQbTJ;
        java.lang.String str2 = this.fIwbmz;
        pUU.KWHzl(str, "taskKey:" + str2 + " release taskKey:" + str2);
        AbstractC57556yke abstractC57556yke = this.isConnected;
        if (abstractC57556yke == null) {
            this.EZpvd = true;
        }
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("group-order-priv", this.isConnected);
        this.isConnected = null;
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.AYXKKw.AYXKKw();
        this.DbNXlk.AYXKKw();
        java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            OLrzqt(it.next());
        }
        C55749xpn.OLrzqt.EZpvd((java.lang.String) null);
        this.values.clear();
        this.valueOf.clear();
    }

    public final void OLrzqt(@NotNull AbstractC55723xpN abstractC55723xpN) {
        Intrinsics.checkNotNullParameter(abstractC55723xpN, "");
        if (Intrinsics.EZpvd((java.lang.Object) abstractC55723xpN.EZpvd(), (java.lang.Object) this.fIwbmz)) {
            copydefault();
            if (this.KWHzl) {
                if (this.copydefault) {
                    copydefault((TradeAllOrderApi) null);
                } else {
                    abstractC55723xpN.OLrzqt("http", this.valueOf, this, null);
                }
            }
            this.fetchVPNInfo.add(abstractC55723xpN);
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.fIwbmz;
            boolean z = this.fetchVPNInfo.size() == 1;
            pUU.KWHzl(str, "taskKey:" + str2 + " isFirstAdd:" + z + "; isHttpDataInit:" + this.KWHzl + "; isHttpError:" + this.copydefault + "； addListener registeredSource:" + abstractC55723xpN.copydefault());
        }
    }

    public final void copydefault() {
        C55749xpn c55749xpn = C55749xpn.OLrzqt;
        c55749xpn.copydefault(gEmmrt());
        c55749xpn.EZpvd(valueOf());
        c55749xpn.OLrzqt(KWHzl());
    }

    public final Function0<java.lang.String> gEmmrt() {
        return new Function0() { // from class: o.xFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54353xFg.AYXKKw(this.copydefault);
            }
        };
    }

    public static final java.lang.String AYXKKw(C54353xFg c54353xFg) {
        OKWsConnectionState oKWsConnectionStateEZpvd;
        java.lang.String strName;
        AbstractC57556yke abstractC57556yke = c54353xFg.isConnected;
        if (abstractC57556yke == null || (oKWsConnectionStateEZpvd = abstractC57556yke.EZpvd()) == null || (strName = oKWsConnectionStateEZpvd.name()) == null) {
            return null;
        }
        java.lang.String lowerCase = strName.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final java.lang.Long copydefault(C54353xFg c54353xFg) {
        AbstractC57556yke abstractC57556yke = c54353xFg.isConnected;
        if (abstractC57556yke != null) {
            return java.lang.Long.valueOf(abstractC57556yke.copydefault());
        }
        return null;
    }

    public final Function0<java.lang.Long> KWHzl() {
        return new Function0() { // from class: o.xFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54353xFg.copydefault(this.AEQbTJ);
            }
        };
    }

    public final Function0<java.lang.String> valueOf() {
        return new Function0() { // from class: o.xFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54353xFg.KWHzl(this.KWHzl);
            }
        };
    }

    public static final java.lang.String KWHzl(C54353xFg c54353xFg) {
        AbstractC57556yke abstractC57556yke = c54353xFg.isConnected;
        if (abstractC57556yke != null) {
            return abstractC57556yke.AEQbTJ();
        }
        return null;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55723xpN) {
            java.util.Iterator<AbstractC55723xpN> it = this.fetchVPNInfo.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().OLrzqt(), (java.lang.Object) ((AbstractC55723xpN) obj).OLrzqt())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            this.fetchVPNInfo.remove(i);
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.fIwbmz;
            pUU.KWHzl(str, "taskKey:" + str2 + " removeListener taskKey:" + str2 + " registeredSource:" + ((AbstractC55723xpN) obj).copydefault());
            if (this.fetchVPNInfo.size() == 0) {
                isConnected();
                return true;
            }
        }
        return false;
    }

    public final void copydefault(java.lang.String str) {
        java.util.Iterator<T> it = this.fetchVPNInfo.iterator();
        while (it.hasNext()) {
            ((AbstractC55723xpN) it.next()).KWHzl(str);
        }
    }

    public final void OLrzqt(TradeAllOrderApi tradeAllOrderApi) {
        java.util.Iterator<TradeAllOrderApi> it = this.valueOf.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) it.next().getOrderIdByAll())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            CopyOnWriteArrayList<TradeAllOrderApi> copyOnWriteArrayList = this.valueOf;
            copyOnWriteArrayList.remove(copyOnWriteArrayList.get(i));
        }
    }

    public final void KWHzl(TradeAllOrderApi tradeAllOrderApi) {
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) ((TradeAllOrderApi) obj).getOrderIdByAll())) {
                pUU.KWHzl(this.AEQbTJ, "checkAddOrEditOrder instId->" + tradeAllOrderApi.getInstIdByALl());
                OLrzqt(tradeAllOrderApi, i);
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        this.valueOf.add(0, tradeAllOrderApi);
    }

    public final int AEQbTJ(TradeAllOrderApi tradeAllOrderApi) {
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

    public final void EZpvd(TradeAllOrderApi tradeAllOrderApi) {
        int i = 0;
        for (java.lang.Object obj : this.valueOf) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradeAllOrderApi.getOrderIdByAll(), (java.lang.Object) ((TradeAllOrderApi) obj).getOrderIdByAll())) {
                pUU.KWHzl(this.AEQbTJ, "replaceOrdersItem instId->" + tradeAllOrderApi.getInstIdByALl());
                OLrzqt(tradeAllOrderApi, i);
            }
            i++;
        }
    }
}
