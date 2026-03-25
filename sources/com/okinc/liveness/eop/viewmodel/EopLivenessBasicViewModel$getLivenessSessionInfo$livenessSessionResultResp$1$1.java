package com.okinc.liveness.eop.viewmodel;

import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.bean.LivenessSessionInfoRequest;
import com.okinc.liveness.eop.bean.LivenessSessionInfoResp;
import com.okinc.network.okg.response.ResponseData;
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

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<LivenessSessionInfoResp>>, Object> {
    final /* synthetic */ String $metaInfo;
    final /* synthetic */ EopLivenessBasicViewModel $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, Continuation<? super EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = eopLivenessBasicViewModel;
        this.$metaInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1(this.$this_runOrErrorResponse, this.$metaInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<LivenessSessionInfoResp>> continuation) {
        return ((EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map<String, String> mapKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pQF pqfOLrzqt = pQF.Companion.OLrzqt();
            LivenessSessionInfoRequest livenessSessionInfoRequest = new LivenessSessionInfoRequest(this.$this_runOrErrorResponse.DTwDnp(), this.$metaInfo);
            FacialExtParams facialExtParamsFJNWhG = this.$this_runOrErrorResponse.fJNWhG();
            if (facialExtParamsFJNWhG == null || (mapKWHzl = facialExtParamsFJNWhG.getCustomHeader()) == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            this.label = 1;
            obj = pqfOLrzqt.OLrzqt(livenessSessionInfoRequest, mapKWHzl, this);
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
