package com.okinc.im.imui.group.members;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.ActivityC34260nXj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sIR;

/* JADX INFO: loaded from: classes23.dex */
public final class ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<GroupMemberInfo> $list;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;
    final /* synthetic */ ActivityC34260nXj.TaskDescription this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1(InterfaceC35180nqU interfaceC35180nqU, ActivityC34260nXj.TaskDescription taskDescription, List<GroupMemberInfo> list, Continuation<? super ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1> continuation) {
        super(1, continuation);
        this.$okimService = interfaceC35180nqU;
        this.this$0 = taskDescription;
        this.$list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1(this.$okimService, this.this$0, this.$list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sirCopydefault = this.$okimService.AEQbTJ().copydefault();
            String groupId = this.this$0.fetchVPNInfo().getGroupId();
            List<GroupMemberInfo> list = this.$list;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupMemberInfo) it.next()).getMemberId());
            }
            this.label = 1;
            if (sirCopydefault.KWHzl(groupId, arrayList, this) == objCopydefault) {
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
