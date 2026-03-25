package com.okinc.business.defi.wallet.custom;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C16205efY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class CustomTokenRepositoryImpl$getCoinProtocolList$1 extends ContinuationImpl {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C16205efY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTokenRepositoryImpl$getCoinProtocolList$1(C16205efY c16205efY, Continuation<? super CustomTokenRepositoryImpl$getCoinProtocolList$1> continuation) {
        super(continuation);
        this.this$0 = c16205efY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0L, false, this);
    }
}
