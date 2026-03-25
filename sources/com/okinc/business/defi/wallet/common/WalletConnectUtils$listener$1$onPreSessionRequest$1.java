package com.okinc.business.defi.wallet.common;

import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletConnectUtils$listener$1$onPreSessionRequest$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletConnectUtils.Activity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectUtils$listener$1$onPreSessionRequest$1(WalletConnectUtils.Activity activity, Continuation<? super WalletConnectUtils$listener$1$onPreSessionRequest$1> continuation) {
        super(continuation);
        this.this$0 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((String) null, 0L, this);
    }
}
