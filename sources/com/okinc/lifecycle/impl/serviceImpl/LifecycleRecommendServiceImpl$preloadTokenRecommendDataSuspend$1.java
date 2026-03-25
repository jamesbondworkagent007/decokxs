package com.okinc.lifecycle.impl.serviceImpl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C38169pOu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C38169pOu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1(C38169pOu c38169pOu, Continuation<? super LifecycleRecommendServiceImpl$preloadTokenRecommendDataSuspend$1> continuation) {
        super(continuation);
        this.this$0 = c38169pOu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, null, this);
    }
}
