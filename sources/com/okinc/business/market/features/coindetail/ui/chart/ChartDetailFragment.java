package com.okinc.business.market.features.coindetail.ui.chart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.coindetail_liquidity.ui.models.LiquidityFragmentParams;
import com.okinc.business.market.features.filter.ChartDetailSubTabName;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.history.ui.models.HistoryChangeFragmentParams;
import com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams;
import com.okinc.business.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import com.okinc.business.market.features.trader.ui.model.TraderFragmentParams;
import com.okinc.uilab.reminder.OKReminder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C21847hOn;
import o.C21986hTr;
import o.C22620him;
import o.C22621hin;
import o.C2298AGj;
import o.C23271hvA;
import o.C23274hvD;
import o.C23503hzU;
import o.C25382ivf;
import o.C25390ivn;
import o.C26255jXr;
import o.C27722kAy;
import o.C29112knW;
import o.C29731kzF;
import o.C33070mpX;
import o.C33129mqd;
import o.C33546myW;
import o.C33603mza;
import o.C52761wXj;
import o.C55254xgV;
import o.C55298xhM;
import o.C55302xhQ;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.C56548yJl;
import o.C57589ylK;
import o.InterfaceC21868hPh;
import o.InterfaceC22618hik;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57901yrE;
import o.InterfaceC57902yrF;
import o.InterfaceC57934yrl;
import o.hOR;
import o.hPB;
import o.hQM;
import o.hRN;
import o.jOF;
import o.jOH;
import o.jPV;
import o.jYS;
import o.rVN;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChartDetailFragment extends jOF implements hOR {
    public static final Companion Companion = new Companion(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC21868hPh AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public hPB EZpvd;
    public boolean KWHzl;
    public C23503hzU copydefault;
    public int djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public ViewPager2.OnPageChangeCallback fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;
    public boolean AEQbTJ = true;
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.jOD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.hDKMBd(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.jOr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.fIwbmz(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.jOp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.iwGUEr(this.AEQbTJ);
        }
    });
    public final ArrayList<jOH> fARcdN = new ArrayList<>();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hOR
    public int KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC21868hPh interfaceC21868hPh) {
        Intrinsics.checkNotNullParameter(interfaceC21868hPh, "");
        this.AhwBna = interfaceC21868hPh;
    }

    public ChartDetailFragment() {
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$9
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$12
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$15
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenBase fJNWhG() {
        return (TokenBase) this.ejfBZ.getValue();
    }

    public static final TokenBase hDKMBd(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        if (arguments != null) {
            return (TokenBase) arguments.getParcelable("token_base");
        }
        return null;
    }

    public final LatestMarketInfoBean AhwBna() {
        return (LatestMarketInfoBean) this.gEmmrt.getValue();
    }

    public static final LatestMarketInfoBean fIwbmz(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        if (arguments != null) {
            return (LatestMarketInfoBean) ((Parcelable) BundleCompat.getParcelable(arguments, "data", LatestMarketInfoBean.class));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel AkhnZx() {
        return (MarketCoinDetailViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedFilterViewModel fIwbmz() {
        return (SharedFilterViewModel) this.fIwbmz.getValue();
    }

    private final RealtimeDataViewModel AuCTel() {
        return (RealtimeDataViewModel) this.values.getValue();
    }

    private final String fARcdN() {
        return (String) this.DbNXlk.getValue();
    }

    public static final String iwGUEr(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        String string = arguments != null ? arguments.getString("key.page_from") : null;
        return string == null ? "" : string;
    }

    public final MarketCoinDetailViewModel djBIcL() {
        return (MarketCoinDetailViewModel) this.AkhnZx.getValue();
    }

    private final RiskControlViewModel ejfBZ() {
        return (RiskControlViewModel) this.fJNWhG.getValue();
    }

    public final ChartViewModel valueOf() {
        return (ChartViewModel) this.AYXKKw.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23503hzU c23503hzUKWHzl = C23503hzU.KWHzl(layoutInflater, viewGroup, false);
        this.copydefault = c23503hzUKWHzl;
        if (c23503hzUKWHzl != null) {
            return c23503hzUKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getNewProxyInstance();
        LatestMarketInfoBean latestMarketInfoBeanAhwBna = AhwBna();
        if (latestMarketInfoBeanAhwBna != null) {
            iwGUEr();
            hDKMBd();
            getFieldNames();
            AEQbTJ(latestMarketInfoBeanAhwBna);
            EZpvd(latestMarketInfoBeanAhwBna);
            copydefault(latestMarketInfoBeanAhwBna);
            uzCIH();
            fetchVPNInfo();
            AYXKKw();
        }
        view.post(new Runnable() { // from class: o.jOB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ChartDetailFragment.AuCTel(this.EZpvd);
            }
        });
    }

    public static final void AuCTel(ChartDetailFragment chartDetailFragment) {
        rVN.reportFullyDrawn$default((Fragment) chartDetailFragment, true, (String) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[EDGE_INSN: B:46:0x0038->B:15:0x0038 BREAK  A[LOOP:0: B:8:0x0015->B:47:?]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(LatestMarketInfoBean latestMarketInfoBean) {
        boolean z;
        final OKReminder oKReminder;
        Pair pairOLrzqt;
        List<CompactTagData> newTagList = latestMarketInfoBean.getNewTagList();
        if ((newTagList instanceof Collection) && newTagList.isEmpty()) {
            if (ejfBZ().EZpvd() == null) {
            }
        } else {
            Iterator<T> it = newTagList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((CompactTagData) it.next()).copydefault(), (Object) "lowLiquidity")) {
                    break;
                }
            }
            z = ejfBZ().EZpvd() == null;
        }
        this.valueOf = z;
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU == null || (oKReminder = c23503hzU.EZpvd) == null) {
            return;
        }
        oKReminder.setVisibility(z ? 0 : 8);
        if (this.valueOf) {
            if (ejfBZ().EZpvd() != null) {
                C2298AGj c2298AGjEZpvd = ejfBZ().EZpvd();
                String strOLrzqt = c2298AGjEZpvd != null ? c2298AGjEZpvd.OLrzqt() : null;
                C2298AGj c2298AGjEZpvd2 = ejfBZ().EZpvd();
                String strEZpvd = c2298AGjEZpvd2 != null ? c2298AGjEZpvd2.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                pairOLrzqt = C56390yDp.OLrzqt(3, strOLrzqt + ": " + strEZpvd);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(2, C33070mpX.AYXKKw(C23274hvD.Fragment.setPipParamsSourceRectHint));
            }
            int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
            oKReminder.setMessage((String) pairOLrzqt.component2());
            oKReminder.setStyle(iIntValue);
            oKReminder.setCloseIconVisibility(true);
            oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.jOt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.copydefault(oKReminder, this);
                }
            });
            if (ejfBZ().EZpvd() != null) {
                oKReminder.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.shErWi));
                oKReminder.EZpvd().AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.Activity.DQzvGN)));
            }
        }
    }

    public final void EZpvd(final LatestMarketInfoBean latestMarketInfoBean) {
        fIwbmz().AEQbTJ(ChartDetailSubTabName.HISTORY_CHANGE);
        ArrayList arrayList = new ArrayList();
        this.fARcdN.clear();
        if (latestMarketInfoBean.isShowHolderTab()) {
            this.fARcdN.add(new jOH(C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnConfigurationChangedListener), Companion.SubChartTabType.HOLDER, Transformations.map(djBIcL().gEmmrt(), new Function1() { // from class: o.jOs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.EZpvd((java.lang.String) obj);
                }
            })));
            arrayList.add(new Function0() { // from class: o.jOx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.OLrzqt(this.AEQbTJ, latestMarketInfoBean);
                }
            });
        }
        if (latestMarketInfoBean.isShowTraderTab()) {
            this.fARcdN.add(new jOH(C33070mpX.AYXKKw(C23274hvD.Fragment.dhOYXF), Companion.SubChartTabType.TRADER, null, 4, null));
            arrayList.add(new Function0() { // from class: o.jOA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.KWHzl(this.AEQbTJ, latestMarketInfoBean);
                }
            });
        }
        LiveData liveData = null;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.fARcdN.add(new jOH(C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnNewIntentListener), Companion.SubChartTabType.HISTORY, liveData, i, defaultConstructorMarker));
        arrayList.add(new Function0() { // from class: o.jOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartDetailFragment.uzCIH(this.EZpvd);
            }
        });
        this.fARcdN.add(new jOH(C33070mpX.AYXKKw(C23274hvD.Fragment.startActivityForResult), Companion.SubChartTabType.LIQUIDITY, liveData, i, defaultConstructorMarker));
        arrayList.add(new Function0() { // from class: o.jOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartDetailFragment.getFieldNames(this.OLrzqt);
            }
        });
        this.EZpvd = new hPB(this, arrayList);
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU != null) {
            c23503hzU.gEmmrt.copydefault().removeAllTabs();
            c23503hzU.isConnected.setAdapter(this.EZpvd);
            c23503hzU.isConnected.setOffscreenPageLimit(this.fARcdN.size());
            new TabLayoutMediator(c23503hzU.gEmmrt.copydefault(), c23503hzU.isConnected, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.jOC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                    ChartDetailFragment.OLrzqt(this.EZpvd, tab, i2);
                }
            }).attach();
        }
    }

    public static final String EZpvd(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, str, null, 1, null);
    }

    public static final Fragment OLrzqt(ChartDetailFragment chartDetailFragment, LatestMarketInfoBean latestMarketInfoBean) {
        jYS.TaskDescription taskDescription = jYS.Companion;
        TokenBase tokenBaseFJNWhG = chartDetailFragment.fJNWhG();
        String chainId = tokenBaseFJNWhG != null ? tokenBaseFJNWhG.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase tokenBaseFJNWhG2 = chartDetailFragment.fJNWhG();
        String chainName = tokenBaseFJNWhG2 != null ? tokenBaseFJNWhG2.getChainName() : null;
        String str2 = chainName == null ? "" : chainName;
        TokenBase tokenBaseFJNWhG3 = chartDetailFragment.fJNWhG();
        String tokenContractAddress = tokenBaseFJNWhG3 != null ? tokenBaseFJNWhG3.getTokenContractAddress() : null;
        String str3 = tokenContractAddress == null ? "" : tokenContractAddress;
        boolean zOLrzqt = C27722kAy.OLrzqt(latestMarketInfoBean.isSupportHolderExpandData());
        TokenBase tokenBaseFJNWhG4 = chartDetailFragment.fJNWhG();
        String tokenSymbol = tokenBaseFJNWhG4 != null ? tokenBaseFJNWhG4.getTokenSymbol() : null;
        String str4 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase tokenBaseFJNWhG5 = chartDetailFragment.fJNWhG();
        String chainLogoUrl = tokenBaseFJNWhG5 != null ? tokenBaseFJNWhG5.getChainLogoUrl() : null;
        return taskDescription.OLrzqt(new HoldersFragmentParams(str, str2, str3, str4, zOLrzqt, chainLogoUrl == null ? "" : chainLogoUrl, chartDetailFragment.fARcdN()));
    }

    public static final Fragment KWHzl(ChartDetailFragment chartDetailFragment, LatestMarketInfoBean latestMarketInfoBean) {
        C29731kzF.ActionBar actionBar = C29731kzF.Companion;
        TokenBase tokenBaseFJNWhG = chartDetailFragment.fJNWhG();
        String chainId = tokenBaseFJNWhG != null ? tokenBaseFJNWhG.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase tokenBaseFJNWhG2 = chartDetailFragment.fJNWhG();
        String tokenContractAddress = tokenBaseFJNWhG2 != null ? tokenBaseFJNWhG2.getTokenContractAddress() : null;
        String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase tokenBaseFJNWhG3 = chartDetailFragment.fJNWhG();
        String tokenSymbol = tokenBaseFJNWhG3 != null ? tokenBaseFJNWhG3.getTokenSymbol() : null;
        String str3 = tokenSymbol == null ? "" : tokenSymbol;
        String nativeTokenSymbol = latestMarketInfoBean.getNativeTokenSymbol();
        TokenBase tokenBaseFJNWhG4 = chartDetailFragment.fJNWhG();
        String chainLogoUrl = tokenBaseFJNWhG4 != null ? tokenBaseFJNWhG4.getChainLogoUrl() : null;
        String str4 = chainLogoUrl == null ? "" : chainLogoUrl;
        boolean zOLrzqt = C27722kAy.OLrzqt(latestMarketInfoBean.isSupportHolderExpandData());
        String strFARcdN = chartDetailFragment.fARcdN();
        TokenBase tokenBaseFJNWhG5 = chartDetailFragment.fJNWhG();
        String chainName = tokenBaseFJNWhG5 != null ? tokenBaseFJNWhG5.getChainName() : null;
        return actionBar.KWHzl(new TraderFragmentParams(str, str2, str3, nativeTokenSymbol, str4, zOLrzqt, strFARcdN, chainName == null ? "" : chainName));
    }

    public static final Fragment uzCIH(ChartDetailFragment chartDetailFragment) {
        C26255jXr.StateListAnimator stateListAnimator = C26255jXr.Companion;
        TokenBase tokenBaseFJNWhG = chartDetailFragment.fJNWhG();
        String chainId = tokenBaseFJNWhG != null ? tokenBaseFJNWhG.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase tokenBaseFJNWhG2 = chartDetailFragment.fJNWhG();
        String tokenContractAddress = tokenBaseFJNWhG2 != null ? tokenBaseFJNWhG2.getTokenContractAddress() : null;
        String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase tokenBaseFJNWhG3 = chartDetailFragment.fJNWhG();
        String tokenSymbol = tokenBaseFJNWhG3 != null ? tokenBaseFJNWhG3.getTokenSymbol() : null;
        String str3 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase tokenBaseFJNWhG4 = chartDetailFragment.fJNWhG();
        String chainName = tokenBaseFJNWhG4 != null ? tokenBaseFJNWhG4.getChainName() : null;
        String str4 = chainName == null ? "" : chainName;
        TokenBase tokenBaseFJNWhG5 = chartDetailFragment.fJNWhG();
        String chainLogoUrl = tokenBaseFJNWhG5 != null ? tokenBaseFJNWhG5.getChainLogoUrl() : null;
        return stateListAnimator.AEQbTJ(new HistoryChangeFragmentParams(str, str2, str3, str4, null, chainLogoUrl == null ? "" : chainLogoUrl, chartDetailFragment.fARcdN(), 16, null));
    }

    public static final Fragment getFieldNames(ChartDetailFragment chartDetailFragment) {
        jPV.ActionBar actionBar = jPV.Companion;
        TokenBase tokenBaseFJNWhG = chartDetailFragment.fJNWhG();
        String chainId = tokenBaseFJNWhG != null ? tokenBaseFJNWhG.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase tokenBaseFJNWhG2 = chartDetailFragment.fJNWhG();
        String tokenContractAddress = tokenBaseFJNWhG2 != null ? tokenBaseFJNWhG2.getTokenContractAddress() : null;
        String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase tokenBaseFJNWhG3 = chartDetailFragment.fJNWhG();
        String tokenSymbol = tokenBaseFJNWhG3 != null ? tokenBaseFJNWhG3.getTokenSymbol() : null;
        String str3 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase tokenBaseFJNWhG4 = chartDetailFragment.fJNWhG();
        String chainName = tokenBaseFJNWhG4 != null ? tokenBaseFJNWhG4.getChainName() : null;
        return actionBar.EZpvd(new LiquidityFragmentParams(str, str2, str3, chainName == null ? "" : chainName, chartDetailFragment.fARcdN()));
    }

    public static final void OLrzqt(final ChartDetailFragment chartDetailFragment, final TabLayout.Tab tab, final int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(chartDetailFragment.fARcdN.get(i).EZpvd());
        LiveData<String> liveDataKWHzl = chartDetailFragment.fARcdN.get(i).KWHzl();
        if (liveDataKWHzl != null) {
            liveDataKWHzl.observe(chartDetailFragment.getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jOw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.KWHzl(tab, chartDetailFragment, i, (java.lang.String) obj);
                }
            }));
        }
    }

    public static final Unit KWHzl(TabLayout.Tab tab, ChartDetailFragment chartDetailFragment, int i, String str) {
        String str2;
        String strEZpvd = chartDetailFragment.fARcdN.get(i).EZpvd();
        Intrinsics.copydefault((Object) str);
        if (str.length() == 0) {
            str2 = "";
        } else {
            str2 = " (" + str + ")";
        }
        tab.setText(strEZpvd + str2);
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        ViewPager2 viewPager2;
        Unit unit;
        ViewPager2 viewPager22;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.fetchVPNInfo;
        if (onPageChangeCallback != null) {
            C23503hzU c23503hzU = this.copydefault;
            if (c23503hzU == null || (viewPager22 = c23503hzU.isConnected) == null) {
                unit = null;
            } else {
                viewPager22.registerOnPageChangeCallback(onPageChangeCallback);
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        C23503hzU c23503hzU2 = this.copydefault;
        if (c23503hzU2 != null && (viewPager2 = c23503hzU2.isConnected) != null) {
            viewPager2.registerOnPageChangeCallback(stateListAnimator);
        }
        this.fetchVPNInfo = stateListAnimator;
    }

    public static final class StateListAnimator extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ ChartDetailFragment KWHzl;
        public int copydefault = -1;

        public StateListAnimator(ChartDetailFragment chartDetailFragment) {
            this.KWHzl = chartDetailFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ChartDetailSubTabName chartDetailSubTabName;
            if (!ChartDetailFragment.this.AEQbTJ) {
                MarketCoinDetailViewModel marketCoinDetailViewModelAkhnZx = ChartDetailFragment.this.AkhnZx();
                Companion.SubChartTabType subChartTabTypeKWHzl = C21847hOn.KWHzl(ChartDetailFragment.this.fARcdN, i);
                String trackingValue = subChartTabTypeKWHzl != null ? subChartTabTypeKWHzl.getTrackingValue() : null;
                if (trackingValue == null) {
                    trackingValue = "";
                }
                marketCoinDetailViewModelAkhnZx.OLrzqt(trackingValue);
            }
            ChartDetailFragment.this.AEQbTJ = false;
            super.onPageSelected(i);
            SharedFilterViewModel sharedFilterViewModelFIwbmz = ChartDetailFragment.this.fIwbmz();
            hPB hpb = ChartDetailFragment.this.EZpvd;
            Fragment fragmentOLrzqt = hpb != null ? hpb.OLrzqt(i, this.KWHzl) : null;
            if (fragmentOLrzqt instanceof C26255jXr) {
                chartDetailSubTabName = ChartDetailSubTabName.HISTORY_CHANGE;
            } else if (fragmentOLrzqt instanceof jPV) {
                chartDetailSubTabName = ChartDetailSubTabName.LIQUIDITY_CHANGE;
            } else if (fragmentOLrzqt instanceof jYS) {
                chartDetailSubTabName = ChartDetailSubTabName.HOLDERS;
            } else if (fragmentOLrzqt instanceof C29731kzF) {
                chartDetailSubTabName = ChartDetailSubTabName.TRADER;
            } else {
                chartDetailSubTabName = fragmentOLrzqt instanceof C29112knW ? ChartDetailSubTabName.MY_POSITION : ChartDetailSubTabName.NONE;
            }
            sharedFilterViewModelFIwbmz.OLrzqt(chartDetailSubTabName);
            this.copydefault = i;
            TokenBase tokenBaseFJNWhG = ChartDetailFragment.this.fJNWhG();
            if (tokenBaseFJNWhG != null) {
                ChartDetailFragment chartDetailFragment = ChartDetailFragment.this;
                String tokenContractAddress = tokenBaseFJNWhG.getTokenContractAddress();
                String tokenSymbol = tokenBaseFJNWhG.getTokenSymbol();
                Companion.SubChartTabType subChartTabTypeKWHzl2 = C21847hOn.KWHzl(chartDetailFragment.fARcdN, i);
                String trackingValue2 = subChartTabTypeKWHzl2 != null ? subChartTabTypeKWHzl2.getTrackingValue() : null;
                C21847hOn.KWHzl(tokenContractAddress, tokenSymbol, trackingValue2 != null ? trackingValue2 : "", tokenBaseFJNWhG.getChainId(), tokenBaseFJNWhG.getChainName());
            }
        }
    }

    public final int EZpvd(Context context) {
        int iIntValue;
        C21986hTr c21986hTr;
        FragmentActivity activity = getActivity();
        ViewPager2 viewPager2 = activity != null ? (ViewPager2) activity.findViewById(C23274hvD.Application.getToken) : null;
        Integer numValueOf = viewPager2 != null ? Integer.valueOf(viewPager2.getHeight()) : null;
        if (numValueOf != null && numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            int iOLrzqt = OLrzqt();
            FragmentActivity activity2 = getActivity();
            int height = (activity2 == null || (c21986hTr = (C21986hTr) activity2.findViewById(C23274hvD.Application.dvKsVJ)) == null) ? 0 : c21986hTr.getHeight();
            Integer numGEmmrt = yDV.gEmmrt(C55302xhQ.KWHzl(context), 1);
            iIntValue = ((numGEmmrt != null ? numGEmmrt.intValue() : 0) - iOLrzqt) - height;
        }
        return C56548yJl.copydefault(iIntValue - EZpvd(), 0);
    }

    /* JADX DEBUG: Possible override for method o.jOF.OLrzqt()V */
    public final int OLrzqt() {
        Window window;
        View decorView;
        OKReminder oKReminder;
        C33603mza c33603mza;
        C23503hzU c23503hzU = this.copydefault;
        int height = (c23503hzU == null || (c33603mza = c23503hzU.AYXKKw) == null) ? 0 : c33603mza.getHeight();
        C23503hzU c23503hzU2 = this.copydefault;
        if (c23503hzU2 != null && (oKReminder = c23503hzU2.EZpvd) != null && oKReminder.getVisibility() == 0) {
            height += oKReminder.getHeight();
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return height;
        }
        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
        return height + (rootWindowInsets != null ? rootWindowInsets.getSystemWindowInsetTop() + rootWindowInsets.getSystemWindowInsetBottom() : 0);
    }

    public final int EZpvd() {
        C55254xgV c55254xgV;
        C55254xgV c55254xgV2;
        C23503hzU c23503hzU = this.copydefault;
        int iOLrzqt = (c23503hzU == null || (c55254xgV2 = c23503hzU.gEmmrt) == null) ? 0 : c55254xgV2.OLrzqt();
        C23503hzU c23503hzU2 = this.copydefault;
        if (c23503hzU2 != null && (c55254xgV = c23503hzU2.gEmmrt) != null) {
            int paddingTop = c55254xgV.getPaddingTop();
            int paddingBottom = c55254xgV.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = c55254xgV.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return C55298xhM.dp2px$default(C33129mqd.djBIcL(Integer.valueOf(iOLrzqt)), null, 1, null) + paddingTop + paddingBottom + (marginLayoutParams != null ? marginLayoutParams.topMargin + marginLayoutParams.bottomMargin : 0);
        }
        return C55298xhM.dp2px$default(C33129mqd.djBIcL(Integer.valueOf(iOLrzqt)), null, 1, null);
    }

    public final void fetchVPNInfo() {
        ViewPager2 viewPager2;
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU == null || (viewPager2 = c23503hzU.isConnected) == null) {
            return;
        }
        Context context = viewPager2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = EZpvd(context);
        if (iEZpvd <= 0 || viewPager2.getLayoutParams().height == iEZpvd) {
            return;
        }
        viewPager2.getLayoutParams().height = iEZpvd;
        viewPager2.requestLayout();
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChartDetailFragment$observePosition$1(this, null), 3, null);
    }

    private final void hDKMBd() {
        djBIcL().AkhnZx().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartDetailFragment.OLrzqt(this.AEQbTJ, (InterfaceC22618hik) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ChartDetailFragment chartDetailFragment, InterfaceC22618hik interfaceC22618hik) {
        ViewPager2 viewPager2;
        if (interfaceC22618hik != null && (interfaceC22618hik.AEQbTJ() == CoinDetailTabType.CHART.ordinal() || interfaceC22618hik.AEQbTJ() == CoinDetailTabType.INFO.ordinal())) {
            C23503hzU c23503hzU = chartDetailFragment.copydefault;
            if (c23503hzU != null && (viewPager2 = c23503hzU.isConnected) != null) {
                viewPager2.setCurrentItem(interfaceC22618hik.KWHzl());
            }
            if (!(interfaceC22618hik instanceof C22621hin) && !(interfaceC22618hik instanceof C22620him)) {
                chartDetailFragment.djBIcL().KWHzl((InterfaceC22618hik) null);
            }
            chartDetailFragment.gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public final hQM AEQbTJ() {
        Fragment fragment;
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Object next;
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag.KlineContainerFragment");
        hRN hrn = fragmentFindFragmentByTag instanceof hRN ? (hRN) fragmentFindFragmentByTag : null;
        if (hrn == null || (childFragmentManager = hrn.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) {
            fragment = null;
        } else {
            Iterator<T> it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Fragment) next) instanceof hQM) {
                    break;
                }
            }
            fragment = (Fragment) next;
        }
        if (fragment instanceof hQM) {
            return (hQM) fragment;
        }
        return null;
    }

    public static final class ActionBar implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            String tokenContractAddress;
            OKReminder oKReminder;
            String chainId;
            String str = "";
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            ChartViewModel chartViewModelValueOf = ChartDetailFragment.this.valueOf();
            LifecycleOwner viewLifecycleOwner = ChartDetailFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            TokenBase tokenBaseFJNWhG = ChartDetailFragment.this.fJNWhG();
            if (tokenBaseFJNWhG == null || (tokenContractAddress = tokenBaseFJNWhG.getTokenContractAddress()) == null) {
                tokenContractAddress = "";
            }
            TokenBase tokenBaseFJNWhG2 = ChartDetailFragment.this.fJNWhG();
            if (tokenBaseFJNWhG2 != null && (chainId = tokenBaseFJNWhG2.getChainId()) != null) {
                str = chainId;
            }
            chartViewModelValueOf.EZpvd(viewLifecycleOwner, "default_trade", tokenContractAddress, str);
            ChartDetailFragment.this.KWHzl = false;
            C23503hzU c23503hzU = ChartDetailFragment.this.copydefault;
            if (c23503hzU != null && (oKReminder = c23503hzU.EZpvd) != null) {
                oKReminder.setVisibility(ChartDetailFragment.this.valueOf ? 0 : 8);
            }
            ChartDetailFragment.this.djBIcL().AwvSrB();
            hQM hqmAEQbTJ = ChartDetailFragment.this.AEQbTJ();
            if (hqmAEQbTJ != null) {
                hqmAEQbTJ.copydefault(true);
            }
        }
    }

    private final void getFieldNames() {
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU != null) {
            c23503hzU.djBIcL.AhwBna(false);
            c23503hzU.djBIcL.OLrzqt((InterfaceC57901yrE) new ActionBar());
            valueOf().djBIcL().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jOG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.copydefault(this.copydefault, (kotlin.Pair) obj);
                }
            }));
        }
    }

    public static final Unit copydefault(ChartDetailFragment chartDetailFragment, Pair pair) {
        C33546myW c33546myW;
        C23503hzU c23503hzU = chartDetailFragment.copydefault;
        if (c23503hzU != null && (c33546myW = c23503hzU.djBIcL) != null) {
            C57589ylK.KWHzl(c33546myW, false);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(LatestMarketInfoBean latestMarketInfoBean) {
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU != null) {
            getChildFragmentManager().beginTransaction().replace(c23503hzU.OLrzqt.getId(), hRN.Companion.KWHzl(fJNWhG(), latestMarketInfoBean, fARcdN()), "tag.KlineContainerFragment").commitAllowingStateLoss();
            djBIcL().isConnected().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jOu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
                }
            }));
            djBIcL().hDKMBd().setValue(Boolean.TRUE);
        }
    }

    public static final Unit OLrzqt(ChartDetailFragment chartDetailFragment, Pair pair) {
        AppBarLayout appBarLayout;
        Integer numUzCIH;
        int iIntValue = (!((Boolean) pair.getFirst()).booleanValue() || (numUzCIH = chartDetailFragment.djBIcL().uzCIH()) == null) ? ((Number) pair.getSecond()).intValue() : numUzCIH.intValue();
        C23503hzU c23503hzU = chartDetailFragment.copydefault;
        if (c23503hzU != null && (appBarLayout = c23503hzU.AEQbTJ) != null) {
            appBarLayout.scrollTo(0, iIntValue);
        }
        return Unit.INSTANCE;
    }

    private final void getNewProxyInstance() {
        AppBarLayout appBarLayout;
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU == null || (appBarLayout = c23503hzU.AEQbTJ) == null) {
            return;
        }
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.jOv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                ChartDetailFragment.OLrzqt(this.KWHzl, appBarLayout2, i);
            }
        });
    }

    public static final void OLrzqt(ChartDetailFragment chartDetailFragment, AppBarLayout appBarLayout, int i) {
        int iAbs = Math.abs(i);
        if (chartDetailFragment.djBIcL != iAbs) {
            InterfaceC21868hPh interfaceC21868hPh = chartDetailFragment.AhwBna;
            if (interfaceC21868hPh != null) {
                interfaceC21868hPh.OLrzqt(iAbs);
            }
            chartDetailFragment.djBIcL = iAbs;
        }
    }

    public final void gEmmrt() {
        AppBarLayout appBarLayout;
        C23503hzU c23503hzU = this.copydefault;
        if (c23503hzU == null || (appBarLayout = c23503hzU.AEQbTJ) == null) {
            return;
        }
        appBarLayout.setExpanded(false, true);
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            ChartDetailFragment.this.OLrzqt(tokenDetail);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ivn.collectOnViewLifecycle$default(androidx.fragment.app.Fragment, kotlinx.coroutines.flow.Flow, androidx.lifecycle.Lifecycle$State, kotlinx.coroutines.flow.FlowCollector, int, java.lang.Object):kotlinx.coroutines.Job */
    private final void uzCIH() {
        C25390ivn.collectOnViewLifecycle$default(this, AuCTel().EZpvd(), null, new Activity(), 2, null);
    }

    public final void OLrzqt(TokenDetail tokenDetail) {
        boolean z;
        OKReminder oKReminder;
        OKReminder oKReminder2;
        if (this.KWHzl) {
            return;
        }
        if (ejfBZ().OLrzqt()) {
            C23503hzU c23503hzU = this.copydefault;
            if (c23503hzU == null || (oKReminder2 = c23503hzU.EZpvd) == null) {
                return;
            }
            oKReminder2.setVisibility(0);
            return;
        }
        List<TagWrapper> listIsConnected = tokenDetail.isConnected();
        if ((listIsConnected instanceof Collection) && listIsConnected.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = listIsConnected.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((TagWrapper) it.next()).OLrzqt(), (Object) "lowLiquidity")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (this.valueOf != z) {
            C23503hzU c23503hzU2 = this.copydefault;
            if (c23503hzU2 != null && (oKReminder = c23503hzU2.EZpvd) != null) {
                oKReminder.setVisibility(z ? 0 : 8);
            }
            this.valueOf = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        C23503hzU c23503hzU;
        ViewPager2 viewPager22;
        C33546myW c33546myW;
        C23503hzU c23503hzU2 = this.copydefault;
        if (c23503hzU2 != null && (c33546myW = c23503hzU2.djBIcL) != null) {
            c33546myW.KWHzl((InterfaceC57902yrF) null);
            c33546myW.OLrzqt((InterfaceC57901yrE) null);
        }
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.fetchVPNInfo;
        if (onPageChangeCallback != null && (c23503hzU = this.copydefault) != null && (viewPager22 = c23503hzU.isConnected) != null) {
            viewPager22.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.fetchVPNInfo = null;
        C23503hzU c23503hzU3 = this.copydefault;
        if (c23503hzU3 != null && (viewPager2 = c23503hzU3.isConnected) != null) {
            viewPager2.setAdapter(null);
        }
        this.EZpvd = null;
        this.copydefault = null;
        super.onDestroyView();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChartDetailFragment EZpvd(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull MarketConfig marketConfig, @NotNull String str) {
            Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
            Intrinsics.checkNotNullParameter(marketConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            ChartDetailFragment chartDetailFragment = new ChartDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("token_base", tokenBase);
            bundle.putParcelable("data", latestMarketInfoBean);
            bundle.putParcelable("market_config", marketConfig);
            bundle.putString("key.page_from", str);
            chartDetailFragment.setArguments(bundle);
            return chartDetailFragment;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class SubChartTabType {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ SubChartTabType[] $VALUES;
            public static final Activity Companion;
            private final String trackingValue;
            public static final SubChartTabType HOLDER = new SubChartTabType("HOLDER", 0, "holders");
            public static final SubChartTabType TRADER = new SubChartTabType("TRADER", 1, "trader");
            public static final SubChartTabType HISTORY = new SubChartTabType("HISTORY", 2, "history");
            public static final SubChartTabType LIQUIDITY = new SubChartTabType("LIQUIDITY", 3, "liq");
            public static final SubChartTabType POSITION = new SubChartTabType("POSITION", 4, "position");

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ SubChartTabType[] $values() {
                return new SubChartTabType[]{HOLDER, TRADER, HISTORY, LIQUIDITY, POSITION};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<SubChartTabType> getEntries() {
                return $ENTRIES;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTrackingValue() {
                return this.trackingValue;
            }

            private SubChartTabType(String str, int i, String str2) {
                this.trackingValue = str2;
            }

            static {
                SubChartTabType[] subChartTabTypeArr$values = $values();
                $VALUES = subChartTabTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(subChartTabTypeArr$values);
                Companion = new Activity(null);
            }

            public static final class Activity {
                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment.Companion.SubChartTabType.Activity.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Activity() {
                }

                public final SubChartTabType OLrzqt(String str) {
                    SubChartTabType next;
                    Iterator<SubChartTabType> it = SubChartTabType.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) next.getTrackingValue(), (Object) str)) {
                            break;
                        }
                    }
                    return next;
                }
            }

            public static SubChartTabType valueOf(String str) {
                return (SubChartTabType) Enum.valueOf(SubChartTabType.class, str);
            }

            public static SubChartTabType[] values() {
                return (SubChartTabType[]) $VALUES.clone();
            }
        }
    }

    public static final Unit copydefault(OKReminder oKReminder, ChartDetailFragment chartDetailFragment) {
        oKReminder.setVisibility(8);
        chartDetailFragment.KWHzl = true;
        return Unit.INSTANCE;
    }
}
