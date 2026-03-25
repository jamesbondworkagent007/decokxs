package com.okinc.okapm.okqpl.reporter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C42540rWq;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super Long>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ C42540rWq $entity$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, OkQPLReporter okQPLReporter, C42540rWq c42540rWq) {
        super(3, continuation);
        this.this$0 = okQPLReporter;
        this.$entity$inlined = c42540rWq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull FlowCollector<? super Long> flowCollector, Boolean bool, Continuation<? super Unit> continuation) {
        OkQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1 okQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1 = new OkQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0, this.$entity$inlined);
        okQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        okQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = bool;
        return okQPLReporter$report$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ((Boolean) this.L$1).booleanValue();
            Flow<Long> flowOLrzqt = this.this$0.gEmmrt.OLrzqt(this.$entity$inlined);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowOLrzqt, this) == objCopydefault) {
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
