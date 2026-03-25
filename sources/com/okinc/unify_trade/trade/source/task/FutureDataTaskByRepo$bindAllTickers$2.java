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
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qTT;
import o.xSU;

/* JADX INFO: loaded from: classes19.dex */
public final class FutureDataTaskByRepo$bindAllTickers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ xSU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureDataTaskByRepo$bindAllTickers$2(xSU xsu, Continuation<? super FutureDataTaskByRepo$bindAllTickers$2> continuation) {
        super(2, continuation);
        this.this$0 = xsu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FutureDataTaskByRepo$bindAllTickers$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FutureDataTaskByRepo$bindAllTickers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xSU xsu = this.this$0;
                Result.Application application = Result.Companion;
                if (xsu.isConnected.size() > 50) {
                    if (xsu.fJNWhG == null) {
                        Flow<Long> flowOLrzqt = xsu.ejfBZ.OLrzqt("FutureDataTaskByRepo", xsu.DbNXlk);
                        FutureDataTaskByRepo$bindAllTickers$2$1$1 futureDataTaskByRepo$bindAllTickers$2$1$1 = new FutureDataTaskByRepo$bindAllTickers$2$1$1(xsu, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowOLrzqt, futureDataTaskByRepo$bindAllTickers$2$1$1, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Flow<Long> flowCopydefault = xsu.ejfBZ.copydefault("FutureDataTaskByRepo", xsu.DbNXlk, xsu.fJNWhG);
                        FutureDataTaskByRepo$bindAllTickers$2$1$2 futureDataTaskByRepo$bindAllTickers$2$1$2 = new FutureDataTaskByRepo$bindAllTickers$2$1$2(xsu, null);
                        this.label = 2;
                        if (FlowKt.collectLatest(flowCopydefault, futureDataTaskByRepo$bindAllTickers$2$1$2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    qTT qtt = xsu.ejfBZ;
                    List list = xsu.isConnected;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BizInstrument) it.next()).getInstId());
                    }
                    Flow<Long> flowCopydefault2 = qtt.copydefault("FutureDataTaskByRepo", arrayList);
                    FutureDataTaskByRepo$bindAllTickers$2$1$4 futureDataTaskByRepo$bindAllTickers$2$1$4 = new FutureDataTaskByRepo$bindAllTickers$2$1$4(xsu, null);
                    this.label = 3;
                    if (FlowKt.collectLatest(flowCopydefault2, futureDataTaskByRepo$bindAllTickers$2$1$4, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
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
