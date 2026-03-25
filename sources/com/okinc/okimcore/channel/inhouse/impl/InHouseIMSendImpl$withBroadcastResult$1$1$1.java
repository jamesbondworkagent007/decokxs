package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44289sKh;

/* JADX INFO: loaded from: classes19.dex */
public final class InHouseIMSendImpl$withBroadcastResult$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC44289sKh $callback;
    final /* synthetic */ OKMessage $okMessage;
    final /* synthetic */ C44502sSe.StateListAnimator $result;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMSendImpl$withBroadcastResult$1$1$1(InterfaceC44289sKh interfaceC44289sKh, OKMessage oKMessage, C44502sSe.StateListAnimator stateListAnimator, Continuation<? super InHouseIMSendImpl$withBroadcastResult$1$1$1> continuation) {
        super(2, continuation);
        this.$callback = interfaceC44289sKh;
        this.$okMessage = oKMessage;
        this.$result = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InHouseIMSendImpl$withBroadcastResult$1$1$1(this.$callback, this.$okMessage, this.$result, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMSendImpl$withBroadcastResult$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$callback.OLrzqt(this.$okMessage, ((C44502sSe.StateListAnimator.TaskDescription) this.$result).EZpvd());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
