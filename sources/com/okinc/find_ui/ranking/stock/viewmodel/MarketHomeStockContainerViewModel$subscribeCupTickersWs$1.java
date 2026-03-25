package com.okinc.find_ui.ranking.stock.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$subscribeCupTickersWs$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketHomeStockContainerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockContainerViewModel$subscribeCupTickersWs$1(MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, Continuation<? super MarketHomeStockContainerViewModel$subscribeCupTickersWs$1> continuation) {
        super(continuation);
        this.this$0 = marketHomeStockContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((Continuation<? super Unit>) this);
    }
}
