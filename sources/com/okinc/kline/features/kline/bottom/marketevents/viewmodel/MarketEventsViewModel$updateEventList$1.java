package com.okinc.kline.features.kline.bottom.marketevents.viewmodel;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventsViewModel$updateEventList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MarketEventsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketEventsViewModel$updateEventList$1(MarketEventsViewModel marketEventsViewModel, Continuation<? super MarketEventsViewModel$updateEventList$1> continuation) {
        super(continuation);
        this.this$0 = marketEventsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((InterfaceC49371unL<? extends List<? extends MarketEventsVo>>) null, false, (Continuation<? super Unit>) this);
    }
}
