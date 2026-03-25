package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import com.okinc.kyc.api.biz.restriction.FeatureRestrictionDiffSet;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC2440ALv;
import o.C2436ALr;
import o.C42502rVf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC2440ALv $event;
    int label;
    final /* synthetic */ FeatureRestrictionCoreRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1(AbstractC2440ALv abstractC2440ALv, FeatureRestrictionCoreRepository featureRestrictionCoreRepository, Continuation<? super FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1> continuation) {
        super(2, continuation);
        this.$event = abstractC2440ALv;
        this.this$0 = featureRestrictionCoreRepository;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1(this.$event, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC2440ALv abstractC2440ALv = this.$event;
            if (Intrinsics.EZpvd(abstractC2440ALv, AbstractC2440ALv.Application.INSTANCE)) {
                MutableSharedFlow mutableSharedFlow = this.this$0.DbNXlk;
                Unit unit = Unit.INSTANCE;
                this.label = 1;
                if (mutableSharedFlow.emit(unit, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (!(abstractC2440ALv instanceof AbstractC2440ALv.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2436ALr c2436ALrAEQbTJ = ((AbstractC2440ALv.TaskDescription) this.$event).AEQbTJ();
                MutableSharedFlow mutableSharedFlow2 = this.this$0.AhwBna;
                FeatureRestrictionDiffSet featureRestrictionDiffSet = new FeatureRestrictionDiffSet(this.this$0.KWHzl(c2436ALrAEQbTJ.AEQbTJ(), AnonymousClass1.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.OLrzqt(), AnonymousClass2.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.copydefault(), AnonymousClass3.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.valueOf(), AnonymousClass4.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.DbNXlk(), AnonymousClass5.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.gEmmrt(), AnonymousClass6.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.fIwbmz(), AnonymousClass7.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.isConnected(), AnonymousClass8.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.fetchVPNInfo(), AnonymousClass9.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.KWHzl(), AnonymousClass10.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.AuCTel(), AnonymousClass11.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.AYXKKw(), AnonymousClass12.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.values(), AnonymousClass13.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.EZpvd(), AnonymousClass14.INSTANCE), this.this$0.KWHzl(c2436ALrAEQbTJ.AhwBna(), AnonymousClass15.INSTANCE), c2436ALrAEQbTJ.djBIcL(), c2436ALrAEQbTJ.AkhnZx());
                this.label = 2;
                if (mutableSharedFlow2.emit(featureRestrictionDiffSet, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$6, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass6() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$7, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass7() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$8, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$9, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass9() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$10, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass10() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$11, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass11() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$12, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass12 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Feature> {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass12() {
            super(1, C42502rVf.class, "stringToFeature", "stringToFeature(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Feature;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Feature invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.copydefault(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$13, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass13 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Mode> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass13() {
            super(1, C42502rVf.class, "stringToMode", "stringToMode(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Mode;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Mode invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.OLrzqt(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$14, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Mode> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass14() {
            super(1, C42502rVf.class, "stringToMode", "stringToMode(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Mode;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Mode invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.OLrzqt(str);
        }
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$onFeatureRestrictionEvent$1$15, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass15 extends FunctionReferenceImpl implements Function1<String, OKComplianceRestrictionService.Mode> {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass15() {
            super(1, C42502rVf.class, "stringToMode", "stringToMode(Ljava/lang/String;)Lcom/okinc/kyc/api/biz/restriction/OKComplianceRestrictionService$Mode;", 1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final OKComplianceRestrictionService.Mode invoke(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C42502rVf.OLrzqt(str);
        }
    }
}
