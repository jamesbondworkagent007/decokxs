package com.okinc.business.defi.wallet.tx.send.receiveAddress;

import com.okinc.business.defi.wallet.tx.send.receiveAddress.WalletSendCoinReceiveAddressViewModel$observeData$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletSendCoinReceiveAddressViewModel$observeData$1.TaskDescription.AnonymousClass3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSendCoinReceiveAddressViewModel$observeData$1$invokeSuspend$$inlined$map$1$2$1(WalletSendCoinReceiveAddressViewModel$observeData$1.TaskDescription.AnonymousClass3 anonymousClass3, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
