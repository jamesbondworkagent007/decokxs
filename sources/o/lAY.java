package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lAY extends AbstractC29809lBc {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public InterfaceC30116lMm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public AbstractC31442luB EZpvd;
    public Function0<Unit> KWHzl;
    public com.okinc.okpaymentapi.data.remote.model.management.Channel copydefault;
    public PaymentMethod djBIcL;
    public Function1<? super PaymentMethod, Unit> gEmmrt;

    public lAY() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.BscAccountManagementBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.BscAccountManagementBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.BscAccountManagementBottomSheet$special$$inlined$activityViewModels$default$3
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

    private final PaymentMethodSelectionViewModel EZpvd() {
        return (PaymentMethodSelectionViewModel) this.AYXKKw.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.gEmmrt == null || this.KWHzl == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        TradeType tradeType;
        java.lang.String iconUrl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.EZpvd = AbstractC31442luB.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        C30110lMg c30110lMg = C30110lMg.EZpvd;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.copydefault;
        PaymentMethod paymentMethod = null;
        if (channel == null) {
            Intrinsics.gEmmrt("");
            channel = null;
        }
        SelectPaymentMethodParameter selectPaymentMethodParameter = (SelectPaymentMethodParameter) mHA.OLrzqt.AEQbTJ(EZpvd().values());
        if (selectPaymentMethodParameter == null || (tradeType = selectPaymentMethodParameter.getTradeType()) == null) {
            tradeType = TradeType.BUY;
        }
        this.AEQbTJ = c30110lMg.AEQbTJ(channel, tradeType);
        PaymentMethod paymentMethod2 = this.djBIcL;
        if (paymentMethod2 == null) {
            Intrinsics.gEmmrt("");
            paymentMethod2 = null;
        }
        int numOfRecurringPlans = paymentMethod2.getNumOfRecurringPlans();
        AbstractC31442luB abstractC31442luB = this.EZpvd;
        if (abstractC31442luB == null) {
            Intrinsics.gEmmrt("");
            abstractC31442luB = null;
        }
        abstractC31442luB.gEmmrt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.registerUser));
        android.widget.TextView textView = abstractC31442luB.AYXKKw;
        PaymentMethod paymentMethod3 = this.djBIcL;
        if (paymentMethod3 == null) {
            Intrinsics.gEmmrt("");
            paymentMethod3 = null;
        }
        textView.setText(KWHzl(paymentMethod3));
        if (C33492mxV.OLrzqt()) {
            PaymentMethod paymentMethod4 = this.djBIcL;
            if (paymentMethod4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                paymentMethod = paymentMethod4;
            }
            iconUrl = paymentMethod.getIconUrlNight();
        } else {
            PaymentMethod paymentMethod5 = this.djBIcL;
            if (paymentMethod5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                paymentMethod = paymentMethod5;
            }
            iconUrl = paymentMethod.getIconUrl();
        }
        java.lang.String str = iconUrl;
        if (true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            abstractC31442luB.AEQbTJ.setVisibility(0);
            android.widget.ImageView imageView = abstractC31442luB.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, str, null, 0, 0, 14, null);
        } else {
            abstractC31442luB.AEQbTJ.setVisibility(8);
        }
        if (numOfRecurringPlans > 0) {
            abstractC31442luB.djBIcL.setVisibility(0);
            abstractC31442luB.djBIcL.setStyle(2);
            abstractC31442luB.djBIcL.setCloseIconVisibility(false);
            abstractC31442luB.djBIcL.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.siEkQe));
            abstractC31442luB.djBIcL.setMessage(C33069mpW.copydefault(C31351lsQ.Activity.scanPackages, C56423yEv.EZpvd(C56390yDp.OLrzqt("pausedPlanValue", java.lang.String.valueOf(numOfRecurringPlans)))));
        } else {
            abstractC31442luB.djBIcL.setVisibility(8);
        }
        abstractC31442luB.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lAY.copydefault(this.KWHzl, view);
            }
        });
        abstractC31442luB.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lAY.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(lAY lay, android.view.View view) {
        Function1<? super PaymentMethod, Unit> function1 = lay.gEmmrt;
        if (function1 != null) {
            PaymentMethod paymentMethod = lay.djBIcL;
            if (paymentMethod == null) {
                Intrinsics.gEmmrt("");
                paymentMethod = null;
            }
            function1.invoke(paymentMethod);
        }
        lay.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(lAY lay, android.view.View view) {
        Function0<Unit> function0 = lay.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        lay.dismissAllowingStateLoss();
    }

    public final java.lang.String KWHzl(PaymentMethod paymentMethod) {
        java.lang.String last4;
        java.lang.String payment = paymentMethod.getPayment();
        if (payment == null) {
            payment = "";
        }
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (account == null || (last4 = account.getLast4()) == null) {
            last4 = "";
        }
        if (payment.length() > 0 && last4.length() > 0) {
            return payment + " " + last4;
        }
        if (payment.length() > 0) {
            return payment;
        }
        if (last4.length() <= 0) {
            return "";
        }
        return "•••• " + last4;
    }

    @Override // o.AbstractC29809lBc, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33570myu.copydefault((android.app.Activity) activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.gEmmrt == null || this.KWHzl == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        dismiss();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lAY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.lAY$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ lAY newInstance$default(TaskDescription taskDescription, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            return taskDescription.OLrzqt(channel, paymentMethod, function1, function0);
        }

        public final lAY OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod, Function1<? super PaymentMethod, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(channel, "");
            Intrinsics.checkNotNullParameter(paymentMethod, "");
            lAY lay = new lAY();
            lay.copydefault = channel;
            lay.djBIcL = paymentMethod;
            lay.gEmmrt = function1;
            lay.KWHzl = function0;
            return lay;
        }
    }
}
