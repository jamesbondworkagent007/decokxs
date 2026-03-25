package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSharePnlTokenViewModel$getAccountId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletSharePnlTokenViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSharePnlTokenViewModel$getAccountId$1(WalletSharePnlTokenViewModel walletSharePnlTokenViewModel, Continuation<? super WalletSharePnlTokenViewModel$getAccountId$1> continuation) {
        super(continuation);
        this.this$0 = walletSharePnlTokenViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objEZpvd = this.this$0.EZpvd(this);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Result.m7376boximpl(objEZpvd);
    }
}
