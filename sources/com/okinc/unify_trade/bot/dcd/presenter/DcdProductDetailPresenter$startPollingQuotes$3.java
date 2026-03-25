package com.okinc.unify_trade.bot.dcd.presenter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdProductDetailPresenter$startPollingQuotes$3 extends SuspendLambda implements yHO<FlowCollector<? super Integer>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DcdProductDetailPresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcdProductDetailPresenter$startPollingQuotes$3(DcdProductDetailPresenter dcdProductDetailPresenter, Continuation<? super DcdProductDetailPresenter$startPollingQuotes$3> continuation) {
        super(3, continuation);
        this.this$0 = dcdProductDetailPresenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Integer> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        DcdProductDetailPresenter$startPollingQuotes$3 dcdProductDetailPresenter$startPollingQuotes$3 = new DcdProductDetailPresenter$startPollingQuotes$3(this.this$0, continuation);
        dcdProductDetailPresenter$startPollingQuotes$3.L$0 = th;
        return dcdProductDetailPresenter$startPollingQuotes$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        if (((Throwable) this.L$0) == null) {
            this.this$0.AEQbTJ().postValue(C56443yFo.KWHzl(true));
        }
        return Unit.INSTANCE;
    }
}
