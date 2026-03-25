package com.okinc.find_ui.ranking.stock.viewmodel;

import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C35069noP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketHomeStockContainerViewModel$fetchStockRanking$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketHomeStockContainerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeStockContainerViewModel$fetchStockRanking$1(MarketHomeStockContainerViewModel marketHomeStockContainerViewModel, Continuation<? super MarketHomeStockContainerViewModel$fetchStockRanking$1> continuation) {
        super(continuation);
        this.this$0 = marketHomeStockContainerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(0, (Continuation<? super Pair<? extends List<C35069noP>, ? extends List<C35069noP>>>) this);
    }
}
