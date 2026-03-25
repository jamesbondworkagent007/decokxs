package com.okinc.unify_find.viewmodel;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$1 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends Object>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callSite;
    final /* synthetic */ RankingFuturesType $rankType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$1(String str, RankingFuturesType rankingFuturesType, Continuation<? super MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$1> continuation) {
        super(3, continuation);
        this.$callSite = str;
        this.$rankType = rankingFuturesType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends Object>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new MarketHomeFuturesRankingViewModel$subscribeRankingWs$4$1(this.$callSite, this.$rankType, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketHomeFuturesRankingViewModel", "subscribeRankingWs end flow data: [callSite: " + this.$callSite + ", rankType: " + this.$rankType + "]");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
