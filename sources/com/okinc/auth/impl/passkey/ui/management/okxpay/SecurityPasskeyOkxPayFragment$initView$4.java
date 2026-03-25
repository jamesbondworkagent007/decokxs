package com.okinc.auth.impl.passkey.ui.management.okxpay;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33070mpX;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityPasskeyOkxPayFragment$initView$4 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityPasskeyOkxPayFragment$initView$4(Continuation<? super SecurityPasskeyOkxPayFragment$initView$4> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityPasskeyOkxPayFragment$initView$4 securityPasskeyOkxPayFragment$initView$4 = new SecurityPasskeyOkxPayFragment$initView$4(continuation);
        securityPasskeyOkxPayFragment$initView$4.I$0 = ((Number) obj).intValue();
        return securityPasskeyOkxPayFragment$initView$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(int i, Continuation<? super Unit> continuation) {
        return ((SecurityPasskeyOkxPayFragment$initView$4) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(this.I$0), 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
