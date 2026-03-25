package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyModifyInvestmentViewModel$fetchTickerData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SharedFlow<TickersData>> $tickerFlows;
    int label;
    final /* synthetic */ RecurringBuyModifyInvestmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends kotlinx.coroutines.flow.SharedFlow<com.okinc.unify_trade.biz.subscribe.TickersData>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringBuyModifyInvestmentViewModel$fetchTickerData$2(List<? extends SharedFlow<TickersData>> list, RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel, Continuation<? super RecurringBuyModifyInvestmentViewModel$fetchTickerData$2> continuation) {
        super(2, continuation);
        this.$tickerFlows = list;
        this.this$0 = recurringBuyModifyInvestmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyModifyInvestmentViewModel$fetchTickerData$2(this.$tickerFlows, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyModifyInvestmentViewModel$fetchTickerData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow[] sharedFlowArr = (SharedFlow[]) this.$tickerFlows.toArray(new SharedFlow[0]);
            Flow flowMerge = FlowKt.merge((Flow[]) Arrays.copyOf(sharedFlowArr, sharedFlowArr.length));
            final RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel$fetchTickerData$2.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(TickersData tickersData, Continuation<? super Unit> continuation) {
                    List<TickersData> list = (List) recurringBuyModifyInvestmentViewModel.valueOf.getValue();
                    MutableStateFlow mutableStateFlow = recurringBuyModifyInvestmentViewModel.valueOf;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (TickersData tickersData2 : list) {
                        if (Intrinsics.EZpvd((Object) tickersData2.getInstId(), (Object) tickersData.getInstId())) {
                            tickersData2 = tickersData;
                        }
                        arrayList.add(tickersData2);
                    }
                    mutableStateFlow.setValue(arrayList);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowMerge.collect(flowCollector, this) == objCopydefault) {
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
