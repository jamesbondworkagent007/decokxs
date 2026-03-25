package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKycFormSubmissionBody;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.okrisk.OKRiskConstantKeys;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C43746rvB;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC43709ruR;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$postOnboardingInfo$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<OnDemandKYCAppModel>>, Object> {
    final /* synthetic */ String $cor;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $id;
    final /* synthetic */ String $language;
    final /* synthetic */ Map<String, Object> $map;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $target;
    final /* synthetic */ C43746rvB $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$postOnboardingInfo$8$1(String str, String str2, Map<String, String> map, C43746rvB c43746rvB, String str3, String str4, Map<String, Object> map2, String str5, String str6, Continuation<? super KYCRepositoryImpl$postOnboardingInfo$8$1> continuation) {
        super(2, continuation);
        this.$id = str;
        this.$target = str2;
        this.$params = map;
        this.$this_runOrErrorResponse = c43746rvB;
        this.$playbook = str3;
        this.$featureUri = str4;
        this.$map = map2;
        this.$cor = str5;
        this.$language = str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCRepositoryImpl$postOnboardingInfo$8$1(this.$id, this.$target, this.$params, this.$this_runOrErrorResponse, this.$playbook, this.$featureUri, this.$map, this.$cor, this.$language, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<OnDemandKYCAppModel>> continuation) {
        return ((KYCRepositoryImpl$postOnboardingInfo$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("CTA_SUBMIT", "postOnboardingInfo2->pageId = " + this.$id + ",target = " + this.$target);
            Map<String, String> mapIsConnected = C56424yEw.isConnected(this.$params);
            OKRiskConstantKeys oKRiskConstantKeys = OKRiskConstantKeys.NO_SEC;
            if (!mapIsConnected.containsKey(oKRiskConstantKeys.getValue())) {
                mapIsConnected.put(oKRiskConstantKeys.getValue(), "true");
            }
            InterfaceC43709ruR interfaceC43709ruR = this.$this_runOrErrorResponse.copydefault;
            String str = this.$playbook;
            String str2 = this.$featureUri;
            OnDemandKycFormSubmissionBody onDemandKycFormSubmissionBody = new OnDemandKycFormSubmissionBody("form-submission", this.$id, this.$map, this.$target);
            this.label = 1;
            objAEQbTJ = interfaceC43709ruR.AEQbTJ(str, str2, onDemandKycFormSubmissionBody, mapIsConnected, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        ResponseData responseData = (ResponseData) objAEQbTJ;
        OnDemandKYCResponse onDemandKYCResponse = (OnDemandKYCResponse) responseData.getData();
        if (onDemandKYCResponse != null) {
            C43746rvB c43746rvB = this.$this_runOrErrorResponse;
            String str3 = this.$cor;
            String str4 = this.$language;
            JsonObject viewModel = onDemandKYCResponse.getViewModel();
            if (viewModel == null || viewModel.isEmpty()) {
                return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), new OnDemandKYCAppModel(onDemandKYCResponse.getCompliant(), true, onDemandKYCResponse.getProfile(), (PageComponentAppModel) null, 8, (DefaultConstructorMarker) null), responseData.getMsg());
            }
            JsonObject viewModel2 = onDemandKYCResponse.getViewModel();
            int code = responseData.getCode();
            String msg = responseData.getMsg();
            String detailMsg = responseData.getDetailMsg();
            String msg2 = responseData.getMsg();
            boolean compliant = onDemandKYCResponse.getCompliant();
            PageComponentProfile profile = onDemandKYCResponse.getProfile();
            PageComponentProfile profile2 = onDemandKYCResponse.getProfile();
            return new ResponseData(code, msg, detailMsg, msg2, new OnDemandKYCAppModel(compliant, true, profile, c43746rvB.AEQbTJ(viewModel2, str3, str4, profile2 != null ? profile2.getCountryOfResidence() : null)), responseData.getMsg());
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), null, responseData.getMsg());
    }
}
