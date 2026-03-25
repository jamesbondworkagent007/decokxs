package com.okinc.business.defi.wallet.tee.activate.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C17833fTz;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivateTeeViewDataReadyUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17833fTz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateTeeViewDataReadyUseCase$invoke$1(C17833fTz c17833fTz, Continuation<? super ActivateTeeViewDataReadyUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c17833fTz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl(null, false, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
