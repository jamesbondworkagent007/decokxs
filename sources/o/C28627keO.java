package o;

import com.google.gson.JsonObject;
import com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData;
import com.okinc.business.market.features.meme.data.repo.SameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28627keO implements InterfaceC28697kff {
    public final java.lang.String EZpvd;
    public final C27640jyx KWHzl;
    public final Json OLrzqt;

    @yCM
    public C28627keO(@NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.KWHzl = c27640jyx;
        this.OLrzqt = json;
        this.EZpvd = "dex-market-same-car-hold";
    }

    @Override // o.InterfaceC28697kff
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<SameCarUpdateWsData>> continuation) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("walletAddress", str2);
        jsonObject.addProperty("chainIndex", str);
        return new Application(this.KWHzl.KWHzl(this.EZpvd, yDY.copydefault(new WsArgV5ForWeb3(this.EZpvd, null, null, null, jsonObject, 14, null))), this);
    }

    @Override // o.InterfaceC28697kff
    public void EZpvd() {
        this.KWHzl.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.keO$Application */
    public static final class Application implements Flow<SameCarUpdateWsData> {
        public final /* synthetic */ C28627keO KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.keO$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C28627keO KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C28627keO c28627keO) {
                this.copydefault = flowCollector;
                this.KWHzl = c28627keO;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                SameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1 sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof SameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1) {
                    sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1 = (SameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1) continuation;
                    int i = sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1 = new SameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    SameCarUpdateWsData sameCarUpdateWsDataOLrzqt = this.KWHzl.OLrzqt((java.lang.String) obj);
                    if (sameCarUpdateWsDataOLrzqt != null) {
                        sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(sameCarUpdateWsDataOLrzqt, sameCarWebSocketRepositoryImpl$subscribeSameCarUpdates$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C28627keO c28627keO) {
            this.OLrzqt = flow;
            this.KWHzl = c28627keO;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super SameCarUpdateWsData> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass5(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final SameCarUpdateWsData OLrzqt(java.lang.String str) {
        try {
            Json json = this.OLrzqt;
            json.getSerializersModule();
            return (SameCarUpdateWsData) json.decodeFromString(SameCarUpdateWsData.Companion.serializer(), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
