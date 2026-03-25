package com.okinc.im.imui.group.info.viewmodel;

import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C44170sFx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$addMember$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $info;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$addMember$1(GroupInfo groupInfo, GroupProfileViewModel groupProfileViewModel, Continuation<? super GroupProfileViewModel$addMember$1> continuation) {
        super(2, continuation);
        this.$info = groupInfo;
        this.this$0 = groupProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupProfileViewModel$addMember$1(this.$info, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupProfileViewModel$addMember$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        GroupProfileViewModel.ActionBar activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupUserSettingInfo userSettingInfo = this.$info.getUserSettingInfo();
            if (this.$info.getGroupCount() < this.$info.getMaxMemberCount()) {
                if (this.$info.isShowAddAffiliateMember()) {
                    activity = new GroupProfileViewModel.ActionBar.StateListAnimator(this.this$0.DbNXlk());
                } else if (this.this$0.values() && userSettingInfo != null && C44170sFx.KWHzl(userSettingInfo.getRole())) {
                    activity = new GroupProfileViewModel.ActionBar.C0420ActionBar(this.this$0.DbNXlk());
                } else {
                    activity = new GroupProfileViewModel.ActionBar.Application(this.this$0.DbNXlk());
                }
            } else {
                activity = new GroupProfileViewModel.ActionBar.Activity(this.$info.getMaxMemberCount());
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.copydefault;
            this.label = 1;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
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
