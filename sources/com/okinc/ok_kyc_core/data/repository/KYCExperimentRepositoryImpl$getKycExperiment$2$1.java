package com.okinc.ok_kyc_core.data.repository;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.KycExperimentResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.C43789rvs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43704ruM;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCExperimentRepositoryImpl$getKycExperiment$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<KycExperimentResponse>>, Object> {
    final /* synthetic */ String $cor;
    final /* synthetic */ C43789rvs $this_runOrErrorResponse;
    final /* synthetic */ boolean $useCache;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCExperimentRepositoryImpl$getKycExperiment$2$1(boolean z, C43789rvs c43789rvs, String str, Continuation<? super KYCExperimentRepositoryImpl$getKycExperiment$2$1> continuation) {
        super(2, continuation);
        this.$useCache = z;
        this.$this_runOrErrorResponse = c43789rvs;
        this.$cor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCExperimentRepositoryImpl$getKycExperiment$2$1(this.$useCache, this.$this_runOrErrorResponse, this.$cor, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<KycExperimentResponse>> continuation) {
        return ((KYCExperimentRepositoryImpl$getKycExperiment$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        boolean zCopydefault;
        KycExperimentResponse kycExperimentResponse;
        KycExperimentResponse kycExperimentResponse2;
        KycExperimentResponse kycExperimentResponse3;
        KycExperimentResponse kycExperimentResponse4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            KycExperimentResponse kycExperimentResponse5 = this.$useCache ? (KycExperimentResponse) SPUtils.getObject("sp_experiment_data", KycExperimentResponse.class, "kyc_experiment") : null;
            if (this.$useCache) {
                zCopydefault = this.$this_runOrErrorResponse.copydefault(this.$cor);
                if (zCopydefault && kycExperimentResponse5 != null) {
                    pUU.KWHzl("KYCExperimentRepositoryImpl", "Using cached experiment data (within 5min), updating in background");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(this.$this_runOrErrorResponse.AEQbTJ.AEQbTJ())), null, null, new AnonymousClass1(this.$this_runOrErrorResponse, this.$cor, null), 3, null);
                    return new ResponseData(0, "Success", "Cached data", null, kycExperimentResponse5, null, 40, null);
                }
            } else {
                zCopydefault = false;
            }
            if (!this.$useCache || !zCopydefault || kycExperimentResponse5 == null) {
                try {
                    pUU.KWHzl("KYCExperimentRepositoryImpl", "Fetching experiment data from API for cor: " + this.$cor);
                    KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1 kYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1 = new KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1(this.$this_runOrErrorResponse, null);
                    this.L$0 = kycExperimentResponse5;
                    this.label = 1;
                    obj = TimeoutKt.withTimeout(5000L, kYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    kycExperimentResponse = kycExperimentResponse5;
                } catch (TimeoutCancellationException unused) {
                    kycExperimentResponse = kycExperimentResponse5;
                    kycExperimentResponse3 = kycExperimentResponse;
                    pUU.valueOf("KYCExperimentRepositoryImpl", "API call timeout (5s), returning cached data: " + kycExperimentResponse3);
                    if (kycExperimentResponse3 == null) {
                        return new ResponseData(0, "Success", "Cached data due to API timeout", null, kycExperimentResponse3, null, 40, null);
                    }
                    throw new ResponseFailedException(0, "API timeout and no cached data available", null, null, 13, null);
                } catch (Exception e) {
                    e = e;
                    kycExperimentResponse = kycExperimentResponse5;
                    kycExperimentResponse2 = kycExperimentResponse;
                    pUU.copydefault("KYCExperimentRepositoryImpl", "API call failed: " + e + ", returning cached data: " + kycExperimentResponse2);
                    if (kycExperimentResponse2 == null) {
                        return new ResponseData(0, "Success", "Cached data due to API error", null, kycExperimentResponse2, null, 40, null);
                    }
                    throw e;
                }
            } else {
                return new ResponseData(0, "Success", "Cached data", null, kycExperimentResponse5, null, 40, null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kycExperimentResponse = (KycExperimentResponse) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (TimeoutCancellationException unused2) {
                kycExperimentResponse3 = kycExperimentResponse;
                pUU.valueOf("KYCExperimentRepositoryImpl", "API call timeout (5s), returning cached data: " + kycExperimentResponse3);
                if (kycExperimentResponse3 == null) {
                }
            } catch (Exception e2) {
                e = e2;
                kycExperimentResponse2 = kycExperimentResponse;
                pUU.copydefault("KYCExperimentRepositoryImpl", "API call failed: " + e + ", returning cached data: " + kycExperimentResponse2);
                if (kycExperimentResponse2 == null) {
                }
            }
        }
        ResponseData responseData = (ResponseData) obj;
        if (!this.$useCache || (kycExperimentResponse4 = (KycExperimentResponse) responseData.getData()) == null) {
            return responseData;
        }
        C43789rvs c43789rvs = this.$this_runOrErrorResponse;
        String str = this.$cor;
        c43789rvs.copydefault(kycExperimentResponse4, str);
        pUU.KWHzl("KYCExperimentRepositoryImpl", "Experiment data cached successfully for cor: " + str + " (5min expiry)");
        return responseData;
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperiment$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cor;
        final /* synthetic */ C43789rvs $this_runOrErrorResponse;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C43789rvs c43789rvs, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_runOrErrorResponse = c43789rvs;
            this.$cor = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_runOrErrorResponse, this.$cor, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C05151 c05151 = new C05151(this.$this_runOrErrorResponse, this.$cor, null);
                    this.label = 1;
                    obj = TimeoutKt.withTimeout(5000L, c05151, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                pUU.valueOf("KYCExperimentRepositoryImpl", "Background cache update failed: " + e);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.ok_kyc_core.data.repository.KYCExperimentRepositoryImpl$getKycExperiment$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $cor;
            final /* synthetic */ C43789rvs $this_runOrErrorResponse;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05151(C43789rvs c43789rvs, String str, Continuation<? super C05151> continuation) {
                super(2, continuation);
                this.$this_runOrErrorResponse = c43789rvs;
                this.$cor = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05151(this.$this_runOrErrorResponse, this.$cor, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC43704ruM interfaceC43704ruMCopydefault = this.$this_runOrErrorResponse.copydefault();
                    this.label = 1;
                    obj = InterfaceC43704ruM.TaskDescription.getExperiment$default(interfaceC43704ruMCopydefault, null, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                KycExperimentResponse kycExperimentResponse = (KycExperimentResponse) ((ResponseData) obj).getData();
                if (kycExperimentResponse == null) {
                    return null;
                }
                C43789rvs c43789rvs = this.$this_runOrErrorResponse;
                String str = this.$cor;
                c43789rvs.copydefault(kycExperimentResponse, str);
                pUU.KWHzl("KYCExperimentRepositoryImpl", "Background cache update successful for cor: " + str);
                return Unit.INSTANCE;
            }
        }
    }
}
