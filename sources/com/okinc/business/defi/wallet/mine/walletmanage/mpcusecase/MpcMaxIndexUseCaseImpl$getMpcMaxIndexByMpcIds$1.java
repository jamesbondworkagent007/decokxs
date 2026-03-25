package com.okinc.business.defi.wallet.mine.walletmanage.mpcusecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.fDR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ fDR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1(fDR fdr, Continuation<? super MpcMaxIndexUseCaseImpl$getMpcMaxIndexByMpcIds$1> continuation) {
        super(continuation);
        this.this$0 = fdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(null, this);
    }
}
