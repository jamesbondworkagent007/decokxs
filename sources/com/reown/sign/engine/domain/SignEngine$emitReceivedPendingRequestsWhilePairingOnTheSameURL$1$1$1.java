package com.reown.sign.engine.domain;

import com.reown.sign.engine.model.EngineDO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ EngineDO.SessionAuthenticateEvent $sessionAuthenticateEvent;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1(SignEngine signEngine, EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent, Continuation<? super SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = signEngine;
        this.$sessionAuthenticateEvent = sessionAuthenticateEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1(this.this$0, this.$sessionAuthenticateEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
            EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent = this.$sessionAuthenticateEvent;
            this.label = 1;
            if (mutableSharedFlow.emit(sessionAuthenticateEvent, this) == objCopydefault) {
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
