package com.okinc.unify_trade.trade.source.task;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.xSJ;

/* JADX INFO: loaded from: classes19.dex */
public final class CoinMarketTaskByRepo$startCheckResultLoop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ xSJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMarketTaskByRepo$startCheckResultLoop$1(xSJ xsj, Continuation<? super CoinMarketTaskByRepo$startCheckResultLoop$1> continuation) {
        super(2, continuation);
        this.this$0 = xsj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinMarketTaskByRepo$startCheckResultLoop$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMarketTaskByRepo$startCheckResultLoop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.sample(this.this$0.copydefault(), 2000L));
            final xSJ xsj = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$startCheckResultLoop$1.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return EZpvd(((Number) obj2).longValue(), continuation);
                }

                public final Object EZpvd(long j, Continuation<? super Unit> continuation) {
                    xSJ xsj2 = xsj;
                    try {
                        Result.Application application = Result.Companion;
                    } catch (Throwable th) {
                        Result.Application application2 = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (xsj2.valueOf.hasActiveObservers()) {
                        if (j != 0) {
                            xsj2.AhwBna.invoke(C56443yFo.KWHzl(true), null);
                        }
                        Result.m7377constructorimpl(Unit.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    xsj2.KWHzl();
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowDistinctUntilChanged.collect(flowCollector, this) == objCopydefault) {
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
