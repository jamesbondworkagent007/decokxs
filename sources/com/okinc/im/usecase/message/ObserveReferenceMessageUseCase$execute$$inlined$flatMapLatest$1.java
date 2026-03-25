package com.okinc.im.usecase.message;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35818oEv;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super OKMessage>, Long, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C35818oEv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1(Continuation continuation, C35818oEv c35818oEv, String str) {
        super(3, continuation);
        this.this$0 = c35818oEv;
        this.$channelId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super OKMessage> flowCollector, Long l, Continuation<? super Unit> continuation) {
        ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1 observeReferenceMessageUseCase$execute$$inlined$flatMapLatest$1 = new ObserveReferenceMessageUseCase$execute$$inlined$flatMapLatest$1(continuation, this.this$0, this.$channelId$inlined);
        observeReferenceMessageUseCase$execute$$inlined$flatMapLatest$1.L$0 = flowCollector;
        observeReferenceMessageUseCase$execute$$inlined$flatMapLatest$1.L$1 = l;
        return observeReferenceMessageUseCase$execute$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow flowTransformLatest;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Long l = (Long) this.L$1;
            if (l == null) {
                flowTransformLatest = FlowKt.flowOf((Object) null);
            } else {
                flowTransformLatest = FlowKt.transformLatest(this.this$0.EZpvd.EZpvd(this.$channelId$inlined, l.longValue()), new ObserveReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1(null, this.this$0, this.$channelId$inlined, l));
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowTransformLatest, this) == objCopydefault) {
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
