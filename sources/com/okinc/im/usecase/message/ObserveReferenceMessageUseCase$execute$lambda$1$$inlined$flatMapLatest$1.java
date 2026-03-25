package com.okinc.im.usecase.message;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35805oEi;
import o.C35818oEv;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super OKMessage>, OKMessage, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId$inlined;
    final /* synthetic */ Long $referenceMessageId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ C35818oEv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1(Continuation continuation, C35818oEv c35818oEv, String str, Long l) {
        super(3, continuation);
        this.this$0 = c35818oEv;
        this.$channelId$inlined = str;
        this.$referenceMessageId$inlined = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super OKMessage> flowCollector, OKMessage oKMessage, Continuation<? super Unit> continuation) {
        ObserveReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1 observeReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1 = new ObserveReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1(continuation, this.this$0, this.$channelId$inlined, this.$referenceMessageId$inlined);
        observeReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1.L$0 = flowCollector;
        observeReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1.L$1 = oKMessage;
        return observeReferenceMessageUseCase$execute$lambda$1$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Flow flowFlowOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            OKMessage oKMessage = (OKMessage) this.L$1;
            if (oKMessage == null) {
                C35805oEi c35805oEi = this.this$0.KWHzl;
                String str = this.$channelId$inlined;
                long jLongValue = this.$referenceMessageId$inlined.longValue();
                this.L$0 = flowCollector;
                this.label = 1;
                obj = c35805oEi.OLrzqt(str, jLongValue, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                flowFlowOf = FlowKt.flowOf(oKMessage);
                this.L$0 = null;
                this.label = 2;
                if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        flowFlowOf = FlowKt.flowOf(obj);
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, flowFlowOf, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
