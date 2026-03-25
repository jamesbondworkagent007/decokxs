package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel$loadData$4$1 extends SuspendLambda implements yHO<FlowCollector<? super ArrayList<CoinQuote>>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $type;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListChildViewModel$loadData$4$1(String str, Continuation<? super GroupWatchListChildViewModel$loadData$4$1> continuation) {
        super(3, continuation);
        this.$type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super ArrayList<CoinQuote>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new GroupWatchListChildViewModel$loadData$4$1(this.$type, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("GroupWatchListChildViewModel", "flow data: " + this.$type + " end");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
