package com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase;

import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeeInfoPo;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C25883jJx;
import o.C25904jKr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundFeeOverViewUseCase$onExecute$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C25883jJx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundFeeOverViewUseCase$onExecute$1(C25883jJx c25883jJx, Continuation<? super FundFeeOverViewUseCase$onExecute$1> continuation) {
        super(continuation);
        this.this$0 = c25883jJx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((Pair<? extends List<FundingFeeInfoPo>, ValuationCurrency>) null, (Continuation<? super C25904jKr>) this);
    }
}
