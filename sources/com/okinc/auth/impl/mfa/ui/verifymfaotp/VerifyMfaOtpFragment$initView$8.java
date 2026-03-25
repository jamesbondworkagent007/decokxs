package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import com.okinc.auth.impl.mfa.model.OTP;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5863aEW;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaOtpFragment$initView$8 extends SuspendLambda implements Function2<OTP, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5863aEW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpFragment$initView$8(C5863aEW c5863aEW, Continuation<? super VerifyMfaOtpFragment$initView$8> continuation) {
        super(2, continuation);
        this.this$0 = c5863aEW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaOtpFragment$initView$8 verifyMfaOtpFragment$initView$8 = new VerifyMfaOtpFragment$initView$8(this.this$0, continuation);
        verifyMfaOtpFragment$initView$8.L$0 = obj;
        return verifyMfaOtpFragment$initView$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OTP otp, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpFragment$initView$8) create(otp, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl().KWHzl((OTP) this.L$0, this.this$0.djBIcL().DbNXlk());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
