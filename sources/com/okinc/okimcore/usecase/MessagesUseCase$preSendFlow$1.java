package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.C44124sEe;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$preSendFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super C44502sSe.StateListAnimator.C0942StateListAnimator>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $okMessage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$preSendFlow$1(C44502sSe c44502sSe, OKMessage oKMessage, Continuation<? super MessagesUseCase$preSendFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$okMessage = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessagesUseCase$preSendFlow$1 messagesUseCase$preSendFlow$1 = new MessagesUseCase$preSendFlow$1(this.this$0, this.$okMessage, continuation);
        messagesUseCase$preSendFlow$1.L$0 = obj;
        return messagesUseCase$preSendFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super C44502sSe.StateListAnimator.C0942StateListAnimator> flowCollector, Continuation<? super Unit> continuation) {
        return ((MessagesUseCase$preSendFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C44502sSe c44502sSe = this.this$0;
            OKMessage oKMessage = this.$okMessage;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = c44502sSe.EZpvd(oKMessage, this);
            if (obj == objCopydefault) {
                return objCopydefault;
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
        C44502sSe.StateListAnimator.C0942StateListAnimator c0942StateListAnimator = (C44502sSe.StateListAnimator.C0942StateListAnimator) obj;
        InHouseIMMessageEntity inHouseIMMessageEntityOLrzqt = c0942StateListAnimator.OLrzqt();
        C44124sEe.imLogSync$default("send message => notified pending message[" + inHouseIMMessageEntityOLrzqt.getSeq() + "]: sending", null, inHouseIMMessageEntityOLrzqt.getChannelId(), 2, null);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(c0942StateListAnimator, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
