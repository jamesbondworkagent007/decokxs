package o;

import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface eWU {
    java.lang.Object EZpvd(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CoinInfoBean, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressCoinHistoryResponse, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, long j, int i, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AddressTxHistoryDetail, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressTokenAsset, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, java.util.List<java.lang.Long> list, boolean z, boolean z2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<AddressAllAssetResponse, OKServerException>> continuation);
}
