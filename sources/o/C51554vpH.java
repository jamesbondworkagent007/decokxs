package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.biz.TacticsType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.market_place.MarketPlacePresenter;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.HomeBotSquarePresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51554vpH extends AbstractC54505xKx<uPL, HomeBotSquarePresenter> {
    public C47976uAj<C51527voh> KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.DsrFlB;
    }

    public C51554vpH() {
        final Function0 function0 = new Function0() { // from class: o.vpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51554vpH.copydefault(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeBotSquareFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketPlacePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeBotSquareFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeBotSquareFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.HomeBotSquareFragment$special$$inlined$viewModels$default$4
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
    }

    public static final ViewModelStoreOwner copydefault(C51554vpH c51554vpH) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c51554vpH.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final MarketPlacePresenter KWHzl() {
        return (MarketPlacePresenter) this.OLrzqt.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        djBIcL();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AYXKKw() {
        TabLayout.TabView tabView;
        this.KWHzl = new C47976uAj<>(this, dxcTrN().EZpvd(), null, 4, null);
        gGvvIC().OLrzqt.setAdapter(this.KWHzl);
        new TabLayoutMediator(gGvvIC().KWHzl.copydefault(), gGvvIC().OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.vpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C51554vpH.OLrzqt(this.KWHzl, tab, i);
            }
        }).attach();
        java.util.Iterator<C51527voh> it = dxcTrN().EZpvd().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            C51527voh next = it.next();
            if (C56071xvr.gEmmrt.ejfBZ()) {
                if (next.KWHzl() == TacticsType.TACTICS_GRDE) {
                    break;
                } else {
                    i++;
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) next.AEQbTJ(), (java.lang.Object) "FOLLOW")) {
                break;
            } else {
                i++;
            }
        }
        gGvvIC().OLrzqt.setCurrentItem(i, false);
        AEQbTJ();
        int tabCount = gGvvIC().KWHzl.copydefault().getTabCount();
        for (final int i2 = 0; i2 < tabCount; i2++) {
            TabLayout.Tab tabCopydefault = gGvvIC().KWHzl.copydefault(i2);
            if (tabCopydefault != null && (tabView = tabCopydefault.view) != null) {
                tabView.setOnClickListener(new View.OnClickListener() { // from class: o.vpN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C51554vpH.EZpvd(i2, this, view);
                    }
                });
            }
        }
        android.view.View childAt = gGvvIC().OLrzqt.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            ((RecyclerView) childAt).setOverScrollMode(2);
        }
    }

    public static final void OLrzqt(C51554vpH c51554vpH, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.vpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C51554vpH.AEQbTJ(view);
            }
        });
        tab.setText(c51554vpH.dxcTrN().EZpvd().get(i).EZpvd());
    }

    public static final void EZpvd(final int i, final C51554vpH c51554vpH, android.view.View view) {
        if (i == 0) {
            C32866mlf.onEvent$default("TradingBot_BotMarketplace_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vpF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51554vpH.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("TradingBot_BotMarketplace_SelectBotType_Click", (TrackChannel[]) null, new Function1() { // from class: o.vpK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51554vpH.OLrzqt(this.AEQbTJ, i, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        TabLayout.Tab tabCopydefault = c51554vpH.gGvvIC().KWHzl.copydefault(i);
        if (tabCopydefault != null) {
            tabCopydefault.select();
        }
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51554vpH c51554vpH, int i, EventParamsList eventParamsList) {
        TacticsType tacticsTypeKWHzl;
        java.lang.String constant;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C51527voh c51527voh = (C51527voh) CollectionsKt___CollectionsKt.AkhnZx(c51554vpH.dxcTrN().EZpvd(), i);
        EventParamsList.put$default(eventParamsList, "selection", (c51527voh == null || (tacticsTypeKWHzl = c51527voh.KWHzl()) == null || (constant = tacticsTypeKWHzl.getConstant()) == null) ? "" : constant, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, C54589xNz.EZpvd.EZpvd() ? "demo" : "live", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        TabLayout.Tab tabCopydefault = gGvvIC().KWHzl.copydefault(1);
        if (tabCopydefault != null) {
            tabCopydefault.select();
        }
    }

    public final void AEQbTJ() {
        android.view.View childAt = gGvvIC().OLrzqt.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setItemViewCacheSize(dxcTrN().EZpvd().size() - 1);
    }

    private final void djBIcL() {
        C56126xwt<kotlin.Pair<java.lang.Boolean, ParamBuilder>> c56126xwtIsConnected = KWHzl().fetchVPNInfo().isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtIsConnected.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vpM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51554vpH.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        });
    }

    public static final Unit OLrzqt(C51554vpH c51554vpH, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c51554vpH.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        xOR xorCopydefault;
        xOR xorCopydefault2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        C56111xwe<java.lang.Boolean> c56111xweOLrzqt = (interfaceC54581xNrOLrzqt == null || (xorCopydefault2 = interfaceC54581xNrOLrzqt.copydefault()) == null) ? null : xorCopydefault2.OLrzqt();
        if (c56111xweOLrzqt == null || !Intrinsics.EZpvd(c56111xweOLrzqt.getValue(), java.lang.Boolean.FALSE)) {
            pUU.KWHzl(getTAG(), "white list change, updateBotList!");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 != null && (xorCopydefault = interfaceC54581xNrOLrzqt2.copydefault()) != null) {
                xorCopydefault.values();
            }
            dxcTrN().KWHzl();
            C47976uAj<C51527voh> c47976uAj = this.KWHzl;
            if (c47976uAj != null) {
                c47976uAj.OLrzqt();
            }
            C47976uAj<C51527voh> c47976uAj2 = this.KWHzl;
            if (c47976uAj2 != null) {
                c47976uAj2.notifyDataSetChanged();
            }
            AEQbTJ();
        }
    }
}
