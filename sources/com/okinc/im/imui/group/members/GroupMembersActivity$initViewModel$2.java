package com.okinc.im.imui.group.members;

import android.widget.ImageView;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33869nIw;
import o.C56391yDq;
import o.C56442yFn;
import o.nWQ;
import o.pUU;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupMembersActivity$initViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, GroupInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nWQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMembersActivity$initViewModel$2(nWQ nwq, Continuation<? super GroupMembersActivity$initViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = nwq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupInfo groupInfo, Continuation<? super Unit> continuation) {
        GroupMembersActivity$initViewModel$2 groupMembersActivity$initViewModel$2 = new GroupMembersActivity$initViewModel$2(this.this$0, continuation);
        groupMembersActivity$initViewModel$2.L$0 = groupInfo;
        return groupMembersActivity$initViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo = (GroupInfo) this.L$0;
            pUU.EZpvd(this.this$0.getTAG(), "Group Info: " + groupInfo);
            ImageView imageView = ((AbstractC33869nIw) this.this$0.KWHzl()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(groupInfo.isAllowRemoveMember() ? 0 : 8);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
