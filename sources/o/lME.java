package o;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
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
import com.okinc.buysell.data.BannerPageNames;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30126lMw;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lME extends AbstractC30129lMz<AbstractC31536lvq> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int fetchVPNInfo = 8;
    public final C43316rmw AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public SelectPaymentMethodParameter ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public boolean fIwbmz;
    public boolean fJNWhG;
    public final ActivityResultLauncher<android.content.Intent> isConnected;

    public static final void AEQbTJ(ActivityResult activityResult) {
    }

    @Override // o.lzN
    public void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.fIwbmz;
    }

    @Override // o.lzN
    public void EZpvd() {
    }

    public lME() {
        super(C31351lsQ.ActionBar.QUSxYX);
        this.fJNWhG = true;
        this.AkhnZx = new C43316rmw();
        final Function0 function0 = null;
        this.ejfBZ = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$viewModels$default$2
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodFragment$special$$inlined$viewModels$default$5
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                lME.AEQbTJ((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.isConnected = activityResultLauncherRegisterForActivityResult;
    }

    @Override // o.lzN
    public lzT OLrzqt() {
        return getNewProxyInstance();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lME.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final lME KWHzl(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
            Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
            lME lme = new lME();
            android.os.Bundle bundle = new android.os.Bundle();
            lMB.KWHzl(bundle, selectPaymentMethodParameter);
            lme.setArguments(bundle);
            return lme;
        }

        public static /* synthetic */ void addSelectPaymentMethodWidget$default(ActionBar actionBar, SelectPaymentMethodParameter selectPaymentMethodParameter, int i, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 8) != 0) {
                str = null;
            }
            actionBar.AEQbTJ(selectPaymentMethodParameter, i, fragmentManager, str);
        }

        public final void AEQbTJ(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter, int i, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
            Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = fragmentManager.beginTransaction().replace(i, KWHzl(selectPaymentMethodParameter));
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionReplace, "");
            if (str != null) {
                fragmentTransactionReplace.addToBackStack(str);
            }
            fragmentTransactionReplace.commitAllowingStateLoss();
        }
    }

    public final PaymentMethodSelectionViewModel fARcdN() {
        return (PaymentMethodSelectionViewModel) this.AuCTel.getValue();
    }

    private final SelectPaymentMethodViewModel getNewProxyInstance() {
        return (SelectPaymentMethodViewModel) this.fARcdN.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        fARcdN().OLrzqt(new ActivityResult(i2, intent));
        AuCTel();
    }

    @Override // o.lzN, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        SelectPaymentMethodViewModel.trackPageView$default(getNewProxyInstance(), "next", null, null, 6, null);
        if (!this.fJNWhG) {
            AuCTel();
        }
        this.fJNWhG = false;
    }

    public final void AuCTel() {
        if (this.fJNWhG) {
            return;
        }
        getNewProxyInstance().fJNWhG();
    }

    public final void fIwbmz() {
        getNewProxyInstance().fJNWhG();
    }

    public final void fJNWhG() {
        this.AkhnZx.notifyDataSetChanged();
    }

    @Override // o.lzN
    public void djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            SelectPaymentMethodParameter selectPaymentMethodParameterKWHzl = lMB.KWHzl(arguments);
            if (selectPaymentMethodParameterKWHzl == null) {
                selectPaymentMethodParameterKWHzl = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TradeType) null, (BuySellParameter) null, 0, false, false, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32767, (DefaultConstructorMarker) null);
            }
            this.ejfBZ = selectPaymentMethodParameterKWHzl;
            getNewProxyInstance().KWHzl(C31429ltp.EZpvd(this.ejfBZ.getTradeType()));
            if (this.ejfBZ.getTradeType() == TradeType.BUY || this.ejfBZ.getTradeType() == TradeType.SELL) {
                getNewProxyInstance().copydefault(BannerPageNames.BUY_SELL_CHANNEL_SELECTION.getPageName());
            }
        }
    }

    public final android.content.Intent ejfBZ() {
        PaymentMethod paymentMethod;
        java.util.List<PaymentMethod> paymentMethods;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = fARcdN().fARcdN();
        if (channelFARcdN == null || ((paymentMethods = channelFARcdN.getPaymentMethods()) != null && paymentMethods.isEmpty())) {
            channelFARcdN = (com.okinc.okpaymentapi.data.remote.model.management.Channel) mHA.OLrzqt.AEQbTJ(fARcdN().EZpvd());
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = channelFARcdN;
        if (channel == null) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        PaymentMethod paymentMethodAuCTel = fARcdN().AuCTel();
        if (paymentMethodAuCTel == null) {
            java.util.List<PaymentMethod> paymentMethods2 = channel.getPaymentMethods();
            PaymentMethod paymentMethod2 = paymentMethods2 != null ? paymentMethods2.get(0) : null;
            if (paymentMethod2 == null) {
                paymentMethod2 = new PaymentMethod((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Account) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, (java.lang.String) null, false, (SellerReceiptAccount) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, 536870911, (DefaultConstructorMarker) null);
            }
            paymentMethod = paymentMethod2;
        } else {
            paymentMethod = paymentMethodAuCTel;
        }
        lMA.AEQbTJ(intent, new SelectPaymentMethodResult(channel, paymentMethod, true, null, fARcdN().uzCIH(), 0, null, 104, null));
        return intent;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uzCIH();
        hDKMBd();
        iwGUEr();
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new Application());
    }

    public static final class Application extends OnBackPressedCallback {

        /* JADX INFO: loaded from: classes18.dex */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TradeType.values().length];
                try {
                    iArr[TradeType.BUY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[TradeType.SELL.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[TradeType.TOPUP.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[TradeType.ADDFUNDS.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[TradeType.DEPOSIT.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[TradeType.STABLECOIN_DEPOSIT.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[TradeType.WITHDRAW.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                copydefault = iArr;
            }
        }

        public Application() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            switch (ActionBar.copydefault[lME.this.ejfBZ.getTradeType().ordinal()]) {
                case 1:
                    if (isEnabled()) {
                        setEnabled(false);
                        android.content.Intent intentEjfBZ = lME.this.ejfBZ();
                        if (intentEjfBZ != null) {
                            lME.this.requireActivity().setResult(-1, intentEjfBZ);
                        }
                        lME.this.requireActivity().onBackPressed();
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        C43316rmw c43316rmw = this.AkhnZx;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c43316rmw.register(InterfaceC30133lNc.class, new C30131lNa(fragmentActivityRequireActivity, true, parentFragmentManager, getNewProxyInstance(), fARcdN(), new Function0() { // from class: o.lMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lME.KWHzl(this.OLrzqt);
            }
        }, new Function1() { // from class: o.lMF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.OLrzqt(this.EZpvd, (InterfaceC30133lNc) obj);
            }
        }));
        ((AbstractC31536lvq) KWHzl()).KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
        ((AbstractC31536lvq) KWHzl()).KWHzl.setAdapter(this.AkhnZx);
    }

    public static final Unit KWHzl(lME lme) {
        lme.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lME lme, InterfaceC30133lNc interfaceC30133lNc) {
        Intrinsics.checkNotNullParameter(interfaceC30133lNc, "");
        lme.AEQbTJ(interfaceC30133lNc);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(InterfaceC30133lNc interfaceC30133lNc) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = getNewProxyInstance().ejfBZ().iterator();
        while (it.hasNext()) {
            ((InterfaceC30133lNc) it.next()).KWHzl(false);
        }
        interfaceC30133lNc.KWHzl(true);
        fARcdN().copydefault(interfaceC30133lNc.fARcdN());
        arrayList.addAll(getNewProxyInstance().ejfBZ());
        this.AkhnZx.setItems(arrayList);
        fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        ((AbstractC31536lvq) KWHzl()).KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    private final void iwGUEr() {
        fARcdN().KWHzl(this.ejfBZ);
        getNewProxyInstance().copydefault(false, this.ejfBZ);
        fARcdN().KWHzl(this.isConnected);
        getNewProxyInstance().EZpvd(this.ejfBZ.isRecurring());
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<com.okinc.okpaymentapi.data.remote.model.management.Channel>> liveDataHDKMBd = fARcdN().hDKMBd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataHDKMBd, viewLifecycleOwner, new Function1() { // from class: o.lMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.copydefault((com.okinc.okpaymentapi.data.remote.model.management.Channel) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFetchVPNInfo = fARcdN().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner2, new Function1() { // from class: o.lMN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<ActivityResult>> liveDataDjBIcL = fARcdN().djBIcL();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataDjBIcL, viewLifecycleOwner3, new Function1() { // from class: o.lMK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.copydefault((ActivityResult) obj);
            }
        });
        LiveData<C32989mnw<lMD<PaymentMethod, OKServerException>>> liveDataAuCTel = getNewProxyInstance().AuCTel();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner4, new Function1() { // from class: o.lMM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.AEQbTJ((lMD) obj);
            }
        });
        LiveData<C32989mnw<AbstractC30126lMw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>, OKServerException>>> liveDataIsConnected = getNewProxyInstance().isConnected();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataIsConnected, viewLifecycleOwner5, new Function1() { // from class: o.lML
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.copydefault(this.EZpvd, (AbstractC30126lMw) obj);
            }
        });
        LiveData<C32989mnw<java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>>> liveDataFIwbmz = getNewProxyInstance().fIwbmz();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataFIwbmz, viewLifecycleOwner6, new Function1() { // from class: o.lMJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataFetchVPNInfo2 = getNewProxyInstance().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataFetchVPNInfo2, viewLifecycleOwner7, new Function1() { // from class: o.lMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lME.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lME lme, boolean z) {
        if (z) {
            lme.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lMD lmd) {
        Intrinsics.checkNotNullParameter(lmd, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lME lme, AbstractC30126lMw abstractC30126lMw) {
        Intrinsics.checkNotNullParameter(abstractC30126lMw, "");
        lme.fARcdN().EZpvd((AbstractC30126lMw<? extends java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel>, OKServerException>) abstractC30126lMw);
        if (Intrinsics.EZpvd(abstractC30126lMw, AbstractC30126lMw.ActionBar.AEQbTJ)) {
            ((AbstractC31536lvq) lme.KWHzl()).getRoot().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(lME lme, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ((AbstractC31536lvq) lme.KWHzl()).getRoot().setVisibility(0);
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = lme.fARcdN().fARcdN();
        if (channelFARcdN == null) {
            channelFARcdN = lme.ejfBZ.getUserSelectedChannel();
        }
        PaymentMethod paymentMethodAuCTel = lme.fARcdN().AuCTel();
        if (paymentMethodAuCTel == null) {
            paymentMethodAuCTel = lme.ejfBZ.getUserSelectedPaymentMethod();
        }
        lme.OLrzqt(channelFARcdN, paymentMethodAuCTel, list);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setupPaymentChannelContent$default(lME lme, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            channel = null;
        }
        if ((i & 2) != 0) {
            paymentMethod = null;
        }
        lme.OLrzqt(channel, paymentMethod, list);
    }

    private final void OLrzqt(com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        java.lang.Object next;
        java.lang.String strAEQbTJ;
        java.lang.String strEZpvd;
        fARcdN().OLrzqt(list);
        SelectPaymentMethodViewModel newProxyInstance = getNewProxyInstance();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 : list) {
            BuySellParameter buySellParameter = this.ejfBZ.getBuySellParameter();
            java.lang.String str = "";
            if (buySellParameter == null || (strAEQbTJ = buySellParameter.AEQbTJ()) == null) {
                strAEQbTJ = "";
            }
            channel2.setQuoteCurrency(strAEQbTJ);
            BuySellParameter buySellParameter2 = this.ejfBZ.getBuySellParameter();
            if (buySellParameter2 != null && (strEZpvd = buySellParameter2.EZpvd()) != null) {
                str = strEZpvd;
            }
            channel2.setBaseCurrency(str);
            arrayList.add(lMC.EZpvd.copydefault(this.ejfBZ.getTradeType(), channel2, this.ejfBZ.isFromBSC()));
        }
        newProxyInstance.gEmmrt(arrayList);
        fARcdN().copydefault(channel);
        fARcdN().KWHzl(paymentMethod);
        int iCopydefault = fARcdN().copydefault(getNewProxyInstance().ejfBZ());
        if (iCopydefault != -1) {
            AEQbTJ(getNewProxyInstance().ejfBZ().get(iCopydefault));
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(getNewProxyInstance().ejfBZ());
            this.AkhnZx.setItems(arrayList2);
            fJNWhG();
        }
        PaymentMethodSelectionViewModel paymentMethodSelectionViewModelFARcdN = fARcdN();
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
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) next;
        if (channel3 == null) {
            channel3 = (com.okinc.okpaymentapi.data.remote.model.management.Channel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
        paymentMethodSelectionViewModelFARcdN.OLrzqt(channel3);
    }
}
