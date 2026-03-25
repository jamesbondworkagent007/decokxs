package com.okinc.im.imui.selectgroupvoicecallmember.viewmodel;

import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.MultiSelectGroupCallMemberViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C34282nYe;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends C34282nYe>>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MultiSelectGroupCallMemberViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2(Continuation continuation, MultiSelectGroupCallMemberViewModel multiSelectGroupCallMemberViewModel) {
        super(3, continuation);
        this.this$0 = multiSelectGroupCallMemberViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super List<? extends C34282nYe>> flowCollector, String str, Continuation<? super Unit> continuation) {
        MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2 multiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2 = new MultiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2(continuation, this.this$0);
        multiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        multiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2.L$1 = str;
        return multiSelectGroupCallMemberViewModel$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            MultiSelectGroupCallMemberViewModel.Application application = new MultiSelectGroupCallMemberViewModel.Application(this.this$0.isConnected.KWHzl((String) this.L$1));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, application, this) == objCopydefault) {
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
