package com.okinc.business.defi.wallet.home;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C15554eMq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C15554eMq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1(C15554eMq c15554eMq, Continuation<? super CopyWalletAddressDialogHelper$showMnemonicWalletQuickCopyAddressDialog$1> continuation) {
        super(continuation);
        this.this$0 = c15554eMq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, null, null, this);
    }
}
