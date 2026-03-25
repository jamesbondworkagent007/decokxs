package o;

import android.view.View;
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
import com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
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

/* JADX INFO: renamed from: o.lOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30172lOn extends AbstractC30169lOk<AbstractC31533lvn, SellPaymentMethodViewModel> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int ejfBZ = 8;
    public final InterfaceC56387yDm AuCTel;
    public boolean fARcdN;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm getFieldNames;
    public final InterfaceC56387yDm hDKMBd;
    public final int iwGUEr;

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int wlaJM() {
        return this.iwGUEr;
    }

    public C30172lOn() {
        super(C31351lsQ.ActionBar.QbewEr);
        this.iwGUEr = C31351lsQ.Application.zzQwtT;
        final Function0 function0 = null;
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$3
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lKU.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$6
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$viewModels$default$2
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(lzS.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$viewModels$default$5
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
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SellPaymentMethodViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.sell.SellPaymentMethodFragment$special$$inlined$activityViewModels$default$9
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
        return (PaymentMethodSelectionViewModel) this.getFieldNames.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lOk.iwGUEr()V */
    public lKU iwGUEr() {
        return (lKU) this.fJNWhG.getValue();
    }

    private final lzS zLjUOn() {
        return (lzS) this.AuCTel.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/lKH; */
    @Override // o.AbstractC30075lKz
    /* JADX INFO: renamed from: zsXlph, reason: merged with bridge method [inline-methods] */
    public SellPaymentMethodViewModel fetchVPNInfo() {
        return (SellPaymentMethodViewModel) this.hDKMBd.getValue();
    }

    /* JADX INFO: renamed from: o.lOn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30172lOn EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, TradeType tradeType, java.lang.Integer num, int i) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcExtraKeys.LEGAL_CURRENCY, str);
            bundle.putString("legal_amount", str2);
            bundle.putString(OtcExtraKeys.BASE_CURRENCY, str3);
            bundle.putString(OtcExtraKeys.AMOUNT, str4);
            bundle.putSerializable("trade_type", tradeType);
            Intrinsics.copydefault(num);
            bundle.putInt("input_type", num.intValue());
            bundle.putInt("crypto_precision", i);
            C30172lOn c30172lOn = new C30172lOn();
            c30172lOn.setArguments(bundle);
            return c30172lOn;
        }
    }

    @Override // o.lzN
    public void djBIcL() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            fetchVPNInfo().isConnected(C33129mqd.gEmmrt(arguments.getString("legal_amount")));
            fetchVPNInfo().OLrzqt(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.AMOUNT)));
            fetchVPNInfo().AhwBna(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.LEGAL_CURRENCY)));
            fetchVPNInfo().djBIcL(C33129mqd.gEmmrt(arguments.getString(OtcExtraKeys.BASE_CURRENCY)));
            fetchVPNInfo().KWHzl(C33129mqd.AhwBna(java.lang.Integer.valueOf(arguments.getInt("crypto_precision"))));
            fetchVPNInfo().copydefault(C33129mqd.AhwBna(java.lang.Integer.valueOf(arguments.getInt("input_type"))));
        }
        AuCTelauCTel();
    }

    public void AuCTelauCTel() {
        lME.ActionBar actionBar = lME.Companion;
        SelectPaymentMethodParameter selectPaymentMethodParameter = new SelectPaymentMethodParameter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, fetchVPNInfo().UeEOUB(), new BuySellParameter(fetchVPNInfo().AubY(), fetchVPNInfo().AwvSrB(), fetchVPNInfo().uzCIH(), fetchVPNInfo().QbewEr(), (java.lang.String) null, java.lang.Integer.valueOf(fetchVPNInfo().aKErDB()), 16, (DefaultConstructorMarker) null), 0, false, false, (java.util.List) null, false, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, (java.util.List) null, (DexTokenParameters) null, 32743, (DefaultConstructorMarker) null);
        int iWlaJM = wlaJM();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        lME.ActionBar.addSelectPaymentMethodWidget$default(actionBar, selectPaymentMethodParameter, iWlaJM, childFragmentManager, null, 8, null);
    }

    @Override // o.AbstractC30075lKz
    public void fARcdN() {
        fetchVPNInfo().KWHzl(iwGUEr());
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataDNCPSb = fetchVPNInfo().dNCPSb();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataDNCPSb, viewLifecycleOwner, new Function1() { // from class: o.lOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.valueOf(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit valueOf(C30172lOn c30172lOn, boolean z) {
        c30172lOn.isConnected().KWHzl("back");
        FragmentActivity activity = c30172lOn.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC30075lKz
    public void AkhnZx() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.String>> liveDataValues = fetchVPNInfo().values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner, new Function1() { // from class: o.lOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<lKH.TaskDescription>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner2, new Function1() { // from class: o.lOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.EZpvd(this.OLrzqt, (lKH.TaskDescription) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAkhnZx = fetchVPNInfo().AkhnZx();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataAkhnZx, viewLifecycleOwner3, new Function1() { // from class: o.lOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AhwBna(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C30172lOn c30172lOn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.EZpvd().copydefault.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C30172lOn c30172lOn, lKH.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.KWHzl(taskDescription.KWHzl(), taskDescription.OLrzqt());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C30172lOn c30172lOn, boolean z) {
        if (z) {
            ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.AEQbTJ();
        } else {
            ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC30075lKz
    public void fIwbmz() {
        lzS.initialize$default(zLjUOn(), C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDCKfqPDCfLja), null, false, false, true, null, null, 8, null);
        ((AbstractC31533lvn) KWHzl()).AEQbTJ.AEQbTJ(zLjUOn());
        C52794wYp c52794wYp = ((AbstractC31533lvn) KWHzl()).AEQbTJ.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.lOn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C30172lOn EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C30172lOn c30172lOn) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c30172lOn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.fetchVPNInfo().AEQbTJ(this.EZpvd.isConnected().KWHzl(), this.EZpvd.isConnected().DbNXlk(), "next");
                this.EZpvd.isConnected().KWHzl("next");
                this.EZpvd.ejfBZ();
            }
        }
    }

    @Override // o.AbstractC30075lKz
    public void AuCTel() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<lKH.Application>> liveDataQUSxYX = fetchVPNInfo().QUSxYX();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataQUSxYX, viewLifecycleOwner, new Function1() { // from class: o.lOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.KWHzl(this.AEQbTJ, (lKH.Application) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAuCTel = fetchVPNInfo().AuCTel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner2, new Function1() { // from class: o.lOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AYXKKw(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<lKX>> liveDataFIwbmz = isConnected().fIwbmz();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFIwbmz, viewLifecycleOwner3, new Function1() { // from class: o.lOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AEQbTJ(this.OLrzqt, (lKX) obj);
            }
        });
        LiveData<C32989mnw<lKH.Activity>> liveDataRJOkX = fetchVPNInfo().RJOkX();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataRJOkX, viewLifecycleOwner4, new Function1() { // from class: o.lOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AEQbTJ(this.AEQbTJ, (lKH.Activity) obj);
            }
        });
        LiveData<C32989mnw<C31434ltu>> newProxyInstance = fetchVPNInfo().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(newProxyInstance, viewLifecycleOwner5, new Function1() { // from class: o.lOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AEQbTJ(this.KWHzl, (C31434ltu) obj);
            }
        });
        LiveData<C32989mnw<kotlin.Pair<ChannelCategoryCode, B2CQuoteBean>>> liveDataDjSkpj = fetchVPNInfo().djSkpj();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(liveDataDjSkpj, viewLifecycleOwner6, new Function1() { // from class: o.lOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<java.lang.String>> liveDataDvKsVJ = fetchVPNInfo().dvKsVJ();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        mha.copydefault(liveDataDvKsVJ, viewLifecycleOwner7, new Function1() { // from class: o.lOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAkhnZx = fetchVPNInfo().AkhnZx();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        mha.copydefault(liveDataAkhnZx, viewLifecycleOwner8, new Function1() { // from class: o.lOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<java.lang.String>> liveDataFIwbmz2 = fetchVPNInfo().fIwbmz();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        mha.copydefault(liveDataFIwbmz2, viewLifecycleOwner9, new Function1() { // from class: o.lOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        });
        LiveData<C32989mnw<java.lang.Boolean>> liveDataAhwBna = isConnected().AhwBna();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        mha.copydefault(liveDataAhwBna, viewLifecycleOwner10, new Function1() { // from class: o.lOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30172lOn.gEmmrt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(C30172lOn c30172lOn, lKH.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof lKH.Application.TaskDescription) {
            if (!((lKH.Application.TaskDescription) application).OLrzqt()) {
                c30172lOn.fetchVPNInfo().giSNqX();
            }
        } else if (Intrinsics.EZpvd(application, lKH.Application.ActionBar.AEQbTJ)) {
            c30172lOn.ejfBZ();
        } else if (!(application instanceof lKH.Application.StateListAnimator) && !(application instanceof lKH.Application.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C30172lOn c30172lOn, boolean z) {
        if (z) {
            c30172lOn.AwvSrB();
        } else {
            c30172lOn.sSMYrx();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C30172lOn c30172lOn, lKX lkx) {
        Intrinsics.checkNotNullParameter(lkx, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelEZpvd = lkx.EZpvd();
        PaymentMethod paymentMethodAEQbTJ = lkx.AEQbTJ();
        if (channelEZpvd != null) {
            c30172lOn.KWHzl(channelEZpvd);
        }
        c30172lOn.copydefault(channelEZpvd, paymentMethodAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C30172lOn c30172lOn, lKH.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC31533lvn abstractC31533lvn = (AbstractC31533lvn) c30172lOn.KWHzl();
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

    public static final Unit AEQbTJ(C30172lOn c30172lOn, C31434ltu c31434ltu) {
        Intrinsics.checkNotNullParameter(c31434ltu, "");
        c30172lOn.KWHzl(c31434ltu.AYXKKw(), c31434ltu.KWHzl(), c31434ltu.AkhnZx(), c31434ltu.copydefault(), c31434ltu.djBIcL(), c31434ltu.isConnected(), c31434ltu.OLrzqt(), c31434ltu.AEQbTJ(), c31434ltu.EZpvd(), c31434ltu.AhwBna(), c31434ltu.valueOf(), c31434ltu.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C30172lOn c30172lOn, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c30172lOn.KWHzl((ChannelCategoryCode) pair.getFirst(), (B2CQuoteBean) pair.getSecond(), c30172lOn.fetchVPNInfo().wlaJM());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C30172lOn c30172lOn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c30172lOn.fetchVPNInfo().gEmmrt(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: BINDING */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C30172lOn c30172lOn, boolean z) {
        if (z) {
            ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.AEQbTJ();
        } else {
            ((AbstractC31533lvn) c30172lOn.KWHzl()).KWHzl.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C30172lOn c30172lOn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c30172lOn.fetchVPNInfo().values(str);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C30172lOn c30172lOn, boolean z) {
        c30172lOn.ejfBZ();
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
    private final void sSMYrx() {
        C31552lwF c31552lwF = ((AbstractC31533lvn) KWHzl()).copydefault;
        c31552lwF.getRoot().setVisibility(8);
        c31552lwF.EZpvd.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: BINDING */
    /* JADX WARN: Multi-variable type inference failed */
    public void AubY() {
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
            c31549lwC.KWHzl.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lOq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30172lOn.copydefault(this.AEQbTJ, view);
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

    public static final void copydefault(C30172lOn c30172lOn, android.view.View view) {
        c30172lOn.AubY();
    }
}
