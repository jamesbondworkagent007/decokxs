package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuoteUseCase$pollQuoteV6$1$1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends AdvancedQuoteAndCallData.V6>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedQuoteUseCase$pollQuoteV6$1$1(Continuation<? super AdvancedQuoteUseCase$pollQuoteV6$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedQuoteUseCase$pollQuoteV6$1$1 advancedQuoteUseCase$pollQuoteV6$1$1 = new AdvancedQuoteUseCase$pollQuoteV6$1$1(continuation);
        advancedQuoteUseCase$pollQuoteV6$1$1.L$0 = obj;
        return advancedQuoteUseCase$pollQuoteV6$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends AdvancedQuoteAndCallData.V6>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Result<AdvancedQuoteAndCallData.V6>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Result<AdvancedQuoteAndCallData.V6>> flowCollector, Continuation<? super Unit> continuation) {
        return ((AdvancedQuoteUseCase$pollQuoteV6$1$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Result.Application application = Result.Companion;
            Result resultM7376boximpl = Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new NullPointerException("quoteParams == null"))));
            this.label = 1;
            if (flowCollector.emit(resultM7376boximpl, this) == objCopydefault) {
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
