package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$launchPayPalFlow$1;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.AvailableBalanceParameter;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import com.okinc.buysell.ui.paymentmethod.data.SelectionType;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import com.okinc.okx.paymentapi.data.ResultType;
import com.okinc.okx.paymentapi.data.paas.ACHProperties;
import com.okinc.okx.paymentapi.data.paas.CardProperties;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountParams;
import com.okinc.okx.paymentapi.data.paas.PaymentAddAccountTarget;
import com.okinc.okx.paymentapi.data.paas.PaymentMethodProperties;
import com.okinc.okx.paymentapi.presentation.AddPaymentMethodResult;
import com.okinc.okx.paymentapi.presentation.PaymentAddAccountResult;
import com.okinc.okx.paymentapi.service.CreateAccountType;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.OKPaymentPlatformService;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C29817lBk;
import o.C31351lsQ;
import o.InterfaceC31430ltq;
import o.InterfaceC47251tmX;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lBI extends AbstractC29818lBl<AbstractC31526lvg> {
    public static final Application Companion = new Application(null);
    public static final int fetchVPNInfo = 8;
    public java.lang.String AkhnZx;
    public SelectPaymentMethodParameter AuCTel;
    public final C43316rmw ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public CreateAccountType fJNWhG;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final ActivityResultLauncher<android.content.Intent> isConnected;
    public final C43316rmw iwGUEr;
    public final InterfaceC56387yDm uzCIH;

    private final void getFieldNames() {
    }

    @Override // o.lzN
    public void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.fARcdN;
    }

    @Override // o.lzN
    public void EZpvd() {
    }

    public lBI() {
        super(C31351lsQ.ActionBar.QOLQEE);
        final Function0 function0 = new Function0() { // from class: o.lBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lBI.copydefault(this.copydefault);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$3
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$4
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
        this.fIwbmz = true;
        this.ejfBZ = new C43316rmw();
        this.AuCTel = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
        this.AkhnZx = "";
        this.fJNWhG = CreateAccountType.CREATE_NEW_ACCOUNT;
        this.iwGUEr = new C43316rmw();
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$6
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.SelectPaymentMethodFragmentV3$special$$inlined$viewModels$default$9
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lBI.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.isConnected = activityResultLauncherRegisterForActivityResult;
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return iwGUEr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PaymentMethodSelectionViewModel hDKMBd() {
        return (PaymentMethodSelectionViewModel) this.getNewProxyInstance.getValue();
    }

    public static final ViewModelStoreOwner copydefault(lBI lbi) {
        FragmentActivity fragmentActivityRequireActivity = lbi.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final lBI copydefault(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
            Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
            lBI lbi = new lBI();
            android.os.Bundle bundle = new android.os.Bundle();
            lMB.KWHzl(bundle, selectPaymentMethodParameter);
            lbi.setArguments(bundle);
            return lbi;
        }
    }

    private final SelectPaymentMethodViewModel iwGUEr() {
        return (SelectPaymentMethodViewModel) this.uzCIH.getValue();
    }

    public static final void EZpvd(lBI lbi, ActivityResult activityResult) {
        Intrinsics.copydefault(activityResult);
        lbi.OLrzqt(activityResult);
    }

    public final void OLrzqt(ActivityResult activityResult) {
        AddPaymentMethodResult addPaymentMethodResultAEQbTJ;
        hDKMBd().OLrzqt(activityResult);
        reloadIfNeeded$default(this, null, 1, null);
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            if (data == null || (addPaymentMethodResultAEQbTJ = C47242tmO.AEQbTJ(data)) == null) {
                return;
            }
            PaymentAddAccountResult accountResultType = addPaymentMethodResultAEQbTJ.getAccountResultType();
            if (accountResultType instanceof PaymentAddAccountResult.ThirdPartyFinalState) {
                if (Intrinsics.EZpvd((java.lang.Object) addPaymentMethodResultAEQbTJ.getChannel(), (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
                    copydefault((PaymentAddAccountResult.ThirdPartyFinalState) accountResultType);
                    return;
                }
                return;
            }
            if (addPaymentMethodResultAEQbTJ.isSuccess()) {
                if (addPaymentMethodResultAEQbTJ.isEditFlow()) {
                    hDKMBd().AEQbTJ(InterfaceC31430ltq.StateListAnimator.EZpvd);
                    return;
                }
                java.lang.String channel = addPaymentMethodResultAEQbTJ.getChannel();
                ChannelPlatformCode channelPlatformCode = ChannelPlatformCode.CARD;
                if (Intrinsics.EZpvd((java.lang.Object) channel, (java.lang.Object) channelPlatformCode.getCode())) {
                    com.okinc.okpaymentapi.data.remote.model.management.Account account = addPaymentMethodResultAEQbTJ.getAccount();
                    if (account != null && C31662lzj.copydefault(account)) {
                        hDKMBd().OLrzqt();
                        return;
                    }
                    hDKMBd().AEQbTJ(InterfaceC31430ltq.FragmentManager.EZpvd);
                    PaymentMethodSelectionViewModel paymentMethodSelectionViewModelHDKMBd = hDKMBd();
                    com.okinc.okpaymentapi.data.remote.model.management.Channel channelInfo = addPaymentMethodResultAEQbTJ.getChannelInfo();
                    if (channelInfo == null) {
                        channelInfo = new com.okinc.okpaymentapi.data.remote.model.management.Channel((TradingAgentInfo) null, (java.lang.String) null, false, (java.lang.String) null, ChannelCategoryCode.NATIVE, false, (java.lang.String) null, addPaymentMethodResultAEQbTJ.getPaymentMethod(), channelPlatformCode.getCode(), 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (B2CExtCollectInfo) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, false, (PaymentMethodCategory) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (TermContentChannel) null, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (java.lang.String) null, (java.lang.String) null, (TradeLimit) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, false, (java.lang.String) null, false, (SupportCurrencyInfo) null, (java.lang.Integer) null, (EarnOption) null, (java.util.List) null, (java.lang.String) null, false, false, -401, -1, 16383, (DefaultConstructorMarker) null);
                    }
                    paymentMethodSelectionViewModelHDKMBd.AEQbTJ(new SelectPaymentMethodResult(channelInfo, new PaymentMethod((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, addPaymentMethodResultAEQbTJ.getAccount(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, (java.lang.String) null, false, (SellerReceiptAccount) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, 536854527, (DefaultConstructorMarker) null), true, SelectionType.NEW_ADDED, this.AuCTel.getTradeType(), 0, null, 96, null));
                    hDKMBd().OLrzqt();
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) channel, (java.lang.Object) ChannelPlatformCode.BRAZIL.getCode()) || Intrinsics.EZpvd((java.lang.Object) channel, (java.lang.Object) ChannelPlatformCode.TURKEY_WITHDRAW_BANKS.getCode()) || Intrinsics.EZpvd((java.lang.Object) channel, (java.lang.Object) ChannelPlatformCode.US_WIRE.getCode())) {
                    hDKMBd().AEQbTJ(InterfaceC31430ltq.TaskDescription.EZpvd);
                    return;
                }
                return;
            }
            return;
        }
        hDKMBd().OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        hDKMBd().OLrzqt(new ActivityResult(i2, intent));
        reloadIfNeeded$default(this, null, 1, null);
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SelectPaymentMethodViewModel.trackPageView$default(iwGUEr(), "next", null, null, 6, null);
        this.fIwbmz = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lBI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reloadIfNeeded$default(lBI lbi, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        lbi.OLrzqt((java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>) list);
    }

    public final void OLrzqt(java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        iwGUEr().KWHzl(list);
    }

    public final void getNewProxyInstance() {
        SelectPaymentMethodViewModel.getBuySellPaymentChannelsV3$default(iwGUEr(), null, 1, null);
    }

    public final void fIwbmz() {
        this.ejfBZ.notifyDataSetChanged();
    }

    @Override // o.lzN
    public void djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            SelectPaymentMethodParameter selectPaymentMethodParameterKWHzl = lMB.KWHzl(arguments);
            if (selectPaymentMethodParameterKWHzl == null) {
                selectPaymentMethodParameterKWHzl = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
            }
            this.AuCTel = selectPaymentMethodParameterKWHzl;
            iwGUEr().KWHzl(C31429ltp.EZpvd(this.AuCTel.getTradeType()));
            if (this.AuCTel.getTradeType() == TradeType.BUY || this.AuCTel.getTradeType() == TradeType.SELL) {
                iwGUEr().copydefault(BannerPageNames.BUY_SELL_CHANNEL_SELECTION.getPageName());
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        AubY();
        uzCIH();
    }

    public final void EZpvd(InterfaceC30133lNc interfaceC30133lNc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iwGUEr().ejfBZ().iterator();
        while (it.hasNext()) {
            ((InterfaceC30133lNc) it.next()).KWHzl(false);
        }
        interfaceC30133lNc.KWHzl(true);
        hDKMBd().copydefault(interfaceC30133lNc.fARcdN());
        arrayList.addAll(iwGUEr().ejfBZ());
        this.ejfBZ.setItems(arrayList);
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AubY() {
        zsXlph();
        ((AbstractC31526lvg) KWHzl()).AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lBI.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(lBI lbi, android.view.View view) {
        lbi.hDKMBd().OLrzqt(lbi.iwGUEr().AkhnZx(), lbi);
    }

    private final void uzCIH() {
        hDKMBd().KWHzl(this.AuCTel);
        hDKMBd().KWHzl(this.isConnected);
        iwGUEr().EZpvd(this.AuCTel.isRecurring());
        iwGUEr().copydefault(true, this.AuCTel);
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<com.okinc.okpaymentapi.data.remote.model.management.Channel>> liveDataAkhnZx = hDKMBd().AkhnZx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAkhnZx, viewLifecycleOwner, new Function1() { // from class: o.lBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.OLrzqt(this.KWHzl, (com.okinc.okpaymentapi.data.remote.model.management.Channel) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFetchVPNInfo = hDKMBd().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner2, new Function1() { // from class: o.lBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AhwBna(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataValues = iwGUEr().values();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner3, new Function1() { // from class: o.lBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AYXKKw(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.util.List<SelectionRow>>> liveDataHDKMBd = iwGUEr().hDKMBd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataHDKMBd, viewLifecycleOwner4, new Function1() { // from class: o.lCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.copydefault(this.KWHzl, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>>> liveDataFIwbmz = iwGUEr().fIwbmz();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataFIwbmz, viewLifecycleOwner5, new Function1() { // from class: o.lCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFetchVPNInfo2 = iwGUEr().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataFetchVPNInfo2, viewLifecycleOwner6, new Function1() { // from class: o.lCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AEQbTJ(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> newProxyInstance = iwGUEr().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(newProxyInstance, viewLifecycleOwner7, new Function1() { // from class: o.lCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.djBIcL(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(lBI lbi, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        lbi.EZpvd(channel);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(lBI lbi, boolean z) {
        if (z) {
            lbi.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(lBI lbi, boolean z) {
        ((AbstractC31526lvg) lbi.KWHzl()).AEQbTJ.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lBI lbi, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        lbi.KWHzl((java.util.List<? extends SelectionRow>) list);
        android.view.View root = ((AbstractC31526lvg) lbi.KWHzl()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.postDelayed(lbi.new Activity(), 250L);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(lBI lbi, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31526lvg) lbi.KWHzl()).getRoot().setVisibility(0);
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = lbi.hDKMBd().fARcdN();
        if (channelFARcdN == null) {
            channelFARcdN = lbi.AuCTel.getUserSelectedChannel();
        }
        PaymentMethod paymentMethodAuCTel = lbi.hDKMBd().AuCTel();
        if (paymentMethodAuCTel == null) {
            paymentMethodAuCTel = lbi.AuCTel.getUserSelectedPaymentMethod();
        }
        lbi.KWHzl(channelFARcdN, paymentMethodAuCTel, (java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>) list);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lBI lbi, boolean z) {
        if (z) {
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            android.content.Context contextRequireContext = lbi.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            interfaceC47251tmX.copydefault(contextRequireContext);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(lBI lbi, boolean z) {
        if (z) {
            ((AbstractC31526lvg) lbi.KWHzl()).OLrzqt.setVisibility(4);
            ((AbstractC31526lvg) lbi.KWHzl()).KWHzl.setVisibility(0);
        } else {
            ((AbstractC31526lvg) lbi.KWHzl()).OLrzqt.setVisibility(0);
            ((AbstractC31526lvg) lbi.KWHzl()).KWHzl.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void handleUserSelectPayment$default(lBI lbi, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, boolean z3, int i, java.lang.Object obj) {
        lbi.OLrzqt(str, (i & 2) != 0 ? null : str2, str3, z, (i & 16) != 0 ? false : z2, str4, (i & 64) != 0 ? false : z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, boolean z3) {
        PaymentMethod paymentMethod;
        java.util.List<PaymentMethod> paymentMethods;
        java.util.List<PaymentMethod> paymentMethods2;
        java.lang.Object next;
        java.lang.String str5;
        java.lang.String paymentAccountId;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelAEQbTJ = iwGUEr().AEQbTJ(str, str3, z, z2);
        PaymentMethod paymentMethod2 = null;
        if (channelAEQbTJ == null || (paymentMethods2 = channelAEQbTJ.getPaymentMethods()) == null) {
            if (channelAEQbTJ != null && (paymentMethods = channelAEQbTJ.getPaymentMethods()) != null) {
                paymentMethod2 = (PaymentMethod) CollectionsKt___CollectionsKt.firstOrNull(paymentMethods);
            }
            paymentMethod = paymentMethod2 == null ? new PaymentMethod((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Account) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, (java.lang.String) null, false, (SellerReceiptAccount) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, 536870911, (DefaultConstructorMarker) null) : paymentMethod2;
        } else {
            java.util.Iterator<T> it = paymentMethods2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) next).getAccount();
                if (account != null) {
                    paymentAccountId = account.getPaymentAccountId();
                    str5 = str2;
                } else {
                    str5 = str2;
                    paymentAccountId = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) paymentAccountId, (java.lang.Object) str5)) {
                    break;
                }
            }
            paymentMethod = (PaymentMethod) next;
            if (paymentMethod == null) {
            }
        }
        if (channelAEQbTJ != null) {
            if (Intrinsics.EZpvd((java.lang.Object) channelAEQbTJ.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode()) && channelAEQbTJ.getGooglePaySupportedButNotSetup()) {
                lAZ lazOLrzqt = lAZ.Companion.OLrzqt(channelAEQbTJ);
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                lazOLrzqt.show(childFragmentManager);
                return;
            }
            iwGUEr().EZpvd(channelAEQbTJ, z3);
            hDKMBd().AEQbTJ(new SelectPaymentMethodResult(channelAEQbTJ, paymentMethod, true, SelectionType.EXISTING, this.AuCTel.getTradeType(), 0, null, 96, null));
            hDKMBd().OLrzqt();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OLrzqt(SelectionRow.PaymentMethodItem paymentMethodItem) {
        final com.okinc.okpaymentapi.data.remote.model.management.Channel channel;
        java.util.List<PaymentMethod> paymentMethods;
        java.lang.Object next;
        C32989mnw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>> value = iwGUEr().fIwbmz().getValue();
        PaymentMethod paymentMethod = null;
        java.lang.Object obj = null;
        paymentMethod = null;
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listOLrzqt = value != null ? value.OLrzqt() : null;
        if (listOLrzqt != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((com.okinc.okpaymentapi.data.remote.model.management.Channel) next).getDepositPlatformCode(), (java.lang.Object) paymentMethodItem.gEmmrt())) {
                        break;
                    }
                }
            }
            channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) next;
        } else {
            channel = null;
        }
        if (channel != null && (paymentMethods = channel.getPaymentMethods()) != null) {
            java.util.Iterator<T> it2 = paymentMethods.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) next2).getAccount();
                if (Intrinsics.EZpvd((java.lang.Object) (account != null ? account.getPaymentAccountId() : null), (java.lang.Object) paymentMethodItem.KWHzl())) {
                    obj = next2;
                    break;
                }
            }
            paymentMethod = (PaymentMethod) obj;
        }
        if (channel == null || paymentMethod == null || !C46876tfT.copydefault(channel)) {
            return;
        }
        lAY.Companion.OLrzqt(channel, paymentMethod, new Function1() { // from class: o.lBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return lBI.KWHzl(this.copydefault, channel, (PaymentMethod) obj2);
            }
        }, new Function0() { // from class: o.lBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lBI.fARcdN();
            }
        }).show(getChildFragmentManager(), "BscAccountManagementBottomSheet");
    }

    public static final Unit KWHzl(lBI lbi, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        lbi.hDKMBd().KWHzl(channel, paymentMethod);
        C32866mlf.onEvent$default("PaymentMethod_RemoveAccount_Confirm_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN() {
        C32866mlf.onEvent$default("PaymentMethod_RemoveAccount_Cancel_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = hDKMBd().fARcdN();
        java.lang.String supportCurrency = channelFARcdN != null ? channelFARcdN.getSupportCurrency() : null;
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC31670lzr.copydefault(fragmentActivityRequireActivity, new TransferDetail(new TransferDetail.Target(6), new TransferDetail.Target(18), null, null, false, false, supportCurrency, 60, null));
    }

    public final void EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        lKX lkxOLrzqt;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd;
        java.lang.String depositName = null;
        java.lang.String depositPlatformCode = channel != null ? channel.getDepositPlatformCode() : null;
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.CARD.getCode())) {
            KWHzl(channel);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode())) {
            ejfBZ();
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.CARDPAYMENT.getCode())) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) depositPlatformCode, (java.lang.Object) ChannelPlatformCode.ACH_BUY.getCode())) {
            CreateAccountType createAccountType = CreateAccountType.CREATE_NEW_ACCOUNT;
            C32989mnw<lKX> value = hDKMBd().fIwbmz().getValue();
            if (value != null && (lkxOLrzqt = value.OLrzqt()) != null && (channelEZpvd = lkxOLrzqt.EZpvd()) != null) {
                depositName = channelEZpvd.getDepositName();
            }
            copydefault(createAccountType, "", depositName);
            return;
        }
        getTAG();
        if (channel != null) {
            channel.getDepositPlatformCode();
        }
    }

    public static final class Activity implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lBI.this.hDKMBd().AuCTelauCTel();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lBk.TaskDescription.newInstance$default(o.lBk$TaskDescription, java.lang.String, o.yHO, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):o.lBk */
    public final void ejfBZ() {
        requireActivity().getSupportFragmentManager();
        C29817lBk c29817lBkNewInstance$default = C29817lBk.TaskDescription.newInstance$default(C29817lBk.Companion, ChannelPlatformCode.BUY_PAYPAL.getCode(), new SelectPaymentMethodFragmentV3$launchPayPalFlow$1(hDKMBd()), true, null, 8, null);
        androidx.fragment.app.FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c29817lBkNewInstance$default.show(supportFragmentManager);
        hDKMBd().OLrzqt();
    }

    public final void KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        PaymentAddAccountParams.Activity activity = PaymentAddAccountParams.Companion;
        PaymentAddAccountTarget.CARD.NewCard newCard = PaymentAddAccountTarget.CARD.NewCard.EZpvd;
        ChannelCategoryCode channelCategoryCode = ChannelCategoryCode.NATIVE;
        java.lang.String code = ChannelPlatformCode.CARD.getCode();
        LimitInfo limitInfo = channel.getLimitInfo();
        java.lang.String currency = limitInfo != null ? limitInfo.getCurrency() : null;
        InterfaceC47251tmX.StateListAnimator.launchPaymentAddAccountFlow$default(interfaceC47251tmX, fragmentActivityRequireActivity, PaymentAddAccountParams.Activity.buildCardParams$default(activity, newCard, new CardProperties(channelCategoryCode, currency != null ? currency : "", code, channel), null, 4, null), null, null, this.isConnected, 12, null);
    }

    public static /* synthetic */ void launchPlaidFlowForV3$default(lBI lbi, CreateAccountType createAccountType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        lbi.copydefault(createAccountType, str, str2);
    }

    private final void copydefault(CreateAccountType createAccountType, java.lang.String str, java.lang.String str2) {
        this.AkhnZx = str;
        this.fJNWhG = createAccountType;
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        PaymentAddAccountParams.Activity activity = PaymentAddAccountParams.Companion;
        PaymentAddAccountTarget.ACH.NewAccount newAccount = PaymentAddAccountTarget.ACH.NewAccount.KWHzl;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = hDKMBd().fARcdN();
        java.lang.String depositName = channelFARcdN != null ? channelFARcdN.getDepositName() : null;
        InterfaceC47251tmX.StateListAnimator.launchPaymentAddAccountFlow$default(interfaceC47251tmX, activityAEQbTJ, activity.copydefault(newAccount, new ACHProperties(str, createAccountType, depositName != null ? depositName : "", ChannelPlatformCode.ACH_BUY.getCode())), null, hDKMBd().uzCIH().getType(), this.isConnected, 4, null);
    }

    private final void copydefault(PaymentAddAccountResult.ThirdPartyFinalState thirdPartyFinalState) {
        InterfaceC31430ltq interfaceC31430ltq;
        if (Intrinsics.EZpvd(thirdPartyFinalState, PaymentAddAccountResult.ThirdPartyFinalState.Exit.EZpvd)) {
            if (this.AkhnZx.length() == 0) {
                hDKMBd().AEQbTJ(true);
            }
        } else if (Intrinsics.EZpvd(thirdPartyFinalState, PaymentAddAccountResult.ThirdPartyFinalState.Pending.OLrzqt)) {
            OKPaymentPlatformService oKPaymentPlatformService = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            ActivityResultRegistry activityResultRegistry = requireActivity().getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "");
            oKPaymentPlatformService.EZpvd(fragmentActivityRequireActivity, new C47309tnc(activityResultRegistry, new Function0() { // from class: o.lBT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lBI.OLrzqt(this.AEQbTJ);
                }
            }, null, null, 12, null), ResultType.ActionBar.Application.Activity.EZpvd);
        } else if (thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Success) {
            PaymentMethodSelectionViewModel paymentMethodSelectionViewModelHDKMBd = hDKMBd();
            if (this.fJNWhG == CreateAccountType.RE_LINK && C33129mqd.OLrzqt((java.lang.CharSequence) this.AkhnZx)) {
                interfaceC31430ltq = InterfaceC31430ltq.Activity.copydefault;
            } else {
                interfaceC31430ltq = InterfaceC31430ltq.TaskDescription.EZpvd;
            }
            paymentMethodSelectionViewModelHDKMBd.AEQbTJ(interfaceC31430ltq);
        } else {
            if (!(thirdPartyFinalState instanceof PaymentAddAccountResult.ThirdPartyFinalState.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            OKPaymentPlatformService oKPaymentPlatformService2 = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            ActivityResultRegistry activityResultRegistry2 = requireActivity().getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry2, "");
            oKPaymentPlatformService2.EZpvd(fragmentActivityRequireActivity2, new C47309tnc(activityResultRegistry2, null, null, new Function1() { // from class: o.lBY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lBI.OLrzqt((ResultType.ResultButtonActionType) obj);
                }
            }, 6, null), new ResultType.Application(((PaymentAddAccountResult.ThirdPartyFinalState.Failure) thirdPartyFinalState).EZpvd(), null, 2, null));
        }
        hDKMBd().OLrzqt();
    }

    public static final Unit OLrzqt(lBI lbi) {
        FragmentActivity activity = lbi.getActivity();
        if (activity != null) {
            activity.finish();
        }
        InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        interfaceC31670lzr.AEQbTJ(activityAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okx.paymentapi.service.OKPaymentPlatformService.StateListAnimator.handleResultScreenButtonClick$default(com.okinc.okx.paymentapi.service.OKPaymentPlatformService, com.okinc.okx.paymentapi.data.ResultType$ResultButtonActionType, android.content.Context, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, java.lang.Object):void */
    public static final Unit OLrzqt(ResultType.ResultButtonActionType resultButtonActionType) {
        Intrinsics.checkNotNullParameter(resultButtonActionType, "");
        OKPaymentPlatformService oKPaymentPlatformService = (OKPaymentPlatformService) C43251rlk.copydefault(OKPaymentPlatformService.class);
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
        OKPaymentPlatformService.StateListAnimator.handleResultScreenButtonClick$default(oKPaymentPlatformService, resultButtonActionType, activityAEQbTJ, null, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setupPaymentChannelContent$default(lBI lbi, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            channel = null;
        }
        if ((i & 2) != 0) {
            paymentMethod = null;
        }
        lbi.KWHzl(channel, paymentMethod, (java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>) list);
    }

    public final void KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        java.lang.Object next;
        java.lang.String strAEQbTJ;
        java.lang.String strEZpvd;
        hDKMBd().OLrzqt(list);
        SelectPaymentMethodViewModel selectPaymentMethodViewModelIwGUEr = iwGUEr();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 : list) {
            BuySellParameter buySellParameter = this.AuCTel.getBuySellParameter();
            java.lang.String str = "";
            if (buySellParameter == null || (strAEQbTJ = buySellParameter.AEQbTJ()) == null) {
                strAEQbTJ = "";
            }
            channel2.setQuoteCurrency(strAEQbTJ);
            BuySellParameter buySellParameter2 = this.AuCTel.getBuySellParameter();
            if (buySellParameter2 != null && (strEZpvd = buySellParameter2.EZpvd()) != null) {
                str = strEZpvd;
            }
            channel2.setBaseCurrency(str);
            arrayList.add(lMC.EZpvd.copydefault(this.AuCTel.getTradeType(), channel2, this.AuCTel.isFromBSC()));
        }
        selectPaymentMethodViewModelIwGUEr.gEmmrt(arrayList);
        hDKMBd().copydefault(channel);
        hDKMBd().KWHzl(paymentMethod);
        int iCopydefault = hDKMBd().copydefault(iwGUEr().ejfBZ());
        if (iCopydefault != -1) {
            EZpvd(iwGUEr().ejfBZ().get(iCopydefault));
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(iwGUEr().ejfBZ());
            this.ejfBZ.setItems(arrayList2);
            fIwbmz();
        }
        PaymentMethodSelectionViewModel paymentMethodSelectionViewModelHDKMBd = hDKMBd();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((com.okinc.okpaymentapi.data.remote.model.management.Channel) next).getBestChannel()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        paymentMethodSelectionViewModelHDKMBd.OLrzqt((com.okinc.okpaymentapi.data.remote.model.management.Channel) next);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        RecyclerView recyclerView = ((AbstractC31526lvg) KWHzl()).EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.addItemDecoration(new C57593ylO(recyclerView.getContext().getResources().getDimensionPixelSize(mDC.Activity.copydefault), false, false));
        C43316rmw c43316rmw = this.iwGUEr;
        c43316rmw.register(SelectionRow.PaymentMethodItem.class, new C30008lIm(new Function1() { // from class: o.lBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.EZpvd(this.EZpvd, (SelectionRow.PaymentMethodItem) obj);
            }
        }, new Function1() { // from class: o.lCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.OLrzqt(this.AEQbTJ, (SelectionRow.PaymentMethodItem) obj);
            }
        }, new Function1() { // from class: o.lCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AhwBna(this.EZpvd, (SelectionRow.PaymentMethodItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.CardVerificationItem.class, new lHW(new Function1() { // from class: o.lCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AEQbTJ(this.KWHzl, (SelectionRow.CardVerificationItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.AchRelinkItem.class, new lHT(new Function1() { // from class: o.lCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.OLrzqt(this.OLrzqt, (SelectionRow.AchRelinkItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.PaymentMethodCashItem.class, new C29997lIb(new Function1() { // from class: o.lBL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.copydefault(this.AEQbTJ, (SelectionRow.PaymentMethodCashItem) obj);
            }
        }, new Function1() { // from class: o.lBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.djBIcL(this.OLrzqt, (SelectionRow.PaymentMethodCashItem) obj);
            }
        }, new Function1() { // from class: o.lBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AhwBna(this.OLrzqt, (SelectionRow.PaymentMethodCashItem) obj);
            }
        }, new Function1() { // from class: o.lBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.valueOf(this.EZpvd, (SelectionRow.PaymentMethodCashItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.PaymentMethodStablecoinItem.class, new C30012lIq(new Function1() { // from class: o.lBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.copydefault(this.copydefault, (SelectionRow.PaymentMethodStablecoinItem) obj);
            }
        }, new Function1() { // from class: o.lBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.EZpvd(this.AEQbTJ, (SelectionRow.PaymentMethodStablecoinItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.PaymentMethodCryptoItem.class, new C30003lIh(new Function1() { // from class: o.lCc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.EZpvd(this.KWHzl, (SelectionRow.PaymentMethodCryptoItem) obj);
            }
        }, new Function1() { // from class: o.lCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.copydefault(this.AEQbTJ, (SelectionRow.PaymentMethodCryptoItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.AddPaymentMethodItem.class, new lHU(new Function1() { // from class: o.lCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lBI.AEQbTJ(this.copydefault, (SelectionRow.AddPaymentMethodItem) obj);
            }
        }));
        c43316rmw.register(SelectionRow.SectionHeader.class, new C30013lIr());
        recyclerView.setAdapter(c43316rmw);
    }

    public static final Unit EZpvd(lBI lbi, SelectionRow.PaymentMethodItem paymentMethodItem) {
        Intrinsics.checkNotNullParameter(paymentMethodItem, "");
        handleUserSelectPayment$default(lbi, paymentMethodItem.gEmmrt(), paymentMethodItem.KWHzl(), paymentMethodItem.DbNXlk(), false, false, paymentMethodItem.DbNXlk(), false, 80, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lBI lbi, SelectionRow.PaymentMethodItem paymentMethodItem) {
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> listOLrzqt;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(paymentMethodItem, "");
        C32989mnw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>> value = lbi.iwGUEr().fIwbmz().getValue();
        if (value != null && (listOLrzqt = value.OLrzqt()) != null) {
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((com.okinc.okpaymentapi.data.remote.model.management.Channel) next).getDepositPlatformCode(), (java.lang.Object) paymentMethodItem.gEmmrt())) {
                    break;
                }
            }
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel = (com.okinc.okpaymentapi.data.remote.model.management.Channel) next;
            if (channel != null) {
                lbi.hDKMBd().copydefault(channel, lbi);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(lBI lbi, SelectionRow.PaymentMethodItem paymentMethodItem) {
        Intrinsics.checkNotNullParameter(paymentMethodItem, "");
        lbi.OLrzqt(paymentMethodItem);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lBI lbi, SelectionRow.CardVerificationItem cardVerificationItem) {
        LimitInfo limitInfo;
        Intrinsics.checkNotNullParameter(cardVerificationItem, "");
        java.lang.String strAEQbTJ = cardVerificationItem.AEQbTJ();
        if (strAEQbTJ != null) {
            lbi.hDKMBd().OLrzqt();
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            FragmentActivity fragmentActivityRequireActivity = lbi.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            PaymentAddAccountParams.Activity activity = PaymentAddAccountParams.Companion;
            PaymentAddAccountTarget.CARD.MicroCharge microCharge = PaymentAddAccountTarget.CARD.MicroCharge.AEQbTJ;
            ChannelCategoryCode channelCategoryCode = ChannelCategoryCode.NATIVE;
            java.lang.String code = ChannelPlatformCode.CARD.getCode();
            com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd = cardVerificationItem.EZpvd();
            java.lang.String currency = (channelEZpvd == null || (limitInfo = channelEZpvd.getLimitInfo()) == null) ? null : limitInfo.getCurrency();
            if (currency == null) {
                currency = "";
            }
            InterfaceC47251tmX.StateListAnimator.launchPaymentAddAccountFlow$default(interfaceC47251tmX, fragmentActivityRequireActivity, activity.AEQbTJ(microCharge, new CardProperties(channelCategoryCode, currency, code, cardVerificationItem.EZpvd()), new PaymentMethodProperties("", strAEQbTJ, "card")), null, null, lbi.isConnected, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lBI lbi, SelectionRow.AchRelinkItem achRelinkItem) {
        Intrinsics.checkNotNullParameter(achRelinkItem, "");
        java.lang.String strEZpvd = achRelinkItem.EZpvd();
        if (strEZpvd != null) {
            launchPlaidFlowForV3$default(lbi, CreateAccountType.RE_LINK, strEZpvd, null, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lBI lbi, SelectionRow.PaymentMethodCashItem paymentMethodCashItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCashItem, "");
        handleUserSelectPayment$default(lbi, paymentMethodCashItem.AEQbTJ(), null, paymentMethodCashItem.gEmmrt(), false, false, paymentMethodCashItem.gEmmrt(), false, 82, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(lBI lbi, SelectionRow.PaymentMethodCashItem paymentMethodCashItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCashItem, "");
        if (paymentMethodCashItem.djBIcL()) {
            lbi.hDKMBd().OLrzqt();
            lbi.hDKMBd().AubY();
        } else {
            InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
            FragmentActivity fragmentActivityRequireActivity = lbi.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(paymentMethodCashItem.gEmmrt(), null, null, 6, null), OKPaymentSource.PAYMENT_INTERNAL_FLOW), null, null, 12, null);
            lbi.hDKMBd().OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(lBI lbi, SelectionRow.PaymentMethodCashItem paymentMethodCashItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCashItem, "");
        lbi.AuCTel();
        lbi.hDKMBd().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(lBI lbi, SelectionRow.PaymentMethodCashItem paymentMethodCashItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCashItem, "");
        lbi.hDKMBd().EZpvd(new AvailableBalanceParameter(paymentMethodCashItem.OLrzqt(), paymentMethodCashItem.DbNXlk(), paymentMethodCashItem.AYXKKw(), paymentMethodCashItem.gEmmrt(), paymentMethodCashItem.AhwBna(), true));
        C32866mlf.onEvent$default("PaymentMethod_AvailableBalance_BottomSheet_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        lbi.hDKMBd().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lBI lbi, SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem) {
        Intrinsics.checkNotNullParameter(paymentMethodStablecoinItem, "");
        handleUserSelectPayment$default(lbi, paymentMethodStablecoinItem.valueOf(), null, paymentMethodStablecoinItem.AYXKKw(), true, false, paymentMethodStablecoinItem.copydefault(), C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodStablecoinItem.AhwBna()), 18, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lBI lbi, SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem) {
        Intrinsics.checkNotNullParameter(paymentMethodStablecoinItem, "");
        lbi.hDKMBd().EZpvd(new AvailableBalanceParameter(paymentMethodStablecoinItem.OLrzqt(), paymentMethodStablecoinItem.values(), paymentMethodStablecoinItem.isConnected(), paymentMethodStablecoinItem.copydefault(), paymentMethodStablecoinItem.gEmmrt(), C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodStablecoinItem.AhwBna())));
        C32866mlf.onEvent$default("PaymentMethod_AvailableBalance_BottomSheet_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        lbi.hDKMBd().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lBI lbi, SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCryptoItem, "");
        handleUserSelectPayment$default(lbi, paymentMethodCryptoItem.KWHzl(), null, paymentMethodCryptoItem.AhwBna(), false, true, paymentMethodCryptoItem.EZpvd(), C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodCryptoItem.AYXKKw()), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lBI lbi, SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem) {
        Intrinsics.checkNotNullParameter(paymentMethodCryptoItem, "");
        lbi.hDKMBd().EZpvd(new AvailableBalanceParameter(paymentMethodCryptoItem.copydefault(), paymentMethodCryptoItem.fetchVPNInfo(), paymentMethodCryptoItem.gEmmrt(), paymentMethodCryptoItem.EZpvd(), paymentMethodCryptoItem.valueOf(), paymentMethodCryptoItem.isConnected()));
        C32866mlf.onEvent$default("PaymentMethod_AvailableBalance_BottomSheet_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        lbi.hDKMBd().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lBI lbi, SelectionRow.AddPaymentMethodItem addPaymentMethodItem) {
        Intrinsics.checkNotNullParameter(addPaymentMethodItem, "");
        lbi.EZpvd(addPaymentMethodItem.OLrzqt());
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<? extends SelectionRow> list) {
        this.iwGUEr.setItems(list);
        this.iwGUEr.notifyDataSetChanged();
    }
}
