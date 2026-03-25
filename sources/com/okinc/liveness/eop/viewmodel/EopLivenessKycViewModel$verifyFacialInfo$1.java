package com.okinc.liveness.eop.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.pRY;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessKycViewModel$verifyFacialInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pRY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessKycViewModel$verifyFacialInfo$1(pRY pry, String str, Continuation<? super EopLivenessKycViewModel$verifyFacialInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = pry;
        this.$sessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopLivenessKycViewModel$verifyFacialInfo$1 eopLivenessKycViewModel$verifyFacialInfo$1 = new EopLivenessKycViewModel$verifyFacialInfo$1(this.this$0, this.$sessionId, continuation);
        eopLivenessKycViewModel$verifyFacialInfo$1.L$0 = obj;
        return eopLivenessKycViewModel$verifyFacialInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessKycViewModel$verifyFacialInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:31)|(1:(1:5)(2:9|10))(4:11|(3:13|14|(1:16))|29|30)|17|(2:22|23)(1:21)|32|25|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r11.this$0.AEQbTJ().setValue(r12);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                String str = this.$sessionId;
                pRY pry = this.this$0;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1 eopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1 = new EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1(str, pry, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, eopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        ResponseData responseData = (ResponseData) obj;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Object data = responseData.getData();
            Intrinsics.copydefault(data);
            actionBar = new AbstractC43419rot.StateListAnimator(data);
        } else {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        }
        this.this$0.EZpvd().setValue((FacialInfoResult) actionBar.AEQbTJ());
        return Unit.INSTANCE;
    }
}
