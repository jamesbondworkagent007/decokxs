package o;

import android.view.View;
import androidx.camera.video.AudioStats;
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
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.BuySellParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodViewModel;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
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
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31388ltA;
import o.C31351lsQ;
import o.C47244tmQ;
import o.lKH;
import o.lME;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lNN extends AbstractC30168lOj<AbstractC31533lvn, BscSellPaymentMethodViewModel> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int DbNXlk = 8;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final int ejfBZ;
    public final InterfaceC56387yDm fIwbmz;
    public boolean fetchVPNInfo;
    public final InterfaceC56387yDm values;

    @Override // o.lzN
    public void AYXKKw() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.lzN
    public boolean AhwBna() {
        return this.fetchVPNInfo;
    }

    @Override // o.lzN
    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int iwGUEr() {
        return this.ejfBZ;
    }

    public lNN() {
        super(C31351lsQ.ActionBar.QbewEr);
        this.ejfBZ = C31351lsQ.Application.zzQwtT;
        final Function0 function0 = null;
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$3
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lKU.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$6
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lzS.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$viewModels$default$5
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BscSellPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$8
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.BscSellPaymentMethodFragment$special$$inlined$activityViewModels$default$9
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
    }

    @Override // o.AbstractC30075lKz, o.lzN
    public lzT OLrzqt() {
        return fetchVPNInfo();
    }

    @Override // o.AbstractC30075lKz
    public PaymentMethodSelectionViewModel isConnected() {
        return (PaymentMethodSelectionViewModel) this.fIwbmz.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lKz.getNewProxyInstance()V */
    /* JADX DEBUG: Possible override for method o.lOj.getNewProxyInstance()V */
    public lKU getNewProxyInstance() {
        return (lKU) this.values.getValue();
    }

    private final lzS gHZMYf() {
        return (lzS) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/lKH; */
    @Override // o.AbstractC30075lKz
    /* JADX INFO: renamed from: hDKMBd, reason: merged with bridge method [inline-methods] */
    public BscSellPaymentMethodViewModel fetchVPNInfo() {
        return (BscSellPaymentMethodViewModel) this.AuCTel.getValue();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lNN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lNN AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, TradeType tradeType, java.lang.Integer num, int i, int i2) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcExtraKeys.LEGAL_CURRENCY, str);
            bundle.putString("legal_amount", str2);
            bundle.putString(OtcExtraKeys.BASE_CURRENCY, str3);
            bundle.putString(OtcExtraKeys.AMOUNT, str4);
            bundle.putSerializable("trade_type", tradeType);
            Intrinsics.copydefault(num);
            bundle.putInt("input_type", num.intValue());
            bundle.putInt("crypto_precision", i);
            bundle.putInt("currency_scale", i2);
            lNN lnn = new lNN();
            lnn.setArguments(bundle);
            return lnn;
        }
    }

    @Override // o.lzN
    public void djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            fetchVPNInfo().isConnected(C33129mqd.gEmmrt(arguments.getString("legal_amount")));
            fetchVPNInfo().OLrzqt(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.AMOUNT)));
            fetchVPNInfo().AYXKKw(C33129mqd.gEmmrt(arguments.getString("legal_amount")));
            fetchVPNInfo().valueOf(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.AMOUNT)));
            fetchVPNInfo().AhwBna(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.LEGAL_CURRENCY)));
            fetchVPNInfo().djBIcL(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.BASE_CURRENCY)));
            fetchVPNInfo().KWHzl(C33129mqd.AhwBna(java.lang.Integer.valueOf(arguments.getInt("crypto_precision"))));
            fetchVPNInfo().copydefault(C33129mqd.AhwBna(java.lang.Integer.valueOf(arguments.getInt("input_type"))));
            fetchVPNInfo().AEQbTJ(true);
            fetchVPNInfo().AEQbTJ(C33129mqd.AhwBna(java.lang.Integer.valueOf(arguments.getInt("currency_scale"))));
        }
        getFieldNames();
    }

    @Override // o.AbstractC30075lKz, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo().DAIeex();
    }

    public void getFieldNames() {
        lME.ActionBar actionBar = lME.Companion;
        SelectPaymentMethodParameter selectPaymentMethodParameter = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, fetchVPNInfo().UeEOUB(), new BuySellParameter(fetchVPNInfo().AubY(), fetchVPNInfo().AwvSrB(), fetchVPNInfo().uzCIH(), fetchVPNInfo().QbewEr(), (java.lang.String) null, java.lang.Integer.valueOf(fetchVPNInfo().aKErDB()), 16, (DefaultConstructorMarker) null), 0, false, true, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32615, (DefaultConstructorMarker) null);
        int iIwGUEr = iwGUEr();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        lME.ActionBar.addSelectPaymentMethodWidget$default(actionBar, selectPaymentMethodParameter, iIwGUEr, childFragmentManager, null, 8, null);
    }

    @Override // o.AbstractC30075lKz
    public void fARcdN() {
        fetchVPNInfo().copydefault(getNewProxyInstance());
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataDNCPSb = fetchVPNInfo().dNCPSb();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataDNCPSb, viewLifecycleOwner, new Function1() { // from class: o.lOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.gEmmrt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit gEmmrt(lNN lnn, boolean z) {
        lnn.isConnected().KWHzl("back");
        android.content.Intent intentWlaJM = lnn.wlaJM();
        if (intentWlaJM != null) {
            lnn.requireActivity().setResult(-1, intentWlaJM);
        }
        FragmentActivity activity = lnn.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    private final android.content.Intent wlaJM() {
        PaymentMethod paymentMethod;
        java.util.List<PaymentMethod> paymentMethods;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = isConnected().fARcdN();
        if (channelFARcdN == null || ((paymentMethods = channelFARcdN.getPaymentMethods()) != null && paymentMethods.isEmpty())) {
            channelFARcdN = (com.okinc.okpaymentapi.data.remote.model.management.Channel) mHA.OLrzqt.AEQbTJ(isConnected().EZpvd());
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = channelFARcdN;
        if (channel == null) {
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        PaymentMethod paymentMethodAuCTel = isConnected().AuCTel();
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
        lMA.AEQbTJ(intent, new SelectPaymentMethodResult(channel, paymentMethod, true, null, isConnected().uzCIH(), 0, null, 104, null));
        return intent;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ lNN OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, lNN lnn) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = lnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.fetchVPNInfo().AEQbTJ(this.OLrzqt.isConnected().KWHzl(), this.OLrzqt.isConnected().DbNXlk(), "next");
                this.OLrzqt.isConnected().KWHzl("next");
                lKX lkx = (lKX) mHA.OLrzqt.AEQbTJ(this.OLrzqt.isConnected().fIwbmz());
                if (lkx != null) {
                    this.OLrzqt.fetchVPNInfo().onEventTrigger(new lKH.StateListAnimator.Application(lkx.EZpvd()));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30075lKz
    public void AkhnZx() {
        if (fetchVPNInfo().iZzfmt() && C33129mqd.AEQbTJ(fetchVPNInfo().uzCIH()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(fetchVPNInfo().QbewEr()) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            ((AbstractC31533lvn) KWHzl()).KWHzl.setVisibility(8);
            return;
        }
        ((AbstractC31533lvn) KWHzl()).KWHzl.setVisibility(0);
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.String>> liveDataValues = fetchVPNInfo().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner, new Function1() { // from class: o.lNS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<lKH.TaskDescription>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner2, new Function1() { // from class: o.lNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.KWHzl(this.OLrzqt, (lKH.TaskDescription) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAkhnZx = fetchVPNInfo().AkhnZx();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataAkhnZx, viewLifecycleOwner3, new Function1() { // from class: o.lNR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.AYXKKw(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(lNN lnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.EZpvd().copydefault.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lNN lnn, lKH.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.KWHzl(taskDescription.KWHzl(), taskDescription.OLrzqt());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(lNN lnn, boolean z) {
        if (z) {
            ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.AEQbTJ();
        } else {
            ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30075lKz
    public void fIwbmz() {
        lzS.initialize$default(gHZMYf(), C33070mpX.AYXKKw(C31351lsQ.Activity.hrNTAI), null, false, false, true, null, null, 8, null);
        ((AbstractC31533lvn) KWHzl()).AEQbTJ.AEQbTJ(gHZMYf());
        C52794wYp c52794wYp = ((AbstractC31533lvn) KWHzl()).AEQbTJ.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    @Override // o.AbstractC30075lKz
    public void AuCTel() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<lKH.Application>> liveDataQUSxYX = fetchVPNInfo().QUSxYX();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataQUSxYX, viewLifecycleOwner, new Function1() { // from class: o.lNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.AEQbTJ(this.KWHzl, (lKH.Application) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAuCTel = fetchVPNInfo().AuCTel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner2, new Function1() { // from class: o.lNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.djBIcL(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<lKX>> liveDataFIwbmz = isConnected().fIwbmz();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFIwbmz, viewLifecycleOwner3, new Function1() { // from class: o.lNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.EZpvd(this.OLrzqt, (lKX) obj);
            }
        });
        LiveData<C32989mnw<lKH.Activity>> liveDataRJOkX = fetchVPNInfo().RJOkX();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataRJOkX, viewLifecycleOwner4, new Function1() { // from class: o.lNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.AEQbTJ(this.AEQbTJ, (lKH.Activity) obj);
            }
        });
        LiveData<C32989mnw<java.lang.String>> liveDataDvKsVJ = fetchVPNInfo().dvKsVJ();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataDvKsVJ, viewLifecycleOwner5, new Function1() { // from class: o.lNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAkhnZx = fetchVPNInfo().AkhnZx();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataAkhnZx, viewLifecycleOwner6, new Function1() { // from class: o.lNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.AhwBna(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.String>> liveDataFIwbmz2 = fetchVPNInfo().fIwbmz();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataFIwbmz2, viewLifecycleOwner7, new Function1() { // from class: o.lOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.AhwBna(this.OLrzqt, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAhwBna = isConnected().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(liveDataAhwBna, viewLifecycleOwner8, new Function1() { // from class: o.lOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lNN.valueOf(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(final lNN lnn, lKH.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof lKH.Application.Activity) {
            lnn.isConnected().EZpvd(lnn.fetchVPNInfo().UeEOUB(), new Function1() { // from class: o.lOc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lNN.EZpvd(this.KWHzl, (lKA) obj);
                }
            }, new Function1() { // from class: o.lOd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lNN.KWHzl(this.KWHzl, (lKA) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lNN lnn, lKA lka) {
        Intrinsics.checkNotNullParameter(lka, "");
        android.content.Intent intent = new android.content.Intent();
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = lnn.isConnected().fARcdN();
        if (channelFARcdN == null) {
            channelFARcdN = new com.okinc.okpaymentapi.data.remote.model.management.Channel((TradingAgentInfo) null, (java.lang.String) null, false, (java.lang.String) null, (ChannelCategoryCode) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (B2CExtCollectInfo) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, false, (PaymentMethodCategory) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (TermContentChannel) null, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (java.lang.String) null, (java.lang.String) null, (TradeLimit) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, false, (java.lang.String) null, false, (SupportCurrencyInfo) null, (java.lang.Integer) null, (EarnOption) null, (java.util.List) null, (java.lang.String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null);
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = channelFARcdN;
        PaymentMethod paymentMethodAuCTel = lnn.isConnected().AuCTel();
        if (paymentMethodAuCTel == null) {
            paymentMethodAuCTel = new PaymentMethod((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Account) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, false, (java.lang.String) null, false, (SellerReceiptAccount) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 0, 536870911, (DefaultConstructorMarker) null);
        }
        lMA.AEQbTJ(intent, new SelectPaymentMethodResult(channel, paymentMethodAuCTel, true, null, lnn.isConnected().uzCIH(), 0, null, 104, null));
        lnn.requireActivity().setResult(-1, intent);
        lnn.requireActivity().finish();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(lNN lnn, lKA lka) {
        Intrinsics.checkNotNullParameter(lka, "");
        mHA.OLrzqt.OLrzqt(lnn.fetchVPNInfo().gGvvIC(), lka);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(lNN lnn, boolean z) {
        if (z) {
            lnn.AwvSrB();
        } else {
            lnn.zuBGHE();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lNN lnn, lKX lkx) {
        Intrinsics.checkNotNullParameter(lkx, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd = lkx.EZpvd();
        PaymentMethod paymentMethodAEQbTJ = lkx.AEQbTJ();
        if (channelEZpvd != null) {
            lnn.KWHzl(channelEZpvd);
        }
        lnn.copydefault(channelEZpvd, paymentMethodAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(lNN lnn, lKH.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC31533lvn abstractC31533lvn = (AbstractC31533lvn) lnn.KWHzl();
        if (activity instanceof lKH.Activity.TaskDescription) {
            if (((lKH.Activity.TaskDescription) activity).OLrzqt()) {
                C52794wYp.startLoading$default(abstractC31533lvn.AEQbTJ.AEQbTJ, 0L, 1, null);
            } else {
                abstractC31533lvn.AEQbTJ.AEQbTJ.fIwbmz();
            }
        } else {
            if (!(activity instanceof lKH.Activity.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            abstractC31533lvn.AEQbTJ.AEQbTJ.setEnabled(((lKH.Activity.Application) activity).copydefault());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lNN lnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        lnn.fetchVPNInfo().gEmmrt(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(lNN lnn, boolean z) {
        if (z) {
            ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.AEQbTJ();
        } else {
            ((AbstractC31533lvn) lnn.KWHzl()).KWHzl.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(lNN lnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        lnn.fetchVPNInfo().values(str);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(lNN lnn, boolean z) {
        lnn.ejfBZ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        C31552lwF c31552lwF = ((AbstractC31533lvn) KWHzl()).copydefault;
        c31552lwF.getRoot().setVisibility(0);
        c31552lwF.EZpvd.KWHzl(0L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zuBGHE() {
        C31552lwF c31552lwF = ((AbstractC31533lvn) KWHzl()).copydefault;
        c31552lwF.getRoot().setVisibility(8);
        c31552lwF.EZpvd.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public void AuCTelauCTel() {
        AbstractC31533lvn abstractC31533lvn = (AbstractC31533lvn) KWHzl();
        abstractC31533lvn.OLrzqt.getRoot().setVisibility(8);
        abstractC31533lvn.EZpvd.setVisibility(0);
        fetchVPNInfo().onEventTrigger(new lKH.StateListAnimator.C0870StateListAnimator(isConnected()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30075lKz
    public void KWHzl(@NotNull AbstractC31388ltA abstractC31388ltA) {
        Intrinsics.checkNotNullParameter(abstractC31388ltA, "");
        AbstractC31533lvn abstractC31533lvn = (AbstractC31533lvn) KWHzl();
        if (Intrinsics.EZpvd(abstractC31388ltA, AbstractC31388ltA.Activity.OLrzqt)) {
            C31549lwC c31549lwC = abstractC31533lvn.OLrzqt;
            c31549lwC.getRoot().setVisibility(0);
            c31549lwC.KWHzl.setImage(C47244tmQ.StateListAnimator.KWHzl);
            c31549lwC.KWHzl.setSubTitle(getString(C31351lsQ.Activity.aUsmxb));
            c31549lwC.KWHzl.AEQbTJ().setVisibility(0);
            c31549lwC.KWHzl.AEQbTJ().setText(getString(C31351lsQ.Activity.ODXsMY));
            c31549lwC.KWHzl.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lNU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lNN.OLrzqt(this.EZpvd, view);
                }
            });
            abstractC31533lvn.EZpvd.setVisibility(8);
        } else {
            if (!Intrinsics.EZpvd(abstractC31388ltA, AbstractC31388ltA.ActionBar.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            C31549lwC c31549lwC2 = abstractC31533lvn.OLrzqt;
            c31549lwC2.getRoot().setVisibility(0);
            c31549lwC2.KWHzl.setImage(C47244tmQ.StateListAnimator.AEQbTJ);
            c31549lwC2.KWHzl.setSubTitle(getString(C31351lsQ.Activity.USBtdM));
            c31549lwC2.KWHzl.AEQbTJ().setVisibility(8);
            abstractC31533lvn.EZpvd.setVisibility(8);
        }
        lKH.updateDescription$default(fetchVPNInfo(), fetchVPNInfo().AwvSrB(), null, 2, null);
        lKH.updateAmountCard$default(fetchVPNInfo(), fetchVPNInfo().AubY(), null, 2, null);
    }

    public static final void OLrzqt(lNN lnn, android.view.View view) {
        lnn.AuCTelauCTel();
    }
}
