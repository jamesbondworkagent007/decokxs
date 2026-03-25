package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.okpaymentapi.data.remote.model.management.B2CExtCollectInfo;
import com.okinc.okpaymentapi.data.remote.model.management.BankingHours;
import com.okinc.okpaymentapi.data.remote.model.management.BillingAddress;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import com.okinc.okpaymentapi.data.remote.model.management.InformationBox;
import com.okinc.okpaymentapi.data.remote.model.management.LimitInfo;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.LocalizationHighlightStyle;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import com.okinc.okpaymentapi.data.remote.model.management.SupportCurrencyInfo;
import com.okinc.okpaymentapi.data.remote.model.management.TermContentChannel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeLimit;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okpaymentapi.data.remote.model.management.TradingAgentInfo;
import com.okinc.okpaymentapi.data.remote.model.management.UiFlowControl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30107lMd extends wXX {
    public Function1<? super PaymentMethod, Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public boolean AkhnZx;
    public InterfaceC30116lMm EZpvd;
    public final C43316rmw KWHzl = new C43316rmw();
    public C31481luo OLrzqt;
    public com.okinc.okpaymentapi.data.remote.model.management.Channel copydefault;
    public Function0<Unit> djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public ViewOnClickListenerC54939xaY gEmmrt;
    public TradeType isConnected;
    public boolean valueOf;
    public Function1<? super PaymentMethod, Unit> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public C30107lMd() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.change.ChangePaymentMethodDialogFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.change.ChangePaymentMethodDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.change.ChangePaymentMethodDialogFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.lMd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lMd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.lMd$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C30107lMd newInstance$default(Application application, Function0 function0, Function1 function1, Function1 function12, Function0 function02, boolean z, boolean z2, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, TradeType tradeType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            if ((i & 2) != 0) {
                function1 = null;
            }
            if ((i & 4) != 0) {
                function12 = null;
            }
            if ((i & 8) != 0) {
                function02 = null;
            }
            if ((i & 16) != 0) {
                z = true;
            }
            if ((i & 32) != 0) {
                z2 = false;
            }
            if ((i & 64) != 0) {
                channel = null;
            }
            if ((i & 128) != 0) {
                tradeType = null;
            }
            return application.AEQbTJ(function0, function1, function12, function02, z, z2, channel, tradeType);
        }

        public final C30107lMd AEQbTJ(Function0<Unit> function0, Function1<? super PaymentMethod, Unit> function1, Function1<? super PaymentMethod, Unit> function12, Function0<Unit> function02, boolean z, boolean z2, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, TradeType tradeType) {
            C30107lMd c30107lMd = new C30107lMd();
            c30107lMd.djBIcL = function0;
            c30107lMd.AYXKKw = function1;
            c30107lMd.values = function12;
            c30107lMd.AhwBna = function02;
            c30107lMd.AkhnZx = z;
            c30107lMd.valueOf = z2;
            c30107lMd.copydefault = channel;
            c30107lMd.isConnected = tradeType;
            return c30107lMd;
        }
    }

    private final PaymentMethodSelectionViewModel copydefault() {
        return (PaymentMethodSelectionViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.List<PaymentMethod> listAhwBna;
        java.lang.String depositPlatformCode;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.OLrzqt = C31481luo.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        if (this.copydefault == null) {
            this.copydefault = copydefault().fARcdN();
        }
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.copydefault;
        if (channel == null || (listAhwBna = channel.getPaymentMethods()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        for (PaymentMethod paymentMethod : listAhwBna) {
            com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = this.copydefault;
            if (channel2 == null || (depositPlatformCode = channel2.getDepositPlatformCode()) == null) {
                depositPlatformCode = "";
            }
            paymentMethod.setDepositPlatformCode(depositPlatformCode);
        }
        InterfaceC30116lMm interfaceC30116lMm = null;
        if (this.isConnected == null) {
            SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) mHA.OLrzqt.AEQbTJ(copydefault().values());
            this.isConnected = selectPaymentMethodParameter != null ? selectPaymentMethodParameter.getTradeType() : null;
        }
        C30110lMg c30110lMg = C30110lMg.EZpvd;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = this.copydefault;
        TradeType tradeType = this.isConnected;
        if (tradeType == null) {
            tradeType = TradeType.BUY;
        }
        InterfaceC30116lMm interfaceC30116lMmAEQbTJ = c30110lMg.AEQbTJ(channel3, tradeType);
        this.EZpvd = interfaceC30116lMmAEQbTJ;
        if (interfaceC30116lMmAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMmAEQbTJ = null;
        }
        interfaceC30116lMmAEQbTJ.AEQbTJ();
        C31481luo c31481luo = this.OLrzqt;
        if (c31481luo == null) {
            Intrinsics.gEmmrt("");
            c31481luo = null;
        }
        android.widget.TextView textView = c31481luo.AYXKKw;
        InterfaceC30116lMm interfaceC30116lMm2 = this.EZpvd;
        if (interfaceC30116lMm2 == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm2 = null;
        }
        textView.setText(interfaceC30116lMm2.OLrzqt());
        C52794wYp c52794wYp = c31481luo.AEQbTJ;
        InterfaceC30116lMm interfaceC30116lMm3 = this.EZpvd;
        if (interfaceC30116lMm3 == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm3 = null;
        }
        c52794wYp.setText(interfaceC30116lMm3.KWHzl());
        C43316rmw c43316rmw = this.KWHzl;
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel4 = this.copydefault;
        c43316rmw.register(InterfaceC30115lMl.class, new C30121lMr(parentFragmentManager, channel4 == null ? new com.okinc.okpaymentapi.data.remote.model.management.Channel((TradingAgentInfo) null, (java.lang.String) null, false, (java.lang.String) null, (ChannelCategoryCode) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (B2CExtCollectInfo) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, false, (PaymentMethodCategory) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (TermContentChannel) null, (java.lang.Integer) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, false, (Localization) null, (LocalizationHighlightStyle) null, (LimitInfo) null, (InformationBox) null, (BankingHours) null, (UiFlowControl) null, false, (java.lang.String) null, (java.lang.String) null, (TradeLimit) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, false, (java.lang.String) null, false, (SupportCurrencyInfo) null, (java.lang.Integer) null, (EarnOption) null, (java.util.List) null, (java.lang.String) null, false, false, -1, -1, 16383, (DefaultConstructorMarker) null) : channel4, new Function1() { // from class: o.lMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30107lMd.KWHzl(this.OLrzqt, (InterfaceC30115lMl) obj);
            }
        }, new Function1() { // from class: o.lMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30107lMd.copydefault(this.AEQbTJ, (InterfaceC30115lMl) obj);
            }
        }, new Function0() { // from class: o.lMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30107lMd.KWHzl(this.OLrzqt);
            }
        }, this.AYXKKw));
        c31481luo.KWHzl.setLayoutManager(new LinearLayoutManager(getContext()));
        c31481luo.KWHzl.setAdapter(this.KWHzl);
        C43316rmw c43316rmw2 = this.KWHzl;
        InterfaceC30116lMm interfaceC30116lMm4 = this.EZpvd;
        if (interfaceC30116lMm4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC30116lMm = interfaceC30116lMm4;
        }
        if (this.valueOf) {
            listAhwBna = EZpvd(listAhwBna);
        }
        PaymentMethod paymentMethodAuCTel = copydefault().AuCTel();
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel5 = this.copydefault;
        TradeType tradeType2 = this.isConnected;
        if (tradeType2 == null) {
            tradeType2 = TradeType.BUY;
        }
        c43316rmw2.setItems(interfaceC30116lMm.copydefault(listAhwBna, paymentMethodAuCTel, channel5, tradeType2));
        if (this.AkhnZx) {
            c31481luo.AEQbTJ.setVisibility(0);
        } else {
            c31481luo.AEQbTJ.setVisibility(8);
        }
        c31481luo.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30107lMd.EZpvd(this.copydefault, view);
            }
        });
        c31481luo.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30107lMd.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final Unit KWHzl(C30107lMd c30107lMd, InterfaceC30115lMl interfaceC30115lMl) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        c30107lMd.AEQbTJ(interfaceC30115lMl.values());
        InterfaceC30116lMm interfaceC30116lMm = c30107lMd.EZpvd;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.EZpvd(interfaceC30115lMl);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30107lMd c30107lMd, InterfaceC30115lMl interfaceC30115lMl) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        c30107lMd.OLrzqt(interfaceC30115lMl.values());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30107lMd c30107lMd) {
        c30107lMd.dismiss();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C30107lMd c30107lMd, android.view.View view) {
        c30107lMd.OLrzqt();
    }

    public static final void AEQbTJ(C30107lMd c30107lMd, android.view.View view) {
        c30107lMd.KWHzl();
    }

    public final void KWHzl() {
        InterfaceC30116lMm interfaceC30116lMm = this.EZpvd;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.EZpvd();
        dismissAllowingStateLoss();
    }

    private final void OLrzqt() {
        PaymentMethod paymentMethodAuCTel = copydefault().AuCTel();
        InterfaceC30116lMm interfaceC30116lMm = null;
        java.lang.String paymentMethod = paymentMethodAuCTel != null ? paymentMethodAuCTel.getPaymentMethod() : null;
        InterfaceC30116lMm interfaceC30116lMm2 = this.EZpvd;
        if (interfaceC30116lMm2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC30116lMm = interfaceC30116lMm2;
        }
        interfaceC30116lMm.AEQbTJ(paymentMethod);
        dismiss();
        Function0<Unit> function0 = this.djBIcL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void AEQbTJ(PaymentMethod paymentMethod) {
        InterfaceC30116lMm interfaceC30116lMm = this.EZpvd;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.AEQbTJ(paymentMethod);
        dismiss();
        Function1<? super PaymentMethod, Unit> function1 = this.values;
        if (function1 != null) {
            function1.invoke(paymentMethod);
        }
    }

    public final void OLrzqt(final PaymentMethod paymentMethod) {
        InterfaceC30116lMm interfaceC30116lMm = this.EZpvd;
        InterfaceC30116lMm interfaceC30116lMm2 = null;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.KWHzl(paymentMethod);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        InterfaceC30116lMm interfaceC30116lMm3 = this.EZpvd;
        if (interfaceC30116lMm3 == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm3 = null;
        }
        viewOnClickListenerC54939xaY.setTitle(interfaceC30116lMm3.djBIcL());
        InterfaceC30116lMm interfaceC30116lMm4 = this.EZpvd;
        if (interfaceC30116lMm4 == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm4 = null;
        }
        viewOnClickListenerC54939xaY.EZpvd(interfaceC30116lMm4.OLrzqt(paymentMethod));
        InterfaceC30116lMm interfaceC30116lMm5 = this.EZpvd;
        if (interfaceC30116lMm5 == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm5 = null;
        }
        viewOnClickListenerC54939xaY.AEQbTJ(interfaceC30116lMm5.copydefault(), new View.OnClickListener() { // from class: o.lMi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30107lMd.EZpvd(this.KWHzl, paymentMethod, viewOnClickListenerC54939xaY, view);
            }
        });
        InterfaceC30116lMm interfaceC30116lMm6 = this.EZpvd;
        if (interfaceC30116lMm6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC30116lMm2 = interfaceC30116lMm6;
        }
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) interfaceC30116lMm2.gEmmrt(), new View.OnClickListener() { // from class: o.lMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30107lMd.OLrzqt(this.EZpvd, paymentMethod, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        this.gEmmrt = viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(C30107lMd c30107lMd, PaymentMethod paymentMethod, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC30116lMm interfaceC30116lMm = c30107lMd.EZpvd;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.EZpvd(paymentMethod);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(C30107lMd c30107lMd, PaymentMethod paymentMethod, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        InterfaceC30116lMm interfaceC30116lMm = c30107lMd.EZpvd;
        if (interfaceC30116lMm == null) {
            Intrinsics.gEmmrt("");
            interfaceC30116lMm = null;
        }
        interfaceC30116lMm.copydefault(paymentMethod);
        Function1<? super PaymentMethod, Unit> function1 = c30107lMd.AYXKKw;
        if (function1 != null) {
            function1.invoke(paymentMethod);
        }
        viewOnClickListenerC54939xaY.dismiss();
        c30107lMd.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33570myu.copydefault((android.app.Activity) activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.gEmmrt;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Function0<Unit> function0 = this.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDestroy();
    }

    public final java.util.List<PaymentMethod> EZpvd(java.util.List<PaymentMethod> list) {
        PaymentMethod paymentMethodCopy;
        java.lang.String bankName;
        java.lang.String accountNumber;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) obj).getAccount();
            if (account != null && (accountNumber = account.getAccountNumber()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) accountNumber)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList) {
            com.okinc.okpaymentapi.data.remote.model.management.Account account2 = ((PaymentMethod) obj2).getAccount();
            if (account2 == null || (bankName = account2.getBankName()) == null) {
                bankName = "";
            }
            java.lang.Object arrayList2 = linkedHashMap.get(bankName);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(bankName, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            PaymentMethod paymentMethod = (PaymentMethod) CollectionsKt___CollectionsKt.AuCTelauCTel(list2);
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                str = null;
            }
            if (str == null) {
                str = "Bank account";
            }
            java.lang.String str2 = str;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account3 = ((PaymentMethod) it.next()).getAccount();
                if (account3 != null && C33129mqd.OLrzqt((java.lang.CharSequence) account3.getAccountNumber())) {
                    arrayList4.add(account3);
                }
            }
            if (list2.size() > 1) {
                paymentMethodCopy = paymentMethod.copy((402636799 & 1) != 0 ? paymentMethod.payment : null, (402636799 & 2) != 0 ? paymentMethod.description : null, (402636799 & 4) != 0 ? paymentMethod.backgroundColor : null, (402636799 & 8) != 0 ? paymentMethod.iconUrl : null, (402636799 & 16) != 0 ? paymentMethod.iconUrlNight : null, (402636799 & 32) != 0 ? paymentMethod.mainColor : null, (402636799 & 64) != 0 ? paymentMethod.paymentCurrency : null, (402636799 & 128) != 0 ? paymentMethod.paymentMethodType : null, (402636799 & 256) != 0 ? paymentMethod.paymentMethodId : null, (402636799 & 512) != 0 ? paymentMethod.paymentMethod : null, (402636799 & 1024) != 0 ? paymentMethod.supportedTransactionType : null, (402636799 & 2048) != 0 ? paymentMethod.baseAmount : null, (402636799 & 4096) != 0 ? paymentMethod.depositToWithdraw : false, (402636799 & 8192) != 0 ? paymentMethod.allowManualAddition : false, (402636799 & 16384) != 0 ? paymentMethod.account : new com.okinc.okpaymentapi.data.remote.model.management.Account((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str2, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BillingAddress) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, -33, 63, (DefaultConstructorMarker) null), (402636799 & 32768) != 0 ? paymentMethod.quoteCurrency : null, (402636799 & 65536) != 0 ? paymentMethod.price : null, (402636799 & 131072) != 0 ? paymentMethod.publicTradingOrderId : null, (402636799 & 262144) != 0 ? paymentMethod.sellerReceiptAccountList : null, (402636799 & 524288) != 0 ? paymentMethod.bestOption : false, (402636799 & 1048576) != 0 ? paymentMethod.finalPriceForDisplay : null, (402636799 & 2097152) != 0 ? paymentMethod.isSelected : false, (402636799 & 4194304) != 0 ? paymentMethod.selectedSellerReceiptAccount : null, (402636799 & 8388608) != 0 ? paymentMethod.depositPlatformCode : null, (402636799 & 16777216) != 0 ? paymentMethod.deepLink : null, (402636799 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? paymentMethod.storeUrl : null, (402636799 & 67108864) != 0 ? paymentMethod.showTransfer : false, (402636799 & 134217728) != 0 ? paymentMethod.accounts : arrayList4, (402636799 & 268435456) != 0 ? paymentMethod.numOfRecurringPlans : 0);
            } else {
                paymentMethodCopy = paymentMethod.copy((402636799 & 1) != 0 ? paymentMethod.payment : null, (402636799 & 2) != 0 ? paymentMethod.description : null, (402636799 & 4) != 0 ? paymentMethod.backgroundColor : null, (402636799 & 8) != 0 ? paymentMethod.iconUrl : null, (402636799 & 16) != 0 ? paymentMethod.iconUrlNight : null, (402636799 & 32) != 0 ? paymentMethod.mainColor : null, (402636799 & 64) != 0 ? paymentMethod.paymentCurrency : null, (402636799 & 128) != 0 ? paymentMethod.paymentMethodType : null, (402636799 & 256) != 0 ? paymentMethod.paymentMethodId : null, (402636799 & 512) != 0 ? paymentMethod.paymentMethod : null, (402636799 & 1024) != 0 ? paymentMethod.supportedTransactionType : null, (402636799 & 2048) != 0 ? paymentMethod.baseAmount : null, (402636799 & 4096) != 0 ? paymentMethod.depositToWithdraw : false, (402636799 & 8192) != 0 ? paymentMethod.allowManualAddition : false, (402636799 & 16384) != 0 ? paymentMethod.account : null, (402636799 & 32768) != 0 ? paymentMethod.quoteCurrency : null, (402636799 & 65536) != 0 ? paymentMethod.price : null, (402636799 & 131072) != 0 ? paymentMethod.publicTradingOrderId : null, (402636799 & 262144) != 0 ? paymentMethod.sellerReceiptAccountList : null, (402636799 & 524288) != 0 ? paymentMethod.bestOption : false, (402636799 & 1048576) != 0 ? paymentMethod.finalPriceForDisplay : null, (402636799 & 2097152) != 0 ? paymentMethod.isSelected : false, (402636799 & 4194304) != 0 ? paymentMethod.selectedSellerReceiptAccount : null, (402636799 & 8388608) != 0 ? paymentMethod.depositPlatformCode : null, (402636799 & 16777216) != 0 ? paymentMethod.deepLink : null, (402636799 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? paymentMethod.storeUrl : null, (402636799 & 67108864) != 0 ? paymentMethod.showTransfer : false, (402636799 & 134217728) != 0 ? paymentMethod.accounts : arrayList4, (402636799 & 268435456) != 0 ? paymentMethod.numOfRecurringPlans : 0);
            }
            arrayList3.add(paymentMethodCopy);
        }
        return arrayList3;
    }
}
