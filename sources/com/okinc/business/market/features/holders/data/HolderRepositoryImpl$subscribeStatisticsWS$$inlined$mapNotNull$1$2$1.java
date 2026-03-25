package com.okinc.business.market.features.holders.data;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C26284jYt;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C26284jYt.Application.AnonymousClass5 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderRepositoryImpl$subscribeStatisticsWS$$inlined$mapNotNull$1$2$1(C26284jYt.Application.AnonymousClass5 anonymousClass5, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
