package com.okinc.business.market.features.analysis.futures.sub.funding.ui.chart;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C25891jKe;
import o.C25907jKu;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes15.dex */
public final class FuturesAnalysisRealTimeFundingRateFragment$setListener$4 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends List<? extends C25907jKu>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C25891jKe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRealTimeFundingRateFragment$setListener$4(C25891jKe c25891jKe, Continuation<? super FuturesAnalysisRealTimeFundingRateFragment$setListener$4> continuation) {
        super(2, continuation);
        this.this$0 = c25891jKe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisRealTimeFundingRateFragment$setListener$4 futuresAnalysisRealTimeFundingRateFragment$setListener$4 = new FuturesAnalysisRealTimeFundingRateFragment$setListener$4(this.this$0, continuation);
        futuresAnalysisRealTimeFundingRateFragment$setListener$4.L$0 = obj;
        return futuresAnalysisRealTimeFundingRateFragment$setListener$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends List<? extends C25907jKu>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends List<C25907jKu>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends List<C25907jKu>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRealTimeFundingRateFragment$setListener$4) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl((InterfaceC49371unL<? extends List<C25907jKu>>) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
