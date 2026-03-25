package com.okinc.find_ui.ranking.hot;

import com.okinc.market.ranking.core.model.po.RankingFuturesType;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.unify_find.viewmodel.MarketHomeFuturesRankingViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34971nmX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeHotRankingFragmentV2$startRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $callSite;
    int label;
    final /* synthetic */ C34971nmX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingFragmentV2$startRefresh$1(C34971nmX c34971nmX, String str, Continuation<? super MarketHomeHotRankingFragmentV2$startRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = c34971nmX;
        this.$callSite = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeHotRankingFragmentV2$startRefresh$1(this.this$0, this.$callSite, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingFragmentV2$startRefresh$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AubY().bA_();
            MarketHomeV2ViewModel marketHomeV2ViewModelAwvSrB = this.this$0.AwvSrB();
            this.label = 1;
            obj = marketHomeV2ViewModelAwvSrB.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (Intrinsics.EZpvd(obj, (Object) "SPOT")) {
            this.this$0.AubY().EZpvd(C56443yFo.KWHzl(this.this$0.sSMYrx()));
        } else {
            MarketHomeFuturesRankingViewModel marketHomeFuturesRankingViewModelZLjUOn = this.this$0.zLjUOn();
            String str = this.$callSite;
            RankingFuturesType rankingFuturesType = RankingFuturesType.HOT;
            PeriodEnum periodEnum = PeriodEnum.RANKING_PERIOD_1D;
            this.label = 2;
            if (marketHomeFuturesRankingViewModelZLjUOn.EZpvd(str, rankingFuturesType, periodEnum, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
