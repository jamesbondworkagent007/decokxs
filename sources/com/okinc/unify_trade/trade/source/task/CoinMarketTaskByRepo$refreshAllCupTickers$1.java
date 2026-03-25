package com.okinc.unify_trade.trade.source.task;

import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.qTI;
import o.xSJ;

/* JADX INFO: loaded from: classes19.dex */
public final class CoinMarketTaskByRepo$refreshAllCupTickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ xSJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMarketTaskByRepo$refreshAllCupTickers$1(xSJ xsj, Continuation<? super CoinMarketTaskByRepo$refreshAllCupTickers$1> continuation) {
        super(2, continuation);
        this.this$0 = xsj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinMarketTaskByRepo$refreshAllCupTickers$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMarketTaskByRepo$refreshAllCupTickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xSJ xsj;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            xsj = this.this$0;
            Result.Application application2 = Result.Companion;
            if (xsj.copydefault.size() >= 50) {
                qTI qti = xsj.EZpvd;
                this.L$0 = xsj;
                this.label = 1;
                if (qti.copydefault("CoinMarketTaskMapRepo", this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                qTI qti2 = xsj.EZpvd;
                List<String> list = xsj.copydefault;
                this.L$0 = xsj;
                this.label = 2;
                if (qti2.KWHzl(list, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            xsj = (xSJ) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        CoinMarketTaskByRepo$refreshAllCupTickers$1$1$1 coinMarketTaskByRepo$refreshAllCupTickers$1$1$1 = new CoinMarketTaskByRepo$refreshAllCupTickers$1$1$1(xsj, null);
        this.L$0 = null;
        this.label = 3;
        if (BuildersKt.withContext(main, coinMarketTaskByRepo$refreshAllCupTickers$1$1$1, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
