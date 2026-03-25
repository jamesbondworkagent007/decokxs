package com.okinc.business.appupdate.update;

import android.os.Build;
import com.okinc.network.okg.response.ResponseData;
import o.AbstractC58185ywX;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface UpdateApiService {
    @POST("/v2/support/home/app/updateInfo")
    AbstractC58185ywX<ResponseData<AppUpdateConfigResp>> loadAppUpdateConfig(@Body AppUpdateRequest appUpdateRequest, @Header("brand") @NotNull String str, @Header("manufacturer") @NotNull String str2);

    public static final class DefaultImpls {
        public static /* synthetic */ AbstractC58185ywX loadAppUpdateConfig$default(UpdateApiService updateApiService, AppUpdateRequest appUpdateRequest, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAppUpdateConfig");
            }
            if ((i & 2) != 0) {
                str = Build.BRAND;
            }
            if ((i & 4) != 0) {
                str2 = Build.MANUFACTURER;
            }
            return updateApiService.loadAppUpdateConfig(appUpdateRequest, str, str2);
        }
    }
}
