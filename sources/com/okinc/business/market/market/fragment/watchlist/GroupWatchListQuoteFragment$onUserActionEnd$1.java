package com.okinc.business.market.market.fragment.watchlist;

import com.okinc.business.market.bean.CoinQuote;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27931kIq;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$onUserActionEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<?> $data;
    int label;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$onUserActionEnd$1(C27931kIq c27931kIq, List<?> list, Continuation<? super GroupWatchListQuoteFragment$onUserActionEnd$1> continuation) {
        super(2, continuation);
        this.this$0 = c27931kIq;
        this.$data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListQuoteFragment$onUserActionEnd$1(this.this$0, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListQuoteFragment$onUserActionEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ArrayList arrayList;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                List<?> list = this.$data;
                C27931kIq c27931kIq = this.this$0;
                Result.Application application = Result.Companion;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof CoinQuote) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                c27931kIq.getTAG();
                Objects.toString(arrayList != null ? C56443yFo.AEQbTJ(arrayList.size()) : null);
                GroupWatchListChildViewModel groupWatchListChildViewModelAYXKKw = c27931kIq.AYXKKw();
                String strValueOf = c27931kIq.valueOf();
                this.label = 1;
                if (groupWatchListChildViewModelAYXKKw.EZpvd(arrayList, strValueOf, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        this.this$0.OLrzqt(false);
        return Unit.INSTANCE;
    }
}
