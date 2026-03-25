package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27947kJf;
import o.C56391yDq;
import o.C56442yFn;
import o.kIY;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$observer$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<CoinQuote> $coinQuotes;
    final /* synthetic */ ArrayList<MarketDataSource> $this_notifyChange;
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$observer$1$1$1$1$1(kIY kiy, List<CoinQuote> list, ArrayList<MarketDataSource> arrayList, Continuation<? super WatchListTabFragment$observer$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kiy;
        this.$coinQuotes = list;
        this.$this_notifyChange = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$observer$1$1$1$1$1(this.this$0, this.$coinQuotes, this.$this_notifyChange, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$observer$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27947kJf c27947kJfUzCIH = this.this$0.uzCIH();
            C27947kJf.TaskDescription.ActionBar actionBar = new C27947kJf.TaskDescription.ActionBar(this.$coinQuotes, this.$this_notifyChange);
            this.label = 1;
            if (c27947kJfUzCIH.copydefault(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.OLrzqt(this.$coinQuotes.isEmpty());
        return Unit.INSTANCE;
    }
}
