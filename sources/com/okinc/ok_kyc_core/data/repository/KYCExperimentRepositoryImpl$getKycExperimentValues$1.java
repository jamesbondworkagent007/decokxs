package com.okinc.ok_kyc_core.data.repository;

import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.C43789rvs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCExperimentRepositoryImpl$getKycExperimentValues$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C43789rvs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCExperimentRepositoryImpl$getKycExperimentValues$1(C43789rvs c43789rvs, Continuation<? super KYCExperimentRepositoryImpl$getKycExperimentValues$1> continuation) {
        super(continuation);
        this.this$0 = c43789rvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((Map<String, String>) null, (String) null, false, (Continuation<? super Map<String, String>>) this);
    }
}
