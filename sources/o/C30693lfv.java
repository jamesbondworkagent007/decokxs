package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.NonScrollableLinearLayoutManager;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import com.okinc.business.trade.features.home.ui.cefi.data.FilterValue;
import com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilter;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC30561ldV;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28226kTo;
import o.InterfaceC30608leP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30693lfv extends AbstractC30652lfG<C21666hHv> implements InterfaceC30586ldu, InterfaceC30608leP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public View.OnLayoutChangeListener copydefault;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.lfv$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderFilter.values().length];
            try {
                iArr[OrderFilter.Volume.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFilter.Amount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21666hHv copydefault(C30693lfv c30693lfv) {
        return (C21666hHv) c30693lfv.fARcdN();
    }

    public C30693lfv() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMarketInfoVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$3
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
        final Function0 function02 = new Function0() { // from class: o.lfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30693lfv.gEmmrt(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMainVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$viewModels$default$4
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedPlaceOrderVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketInfoFragment$special$$inlined$activityViewModels$default$6
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.lfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30693lfv.AEQbTJ();
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.lfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30693lfv.AkhnZx(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.lfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C30693lfv.DbNXlk(this.AEQbTJ));
            }
        });
    }

    /* JADX INFO: renamed from: o.lfv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lfv.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C30693lfv EZpvd() {
            return new C30693lfv();
        }
    }

    public final AdvancedMarketInfoVM OLrzqt() {
        return (AdvancedMarketInfoVM) this.KWHzl.getValue();
    }

    private final AdvancedMainVM fetchVPNInfo() {
        return (AdvancedMainVM) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(C30693lfv c30693lfv) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30693lfv.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final AdvancedPlaceOrderVM fJNWhG() {
        return (AdvancedPlaceOrderVM) this.AYXKKw.getValue();
    }

    public final kMM AhwBna() {
        return (kMM) this.AEQbTJ.getValue();
    }

    public static final kMM AEQbTJ() {
        kMM kmm = new kMM();
        kmm.register(C28230kTs.class, new C30654lfI());
        return kmm;
    }

    public final NonScrollableLinearLayoutManager gEmmrt() {
        return (NonScrollableLinearLayoutManager) this.djBIcL.getValue();
    }

    public static final NonScrollableLinearLayoutManager AkhnZx(C30693lfv c30693lfv) {
        return new NonScrollableLinearLayoutManager(c30693lfv.requireContext());
    }

    public static final int DbNXlk(C30693lfv c30693lfv) {
        android.content.Context contextRequireContext = c30693lfv.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C30565ldZ.copydefault(contextRequireContext);
    }

    public final int AYXKKw() {
        return ((java.lang.Number) this.AhwBna.getValue()).intValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21666hHv OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21666hHv c21666hHvCopydefault = C21666hHv.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21666hHvCopydefault, "");
        return c21666hHvCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21666hHv c21666hHv, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21666hHv, "");
        OLrzqt().OLrzqt(fetchVPNInfo().AEQbTJ().getValue());
        OLrzqt().AYXKKw();
        OLrzqt().OLrzqt();
        AEQbTJ(c21666hHv);
        uzCIH();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.lfC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C30693lfv.AYXKKw(this.KWHzl);
                }
            });
        }
    }

    public static final void AYXKKw(C30693lfv c30693lfv) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30693lfv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC30608leP
    public void KWHzl(@NotNull InterfaceC30619lea interfaceC30619lea, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        Intrinsics.checkNotNullParameter(krm, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP != null) {
            interfaceC30608leP.KWHzl(interfaceC30619lea, krm);
        }
    }

    @Override // o.InterfaceC30608leP
    public void copydefault(@NotNull java.lang.String str, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(krm, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP != null) {
            interfaceC30608leP.copydefault(str, krm);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(C55276xgr c55276xgr) {
        android.widget.TextView textView;
        java.lang.String strAYXKKw;
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        OrderFilter orderFilter = objOLrzqt instanceof OrderFilter ? (OrderFilter) objOLrzqt : null;
        if (orderFilter == null) {
            orderFilter = OrderFilter.Volume;
        }
        OLrzqt().AEQbTJ(orderFilter);
        AbstractC59533zio<?, ?> abstractC59533zioCopydefault = AhwBna().getTypePool().copydefault(0);
        C30654lfI c30654lfI = abstractC59533zioCopydefault instanceof C30654lfI ? (C30654lfI) abstractC59533zioCopydefault : null;
        if (c30654lfI != null) {
            c30654lfI.AEQbTJ(orderFilter);
        }
        AhwBna().notifyDataSetChanged();
        C21666hHv c21666hHv = (C21666hHv) fARcdN();
        if (c21666hHv == null || (textView = c21666hHv.gEmmrt) == null) {
            return;
        }
        int i = StateListAnimator.OLrzqt[orderFilter.ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.OFqMGB);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.OAjjVP);
        }
        textView.setText(strAYXKKw);
    }

    public final void EZpvd(C55276xgr c55276xgr) {
        AEQbTJ(new C55276xgr("", OrderFilter.Volume, null, false, false, null, null, 124, null));
        AdvancedMarketInfoVM advancedMarketInfoVMOLrzqt = OLrzqt();
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        FilterValue filterValue = objOLrzqt instanceof FilterValue ? (FilterValue) objOLrzqt : null;
        if (filterValue == null) {
            filterValue = new FilterValue(null, null, null, null, 15, null);
        }
        advancedMarketInfoVMOLrzqt.EZpvd(filterValue);
    }

    @Override // o.InterfaceC30586ldu
    public void KWHzl() {
        OLrzqt().OLrzqt(fetchVPNInfo().AEQbTJ().getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        android.widget.TextView textView;
        C21666hHv c21666hHv = (C21666hHv) fARcdN();
        if (c21666hHv == null || (textView = c21666hHv.djBIcL) == null) {
            return;
        }
        textView.setText(C33069mpW.copydefault(this, C23274hvD.Fragment.znKlvJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("unit", C23272hvB.KWHzl.OLrzqt().getIsoCode()))));
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        OLrzqt().isConnected();
        super.onStop();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        hHF hhf;
        C55258xgZ c55258xgZ;
        android.widget.TextView textView;
        android.widget.LinearLayout linearLayout;
        RecyclerView recyclerView;
        C21666hHv c21666hHv;
        RecyclerView recyclerView2;
        View.OnLayoutChangeListener onLayoutChangeListener = this.copydefault;
        if (onLayoutChangeListener != null && (c21666hHv = (C21666hHv) fARcdN()) != null && (recyclerView2 = c21666hHv.AhwBna) != null) {
            recyclerView2.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.copydefault = null;
        C21666hHv c21666hHv2 = (C21666hHv) fARcdN();
        if (c21666hHv2 != null && (recyclerView = c21666hHv2.AhwBna) != null) {
            recyclerView.setAdapter(null);
        }
        C21666hHv c21666hHv3 = (C21666hHv) fARcdN();
        if (c21666hHv3 != null && (linearLayout = c21666hHv3.KWHzl) != null) {
            linearLayout.setOnClickListener(null);
        }
        C21666hHv c21666hHv4 = (C21666hHv) fARcdN();
        if (c21666hHv4 != null && (textView = c21666hHv4.valueOf) != null) {
            textView.setOnClickListener(null);
        }
        C21666hHv c21666hHv5 = (C21666hHv) fARcdN();
        if (c21666hHv5 != null && (hhf = c21666hHv5.EZpvd) != null && (c55258xgZ = hhf.EZpvd) != null) {
            c55258xgZ.setOnClickListener(null);
        }
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.lfv$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C30693lfv.this.OLrzqt().OLrzqt(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        RecyclerView recyclerView;
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().AEQbTJ(), null, new PendingIntent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().gEmmrt(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().djBIcL(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().valueOf(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().KWHzl(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fJNWhG().DTwDnp(), null, new TaskStackBuilder(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().AEQbTJ(), null, new SharedElementCallback(), 2, null);
        this.copydefault = new View.OnLayoutChangeListener() { // from class: o.lfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C30693lfv.copydefault(this.copydefault, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        C21666hHv c21666hHv = (C21666hHv) fARcdN();
        if (c21666hHv == null || (recyclerView = c21666hHv.AhwBna) == null) {
            return;
        }
        recyclerView.addOnLayoutChangeListener(this.copydefault);
    }

    /* JADX INFO: renamed from: o.lfv$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C30693lfv.this.OLrzqt().KWHzl(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lfv$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28222kTk c28222kTk, Continuation<? super Unit> continuation) {
            C30693lfv.this.copydefault(c28222kTk);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lfv$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28226kTo interfaceC28226kTo, Continuation<? super Unit> continuation) {
            C21666hHv c21666hHvCopydefault = C30693lfv.copydefault(C30693lfv.this);
            if (c21666hHvCopydefault != null) {
                C30693lfv.this.AEQbTJ(c21666hHvCopydefault, interfaceC28226kTo);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lfv$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C55276xgr> list, Continuation<? super Unit> continuation) {
            C30693lfv.this.EZpvd(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lfv$TaskStackBuilder */
    public static final class TaskStackBuilder<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AdvancedTradeType advancedTradeType, Continuation<? super Unit> continuation) {
            C30693lfv.this.OLrzqt().copydefault(advancedTradeType);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.lfv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C30693lfv OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30693lfv c30693lfv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c30693lfv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.valueOf();
            }
        }
    }

    /* JADX INFO: renamed from: o.lfv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C30693lfv KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C30693lfv c30693lfv) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c30693lfv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi23));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.onLoadChildren));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
                InterfaceC30608leP.ActionBar.trackEvent$default(this.KWHzl, AbstractC30561ldV.PendingIntent.copydefault, null, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.lfv$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C30693lfv EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30693lfv c30693lfv) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c30693lfv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.djBIcL();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C30693lfv c30693lfv, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C21666hHv c21666hHv;
        if (i8 - i6 == i4 - i2 || (c21666hHv = (C21666hHv) c30693lfv.fARcdN()) == null) {
            return;
        }
        c30693lfv.AEQbTJ(c21666hHv, c30693lfv.OLrzqt().valueOf().getValue());
    }

    public final void AEQbTJ(C21666hHv c21666hHv, InterfaceC28226kTo interfaceC28226kTo) {
        if (c21666hHv.AhwBna.getHeight() == 0) {
            return;
        }
        int height = (int) (c21666hHv.AhwBna.getHeight() / (AYXKKw() + C55298xhM.dp$default(5.0f, (android.content.Context) null, 1, (java.lang.Object) null)));
        C55173xeu c55173xeu = c21666hHv.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC28226kTo instanceof InterfaceC28226kTo.TaskDescription ? 0 : 8);
        RecyclerView recyclerView = c21666hHv.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        boolean z = interfaceC28226kTo instanceof InterfaceC28226kTo.ActionBar;
        recyclerView.setVisibility((!z || ((InterfaceC28226kTo.ActionBar) interfaceC28226kTo).EZpvd().isEmpty()) ? 4 : 0);
        if (interfaceC28226kTo instanceof InterfaceC28226kTo.Activity) {
            c21666hHv.copydefault.KWHzl(0L);
        } else {
            c21666hHv.copydefault.copydefault();
        }
        if (z) {
            java.util.List<C28230kTs> listEZpvd = ((InterfaceC28226kTo.ActionBar) interfaceC28226kTo).EZpvd();
            java.util.List<?> items = AhwBna().getItems();
            Intrinsics.copydefault(items, "");
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd, (java.lang.Iterable) items), height);
            C55173xeu c55173xeu2 = c21666hHv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(listAhwBna.isEmpty() ? 0 : 8);
            RecyclerView recyclerView2 = c21666hHv.AhwBna;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            recyclerView2.setVisibility(listAhwBna.isEmpty() ? 4 : 0);
            kMM.setData$default(AhwBna(), listAhwBna, null, 2, null);
            return;
        }
        kMM.setData$default(AhwBna(), yDY.AhwBna(), null, 2, null);
    }

    public final void AEQbTJ(C21666hHv c21666hHv) {
        hHF hhf = c21666hHv.EZpvd;
        hhf.AhwBna.setText("--");
        hhf.AhwBna.setContentDescription("web3_dex_advance_orderbook_mcap");
        hhf.AYXKKw.setText("--");
        hhf.AYXKKw.setContentDescription("web3_dex_advance_orderbook_liquidity");
        C55258xgZ c55258xgZ = hhf.EZpvd;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        AppCompatTextView appCompatTextView = hhf.OLrzqt;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        appCompatTextView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, "0", false, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_Y, null));
        hhf.OLrzqt.setContentDescription("web3_dex_advance_orderbook_price");
        hhf.KWHzl.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, "0", false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
        hhf.copydefault.setText("--");
        hhf.copydefault.setContentDescription("web3_dex_advance_orderbook_change");
        RecyclerView recyclerView = c21666hHv.AhwBna;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(gEmmrt());
        recyclerView.setAdapter(AhwBna());
        recyclerView.setHasFixedSize(true);
        C55173xeu c55173xeu = c21666hHv.OLrzqt;
        android.widget.ImageView imageViewCopydefault = c55173xeu.copydefault();
        ViewGroup.LayoutParams layoutParams = imageViewCopydefault.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C55298xhM.dp2px$default(50.0f, null, 1, null);
            layoutParams.height = C55298xhM.dp2px$default(50.0f, null, 1, null);
            imageViewCopydefault.setLayoutParams(layoutParams);
            c55173xeu.OLrzqt().setTextAppearance(C52761wXj.LoaderManager.DTwDnp);
            c21666hHv.djBIcL.setText(C33069mpW.copydefault(this, C23274hvD.Fragment.znKlvJ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("unit", c23272hvB.OLrzqt().getIsoCode()))));
            c21666hHv.KWHzl.setContentDescription("web3_dex_advance_orderbook_dimension_filter");
            android.widget.LinearLayout linearLayout = c21666hHv.KWHzl;
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this));
            c21666hHv.valueOf.setContentDescription("web3_dex_advance_orderbook_pricerange_filter");
            android.widget.TextView textView = c21666hHv.valueOf;
            textView.setOnClickListener(new Activity(textView, 1000L, this));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C28222kTk c28222kTk) {
        hHF hhf;
        int iTradeRiseDefault$default;
        C21666hHv c21666hHv = (C21666hHv) fARcdN();
        if (c21666hHv == null || (hhf = c21666hHv.EZpvd) == null) {
            return;
        }
        android.widget.TextView textView = hhf.AhwBna;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        textView.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28222kTk.EZpvd(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        hhf.AYXKKw.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28222kTk.KWHzl(), true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null));
        hhf.OLrzqt.requestLayout();
        hhf.OLrzqt.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28222kTk.copydefault(), false, null, false, false, false, true, null, false, false, 475, null));
        hhf.KWHzl.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28222kTk.copydefault(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null));
        hhf.copydefault.setText(c28222kTk.AEQbTJ());
        if (C59449zhJ.startsWith$default(c28222kTk.AEQbTJ(), "-", false, 2, null)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            iTradeRiseDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp, contextRequireContext, 0.0f, 2, null);
        } else {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp2, contextRequireContext2, 0.0f, 2, null);
        }
        hhf.copydefault.setTextColor(iTradeRiseDefault$default);
        hhf.OLrzqt.setTextColor(iTradeRiseDefault$default);
    }

    public final void djBIcL() {
        C30690lfs c30690lfsOLrzqt = C30690lfs.Companion.OLrzqt(AdvancedMarketFilter.SWITCH_FILTER, new Function1() { // from class: o.lfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30693lfv.AEQbTJ(this.AEQbTJ, (C55276xgr) obj);
            }
        });
        if (c30690lfsOLrzqt.isAdded()) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30690lfsOLrzqt.show(childFragmentManager);
    }

    public static final Unit AEQbTJ(C30693lfv c30693lfv, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c30693lfv.AEQbTJ(c55276xgr);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.util.List<C55276xgr> list) {
        C21666hHv c21666hHv;
        android.widget.TextView textView;
        java.lang.Object next;
        EZpvd(!list.isEmpty());
        if (list.isEmpty() || (c21666hHv = (C21666hHv) fARcdN()) == null || (textView = c21666hHv.valueOf) == null) {
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((C55276xgr) next).AEQbTJ()) {
                    break;
                }
            }
        }
        C55276xgr c55276xgr = (C55276xgr) next;
        textView.setText(C33129mqd.gEmmrt(c55276xgr != null ? c55276xgr.AhwBna() : null));
    }

    public final void valueOf() {
        C30690lfs c30690lfsOLrzqt = C30690lfs.Companion.OLrzqt(AdvancedMarketFilter.AMOUNTS_FILTER, new Function1() { // from class: o.lfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30693lfv.KWHzl(this.AEQbTJ, (C55276xgr) obj);
            }
        });
        if (c30690lfsOLrzqt.isAdded()) {
            return;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30690lfsOLrzqt.show(childFragmentManager);
    }

    public static final Unit KWHzl(C30693lfv c30693lfv, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c30693lfv.EZpvd(c55276xgr);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C21666hHv c21666hHv = (C21666hHv) fARcdN();
        if (c21666hHv != null && (textView2 = c21666hHv.valueOf) != null) {
            textView2.setEnabled(z);
        }
        C21666hHv c21666hHv2 = (C21666hHv) fARcdN();
        if (c21666hHv2 == null || (textView = c21666hHv2.valueOf) == null) {
            return;
        }
        textView.setClickable(z);
    }

    /* JADX INFO: renamed from: o.lfv$SharedElementCallback */
    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C55276xgr> list, Continuation<? super Unit> continuation) {
            T next;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                if (((C55276xgr) next).AEQbTJ()) {
                    break;
                }
            }
            C55276xgr c55276xgr = next;
            if (c55276xgr != null) {
                C30693lfv.this.AEQbTJ(c55276xgr);
            }
            return Unit.INSTANCE;
        }
    }
}
