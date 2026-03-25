package com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter;

import com.okinc.unify_trade.bot.data.ArbitrageType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;

/* JADX INFO: loaded from: classes19.dex */
public final class ArbTradeViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ArbTradeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbTradeViewModel$loadData$1(ArbTradeViewModel arbTradeViewModel, Continuation<? super ArbTradeViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = arbTradeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArbTradeViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArbTradeViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8790ensureInitialize0E7RQCE$default;
        ArbTradeViewModel arbTradeViewModel;
        ArbitrageType arbitrageType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            this.label = 1;
            objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(c54589xNz, false, null, this, 3, null);
            if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.OLrzqt();
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                arbTradeViewModel = this.this$0;
                arbitrageType = ArbitrageType.RIGHT;
                this.label = 3;
                if (arbTradeViewModel.KWHzl(arbitrageType, this) == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.OLrzqt();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            objM8790ensureInitialize0E7RQCE$default = null;
        }
        if (objM8790ensureInitialize0E7RQCE$default == null) {
            return Unit.INSTANCE;
        }
        ArbTradeViewModel arbTradeViewModel2 = this.this$0;
        ArbitrageType arbitrageType2 = ArbitrageType.LEFT;
        this.label = 2;
        if (arbTradeViewModel2.KWHzl(arbitrageType2, this) == objCopydefault) {
            return objCopydefault;
        }
        arbTradeViewModel = this.this$0;
        arbitrageType = ArbitrageType.RIGHT;
        this.label = 3;
        if (arbTradeViewModel.KWHzl(arbitrageType, this) == objCopydefault) {
        }
        this.this$0.OLrzqt();
        return Unit.INSTANCE;
    }
}
