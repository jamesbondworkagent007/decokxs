package com.okinc.im.imui.group.management;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C34214nVr;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupSettingsFragment$observeUiState$2 extends SuspendLambda implements Function2<GroupManagementViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34214nVr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsFragment$observeUiState$2(C34214nVr c34214nVr, Continuation<? super GroupSettingsFragment$observeUiState$2> continuation) {
        super(2, continuation);
        this.this$0 = c34214nVr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupSettingsFragment$observeUiState$2 groupSettingsFragment$observeUiState$2 = new GroupSettingsFragment$observeUiState$2(this.this$0, continuation);
        groupSettingsFragment$observeUiState$2.L$0 = obj;
        return groupSettingsFragment$observeUiState$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GroupManagementViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((GroupSettingsFragment$observeUiState$2) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupManagementViewModel.StateListAnimator stateListAnimator = (GroupManagementViewModel.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof GroupManagementViewModel.StateListAnimator.TaskDescription) {
                if (((GroupManagementViewModel.StateListAnimator.TaskDescription) stateListAnimator).KWHzl()) {
                    this.this$0.showLoading();
                } else {
                    this.this$0.dismissLoading();
                }
            } else {
                if (!(stateListAnimator instanceof GroupManagementViewModel.StateListAnimator.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.dismissLoading();
                C44157sFk.KWHzl(((GroupManagementViewModel.StateListAnimator.Activity) stateListAnimator).OLrzqt());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
