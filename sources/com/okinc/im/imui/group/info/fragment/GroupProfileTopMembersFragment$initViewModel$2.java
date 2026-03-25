package com.okinc.im.imui.group.info.fragment;

import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34154nTk;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes23.dex */
public final class GroupProfileTopMembersFragment$initViewModel$2 extends SuspendLambda implements yHO<CoroutineScope, GroupProfileViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34154nTk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileTopMembersFragment$initViewModel$2(C34154nTk c34154nTk, Continuation<? super GroupProfileTopMembersFragment$initViewModel$2> continuation) {
        super(3, continuation);
        this.this$0 = c34154nTk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupProfileViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        GroupProfileTopMembersFragment$initViewModel$2 groupProfileTopMembersFragment$initViewModel$2 = new GroupProfileTopMembersFragment$initViewModel$2(this.this$0, continuation);
        groupProfileTopMembersFragment$initViewModel$2.L$0 = actionBar;
        return groupProfileTopMembersFragment$initViewModel$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault((GroupProfileViewModel.ActionBar) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
