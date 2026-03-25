package o;

import com.okinc.business.market.features.meme.data.model.PublicMetricsWsResponse;
import com.okinc.business.market.features.meme.data.repo.MetricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1;
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

/* JADX INFO: renamed from: o.keM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28625keM implements InterfaceC28699kfh {
    public final Json AEQbTJ;
    public final C27640jyx OLrzqt;
    public final java.lang.String copydefault;

    @yCM
    public C28625keM(@NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.OLrzqt = c27640jyx;
        this.AEQbTJ = json;
        this.copydefault = "dex-market-memepump-update-metrics";
    }

    @Override // o.InterfaceC28699kfh
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<PublicMetricsWsResponse>> continuation) {
        return new ActionBar(this.OLrzqt.KWHzl(this.copydefault, yDY.copydefault(new WsArgV5ForWeb3(this.copydefault, null, str, null, null, 10, null))), this);
    }

    @Override // o.InterfaceC28699kfh
    public void OLrzqt() {
        this.OLrzqt.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.keM$ActionBar */
    public static final class ActionBar implements Flow<PublicMetricsWsResponse> {
        public final /* synthetic */ C28625keM EZpvd;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.keM$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ C28625keM KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28625keM c28625keM) {
                this.EZpvd = flowCollector;
                this.KWHzl = c28625keM;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                MetricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1 metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof MetricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1) {
                    metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1 = (MetricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1 = new MetricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    PublicMetricsWsResponse publicMetricsWsResponseAEQbTJ = this.KWHzl.AEQbTJ((java.lang.String) obj);
                    if (publicMetricsWsResponseAEQbTJ != null) {
                        metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(publicMetricsWsResponseAEQbTJ, metricsWebSocketRepositoryImpl$subscribeMetricsUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C28625keM c28625keM) {
            this.KWHzl = flow;
            this.EZpvd = c28625keM;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super PublicMetricsWsResponse> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final PublicMetricsWsResponse AEQbTJ(java.lang.String str) {
        try {
            Json json = this.AEQbTJ;
            json.getSerializersModule();
            return (PublicMetricsWsResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) json.decodeFromString(new ArrayListSerializer(PublicMetricsWsResponse.Companion.serializer()), str));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
