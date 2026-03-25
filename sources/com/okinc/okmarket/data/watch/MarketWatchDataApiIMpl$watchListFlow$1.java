package com.okinc.okmarket.data.watch;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import o.sZS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketWatchDataApiIMpl$watchListFlow$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sZS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketWatchDataApiIMpl$watchListFlow$1(sZS szs, Continuation<? super MarketWatchDataApiIMpl$watchListFlow$1> continuation) {
        super(continuation);
        this.this$0 = szs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return sZS.EZpvd(this.this$0, false, (Continuation<? super Flow<? extends List<WatchListData>>>) this);
    }
}
