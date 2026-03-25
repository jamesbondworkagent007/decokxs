package com.okinc.trade.arch.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class DefaultUseCaseDistinct$distinct$3$executeAndCache$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultUseCaseDistinct$distinct$3$executeAndCache$1(Continuation<? super DefaultUseCaseDistinct$distinct$3$executeAndCache$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DefaultUseCaseDistinct$distinct$3.invokeSuspend$executeAndCache(null, null, null, null, this);
    }
}
