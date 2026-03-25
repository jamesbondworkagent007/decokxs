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
import com.okinc.business.dex.trade.order.domain.model.BridgeOrderSubStatus;
import com.okinc.business.dex.trade.order.ui.BridgePagerFragment$setListener$6;
import com.okinc.business.dex.trade.order.ui.BridgePagerFragment$setListener$7;
import com.okinc.business.dex.trade.order.ui.viewmodel.BridgePagerViewModel;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderListViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C22236hbZ;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gZG extends gZW {
    public final InterfaceC56387yDm AEQbTJ;
    public hBR EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    public gZG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BridgePagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gZJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gZG.AhwBna(this.EZpvd);
            }
        });
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.BridgePagerFragment$special$$inlined$activityViewModels$default$3
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

    public final BridgePagerViewModel AEQbTJ() {
        return (BridgePagerViewModel) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C22194hak DbNXlk() {
        return (C22194hak) this.OLrzqt.getValue();
    }

    public static final C22194hak AhwBna(gZG gzg) {
        LifecycleOwner viewLifecycleOwner = gzg.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(false, viewLifecycleOwner, 1, null);
    }

    /* JADX DEBUG: Possible override for method o.gZW.EZpvd()V */
    public final OrderListViewModel EZpvd() {
        return (OrderListViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBR hbrEZpvd = hBR.EZpvd(layoutInflater, viewGroup, false);
        this.EZpvd = hbrEZpvd;
        if (hbrEZpvd != null) {
            return hbrEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        valueOf();
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        hBR hbr = this.EZpvd;
        if (hbr != null && (recyclerView2 = hbr.OLrzqt) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireActivity()));
        }
        DbNXlk().AEQbTJ();
        hBR hbr2 = this.EZpvd;
        if (hbr2 == null || (recyclerView = hbr2.OLrzqt) == null) {
            return;
        }
        recyclerView.setAdapter(DbNXlk());
    }

    @Override // o.AbstractC31214lpm
    public void bc_() {
        BridgePagerViewModel.loadOrderList$default(AEQbTJ(), false, 1, null);
        AEQbTJ().valueOf();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C54989xbV c54989xbV;
        C33546myW c33546myW;
        DbNXlk().AEQbTJ(new Function1() { // from class: o.gZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.KWHzl(this.KWHzl, (C20066gZq) obj);
            }
        });
        DbNXlk().AEQbTJ(new Function0() { // from class: o.gZQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gZG.gEmmrt(this.EZpvd);
            }
        });
        DbNXlk().OLrzqt(new Function0() { // from class: o.gZO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gZG.AkhnZx(this.KWHzl);
            }
        });
        hBR hbr = this.EZpvd;
        if (hbr != null && (c33546myW = hbr.AEQbTJ) != null) {
            c33546myW.OLrzqt((InterfaceC57901yrE) new Activity());
        }
        hBR hbr2 = this.EZpvd;
        if (hbr2 != null && (c54989xbV = hbr2.gEmmrt) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c54989xbV, 0L, new Function1() { // from class: o.gZM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return gZG.AEQbTJ(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BridgePagerFragment$setListener$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BridgePagerFragment$setListener$7(this, null), 3, null);
    }

    public static final Unit KWHzl(gZG gzg, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = gzg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, gzg.EZpvd().OLrzqt(c20066gZq.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(gZG gzg) {
        BridgePagerViewModel.loadOrderList$default(gzg.AEQbTJ(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(gZG gzg) {
        gzg.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC57901yrE {
        public Activity() {
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            gZG.this.AEQbTJ().AEQbTJ();
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            gZG.this.AEQbTJ().KWHzl(false);
        }
    }

    public static final Unit AEQbTJ(final gZG gzg, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C22236hbZ.StateListAnimator stateListAnimator = C22236hbZ.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = gzg.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.onActiveChanged);
        java.util.List<BridgeOrderSubStatus> listGEmmrt = yDY.gEmmrt(BridgeOrderSubStatus.Pending, BridgeOrderSubStatus.Completed, BridgeOrderSubStatus.ReadyToClaim, BridgeOrderSubStatus.Claim, BridgeOrderSubStatus.Cancelling, BridgeOrderSubStatus.Cancelled, BridgeOrderSubStatus.Failed);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (BridgeOrderSubStatus bridgeOrderSubStatus : listGEmmrt) {
            arrayList.add(new C20073gZx(C33070mpX.AYXKKw(bridgeOrderSubStatus.getTextRes()), bridgeOrderSubStatus == gzg.AEQbTJ().OLrzqt(), bridgeOrderSubStatus, false, false, 24, null));
        }
        stateListAnimator.KWHzl(childFragmentManager, new C20054gZe(strAYXKKw, arrayList), new Function1() { // from class: o.gZD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.OLrzqt(this.OLrzqt, (BridgeOrderSubStatus) obj);
            }
        }, new Function0() { // from class: o.gZL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gZG.fetchVPNInfo(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final gZG gzg, final BridgeOrderSubStatus bridgeOrderSubStatus) {
        gzg.AEQbTJ().OLrzqt(bridgeOrderSubStatus);
        gzg.valueOf();
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.gZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.OLrzqt(this.AEQbTJ, bridgeOrderSubStatus, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(gZG gzg, BridgeOrderSubStatus bridgeOrderSubStatus, EventParamsList eventParamsList) {
        java.lang.String trackValue;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", gzg.EZpvd().copydefault() ? "yes" : "no", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "order_status_filter", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_status_filter", false, 4, null);
        if (bridgeOrderSubStatus == null || (trackValue = bridgeOrderSubStatus.getTrackValue()) == null) {
            trackValue = "all";
        }
        EventParamsList.put$default(eventParamsList, "bridge_status_filter", trackValue, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(final gZG gzg) {
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.gZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(gZG gzg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", "bridge_status_filter", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", gzg.EZpvd().copydefault() ? "yes" : "no", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C54989xbV c54989xbV;
        android.widget.TextView textViewEZpvd;
        hBR hbr = this.EZpvd;
        if (hbr == null || (c54989xbV = hbr.gEmmrt) == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
            return;
        }
        BridgeOrderSubStatus bridgeOrderSubStatusOLrzqt = AEQbTJ().OLrzqt();
        java.lang.String strAYXKKw = bridgeOrderSubStatusOLrzqt != null ? C33070mpX.AYXKKw(bridgeOrderSubStatusOLrzqt.getTextRes()) : null;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.zuBGHE);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        textViewEZpvd.setText(strAYXKKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        hBR hbr = this.EZpvd;
        if (hbr != null && (c55113xdn = hbr.KWHzl) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        hBR hbr2 = this.EZpvd;
        if (hbr2 == null || (recyclerView = hbr2.OLrzqt) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    public final void AYXKKw() {
        DefiChainInfo defiChainInfoCopydefault = AEQbTJ().copydefault();
        if (defiChainInfoCopydefault != null) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22206haw.EZpvd(fragmentActivityRequireActivity, defiChainInfoCopydefault.getWalletExplorePrefix(), defiChainInfoCopydefault.getChainId());
            return;
        }
        C22206haw c22206haw2 = C22206haw.copydefault;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        DefiChainInfo defiChainInfoCopydefault2 = EZpvd().copydefault(false);
        java.lang.String chainId = defiChainInfoCopydefault2 != null ? defiChainInfoCopydefault2.getChainId() : null;
        c22206haw2.EZpvd(childFragmentManager, false, chainId != null ? chainId : "", new Function1() { // from class: o.gZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.KWHzl(this.KWHzl, (ChainInfoResult) obj);
            }
        });
    }

    public static final Unit KWHzl(gZG gzg, ChainInfoResult chainInfoResult) {
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        java.lang.String strEZpvd = gzg.EZpvd().EZpvd(chainInfoResult.copydefault());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = gzg.requireActivity();
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
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.gZN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gZG.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(gZG gzg, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page_name", TabTitleInfo.KEY_BRIDGE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", gzg.EZpvd().copydefault() ? "yes" : "no", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AEQbTJ().gEmmrt();
    }
}
