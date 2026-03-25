package com.okinc.ok_kyc_core.data.repository;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.KycImage;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorRequest;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43746rvB;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$postEncryptVerify$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<MultiVendorVerifyResponse>>, Object> {
    final /* synthetic */ List<SingleFileUploadUseCase.UploadedFile> $images;
    final /* synthetic */ String $mrz;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ C43746rvB $this_runOrErrorResponse;
    final /* synthetic */ int $vendorType;
    final /* synthetic */ int $verifyType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$postEncryptVerify$2$1(List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, String str, String str2, C43746rvB c43746rvB, Continuation<? super KYCRepositoryImpl$postEncryptVerify$2$1> continuation) {
        super(2, continuation);
        this.$images = list;
        this.$vendorType = i;
        this.$verifyType = i2;
        this.$sessionId = str;
        this.$mrz = str2;
        this.$this_runOrErrorResponse = c43746rvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCRepositoryImpl$postEncryptVerify$2$1(this.$images, this.$vendorType, this.$verifyType, this.$sessionId, this.$mrz, this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<MultiVendorVerifyResponse>> continuation) {
        return ((KYCRepositoryImpl$postEncryptVerify$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objPostEncryptVerify$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objPostEncryptVerify$default = obj;
        } else {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            for (SingleFileUploadUseCase.UploadedFile uploadedFile : this.$images) {
                arrayList.add(new KycImage(uploadedFile.getImageId(), uploadedFile.getImageName(), uploadedFile.getImageType(), uploadedFile.getWidth(), uploadedFile.getHeight()));
            }
            MultiVendorRequest multiVendorRequest = new MultiVendorRequest(arrayList, this.$vendorType, this.$verifyType, this.$sessionId, this.$mrz);
            InterfaceC43709ruR interfaceC43709ruR = this.$this_runOrErrorResponse.copydefault;
            this.label = 1;
            objPostEncryptVerify$default = InterfaceC43709ruR.TaskDescription.postEncryptVerify$default(interfaceC43709ruR, multiVendorRequest, null, this, 2, null);
            if (objPostEncryptVerify$default == objCopydefault) {
                return objCopydefault;
            }
        }
        ResponseData responseData = (ResponseData) objPostEncryptVerify$default;
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), responseData.getData(), responseData.getMsg());
    }
}
