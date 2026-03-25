package com.okinc.business.defi.biz.core.transaction;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC9836bdB;
import o.C8398bBv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SignTransactionsUseCase$signTransactionsInternal$1<T extends AbstractC9836bdB> extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C8398bBv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignTransactionsUseCase$signTransactionsInternal$1(C8398bBv c8398bBv, Continuation<? super SignTransactionsUseCase$signTransactionsInternal$1> continuation) {
        super(continuation);
        this.this$0 = c8398bBv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, null, null, false, this);
    }
}
