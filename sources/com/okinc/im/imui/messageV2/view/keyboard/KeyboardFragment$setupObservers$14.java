package com.okinc.im.imui.messageV2.view.keyboard;

import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C35934oJc;
import o.C36913ojt;
import o.C56391yDq;
import o.C56442yFn;
import o.nJW;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class KeyboardFragment$setupObservers$14 extends SuspendLambda implements yHO<CoroutineScope, ObserveShowAgentProcessingFlow.AgentProcessingState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36913ojt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyboardFragment$setupObservers$14(C36913ojt c36913ojt, Continuation<? super KeyboardFragment$setupObservers$14> continuation) {
        super(3, continuation);
        this.this$0 = c36913ojt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, ObserveShowAgentProcessingFlow.AgentProcessingState agentProcessingState, Continuation<? super Unit> continuation) {
        KeyboardFragment$setupObservers$14 keyboardFragment$setupObservers$14 = new KeyboardFragment$setupObservers$14(this.this$0, continuation);
        keyboardFragment$setupObservers$14.L$0 = agentProcessingState;
        return keyboardFragment$setupObservers$14.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C35934oJc c35934oJc;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ObserveShowAgentProcessingFlow.AgentProcessingState agentProcessingState = (ObserveShowAgentProcessingFlow.AgentProcessingState) this.L$0;
            nJW njw = this.this$0.getNewProxyInstance;
            if (njw != null && (c35934oJc = njw.KWHzl) != null) {
                c35934oJc.setAgentProcessingState(agentProcessingState);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
