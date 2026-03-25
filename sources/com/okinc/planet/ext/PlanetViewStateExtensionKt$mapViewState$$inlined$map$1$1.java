package com.okinc.planet.ext;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.tRN;

/* JADX INFO: loaded from: classes24.dex */
public final class PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ tRN.StateListAnimator this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$1(tRN.StateListAnimator stateListAnimator, Continuation continuation) {
        super(continuation);
        this.this$0 = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
