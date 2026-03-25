package o;

import com.okinc.business.market.features.meme.data.model.NewLogoWsData;
import com.okinc.business.market.features.meme.data.model.NewTokenWsData;
import com.okinc.business.market.features.meme.data.repo.NewTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.meme.data.repo.NewTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28626keN implements InterfaceC28700kfi {
    public final C27640jyx AEQbTJ;
    public final java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public final Json OLrzqt;
    public final C27640jyx copydefault;

    @yCM
    public C28626keN(@NotNull C27640jyx c27640jyx, @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.AEQbTJ = c27640jyx;
        this.copydefault = c27640jyx2;
        this.OLrzqt = json;
        this.EZpvd = "dex-market-memepump-new-token";
        this.KWHzl = "dex-market-new-token-logo-update";
    }

    @Override // o.InterfaceC28700kfi
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<NewTokenWsData>>> continuation) {
        return new StateListAnimator(this.AEQbTJ.KWHzl(this.EZpvd, yDY.copydefault(new WsArgV5ForWeb3(this.EZpvd, null, str, null, null, 10, null))), this);
    }

    @Override // o.InterfaceC28700kfi
    public void copydefault() {
        this.AEQbTJ.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.keN$ActionBar */
    public static final class ActionBar implements Flow<java.util.List<? extends NewLogoWsData>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C28626keN OLrzqt;

        /* JADX INFO: renamed from: o.keN$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ C28626keN AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, C28626keN c28626keN) {
                this.copydefault = flowCollector;
                this.AEQbTJ = c28626keN;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                NewTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1 newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof NewTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1) {
                    newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1 = (NewTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1) continuation;
                    int i = newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1 = new NewTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List listOLrzqt = this.AEQbTJ.OLrzqt((java.lang.String) obj);
                    if (listOLrzqt != null) {
                        newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listOLrzqt, newTokenWebSocketRepositoryImpl$subscribeNewLogo$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, C28626keN c28626keN) {
            this.EZpvd = flow;
            this.OLrzqt = c28626keN;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends NewLogoWsData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.keN$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends NewTokenWsData>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C28626keN EZpvd;

        /* JADX INFO: renamed from: o.keN$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C28626keN OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C28626keN c28626keN) {
                this.KWHzl = flowCollector;
                this.OLrzqt = c28626keN;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                NewTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1 newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof NewTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1) {
                    newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1 = (NewTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1) continuation;
                    int i = newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1 = new NewTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.List listKWHzl = this.OLrzqt.KWHzl((java.lang.String) obj);
                    if (listKWHzl != null) {
                        newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(listKWHzl, newTokenWebSocketRepositoryImpl$subscribeNewTokens$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, C28626keN c28626keN) {
            this.AEQbTJ = flow;
            this.EZpvd = c28626keN;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends NewTokenWsData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC28700kfi
    public java.lang.Object KWHzl(@NotNull Continuation<? super Flow<? extends java.util.List<NewLogoWsData>>> continuation) {
        return new ActionBar(this.copydefault.KWHzl(this.KWHzl, yDY.copydefault(new WsArgV5ForWeb3(this.KWHzl, null, "", null, null, 10, null))), this);
    }

    @Override // o.InterfaceC28700kfi
    public void EZpvd() {
        this.copydefault.AEQbTJ();
    }

    public final java.util.List<NewTokenWsData> KWHzl(java.lang.String str) {
        try {
            Json json = this.OLrzqt;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(NewTokenWsData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.util.List<NewLogoWsData> OLrzqt(java.lang.String str) {
        try {
            Json json = this.OLrzqt;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(NewLogoWsData.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
