package com.okinc.business.market.features.coindetail_liquidity.domain;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C56442yFn;
import o.jPS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LoadLiquidityChangeUseCase$load$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jPS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadLiquidityChangeUseCase$load$1(jPS jps, Continuation<? super LoadLiquidityChangeUseCase$load$1> continuation) {
        super(continuation);
        this.this$0 = jps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objCopydefault = this.this$0.copydefault(null, null, false, this);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Result.m7376boximpl(objCopydefault);
    }
}
