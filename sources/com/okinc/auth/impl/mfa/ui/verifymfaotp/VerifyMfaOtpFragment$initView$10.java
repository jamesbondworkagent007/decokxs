package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import com.okinc.uilab.code.OKCodeInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33054mpH;
import o.C5629aAA;
import o.C56391yDq;
import o.C56442yFn;
import o.C5863aEW;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaOtpFragment$initView$10 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C5863aEW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpFragment$initView$10(C5863aEW c5863aEW, Continuation<? super VerifyMfaOtpFragment$initView$10> continuation) {
        super(2, continuation);
        this.this$0 = c5863aEW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaOtpFragment$initView$10 verifyMfaOtpFragment$initView$10 = new VerifyMfaOtpFragment$initView$10(this.this$0, continuation);
        verifyMfaOtpFragment$initView$10.J$0 = ((Number) obj).longValue();
        return verifyMfaOtpFragment$initView$10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(long j, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpFragment$initView$10) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKCodeInput oKCodeInput;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.djBIcL().EZpvd(this.J$0);
            C5629aAA c5629aAA = this.this$0.valueOf;
            if (c5629aAA != null && (oKCodeInput = c5629aAA.AEQbTJ) != null) {
                oKCodeInput.OLrzqt();
            }
            C33054mpH.showKeyBoardDelay$default(this.this$0, 0L, 1, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
