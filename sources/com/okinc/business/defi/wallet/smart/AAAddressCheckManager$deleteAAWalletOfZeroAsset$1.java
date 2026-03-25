package com.okinc.business.defi.wallet.smart;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC12784ctX;
import o.C17671fNz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AAAddressCheckManager$deleteAAWalletOfZeroAsset$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17671fNz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AAAddressCheckManager$deleteAAWalletOfZeroAsset$1(C17671fNz c17671fNz, Continuation<? super AAAddressCheckManager$deleteAAWalletOfZeroAsset$1> continuation) {
        super(continuation);
        this.this$0 = c17671fNz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((List<? extends AbstractC12784ctX>) null, (Continuation<? super Boolean>) this);
    }
}
