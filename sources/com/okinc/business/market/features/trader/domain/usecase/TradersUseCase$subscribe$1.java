package com.okinc.business.market.features.trader.domain.usecase;

import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C29777kzz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradersUseCase$subscribe$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C29777kzz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradersUseCase$subscribe$1(C29777kzz c29777kzz, Continuation<? super TradersUseCase$subscribe$1> continuation) {
        super(continuation);
        this.this$0 = c29777kzz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault((TradersRequestParam) null, this);
    }
}
