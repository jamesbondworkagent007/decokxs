package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel;
import com.okinc.unify_trade.biz.MinInvestResp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.uLP;
import o.yHT;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$validationError$1 extends SuspendLambda implements yHT<String, MinInvestResp, uLP, Continuation<? super RecurringBuyModifyInvestmentViewModel.InputValidationError>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$validationError$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, Continuation<? super RecurringBuyModifyInvestmentViewModel$validationError$1> continuation) {
        super(4, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(String str, MinInvestResp minInvestResp, uLP ulp, Continuation<? super RecurringBuyModifyInvestmentViewModel.InputValidationError> continuation) {
        return m7098invokeS2d3lZQ(str, minInvestResp, ulp.OLrzqt(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-S2d3lZQ, reason: not valid java name */
    public final Object m7098invokeS2d3lZQ(String str, MinInvestResp minInvestResp, Pair<? extends String, ? extends String> pair, Continuation<? super RecurringBuyModifyInvestmentViewModel.InputValidationError> continuation) {
        RecurringBuyModifyInvestmentViewModel$validationError$1 recurringBuyModifyInvestmentViewModel$validationError$1 = new RecurringBuyModifyInvestmentViewModel$validationError$1(this.this$0, continuation);
        recurringBuyModifyInvestmentViewModel$validationError$1.L$0 = str;
        recurringBuyModifyInvestmentViewModel$validationError$1.L$1 = minInvestResp;
        recurringBuyModifyInvestmentViewModel$validationError$1.L$2 = uLP.copydefault(pair);
        return recurringBuyModifyInvestmentViewModel$validationError$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            MinInvestResp minInvestResp = (MinInvestResp) this.L$1;
            return this.this$0.EZpvd(str, minInvestResp != null ? minInvestResp.getMinInvestment() : null, uLP.KWHzl(((uLP) this.L$2).OLrzqt()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
