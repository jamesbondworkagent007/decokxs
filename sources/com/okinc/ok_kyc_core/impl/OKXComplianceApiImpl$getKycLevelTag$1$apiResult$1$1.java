package com.okinc.ok_kyc_core.impl;

import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43702ruK;

/* JADX INFO: loaded from: classes23.dex */
public final class OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<KycInfoListBean>>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1(Continuation<? super OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<KycInfoListBean>> continuation) {
        return ((OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43702ruK instance$default = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
            this.label = 1;
            obj = InterfaceC43702ruK.Application.getKycInfoData$default(instance$default, "1", null, null, null, this, 14, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ResponseData responseData = (ResponseData) obj;
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), responseData.getData(), responseData.getMsg());
    }
}
