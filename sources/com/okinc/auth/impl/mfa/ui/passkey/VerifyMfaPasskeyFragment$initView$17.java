package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.mfa.model.OTP;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$17 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$17(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$17> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyFragment$initView$17 verifyMfaPasskeyFragment$initView$17 = new VerifyMfaPasskeyFragment$initView$17(this.this$0, continuation);
        verifyMfaPasskeyFragment$initView$17.Z$0 = ((Boolean) obj).booleanValue();
        return verifyMfaPasskeyFragment$initView$17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$17) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.Z$0;
            boolean zFJNWhG = this.this$0.ejfBZ().fJNWhG();
            C5790aDC c5790aDC = this.this$0;
            if (!zFJNWhG) {
                c5790aDC.ejfBZ().copydefault(OTP.PASSKEY);
                c5790aDC.ejfBZ().AxsJAY();
            } else if (z) {
                c5790aDC.ejfBZ().wlaJM();
            } else {
                c5790aDC.isConnected();
                Unit unit = Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
