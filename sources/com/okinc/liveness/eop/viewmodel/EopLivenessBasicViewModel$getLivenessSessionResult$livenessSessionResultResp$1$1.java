package com.okinc.liveness.eop.viewmodel;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.bean.AwsSessionResultResp;
import com.okinc.liveness.eop.bean.LivenessRouter;
import com.okinc.liveness.eop.bean.LivenessSessionResultRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C6885aXn;
import o.C6887aXp;
import o.InterfaceC6884aXm;
import o.pQF;
import o.rTL;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<AwsSessionResultResp>>, Object> {
    final /* synthetic */ Ref.ObjectRef<String> $efrResult;
    final /* synthetic */ String $extMsg;
    final /* synthetic */ EopLivenessBasicViewModel $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, Ref.ObjectRef<String> objectRef, Continuation<? super EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = eopLivenessBasicViewModel;
        this.$extMsg = str;
        this.$efrResult = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1(this.$this_runOrErrorResponse, this.$extMsg, this.$efrResult, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<AwsSessionResultResp>> continuation) {
        return ((EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LivenessSessionResultRequest livenessSessionResultRequest;
        Map<String, String> mapKWHzl;
        String strEZpvd;
        C6885aXn c6885aXnAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((Object) this.$this_runOrErrorResponse.QOLQEE(), (Object) LivenessRouter.ALI.getVendorName())) {
                String strGEmmrt = C33129mqd.gEmmrt(rTL.OLrzqt.EZpvd());
                if (strGEmmrt.length() > 0) {
                    C6887aXp c6887aXp = C6887aXp.copydefault;
                    byte[] bytes = strGEmmrt.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    strEZpvd = c6887aXp.EZpvd(bytes);
                } else {
                    strEZpvd = MultiTransferSignData.DEFAULT_INTERVAL;
                }
                String str = strEZpvd;
                InterfaceC6884aXm interfaceC6884aXmOLrzqt = C6887aXp.copydefault.OLrzqt();
                livenessSessionResultRequest = new LivenessSessionResultRequest(null, this.$this_runOrErrorResponse.DTwDnp(), this.$extMsg, null, this.$efrResult.element, strGEmmrt, str, (interfaceC6884aXmOLrzqt == null || (c6885aXnAEQbTJ = interfaceC6884aXmOLrzqt.AEQbTJ()) == null) ? null : c6885aXnAEQbTJ.EZpvd(), 8, null);
            } else {
                livenessSessionResultRequest = new LivenessSessionResultRequest(null, this.$this_runOrErrorResponse.DTwDnp(), this.$extMsg, null, this.$efrResult.element, null, null, null, 232, null);
            }
            pQF pqfOLrzqt = pQF.Companion.OLrzqt();
            EopLivenessBasicViewModel eopLivenessBasicViewModel = this.$this_runOrErrorResponse;
            if (!Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr(), (Object) LivenessRouter.LCA.getVendorName())) {
                livenessSessionResultRequest.setFaceSessionId(eopLivenessBasicViewModel.uzCIH());
            } else {
                livenessSessionResultRequest.setEncryptionData(eopLivenessBasicViewModel.hDKMBd());
            }
            FacialExtParams facialExtParamsFJNWhG = this.$this_runOrErrorResponse.fJNWhG();
            if (facialExtParamsFJNWhG == null || (mapKWHzl = facialExtParamsFJNWhG.getCustomHeader()) == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
            this.label = 1;
            obj = pqfOLrzqt.EZpvd(livenessSessionResultRequest, mapKWHzl, this);
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
