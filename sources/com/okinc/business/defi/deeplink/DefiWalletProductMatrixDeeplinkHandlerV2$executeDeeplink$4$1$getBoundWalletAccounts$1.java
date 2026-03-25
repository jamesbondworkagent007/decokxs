package com.okinc.business.defi.deeplink;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1(Continuation<? super DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4$1$getBoundWalletAccounts$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objInvokeSuspend$lambda$9$getBoundWalletAccounts = DefiWalletProductMatrixDeeplinkHandlerV2$executeDeeplink$4.invokeSuspend$lambda$9$getBoundWalletAccounts(this);
        return objInvokeSuspend$lambda$9$getBoundWalletAccounts == C56442yFn.copydefault() ? objInvokeSuspend$lambda$9$getBoundWalletAccounts : Result.m7376boximpl(objInvokeSuspend$lambda$9$getBoundWalletAccounts);
    }
}
