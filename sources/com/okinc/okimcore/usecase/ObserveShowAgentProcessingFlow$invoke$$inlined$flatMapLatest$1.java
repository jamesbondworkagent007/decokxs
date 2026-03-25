package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ObserveShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements yHO<FlowCollector<? super ObserveShowAgentProcessingFlow.AgentProcessingState>, InHouseIMMessageEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ObserveShowAgentProcessingFlow this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1(Continuation continuation, ObserveShowAgentProcessingFlow observeShowAgentProcessingFlow, String str) {
        super(3, continuation);
        this.this$0 = observeShowAgentProcessingFlow;
        this.$channelId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(@NotNull FlowCollector<? super ObserveShowAgentProcessingFlow.AgentProcessingState> flowCollector, InHouseIMMessageEntity inHouseIMMessageEntity, Continuation<? super Unit> continuation) {
        ObserveShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1 observeShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1 = new ObserveShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1(continuation, this.this$0, this.$channelId$inlined);
        observeShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1.L$0 = flowCollector;
        observeShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1.L$1 = inHouseIMMessageEntity;
        return observeShowAgentProcessingFlow$invoke$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Flow flowCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) this.L$1;
            pUU.KWHzl("ObserveShowAgentProcessingFlow", "Receive last visible msg update: seq=" + (inHouseIMMessageEntity != null ? C56443yFo.KWHzl(inHouseIMMessageEntity.getSeq()) : null));
            boolean zEZpvd = Intrinsics.EZpvd((Object) (inHouseIMMessageEntity != null ? inHouseIMMessageEntity.getSenderUid() : null), (Object) C44157sFk.EZpvd());
            if (zEZpvd && inHouseIMMessageEntity.getSentStatus() == 1) {
                this.this$0.copydefault("SENDING - message being sent");
                flowCopydefault = FlowKt.flowOf(ObserveShowAgentProcessingFlow.AgentProcessingState.SENDING);
            } else if (!zEZpvd || inHouseIMMessageEntity.getSentStatus() != 2) {
                flowCopydefault = this.this$0.copydefault(this.$channelId$inlined, inHouseIMMessageEntity != null ? inHouseIMMessageEntity.getSeq() : -1L, zEZpvd, inHouseIMMessageEntity);
            } else {
                this.this$0.copydefault("IDLE - message failed");
                flowCopydefault = FlowKt.flowOf(ObserveShowAgentProcessingFlow.AgentProcessingState.IDLE);
            }
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowCopydefault, this) == objCopydefault) {
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
