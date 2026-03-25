package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.tradingbot.impl.strategy.view.CoinPriceItem;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$averagePriceItems$1 extends SuspendLambda implements yHO<String, List<? extends TickersData>, Continuation<? super List<? extends CoinPriceItem>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$averagePriceItems$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, Continuation<? super RecurringBuyModifyInvestmentViewModel$averagePriceItems$1> continuation) {
        super(3, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(String str, List<? extends TickersData> list, Continuation<? super List<? extends CoinPriceItem>> continuation) {
        return invoke2(str, (List<TickersData>) list, (Continuation<? super List<CoinPriceItem>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, List<TickersData> list, Continuation<? super List<CoinPriceItem>> continuation) {
        RecurringBuyModifyInvestmentViewModel$averagePriceItems$1 recurringBuyModifyInvestmentViewModel$averagePriceItems$1 = new RecurringBuyModifyInvestmentViewModel$averagePriceItems$1(this.this$0, continuation);
        recurringBuyModifyInvestmentViewModel$averagePriceItems$1.L$0 = str;
        recurringBuyModifyInvestmentViewModel$averagePriceItems$1.L$1 = list;
        return recurringBuyModifyInvestmentViewModel$averagePriceItems$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ((String) this.L$0, (List) this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
