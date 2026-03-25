package com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter;

import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.bot.data.ArbitrageType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AbstractC54531xLw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ArbTradeViewModel$handleBiz$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ArbTradeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArbTradeViewModel$handleBiz$1(ArbTradeViewModel arbTradeViewModel, Continuation<? super ArbTradeViewModel$handleBiz$1> continuation) {
        super(continuation);
        this.this$0 = arbTradeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((ArbitrageType) null, (AbstractC54531xLw) null, (ArbitrageInfo) null, this);
    }
}
