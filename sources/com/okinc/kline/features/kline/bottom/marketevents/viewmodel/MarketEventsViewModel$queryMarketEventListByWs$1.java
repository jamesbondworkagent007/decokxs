package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pDX;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel$queryMarketEventListByWs$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<MarketEventsVo> $currentList;
    int label;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketEventsViewModel$queryMarketEventListByWs$1(MarketEventsViewModel marketEventsViewModel, List<? extends MarketEventsVo> list, Continuation<? super MarketEventsViewModel$queryMarketEventListByWs$1> continuation) {
        super(2, continuation);
        this.this$0 = marketEventsViewModel;
        this.$currentList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketEventsViewModel$queryMarketEventListByWs$1(this.this$0, this.$currentList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketEventsViewModel$queryMarketEventListByWs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (pDX.AEQbTJ.AYXKKw()) {
                MarketEventsViewModel marketEventsViewModel = this.this$0;
                List<MarketEventsVo> list = this.$currentList;
                this.label = 1;
                if (marketEventsViewModel.OLrzqt((List<? extends MarketEventsVo>) list, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                MarketEventsViewModel marketEventsViewModel2 = this.this$0;
                List<MarketEventsVo> list2 = this.$currentList;
                this.label = 2;
                if (marketEventsViewModel2.AEQbTJ((List<? extends MarketEventsVo>) list2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
