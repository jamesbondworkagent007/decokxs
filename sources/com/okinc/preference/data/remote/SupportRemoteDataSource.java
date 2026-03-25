package com.okinc.preference.data.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.meta.AppMetaInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.C46530tXt;
import o.C56524yIo;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes16.dex */
public interface SupportRemoteDataSource {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    @GET("/v3/users/mobile/support/common/meta-info")
    Object appMetaInfo(@NotNull Continuation<? super ResponseData<AppMetaInfo>> continuation);

    @POST("/v3/users/mobile/support/current/lang")
    Object updateCurrentLanguage(@NotNull Continuation<? super ResponseData<Unit>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }

        public final SupportRemoteDataSource KWHzl() {
            return (SupportRemoteDataSource) C46530tXt.OLrzqt(C56524yIo.AEQbTJ(SupportRemoteDataSource.class), new Interceptor[0]);
        }
    }
}
