package com.okinc.okimcore.feature.message.contractaddress.repository.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.room.inhouseim.ContractAddressTokenInfo;
import kotlin.coroutines.Continuation;
import o.sEJ;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMContractAddressService {
    @POST("/priapi/v1/im/contract-address/v1/preview")
    Object getTokenPreview(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") long j, @Body @NotNull ContractAddressRequest contractAddressRequest, @NotNull Continuation<? super ResponseData<ContractAddressTokenInfo>> continuation);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static /* synthetic */ Object getTokenPreview$default(InHouseIMContractAddressService inHouseIMContractAddressService, String str, long j, ContractAddressRequest contractAddressRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTokenPreview");
            }
            if ((i & 1) != 0) {
                str = "FIRST_CACHE";
            }
            String str2 = str;
            if ((i & 2) != 0) {
                j = sEJ.KWHzl.OLrzqt();
            }
            return inHouseIMContractAddressService.getTokenPreview(str2, j, contractAddressRequest, continuation);
        }
    }
}
