package com.okinc.auth.impl.passkey.ui.authenticate.okxpay;

import com.okinc.auth.impl.passkey.ui.authenticate.okxpay.SecurityAuthenticateOkxPayPasskeyServiceViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C6046aHu;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1 extends SuspendLambda implements Function2<SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6046aHu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1(C6046aHu c6046aHu, Continuation<? super SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c6046aHu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1 securityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1 = new SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1(this.this$0, continuation);
        securityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1.L$0 = obj;
        return securityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
        return ((SecurityAuthenticateOkxPayPasskeyServiceFragment$initView$1$1) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription taskDescription = (SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription) this.L$0;
            if (taskDescription instanceof SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator) {
                if (((SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.StateListAnimator) taskDescription).AEQbTJ()) {
                    this.this$0.showLoadingAtOnce();
                } else {
                    this.this$0.releaseLoading();
                }
            } else if (taskDescription instanceof SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar) {
                this.this$0.AEQbTJ(((SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.ActionBar) taskDescription).EZpvd());
            } else if (taskDescription instanceof SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.Activity) {
                this.this$0.AYXKKw.launch(((SecurityAuthenticateOkxPayPasskeyServiceViewModel.TaskDescription.Activity) taskDescription).copydefault());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
