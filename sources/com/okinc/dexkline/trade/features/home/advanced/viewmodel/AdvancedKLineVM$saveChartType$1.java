package com.okinc.dexkline.trade.features.home.advanced.viewmodel;

import com.okinc.dexkline.market.features.chart.domain.ChartType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedKLineVM$saveChartType$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdvancedKLineVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineVM$saveChartType$1(AdvancedKLineVM advancedKLineVM, Continuation<? super AdvancedKLineVM$saveChartType$1> continuation) {
        super(continuation);
        this.this$0 = advancedKLineVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((ChartType) null, this);
    }
}
