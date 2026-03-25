package com.okinc.business.trade.features.home.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28149kQs;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFirstUse;
    int label;
    final /* synthetic */ TradeAutoSellStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1(TradeAutoSellStrategyViewModel tradeAutoSellStrategyViewModel, boolean z, Continuation<? super TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeAutoSellStrategyViewModel;
        this.$isFirstUse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1(this.this$0, this.$isFirstUse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TradeAutoSellStrategyViewModel$setAutoSellFirstUse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28149kQs interfaceC28149kQs = this.this$0.OLrzqt;
            boolean z = this.$isFirstUse;
            this.label = 1;
            if (interfaceC28149kQs.AEQbTJ(z, this) == objCopydefault) {
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
