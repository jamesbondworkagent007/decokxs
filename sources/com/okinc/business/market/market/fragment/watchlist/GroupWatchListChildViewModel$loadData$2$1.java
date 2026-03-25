package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C27985kKq;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel$loadData$2$1 extends SuspendLambda implements yHO<List<? extends CoinQuote>, String, Continuation<? super ArrayList<CoinQuote>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupWatchListChildViewModel$loadData$2$1(Continuation<? super GroupWatchListChildViewModel$loadData$2$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends CoinQuote> list, String str, Continuation<? super ArrayList<CoinQuote>> continuation) {
        return invoke2((List<CoinQuote>) list, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<CoinQuote> list, String str, Continuation<? super ArrayList<CoinQuote>> continuation) {
        GroupWatchListChildViewModel$loadData$2$1 groupWatchListChildViewModel$loadData$2$1 = new GroupWatchListChildViewModel$loadData$2$1(continuation);
        groupWatchListChildViewModel$loadData$2$1.L$0 = list;
        groupWatchListChildViewModel$loadData$2$1.L$1 = str;
        return groupWatchListChildViewModel$loadData$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            return C27985kKq.OLrzqt.OLrzqt((String) this.L$1, new ArrayList<>(list));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
