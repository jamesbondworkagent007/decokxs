package com.okinc.business.defi.wallet.mine.walletmanage.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.fDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ fDX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1(fDX fdx, Continuation<? super MpcIndexRepositoryImpl$getMpcMaxIndexByMpcIds$1> continuation) {
        super(continuation);
        this.this$0 = fdx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt(null, this);
    }
}
