package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.tradingbot.impl.usecase.websocket.BotTickersWebSocket$tickersFlow$$inlined$map$1$2$1;
import com.okinc.tradingbot.impl.usecase.websocket.BotTickersWebSocket$tickersFlow$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52677wUg {
    public static final C52677wUg copydefault = new C52677wUg();

    private C52677wUg() {
    }

    public final Flow<TickersData> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl("tickers-3s", C56402yEa.EZpvd(new WsArgV5("tickers-3s", str, null, null, null, null, null, null, 252, null)));
    }

    public final Flow<TickersData> KWHzl(java.lang.String str, java.util.List<? extends WsArgV5> list) {
        return FlowKt.filterNotNull(new Application(FlowKt.callbackFlow(new BotTickersWebSocket$tickersFlow$1(str, new java.util.ArrayList(list), null))));
    }

    /* JADX INFO: renamed from: o.wUg$Application */
    public static final class Application implements Flow<TickersData> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.wUg$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                BotTickersWebSocket$tickersFlow$$inlined$map$1$2$1 botTickersWebSocket$tickersFlow$$inlined$map$1$2$1;
                if (continuation instanceof BotTickersWebSocket$tickersFlow$$inlined$map$1$2$1) {
                    botTickersWebSocket$tickersFlow$$inlined$map$1$2$1 = (BotTickersWebSocket$tickersFlow$$inlined$map$1$2$1) continuation;
                    int i = botTickersWebSocket$tickersFlow$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        botTickersWebSocket$tickersFlow$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        botTickersWebSocket$tickersFlow$$inlined$map$1$2$1 = new BotTickersWebSocket$tickersFlow$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = botTickersWebSocket$tickersFlow$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = botTickersWebSocket$tickersFlow$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                    botTickersWebSocket$tickersFlow$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(tickersDataOLrzqt, botTickersWebSocket$tickersFlow$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
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

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TickersData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
