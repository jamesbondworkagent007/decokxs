package o;

import com.okinc.im.imui.broadcastmessages.BroadcastMessagesAnalyser$addMessages$2;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagesAnalyser$totalSendingOrSentMessages$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nuP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35386nuP {
    public final CoroutineDispatcher AEQbTJ;
    public final Flow<java.lang.Integer> AYXKKw;
    public final java.util.HashMap<java.lang.Long, OKMessage.SentStatus> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<java.lang.Integer> OLrzqt;
    public final MutableStateFlow<java.lang.Integer> copydefault;
    public final StateFlow<java.lang.Integer> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.lang.Integer> OLrzqt() {
        return this.AYXKKw;
    }

    @yCM
    public C35386nuP(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = CoroutineDispatcher.limitedParallelism$default(coroutineDispatcher, 1, null, 2, null);
        MutableStateFlow<java.lang.Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.copydefault = MutableStateFlow;
        MutableStateFlow<java.lang.Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.OLrzqt = MutableStateFlow2;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = FlowKt.combine(MutableStateFlow2, MutableStateFlow, new BroadcastMessagesAnalyser$totalSendingOrSentMessages$1(null));
        this.EZpvd = new java.util.HashMap<>();
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<OKMessage> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.KWHzl, new BroadcastMessagesAnalyser$addMessages$2(list, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
