package com.okinc.wholesale.net;

import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wholesale.bean.ActivateResult;
import com.okinc.wholesale.bean.InviteInfo;
import java.util.List;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56524yIo;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes24.dex */
public interface UDGrowthImageApiService {
    public static final StateListAnimator Companion = StateListAnimator.KWHzl;

    @POST("/priapi/opsplatform/crm/v1/vip-trial/invite/code/activate")
    AbstractC58185ywX<ResponseData<ActivateResult>> activateVip(@Body @NotNull InviteInfo inviteInfo);

    @POST
    @Multipart
    AbstractC58185ywX<JsonObject> mlnUploadFile(@Url @NotNull String str, @NotNull @Part List<MultipartBody.Part> list, @Header("i-u") @NotNull String str2);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator KWHzl = new StateListAnimator();

        private StateListAnimator() {
        }

        public final UDGrowthImageApiService OLrzqt() {
            return (UDGrowthImageApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(UDGrowthImageApiService.class));
        }
    }
}
