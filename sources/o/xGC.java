package o;

import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGC extends xGQ<java.util.List<? extends StrategyPositionResponse>> implements InterfaceC55705xow {
    public InterfaceC58217yxC AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C56261xzV AhwBna;
    public final java.lang.String EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public volatile boolean OLrzqt;
    public final java.util.ArrayList<StrategyPositionResponse> copydefault;
    public AbstractC55715xpF djBIcL;
    public AbstractC57556yke gEmmrt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends StrategyPositionResponse> list) {
        KWHzl((java.util.List<StrategyPositionResponse>) list);
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xGC(@NotNull java.lang.String str, AbstractC55715xpF abstractC55715xpF) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.djBIcL = abstractC55715xpF;
        this.EZpvd = "TradeStrategyOrderBillDetailsTask";
        this.copydefault = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        this.AhwBna = new C56261xzV();
        djBIcL();
    }

    public final java.lang.String copydefault() {
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        java.lang.String ordType;
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        return (abstractC55715xpF == null || (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF.AEQbTJ()) == null || (ordType = tradeStrategyPositionReqGroupAEQbTJ.getOrdType()) == null) ? "" : ordType;
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        if (abstractC55715xpF != null && (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF.AEQbTJ()) != null && tradeStrategyPositionReqGroupAEQbTJ.getHasWs()) {
            KWHzl();
        }
        djBIcL();
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        if (abstractC55715xpF != null && (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF.AEQbTJ()) != null && tradeStrategyPositionReqGroupAEQbTJ.getHasWs()) {
            KWHzl();
        }
        djBIcL();
    }

    private final void djBIcL() {
        java.lang.String algoId;
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        this.OLrzqt = false;
        this.copydefault.clear();
        C56261xzV c56261xzV = this.AhwBna;
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        if (abstractC55715xpF == null || (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF.AEQbTJ()) == null || (algoId = tradeStrategyPositionReqGroupAEQbTJ.getAlgoId()) == null) {
            algoId = "";
        }
        c56261xzV.AEQbTJ(algoId);
        c56261xzV.KWHzl(new Function1() { // from class: o.xGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGC.copydefault(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56261xzV, 0L, 1, null);
    }

    public static final Unit copydefault(xGC xgc, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xgc.OLrzqt = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            xgc.copydefault((java.util.List<StrategyPositionResponse>) data);
        } else {
            AbstractC55715xpF abstractC55715xpF = xgc.djBIcL;
            if (abstractC55715xpF != null) {
                abstractC55715xpF.OLrzqt(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(java.util.List<StrategyPositionResponse> list) {
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        OLrzqt(list);
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        if (abstractC55715xpF != null) {
            abstractC55715xpF.AEQbTJ("http", new java.util.ArrayList<>(this.copydefault));
        }
        AbstractC55715xpF abstractC55715xpF2 = this.djBIcL;
        if (abstractC55715xpF2 == null || (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF2.AEQbTJ()) == null || !tradeStrategyPositionReqGroupAEQbTJ.getHasWs()) {
            return;
        }
        isConnected();
    }

    private final void OLrzqt(java.util.List<StrategyPositionResponse> list) {
        this.copydefault.addAll(list);
    }

    @Override // o.xGQ
    public java.lang.String bJ_() {
        java.lang.String strCopydefault = copydefault();
        int iHashCode = strCopydefault.hashCode();
        if (iHashCode != -1402017003) {
            if (iHashCode != -1148661171) {
                if (iHashCode == -512749997 && strCopydefault.equals("contract_grid")) {
                    return "grid-positions";
                }
            } else if (strCopydefault.equals("smart_iceberg")) {
                return "slicing-position";
            }
        } else if (strCopydefault.equals("contract_dca")) {
            return "dca-positions";
        }
        return "algo-trade-position";
    }

    private final void isConnected() {
        TradeStrategyPositionReqGroup tradeStrategyPositionReqGroupAEQbTJ;
        java.lang.String strBJ_ = bJ_();
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, null, null, "ANY", null, (abstractC55715xpF == null || (tradeStrategyPositionReqGroupAEQbTJ = abstractC55715xpF.AEQbTJ()) == null) ? null : tradeStrategyPositionReqGroupAEQbTJ.getAlgoId(), null, null, 208, null), (Function1) null, 4, (java.lang.Object) null);
        this.gEmmrt = wsListener$default;
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
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<StrategyPositionResponse> bD_() {
        if (!this.OLrzqt) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<StrategyPositionResponse> listCopydefault = copydefault((java.lang.String) next);
            if (listCopydefault == null) {
                this.copydefault.clear();
            } else {
                AEQbTJ2(listCopydefault);
            }
        }
        return this.copydefault;
    }

    public void KWHzl(@NotNull java.util.List<StrategyPositionResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        gEmmrt();
        AbstractC55715xpF abstractC55715xpF = this.djBIcL;
        if (abstractC55715xpF != null) {
            abstractC55715xpF.AEQbTJ("WebSocket", new java.util.ArrayList<>(this.copydefault));
        }
    }

    private final void gEmmrt() {
        if (this.OLrzqt) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.KWHzl.isEmpty()) {
                arrayList.add(this.KWHzl.take());
            }
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.util.List<StrategyPositionResponse> listCopydefault = copydefault((java.lang.String) next);
                if (listCopydefault == null) {
                    this.copydefault.clear();
                } else {
                    AEQbTJ2(listCopydefault);
                }
            }
        }
    }

    private final java.util.List<StrategyPositionResponse> copydefault(java.lang.String str) {
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyPositionResponse.Companion.serializer()), str);
            if (list != null && !list.isEmpty()) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    public final boolean EZpvd(StrategyPositionResponse strategyPositionResponse) {
        if (Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") && C33129mqd.OLrzqt((java.lang.Object) strategyPositionResponse.getPos(), (java.lang.Object) 0) && C33129mqd.OLrzqt((java.lang.Object) strategyPositionResponse.getLiab(), (java.lang.Object) 0)) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) strategyPositionResponse.getInstType(), (java.lang.Object) "MARGIN") || !C33129mqd.OLrzqt((java.lang.Object) strategyPositionResponse.getPos(), (java.lang.Object) 0);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55715xpF) {
            java.lang.String strCopydefault = ((AbstractC55715xpF) obj).copydefault();
            AbstractC55715xpF abstractC55715xpF = this.djBIcL;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55715xpF != null ? abstractC55715xpF.copydefault() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd(bJ_(), this.gEmmrt);
        AbstractC57556yke abstractC57556yke = this.gEmmrt;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.gEmmrt = null;
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.AhwBna.AYXKKw();
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final void AEQbTJ2(@NotNull java.util.List<StrategyPositionResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KWHzl((StrategyPositionResponse) it.next());
        }
    }

    public final void KWHzl(StrategyPositionResponse strategyPositionResponse) {
        java.lang.String algoId;
        java.lang.String algoId2;
        java.util.Iterator<StrategyPositionResponse> it = this.copydefault.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            StrategyPositionResponse next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) copydefault(), (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) copydefault(), (java.lang.Object) "contract_dca")) {
                algoId = next.getAlgoId();
                algoId2 = strategyPositionResponse.getAlgoId();
            } else {
                algoId = next.getPosId();
                algoId2 = strategyPositionResponse.getPosId();
            }
            if (Intrinsics.EZpvd((java.lang.Object) algoId, (java.lang.Object) algoId2)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            if (EZpvd(strategyPositionResponse)) {
                this.copydefault.add(0, strategyPositionResponse);
            }
        } else if (EZpvd(strategyPositionResponse)) {
            this.copydefault.set(i, strategyPositionResponse);
        } else {
            this.copydefault.remove(i);
        }
    }
}
