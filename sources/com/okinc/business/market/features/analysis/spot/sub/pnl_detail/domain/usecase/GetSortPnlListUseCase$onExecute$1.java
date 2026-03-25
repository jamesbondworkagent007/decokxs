package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.domain.usecase;

import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.jMA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class GetSortPnlListUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jMA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSortPnlListUseCase$onExecute$1(jMA jma, Continuation<? super GetSortPnlListUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = jma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((jMA.TaskDescription) null, (Continuation<? super List<PnlDetailVo.PnlListItem>>) this);
    }
}
