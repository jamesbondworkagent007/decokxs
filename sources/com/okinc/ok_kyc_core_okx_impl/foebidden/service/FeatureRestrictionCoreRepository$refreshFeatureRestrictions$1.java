package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeatureRestrictionCoreRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1(FeatureRestrictionCoreRepository featureRestrictionCoreRepository, Continuation<? super FeatureRestrictionCoreRepository$refreshFeatureRestrictions$1> continuation) {
        super(continuation);
        this.this$0 = featureRestrictionCoreRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.copydefault(this);
    }
}
