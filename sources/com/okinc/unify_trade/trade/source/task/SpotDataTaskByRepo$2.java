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
import o.C54747xTv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.qTX;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDataTaskByRepo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C54747xTv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDataTaskByRepo$2(C54747xTv c54747xTv, Continuation<? super SpotDataTaskByRepo$2> continuation) {
        super(2, continuation);
        this.this$0 = c54747xTv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDataTaskByRepo$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDataTaskByRepo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C54747xTv c54747xTv;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C54747xTv c54747xTv2 = this.this$0;
                Result.Application application = Result.Companion;
                pUU.KWHzl("NavOptPhase1", c54747xTv2.OLrzqt + " -> SpotDataTaskByRepo launch tickers start");
                Function1[] function1Arr = {new SpotDataTaskByRepo$2$1$1(c54747xTv2, null), new SpotDataTaskByRepo$2$1$2(c54747xTv2, null)};
                this.L$0 = c54747xTv2;
                this.label = 1;
                if (C40394qUf.KWHzl(function1Arr, this) == objCopydefault) {
                    return objCopydefault;
                }
                c54747xTv = c54747xTv2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c54747xTv = (C54747xTv) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            c54747xTv.EZpvd.setValue(C56443yFo.KWHzl(SystemClock.elapsedRealtime()));
            if (c54747xTv.fJNWhG instanceof qTX) {
                c54747xTv.AEQbTJ(((Number) c54747xTv.EZpvd.getValue()).longValue());
            }
            pUU.KWHzl("NavOptPhase1", c54747xTv.OLrzqt + " -> SpotDataTaskByRepo launch tickers done, " + c54747xTv.EZpvd.getValue());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
