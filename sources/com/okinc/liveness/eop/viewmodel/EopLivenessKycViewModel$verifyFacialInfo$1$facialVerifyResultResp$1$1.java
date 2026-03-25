package com.okinc.liveness.eop.viewmodel;

import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.bean.FacialVerifyReqBody;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.pQF;
import o.pRY;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<FacialInfoResult>>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ pRY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1(String str, pRY pry, Continuation<? super EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1> continuation) {
        super(2, continuation);
        this.$sessionId = str;
        this.this$0 = pry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1(this.$sessionId, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<FacialInfoResult>> continuation) {
        return ((EopLivenessKycViewModel$verifyFacialInfo$1$facialVerifyResultResp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map<String, String> mapKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pQF pqfOLrzqt = pQF.Companion.OLrzqt();
            FacialVerifyReqBody facialVerifyReqBody = new FacialVerifyReqBody(this.$sessionId);
            FacialExtParams facialExtParamsOLrzqt = this.this$0.OLrzqt();
            if (facialExtParamsOLrzqt == null || (mapKWHzl = facialExtParamsOLrzqt.getCustomHeader()) == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            this.label = 1;
            obj = pqfOLrzqt.KWHzl(facialVerifyReqBody, mapKWHzl, this);
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
