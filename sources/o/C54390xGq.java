package o;

import com.flyco.tablayout.BuildConfig;
import com.okinc.biz.StrategyType;
import com.okinc.core.widget.SortTextView;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.StrategyHistoryListReq;
import com.okinc.unify_trade.biz.StrategyListReqGroup;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import o.InterfaceC55705xow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54390xGq extends xGQ<java.util.List<? extends BizTradeStrategyInfo>> implements InterfaceC55705xow {
    public InterfaceC58217yxC AEQbTJ;
    public final C54435xIh AYXKKw;
    public final java.lang.String AhwBna;
    public volatile boolean EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final java.util.ArrayList<BizTradeStrategyInfo> OLrzqt;
    public final LinkedBlockingDeque<java.lang.String> copydefault;
    public AbstractC55731xpV djBIcL;
    public AbstractC57556yke gEmmrt;

    /* JADX INFO: renamed from: o.xGq$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyType.values().length];
            try {
                iArr[StrategyType.GRID.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyType.CONTRACT_GRID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyType.RECURRING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyType.ARBITRAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyType.SMART_PORTFOLIO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyType.MOON_GRID.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[StrategyType.SPOT_DCA.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[StrategyType.CONTRACT_DCA.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[StrategyType.INFINITE_GRID.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[StrategyType.SMART_ICEBERG.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[StrategyType.SIGNAL_BOT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[StrategyType.SMART_ARBITRAGE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[StrategyType.DCD_BOT.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[StrategyType.LLMBot.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            copydefault = iArr;
        }
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public C54390xGq(@NotNull java.lang.String str, AbstractC55731xpV abstractC55731xpV) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.djBIcL = abstractC55731xpV;
        this.OLrzqt = new java.util.ArrayList<>();
        this.copydefault = new LinkedBlockingDeque<>();
        this.AYXKKw = new C54435xIh();
        AEQbTJ((BizTradeStrategyInfo) null);
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        StrategyListReqGroup strategyListReqGroupKWHzl;
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        if (abstractC55731xpV != null && (strategyListReqGroupKWHzl = abstractC55731xpV.KWHzl()) != null && strategyListReqGroupKWHzl.getHasWs()) {
            KWHzl();
        }
        AEQbTJ((BizTradeStrategyInfo) null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (this.OLrzqt.size() > 0) {
            AEQbTJ((BizTradeStrategyInfo) CollectionsKt___CollectionsKt.AubY(this.OLrzqt));
        }
    }

    public final void AEQbTJ(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderAlgoId;
        StrategyListReqGroup strategyListReqGroupKWHzl;
        StrategyListReqGroup strategyListReqGroupKWHzl2;
        StrategyHistoryListReq historyReq;
        this.EZpvd = false;
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        StrategyPendingListReq pendingReq = null;
        java.lang.String sortType = (abstractC55731xpV == null || (strategyListReqGroupKWHzl2 = abstractC55731xpV.KWHzl()) == null || (historyReq = strategyListReqGroupKWHzl2.getHistoryReq()) == null) ? null : historyReq.getSortType();
        if (bizTradeStrategyInfo == null) {
            this.OLrzqt.clear();
            orderAlgoId = null;
        } else if (Intrinsics.EZpvd((java.lang.Object) sortType, (java.lang.Object) "filledTime")) {
            orderAlgoId = bizTradeStrategyInfo.getUTimeValue();
        } else {
            orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
        }
        AbstractC55731xpV abstractC55731xpV2 = this.djBIcL;
        if (abstractC55731xpV2 != null) {
            Intrinsics.copydefault(abstractC55731xpV2);
            if (abstractC55731xpV2.KWHzl().isHistory()) {
                AbstractC55731xpV abstractC55731xpV3 = this.djBIcL;
                Intrinsics.copydefault(abstractC55731xpV3);
                StrategyHistoryListReq historyReq2 = abstractC55731xpV3.KWHzl().getHistoryReq();
                historyReq2.setAfter(orderAlgoId);
                InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                this.AEQbTJ = this.AYXKKw.KWHzl(historyReq2, (InterfaceC55701xos<java.util.List<BizTradeStrategyInfo>>) new TaskDescription(orderAlgoId));
                return;
            }
        }
        AbstractC55731xpV abstractC55731xpV4 = this.djBIcL;
        if (abstractC55731xpV4 == null) {
            return;
        }
        if (abstractC55731xpV4 != null && (strategyListReqGroupKWHzl = abstractC55731xpV4.KWHzl()) != null) {
            pendingReq = strategyListReqGroupKWHzl.getPendingReq();
        }
        if (pendingReq != null) {
            pendingReq.setAfter(orderAlgoId);
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AEQbTJ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        C54435xIh c54435xIh = this.AYXKKw;
        Intrinsics.copydefault(pendingReq);
        this.AEQbTJ = c54435xIh.KWHzl(pendingReq, new Activity(orderAlgoId));
    }

    /* JADX INFO: renamed from: o.xGq$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends BizTradeStrategyInfo>> {
        public final /* synthetic */ java.lang.String KWHzl;

        public TaskDescription(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        public void EZpvd(boolean z, java.util.List<? extends BizTradeStrategyInfo> list, java.lang.Exception exc) {
            java.lang.String message;
            C54390xGq.this.EZpvd = true;
            if (z) {
                if (list == null || list.size() != 1 || C54390xGq.this.OLrzqt.size() <= 0 || !Intrinsics.EZpvd((java.lang.Object) ((BizTradeStrategyInfo) C54390xGq.this.OLrzqt.get(C54390xGq.this.OLrzqt.size() - 1)).getOrderAlgoId(), (java.lang.Object) list.get(0).getOrderAlgoId())) {
                    C54390xGq c54390xGq = C54390xGq.this;
                    if (list == null) {
                        list = yDY.AhwBna();
                    }
                    c54390xGq.copydefault(list, this.KWHzl != null);
                    return;
                }
                C54390xGq.this.copydefault();
                return;
            }
            if (exc instanceof BizApiException) {
                AbstractC55731xpV abstractC55731xpV = C54390xGq.this.djBIcL;
                if (abstractC55731xpV != null) {
                    abstractC55731xpV.EZpvd(((BizApiException) exc).getMsg());
                    return;
                }
                return;
            }
            AbstractC55731xpV abstractC55731xpV2 = C54390xGq.this.djBIcL;
            if (abstractC55731xpV2 != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                abstractC55731xpV2.EZpvd(message);
            }
        }
    }

    /* JADX INFO: renamed from: o.xGq$Activity */
    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends BizTradeStrategyInfo>> {
        public final /* synthetic */ java.lang.String copydefault;

        public Activity(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<? extends BizTradeStrategyInfo> list, java.lang.Exception exc) {
            java.lang.String message;
            BizTradeStrategyInfo bizTradeStrategyInfo;
            C54390xGq.this.EZpvd = true;
            if (z) {
                if (list != null && list.size() == 1 && C54390xGq.this.OLrzqt.size() > 0) {
                    BizTradeStrategyInfo bizTradeStrategyInfo2 = (BizTradeStrategyInfo) C54390xGq.this.OLrzqt.get(C54390xGq.this.OLrzqt.size() - 1);
                    java.lang.String orderAlgoId = null;
                    java.lang.String orderAlgoId2 = bizTradeStrategyInfo2 != null ? bizTradeStrategyInfo2.getOrderAlgoId() : null;
                    if (list != null && (bizTradeStrategyInfo = list.get(0)) != null) {
                        orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) orderAlgoId2, (java.lang.Object) orderAlgoId)) {
                        C54390xGq.this.copydefault();
                        return;
                    }
                }
                C54390xGq c54390xGq = C54390xGq.this;
                if (list == null) {
                    list = yDY.AhwBna();
                }
                c54390xGq.copydefault(list, this.copydefault != null);
                return;
            }
            if (exc instanceof BizApiException) {
                AbstractC55731xpV abstractC55731xpV = C54390xGq.this.djBIcL;
                if (abstractC55731xpV != null) {
                    abstractC55731xpV.EZpvd(((BizApiException) exc).getMsg());
                    return;
                }
                return;
            }
            AbstractC55731xpV abstractC55731xpV2 = C54390xGq.this.djBIcL;
            if (abstractC55731xpV2 != null) {
                if (exc == null || (message = exc.getMessage()) == null) {
                    message = "";
                }
                abstractC55731xpV2.EZpvd(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<? extends BizTradeStrategyInfo> list, boolean z) {
        AbstractC55731xpV abstractC55731xpV;
        StrategyListReqGroup strategyListReqGroupKWHzl;
        StrategyListReqGroup strategyListReqGroupKWHzl2;
        copydefault(list);
        AbstractC55731xpV abstractC55731xpV2 = this.djBIcL;
        if (abstractC55731xpV2 != null) {
            abstractC55731xpV2.KWHzl("http", new java.util.ArrayList<>(this.OLrzqt), this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55731xpV = this.djBIcL) == null || (strategyListReqGroupKWHzl = abstractC55731xpV.KWHzl()) == null || !strategyListReqGroupKWHzl.getHasWs()) {
            return;
        }
        AbstractC55731xpV abstractC55731xpV3 = this.djBIcL;
        if (abstractC55731xpV3 == null || (strategyListReqGroupKWHzl2 = abstractC55731xpV3.KWHzl()) == null || !strategyListReqGroupKWHzl2.isHistory()) {
            gEmmrt();
        }
    }

    private final void copydefault(java.util.List<? extends BizTradeStrategyInfo> list) {
        this.OLrzqt.addAll(list);
    }

    public final void copydefault() {
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        if (abstractC55731xpV != null) {
            abstractC55731xpV.KWHzl("http", new java.util.ArrayList<>(this.OLrzqt), this, java.lang.Boolean.TRUE);
        }
    }

    @Override // o.xGQ
    public java.lang.String bJ_() {
        StrategyListReqGroup strategyListReqGroupKWHzl;
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        StrategyType originalType = (abstractC55731xpV == null || (strategyListReqGroupKWHzl = abstractC55731xpV.KWHzl()) == null) ? null : strategyListReqGroupKWHzl.getOriginalType();
        switch (originalType == null ? -1 : ActionBar.copydefault[originalType.ordinal()]) {
            case 1:
                return "grid-orders-spot-priv";
            case 2:
                return "grid-orders-contract-priv";
            case 3:
                return "algo-recurring";
            case 4:
                return "algo-arbitrage";
            case 5:
                return "algo-smart-portfolio";
            case 6:
                return "grid-orders-moon";
            case 7:
                return "algo-spot-dca";
            case 8:
                return "algo-contract-dca";
            case 9:
                return "grid-orders-infinite";
            case 10:
                return "slicing-orders-iceberg";
            case 11:
                return "algo-signalbot";
            case 12:
                return "algo-smart-arbitrage";
            case 13:
                return "algo-dcd-bot";
            case 14:
                return "algo-ai-bot";
            default:
                return "algo-advance";
        }
    }

    private final void gEmmrt() {
        StrategyListReqGroup strategyListReqGroupKWHzl;
        StrategyPendingListReq pendingReq;
        StrategyListReqGroup strategyListReqGroupKWHzl2;
        StrategyPendingListReq pendingReq2;
        StrategyListReqGroup strategyListReqGroupKWHzl3;
        StrategyPendingListReq pendingReq3;
        java.lang.String strBJ_ = bJ_();
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        java.lang.String instType = (abstractC55731xpV == null || (strategyListReqGroupKWHzl3 = abstractC55731xpV.KWHzl()) == null || (pendingReq3 = strategyListReqGroupKWHzl3.getPendingReq()) == null) ? null : pendingReq3.getInstType();
        AbstractC55731xpV abstractC55731xpV2 = this.djBIcL;
        java.lang.String instId = (abstractC55731xpV2 == null || (strategyListReqGroupKWHzl2 = abstractC55731xpV2.KWHzl()) == null || (pendingReq2 = strategyListReqGroupKWHzl2.getPendingReq()) == null) ? null : pendingReq2.getInstId();
        AbstractC55731xpV abstractC55731xpV3 = this.djBIcL;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, instId, null, instType, null, (abstractC55731xpV3 == null || (strategyListReqGroupKWHzl = abstractC55731xpV3.KWHzl()) == null || (pendingReq = strategyListReqGroupKWHzl.getPendingReq()) == null) ? null : pendingReq.getAlgoId(), null, null, BuildConfig.VERSION_CODE, null), (Function1) null, 4, (java.lang.Object) null);
        this.gEmmrt = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public C57567ykp AYXKKw() {
        StrategyListReqGroup strategyListReqGroupKWHzl;
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        if (((abstractC55731xpV == null || (strategyListReqGroupKWHzl = abstractC55731xpV.KWHzl()) == null) ? null : strategyListReqGroupKWHzl.getOriginalType()) == StrategyType.INFINITE_GRID) {
            return C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, true, false, null, 53, null);
        }
        return super.AYXKKw();
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.copydefault.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizTradeStrategyInfo> bD_() {
        java.util.ArrayList arrayList;
        StrategyListReqGroup strategyListReqGroupKWHzl;
        if (!this.EZpvd) {
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
            java.util.List<StrategyPendingListResp> listCopydefault = copydefault((java.lang.String) next);
            if (listCopydefault != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listCopydefault) {
                    StrategyType strategyType = C56119xwm.AEQbTJ().get(((StrategyPendingListResp) obj).getOrderType());
                    AbstractC55731xpV abstractC55731xpV = this.djBIcL;
                    if (strategyType == ((abstractC55731xpV == null || (strategyListReqGroupKWHzl = abstractC55731xpV.KWHzl()) == null) ? null : strategyListReqGroupKWHzl.getOriginalType())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                EZpvd(arrayList);
            }
        }
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55731xpV abstractC55731xpV = this.djBIcL;
        if (abstractC55731xpV != null) {
            abstractC55731xpV.KWHzl("WebSocket", new java.util.ArrayList<>(list), this, null);
        }
    }

    private final java.util.List<StrategyPendingListResp> copydefault(java.lang.String str) {
        java.util.List<StrategyPendingListResp> listEZpvd = new C56035xvH().EZpvd(str);
        if (listEZpvd == null || listEZpvd.isEmpty()) {
            return null;
        }
        return listEZpvd;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(@NotNull java.util.List<StrategyPendingListResp> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (StrategyPendingListResp strategyPendingListResp : list) {
            java.lang.String state = strategyPendingListResp.getState();
            switch (state.hashCode()) {
                case -1884319283:
                    if (state.equals("stopped")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case -1821824562:
                    if (state.equals("no_close_position")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case -1784744586:
                    if (state.equals("partially_effective")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case -1468651097:
                    if (state.equals("effective")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case -1402931637:
                    if (state.equals("completed")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case -123173735:
                    if (state.equals("canceled")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 3322092:
                    if (state.equals("live")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 3540994:
                    if (state.equals("stop")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 106440182:
                    if (state.equals("pause")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 651875918:
                    if (state.equals("order_failed")) {
                        AEQbTJ(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 1316806720:
                    if (state.equals("starting")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 1550783935:
                    if (state.equals("running")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                case 1715648628:
                    if (state.equals("stopping")) {
                        copydefault(strategyPendingListResp);
                    } else {
                        copydefault(strategyPendingListResp);
                    }
                    break;
                default:
                    copydefault(strategyPendingListResp);
                    break;
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55731xpV) {
            java.lang.String strCopydefault = ((AbstractC55731xpV) obj).copydefault();
            AbstractC55731xpV abstractC55731xpV = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55731xpV != null ? abstractC55731xpV.copydefault() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        AbstractC57556yke abstractC57556yke = this.gEmmrt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd(bJ_(), this.gEmmrt);
        this.gEmmrt = null;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AEQbTJ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void AEQbTJ(@NotNull StrategyPendingListResp strategyPendingListResp) {
        Intrinsics.checkNotNullParameter(strategyPendingListResp, "");
        java.util.Iterator<BizTradeStrategyInfo> it = this.OLrzqt.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getAlgoId(), (java.lang.Object) it.next().getOrderAlgoId())) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            this.OLrzqt.remove(i);
        }
    }

    public final void copydefault(StrategyPendingListResp strategyPendingListResp) {
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : this.OLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getOrderAlgoId(), (java.lang.Object) ((BizTradeStrategyInfo) obj).getOrderAlgoId())) {
                this.OLrzqt.set(i, strategyPendingListResp);
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        this.OLrzqt.add(0, strategyPendingListResp);
    }
}
