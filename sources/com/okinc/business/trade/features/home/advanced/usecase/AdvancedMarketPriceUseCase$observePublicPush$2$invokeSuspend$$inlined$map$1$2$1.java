package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketPriceUseCase$observePublicPush$2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdvancedMarketPriceUseCase$observePublicPush$2.StateListAnimator.AnonymousClass5 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketPriceUseCase$observePublicPush$2$invokeSuspend$$inlined$map$1$2$1(AdvancedMarketPriceUseCase$observePublicPush$2.StateListAnimator.AnonymousClass5 anonymousClass5, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
