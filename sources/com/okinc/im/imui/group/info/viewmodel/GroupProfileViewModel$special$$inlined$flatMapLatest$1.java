package com.okinc.im.imui.group.info.viewmodel;

import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C36553odD;
import o.C36554odE;
import o.C56391yDq;
import o.C56442yFn;
import o.oDF;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD>>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$special$$inlined$flatMapLatest$1(Continuation continuation, GroupProfileViewModel groupProfileViewModel) {
        super(3, continuation);
        this.this$0 = groupProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super Triple<? extends oDF.StateListAnimator, ? extends C36554odE, ? extends C36553odD>> flowCollector, String str, Continuation<? super Unit> continuation) {
        GroupProfileViewModel$special$$inlined$flatMapLatest$1 groupProfileViewModel$special$$inlined$flatMapLatest$1 = new GroupProfileViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        groupProfileViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        groupProfileViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return groupProfileViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            String str = (String) this.L$1;
            Flow flowCombine = FlowKt.combine(this.this$0.fJNWhG.AEQbTJ(str), this.this$0.ejfBZ.copydefault(str), this.this$0.fIwbmz.OLrzqt(str), new GroupProfileViewModel$uiState$1$1(null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCombine, this) == objCopydefault) {
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
