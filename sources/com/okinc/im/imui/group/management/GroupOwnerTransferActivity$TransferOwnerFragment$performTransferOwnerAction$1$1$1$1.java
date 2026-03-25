package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sIR;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $groupInfo;
    final /* synthetic */ GroupMemberInfo $memberInfo;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1(InterfaceC35180nqU interfaceC35180nqU, GroupInfo groupInfo, GroupMemberInfo groupMemberInfo, Continuation<? super GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1> continuation) {
        super(2, continuation);
        this.$okimService = interfaceC35180nqU;
        this.$groupInfo = groupInfo;
        this.$memberInfo = groupMemberInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1(this.$okimService, this.$groupInfo, this.$memberInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sirCopydefault = this.$okimService.AEQbTJ().copydefault();
            String groupId = this.$groupInfo.getGroupId();
            String memberId = this.$memberInfo.getMemberId();
            this.label = 1;
            if (sirCopydefault.valueOf(groupId, memberId, this) == objCopydefault) {
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
