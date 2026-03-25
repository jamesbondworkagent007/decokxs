package com.okinc.business.trade.features.home.ui.viewmodel;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeAutoSellStrategyViewModel$saveStrategies$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AdvancedAutoSellStrategy> $strategies;
    int label;
    final /* synthetic */ TradeAutoSellStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TradeAutoSellStrategyViewModel$saveStrategies$1(TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModel, List<? extends AdvancedAutoSellStrategy> list, Continuation<? super TradeAutoSellStrategyViewModel$saveStrategies$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeAutoSellStrategyViewModel;
        this.$strategies = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellStrategyViewModel$saveStrategies$1(this.this$0, this.$strategies, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellStrategyViewModel$saveStrategies$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28149kQs interfaceC28149kQs = this.this$0.OLrzqt;
            List<AdvancedAutoSellStrategy> list = this.$strategies;
            this.label = 1;
            if (interfaceC28149kQs.copydefault(list, this) == objCopydefault) {
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
