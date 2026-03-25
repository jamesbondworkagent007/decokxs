package com.okinc.business.trade.features.home.advanced.usecase;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kRE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kRE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1(kRE kre, Continuation<? super AdvancedQuoteUseCase$buildV6QuoteAndCalldataRequest$1> continuation) {
        super(continuation);
        this.this$0 = kre;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl(null, null, false, null, this);
    }
}
