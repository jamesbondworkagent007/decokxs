package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.message.contractaddress.GetTokenPreviewUseCase$getTokenPreview$1;
import com.okinc.okimcore.feature.message.contractaddress.repository.remote.ContractAddressRequest;
import com.okinc.okimcore.feature.message.contractaddress.repository.remote.InHouseIMContractAddressService;
import com.okinc.okimcore.model.room.inhouseim.ContractAddressTokenInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sKg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44288sKg {
    public final InHouseIMContractAddressService copydefault;

    @yCM
    public C44288sKg(@NotNull InHouseIMContractAddressService inHouseIMContractAddressService) {
        Intrinsics.checkNotNullParameter(inHouseIMContractAddressService, "");
        this.copydefault = inHouseIMContractAddressService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<ContractAddressTokenInfo, OKServerException>> continuation) throws java.lang.Throwable {
        GetTokenPreviewUseCase$getTokenPreview$1 getTokenPreviewUseCase$getTokenPreview$1;
        AbstractC43419rot.ActionBar actionBar;
        ResponseData responseData;
        if (continuation instanceof GetTokenPreviewUseCase$getTokenPreview$1) {
            getTokenPreviewUseCase$getTokenPreview$1 = (GetTokenPreviewUseCase$getTokenPreview$1) continuation;
            int i = getTokenPreviewUseCase$getTokenPreview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTokenPreviewUseCase$getTokenPreview$1.label = i - Integer.MIN_VALUE;
            } else {
                getTokenPreviewUseCase$getTokenPreview$1 = new GetTokenPreviewUseCase$getTokenPreview$1(this, continuation);
            }
        }
        GetTokenPreviewUseCase$getTokenPreview$1 getTokenPreviewUseCase$getTokenPreview$12 = getTokenPreviewUseCase$getTokenPreview$1;
        java.lang.Object tokenPreview$default = getTokenPreviewUseCase$getTokenPreview$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getTokenPreviewUseCase$getTokenPreview$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(tokenPreview$default);
                InHouseIMContractAddressService inHouseIMContractAddressService = this.copydefault;
                ContractAddressRequest contractAddressRequest = new ContractAddressRequest(list);
                getTokenPreviewUseCase$getTokenPreview$12.label = 1;
                tokenPreview$default = InHouseIMContractAddressService.Activity.getTokenPreview$default(inHouseIMContractAddressService, null, 0L, contractAddressRequest, getTokenPreviewUseCase$getTokenPreview$12, 3, null);
                if (tokenPreview$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(tokenPreview$default);
            }
            responseData = (ResponseData) tokenPreview$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return new AbstractC43419rot.StateListAnimator(data);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        return actionBar;
    }
}
