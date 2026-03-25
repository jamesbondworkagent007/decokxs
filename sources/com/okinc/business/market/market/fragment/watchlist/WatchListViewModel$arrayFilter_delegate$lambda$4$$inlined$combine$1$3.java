package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C27869kGi;
import o.C33070mpX;
import o.C33129mqd;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.qZH;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3 extends SuspendLambda implements yHO<FlowCollector<? super ArrayList<C27869kGi.ActionBar>>, List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>[], Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3(Continuation continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ArrayList<C27869kGi.ActionBar>> flowCollector, List<? extends Pair<? extends CoinQuote, ? extends MarketDataSource>>[] listArr, Continuation<? super Unit> continuation) {
        WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3 watchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3 = new WatchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3(continuation);
        watchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3.L$0 = flowCollector;
        watchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3.L$1 = listArr;
        return watchListViewModel$arrayFilter_delegate$lambda$4$$inlined$combine$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List[] listArr = (List[]) ((Object[]) this.L$1);
            ArrayList arrayList = new ArrayList();
            int length = listArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (C33129mqd.KWHzl((Collection) listArr[i3])) {
                    arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(C55688xof.Application.sbu), "ANY", "all"));
                    break;
                }
                i3++;
            }
            int length2 = listArr.length;
            int i4 = 0;
            while (i2 < length2) {
                List list = listArr[i2];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 4) {
                                if (C33129mqd.KWHzl((Collection) list)) {
                                    arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultLauncher), "MARGIN", "MARGIN"));
                                }
                            } else if (i4 == 5 && C33129mqd.KWHzl((Collection) list)) {
                                arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(qZH.PendingIntent.resume), "OPTION", "OPTION"));
                            }
                        } else if (C33129mqd.KWHzl((Collection) list)) {
                            arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(qZH.PendingIntent.DQnQnb), "SWAP", "SWAP"));
                        }
                    } else if (C33129mqd.KWHzl((Collection) list)) {
                        arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(C55688xof.Application.zpGcln), "SPOT", "SPOT"));
                    }
                } else if (C33129mqd.KWHzl((Collection) list)) {
                    arrayList.add(new C27869kGi.ActionBar(C33070mpX.AYXKKw(C55688xof.Application.open), "COIN", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK));
                }
                i2++;
                i4++;
            }
            if (arrayList.size() == 2) {
                arrayList.remove(yDY.AuCTel(arrayList));
            }
            this.label = 1;
            if (flowCollector.emit(arrayList, this) == objCopydefault) {
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
