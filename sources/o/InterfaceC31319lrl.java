package o;

import com.okinc.business.web3pay.lib.features.convert.model.CurrencyList;
import com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo;
import com.okinc.business.web3pay.lib.features.convert.model.Quote;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.lrl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31319lrl {
    @GET("/priapi/v5/smart-account/convert/currency-pair-info")
    java.lang.Object EZpvd(@Query("fromTokenCoinTypeNo") java.lang.String str, @Query("toTokenCoinTypeNo") java.lang.String str2, @Query("fromMasterCurrencyId") java.lang.String str3, @NotNull Continuation<? super ResponseData<CurrencyPairInfo>> continuation);

    @GET("/priapi/v5/smart-account/convert/currency-list")
    java.lang.Object KWHzl(@Query("currencyConvertType") int i, @Query("fromTokenCoinTypeNo") java.lang.String str, @NotNull Continuation<? super ResponseData<CurrencyList>> continuation);

    @GET("/priapi/v5/smart-account/convert/quote")
    java.lang.Object KWHzl(@NotNull @Query("fromTokenCoinTypeNo") java.lang.String str, @NotNull @Query("toTokenCoinTypeNo") java.lang.String str2, @NotNull @Query("fromTokenAmount") java.lang.String str3, @Query("fromTokenDecimal") int i, @NotNull Continuation<? super ResponseData<Quote>> continuation);

    /* JADX INFO: renamed from: o.lrl$ActionBar */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getCurrencyPairInfo$default(InterfaceC31319lrl interfaceC31319lrl, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyPairInfo");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC31319lrl.EZpvd(str, str2, str3, continuation);
        }

        public static /* synthetic */ java.lang.Object getCurrencyList$default(InterfaceC31319lrl interfaceC31319lrl, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCurrencyList");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC31319lrl.KWHzl(i, str, continuation);
        }
    }
}
