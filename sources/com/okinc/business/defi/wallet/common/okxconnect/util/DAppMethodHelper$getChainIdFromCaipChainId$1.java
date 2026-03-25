package com.okinc.business.defi.wallet.common.okxconnect.util;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C15974ebF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$getChainIdFromCaipChainId$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$getChainIdFromCaipChainId$1(C15974ebF c15974ebF, Continuation<? super DAppMethodHelper$getChainIdFromCaipChainId$1> continuation) {
        super(continuation);
        this.this$0 = c15974ebF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, this);
    }
}
