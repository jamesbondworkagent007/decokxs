package com.okinc.find_ui.ranking.percentchange.sub;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35086nog;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeUpRankingFuturesFragment$startRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callSite;
    int label;
    final /* synthetic */ C35086nog this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeUpRankingFuturesFragment$startRefresh$1(C35086nog c35086nog, String str, Continuation<? super MarketHomeUpRankingFuturesFragment$startRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = c35086nog;
        this.$callSite = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeUpRankingFuturesFragment$startRefresh$1(this.this$0, this.$callSite, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeUpRankingFuturesFragment$startRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModelZsXlph = this.this$0.zsXlph();
            String str = this.$callSite;
            RankingFuturesType rankingFuturesType = RankingFuturesType.GAINERS;
            PeriodEnum periodEnum = PeriodEnum.RANKING_PERIOD_1D;
            this.label = 1;
            if (marketHomeFuturesRankingViewModelZsXlph.EZpvd(str, rankingFuturesType, periodEnum, this) == objCopydefault) {
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
