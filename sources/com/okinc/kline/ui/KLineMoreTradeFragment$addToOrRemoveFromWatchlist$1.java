package com.okinc.kline.ui;

import com.okinc.unify_trade.biz.TokenBusinessData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C38614pck;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBusinessData $data;
    final /* synthetic */ String $instId;
    final /* synthetic */ WatchListData $watchData;
    int label;
    final /* synthetic */ C38614pck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1(TokenBusinessData tokenBusinessData, C38614pck c38614pck, WatchListData watchListData, String str, Continuation<? super KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1> continuation) {
        super(2, continuation);
        this.$data = tokenBusinessData;
        this.this$0 = c38614pck;
        this.$watchData = watchListData;
        this.$instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1(this.$data, this.this$0, this.$watchData, this.$instId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineMoreTradeFragment$addToOrRemoveFromWatchlist$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$data.isWatching()) {
                this.this$0.gEmmrt().AEQbTJ(this.$watchData, this.$instId);
            } else {
                this.this$0.gEmmrt().copydefault(this.$watchData, this.$instId);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
