package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailActivityViewModel;
import com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.crcore.shared.net.responsebean.bsc.DexOrderDetailBean;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C47244tmQ;
import o.InterfaceC6804aWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lSZ extends AbstractC30306lTm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC31528lvi AEQbTJ;
    public BuySellTradeType AYXKKw;
    public java.lang.String AhwBna = "";
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C31351lsQ.ActionBar.RJOkX;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public lSZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuySellOrderDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$viewModels$default$5
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BuySellOrderDetailActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.lTm.KWHzl()V */
    public final BuySellOrderDetailViewModel KWHzl() {
        return (BuySellOrderDetailViewModel) this.valueOf.getValue();
    }

    public final BuySellOrderDetailActivityViewModel OLrzqt() {
        return (BuySellOrderDetailActivityViewModel) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC31528lvi abstractC31528lvi = this.AEQbTJ;
        if (abstractC31528lvi != null) {
            abstractC31528lvi.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lTe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    lSZ.OLrzqt(this.KWHzl, view2);
                }
            });
            abstractC31528lvi.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lTc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    lSZ.gEmmrt(this.copydefault, view2);
                }
            });
            abstractC31528lvi.gEmmrt.copydefault().hDKMBd.setOnClickListener(new View.OnClickListener() { // from class: o.lTb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    lSZ.djBIcL(this.AEQbTJ, view2);
                }
            });
        }
    }

    public static final void OLrzqt(lSZ lsz, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) lsz.AhwBna, (java.lang.Object) "topup") && lsz.getParentFragmentManager().getBackStackEntryCount() > 0) {
            lsz.getParentFragmentManager().popBackStack();
            return;
        }
        FragmentActivity activity = lsz.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void gEmmrt(lSZ lsz, android.view.View view) {
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
        android.content.Context contextRequireContext = lsz.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC6804aWL.Application.openSupportCenter$default(interfaceC6804aWL, contextRequireContext, null, 2, null);
    }

    public static final void djBIcL(lSZ lsz, android.view.View view) {
        C30309lTp.Companion.AEQbTJ().show(lsz.getChildFragmentManager(), "BSCDexFeeInfoBottomSheet");
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC31528lvi abstractC31528lviCopydefault = AbstractC31528lvi.copydefault(layoutInflater, viewGroup, false);
        this.AEQbTJ = abstractC31528lviCopydefault;
        if (abstractC31528lviCopydefault != null) {
            return abstractC31528lviCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.EZpvd = C33129mqd.gEmmrt(arguments != null ? arguments.getString(OtcExtraKeys.ORDER_ID) : null);
        android.os.Bundle arguments2 = getArguments();
        this.AYXKKw = arguments2 != null ? (BuySellTradeType) arguments2.getParcelable("trade_type") : null;
        android.os.Bundle arguments3 = getArguments();
        this.AhwBna = C33129mqd.gEmmrt(arguments3 != null ? arguments3.getString("source") : null);
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            this.KWHzl = arguments4.getBoolean("is_from_result_screen", false);
        }
        AEQbTJ();
    }

    public final void EZpvd() {
        copydefault(true);
        java.lang.String str = this.EZpvd;
        if (str != null) {
            KWHzl().KWHzl(str, this.AYXKKw);
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        pUU.EZpvd(getTAG(), "arg=" + getArguments());
        EZpvd();
    }

    public final void EZpvd(OrderDetailBean orderDetailBean) {
        AbstractC31528lvi abstractC31528lvi = this.AEQbTJ;
        if (abstractC31528lvi != null) {
            if (orderDetailBean.getCategoryCode() == ChannelCategoryCode.THIRD_PARTY.getCode()) {
                abstractC31528lvi.gEmmrt.copydefault().iwGUEr.setVisibility(8);
                return;
            }
            abstractC31528lvi.gEmmrt.copydefault().iwGUEr.setVisibility(0);
            if (orderDetailBean.getDexOrderDetail() != null) {
                abstractC31528lvi.gEmmrt.copydefault().AkhnZx.setVisibility(0);
                OLrzqt().AEQbTJ(orderDetailBean);
                DexOrderDetailBean dexOrderDetail = orderDetailBean.getDexOrderDetail();
                if (dexOrderDetail != null) {
                    abstractC31528lvi.gEmmrt.copydefault().flVtFt.setText(C31661lzi.appendCryptoSymbol$default(dexOrderDetail.getTotalFee(), dexOrderDetail.getTotalFeeCurrency(), 0, null, null, null, 30, null));
                    return;
                }
                return;
            }
            abstractC31528lvi.gEmmrt.copydefault().AkhnZx.setVisibility(8);
            if (Intrinsics.EZpvd((java.lang.Object) orderDetailBean.getDepositPlatformCode(), (java.lang.Object) ChannelPlatformCode.GOOGLE_PAY.getCode())) {
                abstractC31528lvi.gEmmrt.copydefault().gasjUx.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DDjfYY));
            } else {
                abstractC31528lvi.gEmmrt.copydefault().gasjUx.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.fdOvFl));
            }
            abstractC31528lvi.gEmmrt.copydefault().flVtFt.setText(copydefault(orderDetailBean));
        }
    }

    public final java.lang.String copydefault(OrderDetailBean orderDetailBean) {
        java.lang.String localized$default;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) orderDetailBean.getChannelFee()) && C33129mqd.djBIcL(orderDetailBean.getChannelFee()) > 0.0f) {
            localized$default = pTB.formatDownToFixed$default(pTB.OLrzqt((java.lang.Object) orderDetailBean.getChannelFee()), 2, null, 2, null);
        } else {
            localized$default = pTB.formatLocalized$default("0.00", null, 1, null);
        }
        java.lang.String str = localized$default;
        if (orderDetailBean.getQuoteSymbol().length() == 0) {
            if (C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_NEW_AMOUNT_DISPLAY)) {
                return ((InterfaceC31780mDq) C43251rlk.copydefault(InterfaceC31780mDq.class)).copydefault(new C31775mDl(orderDetailBean.getQuoteCurrencySymbol(), AmountDisplayType.DETAIL, C33129mqd.EZpvd(orderDetailBean.getChannelFee()), false, null, null, 56, null));
            }
            return str + " " + orderDetailBean.getQuoteCurrencySymbol();
        }
        return C31661lzi.prependFiatSymbol$default(str, orderDetailBean.getQuoteCurrencySymbol(), orderDetailBean.getQuoteSymbol(), C38307pTy.Companion.KWHzl(0, 2), null, false, 24, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lTy.setData$default(o.lTy, com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean, java.lang.String, boolean, int, java.lang.Object):void */
    public final void AEQbTJ(OrderDetailBean orderDetailBean) {
        AbstractC31528lvi abstractC31528lvi = this.AEQbTJ;
        if (abstractC31528lvi != null) {
            abstractC31528lvi.copydefault.setVisibility(0);
            abstractC31528lvi.gEmmrt.setVisibility(0);
            abstractC31528lvi.copydefault.setData(orderDetailBean);
            C30313lTt c30313lTt = abstractC31528lvi.gEmmrt;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c30313lTt.setData(orderDetailBean, childFragmentManager);
            EZpvd(orderDetailBean);
            C30318lTy.setData$default(abstractC31528lvi.EZpvd, orderDetailBean, null, this.KWHzl, 2, null);
        }
        BuySellTradeType buySellTradeType = this.AYXKKw;
        if (buySellTradeType != null) {
            KWHzl().EZpvd(buySellTradeType);
        }
    }

    public final void AEQbTJ() {
        if (getActivity() != null) {
            KWHzl().KWHzl().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lTd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lSZ.EZpvd(this.KWHzl, (C32989mnw) obj);
                }
            }));
            KWHzl().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.lTj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return lSZ.OLrzqt(this.EZpvd, (C32989mnw) obj);
                }
            }));
        }
    }

    public static final Unit EZpvd(lSZ lsz, C32989mnw c32989mnw) {
        BuySellOrderDetailViewModel.TaskDescription taskDescription;
        if (c32989mnw != null && (taskDescription = (BuySellOrderDetailViewModel.TaskDescription) c32989mnw.KWHzl()) != null) {
            lsz.copydefault(false);
            if (taskDescription instanceof BuySellOrderDetailViewModel.TaskDescription.ActionBar) {
                lsz.KWHzl(true);
            } else {
                if (!(taskDescription instanceof BuySellOrderDetailViewModel.TaskDescription.StateListAnimator)) {
                    throw new NoWhenBranchMatchedException();
                }
                lsz.KWHzl(false);
                BuySellOrderDetailViewModel.TaskDescription.StateListAnimator stateListAnimator = (BuySellOrderDetailViewModel.TaskDescription.StateListAnimator) taskDescription;
                lsz.KWHzl().copydefault(stateListAnimator.EZpvd(), lsz.AYXKKw);
                lsz.AEQbTJ(stateListAnimator.EZpvd());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(lSZ lsz, C32989mnw c32989mnw) {
        kotlin.Pair pair;
        AbstractC31528lvi abstractC31528lvi;
        C30318lTy c30318lTy;
        if (c32989mnw != null && (pair = (kotlin.Pair) c32989mnw.KWHzl()) != null && (abstractC31528lvi = lsz.AEQbTJ) != null && (c30318lTy = abstractC31528lvi.EZpvd) != null) {
            android.content.Context contextRequireContext = lsz.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c30318lTy.OLrzqt(contextRequireContext, LifecycleOwnerKt.getLifecycleScope(lsz), (SupportService) pair.getFirst(), (OrderDetailBean) pair.getSecond(), lsz.AYXKKw);
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl(boolean z) {
        AbstractC31528lvi abstractC31528lvi = this.AEQbTJ;
        if (abstractC31528lvi != null) {
            if (z) {
                abstractC31528lvi.djBIcL.getRoot().setVisibility(0);
                abstractC31528lvi.AhwBna.setVisibility(8);
                abstractC31528lvi.djBIcL.KWHzl.setImage(C47244tmQ.StateListAnimator.AEQbTJ);
                abstractC31528lvi.djBIcL.KWHzl.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.UlJrfe));
                abstractC31528lvi.djBIcL.KWHzl.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.lTf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        lSZ.valueOf(this.KWHzl, view);
                    }
                });
            } else {
                abstractC31528lvi.djBIcL.getRoot().setVisibility(8);
                abstractC31528lvi.AhwBna.setVisibility(0);
            }
            abstractC31528lvi.valueOf.getRoot().setVisibility(8);
        }
    }

    public static final void valueOf(lSZ lsz, android.view.View view) {
        lsz.EZpvd();
    }

    private final void copydefault(boolean z) {
        AbstractC31528lvi abstractC31528lvi = this.AEQbTJ;
        if (abstractC31528lvi != null) {
            if (z) {
                abstractC31528lvi.valueOf.getRoot().setVisibility(0);
            } else {
                abstractC31528lvi.valueOf.getRoot().setVisibility(8);
            }
            abstractC31528lvi.djBIcL.getRoot().setVisibility(8);
            abstractC31528lvi.AhwBna.setVisibility(8);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lSZ EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BuySellTradeType buySellTradeType, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(buySellTradeType, "");
            lSZ lsz = new lSZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcExtraKeys.ORDER_ID, str);
            bundle.putString("source", str2);
            bundle.putParcelable("trade_type", buySellTradeType);
            bundle.putBoolean("is_from_result_screen", z);
            lsz.setArguments(bundle);
            return lsz;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }
}
