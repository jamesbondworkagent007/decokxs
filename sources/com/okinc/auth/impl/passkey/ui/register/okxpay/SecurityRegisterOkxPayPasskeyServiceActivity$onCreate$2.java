package com.okinc.auth.impl.passkey.ui.register.okxpay;

import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC32955mnO;
import o.ActivityC6354aNk;
import o.ActivityC6573aRr;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2 extends SuspendLambda implements Function2<AbstractC32955mnO<GetAuthenticationTypeResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC6354aNk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2(ActivityC6354aNk activityC6354aNk, Continuation<? super SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC6354aNk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2 securityRegisterOkxPayPasskeyServiceActivity$onCreate$2 = new SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2(this.this$0, continuation);
        securityRegisterOkxPayPasskeyServiceActivity$onCreate$2.L$0 = obj;
        return securityRegisterOkxPayPasskeyServiceActivity$onCreate$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC32955mnO<GetAuthenticationTypeResponse> abstractC32955mnO, Continuation<? super Unit> continuation) {
        return ((SecurityRegisterOkxPayPasskeyServiceActivity$onCreate$2) create(abstractC32955mnO, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC32955mnO abstractC32955mnO = (AbstractC32955mnO) this.L$0;
            if (abstractC32955mnO instanceof AbstractC32955mnO.TaskDescription) {
                this.this$0.showLoadingAtOnce();
            } else if (abstractC32955mnO instanceof AbstractC32955mnO.ActionBar) {
                this.this$0.releaseLoading();
                GetAuthenticationTypeResponse getAuthenticationTypeResponse = (GetAuthenticationTypeResponse) ((AbstractC32955mnO.ActionBar) abstractC32955mnO).AEQbTJ();
                if (getAuthenticationTypeResponse == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.AYXKKw.launch(ActivityC6573aRr.Companion.OLrzqt(this.this$0, getAuthenticationTypeResponse));
            } else {
                if (!(abstractC32955mnO instanceof AbstractC32955mnO.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.releaseLoading();
                ActivityC6354aNk activityC6354aNk = this.this$0;
                String strOLrzqt = ((AbstractC32955mnO.Activity) abstractC32955mnO).OLrzqt();
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                activityC6354aNk.copydefault(new PasskeyState.RegisterError(strOLrzqt));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
