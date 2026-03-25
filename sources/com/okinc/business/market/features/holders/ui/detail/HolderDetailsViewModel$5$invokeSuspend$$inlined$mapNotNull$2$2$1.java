package com.okinc.business.market.features.holders.ui.detail;

import com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HolderDetailsViewModel.AnonymousClass5.Activity.AnonymousClass4 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HolderDetailsViewModel$5$invokeSuspend$$inlined$mapNotNull$2$2$1(HolderDetailsViewModel.AnonymousClass5.Activity.AnonymousClass4 anonymousClass4, Continuation continuation) {
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
