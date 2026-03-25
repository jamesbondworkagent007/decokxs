package com.okinc.business.defi.common;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.common.WalletCreateHelper$handleJudgeForbiddenCheck$1;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C12806ctt;
import o.C14140dfo;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCreateHelper$handleJudgeForbiddenCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ OKComplianceRestrictionService $restrictionService;
    int label;
    final /* synthetic */ C14140dfo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletCreateHelper$handleJudgeForbiddenCheck$1(OKComplianceRestrictionService oKComplianceRestrictionService, C14140dfo c14140dfo, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Continuation<? super WalletCreateHelper$handleJudgeForbiddenCheck$1> continuation) {
        super(2, continuation);
        this.$restrictionService = oKComplianceRestrictionService;
        this.this$0 = c14140dfo;
        this.$lifecycleOwner = lifecycleOwner;
        this.$callback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletCreateHelper$handleJudgeForbiddenCheck$1(this.$restrictionService, this.this$0, this.$lifecycleOwner, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletCreateHelper$handleJudgeForbiddenCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKComplianceRestrictionService oKComplianceRestrictionService = this.$restrictionService;
            OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.DEFI;
            boolean zOLrzqt = oKComplianceRestrictionService.OLrzqt(feature);
            FeatureRestrictionInfo featureRestrictionInfoEZpvd = this.$restrictionService.EZpvd(feature);
            if (!zOLrzqt) {
                C14140dfo c14140dfo = this.this$0;
                LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                final Function0<Unit> function0 = this.$callback;
                c14140dfo.OLrzqt(lifecycleOwner, (Function1<? super Unit, Unit>) new Function1() { // from class: o.djD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletCreateHelper$handleJudgeForbiddenCheck$1.invokeSuspend$lambda$0(function0, (Unit) obj2);
                    }
                });
            } else {
                C12806ctt.showDialog$default(C12806ctt.copydefault, featureRestrictionInfoEZpvd != null ? featureRestrictionInfoEZpvd.getCountryName() : null, true, null, 4, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Function0 function0, Unit unit) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
