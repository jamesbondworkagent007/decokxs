package com.okinc.unify_trade.trade.source.task;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C54747xTv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDataTaskByRepo$bindAreaTickers$2$1$1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C54747xTv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDataTaskByRepo$bindAreaTickers$2$1$1(C54747xTv c54747xTv, Continuation<? super SpotDataTaskByRepo$bindAreaTickers$2$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c54747xTv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SpotDataTaskByRepo$bindAreaTickers$2$1$1 spotDataTaskByRepo$bindAreaTickers$2$1$1 = new SpotDataTaskByRepo$bindAreaTickers$2$1$1(this.this$0, continuation);
        spotDataTaskByRepo$bindAreaTickers$2$1$1.J$0 = ((Number) obj).longValue();
        return spotDataTaskByRepo$bindAreaTickers$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((SpotDataTaskByRepo$bindAreaTickers$2$1$1) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.this$0.EZpvd.setValue(C56443yFo.KWHzl(j));
            pUU.KWHzl("NavOptPhase1", this.this$0.OLrzqt + " -> SpotDataTaskByRepo bindAreaTickers tickerListenJob collect 1, " + j);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
