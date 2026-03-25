package com.okinc.im.imui.group.management;

import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.nVU;
import o.sIR;

/* JADX INFO: loaded from: classes18.dex */
public final class ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<GroupMemberInfo> $list;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;
    final /* synthetic */ nVU.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1(InterfaceC35180nqU interfaceC35180nqU, nVU.StateListAnimator stateListAnimator, List<GroupMemberInfo> list, Continuation<? super ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1> continuation) {
        super(2, continuation);
        this.$okimService = interfaceC35180nqU;
        this.this$0 = stateListAnimator;
        this.$list = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1(this.$okimService, this.this$0, this.$list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sirCopydefault = this.$okimService.AEQbTJ().copydefault();
            String groupId = this.this$0.getNewProxyInstance().getGroupId();
            List<GroupMemberInfo> list = this.$list;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((GroupMemberInfo) it.next()).getMemberId());
            }
            this.label = 1;
            if (sirCopydefault.AEQbTJ(groupId, arrayList, this) == objCopydefault) {
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
