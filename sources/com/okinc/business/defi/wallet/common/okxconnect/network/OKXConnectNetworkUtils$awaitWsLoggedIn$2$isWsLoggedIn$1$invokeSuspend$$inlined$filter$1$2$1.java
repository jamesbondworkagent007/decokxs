package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1.Activity.AnonymousClass5 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1$invokeSuspend$$inlined$filter$1$2$1(OKXConnectNetworkUtils$awaitWsLoggedIn$2$isWsLoggedIn$1.Activity.AnonymousClass5 anonymousClass5, Continuation continuation) {
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
