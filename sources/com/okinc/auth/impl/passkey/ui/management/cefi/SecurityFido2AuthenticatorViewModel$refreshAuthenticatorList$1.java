package com.okinc.auth.impl.passkey.ui.management.cefi;

import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC32955mnO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1 extends SuspendLambda implements Function2<FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>>, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>> flowCollector, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.gEmmrt;
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
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
