package o;

import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import me.relex.circleindicator.BuildConfig;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xET extends xGQ<java.util.ArrayList<StrategyPositionResponse>> implements InterfaceC55705xow {
    public volatile boolean AEQbTJ;
    public final java.lang.String AhwBna;
    public AbstractC55717xpH EZpvd;
    public final java.lang.String KWHzl;
    public final LinkedBlockingDeque<java.lang.String> OLrzqt;
    public AbstractC57556yke copydefault;
    public final C56261xzV gEmmrt;
    public final java.util.ArrayList<StrategyPositionResponse> valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "signalbot-position-instIds";
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xET(@NotNull java.lang.String str, AbstractC55717xpH abstractC55717xpH) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        this.EZpvd = abstractC55717xpH;
        this.KWHzl = "SignalBotPositionInstIdsTask";
        this.valueOf = new java.util.ArrayList<>();
        this.OLrzqt = new LinkedBlockingDeque<>();
        this.gEmmrt = new C56261xzV();
        copydefault();
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        if (abstractC55717xpH != null && (signalPositionReqGroupEZpvd = abstractC55717xpH.EZpvd()) != null && signalPositionReqGroupEZpvd.getHasWs()) {
            KWHzl();
        }
        copydefault();
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        if (abstractC55717xpH != null && (signalPositionReqGroupEZpvd = abstractC55717xpH.EZpvd()) != null && signalPositionReqGroupEZpvd.getHasWs()) {
            KWHzl();
        }
        copydefault();
    }

    public final void copydefault() {
        java.lang.String algoId;
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        this.AEQbTJ = false;
        this.valueOf.clear();
        C56261xzV c56261xzV = this.gEmmrt;
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        if (abstractC55717xpH == null || (signalPositionReqGroupEZpvd = abstractC55717xpH.EZpvd()) == null || (algoId = signalPositionReqGroupEZpvd.getAlgoId()) == null) {
            algoId = "";
        }
        c56261xzV.AEQbTJ(algoId);
        c56261xzV.EZpvd("signal_bot");
        c56261xzV.KWHzl(new Function1() { // from class: o.xEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xET.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56261xzV, 0L, 1, null);
    }

    public static final Unit AEQbTJ(xET xet, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xet.AEQbTJ = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            xet.KWHzl((java.util.List<StrategyPositionResponse>) data);
        } else {
            AbstractC55717xpH abstractC55717xpH = xet.EZpvd;
            if (abstractC55717xpH != null) {
                abstractC55717xpH.EZpvd(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<StrategyPositionResponse> list) {
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        EZpvd(list);
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        if (abstractC55717xpH != null) {
            abstractC55717xpH.copydefault("http", new java.util.ArrayList<>(this.valueOf));
        }
        AbstractC55717xpH abstractC55717xpH2 = this.EZpvd;
        if (abstractC55717xpH2 == null || (signalPositionReqGroupEZpvd = abstractC55717xpH2.EZpvd()) == null || !signalPositionReqGroupEZpvd.getHasWs()) {
            return;
        }
        djBIcL();
    }

    public final void EZpvd(java.util.List<StrategyPositionResponse> list) {
        this.valueOf.addAll(list);
    }

    private final void djBIcL() {
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        java.lang.String strBJ_ = bJ_();
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, null, null, "ANY", null, (abstractC55717xpH == null || (signalPositionReqGroupEZpvd = abstractC55717xpH.EZpvd()) == null) ? null : signalPositionReqGroupEZpvd.getAlgoId(), null, null, BuildConfig.VERSION_CODE, null), (Function1) null, 4, (java.lang.Object) null);
        this.copydefault = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.OLrzqt.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<StrategyPositionResponse> bD_() {
        gEmmrt();
        return this.valueOf;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<StrategyPositionResponse> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55717xpH abstractC55717xpH = this.EZpvd;
        if (abstractC55717xpH != null) {
            abstractC55717xpH.copydefault("WebSocket", new java.util.ArrayList<>(this.valueOf));
        }
    }

    private final void gEmmrt() {
        if (this.AEQbTJ) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (!this.OLrzqt.isEmpty()) {
                arrayList.add(this.OLrzqt.take());
            }
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                java.util.List<StrategyPositionResponse> listOLrzqt = OLrzqt((java.lang.String) next);
                if (listOLrzqt == null) {
                    this.valueOf.clear();
                } else {
                    copydefault(listOLrzqt);
                }
            }
        }
    }

    private final java.util.List<StrategyPositionResponse> OLrzqt(java.lang.String str) {
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyPositionResponse.Companion.serializer()), str);
            if (!list.isEmpty()) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    public final void copydefault(@NotNull java.util.List<StrategyPositionResponse> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (StrategyPositionResponse strategyPositionResponse : list) {
            java.util.Iterator<T> it = this.valueOf.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((StrategyPositionResponse) next).getInstId(), (java.lang.Object) strategyPositionResponse.getInstId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            StrategyPositionResponse strategyPositionResponse2 = (StrategyPositionResponse) next;
            if (strategyPositionResponse2 != null) {
                strategyPositionResponse = strategyPositionResponse2;
            }
            arrayList.add(strategyPositionResponse);
        }
        this.valueOf.clear();
        this.valueOf.addAll(arrayList);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55717xpH) {
            java.lang.String strCopydefault = ((AbstractC55717xpH) obj).copydefault();
            AbstractC55717xpH abstractC55717xpH = this.EZpvd;
            if (!Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (abstractC55717xpH != null ? abstractC55717xpH.copydefault() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd(bJ_(), this.copydefault);
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.copydefault = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.gEmmrt.AYXKKw();
    }
}
