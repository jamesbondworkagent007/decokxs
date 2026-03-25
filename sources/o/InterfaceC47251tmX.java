package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.fiat.api.bean.OtcCoinList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.RecurringBuyPlanListRoot;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountParams;
import com.okinc.okx.paymentapi.presentation.CedefiOrderSubmitParams;
import com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.BuySellCryptoListParameters;
import com.okinc.okx.paymentapi.service.BuySellInputPageParameters;
import com.okinc.okx.paymentapi.service.BuySellOrderDetailParameters;
import com.okinc.okx.paymentapi.service.CreateAccountType;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.DynamicDepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.uv.AccountFrozenStatus;
import com.okinc.okx.paymentapi.uv.LandingPageType;
import com.okinc.okx.paymentapi.uv.PreCheckStatus;
import com.okinc.okx.paymentapi.uv.UnifiedTradeType;
import com.okinc.okx.paymentapi.uv.UnifiedVerificationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC47251tmX extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, @NotNull CedefiOrderSubmitParams cedefiOrderSubmitParams, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull BuySellInputPageParameters buySellInputPageParameters, Function1<? super InterfaceC47247tmT, Unit> function1);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull DynamicDepositWithdrawPageParameters dynamicDepositWithdrawPageParameters, Function1<? super InterfaceC47247tmT, Unit> function1);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull android.os.Bundle bundle);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, java.lang.String str, Function1<? super InterfaceC47247tmT, Unit> function1);

    void AEQbTJ(boolean z, @NotNull Function1<? super OtcCoinList, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12);

    void EZpvd(@NotNull android.content.Context context, @NotNull PaymentAddAccountParams paymentAddAccountParams, @NotNull java.lang.String str, @NotNull java.lang.String str2, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super PaymentAddAccountResult.ThirdPartyFinalState, Unit> function1);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull LifecycleOwner lifecycleOwner, @NotNull LandingPageType landingPageType, @NotNull ActivityResultRegistry activityResultRegistry, @NotNull C47313tng c47313tng, boolean z, Function0<Unit> function0, boolean z2, @NotNull Function1<? super UnifiedVerificationStatus, Unit> function1);

    void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8);

    java.lang.Object KWHzl(int i, java.lang.String str, java.lang.String str2, int i2, int i3, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanListRoot, OKServerException>> continuation);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull BuySellConvertParameters buySellConvertParameters, Function1<? super InterfaceC47247tmT, Unit> function1);

    void KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull BuySellCryptoListParameters buySellCryptoListParameters, Function1<? super InterfaceC47247tmT, Unit> function1);

    void KWHzl(@NotNull TradeType tradeType, @NotNull Function0<Unit> function0, @NotNull androidx.fragment.app.FragmentManager fragmentManager);

    java.lang.Object OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, boolean z, java.lang.String str8, @NotNull Function1<? super PreCheckStatus, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    void OLrzqt(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull UnifiedTradeType unifiedTradeType, boolean z, @NotNull Function1<? super AccountFrozenStatus, Unit> function1);

    void OLrzqt(@NotNull android.content.Context context, @NotNull OKPaymentSource oKPaymentSource, @NotNull InterfaceC47250tmW interfaceC47250tmW);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull CreateAccountType createAccountType, @NotNull Function1<? super PaymentAddAccountResult.ThirdPartyFinalState, Unit> function1);

    void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull DepositWithdrawPageParameters depositWithdrawPageParameters, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function1<? super InterfaceC47247tmT, Unit> function1);

    void copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull android.content.Context context, @NotNull BuySellOrderDetailParameters buySellOrderDetailParameters);

    void copydefault(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z);

    void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC47240tmM interfaceC47240tmM, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function1<? super InterfaceC47247tmT, Unit> function1);

    void copydefault(@NotNull Function1<? super java.lang.String, Unit> function1);

    /* JADX INFO: renamed from: o.tmX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToBuySellCryptoList$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, BuySellCryptoListParameters buySellCryptoListParameters, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellCryptoList");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.KWHzl(fragmentActivity, buySellCryptoListParameters, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToBuySellInputPage$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, BuySellInputPageParameters buySellInputPageParameters, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellInputPage");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.AEQbTJ(fragmentActivity, buySellInputPageParameters, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void launchPaymentOrderSubmitFlow$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, InterfaceC47240tmM interfaceC47240tmM, ActivityResultLauncher activityResultLauncher, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchPaymentOrderSubmitFlow");
            }
            if ((i & 4) != 0) {
                activityResultLauncher = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.copydefault(fragmentActivity, interfaceC47240tmM, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void launchPaymentAddAccountFlow$default(InterfaceC47251tmX interfaceC47251tmX, android.content.Context context, PaymentAddAccountParams paymentAddAccountParams, java.lang.String str, java.lang.String str2, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchPaymentAddAccountFlow");
            }
            java.lang.String str3 = (i & 4) != 0 ? "" : str;
            java.lang.String str4 = (i & 8) != 0 ? "" : str2;
            if ((i & 16) != 0) {
                activityResultLauncher = null;
            }
            interfaceC47251tmX.EZpvd(context, paymentAddAccountParams, str3, str4, activityResultLauncher);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void launchCedefiOrderSubmitFlow$default(InterfaceC47251tmX interfaceC47251tmX, android.content.Context context, CedefiOrderSubmitParams cedefiOrderSubmitParams, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchCedefiOrderSubmitFlow");
            }
            if ((i & 4) != 0) {
                activityResultLauncher = null;
            }
            interfaceC47251tmX.AEQbTJ(context, cedefiOrderSubmitParams, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToDepositWithdrawPage$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, DepositWithdrawPageParameters depositWithdrawPageParameters, ActivityResultLauncher activityResultLauncher, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDepositWithdrawPage");
            }
            if ((i & 4) != 0) {
                activityResultLauncher = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.OLrzqt(fragmentActivity, depositWithdrawPageParameters, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToDynamicDepositWithdrawPage$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, DynamicDepositWithdrawPageParameters dynamicDepositWithdrawPageParameters, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToDynamicDepositWithdrawPage");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.AEQbTJ(fragmentActivity, dynamicDepositWithdrawPageParameters, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        public static Unit AEQbTJ(OtcCoinList otcCoinList) {
            Intrinsics.checkNotNullParameter(otcCoinList, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getDefaultLegalCurrency$default(InterfaceC47251tmX interfaceC47251tmX, boolean z, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultLegalCurrency");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.tmY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC47251tmX.StateListAnimator.AEQbTJ((OtcCoinList) obj2);
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1() { // from class: o.tmZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return InterfaceC47251tmX.StateListAnimator.EZpvd((java.lang.String) obj2);
                    }
                };
            }
            interfaceC47251tmX.AEQbTJ(z, (Function1<? super OtcCoinList, Unit>) function1, (Function1<? super java.lang.String, Unit>) function12);
        }

        public static Unit EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ java.lang.Object getRecurringBuyPlans$default(InterfaceC47251tmX interfaceC47251tmX, int i, java.lang.String str, java.lang.String str2, int i2, int i3, java.lang.String str3, Continuation continuation, int i4, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC47251tmX.KWHzl(i, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? 1 : i2, (i4 & 16) != 0 ? 3 : i3, (i4 & 32) != 0 ? null : str3, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRecurringBuyPlans");
        }

        public static /* synthetic */ void goToRecurringOrderListPage$default(InterfaceC47251tmX interfaceC47251tmX, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToRecurringOrderListPage");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC47251tmX.copydefault(context, str, str2, str3);
        }

        public static /* synthetic */ void goToRecurringOrderDetailPage$default(InterfaceC47251tmX interfaceC47251tmX, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToRecurringOrderDetailPage");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            interfaceC47251tmX.copydefault(context, str, z);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToBuySellConvertPage$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, BuySellConvertParameters buySellConvertParameters, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToBuySellConvertPage");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            interfaceC47251tmX.KWHzl(fragmentActivity, buySellConvertParameters, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        public static /* synthetic */ void paymentReporterTrackPaymentsEvent$default(InterfaceC47251tmX interfaceC47251tmX, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paymentReporterTrackPaymentsEvent");
            }
            interfaceC47251tmX.EZpvd(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8);
        }

        public static /* synthetic */ void goToPayInSimpleAddFundsFlow$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToPayInSimpleAddFundsFlow");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC47251tmX.AEQbTJ(fragmentActivity, str, (Function1<? super InterfaceC47247tmT, Unit>) function1);
        }

        public static /* synthetic */ java.lang.Object runPrecheckForBuySell$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, TradeType tradeType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, java.lang.String str8, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC47251tmX.OLrzqt(fragmentActivity, context, fragmentManager, tradeType, str, str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? "" : str8, function1, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runPrecheckForBuySell");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.tmX */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void verifyForLandingPage$default(InterfaceC47251tmX interfaceC47251tmX, FragmentActivity fragmentActivity, LifecycleOwner lifecycleOwner, LandingPageType landingPageType, ActivityResultRegistry activityResultRegistry, C47313tng c47313tng, boolean z, Function0 function0, boolean z2, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyForLandingPage");
            }
            interfaceC47251tmX.EZpvd(fragmentActivity, lifecycleOwner, landingPageType, activityResultRegistry, c47313tng, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : function0, (i & 128) != 0 ? true : z2, function1);
        }

        public static /* synthetic */ void launchACHAddAccountFlow$default(InterfaceC47251tmX interfaceC47251tmX, android.content.Context context, java.lang.String str, CreateAccountType createAccountType, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchACHAddAccountFlow");
            }
            if ((i & 4) != 0) {
                createAccountType = CreateAccountType.CREATE_NEW_ACCOUNT;
            }
            interfaceC47251tmX.OLrzqt(context, str, createAccountType, (Function1<? super PaymentAddAccountResult.ThirdPartyFinalState, Unit>) function1);
        }
    }
}
