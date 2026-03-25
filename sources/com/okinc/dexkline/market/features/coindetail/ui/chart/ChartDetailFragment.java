package com.okinc.dexkline.market.features.coindetail.ui.chart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.features.coincheck.CoinCheckViewModel;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.dexkline.market.features.filter.ChartDetailSubTabName;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.history.ui.models.HistoryChangeFragmentParams;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
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
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32312mXi;
import o.C32163mRv;
import o.C32171mSc;
import o.C32296mWt;
import o.C32299mWw;
import o.C32311mXh;
import o.C32383mZz;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33546myW;
import o.C34448ncK;
import o.C34533ndq;
import o.C34663ngO;
import o.C35964oKf;
import o.C36236oUh;
import o.C52761wXj;
import o.C55254xgV;
import o.C55298xhM;
import o.C55302xhQ;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C57589ylK;
import o.InterfaceC32140mQz;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.InterfaceC57901yrE;
import o.InterfaceC57902yrF;
import o.InterfaceC57934yrl;
import o.mQB;
import o.mRG;
import o.mRX;
import o.mRY;
import o.mTF;
import o.mUA;
import o.mUM;
import o.mUN;
import o.mUW;
import o.oNE;
import o.rVN;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ChartDetailFragment extends AbstractC32312mXi implements mRX {
    public static final Companion Companion = new Companion(null);
    public static final int copydefault = 8;
    public int AYXKKw;
    public mRY AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public oNE EZpvd;
    public boolean KWHzl;
    public C32171mSc OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public mUW ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public ViewPager2.OnPageChangeCallback isConnected;
    public boolean valueOf;
    public boolean AEQbTJ = true;
    public final InterfaceC56387yDm hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.mWW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.getFieldNames(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.mWU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.AuCTel(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.mWY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.ejfBZ(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.mWV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ChartDetailFragment.fIwbmz(this.OLrzqt);
        }
    });
    public final ArrayList<C32311mXh> uzCIH = new ArrayList<>();

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mRX
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull mRY mry) {
        Intrinsics.checkNotNullParameter(mry, "");
        this.AhwBna = mry;
    }

    public ChartDetailFragment() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$9
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$12
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$15
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$viewModels$default$5
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$16
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$17
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment$special$$inlined$activityViewModels$default$18
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
        this.ejfBZ = new mUW();
    }

    public static final TokenBase getFieldNames(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        if (arguments != null) {
            return (TokenBase) arguments.getParcelable("token_base");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenBase getNewProxyInstance() {
        return (TokenBase) this.hDKMBd.getValue();
    }

    private final MarketConfig AuCTel() {
        return (MarketConfig) this.values.getValue();
    }

    public static final MarketConfig AuCTel(ChartDetailFragment chartDetailFragment) {
        MarketConfig marketConfig;
        Bundle arguments = chartDetailFragment.getArguments();
        return (arguments == null || (marketConfig = (MarketConfig) ((Parcelable) BundleCompat.getParcelable(arguments, "market_config", MarketConfig.class))) == null) ? new MarketConfig(null, null, null, null, 15, null) : marketConfig;
    }

    /* JADX DEBUG: Possible override for method o.mXi.KWHzl()V */
    public final LatestMarketInfoBean KWHzl() {
        return (LatestMarketInfoBean) this.gEmmrt.getValue();
    }

    public static final LatestMarketInfoBean ejfBZ(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        if (arguments != null) {
            return (LatestMarketInfoBean) ((Parcelable) BundleCompat.getParcelable(arguments, "data", LatestMarketInfoBean.class));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel fJNWhG() {
        return (MarketCoinDetailViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedFilterViewModel hDKMBd() {
        return (SharedFilterViewModel) this.fARcdN.getValue();
    }

    private final RealtimeDataViewModel ejfBZ() {
        return (RealtimeDataViewModel) this.fIwbmz.getValue();
    }

    private final String fARcdN() {
        return (String) this.DbNXlk.getValue();
    }

    public static final String fIwbmz(ChartDetailFragment chartDetailFragment) {
        Bundle arguments = chartDetailFragment.getArguments();
        String string = arguments != null ? arguments.getString("key.page_from") : null;
        return string == null ? "" : string;
    }

    public final MarketCoinDetailViewModel EZpvd() {
        return (MarketCoinDetailViewModel) this.AkhnZx.getValue();
    }

    private final RiskControlViewModel getFieldNames() {
        return (RiskControlViewModel) this.fJNWhG.getValue();
    }

    public final ChartViewModel OLrzqt() {
        return (ChartViewModel) this.djBIcL.getValue();
    }

    private final CoinCheckViewModel uzCIH() {
        return (CoinCheckViewModel) this.AuCTel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNE oneCopydefault = oNE.copydefault(layoutInflater, viewGroup, false);
        this.EZpvd = oneCopydefault;
        if (oneCopydefault != null) {
            return oneCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
        LatestMarketInfoBean latestMarketInfoBeanKWHzl = KWHzl();
        if (latestMarketInfoBeanKWHzl != null) {
            AkhnZx();
            fetchVPNInfo();
            djBIcL();
            KWHzl(latestMarketInfoBeanKWHzl);
            EZpvd(latestMarketInfoBeanKWHzl);
            copydefault(latestMarketInfoBeanKWHzl);
            DbNXlk();
            AhwBna();
        }
        view.post(new Runnable() { // from class: o.mWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ChartDetailFragment.fARcdN(this.KWHzl);
            }
        });
    }

    public static final void fARcdN(ChartDetailFragment chartDetailFragment) {
        rVN.reportFullyDrawn$default((Fragment) chartDetailFragment, true, (String) null, 2, (Object) null);
    }

    public final void AhwBna() {
        final TokenBase newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            CoinCheckViewModel.loadCoinCheckData$default(uzCIH(), newProxyInstance.getTokenContractAddress(), newProxyInstance.getChainId(), false, 4, null);
            uzCIH().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mXd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.AEQbTJ(this.AEQbTJ, newProxyInstance, (C32296mWt) obj);
                }
            }));
        }
    }

    public static final Unit AEQbTJ(ChartDetailFragment chartDetailFragment, TokenBase tokenBase, C32296mWt c32296mWt) {
        Intrinsics.copydefault(c32296mWt);
        chartDetailFragment.OLrzqt(tokenBase, c32296mWt);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(TokenBase tokenBase, C32296mWt c32296mWt) {
        C32299mWw c32299mWwCopydefault = c32296mWt.copydefault();
        if (c32299mWwCopydefault == null) {
            valueOf();
            return;
        }
        Pair<String, String> pairEZpvd = EZpvd(c32299mWwCopydefault);
        String strComponent1 = pairEZpvd.component1();
        String strComponent2 = pairEZpvd.component2();
        if (copydefault(tokenBase, strComponent1, strComponent2)) {
            valueOf();
        } else {
            OLrzqt(tokenBase, strComponent1, strComponent2);
        }
    }

    public final Pair<String, String> EZpvd(C32299mWw c32299mWw) {
        return C56390yDp.OLrzqt(C33129mqd.gEmmrt(c32299mWw.EZpvd()), C33129mqd.gEmmrt(c32299mWw.djBIcL()));
    }

    public final boolean copydefault(TokenBase tokenBase, String str, String str2) {
        return !C36236oUh.EZpvd.EZpvd(AEQbTJ(tokenBase)) || (C33129mqd.valueOf(str, 0) && C33129mqd.valueOf(str2, 0));
    }

    public final void OLrzqt(final TokenBase tokenBase, String str, String str2) {
        OKReminder oKReminder;
        String strAEQbTJ = AEQbTJ(str, str2);
        oNE one = this.EZpvd;
        if (one == null || (oKReminder = one.values) == null) {
            return;
        }
        oKReminder.setVisibility(0);
        oKReminder.setMessage(strAEQbTJ);
        oKReminder.setStyle(0);
        oKReminder.setCloseIconVisibility(true);
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.mWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartDetailFragment.OLrzqt(this.KWHzl, tokenBase);
            }
        });
    }

    public static final Unit OLrzqt(ChartDetailFragment chartDetailFragment, TokenBase tokenBase) {
        chartDetailFragment.valueOf();
        C36236oUh.EZpvd.copydefault(chartDetailFragment.AEQbTJ(tokenBase));
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        OKReminder oKReminder;
        oNE one = this.EZpvd;
        if (one == null || (oKReminder = one.values) == null) {
            return;
        }
        oKReminder.setVisibility(8);
    }

    public final String AEQbTJ(String str, String str2) {
        String percentWithoutSymbol$default = C32163mRv.formatPercentWithoutSymbol$default(str, true, 0, null, false, null, 30, null);
        String percentWithoutSymbol$default2 = C32163mRv.formatPercentWithoutSymbol$default(str2, true, 0, null, false, null, 30, null);
        if (C33129mqd.AEQbTJ(str, 0) && C33129mqd.valueOf(str2, 0)) {
            return C33069mpW.copydefault(C35964oKf.Fragment.svhCHd, C56423yEv.EZpvd(C56390yDp.OLrzqt("buyPercent", percentWithoutSymbol$default)));
        }
        if (C33129mqd.valueOf(str, 0) && C33129mqd.AEQbTJ(str2, 0)) {
            return C33069mpW.copydefault(C35964oKf.Fragment.sIqKDg, C56423yEv.EZpvd(C56390yDp.OLrzqt("sellPercent", percentWithoutSymbol$default2)));
        }
        return C33069mpW.copydefault(C35964oKf.Fragment.FQMcgEfQMcgE, C56424yEw.gEmmrt(C56390yDp.OLrzqt("buyPercent", percentWithoutSymbol$default), C56390yDp.OLrzqt("sellPercent", percentWithoutSymbol$default2)));
    }

    public final String AEQbTJ(TokenBase tokenBase) {
        return tokenBase.getChainId() + "_" + tokenBase.getTokenContractAddress();
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
            if (getFieldNames().copydefault() == null) {
            }
        } else {
            Iterator<T> it = newTagList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((CompactTagData) it.next()).EZpvd(), (Object) "lowLiquidity")) {
                    break;
                }
            }
            z = getFieldNames().copydefault() == null;
        }
        this.valueOf = z;
        oNE one = this.EZpvd;
        if (one == null || (oKReminder = one.KWHzl) == null) {
            return;
        }
        oKReminder.setVisibility(z ? 0 : 8);
        if (this.valueOf) {
            if (getFieldNames().copydefault() != null) {
                C34533ndq c34533ndqCopydefault = getFieldNames().copydefault();
                String strCopydefault = c34533ndqCopydefault != null ? c34533ndqCopydefault.copydefault() : null;
                C34533ndq c34533ndqCopydefault2 = getFieldNames().copydefault();
                String strKWHzl = c34533ndqCopydefault2 != null ? c34533ndqCopydefault2.KWHzl() : null;
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                pairOLrzqt = C56390yDp.OLrzqt(3, strCopydefault + ": " + strKWHzl);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(2, C33070mpX.AYXKKw(C35964oKf.Fragment.cancel));
            }
            int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
            oKReminder.setMessage((String) pairOLrzqt.component2());
            oKReminder.setStyle(iIntValue);
            oKReminder.setCloseIconVisibility(true);
            oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.mXb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.OLrzqt(oKReminder, this);
                }
            });
            if (getFieldNames().copydefault() != null) {
                oKReminder.setLeadingIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.shErWi));
                oKReminder.EZpvd().AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(mUM.copydefault(C52761wXj.Activity.DQzvGN)));
            }
        }
    }

    public final void EZpvd(LatestMarketInfoBean latestMarketInfoBean) {
        ViewPager2 viewPager2;
        int iIntValue;
        mUA mua;
        C55254xgV c55254xgV;
        ViewPager2 viewPager22;
        hDKMBd().EZpvd(ChartDetailSubTabName.HISTORY_CHANGE);
        oNE one = this.EZpvd;
        if (one != null && (viewPager2 = one.isConnected) != null) {
            FragmentActivity activity = getActivity();
            Integer numValueOf = (activity == null || (viewPager22 = (ViewPager2) activity.findViewById(C35964oKf.StateListAnimator.DuQ)) == null) ? null : Integer.valueOf(viewPager22.getHeight());
            int iOLrzqt = 0;
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                int iDp2px$default = C55298xhM.dp2px$default(176.0f, null, 1, null);
                FragmentActivity activity2 = getActivity();
                int height = (activity2 == null || (mua = (mUA) activity2.findViewById(C35964oKf.StateListAnimator.iwGUEr)) == null) ? 0 : mua.getHeight();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                iIntValue = (C55302xhQ.KWHzl(contextRequireContext)[1] - iDp2px$default) - height;
            } else {
                iIntValue = numValueOf.intValue();
            }
            oNE one2 = this.EZpvd;
            if (one2 != null && (c55254xgV = one2.gEmmrt) != null) {
                iOLrzqt = c55254xgV.OLrzqt();
            }
            int iDp2px$default2 = C55298xhM.dp2px$default(C33129mqd.djBIcL(Integer.valueOf(iOLrzqt)), null, 1, null);
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iIntValue - iDp2px$default2;
            }
        }
        ArrayList arrayList = new ArrayList();
        this.uzCIH.clear();
        this.uzCIH.add(new C32311mXh(C33070mpX.AYXKKw(C35964oKf.Fragment.abAflu), Companion.SubChartTabType.HISTORY, null, 4, null));
        arrayList.add(new Function0() { // from class: o.mXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartDetailFragment.getNewProxyInstance(this.KWHzl);
            }
        });
        if (EZpvd().AkhnZx()) {
            this.uzCIH.add(new C32311mXh(C33070mpX.AYXKKw(C35964oKf.Fragment.aVhqwO), Companion.SubChartTabType.POSITION, null, 4, null));
            String tokenContractAddress = latestMarketInfoBean.getTokenContractAddress();
            TokenBase newProxyInstance = getNewProxyInstance();
            String chainId = newProxyInstance != null ? newProxyInstance.getChainId() : null;
            final PositionDetailsParam positionDetailsParam = new PositionDetailsParam(tokenContractAddress, (String) null, chainId == null ? "" : chainId, latestMarketInfoBean.getChainName(), latestMarketInfoBean.getNotSupportTxNativeToken(), latestMarketInfoBean.getTokenSymbol(), "default_trade", false, 130, (DefaultConstructorMarker) null);
            arrayList.add(new Function0() { // from class: o.mWO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.KWHzl(positionDetailsParam, this);
                }
            });
        }
        this.OLrzqt = new C32171mSc(this, arrayList);
        oNE one3 = this.EZpvd;
        if (one3 != null) {
            one3.gEmmrt.copydefault().removeAllTabs();
            one3.isConnected.setAdapter(this.OLrzqt);
            one3.isConnected.setOffscreenPageLimit(this.uzCIH.size());
            new TabLayoutMediator(one3.gEmmrt.copydefault(), one3.isConnected, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.mWM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    ChartDetailFragment.AEQbTJ(this.AEQbTJ, tab, i);
                }
            }).attach();
        }
    }

    public static final Fragment getNewProxyInstance(ChartDetailFragment chartDetailFragment) {
        C32383mZz.Activity activity = C32383mZz.Companion;
        TokenBase newProxyInstance = chartDetailFragment.getNewProxyInstance();
        String chainId = newProxyInstance != null ? newProxyInstance.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase newProxyInstance2 = chartDetailFragment.getNewProxyInstance();
        String tokenContractAddress = newProxyInstance2 != null ? newProxyInstance2.getTokenContractAddress() : null;
        String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase newProxyInstance3 = chartDetailFragment.getNewProxyInstance();
        String tokenSymbol = newProxyInstance3 != null ? newProxyInstance3.getTokenSymbol() : null;
        String str3 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase newProxyInstance4 = chartDetailFragment.getNewProxyInstance();
        String chainName = newProxyInstance4 != null ? newProxyInstance4.getChainName() : null;
        String str4 = chainName == null ? "" : chainName;
        TokenBase newProxyInstance5 = chartDetailFragment.getNewProxyInstance();
        String chainLogoUrl = newProxyInstance5 != null ? newProxyInstance5.getChainLogoUrl() : null;
        return activity.KWHzl(new HistoryChangeFragmentParams(str, str2, str3, str4, null, chainLogoUrl == null ? "" : chainLogoUrl, 16, null));
    }

    public static final Fragment KWHzl(PositionDetailsParam positionDetailsParam, ChartDetailFragment chartDetailFragment) {
        return C34448ncK.Companion.AEQbTJ(positionDetailsParam, chartDetailFragment.AuCTel());
    }

    public static final void AEQbTJ(final ChartDetailFragment chartDetailFragment, final TabLayout.Tab tab, final int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(chartDetailFragment.uzCIH.get(i).KWHzl());
        LiveData<String> liveDataOLrzqt = chartDetailFragment.uzCIH.get(i).OLrzqt();
        if (liveDataOLrzqt != null) {
            liveDataOLrzqt.observe(chartDetailFragment.getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mWL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.OLrzqt(tab, chartDetailFragment, i, (java.lang.String) obj);
                }
            }));
        }
    }

    public static final Unit OLrzqt(TabLayout.Tab tab, ChartDetailFragment chartDetailFragment, int i, String str) {
        String str2;
        String strKWHzl = chartDetailFragment.uzCIH.get(i).KWHzl();
        Intrinsics.copydefault((Object) str);
        if (str.length() == 0) {
            str2 = "";
        } else {
            str2 = " (" + str + ")";
        }
        tab.setText(strKWHzl + str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AkhnZx() {
        ViewPager2 viewPager2;
        Unit unit;
        ViewPager2 viewPager22;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.isConnected;
        if (onPageChangeCallback == null) {
            ActionBar actionBar = new ActionBar(this);
            oNE one = this.EZpvd;
            if (one != null && (viewPager2 = one.isConnected) != null) {
                viewPager2.registerOnPageChangeCallback(actionBar);
            }
            this.isConnected = actionBar;
        } else {
            oNE one2 = this.EZpvd;
            if (one2 == null || (viewPager22 = one2.isConnected) == null) {
                unit = null;
            } else {
                viewPager22.registerOnPageChangeCallback(onPageChangeCallback);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
            }
        }
        Pair<Boolean, LatestMarketInfoBean> value = fJNWhG().AhwBna().getValue();
        final LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        TokenBase newProxyInstance = getNewProxyInstance();
        String tokenContractAddress = newProxyInstance != null ? newProxyInstance.getTokenContractAddress() : null;
        String str = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase newProxyInstance2 = getNewProxyInstance();
        String tokenSymbol = newProxyInstance2 != null ? newProxyInstance2.getTokenSymbol() : null;
        String str2 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase newProxyInstance3 = getNewProxyInstance();
        String chainId = newProxyInstance3 != null ? newProxyInstance3.getChainId() : null;
        String str3 = chainId == null ? "" : chainId;
        TokenBase newProxyInstance4 = getNewProxyInstance();
        mRG.AEQbTJ(str, str2, str3, C34663ngO.AEQbTJ(newProxyInstance4 != null ? newProxyInstance4.getChainName() : null, new Function0() { // from class: o.mWZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChartDetailFragment.AEQbTJ(second);
            }
        }), "chart", "activities", fARcdN(), (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? null : null);
    }

    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public int OLrzqt = -1;
        public final /* synthetic */ ChartDetailFragment copydefault;

        public ActionBar(ChartDetailFragment chartDetailFragment) {
            this.copydefault = chartDetailFragment;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ChartDetailSubTabName chartDetailSubTabName;
            ChartDetailFragment.this.fJNWhG().copydefault(mRG.AEQbTJ(ChartDetailFragment.this.uzCIH, i));
            super.onPageSelected(i);
            SharedFilterViewModel sharedFilterViewModelHDKMBd = ChartDetailFragment.this.hDKMBd();
            C32171mSc c32171mSc = ChartDetailFragment.this.OLrzqt;
            Fragment fragmentAEQbTJ = c32171mSc != null ? c32171mSc.AEQbTJ(i, this.copydefault) : null;
            if (fragmentAEQbTJ instanceof C32383mZz) {
                chartDetailSubTabName = ChartDetailSubTabName.HISTORY_CHANGE;
            } else {
                chartDetailSubTabName = fragmentAEQbTJ instanceof C34448ncK ? ChartDetailSubTabName.MY_POSITION : ChartDetailSubTabName.NONE;
            }
            sharedFilterViewModelHDKMBd.KWHzl(chartDetailSubTabName);
            this.OLrzqt = i;
        }
    }

    public static final String AEQbTJ(LatestMarketInfoBean latestMarketInfoBean) {
        String chainName = latestMarketInfoBean != null ? latestMarketInfoBean.getChainName() : null;
        return chainName == null ? "" : chainName;
    }

    public final void fetchVPNInfo() {
        EZpvd().gEmmrt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartDetailFragment.EZpvd(this.copydefault, (InterfaceC32140mQz) obj);
            }
        }));
    }

    public static final Unit EZpvd(ChartDetailFragment chartDetailFragment, InterfaceC32140mQz interfaceC32140mQz) {
        ViewPager2 viewPager2;
        if (interfaceC32140mQz != null && (interfaceC32140mQz.KWHzl() == CoinDetailTabType.CHART.ordinal() || interfaceC32140mQz.KWHzl() == CoinDetailTabType.INFO.ordinal())) {
            oNE one = chartDetailFragment.EZpvd;
            if (one != null && (viewPager2 = one.isConnected) != null) {
                viewPager2.setCurrentItem(interfaceC32140mQz.copydefault());
            }
            if (!(interfaceC32140mQz instanceof mQB)) {
                chartDetailFragment.EZpvd().KWHzl((InterfaceC32140mQz) null);
            }
            chartDetailFragment.AYXKKw();
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        oNE one = this.EZpvd;
        if (one != null) {
            one.djBIcL.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.getNewProxyInstance);
            one.valueOf.KWHzl((InterfaceC57902yrF) this.ejfBZ);
            this.ejfBZ.KWHzl(new Function0() { // from class: o.mWP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ChartDetailFragment.iwGUEr(this.AEQbTJ);
                }
            });
            one.valueOf.AhwBna(false);
            one.valueOf.OLrzqt((InterfaceC57901yrE) new StateListAnimator());
            OLrzqt().AYXKKw().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mWQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.copydefault(this.OLrzqt, (kotlin.Pair) obj);
                }
            }));
        }
    }

    public static final Unit iwGUEr(ChartDetailFragment chartDetailFragment) {
        Pair<Boolean, LatestMarketInfoBean> value = chartDetailFragment.OLrzqt().AYXKKw().getValue();
        if (value != null) {
            value.getFirst().booleanValue();
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            String tokenContractAddress;
            OKReminder oKReminder;
            String chainId;
            String str = "";
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            ChartViewModel chartViewModelOLrzqt = ChartDetailFragment.this.OLrzqt();
            LifecycleOwner viewLifecycleOwner = ChartDetailFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            TokenBase newProxyInstance = ChartDetailFragment.this.getNewProxyInstance();
            if (newProxyInstance == null || (tokenContractAddress = newProxyInstance.getTokenContractAddress()) == null) {
                tokenContractAddress = "";
            }
            TokenBase newProxyInstance2 = ChartDetailFragment.this.getNewProxyInstance();
            if (newProxyInstance2 != null && (chainId = newProxyInstance2.getChainId()) != null) {
                str = chainId;
            }
            chartViewModelOLrzqt.OLrzqt(viewLifecycleOwner, "default_trade", tokenContractAddress, str);
            ChartDetailFragment.this.KWHzl = false;
            oNE one = ChartDetailFragment.this.EZpvd;
            if (one != null && (oKReminder = one.KWHzl) != null) {
                oKReminder.setVisibility(ChartDetailFragment.this.valueOf ? 0 : 8);
            }
            ChartDetailFragment.this.EZpvd().getFieldNames();
        }
    }

    public static final Unit copydefault(ChartDetailFragment chartDetailFragment, Pair pair) {
        C33546myW c33546myW;
        oNE one = chartDetailFragment.EZpvd;
        if (one != null && (c33546myW = one.valueOf) != null) {
            C57589ylK.KWHzl(c33546myW, false);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(LatestMarketInfoBean latestMarketInfoBean) {
        oNE one = this.EZpvd;
        if (one != null) {
            getChildFragmentManager().beginTransaction().replace(one.EZpvd.getId(), mTF.Companion.OLrzqt(getNewProxyInstance(), latestMarketInfoBean, fARcdN()), "tag.KlineContainerFragment").commitAllowingStateLoss();
            EZpvd().values().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.mWT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ChartDetailFragment.KWHzl(this.KWHzl, (kotlin.Pair) obj);
                }
            }));
            EZpvd().fJNWhG().setValue(Boolean.TRUE);
        }
    }

    public static final Unit KWHzl(ChartDetailFragment chartDetailFragment, Pair pair) {
        AppBarLayout appBarLayout;
        Integer numFARcdN;
        int iIntValue = (!((Boolean) pair.getFirst()).booleanValue() || (numFARcdN = chartDetailFragment.EZpvd().fARcdN()) == null) ? ((Number) pair.getSecond()).intValue() : numFARcdN.intValue();
        oNE one = chartDetailFragment.EZpvd;
        if (one != null && (appBarLayout = one.AEQbTJ) != null) {
            appBarLayout.scrollTo(0, iIntValue);
        }
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        AppBarLayout appBarLayout;
        oNE one = this.EZpvd;
        if (one == null || (appBarLayout = one.AEQbTJ) == null) {
            return;
        }
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.mWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                ChartDetailFragment.AEQbTJ(this.EZpvd, appBarLayout2, i);
            }
        });
    }

    public static final void AEQbTJ(ChartDetailFragment chartDetailFragment, AppBarLayout appBarLayout, int i) {
        int iAbs = Math.abs(i);
        if (chartDetailFragment.AYXKKw != iAbs) {
            mRY mry = chartDetailFragment.AhwBna;
            if (mry != null) {
                mry.copydefault(iAbs);
            }
            chartDetailFragment.AYXKKw = iAbs;
        }
    }

    public final void AYXKKw() {
        AppBarLayout appBarLayout;
        oNE one = this.EZpvd;
        if (one == null || (appBarLayout = one.AEQbTJ) == null) {
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
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            ChartDetailFragment.this.copydefault(tokenDetail);
            return Unit.INSTANCE;
        }
    }

    public final void DbNXlk() {
        mUN.collectOnViewLifecycle$default(this, ejfBZ().OLrzqt(), null, new Activity(), 2, null);
    }

    public final void copydefault(TokenDetail tokenDetail) {
        boolean z;
        OKReminder oKReminder;
        OKReminder oKReminder2;
        if (this.KWHzl) {
            return;
        }
        if (getFieldNames().OLrzqt()) {
            oNE one = this.EZpvd;
            if (one == null || (oKReminder2 = one.KWHzl) == null) {
                return;
            }
            oKReminder2.setVisibility(0);
            return;
        }
        List<TagWrapper> listFetchVPNInfo = tokenDetail.fetchVPNInfo();
        if (!C33129mqd.KWHzl((Collection) listFetchVPNInfo)) {
            listFetchVPNInfo = null;
        }
        if (listFetchVPNInfo == null) {
            z = this.valueOf;
        } else if (listFetchVPNInfo.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = listFetchVPNInfo.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((Object) ((TagWrapper) it.next()).KWHzl(), (Object) "lowLiquidity")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (this.valueOf != z) {
            oNE one2 = this.EZpvd;
            if (one2 != null && (oKReminder = one2.KWHzl) != null) {
                oKReminder.setVisibility(z ? 0 : 8);
            }
            this.valueOf = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        oNE one;
        ViewPager2 viewPager22;
        this.ejfBZ.AEQbTJ();
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.isConnected;
        if (onPageChangeCallback != null && (one = this.EZpvd) != null && (viewPager22 = one.isConnected) != null) {
            viewPager22.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.isConnected = null;
        oNE one2 = this.EZpvd;
        if (one2 != null && (viewPager2 = one2.isConnected) != null) {
            viewPager2.setAdapter(null);
        }
        this.OLrzqt = null;
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChartDetailFragment KWHzl(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull MarketConfig marketConfig, @NotNull String str) {
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
            public static final SubChartTabType HOLDER = new SubChartTabType("HOLDER", 0);
            public static final SubChartTabType TRADER = new SubChartTabType("TRADER", 1);
            public static final SubChartTabType HISTORY = new SubChartTabType("HISTORY", 2);
            public static final SubChartTabType LIQUIDITY = new SubChartTabType("LIQUIDITY", 3);
            public static final SubChartTabType POSITION = new SubChartTabType("POSITION", 4);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ SubChartTabType[] $values() {
                return new SubChartTabType[]{HOLDER, TRADER, HISTORY, LIQUIDITY, POSITION};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<SubChartTabType> getEntries() {
                return $ENTRIES;
            }

            private SubChartTabType(String str, int i) {
            }

            static {
                SubChartTabType[] subChartTabTypeArr$values = $values();
                $VALUES = subChartTabTypeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(subChartTabTypeArr$values);
            }

            public static SubChartTabType valueOf(String str) {
                return (SubChartTabType) Enum.valueOf(SubChartTabType.class, str);
            }

            public static SubChartTabType[] values() {
                return (SubChartTabType[]) $VALUES.clone();
            }
        }
    }

    public static final Unit OLrzqt(OKReminder oKReminder, ChartDetailFragment chartDetailFragment) {
        oKReminder.setVisibility(8);
        chartDetailFragment.KWHzl = true;
        return Unit.INSTANCE;
    }
}
