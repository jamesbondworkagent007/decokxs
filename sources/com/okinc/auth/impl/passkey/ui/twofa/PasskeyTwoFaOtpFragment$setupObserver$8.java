package com.okinc.auth.impl.passkey.ui.twofa;

import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C6535aRF;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyTwoFaOtpFragment$setupObserver$8 extends SuspendLambda implements Function2<UnlockTokenResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6535aRF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyTwoFaOtpFragment$setupObserver$8(C6535aRF c6535aRF, Continuation<? super PasskeyTwoFaOtpFragment$setupObserver$8> continuation) {
        super(2, continuation);
        this.this$0 = c6535aRF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyTwoFaOtpFragment$setupObserver$8 passkeyTwoFaOtpFragment$setupObserver$8 = new PasskeyTwoFaOtpFragment$setupObserver$8(this.this$0, continuation);
        passkeyTwoFaOtpFragment$setupObserver$8.L$0 = obj;
        return passkeyTwoFaOtpFragment$setupObserver$8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UnlockTokenResponse unlockTokenResponse, Continuation<? super Unit> continuation) {
        return ((PasskeyTwoFaOtpFragment$setupObserver$8) create(unlockTokenResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt().copydefault((UnlockTokenResponse) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
