package com.okinc.business.dex.trade.order.data.repo;

import com.okinc.business.dex.trade.order.domain.model.GetOrderCountRequest;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C20051gZb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderListRepositoryImpl$getStrategyOrderCount$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C20051gZb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderListRepositoryImpl$getStrategyOrderCount$1(C20051gZb c20051gZb, Continuation<? super OrderListRepositoryImpl$getStrategyOrderCount$1> continuation) {
        super(continuation);
        this.this$0 = c20051gZb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.EZpvd((GetOrderCountRequest) null, this);
    }
}
