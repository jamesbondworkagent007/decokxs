package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

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
public final class RecurringBuyModifyInvestmentViewModel$estimateCount$1 extends SuspendLambda implements yHT<String, uLP, MinInvestResp, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$estimateCount$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, Continuation<? super RecurringBuyModifyInvestmentViewModel$estimateCount$1> continuation) {
        super(4, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(String str, uLP ulp, MinInvestResp minInvestResp, Continuation<? super String> continuation) {
        return m7095invokehL3wymg(str, ulp.OLrzqt(), minInvestResp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke-hL3wymg, reason: not valid java name */
    public final Object m7095invokehL3wymg(String str, Pair<? extends String, ? extends String> pair, MinInvestResp minInvestResp, Continuation<? super String> continuation) {
        RecurringBuyModifyInvestmentViewModel$estimateCount$1 recurringBuyModifyInvestmentViewModel$estimateCount$1 = new RecurringBuyModifyInvestmentViewModel$estimateCount$1(this.this$0, continuation);
        recurringBuyModifyInvestmentViewModel$estimateCount$1.L$0 = str;
        recurringBuyModifyInvestmentViewModel$estimateCount$1.L$1 = uLP.copydefault(pair);
        recurringBuyModifyInvestmentViewModel$estimateCount$1.L$2 = minInvestResp;
        return recurringBuyModifyInvestmentViewModel$estimateCount$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            Pair pairOLrzqt = ((uLP) this.L$1).OLrzqt();
            MinInvestResp minInvestResp = (MinInvestResp) this.L$2;
            return this.this$0.OLrzqt(str, uLP.KWHzl(pairOLrzqt), minInvestResp != null ? minInvestResp.getMinInvestment() : null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
