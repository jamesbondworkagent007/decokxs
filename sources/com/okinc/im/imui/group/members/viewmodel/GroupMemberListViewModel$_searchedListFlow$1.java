package com.okinc.im.imui.group.members.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C34282nYe;
import o.C56391yDq;
import o.C56442yFn;
import o.oDQ;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$_searchedListFlow$1 extends SuspendLambda implements yHO<List<? extends C34282nYe>, String, Continuation<? super List<? extends C34282nYe>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$_searchedListFlow$1(GroupMemberListViewModel groupMemberListViewModel, Continuation<? super GroupMemberListViewModel$_searchedListFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = groupMemberListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(List<? extends C34282nYe> list, String str, Continuation<? super List<? extends C34282nYe>> continuation) {
        return invoke2((List<C34282nYe>) list, str, (Continuation<? super List<C34282nYe>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<C34282nYe> list, String str, Continuation<? super List<C34282nYe>> continuation) {
        GroupMemberListViewModel$_searchedListFlow$1 groupMemberListViewModel$_searchedListFlow$1 = new GroupMemberListViewModel$_searchedListFlow$1(this.this$0, continuation);
        groupMemberListViewModel$_searchedListFlow$1.L$0 = list;
        groupMemberListViewModel$_searchedListFlow$1.L$1 = str;
        return groupMemberListViewModel$_searchedListFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            String str = (String) this.L$1;
            GroupMemberListViewModel groupMemberListViewModel = this.this$0;
            return groupMemberListViewModel.EZpvd((List<C34282nYe>) oDQ.OLrzqt(list, str, groupMemberListViewModel.AhwBna()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
