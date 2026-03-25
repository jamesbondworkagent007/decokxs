package com.okinc.business.market.features.analysis.futures.root;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25852jIt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRootFragment$setListener$5 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$5(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$5> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisRootFragment$setListener$5 futuresAnalysisRootFragment$setListener$5 = new FuturesAnalysisRootFragment$setListener$5(this.this$0, continuation);
        futuresAnalysisRootFragment$setListener$5.J$0 = ((Number) obj).longValue();
        return futuresAnalysisRootFragment$setListener$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$5) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (j > 0) {
                this.this$0.copydefault(j);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
