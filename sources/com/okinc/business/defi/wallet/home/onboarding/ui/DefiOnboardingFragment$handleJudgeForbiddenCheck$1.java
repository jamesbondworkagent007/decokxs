package com.okinc.business.defi.wallet.home.onboarding.ui;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C12806ctt;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiOnboardingFragment$handleJudgeForbiddenCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiOnboardingFragment$handleJudgeForbiddenCheck$1(Function0<Unit> function0, Continuation<? super DefiOnboardingFragment$handleJudgeForbiddenCheck$1> continuation) {
        super(2, continuation);
        this.$callback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiOnboardingFragment$handleJudgeForbiddenCheck$1(this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiOnboardingFragment$handleJudgeForbiddenCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
            OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.DEFI;
            boolean zOLrzqt = oKComplianceRestrictionService.OLrzqt(feature);
            FeatureRestrictionInfo featureRestrictionInfoEZpvd = oKComplianceRestrictionService.EZpvd(feature);
            if (zOLrzqt) {
                C12806ctt.showDialog$default(C12806ctt.copydefault, featureRestrictionInfoEZpvd != null ? featureRestrictionInfoEZpvd.getCountryName() : null, true, null, 4, null);
            } else {
                this.$callback.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
