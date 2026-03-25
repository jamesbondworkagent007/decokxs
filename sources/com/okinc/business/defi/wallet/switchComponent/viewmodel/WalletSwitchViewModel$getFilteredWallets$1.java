package com.okinc.business.defi.wallet.switchComponent.viewmodel;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC12784ctX;
import o.C17740fQn;
import o.C17781fSa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSwitchViewModel$getFilteredWallets$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17781fSa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSwitchViewModel$getFilteredWallets$1(C17781fSa c17781fSa, Continuation<? super WalletSwitchViewModel$getFilteredWallets$1> continuation) {
        super(continuation);
        this.this$0 = c17781fSa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((List<? extends AbstractC12784ctX>) null, (Continuation<? super List<C17740fQn>>) this);
    }
}
