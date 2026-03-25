package com.okinc.im.imui.group.paidgroup.transactionsummary;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33913nKm;
import o.C56391yDq;
import o.C56442yFn;
import o.nZF;
import o.nZI;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class PaidGroupTransactionListFragment$setupObservers$1$4 extends SuspendLambda implements yHO<CoroutineScope, PaidGroupTransactionListViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nZF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListFragment$setupObservers$1$4(nZF nzf, Continuation<? super PaidGroupTransactionListFragment$setupObservers$1$4> continuation) {
        super(3, continuation);
        this.this$0 = nzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, PaidGroupTransactionListViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        PaidGroupTransactionListFragment$setupObservers$1$4 paidGroupTransactionListFragment$setupObservers$1$4 = new PaidGroupTransactionListFragment$setupObservers$1$4(this.this$0, continuation);
        paidGroupTransactionListFragment$setupObservers$1$4.L$0 = stateListAnimator;
        return paidGroupTransactionListFragment$setupObservers$1$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PaidGroupTransactionListViewModel.StateListAnimator stateListAnimator = (PaidGroupTransactionListViewModel.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof PaidGroupTransactionListViewModel.StateListAnimator.TaskDescription) {
                nZI nziGEmmrt = this.this$0.gEmmrt();
                AbstractC33913nKm abstractC33913nKm = this.this$0.gEmmrt;
                if (abstractC33913nKm == null) {
                    Intrinsics.gEmmrt("");
                    abstractC33913nKm = null;
                }
                RecyclerView recyclerView = abstractC33913nKm.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                nziGEmmrt.EZpvd(recyclerView, ((PaidGroupTransactionListViewModel.StateListAnimator.TaskDescription) stateListAnimator).OLrzqt());
                return Unit.INSTANCE;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
