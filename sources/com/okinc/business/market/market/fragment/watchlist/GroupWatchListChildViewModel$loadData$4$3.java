package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel$loadData$4$3 extends SuspendLambda implements yHO<FlowCollector<? super ArrayList<CoinQuote>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupWatchListChildViewModel$loadData$4$3(Continuation<? super GroupWatchListChildViewModel$loadData$4$3> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ArrayList<CoinQuote>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        GroupWatchListChildViewModel$loadData$4$3 groupWatchListChildViewModel$loadData$4$3 = new GroupWatchListChildViewModel$loadData$4$3(continuation);
        groupWatchListChildViewModel$loadData$4$3.L$0 = th;
        return groupWatchListChildViewModel$loadData$4$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            pUU.AEQbTJ("GroupWatchListChildViewModel", "loadData: error", th);
            if (th instanceof CancellationException) {
                pUU.AEQbTJ("GroupWatchListChildViewModel", "flowdata: error catched  ", th);
                return Unit.INSTANCE;
            }
            pUU.AEQbTJ("GroupWatchListChildViewModel", "loadData: ", th);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
