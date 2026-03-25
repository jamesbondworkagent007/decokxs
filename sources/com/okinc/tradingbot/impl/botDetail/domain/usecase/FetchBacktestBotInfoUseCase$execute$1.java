package com.okinc.tradingbot.impl.botDetail.domain.usecase;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C48181uHz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class FetchBacktestBotInfoUseCase$execute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C48181uHz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBacktestBotInfoUseCase$execute$1(C48181uHz c48181uHz, Continuation<? super FetchBacktestBotInfoUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = c48181uHz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((C48181uHz.ActionBar) null, (Continuation<? super StrategyDetailsResponse>) this);
    }
}
