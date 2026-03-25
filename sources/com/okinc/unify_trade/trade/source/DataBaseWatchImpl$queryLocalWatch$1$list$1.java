package com.okinc.unify_trade.trade.source;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.qWJ;
import o.qWN;
import o.xPT;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$queryLocalWatch$1$list$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchListData>>, Object> {
    int label;
    final /* synthetic */ xPT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBaseWatchImpl$queryLocalWatch$1$list$1(xPT xpt, Continuation<? super DataBaseWatchImpl$queryLocalWatch$1$list$1> continuation) {
        super(2, continuation);
        this.this$0 = xpt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataBaseWatchImpl$queryLocalWatch$1$list$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchListData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<WatchListData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<WatchListData>> continuation) {
        return ((DataBaseWatchImpl$queryLocalWatch$1$list$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                xPT xpt = this.this$0;
                Result.Application application = Result.Companion;
                qWN qwnCopydefault = xpt.copydefault();
                this.label = 1;
                obj = qwnCopydefault.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(qWJ.EZpvd((MarketUserFavorite) it.next()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? yDY.AhwBna() : objM7377constructorimpl;
    }
}
