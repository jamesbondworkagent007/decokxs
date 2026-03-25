package com.okinc.business.market.market.fragment.watchlist;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27931kIq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListQuoteFragment$getLastVisibleItemView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecyclerView $this_getLastVisibleItemView;
    int label;
    final /* synthetic */ C27931kIq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListQuoteFragment$getLastVisibleItemView$2(C27931kIq c27931kIq, RecyclerView recyclerView, Continuation<? super GroupWatchListQuoteFragment$getLastVisibleItemView$2> continuation) {
        super(2, continuation);
        this.this$0 = c27931kIq;
        this.$this_getLastVisibleItemView = recyclerView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListQuoteFragment$getLastVisibleItemView$2(this.this$0, this.$this_getLastVisibleItemView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListQuoteFragment$getLastVisibleItemView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27931kIq c27931kIq = this.this$0;
            RecyclerView recyclerView = this.$this_getLastVisibleItemView;
            this.label = 1;
            if (c27931kIq.copydefault(recyclerView, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
