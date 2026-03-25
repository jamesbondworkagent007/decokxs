package com.okinc.im.imui.group.management;

import com.okinc.im.imui.group.management.viewmodel.GroupManagementViewModel;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33069mpW;
import o.C33070mpX;
import o.C34214nVr;
import o.C35399nuc;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupSettingsFragment$observeUiEvents$2 extends SuspendLambda implements Function2<GroupManagementViewModel.Activity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34214nVr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupSettingsFragment$observeUiEvents$2(C34214nVr c34214nVr, Continuation<? super GroupSettingsFragment$observeUiEvents$2> continuation) {
        super(2, continuation);
        this.this$0 = c34214nVr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupSettingsFragment$observeUiEvents$2 groupSettingsFragment$observeUiEvents$2 = new GroupSettingsFragment$observeUiEvents$2(this.this$0, continuation);
        groupSettingsFragment$observeUiEvents$2.L$0 = obj;
        return groupSettingsFragment$observeUiEvents$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GroupManagementViewModel.Activity activity, Continuation<? super Unit> continuation) {
        return ((GroupSettingsFragment$observeUiEvents$2) create(activity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupManagementViewModel.Activity activity = (GroupManagementViewModel.Activity) this.L$0;
            if (activity instanceof GroupManagementViewModel.Activity.StateListAnimator) {
                this.this$0.OLrzqt(((GroupManagementViewModel.Activity.StateListAnimator) activity).KWHzl());
            } else if (activity instanceof GroupManagementViewModel.Activity.C0437Activity) {
                this.this$0.fetchVPNInfo();
            } else if (activity instanceof GroupManagementViewModel.Activity.ActionBar) {
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QezThh), 0, 1, (Object) null);
            } else if (activity instanceof GroupManagementViewModel.Activity.TaskDescription) {
                this.this$0.KWHzl();
            } else {
                if (!(activity instanceof GroupManagementViewModel.Activity.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55326xho.toastWithSuccessfulIcon$default(C33069mpW.copydefault(this.this$0, C35399nuc.LoaderManager.NRYds, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", ((GroupManagementViewModel.Activity.Application) activity).OLrzqt()))), 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
