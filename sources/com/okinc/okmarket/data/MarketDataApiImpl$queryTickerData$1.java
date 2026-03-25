package com.okinc.okmarket.data;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.sZN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketDataApiImpl$queryTickerData$1 extends ContinuationImpl {
    public Object L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ sZN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDataApiImpl$queryTickerData$1(sZN szn, Continuation<? super MarketDataApiImpl$queryTickerData$1> continuation) {
        super(continuation);
        this.this$0 = szn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ(null, null, false, this);
    }
}
