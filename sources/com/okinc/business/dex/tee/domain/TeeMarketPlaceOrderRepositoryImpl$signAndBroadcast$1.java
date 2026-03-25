package com.okinc.business.dex.tee.domain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C19731gNf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C19731gNf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1(C19731gNf c19731gNf, Continuation<? super TeeMarketPlaceOrderRepositoryImpl$signAndBroadcast$1> continuation) {
        super(continuation);
        this.this$0 = c19731gNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, this);
    }
}
