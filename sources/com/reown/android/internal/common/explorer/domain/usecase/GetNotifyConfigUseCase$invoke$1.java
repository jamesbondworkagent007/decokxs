package com.reown.android.internal.common.explorer.domain.usecase;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class GetNotifyConfigUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GetNotifyConfigUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNotifyConfigUseCase$invoke$1(GetNotifyConfigUseCase getNotifyConfigUseCase, Continuation<? super GetNotifyConfigUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getNotifyConfigUseCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7191invokegIAlus = this.this$0.m7191invokegIAlus(null, this);
        return objM7191invokegIAlus == C56442yFn.copydefault() ? objM7191invokegIAlus : Result.m7376boximpl(objM7191invokegIAlus);
    }
}
