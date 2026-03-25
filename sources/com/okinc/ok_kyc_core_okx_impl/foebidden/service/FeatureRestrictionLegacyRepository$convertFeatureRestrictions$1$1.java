package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43372rnz;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $siteCode;
    final /* synthetic */ String $subdomain;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1(String str, String str2, Continuation<? super FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1> continuation) {
        super(2, continuation);
        this.$siteCode = str;
        this.$subdomain = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1(this.$siteCode, this.$subdomain, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionLegacyRepository$convertFeatureRestrictions$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C43372rnz c43372rnz = C43372rnz.copydefault;
            String str = this.$siteCode;
            Intrinsics.copydefault((Object) str);
            String str2 = this.$subdomain;
            Intrinsics.copydefault((Object) str2);
            this.label = 1;
            if (C43372rnz.m8707setH5CORDomainBWLJW6A$default(c43372rnz, str, str2, 0L, this, 4, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }
}
