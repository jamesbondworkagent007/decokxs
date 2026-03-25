package com.okinc.business.invest_biz.ui.screens.defi_dashboard.unified_rewards;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeFiUnifiedRewardsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1(DeFiUnifiedRewardsViewModel deFiUnifiedRewardsViewModel, Continuation<? super DeFiUnifiedRewardsViewModel$getLsdBatchClaimDetail$1> continuation) {
        super(continuation);
        this.this$0 = deFiUnifiedRewardsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objKWHzl = this.this$0.KWHzl(0L, 0L, this);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Result.m7376boximpl(objKWHzl);
    }
}
