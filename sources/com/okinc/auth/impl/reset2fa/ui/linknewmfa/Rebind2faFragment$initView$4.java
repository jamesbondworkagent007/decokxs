package com.okinc.auth.impl.reset2fa.ui.linknewmfa;

import android.graphics.drawable.Drawable;
import com.google.firebase.messaging.Constants;
import com.okinc.account.api.model.security.otp.TwoFactorAuthState;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaNextStepResponse;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C6602aST;
import o.C8206ayP;

/* JADX INFO: loaded from: classes14.dex */
public final class Rebind2faFragment$initView$4 extends SuspendLambda implements Function2<TwoFactorAuthState, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6602aST this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rebind2faFragment$initView$4(C6602aST c6602aST, Continuation<? super Rebind2faFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c6602aST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Rebind2faFragment$initView$4 rebind2faFragment$initView$4 = new Rebind2faFragment$initView$4(this.this$0, continuation);
        rebind2faFragment$initView$4.L$0 = obj;
        return rebind2faFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TwoFactorAuthState twoFactorAuthState, Continuation<? super Unit> continuation) {
        return ((Rebind2faFragment$initView$4) create(twoFactorAuthState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String nextStep;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TwoFactorAuthState twoFactorAuthState = (TwoFactorAuthState) this.L$0;
            if (Intrinsics.EZpvd(twoFactorAuthState, TwoFactorAuthState.Loading.INSTANCE)) {
                this.this$0.AYXKKw().getNewProxyInstance();
                this.this$0.showLoadingAtOnce();
                Unit unit = Unit.INSTANCE;
            } else {
                if (twoFactorAuthState instanceof TwoFactorAuthState.InvalidAuthCode) {
                    this.this$0.dismissLoading();
                    TwoFactorAuthState.InvalidAuthCode invalidAuthCode = (TwoFactorAuthState.InvalidAuthCode) twoFactorAuthState;
                    Map<String, String> errorCodes = invalidAuthCode.getErrorCodes();
                    if (errorCodes != null) {
                        this.this$0.AYXKKw().KWHzl(errorCodes);
                    }
                    C55326xho.toastWithFailedIcon$default(invalidAuthCode.getMsg(), 0, 1, (Object) null);
                    Unit unit2 = Unit.INSTANCE;
                } else if (twoFactorAuthState instanceof TwoFactorAuthState.MaxAttemptReached) {
                    this.this$0.dismissLoading();
                    C55326xho.toast$default(((TwoFactorAuthState.MaxAttemptReached) twoFactorAuthState).getMsg(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                } else if (twoFactorAuthState instanceof TwoFactorAuthState.Success) {
                    this.this$0.dismissLoading();
                    Object data = ((TwoFactorAuthState.Success) twoFactorAuthState).getData();
                    ResetMfaNextStepResponse resetMfaNextStepResponse = data instanceof ResetMfaNextStepResponse ? (ResetMfaNextStepResponse) data : null;
                    if (resetMfaNextStepResponse != null && (nextStep = resetMfaNextStepResponse.getNextStep()) != null) {
                        this.this$0.AhwBna().copydefault(nextStep);
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        C55326xho.toast$default(this.this$0.getString(C8206ayP.Dialog.DPHNDa), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                } else {
                    if (!(twoFactorAuthState instanceof TwoFactorAuthState.UnknownError)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.dismissLoading();
                    String msg = ((TwoFactorAuthState.UnknownError) twoFactorAuthState).getMsg();
                    if (msg == null || C55326xho.toast$default(msg, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null) == null) {
                        C55326xho.toast$default(Constants.IPC_BUNDLE_KEY_SEND_ERROR, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
