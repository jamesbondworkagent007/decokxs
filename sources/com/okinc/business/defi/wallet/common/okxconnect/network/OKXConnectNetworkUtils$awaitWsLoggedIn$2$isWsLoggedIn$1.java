package com.okinc.business.defi.wallet.common.okxconnect.network;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1 oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1) {
                    oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1 = (OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1 = new OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (((Boolean) obj).booleanValue()) {
                        oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, oKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Activity activity = new Activity(this.this$0.AYXKKw);
            this.label = 1;
            obj = FlowKt.first(activity, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
