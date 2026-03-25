package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.ChangedTokenInfoUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.LiquidityPoolListingUIItem;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.coindetail_liquidity.domain.TokenChange;
import com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityViewModel;
import com.okinc.business.market.features.coindetail_liquidity.ui.models.LiquidityFragmentParams;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C21964hSw;
import o.C23274hvD;
import o.jPR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPV extends jPY {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public C26061jQm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public hAG fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    public static final void OLrzqt(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.zYHWMc;
    }

    public jPV() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LiquidityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$3
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail_liquidity.ui.LiquidityChangeFragment$special$$inlined$activityViewModels$default$9
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

    public final LiquidityFragmentParams AYXKKw() {
        LiquidityFragmentParams liquidityFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (liquidityFragmentParams = (LiquidityFragmentParams) BundleCompat.getParcelable(arguments, "key.liquidity_change_params", LiquidityFragmentParams.class)) == null) ? new LiquidityFragmentParams(null, null, null, null, null, 31, null) : liquidityFragmentParams;
    }

    public final LiquidityViewModel AhwBna() {
        return (LiquidityViewModel) this.DbNXlk.getValue();
    }

    private final MarketCoinDetailViewModel values() {
        return (MarketCoinDetailViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.jPY.EZpvd()V */
    public final OverviewViewModel EZpvd() {
        return (OverviewViewModel) this.valueOf.getValue();
    }

    public final MarketCoinDetailViewModel gEmmrt() {
        return (MarketCoinDetailViewModel) this.values.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        LatestMarketInfoBean second;
        Intrinsics.checkNotNullParameter(view, "");
        this.fetchVPNInfo = hAG.OLrzqt(view);
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = values().valueOf().getValue();
        java.lang.String liquidity = (value == null || (second = value.getSecond()) == null) ? null : second.getLiquidity();
        if (liquidity == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) liquidity)) {
            valueOf();
            return;
        }
        fetchVPNInfo();
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().AYXKKw(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().AEQbTJ(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().gEmmrt(), null, new StateListAnimator(), 2, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C26069jQu c26069jQu, Continuation<? super Unit> continuation) {
            jPV.this.AEQbTJ(c26069jQu);
            return Unit.INSTANCE;
        }
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26072jQx> list, Continuation<? super Unit> continuation) {
            jPV.this.EZpvd(list);
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26072jQx> list, Continuation<? super Unit> continuation) {
            jPV.this.KWHzl(list);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        LatestMarketInfoBean second;
        super.onResume();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = values().valueOf().getValue();
        java.lang.String liquidity = (value == null || (second = value.getSecond()) == null) ? null : second.getLiquidity();
        if (liquidity == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) liquidity)) {
            return;
        }
        if (AhwBna().AYXKKw().getValue().KWHzl()) {
            AhwBna().AhwBna();
            AhwBna().EZpvd("", true);
        } else {
            LiquidityViewModel.subscribeWs$default(AhwBna(), null, 1, null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AhwBna().isConnected();
    }

    private final void fetchVPNInfo() {
        isConnected();
        hAG hag = this.fetchVPNInfo;
        if (hag != null) {
            hag.KWHzl.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            hag.KWHzl.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            hag.KWHzl.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            hag.KWHzl.setEmptyTypeImage(8);
            hag.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.jQb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jPV.OLrzqt(this.copydefault, view);
                }
            });
        }
    }

    public static final void OLrzqt(jPV jpv, android.view.View view) {
        jpv.AhwBna().EZpvd("", true);
    }

    public final void valueOf() {
        C55173xeu c55173xeu;
        hAG hag = this.fetchVPNInfo;
        if (hag != null && (c55173xeu = hag.KWHzl) != null) {
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.access001));
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setRetry("");
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jPX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    jPV.OLrzqt(view);
                }
            });
        }
        hAG hag2 = this.fetchVPNInfo;
        if (hag2 != null) {
            C55173xeu c55173xeu2 = hag2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(0);
            C55113xdn c55113xdn = hag2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(8);
            RecyclerView recyclerView = hag2.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(8);
        }
    }

    public final void AEQbTJ(C26069jQu c26069jQu) {
        C26061jQm c26061jQm;
        hAG hag = this.fetchVPNInfo;
        if (hag != null) {
            C55113xdn c55113xdn = hag.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c26069jQu.AEQbTJ() || c26069jQu.KWHzl() ? 0 : 8);
            C55173xeu c55173xeu = hag.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(c26069jQu.OLrzqt() != null ? 0 : 8);
            RecyclerView recyclerView = hag.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (!c26069jQu.AEQbTJ() && c26069jQu.OLrzqt() == null) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            if (c26069jQu.EZpvd() && (c26061jQm = this.AYXKKw) != null) {
                c26061jQm.AhwBna();
            }
            if (c26069jQu.OLrzqt() != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
    }

    public final void isConnected() {
        RecyclerView recyclerView;
        C26052jQd c26052jQdKWHzl = C26052jQd.Companion.KWHzl(AYXKKw());
        Function1 function1 = new Function1() { // from class: o.jQc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jPV.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        };
        Function1 function12 = new Function1() { // from class: o.jQe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jPV.AEQbTJ(this.KWHzl, (C26072jQx) obj);
            }
        };
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.AYXKKw = new C26061jQm(function1, function12, childFragmentManager, c26052jQdKWHzl, "tag.liquidity_header_fragment");
        hAG hag = this.fetchVPNInfo;
        if (hag == null || (recyclerView = hag.copydefault) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.AYXKKw);
        recyclerView.addOnScrollListener(new Activity());
    }

    public static final Unit EZpvd(jPV jpv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = jpv.getContext();
        if (context != null) {
            C25352ivB.KWHzl(context, str);
        }
        java.lang.String strAEQbTJ = jpv.AYXKKw().AEQbTJ();
        java.lang.String strEZpvd = jpv.AYXKKw().EZpvd();
        java.lang.String strKWHzl = jpv.AYXKKw().KWHzl();
        java.lang.String strCopydefault = jpv.AYXKKw().copydefault();
        java.lang.String strOLrzqt = jpv.AYXKKw().OLrzqt();
        java.lang.String newProxyInstance = jpv.gEmmrt().getNewProxyInstance();
        TokenDetailClickLayer tokenDetailClickLayer = TokenDetailClickLayer.COMPONENTS;
        C21847hOn.trackDexMarketTokenPageClick$default(strCopydefault, strOLrzqt, strKWHzl, strEZpvd, CoinDetailTabType.CHART, strAEQbTJ, null, null, ChartDetailFragment.Companion.SubChartTabType.LIQUIDITY, null, null, null, null, null, null, TokenDetailButtonName.LIQUIDITY_DETAIL, null, newProxyInstance, tokenDetailClickLayer, null, null, jpv.EZpvd().djBIcL(), 1670848, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jPV jpv, C26072jQx c26072jQx) {
        Intrinsics.checkNotNullParameter(c26072jQx, "");
        jpv.OLrzqt(c26072jQx);
        return Unit.INSTANCE;
    }

    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            boolean z = true;
            jPV.this.AhwBna = true;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int itemCount = linearLayoutManager.getItemCount();
            if (!jPV.this.AhwBna().AYXKKw().getValue().AEQbTJ() && !jPV.this.AhwBna().AYXKKw().getValue().gEmmrt()) {
                z = false;
            }
            if (!jPV.this.AhwBna().AYXKKw().getValue().copydefault() || z || itemCount > iFindLastVisibleItemPosition + 4) {
                return;
            }
            jPV.this.djBIcL();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                jPV.this.AhwBna = false;
            } else if (i == 1 || i == 2) {
                jPV.this.AhwBna = true;
            }
        }
    }

    public final void djBIcL() {
        C26072jQx c26072jQx;
        java.lang.String strKWHzl;
        java.util.List<C26072jQx> value = AhwBna().AEQbTJ().getValue();
        if (value == null || (c26072jQx = (C26072jQx) CollectionsKt___CollectionsKt.wlaJM(value)) == null || (strKWHzl = c26072jQx.KWHzl()) == null) {
            return;
        }
        AhwBna().EZpvd(strKWHzl, AhwBna().AYXKKw().getValue().copydefault());
    }

    public final void EZpvd(java.util.List<C26072jQx> list) {
        if (list != null) {
            TokenFilter tokenFilterEZpvd = AhwBna().EZpvd();
            boolean zEZpvd = Intrinsics.EZpvd(tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : AhwBna().KWHzl().DbNXlk(), (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), AhwBna().KWHzl());
            C26061jQm c26061jQm = this.AYXKKw;
            if (c26061jQm != null) {
                c26061jQm.copydefault(!zEZpvd, new Function0() { // from class: o.jPZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jPV.AEQbTJ(this.KWHzl);
                    }
                });
            }
            C26061jQm c26061jQm2 = this.AYXKKw;
            if (c26061jQm2 != null) {
                kLH.updateList$default(c26061jQm2, list, false, null, 6, null);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(jPV jpv) {
        jpv.AhwBna().values();
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<C26072jQx> list) {
        java.util.List<C26072jQx> listAhwBna;
        if (list.isEmpty() || this.AhwBna) {
            return;
        }
        C26061jQm c26061jQm = this.AYXKKw;
        if (c26061jQm == null || (listAhwBna = c26061jQm.djBIcL()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) listAhwBna);
        C26061jQm c26061jQm2 = this.AYXKKw;
        if (c26061jQm2 != null) {
            kLH.updateList$default(c26061jQm2, listDjBIcL, false, null, 6, null);
        }
        LiquidityViewModel liquidityViewModelAhwBna = AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C26072jQx) it.next()).KWHzl());
        }
        liquidityViewModelAhwBna.EZpvd(arrayList);
    }

    public final void OLrzqt(C26072jQx c26072jQx) {
        java.lang.String strKWHzl = AYXKKw().KWHzl();
        java.util.List<TokenChange> listEZpvd = c26072jQx.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (TokenChange tokenChange : listEZpvd) {
            arrayList.add(new ChangedTokenInfoUIItem(tokenChange.KWHzl(), tokenChange.AEQbTJ()));
        }
        java.lang.String strOLrzqt = c26072jQx.OLrzqt();
        java.lang.String strAEQbTJ = c26072jQx.AEQbTJ();
        java.lang.String strCopydefault = c26072jQx.copydefault();
        java.lang.String strCopydefault2 = AYXKKw().copydefault();
        java.lang.String strDjBIcL = c26072jQx.djBIcL();
        java.lang.String value = c26072jQx.valueOf().getValue();
        jPR.TaskDescription taskDescription = jPR.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C21964hSw.ActionBar.newInstance$default(C21964hSw.Companion, null, new LiquidityPoolListingUIItem(strKWHzl, arrayList, strOLrzqt, strAEQbTJ, strCopydefault, strCopydefault2, strDjBIcL, value, taskDescription.copydefault(contextRequireContext, c26072jQx.valueOf()), c26072jQx.AhwBna(), c26072jQx.AYXKKw()), 1, null).show(getParentFragmentManager(), "javaClass");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        this.AYXKKw = null;
        hAG hag = this.fetchVPNInfo;
        if (hag != null && (recyclerView = hag.copydefault) != null) {
            recyclerView.setAdapter(null);
        }
        this.fetchVPNInfo = null;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jPV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final jPV EZpvd(@NotNull LiquidityFragmentParams liquidityFragmentParams) {
            Intrinsics.checkNotNullParameter(liquidityFragmentParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.liquidity_change_params", liquidityFragmentParams);
            jPV jpv = new jPV();
            jpv.setArguments(bundle);
            return jpv;
        }
    }
}
