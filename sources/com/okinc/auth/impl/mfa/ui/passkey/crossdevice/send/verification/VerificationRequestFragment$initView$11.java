package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import com.okinc.auth.impl.mfa.model.MfaFailure;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5845aEE;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationRequestFragment$initView$11 extends SuspendLambda implements Function2<MfaFailure, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5845aEE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestFragment$initView$11(C5845aEE c5845aEE, Continuation<? super VerificationRequestFragment$initView$11> continuation) {
        super(2, continuation);
        this.this$0 = c5845aEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationRequestFragment$initView$11 verificationRequestFragment$initView$11 = new VerificationRequestFragment$initView$11(this.this$0, continuation);
        verificationRequestFragment$initView$11.L$0 = obj;
        return verificationRequestFragment$initView$11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MfaFailure mfaFailure, Continuation<? super Unit> continuation) {
        return ((VerificationRequestFragment$initView$11) create(mfaFailure, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.AYXKKw().OLrzqt((MfaFailure) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
