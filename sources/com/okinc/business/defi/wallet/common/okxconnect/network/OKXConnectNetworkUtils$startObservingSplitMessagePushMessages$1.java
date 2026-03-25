package com.okinc.business.defi.wallet.common.okxconnect.network;

import androidx.lifecycle.PausingDispatcherKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data;
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
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("OKXConnectNetworkUtils", "startObservingSplitMessagePushMessages");
            Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(this.this$0.KWHzl);
            final C16000ebf c16000ebf = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(Data data, Continuation<? super Unit> continuation) {
                    Object objWhenStarted = PausingDispatcherKt.whenStarted(ProcessLifecycleOwner.Companion.get().getLifecycle(), new OKXConnectNetworkUtils$startObservingSplitMessagePushMessages$1$1$1(c16000ebf, data, null), continuation);
                    return objWhenStarted == C56442yFn.copydefault() ? objWhenStarted : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowReceiveAsFlow.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
