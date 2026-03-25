package com.okinc.tradingbot.impl.strategy.init;

import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradecore.mainview.InnerTradeRoute;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C52478wMx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotTradeInitPresenter$ensureInitialized$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C52478wMx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotTradeInitPresenter$ensureInitialized$1(C52478wMx c52478wMx, Continuation<? super BotTradeInitPresenter$ensureInitialized$1> continuation) {
        super(continuation);
        this.this$0 = c52478wMx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((InnerTradeRoute) null, false, (ParamBuilder) null, (Continuation<? super Unit>) this);
    }
}
