package com.okinc.okex.lite.navigation.riskBanner;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C43251rlk;
import o.C45758swd;
import o.C45759swe;
import o.C45762swh;
import o.C45771swq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class RiskBannerManager$setupConfigChangeListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C45758swd $bannerBuilder;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskBannerManager$setupConfigChangeListener$1(C45758swd c45758swd, Continuation<? super RiskBannerManager$setupConfigChangeListener$1> continuation) {
        super(2, continuation);
        this.$bannerBuilder = c45758swd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RiskBannerManager$setupConfigChangeListener$1(this.$bannerBuilder, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RiskBannerManager$setupConfigChangeListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SharedFlow<Unit> sharedFlowAxsJAY;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class);
            if (oKComplianceRestrictionService == null || (sharedFlowAxsJAY = oKComplianceRestrictionService.AxsJAY()) == null) {
                return Unit.INSTANCE;
            }
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$bannerBuilder);
            this.label = 1;
            if (sharedFlowAxsJAY.collect(anonymousClass5, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.okex.lite.navigation.riskBanner.RiskBannerManager$setupConfigChangeListener$1$5, reason: invalid class name */
    public static final class AnonymousClass5<T> implements FlowCollector {
        public final /* synthetic */ C45758swd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(C45758swd c45758swd) {
            this.copydefault = c45758swd;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) throws Throwable {
            RiskBannerManager$setupConfigChangeListener$1$1$emit$1 riskBannerManager$setupConfigChangeListener$1$1$emit$1;
            AnonymousClass5<T> anonymousClass5;
            C45759swe c45759sweAEQbTJ;
            if (continuation instanceof RiskBannerManager$setupConfigChangeListener$1$1$emit$1) {
                riskBannerManager$setupConfigChangeListener$1$1$emit$1 = (RiskBannerManager$setupConfigChangeListener$1$1$emit$1) continuation;
                int i = riskBannerManager$setupConfigChangeListener$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    riskBannerManager$setupConfigChangeListener$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    riskBannerManager$setupConfigChangeListener$1$1$emit$1 = new RiskBannerManager$setupConfigChangeListener$1$1$emit$1(this, continuation);
                }
            }
            Object objCopydefault = riskBannerManager$setupConfigChangeListener$1$1$emit$1.result;
            Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = riskBannerManager$setupConfigChangeListener$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                C45771swq c45771swq = C45771swq.AEQbTJ;
                riskBannerManager$setupConfigChangeListener$1$1$emit$1.L$0 = this;
                riskBannerManager$setupConfigChangeListener$1$1$emit$1.label = 1;
                objCopydefault = c45771swq.copydefault(true, riskBannerManager$setupConfigChangeListener$1$1$emit$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                anonymousClass5 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                anonymousClass5 = (AnonymousClass5) riskBannerManager$setupConfigChangeListener$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            C45762swh c45762swh = (C45762swh) objCopydefault;
            if (c45762swh == null || (c45759sweAEQbTJ = c45762swh.AEQbTJ()) == null) {
                return Unit.INSTANCE;
            }
            anonymousClass5.copydefault.EZpvd(c45759sweAEQbTJ);
            return Unit.INSTANCE;
        }
    }
}
