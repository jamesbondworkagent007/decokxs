package com.okinc.okpush.sdk.net.service;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okpush.sdk.net.bean.EmptyResponse;
import com.okinc.okpush.sdk.net.bean.PushBindReqInfo;
import o.AbstractC58185ywX;
import o.C43393roT;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface PushApiService {
    public static final Application Companion = Application.KWHzl;
    public static final String PUSH_BIND = "/priapi/v2/notify/push/bind";

    @POST(PUSH_BIND)
    AbstractC58185ywX<ResponseData<EmptyResponse>> bindPushInfo(@Body @NotNull PushBindReqInfo pushBindReqInfo);

    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final PushApiService AEQbTJ() {
            return (PushApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(PushApiService.class), null, 1, null);
        }
    }
}
