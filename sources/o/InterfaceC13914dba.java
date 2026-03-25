package o;

import com.okinc.business.defi.jwt.AddressLoginRequest;
import com.okinc.business.defi.jwt.AddressLoginResponse;
import com.okinc.business.defi.jwt.GetSignMessageResponse;
import com.okinc.business.defi.wallet.home.bean.AddressAliasResponse;
import com.okinc.business.defi.wallet.home.bean.GetUserInfoBody;
import com.okinc.business.defi.wallet.home.bean.NotificationInfo;
import com.okinc.business.defi.wallet.home.bean.NotifyUpdateRequest;
import com.okinc.business.defi.wallet.home.bean.UserAdressInfo;
import com.okinc.business.defi.wallet.home.bean.WalletAddressActivityInfo;
import com.okinc.business.defi.wallet.home.bean.WalletAddressTagListInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC13914dba;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.dba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13914dba {
    public static final ActionBar Companion = ActionBar.copydefault;

    @GET("/priapi/v1/dx/market/user/sign")
    java.lang.Object AEQbTJ(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<GetSignMessageResponse>> continuation);

    @POST("/priapi/v1/wallet/pnl/user-info")
    java.lang.Object EZpvd(@Body @NotNull GetUserInfoBody getUserInfoBody, @NotNull Continuation<? super ResponseData<UserAdressInfo>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/notify/query")
    java.lang.Object EZpvd(@NotNull @Query("walletAddress") java.lang.String str, @NotNull @Query("collectAddress") java.lang.String str2, @NotNull Continuation<? super ResponseData<NotificationInfo>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/alias/query")
    java.lang.Object EZpvd(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<AddressAliasResponse>>> continuation);

    @GET("/priapi/v1/dx/market/v2/address/collect/simplify/query")
    java.lang.Object KWHzl(@NotNull @Query("walletAddress") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<java.lang.String>>> continuation);

    @POST("/priapi/v1/dx/market/user/login")
    java.lang.Object OLrzqt(@Body AddressLoginRequest addressLoginRequest, @NotNull Continuation<? super ResponseData<AddressLoginResponse>> continuation);

    @POST("/priapi/v1/dx/market/v2/address/notify/update")
    java.lang.Object copydefault(@Header("Market-Token") @NotNull java.lang.String str, @Header("devid") @NotNull java.lang.String str2, @Body @NotNull NotifyUpdateRequest notifyUpdateRequest, @NotNull Continuation<? super ResponseData<java.lang.Integer>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/wallet-profile/trade-history")
    java.lang.Object copydefault(@NotNull @Query("walletAddress") java.lang.String str, @NotNull @Query("chainId") java.lang.String str2, @Query("tokenContractAddress") java.lang.String str3, @Query("tradeType") java.lang.String str4, @Query("pageSize") java.lang.Integer num, @Query("globalIndex") java.lang.String str5, @Query("desc") java.lang.Boolean bool, @Query("filterRisk") boolean z, @NotNull Continuation<? super ResponseData<WalletAddressActivityInfo>> continuation);

    @GET("/priapi/v1/dx/market/v2/pnl/wallet-profile/query/address/info ")
    java.lang.Object copydefault(@Query("loginWalletAddress") java.lang.String str, @NotNull @Query("walletAddress") java.lang.String str2, @NotNull @Query("chainId") java.lang.String str3, @NotNull Continuation<? super ResponseData<WalletAddressTagListInfo>> continuation);

    /* JADX INFO: renamed from: o.dba$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();
        public static final InterfaceC56387yDm<C13927dbn> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.daX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InterfaceC13914dba.ActionBar.OLrzqt();
            }
        });

        private ActionBar() {
        }

        public static final C13927dbn OLrzqt() {
            return new C13927dbn();
        }

        public final C13927dbn KWHzl() {
            return EZpvd.getValue();
        }

        public final InterfaceC13914dba AEQbTJ() {
            return (InterfaceC13914dba) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC13914dba.class), KWHzl());
        }
    }
}
