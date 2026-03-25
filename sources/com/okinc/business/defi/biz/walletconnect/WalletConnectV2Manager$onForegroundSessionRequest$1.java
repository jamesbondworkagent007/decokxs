package com.okinc.business.defi.biz.walletconnect;

import com.reown.walletkit.client.Wallet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C13982dcp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletConnectV2Manager$onForegroundSessionRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13982dcp this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectV2Manager$onForegroundSessionRequest$1(C13982dcp c13982dcp, Continuation<? super WalletConnectV2Manager$onForegroundSessionRequest$1> continuation) {
        super(continuation);
        this.this$0 = c13982dcp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Wallet.Model.SessionRequest) null, (Continuation<? super Unit>) this);
    }
}
