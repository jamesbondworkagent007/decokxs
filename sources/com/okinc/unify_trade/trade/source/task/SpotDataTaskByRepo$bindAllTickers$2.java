package com.okinc.unify_trade.trade.source.task;

import com.okinc.unify_trade.biz.BizInstrument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C54747xTv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qTT;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotDataTaskByRepo$bindAllTickers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C54747xTv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDataTaskByRepo$bindAllTickers$2(C54747xTv c54747xTv, Continuation<? super SpotDataTaskByRepo$bindAllTickers$2> continuation) {
        super(2, continuation);
        this.this$0 = c54747xTv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDataTaskByRepo$bindAllTickers$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDataTaskByRepo$bindAllTickers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C54747xTv c54747xTv = this.this$0;
                Result.Application application = Result.Companion;
                if (c54747xTv.isConnected.size() > 50) {
                    Flow<Long> flowOLrzqt = c54747xTv.fJNWhG.OLrzqt("SpotDataTaskByRepo", "SPOT");
                    SpotDataTaskByRepo$bindAllTickers$2$1$1 spotDataTaskByRepo$bindAllTickers$2$1$1 = new SpotDataTaskByRepo$bindAllTickers$2$1$1(c54747xTv, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOLrzqt, spotDataTaskByRepo$bindAllTickers$2$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    qTT qtt = c54747xTv.fJNWhG;
                    List list = c54747xTv.isConnected;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BizInstrument) it.next()).getInstId());
                    }
                    Flow<Long> flowCopydefault = qtt.copydefault("SpotDataTaskByRepo", arrayList);
                    SpotDataTaskByRepo$bindAllTickers$2$1$3 spotDataTaskByRepo$bindAllTickers$2$1$3 = new SpotDataTaskByRepo$bindAllTickers$2$1$3(c54747xTv, null);
                    this.label = 2;
                    if (FlowKt.collectLatest(flowCopydefault, spotDataTaskByRepo$bindAllTickers$2$1$3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}
