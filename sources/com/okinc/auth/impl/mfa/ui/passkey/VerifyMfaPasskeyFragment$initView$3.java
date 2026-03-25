package com.okinc.auth.impl.mfa.ui.passkey;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerifyMfaPasskeyFragment$initView$3(Continuation<? super VerifyMfaPasskeyFragment$initView$3> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyFragment$initView$3 verifyMfaPasskeyFragment$initView$3 = new VerifyMfaPasskeyFragment$initView$3(continuation);
        verifyMfaPasskeyFragment$initView$3.L$0 = obj;
        return verifyMfaPasskeyFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            if (str.length() > 0) {
                C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
