package com.okinc.auth.impl.mfa.ui.passkey;

import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;
import o.C5790aDC;

/* JADX INFO: loaded from: classes14.dex */
public final class VerifyMfaPasskeyFragment$initView$13 extends SuspendLambda implements Function2<AuthenticationStartResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5790aDC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyMfaPasskeyFragment$initView$13(C5790aDC c5790aDC, Continuation<? super VerifyMfaPasskeyFragment$initView$13> continuation) {
        super(2, continuation);
        this.this$0 = c5790aDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VerifyMfaPasskeyFragment$initView$13 verifyMfaPasskeyFragment$initView$13 = new VerifyMfaPasskeyFragment$initView$13(this.this$0, continuation);
        verifyMfaPasskeyFragment$initView$13.L$0 = obj;
        return verifyMfaPasskeyFragment$initView$13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AuthenticationStartResponse authenticationStartResponse, Continuation<? super Unit> continuation) {
        return ((VerifyMfaPasskeyFragment$initView$13) create(authenticationStartResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AuthenticationStartResponse authenticationStartResponse = (AuthenticationStartResponse) this.L$0;
            C5790aDC c5790aDC = this.this$0;
            AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponse.getPublicKey();
            String challenge = publicKey != null ? publicKey.getChallenge() : null;
            if (challenge == null) {
                challenge = "";
            }
            c5790aDC.copydefault(challenge, authenticationStartResponse);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
