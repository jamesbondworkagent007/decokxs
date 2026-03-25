package com.okinc.auth.impl.mfa.ui.verifymfaotp;

import com.okinc.auth.impl.mfa.ui.MfaViewModel;
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
public final class VerifyMfaOtpFragment$initView$9 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5863aEW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaOtpFragment$initView$9(C5863aEW c5863aEW, Continuation<? super VerifyMfaOtpFragment$initView$9> continuation) {
        super(2, continuation);
        this.this$0 = c5863aEW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VerifyMfaOtpFragment$initView$9(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((VerifyMfaOtpFragment$initView$9) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        OKCodeInput oKCodeInput;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MfaViewModel.startTimer$default(this.this$0.djBIcL(), 0L, 1, null);
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
