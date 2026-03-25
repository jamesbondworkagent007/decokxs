package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.ui.TradesPagerFragment$setListener$6;
import com.okinc.business.dex.trade.order.ui.TradesPagerFragment$setListener$7;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderListViewModel;
import com.okinc.business.dex.trade.order.ui.viewmodel.TradesPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C22236hbZ;
import o.C23274hvD;
import o.InterfaceC20070gZu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22241hbe extends gZT {
    public hBR AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public C22241hbe() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradesPagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.TradesPagerFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22241hbe.AhwBna(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderListViewModel gEmmrt() {
        return (OrderListViewModel) this.valueOf.getValue();
    }

    public final TradesPagerViewModel AYXKKw() {
        return (TradesPagerViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C22194hak AhwBna() {
        return (C22194hak) this.gEmmrt.getValue();
    }

    public static final C22194hak AhwBna(C22241hbe c22241hbe) {
        LifecycleOwner viewLifecycleOwner = c22241hbe.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(false, viewLifecycleOwner, 1, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBR hbrEZpvd = hBR.EZpvd(layoutInflater, viewGroup, false);
        this.AhwBna = hbrEZpvd;
        if (hbrEZpvd != null) {
            return hbrEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        DbNXlk();
        djBIcL();
    }

    private final void djBIcL() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        hBR hbr = this.AhwBna;
        if (hbr != null && (recyclerView3 = hbr.OLrzqt) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(requireActivity()));
        }
        hBR hbr2 = this.AhwBna;
        if (hbr2 != null && (recyclerView2 = hbr2.OLrzqt) != null) {
            recyclerView2.addItemDecoration(new C22202has(false));
        }
        AhwBna().AEQbTJ();
        hBR hbr3 = this.AhwBna;
        if (hbr3 == null || (recyclerView = hbr3.OLrzqt) == null) {
            return;
        }
        recyclerView.setAdapter(AhwBna());
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C54989xbV c54989xbV;
        C33546myW c33546myW;
        AhwBna().AEQbTJ(new Function1() { // from class: o.hbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.EZpvd(this.EZpvd, (C20066gZq) obj);
            }
        });
        AhwBna().AEQbTJ(new Function0() { // from class: o.hbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22241hbe.djBIcL(this.AEQbTJ);
            }
        });
        AhwBna().OLrzqt(new Function0() { // from class: o.hbl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22241hbe.DbNXlk(this.OLrzqt);
            }
        });
        hBR hbr = this.AhwBna;
        if (hbr != null && (c33546myW = hbr.AEQbTJ) != null) {
            c33546myW.OLrzqt((InterfaceC57901yrE) new ActionBar());
        }
        hBR hbr2 = this.AhwBna;
        if (hbr2 != null && (c54989xbV = hbr2.gEmmrt) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c54989xbV, 0L, new Function1() { // from class: o.hbk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22241hbe.copydefault(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradesPagerFragment$setListener$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TradesPagerFragment$setListener$7(this, null), 3, null);
    }

    public static final Unit EZpvd(C22241hbe c22241hbe, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = c22241hbe.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, c22241hbe.gEmmrt().OLrzqt(c20066gZq.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C22241hbe c22241hbe) {
        TradesPagerViewModel.loadOrderList$default(c22241hbe.AYXKKw(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C22241hbe c22241hbe) {
        c22241hbe.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.hbe$ActionBar */
    public static final class ActionBar implements InterfaceC57901yrE {
        public ActionBar() {
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C22241hbe.this.AYXKKw().OLrzqt();
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C22241hbe.this.AYXKKw().KWHzl(false);
        }
    }

    public static final Unit copydefault(final C22241hbe c22241hbe, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C22236hbZ.StateListAnimator stateListAnimator = C22236hbZ.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = c22241hbe.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatSessionFlags);
        java.util.List<OrderSubStatus> listGEmmrt = yDY.gEmmrt(OrderSubStatus.Completed, OrderSubStatus.Failed);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (OrderSubStatus orderSubStatus : listGEmmrt) {
            arrayList.add(new C20073gZx(C33070mpX.AYXKKw(orderSubStatus.getFilterTextRes()), orderSubStatus == c22241hbe.AYXKKw().copydefault(), orderSubStatus, false, false, 24, null));
        }
        stateListAnimator.KWHzl(childFragmentManager, new C20054gZe(strAYXKKw, arrayList), new Function1() { // from class: o.hbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.EZpvd(this.KWHzl, (OrderSubStatus) obj);
            }
        }, new Function0() { // from class: o.hbj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22241hbe.AkhnZx(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final C22241hbe c22241hbe, final OrderSubStatus orderSubStatus) {
        c22241hbe.AYXKKw().OLrzqt(orderSubStatus);
        c22241hbe.DbNXlk();
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.hbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.AEQbTJ(this.KWHzl, orderSubStatus, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C22241hbe c22241hbe, OrderSubStatus orderSubStatus, EventParamsList eventParamsList) {
        java.lang.String trackValue;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", c22241hbe.gEmmrt().copydefault() ? "yes" : "no", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "order_status_filter", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "trades_status_filter", false, 4, null);
        if (orderSubStatus == null || (trackValue = orderSubStatus.getTrackValue()) == null) {
            trackValue = "all";
        }
        EventParamsList.put$default(eventParamsList, "trades_status_filter", trackValue, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(final C22241hbe c22241hbe) {
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hbc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C22241hbe c22241hbe, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "trades_status_filter", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", c22241hbe.gEmmrt().copydefault() ? "yes" : "no", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    @Override // o.AbstractC31214lpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bc_() {
        android.content.Intent intent;
        FragmentActivity activity = getActivity();
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("chain_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() <= 0 || Intrinsics.EZpvd((java.lang.Object) stringExtra, (java.lang.Object) "chain_id_all_network")) {
            InterfaceC20070gZu value = gEmmrt().KWHzl().getValue();
            if (!Intrinsics.EZpvd(value, InterfaceC20070gZu.StateListAnimator.copydefault)) {
                if (!(value instanceof InterfaceC20070gZu.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!((InterfaceC20070gZu.Application) value).OLrzqt()) {
                    TradesPagerViewModel.loadOrderList$default(AYXKKw(), false, 1, null);
                }
            }
        }
        AYXKKw().djBIcL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        hBR hbr = this.AhwBna;
        if (hbr != null && (c55113xdn = hbr.KWHzl) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        hBR hbr2 = this.AhwBna;
        if (hbr2 == null || (recyclerView = hbr2.OLrzqt) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    private final void DbNXlk() {
        C54989xbV c54989xbV;
        android.widget.TextView textViewEZpvd;
        hBR hbr = this.AhwBna;
        if (hbr == null || (c54989xbV = hbr.gEmmrt) == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
            return;
        }
        OrderSubStatus orderSubStatusCopydefault = AYXKKw().copydefault();
        java.lang.String strAYXKKw = orderSubStatusCopydefault != null ? C33070mpX.AYXKKw(orderSubStatusCopydefault.getFilterTextRes()) : null;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.zuBGHE);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        textViewEZpvd.setText(strAYXKKw);
    }

    private final void isConnected() {
        DefiChainInfo defiChainInfoEZpvd = AYXKKw().EZpvd();
        if (defiChainInfoEZpvd != null) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22206haw.EZpvd(fragmentActivityRequireActivity, defiChainInfoEZpvd.getWalletExplorePrefix(), defiChainInfoEZpvd.getChainId());
            return;
        }
        C22206haw c22206haw2 = C22206haw.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        DefiChainInfo defiChainInfoCopydefault = gEmmrt().copydefault(false);
        java.lang.String chainId = defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getChainId() : null;
        c22206haw2.EZpvd(childFragmentManager, false, chainId != null ? chainId : "", new Function1() { // from class: o.hbn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.copydefault(this.copydefault, (ChainInfoResult) obj);
            }
        });
    }

    public static final Unit copydefault(C22241hbe c22241hbe, ChainInfoResult chainInfoResult) {
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        java.lang.String strEZpvd = c22241hbe.gEmmrt().EZpvd(chainInfoResult.copydefault());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = c22241hbe.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22206haw.EZpvd(fragmentActivityRequireActivity, strEZpvd, chainInfoResult.copydefault());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onVisible() {
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.hbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22241hbe.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C22241hbe c22241hbe, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "trades", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", c22241hbe.gEmmrt().copydefault() ? "yes" : "no", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AYXKKw().gEmmrt();
    }
}
