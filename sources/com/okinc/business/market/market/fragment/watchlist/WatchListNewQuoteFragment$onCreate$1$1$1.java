package com.okinc.business.market.market.fragment.watchlist;

import android.os.SystemClock;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.tradeapi.bean.MarketDataSource;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.kIH;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListNewQuoteFragment$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<Pair<CoinQuote, MarketDataSource>> $it;
    int label;
    final /* synthetic */ kIH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListNewQuoteFragment$onCreate$1$1$1(kIH kih, ArrayList<Pair<CoinQuote, MarketDataSource>> arrayList, Continuation<? super WatchListNewQuoteFragment$onCreate$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kih;
        this.$it = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListNewQuoteFragment$onCreate$1$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListNewQuoteFragment$onCreate$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.this$0.DbNXlk;
            if (jElapsedRealtime < 500) {
                long jMax = Math.max(jElapsedRealtime, 0L);
                this.label = 1;
                if (DelayKt.delay(((long) 500) - jMax, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.EZpvd((ArrayList<Pair<CoinQuote, MarketDataSource>>) this.$it);
        return Unit.INSTANCE;
    }
}
