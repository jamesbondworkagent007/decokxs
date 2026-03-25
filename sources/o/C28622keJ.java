package o;

import com.google.gson.JsonObject;
import com.okinc.business.market.features.meme.data.model.PrivateBuySignalWsData;
import com.okinc.business.market.features.meme.data.model.PublicBuySignalWsData;
import com.okinc.business.market.features.meme.data.repo.BuySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.meme.data.repo.BuySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28622keJ implements InterfaceC28692kfa {
    public final C27640jyx AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final C27640jyx OLrzqt;
    public final Json copydefault;

    @yCM
    public C28622keJ(@NotNull C27640jyx c27640jyx, @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.OLrzqt = c27640jyx;
        this.AEQbTJ = c27640jyx2;
        this.copydefault = json;
        this.KWHzl = "dex-market-tracker-sm-activity";
        this.EZpvd = "dex-market-tracker-activity";
    }

    @Override // o.InterfaceC28692kfa
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Flow<? extends java.util.List<PublicBuySignalWsData>>> continuation) {
        return new Application(this.OLrzqt.KWHzl(this.KWHzl, yDY.copydefault(new WsArgV5ForWeb3(this.KWHzl, null, null, null, null, 10, null))), this);
    }

    @Override // o.InterfaceC28692kfa
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<PrivateBuySignalWsData>>> continuation) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("walletAddress", str2);
        jsonObject.addProperty("chainId", str);
        return new TaskDescription(this.AEQbTJ.KWHzl(this.EZpvd, yDY.copydefault(new WsArgV5ForWeb3(this.EZpvd, null, str, null, jsonObject, 10, null))), this);
    }

    /* JADX INFO: renamed from: o.keJ$Application */
    public static final class Application implements Flow<java.util.List<? extends PublicBuySignalWsData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C28622keJ OLrzqt;

        /* JADX INFO: renamed from: o.keJ$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ C28622keJ OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C28622keJ c28622keJ) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = c28622keJ;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                BuySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1 buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof BuySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1) {
                    buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1 = (BuySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1) continuation;
                    int i = buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1 = new BuySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.List listAEQbTJ = this.OLrzqt.AEQbTJ((java.lang.String) obj);
                    if (listAEQbTJ != null) {
                        buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listAEQbTJ, buySignalsWebSocketRepositoryImpl$subscribePublicBuySignals$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public Application(Flow flow, C28622keJ c28622keJ) {
            this.AEQbTJ = flow;
            this.OLrzqt = c28622keJ;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends PublicBuySignalWsData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.keJ$TaskDescription */
    public static final class TaskDescription implements Flow<java.util.List<? extends PrivateBuySignalWsData>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C28622keJ KWHzl;

        /* JADX INFO: renamed from: o.keJ$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ C28622keJ KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, C28622keJ c28622keJ) {
                this.copydefault = flowCollector;
                this.KWHzl = c28622keJ;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                BuySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1 buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof BuySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1) {
                    buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1 = (BuySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1) continuation;
                    int i = buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1 = new BuySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List listKWHzl = this.KWHzl.KWHzl((java.lang.String) obj);
                    if (listKWHzl != null) {
                        buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listKWHzl, buySignalsWebSocketRepositoryImpl$subscribePrivateBuySignals$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C28622keJ c28622keJ) {
            this.EZpvd = flow;
            this.KWHzl = c28622keJ;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends PrivateBuySignalWsData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public void AEQbTJ() {
        this.OLrzqt.AEQbTJ();
    }

    public void OLrzqt() {
        this.AEQbTJ.AEQbTJ();
    }

    @Override // o.InterfaceC28692kfa
    public void KWHzl() {
        AEQbTJ();
        OLrzqt();
    }

    public final java.util.List<PublicBuySignalWsData> AEQbTJ(java.lang.String str) {
        try {
            Json json = this.copydefault;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(PublicBuySignalWsData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.util.List<PrivateBuySignalWsData> KWHzl(java.lang.String str) {
        try {
            Json json = this.copydefault;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(PrivateBuySignalWsData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
