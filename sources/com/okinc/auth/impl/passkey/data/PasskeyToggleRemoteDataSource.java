package com.okinc.auth.impl.passkey.data;

import com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInfoResponse;
import com.okinc.auth.impl.passkey.model.passkeytoggle.PasskeyToggleInitiateResponse;
import com.okinc.auth.impl.passkey.model.passkeytoggle.SwitchPasskeyToggleRequest;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import o.C56524yIo;
import o.C8215ayY;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
public interface PasskeyToggleRemoteDataSource {
    public static final ActionBar Companion = ActionBar.copydefault;

    @GET("/v3/users/mobile/passkey/mgt/info")
    Object getPasskeyToggleInfo(@NotNull Continuation<? super ResponseData<PasskeyToggleInfoResponse>> continuation);

    @POST("/v3/users/mobile/passkey/mgt/verification-toggle/init")
    Object initiatePasskeyToggle(@NotNull Continuation<? super ResponseData<PasskeyToggleInitiateResponse>> continuation);

    @POST("/v3/users/mobile/passkey/mgt/verification-toggle/switch")
    Object switchPasskeyToggle(@Body @NotNull SwitchPasskeyToggleRequest switchPasskeyToggleRequest, @NotNull Continuation<? super ResponseData<Object>> continuation);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        public final PasskeyToggleRemoteDataSource KWHzl() {
            return (PasskeyToggleRemoteDataSource) C8215ayY.EZpvd(C56524yIo.AEQbTJ(PasskeyToggleRemoteDataSource.class), new Interceptor[0]);
        }
    }

    public static final class PasskeyToggleRemoteDataSourceModule {
        public final PasskeyToggleRemoteDataSource OLrzqt() {
            return PasskeyToggleRemoteDataSource.Companion.KWHzl();
        }
    }
}
