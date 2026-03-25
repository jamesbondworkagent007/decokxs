package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.C13927dbn;
import o.C43393roT;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes5.dex */
public interface WalletBindApiService {
    public static final ActionBar Companion = ActionBar.KWHzl;

    @POST("/priapi/v1/wallet/common/bind/binding-status")
    Object EZpvd(@Body @NotNull CheckWalletBindStatusRequestBody checkWalletBindStatusRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<CheckWalletBindStatusResponse>> continuation);

    @POST("/priapi/v1/wallet/common/bind/binding-token")
    Object EZpvd(@Body @NotNull GetBindingTokenRequestBody getBindingTokenRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<GetBindingTokenResponseBody>> continuation);

    @POST("/priapi/v1/wallet/common/bind/validate-nonce")
    Object OLrzqt(@Body @NotNull ValidateNonceRequestBody validateNonceRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<ValidateNonceResponseBody>> continuation);

    @POST("/priapi/v1/wallet/common/bind/bind-nonce")
    Object copydefault(@Body @NotNull BindNonceRequestBody bindNonceRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<BindNonceResponseBody>> continuation);

    @POST("/priapi/v1/wallet/common/bind/unbind")
    Object copydefault(@Body @NotNull UnBindCeFiRequestBody unBindCeFiRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<UnBindCeFiResponse>> continuation);

    @POST("/priapi/v1/wallet/common/bind/unbind-nonce")
    Object copydefault(@Body @NotNull UnBindNonceRequestBody unBindNonceRequestBody, @Header("OK-VERIFY-TOKEN") @NotNull String str, @NotNull Continuation<? super ResponseData<UnBindNonceResponseBody>> continuation);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();
        public static final InterfaceC56387yDm<C13927dbn> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WalletBindApiService.ActionBar.copydefault();
            }
        });

        private ActionBar() {
        }

        public static final C13927dbn copydefault() {
            return new C13927dbn();
        }

        public final C13927dbn EZpvd() {
            return copydefault.getValue();
        }

        public final WalletBindApiService AEQbTJ() {
            return (WalletBindApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(WalletBindApiService.class), EZpvd());
        }
    }

    public static final class TaskDescription {
        public static /* synthetic */ Object checkWalletBindStatus$default(WalletBindApiService walletBindApiService, CheckWalletBindStatusRequestBody checkWalletBindStatusRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkWalletBindStatus");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.EZpvd(checkWalletBindStatusRequestBody, str, (Continuation<? super ResponseData<CheckWalletBindStatusResponse>>) continuation);
        }

        public static /* synthetic */ Object getBindingToken$default(WalletBindApiService walletBindApiService, GetBindingTokenRequestBody getBindingTokenRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBindingToken");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.EZpvd(getBindingTokenRequestBody, str, (Continuation<? super ResponseData<GetBindingTokenResponseBody>>) continuation);
        }

        public static /* synthetic */ Object validateNonce$default(WalletBindApiService walletBindApiService, ValidateNonceRequestBody validateNonceRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validateNonce");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.OLrzqt(validateNonceRequestBody, str, continuation);
        }

        public static /* synthetic */ Object unbind$default(WalletBindApiService walletBindApiService, UnBindCeFiRequestBody unBindCeFiRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unbind");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.copydefault(unBindCeFiRequestBody, str, (Continuation<? super ResponseData<UnBindCeFiResponse>>) continuation);
        }

        public static /* synthetic */ Object getUnbindNonce$default(WalletBindApiService walletBindApiService, UnBindNonceRequestBody unBindNonceRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnbindNonce");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.copydefault(unBindNonceRequestBody, str, (Continuation<? super ResponseData<UnBindNonceResponseBody>>) continuation);
        }

        public static /* synthetic */ Object getBindNonce$default(WalletBindApiService walletBindApiService, BindNonceRequestBody bindNonceRequestBody, String str, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBindNonce");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            return walletBindApiService.copydefault(bindNonceRequestBody, str, (Continuation<? super ResponseData<BindNonceResponseBody>>) continuation);
        }
    }

    public static final class WalletBindApiServiceModule {
        public final WalletBindApiService copydefault() {
            return WalletBindApiService.Companion.AEQbTJ();
        }
    }
}
