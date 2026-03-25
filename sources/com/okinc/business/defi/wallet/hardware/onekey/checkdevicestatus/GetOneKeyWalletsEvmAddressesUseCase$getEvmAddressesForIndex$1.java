package com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C15436eIg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C15436eIg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1(C15436eIg c15436eIg, Continuation<? super GetOneKeyWalletsEvmAddressesUseCase$getEvmAddressesForIndex$1> continuation) {
        super(continuation);
        this.this$0 = c15436eIg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, 0, this);
    }
}
