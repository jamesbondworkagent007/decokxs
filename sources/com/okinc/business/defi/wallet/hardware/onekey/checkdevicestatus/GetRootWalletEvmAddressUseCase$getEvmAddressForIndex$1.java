package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C15443eIn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C15443eIn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1(C15443eIn c15443eIn, Continuation<? super GetRootWalletEvmAddressUseCase$getEvmAddressForIndex$1> continuation) {
        super(continuation);
        this.this$0 = c15443eIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, 0, this);
    }
}
