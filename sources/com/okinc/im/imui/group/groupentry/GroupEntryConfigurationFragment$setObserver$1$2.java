package com.okinc.im.imui.group.groupentry;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.okinc.im.imui.group.groupentry.GroupEntryConfigurationViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34141nSy;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nJF;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupEntryConfigurationFragment$setObserver$1$2 extends SuspendLambda implements yHO<CoroutineScope, GroupEntryConfigurationViewModel.Fragment, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34141nSy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationFragment$setObserver$1$2(C34141nSy c34141nSy, Continuation<? super GroupEntryConfigurationFragment$setObserver$1$2> continuation) {
        super(3, continuation);
        this.this$0 = c34141nSy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupEntryConfigurationViewModel.Fragment fragment, Continuation<? super Unit> continuation) {
        GroupEntryConfigurationFragment$setObserver$1$2 groupEntryConfigurationFragment$setObserver$1$2 = new GroupEntryConfigurationFragment$setObserver$1$2(this.this$0, continuation);
        groupEntryConfigurationFragment$setObserver$1$2.L$0 = fragment;
        return groupEntryConfigurationFragment$setObserver$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupEntryConfigurationViewModel.Fragment fragment = (GroupEntryConfigurationViewModel.Fragment) this.L$0;
            nJF njf = this.this$0.KWHzl;
            if (njf == null) {
                Intrinsics.gEmmrt("");
                njf = null;
            }
            C34141nSy c34141nSy = this.this$0;
            if (Intrinsics.EZpvd(fragment, GroupEntryConfigurationViewModel.Fragment.Application.copydefault)) {
                C55113xdn c55113xdn = njf.AuCTel;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
            } else if (Intrinsics.EZpvd(fragment, GroupEntryConfigurationViewModel.Fragment.StateListAnimator.copydefault)) {
                C55113xdn c55113xdn2 = njf.AuCTel;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                ConstraintLayout constraintLayout = njf.copydefault;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                C55173xeu c55173xeu = njf.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Fragment) c34141nSy, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(fragment, GroupEntryConfigurationViewModel.Fragment.Activity.copydefault)) {
                C55113xdn c55113xdn3 = njf.AuCTel;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                ConstraintLayout constraintLayout2 = njf.copydefault;
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
                constraintLayout2.setVisibility(8);
                C55173xeu c55173xeu2 = njf.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(0);
                rVN.reportFullyDrawn$default((Fragment) c34141nSy, false, (String) null, 2, (Object) null);
            } else if (fragment != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
