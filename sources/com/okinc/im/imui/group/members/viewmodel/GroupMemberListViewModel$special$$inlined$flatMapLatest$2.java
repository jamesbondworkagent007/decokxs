package com.okinc.im.imui.group.members.viewmodel;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupMemberListViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements yHO<FlowCollector<? super GroupInfo>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupMemberListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMemberListViewModel$special$$inlined$flatMapLatest$2(Continuation continuation, GroupMemberListViewModel groupMemberListViewModel) {
        super(3, continuation);
        this.this$0 = groupMemberListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super GroupInfo> flowCollector, String str, Continuation<? super Unit> continuation) {
        GroupMemberListViewModel$special$$inlined$flatMapLatest$2 groupMemberListViewModel$special$$inlined$flatMapLatest$2 = new GroupMemberListViewModel$special$$inlined$flatMapLatest$2(continuation, this.this$0);
        groupMemberListViewModel$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        groupMemberListViewModel$special$$inlined$flatMapLatest$2.L$1 = str;
        return groupMemberListViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow<GroupInfo> flowAEQbTJ = this.this$0.AkhnZx.AEQbTJ((String) this.L$1);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowAEQbTJ, this) == objCopydefault) {
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
