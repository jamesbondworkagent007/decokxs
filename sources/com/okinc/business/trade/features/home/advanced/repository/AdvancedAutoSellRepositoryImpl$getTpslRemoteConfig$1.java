package com.okinc.business.trade.features.home.advanced.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C28148kQr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C28148kQr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1(C28148kQr c28148kQr, Continuation<? super AdvancedAutoSellRepositoryImpl$getTpslRemoteConfig$1> continuation) {
        super(continuation);
        this.this$0 = c28148kQr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(this);
    }
}
