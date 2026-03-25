package com.okinc.preference.data.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okuser.data.PersonalSetting;
import com.okinc.preference.data.model.ChangeValCurrencyData;
import com.okinc.preference.data.model.EmptyResp;
import com.okinc.preference.data.model.ModifySettingReq;
import com.okinc.preference.data.model.UpDownColorReq;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.AbstractC58185ywX;
import o.C46530tXt;
import o.C56524yIo;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface LocalConfigRemoteDataSource {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    @POST("/v3/users/mobile/local-config/up-down-color")
    AbstractC58185ywX<ResponseData<Unit>> changeRiseFallColor(@Body @NotNull UpDownColorReq upDownColorReq);

    @GET("/v3/users/common/list/currencies")
    AbstractC58185ywX<ResponseData<ArrayList<ValuationCurrencyBean>>> currencies(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/v3/users/mobile/local-config/settings")
    AbstractC58185ywX<ResponseData<PersonalSetting>> loadUserPreSettings();

    @POST("/v3/users/mobile/local-config/modify-setting")
    AbstractC58185ywX<ResponseData<Unit>> modifySettings(@Body @NotNull ModifySettingReq modifySettingReq);

    @POST("/v3/users/mobile/local-config/modify-setting")
    Object modifySettingsSuspend(@Body @NotNull ModifySettingReq modifySettingReq, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @POST("v3/users/local-config/renewal-charge-unit")
    AbstractC58185ywX<ResponseData<EmptyResp>> setValuationCurrency(@Body @NotNull ChangeValCurrencyData changeValCurrencyData);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }

        public final LocalConfigRemoteDataSource KWHzl() {
            return (LocalConfigRemoteDataSource) C46530tXt.OLrzqt(C56524yIo.AEQbTJ(LocalConfigRemoteDataSource.class), new Interceptor[0]);
        }
    }

    public static final class Application {
        public static /* synthetic */ AbstractC58185ywX currencies$default(LocalConfigRemoteDataSource localConfigRemoteDataSource, String str, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currencies");
            }
            if ((i2 & 1) != 0) {
                str = "FIRST_CACHE";
            }
            if ((i2 & 2) != 0) {
                i = 300;
            }
            return localConfigRemoteDataSource.currencies(str, i);
        }
    }
}
