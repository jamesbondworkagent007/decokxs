package com.okinc.im.imui.group.info;

import androidx.core.widget.NestedScrollView;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33872nIz;
import o.C44157sFk;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nSR;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupProfileActivityV2$collectUiStates$1 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nSR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileActivityV2$collectUiStates$1(nSR nsr, Continuation<? super GroupProfileActivityV2$collectUiStates$1> continuation) {
        super(3, continuation);
        this.this$0 = nsr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        GroupProfileActivityV2$collectUiStates$1 groupProfileActivityV2$collectUiStates$1 = new GroupProfileActivityV2$collectUiStates$1(this.this$0, continuation);
        groupProfileActivityV2$collectUiStates$1.L$0 = taskDescription;
        return groupProfileActivityV2$collectUiStates$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v17, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupProfileViewModel.TaskDescription taskDescription = (GroupProfileViewModel.TaskDescription) this.L$0;
            if (taskDescription instanceof GroupProfileViewModel.TaskDescription.StateListAnimator) {
                AbstractC33872nIz abstractC33872nIz = (AbstractC33872nIz) this.this$0.KWHzl();
                C55113xdn c55113xdn = abstractC33872nIz.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                C55173xeu c55173xeu = abstractC33872nIz.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                NestedScrollView nestedScrollView = abstractC33872nIz.djBIcL;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                nestedScrollView.setVisibility(8);
            } else if (taskDescription instanceof GroupProfileViewModel.TaskDescription.ActionBar) {
                AbstractC33872nIz abstractC33872nIz2 = (AbstractC33872nIz) this.this$0.KWHzl();
                NestedScrollView nestedScrollView2 = abstractC33872nIz2.djBIcL;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
                nestedScrollView2.setVisibility(0);
                C55113xdn c55113xdn2 = abstractC33872nIz2.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                C55173xeu c55173xeu2 = abstractC33872nIz2.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(8);
                this.this$0.EZpvd(((GroupProfileViewModel.TaskDescription.ActionBar) taskDescription).KWHzl());
            } else {
                if (!(taskDescription instanceof GroupProfileViewModel.TaskDescription.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC33872nIz abstractC33872nIz3 = (AbstractC33872nIz) this.this$0.KWHzl();
                C55173xeu c55173xeu3 = abstractC33872nIz3.gEmmrt;
                String strCopydefault = C44157sFk.copydefault(((GroupProfileViewModel.TaskDescription.Activity) taskDescription).AEQbTJ());
                if (strCopydefault == null) {
                    strCopydefault = "";
                }
                c55173xeu3.setSubTitle((CharSequence) strCopydefault);
                C55173xeu c55173xeu4 = abstractC33872nIz3.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                c55173xeu4.setVisibility(0);
                C55113xdn c55113xdn3 = abstractC33872nIz3.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                NestedScrollView nestedScrollView3 = abstractC33872nIz3.djBIcL;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "");
                nestedScrollView3.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
