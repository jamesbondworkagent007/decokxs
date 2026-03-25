package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.CachedSplitData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C16000ebf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$ackAndSendPushData$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$ackAndSendPushData$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$ackAndSendPushData$1> continuation) {
        super(continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((CachedSplitData[]) null, this);
    }
}
