package com.amplitude.android;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C5219Jh;
import o.C5242Ke;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Timeline$startNewSessionIfNeeded$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C5219Jh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Timeline$startNewSessionIfNeeded$1(C5219Jh c5219Jh, Continuation<? super Timeline$startNewSessionIfNeeded$1> continuation) {
        super(continuation);
        this.this$0 = c5219Jh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0L, (Continuation<? super Iterable<? extends C5242Ke>>) this);
    }
}
