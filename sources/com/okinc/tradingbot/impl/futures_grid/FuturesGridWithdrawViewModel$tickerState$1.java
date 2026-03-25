package com.okinc.tradingbot.impl.futures_grid;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class FuturesGridWithdrawViewModel$tickerState$1 extends SuspendLambda implements yHO<String, String, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FuturesGridWithdrawViewModel$tickerState$1(Continuation<? super FuturesGridWithdrawViewModel$tickerState$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(String str, String str2, Continuation<? super String> continuation) {
        FuturesGridWithdrawViewModel$tickerState$1 futuresGridWithdrawViewModel$tickerState$1 = new FuturesGridWithdrawViewModel$tickerState$1(continuation);
        futuresGridWithdrawViewModel$tickerState$1.L$0 = str;
        futuresGridWithdrawViewModel$tickerState$1.L$1 = str2;
        return futuresGridWithdrawViewModel$tickerState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            return StringsKt__StringsKt.fARcdN((CharSequence) str2) ? str : str2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
