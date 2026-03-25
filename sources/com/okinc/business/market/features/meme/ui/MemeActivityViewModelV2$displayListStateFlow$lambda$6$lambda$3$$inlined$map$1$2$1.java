package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemeActivityViewModelV2.ActionBar.AnonymousClass1 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$displayListStateFlow$lambda$6$lambda$3$$inlined$map$1$2$1(MemeActivityViewModelV2.ActionBar.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
