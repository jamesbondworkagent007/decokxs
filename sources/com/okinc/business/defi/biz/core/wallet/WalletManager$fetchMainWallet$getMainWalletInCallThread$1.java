package com.okinc.business.defi.biz.core.wallet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC12782ctV;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletManager$fetchMainWallet$getMainWalletInCallThread$1 extends ContinuationImpl {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletManager$fetchMainWallet$getMainWalletInCallThread$1(Continuation<? super WalletManager$fetchMainWallet$getMainWalletInCallThread$1> continuation) {
        super(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C12827cuN.EZpvd((C12827cuN) null, false, (Continuation<? super AbstractC12782ctV>) this);
    }
}
