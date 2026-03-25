package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailActivityViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C30309lTp extends wXX {
    public C31489luw EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.lTp$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public C30309lTp() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuySellOrderDetailActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.transaction.buysell.view.OrderDetailDexFeeInfoBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.transaction.buysell.view.OrderDetailDexFeeInfoBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.transaction.buysell.view.OrderDetailDexFeeInfoBottomSheet$special$$inlined$activityViewModels$default$3
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

    private final BuySellOrderDetailActivityViewModel AEQbTJ() {
        return (BuySellOrderDetailActivityViewModel) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C31489luw c31489luwCopydefault = C31489luw.copydefault(android.view.LayoutInflater.from(getContext()));
        this.EZpvd = c31489luwCopydefault;
        if (c31489luwCopydefault == null) {
            Intrinsics.gEmmrt("");
            c31489luwCopydefault = null;
        }
        constraintLayout.addView(c31489luwCopydefault.getRoot(), -1, -2);
        EZpvd();
    }

    private final void EZpvd() {
        AEQbTJ().copydefault().observe(this, new StateListAnimator(new Function1() { // from class: o.lTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30309lTp.AEQbTJ(this.AEQbTJ, (OrderDetailBean) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C30309lTp c30309lTp, OrderDetailBean orderDetailBean) {
        Intrinsics.copydefault(orderDetailBean);
        c30309lTp.AEQbTJ(orderDetailBean);
        DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
        java.lang.String networkFee = dexOrderDetail != null ? dexOrderDetail.getNetworkFee() : null;
        DexOrderDetailBean dexOrderDetail2 = orderDetailBean.getDexOrderDetail();
        c30309lTp.AEQbTJ(networkFee, dexOrderDetail2 != null ? dexOrderDetail2.getNetworkFeeCurrency() : null);
        DexOrderDetailBean dexOrderDetail3 = orderDetailBean.getDexOrderDetail();
        java.lang.String serviceFeeAmount = dexOrderDetail3 != null ? dexOrderDetail3.getServiceFeeAmount() : null;
        DexOrderDetailBean dexOrderDetail4 = orderDetailBean.getDexOrderDetail();
        java.lang.String serviceFeeCurrency = dexOrderDetail4 != null ? dexOrderDetail4.getServiceFeeCurrency() : null;
        DexOrderDetailBean dexOrderDetail5 = orderDetailBean.getDexOrderDetail();
        c30309lTp.OLrzqt(serviceFeeAmount, serviceFeeCurrency, dexOrderDetail5 != null ? dexOrderDetail5.getServiceFeeRate() : null);
        DexOrderDetailBean dexOrderDetail6 = orderDetailBean.getDexOrderDetail();
        java.lang.String totalFee = dexOrderDetail6 != null ? dexOrderDetail6.getTotalFee() : null;
        DexOrderDetailBean dexOrderDetail7 = orderDetailBean.getDexOrderDetail();
        c30309lTp.EZpvd(totalFee, dexOrderDetail7 != null ? dexOrderDetail7.getTotalFeeCurrency() : null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(OrderDetailBean orderDetailBean) {
        java.lang.String channelFee = orderDetailBean.getChannelFee();
        java.lang.String quoteCurrencySymbol = orderDetailBean.getQuoteCurrencySymbol();
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode());
        C31489luw c31489luw = this.EZpvd;
        if (c31489luw == null) {
            Intrinsics.gEmmrt("");
            c31489luw = null;
        }
        C31489luw c31489luw2 = c31489luw;
        if (channelFee.length() > 0 && quoteCurrencySymbol.length() > 0 && zEZpvd) {
            c31489luw2.values.setText(C31661lzi.appendCryptoSymbol$default(channelFee, quoteCurrencySymbol, 0, null, null, null, 30, null));
            c31489luw2.gEmmrt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DGUQLIdZmdUa));
            c31489luw2.EZpvd.setVisibility(0);
            return;
        }
        c31489luw2.EZpvd.setVisibility(8);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C31489luw c31489luw = this.EZpvd;
        if (c31489luw == null) {
            Intrinsics.gEmmrt("");
            c31489luw = null;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            c31489luw.copydefault.setVisibility(8);
            return;
        }
        c31489luw.copydefault.setVisibility(0);
        c31489luw.valueOf.setText(C31661lzi.appendCryptoSymbol$default(str, str2, 0, null, null, null, 30, null));
        c31489luw.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.hvKCwS));
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(str3), null, C38307pTy.Companion.KWHzl(0, 2), DisplaySign.AUTO, java.lang.Double.valueOf(100.0d), null, 17, null);
        C31489luw c31489luw = this.EZpvd;
        if (c31489luw == null) {
            Intrinsics.gEmmrt("");
            c31489luw = null;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            c31489luw.OLrzqt.setVisibility(8);
            return;
        }
        c31489luw.OLrzqt.setVisibility(0);
        c31489luw.DbNXlk.setText(C33069mpW.copydefault(this, C31351lsQ.Activity.gtCCJH, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("serviceFeeRate", iCUPercent$default))));
        c31489luw.isConnected.setText(C31661lzi.appendCryptoSymbol$default(str, str2, 0, null, null, null, 30, null));
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C31489luw c31489luw = this.EZpvd;
        if (c31489luw == null) {
            Intrinsics.gEmmrt("");
            c31489luw = null;
        }
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            c31489luw.AhwBna.setVisibility(8);
        } else {
            c31489luw.AhwBna.setVisibility(0);
            c31489luw.ejfBZ.setText(C31661lzi.appendCryptoSymbol$default(str, str2, 0, null, null, null, 30, null));
        }
    }

    /* JADX INFO: renamed from: o.lTp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C30309lTp AEQbTJ() {
            return new C30309lTp();
        }
    }
}
