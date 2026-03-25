package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C27869kGi;
import o.C27947kJf;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yHS;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListViewModel$_uiState$1 extends SuspendLambda implements yHS<Boolean, Pair<? extends Integer, ? extends String>, List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>, ArrayList<C27869kGi.ActionBar>, Continuation<? super C27947kJf.ActionBar>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListViewModel$_uiState$1(Continuation<? super WatchListViewModel$_uiState$1> continuation) {
        super(5, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(Boolean bool, Pair<? extends Integer, ? extends String> pair, List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>> list, ArrayList<C27869kGi.ActionBar> arrayList, Continuation<? super C27947kJf.ActionBar> continuation) {
        return invoke(bool.booleanValue(), (Pair<Integer, String>) pair, (List<? extends Pair<CoinQuote, ? extends MarketDataSource>>) list, arrayList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Pair<Integer, String> pair, List<? extends Pair<CoinQuote, ? extends MarketDataSource>> list, ArrayList<C27869kGi.ActionBar> arrayList, Continuation<? super C27947kJf.ActionBar> continuation) {
        WatchListViewModel$_uiState$1 watchListViewModel$_uiState$1 = new WatchListViewModel$_uiState$1(continuation);
        watchListViewModel$_uiState$1.Z$0 = z;
        watchListViewModel$_uiState$1.L$0 = pair;
        watchListViewModel$_uiState$1.L$1 = list;
        watchListViewModel$_uiState$1.L$2 = arrayList;
        return watchListViewModel$_uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            Pair pair = (Pair) this.L$0;
            List list = (List) this.L$1;
            ArrayList arrayList2 = (ArrayList) this.L$2;
            Iterator it = arrayList2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd(((C27869kGi.ActionBar) it.next()).EZpvd(), pair.getSecond())) {
                    break;
                }
                i++;
            }
            if (list != null) {
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add((CoinQuote) ((Pair) it2.next()).getFirst());
                }
            } else {
                arrayList = null;
            }
            return new C27947kJf.ActionBar(z, i, arrayList, arrayList2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
