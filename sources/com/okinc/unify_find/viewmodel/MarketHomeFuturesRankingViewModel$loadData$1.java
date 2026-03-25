package com.okinc.unify_find.viewmodel;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel$loadData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketHomeFuturesRankingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeFuturesRankingViewModel$loadData$1(MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModel, Continuation<? super MarketHomeFuturesRankingViewModel$loadData$1> continuation) {
        super(continuation);
        this.this$0 = marketHomeFuturesRankingViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((String) null, (RankingFuturesType) null, (PeriodEnum) null, this);
    }
}
