package com.okinc.find_ui.ranking.hot;

import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C34971nmX;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeHotRankingFragmentV2$setListener$5 extends SuspendLambda implements Function2<MarketHomeV2ViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34971nmX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingFragmentV2$setListener$5(C34971nmX c34971nmX, Continuation<? super MarketHomeHotRankingFragmentV2$setListener$5> continuation) {
        super(2, continuation);
        this.this$0 = c34971nmX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHomeHotRankingFragmentV2$setListener$5 marketHomeHotRankingFragmentV2$setListener$5 = new MarketHomeHotRankingFragmentV2$setListener$5(this.this$0, continuation);
        marketHomeHotRankingFragmentV2$setListener$5.L$0 = obj;
        return marketHomeHotRankingFragmentV2$setListener$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarketHomeV2ViewModel.Application application, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingFragmentV2$setListener$5) create(application, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel.Application application = (MarketHomeV2ViewModel.Application) this.L$0;
            if (application != null && application.KWHzl()) {
                this.this$0.zuBGHE().setItems(yDY.AhwBna());
                this.this$0.zuBGHE().notifyDataSetChanged();
                this.this$0.AEQbTJ(true);
                this.this$0.EZpvd(true);
                this.this$0.KWHzl("switch instType");
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
