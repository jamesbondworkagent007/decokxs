package com.okinc.unify_trade.bot.dcd.presenter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductDetailPresenter$startPollingQuotes$4 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdProductDetailPresenter$startPollingQuotes$4(Continuation<? super DcdProductDetailPresenter$startPollingQuotes$4> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        DcdProductDetailPresenter$startPollingQuotes$4 dcdProductDetailPresenter$startPollingQuotes$4 = new DcdProductDetailPresenter$startPollingQuotes$4(continuation);
        dcdProductDetailPresenter$startPollingQuotes$4.L$0 = th;
        return dcdProductDetailPresenter$startPollingQuotes$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String message = ((Throwable) this.L$0).getMessage();
            if (message != null) {
                pUU.AEQbTJ("fetchQuotes-exception:" + message);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
