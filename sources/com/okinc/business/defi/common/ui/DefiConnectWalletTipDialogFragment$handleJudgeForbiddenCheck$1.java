package com.okinc.business.defi.common.ui;

import com.okinc.business.defi.common.ui.DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1;
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
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $callback;
    int label;
    final /* synthetic */ DefiConnectWalletTipDialogFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1(DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment, Function0<Unit> function0, Continuation<? super DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = defiConnectWalletTipDialogFragment;
        this.$callback = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1(this.this$0, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (!zOLrzqt) {
                DefiConnectWalletTipDialogFragment defiConnectWalletTipDialogFragment = this.this$0;
                final Function0<Unit> function0 = this.$callback;
                defiConnectWalletTipDialogFragment.KWHzl((Function1<? super Unit, Unit>) new Function1() { // from class: o.dnN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return DefiConnectWalletTipDialogFragment$handleJudgeForbiddenCheck$1.invokeSuspend$lambda$0(function0, (Unit) obj2);
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
