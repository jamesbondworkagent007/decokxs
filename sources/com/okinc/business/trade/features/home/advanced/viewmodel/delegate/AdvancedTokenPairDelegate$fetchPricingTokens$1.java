package com.okinc.business.trade.features.home.advanced.viewmodel.delegate;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.kTE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedTokenPairDelegate$fetchPricingTokens$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ kTE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedTokenPairDelegate$fetchPricingTokens$1(kTE kte, Continuation<? super AdvancedTokenPairDelegate$fetchPricingTokens$1> continuation) {
        super(continuation);
        this.this$0 = kte;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((String) null, (String) null, (AdvancedTradeType) null, this);
    }
}
