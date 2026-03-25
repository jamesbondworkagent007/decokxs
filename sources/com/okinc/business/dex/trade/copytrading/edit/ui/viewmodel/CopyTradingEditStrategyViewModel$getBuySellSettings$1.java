package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyViewModel$getBuySellSettings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$getBuySellSettings$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Continuation<? super CopyTradingEditStrategyViewModel$getBuySellSettings$1> continuation) {
        super(continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd(false, (Continuation<? super AdvancedSettingsContract.Input>) this);
    }
}
