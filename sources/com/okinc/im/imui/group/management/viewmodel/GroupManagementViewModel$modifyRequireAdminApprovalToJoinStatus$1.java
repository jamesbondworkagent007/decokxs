package com.okinc.im.imui.group.management.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C35782oDm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $requiredAdminApproval;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1(GroupManagementViewModel groupManagementViewModel, String str, boolean z, Continuation<? super GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1> continuation) {
        super(1, continuation);
        this.this$0 = groupManagementViewModel;
        this.$groupId = str;
        this.$requiredAdminApproval = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1(this.this$0, this.$groupId, this.$requiredAdminApproval, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((GroupManagementViewModel$modifyRequireAdminApprovalToJoinStatus$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35782oDm c35782oDm = this.this$0.fetchVPNInfo;
            String str = this.$groupId;
            boolean z = this.$requiredAdminApproval;
            this.label = 1;
            if (c35782oDm.AYXKKw(str, z, this) == objCopydefault) {
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
