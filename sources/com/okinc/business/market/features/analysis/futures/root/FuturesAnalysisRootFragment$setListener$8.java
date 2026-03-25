package com.okinc.business.market.features.analysis.futures.root;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25852jIt;
import o.C56391yDq;
import o.C56442yFn;
import o.jLI;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRootFragment$setListener$8 extends SuspendLambda implements Function2<jLI, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$8(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$8> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisRootFragment$setListener$8 futuresAnalysisRootFragment$setListener$8 = new FuturesAnalysisRootFragment$setListener$8(this.this$0, continuation);
        futuresAnalysisRootFragment$setListener$8.L$0 = obj;
        return futuresAnalysisRootFragment$setListener$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jLI jli, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$8) create(jli, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd(((jLI) this.L$0).OLrzqt());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
