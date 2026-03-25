package com.okinc.business.appupdate.update;

import com.appsflyer.AppsFlyerProperties;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.network.okg.response.ResponseData;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes18.dex */
public interface AppReleaseApi {
    public static final Companion Companion = Companion.$$INSTANCE;

    @GET("https://beta.okex.org/v2/support/app/update/info")
    AbstractC58185ywX<ResponseData<AppRelease>> getAppRelease(@NotNull @Query("version") String str, @NotNull @Query(MTPushConstants.PlatformNode.KEY_PLATFORM) String str2, @NotNull @Query("appId") String str3, @NotNull @Query(AppsFlyerProperties.CHANNEL) String str4, @Query("status") int i, @Header("X-Support-API-Key") @NotNull String str5);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AppReleaseApi getInstance() {
            return (AppReleaseApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(AppReleaseApi.class));
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ AbstractC58185ywX getAppRelease$default(AppReleaseApi appReleaseApi, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAppRelease");
            }
            if ((i2 & 2) != 0) {
                str2 = "Android";
            }
            String str6 = str2;
            if ((i2 & 4) != 0) {
                str3 = "com.okinc.okex.gp";
            }
            String str7 = str3;
            if ((i2 & 8) != 0) {
                str4 = "china";
            }
            String str8 = str4;
            if ((i2 & 16) != 0) {
                i = 0;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                str5 = "2ba04ac906724e7eb6df4ef59b9ffc24";
            }
            return appReleaseApi.getAppRelease(str, str6, str7, str8, i3, str5);
        }
    }
}
