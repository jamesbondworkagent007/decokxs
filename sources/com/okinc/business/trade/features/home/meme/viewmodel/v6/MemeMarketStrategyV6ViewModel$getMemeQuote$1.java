package com.okinc.business.trade.features.home.meme.viewmodel.v6;

import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC28352kYf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeMarketStrategyV6ViewModel$getMemeQuote$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MemeV6QuoteExecutionUseCase.QuoteParams $quoteParams;
    int label;
    final /* synthetic */ AbstractC28352kYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeMarketStrategyV6ViewModel$getMemeQuote$1(AbstractC28352kYf abstractC28352kYf, MemeV6QuoteExecutionUseCase.QuoteParams quoteParams, Continuation<? super MemeMarketStrategyV6ViewModel$getMemeQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC28352kYf;
        this.$quoteParams = quoteParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeMarketStrategyV6ViewModel$getMemeQuote$1(this.this$0, this.$quoteParams, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeMarketStrategyV6ViewModel$getMemeQuote$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<MemeV6QuoteExecutionUseCase.Application> flowCopydefault = this.this$0.fZBcTu().copydefault(this.$quoteParams, this.this$0.QOLQEE());
            final AbstractC28352kYf abstractC28352kYf = this.this$0;
            FlowCollector<? super MemeV6QuoteExecutionUseCase.Application> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$getMemeQuote$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(MemeV6QuoteExecutionUseCase.Application application, Continuation<? super Unit> continuation) {
                    if (application instanceof MemeV6QuoteExecutionUseCase.Application.ActionBar) {
                        abstractC28352kYf.RdAHlO().setValue(C56443yFo.KWHzl(false));
                        MemeV6QuoteExecutionUseCase.Application.ActionBar actionBar = (MemeV6QuoteExecutionUseCase.Application.ActionBar) application;
                        abstractC28352kYf.OLrzqt(actionBar.AEQbTJ(), actionBar.OLrzqt());
                    } else if (application instanceof MemeV6QuoteExecutionUseCase.Application.TaskDescription) {
                        MemeV6QuoteExecutionUseCase.Application.TaskDescription taskDescription = (MemeV6QuoteExecutionUseCase.Application.TaskDescription) application;
                        abstractC28352kYf.EZpvd(taskDescription.AEQbTJ(), taskDescription.copydefault());
                        abstractC28352kYf.RdAHlO().setValue(C56443yFo.KWHzl(false));
                    } else {
                        if (!(application instanceof MemeV6QuoteExecutionUseCase.Application.C0379Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractC28352kYf.QbewEr();
                        abstractC28352kYf.AuCTel().initCheckStep();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
