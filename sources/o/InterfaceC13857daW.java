package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeDetailDataResp;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp;
import com.okinc.business.defi.biz.net.bean.CeDefiAddressCheckResult;
import com.okinc.business.defi.biz.net.bean.CreateMpcResponse;
import com.okinc.business.defi.biz.net.bean.GetScanShareResponseBody;
import com.okinc.business.defi.biz.net.bean.HandshakeBody;
import com.okinc.business.defi.biz.net.bean.HandshakeResponse;
import com.okinc.business.defi.biz.net.bean.MpcSendTxBody;
import com.okinc.business.defi.biz.net.bean.MpcSendTxResponse;
import com.okinc.business.defi.biz.net.bean.ResetMpcBody;
import com.okinc.business.defi.biz.net.bean.SyncShareRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncShareResponse;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyAccountData;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletAccountInfoRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCheckRecoverRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletRecoverInfoRes;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq;
import com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.daW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13857daW {
    public static final TaskDescription Companion = TaskDescription.EZpvd;

    @GET("/priapi/v5/smart-account/v1/cedefi/account/recovery/get-email-subject")
    java.lang.Object AEQbTJ(@Query("accountType") int i, @NotNull Continuation<? super ResponseData<PasskeyWalletRecoverInfoRes>> continuation);

    @POST("/priapi/v5/smart-account/v1/create-uop/order-type/{type}")
    java.lang.Object AEQbTJ(@retrofit2.http.Path("type") @NotNull java.lang.String str, @Body @NotNull JsonElement jsonElement, @NotNull Continuation<? super ResponseData<PasskeyWalletCreateUopRes>> continuation);

    @POST("/v3/users/mpc-wallet/signature/handshaking")
    AbstractC58185ywX<ResponseData<HandshakeResponse>> AEQbTJ(@Body @NotNull HandshakeBody handshakeBody);

    @GET("/priapi/v5/smart-account/v1/account/pre-check")
    java.lang.Object EZpvd(@Query("accountType") int i, @Query("scene") int i2, @NotNull Continuation<? super ResponseData<Unit>> continuation);

    @GET("/priapi/v5/smart-account/v1/user/judge-email")
    java.lang.Object EZpvd(@Query("accountType") int i, @NotNull Continuation<? super ResponseData<BindEmailData>> continuation);

    @POST("/v3/users/mpc-wallet/signature/transaction")
    AbstractC58185ywX<ResponseData<MpcSendTxResponse>> EZpvd(@Body @NotNull MpcSendTxBody mpcSendTxBody);

    @GET("/priapi/v5/smart-account/v1/cedefi/account/escape-detail")
    java.lang.Object KWHzl(@Query("accountType") int i, @Query("accountId") java.lang.String str, @NotNull Continuation<? super ResponseData<EscapeDetailDataResp>> continuation);

    @GET("/priapi/v5/smart-account/v1/cedefi/account/recovery/check")
    java.lang.Object KWHzl(@Query("accountType") int i, @NotNull Continuation<? super ResponseData<PasskeyWalletCheckRecoverRes>> continuation);

    @POST("/priapi/v5/smart-account/v1/send-uop/batch/order-type/20305")
    java.lang.Object KWHzl(@Body @NotNull EscapeBatchSendUopReq escapeBatchSendUopReq, @NotNull Continuation<? super ResponseData<EscapeBatchSendUopRes>> continuation);

    @GET("/priapi/v5/smart-account/v1/cedefi/account/escape-list")
    java.lang.Object KWHzl(@Query("limit") java.lang.Integer num, @Query("cursor") java.lang.String str, @NotNull Continuation<? super ResponseData<EscapeListDataResp>> continuation);

    @GET("/v3/users/mpc-wallet/scan/status")
    AbstractC58185ywX<ResponseData<GetScanShareResponseBody>> KWHzl(@NotNull @Query("pubKey") java.lang.String str);

    @GET("/priapi/v5/smart-account/v1/account/get-account-info")
    java.lang.Object OLrzqt(@Query("accountType") int i, @NotNull Continuation<? super ResponseData<PasskeyWalletAccountInfoRes>> continuation);

    @POST("/priapi/v5/smart-account/v1/cedefi/account/create-account")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<PasskeyAccountData>> continuation);

    @POST("/v3/users/mpc-wallet/signature/create-or-reset")
    AbstractC58185ywX<ResponseData<CreateMpcResponse>> OLrzqt(@Body @NotNull ResetMpcBody resetMpcBody);

    @POST("/v3/users/mpc-wallet/sync-status")
    AbstractC58185ywX<ResponseData<SyncShareResponse>> OLrzqt(@Body @NotNull SyncShareRequestBody syncShareRequestBody);

    @GET("/priapi/v5/smart-account/v1/account/check-address")
    java.lang.Object copydefault(@Query("accountType") int i, @NotNull Continuation<? super ResponseData<CeDefiAddressCheckResult>> continuation);

    @POST("/priapi/v5/smart-account/v1/send-uop/order-type/{type}")
    java.lang.Object copydefault(@retrofit2.http.Path("type") @NotNull java.lang.String str, @Body @NotNull PasskeyWalletSendUopReq passkeyWalletSendUopReq, @NotNull Continuation<? super ResponseData<PasskeyWalletSendUopRes>> continuation);

    /* JADX INFO: renamed from: o.daW$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC13857daW copydefault() {
            return (InterfaceC13857daW) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC13857daW.class), C13923dbj.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.daW$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static /* synthetic */ java.lang.Object getEscapeDetailInfo$default(InterfaceC13857daW interfaceC13857daW, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEscapeDetailInfo");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            return interfaceC13857daW.KWHzl(i, str, (Continuation<? super ResponseData<EscapeDetailDataResp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object getEscapeListInfo$default(InterfaceC13857daW interfaceC13857daW, java.lang.Integer num, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEscapeListInfo");
            }
            if ((i & 1) != 0) {
                num = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return interfaceC13857daW.KWHzl(num, str, (Continuation<? super ResponseData<EscapeListDataResp>>) continuation);
        }

        public static /* synthetic */ java.lang.Object checkAddressSuspend$default(InterfaceC13857daW interfaceC13857daW, int i, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAddressSuspend");
            }
            if ((i2 & 1) != 0) {
                i = 2;
            }
            return interfaceC13857daW.copydefault(i, continuation);
        }
    }
}
