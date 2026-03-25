package com.okinc.business.market.features.tag.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C29712kyn;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MapTagUseCase$map$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C29712kyn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTagUseCase$map$1(C29712kyn c29712kyn, Continuation<? super MapTagUseCase$map$1> continuation) {
        super(continuation);
        this.this$0 = c29712kyn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd(null, null, null, null, null, null, this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
