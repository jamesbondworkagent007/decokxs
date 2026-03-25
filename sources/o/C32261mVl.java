package o;

import com.okinc.core.livelistener.OKIncomingData;
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
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32261mVl {
    public final C57567ykp AEQbTJ;
    public MutableSharedFlow<java.lang.String> EZpvd;
    public final java.util.List<AbstractC57556yke> KWHzl;
    public final MutableStateFlow<java.lang.String> OLrzqt;
    public final MutableStateFlow<kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>>> copydefault;

    @yCM
    public C32261mVl(@NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        this.AEQbTJ = c57567ykp;
        this.KWHzl = new java.util.ArrayList();
        this.OLrzqt = StateFlowKt.MutableStateFlow("");
        this.EZpvd = OLrzqt();
        this.copydefault = StateFlowKt.MutableStateFlow(C56390yDp.OLrzqt("", new java.util.HashMap()));
    }

    public final Flow<java.lang.String> copydefault() {
        return FlowKt.asSharedFlow(this.OLrzqt);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<WsArgV5ForWeb3> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        try {
            AbstractC57556yke abstractC57556ykeAEQbTJ = C57554ykc.Companion.AEQbTJ(str, this.AEQbTJ, arrayList, new Function2() { // from class: o.mVm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C32261mVl.copydefault(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            this.KWHzl.add(abstractC57556ykeAEQbTJ);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(e);
        }
    }

    public static final Unit copydefault(C32261mVl c32261mVl, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        MutableStateFlow<java.lang.String> mutableStateFlow = c32261mVl.OLrzqt;
        java.lang.Object payload = oKIncomingData.getPayload();
        Intrinsics.copydefault(payload, "");
        mutableStateFlow.setValue((java.lang.String) payload);
        MutableStateFlow<kotlin.Pair<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>>> mutableStateFlow2 = c32261mVl.copydefault;
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

    public final void EZpvd() {
        try {
            java.util.Iterator it = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.KWHzl).iterator();
            while (it.hasNext()) {
                ((AbstractC57556yke) it.next()).djBIcL();
            }
            this.KWHzl.clear();
            this.OLrzqt.setValue("");
            this.copydefault.setValue(C56390yDp.OLrzqt("", new java.util.HashMap()));
            this.EZpvd = OLrzqt();
        } catch (java.lang.Exception unused) {
        }
    }

    public final MutableSharedFlow<java.lang.String> OLrzqt() {
        return SharedFlowKt.MutableSharedFlow(0, 20, BufferOverflow.DROP_OLDEST);
    }
}
