package com.okinc.crcore.coreapi.service;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes23.dex */
public interface IMarketApiService {
    public static final StateListAnimator Companion = StateListAnimator.EZpvd;
    public static final int SIXTY_MINUTES = 3600;

    @GET("/priapi/v5/market/currency-trend")
    Object getCoinTrendCandles(@NotNull @Query("baseCcy") String str, @NotNull @Query("quoteCcy") String str2, @Query("isPremium") boolean z, @NotNull @Query("bar") String str3, @Query("limit") int i, @Header("Cache-Strategy") @NotNull String str4, @Header("Cache-Expire") int i2, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    @GET("priapi/v5/market/candles")
    Object getMarketCandles(@NotNull @Query("instId") String str, @Query("bar") String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query("limit") String str4, @NotNull Continuation<? super ResponseData<List<List<String>>>> continuation);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator EZpvd = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
