package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
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
import o.C56442yFn;
import o.InterfaceC43709ruR;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$getOnboardingInfo$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<OnDemandKYCAppModel>>, Object> {
    final /* synthetic */ String $cor;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $language;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ C43746rvB $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$getOnboardingInfo$2$1(C43746rvB c43746rvB, String str, String str2, Map<String, String> map, String str3, String str4, Continuation<? super KYCRepositoryImpl$getOnboardingInfo$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c43746rvB;
        this.$featureUri = str;
        this.$playbook = str2;
        this.$params = map;
        this.$cor = str3;
        this.$language = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCRepositoryImpl$getOnboardingInfo$2$1(this.$this_runOrErrorResponse, this.$featureUri, this.$playbook, this.$params, this.$cor, this.$language, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<OnDemandKYCAppModel>> continuation) {
        return ((KYCRepositoryImpl$getOnboardingInfo$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43709ruR interfaceC43709ruR = this.$this_runOrErrorResponse.copydefault;
            String str = this.$featureUri;
            String str2 = this.$playbook;
            Map<String, String> map = this.$params;
            this.label = 1;
            objEZpvd = interfaceC43709ruR.EZpvd(str, str2, map, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        }
        ResponseData responseData = (ResponseData) objEZpvd;
        OnDemandKYCResponse onDemandKYCResponse = (OnDemandKYCResponse) responseData.getData();
        if (onDemandKYCResponse != null) {
            C43746rvB c43746rvB = this.$this_runOrErrorResponse;
            String str3 = this.$cor;
            String str4 = this.$language;
            JsonObject viewModel = onDemandKYCResponse.getViewModel();
            if (viewModel == null || viewModel.isEmpty()) {
                return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), new OnDemandKYCAppModel(onDemandKYCResponse.getCompliant(), onDemandKYCResponse.getOnDemandFeatureFlagEnabled(), onDemandKYCResponse.getProfile(), (PageComponentAppModel) null, 8, (DefaultConstructorMarker) null), responseData.getMsg());
            }
            JsonObject viewModel2 = onDemandKYCResponse.getViewModel();
            int code = responseData.getCode();
            String msg = responseData.getMsg();
            String detailMsg = responseData.getDetailMsg();
            String msg2 = responseData.getMsg();
            boolean compliant = onDemandKYCResponse.getCompliant();
            boolean onDemandFeatureFlagEnabled = onDemandKYCResponse.getOnDemandFeatureFlagEnabled();
            PageComponentProfile profile = onDemandKYCResponse.getProfile();
            PageComponentProfile profile2 = onDemandKYCResponse.getProfile();
            return new ResponseData(code, msg, detailMsg, msg2, new OnDemandKYCAppModel(compliant, onDemandFeatureFlagEnabled, profile, c43746rvB.AEQbTJ(viewModel2, str3, str4, profile2 != null ? profile2.getCountryOfResidence() : null)), responseData.getMsg());
        }
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), null, responseData.getMsg());
    }
}
