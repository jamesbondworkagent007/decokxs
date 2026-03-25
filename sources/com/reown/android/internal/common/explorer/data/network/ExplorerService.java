package com.reown.android.internal.common.explorer.data.network;

import com.reown.android.internal.common.explorer.data.network.model.DappListingsDTO;
import com.reown.android.internal.common.explorer.data.network.model.NotifyConfigDTO;
import com.reown.android.internal.common.explorer.data.network.model.ProjectListingDTO;
import com.reown.android.internal.common.explorer.data.network.model.WalletListingDTO;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes12.dex */
public interface ExplorerService {
    @GET("v3/dapps")
    Object getAllDapps(@NotNull @Query("projectId") String str, @NotNull Continuation<? super Response<DappListingsDTO>> continuation);

    @GET("w3m/v1/getAndroidListings")
    Object getAndroidWallets(@NotNull @Query("projectId") String str, @Query("chains") String str2, @NotNull @Query("sdkType") String str3, @NotNull @Query("sdkVersion") String str4, @Query("excludedIds") String str5, @Query("recommendedIds") String str6, @NotNull Continuation<? super Response<WalletListingDTO>> continuation);

    @GET("w3i/v1/notify-config")
    Object getNotifyConfig(@NotNull @Query("projectId") String str, @NotNull @Query("appDomain") String str2, @NotNull Continuation<? super Response<NotifyConfigDTO>> continuation);

    @GET("w3i/v1/projects")
    Object getProjects(@NotNull @Query("projectId") String str, @Query("entries") int i, @Query("page") int i2, @Query("isVerified") boolean z, @Query("isFeatured") boolean z2, @NotNull Continuation<? super Response<ProjectListingDTO>> continuation);
}
