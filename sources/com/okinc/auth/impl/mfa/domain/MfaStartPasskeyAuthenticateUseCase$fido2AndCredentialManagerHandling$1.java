package com.okinc.auth.impl.mfa.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5767aCg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5767aCg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1(C5767aCg c5767aCg, Continuation<? super MfaStartPasskeyAuthenticateUseCase$fido2AndCredentialManagerHandling$1> continuation) {
        super(continuation);
        this.this$0 = c5767aCg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(null, false, this);
    }
}
