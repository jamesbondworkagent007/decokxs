package o;

import com.okinc.business.market.data.model.HomeTokenListWsData;
import com.okinc.business.market.features.home_token_list.repo.RealtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28546kcn {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final C27640jyx AEQbTJ;
    public final Json copydefault;

    @yCM
    public C28546kcn(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.AEQbTJ = c27640jyx;
        this.copydefault = json;
    }

    public final Flow<HomeTokenListWsData> AEQbTJ(@NotNull WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(wsArgV5ForWeb3, "");
        return new StateListAnimator(this.AEQbTJ.KWHzl(wsArgV5ForWeb3.getChannel(), yDY.copydefault(wsArgV5ForWeb3)), this);
    }

    /* JADX INFO: renamed from: o.kcn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kcn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kcn$StateListAnimator */
    public static final class StateListAnimator implements Flow<HomeTokenListWsData> {
        public final /* synthetic */ C28546kcn OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kcn$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C28546kcn OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C28546kcn c28546kcn) {
                this.KWHzl = flowCollector;
                this.OLrzqt = c28546kcn;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                RealtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1 realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1;
                java.lang.Object objM7377constructorimpl;
                if (continuation instanceof RealtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1) {
                    realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1 = (RealtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1 = new RealtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.String str = (java.lang.String) obj;
                    try {
                        Result.Application application = Result.Companion;
                        Json json = this.OLrzqt.copydefault;
                        json.getSerializersModule();
                        objM7377constructorimpl = Result.m7377constructorimpl((HomeTokenListWsData) json.decodeFromString(HomeTokenListWsData.Companion.serializer(), str));
                    } catch (CancellationException e) {
                        throw e;
                    } catch (java.lang.Throwable th) {
                        pUU.AEQbTJ("DEX", "dexRunCatching", th);
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    if (objM7377constructorimpl != null) {
                        realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(objM7377constructorimpl, realtimeHomeTokenListRepo$startWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C28546kcn c28546kcn) {
            this.copydefault = flow;
            this.OLrzqt = c28546kcn;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super HomeTokenListWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final java.lang.Object OLrzqt() {
        try {
            Result.Application application = Result.Companion;
            this.AEQbTJ.AEQbTJ();
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
