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
import o.InterfaceC43702ruK;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class OKXComplianceApiImpl$getKycInfoFromCache$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $error;
    final /* synthetic */ Function1<KycInfoListBean, Unit> $success;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.kyc.api.biz.bean.KycInfoListBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKXComplianceApiImpl$getKycInfoFromCache$1(Function1<? super KycInfoListBean, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super OKXComplianceApiImpl$getKycInfoFromCache$1> continuation) {
        super(2, continuation);
        this.$success = function1;
        this.$error = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKXComplianceApiImpl$getKycInfoFromCache$1 oKXComplianceApiImpl$getKycInfoFromCache$1 = new OKXComplianceApiImpl$getKycInfoFromCache$1(this.$success, this.$error, continuation);
        oKXComplianceApiImpl$getKycInfoFromCache$1.L$0 = obj;
        return oKXComplianceApiImpl$getKycInfoFromCache$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXComplianceApiImpl$getKycInfoFromCache$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objWithContext;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                try {
                } catch (Throwable th) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (Exception e) {
                pUU.copydefault("qjf", "Exception = " + e.getMessage());
                Unit unit = Unit.INSTANCE;
            }
        } catch (Exception e2) {
            pUU.copydefault("OKXComplianceApiImpl", "getKycInfoFromCache-callback-exception: " + e2.getMessage());
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OKXComplianceApiImpl$getKycInfoFromCache$1$apiResult$1$1 oKXComplianceApiImpl$getKycInfoFromCache$1$apiResult$1$1 = new OKXComplianceApiImpl$getKycInfoFromCache$1$apiResult$1$1(null);
            this.label = 1;
            objWithContext = BuildersKt.withContext(io2, oKXComplianceApiImpl$getKycInfoFromCache$1$apiResult$1$1, this);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objWithContext = obj;
        }
        ResponseData responseData = (ResponseData) objWithContext;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            this.$success.invoke((KycInfoListBean) ((AbstractC43419rot.StateListAnimator) actionBar).AEQbTJ());
            InterfaceC43702ruK instance$default = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
            this.label = 2;
            if (InterfaceC43702ruK.Application.getKycInfoData$default(instance$default, "1", null, null, null, this, 14, null) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$error.invoke(((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage());
        return Unit.INSTANCE;
    }
}
