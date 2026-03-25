package com.okinc.dexkline.market.features.coindetail.domain;

import com.okinc.dexkline.market.features.coindetail.domain.SniperDetailUseCase$subscribeSniperDetails$job$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes18.dex */
public final class SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SniperDetailUseCase$subscribeSniperDetails$job$1.Application.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperDetailUseCase$subscribeSniperDetails$job$1$invokeSuspend$$inlined$mapNotNull$1$2$1(SniperDetailUseCase$subscribeSniperDetails$job$1.Application.AnonymousClass4 anonymousClass4, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
