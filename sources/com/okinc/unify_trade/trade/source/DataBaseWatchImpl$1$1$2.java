package com.okinc.unify_trade.trade.source;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$1$1$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends WatchListData>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DataBaseWatchImpl$1$1$2(Continuation<? super DataBaseWatchImpl$1$1$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super List<? extends WatchListData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super List<WatchListData>>) flowCollector, th, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super List<WatchListData>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        DataBaseWatchImpl$1$1$2 dataBaseWatchImpl$1$1$2 = new DataBaseWatchImpl$1$1$2(continuation);
        dataBaseWatchImpl$1$1$2.L$0 = th;
        return dataBaseWatchImpl$1$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.copydefault("queryWatchListInfoFlow error:" + ((Throwable) this.L$0).getMessage());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
