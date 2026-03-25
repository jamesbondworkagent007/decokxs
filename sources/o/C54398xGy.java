package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.biz.StrategyType;
import com.okinc.core.widget.SortTextView;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyOrderReq;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55705xow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54398xGy extends xGQ<java.util.List<? extends BizTradeStrategyInfo>> implements InterfaceC55705xow {
    public InterfaceC58217yxC AEQbTJ;
    public AbstractC57556yke AYXKKw;
    public final java.util.ArrayList<BizTradeStrategyInfo> AhwBna;
    public InterfaceC58217yxC EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public volatile boolean OLrzqt;
    public final java.lang.String copydefault;
    public AbstractC55730xpU djBIcL;
    public final java.lang.String gEmmrt;
    public final C54435xIh valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC55730xpU KWHzl() {
        return this.djBIcL;
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public C54398xGy(@NotNull java.lang.String str, AbstractC55730xpU abstractC55730xpU) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.djBIcL = abstractC55730xpU;
        this.copydefault = "TradeStrategyOrderTask";
        this.AhwBna = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        this.valueOf = new C54435xIh();
        OLrzqt((BizTradeStrategyInfo) null);
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl;
        AbstractC55730xpU abstractC55730xpU = this.djBIcL;
        if (abstractC55730xpU != null && (bizTradeStrategyOrderReqKWHzl = abstractC55730xpU.KWHzl()) != null && bizTradeStrategyOrderReqKWHzl.getHasWs()) {
            copydefault();
        }
        OLrzqt((BizTradeStrategyInfo) null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (this.AhwBna.size() > 0) {
            OLrzqt((BizTradeStrategyInfo) CollectionsKt___CollectionsKt.AubY(this.AhwBna));
        }
    }

    private final void OLrzqt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String orderAlgoId;
        java.lang.String str;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl;
        this.OLrzqt = false;
        AbstractC55730xpU abstractC55730xpU = this.djBIcL;
        java.lang.String sortType = (abstractC55730xpU == null || (bizTradeStrategyOrderReqKWHzl = abstractC55730xpU.KWHzl()) == null) ? null : bizTradeStrategyOrderReqKWHzl.getSortType();
        if (bizTradeStrategyInfo == null) {
            this.AhwBna.clear();
            str = null;
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) sortType, (java.lang.Object) "filledTime")) {
                orderAlgoId = bizTradeStrategyInfo.getUTimeValue();
            } else {
                orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
            }
            str = orderAlgoId;
        }
        AbstractC55730xpU abstractC55730xpU2 = this.djBIcL;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl2 = abstractC55730xpU2 != null ? abstractC55730xpU2.KWHzl() : null;
        if (Intrinsics.EZpvd((java.lang.Object) (bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getInstType() : null), (java.lang.Object) "OPTION")) {
            KWHzl(new java.util.ArrayList(), str != null);
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AEQbTJ = this.valueOf.OLrzqt(bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.isHistory() : false, (Intrinsics.EZpvd((java.lang.Object) (bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getInstType() : null), (java.lang.Object) "ANY") || bizTradeStrategyOrderReqKWHzl2 == null) ? null : bizTradeStrategyOrderReqKWHzl2.getInstType(), bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getInstId() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getOrderType() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getState() : null, str, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getStartTime() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getEndTime() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getSide() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getDirection() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getTdMode() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getLimit() : null, bizTradeStrategyOrderReqKWHzl2 != null ? bizTradeStrategyOrderReqKWHzl2.getSortType() : null, new TaskDescription(str));
    }

    /* JADX INFO: renamed from: o.xGy$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends TradeStrategyOrderData>> {
        public final /* synthetic */ java.lang.String copydefault;

        public TaskDescription(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TradeStrategyOrderData> list, java.lang.Exception exc) {
            java.lang.String message;
            C54398xGy.this.OLrzqt = true;
            if (z) {
                C54398xGy c54398xGy = C54398xGy.this;
                Intrinsics.copydefault(list);
                c54398xGy.KWHzl(list, this.copydefault != null);
            } else {
                if (exc instanceof BizApiException) {
                    AbstractC55730xpU abstractC55730xpUKWHzl = C54398xGy.this.KWHzl();
                    if (abstractC55730xpUKWHzl != null) {
                        abstractC55730xpUKWHzl.OLrzqt(((BizApiException) exc).getMsg());
                        return;
                    }
                    return;
                }
                AbstractC55730xpU abstractC55730xpUKWHzl2 = C54398xGy.this.KWHzl();
                if (abstractC55730xpUKWHzl2 != null) {
                    if (exc == null || (message = exc.getMessage()) == null) {
                        message = "";
                    }
                    abstractC55730xpUKWHzl2.OLrzqt(message);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.util.List<? extends BizTradeStrategyInfo> list, boolean z) {
        AbstractC55730xpU abstractC55730xpU;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl;
        EZpvd(list);
        AbstractC55730xpU abstractC55730xpU2 = this.djBIcL;
        if (abstractC55730xpU2 != null) {
            abstractC55730xpU2.copydefault("http", this.AhwBna, this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55730xpU = this.djBIcL) == null || (bizTradeStrategyOrderReqKWHzl = abstractC55730xpU.KWHzl()) == null || !bizTradeStrategyOrderReqKWHzl.getHasWs()) {
            return;
        }
        valueOf();
    }

    private final void EZpvd(java.util.List<? extends BizTradeStrategyInfo> list) {
        this.AhwBna.addAll(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list));
    }

    private final void valueOf() {
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl2;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl3;
        AbstractC55730xpU abstractC55730xpU = this.djBIcL;
        java.lang.String instId = null;
        java.lang.String instType = (abstractC55730xpU == null || (bizTradeStrategyOrderReqKWHzl3 = abstractC55730xpU.KWHzl()) == null) ? null : bizTradeStrategyOrderReqKWHzl3.getInstType();
        AbstractC55730xpU abstractC55730xpU2 = this.djBIcL;
        java.lang.String instFamily = (abstractC55730xpU2 == null || (bizTradeStrategyOrderReqKWHzl2 = abstractC55730xpU2.KWHzl()) == null) ? null : bizTradeStrategyOrderReqKWHzl2.getInstFamily();
        AbstractC55730xpU abstractC55730xpU3 = this.djBIcL;
        if (abstractC55730xpU3 != null && (bizTradeStrategyOrderReqKWHzl = abstractC55730xpU3.KWHzl()) != null) {
            instId = bizTradeStrategyOrderReqKWHzl.getInstId();
        }
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "orders-algo", new WsArgV5("orders-algo", instId, instFamily, instType, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), (Function1) null, 4, (java.lang.Object) null);
        this.AYXKKw = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.KWHzl.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public java.util.List<BizTradeStrategyInfo> bD_() {
        java.util.ArrayList arrayList;
        BizTradeStrategyOrderReq bizTradeStrategyOrderReqKWHzl;
        if (!this.OLrzqt) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList2.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList2.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<BizTradeStrategyInfo> listEZpvd = TradeStrategyOrderData.Companion.EZpvd((java.lang.String) next);
            if (listEZpvd != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listEZpvd) {
                    StrategyType strategyType = C56119xwm.AEQbTJ().get(((BizTradeStrategyInfo) obj).getOrderType());
                    AbstractC55730xpU abstractC55730xpU = this.djBIcL;
                    if (strategyType == ((abstractC55730xpU == null || (bizTradeStrategyOrderReqKWHzl = abstractC55730xpU.KWHzl()) == null) ? null : bizTradeStrategyOrderReqKWHzl.getOriginType())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                OLrzqt((java.util.List<? extends BizTradeStrategyInfo>) arrayList);
            }
        }
        return this.AhwBna;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55730xpU abstractC55730xpU = this.djBIcL;
        if (abstractC55730xpU != null) {
            abstractC55730xpU.copydefault("WebSocket", new java.util.ArrayList<>(list), this, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [193=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void OLrzqt(@NotNull java.util.List<? extends BizTradeStrategyInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (BizTradeStrategyInfo bizTradeStrategyInfo : list) {
            java.lang.String orderState = bizTradeStrategyInfo.getOrderState();
            switch (orderState.hashCode()) {
                case -1809526472:
                    if (orderState.equals("part_deal")) {
                        EZpvd(bizTradeStrategyInfo.getOrderAlgoId());
                    }
                    break;
                case -1784744586:
                    if (orderState.equals("partially_effective") && yDV.valueOf(new java.lang.String[]{"oco", "conditional"}, bizTradeStrategyInfo.getOrderType())) {
                        KWHzl(bizTradeStrategyInfo);
                    }
                    break;
                case -1468651097:
                    if (orderState.equals("effective")) {
                        EZpvd(bizTradeStrategyInfo.getOrderAlgoId());
                    }
                    break;
                case -123173735:
                    if (orderState.equals("canceled")) {
                        EZpvd(bizTradeStrategyInfo.getOrderAlgoId());
                    }
                    break;
                case 3322092:
                    if (orderState.equals("live")) {
                        int iEZpvd = EZpvd(bizTradeStrategyInfo);
                        if (iEZpvd == -1) {
                            this.AhwBna.add(0, bizTradeStrategyInfo);
                        } else {
                            this.AhwBna.set(iEZpvd, bizTradeStrategyInfo);
                        }
                    }
                    break;
                case 651875918:
                    if (orderState.equals("order_failed")) {
                        EZpvd(bizTradeStrategyInfo.getOrderAlgoId());
                    }
                    break;
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55730xpU) {
            java.lang.String strEZpvd = ((AbstractC55730xpU) obj).EZpvd();
            AbstractC55730xpU abstractC55730xpU = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) (abstractC55730xpU != null ? abstractC55730xpU.EZpvd() : null))) {
                return false;
            }
        }
        copydefault();
        return true;
    }

    public final void copydefault() {
        C54407xHg.Companion.EZpvd("orders-algo", this.AYXKKw);
        AbstractC57556yke abstractC57556yke = this.AYXKKw;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.AYXKKw = null;
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
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

    private final int EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.Iterator<BizTradeStrategyInfo> it = this.AhwBna.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderAlgoId(), (java.lang.Object) it.next().getOrderAlgoId())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void KWHzl(BizTradeStrategyInfo bizTradeStrategyInfo) {
        boolean z = false;
        int i = 0;
        for (java.lang.Object obj : this.AhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderAlgoId(), (java.lang.Object) ((BizTradeStrategyInfo) obj).getOrderAlgoId())) {
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

    private final void EZpvd(java.lang.String str) {
        java.util.Iterator<BizTradeStrategyInfo> it = this.AhwBna.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) it.next().getOrderAlgoId())) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            this.AhwBna.remove(i);
        }
    }
}
