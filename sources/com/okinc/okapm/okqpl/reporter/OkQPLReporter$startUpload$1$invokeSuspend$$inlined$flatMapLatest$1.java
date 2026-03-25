package com.okinc.okapm.okqpl.reporter;

import java.util.List;
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

/* JADX INFO: loaded from: classes23.dex */
public final class OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super List<? extends C42540rWq>>, List<? extends C42540rWq>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OkQPLReporter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, OkQPLReporter okQPLReporter) {
        super(3, continuation);
        this.this$0 = okQPLReporter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull FlowCollector<? super List<? extends C42540rWq>> flowCollector, List<? extends C42540rWq> list, Continuation<? super Unit> continuation) {
        OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1 okQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1 = new OkQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        okQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        okQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = list;
        return okQPLReporter$startUpload$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flowEZpvd = this.this$0.EZpvd((List<C42540rWq>) this.L$1);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowEZpvd, this) == objCopydefault) {
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
