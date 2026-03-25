package com.okinc.auth.impl.passkey.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.C5902aFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OkxPayPasskeyToPendingIntentUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5902aFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkxPayPasskeyToPendingIntentUseCase$invoke$1(C5902aFI c5902aFI, Continuation<? super OkxPayPasskeyToPendingIntentUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c5902aFI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault(null, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
