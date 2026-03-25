package com.okinc.unify_trade.trade.source;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.qWN;
import o.xPT;

/* JADX INFO: loaded from: classes12.dex */
public final class DataBaseWatchImpl$replaceWatchListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Result<Unit>, Unit> $result;
    final /* synthetic */ List<WatchListData> $watchData;
    int label;
    final /* synthetic */ xPT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<kotlin.Unit>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataBaseWatchImpl$replaceWatchListData$1(xPT xpt, List<WatchListData> list, Function1<? super Result<Unit>, Unit> function1, Continuation<? super DataBaseWatchImpl$replaceWatchListData$1> continuation) {
        super(2, continuation);
        this.this$0 = xpt;
        this.$watchData = list;
        this.$result = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataBaseWatchImpl$replaceWatchListData$1(this.this$0, this.$watchData, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataBaseWatchImpl$replaceWatchListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                List<WatchListData> list = this.$watchData;
                Result.Application application = Result.Companion;
                qWN qwnCopydefault = xpt.copydefault();
                this.label = 1;
                if (qwnCopydefault.AEQbTJ(list, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function1<Result<Unit>, Unit> function1 = this.$result;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Result.Application application3 = Result.Companion;
            function1.invoke(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE)));
        }
        Function1<Result<Unit>, Unit> function12 = this.$result;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application4 = Result.Companion;
            function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl))));
        }
        return Unit.INSTANCE;
    }
}
