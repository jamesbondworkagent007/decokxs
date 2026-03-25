package com.okinc.business.web3pay.lib.features.gas;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31323lrp;

/* JADX INFO: loaded from: classes23.dex */
public final class GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31323lrp.Application.AnonymousClass2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasRepositoryImpl$subscribeWSGasInfo$$inlined$map$1$2$1(C31323lrp.Application.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
