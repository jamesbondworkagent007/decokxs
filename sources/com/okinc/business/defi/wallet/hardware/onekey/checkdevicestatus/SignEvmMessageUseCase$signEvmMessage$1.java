package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C15455eIz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class SignEvmMessageUseCase$signEvmMessage$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C15455eIz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignEvmMessageUseCase$signEvmMessage$1(C15455eIz c15455eIz, Continuation<? super SignEvmMessageUseCase$signEvmMessage$1> continuation) {
        super(continuation);
        this.this$0 = c15455eIz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, null, null, this);
    }
}
