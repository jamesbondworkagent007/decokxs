package com.okinc.im.call.domain;

import com.okinc.im.call.model.CallSessionV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35217nrE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35234nrV;

/* JADX INFO: loaded from: classes8.dex */
public final class CallOrchestrator$handleStateTransition$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CallSessionV2 $session;
    int label;
    final /* synthetic */ C35217nrE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrchestrator$handleStateTransition$2(C35217nrE c35217nrE, CallSessionV2 callSessionV2, Continuation<? super CallOrchestrator$handleStateTransition$2> continuation) {
        super(2, continuation);
        this.this$0 = c35217nrE;
        this.$session = callSessionV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallOrchestrator$handleStateTransition$2(this.this$0, this.$session, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallOrchestrator$handleStateTransition$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd("handleStateTransition: Sending WS terminate for Agora error (P2P)");
            InterfaceC35234nrV interfaceC35234nrV = this.this$0.AYXKKw;
            CallSessionV2 callSessionV2 = this.$session;
            this.label = 1;
            if (interfaceC35234nrV.AhwBna(callSessionV2, this) == objCopydefault) {
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
