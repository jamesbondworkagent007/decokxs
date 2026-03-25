package com.okinc.ok_kyc_core.impl;

import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class OKXComplianceApiImpl$getKycLevelTag$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $error;
    final /* synthetic */ Function2<String, Integer, Unit> $success;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKXComplianceApiImpl$getKycLevelTag$1(Function2<? super String, ? super Integer, Unit> function2, Function1<? super String, Unit> function1, Continuation<? super OKXComplianceApiImpl$getKycLevelTag$1> continuation) {
        super(2, continuation);
        this.$success = function2;
        this.$error = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKXComplianceApiImpl$getKycLevelTag$1 oKXComplianceApiImpl$getKycLevelTag$1 = new OKXComplianceApiImpl$getKycLevelTag$1(this.$success, this.$error, continuation);
        oKXComplianceApiImpl$getKycLevelTag$1.L$0 = obj;
        return oKXComplianceApiImpl$getKycLevelTag$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXComplianceApiImpl$getKycLevelTag$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Integer tagType;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String tagStr = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1 oKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1 = new OKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, oKXComplianceApiImpl$getKycLevelTag$1$apiResult$1$1, this);
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
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            KycInfoListBean kycInfoListBean = (KycInfoListBean) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ();
            KycInfoListBean.PersonalBean personal = kycInfoListBean.getPersonal();
            KycInfoListBean.CompanyBean company = kycInfoListBean.getCompany();
            if (personal != null) {
                tagStr = personal.getTagStr();
                tagType = personal.getTagType();
            } else if (company != null) {
                tagStr = company.getTagStr();
                tagType = company.getTagType();
            } else {
                tagType = null;
            }
            this.$success.invoke(tagStr, tagType);
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            this.$error.invoke(((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage());
        }
        return Unit.INSTANCE;
    }
}
