package com.okinc.business.market.features.home_token_list.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28541kci;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MapHomeTokenUseCase$mapToDomainModel$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28541kci this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHomeTokenUseCase$mapToDomainModel$1(C28541kci c28541kci, Continuation<? super MapHomeTokenUseCase$mapToDomainModel$1> continuation) {
        super(continuation);
        this.this$0 = c28541kci;
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
