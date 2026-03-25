package com.okinc.unify_trade.trade.source.task;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.xSU;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureDataTaskByRepo$bindAllTickers$2$1$4 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ xSU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureDataTaskByRepo$bindAllTickers$2$1$4(xSU xsu, Continuation<? super FutureDataTaskByRepo$bindAllTickers$2$1$4> continuation) {
        super(2, continuation);
        this.this$0 = xsu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FutureDataTaskByRepo$bindAllTickers$2$1$4 futureDataTaskByRepo$bindAllTickers$2$1$4 = new FutureDataTaskByRepo$bindAllTickers$2$1$4(this.this$0, continuation);
        futureDataTaskByRepo$bindAllTickers$2$1$4.J$0 = ((Number) obj).longValue();
        return futureDataTaskByRepo$bindAllTickers$2$1$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((FutureDataTaskByRepo$bindAllTickers$2$1$4) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.J$0;
            this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(j));
            pUU.KWHzl("NavOptPhase1", this.this$0.EZpvd + " -> SpotDataTaskByRepo bindAllTickers tickerListenJob collect 3, " + j);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
