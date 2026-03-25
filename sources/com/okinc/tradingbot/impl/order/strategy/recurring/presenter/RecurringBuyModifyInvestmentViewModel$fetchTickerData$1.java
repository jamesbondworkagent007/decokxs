package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$fetchTickerData$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C54282xCq;
import o.C56391yDq;
import o.C56442yFn;
import o.xKK;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$fetchTickerData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $instIds;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyModifyInvestmentViewModel$fetchTickerData$1(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, List<String> list, Continuation<? super RecurringBuyModifyInvestmentViewModel$fetchTickerData$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyModifyInvestmentViewModel;
        this.$instIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyModifyInvestmentViewModel$fetchTickerData$1(this.this$0, this.$instIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyModifyInvestmentViewModel$fetchTickerData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C54282xCq c54282xCqFARcdN = this.this$0.fARcdN();
            List<String> list = this.$instIds;
            final RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel = this.this$0;
            c54282xCqFARcdN.KWHzl(list);
            c54282xCqFARcdN.KWHzl(new Function1() { // from class: o.vUI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return RecurringBuyModifyInvestmentViewModel$fetchTickerData$1.invokeSuspend$lambda$1$lambda$0(recurringBuyModifyInvestmentViewModel, (ResponseData) obj2);
                }
            });
            xKK.Activity.execute$default(c54282xCqFARcdN, 0L, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableStateFlow mutableStateFlow = recurringBuyModifyInvestmentViewModel.valueOf;
            List listAhwBna = (List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            mutableStateFlow.setValue(listAhwBna);
        }
        return Unit.INSTANCE;
    }
}
