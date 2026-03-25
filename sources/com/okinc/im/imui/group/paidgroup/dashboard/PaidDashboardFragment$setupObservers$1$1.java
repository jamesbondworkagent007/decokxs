package com.okinc.im.imui.group.paidgroup.dashboard;

import android.content.res.ColorStateList;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardFragment$setupObservers$1$1;
import com.okinc.im.imui.group.paidgroup.dashboard.PaidDashboardViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C33129mqd;
import o.C33909nKi;
import o.C34307nZc;
import o.C35399nuc;
import o.C52761wXj;
import o.C55113xdn;
import o.C55173xeu;
import o.C55312xha;
import o.C55320xhi;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.oHQ;
import o.pTF;
import o.rVN;
import o.wYC;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class PaidDashboardFragment$setupObservers$1$1 extends SuspendLambda implements yHO<CoroutineScope, PaidDashboardViewModel.Activity, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaidDashboardViewModel $this_with;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34307nZc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidDashboardFragment$setupObservers$1$1(C34307nZc c34307nZc, PaidDashboardViewModel paidDashboardViewModel, Continuation<? super PaidDashboardFragment$setupObservers$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c34307nZc;
        this.$this_with = paidDashboardViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, PaidDashboardViewModel.Activity activity, Continuation<? super Unit> continuation) {
        PaidDashboardFragment$setupObservers$1$1 paidDashboardFragment$setupObservers$1$1 = new PaidDashboardFragment$setupObservers$1$1(this.this$0, this.$this_with, continuation);
        paidDashboardFragment$setupObservers$1$1.L$0 = activity;
        return paidDashboardFragment$setupObservers$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55320xhi c55320xhiKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            final PaidDashboardViewModel.Activity activity = (PaidDashboardViewModel.Activity) this.L$0;
            C33909nKi c33909nKi = this.this$0.valueOf;
            if (c33909nKi == null) {
                Intrinsics.gEmmrt("");
                c33909nKi = null;
            }
            final C34307nZc c34307nZc = this.this$0;
            final PaidDashboardViewModel paidDashboardViewModel = this.$this_with;
            if (Intrinsics.EZpvd(activity, PaidDashboardViewModel.Activity.Application.OLrzqt)) {
                C55113xdn c55113xdn = c33909nKi.isConnected;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                C55113xdn.showLoading$default(c33909nKi.isConnected, 0L, 1, null);
            } else if (activity instanceof PaidDashboardViewModel.Activity.TaskDescription) {
                C55113xdn c55113xdn2 = c33909nKi.isConnected;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                c33909nKi.isConnected.copydefault();
                ConstraintLayout constraintLayout = c33909nKi.copydefault;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                C55173xeu c55173xeu = c33909nKi.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Fragment) c34307nZc, true, (String) null, 2, (Object) null);
                PaidDashboardViewModel.Activity.TaskDescription taskDescription = (PaidDashboardViewModel.Activity.TaskDescription) activity;
                c33909nKi.fetchVPNInfo.setText(C33129mqd.gEmmrt(taskDescription.AEQbTJ().getTotalAmountReceived()));
                c33909nKi.OLrzqt.setText(C33129mqd.gEmmrt(taskDescription.AEQbTJ().getCurrencySymbol()));
                c33909nKi.valueOf.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DDjgSw));
                c33909nKi.gEmmrt.setText(pTF.KWHzl.AEQbTJ(C33129mqd.gEmmrt(taskDescription.AEQbTJ().getTotalAmountReleased()) + " " + C33129mqd.gEmmrt(taskDescription.AEQbTJ().getCurrencySymbol())));
                c33909nKi.AhwBna.setText(paidDashboardViewModel.KWHzl(C35399nuc.LoaderManager.seuMaA, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(taskDescription.AEQbTJ().getAmountPayoutDays())))));
                wYC wycCopydefault = c33909nKi.KWHzl.copydefault();
                if (wycCopydefault != null) {
                    wycCopydefault.setImageTintList(ColorStateList.valueOf(ContextCompat.getColor(c34307nZc.requireContext(), C52761wXj.Activity.DCUTEIddSDPG)));
                }
                C55312xha c55312xhaValueOf = c33909nKi.KWHzl.valueOf();
                if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                    c55320xhiKWHzl.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
                    c55320xhiKWHzl.setAttachClickListener(new Function0() { // from class: o.nZg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return PaidDashboardFragment$setupObservers$1$1.invokeSuspend$lambda$4$lambda$3$lambda$2(paidDashboardViewModel, activity, c34307nZc);
                        }
                    });
                }
            } else if (Intrinsics.EZpvd(activity, PaidDashboardViewModel.Activity.StateListAnimator.EZpvd)) {
                C55113xdn c55113xdn3 = c33909nKi.isConnected;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                c33909nKi.isConnected.copydefault();
                ConstraintLayout constraintLayout2 = c33909nKi.copydefault;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
                C55173xeu c55173xeu2 = c33909nKi.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(0);
                rVN.reportFullyDrawn$default((Fragment) c34307nZc, false, (String) null, 2, (Object) null);
            } else if (activity != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3$lambda$2(PaidDashboardViewModel paidDashboardViewModel, PaidDashboardViewModel.Activity activity, C34307nZc c34307nZc) {
        oHQ ohqCopydefault = oHQ.Companion.copydefault(C33070mpX.AYXKKw(C35399nuc.LoaderManager.vqBjd), paidDashboardViewModel.KWHzl(C35399nuc.LoaderManager.gwwzsY, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(((PaidDashboardViewModel.Activity.TaskDescription) activity).AEQbTJ().getAmountPayoutDays())))));
        FragmentManager parentFragmentManager = c34307nZc.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        ohqCopydefault.show(parentFragmentManager);
        return Unit.INSTANCE;
    }
}
