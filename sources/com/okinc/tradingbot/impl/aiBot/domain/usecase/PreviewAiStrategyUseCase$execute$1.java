package com.okinc.tradingbot.impl.aiBot.domain.usecase;

import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.uCS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PreviewAiStrategyUseCase$execute$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ uCS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAiStrategyUseCase$execute$1(uCS ucs, Continuation<? super PreviewAiStrategyUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = ucs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OLrzqt((AiOrderReq) null, (Continuation<? super PreviewAiStrategyResponseDto>) this);
    }
}
