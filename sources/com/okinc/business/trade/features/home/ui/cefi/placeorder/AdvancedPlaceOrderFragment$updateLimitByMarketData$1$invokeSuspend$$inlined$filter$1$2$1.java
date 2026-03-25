package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$updateLimitByMarketData$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdvancedPlaceOrderFragment$updateLimitByMarketData$1.ActionBar.AnonymousClass3 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$updateLimitByMarketData$1$invokeSuspend$$inlined$filter$1$2$1(AdvancedPlaceOrderFragment$updateLimitByMarketData$1.ActionBar.AnonymousClass3 anonymousClass3, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
