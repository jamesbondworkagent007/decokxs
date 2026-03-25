package com.okinc.im.impl;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class InhouseIMAudioCallMessageSender$sendCallMessage$2 extends SuspendLambda implements Function2<C44502sSe.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InhouseIMAudioCallMessageSender$sendCallMessage$2(Continuation<? super InhouseIMAudioCallMessageSender$sendCallMessage$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InhouseIMAudioCallMessageSender$sendCallMessage$2 inhouseIMAudioCallMessageSender$sendCallMessage$2 = new InhouseIMAudioCallMessageSender$sendCallMessage$2(continuation);
        inhouseIMAudioCallMessageSender$sendCallMessage$2.L$0 = obj;
        return inhouseIMAudioCallMessageSender$sendCallMessage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C44502sSe.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((InhouseIMAudioCallMessageSender$sendCallMessage$2) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C44502sSe.StateListAnimator stateListAnimator = (C44502sSe.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof C44502sSe.StateListAnimator.TaskDescription) {
                throw ((C44502sSe.StateListAnimator.TaskDescription) stateListAnimator).EZpvd();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
