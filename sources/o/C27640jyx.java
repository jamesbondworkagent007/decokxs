package o;

import com.okinc.business.market.common.websocket.DexWsClient$startConnectionCallbackFlow$1;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.WsSubscribeArgV5;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27640jyx {
    public static final int KWHzl = 8;
    public final MutableStateFlow<java.lang.String> AEQbTJ;
    public final java.util.List<AbstractC57556yke> AhwBna;
    public MutableSharedFlow<java.lang.String> EZpvd;
    public final C57567ykp OLrzqt;
    public final MutableStateFlow<kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>>> copydefault;

    @yCM
    public C27640jyx(@NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        this.OLrzqt = c57567ykp;
        this.AhwBna = new java.util.ArrayList();
        this.AEQbTJ = StateFlowKt.MutableStateFlow("");
        this.EZpvd = EZpvd();
        this.copydefault = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt("", new java.util.HashMap()));
    }

    public final Flow<java.lang.String> OLrzqt() {
        return FlowKt.asSharedFlow(this.AEQbTJ);
    }

    public final Flow<java.lang.String> copydefault() {
        return FlowKt.asSharedFlow(this.EZpvd);
    }

    public final SharedFlow<kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>>> KWHzl() {
        return FlowKt.asSharedFlow(this.copydefault);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends WsSubscribeArgV5> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        try {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, this.OLrzqt, arrayList, new Function2() { // from class: o.jyy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27640jyx.OLrzqt(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            this.AhwBna.add(abstractC57556ykeAEQbTJ);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(e);
        }
    }

    public static final Unit OLrzqt(C27640jyx c27640jyx, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        MutableStateFlow<java.lang.String> mutableStateFlow = c27640jyx.AEQbTJ;
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        mutableStateFlow.setValue((java.lang.String) payload);
        MutableStateFlow<kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>>> mutableStateFlow2 = c27640jyx.copydefault;
        java.lang.Object payload2 = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload2, "");
        java.lang.String str = (java.lang.String) payload2;
        java.util.HashMap<java.lang.String, java.lang.String> source = oKIncomingData.getSource();
        if (source == null) {
            source = new java.util.HashMap<>();
        }
        mutableStateFlow2.setValue(C56390yDp.OLrzqt(str, source));
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.util.ArrayList<WsArgV5ForWeb3> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        try {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, this.OLrzqt, arrayList, new Function2() { // from class: o.jyw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27640jyx.KWHzl(this.OLrzqt, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            this.AhwBna.add(abstractC57556ykeAEQbTJ);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(e);
        }
    }

    public static final Unit KWHzl(C27640jyx c27640jyx, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        MutableSharedFlow<java.lang.String> mutableSharedFlow = c27640jyx.EZpvd;
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        mutableSharedFlow.tryEmit((java.lang.String) payload);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        try {
            java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.AhwBna).iterator();
            while (it.hasNext()) {
                ((AbstractC57556yke) it.next()).djBIcL();
            }
            this.AhwBna.clear();
            this.AEQbTJ.setValue("");
            this.copydefault.setValue(C56390yDp.OLrzqt("", new java.util.HashMap()));
            this.EZpvd = EZpvd();
        } catch (java.lang.Exception unused) {
        }
    }

    public final MutableSharedFlow<java.lang.String> EZpvd() {
        return SharedFlowKt.MutableSharedFlow(0, 20, BufferOverflow.DROP_OLDEST);
    }

    public final Flow<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<? extends WsSubscribeArgV5> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return C22416heu.ejfBZ() ? FlowKt.emptyFlow() : FlowKt.callbackFlow(new DexWsClient$startConnectionCallbackFlow$1(str, this, arrayList, null));
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            for (AbstractC57556yke abstractC57556yke : this.AhwBna) {
                if (Intrinsics.EZpvd((java.lang.Object) abstractC57556yke.valueOf(), (java.lang.Object) str)) {
                    abstractC57556yke.djBIcL();
                    this.AhwBna.remove(abstractC57556yke);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
