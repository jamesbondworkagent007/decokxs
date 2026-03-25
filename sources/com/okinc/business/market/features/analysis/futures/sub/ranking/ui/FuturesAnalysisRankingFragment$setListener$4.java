package com.okinc.business.market.features.analysis.futures.sub.ranking.ui;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25925jLl;
import o.C25937jLx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRankingFragment$setListener$4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends C25937jLx>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25925jLl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRankingFragment$setListener$4(C25925jLl c25925jLl, Continuation<? super FuturesAnalysisRankingFragment$setListener$4> continuation) {
        super(2, continuation);
        this.this$0 = c25925jLl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisRankingFragment$setListener$4 futuresAnalysisRankingFragment$setListener$4 = new FuturesAnalysisRankingFragment$setListener$4(this.this$0, continuation);
        futuresAnalysisRankingFragment$setListener$4.L$0 = obj;
        return futuresAnalysisRankingFragment$setListener$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C25937jLx>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<C25937jLx>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRankingFragment$setListener$4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd((InterfaceC49371unL<? extends List<C25937jLx>>) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
