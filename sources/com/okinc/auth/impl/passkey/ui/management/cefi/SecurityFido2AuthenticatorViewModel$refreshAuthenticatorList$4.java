package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32955mnO;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4 extends SuspendLambda implements yHO<FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4> continuation) {
        super(3, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(FlowCollector<? super AbstractC32955mnO<GetAuthenticatorListResponse>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4 securityFido2AuthenticatorViewModel$refreshAuthenticatorList$4 = new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$4(this.this$0, continuation);
        securityFido2AuthenticatorViewModel$refreshAuthenticatorList$4.L$0 = th;
        return securityFido2AuthenticatorViewModel$refreshAuthenticatorList$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Throwable th = (Throwable) this.L$0;
            MutableLiveData mutableLiveData = this.this$0.EZpvd;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            mutableLiveData.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(message)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
