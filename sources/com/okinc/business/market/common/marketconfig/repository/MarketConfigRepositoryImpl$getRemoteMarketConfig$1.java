package com.okinc.business.market.common.marketconfig.repository;

import com.okinc.business.market.data.model.MarketConfigData;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C27637jyu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketConfigRepositoryImpl$getRemoteMarketConfig$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C27637jyu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketConfigRepositoryImpl$getRemoteMarketConfig$1(C27637jyu c27637jyu, Continuation<? super MarketConfigRepositoryImpl$getRemoteMarketConfig$1> continuation) {
        super(continuation);
        this.this$0 = c27637jyu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((Continuation<? super MarketConfigData>) this);
    }
}
