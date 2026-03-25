package com.okinc.business.defi.wallet.tee.disable.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C17869fVh;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class RemoveTeeUseCase$removeTee$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17869fVh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveTeeUseCase$removeTee$1(C17869fVh c17869fVh, Continuation<? super RemoveTeeUseCase$removeTee$1> continuation) {
        super(continuation);
        this.this$0 = c17869fVh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd(null, null, null, this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
