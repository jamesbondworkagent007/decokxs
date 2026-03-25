package o;

import android.view.View;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.video.AudioStats;
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
import com.okinc.assets.api.model.DepositEntryPoint;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailRecoveryResult;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import com.okinc.buysell.data.cedefi.BuySellDexEmailSetResult;
import com.okinc.buysell.data.cedefi.BuySellDexEscapeResult;
import com.okinc.buysell.data.cedefi.BuySellDexUpdateInfoResult;
import com.okinc.buysell.ui.bsc.BaseBuySellFragment;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.buysell.ui.bsc.InputBaseViewModel;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$addObservers$1$1$1$1;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$addObservers$1$7$1;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$addObservers$2;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$onViewCreated$1;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$updateCryptoFiatWidget$10;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$updateCryptoFiatWidget$11;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$updateCryptoFiatWidget$4;
import com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$updateCryptoFiatWidget$7;
import com.okinc.buysell.ui.bsc.fragment.sell.SellViewModel;
import com.okinc.buysell.ui.bsc.util.InputUtils;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
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
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.RoundingMode;
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
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lGL extends lGP<AbstractC31527lvh> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int iwGUEr = 8;
    public final InterfaceC56387yDm AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public java.lang.String getNewProxyInstance;
    public final InterfaceC56387yDm sSMYrx;
    public final ActivityResultLauncher<EmailRecoveryInput> wlaJM;
    public boolean zLjUOn;
    public final InterfaceC56387yDm zsXlph;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
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
            EZpvd = iArr;
            int[] iArr2 = new int[BaseBuySellViewModel.QuoteType.values().length];
            try {
                iArr2[BaseBuySellViewModel.QuoteType.REGULAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[BaseBuySellViewModel.QuoteType.DEX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[BaseBuySellViewModel.Companion.DexTradeStatus.values().length];
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_NEED_ESCAPING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_CHAIN_ADDRESS_NOT_EXIST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_PRE_CHECK_FAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_EMAIL_SUFFIX_ILLEGAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_ZK_EMAIL_RECOVER_FAIL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_PASSKEY_NOT_ON_CHAIN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_EMAIL_NOT_ON_CHAIN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_PASSKEY_DELETED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_ONLY_SUPPORT_SELL_BECAUSE_CEFI_LISTING.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[BaseBuySellViewModel.Companion.DexTradeStatus.DEX_WALLET_NOT_EXIST.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            AEQbTJ = iArr3;
            int[] iArr4 = new int[com.okinc.buysell.ui.bsc.util.InputType.values().length];
            try {
                iArr4[com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            OLrzqt = iArr4;
            int[] iArr5 = new int[InputBaseViewModel.InputValidationResult.values().length];
            try {
                iArr5[InputBaseViewModel.InputValidationResult.DEX_24HOUR_TRADING_LIMIT_REACHED_BALANCE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.INPUT_BALANCE_MIN_MAX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.BALANCE_INPUT_MIN_MAX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.BALANCE_MIN_INPUT_MAX.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.BALANCE_MIN_MAX_INPUT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.INPUT_MIN_BALANCE_MAX.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_BALANCE_INPUT_MAX.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_BALANCE_MAX_INPUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.INPUT_MIN_MAX_BALANCE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_MAX_BALANCE_INPUT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_MAX_INPUT_BALANCE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.DEX_QUOTE_AMOUNT_UNAVAILABLE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.ZERO.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.PRE_LOGIN_PRE_KYC.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_INPUT_BALANCE_MAX.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.MIN_INPUT_MAX_BALANCE.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.NATIVE_CHANNEL_VALID.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr5[InputBaseViewModel.InputValidationResult.THIRD_PARTY_VALID.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            KWHzl = iArr5;
        }
    }

    public static final void AEQbTJ(android.view.View view) {
    }

    public static final void OLrzqt(android.view.View view) {
    }

    public static final void gEmmrt(android.view.View view) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC31527lvh AEQbTJ(lGL lgl) {
        return (AbstractC31527lvh) lgl.KWHzl();
    }

    public lGL() {
        super(C31351lsQ.ActionBar.ORxRYg);
        final Function0 function0 = null;
        this.zsXlph = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$2
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
        this.sSMYrx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SellViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$7
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
        this.AuCTelauCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lHQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.fragment.sell.SellFragmentV3$special$$inlined$viewModels$default$10
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
        this.zLjUOn = true;
        this.getNewProxyInstance = "";
        this.AubY = C56392yDr.copydefault(new Function0() { // from class: o.lHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lGL.QbewEr();
            }
        });
        ActivityResultLauncher<EmailRecoveryInput> activityResultLauncherRegisterForActivityResult = registerForActivityResult(RJOkX(), new ActivityResultCallback() { // from class: o.lHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lGL.OLrzqt((EmailRecoveryResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.wlaJM = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BSCMasterViewModel QfsBiF() {
        return (BSCMasterViewModel) this.zsXlph.getValue();
    }

    public final SellViewModel AwvSrB() {
        return (SellViewModel) this.sSMYrx.getValue();
    }

    /* JADX DEBUG: Possible override for method com.okinc.buysell.ui.bsc.BaseBuySellFragment.AxsJAY()V */
    public final lHQ AxsJAY() {
        return (lHQ) this.AuCTelauCTel.getValue();
    }

    @Override // o.lzR
    public BSCMasterViewModel isConnected() {
        return QfsBiF();
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public BaseBuySellViewModel AuCTel() {
        return AwvSrB();
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public InputBaseViewModel ejfBZ() {
        return AxsJAY();
    }

    private final ActivityResultContract<EmailRecoveryInput, EmailRecoveryResult> RJOkX() {
        return (ActivityResultContract) this.AubY.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityResultContract QbewEr() {
        return ((InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class)).copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(EmailRecoveryResult emailRecoveryResult) {
        Intrinsics.checkNotNullParameter(emailRecoveryResult, "");
        if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Cancelled.KWHzl)) {
            pUU.EZpvd("SellFragmentV3", "Email recovery cancelled");
        } else if (Intrinsics.EZpvd(emailRecoveryResult, EmailRecoveryResult.Success.OLrzqt)) {
            pUU.EZpvd("SellFragmentV3", "Email recovery success");
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
    private final void AhwBna(boolean z) {
        AwvSrB().AhwBna(QfsBiF().fJNWhG() == null);
        Unit unit = null;
        if (z) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAEQbTJ = lAA.KWHzl.AEQbTJ();
            if (channelAEQbTJ != null) {
                java.util.List<PaymentMethod> paymentMethods = channelAEQbTJ.getPaymentMethods();
                if (paymentMethods != null) {
                    if (!paymentMethods.isEmpty()) {
                        EZpvd(channelAEQbTJ, paymentMethods.get(0));
                    } else {
                        ((AbstractC31527lvh) KWHzl()).AkhnZx.EZpvd();
                    }
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            ((AbstractC31527lvh) KWHzl()).AkhnZx.EZpvd();
            return;
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd = lAA.KWHzl.EZpvd();
        if (channelEZpvd != null) {
            java.util.List<PaymentMethod> paymentMethods2 = channelEZpvd.getPaymentMethods();
            if (paymentMethods2 != null) {
                if (!paymentMethods2.isEmpty()) {
                    EZpvd(channelEZpvd, paymentMethods2.get(0));
                } else {
                    ((AbstractC31527lvh) KWHzl()).AkhnZx.EZpvd();
                }
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        ((AbstractC31527lvh) KWHzl()).AkhnZx.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v25, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment, o.lzN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AYXKKw() {
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd;
        java.lang.String coinUrl;
        java.lang.String str;
        BuySellConvertParameters fieldNames;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd;
        java.lang.String strAuCTel;
        BuySellConvertParameters fieldNames2;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd2;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd3;
        java.lang.String tokenName;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd4;
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfoEZpvd5;
        if (!((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna() && C31784mDu.AEQbTJ.copydefault() > 0) {
            BuySellConvertParameters fieldNames3 = QfsBiF().getFieldNames();
            java.lang.String sellTotalCryptoAmount = null;
            if ((fieldNames3 != null ? fieldNames3.isConnected() : null) == TargetTab.SELL) {
                OLrzqt(true);
                BuySellConvertParameters fieldNames4 = QfsBiF().getFieldNames();
                AhwBna((fieldNames4 != null ? fieldNames4.AEQbTJ() : null) == null);
                SellViewModel sellViewModelAwvSrB = AwvSrB();
                if (C33492mxV.OLrzqt()) {
                    BuySellConvertParameters fieldNames5 = QfsBiF().getFieldNames();
                    coinUrl = (fieldNames5 == null || (buySellBaseCurrencyInfoEZpvd5 = fieldNames5.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd5.getCoinUrlNight();
                    sellViewModelAwvSrB.AkhnZx(coinUrl);
                    SellViewModel sellViewModelAwvSrB2 = AwvSrB();
                    BuySellConvertParameters fieldNames6 = QfsBiF().getFieldNames();
                    sellViewModelAwvSrB2.isConnected((fieldNames6 != null || (buySellBaseCurrencyInfoEZpvd4 = fieldNames6.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd4.getChainIcon());
                    BuySellConvertParameters fieldNames7 = QfsBiF().getFieldNames();
                    str = (fieldNames7 != null || (buySellBaseCurrencyInfoEZpvd3 = fieldNames7.EZpvd()) == null || (tokenName = buySellBaseCurrencyInfoEZpvd3.getTokenName()) == null) ? "" : tokenName;
                    AwvSrB().fJNWhG(str);
                    fieldNames = QfsBiF().getFieldNames();
                    if ((fieldNames == null ? fieldNames.AEQbTJ() : null) != null) {
                        channelEZpvd = lAA.KWHzl.AEQbTJ();
                    } else {
                        channelEZpvd = lAA.KWHzl.EZpvd();
                    }
                    if (channelEZpvd == null && (strAuCTel = channelEZpvd.getSupportCurrency()) != null) {
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAuCTel)) {
                            strAuCTel = AuCTel().AuCTel();
                        }
                        if (strAuCTel == null) {
                        }
                        this.getNewProxyInstance = strAuCTel;
                        ((AbstractC31527lvh) KWHzl()).fJNWhG.setTokenCurrency(str);
                        ((AbstractC31527lvh) KWHzl()).fJNWhG.djBIcL();
                        fieldNames2 = QfsBiF().getFieldNames();
                        if (fieldNames2 != null) {
                            sellTotalCryptoAmount = buySellBaseCurrencyInfoEZpvd2.getSellTotalCryptoAmount();
                        }
                        AwvSrB().fetchVPNInfo(C31661lzi.appendCryptoSymbol$default(sellTotalCryptoAmount == null ? "" : sellTotalCryptoAmount, str, 0, null, null, null, 30, null));
                        AwvSrB().DbNXlk(C33070mpX.AYXKKw(C31351lsQ.Activity.dUDNAs));
                        AEQbTJ(true);
                    } else {
                        strAuCTel = AuCTel().AuCTel();
                        this.getNewProxyInstance = strAuCTel;
                        ((AbstractC31527lvh) KWHzl()).fJNWhG.setTokenCurrency(str);
                        ((AbstractC31527lvh) KWHzl()).fJNWhG.djBIcL();
                        fieldNames2 = QfsBiF().getFieldNames();
                        if (fieldNames2 != null && (buySellBaseCurrencyInfoEZpvd2 = fieldNames2.EZpvd()) != null) {
                            sellTotalCryptoAmount = buySellBaseCurrencyInfoEZpvd2.getSellTotalCryptoAmount();
                        }
                        AwvSrB().fetchVPNInfo(C31661lzi.appendCryptoSymbol$default(sellTotalCryptoAmount == null ? "" : sellTotalCryptoAmount, str, 0, null, null, null, 30, null));
                        AwvSrB().DbNXlk(C33070mpX.AYXKKw(C31351lsQ.Activity.dUDNAs));
                        AEQbTJ(true);
                    }
                } else {
                    BuySellConvertParameters fieldNames8 = QfsBiF().getFieldNames();
                    if (fieldNames8 != null && (buySellBaseCurrencyInfoEZpvd = fieldNames8.EZpvd()) != null) {
                        coinUrl = buySellBaseCurrencyInfoEZpvd.getCoinUrl();
                    }
                    sellViewModelAwvSrB.AkhnZx(coinUrl);
                    SellViewModel sellViewModelAwvSrB22 = AwvSrB();
                    BuySellConvertParameters fieldNames62 = QfsBiF().getFieldNames();
                    if (fieldNames62 != null) {
                        sellViewModelAwvSrB22.isConnected((fieldNames62 != null || (buySellBaseCurrencyInfoEZpvd4 = fieldNames62.EZpvd()) == null) ? null : buySellBaseCurrencyInfoEZpvd4.getChainIcon());
                        BuySellConvertParameters fieldNames72 = QfsBiF().getFieldNames();
                        if (fieldNames72 != null) {
                            AwvSrB().fJNWhG(str);
                            fieldNames = QfsBiF().getFieldNames();
                            if ((fieldNames == null ? fieldNames.AEQbTJ() : null) != null) {
                            }
                            if (channelEZpvd == null) {
                                strAuCTel = AuCTel().AuCTel();
                                this.getNewProxyInstance = strAuCTel;
                                ((AbstractC31527lvh) KWHzl()).fJNWhG.setTokenCurrency(str);
                                ((AbstractC31527lvh) KWHzl()).fJNWhG.djBIcL();
                                fieldNames2 = QfsBiF().getFieldNames();
                                if (fieldNames2 != null) {
                                }
                                AwvSrB().fetchVPNInfo(C31661lzi.appendCryptoSymbol$default(sellTotalCryptoAmount == null ? "" : sellTotalCryptoAmount, str, 0, null, null, null, 30, null));
                                AwvSrB().DbNXlk(C33070mpX.AYXKKw(C31351lsQ.Activity.dUDNAs));
                                AEQbTJ(true);
                            }
                        }
                    }
                }
            }
        }
        super.AYXKKw();
        flVtFt();
        AwvSrB().AEQbTJ(AxsJAY());
        C52794wYp c52794wYp = ((AbstractC31527lvh) KWHzl()).values;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        EZpvd(c52794wYp);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fvQaOB() {
        lIL lil = ((AbstractC31527lvh) KWHzl()).getNewProxyInstance;
        if (gasjUx() && isResumed()) {
            Intrinsics.copydefault(lil);
            if (lil.getVisibility() != 0) {
                BaseBuySellViewModel.trackAIChatbotEvent$default(AuCTel(), "Simpletrade_Sell_AIChatBotBanner_View", ejfBZ(), null, false, false, null, 60, null);
            }
            lil.setOnClickListener(new View.OnClickListener() { // from class: o.lHo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lGL.AubY(this.EZpvd, view);
                }
            });
            lil.EZpvd();
            return;
        }
        lil.copydefault();
    }

    public static final void AubY(lGL lgl, android.view.View view) {
        lgl.aKErDB();
    }

    private final boolean gasjUx() {
        TradingAgentInfo tradingAgentInfo;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AuCTel().AwvSrB();
        if (!AuCTel().iZzfmt() || !AuCTel().AEQbTJ(channelAwvSrB)) {
            return false;
        }
        if (QfsBiF().zuBGHE() || AuCTel().gkJEwt()) {
            return true;
        }
        return C33129mqd.AEQbTJ(ejfBZ().uzCIH()) >= C33129mqd.AEQbTJ((channelAwvSrB == null || (tradingAgentInfo = channelAwvSrB.getTradingAgentInfo()) == null) ? null : tradingAgentInfo.getQuoteLimit());
    }

    private final void aKErDB() {
        BaseBuySellViewModel.trackAIChatbotEvent$default(AuCTel(), "Simpletrade_Sell_AIChatBotBanner_Click", ejfBZ(), null, true, QfsBiF().zuBGHE(), java.lang.Boolean.valueOf(!AuCTel().getNewProxyInstance().OLrzqt()), 4, null);
        if (AuCTel().getNewProxyInstance().OLrzqt()) {
            zsXlph();
            return;
        }
        C29816lBj c29816lBjOLrzqt = C29816lBj.Companion.OLrzqt(QUSxYX(), new Function0() { // from class: o.lHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lGL.djBIcL(this.EZpvd);
            }
        }, new Function0() { // from class: o.lHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lGL.valueOf(this.EZpvd);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29816lBjOLrzqt.show(childFragmentManager);
    }

    public static final Unit djBIcL(lGL lgl) {
        lgl.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(lGL lgl) {
        lgl.AuCTel().getNewProxyInstance().KWHzl();
        return Unit.INSTANCE;
    }

    private final java.lang.String QUSxYX() {
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
        final SellViewModel sellViewModelAwvSrB = AwvSrB();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<kotlin.Pair<BaseBuySellViewModel.ActionBar, kotlin.Pair<com.okinc.okpaymentapi.data.remote.model.management.Channel, PaymentMethod>>>> liveDataFvQaOB = sellViewModelAwvSrB.fvQaOB();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataFvQaOB, viewLifecycleOwner, new Function1() { // from class: o.lHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.copydefault(this.AEQbTJ, sellViewModelAwvSrB, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFinit = sellViewModelAwvSrB.finit();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFinit, viewLifecycleOwner2, new Function1() { // from class: o.lHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.copydefault(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<BaseBuySellViewModel.ActionBar>> liveDataQOLQEE = sellViewModelAwvSrB.QOLQEE();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataQOLQEE, viewLifecycleOwner3, new Function1() { // from class: o.lHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.KWHzl(this.EZpvd, sellViewModelAwvSrB, (BaseBuySellViewModel.ActionBar) obj);
            }
        });
        LiveData<C32989mnw<kotlin.Pair<com.okinc.okpaymentapi.data.remote.model.management.Channel, PaymentMethod>>> liveDataSSMYrx = sellViewModelAwvSrB.sSMYrx();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataSSMYrx, viewLifecycleOwner4, new Function1() { // from class: o.lHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataFZBcTu = sellViewModelAwvSrB.fZBcTu();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataFZBcTu, viewLifecycleOwner5, new Function1() { // from class: o.lHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.KWHzl(this.AEQbTJ, (Unit) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataFFgQHt = sellViewModelAwvSrB.fFgQHt();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataFFgQHt, viewLifecycleOwner6, new Function1() { // from class: o.lGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.copydefault(this.copydefault, (Unit) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQUSxYX = sellViewModelAwvSrB.QUSxYX();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataQUSxYX, viewLifecycleOwner7, new Function1() { // from class: o.lGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.AYXKKw(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataRcXXUw = sellViewModelAwvSrB.RcXXUw();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(liveDataRcXXUw, viewLifecycleOwner8, new Function1() { // from class: o.lGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.djBIcL(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAKErDB = sellViewModelAwvSrB.aKErDB();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        mha.copydefault(liveDataAKErDB, viewLifecycleOwner9, new Function1() { // from class: o.lGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataQbewEr = sellViewModelAwvSrB.QbewEr();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        mha.copydefault(liveDataQbewEr, viewLifecycleOwner10, new Function1() { // from class: o.lGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.AEQbTJ(this.EZpvd, sellViewModelAwvSrB, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SellFragmentV3$addObservers$2(this, null), 3, null);
        RcXXUw();
        dNCPSb();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lGL lgl, SellViewModel sellViewModel, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) pair.component1();
        kotlin.Pair pair2 = (kotlin.Pair) pair.component2();
        VerificationStatus verificationStatusFJNWhG = lgl.QfsBiF().fJNWhG();
        int i = verificationStatusFJNWhG == null ? -1 : Application.EZpvd[verificationStatusFJNWhG.ordinal()];
        if (i == -1) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.component1();
            sellViewModel.OLrzqt(channel, (PaymentMethod) pair2.component2());
            sellViewModel.copydefault(actionBar);
            if (!C33129mqd.KWHzl((java.util.Collection) channel.getPaymentMethods())) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lgl), null, null, new SellFragmentV3$addObservers$1$1$1$1(sellViewModel, null), 3, null);
                lgl.AxsJAY().copydefault((FiatCryptoRange) null);
                lgl.AwvSrB().AhwBna(false);
            } else {
                lgl.AxsJAY().KWHzl(channel);
                lgl.AwvSrB().AhwBna(true);
            }
            lgl.ORxRYg();
            lgl.fvQaOB();
        } else {
            if (i != 1 && i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sellViewModel.djBIcL(false);
            sellViewModel.copydefault(actionBar);
            lgl.AwvSrB().values(sellViewModel.DbNXlk(C31351lsQ.Activity.bindToGooglePlayService));
            lgl.AwvSrB().AhwBna(false);
        }
        BaseBuySellViewModel.getQuotedPrice$default(lgl.AwvSrB(), lgl.AwvSrB().OcIXYQ(), lgl.AwvSrB().zuBGHE(), ((AbstractC31527lvh) lgl.KWHzl()).fJNWhG.KWHzl(), lgl.AxsJAY(), false, false, 48, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lGL lgl, boolean z) {
        C30019lIx c30019lIx = ((AbstractC31527lvh) lgl.KWHzl()).fJNWhG;
        if (z) {
            c30019lIx.setFiatCurrencyDropDownVisibility(0);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
            lgl.dvKsVJ();
        } else {
            c30019lIx.setFiatCurrencyDropDownVisibility(8);
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(0);
            lgl.UeEOUB();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lGL lgl, SellViewModel sellViewModel, BaseBuySellViewModel.ActionBar actionBar) {
        java.lang.String currency;
        if (actionBar != null) {
            C30019lIx c30019lIx = ((AbstractC31527lvh) lgl.KWHzl()).fJNWhG;
            if (lgl.AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
                currency = lgl.KWHzl(actionBar.AEQbTJ().getCurrency());
            } else {
                currency = actionBar.copydefault().getCurrency();
            }
            c30019lIx.setTokenCurrency(currency);
            if (lgl.QfsBiF().AEQbTJ(TargetTab.SELL) && sellViewModel.QVAiDq()) {
                lgl.QfsBiF().OLrzqt(actionBar.copydefault());
                sellViewModel.EZpvd(false);
            }
            sellViewModel.KWHzl(actionBar.copydefault().getValuation());
            sellViewModel.copydefault(actionBar.copydefault().getAvailableBalance());
            lgl.KWHzl(actionBar.AEQbTJ(), actionBar.copydefault());
            if (!lgl.getFieldNames()) {
                lgl.AuCTelauCTel();
            } else {
                lgl.copydefault(false);
            }
            lgl.AwvSrB().accept();
            lgl.AwvSrB().AxsJAYsNCnLh();
            lgl.EZpvd(actionBar.copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lGL lgl, kotlin.Pair pair) {
        if (pair != null) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.component1();
            PaymentMethod paymentMethod = (PaymentMethod) pair.component2();
            lgl.AxsJAY().KWHzl(channel);
            lgl.EZpvd(channel, paymentMethod);
        }
        lgl.ORxRYg();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lGL lgl, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ((AbstractC31527lvh) lgl.KWHzl()).AkhnZx.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lGL lgl, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        lIE.showPaymentSelectorContent$default(((AbstractC31527lvh) lgl.KWHzl()).AkhnZx, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(lGL lgl, boolean z) {
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lgl), null, null, new SellFragmentV3$addObservers$1$7$1(lgl, null), 3, null);
        } else {
            ((AbstractC31527lvh) lgl.KWHzl()).values.OLrzqt(0L);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(lGL lgl, boolean z) {
        if (!z) {
            lgl.OLrzqt(true);
        }
        AbstractC31527lvh abstractC31527lvh = (AbstractC31527lvh) lgl.KWHzl();
        abstractC31527lvh.fIwbmz.setVisibility(z ? 0 : 8);
        abstractC31527lvh.AuCTel.setVisibility(z ? 4 : 0);
        abstractC31527lvh.EZpvd.setVisibility(z ? 4 : 0);
        abstractC31527lvh.fetchVPNInfo.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(lGL lgl, boolean z) {
        lgl.AwvSrB().DbNXlk(C33070mpX.AYXKKw(C31351lsQ.Activity.dUDNAs));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final lGL lgl, SellViewModel sellViewModel, boolean z) {
        if (z) {
            lgl.OLrzqt(false);
            sellViewModel.QKudOq();
            AbstractC31527lvh abstractC31527lvh = (AbstractC31527lvh) lgl.KWHzl();
            abstractC31527lvh.fIwbmz.setVisibility(8);
            abstractC31527lvh.AuCTel.setVisibility(4);
            abstractC31527lvh.EZpvd.setVisibility(4);
            abstractC31527lvh.fetchVPNInfo.setVisibility(0);
            C55173xeu c55173xeu = abstractC31527lvh.DbNXlk;
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.AxsJAYaxsJAY));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hUfVAv));
            c55173xeu.AEQbTJ().setVisibility(0);
            c55173xeu.AEQbTJ().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fvQaOB));
            c55173xeu.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lHz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lGL.fIwbmz(this.EZpvd, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(lGL lgl, android.view.View view) {
        if (NetworkUtil.AEQbTJ(lgl.requireContext())) {
            BaseBuySellFragment.load$default(lgl, false, 1, null);
        }
    }

    private final void EZpvd(CurrencyToken currencyToken) {
        AwvSrB().AkhnZx(C33492mxV.OLrzqt() ? currencyToken.getNightIcon() : currencyToken.getIcon());
        AwvSrB().isConnected(currencyToken.getDexInfo().getChainLogo());
        AwvSrB().fJNWhG(currencyToken.getCurrency());
    }

    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void KWHzl(boolean z) {
        if (!z) {
            AwvSrB().djBIcL(!iwGUEr());
        }
        SellViewModel sellViewModelAwvSrB = AwvSrB();
        java.lang.String strZsXlph = sellViewModelAwvSrB.zsXlph();
        java.lang.String strAuCTelauCTel = sellViewModelAwvSrB.AuCTelauCTel();
        java.lang.String strZLjUOn = sellViewModelAwvSrB.zLjUOn();
        if (strZLjUOn.length() <= 0) {
            strZLjUOn = null;
        }
        if (strZLjUOn == null) {
            strZLjUOn = AxsJAY().OLrzqt();
        }
        BaseBuySellViewModel.getTradeSuggestionData$default(sellViewModelAwvSrB, null, strZsXlph, strAuCTelauCTel, strZLjUOn, AxsJAY().uzCIH(), AxsJAY().fetchVPNInfo(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(CurrencyToken currencyToken) {
        java.lang.String strOcIXYQ;
        java.lang.String currency;
        SupportCurrencyInfo supportCurrencyInfo;
        AwvSrB().AYXKKw("cryptocurrency_list_button");
        C29882lDv c29882lDv = new C29882lDv();
        if (AwvSrB().copydefault(AwvSrB().AwvSrB())) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AwvSrB().AwvSrB();
            strOcIXYQ = (channelAwvSrB == null || (supportCurrencyInfo = channelAwvSrB.getSupportCurrencyInfo()) == null) ? null : supportCurrencyInfo.getPeggedCurrency();
        } else {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = AwvSrB().AwvSrB();
            strOcIXYQ = (channelAwvSrB2 == null || !(C31662lzj.OLrzqt(channelAwvSrB2) || C31662lzj.valueOf(channelAwvSrB2) || C31662lzj.djBIcL(channelAwvSrB2))) ? "" : AwvSrB().OcIXYQ();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
            currency = currencyToken.getDexInfo().getUniqueId();
        } else {
            currency = currencyToken.getCurrency();
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("list_type", BuySellCryptoListFragment.Companion.ListType.SELL);
        pairArr[1] = C56390yDp.OLrzqt("selected_token", currency);
        pairArr[2] = C56390yDp.OLrzqt("selected_currency", strOcIXYQ);
        pairArr[3] = C56390yDp.OLrzqt("has_verification_status", java.lang.Boolean.valueOf(QfsBiF().fJNWhG() == null));
        c29882lDv.setArguments(BundleKt.bundleOf(pairArr));
        c29882lDv.copydefault(new Function1() { // from class: o.lGZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.KWHzl(this.EZpvd, (CurrencyToken) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29882lDv.show(childFragmentManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(lGL lgl, CurrencyToken currencyToken) {
        BuySellCurrency buySellCurrency;
        boolean z;
        java.lang.String str;
        java.lang.String strOcIXYQ = "";
        Intrinsics.checkNotNullParameter(currencyToken, "");
        if (!Intrinsics.EZpvd((java.lang.Object) currencyToken.getDexInfo().getUniqueId(), (java.lang.Object) lgl.AwvSrB().ORxRYg().getUniqueId())) {
            lgl.AwvSrB().KWHzl(currencyToken.getDexInfo());
            lgl.fZBcTu();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) lgl.AwvSrB().zuBGHE(), (java.lang.Object) currencyToken.getCurrency())) {
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().QOLQEE());
            if (actionBar == null || (buySellCurrency = actionBar.AEQbTJ()) == null) {
                buySellCurrency = new BuySellCurrency((java.lang.String) null, false, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 0, (java.util.List) null, 0, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) null, 131071, (DefaultConstructorMarker) null);
            }
            lgl.AwvSrB().copydefault(new BaseBuySellViewModel.ActionBar(buySellCurrency, currencyToken));
            if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
                lgl.AuCTelauCTel();
            } else {
                java.lang.String currency = currencyToken.getCurrency();
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = lgl.AwvSrB().AwvSrB();
                if (!Intrinsics.EZpvd((java.lang.Object) currency, (java.lang.Object) (channelAwvSrB != null ? channelAwvSrB.getSupportCurrency() : null))) {
                    z = false;
                }
                lHQ lhqAxsJAY = lgl.AxsJAY();
                lhqAxsJAY.EZpvd(true);
                BaseBuySellViewModel.getQuotedPrice$default(lgl.AwvSrB(), lgl.AwvSrB().OcIXYQ(), currencyToken.getCurrency(), lhqAxsJAY.djBIcL(), lhqAxsJAY, true, false, 32, null);
                lgl.EZpvd(currencyToken);
                if (!currencyToken.getTradeSupportedCurrencies().isEmpty()) {
                    strOcIXYQ = lgl.AwvSrB().OcIXYQ();
                } else {
                    for (java.lang.String str2 : currencyToken.getTradeSupportedCurrencies()) {
                        if (C59449zhJ.gEmmrt(lgl.AwvSrB().OcIXYQ(), str2, true)) {
                            str = str2;
                            break;
                        }
                    }
                }
                str = strOcIXYQ;
                lgl.AwvSrB().AEQbTJ(currencyToken, currencyToken.getCurrency(), str, "", "", lgl.AxsJAY().fetchVPNInfo(), z);
            }
            z = true;
            lHQ lhqAxsJAY2 = lgl.AxsJAY();
            lhqAxsJAY2.EZpvd(true);
            BaseBuySellViewModel.getQuotedPrice$default(lgl.AwvSrB(), lgl.AwvSrB().OcIXYQ(), currencyToken.getCurrency(), lhqAxsJAY2.djBIcL(), lhqAxsJAY2, true, false, 32, null);
            lgl.EZpvd(currencyToken);
            if (!currencyToken.getTradeSupportedCurrencies().isEmpty()) {
            }
            str = strOcIXYQ;
            lgl.AwvSrB().AEQbTJ(currencyToken, currencyToken.getCurrency(), str, "", "", lgl.AxsJAY().fetchVPNInfo(), z);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
            ((AbstractC31527lvh) KWHzl()).fJNWhG.setTokenCurrency(KWHzl(str));
        }
        BaseBuySellViewModel.getTradeSuggestionData$default(AwvSrB(), null, AwvSrB().zuBGHE(), str, "", "", AxsJAY().fetchVPNInfo(), z, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void dvKsVJ() {
        final C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
        dxcTrN();
        c30019lIx.setFiatCurrencyDropDownOnClickListener(new View.OnClickListener() { // from class: o.lHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lGL.OLrzqt(this.copydefault, c30019lIx, view);
            }
        });
    }

    public static final void OLrzqt(final lGL lgl, final C30019lIx c30019lIx, android.view.View view) {
        java.lang.String currency;
        BuySellCurrency buySellCurrencyAEQbTJ;
        java.lang.String currency2;
        BaseBuySellViewModel.ActionBar actionBar;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        lgl.AwvSrB().AYXKKw("fiatcurrency_list_button");
        mHA mha = mHA.OLrzqt;
        kotlin.Pair pair = (kotlin.Pair) mha.AEQbTJ(lgl.AwvSrB().fvQaOB());
        java.lang.String str = "";
        if (pair == null || (actionBar = (BaseBuySellViewModel.ActionBar) pair.getFirst()) == null || (buySellCurrencyAEQbTJ2 = actionBar.AEQbTJ()) == null || (currency = buySellCurrencyAEQbTJ2.getCurrency()) == null) {
            currency = "";
        }
        BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(lgl.AwvSrB().QOLQEE());
        if (actionBar2 != null && (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) != null && (currency2 = buySellCurrencyAEQbTJ.getCurrency()) != null) {
            str = currency2;
        }
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("default_currency", currency), C56390yDp.OLrzqt("selected_currency", str), C56390yDp.OLrzqt("selected_token", lgl.AwvSrB().zuBGHE()), C56390yDp.OLrzqt("trade_type", lgl.AwvSrB().flVtFt()));
        lJO ljo = new lJO(new yHO() { // from class: o.lHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return lGL.copydefault(this.copydefault, c30019lIx, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        ljo.setArguments(bundleBundleOf);
        ljo.show(lgl.getChildFragmentManager(), "CurrencySelectionBottomSheet");
    }

    public static final Unit copydefault(lGL lgl, C30019lIx c30019lIx, java.lang.String str, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        lgl.AwvSrB().gEmmrt(z);
        if (!Intrinsics.EZpvd((java.lang.Object) lgl.AwvSrB().OcIXYQ(), (java.lang.Object) str)) {
            if (lgl.AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
                c30019lIx.setTokenCurrency(str);
            }
            BaseBuySellViewModel.getTradeSuggestionData$default(lgl.AwvSrB(), null, str2, str, "", "", lgl.AxsJAY().fetchVPNInfo(), true, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djSkpj() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel;
        SellViewModel sellViewModelAwvSrB = AwvSrB();
        java.lang.String strOcIXYQ = AwvSrB().OcIXYQ();
        java.lang.String strZuBGHE = AwvSrB().zuBGHE();
        mHA mha = mHA.OLrzqt;
        kotlin.Pair pair = (kotlin.Pair) mha.AEQbTJ(AwvSrB().sSMYrx());
        java.lang.String depositName = (pair == null || (channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst()) == null) ? null : channel.getDepositName();
        if (depositName == null) {
            depositName = "";
        }
        sellViewModelAwvSrB.copydefault(strOcIXYQ, strZuBGHE, depositName);
        if (AwvSrB().dNCPSb()) {
            java.lang.String strOLrzqt = AxsJAY().OLrzqt();
            java.lang.String strUzCIH = AxsJAY().uzCIH();
            kotlin.Pair pair2 = (kotlin.Pair) mha.AEQbTJ(AwvSrB().sSMYrx());
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = pair2 != null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair2.getFirst() : null;
            kotlin.Pair pair3 = (kotlin.Pair) mha.AEQbTJ(AwvSrB().sSMYrx());
            BaseBuySellFragment.goToPaymentSelectionPageV3$default(this, null, strOLrzqt, strUzCIH, channel2, pair3 != null ? (PaymentMethod) pair3.getSecond() : null, 1, null);
            return;
        }
        BaseBuySellFragment.goToPaymentSelectionPage$default(this, AxsJAY().uzCIH(), AxsJAY().OLrzqt(), 0, false, null, null, 56, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void UeEOUB() {
        C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
        c30019lIx.setFiatCurrencyDropDownVisibility(8);
        c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
        c30019lIx.setFiatCurrencyDropDownOnClickListener(new View.OnClickListener() { // from class: o.lGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lGL.AEQbTJ(view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void dxcTrN() {
        C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
        if (AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.FIAT_INPUT) {
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
    private final void flVtFt() {
        final C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
        c30019lIx.setToggleContainerVisibility(0);
        fZBcTu();
        ((AbstractC31527lvh) KWHzl()).gEmmrt.setEditable(c30019lIx.AEQbTJ());
        ((AbstractC31527lvh) KWHzl()).gEmmrt.setOKDSSize(C30018lIw.OLrzqt(c30019lIx.getContext()));
        c30019lIx.setDebounceOnTextChangedListener(new Function1() { // from class: o.lHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.copydefault(this.AEQbTJ, c30019lIx, (java.lang.String) obj);
            }
        });
        c30019lIx.setNumberInputText("0");
    }

    public static final Unit copydefault(lGL lgl, C30019lIx c30019lIx, java.lang.String str) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        lgl.AxsJAY().OLrzqt(false);
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) lgl.AwvSrB().ORxRYg().getUniqueId()) && lgl.AwvSrB().fIwbmz().copydefault() != BaseBuySellViewModel.Companion.DexTradeStatus.NO_ERROR;
        if (!lgl.zLjUOn && lgl.AwvSrB().gasjUx() && !z) {
            BaseBuySellViewModel.getQuotedPrice$default(lgl.AwvSrB(), lgl.AwvSrB().OcIXYQ(), lgl.AwvSrB().zuBGHE(), c30019lIx.KWHzl(), lgl.AxsJAY(), false, !Intrinsics.EZpvd((java.lang.Object) c30019lIx.KWHzl(), (java.lang.Object) "0"), 16, null);
        }
        if (lgl.AwvSrB().DCJXGO()) {
            strKWHzl = lgl.OLrzqt(lgl.AwvSrB().OuxcSI().getAmount());
        } else {
            strKWHzl = c30019lIx.KWHzl();
        }
        lgl.AxsJAY().copydefault(strKWHzl, lgl.AxsJAY().getNewProxyInstance() || lgl.AxsJAY().hDKMBd());
        executeInputValidation$default(lgl, null, 1, null);
        lgl.AwvSrB().OBJEWx();
        if (!lgl.zLjUOn) {
            if (lgl.AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
                lgl.AxsJAY().KWHzl(false);
                lgl.AxsJAY().copydefault(false);
            }
        } else {
            lgl.zLjUOn = false;
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SellFragmentV3$onViewCreated$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment, o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (AwvSrB().gasjUx()) {
            BaseBuySellViewModel.getQuotedPrice$default(AwvSrB(), AwvSrB().OcIXYQ(), AwvSrB().zuBGHE(), AxsJAY().djBIcL(), AxsJAY(), false, false, 48, null);
        }
        C52794wYp c52794wYp = ((AbstractC31527lvh) KWHzl()).values;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        EZpvd(c52794wYp);
        fvQaOB();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = taskDescription.copydefault;
            }
            if ((i & 4) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            if ((i & 8) != 0) {
                str3 = taskDescription.KWHzl;
            }
            return taskDescription.OLrzqt(str, z, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
            return new TaskDescription(str, z, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && this.copydefault == taskDescription.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) taskDescription.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
            java.lang.String str2 = this.OLrzqt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TopWidgetData(tokenSelectorTokenName=" + this.AEQbTJ + ", shouldShowBottomChevron=" + this.copydefault + ", availableBalance=" + this.OLrzqt + ", balanceLabel=" + this.KWHzl + ")";
        }

        public TaskDescription(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
            this.AEQbTJ = str;
            this.copydefault = z;
            this.OLrzqt = str2;
            this.KWHzl = str3;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = activity.OLrzqt;
            }
            return activity.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(java.lang.String str, java.lang.String str2) {
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TopWidgetIconData(tokenSelectorIconUrl=" + this.copydefault + ", tokenSelectorQuoteIconUrl=" + this.OLrzqt + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2) {
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.OLrzqt;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.KWHzl;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.EZpvd;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = actionBar.copydefault;
            }
            return actionBar.KWHzl(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            return new ActionBar(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.KWHzl;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.EZpvd;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "BottomWidgetData(paymentMethod=" + this.AEQbTJ + ", receivingIconUrl=" + this.OLrzqt + ", receivingBalance=" + this.KWHzl + ", preFlowText=" + this.EZpvd + ", receivingTokenEarnRate=" + this.copydefault + ")";
        }

        public ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
            this.copydefault = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) {
        java.lang.Object objCollect = FlowKt.combine(FlowKt.combine(AwvSrB().QHmsKR(), AwvSrB().QSBOWP(), AwvSrB().OqFWZa(), AwvSrB().DXXBbs(), SellFragmentV3$updateCryptoFiatWidget$4.INSTANCE), FlowKt.combine(AwvSrB().RKDWNf(), AwvSrB().QkdxfA(), SellFragmentV3$updateCryptoFiatWidget$7.INSTANCE), FlowKt.combine(AwvSrB().ffGIBT(), AwvSrB().getPostValueLengthLimit(), AwvSrB().zuWLRA(), AwvSrB().DarRvM(), AwvSrB().DCUTEI(), SellFragmentV3$updateCryptoFiatWidget$10.INSTANCE), new SellFragmentV3$updateCryptoFiatWidget$11(this, null)).collect(new FragmentManager(), continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object KWHzl(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, Continuation continuation) {
        return new TaskDescription(str, z, str2, str3);
    }

    public static final /* synthetic */ java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, Continuation continuation) {
        return new Activity(str, str2);
    }

    public static final /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, Continuation continuation) {
        return new ActionBar(str, str2, str3, str4, str5);
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C31437ltx c31437ltx, Continuation<? super Unit> continuation) {
            lGL.AEQbTJ(lGL.this).AkhnZx.KWHzl(c31437ltx);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(final java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> list, final Function2<? super java.lang.Double, ? super java.lang.String, Unit> function2) {
        java.util.List listGEmmrt = yDY.gEmmrt(((AbstractC31527lvh) KWHzl()).copydefault, ((AbstractC31527lvh) KWHzl()).KWHzl, ((AbstractC31527lvh) KWHzl()).OLrzqt, ((AbstractC31527lvh) KWHzl()).AEQbTJ);
        if (list.size() == 1) {
            java.util.Iterator it = listGEmmrt.iterator();
            while (it.hasNext()) {
                ((C54984xbQ) it.next()).setVisibility(8);
            }
            C52794wYp c52794wYp = ((AbstractC31527lvh) KWHzl()).fARcdN;
            c52794wYp.setVisibility(0);
            c52794wYp.setText(getString(C31351lsQ.Activity.zpGcln));
            c52794wYp.setEnabled(true);
            c52794wYp.setClickable(true);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lHA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lGL.KWHzl(function2, list, view);
                }
            });
            AwvSrB().valueOf(true);
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
                c54984xbQ.setOnClickListener(new View.OnClickListener() { // from class: o.lHE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lGL.AEQbTJ(function2, dDoubleValue, str, view);
                    }
                });
            }
            i++;
        }
        java.util.Iterator it2 = CollectionsKt___CollectionsKt.djBIcL((java.lang.Iterable) listGEmmrt, list.size()).iterator();
        while (it2.hasNext()) {
            ((C54984xbQ) it2.next()).setVisibility(8);
        }
        C52794wYp c52794wYp2 = ((AbstractC31527lvh) KWHzl()).fARcdN;
        c52794wYp2.setOnClickListener(null);
        c52794wYp2.setVisibility(8);
        AwvSrB().valueOf(false);
    }

    public static final void KWHzl(Function2 function2, java.util.List list, android.view.View view) {
        function2.invoke(((kotlin.Pair) list.get(0)).getFirst(), ((kotlin.Pair) list.get(0)).getSecond());
    }

    public static final void AEQbTJ(Function2 function2, double d, java.lang.String str, android.view.View view) {
        function2.invoke(java.lang.Double.valueOf(d), str);
    }

    public final boolean QKVWgx() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).getFieldNames() || ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DTwDnp() {
        lHQ lhqAxsJAY = AxsJAY();
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AwvSrB().AwvSrB();
        java.lang.String depositPlatformCode = channelAwvSrB != null ? channelAwvSrB.getDepositPlatformCode() : null;
        if (depositPlatformCode == null) {
            depositPlatformCode = "";
        }
        boolean zEZpvd = lhqAxsJAY.EZpvd(depositPlatformCode);
        FiatCryptoRange fiatCryptoRangeCopydefault = lhqAxsJAY.copydefault();
        java.lang.String max = fiatCryptoRangeCopydefault != null ? fiatCryptoRangeCopydefault.getMax() : null;
        if (!java.lang.Boolean.valueOf(!zEZpvd || QOLQEE()).booleanValue()) {
            max = null;
        }
        if (max == null) {
            max = AwvSrB().fJNWhG();
        }
        lhqAxsJAY.OLrzqt(max);
        AwvSrB().EZpvd(1.0d);
        AwvSrB().AYXKKw("sellall_button");
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setNumberInputText(getAmountToSell$default(this, AudioStats.AUDIO_AMPLITUDE_NONE, 1, null));
    }

    public final void OcIXYQ() {
        CurrencyToken currencyTokenCopydefault;
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
        final int iAhwBna = C33129mqd.AhwBna((actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrencyId());
        if (fIwbmz()) {
            if (DbNXlk()) {
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C30018lIw.AEQbTJ(contextRequireContext, (Function0<Unit>) new Function0() { // from class: o.lHD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return lGL.OLrzqt(iAhwBna, this);
                    }
                });
                EZpvd(true);
                return;
            }
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(new TransferDetail.Target(6), new TransferDetail.Target(18), java.lang.Integer.valueOf(iAhwBna), null, false, false, null, 120, null));
            return;
        }
        InterfaceC31670lzr interfaceC31670lzr2 = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        interfaceC31670lzr2.copydefault(fragmentActivityRequireActivity2, new TransferDetail(null, new TransferDetail.Target(6), java.lang.Integer.valueOf(iAhwBna), null, false, false, null, 121, null));
    }

    public static final Unit OLrzqt(int i, lGL lgl) {
        C29846lCm.Companion.AEQbTJ(i).showNow(lgl.getChildFragmentManager(), "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setupChipsContainer$default(lGL lgl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lgl.EZpvd(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        final C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
        if (isConnected().fJNWhG() == null && z) {
            if (QKVWgx()) {
                OLrzqt(yDY.gEmmrt(new kotlin.Pair(java.lang.Double.valueOf(1001.0d), getString(C31351lsQ.Activity.QVsKAR)), new kotlin.Pair(java.lang.Double.valueOf(1002.0d), getString(C31351lsQ.Activity.onComplete))), new Function2() { // from class: o.lHi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return lGL.copydefault(this.EZpvd, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
                    }
                });
                return;
            }
            OLrzqt(C56402yEa.EZpvd(new kotlin.Pair(java.lang.Double.valueOf(1001.0d), getString(C31351lsQ.Activity.QVsKAR))), new Function2() { // from class: o.lHl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return lGL.KWHzl(this.EZpvd, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
                }
            });
            return;
        }
        java.util.List<kotlin.Pair<java.lang.Double, java.lang.String>> listODWQjV = AwvSrB().ODWQjV();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listODWQjV, 10));
        for (kotlin.Pair<java.lang.Double, java.lang.String> pair : listODWQjV) {
            arrayList.add(InputUtils.AEQbTJ.EZpvd(pair, C33069mpW.copydefault(this, C31351lsQ.Activity.OxVOHk, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", pair.getSecond())))));
        }
        OLrzqt(arrayList, new Function2() { // from class: o.lHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return lGL.AEQbTJ(this.copydefault, c30019lIx, ((java.lang.Double) obj).doubleValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit copydefault(lGL lgl, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        lgl.AxsJAY().copydefault(true);
        if (d == 1001.0d) {
            lgl.DTwDnp();
        } else if (d == 1002.0d) {
            lgl.AwvSrB().AYXKKw("transfer_button");
            lgl.OcIXYQ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lGL lgl, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        lgl.AxsJAY().copydefault(true);
        lgl.DTwDnp();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lGL lgl, C30019lIx c30019lIx, double d, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = lgl.OLrzqt(d);
        lgl.AwvSrB().EZpvd(d);
        lgl.AxsJAY().OLrzqt(C33129mqd.mulS$default(lgl.AwvSrB().fJNWhG(), java.lang.Double.valueOf(d), null, null, null, 14, null));
        lgl.AxsJAY().copydefault(true);
        c30019lIx.setNumberInputText(strOLrzqt);
        if (lgl.copydefault(d)) {
            lTZ ltz = lTZ.KWHzl;
            android.content.Context contextRequireContext = lgl.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ltz.OLrzqt(contextRequireContext, C31351lsQ.Activity.iUnTnt, C31351lsQ.Activity.QFTsTN, 4, true, 5000L);
        }
        lgl.AwvSrB().AhwBna(SellViewModel.ChipAmount.Companion.OLrzqt(d));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void finit() {
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setNumberInputText(AxsJAY().djBIcL());
    }

    private final void RcXXUw() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<BaseBuySellViewModel.TaskDescription>> liveDataAubY = AwvSrB().AubY();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAubY, viewLifecycleOwner, new Function1() { // from class: o.lGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.EZpvd(this.EZpvd, (BaseBuySellViewModel.TaskDescription) obj);
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
    public static final Unit EZpvd(lGL lgl, BaseBuySellViewModel.TaskDescription taskDescription) {
        java.lang.String price;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (taskDescription instanceof BaseBuySellViewModel.TaskDescription.ActionBar) {
            BaseBuySellViewModel.TaskDescription.ActionBar actionBar = (BaseBuySellViewModel.TaskDescription.ActionBar) taskDescription;
            pUU.KWHzl("SellFragmentV3", "quotedPriceState error: " + actionBar.KWHzl());
            if (actionBar.OLrzqt() == BaseBuySellViewModel.QuoteType.DEX) {
                lgl.AxsJAY().OLrzqt(true);
                lgl.AxsJAY().gEmmrt("0");
                lgl.copydefault(lgl.AwvSrB().zuBGHE());
                lgl.AEQbTJ(java.lang.Boolean.TRUE);
            }
        } else {
            if (!(taskDescription instanceof BaseBuySellViewModel.TaskDescription.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            BaseBuySellViewModel.TaskDescription.Application application = (BaseBuySellViewModel.TaskDescription.Application) taskDescription;
            if (application.copydefault() == BaseBuySellViewModel.QuoteType.DEX) {
                lHQ lhqAxsJAY = lgl.AxsJAY();
                lhqAxsJAY.OLrzqt(false);
                lhqAxsJAY.AEQbTJ(C33129mqd.AhwBna(lgl.AwvSrB().DTwDnp()));
                DexQuoteBean dexQuoteBeanAEQbTJ = application.AEQbTJ();
                java.lang.String toAmount = dexQuoteBeanAEQbTJ != null ? dexQuoteBeanAEQbTJ.getToAmount() : null;
                if (toAmount == null) {
                    toAmount = "";
                }
                lhqAxsJAY.gEmmrt(toAmount);
                lhqAxsJAY.AEQbTJ(true);
                lgl.AEQbTJ(java.lang.Boolean.TRUE);
                lgl.copydefault(lgl.AwvSrB().zuBGHE());
                lgl.AwvSrB().gGvvIC().setValue(java.lang.Boolean.FALSE);
                C52794wYp c52794wYp = ((AbstractC31527lvh) lgl.KWHzl()).values;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                lgl.EZpvd(c52794wYp);
            } else {
                lgl.AxsJAY().AEQbTJ(false);
            }
            lHQ lhqAxsJAY2 = lgl.AxsJAY();
            int i = Application.copydefault[application.copydefault().ordinal()];
            if (i == 1) {
                B2CQuotePriceBean b2CQuotePriceBeanOLrzqt = application.OLrzqt();
                price = b2CQuotePriceBeanOLrzqt != null ? b2CQuotePriceBeanOLrzqt.getPrice() : null;
                if (price != null) {
                }
                lhqAxsJAY2.KWHzl(str, lgl.AwvSrB().fJNWhG(), lgl.AwvSrB().AwvSrB());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                DexQuoteBean dexQuoteBeanAEQbTJ2 = application.AEQbTJ();
                price = dexQuoteBeanAEQbTJ2 != null ? dexQuoteBeanAEQbTJ2.getPrice() : null;
                if (price != null) {
                    str = price;
                }
                lhqAxsJAY2.KWHzl(str, lgl.AwvSrB().fJNWhG(), lgl.AwvSrB().AwvSrB());
            }
        }
        return Unit.INSTANCE;
    }

    private final void dNCPSb() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataQfsBiF = AwvSrB().QfsBiF();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataQfsBiF, viewLifecycleOwner, new Function1() { // from class: o.lGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.AhwBna(this.KWHzl, (Unit) obj);
            }
        });
        LiveData<C32989mnw<InputBaseViewModel.InputValidationResult>> liveDataAuCTel = AxsJAY().AuCTel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner2, new Function1() { // from class: o.lHe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.OLrzqt(this.copydefault, (InputBaseViewModel.InputValidationResult) obj);
            }
        });
        LiveData<C32989mnw<com.okinc.buysell.ui.bsc.util.InputType>> liveDataFARcdN = AxsJAY().fARcdN();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFARcdN, viewLifecycleOwner3, new Function1() { // from class: o.lHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.KWHzl(this.EZpvd, (com.okinc.buysell.ui.bsc.util.InputType) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(final lGL lgl, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C52794wYp c52794wYp = ((AbstractC31527lvh) lgl.KWHzl()).values;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        lgl.EZpvd(c52794wYp);
        BaseBuySellViewModel.Companion.ActionBar actionBarFIwbmz = lgl.AwvSrB().fIwbmz();
        BaseBuySellViewModel.Companion.DexTradeStatus dexTradeStatusCopydefault = actionBarFIwbmz.copydefault();
        int[] iArr = Application.AEQbTJ;
        switch (iArr[dexTradeStatusCopydefault.ordinal()]) {
            case 9:
            case 10:
            case 11:
                lgl.AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.TRUE);
                ((AbstractC31527lvh) lgl.KWHzl()).djBIcL.getRoot().setVisibility(8);
                AbstractC31527lvh abstractC31527lvh = (AbstractC31527lvh) lgl.KWHzl();
                abstractC31527lvh.fJNWhG.setIsErrorInput(false);
                abstractC31527lvh.values.setVisibility(8);
                abstractC31527lvh.valueOf.setVisibility(8);
                abstractC31527lvh.fARcdN.setVisibility(8);
                abstractC31527lvh.valueOf.setEnabled(false);
                InputAmountSharedDataSource.copydefault.AEQbTJ(lgl.KWHzl(lgl.AxsJAY().OLrzqt(), lgl.AxsJAY().uzCIH()));
                break;
            default:
                C31597lwz c31597lwz = ((AbstractC31527lvh) lgl.KWHzl()).djBIcL;
                lgl.AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(actionBarFIwbmz.EZpvd());
                if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBarFIwbmz.copydefault().getCta())) {
                    c31597lwz.copydefault.setText(actionBarFIwbmz.copydefault().getCta());
                    switch (iArr[actionBarFIwbmz.copydefault().ordinal()]) {
                        case 1:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHr
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.fARcdN(this.KWHzl, view);
                                }
                            });
                            break;
                        case 2:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHs
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.fJNWhG(this.KWHzl, view);
                                }
                            });
                            break;
                        case 3:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHt
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.ejfBZ(this.EZpvd, view);
                                }
                            });
                            break;
                        case 4:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHq
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.AuCTel(this.KWHzl, view);
                                }
                            });
                            break;
                        case 5:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHp
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.hDKMBd(this.KWHzl, view);
                                }
                            });
                            break;
                        case 6:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.getFieldNames(this.copydefault, view);
                                }
                            });
                            break;
                        case 7:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHx
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.iwGUEr(this.AEQbTJ, view);
                                }
                            });
                            break;
                        case 8:
                            c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHv
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    lGL.uzCIH(this.KWHzl, view);
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
                AbstractC31527lvh abstractC31527lvh2 = (AbstractC31527lvh) lgl.KWHzl();
                abstractC31527lvh2.fJNWhG.setIsErrorInput(false);
                abstractC31527lvh2.values.setVisibility(8);
                abstractC31527lvh2.valueOf.setVisibility(8);
                abstractC31527lvh2.valueOf.setEnabled(false);
                break;
        }
        return Unit.INSTANCE;
    }

    public static final void fARcdN(lGL lgl, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = lgl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(lgl, childFragmentManager, new Function1() { // from class: o.lHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.AEQbTJ((BuySellDexEscapeResult) obj);
            }
        });
    }

    public static final Unit AEQbTJ(BuySellDexEscapeResult buySellDexEscapeResult) {
        Intrinsics.checkNotNullParameter(buySellDexEscapeResult, "");
        pUU.KWHzl("BuyFragmentV3", "escapeResult: " + buySellDexEscapeResult);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(lGL lgl, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        android.content.Context contextRequireContext = lgl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31670lzr.KWHzl(contextRequireContext);
    }

    public static final void ejfBZ(lGL lgl, android.view.View view) {
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        android.content.Context contextRequireContext = lgl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC31670lzr.KWHzl(contextRequireContext);
    }

    public static final void AuCTel(lGL lgl, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = lgl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.copydefault(childFragmentManager, lgl, lgl.AwvSrB().ORxRYg().getChainIndex(), new Function1() { // from class: o.lHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.EZpvd((BuySellDexEmailSetResult) obj);
            }
        });
    }

    public static final Unit EZpvd(BuySellDexEmailSetResult buySellDexEmailSetResult) {
        Intrinsics.checkNotNullParameter(buySellDexEmailSetResult, "");
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(lGL lgl, android.view.View view) {
        lgl.wlaJM.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
    }

    public static final void getFieldNames(lGL lgl, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = lgl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(lgl, childFragmentManager, lgl.AwvSrB().ORxRYg().getChainIndex(), InterfaceC31396ltI.Application.EZpvd, new Function1() { // from class: o.lHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.AEQbTJ((BuySellDexUpdateInfoResult) obj);
            }
        });
    }

    public static final Unit AEQbTJ(BuySellDexUpdateInfoResult buySellDexUpdateInfoResult) {
        Intrinsics.checkNotNullParameter(buySellDexUpdateInfoResult, "");
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(lGL lgl, android.view.View view) {
        InterfaceC31668lzp interfaceC31668lzp = (InterfaceC31668lzp) C43251rlk.copydefault(InterfaceC31668lzp.class);
        androidx.fragment.app.FragmentManager childFragmentManager = lgl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC31668lzp.OLrzqt(lgl, childFragmentManager, lgl.AwvSrB().ORxRYg().getChainIndex(), InterfaceC31396ltI.ActionBar.AEQbTJ, new Function1() { // from class: o.lHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lGL.OLrzqt((BuySellDexUpdateInfoResult) obj);
            }
        });
    }

    public static final Unit OLrzqt(BuySellDexUpdateInfoResult buySellDexUpdateInfoResult) {
        Intrinsics.checkNotNullParameter(buySellDexUpdateInfoResult, "");
        return Unit.INSTANCE;
    }

    public static final void uzCIH(lGL lgl, android.view.View view) {
        lgl.wlaJM.launch(new EmailRecoveryInput(ProjectSource.CeDeFi));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(lGL lgl, InputBaseViewModel.InputValidationResult inputValidationResult) {
        Intrinsics.checkNotNullParameter(inputValidationResult, "");
        C52794wYp c52794wYp = ((AbstractC31527lvh) lgl.KWHzl()).values;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        lgl.EZpvd(c52794wYp);
        C30019lIx c30019lIx = ((AbstractC31527lvh) lgl.KWHzl()).fJNWhG;
        lgl.copydefault(lgl.AwvSrB().zsXlph());
        lgl.copydefault(inputValidationResult);
        setupChipsContainer$default(lgl, false, 1, null);
        if (lgl.AxsJAY().copydefault() == null) {
            c30019lIx.setToggleContainerVisibility(0);
            setupChipsContainer$default(lgl, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lGL lgl, com.okinc.buysell.ui.bsc.util.InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        C30019lIx c30019lIx = ((AbstractC31527lvh) lgl.KWHzl()).fJNWhG;
        c30019lIx.setMaxDecimalValue(lgl.AxsJAY().OLrzqt(inputType));
        lgl.copydefault(lgl.AwvSrB().zsXlph());
        int i = Application.OLrzqt[inputType.ordinal()];
        if (i == 1) {
            java.lang.String upperCase = lgl.AwvSrB().OcIXYQ().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            c30019lIx.setTokenCurrency(lgl.KWHzl(upperCase));
            c30019lIx.setToggleFiatCurrencyDropDownVisibility(8);
            java.lang.Boolean bool = (java.lang.Boolean) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().finit());
            if (bool != null) {
                c30019lIx.setFiatCurrencyDropDownVisibility(bool.booleanValue() ? 0 : 8);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            java.lang.String upperCase2 = lgl.AwvSrB().zuBGHE().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            c30019lIx.setTokenCurrency(upperCase2);
            c30019lIx.setFiatCurrencyDropDownVisibility(8);
            java.lang.Boolean bool2 = (java.lang.Boolean) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().finit());
            if (bool2 != null) {
                c30019lIx.setToggleFiatCurrencyDropDownVisibility(bool2.booleanValue() ? 0 : 8);
            }
        }
        lgl.AwvSrB().OLrzqt(BaseBuySellViewModel.Mode.SELL.getType(), lgl.QfsBiF().AkhnZx() == BSCTabIndex.SELL);
        lgl.finit();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v49, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v54, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v59, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v67, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(InputBaseViewModel.InputValidationResult inputValidationResult) {
        BuySellCurrency buySellCurrencyAEQbTJ;
        BuySellCurrency buySellCurrencyAEQbTJ2;
        SupportCurrencyInfo supportCurrencyInfo;
        ((AbstractC31527lvh) KWHzl()).djBIcL.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lGN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lGL.gEmmrt(view);
            }
        });
        copydefault(AwvSrB().zsXlph());
        int scale = 0;
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setToggleContainerVisibility(0);
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AwvSrB().AwvSrB();
        boolean z = (channelAwvSrB != null ? channelAwvSrB.getPaymentMethodCategory() : null) == PaymentMethodCategory.STABLECOIN;
        boolean zCopydefault = AwvSrB().copydefault(AwvSrB().AwvSrB());
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = AwvSrB().AwvSrB();
        java.lang.String peggedCurrency = (channelAwvSrB2 == null || (supportCurrencyInfo = channelAwvSrB2.getSupportCurrencyInfo()) == null) ? null : supportCurrencyInfo.getPeggedCurrency();
        if (peggedCurrency == null) {
            peggedCurrency = "";
        }
        java.lang.String str = peggedCurrency;
        C31597lwz c31597lwz = ((AbstractC31527lvh) KWHzl()).djBIcL;
        switch (Application.KWHzl[inputValidationResult.ordinal()]) {
            case 1:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.dLBcXg, C56423yEv.EZpvd(C56390yDp.OLrzqt("totalDailyLimit", AxsJAY().EZpvd((BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE()))))));
                c31597lwz.AEQbTJ.setVisibility(8);
                c31597lwz.getRoot().setOnClickListener(null);
                AbstractC31527lvh abstractC31527lvh = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh.values.setVisibility(8);
                abstractC31527lvh.valueOf.setVisibility(8);
                abstractC31527lvh.valueOf.setEnabled(false);
                break;
            case 2:
            case 3:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                if (AwvSrB().hUfVAv()) {
                    android.widget.TextView textView = c31597lwz.EZpvd;
                    int i = C31351lsQ.Activity.RVsVBY;
                    lHQ lhqAxsJAY = AxsJAY();
                    BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB3 = AwvSrB().AwvSrB();
                    textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY.EZpvd(actionBar, channelAwvSrB3 != null ? C31662lzj.AhwBna(channelAwvSrB3) : false, z, zCopydefault, str)))));
                    c31597lwz.AEQbTJ.setVisibility(8);
                } else {
                    android.widget.TextView textView2 = c31597lwz.EZpvd;
                    int i2 = C31351lsQ.Activity.Hx;
                    lHQ lhqAxsJAY2 = AxsJAY();
                    BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB4 = AwvSrB().AwvSrB();
                    textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY2.EZpvd(actionBar2, channelAwvSrB4 != null ? C31662lzj.AhwBna(channelAwvSrB4) : false, z, zCopydefault, str)))));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lGQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lGL.zsXlph(this.OLrzqt, view);
                        }
                    });
                    c31597lwz.AEQbTJ.setVisibility(0);
                }
                AbstractC31527lvh abstractC31527lvh2 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh2.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh2.values.setVisibility(8);
                abstractC31527lvh2.valueOf.setVisibility(8);
                abstractC31527lvh2.valueOf.setEnabled(false);
                break;
            case 4:
            case 5:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                if (AwvSrB().hUfVAv()) {
                    android.widget.TextView textView3 = c31597lwz.EZpvd;
                    int i3 = C31351lsQ.Activity.RVsVBY;
                    lHQ lhqAxsJAY3 = AxsJAY();
                    BaseBuySellViewModel.ActionBar actionBar3 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB5 = AwvSrB().AwvSrB();
                    textView3.setText(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY3.EZpvd(actionBar3, channelAwvSrB5 != null ? C31662lzj.AhwBna(channelAwvSrB5) : false, z, zCopydefault, str)))));
                    c31597lwz.AEQbTJ.setVisibility(8);
                } else {
                    android.widget.TextView textView4 = c31597lwz.EZpvd;
                    int i4 = C31351lsQ.Activity.Hx;
                    lHQ lhqAxsJAY4 = AxsJAY();
                    BaseBuySellViewModel.ActionBar actionBar4 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB6 = AwvSrB().AwvSrB();
                    textView4.setText(C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY4.EZpvd(actionBar4, channelAwvSrB6 != null ? C31662lzj.AhwBna(channelAwvSrB6) : false, z, zCopydefault, str)))));
                    c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.getStatusCode));
                    c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            lGL.AuCTelauCTel(this.KWHzl, view);
                        }
                    });
                    c31597lwz.AEQbTJ.setVisibility(0);
                }
                AbstractC31527lvh abstractC31527lvh3 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh3.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh3.values.setVisibility(8);
                abstractC31527lvh3.valueOf.setVisibility(8);
                abstractC31527lvh3.valueOf.setEnabled(false);
                break;
            case 6:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView5 = c31597lwz.EZpvd;
                int i5 = C31351lsQ.Activity.DcMfJKfNLfdT;
                lHQ lhqAxsJAY5 = AxsJAY();
                BaseBuySellViewModel.ActionBar actionBar5 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB7 = AwvSrB().AwvSrB();
                textView5.setText(C33069mpW.copydefault(i5, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY5.EZpvd(actionBar5, channelAwvSrB7 != null ? C31662lzj.AhwBna(channelAwvSrB7) : false, z, zCopydefault, str)))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31527lvh abstractC31527lvh4 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh4.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh4.values.setVisibility(8);
                abstractC31527lvh4.valueOf.setVisibility(8);
                abstractC31527lvh4.valueOf.setEnabled(false);
                break;
            case 7:
            case 8:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                c31597lwz.EZpvd.setText(C33069mpW.copydefault(C31351lsQ.Activity.XW, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.appendCryptoSymbol$default(AwvSrB().fJNWhG(), AwvSrB().zuBGHE(), AxsJAY().EZpvd(), null, null, null, 28, null)))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKRKUgwx));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lGL.wlaJM(this.KWHzl, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31527lvh abstractC31527lvh5 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh5.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh5.values.setVisibility(8);
                abstractC31527lvh5.valueOf.setVisibility(8);
                abstractC31527lvh5.valueOf.setEnabled(false);
                break;
            case 9:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView6 = c31597lwz.EZpvd;
                int i6 = C31351lsQ.Activity.DcMfJKfNLfdT;
                lHQ lhqAxsJAY6 = AxsJAY();
                BaseBuySellViewModel.ActionBar actionBar6 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB8 = AwvSrB().AwvSrB();
                textView6.setText(C33069mpW.copydefault(i6, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY6.EZpvd(actionBar6, channelAwvSrB8 != null ? C31662lzj.AhwBna(channelAwvSrB8) : false, z, zCopydefault, str)))));
                c31597lwz.AEQbTJ.setVisibility(8);
                AbstractC31527lvh abstractC31527lvh6 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh6.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh6.values.setVisibility(8);
                abstractC31527lvh6.valueOf.setVisibility(8);
                abstractC31527lvh6.valueOf.setEnabled(false);
                break;
            case 10:
            case 11:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(0);
                android.widget.TextView textView7 = c31597lwz.EZpvd;
                int i7 = C31351lsQ.Activity.DcMfJKgMxgjU;
                lHQ lhqAxsJAY7 = AxsJAY();
                BaseBuySellViewModel.ActionBar actionBar7 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AwvSrB().QOLQEE());
                com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB9 = AwvSrB().AwvSrB();
                textView7.setText(C33069mpW.copydefault(i7, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, lhqAxsJAY7.KWHzl(actionBar7, channelAwvSrB9 != null ? C31662lzj.AhwBna(channelAwvSrB9) : false, z, zCopydefault, str)))));
                c31597lwz.copydefault.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fcfzuX));
                c31597lwz.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lGL.zLjUOn(this.AEQbTJ, view);
                    }
                });
                c31597lwz.AEQbTJ.setVisibility(0);
                AbstractC31527lvh abstractC31527lvh7 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh7.fJNWhG.setIsErrorInput(true);
                abstractC31527lvh7.values.setVisibility(8);
                abstractC31527lvh7.valueOf.setVisibility(8);
                abstractC31527lvh7.valueOf.setEnabled(false);
                break;
            case 12:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                AbstractC31527lvh abstractC31527lvh8 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh8.fJNWhG.setIsErrorInput(false);
                abstractC31527lvh8.values.setVisibility(8);
                abstractC31527lvh8.valueOf.setVisibility(8);
                abstractC31527lvh8.valueOf.setEnabled(false);
                C31597lwz c31597lwz2 = abstractC31527lvh8.djBIcL;
                c31597lwz2.getRoot().setVisibility(0);
                c31597lwz2.EZpvd.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.apNbdB));
                c31597lwz2.AEQbTJ.setVisibility(8);
                c31597lwz2.getRoot().setOnClickListener(null);
                break;
            case 13:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.FALSE);
                c31597lwz.getRoot().setVisibility(8);
                AbstractC31527lvh abstractC31527lvh9 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh9.fJNWhG.setIsErrorInput(false);
                abstractC31527lvh9.valueOf.setVisibility(0);
                abstractC31527lvh9.valueOf.setEnabled(true);
                abstractC31527lvh9.values.setVisibility(8);
                abstractC31527lvh9.fARcdN.setVisibility(8);
                java.lang.String strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) ejfBZ().OLrzqt());
                java.lang.String strUzCIH = ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar8 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
                if (actionBar8 != null && (buySellCurrencyAEQbTJ = actionBar8.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ.getScale();
                }
                InputAmountSharedDataSource.copydefault.AEQbTJ(KWHzl(strOLrzqt, C31661lzi.OLrzqt(strUzCIH, scale)));
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                AwvSrB().AxsJAYaxsJAY().setValue(java.lang.Boolean.TRUE);
                c31597lwz.getRoot().setVisibility(8);
                AbstractC31527lvh abstractC31527lvh10 = (AbstractC31527lvh) KWHzl();
                abstractC31527lvh10.fJNWhG.setIsErrorInput(false);
                abstractC31527lvh10.values.setVisibility(0);
                abstractC31527lvh10.valueOf.setVisibility(8);
                abstractC31527lvh10.fARcdN.setVisibility(8);
                abstractC31527lvh10.valueOf.setEnabled(false);
                java.lang.String strOLrzqt2 = C33129mqd.OLrzqt((java.lang.Object) ejfBZ().OLrzqt());
                java.lang.String strUzCIH2 = ejfBZ().uzCIH();
                BaseBuySellViewModel.ActionBar actionBar9 = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(AuCTel().QOLQEE());
                if (actionBar9 != null && (buySellCurrencyAEQbTJ2 = actionBar9.AEQbTJ()) != null) {
                    scale = buySellCurrencyAEQbTJ2.getScale();
                }
                InputAmountSharedDataSource.copydefault.AEQbTJ(KWHzl(strOLrzqt2, C31661lzi.OLrzqt(strUzCIH2, scale)));
                break;
        }
    }

    public static final void zsXlph(lGL lgl, android.view.View view) {
        CurrencyToken currencyTokenCopydefault;
        InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        FragmentActivity fragmentActivityRequireActivity = lgl.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().QOLQEE());
        InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, new DepositEntryPoint.SpecificCryptoPage(C33129mqd.AhwBna((actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrencyId())), null, null, null, null, 60, null);
    }

    public static final void AuCTelauCTel(lGL lgl, android.view.View view) {
        CurrencyToken currencyTokenCopydefault;
        InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class);
        FragmentActivity fragmentActivityRequireActivity = lgl.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mHA.OLrzqt.AEQbTJ(lgl.AwvSrB().QOLQEE());
        InterfaceC8224ayh.TaskDescription.goToDeposit$default(interfaceC8224ayh, fragmentActivityRequireActivity, new DepositEntryPoint.SpecificCryptoPage(C33129mqd.AhwBna((actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null) ? null : currencyTokenCopydefault.getCurrencyId())), null, null, null, null, 60, null);
    }

    public static final void wlaJM(lGL lgl, android.view.View view) {
        lgl.DTwDnp();
    }

    public static final void zLjUOn(lGL lgl, android.view.View view) {
        lgl.DTwDnp();
    }

    public static /* synthetic */ void updatePaymentSelectionWidget$default(lGL lgl, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            channel = null;
        }
        if ((i & 2) != 0) {
            paymentMethod = null;
        }
        lgl.EZpvd(channel, paymentMethod);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1 A[PHI: r3
  0x00b1: PHI (r3v5 java.lang.Integer) = (r3v4 java.lang.Integer), (r3v11 java.lang.Integer) binds: [B:27:0x00a4, B:32:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel2;
        PaymentMethod paymentMethod2;
        int iIntValue;
        EarnOption earnOption;
        SupportCurrencyInfo supportCurrencyInfo;
        java.lang.String earnRate = null;
        if (channel == null) {
            kotlin.Pair pair = (kotlin.Pair) mHA.OLrzqt.AEQbTJ(AwvSrB().sSMYrx());
            channel2 = pair != null ? (com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst() : null;
        } else {
            channel2 = channel;
        }
        if (paymentMethod == null) {
            kotlin.Pair pair2 = (kotlin.Pair) mHA.OLrzqt.AEQbTJ(AwvSrB().sSMYrx());
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
        boolean zCopydefault = AwvSrB().copydefault(channel2);
        java.lang.Integer numValueOf = (channel2 == null || (supportCurrencyInfo = channel2.getSupportCurrencyInfo()) == null) ? null : java.lang.Integer.valueOf(supportCurrencyInfo.getPeggedCurrencyScale());
        if (!zCopydefault) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            numValueOf = channel2 != null ? channel2.getSupportCurrencyScale() : null;
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = AxsJAY().AYXKKw();
            }
        }
        java.lang.String strAEQbTJ = c30326lUf.AEQbTJ(channel2, paymentMethod2, zCopydefault, iIntValue, AwvSrB().QKVWgx());
        if (channel2 != null && (earnOption = channel2.getEarnOption()) != null) {
            earnRate = earnOption.getEarnRate();
        }
        AwvSrB().AEQbTJ(strOLrzqt, strCopydefault, strAEQbTJ, earnRate);
    }

    public static /* synthetic */ java.lang.String getAmountToSell$default(lGL lgl, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = 1.0d;
        }
        return lgl.OLrzqt(d);
    }

    public final java.lang.String OLrzqt(double d) {
        java.lang.String max;
        lHQ lhqAxsJAY = AxsJAY();
        FiatCryptoRange fiatCryptoRangeAhwBna = lhqAxsJAY.AhwBna();
        if (fiatCryptoRangeAhwBna == null || (max = fiatCryptoRangeAhwBna.getMax()) == null || !copydefault(d)) {
            max = null;
        }
        return max == null ? AwvSrB().copydefault(lhqAxsJAY, d) : max;
    }

    public final boolean copydefault(double d) {
        java.lang.String max;
        double dAEQbTJ = C33129mqd.AEQbTJ(AwvSrB().fJNWhG());
        FiatCryptoRange fiatCryptoRangeCopydefault = AxsJAY().copydefault();
        return dAEQbTJ * d > ((fiatCryptoRangeCopydefault == null || (max = fiatCryptoRangeCopydefault.getMax()) == null) ? Double.MAX_VALUE : C33129mqd.AEQbTJ(max));
    }

    public final boolean QOLQEE() {
        java.lang.String strFJNWhG = AwvSrB().fJNWhG();
        FiatCryptoRange fiatCryptoRangeCopydefault = AxsJAY().copydefault();
        return C33129mqd.AEQbTJ(strFJNWhG, fiatCryptoRangeCopydefault != null ? fiatCryptoRangeCopydefault.getMax() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(BuySellCurrency buySellCurrency, CurrencyToken currencyToken) {
        int scale;
        SupportCurrencyInfo supportCurrencyInfo;
        boolean zCopydefault = AwvSrB().copydefault(AwvSrB().AwvSrB());
        lHQ lhqAxsJAY = AxsJAY();
        int scale2 = 2;
        if (zCopydefault) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AwvSrB().AwvSrB();
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
        lhqAxsJAY.OLrzqt(scale);
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
        lhqAxsJAY.AEQbTJ(scale2);
        OLrzqt(currencyToken.getAvailableBalance(), AwvSrB().zuBGHE());
        EZpvd(currencyToken);
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setMaxDecimalValue(AxsJAY().OLrzqt(AxsJAY().KWHzl()));
        copydefault(AwvSrB().zsXlph());
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        AwvSrB().fetchVPNInfo(C33069mpW.OLrzqt("{amount} {symbol}", C56424yEw.gEmmrt(C56390yDp.OLrzqt("symbol", str2), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, pTB.toLocalizationStringWithPrecision$default(str, 0, AxsJAY().gEmmrt(), RoundingMode.DOWN, null, 8, null)))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(java.lang.String str) {
        java.lang.String strOcIXYQ;
        SupportCurrencyInfo supportCurrencyInfo;
        if (AwvSrB().copydefault(AwvSrB().AwvSrB())) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB = AwvSrB().AwvSrB();
            if (channelAwvSrB == null || (supportCurrencyInfo = channelAwvSrB.getSupportCurrencyInfo()) == null || (strOcIXYQ = supportCurrencyInfo.getPeggedCurrency()) == null) {
                strOcIXYQ = AwvSrB().OcIXYQ();
            }
        } else {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelAwvSrB2 = AwvSrB().AwvSrB();
            if (channelAwvSrB2 == null || (strOcIXYQ = channelAwvSrB2.getSupportCurrency()) == null) {
                strOcIXYQ = AwvSrB().OcIXYQ();
            }
        }
        if (strOcIXYQ.length() == 0) {
            strOcIXYQ = this.getNewProxyInstance;
        }
        if (AuCTel().dNCPSb()) {
            ((AbstractC31527lvh) KWHzl()).fJNWhG.EZpvd(AxsJAY().EZpvd(str, strOcIXYQ));
            return;
        }
        if (AwvSrB().dxcTrN() && AxsJAY().valueOf() == com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT) {
            ((AbstractC31527lvh) KWHzl()).fJNWhG.EZpvd(AxsJAY().EZpvd(str, ""));
            ((AbstractC31527lvh) KWHzl()).fJNWhG.setToggleChipFiatCurrency(AwvSrB().OcIXYQ());
        } else {
            ((AbstractC31527lvh) KWHzl()).fJNWhG.EZpvd(AxsJAY().EZpvd(str, strOcIXYQ));
            ((AbstractC31527lvh) KWHzl()).fJNWhG.setToggleChipFiatCurrency("");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.buysell.ui.bsc.BaseBuySellFragment
    public void AuCTelauCTel() {
        if (AwvSrB().zLjUOn().length() == 0) {
            AxsJAY().copydefault("0", true);
            copydefault(AwvSrB().zuBGHE());
            ((AbstractC31527lvh) KWHzl()).fJNWhG.setNumberInputText("0");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ORxRYg() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AwvSrB().zLjUOn())) {
            this.zLjUOn = false;
            C30019lIx c30019lIx = ((AbstractC31527lvh) KWHzl()).fJNWhG;
            c30019lIx.setMaxDecimalValue(AxsJAY().EZpvd());
            c30019lIx.setNumberInputText(AwvSrB().zLjUOn());
            AwvSrB().AEQbTJ("");
            executeInputValidation$default(this, null, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fZBcTu() {
        boolean zHUfVAv = AwvSrB().hUfVAv();
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setToggleIconVisibility(!zHUfVAv);
        if (zHUfVAv) {
            QVAiDq();
            AxsJAY().copydefault(com.okinc.buysell.ui.bsc.util.InputType.CRYPTO_INPUT);
        } else {
            fFgQHt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fFgQHt() {
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setCurrencyToggleOnClickListener(new View.OnClickListener() { // from class: o.lHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lGL.getNewProxyInstance(this.copydefault, view);
            }
        });
    }

    public static final void getNewProxyInstance(lGL lgl, android.view.View view) {
        lgl.AxsJAY().KWHzl(true);
        lgl.AuCTelauCTel();
        lgl.AxsJAY().AubY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QVAiDq() {
        ((AbstractC31527lvh) KWHzl()).fJNWhG.setCurrencyToggleOnClickListener(new View.OnClickListener() { // from class: o.lHh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lGL.OLrzqt(view);
            }
        });
    }

    public static /* synthetic */ void executeInputValidation$default(lGL lgl, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        lgl.AEQbTJ(bool);
    }

    private final void AEQbTJ(java.lang.Boolean bool) {
        AxsJAY().OLrzqt(bool != null ? bool.booleanValue() : C33129mqd.OLrzqt((java.lang.CharSequence) AwvSrB().ORxRYg().getUniqueId()), AwvSrB().fIwbmz().copydefault(), QfsBiF().fJNWhG(), AwvSrB().fJNWhG(), AwvSrB().AwvSrB());
        fvQaOB();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lGL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final lGL EZpvd() {
            return new lGL();
        }
    }
}
