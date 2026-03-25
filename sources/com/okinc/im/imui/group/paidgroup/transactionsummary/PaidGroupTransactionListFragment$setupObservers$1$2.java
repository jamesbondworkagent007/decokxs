package com.okinc.im.imui.group.paidgroup.transactionsummary;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33913nKm;
import o.C56391yDq;
import o.C56442yFn;
import o.nZF;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class PaidGroupTransactionListFragment$setupObservers$1$2 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ nZF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListFragment$setupObservers$1$2(nZF nzf, Continuation<? super PaidGroupTransactionListFragment$setupObservers$1$2> continuation) {
        super(3, continuation);
        this.this$0 = nzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(coroutineScope, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(CoroutineScope coroutineScope, boolean z, Continuation<? super Unit> continuation) {
        PaidGroupTransactionListFragment$setupObservers$1$2 paidGroupTransactionListFragment$setupObservers$1$2 = new PaidGroupTransactionListFragment$setupObservers$1$2(this.this$0, continuation);
        paidGroupTransactionListFragment$setupObservers$1$2.Z$0 = z;
        return paidGroupTransactionListFragment$setupObservers$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            AbstractC33913nKm abstractC33913nKm = this.this$0.gEmmrt;
            if (abstractC33913nKm == null) {
                Intrinsics.gEmmrt("");
                abstractC33913nKm = null;
            }
            abstractC33913nKm.KWHzl.AhwBna(z);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
