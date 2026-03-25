package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.web3pay.api.model.ActivatePayRequest;
import com.okinc.business.web3pay.api.model.ActivatePaySource;
import com.okinc.business.web3pay.api.model.ClaimTransactionParams;
import com.okinc.business.web3pay.api.model.CurrencyDisplayStyle;
import com.okinc.business.web3pay.api.model.CurrencyRounding;
import com.okinc.business.web3pay.api.model.CurrencySign;
import com.okinc.business.web3pay.api.model.OnchainSendOptionModel;
import com.okinc.business.web3pay.api.model.PayMethod;
import com.okinc.business.web3pay.api.model.PayOptionModel;
import com.okinc.business.web3pay.api.model.PaySource;
import com.okinc.business.web3pay.api.model.PayTransactionProjectId;
import com.okinc.business.web3pay.api.model.PayTransactionRecipient;
import com.okinc.business.web3pay.api.model.TransferOptionModel;
import com.okinc.business.web3pay.api.model.Web3PayIconView;
import com.okinc.business.web3pay.api.model.Web3PayOrderType;
import com.okinc.business.web3pay.api.model.Web3PayProjectId;
import com.okinc.business.web3pay.api.model.Web3PayTxHistoryFilterType;
import java.math.BigDecimal;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.InterfaceC31257lqc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC31257lqc extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Web3PayOrderType web3PayOrderType);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Web3PayTxHistoryFilterType web3PayTxHistoryFilterType);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull LifecycleOwner lifecycleOwner, @NotNull ActivatePaySource activatePaySource, @NotNull ActivatePayRequest activatePayRequest, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PaySource paySource, @NotNull Web3PayProjectId web3PayProjectId, PayOptionModel payOptionModel, OnchainSendOptionModel onchainSendOptionModel, TransferOptionModel transferOptionModel);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PayTransactionRecipient payTransactionRecipient, @NotNull PayTransactionProjectId payTransactionProjectId);

    void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    boolean AEQbTJ();

    java.lang.String EZpvd();

    java.lang.String EZpvd(@NotNull android.content.Context context, @NotNull Web3PayTxHistoryFilterType web3PayTxHistoryFilterType);

    void EZpvd(@NotNull android.content.Context context, @NotNull Web3PayProjectId web3PayProjectId, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void EZpvd(@NotNull android.content.Context context, boolean z, boolean z2, boolean z3, @NotNull java.lang.String str);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull PayTransactionRecipient payTransactionRecipient, @NotNull Web3PayProjectId web3PayProjectId);

    java.lang.String KWHzl(boolean z, @NotNull BigDecimal bigDecimal, @NotNull java.lang.String str, @NotNull CurrencySign currencySign, boolean z2, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull CurrencyRounding currencyRounding);

    void KWHzl(@NotNull android.content.Context context, PayMethod payMethod);

    void KWHzl(@NotNull android.content.Context context, java.lang.String str);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ClaimTransactionParams claimTransactionParams, @NotNull PayTransactionProjectId payTransactionProjectId);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, @NotNull java.lang.String str);

    boolean KWHzl();

    boolean KWHzl(android.os.Bundle bundle);

    android.view.View OLrzqt(@NotNull android.content.Context context, Web3PayIconView web3PayIconView);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation);

    java.lang.String OLrzqt(boolean z, @NotNull BigDecimal bigDecimal, @NotNull CurrencySign currencySign, boolean z2, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull CurrencyRounding currencyRounding);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Web3PayProjectId web3PayProjectId, @NotNull java.lang.String str);

    boolean OLrzqt();

    java.lang.String copydefault();

    java.lang.String copydefault(boolean z, @NotNull BigDecimal bigDecimal, int i, @NotNull java.lang.String str, @NotNull CurrencySign currencySign, boolean z2, @NotNull CurrencyDisplayStyle currencyDisplayStyle, @NotNull CurrencyRounding currencyRounding);

    java.lang.String copydefault(boolean z, @NotNull BigDecimal bigDecimal, @NotNull CurrencySign currencySign, boolean z2, @NotNull AbstractC31263lqi abstractC31263lqi, @NotNull CurrencyRounding currencyRounding);

    void copydefault(@NotNull android.content.Context context, @NotNull Web3PayTxHistoryFilterType web3PayTxHistoryFilterType);

    boolean copydefault(android.os.Bundle bundle);

    /* JADX INFO: renamed from: o.lqc$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ java.lang.String getCardTransactionHistoryPageDeepLink$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, Web3PayTxHistoryFilterType web3PayTxHistoryFilterType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCardTransactionHistoryPageDeepLink");
            }
            if ((i & 2) != 0) {
                web3PayTxHistoryFilterType = Web3PayTxHistoryFilterType.CARD_ALL;
            }
            return interfaceC31257lqc.EZpvd(context, web3PayTxHistoryFilterType);
        }

        public static /* synthetic */ void activatePayAccount$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activatePayAccount");
            }
            boolean z4 = (i & 2) != 0 ? true : z;
            boolean z5 = (i & 4) != 0 ? true : z2;
            if ((i & 8) != 0) {
                z3 = false;
            }
            boolean z6 = z3;
            if ((i & 16) != 0) {
                str = "";
            }
            interfaceC31257lqc.EZpvd(context, z4, z5, z6, str);
        }

        public static /* synthetic */ void jumpToOffShorePayTab$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, PayMethod payMethod, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToOffShorePayTab");
            }
            if ((i & 2) != 0) {
                payMethod = null;
            }
            interfaceC31257lqc.KWHzl(context, payMethod);
        }

        public static /* synthetic */ void showActivatePayFragment$default(InterfaceC31257lqc interfaceC31257lqc, androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showActivatePayFragment");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                str = "";
            }
            interfaceC31257lqc.KWHzl(fragmentManager, z, z2, str);
        }

        public static /* synthetic */ void startReceiverFlow$default(InterfaceC31257lqc interfaceC31257lqc, androidx.fragment.app.FragmentManager fragmentManager, ClaimTransactionParams claimTransactionParams, PayTransactionProjectId payTransactionProjectId, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startReceiverFlow");
            }
            if ((i & 4) != 0) {
                payTransactionProjectId = PayTransactionProjectId.IM;
            }
            interfaceC31257lqc.KWHzl(fragmentManager, claimTransactionParams, payTransactionProjectId);
        }

        public static /* synthetic */ android.view.View createWeb3PayOffshoreQrCodeScannerIconView$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, Web3PayIconView web3PayIconView, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWeb3PayOffshoreQrCodeScannerIconView");
            }
            if ((i & 2) != 0) {
                web3PayIconView = null;
            }
            return interfaceC31257lqc.OLrzqt(context, web3PayIconView);
        }

        public static /* synthetic */ void navigateToOnchainReceiveOptionPage$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToOnchainReceiveOptionPage");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC31257lqc.KWHzl(context, str);
        }

        public static /* synthetic */ void startConvertActivity$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConvertActivity");
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
            interfaceC31257lqc.EZpvd(context, str, str2, str3);
        }

        public static /* synthetic */ void startConvertActivity$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, Web3PayProjectId web3PayProjectId, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConvertActivity");
            }
            interfaceC31257lqc.EZpvd(context, web3PayProjectId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, str3);
        }

        public static /* synthetic */ java.lang.String formatCryptoAmount$default(InterfaceC31257lqc interfaceC31257lqc, boolean z, BigDecimal bigDecimal, int i, java.lang.String str, CurrencySign currencySign, boolean z2, CurrencyDisplayStyle currencyDisplayStyle, CurrencyRounding currencyRounding, int i2, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31257lqc.copydefault(z, bigDecimal, i, str, currencySign, (i2 & 32) != 0 ? true : z2, currencyDisplayStyle, (i2 & 128) != 0 ? CurrencyRounding.DOWN : currencyRounding);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatCryptoAmount");
        }

        public static /* synthetic */ java.lang.String formatCryptoAmountInShortPrecision$default(InterfaceC31257lqc interfaceC31257lqc, boolean z, BigDecimal bigDecimal, java.lang.String str, CurrencySign currencySign, boolean z2, CurrencyDisplayStyle currencyDisplayStyle, CurrencyRounding currencyRounding, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC31257lqc.KWHzl(z, bigDecimal, str, currencySign, (i & 16) != 0 ? true : z2, currencyDisplayStyle, (i & 64) != 0 ? CurrencyRounding.DOWN : currencyRounding);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatCryptoAmountInShortPrecision");
        }

        public static /* synthetic */ java.lang.String formatFiatAmount$default(InterfaceC31257lqc interfaceC31257lqc, boolean z, BigDecimal bigDecimal, CurrencySign currencySign, boolean z2, CurrencyDisplayStyle currencyDisplayStyle, CurrencyRounding currencyRounding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatFiatAmount");
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z3 = z2;
            if ((i & 32) != 0) {
                currencyRounding = CurrencyRounding.DOWN;
            }
            return interfaceC31257lqc.OLrzqt(z, bigDecimal, currencySign, z3, currencyDisplayStyle, currencyRounding);
        }

        public static /* synthetic */ java.lang.String formatFiatAmount$default(InterfaceC31257lqc interfaceC31257lqc, boolean z, BigDecimal bigDecimal, CurrencySign currencySign, boolean z2, AbstractC31263lqi abstractC31263lqi, CurrencyRounding currencyRounding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatFiatAmount");
            }
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z3 = z2;
            if ((i & 32) != 0) {
                currencyRounding = CurrencyRounding.DOWN;
            }
            return interfaceC31257lqc.copydefault(z, bigDecimal, currencySign, z3, abstractC31263lqi, currencyRounding);
        }

        public static /* synthetic */ void startPayFlowWithOptions$default(InterfaceC31257lqc interfaceC31257lqc, androidx.fragment.app.FragmentManager fragmentManager, PaySource paySource, Web3PayProjectId web3PayProjectId, PayOptionModel payOptionModel, OnchainSendOptionModel onchainSendOptionModel, TransferOptionModel transferOptionModel, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPayFlowWithOptions");
            }
            interfaceC31257lqc.AEQbTJ(fragmentManager, paySource, web3PayProjectId, (i & 8) != 0 ? null : payOptionModel, (i & 16) != 0 ? null : onchainSendOptionModel, (i & 32) != 0 ? null : transferOptionModel);
        }

        public static Unit OLrzqt() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.lqc */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void startKycAndSaAuthFragmentListener$default(InterfaceC31257lqc interfaceC31257lqc, androidx.fragment.app.FragmentManager fragmentManager, LifecycleOwner lifecycleOwner, ActivatePaySource activatePaySource, ActivatePayRequest activatePayRequest, Function0 function0, Function0 function02, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startKycAndSaAuthFragmentListener");
            }
            if ((i & 32) != 0) {
                function02 = new Function0() { // from class: o.lqf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC31257lqc.StateListAnimator.OLrzqt();
                    }
                };
            }
            interfaceC31257lqc.AEQbTJ(fragmentManager, lifecycleOwner, activatePaySource, activatePayRequest, (Function0<Unit>) function0, (Function0<Unit>) function02);
        }

        public static /* synthetic */ void startCardTransactionHistoryActivity$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, java.lang.String str, Web3PayTxHistoryFilterType web3PayTxHistoryFilterType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCardTransactionHistoryActivity");
            }
            if ((i & 4) != 0) {
                web3PayTxHistoryFilterType = Web3PayTxHistoryFilterType.CARD_ALL;
            }
            interfaceC31257lqc.AEQbTJ(context, str, web3PayTxHistoryFilterType);
        }

        public static /* synthetic */ void startTransactionHistoryActivity$default(InterfaceC31257lqc interfaceC31257lqc, android.content.Context context, Web3PayTxHistoryFilterType web3PayTxHistoryFilterType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransactionHistoryActivity");
            }
            if ((i & 2) != 0) {
                web3PayTxHistoryFilterType = Web3PayTxHistoryFilterType.ALL;
            }
            interfaceC31257lqc.copydefault(context, web3PayTxHistoryFilterType);
        }

        public static /* synthetic */ void showTransactionAlertBottomSheet$default(InterfaceC31257lqc interfaceC31257lqc, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTransactionAlertBottomSheet");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            interfaceC31257lqc.AEQbTJ(fragmentManager, str, str2);
        }
    }
}
