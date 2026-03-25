package com.okinc.business.market.home.favorites.viewmodel;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.qWH;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavChildViewModel$loadData$4$3 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends qWH>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavChildViewModel$loadData$4$3(String str, Continuation<? super MarketFavChildViewModel$loadData$4$3> continuation) {
        super(3, continuation);
        this.$type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends qWH>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        MarketFavChildViewModel$loadData$4$3 marketFavChildViewModel$loadData$4$3 = new MarketFavChildViewModel$loadData$4$3(this.$type, continuation);
        marketFavChildViewModel$loadData$4$3.L$0 = th;
        return marketFavChildViewModel$loadData$4$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            pUU.AEQbTJ("MarketFavChildViewModel", "loadData: error, type=" + this.$type, th);
            if (th instanceof CancellationException) {
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
