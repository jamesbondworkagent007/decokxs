package o;

import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54399xGz extends xGQ<java.util.List<? extends StrategyOrderBillDetailsResponse>> implements InterfaceC55705xow {
    public volatile boolean AEQbTJ;
    public final java.util.List<java.lang.String> AYXKKw;
    public final java.lang.String AhwBna;
    public InterfaceC58217yxC EZpvd;
    public final java.util.ArrayList<StrategyOrderBillDetailsResponse> KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public AbstractC55733xpX copydefault;
    public AbstractC57556yke djBIcL;
    public final C56256xzQ gEmmrt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends StrategyOrderBillDetailsResponse> list) {
        OLrzqt((java.util.List<StrategyOrderBillDetailsResponse>) list);
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public C54399xGz(@NotNull java.lang.String str, AbstractC55733xpX abstractC55733xpX) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.copydefault = abstractC55733xpX;
        this.gEmmrt = new C56256xzQ();
        this.KWHzl = new java.util.ArrayList<>();
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.AYXKKw = yDY.gEmmrt("contract_grid", "infinite_grid");
        loadOrderList$default(this, null, 1, null);
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        if (abstractC55733xpX != null && (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) != null && strategyOrderBillDetailsReqGroupCopydefault.getHasWs()) {
            KWHzl();
        }
        loadOrderList$default(this, null, 1, null);
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        copydefault((StrategyOrderBillDetailsResponse) CollectionsKt___CollectionsKt.wlaJM(this.KWHzl));
    }

    public static /* synthetic */ void loadOrderList$default(C54399xGz c54399xGz, StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyOrderBillDetailsResponse = null;
        }
        c54399xGz.copydefault(strategyOrderBillDetailsResponse);
    }

    public final void copydefault(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        final java.lang.String ordId;
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        StrategyOrderBillDetailsReq req;
        this.AEQbTJ = false;
        if (strategyOrderBillDetailsResponse == null) {
            this.KWHzl.clear();
            ordId = null;
        } else {
            ordId = strategyOrderBillDetailsResponse.getOrdId();
        }
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        if (abstractC55733xpX == null) {
            return;
        }
        if (abstractC55733xpX != null && (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) != null && (req = strategyOrderBillDetailsReqGroupCopydefault.getReq()) != null) {
            req.setAfter(ordId);
        }
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<StrategyOrderBillDetailsReq> kSerializerSerializer = StrategyOrderBillDetailsReq.Companion.serializer();
        AbstractC55733xpX abstractC55733xpX2 = this.copydefault;
        Intrinsics.copydefault(abstractC55733xpX2);
        java.lang.String strKWHzl = c33489mxS.KWHzl(kSerializerSerializer, abstractC55733xpX2.copydefault().getReq());
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) c33489mxS.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), strKWHzl);
        C56256xzQ c56256xzQ = this.gEmmrt;
        c56256xzQ.AEQbTJ(map);
        c56256xzQ.KWHzl(new Function1() { // from class: o.xGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54399xGz.EZpvd(this.EZpvd, ordId, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56256xzQ, 0L, 1, null);
    }

    public static final Unit EZpvd(C54399xGz c54399xGz, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c54399xGz.AEQbTJ = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c54399xGz.KWHzl((java.util.List) data, str != null);
        } else {
            AbstractC55733xpX abstractC55733xpX = c54399xGz.copydefault;
            if (abstractC55733xpX != null) {
                abstractC55733xpX.KWHzl(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(java.util.List<StrategyOrderBillDetailsResponse> list, boolean z) {
        AbstractC55733xpX abstractC55733xpX;
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault2;
        StrategyOrderBillDetailsReq req;
        copydefault(list);
        AbstractC55733xpX abstractC55733xpX2 = this.copydefault;
        if (abstractC55733xpX2 != null) {
            abstractC55733xpX2.AEQbTJ("http", new java.util.ArrayList(this.KWHzl), this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55733xpX = this.copydefault) == null || (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) == null || !strategyOrderBillDetailsReqGroupCopydefault.getHasWs()) {
            return;
        }
        AbstractC55733xpX abstractC55733xpX3 = this.copydefault;
        if (C33129mqd.OLrzqt((java.lang.Object) ((abstractC55733xpX3 == null || (strategyOrderBillDetailsReqGroupCopydefault2 = abstractC55733xpX3.copydefault()) == null || (req = strategyOrderBillDetailsReqGroupCopydefault2.getReq()) == null) ? null : req.getType()), (java.lang.Object) 0)) {
            djBIcL();
        }
    }

    private final void copydefault(java.util.List<StrategyOrderBillDetailsResponse> list) {
        this.KWHzl.addAll(list);
    }

    @Override // o.xGQ
    public java.lang.String bJ_() {
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        if (copydefault()) {
            return "grid-sub-orders";
        }
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        java.lang.String ordType = (abstractC55733xpX == null || (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) == null) ? null : strategyOrderBillDetailsReqGroupCopydefault.getOrdType();
        return Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "signal_bot") ? "signalbot-sub-orders" : Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "smart_iceberg") ? "slicing-sub-orders" : "algo-trade-order";
    }

    private final void djBIcL() {
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        StrategyOrderBillDetailsReq req;
        java.lang.String strBJ_ = bJ_();
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, null, null, "ANY", null, (abstractC55733xpX == null || (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) == null || (req = strategyOrderBillDetailsReqGroupCopydefault.getReq()) == null) ? null : req.getAlgoId(), null, null, 208, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    public final boolean copydefault() {
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        java.util.List<java.lang.String> list = this.AYXKKw;
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list), (abstractC55733xpX == null || (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX.copydefault()) == null) ? null : strategyOrderBillDetailsReqGroupCopydefault.getOrdType());
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.OLrzqt.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public java.util.List<StrategyOrderBillDetailsResponse> bD_() {
        java.util.ArrayList arrayList;
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault;
        StrategyOrderBillDetailsReq req;
        java.lang.String side;
        StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroupCopydefault2;
        StrategyOrderBillDetailsReq req2;
        java.lang.String groupId;
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
            java.util.List<StrategyOrderBillDetailsResponse> listOLrzqt = OLrzqt((java.lang.String) next);
            if (listOLrzqt != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : listOLrzqt) {
                    StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse = (StrategyOrderBillDetailsResponse) obj;
                    AbstractC55733xpX abstractC55733xpX = this.copydefault;
                    if (abstractC55733xpX == null || (strategyOrderBillDetailsReqGroupCopydefault2 = abstractC55733xpX.copydefault()) == null || (req2 = strategyOrderBillDetailsReqGroupCopydefault2.getReq()) == null || (groupId = req2.getGroupId()) == null || Intrinsics.EZpvd((java.lang.Object) groupId, (java.lang.Object) strategyOrderBillDetailsResponse.getGroupId())) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList3) {
                    StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2 = (StrategyOrderBillDetailsResponse) obj2;
                    AbstractC55733xpX abstractC55733xpX2 = this.copydefault;
                    if (abstractC55733xpX2 == null || (strategyOrderBillDetailsReqGroupCopydefault = abstractC55733xpX2.copydefault()) == null || (req = strategyOrderBillDetailsReqGroupCopydefault.getReq()) == null || (side = req.getSide()) == null || Intrinsics.EZpvd((java.lang.Object) side, (java.lang.Object) strategyOrderBillDetailsResponse2.getSide())) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                KWHzl(arrayList);
            }
        }
        return this.KWHzl;
    }

    public void OLrzqt(@NotNull java.util.List<StrategyOrderBillDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55733xpX abstractC55733xpX = this.copydefault;
        if (abstractC55733xpX != null) {
            abstractC55733xpX.AEQbTJ("WebSocket", new java.util.ArrayList(list), this, null);
        }
    }

    private final java.util.List<StrategyOrderBillDetailsResponse> OLrzqt(java.lang.String str) {
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyOrderBillDetailsResponse.Companion.serializer()), str);
            if (list != null && !list.isEmpty()) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void KWHzl(@NotNull java.util.List<StrategyOrderBillDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse : list) {
            java.lang.String state = strategyOrderBillDetailsResponse.getState();
            switch (state.hashCode()) {
                case -1884319283:
                    if (state.equals("stopped")) {
                        EZpvd(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                case -1274499742:
                    if (state.equals("filled")) {
                        EZpvd(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                case -123173735:
                    if (state.equals("canceled")) {
                        EZpvd(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                case 3322092:
                    if (state.equals("live")) {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                case 22875123:
                    if (state.equals("partially_filled")) {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                case 1889341808:
                    if (state.equals("cancelling")) {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    } else {
                        OLrzqt(strategyOrderBillDetailsResponse);
                    }
                    break;
                default:
                    OLrzqt(strategyOrderBillDetailsResponse);
                    break;
            }
        }
    }

    public final boolean AEQbTJ(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse, StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse2) {
        java.lang.String algoOrdType = strategyOrderBillDetailsResponse2.getAlgoOrdType();
        int iHashCode = algoOrdType.hashCode();
        if (iHashCode == -1574173039 ? algoOrdType.equals("infinite_grid") : !(iHashCode == -512749997 ? !algoOrdType.equals("contract_grid") : !(iHashCode == 3181382 && algoOrdType.equals("grid")))) {
            return Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getClientOrdId(), (java.lang.Object) strategyOrderBillDetailsResponse2.getClientOrdId());
        }
        return Intrinsics.EZpvd((java.lang.Object) strategyOrderBillDetailsResponse.getOrdId(), (java.lang.Object) strategyOrderBillDetailsResponse2.getOrdId());
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55733xpX) {
            java.lang.String strAEQbTJ = ((AbstractC55733xpX) obj).AEQbTJ();
            AbstractC55733xpX abstractC55733xpX = this.copydefault;
            if (!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) (abstractC55733xpX != null ? abstractC55733xpX.AEQbTJ() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd(bJ_(), this.djBIcL);
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.djBIcL = null;
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.gEmmrt.AYXKKw();
    }

    public final void EZpvd(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        java.util.Iterator<StrategyOrderBillDetailsResponse> it = this.KWHzl.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AEQbTJ(it.next(), strategyOrderBillDetailsResponse)) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            this.KWHzl.remove(i);
        }
    }

    public final void OLrzqt(StrategyOrderBillDetailsResponse strategyOrderBillDetailsResponse) {
        java.util.Iterator<StrategyOrderBillDetailsResponse> it = this.KWHzl.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AEQbTJ(it.next(), strategyOrderBillDetailsResponse)) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            Intrinsics.checkNotNullExpressionValue(this.KWHzl.set(i, strategyOrderBillDetailsResponse), "");
        } else {
            this.KWHzl.add(0, strategyOrderBillDetailsResponse);
            Unit unit = Unit.INSTANCE;
        }
    }
}
