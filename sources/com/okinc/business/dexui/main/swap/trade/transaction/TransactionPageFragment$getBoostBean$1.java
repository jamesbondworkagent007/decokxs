package com.okinc.business.dexui.main.swap.trade.transaction;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC22977hpY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TransactionPageFragment$getBoostBean$1<VM extends AbstractC22977hpY> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransactionPageFragment<VM> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionPageFragment$getBoostBean$1(TransactionPageFragment<VM> transactionPageFragment, Continuation<? super TransactionPageFragment$getBoostBean$1> continuation) {
        super(continuation);
        this.this$0 = transactionPageFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TransactionPageFragment.AEQbTJ(this.this$0, this);
    }
}
