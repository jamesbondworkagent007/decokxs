package com.okinc.okmarket.data.watch;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.qWN;
import o.sZS;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketWatchDataApiIMpl$queryIsWatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ WatchListData $watchListData;
    int label;
    final /* synthetic */ sZS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketWatchDataApiIMpl$queryIsWatching$2(sZS szs, WatchListData watchListData, Continuation<? super MarketWatchDataApiIMpl$queryIsWatching$2> continuation) {
        super(2, continuation);
        this.this$0 = szs;
        this.$watchListData = watchListData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketWatchDataApiIMpl$queryIsWatching$2(this.this$0, this.$watchListData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((MarketWatchDataApiIMpl$queryIsWatching$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            qWN qwn = this.this$0.AEQbTJ;
            WatchListData watchListData = this.$watchListData;
            this.label = 1;
            obj = qwn.KWHzl(watchListData, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
