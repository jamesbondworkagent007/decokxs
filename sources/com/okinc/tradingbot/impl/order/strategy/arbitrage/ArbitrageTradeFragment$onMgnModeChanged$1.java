package com.okinc.tradingbot.impl.order.strategy.arbitrage;

import com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter.ArbTradeViewModel;
import com.okinc.unify_trade.bot.data.ArbitrageType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C50062vAm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class ArbitrageTradeFragment$onMgnModeChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArbitrageType $arbitrageType;
    int label;
    final /* synthetic */ C50062vAm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbitrageTradeFragment$onMgnModeChanged$1(C50062vAm c50062vAm, ArbitrageType arbitrageType, Continuation<? super ArbitrageTradeFragment$onMgnModeChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = c50062vAm;
        this.$arbitrageType = arbitrageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArbitrageTradeFragment$onMgnModeChanged$1(this.this$0, this.$arbitrageType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArbitrageTradeFragment$onMgnModeChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ArbTradeViewModel arbTradeViewModelIsConnected = this.this$0.isConnected();
            ArbitrageType arbitrageType = this.$arbitrageType;
            this.label = 1;
            if (arbTradeViewModelIsConnected.KWHzl(arbitrageType, this) == objCopydefault) {
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
