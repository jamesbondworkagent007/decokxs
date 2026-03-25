package com.okinc.auth.impl.passkey.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.C5909aFP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyRebindFido1FinishUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5909aFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyRebindFido1FinishUseCase$invoke$1(C5909aFP c5909aFP, Continuation<? super PasskeyRebindFido1FinishUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c5909aFP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd(null, null, 0, this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
