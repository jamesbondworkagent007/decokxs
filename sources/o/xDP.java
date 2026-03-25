package o;

import com.google.gson.JsonObject;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyHistoryListReq;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C54401xHa;
import o.xKK;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xDP extends xGQ<java.lang.Object> implements InterfaceC55705xow {
    public static volatile xDP EZpvd;
    public final C56247xzH AEQbTJ;
    public final LinkedBlockingDeque<java.lang.String> AYXKKw;
    public volatile boolean AhwBna;
    public AbstractC57556yke AkhnZx;
    public final C56258xzS DbNXlk;
    public final C56245xzF OLrzqt;
    public volatile boolean copydefault;
    public InterfaceC58217yxC djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final C56259xzT gEmmrt;
    public final AbstractC55720xpK valueOf;
    public final Function0<CopyOnWriteArrayList<BizTradeStrategyInfo>> values;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function0<? extends java.util.concurrent.CopyOnWriteArrayList<com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo>> */
    /* JADX WARN: Multi-variable type inference failed */
    public xDP(@NotNull java.lang.String str, @NotNull AbstractC55720xpK abstractC55720xpK, boolean z, Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55720xpK, "");
        this.fetchVPNInfo = str;
        this.valueOf = abstractC55720xpK;
        this.values = function0;
        this.DbNXlk = new C56258xzS();
        this.OLrzqt = new C56245xzF();
        this.gEmmrt = new C56259xzT();
        this.AEQbTJ = new C56247xzH();
        this.AYXKKw = new LinkedBlockingDeque<>();
        if (z) {
            AEQbTJ((BizTradeStrategyInfo) null);
            return;
        }
        this.copydefault = true;
        abstractC55720xpK.OLrzqt("http", djBIcL(), this, java.lang.Boolean.FALSE);
        if (!abstractC55720xpK.KWHzl().getHasWs() || abstractC55720xpK.KWHzl().isHistory()) {
            return;
        }
        AkhnZx();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xDP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xDP$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ xDP getInstance$default(Activity activity, java.lang.String str, AbstractC55720xpK abstractC55720xpK, boolean z, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            return activity.KWHzl(str, abstractC55720xpK, z, function0);
        }

        public final xDP KWHzl(@NotNull java.lang.String str, @NotNull AbstractC55720xpK abstractC55720xpK, boolean z, Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(abstractC55720xpK, "");
            xDP xdp = xDP.EZpvd;
            if (xdp == null) {
                synchronized (this) {
                    xdp = xDP.EZpvd;
                    if (xdp == null) {
                        xdp = new xDP(str, abstractC55720xpK, z, function0);
                        Activity activity = xDP.Companion;
                        xDP.EZpvd = xdp;
                    }
                }
            }
            return xdp;
        }

        public final void OLrzqt() {
            synchronized (this) {
                xDP xdp = xDP.EZpvd;
                if (xdp != null) {
                    xdp.valueOf();
                }
                Activity activity = xDP.Companion;
                xDP.EZpvd = null;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final CopyOnWriteArrayList<BizTradeStrategyInfo> djBIcL() {
        CopyOnWriteArrayList<BizTradeStrategyInfo> copyOnWriteArrayListInvoke;
        Function0<CopyOnWriteArrayList<BizTradeStrategyInfo>> function0 = this.values;
        return (function0 == null || (copyOnWriteArrayListInvoke = function0.invoke()) == null) ? new CopyOnWriteArrayList<>() : copyOnWriteArrayListInvoke;
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        if (this.valueOf.KWHzl().getHasWs()) {
            valueOf();
        }
        AEQbTJ((BizTradeStrategyInfo) null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (djBIcL().size() > 0) {
            AEQbTJ((BizTradeStrategyInfo) CollectionsKt___CollectionsKt.AubY(djBIcL()));
        }
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        BizTradeStrategyInfo bizTradeStrategyInfo = obj instanceof BizTradeStrategyInfo ? (BizTradeStrategyInfo) obj : null;
        if (bizTradeStrategyInfo != null) {
            java.util.Iterator<BizTradeStrategyInfo> it = djBIcL().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getOrderAlgoId(), (java.lang.Object) bizTradeStrategyInfo.getOrderAlgoId())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0 || i >= djBIcL().size()) {
                return;
            }
            xDZ.EZpvd(djBIcL(), i, bizTradeStrategyInfo);
        }
    }

    public final void AEQbTJ(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderAlgoId;
        this.copydefault = false;
        java.lang.String sortType = this.valueOf.KWHzl().getHistoryReq().getSortType();
        if (bizTradeStrategyInfo == null) {
            djBIcL().clear();
            orderAlgoId = null;
        } else if (Intrinsics.EZpvd((java.lang.Object) sortType, (java.lang.Object) "filledTime")) {
            orderAlgoId = bizTradeStrategyInfo.getUTimeValue();
        } else {
            orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
        }
        if (this.valueOf.KWHzl().isHistory()) {
            StrategyHistoryListReq historyReq = this.valueOf.KWHzl().getHistoryReq();
            historyReq.setAfter(orderAlgoId);
            if (Intrinsics.EZpvd((java.lang.Object) historyReq.getOrdType(), (java.lang.Object) "all_bot")) {
                AEQbTJ(historyReq, C33129mqd.OLrzqt((java.lang.CharSequence) orderAlgoId));
                return;
            } else {
                EZpvd(historyReq, C33129mqd.OLrzqt((java.lang.CharSequence) orderAlgoId));
                return;
            }
        }
        StrategyPendingListReq pendingReq = this.valueOf.KWHzl().getPendingReq();
        pendingReq.setAfter(orderAlgoId);
        if (Intrinsics.EZpvd((java.lang.Object) pendingReq.getOrdType(), (java.lang.Object) "all_bot")) {
            EZpvd(pendingReq, C33129mqd.OLrzqt((java.lang.CharSequence) orderAlgoId));
        } else {
            AEQbTJ(pendingReq, C33129mqd.OLrzqt((java.lang.CharSequence) orderAlgoId));
        }
    }

    public final void AEQbTJ(StrategyPendingListReq strategyPendingListReq, final boolean z) {
        C56258xzS c56258xzS = this.DbNXlk;
        c56258xzS.KWHzl(strategyPendingListReq);
        c56258xzS.KWHzl(new Function1() { // from class: o.xEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDP.djBIcL(this.EZpvd, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56258xzS, 0L, 1, null);
    }

    public static final Unit djBIcL(xDP xdp, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xdp.OLrzqt((ResponseData<java.util.List<StrategyPendingListResp>>) responseData, z);
        return Unit.INSTANCE;
    }

    public final void EZpvd(StrategyPendingListReq strategyPendingListReq, final boolean z) {
        C56245xzF c56245xzF = this.OLrzqt;
        c56245xzF.KWHzl(strategyPendingListReq.getLimit());
        c56245xzF.AhwBna(strategyPendingListReq.getSystemSource());
        c56245xzF.copydefault(strategyPendingListReq.getNmpUnderlyingIds());
        c56245xzF.AEQbTJ(strategyPendingListReq.getRequireProfits());
        c56245xzF.AEQbTJ(strategyPendingListReq.getSortOrder());
        c56245xzF.OLrzqt(strategyPendingListReq.getSortType());
        c56245xzF.EZpvd(strategyPendingListReq.getBaseCoins());
        c56245xzF.KWHzl(new Function1() { // from class: o.xDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDP.AEQbTJ(this.EZpvd, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56245xzF, 0L, 1, null);
    }

    public static final Unit AEQbTJ(xDP xdp, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xdp.OLrzqt((ResponseData<java.util.List<StrategyPendingListResp>>) responseData, z);
        return Unit.INSTANCE;
    }

    public final void EZpvd(StrategyHistoryListReq strategyHistoryListReq, final boolean z) {
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String strKWHzl = c33489mxS.KWHzl(StrategyHistoryListReq.Companion.serializer(), strategyHistoryListReq);
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.util.HashMap map = new java.util.HashMap((java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl));
        if (Intrinsics.EZpvd(map.get("instType"), (java.lang.Object) "ANY")) {
            map.remove("instType");
        }
        map.put("requireHisSnapshots", java.lang.String.valueOf(strategyHistoryListReq.getRequireProfits()));
        C56259xzT c56259xzT = this.gEmmrt;
        c56259xzT.copydefault(map);
        c56259xzT.KWHzl(new Function1() { // from class: o.xDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDP.gEmmrt(this.OLrzqt, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56259xzT, 0L, 1, null);
    }

    public static final Unit gEmmrt(xDP xdp, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xdp.EZpvd((ResponseData<java.util.List<StrategyHistoryListResp>>) responseData, z);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(StrategyHistoryListReq strategyHistoryListReq, final boolean z) {
        C56247xzH c56247xzH = this.AEQbTJ;
        c56247xzH.copydefault(strategyHistoryListReq);
        c56247xzH.KWHzl(new Function1() { // from class: o.xDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDP.AYXKKw(this.EZpvd, z, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56247xzH, 0L, 1, null);
    }

    public static final Unit AYXKKw(xDP xdp, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xdp.EZpvd((ResponseData<java.util.List<StrategyHistoryListResp>>) responseData, z);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<? extends BizTradeStrategyInfo> list, boolean z) {
        djBIcL().addAll(list);
        this.valueOf.OLrzqt("http", djBIcL(), this, java.lang.Boolean.valueOf(list.isEmpty()));
        if (!this.valueOf.KWHzl().getHasWs() || this.valueOf.KWHzl().isHistory() || z) {
            return;
        }
        AkhnZx();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea A[ORIG_RETURN, RETURN] */
    @Override // o.xGQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String bJ_() {
        java.lang.String originalType = this.valueOf.KWHzl().getOriginalType();
        switch (originalType.hashCode()) {
            case -1831183611:
                return !originalType.equals("spot_dca") ? "algo-advance" : "algo-spot-dca";
            case -1574173039:
                if (originalType.equals("infinite_grid")) {
                    return "grid-orders-infinite";
                }
                break;
            case -1418042064:
                if (originalType.equals("ai_bot")) {
                    return "algo-ai-bot";
                }
                break;
            case -1402017003:
                if (originalType.equals("contract_dca")) {
                    return "algo-contract-dca";
                }
                break;
            case -1216369070:
                if (originalType.equals("smart_portfolio")) {
                    return "algo-smart-portfolio";
                }
                break;
            case -1148661171:
                if (originalType.equals("smart_iceberg")) {
                    return "slicing-orders-iceberg";
                }
                break;
            case -1086683216:
                if (originalType.equals("signal_bot")) {
                    return "algo-signalbot";
                }
                break;
            case -911839703:
                if (originalType.equals("all_bot")) {
                    return this.valueOf.KWHzl().getPendingReq().isSms() ? "all-algos-sms" : "all-algos";
                }
            case -591806012:
                if (originalType.equals("moon_grid")) {
                    return "grid-orders-moon";
                }
                break;
            case -557961837:
                if (originalType.equals("smart_arbitrage")) {
                    return "algo-smart-arbitrage";
                }
                break;
            case -512749997:
                if (originalType.equals("contract_grid")) {
                    return "grid-orders-contract-priv";
                }
                break;
            case 3181382:
                if (originalType.equals("grid")) {
                    return "grid-orders-spot-priv";
                }
                break;
            case 1165749981:
                if (originalType.equals("recurring")) {
                    return "algo-recurring";
                }
                break;
            case 1485620813:
                if (originalType.equals("dcd_bot")) {
                    return "algo-dcd-bot";
                }
                break;
            case 1780188297:
                if (originalType.equals("arbitrage")) {
                    return "algo-arbitrage";
                }
                break;
        }
    }

    public final void AkhnZx() {
        java.lang.String strBJ_ = bJ_();
        java.lang.String originalType = this.valueOf.KWHzl().getOriginalType();
        int iHashCode = originalType.hashCode();
        JsonObject jsonObject = null;
        java.lang.String instType = (iHashCode == -911839703 ? !originalType.equals("all_bot") : iHashCode == -557961837 ? !originalType.equals("smart_arbitrage") : !(iHashCode == 1485620813 && originalType.equals("dcd_bot"))) ? this.valueOf.KWHzl().getPendingReq().getInstType() : null;
        StrategyPendingListReq pendingReq = this.valueOf.KWHzl().getPendingReq();
        java.lang.String instId = pendingReq.isCurrentPair() ? null : pendingReq.getInstId();
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf.KWHzl().getPendingReq().getSystemSource(), (java.lang.Object) "nmp")) {
            StrategyPendingListReq pendingReq2 = this.valueOf.KWHzl().getPendingReq();
            jsonObject = new JsonObject();
            jsonObject.addProperty("systemSource", "nmp");
            jsonObject.addProperty("nmpUnderlyingIds", pendingReq2.getNmpUnderlyingIds());
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, instId, null, instType, null, this.valueOf.KWHzl().getPendingReq().getAlgoId(), null, jsonObject, 84, null), (Function1) null, 4, (java.lang.Object) null);
        this.AkhnZx = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        gEmmrt();
    }

    @Override // o.xGQ
    public C57567ykp AYXKKw() {
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf.KWHzl().getOriginalType(), (java.lang.Object) "infinite_grid") ? C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, true, false, null, 53, null) : super.AYXKKw();
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return;
        }
        this.AhwBna = true;
        this.AYXKKw.put(str);
    }

    public final void gEmmrt() {
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xDP.EZpvd(this.AEQbTJ, (java.lang.Long) obj);
            }
        };
        this.djBIcL = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xDP.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xDP xdp, java.lang.Long l) {
        xdp.KWHzl();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        if (this.AhwBna) {
            if (copydefault()) {
                this.valueOf.OLrzqt("WebSocket", djBIcL(), this, java.lang.Boolean.FALSE);
            }
            this.AhwBna = false;
        }
    }

    public final boolean copydefault() {
        if (!this.copydefault) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.AYXKKw.isEmpty()) {
            arrayList.add(this.AYXKKw.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.util.List<StrategyPendingListResp> listOLrzqt = OLrzqt((java.lang.String) next);
                if (listOLrzqt != null) {
                    if (z || KWHzl(listOLrzqt)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    public final boolean KWHzl(@NotNull java.util.List<StrategyPendingListResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String ordType = this.valueOf.KWHzl().getPendingReq().getOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "iceberg") || Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "twap")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((StrategyPendingListResp) obj).getOrderType(), (java.lang.Object) ordType)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        return copydefault(list);
    }

    private final java.util.List<StrategyPendingListResp> OLrzqt(java.lang.String str) {
        java.util.List<StrategyPendingListResp> listEZpvd = new C56035xvH().EZpvd(str);
        if (listEZpvd == null || listEZpvd.isEmpty()) {
            return null;
        }
        return listEZpvd;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if ((obj instanceof AbstractC55720xpK) && !Intrinsics.EZpvd((java.lang.Object) ((AbstractC55720xpK) obj).OLrzqt(), (java.lang.Object) this.valueOf.OLrzqt())) {
            return false;
        }
        valueOf();
        return true;
    }

    public final void valueOf() {
        AbstractC57556yke abstractC57556yke = this.AkhnZx;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd(bJ_(), this.AkhnZx);
        this.AkhnZx = null;
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.DbNXlk.AYXKKw();
        this.OLrzqt.AYXKKw();
        this.gEmmrt.AYXKKw();
        this.AEQbTJ.AYXKKw();
    }

    public final void OLrzqt(ResponseData<java.util.List<StrategyPendingListResp>> responseData, boolean z) {
        this.copydefault = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<StrategyPendingListResp> data = responseData.getData();
            if (data != null) {
                copydefault(data, z);
                return;
            }
            return;
        }
        this.valueOf.AEQbTJ(responseData.getMsg());
    }

    public final void EZpvd(ResponseData<java.util.List<StrategyHistoryListResp>> responseData, boolean z) {
        this.copydefault = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List<StrategyHistoryListResp> data = responseData.getData();
            if (data != null) {
                copydefault(data, z);
                return;
            }
            return;
        }
        this.valueOf.AEQbTJ(responseData.getMsg());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x000b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x000b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(@NotNull java.util.List<StrategyPendingListResp> list) {
        java.util.Iterator<BizTradeStrategyInfo> it;
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = false;
        for (StrategyPendingListResp strategyPendingListResp : list) {
            java.lang.String state = strategyPendingListResp.getState();
            int i2 = -1;
            switch (state.hashCode()) {
                case -1884319283:
                    if (!state.equals("stopped")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                            CopyOnWriteArrayList<BizTradeStrategyInfo> copyOnWriteArrayListDjBIcL = djBIcL();
                            java.util.Iterator<BizTradeStrategyInfo> it2 = djBIcL().iterator();
                            int i3 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    if (Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getAlgoId(), (java.lang.Object) it2.next().getOrderAlgoId())) {
                                        i2 = i3;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            xDZ.EZpvd(copyOnWriteArrayListDjBIcL, i2, strategyPendingListResp);
                            z = true;
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                                i = -1;
                            } else {
                                if (!Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getAlgoId(), (java.lang.Object) it.next().getOrderAlgoId())) {
                                    i++;
                                }
                            }
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                            djBIcL().remove(i);
                            z = true;
                        }
                    }
                    break;
                case -1468651097:
                    if (!state.equals("effective")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case -1402931637:
                    if (!state.equals("completed")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case -123173735:
                    if (!state.equals("canceled")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 51:
                    if (!state.equals("3")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 54:
                    if (!state.equals(OrderDetailListItem.SLIP_OUT)) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 55:
                    if (!state.equals("7")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 1567:
                    if (!state.equals("10")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 1573:
                    if (!state.equals("16")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 3540994:
                    if (!state.equals("stop")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 651875918:
                    if (!state.equals("order_failed")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                case 1797799776:
                    if (!state.equals("all_done")) {
                        if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                        }
                    } else {
                        pUU.KWHzl("BotOrderListTask", strategyPendingListResp.getAlgoId() + ": state change to " + state);
                        it = djBIcL().iterator();
                        i = 0;
                        while (true) {
                            if (it.hasNext()) {
                            }
                            i++;
                        }
                        if (!C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
                        }
                    }
                    break;
                default:
                    if (!this.valueOf.KWHzl().getPendingReq().isSms()) {
                    }
                    break;
            }
        }
        return z;
    }
}
