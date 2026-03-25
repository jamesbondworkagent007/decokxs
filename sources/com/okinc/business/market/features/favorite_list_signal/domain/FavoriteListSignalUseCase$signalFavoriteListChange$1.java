package com.okinc.business.market.features.favorite_list_signal.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26109jSg;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FavoriteListSignalUseCase$signalFavoriteListChange$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26109jSg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteListSignalUseCase$signalFavoriteListChange$1(C26109jSg c26109jSg, Continuation<? super FavoriteListSignalUseCase$signalFavoriteListChange$1> continuation) {
        super(continuation);
        this.this$0 = c26109jSg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(this);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Result.m7376boximpl(objAEQbTJ);
    }
}
