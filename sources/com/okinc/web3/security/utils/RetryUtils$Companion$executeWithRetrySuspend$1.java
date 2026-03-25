package com.okinc.web3.security.utils;

import com.okinc.web3.security.utils.RetryUtils;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class RetryUtils$Companion$executeWithRetrySuspend$1<T> extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetryUtils.Companion this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryUtils$Companion$executeWithRetrySuspend$1(RetryUtils.Companion companion, Continuation<? super RetryUtils$Companion$executeWithRetrySuspend$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeWithRetrySuspend(null, null, null, null, this);
    }
}
