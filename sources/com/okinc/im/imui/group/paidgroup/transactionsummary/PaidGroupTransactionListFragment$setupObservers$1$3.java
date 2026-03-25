package com.okinc.im.imui.group.paidgroup.transactionsummary;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListFragment$setupObservers$1$3;
import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33913nKm;
import o.C33070mpX;
import o.C35399nuc;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nZF;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class PaidGroupTransactionListFragment$setupObservers$1$3 extends SuspendLambda implements yHO<CoroutineScope, PaidGroupTransactionListViewModel.Application, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nZF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidGroupTransactionListFragment$setupObservers$1$3(nZF nzf, Continuation<? super PaidGroupTransactionListFragment$setupObservers$1$3> continuation) {
        super(3, continuation);
        this.this$0 = nzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, PaidGroupTransactionListViewModel.Application application, Continuation<? super Unit> continuation) {
        PaidGroupTransactionListFragment$setupObservers$1$3 paidGroupTransactionListFragment$setupObservers$1$3 = new PaidGroupTransactionListFragment$setupObservers$1$3(this.this$0, continuation);
        paidGroupTransactionListFragment$setupObservers$1$3.L$0 = application;
        return paidGroupTransactionListFragment$setupObservers$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PaidGroupTransactionListViewModel.Application application = (PaidGroupTransactionListViewModel.Application) this.L$0;
            AbstractC33913nKm abstractC33913nKm = this.this$0.gEmmrt;
            if (abstractC33913nKm == null) {
                Intrinsics.gEmmrt("");
                abstractC33913nKm = null;
            }
            final nZF nzf = this.this$0;
            if (Intrinsics.EZpvd(application, PaidGroupTransactionListViewModel.Application.TaskDescription.copydefault)) {
                C55113xdn c55113xdn = abstractC33913nKm.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                C55113xdn.showLoading$default(abstractC33913nKm.copydefault, 0L, 1, null);
            } else if (Intrinsics.EZpvd(application, PaidGroupTransactionListViewModel.Application.C0449Application.AEQbTJ)) {
                C55113xdn c55113xdn2 = abstractC33913nKm.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                abstractC33913nKm.copydefault.copydefault();
                RecyclerView recyclerView = abstractC33913nKm.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(0);
                C55173xeu c55173xeu = abstractC33913nKm.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Fragment) nzf, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(application, PaidGroupTransactionListViewModel.Application.ActionBar.KWHzl)) {
                C55113xdn c55113xdn3 = abstractC33913nKm.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                abstractC33913nKm.copydefault.copydefault();
                RecyclerView recyclerView2 = abstractC33913nKm.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(8);
                C55173xeu c55173xeu2 = abstractC33913nKm.EZpvd;
                Intrinsics.copydefault(c55173xeu2);
                c55173xeu2.setVisibility(0);
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gdmIOq));
                c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.Th));
                String string = nzf.getString(C35399nuc.LoaderManager.fXYAwm);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu2.setRetry(string);
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.nZG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        PaidGroupTransactionListFragment$setupObservers$1$3.invokeSuspend$lambda$3$lambda$1$lambda$0(nzf, view);
                    }
                });
                rVN.reportFullyDrawn$default((Fragment) nzf, false, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(application, PaidGroupTransactionListViewModel.Application.StateListAnimator.KWHzl)) {
                C55113xdn c55113xdn4 = abstractC33913nKm.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                c55113xdn4.setVisibility(8);
                abstractC33913nKm.copydefault.copydefault();
                RecyclerView recyclerView3 = abstractC33913nKm.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                recyclerView3.setVisibility(8);
                C55173xeu c55173xeu3 = abstractC33913nKm.EZpvd;
                Intrinsics.copydefault(c55173xeu3);
                c55173xeu3.setVisibility(0);
                c55173xeu3.setEmptyTypeImage(6);
                c55173xeu3.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OeawrH));
                c55173xeu3.setSubTitle((CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.OeZisf));
                c55173xeu3.setRetry("");
                rVN.reportFullyDrawn$default((Fragment) nzf, true, (String) null, 2, (Object) null);
            } else if (application != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$1$lambda$0(nZF nzf, View view) {
        nzf.AYXKKw().OLrzqt();
    }
}
