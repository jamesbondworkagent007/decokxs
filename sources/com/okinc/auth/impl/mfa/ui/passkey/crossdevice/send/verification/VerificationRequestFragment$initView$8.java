package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C55317xhf;
import o.C56391yDq;
import o.C56442yFn;
import o.C5845aEE;
import o.C8282azm;

/* JADX INFO: loaded from: classes14.dex */
public final class VerificationRequestFragment$initView$8 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C5845aEE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationRequestFragment$initView$8(C5845aEE c5845aEE, Continuation<? super VerificationRequestFragment$initView$8> continuation) {
        super(2, continuation);
        this.this$0 = c5845aEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerificationRequestFragment$initView$8 verificationRequestFragment$initView$8 = new VerificationRequestFragment$initView$8(this.this$0, continuation);
        verificationRequestFragment$initView$8.Z$0 = ((Boolean) obj).booleanValue();
        return verificationRequestFragment$initView$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((VerificationRequestFragment$initView$8) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55317xhf c55317xhf;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            C8282azm c8282azm = this.this$0.djBIcL;
            if (c8282azm != null && (c55317xhf = c8282azm.valueOf) != null) {
                c55317xhf.setEnabled(z);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
