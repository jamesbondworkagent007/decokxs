package com.okinc.ok_kyc_core.impl;

import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43702ruK;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class OKXComplianceApiImpl$getKycInfoFromCache$2 extends SuspendLambda implements Function2<FlowCollector<? super KycInfoListBean>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKXComplianceApiImpl$getKycInfoFromCache$2(Continuation<? super OKXComplianceApiImpl$getKycInfoFromCache$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKXComplianceApiImpl$getKycInfoFromCache$2 oKXComplianceApiImpl$getKycInfoFromCache$2 = new OKXComplianceApiImpl$getKycInfoFromCache$2(continuation);
        oKXComplianceApiImpl$getKycInfoFromCache$2.L$0 = obj;
        return oKXComplianceApiImpl$getKycInfoFromCache$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super KycInfoListBean> flowCollector, Continuation<? super Unit> continuation) {
        return ((OKXComplianceApiImpl$getKycInfoFromCache$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #2 {all -> 0x003d, blocks: (B:15:0x0037, B:24:0x005c, B:26:0x0064, B:28:0x006a, B:29:0x0077), top: B:58:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objWithContext;
        FlowCollector flowCollector2;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        InterfaceC43702ruK instance$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.copydefault("qjf", "Exception = " + e.getMessage());
            Unit unit = Unit.INSTANCE;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                OKXComplianceApiImpl$getKycInfoFromCache$2$apiResult$1$1 oKXComplianceApiImpl$getKycInfoFromCache$2$apiResult$1$1 = new OKXComplianceApiImpl$getKycInfoFromCache$2$apiResult$1$1(null);
                this.L$0 = flowCollector;
                this.label = 1;
                objWithContext = BuildersKt.withContext(io2, oKXComplianceApiImpl$getKycInfoFromCache$2$apiResult$1$1, this);
            } catch (Throwable th) {
                th = th;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                flowCollector2 = flowCollector;
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            flowCollector2 = flowCollector;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                instance$default = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
                this.label = 3;
                if (InterfaceC43702ruK.Application.getKycInfoData$default(instance$default, "1", null, null, null, this, 14, null) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            if (i == 3) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
        flowCollector2 = (FlowCollector) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            objWithContext = obj;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th2) {
            th = th2;
            flowCollector = flowCollector2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            flowCollector2 = flowCollector;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Object objCopydefault2 = ((AbstractC43419rot.StateListAnimator) actionBar).copydefault();
            this.L$0 = null;
            this.label = 2;
            if (flowCollector2.emit(objCopydefault2, this) == objCopydefault) {
                return objCopydefault;
            }
            instance$default = InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null);
            this.label = 3;
            if (InterfaceC43702ruK.Application.getKycInfoData$default(instance$default, "1", null, null, null, this, 14, null) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        this.L$0 = null;
        this.label = 4;
        if (flowCollector2.emit(null, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
