package com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundindFeeRateInfoPo;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C25882jJw;
import o.C25907jKu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class HoldFundingFeeUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C25882jJw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldFundingFeeUseCase$onExecute$1(C25882jJw c25882jJw, Continuation<? super HoldFundingFeeUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c25882jJw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((List<FundindFeeRateInfoPo>) null, (Continuation<? super List<C25907jKu>>) this);
    }
}
