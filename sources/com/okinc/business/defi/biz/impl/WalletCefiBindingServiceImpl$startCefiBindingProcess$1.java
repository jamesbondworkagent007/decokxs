package com.okinc.business.defi.biz.impl;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C11707cYf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCefiBindingServiceImpl$startCefiBindingProcess$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C11707cYf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCefiBindingServiceImpl$startCefiBindingProcess$1(C11707cYf c11707cYf, Continuation<? super WalletCefiBindingServiceImpl$startCefiBindingProcess$1> continuation) {
        super(continuation);
        this.this$0 = c11707cYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(null, null, null, null, null, this);
    }
}
