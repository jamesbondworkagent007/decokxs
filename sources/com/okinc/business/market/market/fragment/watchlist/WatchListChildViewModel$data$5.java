package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C27985kKq;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListChildViewModel$data$5 extends SuspendLambda implements yHO<List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>, String, Continuation<? super ArrayList<Pair<? extends CoinQuote, ? extends MarketDataSource>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListChildViewModel$data$5(Continuation<? super WatchListChildViewModel$data$5> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>> list, String str, Continuation<? super ArrayList<Pair<? extends CoinQuote, ? extends MarketDataSource>>> continuation) {
        return invoke2((List<? extends Pair<CoinQuote, ? extends MarketDataSource>>) list, str, (Continuation<? super ArrayList<Pair<CoinQuote, MarketDataSource>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<? extends Pair<CoinQuote, ? extends MarketDataSource>> list, String str, Continuation<? super ArrayList<Pair<CoinQuote, MarketDataSource>>> continuation) {
        WatchListChildViewModel$data$5 watchListChildViewModel$data$5 = new WatchListChildViewModel$data$5(continuation);
        watchListChildViewModel$data$5.L$0 = list;
        watchListChildViewModel$data$5.L$1 = str;
        return watchListChildViewModel$data$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            return C27985kKq.OLrzqt.EZpvd((String) this.L$1, list != null ? new ArrayList<>(list) : new ArrayList<>());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
