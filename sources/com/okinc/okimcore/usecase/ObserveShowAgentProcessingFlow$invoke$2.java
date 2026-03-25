package com.okinc.okimcore.usecase;

import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class ObserveShowAgentProcessingFlow$invoke$2 extends SuspendLambda implements yHO<FlowCollector<? super ObserveShowAgentProcessingFlow.AgentProcessingState>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ObserveShowAgentProcessingFlow$invoke$2(Continuation<? super ObserveShowAgentProcessingFlow$invoke$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ObserveShowAgentProcessingFlow.AgentProcessingState> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        ObserveShowAgentProcessingFlow$invoke$2 observeShowAgentProcessingFlow$invoke$2 = new ObserveShowAgentProcessingFlow$invoke$2(continuation);
        observeShowAgentProcessingFlow$invoke$2.L$0 = flowCollector;
        return observeShowAgentProcessingFlow$invoke$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ObserveShowAgentProcessingFlow.AgentProcessingState agentProcessingState = ObserveShowAgentProcessingFlow.AgentProcessingState.IDLE;
            this.label = 1;
            if (flowCollector.emit(agentProcessingState, this) == objCopydefault) {
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
