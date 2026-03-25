package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.WatchListReo$data$1;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kIR;
import o.kKB;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListReo$data$1 extends SuspendLambda implements yHO<List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>, String, Continuation<? super List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ kIR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListReo$data$1(kIR kir, Continuation<? super WatchListReo$data$1> continuation) {
        super(3, continuation);
        this.this$0 = kir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>> list, String str, Continuation<? super List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>> continuation) {
        return invoke2((List<? extends Pair<CoinQuote, ? extends MarketDataSource>>) list, str, (Continuation<? super List<? extends Pair<CoinQuote, ? extends MarketDataSource>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<? extends Pair<CoinQuote, ? extends MarketDataSource>> list, String str, Continuation<? super List<? extends Pair<CoinQuote, ? extends MarketDataSource>>> continuation) {
        WatchListReo$data$1 watchListReo$data$1 = new WatchListReo$data$1(this.this$0, continuation);
        watchListReo$data$1.L$0 = list;
        watchListReo$data$1.L$1 = str;
        return watchListReo$data$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<MarketDataSource> list;
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list2 = (List) this.L$0;
            String str = (String) this.L$1;
            if (str.length() == 0) {
                return list2;
            }
            if (list2 == null) {
                return null;
            }
            kIR kir = this.this$0;
            ArrayList arrayList = new ArrayList();
            if (!kir.djBIcL && (list = kir.gEmmrt) != null) {
                for (MarketDataSource marketDataSource : list) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Pair pair = (Pair) next;
                        if (Intrinsics.EZpvd((Object) marketDataSource.getInstId(), (Object) ((MarketDataSource) pair.getSecond()).getInstId()) && Intrinsics.EZpvd((Object) marketDataSource.getInstType(), (Object) ((MarketDataSource) pair.getSecond()).getInstType())) {
                            break;
                        }
                    }
                    Pair pair2 = (Pair) next;
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                List listFilterBySearchKeyword$default = kKB.filterBySearchKeyword$default(kKB.KWHzl, str, list2, false, new Function1() { // from class: o.kIS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WatchListReo$data$1.invokeSuspend$lambda$6$lambda$3((kotlin.Pair) obj2);
                    }
                }, 4, null);
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listFilterBySearchKeyword$default, 10));
                Iterator it2 = listFilterBySearchKeyword$default.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((MarketDataSource) ((Pair) it2.next()).getSecond());
                }
                kir.gEmmrt = arrayList2;
                arrayList.addAll(listFilterBySearchKeyword$default);
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarketDataSource invokeSuspend$lambda$6$lambda$3(Pair pair) {
        return (MarketDataSource) pair.getSecond();
    }
}
