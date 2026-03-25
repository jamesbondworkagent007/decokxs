package com.okinc.business.market.home.favorites.viewmodel;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.qWH;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavChildViewModel$loadData$4$2 extends SuspendLambda implements yHT<FlowCollector<? super List<? extends qWH>>, Throwable, Long, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $type;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavChildViewModel$loadData$4$2(String str, Continuation<? super MarketFavChildViewModel$loadData$4$2> continuation) {
        super(4, continuation);
        this.$type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(FlowCollector<? super List<? extends qWH>> flowCollector, Throwable th, Long l, Continuation<? super Boolean> continuation) {
        return invoke(flowCollector, th, l.longValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(FlowCollector<? super List<? extends qWH>> flowCollector, Throwable th, long j, Continuation<? super Boolean> continuation) {
        MarketFavChildViewModel$loadData$4$2 marketFavChildViewModel$loadData$4$2 = new MarketFavChildViewModel$loadData$4$2(this.$type, continuation);
        marketFavChildViewModel$loadData$4$2.L$0 = th;
        marketFavChildViewModel$loadData$4$2.J$0 = j;
        return marketFavChildViewModel$loadData$4$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            th = (Throwable) this.L$0;
            long j2 = this.J$0;
            pUU.AEQbTJ("MarketFavChildViewModel", "loadData: retrying due to error, type=" + this.$type + ", attempt=" + j2, th);
            this.L$0 = th;
            this.J$0 = j2;
            this.label = 1;
            if (DelayKt.delay(3000L, this) == objCopydefault) {
                return objCopydefault;
            }
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            th = (Throwable) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(!(th instanceof CancellationException) && j < 5);
    }
}
