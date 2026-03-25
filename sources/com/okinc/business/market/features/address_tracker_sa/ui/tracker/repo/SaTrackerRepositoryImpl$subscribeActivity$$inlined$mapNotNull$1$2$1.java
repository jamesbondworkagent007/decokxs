package com.okinc.business.market.features.address_tracker_sa.ui.tracker.repo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.jEC;

/* JADX INFO: loaded from: classes6.dex */
public final class SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ jEC.Activity.AnonymousClass1 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaTrackerRepositoryImpl$subscribeActivity$$inlined$mapNotNull$1$2$1(jEC.Activity.AnonymousClass1 anonymousClass1, Continuation continuation) {
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
