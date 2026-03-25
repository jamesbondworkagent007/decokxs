package com.okinc.business.web3pay.lib.features.onchaintransaction;

import com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferParams;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C31328lru;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C31328lru this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1(C31328lru c31328lru, Continuation<? super OnChainTransactionRepositoryImpl$prepareExchangeTransfer$1> continuation) {
        super(continuation);
        this.this$0 = c31328lru;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd((OnChainTransferParams) null, this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
