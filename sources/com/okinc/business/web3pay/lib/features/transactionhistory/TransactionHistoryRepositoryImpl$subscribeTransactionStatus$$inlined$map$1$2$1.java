package com.okinc.business.web3pay.lib.features.transactionhistory;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31285lrD;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31285lrD.TaskDescription.AnonymousClass2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionHistoryRepositoryImpl$subscribeTransactionStatus$$inlined$map$1$2$1(C31285lrD.TaskDescription.AnonymousClass2 anonymousClass2, Continuation continuation) {
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
