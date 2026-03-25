package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$loadGroupData$1$3$3 extends SuspendLambda implements yHO<FlowCollector<? super MarketHomeV2ViewModel.TaskDescription>, Throwable, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketHomeV2ViewModel$loadGroupData$1$3$3(Continuation<? super MarketHomeV2ViewModel$loadGroupData$1$3$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super MarketHomeV2ViewModel.TaskDescription> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new MarketHomeV2ViewModel$loadGroupData$1$3$3(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketHomeV2ViewModel", "loadGroupData listen database group finished");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
