package com.okinc.find_ui.ranking.hot;

import com.okinc.business.market.utils.MarketHomeTabType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C34971nmX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeHotRankingFragmentV2$setListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C34971nmX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeHotRankingFragmentV2$setListener$1$1(C34971nmX c34971nmX, Continuation<? super MarketHomeHotRankingFragmentV2$setListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c34971nmX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeHotRankingFragmentV2$setListener$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeHotRankingFragmentV2$setListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl(this.this$0.getTAG(), "loadHotConcernRanking() - setupViewModel() refresh");
            C34971nmX c34971nmX = this.this$0;
            this.label = 1;
            if (c34971nmX.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.zuBGHE().setItems(this.this$0.AubY().OLrzqt());
        this.this$0.zuBGHE().notifyDataSetChanged();
        this.this$0.EZpvd(false);
        if (!this.this$0.gEmmrt()) {
            C34971nmX c34971nmX2 = this.this$0;
            c34971nmX2.EZpvd(c34971nmX2.getView(), MarketHomeTabType.HOT);
        }
        return Unit.INSTANCE;
    }
}
