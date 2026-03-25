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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C43746rvB;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC43709ruR;

/* JADX INFO: loaded from: classes10.dex */
public final class KYCRepositoryImpl$postMultiVendorVerify$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<MultiVendorVerifyResponse>>, Object> {
    final /* synthetic */ List<SingleFileUploadUseCase.UploadedFile> $images;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ C43746rvB $this_runOrErrorResponse;
    final /* synthetic */ int $vendorType;
    final /* synthetic */ int $verifyType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KYCRepositoryImpl$postMultiVendorVerify$2$1(List<SingleFileUploadUseCase.UploadedFile> list, int i, int i2, String str, C43746rvB c43746rvB, Continuation<? super KYCRepositoryImpl$postMultiVendorVerify$2$1> continuation) {
        super(2, continuation);
        this.$images = list;
        this.$vendorType = i;
        this.$verifyType = i2;
        this.$sessionId = str;
        this.$this_runOrErrorResponse = c43746rvB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KYCRepositoryImpl$postMultiVendorVerify$2$1(this.$images, this.$vendorType, this.$verifyType, this.$sessionId, this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<MultiVendorVerifyResponse>> continuation) {
        return ((KYCRepositoryImpl$postMultiVendorVerify$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            for (SingleFileUploadUseCase.UploadedFile uploadedFile : this.$images) {
                arrayList.add(new KycImage(uploadedFile.getImageId(), uploadedFile.getImageName(), uploadedFile.getImageType(), (String) null, (String) null, 24, (DefaultConstructorMarker) null));
            }
            MultiVendorRequest multiVendorRequest = new MultiVendorRequest(arrayList, this.$vendorType, this.$verifyType, this.$sessionId, (String) null, 16, (DefaultConstructorMarker) null);
            InterfaceC43709ruR interfaceC43709ruR = this.$this_runOrErrorResponse.copydefault;
            this.label = 1;
            obj = interfaceC43709ruR.KWHzl(multiVendorRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        }
        ResponseData responseData = (ResponseData) obj;
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getMsg(), responseData.getData(), responseData.getMsg());
    }
}
