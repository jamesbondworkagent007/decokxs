package com.reown.android.internal.common.modal.data.network;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.internal.common.modal.data.network.model.EnableAnalyticsDTO;
import com.reown.android.internal.common.modal.data.network.model.GetAndroidDataDTO;
import com.reown.android.internal.common.modal.data.network.model.GetWalletsDTO;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface AppKitService {
    @GET("getAnalyticsConfig")
    Object getAnalyticsConfig(@Header("x-sdk-type") @NotNull String str, @NotNull Continuation<? super Response<EnableAnalyticsDTO>> continuation);

    @GET("getAndroidData")
    Object getAndroidData(@Header("x-sdk-type") @NotNull String str, @NotNull Continuation<? super Response<GetAndroidDataDTO>> continuation);

    @GET("getWallets")
    Object getWallets(@Header("x-sdk-type") @NotNull String str, @Query("page") int i, @Query("search") String str2, @Query("exclude") String str3, @Query("include") String str4, @Query("entries") int i2, @NotNull @Query(MTPushConstants.PlatformNode.KEY_PLATFORM) String str5, @NotNull Continuation<? super Response<GetWalletsDTO>> continuation);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getWallets$default(AppKitService appKitService, String str, int i, String str2, String str3, String str4, int i2, String str5, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return appKitService.getWallets(str, i, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : str4, (i3 & 32) != 0 ? 100 : i2, (i3 & 64) != 0 ? "android" : str5, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWallets");
        }
    }
}
