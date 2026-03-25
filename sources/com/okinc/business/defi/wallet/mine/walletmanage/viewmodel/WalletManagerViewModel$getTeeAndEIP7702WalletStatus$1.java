package com.okinc.business.defi.wallet.mine.walletmanage.viewmodel;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C17413fEk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C17413fEk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1(C17413fEk c17413fEk, Continuation<? super WalletManagerViewModel$getTeeAndEIP7702WalletStatus$1> continuation) {
        super(continuation);
        this.this$0 = c17413fEk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(this);
    }
}
