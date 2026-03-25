package com.okinc.business.market.features.watch_list_groups.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27762kCk;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class CreateWatchlistGroupUseCase$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27762kCk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateWatchlistGroupUseCase$invoke$1(C27762kCk c27762kCk, Continuation<? super CreateWatchlistGroupUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c27762kCk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objOLrzqt = this.this$0.OLrzqt(null, this);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Result.m7376boximpl(objOLrzqt);
    }
}
