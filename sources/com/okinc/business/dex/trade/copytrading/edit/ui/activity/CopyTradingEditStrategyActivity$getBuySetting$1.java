package com.okinc.business.dex.trade.copytrading.edit.ui.activity;

import com.okinc.business.dex.trade.copytrading.edit.data.model.BuySettings;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyActivity$getBuySetting$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CopyTradingEditStrategyActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyActivity$getBuySetting$1(CopyTradingEditStrategyActivity copyTradingEditStrategyActivity, Continuation<? super CopyTradingEditStrategyActivity$getBuySetting$1> continuation) {
        super(continuation);
        this.this$0 = copyTradingEditStrategyActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((Continuation<? super BuySettings>) this);
    }
}
