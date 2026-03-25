package com.reown.android.verify.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyRepository$getVerifyPublicKey$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VerifyRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyRepository$getVerifyPublicKey$1(VerifyRepository verifyRepository, Continuation<? super VerifyRepository$getVerifyPublicKey$1> continuation) {
        super(continuation);
        this.this$0 = verifyRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7307getVerifyPublicKeyIoAF18A = this.this$0.m7307getVerifyPublicKeyIoAF18A(this);
        return objM7307getVerifyPublicKeyIoAF18A == C56442yFn.copydefault() ? objM7307getVerifyPublicKeyIoAF18A : Result.m7376boximpl(objM7307getVerifyPublicKeyIoAF18A);
    }
}
