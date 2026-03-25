package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel$loadData$4$2 extends SuspendLambda implements yHT<FlowCollector<? super ArrayList<CoinQuote>>, Throwable, Long, Continuation<? super Boolean>, Object> {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupWatchListChildViewModel$loadData$4$2(Continuation<? super GroupWatchListChildViewModel$loadData$4$2> continuation) {
        super(4, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(FlowCollector<? super ArrayList<CoinQuote>> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
        return invoke(flowCollector, th, l.longValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(FlowCollector<? super ArrayList<CoinQuote>> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
        GroupWatchListChildViewModel$loadData$4$2 groupWatchListChildViewModel$loadData$4$2 = new GroupWatchListChildViewModel$loadData$4$2(continuation);
        groupWatchListChildViewModel$loadData$4$2.L$0 = th;
        groupWatchListChildViewModel$loadData$4$2.J$0 = j;
        return groupWatchListChildViewModel$loadData$4$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            th = (Throwable) this.L$0;
            long j2 = this.J$0;
            pUU.AEQbTJ("GroupWatchListChildViewModel", "loadData: retrying due to error", th);
            this.L$0 = th;
            this.J$0 = j2;
            this.label = 1;
            if (DelayKt.delay(3000L, this) == objCopydefault) {
                return objCopydefault;
            }
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            th = (Throwable) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(!(th instanceof CancellationException) && j < 5);
    }
}
