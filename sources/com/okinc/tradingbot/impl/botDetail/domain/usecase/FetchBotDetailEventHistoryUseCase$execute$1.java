package com.okinc.tradingbot.impl.botDetail.domain.usecase;

import com.okinc.tradingbot.impl.dto.HistoryEventsDto;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.uHA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class FetchBotDetailEventHistoryUseCase$execute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ uHA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBotDetailEventHistoryUseCase$execute$1(uHA uha, Continuation<? super FetchBotDetailEventHistoryUseCase$execute$1> continuation) {
        super(continuation);
        this.this$0 = uha;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((uHA.Activity) null, (Continuation<? super List<HistoryEventsDto>>) this);
    }
}
