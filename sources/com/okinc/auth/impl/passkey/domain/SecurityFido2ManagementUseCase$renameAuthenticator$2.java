package com.okinc.auth.impl.passkey.domain;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2ManagementUseCase$renameAuthenticator$2 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC32955mnO<Unit>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityFido2ManagementUseCase$renameAuthenticator$2(Continuation<? super SecurityFido2ManagementUseCase$renameAuthenticator$2> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<Unit>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        SecurityFido2ManagementUseCase$renameAuthenticator$2 securityFido2ManagementUseCase$renameAuthenticator$2 = new SecurityFido2ManagementUseCase$renameAuthenticator$2(continuation);
        securityFido2ManagementUseCase$renameAuthenticator$2.L$0 = flowCollector;
        securityFido2ManagementUseCase$renameAuthenticator$2.L$1 = th;
        return securityFido2ManagementUseCase$renameAuthenticator$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            AbstractC32955mnO.Activity activity = new AbstractC32955mnO.Activity(((Throwable) this.L$1).getMessage());
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(activity, this) == objCopydefault) {
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
