package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.KycExperimentResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43789rvs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43704ruM;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<KycExperimentResponse>>, Object> {
    final /* synthetic */ C43789rvs $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1(C43789rvs c43789rvs, Continuation<? super KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c43789rvs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<KycExperimentResponse>> continuation) {
        return ((KYCExperimentRepositoryImpl$getKycExperiment$2$1$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        return obj;
    }
}
