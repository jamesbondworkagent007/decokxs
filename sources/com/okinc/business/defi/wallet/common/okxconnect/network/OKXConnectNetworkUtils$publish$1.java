package com.okinc.business.defi.wallet.common.okxconnect.network;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C16000ebf;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$publish$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$publish$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$publish$1> continuation) {
        super(continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl(null, null, false, false, false, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
