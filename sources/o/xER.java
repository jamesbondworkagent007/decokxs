package o;

import com.flyco.tablayout.BuildConfig;
import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xER extends xGQ<java.util.ArrayList<StrategyPositionResponse>> {
    public AbstractC55718xpI AEQbTJ;
    public AbstractC57556yke EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final java.util.ArrayList<StrategyPositionResponse> copydefault;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "signalbot-positions";
    }

    public xER(@NotNull java.lang.String str, AbstractC55718xpI abstractC55718xpI) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = abstractC55718xpI;
        this.copydefault = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        djBIcL();
    }

    private final void djBIcL() {
        SignalPositionReqGroup signalPositionReqGroupEZpvd;
        SignalPositionReqGroup signalPositionReqGroupEZpvd2;
        SignalPositionReqGroup signalPositionReqGroupEZpvd3;
        java.lang.String strBJ_ = bJ_();
        AbstractC55718xpI abstractC55718xpI = this.AEQbTJ;
        java.lang.String instType = (abstractC55718xpI == null || (signalPositionReqGroupEZpvd3 = abstractC55718xpI.EZpvd()) == null) ? null : signalPositionReqGroupEZpvd3.getInstType();
        AbstractC55718xpI abstractC55718xpI2 = this.AEQbTJ;
        java.lang.String instId = (abstractC55718xpI2 == null || (signalPositionReqGroupEZpvd2 = abstractC55718xpI2.EZpvd()) == null) ? null : signalPositionReqGroupEZpvd2.getInstId();
        AbstractC55718xpI abstractC55718xpI3 = this.AEQbTJ;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, instId, null, instType, null, (abstractC55718xpI3 == null || (signalPositionReqGroupEZpvd = abstractC55718xpI3.EZpvd()) == null) ? null : signalPositionReqGroupEZpvd.getAlgoId(), null, null, BuildConfig.VERSION_CODE, null), (Function1) null, 4, (java.lang.Object) null);
        this.EZpvd = wsListener$default;
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
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<StrategyPositionResponse> bD_() {
        KWHzl();
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<StrategyPositionResponse> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC55718xpI abstractC55718xpI = this.AEQbTJ;
        if (abstractC55718xpI != null) {
            abstractC55718xpI.KWHzl("WebSocket", new java.util.ArrayList<>(this.copydefault));
        }
    }

    private final void KWHzl() {
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
            this.copydefault.clear();
            if (listCopydefault != null) {
                this.copydefault.addAll(listCopydefault);
            }
        }
    }

    private final java.util.List<StrategyPositionResponse> copydefault(java.lang.String str) {
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

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55718xpI) {
            java.lang.String strOLrzqt = ((AbstractC55718xpI) obj).OLrzqt();
            AbstractC55718xpI abstractC55718xpI = this.AEQbTJ;
            if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) (abstractC55718xpI != null ? abstractC55718xpI.OLrzqt() : null))) {
                return false;
            }
        }
        EZpvd();
        return true;
    }

    public final void EZpvd() {
        C54407xHg.Companion.EZpvd(bJ_(), this.EZpvd);
        AbstractC57556yke abstractC57556yke = this.EZpvd;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.EZpvd = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }
}
