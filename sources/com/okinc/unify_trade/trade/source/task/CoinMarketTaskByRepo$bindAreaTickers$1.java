package com.okinc.unify_trade.trade.source.task;

import android.os.SystemClock;
import java.util.List;
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
public final class CoinMarketTaskByRepo$bindAreaTickers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $currentGroup;
    int label;
    final /* synthetic */ xSJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMarketTaskByRepo$bindAreaTickers$1(xSJ xsj, List<String> list, Continuation<? super CoinMarketTaskByRepo$bindAreaTickers$1> continuation) {
        super(2, continuation);
        this.this$0 = xsj;
        this.$currentGroup = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinMarketTaskByRepo$bindAreaTickers$1(this.this$0, this.$currentGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMarketTaskByRepo$bindAreaTickers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowM7441catch = FlowKt.m7441catch(this.this$0.OLrzqt() ? this.this$0.EZpvd.copydefault("CoinMarketTaskMapRepo", this.$currentGroup) : this.this$0.EZpvd.copydefault("CoinMarketTaskMapRepo", this.this$0.copydefault), new CoinMarketTaskByRepo$bindAreaTickers$1$flow$1(null));
            final xSJ xsj = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$bindAreaTickers$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return copydefault(((Number) obj2).longValue(), continuation);
                }

                public final Object copydefault(long j, Continuation<? super Unit> continuation) {
                    xsj.copydefault().setValue(C56443yFo.KWHzl(SystemClock.elapsedRealtime()));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
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
