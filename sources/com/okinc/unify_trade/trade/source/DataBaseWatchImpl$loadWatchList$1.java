package com.okinc.unify_trade.trade.source;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.qWJ;
import o.qWN;
import o.xPT;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$loadWatchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $loader;
    Object L$0;
    int label;
    final /* synthetic */ xPT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataBaseWatchImpl$loadWatchList$1(xPT xpt, Function1<? super Boolean, Unit> function1, Continuation<? super DataBaseWatchImpl$loadWatchList$1> continuation) {
        super(2, continuation);
        this.this$0 = xpt;
        this.$loader = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataBaseWatchImpl$loadWatchList$1(this.this$0, this.$loader, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataBaseWatchImpl$loadWatchList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        xPT xpt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xPT xpt2 = this.this$0;
                Result.Application application = Result.Companion;
                qWN qwnCopydefault = xpt2.copydefault();
                this.L$0 = xpt2;
                this.label = 1;
                Object objAEQbTJ = qwnCopydefault.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                xpt = xpt2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xpt = (xPT) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(qWJ.EZpvd((MarketUserFavorite) it.next()));
            }
            xpt.copydefault.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                xpt.AEQbTJ((WatchListData) it2.next());
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function1<Boolean, Unit> function1 = this.$loader;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            function1.invoke(C56443yFo.KWHzl(true));
        }
        Function1<Boolean, Unit> function12 = this.$loader;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            function12.invoke(C56443yFo.KWHzl(true));
        }
        return Unit.INSTANCE;
    }
}
