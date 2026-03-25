package com.okinc.ok_kyc_core_okx_impl.foebidden.loader;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.ALB;
import o.AbstractC2440ALv;
import o.C2436ALr;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.rUI;

/* JADX INFO: loaded from: classes10.dex */
public final class OKCoreFeatureRestrictionClient$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ rUI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCoreFeatureRestrictionClient$1(rUI rui, Continuation<? super OKCoreFeatureRestrictionClient$1> continuation) {
        super(2, continuation);
        this.this$0 = rui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCoreFeatureRestrictionClient$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCoreFeatureRestrictionClient$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.loader.OKCoreFeatureRestrictionClient$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FeatureRestrictionDiffSet, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FeatureRestrictionDiffSet featureRestrictionDiffSet, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(featureRestrictionDiffSet, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FeatureRestrictionDiffSet featureRestrictionDiffSet = (FeatureRestrictionDiffSet) this.L$0;
                LinkedHashSet<OKComplianceRestrictionService.Feature> content = featureRestrictionDiffSet.getContent();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(content, 10));
                Iterator<T> it = content.iterator();
                while (it.hasNext()) {
                    arrayList.add(((OKComplianceRestrictionService.Feature) it.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> country = featureRestrictionDiffSet.getCountry();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(country, 10));
                Iterator<T> it2 = country.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((OKComplianceRestrictionService.Feature) it2.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> countryName = featureRestrictionDiffSet.getCountryName();
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(countryName, 10));
                Iterator<T> it3 = countryName.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((OKComplianceRestrictionService.Feature) it3.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> hidden = featureRestrictionDiffSet.getHidden();
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(hidden, 10));
                Iterator<T> it4 = hidden.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((OKComplianceRestrictionService.Feature) it4.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> limit = featureRestrictionDiffSet.getLimit();
                ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(limit, 10));
                Iterator<T> it5 = limit.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((OKComplianceRestrictionService.Feature) it5.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> kycLevel = featureRestrictionDiffSet.getKycLevel();
                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(kycLevel, 10));
                Iterator<T> it6 = kycLevel.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((OKComplianceRestrictionService.Feature) it6.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> provinceCode = featureRestrictionDiffSet.getProvinceCode();
                ArrayList arrayList7 = new ArrayList(C56403yEb.AYXKKw(provinceCode, 10));
                Iterator<T> it7 = provinceCode.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(((OKComplianceRestrictionService.Feature) it7.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> province = featureRestrictionDiffSet.getProvince();
                ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(province, 10));
                Iterator<T> it8 = province.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(((OKComplianceRestrictionService.Feature) it8.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> politStatus = featureRestrictionDiffSet.getPolitStatus();
                ArrayList arrayList9 = new ArrayList(C56403yEb.AYXKKw(politStatus, 10));
                Iterator<T> it9 = politStatus.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(((OKComplianceRestrictionService.Feature) it9.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> action = featureRestrictionDiffSet.getAction();
                ArrayList arrayList10 = new ArrayList(C56403yEb.AYXKKw(action, 10));
                Iterator<T> it10 = action.iterator();
                while (it10.hasNext()) {
                    arrayList10.add(((OKComplianceRestrictionService.Feature) it10.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> removeUserFlag = featureRestrictionDiffSet.getRemoveUserFlag();
                ArrayList arrayList11 = new ArrayList(C56403yEb.AYXKKw(removeUserFlag, 10));
                Iterator<T> it11 = removeUserFlag.iterator();
                while (it11.hasNext()) {
                    arrayList11.add(((OKComplianceRestrictionService.Feature) it11.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Feature> featureModes = featureRestrictionDiffSet.getFeatureModes();
                ArrayList arrayList12 = new ArrayList(C56403yEb.AYXKKw(featureModes, 10));
                Iterator<T> it12 = featureModes.iterator();
                while (it12.hasNext()) {
                    arrayList12.add(((OKComplianceRestrictionService.Feature) it12.next()).getType());
                }
                LinkedHashSet<OKComplianceRestrictionService.Mode> mode = featureRestrictionDiffSet.getMode();
                ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(mode, 10));
                Iterator<T> it13 = mode.iterator();
                while (it13.hasNext()) {
                    arrayList13.add(((OKComplianceRestrictionService.Mode) it13.next()).getModeName());
                }
                LinkedHashSet<OKComplianceRestrictionService.Mode> crTradingModes = featureRestrictionDiffSet.getCrTradingModes();
                ArrayList arrayList14 = new ArrayList(C56403yEb.AYXKKw(crTradingModes, 10));
                Iterator<T> it14 = crTradingModes.iterator();
                while (it14.hasNext()) {
                    arrayList14.add(((OKComplianceRestrictionService.Mode) it14.next()).getModeName());
                }
                LinkedHashSet<OKComplianceRestrictionService.Mode> crTradingPageModes = featureRestrictionDiffSet.getCrTradingPageModes();
                ArrayList arrayList15 = new ArrayList(C56403yEb.AYXKKw(crTradingPageModes, 10));
                Iterator<T> it15 = crTradingPageModes.iterator();
                while (it15.hasNext()) {
                    arrayList15.add(((OKComplianceRestrictionService.Mode) it15.next()).getModeName());
                }
                ALB.emitNativeFeatureRestrictionEvent(new AbstractC2440ALv.TaskDescription(new C2436ALr(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, arrayList15, featureRestrictionDiffSet.getEntityIdChange(), featureRestrictionDiffSet.getLanguageChange())));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<FeatureRestrictionDiffSet> sharedFlowGHZMYf = this.this$0.AEQbTJ.gHZMYf();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlowGHZMYf, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
