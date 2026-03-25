package com.okinc.business.defi.biz.core.wallet;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C13023cxy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3Manager$verifyWalletAssetApi$1 extends ContinuationImpl {
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C13023cxy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3Manager$verifyWalletAssetApi$1(C13023cxy c13023cxy, Continuation<? super Web3Manager$verifyWalletAssetApi$1> continuation) {
        super(continuation);
        this.this$0 = c13023cxy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(false, this);
    }
}
