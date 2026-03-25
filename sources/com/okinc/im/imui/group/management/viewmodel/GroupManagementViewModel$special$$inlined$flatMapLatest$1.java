package com.okinc.im.imui.group.management.viewmodel;

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
public final class GroupManagementViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super GroupInfo>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupManagementViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupManagementViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, GroupManagementViewModel groupManagementViewModel) {
        super(3, continuation);
        this.this$0 = groupManagementViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super GroupInfo> flowCollector, String str, Continuation<? super Unit> continuation) {
        GroupManagementViewModel$special$$inlined$flatMapLatest$1 groupManagementViewModel$special$$inlined$flatMapLatest$1 = new GroupManagementViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        groupManagementViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        groupManagementViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return groupManagementViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowMerge = FlowKt.merge(this.this$0.gEmmrt.AEQbTJ((String) this.L$1), this.this$0.EZpvd);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowMerge, this) == objCopydefault) {
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
