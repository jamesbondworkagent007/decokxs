package com.okinc.business.defi.wallet.ui.autoscrollingrvs;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C19611gIu;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoScrollingRecyclerView$startCoroutine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C19611gIu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollingRecyclerView$startCoroutine$1(C19611gIu c19611gIu, Continuation<? super AutoScrollingRecyclerView$startCoroutine$1> continuation) {
        super(2, continuation);
        this.this$0 = c19611gIu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoScrollingRecyclerView$startCoroutine$1 autoScrollingRecyclerView$startCoroutine$1 = new AutoScrollingRecyclerView$startCoroutine$1(this.this$0, continuation);
        autoScrollingRecyclerView$startCoroutine$1.L$0 = obj;
        return autoScrollingRecyclerView$startCoroutine$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoScrollingRecyclerView$startCoroutine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            if (this.this$0.getScrollState() == 0) {
                C19611gIu c19611gIu = this.this$0;
                c19611gIu.AEQbTJ(c19611gIu.copydefault);
            }
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(200L, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
