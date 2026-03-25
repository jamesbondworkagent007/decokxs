package com.okinc.unify_trade.trade.source.task;

import android.os.SystemClock;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C40394qUf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.qTX;
import o.xSU;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureDataTaskByRepo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ xSU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureDataTaskByRepo$2(xSU xsu, Continuation<? super FutureDataTaskByRepo$2> continuation) {
        super(2, continuation);
        this.this$0 = xsu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureDataTaskByRepo$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureDataTaskByRepo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xSU xsu;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xSU xsu2 = this.this$0;
                Result.Application application = Result.Companion;
                pUU.KWHzl("NavOptPhase1", xsu2.EZpvd + " -> SpotDataTaskByRepo launch tickers start");
                Function1[] function1Arr = {new FutureDataTaskByRepo$2$1$1(xsu2, null), new FutureDataTaskByRepo$2$1$2(xsu2, null)};
                this.L$0 = xsu2;
                this.label = 1;
                if (C40394qUf.KWHzl(function1Arr, this) == objCopydefault) {
                    return objCopydefault;
                }
                xsu = xsu2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xsu = (xSU) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            xsu.EZpvd();
            xsu.OLrzqt.setValue(C56443yFo.KWHzl(SystemClock.elapsedRealtime()));
            if (xsu.ejfBZ instanceof qTX) {
                xsu.EZpvd(((Number) xsu.OLrzqt.getValue()).longValue());
            }
            pUU.KWHzl("NavOptPhase1", xsu.EZpvd + " -> SpotDataTaskByRepo launch tickers done, " + xsu.OLrzqt.getValue());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
