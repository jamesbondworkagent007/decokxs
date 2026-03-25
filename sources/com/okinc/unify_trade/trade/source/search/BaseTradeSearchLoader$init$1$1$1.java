package com.okinc.unify_trade.trade.source.search;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.xRQ;

/* JADX INFO: loaded from: classes17.dex */
public final class BaseTradeSearchLoader$init$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $bizTypes;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ xRQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTradeSearchLoader$init$1$1$1(List<String> list, xRQ xrq, Continuation<? super BaseTradeSearchLoader$init$1$1$1> continuation) {
        super(2, continuation);
        this.$bizTypes = list;
        this.this$0 = xrq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTradeSearchLoader$init$1$1$1(this.$bizTypes, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTradeSearchLoader$init$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        xRQ xrq;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                List<String> list = this.$bizTypes;
                xrq = this.this$0;
                Result.Application application = Result.Companion;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$1;
                xrq = (xRQ) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                String str = (String) it.next();
                this.L$0 = xrq;
                this.L$1 = it;
                this.label = 1;
                if (xrq.OLrzqt(str, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
