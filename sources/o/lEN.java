package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.immomo.mls.util.NetworkUtil;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.buysell.data.cedefi.BuySellDexEmailSetResult;
import com.okinc.buysell.data.cedefi.BuySellDexEscapeResult;
import com.okinc.buysell.data.cedefi.BuySellDexUpdateInfoResult;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$addObservers$2$1$2$1;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$addObservers$3;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$onViewCreated$1;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$showCryptoCoachmarkIfNeeded$1;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$updateCryptoFiatWidget$4;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$updateCryptoFiatWidget$7;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$updateCryptoFiatWidget$8;
import com.okinc.buysell.ui.bsc.fragment.buy.BuyViewModel;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.ui.bsc.util.InputUtils;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.CampaignBean;
import com.okinc.fiat.api.bean.FiatCryptoRange;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okx.paymentapi.presentation.InputAmountSharedDataSource;
import com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C31351lsQ;
import o.InterfaceC31396ltI;
import o.InterfaceC31430ltq;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lEN extends AbstractC29948lGg<AbstractC31462luV> {
    public final InterfaceC56387yDm fIwbmz;
    public java.lang.String getFieldNames;
    public C52812wZg getNewProxyInstance;
    public final ActivityResultLauncher<EmailRecoveryInput> hDKMBd;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm zLjUOn;
    public boolean zsXlph;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AuCTel = 8;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] AhwBna;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VerificationStatus.values().length];
            try {
                iArr[VerificationStatus.PRE_LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationStatus.PRE_KYC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[InputUtils.ChipType.values().length];
            try {
                iArr2[InputUtils.ChipType.QUICK_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputUtils.ChipType.PERCENTAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputUtils.ChipType.INSUFFICIENT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputUtils.ChipType.BUY_MAX.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[BaseBuySellViewModel.QuoteType.values().length];
            try {
                iArr3[BaseBuySellViewModel.QuoteType.REGULAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[BaseBuySellViewModel.QuoteType.DEX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr3;
            int[] iArr4 = new int[BaseBuySellViewModel.Companion.DexTradeStatus.values().length];
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_NEED_ESCAPING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_PRE_CHECK_FAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_EMAIL_SUFFIX_ILLEGAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_ZK_EMAIL_RECOVER_FAIL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_PASSKEY_NOT_ON_CHAIN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_EMAIL_NOT_ON_CHAIN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_PASSKEY_DELETED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_NOT_EXIST.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            KWHzl = iArr4;
            int[] iArr5 = new int[com.okinc.buysell.ui.bsc.util.InputType.values().length];
            try {
                iArr5[com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            OLrzqt = iArr5;
            int[] iArr6 = new int[InputBaseViewModel.InputValidationResult.values().length];
            try {
                iArr6[InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_NATIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_MAX_DEXMAX_INPUT_BALANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_MAX_DEXMAX_BALANCE_INPUT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.INPUT_BALANCE_MIN_MAX.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.BALANCE_INPUT_MIN_MAX.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.BALANCE_MIN_INPUT_MAX.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.BALANCE_MIN_MAX_INPUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.INPUT_MIN_BALANCE_MAX.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_BALANCE_INPUT_MAX.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_BALANCE_MAX_INPUT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.INPUT_MIN_MAX_BALANCE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT_BALANCE.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_MAX_BALANCE_INPUT.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT_LESS_THAN_BOTH_MIN.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MAX_CHANNEL_LIMIT.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_CHANNEL_LIMIT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MAX_TRADE_LIMIT.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_TRADE_LIMIT.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.INPUT_MIN_MAX.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.ZERO.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.PRE_LOGIN_PRE_KYC.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_INPUT_MAX_BALANCE.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.MIN_INPUT_BALANCE_MAX.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.NATIVE_CHANNEL_VALID.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr6[InputBaseViewModel.InputValidationResult.THIRD_PARTY_VALID.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            AhwBna = iArr6;
        }
    }

    public static final void AYXKKw(android.view.View view) {
    }

    public static final void AhwBna(android.view.View view) {
    }

    public static final void OLrzqt(android.view.View view) {
    }

    public static final void djBIcL(android.view.View view) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31462luV EZpvd(lEN len) {
        return (AbstractC31462luV) len.KWHzl();
    }

    public lEN() {
        super(C31351lsQ.ActionBar.zuBGHE);
        final Function0 function0 = null;
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C29945lGd.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.buy.BuyFragmentV3$special$$inlined$viewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.zsXlph = true;
        this.getFieldNames = "";
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.lFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lEN.gHZMYf();
            }
        });
        ActivityResultLauncher<EmailRecoveryInput> activityResultLauncherRegisterForActivityResult = registerForActivityResult(AwvSrB(), new ActivityResultCallback() { // from class: o.lFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lEN.OLrzqt((EmailRecoveryResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.hDKMBd = activityResultLauncherRegisterForActivityResult;
    }

    public final BSCMasterViewModel QOLQEE() {
        return (BSCMasterViewModel) this.zLjUOn.getValue();
    }

    public final BuyViewModel sSMYrx() {
        return (BuyViewModel) this.iwGUEr.getValue();
    }

    public final C29945lGd zuBGHE() {
        return (C29945lGd) this.fIwbmz.getValue();
    }

    @Override // o.lzR
    public BSCMasterViewModel isConnected() {
        return QOLQEE();
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public BaseBuySellViewModel AuCTel() {
        return sSMYrx();
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public InputBaseViewModel ejfBZ() {
        return zuBGHE();
    }

    public final ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> AwvSrB() {
        return (ActivityResultContract) this.uzCIH.getValue();
    }

    public static final ActivityResultContract gHZMYf() {
        return ((InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class)).copydefault();
    }

    public static final void OLrzqt(EmailRecoveryResult emailRecoveryResult) {
        Intrinsics.checkNotNullParameter(emailRecoveryResult, "");
        if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Cancelled.KWHzl)) {
            pUU.EZpvd("BuyFragmentV3", "Email recovery cancelled");
        } else if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Success.OLrzqt)) {
            pUU.EZpvd("BuyFragmentV3", "Email recovery success");
        } else {
            if (!Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.ResetInProgress.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.EZpvd("BuyFragmentV3", "Email recovery reset in progress");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        sSMYrx().fetchVPNInfo(QOLQEE().fJNWhG() == null);
        Unit unit = null;
        if (z) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelCopydefault = lAA.KWHzl.copydefault();
            if (channelCopydefault != null) {
                java.util.List<PaymentMethod> paymentMethods = channelCopydefault.getPaymentMethods();
                if (paymentMethods != null) {
                    if (!paymentMethods.isEmpty()) {
                        copydefault(channelCopydefault, paymentMethods.get(0));
                    } else {
                        ((AbstractC31462luV) KWHzl()).uzCIH.EZpvd();
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            ((AbstractC31462luV) KWHzl()).uzCIH.EZpvd();
            return;
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelOLrzqt = lAA.KWHzl.OLrzqt();
        if (channelOLrzqt != null) {
            java.util.List<PaymentMethod> paymentMethods2 = channelOLrzqt.getPaymentMethods();
            if (paymentMethods2 != null) {
                if (!paymentMethods2.isEmpty()) {
                    copydefault(channelOLrzqt, paymentMethods2.get(0));
                } else {
                    ((AbstractC31462luV) KWHzl()).uzCIH.EZpvd();
                }
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        ((AbstractC31462luV) KWHzl()).uzCIH.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment, o.lzN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AYXKKw() {
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd;
        java.lang.String coinUrl;
        BuySellConvertParameters fieldNames;
        java.lang.String tokenName;
        BuySellConvertParameters fieldNames2;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelOLrzqt;
        java.lang.String strAuCTel;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd2;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd3;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd4;
        if (!((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna() && C31784mDu.AEQbTJ.copydefault() > 0) {
            BuySellConvertParameters fieldNames3 = QOLQEE().getFieldNames();
            if ((fieldNames3 != null ? fieldNames3.isConnected() : null) == TargetTab.BUY) {
                OLrzqt(true);
                BuySellConvertParameters fieldNames4 = QOLQEE().getFieldNames();
                EZpvd((fieldNames4 != null ? fieldNames4.AEQbTJ() : null) == null);
                BuyViewModel buyViewModelSSMYrx = sSMYrx();
                if (C33492mxV.OLrzqt()) {
                    BuySellConvertParameters fieldNames5 = QOLQEE().getFieldNames();
                    coinUrl = (fieldNames5 == null || (buySellBaseCurrencyInfoEZpvd4 = fieldNames5.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd4.getCoinUrlNight();
                    buyViewModelSSMYrx.DbNXlk(coinUrl);
                    BuyViewModel buyViewModelSSMYrx2 = sSMYrx();
                    BuySellConvertParameters fieldNames6 = QOLQEE().getFieldNames();
                    buyViewModelSSMYrx2.values((fieldNames6 != null || (buySellBaseCurrencyInfoEZpvd3 = fieldNames6.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd3.getChainIcon());
                    fieldNames = QOLQEE().getFieldNames();
                    if (fieldNames != null || (buySellBaseCurrencyInfoEZpvd2 = fieldNames.EZpvd()) == null || (tokenName = buySellBaseCurrencyInfoEZpvd2.getTokenName()) == null) {
                        tokenName = "";
                    }
                    sSMYrx().AkhnZx(tokenName);
                    fieldNames2 = QOLQEE().getFieldNames();
                    if ((fieldNames2 != null ? fieldNames2.AEQbTJ() : null) != null) {
                        channelOLrzqt = lAA.KWHzl.copydefault();
                    } else {
                        channelOLrzqt = lAA.KWHzl.OLrzqt();
                    }
                    if (channelOLrzqt == null && (strAuCTel = channelOLrzqt.getSupportCurrency()) != null) {
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAuCTel)) {
                            strAuCTel = AuCTel().AuCTel();
                        }
                        if (strAuCTel == null) {
                        }
                        this.getFieldNames = tokenName;
                        ((AbstractC31462luV) KWHzl()).valueOf.setTokenCurrency(strAuCTel);
                        ((AbstractC31462luV) KWHzl()).valueOf.djBIcL();
                        AEQbTJ(true);
                    } else {
                        strAuCTel = AuCTel().AuCTel();
                        this.getFieldNames = tokenName;
                        ((AbstractC31462luV) KWHzl()).valueOf.setTokenCurrency(strAuCTel);
                        ((AbstractC31462luV) KWHzl()).valueOf.djBIcL();
                        AEQbTJ(true);
                    }
                } else {
                    BuySellConvertParameters fieldNames7 = QOLQEE().getFieldNames();
                    if (fieldNames7 != null && (buySellBaseCurrencyInfoEZpvd = fieldNames7.EZpvd()) != null) {
                        coinUrl = buySellBaseCurrencyInfoEZpvd.getCoinUrl();
                    }
                    buyViewModelSSMYrx.DbNXlk(coinUrl);
                    BuyViewModel buyViewModelSSMYrx22 = sSMYrx();
                    BuySellConvertParameters fieldNames62 = QOLQEE().getFieldNames();
                    if (fieldNames62 != null) {
                        buyViewModelSSMYrx22.values((fieldNames62 != null || (buySellBaseCurrencyInfoEZpvd3 = fieldNames62.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd3.getChainIcon());
                        fieldNames = QOLQEE().getFieldNames();
                        if (fieldNames != null) {
                            tokenName = "";
                            sSMYrx().AkhnZx(tokenName);
                            fieldNames2 = QOLQEE().getFieldNames();
                            if ((fieldNames2 != null ? fieldNames2.AEQbTJ() : null) != null) {
                            }
                            if (channelOLrzqt == null) {
                                strAuCTel = AuCTel().AuCTel();
                                this.getFieldNames = tokenName;
                                ((AbstractC31462luV) KWHzl()).valueOf.setTokenCurrency(strAuCTel);
                                ((AbstractC31462luV) KWHzl()).valueOf.djBIcL();
                                AEQbTJ(true);
                            }
                        }
                    }
                }
            }
        }
        super.AYXKKw();
        djSkpj();
        sSMYrx().KWHzl(zuBGHE());
        C52794wYp c52794wYp = ((AbstractC31462luV) KWHzl()).iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        EZpvd(c52794wYp);
    }

    public final void dvKsVJ() {
        BuySellConvertParameters fieldNames;
        BuySellConvertParameters fieldNames2 = QOLQEE().getFieldNames();
        if ((fieldNames2 != null ? fieldNames2.isConnected() : null) == TargetTab.BUY && QOLQEE().AkhnZx() == BSCTabIndex.BUY && (fieldNames = QOLQEE().getFieldNames()) != null && fieldNames.gEmmrt()) {
            OLrzqt(InterfaceC31430ltq.TaskDescription.EZpvd);
            BuySellConvertParameters fieldNames3 = QOLQEE().getFieldNames();
            if (fieldNames3 != null) {
                fieldNames3.copydefault(false);
            }
        }
    }

    public final void fZBcTu() {
        BuySellConvertParameters fieldNames;
        BuySellConvertParameters fieldNames2 = QOLQEE().getFieldNames();
        if ((fieldNames2 != null ? fieldNames2.isConnected() : null) == TargetTab.BUY && QOLQEE().AkhnZx() == BSCTabIndex.BUY && (fieldNames = QOLQEE().getFieldNames()) != null && fieldNames.DbNXlk()) {
            BuySellConvertParameters fieldNames3 = QOLQEE().getFieldNames();
            java.lang.String strCopydefault = fieldNames3 != null ? fieldNames3.copydefault() : null;
            if (strCopydefault == null || strCopydefault.length() == 0 || !sSMYrx().RdAHlO() || this.getNewProxyInstance != null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BuyFragmentV3$showCryptoCoachmarkIfNeeded$1(this, strCopydefault, null), 3, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void UeEOUB() {
        lIL lil = ((AbstractC31462luV) KWHzl()).getFieldNames;
        if (dxcTrN() && isResumed()) {
            Intrinsics.copydefault(lil);
            if (lil.getVisibility() != 0) {
                BaseBuySellViewModel.trackAIChatbotEvent$default(AuCTel(), "Simpletrade_Buy_AIChatBotBanner_View", ejfBZ(), null, false, false, null, 60, null);
            }
            lil.setOnClickListener(new View.OnClickListener() { // from class: o.lFs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lEN.ORxRYg(this.KWHzl, view);
                }
            });
            lil.EZpvd();
            return;
        }
        lil.copydefault();
    }

    public static final void ORxRYg(lEN len, android.view.View view) {
        len.OcIXYQ();
    }

    public final boolean dxcTrN() {
        TradingAgentInfo tradingAgentInfo;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AuCTel().AwvSrB();
        if (!QOLQEE().AwvSrB() || !AuCTel().iZzfmt() || !AuCTel().AEQbTJ(channelAwvSrB)) {
            return false;
        }
        if (QOLQEE().zuBGHE() || AuCTel().gkJEwt()) {
            return true;
        }
        return C33129mqd.AEQbTJ(ejfBZ().uzCIH()) >= C33129mqd.AEQbTJ((channelAwvSrB == null || (tradingAgentInfo = channelAwvSrB.getTradingAgentInfo()) == null) ? null : tradingAgentInfo.getQuoteLimit());
    }

    public final void OcIXYQ() {
        BaseBuySellViewModel.trackAIChatbotEvent$default(AuCTel(), "Simpletrade_Buy_AIChatBotBanner_Click", ejfBZ(), null, true, QOLQEE().zuBGHE(), java.lang.Boolean.valueOf(!AuCTel().getNewProxyInstance().OLrzqt()), 4, null);
        if (AuCTel().getNewProxyInstance().OLrzqt()) {
            zsXlph();
            return;
        }
        C29816lBj c29816lBjOLrzqt = C29816lBj.Companion.OLrzqt(QKVWgx(), new Function0() { // from class: o.lFx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lEN.djBIcL(this.EZpvd);
            }
        }, new Function0() { // from class: o.lFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lEN.gEmmrt(this.KWHzl);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29816lBjOLrzqt.show(childFragmentManager);
    }

    public static final Unit djBIcL(lEN len) {
        len.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(lEN len) {
        len.AuCTel().getNewProxyInstance().KWHzl();
        return Unit.INSTANCE;
    }

    public final java.lang.String QKVWgx() {
        TradingAgentInfo tradingAgentInfo;
        BuySellCurrency buySellCurrencyAEQbTJ;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AuCTel().AwvSrB();
        if (channelAwvSrB == null || (tradingAgentInfo = channelAwvSrB.getTradingAgentInfo()) == null) {
            return "";
        }
        boolean z = channelAwvSrB.getPaymentMethodCategory() == PaymentMethodCategory.STABLECOIN;
        boolean zCopydefault = AuCTel().copydefault(channelAwvSrB);
        java.lang.String peggedCurrency = channelAwvSrB.getSupportCurrencyInfo().getPeggedCurrency();
        InputBaseViewModel inputBaseViewModelEjfBZ = ejfBZ();
        java.lang.String quoteLimit = tradingAgentInfo.getQuoteLimit();
        java.lang.String supportCurrency = channelAwvSrB.getSupportCurrency();
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
        return inputBaseViewModelEjfBZ.AEQbTJ(quoteLimit, supportCurrency, (actionBar == null || (buySellCurrencyAEQbTJ = actionBar.AEQbTJ()) == null) ? null : buySellCurrencyAEQbTJ.getSymbol(), z, zCopydefault, peggedCurrency);
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment, o.lzN
    public void EZpvd() {
        super.EZpvd();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAxsJAY = QOLQEE().AxsJAY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAxsJAY, viewLifecycleOwner, new Function1() { // from class: o.lFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        final BuyViewModel buyViewModelSSMYrx = sSMYrx();
        LiveData<C32989mnw<kotlin.Pair<BaseBuySellViewModel.ActionBar, kotlin.Pair<com.okinc.okpaymentapi.data.remote.model.management.Channel, PaymentMethod>>>> liveDataFvQaOB = buyViewModelSSMYrx.fvQaOB();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFvQaOB, viewLifecycleOwner2, new Function1() { // from class: o.lFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.EZpvd, buyViewModelSSMYrx, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFinit = buyViewModelSSMYrx.finit();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFinit, viewLifecycleOwner3, new Function1() { // from class: o.lFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.djBIcL(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<BaseBuySellViewModel.ActionBar>> liveDataQOLQEE = buyViewModelSSMYrx.QOLQEE();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataQOLQEE, viewLifecycleOwner4, new Function1() { // from class: o.lFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.KWHzl(this.AEQbTJ, buyViewModelSSMYrx, (BaseBuySellViewModel.ActionBar) obj);
            }
        });
        LiveData<C32989mnw<kotlin.Pair<com.okinc.okpaymentapi.data.remote.model.management.Channel, PaymentMethod>>> liveDataSSMYrx = buyViewModelSSMYrx.sSMYrx();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataSSMYrx, viewLifecycleOwner5, new Function1() { // from class: o.lFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataUeEOUB = buyViewModelSSMYrx.UeEOUB();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataUeEOUB, viewLifecycleOwner6, new Function1() { // from class: o.lFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.EZpvd(this.EZpvd, (Unit) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataDjSkpj = buyViewModelSSMYrx.djSkpj();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataDjSkpj, viewLifecycleOwner7, new Function1() { // from class: o.lFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.copydefault, (Unit) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQUSxYX = buyViewModelSSMYrx.QUSxYX();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(liveDataQUSxYX, viewLifecycleOwner8, new Function1() { // from class: o.lFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataRcXXUw = buyViewModelSSMYrx.RcXXUw();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        mha.copydefault(liveDataRcXXUw, viewLifecycleOwner9, new Function1() { // from class: o.lFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQbewEr = buyViewModelSSMYrx.QbewEr();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        mha.copydefault(liveDataQbewEr, viewLifecycleOwner10, new Function1() { // from class: o.lFo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.KWHzl, buyViewModelSSMYrx, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<CampaignBean>> liveDataDCJXGO = buyViewModelSSMYrx.DCJXGO();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        mha.copydefault(liveDataDCJXGO, viewLifecycleOwner11, new Function1() { // from class: o.lFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.AEQbTJ(this.KWHzl, (CampaignBean) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BuyFragmentV3$addObservers$3(this, null), 3, null);
        QUSxYX();
        ORxRYg();
    }

    public static final Unit OLrzqt(lEN len, boolean z) {
        len.UeEOUB();
        executeInputValidation$default(len, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(lEN len, BuyViewModel buyViewModel, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) pair.component1();
        kotlin.Pair pair2 = (kotlin.Pair) pair.component2();
        if (len.QOLQEE().AkhnZx() == BSCTabIndex.BUY) {
            len.fFgQHt();
            len.QOLQEE().copydefault((com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.getFirst(), (PaymentMethod) pair2.getSecond());
        }
        len.QOLQEE().KWHzl(((com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.getFirst()).getDepositName());
        VerificationStatus verificationStatusFJNWhG = len.QOLQEE().fJNWhG();
        int i = verificationStatusFJNWhG == null ? -1 : Activity.copydefault[verificationStatusFJNWhG.ordinal()];
        if (i == -1) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.component1();
            buyViewModel.OLrzqt(channel, (PaymentMethod) pair2.component2());
            buyViewModel.copydefault(actionBar);
            if (!C33129mqd.KWHzl((java.util.Collection) channel.getPaymentMethods())) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(len), null, null, new BuyFragmentV3$addObservers$2$1$2$1(buyViewModel, len, null), 3, null);
                len.zuBGHE().AEQbTJ((FiatCryptoRange) null);
            } else {
                len.zuBGHE().OLrzqt(channel);
                len.sSMYrx().fetchVPNInfo(true);
            }
            len.RJOkX();
            len.UeEOUB();
        } else {
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            buyViewModel.djBIcL(false);
            buyViewModel.copydefault(actionBar);
            len.sSMYrx().isConnected(buyViewModel.DbNXlk(C31351lsQ.Activity.DxnCrt));
            len.sSMYrx().fetchVPNInfo(false);
        }
        BaseBuySellViewModel.getQuotedPrice$default(len.sSMYrx(), len.sSMYrx().OcIXYQ(), len.sSMYrx().zuBGHE(), ((AbstractC31462luV) len.KWHzl()).valueOf.KWHzl(), len.zuBGHE(), false, false, 48, null);
        len.copydefault(InputUtils.ChipType.QUICK_AMOUNT);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(lEN len, boolean z) {
        C30019lIx c30019lIx = ((AbstractC31462luV) len.KWHzl()).valueOf;
        if (z) {
            c30019lIx.setFiatCurrencyDropDownVisibility(0);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
            len.dNCPSb();
        } else {
            c30019lIx.setFiatCurrencyDropDownVisibility(8);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(0);
            len.DTwDnp();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lEN len, BuyViewModel buyViewModel, BaseBuySellViewModel.ActionBar actionBar) {
        if (actionBar != null) {
            C30019lIx c30019lIx = ((AbstractC31462luV) len.KWHzl()).valueOf;
            if (len.zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
                c30019lIx.setTokenCurrency(len.KWHzl(actionBar.AEQbTJ().getCurrency()));
            } else {
                c30019lIx.setTokenCurrency(actionBar.copydefault().getCurrency());
            }
            if (len.QOLQEE().AEQbTJ(TargetTab.BUY) && buyViewModel.QVAiDq()) {
                len.QOLQEE().OLrzqt(actionBar.copydefault());
                buyViewModel.EZpvd(false);
            }
            if (len.zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                ((AbstractC31462luV) len.KWHzl()).valueOf.setTokenCurrency(actionBar.copydefault().getCurrency());
            }
            len.OLrzqt(actionBar.AEQbTJ(), actionBar.copydefault());
            if (!len.getFieldNames()) {
                len.AuCTelauCTel();
            } else {
                len.copydefault(false);
            }
            len.sSMYrx().accept();
            len.sSMYrx().AxsJAYsNCnLh();
            len.KWHzl(actionBar.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lEN len, kotlin.Pair pair) {
        if (pair != null) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.component1();
            PaymentMethod paymentMethod = (PaymentMethod) pair.component2();
            len.zuBGHE().OLrzqt(channel);
            len.copydefault(channel, paymentMethod);
            len.QOLQEE().copydefault(channel, paymentMethod);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) len.sSMYrx().OuxcSI().getValue()) && !len.sSMYrx().RlQdEF()) {
                len.sSMYrx().isConnected("");
            }
        }
        if (!len.zsXlph) {
            len.fFgQHt();
        }
        len.sSMYrx().OLrzqt(false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(lEN len, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ((AbstractC31462luV) len.KWHzl()).uzCIH.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(lEN len, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ((AbstractC31462luV) len.KWHzl()).uzCIH.KWHzl(!len.sSMYrx().RlQdEF());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(lEN len, boolean z) {
        C52794wYp c52794wYp = ((AbstractC31462luV) len.KWHzl()).iwGUEr;
        if (z) {
            c52794wYp.OLrzqt(0L);
        } else {
            c52794wYp.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(lEN len, boolean z) {
        if (!z) {
            len.QOLQEE().QKVWgx();
            len.OLrzqt(true);
        }
        AbstractC31462luV abstractC31462luV = (AbstractC31462luV) len.KWHzl();
        abstractC31462luV.djBIcL.setVisibility(z ? 0 : 8);
        abstractC31462luV.AYXKKw.setVisibility(z ? 4 : 0);
        abstractC31462luV.AEQbTJ.setVisibility(z ? 4 : 0);
        abstractC31462luV.gEmmrt.setVisibility(8);
        if (!z) {
            len.fZBcTu();
        }
        len.dvKsVJ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final lEN len, BuyViewModel buyViewModel, boolean z) {
        if (z) {
            len.OLrzqt(false);
            buyViewModel.QKudOq();
            AbstractC31462luV abstractC31462luV = (AbstractC31462luV) len.KWHzl();
            abstractC31462luV.djBIcL.setVisibility(8);
            abstractC31462luV.AYXKKw.setVisibility(4);
            abstractC31462luV.AEQbTJ.setVisibility(4);
            abstractC31462luV.gEmmrt.setVisibility(0);
            C55173xeu c55173xeu = abstractC31462luV.AhwBna;
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
            c55173xeu.AEQbTJ().setVisibility(0);
            c55173xeu.AEQbTJ().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
            c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lFf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lEN.wlaJM(this.KWHzl, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.buysell.ui.bsc.BaseBuySellFragment.load$default(com.okinc.buysell.ui.bsc.BaseBuySellFragment, boolean, int, java.lang.Object):void */
    public static final void wlaJM(lEN len, android.view.View view) {
        if (NetworkUtil.AEQbTJ(len.requireContext())) {
            BaseBuySellFragment.load$default(len, false, 1, null);
        }
    }

    public static final Unit AEQbTJ(lEN len, CampaignBean campaignBean) {
        Intrinsics.checkNotNullParameter(campaignBean, "");
        executeInputValidation$default(len, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QVAiDq() {
        boolean zHUfVAv = sSMYrx().hUfVAv();
        ((AbstractC31462luV) KWHzl()).valueOf.setToggleIconVisibility(!zHUfVAv);
        if (zHUfVAv) {
            AxsJAY();
            zuBGHE().copydefault(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        } else {
            RcXXUw();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void RcXXUw() {
        ((AbstractC31462luV) KWHzl()).valueOf.setCurrencyToggleOnClickListener(new View.OnClickListener() { // from class: o.lFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.DTwDnp(this.OLrzqt, view);
            }
        });
    }

    public static final void DTwDnp(lEN len, android.view.View view) {
        len.zuBGHE().KWHzl(true);
        len.AuCTelauCTel();
        len.zuBGHE().AubY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AxsJAY() {
        ((AbstractC31462luV) KWHzl()).valueOf.setCurrencyToggleOnClickListener(new View.OnClickListener() { // from class: o.lFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.OLrzqt(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void finit() {
        sSMYrx().isConnected(C33070mpX.AYXKKw(C31351lsQ.Activity.Th));
        sSMYrx().fetchVPNInfo(false);
        lIE lie = ((AbstractC31462luV) KWHzl()).uzCIH;
        updatePaymentSelectionWidget$default(this, null, null, 3, null);
        lie.KWHzl(false);
    }

    public final void KWHzl(CurrencyToken currencyToken) {
        sSMYrx().DbNXlk(C33492mxV.OLrzqt() ? currencyToken.getNightIcon() : currencyToken.getIcon());
        sSMYrx().values(currencyToken.getDexInfo().getChainLogo());
        sSMYrx().AkhnZx(currencyToken.getCurrency());
        BuyViewModel buyViewModelSSMYrx = sSMYrx();
        EarnOption earnOption = currencyToken.getEarnOption();
        buyViewModelSSMYrx.fetchVPNInfo(earnOption != null ? earnOption.getEarnRate() : null);
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void KWHzl(boolean z) {
        if (!z) {
            sSMYrx().djBIcL(!iwGUEr());
        }
        BuyViewModel buyViewModelSSMYrx = sSMYrx();
        java.lang.String strZsXlph = buyViewModelSSMYrx.zsXlph();
        java.lang.String strAuCTelauCTel = buyViewModelSSMYrx.AuCTelauCTel();
        java.lang.String strZLjUOn = buyViewModelSSMYrx.zLjUOn();
        if (strZLjUOn.length() <= 0) {
            strZLjUOn = null;
        }
        if (strZLjUOn == null) {
            strZLjUOn = zuBGHE().OLrzqt();
        }
        BaseBuySellViewModel.getTradeSuggestionData$default(buyViewModelSSMYrx, null, strZsXlph, strAuCTelauCTel, strZLjUOn, zuBGHE().uzCIH(), zuBGHE().fetchVPNInfo(), false, 1, null);
    }

    public final void EZpvd(CurrencyToken currencyToken) {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB;
        java.lang.String strOcIXYQ;
        java.lang.String currency;
        SupportCurrencyInfo supportCurrencyInfo;
        sSMYrx().AYXKKw("cryptocurrency_list_button");
        C29882lDv c29882lDv = new C29882lDv();
        if (sSMYrx().copydefault(sSMYrx().AwvSrB())) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = sSMYrx().AwvSrB();
            strOcIXYQ = (channelAwvSrB2 == null || (supportCurrencyInfo = channelAwvSrB2.getSupportCurrencyInfo()) == null) ? null : supportCurrencyInfo.getPeggedCurrency();
        } else {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB3 = sSMYrx().AwvSrB();
            strOcIXYQ = ((channelAwvSrB3 == null || !C31662lzj.OLrzqt(channelAwvSrB3)) && ((channelAwvSrB = sSMYrx().AwvSrB()) == null || !C31662lzj.valueOf(channelAwvSrB))) ? "" : sSMYrx().OcIXYQ();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
            currency = currencyToken.getDexInfo().getUniqueId();
        } else {
            currency = currencyToken.getCurrency();
        }
        c29882lDv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("list_type", BuySellCryptoListFragment.Companion.ListType.BUY), C56390yDp.OLrzqt("selected_token", currency), C56390yDp.OLrzqt("selected_currency", strOcIXYQ)));
        c29882lDv.copydefault(new Function1() { // from class: o.lFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt(this.EZpvd, (CurrencyToken) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29882lDv.show(childFragmentManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(lEN len, CurrencyToken currencyToken) {
        BuySellCurrency buySellCurrency;
        boolean z;
        java.lang.String str;
        java.lang.String strOcIXYQ = "";
        Intrinsics.checkNotNullParameter(currencyToken, "");
        if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getDexInfo().getUniqueId(), (java.lang.Object) len.sSMYrx().ORxRYg().getUniqueId())) {
            len.sSMYrx().KWHzl(currencyToken.getDexInfo());
            len.QVAiDq();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) len.sSMYrx().zuBGHE(), (java.lang.Object) currencyToken.getCurrency())) {
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(len.sSMYrx().QOLQEE());
            if (actionBar == null || (buySellCurrency = actionBar.AEQbTJ()) == null) {
                buySellCurrency = new BuySellCurrency((java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) null, 131071, (DefaultConstructorMarker) null);
            }
            len.sSMYrx().copydefault(new BaseBuySellViewModel.ActionBar(buySellCurrency, currencyToken));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
                len.AuCTelauCTel();
                len.QOLQEE().OcIXYQ();
            } else {
                java.lang.String currency = currencyToken.getCurrency();
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = len.sSMYrx().AwvSrB();
                if (!Intrinsics.EZpvd((java.lang.Object) currency, (java.lang.Object) (channelAwvSrB != null ? channelAwvSrB.getSupportCurrency() : null))) {
                    z = false;
                }
                java.lang.String strOcIXYQ2 = len.sSMYrx().OcIXYQ();
                C29945lGd c29945lGdZuBGHE = len.zuBGHE();
                c29945lGdZuBGHE.EZpvd(true);
                BaseBuySellViewModel.getQuotedPrice$default(len.sSMYrx(), strOcIXYQ2, currencyToken.getCurrency(), c29945lGdZuBGHE.djBIcL(), c29945lGdZuBGHE, true, false, 32, null);
                len.KWHzl(currencyToken);
                if (!currencyToken.getTradeSupportedCurrencies().isEmpty()) {
                    strOcIXYQ = len.sSMYrx().OcIXYQ();
                } else {
                    for (java.lang.String str2 : currencyToken.getTradeSupportedCurrencies()) {
                        if (C59449zhJ.gEmmrt(len.sSMYrx().OcIXYQ(), str2, true)) {
                            str = str2;
                            break;
                        }
                    }
                }
                str = strOcIXYQ;
                len.sSMYrx().AEQbTJ(currencyToken, currencyToken.getCurrency(), str, "", "", len.zuBGHE().fetchVPNInfo(), z);
            }
            z = true;
            java.lang.String strOcIXYQ22 = len.sSMYrx().OcIXYQ();
            C29945lGd c29945lGdZuBGHE2 = len.zuBGHE();
            c29945lGdZuBGHE2.EZpvd(true);
            BaseBuySellViewModel.getQuotedPrice$default(len.sSMYrx(), strOcIXYQ22, currencyToken.getCurrency(), c29945lGdZuBGHE2.djBIcL(), c29945lGdZuBGHE2, true, false, 32, null);
            len.KWHzl(currencyToken);
            if (!currencyToken.getTradeSupportedCurrencies().isEmpty()) {
            }
            str = strOcIXYQ;
            len.sSMYrx().AEQbTJ(currencyToken, currencyToken.getCurrency(), str, "", "", len.zuBGHE().fetchVPNInfo(), z);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fFgQHt() {
        if (QOLQEE().AkhnZx() == BSCTabIndex.BUY) {
            C52794wYp c52794wYp = ((AbstractC31462luV) KWHzl()).iwGUEr;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            EZpvd(c52794wYp);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
            ((AbstractC31462luV) KWHzl()).valueOf.setTokenCurrency(KWHzl(str));
        }
        BaseBuySellViewModel.getTradeSuggestionData$default(sSMYrx(), null, sSMYrx().zuBGHE(), str, "", "", zuBGHE().fetchVPNInfo(), z, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dNCPSb() {
        final C30019lIx c30019lIx = ((AbstractC31462luV) KWHzl()).valueOf;
        aKErDB();
        c30019lIx.setFiatCurrencyDropDownOnClickListener(new View.OnClickListener() { // from class: o.lFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.AEQbTJ(this.KWHzl, c30019lIx, view);
            }
        });
    }

    public static final void AEQbTJ(final lEN len, final C30019lIx c30019lIx, android.view.View view) {
        java.lang.String currency;
        BuySellCurrency buySellCurrencyAEQbTJ;
        java.lang.String currency2;
        BaseBuySellViewModel.ActionBar actionBar;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        len.sSMYrx().AYXKKw("fiatcurrency_list_button");
        mHA mha = mHA.OLrzqt;
        kotlin.Pair pair = (kotlin.Pair) mha.AEQbTJ(len.sSMYrx().fvQaOB());
        java.lang.String str = "";
        if (pair == null || (actionBar = (BaseBuySellViewModel.ActionBar) pair.getFirst()) == null || (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) == null || (currency = buySellCurrencyAEQbTJ2.getCurrency()) == null) {
            currency = "";
        }
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(len.sSMYrx().QOLQEE());
        if (actionBar2 != null && (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) != null && (currency2 = buySellCurrencyAEQbTJ.getCurrency()) != null) {
            str = currency2;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("default_currency", currency), C56390yDp.OLrzqt("selected_currency", str), C56390yDp.OLrzqt("selected_token", len.sSMYrx().zuBGHE()), C56390yDp.OLrzqt("trade_type", len.sSMYrx().flVtFt()));
        lJO ljo = new lJO(new yHO() { // from class: o.lFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return lEN.EZpvd(this.KWHzl, c30019lIx, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        ljo.setArguments(bundleBundleOf);
        ljo.show(len.getChildFragmentManager(), "CurrencySelectionBottomSheet");
    }

    public static final Unit EZpvd(lEN len, C30019lIx c30019lIx, java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        len.sSMYrx().gEmmrt(z);
        if (!Intrinsics.EZpvd((java.lang.Object) len.sSMYrx().OcIXYQ(), (java.lang.Object) str)) {
            if (len.zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
                c30019lIx.setTokenCurrency(str);
            }
            BaseBuySellViewModel.getTradeSuggestionData$default(len.sSMYrx(), null, str2, str, "", "", len.zuBGHE().fetchVPNInfo(), true, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final void QfsBiF() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel;
        BuyViewModel buyViewModelSSMYrx = sSMYrx();
        java.lang.String strOcIXYQ = sSMYrx().OcIXYQ();
        java.lang.String strZuBGHE = sSMYrx().zuBGHE();
        mHA mha = mHA.OLrzqt;
        kotlin.Pair pair = (kotlin.Pair) mha.AEQbTJ(sSMYrx().sSMYrx());
        java.lang.String depositName = (pair == null || (channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst()) == null) ? null : channel.getDepositName();
        if (depositName == null) {
            depositName = "";
        }
        buyViewModelSSMYrx.copydefault(strOcIXYQ, strZuBGHE, depositName);
        if (sSMYrx().dNCPSb()) {
            int iFetchVPNInfo = zuBGHE().fetchVPNInfo();
            java.lang.String strOLrzqt = zuBGHE().OLrzqt();
            java.lang.String strUzCIH = zuBGHE().uzCIH();
            kotlin.Pair pair2 = (kotlin.Pair) mha.AEQbTJ(sSMYrx().sSMYrx());
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = pair2 != null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.getFirst() : null;
            kotlin.Pair pair3 = (kotlin.Pair) mha.AEQbTJ(sSMYrx().sSMYrx());
            copydefault(java.lang.Integer.valueOf(iFetchVPNInfo), strOLrzqt, strUzCIH, channel2, pair3 != null ? (PaymentMethod) pair3.getSecond() : null);
            return;
        }
        java.lang.String strUzCIH2 = zuBGHE().uzCIH();
        java.lang.String strOLrzqt2 = zuBGHE().OLrzqt();
        int iFetchVPNInfo2 = zuBGHE().fetchVPNInfo();
        boolean zOLrzqt = BuyFrequencyOption.Companion.OLrzqt(QOLQEE().zLjUOn());
        kotlin.Pair pair4 = (kotlin.Pair) mha.AEQbTJ(sSMYrx().sSMYrx());
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = pair4 != null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair4.getFirst() : null;
        kotlin.Pair pair5 = (kotlin.Pair) mha.AEQbTJ(sSMYrx().sSMYrx());
        EZpvd(strUzCIH2, strOLrzqt2, iFetchVPNInfo2, zOLrzqt, channel3, pair5 != null ? (PaymentMethod) pair5.getSecond() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DTwDnp() {
        C30019lIx c30019lIx = ((AbstractC31462luV) KWHzl()).valueOf;
        c30019lIx.setFiatCurrencyDropDownVisibility(8);
        c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
        c30019lIx.setFiatCurrencyDropDownOnClickListener(new View.OnClickListener() { // from class: o.lFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.djBIcL(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void aKErDB() {
        C30019lIx c30019lIx = ((AbstractC31462luV) KWHzl()).valueOf;
        if (zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
            c30019lIx.setFiatCurrencyDropDownVisibility(0);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
        } else {
            c30019lIx.setFiatCurrencyDropDownVisibility(8);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djSkpj() {
        final C30019lIx c30019lIx = ((AbstractC31462luV) KWHzl()).valueOf;
        c30019lIx.setToggleContainerVisibility(0);
        QVAiDq();
        ((AbstractC31462luV) KWHzl()).ejfBZ.setEditable(c30019lIx.AEQbTJ());
        ((AbstractC31462luV) KWHzl()).ejfBZ.setOKDSSize(C30018lIw.OLrzqt(c30019lIx.getContext()));
        c30019lIx.setDebounceOnTextChangedListener(new Function1() { // from class: o.lFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.AEQbTJ(this.EZpvd, c30019lIx, (java.lang.String) obj);
            }
        });
        EZpvd("0");
    }

    public static final Unit AEQbTJ(lEN len, C30019lIx c30019lIx, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        len.zuBGHE().OLrzqt(false);
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) len.sSMYrx().ORxRYg().getUniqueId()) && len.sSMYrx().fIwbmz().copydefault() != BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR;
        if (!len.zsXlph && len.sSMYrx().gasjUx() && !z) {
            BaseBuySellViewModel.getQuotedPrice$default(len.sSMYrx(), len.sSMYrx().OcIXYQ(), len.sSMYrx().zuBGHE(), c30019lIx.KWHzl(), len.zuBGHE(), false, !Intrinsics.EZpvd((java.lang.Object) c30019lIx.KWHzl(), (java.lang.Object) "0"), 16, null);
        }
        len.zuBGHE().copydefault(c30019lIx.KWHzl(), len.zuBGHE().getNewProxyInstance() || len.zuBGHE().hDKMBd());
        executeInputValidation$default(len, null, 1, null);
        len.sSMYrx().AhwBna(false);
        if (!len.zsXlph) {
            if (len.zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                len.zuBGHE().KWHzl(false);
                len.zuBGHE().copydefault(false);
            }
        } else {
            len.zsXlph = false;
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BuyFragmentV3$onViewCreated$1(this, null), 3, null);
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment, o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            sSMYrx().EZpvd(activity);
        }
        if (sSMYrx().gasjUx()) {
            BaseBuySellViewModel.getQuotedPrice$default(sSMYrx(), sSMYrx().OcIXYQ(), sSMYrx().zuBGHE(), zuBGHE().djBIcL(), zuBGHE(), false, false, 48, null);
            if (zuBGHE().KWHzl() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                executeInputValidation$default(this, null, 1, null);
            }
        }
        sSMYrx().DXXBbs();
        UeEOUB();
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C52812wZg c52812wZg = this.getNewProxyInstance;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        this.getNewProxyInstance = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() throws java.lang.Throwable {
        FragmentActivity activity;
        super.onStop();
        if (!((AbstractC31462luV) KWHzl()).iwGUEr.isEnabled() || sSMYrx().hUfVAv() || (activity = getActivity()) == null) {
            return;
        }
        sSMYrx().OLrzqt(activity, sSMYrx().zuBGHE(), C46881tfY.KWHzl(QOLQEE().zLjUOn().getFrequencyModel().getFrequency()).getTxt(), C46880tfX.AEQbTJ(QOLQEE().zLjUOn().getFrequencyModel().getFrequency()).getTxt(), sSMYrx().getPostValueLengthLimit().getSimpleTradeNotificationDurationInMins());
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.EZpvd;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = application.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = application.copydefault;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = application.KWHzl;
            }
            return application.KWHzl(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            return new Application(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AEQbTJ;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.copydefault;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.KWHzl;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CryptoWidgetData(tokenSelectorIconUrl=" + this.OLrzqt + ", tokenSelectorQuoteIconUrl=" + this.EZpvd + ", tokenSelectorTokenName=" + this.AEQbTJ + ", preFlowText=" + this.copydefault + ", tokenSelectorTokenEarnRate=" + this.KWHzl + ")";
        }

        public Application(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.OLrzqt = str;
            this.EZpvd = str2;
            this.AEQbTJ = str3;
            this.copydefault = str4;
            this.KWHzl = str5;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                str = actionBar.KWHzl;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = actionBar.EZpvd;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = actionBar.OLrzqt;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(z, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            return new ActionBar(z, str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.copydefault == actionBar.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.String str = this.KWHzl;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.EZpvd;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.OLrzqt;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.AEQbTJ;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PaymentSelectorData(shouldShowBottomChevron=" + this.copydefault + ", paymentMethod=" + this.KWHzl + ", availBalance=" + this.EZpvd + ", balanceLabel=" + this.OLrzqt + ", paymentIconUrl=" + this.AEQbTJ + ")";
        }

        public ActionBar(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.copydefault = z;
            this.KWHzl = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
        }
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = FlowKt.combine(FlowKt.combine(sSMYrx().RKDWNf(), sSMYrx().OBJEWx(), sSMYrx().dHguZz(), sSMYrx().OuxcSI(), sSMYrx().QHmsKR(), BuyFragmentV3$updateCryptoFiatWidget$4.INSTANCE), FlowKt.combine(sSMYrx().QSBOWP(), sSMYrx().zuWLRA(), sSMYrx().ODWQjV(), sSMYrx().DCUTEI(), sSMYrx().ffGIBT(), BuyFragmentV3$updateCryptoFiatWidget$7.INSTANCE), new BuyFragmentV3$updateCryptoFiatWidget$8(this, null)).collect(new StateListAnimator(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation) {
        return new Application(str, str2, str3, str4, str5);
    }

    public static final /* synthetic */ java.lang.Object KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation) {
        return new ActionBar(z, str, str2, str3, str4);
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C31437ltx c31437ltx, Continuation<? super Unit> continuation) {
            lEN.EZpvd(lEN.this).uzCIH.KWHzl(c31437ltx);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.util.List<java.lang.Integer> list, java.lang.String str, java.lang.String str2, final Function1<? super java.lang.String, Unit> function1) {
        sSMYrx().valueOf(false);
        java.util.List listGEmmrt = yDY.gEmmrt(((AbstractC31462luV) KWHzl()).OLrzqt, ((AbstractC31462luV) KWHzl()).KWHzl, ((AbstractC31462luV) KWHzl()).copydefault, ((AbstractC31462luV) KWHzl()).EZpvd);
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            final int iIntValue = ((java.lang.Number) obj).intValue();
            java.lang.String strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(C33129mqd.AYXKKw(java.lang.Integer.valueOf(iIntValue)), str, str2, null, null, false, 28, null);
            C54984xbQ c54984xbQ = (C54984xbQ) listGEmmrt.get(i);
            Intrinsics.copydefault(c54984xbQ);
            lIH.OLrzqt(c54984xbQ);
            c54984xbQ.setText(strPrependFiatSymbol$default);
            c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.lFN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lEN.OLrzqt(function1, iIntValue, view);
                }
            });
            c54984xbQ.setVisibility(0);
            i++;
        }
        int size = listGEmmrt.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            ((C54984xbQ) listGEmmrt.get(size2)).setVisibility(8);
        }
    }

    public static final void OLrzqt(Function1 function1, int i, android.view.View view) {
        function1.invoke(C33129mqd.AYXKKw(java.lang.Integer.valueOf(i)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(final java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> list, final Function2<? super java.lang.Double, ? super java.lang.String, Unit> function2) {
        java.util.List listGEmmrt = yDY.gEmmrt(((AbstractC31462luV) KWHzl()).OLrzqt, ((AbstractC31462luV) KWHzl()).KWHzl, ((AbstractC31462luV) KWHzl()).copydefault, ((AbstractC31462luV) KWHzl()).EZpvd);
        if (list.size() == 1 && Intrinsics.EZpvd((java.lang.Object) list.get(0).getSecond(), (java.lang.Object) getString(C31351lsQ.Activity.zuWLRA)) && QOLQEE().fJNWhG() != VerificationStatus.PRE_LOGIN) {
            java.util.Iterator it = listGEmmrt.iterator();
            while (it.hasNext()) {
                ((C54984xbQ) it.next()).setVisibility(8);
            }
            C52794wYp c52794wYp = ((AbstractC31462luV) KWHzl()).isConnected;
            c52794wYp.setVisibility(0);
            c52794wYp.setText(list.get(0).getSecond());
            c52794wYp.setEnabled(true);
            c52794wYp.setClickable(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lFW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lEN.AEQbTJ(function2, list, view);
                }
            });
            sSMYrx().valueOf(true);
            return;
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            kotlin.Pair pair = (kotlin.Pair) obj;
            final double dDoubleValue = ((java.lang.Number) pair.component1()).doubleValue();
            final java.lang.String str = (java.lang.String) pair.component2();
            C54984xbQ c54984xbQ = (C54984xbQ) CollectionsKt___CollectionsKt.AkhnZx(listGEmmrt, i);
            if (c54984xbQ != null) {
                c54984xbQ.setVisibility(0);
                lIH.OLrzqt(c54984xbQ);
                c54984xbQ.setText(str);
                c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.lFS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.KWHzl(function2, dDoubleValue, str, view);
                    }
                });
            }
            i++;
        }
        java.util.Iterator it2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listGEmmrt, list.size()).iterator();
        while (it2.hasNext()) {
            ((C54984xbQ) it2.next()).setVisibility(8);
        }
        C52794wYp c52794wYp2 = ((AbstractC31462luV) KWHzl()).isConnected;
        c52794wYp2.setOnClickListener(null);
        c52794wYp2.setVisibility(8);
        sSMYrx().valueOf(false);
    }

    public static final void AEQbTJ(Function2 function2, java.util.List list, android.view.View view) {
        function2.invoke(((kotlin.Pair) list.get(0)).getFirst(), ((kotlin.Pair) list.get(0)).getSecond());
    }

    public static final void KWHzl(Function2 function2, double d, java.lang.String str, android.view.View view) {
        function2.invoke(java.lang.Double.valueOf(d), str);
    }

    public static /* synthetic */ void setupChipsContainer$default(lEN len, InputUtils.ChipType chipType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            chipType = InputUtils.ChipType.QUICK_AMOUNT;
        }
        len.copydefault(chipType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(InputUtils.ChipType chipType) {
        java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> listEZpvd;
        final C30019lIx c30019lIx = ((AbstractC31462luV) KWHzl()).valueOf;
        int i = Activity.AEQbTJ[chipType.ordinal()];
        if (i == 1) {
            if (!zuBGHE().iwGUEr().isEmpty()) {
                AEQbTJ(zuBGHE().iwGUEr(), sSMYrx().OcIXYQ(), sSMYrx().QKVWgx(), new Function1() { // from class: o.lFK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return lEN.OLrzqt(this.OLrzqt, (java.lang.String) obj);
                    }
                });
                return;
            }
            return;
        }
        if (i == 2) {
            java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> listQkdxfA = sSMYrx().QkdxfA();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listQkdxfA, 10));
            for (kotlin.Pair<java.lang.Double, java.lang.String> pair : listQkdxfA) {
                arrayList.add(InputUtils.AEQbTJ.EZpvd(pair, C33069mpW.copydefault(this, C31351lsQ.Activity.OxVOHk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pair.getSecond())))));
            }
            AEQbTJ(arrayList, new Function2() { // from class: o.lFP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return lEN.AEQbTJ(this.OLrzqt, c30019lIx, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            AEQbTJ(C56402yEa.EZpvd(new kotlin.Pair(java.lang.Double.valueOf(1003.0d), getString(C31351lsQ.Activity.zuWLRA))), new Function2() { // from class: o.lFR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return lEN.KWHzl(this.copydefault, c30019lIx, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
                }
            });
            return;
        }
        if (isConnected().fJNWhG() == null && ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw()) {
            listEZpvd = yDY.gEmmrt(new kotlin.Pair(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), getString(C31351lsQ.Activity.DLWbHP)), new kotlin.Pair(java.lang.Double.valueOf(1002.0d), getString(C31351lsQ.Activity.onComplete)));
        } else {
            listEZpvd = C56402yEa.EZpvd(new kotlin.Pair(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), getString(C31351lsQ.Activity.DLWbHP)));
        }
        AEQbTJ(listEZpvd, new Function2() { // from class: o.lFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return lEN.copydefault(this.EZpvd, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit OLrzqt(lEN len, java.lang.String str) {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel;
        Intrinsics.checkNotNullParameter(str, "");
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        c29945lGdZuBGHE.gEmmrt(str);
        c29945lGdZuBGHE.OLrzqt(InputUtils.AEQbTJ.copydefault(str, c29945lGdZuBGHE.values(), c29945lGdZuBGHE.gEmmrt()));
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.copydefault(str, true);
        len.EZpvd(str);
        BuyViewModel buyViewModelSSMYrx = len.sSMYrx();
        java.lang.String strZuBGHE = buyViewModelSSMYrx.zuBGHE();
        java.lang.String strOcIXYQ = buyViewModelSSMYrx.OcIXYQ();
        kotlin.Pair pair = (kotlin.Pair) mHA.OLrzqt.AEQbTJ(buyViewModelSSMYrx.sSMYrx());
        java.lang.String depositName = (pair == null || (channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst()) == null) ? null : channel.getDepositName();
        buyViewModelSSMYrx.EZpvd(strZuBGHE, strOcIXYQ, depositName != null ? depositName : "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lEN len, C30019lIx c30019lIx, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        len.zuBGHE().gEmmrt(str);
        len.zuBGHE().copydefault(true);
        c30019lIx.setNumberInputText(len.sSMYrx().AEQbTJ(len.zuBGHE().valueOf(), len.zuBGHE().values(), d));
        len.sSMYrx().AhwBna(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "All"));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lEN len, double d, java.lang.String str) {
        CurrencyToken currencyTokenCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (d == 1002.0d) {
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity = len.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            TransferDetail.Target target = new TransferDetail.Target(6);
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(len.sSMYrx().QOLQEE());
            interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(null, target, java.lang.Integer.valueOf(C33129mqd.AhwBna((actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrencyId())), null, false, false, null, 121, null));
        } else {
            DepositWithdrawPageParameters depositWithdrawPageParameters = new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPaymentSelectionPage(len.sSMYrx().OcIXYQ()), OKPaymentSource.PAYMENT_INTERNAL_FLOW);
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            FragmentActivity fragmentActivityRequireActivity2 = len.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity2, depositWithdrawPageParameters, null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lEN len, C30019lIx c30019lIx, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strOLrzqt = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strOLrzqt2 = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.gEmmrt(strOLrzqt);
        c29945lGdZuBGHE.OLrzqt(strOLrzqt2);
        c29945lGdZuBGHE.copydefault(true);
        c30019lIx.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
        len.sSMYrx().valueOf(false);
        return Unit.INSTANCE;
    }

    public final void QbewEr() {
        EZpvd(zuBGHE().djBIcL());
    }

    public final void QUSxYX() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<BaseBuySellViewModel.TaskDescription>> liveDataAubY = sSMYrx().AubY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAubY, viewLifecycleOwner, new Function1() { // from class: o.lFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.AEQbTJ(this.OLrzqt, (BaseBuySellViewModel.TaskDescription) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[PHI: r5
  0x00f3: PHI (r5v3 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String) binds: [B:33:0x00f0, B:26:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(lEN len, BaseBuySellViewModel.TaskDescription taskDescription) {
        java.lang.String price;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (taskDescription instanceof BaseBuySellViewModel.TaskDescription.ActionBar) {
            BaseBuySellViewModel.TaskDescription.ActionBar actionBar = (BaseBuySellViewModel.TaskDescription.ActionBar) taskDescription;
            pUU.KWHzl("BuyFragmentV3", "quotedPriceState error: " + actionBar.KWHzl());
            if (actionBar.OLrzqt() == BaseBuySellViewModel.QuoteType.DEX) {
                len.zuBGHE().OLrzqt(true);
                len.zuBGHE().OLrzqt("0");
                len.copydefault(len.sSMYrx().zuBGHE());
                len.AEQbTJ(java.lang.Boolean.TRUE);
            }
        } else {
            if (!(taskDescription instanceof BaseBuySellViewModel.TaskDescription.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            BaseBuySellViewModel.TaskDescription.Application application = (BaseBuySellViewModel.TaskDescription.Application) taskDescription;
            if (application.copydefault() == BaseBuySellViewModel.QuoteType.DEX) {
                C29945lGd c29945lGdZuBGHE = len.zuBGHE();
                c29945lGdZuBGHE.OLrzqt(false);
                c29945lGdZuBGHE.AEQbTJ(true);
                c29945lGdZuBGHE.AEQbTJ(C33129mqd.AhwBna(len.sSMYrx().DTwDnp()));
                DexQuoteBean dexQuoteBeanAEQbTJ = application.AEQbTJ();
                java.lang.String toAmount = dexQuoteBeanAEQbTJ != null ? dexQuoteBeanAEQbTJ.getToAmount() : null;
                if (toAmount == null) {
                    toAmount = "";
                }
                c29945lGdZuBGHE.OLrzqt(toAmount);
                len.AEQbTJ(java.lang.Boolean.TRUE);
                len.copydefault(len.sSMYrx().zuBGHE());
                len.sSMYrx().gGvvIC().setValue(java.lang.Boolean.FALSE);
                C52794wYp c52794wYp = ((AbstractC31462luV) len.KWHzl()).iwGUEr;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                len.EZpvd(c52794wYp);
            } else {
                len.zuBGHE().AEQbTJ(false);
            }
            C29945lGd c29945lGdZuBGHE2 = len.zuBGHE();
            int i = Activity.EZpvd[application.copydefault().ordinal()];
            if (i == 1) {
                B2CQuotePriceBean b2CQuotePriceBeanOLrzqt = application.OLrzqt();
                price = b2CQuotePriceBeanOLrzqt != null ? b2CQuotePriceBeanOLrzqt.getPrice() : null;
                if (price != null) {
                }
                c29945lGdZuBGHE2.KWHzl(str, len.sSMYrx().fetchVPNInfo(), len.sSMYrx().AwvSrB());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                DexQuoteBean dexQuoteBeanAEQbTJ2 = application.AEQbTJ();
                price = dexQuoteBeanAEQbTJ2 != null ? dexQuoteBeanAEQbTJ2.getPrice() : null;
                if (price != null) {
                    str = price;
                }
                c29945lGdZuBGHE2.KWHzl(str, len.sSMYrx().fetchVPNInfo(), len.sSMYrx().AwvSrB());
            }
        }
        return Unit.INSTANCE;
    }

    public final void ORxRYg() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataValues = sSMYrx().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner, new Function1() { // from class: o.lEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.AhwBna(this.KWHzl, (Unit) obj);
            }
        });
        LiveData<C32989mnw<InputBaseViewModel.InputValidationResult>> liveDataAuCTel = zuBGHE().AuCTel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner2, new Function1() { // from class: o.lEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.copydefault(this.KWHzl, (InputBaseViewModel.InputValidationResult) obj);
            }
        });
        LiveData<C32989mnw<com.okinc.buysell.ui.bsc.util.InputType>> liveDataFARcdN = zuBGHE().fARcdN();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFARcdN, viewLifecycleOwner3, new Function1() { // from class: o.lEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.KWHzl(this.AEQbTJ, (com.okinc.buysell.ui.bsc.util.InputType) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(final lEN len, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C52794wYp c52794wYp = ((AbstractC31462luV) len.KWHzl()).iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        len.EZpvd(c52794wYp);
        BaseBuySellViewModel.Companion.ActionBar actionBarFIwbmz = len.sSMYrx().fIwbmz();
        BaseBuySellViewModel.Companion.DexTradeStatus dexTradeStatusCopydefault = actionBarFIwbmz.copydefault();
        int[] iArr = Activity.KWHzl;
        int i = iArr[dexTradeStatusCopydefault.ordinal()];
        if (i == 9 || i == 10) {
            len.sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.TRUE);
            ((AbstractC31462luV) len.KWHzl()).AuCTel.getRoot().setVisibility(8);
            AbstractC31462luV abstractC31462luV = (AbstractC31462luV) len.KWHzl();
            abstractC31462luV.valueOf.setIsErrorInput(false);
            abstractC31462luV.iwGUEr.setVisibility(0);
            abstractC31462luV.iwGUEr.setEnabled(true);
            abstractC31462luV.values.setVisibility(8);
            abstractC31462luV.isConnected.setVisibility(8);
            abstractC31462luV.values.setEnabled(false);
            InputAmountSharedDataSource.copydefault.EZpvd(len.KWHzl(len.zuBGHE().OLrzqt(), len.zuBGHE().uzCIH()));
        } else {
            C31597lwz c31597lwz = ((AbstractC31462luV) len.KWHzl()).AuCTel;
            len.sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
            c31597lwz.getRoot().setVisibility(0);
            c31597lwz.EZpvd.setText(actionBarFIwbmz.EZpvd());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBarFIwbmz.copydefault().getCta())) {
                c31597lwz.copydefault.setText(actionBarFIwbmz.copydefault().getCta());
                c31597lwz.AEQbTJ.setVisibility(0);
                switch (iArr[actionBarFIwbmz.copydefault().ordinal()]) {
                    case 1:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFC
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.AuCTelauCTel(this.copydefault, view);
                            }
                        });
                        break;
                    case 2:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFB
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.zLjUOn(this.AEQbTJ, view);
                            }
                        });
                        break;
                    case 3:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.AubY(this.AEQbTJ, view);
                            }
                        });
                        break;
                    case 4:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.zuBGHE(this.copydefault, view);
                            }
                        });
                        break;
                    case 5:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFz
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.sSMYrx(this.KWHzl, view);
                            }
                        });
                        break;
                    case 6:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.gHZMYf(this.AEQbTJ, view);
                            }
                        });
                        break;
                    case 7:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFH
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.AxsJAY(this.copydefault, view);
                            }
                        });
                        break;
                    case 8:
                        c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFF
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                lEN.AwvSrB(this.KWHzl, view);
                            }
                        });
                        break;
                    default:
                        c31597lwz.getRoot().setOnClickListener(null);
                        break;
                }
            } else {
                c31597lwz.AEQbTJ.setVisibility(8);
                c31597lwz.getRoot().setOnClickListener(null);
            }
            AbstractC31462luV abstractC31462luV2 = (AbstractC31462luV) len.KWHzl();
            abstractC31462luV2.valueOf.setIsErrorInput(false);
            abstractC31462luV2.iwGUEr.setVisibility(8);
            abstractC31462luV2.values.setVisibility(8);
            abstractC31462luV2.values.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(lEN len, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = len.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(len, childFragmentManager, new Function1() { // from class: o.lFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.copydefault((BuySellDexEscapeResult) obj);
            }
        });
    }

    public static final Unit copydefault(BuySellDexEscapeResult buySellDexEscapeResult) {
        Intrinsics.checkNotNullParameter(buySellDexEscapeResult, "");
        pUU.KWHzl("BuyFragmentV3", "escapeResult: " + buySellDexEscapeResult);
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(lEN len, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        android.content.Context contextRequireContext = len.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31670lzr.KWHzl(contextRequireContext);
    }

    public static final void AubY(lEN len, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        android.content.Context contextRequireContext = len.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31670lzr.KWHzl(contextRequireContext);
    }

    public static final void zuBGHE(lEN len, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = len.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.copydefault(childFragmentManager, len, len.sSMYrx().ORxRYg().getChainIndex(), new Function1() { // from class: o.lFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.copydefault((BuySellDexEmailSetResult) obj);
            }
        });
    }

    public static final Unit copydefault(BuySellDexEmailSetResult buySellDexEmailSetResult) {
        Intrinsics.checkNotNullParameter(buySellDexEmailSetResult, "");
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(lEN len, android.view.View view) {
        len.hDKMBd.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
    }

    public static final void gHZMYf(lEN len, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = len.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(len, childFragmentManager, len.sSMYrx().ORxRYg().getChainIndex(), InterfaceC31396ltI.Application.EZpvd, new Function1() { // from class: o.lFL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.KWHzl((BuySellDexUpdateInfoResult) obj);
            }
        });
    }

    public static final Unit KWHzl(BuySellDexUpdateInfoResult buySellDexUpdateInfoResult) {
        Intrinsics.checkNotNullParameter(buySellDexUpdateInfoResult, "");
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(lEN len, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = len.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(len, childFragmentManager, len.sSMYrx().ORxRYg().getChainIndex(), InterfaceC31396ltI.ActionBar.AEQbTJ, new Function1() { // from class: o.lFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lEN.OLrzqt((BuySellDexUpdateInfoResult) obj);
            }
        });
    }

    public static final Unit OLrzqt(BuySellDexUpdateInfoResult buySellDexUpdateInfoResult) {
        Intrinsics.checkNotNullParameter(buySellDexUpdateInfoResult, "");
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(lEN len, android.view.View view) {
        len.hDKMBd.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lEN len, InputBaseViewModel.InputValidationResult inputValidationResult) {
        Intrinsics.checkNotNullParameter(inputValidationResult, "");
        C30019lIx c30019lIx = ((AbstractC31462luV) len.KWHzl()).valueOf;
        len.copydefault(len.sSMYrx().zsXlph());
        len.copydefault(inputValidationResult);
        len.copydefault(InputUtils.ChipType.QUICK_AMOUNT);
        if (len.zuBGHE().fJNWhG() == null) {
            c30019lIx.setToggleContainerVisibility(0);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v15, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lEN len, com.okinc.buysell.ui.bsc.util.InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        C30019lIx c30019lIx = ((AbstractC31462luV) len.KWHzl()).valueOf;
        c30019lIx.setMaxDecimalValue(len.zuBGHE().OLrzqt(inputType));
        len.copydefault(len.sSMYrx().zsXlph());
        int i = Activity.OLrzqt[inputType.ordinal()];
        if (i == 1) {
            java.lang.String upperCase = len.sSMYrx().OcIXYQ().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            c30019lIx.setTokenCurrency(len.KWHzl(upperCase));
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
            java.lang.Boolean bool = (java.lang.Boolean) mHA.OLrzqt.AEQbTJ(len.sSMYrx().finit());
            if (bool != null) {
                c30019lIx.setFiatCurrencyDropDownVisibility(bool.booleanValue() ? 0 : 8);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String upperCase2 = len.sSMYrx().zuBGHE().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            c30019lIx.setTokenCurrency(upperCase2);
            c30019lIx.setFiatCurrencyDropDownVisibility(8);
            java.lang.Boolean bool2 = (java.lang.Boolean) mHA.OLrzqt.AEQbTJ(len.sSMYrx().finit());
            if (bool2 != null) {
                c30019lIx.setToggleFiatCurrencyDropDownVisibility(bool2.booleanValue() ? 0 : 8);
            }
        }
        len.sSMYrx().OLrzqt(BaseBuySellViewModel.Mode.BUY.getType(), len.QOLQEE().AkhnZx() == BSCTabIndex.BUY);
        len.QbewEr();
        AbstractC31462luV abstractC31462luV = (AbstractC31462luV) len.KWHzl();
        ConstraintLayout root = abstractC31462luV.AuCTel.getRoot();
        root.setVisibility(8);
        root.setOnClickListener(new View.OnClickListener() { // from class: o.lFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.AhwBna(view);
            }
        });
        if (len.QOLQEE().fJNWhG() != VerificationStatus.PRE_KYC && len.QOLQEE().fJNWhG() != VerificationStatus.PRE_LOGIN && !len.sSMYrx().RlQdEF()) {
            if (len.zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT && (!len.zuBGHE().iwGUEr().isEmpty())) {
                abstractC31462luV.values.setVisibility(0);
                abstractC31462luV.values.setEnabled(true);
                abstractC31462luV.iwGUEr.setVisibility(8);
                abstractC31462luV.isConnected.setVisibility(8);
            } else {
                abstractC31462luV.values.setVisibility(8);
                abstractC31462luV.values.setEnabled(false);
                abstractC31462luV.iwGUEr.setVisibility(0);
                abstractC31462luV.iwGUEr.setEnabled(false);
                abstractC31462luV.isConnected.setVisibility(8);
            }
        } else {
            abstractC31462luV.values.setVisibility(8);
            abstractC31462luV.values.setEnabled(false);
            abstractC31462luV.iwGUEr.setVisibility(0);
            abstractC31462luV.iwGUEr.setEnabled(true);
            abstractC31462luV.isConnected.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v119, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v108, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v118, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v129, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v139, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v147, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v157, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v165, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v173, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v183, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v188, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v195, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v49, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v61, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v74, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v96, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(InputBaseViewModel.InputValidationResult inputValidationResult) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        SupportCurrencyInfo supportCurrencyInfo;
        ((AbstractC31462luV) KWHzl()).AuCTel.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lEN.AYXKKw(view);
            }
        });
        int scale = 0;
        ((AbstractC31462luV) KWHzl()).valueOf.setToggleContainerVisibility(0);
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = sSMYrx().AwvSrB();
        PaymentMethodCategory paymentMethodCategory = channelAwvSrB != null ? channelAwvSrB.getPaymentMethodCategory() : null;
        PaymentMethodCategory paymentMethodCategory2 = PaymentMethodCategory.STABLECOIN;
        boolean z = paymentMethodCategory == paymentMethodCategory2;
        boolean zCopydefault = sSMYrx().copydefault(sSMYrx().AwvSrB());
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = sSMYrx().AwvSrB();
        java.lang.String peggedCurrency = (channelAwvSrB2 == null || (supportCurrencyInfo = channelAwvSrB2.getSupportCurrencyInfo()) == null) ? null : supportCurrencyInfo.getPeggedCurrency();
        java.lang.String str = peggedCurrency == null ? "" : peggedCurrency;
        C31597lwz c31597lwz = ((AbstractC31462luV) KWHzl()).AuCTel;
        switch (Activity.AhwBna[inputValidationResult.ordinal()]) {
            case 1:
            case 2:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.dLBcXg, C56424yEw.gEmmrt(C56390yDp.OLrzqt("currency", ""), C56390yDp.OLrzqt("totalDailyLimit", zuBGHE().EZpvd((BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.AEQbTJ.setVisibility(8);
                c31597lwz.getRoot().setOnClickListener(null);
                AbstractC31462luV abstractC31462luV = (AbstractC31462luV) KWHzl();
                abstractC31462luV.valueOf.setIsErrorInput(true);
                abstractC31462luV.iwGUEr.setVisibility(8);
                abstractC31462luV.values.setVisibility(8);
                abstractC31462luV.values.setEnabled(false);
                abstractC31462luV.fIwbmz.setVisibility(8);
                return;
            case 3:
            case 4:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView = c31597lwz.EZpvd;
                int i = C31351lsQ.Activity.dvImUD;
                C29945lGd c29945lGdZuBGHE = zuBGHE();
                mHA mha = mHA.OLrzqt;
                textView.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(C56390yDp.OLrzqt("remainderDailyLimit", c29945lGdZuBGHE.OLrzqt((BaseBuySellViewModel.ActionBar) mha.AEQbTJ(sSMYrx().QOLQEE()))), C56390yDp.OLrzqt("totalDailyLimit", zuBGHE().EZpvd((BaseBuySellViewModel.ActionBar) mha.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lES
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.QKVWgx(this.OLrzqt, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV2 = (AbstractC31462luV) KWHzl();
                abstractC31462luV2.valueOf.setIsErrorInput(true);
                abstractC31462luV2.iwGUEr.setVisibility(8);
                abstractC31462luV2.values.setVisibility(8);
                abstractC31462luV2.values.setEnabled(false);
                abstractC31462luV2.fIwbmz.setVisibility(8);
                return;
            case 5:
            case 6:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                if (sSMYrx().giSNqX()) {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.stopBehavioSecDataCollection));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.QOLQEE(this.AEQbTJ, view);
                        }
                    });
                } else {
                    android.widget.TextView textView2 = c31597lwz.EZpvd;
                    int i2 = C31351lsQ.Activity.Hx;
                    C29945lGd c29945lGdZuBGHE2 = zuBGHE();
                    BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB3 = sSMYrx().AwvSrB();
                    textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE2.EZpvd(actionBar, channelAwvSrB3 != null ? C31662lzj.AhwBna(channelAwvSrB3) : false, z, zCopydefault, str)))));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEX
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.OcIXYQ(this.KWHzl, view);
                        }
                    });
                }
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV3 = (AbstractC31462luV) KWHzl();
                abstractC31462luV3.valueOf.setIsErrorInput(true);
                abstractC31462luV3.iwGUEr.setVisibility(8);
                abstractC31462luV3.values.setVisibility(8);
                abstractC31462luV3.values.setEnabled(false);
                abstractC31462luV3.fIwbmz.setVisibility(8);
                return;
            case 7:
            case 8:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                if (sSMYrx().giSNqX()) {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.stopBehavioSecDataCollection));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.QbewEr(this.EZpvd, view);
                        }
                    });
                } else {
                    android.widget.TextView textView3 = c31597lwz.EZpvd;
                    int i3 = C31351lsQ.Activity.Hx;
                    C29945lGd c29945lGdZuBGHE3 = zuBGHE();
                    BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB4 = sSMYrx().AwvSrB();
                    textView3.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE3.EZpvd(actionBar2, channelAwvSrB4 != null ? C31662lzj.AhwBna(channelAwvSrB4) : false, z, zCopydefault, str)))));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.QVAiDq(this.EZpvd, view);
                        }
                    });
                }
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV4 = (AbstractC31462luV) KWHzl();
                abstractC31462luV4.valueOf.setIsErrorInput(true);
                abstractC31462luV4.iwGUEr.setVisibility(8);
                abstractC31462luV4.values.setVisibility(8);
                abstractC31462luV4.values.setEnabled(false);
                abstractC31462luV4.fIwbmz.setVisibility(8);
                return;
            case 9:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView4 = c31597lwz.EZpvd;
                int i4 = C31351lsQ.Activity.DcMfJKfNLfdT;
                C29945lGd c29945lGdZuBGHE4 = zuBGHE();
                BaseBuySellViewModel.ActionBar actionBar3 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB5 = sSMYrx().AwvSrB();
                textView4.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE4.EZpvd(actionBar3, channelAwvSrB5 != null ? C31662lzj.AhwBna(channelAwvSrB5) : false, z, zCopydefault, str)))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31462luV abstractC31462luV5 = (AbstractC31462luV) KWHzl();
                abstractC31462luV5.valueOf.setIsErrorInput(true);
                abstractC31462luV5.iwGUEr.setVisibility(8);
                abstractC31462luV5.values.setVisibility(8);
                abstractC31462luV5.values.setEnabled(false);
                abstractC31462luV5.fIwbmz.setVisibility(8);
                return;
            case 10:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                if (sSMYrx().giSNqX()) {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.stopBehavioSecDataCollection));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.QUSxYX(this.AEQbTJ, view);
                        }
                    });
                } else {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKsgNvtZ));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.RJOkX(this.KWHzl, view);
                        }
                    });
                    c31597lwz.AEQbTJ.setClickable(false);
                }
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV6 = (AbstractC31462luV) KWHzl();
                abstractC31462luV6.valueOf.setIsErrorInput(true);
                abstractC31462luV6.iwGUEr.setVisibility(8);
                abstractC31462luV6.values.setVisibility(8);
                abstractC31462luV6.values.setEnabled(false);
                abstractC31462luV6.fIwbmz.setVisibility(8);
                return;
            case 11:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB6 = sSMYrx().AwvSrB();
                if ((channelAwvSrB6 != null ? channelAwvSrB6.getPaymentMethodCategory() : null) == paymentMethodCategory2) {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.stopBehavioSecDataCollection));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.QfsBiF(this.KWHzl, view);
                        }
                    });
                } else if (sSMYrx().hUfVAv()) {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.stopBehavioSecDataCollection));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lFa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.djSkpj(this.KWHzl, view);
                        }
                    });
                } else {
                    c31597lwz.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKsgNvtZ));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.AEQbTJ.setClickable(false);
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEM
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lEN.UeEOUB(this.AEQbTJ, view);
                        }
                    });
                }
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV7 = (AbstractC31462luV) KWHzl();
                abstractC31462luV7.valueOf.setIsErrorInput(true);
                abstractC31462luV7.iwGUEr.setVisibility(8);
                abstractC31462luV7.values.setVisibility(8);
                abstractC31462luV7.values.setEnabled(false);
                abstractC31462luV7.fIwbmz.setVisibility(8);
                return;
            case 12:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView5 = c31597lwz.EZpvd;
                int i5 = C31351lsQ.Activity.DcMfJKfNLfdT;
                C29945lGd c29945lGdZuBGHE5 = zuBGHE();
                BaseBuySellViewModel.ActionBar actionBar4 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB7 = sSMYrx().AwvSrB();
                textView5.setText(C33069mpW.copydefault(i5, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE5.EZpvd(actionBar4, channelAwvSrB7 != null ? C31662lzj.AhwBna(channelAwvSrB7) : false, z, zCopydefault, str)))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31462luV abstractC31462luV8 = (AbstractC31462luV) KWHzl();
                abstractC31462luV8.valueOf.setIsErrorInput(true);
                abstractC31462luV8.iwGUEr.setVisibility(8);
                abstractC31462luV8.values.setVisibility(8);
                abstractC31462luV8.values.setEnabled(false);
                abstractC31462luV8.fIwbmz.setVisibility(8);
                return;
            case 13:
            case 14:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView6 = c31597lwz.EZpvd;
                int i6 = C31351lsQ.Activity.DcMfJKOmnske;
                C29945lGd c29945lGdZuBGHE6 = zuBGHE();
                BaseBuySellViewModel.ActionBar actionBar5 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB8 = sSMYrx().AwvSrB();
                textView6.setText(C33069mpW.copydefault(i6, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE6.KWHzl(actionBar5, channelAwvSrB8 != null ? C31662lzj.AhwBna(channelAwvSrB8) : false, z, zCopydefault, str)))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.dNCPSb(this.KWHzl, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV9 = (AbstractC31462luV) KWHzl();
                abstractC31462luV9.valueOf.setIsErrorInput(true);
                abstractC31462luV9.iwGUEr.setVisibility(8);
                abstractC31462luV9.values.setVisibility(8);
                abstractC31462luV9.values.setEnabled(false);
                abstractC31462luV9.fIwbmz.setVisibility(8);
                return;
            case 15:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.getSessionID, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, zuBGHE().KWHzl(sSMYrx().AwvSrB(), (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.jh));
                c31597lwz.AEQbTJ.setClickable(false);
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lER
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.aKErDB(this.OLrzqt, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV10 = (AbstractC31462luV) KWHzl();
                abstractC31462luV10.valueOf.setIsErrorInput(true);
                abstractC31462luV10.iwGUEr.setVisibility(8);
                abstractC31462luV10.values.setVisibility(8);
                abstractC31462luV10.values.setEnabled(false);
                abstractC31462luV10.fIwbmz.setVisibility(8);
                return;
            case 16:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.DcMfJKDSqxTE, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, zuBGHE().EZpvd(sSMYrx().AwvSrB(), (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.RcXXUw(this.KWHzl, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV11 = (AbstractC31462luV) KWHzl();
                abstractC31462luV11.valueOf.setIsErrorInput(true);
                abstractC31462luV11.iwGUEr.setVisibility(8);
                abstractC31462luV11.values.setVisibility(8);
                abstractC31462luV11.values.setEnabled(false);
                abstractC31462luV11.fIwbmz.setVisibility(8);
                return;
            case 17:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.DcMfJKfNLfdT, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, zuBGHE().KWHzl(sSMYrx().AwvSrB(), (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31462luV abstractC31462luV12 = (AbstractC31462luV) KWHzl();
                abstractC31462luV12.valueOf.setIsErrorInput(true);
                abstractC31462luV12.iwGUEr.setVisibility(8);
                abstractC31462luV12.values.setVisibility(8);
                abstractC31462luV12.values.setEnabled(false);
                abstractC31462luV12.fIwbmz.setVisibility(8);
                return;
            case 18:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.DcMfJKOmnske, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, zuBGHE().EZpvd(sSMYrx().AwvSrB(), (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lEP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.fFgQHt(this.KWHzl, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV13 = (AbstractC31462luV) KWHzl();
                abstractC31462luV13.valueOf.setIsErrorInput(true);
                abstractC31462luV13.iwGUEr.setVisibility(8);
                abstractC31462luV13.values.setVisibility(8);
                abstractC31462luV13.values.setEnabled(false);
                abstractC31462luV13.fIwbmz.setVisibility(8);
                return;
            case 19:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.DcMfJKfNLfdT, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, zuBGHE().KWHzl(sSMYrx().AwvSrB(), (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE()))))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31462luV abstractC31462luV14 = (AbstractC31462luV) KWHzl();
                abstractC31462luV14.valueOf.setIsErrorInput(true);
                abstractC31462luV14.iwGUEr.setVisibility(8);
                abstractC31462luV14.values.setVisibility(8);
                abstractC31462luV14.values.setEnabled(false);
                abstractC31462luV14.fIwbmz.setVisibility(8);
                return;
            case 20:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView7 = c31597lwz.EZpvd;
                int i7 = C31351lsQ.Activity.DcMfJKfNLfdT;
                C29945lGd c29945lGdZuBGHE7 = zuBGHE();
                BaseBuySellViewModel.ActionBar actionBar6 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB9 = sSMYrx().AwvSrB();
                textView7.setText(C33069mpW.copydefault(i7, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE7.EZpvd(actionBar6, channelAwvSrB9 != null ? C31662lzj.AhwBna(channelAwvSrB9) : false, false, false, "")))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31462luV abstractC31462luV15 = (AbstractC31462luV) KWHzl();
                abstractC31462luV15.valueOf.setIsErrorInput(true);
                abstractC31462luV15.iwGUEr.setVisibility(8);
                abstractC31462luV15.values.setVisibility(8);
                abstractC31462luV15.values.setEnabled(false);
                abstractC31462luV15.fIwbmz.setVisibility(8);
                return;
            case 21:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView8 = c31597lwz.EZpvd;
                int i8 = C31351lsQ.Activity.DcMfJKOmnske;
                C29945lGd c29945lGdZuBGHE8 = zuBGHE();
                BaseBuySellViewModel.ActionBar actionBar7 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(sSMYrx().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB10 = sSMYrx().AwvSrB();
                textView8.setText(C33069mpW.copydefault(i8, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, c29945lGdZuBGHE8.KWHzl(actionBar7, channelAwvSrB10 != null ? C31662lzj.AhwBna(channelAwvSrB10) : false, false, false, "")))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.sCB));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lET
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lEN.finit(this.AEQbTJ, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31462luV abstractC31462luV16 = (AbstractC31462luV) KWHzl();
                abstractC31462luV16.valueOf.setIsErrorInput(true);
                abstractC31462luV16.iwGUEr.setVisibility(8);
                abstractC31462luV16.values.setVisibility(8);
                abstractC31462luV16.values.setEnabled(false);
                abstractC31462luV16.fIwbmz.setVisibility(8);
                return;
            case 22:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                AbstractC31462luV abstractC31462luV17 = (AbstractC31462luV) KWHzl();
                abstractC31462luV17.valueOf.setIsErrorInput(false);
                abstractC31462luV17.iwGUEr.setVisibility(8);
                abstractC31462luV17.values.setVisibility(8);
                abstractC31462luV17.values.setEnabled(false);
                abstractC31462luV17.fIwbmz.setVisibility(8);
                C31597lwz c31597lwz2 = abstractC31462luV17.AuCTel;
                c31597lwz2.getRoot().setVisibility(0);
                c31597lwz2.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.apNbdB));
                c31597lwz2.AEQbTJ.setVisibility(8);
                c31597lwz2.getRoot().setOnClickListener(null);
                return;
            case 23:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(8);
                AbstractC31462luV abstractC31462luV18 = (AbstractC31462luV) KWHzl();
                abstractC31462luV18.valueOf.setIsErrorInput(false);
                if (sSMYrx().RlQdEF()) {
                    abstractC31462luV18.values.setVisibility(8);
                    abstractC31462luV18.values.setEnabled(false);
                    abstractC31462luV18.iwGUEr.setVisibility(0);
                    abstractC31462luV18.iwGUEr.setEnabled(true);
                    abstractC31462luV18.isConnected.setVisibility(8);
                } else if (zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT && (!zuBGHE().iwGUEr().isEmpty())) {
                    abstractC31462luV18.values.setVisibility(0);
                    abstractC31462luV18.values.setEnabled(true);
                    abstractC31462luV18.iwGUEr.setVisibility(8);
                    abstractC31462luV18.isConnected.setVisibility(8);
                } else {
                    abstractC31462luV18.values.setVisibility(8);
                    abstractC31462luV18.values.setEnabled(false);
                    abstractC31462luV18.iwGUEr.setVisibility(0);
                    abstractC31462luV18.iwGUEr.setEnabled(false);
                    abstractC31462luV18.isConnected.setVisibility(8);
                }
                abstractC31462luV18.fIwbmz.setVisibility(8);
                java.lang.String strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) ejfBZ().OLrzqt());
                java.lang.String strUzCIH = ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar8 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
                if (actionBar8 != null && (buySellCurrencyAEQbTJ = actionBar8.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ.getScale();
                }
                InputAmountSharedDataSource.copydefault.EZpvd(KWHzl(strOLrzqt, C31661lzi.OLrzqt(strUzCIH, scale)));
                Unit unit = Unit.INSTANCE;
                return;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                sSMYrx().AxsJAYaxsJAY().setValue(java.lang.Boolean.TRUE);
                boolean z2 = sSMYrx().hUfVAv() && sSMYrx().gGvvIC().getValue().booleanValue();
                c31597lwz.getRoot().setVisibility(8);
                AbstractC31462luV abstractC31462luV19 = (AbstractC31462luV) KWHzl();
                abstractC31462luV19.valueOf.setIsErrorInput(false);
                abstractC31462luV19.iwGUEr.setVisibility(0);
                abstractC31462luV19.iwGUEr.setEnabled(!z2);
                abstractC31462luV19.values.setVisibility(8);
                abstractC31462luV19.isConnected.setVisibility(8);
                abstractC31462luV19.values.setEnabled(false);
                abstractC31462luV19.fIwbmz.setVisibility(8);
                java.lang.String strOLrzqt2 = C33129mqd.OLrzqt((java.lang.Object) ejfBZ().OLrzqt());
                java.lang.String strUzCIH2 = ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar9 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
                if (actionBar9 != null && (buySellCurrencyAEQbTJ2 = actionBar9.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ2.getScale();
                }
                InputAmountSharedDataSource.copydefault.EZpvd(KWHzl(strOLrzqt2, C31661lzi.OLrzqt(strUzCIH2, scale)));
                Unit unit2 = Unit.INSTANCE;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void QKVWgx(lEN len, android.view.View view) {
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strAEQbTJ = c29945lGdZuBGHE.AEQbTJ(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strAEQbTJ2 = c29945lGdZuBGHE.AEQbTJ(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.gEmmrt(strAEQbTJ);
        c29945lGdZuBGHE.OLrzqt(strAEQbTJ2);
        ((AbstractC31462luV) len.KWHzl()).valueOf.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
    }

    public static final void QOLQEE(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    public static final void OcIXYQ(lEN len, android.view.View view) {
        len.getNewProxyInstance();
    }

    public static final void QbewEr(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    public static final void QVAiDq(lEN len, android.view.View view) {
        len.getNewProxyInstance();
    }

    public static final void QUSxYX(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    public static final void RJOkX(lEN len, android.view.View view) {
        len.getNewProxyInstance();
    }

    public static final void QfsBiF(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    public static final void djSkpj(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    public static final void UeEOUB(lEN len, android.view.View view) {
        len.getNewProxyInstance();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void dNCPSb(lEN len, android.view.View view) {
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strOLrzqt = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strOLrzqt2 = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.gEmmrt(strOLrzqt);
        c29945lGdZuBGHE.OLrzqt(strOLrzqt2);
        ((AbstractC31462luV) len.KWHzl()).valueOf.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
    }

    public static final void aKErDB(lEN len, android.view.View view) {
        len.QfsBiF();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void RcXXUw(lEN len, android.view.View view) {
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strOLrzqt = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strOLrzqt2 = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.gEmmrt(strOLrzqt);
        c29945lGdZuBGHE.OLrzqt(strOLrzqt2);
        ((AbstractC31462luV) len.KWHzl()).valueOf.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fFgQHt(lEN len, android.view.View view) {
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strOLrzqt = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strOLrzqt2 = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.gEmmrt(strOLrzqt);
        c29945lGdZuBGHE.OLrzqt(strOLrzqt2);
        ((AbstractC31462luV) len.KWHzl()).valueOf.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void finit(lEN len, android.view.View view) {
        C29945lGd c29945lGdZuBGHE = len.zuBGHE();
        java.lang.String strOLrzqt = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT);
        java.lang.String strOLrzqt2 = len.OLrzqt(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        c29945lGdZuBGHE.copydefault(true);
        c29945lGdZuBGHE.gEmmrt(strOLrzqt);
        c29945lGdZuBGHE.OLrzqt(strOLrzqt2);
        ((AbstractC31462luV) len.KWHzl()).valueOf.setNumberInputText(len.OLrzqt(c29945lGdZuBGHE.valueOf()));
    }

    public static /* synthetic */ void updatePaymentSelectionWidget$default(lEN len, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            channel = null;
        }
        if ((i & 2) != 0) {
            paymentMethod = null;
        }
        len.copydefault(channel, paymentMethod);
    }

    public final void copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel2;
        PaymentMethod paymentMethod2;
        int iAYXKKw;
        SupportCurrencyInfo supportCurrencyInfo;
        if (channel == null) {
            kotlin.Pair pair = (kotlin.Pair) mHA.OLrzqt.AEQbTJ(sSMYrx().sSMYrx());
            channel2 = pair != null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst() : null;
        } else {
            channel2 = channel;
        }
        if (paymentMethod == null) {
            kotlin.Pair pair2 = (kotlin.Pair) mHA.OLrzqt.AEQbTJ(sSMYrx().sSMYrx());
            PaymentMethod paymentMethod3 = pair2 != null ? (PaymentMethod) pair2.getSecond() : null;
            if (paymentMethod3 == null) {
                paymentMethod3 = new PaymentMethod((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Account) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, (java.lang.String) null, false, (SellerReceiptAccount) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, 536870911, (DefaultConstructorMarker) null);
            }
            paymentMethod2 = paymentMethod3;
        } else {
            paymentMethod2 = paymentMethod;
        }
        C30326lUf c30326lUf = C30326lUf.KWHzl;
        java.lang.String strOLrzqt = c30326lUf.OLrzqt(channel2, paymentMethod2, true);
        java.lang.String strCopydefault = c30326lUf.copydefault(channel2, paymentMethod2);
        boolean zCopydefault = sSMYrx().copydefault(channel2);
        java.lang.Integer numValueOf = (channel2 == null || (supportCurrencyInfo = channel2.getSupportCurrencyInfo()) == null) ? null : java.lang.Integer.valueOf(supportCurrencyInfo.getPeggedCurrencyScale());
        if (!zCopydefault) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iAYXKKw = numValueOf.intValue();
        } else {
            java.lang.Integer supportCurrencyScale = channel2 != null ? channel2.getSupportCurrencyScale() : null;
            if (supportCurrencyScale != null) {
                iAYXKKw = supportCurrencyScale.intValue();
            } else {
                iAYXKKw = zuBGHE().AYXKKw();
            }
        }
        sSMYrx().OLrzqt(strOLrzqt, strCopydefault, c30326lUf.AEQbTJ(channel2, paymentMethod2, zCopydefault, iAYXKKw, sSMYrx().QKVWgx()), c30326lUf.EZpvd(channel2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(BuySellCurrency buySellCurrency, CurrencyToken currencyToken) {
        int scale;
        SupportCurrencyInfo supportCurrencyInfo;
        boolean zCopydefault = sSMYrx().copydefault(sSMYrx().AwvSrB());
        C29945lGd c29945lGdZuBGHE = zuBGHE();
        c29945lGdZuBGHE.OLrzqt(buySellCurrency.getQuickAmountList());
        int scale2 = 2;
        if (zCopydefault) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = sSMYrx().AwvSrB();
            if (channelAwvSrB == null || (supportCurrencyInfo = channelAwvSrB.getSupportCurrencyInfo()) == null) {
                scale = 2;
                break;
            }
            scale = supportCurrencyInfo.getPeggedCurrencyScale();
        } else {
            java.util.List<java.lang.String> listOLrzqt = C31785mDv.EZpvd.OLrzqt();
            if (!(listOLrzqt instanceof java.util.Collection) || !listOLrzqt.isEmpty()) {
                java.util.Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it.next(), (java.lang.CharSequence) buySellCurrency.getCurrency(), true)) {
                        scale = 2;
                        break;
                    }
                }
            }
            scale = buySellCurrency.getScale();
        }
        c29945lGdZuBGHE.OLrzqt(scale);
        java.util.List<java.lang.String> listOLrzqt2 = C31785mDv.EZpvd.OLrzqt();
        if ((listOLrzqt2 instanceof java.util.Collection) && listOLrzqt2.isEmpty()) {
            scale2 = currencyToken.getScale();
        } else {
            java.util.Iterator<T> it2 = listOLrzqt2.iterator();
            while (it2.hasNext()) {
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) it2.next(), (java.lang.CharSequence) currencyToken.getCurrency(), true)) {
                    break;
                }
            }
            scale2 = currencyToken.getScale();
        }
        c29945lGdZuBGHE.AEQbTJ(scale2);
        ((AbstractC31462luV) KWHzl()).valueOf.setMaxDecimalValue(zuBGHE().OLrzqt(zuBGHE().KWHzl()));
        copydefault(sSMYrx().zsXlph());
        AbstractC31462luV abstractC31462luV = (AbstractC31462luV) KWHzl();
        boolean z = AuCTel().hUfVAv() && AuCTel().fIwbmz().copydefault() != BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR;
        ConstraintLayout root = abstractC31462luV.AuCTel.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (root.getVisibility() == 0 || C33129mqd.AEQbTJ(zuBGHE().djBIcL()) > AudioStats.AUDIO_AMPLITUDE_NONE || z) {
            return;
        }
        if (zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT && (!zuBGHE().iwGUEr().isEmpty())) {
            abstractC31462luV.values.setVisibility(0);
            abstractC31462luV.values.setEnabled(true);
            abstractC31462luV.iwGUEr.setVisibility(8);
            abstractC31462luV.isConnected.setVisibility(8);
            return;
        }
        abstractC31462luV.values.setVisibility(8);
        abstractC31462luV.values.setEnabled(false);
        abstractC31462luV.iwGUEr.setVisibility(0);
        abstractC31462luV.iwGUEr.setEnabled(false);
        abstractC31462luV.isConnected.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str) {
        java.lang.String strOcIXYQ;
        SupportCurrencyInfo supportCurrencyInfo;
        if (str.length() == 0) {
            str = this.getFieldNames;
        }
        if (sSMYrx().copydefault(sSMYrx().AwvSrB())) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = sSMYrx().AwvSrB();
            if (channelAwvSrB == null || (supportCurrencyInfo = channelAwvSrB.getSupportCurrencyInfo()) == null || (strOcIXYQ = supportCurrencyInfo.getPeggedCurrency()) == null) {
                strOcIXYQ = sSMYrx().OcIXYQ();
            }
        } else {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = sSMYrx().AwvSrB();
            if (channelAwvSrB2 == null || (strOcIXYQ = channelAwvSrB2.getSupportCurrency()) == null) {
                strOcIXYQ = sSMYrx().OcIXYQ();
            }
        }
        if (AuCTel().dNCPSb()) {
            ((AbstractC31462luV) KWHzl()).valueOf.EZpvd(zuBGHE().EZpvd(str, strOcIXYQ));
            return;
        }
        if (sSMYrx().dxcTrN() && zuBGHE().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
            ((AbstractC31462luV) KWHzl()).valueOf.EZpvd(zuBGHE().EZpvd(str, ""));
            ((AbstractC31462luV) KWHzl()).valueOf.setToggleChipFiatCurrency(sSMYrx().OcIXYQ());
        } else {
            ((AbstractC31462luV) KWHzl()).valueOf.EZpvd(zuBGHE().EZpvd(str, strOcIXYQ));
            ((AbstractC31462luV) KWHzl()).valueOf.setToggleChipFiatCurrency("");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(java.lang.String str) {
        ((AbstractC31462luV) KWHzl()).valueOf.setNumberInputText(str);
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void AuCTelauCTel() {
        if (sSMYrx().zLjUOn().length() == 0) {
            zuBGHE().copydefault("0", true);
            copydefault(sSMYrx().zuBGHE());
            EZpvd("0");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void RJOkX() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) sSMYrx().zLjUOn())) {
            this.zsXlph = false;
            ((AbstractC31462luV) KWHzl()).valueOf.setMaxDecimalValue(zuBGHE().EZpvd());
            EZpvd(sSMYrx().zLjUOn());
            sSMYrx().AEQbTJ("");
            return;
        }
        executeInputValidation$default(this, null, 1, null);
    }

    public final java.lang.String OLrzqt(com.okinc.buysell.ui.bsc.util.InputType inputType) {
        C29945lGd c29945lGdZuBGHE = zuBGHE();
        if (c29945lGdZuBGHE.copydefault(sSMYrx().AwvSrB())) {
            return c29945lGdZuBGHE.AEQbTJ(inputType, sSMYrx().AwvSrB());
        }
        java.lang.String strFetchVPNInfo = sSMYrx().fetchVPNInfo();
        FiatCryptoRange fiatCryptoRangeFJNWhG = c29945lGdZuBGHE.fJNWhG();
        if (C33129mqd.AEQbTJ(strFetchVPNInfo, fiatCryptoRangeFJNWhG != null ? fiatCryptoRangeFJNWhG.getMax() : null)) {
            java.lang.String strKWHzl = c29945lGdZuBGHE.KWHzl(inputType);
            return strKWHzl == null ? "0" : strKWHzl;
        }
        return sSMYrx().AEQbTJ(inputType, c29945lGdZuBGHE.values(), 1.0d);
    }

    public static /* synthetic */ void executeInputValidation$default(lEN len, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        len.AEQbTJ(bool);
    }

    public final void AEQbTJ(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : C33129mqd.OLrzqt((java.lang.CharSequence) sSMYrx().ORxRYg().getUniqueId());
        sSMYrx().AhwBna(zuBGHE().uzCIH());
        zuBGHE().OLrzqt(zBooleanValue, sSMYrx().fIwbmz().copydefault(), QOLQEE().fJNWhG(), sSMYrx().fetchVPNInfo(), sSMYrx().AwvSrB());
        UeEOUB();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lEN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lEN AEQbTJ() {
            return new lEN();
        }
    }
}
