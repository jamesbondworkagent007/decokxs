package com.okinc.tradingbot.impl.aiBot.ui.backtest;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C48033uCm;
import o.C49968uyZ;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class DeleteBacktestDialog$performDeleteBacktest$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Throwable $throwable;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeleteBacktestDialog$performDeleteBacktest$1$1(Throwable th, Function1<? super String, Unit> function1, Continuation<? super DeleteBacktestDialog$performDeleteBacktest$1$1> continuation) {
        super(2, continuation);
        this.$throwable = th;
        this.$onError = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeleteBacktestDialog$performDeleteBacktest$1$1(this.$throwable, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeleteBacktestDialog$performDeleteBacktest$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strOLrzqt = C49968uyZ.OLrzqt(this.$throwable, C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT));
            Function1<String, Unit> function1 = this.$onError;
            if (function1 != null) {
                function1.invoke(strOLrzqt);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
