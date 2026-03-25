package com.okinc.business.trade.features.home.domain.usecase.bridgeapprovedata;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kUF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RustBridgeApproveDataUseCase$fallbackToNative$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kUF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RustBridgeApproveDataUseCase$fallbackToNative$1(kUF kuf, Continuation<? super RustBridgeApproveDataUseCase$fallbackToNative$1> continuation) {
        super(continuation);
        this.this$0 = kuf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, null, null, null, null, this);
    }
}
