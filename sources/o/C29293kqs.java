package o;

import com.okinc.business.market.features.scanner.surge.signal.data.SignalStatusWsData;
import com.okinc.business.market.features.scanner.surge.signal.data.SurgeSignalGemsData;
import com.okinc.business.market.features.scanner.surge.signal.repo.SurgeSignalRepositoryImpl$getSignalGems$2;
import com.okinc.business.market.features.scanner.surge.signal.repo.SurgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29293kqs implements InterfaceC29294kqt {
    public final C27640jyx EZpvd;
    public final Json OLrzqt;
    public final InterfaceC27595jyE copydefault;

    @yCM
    public C29293kqs(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = interfaceC27595jyE;
        this.EZpvd = c27640jyx;
        this.OLrzqt = json;
    }

    @Override // o.InterfaceC29294kqt
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SurgeSignalGemsData, OKServerException>> continuation) {
        return kAB.EZpvd(new SurgeSignalRepositoryImpl$getSignalGems$2(this, str, null), continuation);
    }

    @Override // o.InterfaceC29294kqt
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<SignalStatusWsData>> continuation) {
        return new TaskDescription(this.EZpvd.KWHzl("dex-market-sm-signal-status", yDY.copydefault(new WsArgV5ForWeb3("dex-market-sm-signal-status", null, str, null, null, 26, null))), this);
    }

    /* JADX INFO: renamed from: o.kqs$TaskDescription */
    public static final class TaskDescription implements Flow<SignalStatusWsData> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C29293kqs KWHzl;

        /* JADX INFO: renamed from: o.kqs$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C29293kqs KWHzl;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C29293kqs c29293kqs) {
                this.OLrzqt = flowCollector;
                this.KWHzl = c29293kqs;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SurgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1 surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1;
                SignalStatusWsData signalStatusWsData;
                if (continuation instanceof SurgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1) {
                    surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1 = (SurgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1 = new SurgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Json json = this.KWHzl.OLrzqt;
                        json.getSerializersModule();
                        signalStatusWsData = (SignalStatusWsData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(SignalStatusWsData.Companion.serializer()), str));
                    } catch (java.lang.Throwable unused) {
                        signalStatusWsData = null;
                    }
                    if (signalStatusWsData != null) {
                        surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(signalStatusWsData, surgeSignalRepositoryImpl$subscribeSignalGemsWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow, C29293kqs c29293kqs) {
            this.EZpvd = flow;
            this.KWHzl = c29293kqs;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super SignalStatusWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC29294kqt
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        this.EZpvd.AEQbTJ("dex-market-sm-signal-status");
        return Unit.INSTANCE;
    }
}
