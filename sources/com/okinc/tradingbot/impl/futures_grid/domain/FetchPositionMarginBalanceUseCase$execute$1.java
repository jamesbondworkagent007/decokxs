package com.okinc.tradingbot.impl.futures_grid.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C51052vfj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class FetchPositionMarginBalanceUseCase$execute$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C51052vfj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPositionMarginBalanceUseCase$execute$1(C51052vfj c51052vfj, Continuation<? super FetchPositionMarginBalanceUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = c51052vfj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((C51052vfj.StateListAnimator) null, (Continuation<? super C51052vfj.Application>) this);
    }
}
