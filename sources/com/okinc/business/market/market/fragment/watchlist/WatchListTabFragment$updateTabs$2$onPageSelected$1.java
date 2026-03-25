package com.okinc.business.market.market.fragment.watchlist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27947kJf;
import o.C56391yDq;
import o.C56442yFn;
import o.kIY;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$updateTabs$2$onPageSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$updateTabs$2$onPageSelected$1(kIY kiy, int i, Continuation<? super WatchListTabFragment$updateTabs$2$onPageSelected$1> continuation) {
        super(2, continuation);
        this.this$0 = kiy;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$updateTabs$2$onPageSelected$1(this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$updateTabs$2$onPageSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27947kJf c27947kJfUzCIH = this.this$0.uzCIH();
            C27947kJf.TaskDescription.Activity activity = new C27947kJf.TaskDescription.Activity(this.$position, null, 2, null);
            this.label = 1;
            if (c27947kJfUzCIH.copydefault(activity, this) == objCopydefault) {
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
