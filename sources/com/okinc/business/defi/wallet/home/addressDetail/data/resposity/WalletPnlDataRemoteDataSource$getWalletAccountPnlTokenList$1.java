package com.okinc.business.defi.wallet.home.addressDetail.data.resposity;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.eWC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ eWC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1(eWC ewc, Continuation<? super WalletPnlDataRemoteDataSource$getWalletAccountPnlTokenList$1> continuation) {
        super(continuation);
        this.this$0 = ewc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, 0, false, 0, 0, this);
    }
}
