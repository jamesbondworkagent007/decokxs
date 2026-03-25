package com.okinc.nft.nftmarket;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.nft.push.chainstatus.TxInfoBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C43280rmM;
import o.C43393roT;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes19.dex */
public interface NFTApiService {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    @GET("/priapi/v5/dex/token/market/history-dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getHistoryTokenCandles(@NotNull @Query("chainId") String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query(TtmlNode.RUBY_BEFORE) String str4, @NotNull @Query("bar") String str5, @NotNull @Query("limit") String str6);

    @GET("/priapi/v5/dex/token/market/dex-token-hlc-candles")
    AbstractC58185ywX<ResponseData<List<List<String>>>> getTokenCandles(@NotNull @Query("chainId") String str, @NotNull @Query(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) String str2, @Query(TtmlNode.RUBY_AFTER) String str3, @Query(TtmlNode.RUBY_BEFORE) String str4, @NotNull @Query("bar") String str5, @NotNull @Query("limit") String str6);

    @GET
    AbstractC58185ywX<ResponseData<List<TxInfoBean>>> getTxInfo(@Url @NotNull String str);

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }

        public final NFTApiService copydefault(@NotNull C43280rmM c43280rmM) {
            Intrinsics.checkNotNullParameter(c43280rmM, "");
            return (NFTApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(NFTApiService.class), c43280rmM);
        }
    }
}
