package com.okinc.find_ui.ranking.stock.sub;

import com.okinc.find_ui.ranking.stock.sub.MarketHomeStockRankingFragment$setListener$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketHomeStockRankingFragment$setListener$1.AnonymousClass1.ActionBar.AnonymousClass3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockRankingFragment$setListener$1$1$invokeSuspend$$inlined$map$2$2$1(MarketHomeStockRankingFragment$setListener$1.AnonymousClass1.ActionBar.AnonymousClass3 anonymousClass3, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
