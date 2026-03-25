package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C26544jeN;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iEM;

/* JADX INFO: loaded from: classes23.dex */
public final class CheckProductRestrictionUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super Pair<? extends Boolean, ? extends String>>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ C26544jeN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckProductRestrictionUseCase$invoke$2(C26544jeN c26544jeN, long j, long j2, Continuation<? super CheckProductRestrictionUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26544jeN;
        this.$investmentId = j;
        this.$chainId = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheckProductRestrictionUseCase$invoke$2(this.this$0, this.$investmentId, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Pair<? extends Boolean, ? extends String>> continuation) {
        return invoke2((Continuation<? super Pair<Boolean, String>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super Pair<Boolean, String>> continuation) {
        return ((CheckProductRestrictionUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8613getPortfolioBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.this$0.copydefault;
            long j = this.$investmentId;
            Long lKWHzl = C56443yFo.KWHzl(this.$chainId);
            this.label = 1;
            objM8613getPortfolioBWLJW6A$default = iEM.m8613getPortfolioBWLJW6A$default(iem, j, null, lKWHzl, this, 2, null);
            if (objM8613getPortfolioBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8613getPortfolioBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8613getPortfolioBWLJW6A$default)) {
            objM8613getPortfolioBWLJW6A$default = null;
        }
        List list = (List) objM8613getPortfolioBWLJW6A$default;
        boolean z = list == null || list.isEmpty();
        FeatureRestrictionInfo featureRestrictionInfoEZpvd = this.this$0.KWHzl.EZpvd(OKComplianceRestrictionService.Feature.WEB3DEFI);
        boolean z2 = featureRestrictionInfoEZpvd != null && Intrinsics.EZpvd(featureRestrictionInfoEZpvd.getRestricted(), C56443yFo.KWHzl(true)) && z;
        String countryName = featureRestrictionInfoEZpvd != null ? featureRestrictionInfoEZpvd.getCountryName() : null;
        if (countryName == null) {
            countryName = "";
        }
        return C56390yDp.OLrzqt(C56443yFo.KWHzl(z2), countryName);
    }
}
