package com.okinc.business.dexui.main.market.detail.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.api.bean.CoinDetailRedirection;
import com.okinc.business.dex.api.bean.RedirectionType;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinSharedViewModel;
import com.okinc.business.dexlogic.track.enums.KlineType;
import com.okinc.business.dexlogic.track.enums.TradeType;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment;
import com.okinc.business.market.common.marketconfig.domain.BannerConfig;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.overview.domain.MemeInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.PositionsQuickViewModel;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.business.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.features.tag.ui.TagStaticDataParams;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractActivityC33041mov;
import o.AbstractC21883hPw;
import o.AbstractC58185ywX;
import o.C21847hOn;
import o.C21882hPv;
import o.C21911hQx;
import o.C21949hSh;
import o.C21986hTr;
import o.C22361hds;
import o.C22398hec;
import o.C22620him;
import o.C22691hkD;
import o.C23274hvD;
import o.C23313hvq;
import o.C25352ivB;
import o.C25382ivf;
import o.C25389ivm;
import o.C25390ivn;
import o.C25392ivp;
import o.C25632jAp;
import o.C28385kZl;
import o.C29063kma;
import o.C29095knF;
import o.C29112knW;
import o.C29154koL;
import o.C29717kys;
import o.C31200lpY;
import o.C31256lqb;
import o.C33057mpK;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55113xdn;
import o.C55173xeu;
import o.C55254xgV;
import o.C55296xhK;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C58156yvv;
import o.C9706bae;
import o.InterfaceC13655dTj;
import o.InterfaceC21867hPg;
import o.InterfaceC21868hPh;
import o.InterfaceC22618hik;
import o.InterfaceC28415kaO;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.hAJ;
import o.hPC;
import o.kCM;
import o.kCQ;
import o.kCW;
import o.kKG;
import o.kNA;
import o.pUU;
import o.rVN;
import o.xVW;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketDetailFragment extends hPC<hAJ> implements InterfaceC21868hPh, kCQ, InterfaceC13655dTj {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public boolean AYXKKw;
    public kCM AhwBna;
    public InterfaceC21867hPg AkhnZx;
    public boolean DbNXlk;

    @yCM
    public C9706bae deeplinkReferralCodeHandler;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final PendingIntent fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm getNewProxyInstance;
    public AbstractC21883hPw isConnected;
    public TokenBase uzCIH;
    public final List<Function1<LatestMarketInfoBean, Unit>> valueOf;
    public final InterfaceC56387yDm values;

    @yCM
    public kKG walletUseCase;
    public final InterfaceC56387yDm getFieldNames = C31200lpY.copydefault(this);
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.hQu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MarketDetailFragment.sSMYrx(this.AEQbTJ);
        }
    });

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RedirectionType.values().length];
            try {
                iArr[RedirectionType.TRADER_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String AYXKKw() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull InterfaceC21867hPg interfaceC21867hPg) {
        Intrinsics.checkNotNullParameter(interfaceC21867hPg, "");
        this.AkhnZx = interfaceC21867hPg;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hAJ ejfBZ(MarketDetailFragment marketDetailFragment) {
        return (hAJ) marketDetailFragment.aX_();
    }

    public MarketDetailFragment() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$9
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$12
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$viewModels$default$2
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsQuickViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$viewModels$default$5
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$special$$inlined$activityViewModels$default$15
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
        this.valueOf = new ArrayList();
        this.AYXKKw = true;
        this.fJNWhG = new PendingIntent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String AubY() {
        return (String) this.getFieldNames.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zsXlph() {
        return (String) this.AuCTel.getValue();
    }

    public static final String sSMYrx(MarketDetailFragment marketDetailFragment) {
        Bundle arguments = marketDetailFragment.getArguments();
        return C31256lqb.KWHzl(arguments != null ? arguments.getString("key.page_from") : null, (Function0<String>) new Function0() { // from class: o.hPQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.AYXKKw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel iwGUEr() {
        return (MarketCoinDetailViewModel) this.fetchVPNInfo.getValue();
    }

    private final RealtimeDataViewModel wlaJM() {
        return (RealtimeDataViewModel) this.fARcdN.getValue();
    }

    public final MarketCoinSharedViewModel values() {
        return (MarketCoinSharedViewModel) this.values.getValue();
    }

    public final RiskControlViewModel ejfBZ() {
        return (RiskControlViewModel) this.getNewProxyInstance.getValue();
    }

    public final PositionsQuickViewModel isConnected() {
        return (PositionsQuickViewModel) this.fIwbmz.getValue();
    }

    private final OverviewViewModel AuCTelauCTel() {
        return (OverviewViewModel) this.ejfBZ.getValue();
    }

    public final kKG fIwbmz() {
        kKG kkg = this.walletUseCase;
        if (kkg != null) {
            return kkg;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C9706bae AkhnZx() {
        C9706bae c9706bae = this.deeplinkReferralCodeHandler;
        if (c9706bae != null) {
            return c9706bae;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(List<CoinDetailTabInfo> list) {
        AbstractC21883hPw abstractC21883hPw;
        if (list != null) {
            return C21911hQx.KWHzl.OLrzqt(this.uzCIH, list);
        }
        TokenBase tokenBase = this.uzCIH;
        if (C33129mqd.OLrzqt((CharSequence) (tokenBase != null ? tokenBase.getMarketTabName() : null))) {
            TokenBase tokenBase2 = this.uzCIH;
            String marketTabName = tokenBase2 != null ? tokenBase2.getMarketTabName() : null;
            if (marketTabName != null) {
                switch (marketTabName.hashCode()) {
                    case -1361632171:
                        if (marketTabName.equals("charts") && this.DbNXlk) {
                            return 1;
                        }
                        break;
                    case 3237038:
                        if (marketTabName.equals("info") && !this.DbNXlk) {
                        }
                        break;
                    case 93166555:
                        if (marketTabName.equals("audit") && (abstractC21883hPw = this.isConnected) != null && abstractC21883hPw.getItemCount() > 2) {
                            return 2;
                        }
                        break;
                    case 1544803905:
                        marketTabName.equals("default");
                        break;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class PendingIntent extends ViewPager2.OnPageChangeCallback {
        public PendingIntent() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2 viewPager2;
            super.onPageSelected(i);
            hAJ hajEjfBZ = MarketDetailFragment.ejfBZ(MarketDetailFragment.this);
            if (hajEjfBZ == null || (viewPager2 = hajEjfBZ.AhwBna) == null) {
                return;
            }
            MarketDetailFragment marketDetailFragment = MarketDetailFragment.this;
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(marketDetailFragment), null, null, new MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(marketDetailFragment, i, viewPager2, null), 3, null);
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ MarketDetailFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, MarketDetailFragment marketDetailFragment) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = marketDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C25632jAp c25632jAp = C25632jAp.KWHzl;
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                TradingBizType tradingBizType = TradingBizType.Market;
                TokenBase tokenBase = this.copydefault.uzCIH;
                String chainId = tokenBase != null ? tokenBase.getChainId() : null;
                String str = chainId == null ? "" : chainId;
                TokenBase tokenBase2 = this.copydefault.uzCIH;
                String chainId2 = tokenBase2 != null ? tokenBase2.getChainId() : null;
                c25632jAp.copydefault(childFragmentManager, new C28385kZl(tradingBizType, str, chainId2 != null ? chainId2 : "", true, true, null, null, null, 224, null), this.copydefault.new Dialog());
            }
        }
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            TokenBase tokenBase = (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
            this.uzCIH = tokenBase;
            if (tokenBase != null) {
                ejfBZ().AEQbTJ(tokenBase.getChainId(), tokenBase.getTokenContractAddress());
                OverviewViewModel.getOverviewData$default(AuCTelauCTel(), false, 1, null);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hAJ KWHzl(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAJ hajOLrzqt = hAJ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hajOLrzqt, "");
        return hajOLrzqt;
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        zLjUOn();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAJ haj, Bundle bundle) {
        Intrinsics.checkNotNullParameter(haj, "");
        fJNWhG();
        if (this.uzCIH != null) {
            DbNXlk();
            TokenBase tokenBase = this.uzCIH;
            this.DbNXlk = tokenBase != null && tokenBase.isMemeToken();
        }
        initAppBarInfo$default(this, null, 1, null);
        fARcdN();
        this.AhwBna = new kCM();
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        gEmmrt();
    }

    public static /* synthetic */ void initAppBarInfo$default(MarketDetailFragment marketDetailFragment, LatestMarketInfoBean latestMarketInfoBean, int i, Object obj) {
        if ((i & 1) != 0) {
            latestMarketInfoBean = null;
        }
        marketDetailFragment.OLrzqt(latestMarketInfoBean);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(LatestMarketInfoBean latestMarketInfoBean) {
        hAJ haj;
        C21986hTr c21986hTr;
        if (latestMarketInfoBean == null) {
            TokenBase tokenBase = this.uzCIH;
            if (tokenBase != null && (haj = (hAJ) aX_()) != null) {
                haj.EZpvd.setTitleAndContract(tokenBase.getTokenSymbol(), tokenBase.getTokenContractAddress(), new Function1() { // from class: o.hPL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MarketDetailFragment.valueOf(this.OLrzqt, (java.lang.String) obj);
                    }
                });
                haj.EZpvd.setCoinChainCoinImageUrl(tokenBase.getChainLogoUrl(), tokenBase.getTokenLogoUrl());
            }
        } else {
            hAJ haj2 = (hAJ) aX_();
            if (haj2 != null) {
                haj2.EZpvd.setTitleAndContract(latestMarketInfoBean.getTokenSymbol(), latestMarketInfoBean.getTokenContractAddress(), new Function1() { // from class: o.hPJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MarketDetailFragment.djBIcL(this.copydefault, (java.lang.String) obj);
                    }
                });
                haj2.EZpvd.setCoinChainCoinImageUrl(latestMarketInfoBean.getChainLogoUrl(), latestMarketInfoBean.getTokenLogoUrl());
            } else {
                haj2 = null;
            }
            if (haj2 == null) {
            }
        }
        hAJ haj3 = (hAJ) aX_();
        if (haj3 == null || (c21986hTr = haj3.EZpvd) == null) {
            return;
        }
        c21986hTr.setOnTokenLogoClickListener(new Function0() { // from class: o.hPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.zLjUOn(this.KWHzl);
            }
        });
    }

    public static final Unit djBIcL(MarketDetailFragment marketDetailFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        trackPageClick$default(marketDetailFragment, null, null, null, null, null, null, null, str, null, TokenDetailClickLayer.GLOBAL, TokenDetailButtonName.ADDRESS_COPY, null, 2431, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MarketDetailFragment marketDetailFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        trackPageClick$default(marketDetailFragment, null, null, null, null, null, null, null, str, null, TokenDetailClickLayer.GLOBAL, TokenDetailButtonName.ADDRESS_COPY, null, 2431, null);
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(MarketDetailFragment marketDetailFragment) {
        final LatestMarketInfoBean second;
        Pair<Boolean, LatestMarketInfoBean> value = marketDetailFragment.iwGUEr().valueOf().getValue();
        if (value != null && (second = value.getSecond()) != null) {
            String strKWHzl = C31256lqb.KWHzl(second.getTokenLargeLogoUrl(), (Function0<String>) new Function0() { // from class: o.hQt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketDetailFragment.AEQbTJ(second);
                }
            });
            Context context = marketDetailFragment.getContext();
            if (context != null) {
                C25352ivB.openTokenLogoImageView$default(context, strKWHzl, false, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String AEQbTJ(LatestMarketInfoBean latestMarketInfoBean) {
        return latestMarketInfoBean.getTokenLogoUrl();
    }

    public static final class Dialog implements Function1<DexMultiTokenInfoBean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            KWHzl(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }

        public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
            String chainId = dexMultiTokenInfoBean.getChainId();
            String tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress();
            String tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol();
            String tokenLogoUrl = dexMultiTokenInfoBean.getTokenLogoUrl();
            String chainLogoUrl = dexMultiTokenInfoBean.getChainLogoUrl();
            boolean zEZpvd = Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.isCollectToken(), (Object) "1");
            TokenBase tokenBase = new TokenBase(chainId, tokenContractAddress, tokenLogoUrl, chainLogoUrl, null, tokenSymbol, null, zEZpvd ? 1 : 0, C33129mqd.AhwBna(dexMultiTokenInfoBean.getDecimals()), 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -432, null);
            FragmentActivity activity = MarketDetailFragment.this.getActivity();
            if (activity != null) {
                C25352ivB.openMarketDetailPage$default(activity, MarketDetailFragment.this.AubY(), tokenBase, MarketDetailFragment.this.zsXlph(), null, new int[]{67108864, 65536}, 8, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        C21986hTr c21986hTr;
        AppCompatTextView appCompatTextViewAYXKKw;
        hAJ haj = (hAJ) aX_();
        if (haj == null || (c21986hTr = haj.EZpvd) == null || (appCompatTextViewAYXKKw = c21986hTr.AYXKKw()) == null) {
            return;
        }
        appCompatTextViewAYXKKw.setOnClickListener(new Fragment(appCompatTextViewAYXKKw, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        Drawable drawable;
        hAJ haj = (hAJ) aX_();
        if (haj != null) {
            if (z) {
                drawable = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.QezThh);
                if (drawable != null) {
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    C33057mpK.OLrzqt(drawable, contextRequireContext, C52761wXj.Activity.gdmIOq);
                } else {
                    drawable = null;
                }
            } else {
                drawable = ContextCompat.getDrawable(requireContext(), C52761wXj.TaskDescription.UkCIYP);
            }
            if (drawable != null) {
                haj.EZpvd.gEmmrt().setImageDrawable(drawable);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zuBGHE() {
        C55173xeu c55173xeu;
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        hAJ haj = (hAJ) aX_();
        if (haj != null && (c55254xgV = haj.OLrzqt) != null) {
            c55254xgV.setVisibility(8);
        }
        hAJ haj2 = (hAJ) aX_();
        if (haj2 != null && (viewPager2 = haj2.AhwBna) != null) {
            viewPager2.setVisibility(8);
        }
        hAJ haj3 = (hAJ) aX_();
        if (haj3 == null || (c55173xeu = haj3.valueOf) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        String string = getString(C23274hvD.Fragment.ActivityResultKt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        String string2 = getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((CharSequence) string2);
        c55173xeu.setEmptyTypeImage(8);
        String string3 = getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MarketDetailFragment.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(MarketDetailFragment marketDetailFragment, View view) {
        marketDetailFragment.DbNXlk();
        marketDetailFragment.gEmmrt();
    }

    public final void gEmmrt() {
        MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = iwGUEr();
        TokenBase tokenBase = this.uzCIH;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        TokenBase tokenBase2 = this.uzCIH;
        String chainId = tokenBase2 != null ? tokenBase2.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        marketCoinDetailViewModelIwGUEr.AEQbTJ(tokenContractAddress, chainId, strCopydefault);
    }

    public final void DbNXlk() {
        TokenBase tokenBase = this.uzCIH;
        if (tokenBase != null) {
            iwGUEr().copydefault(this, AubY(), tokenBase.getTokenContractAddress(), tokenBase.getChainId());
            if (tokenBase.getTokenContractAddress().length() > 0) {
                PositionsQuickViewModel.getPnl$default(isConnected(), tokenBase.getChainId(), tokenBase.getTokenContractAddress(), false, 4, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        Pair pairOLrzqt;
        hAJ haj = (hAJ) aX_();
        if (haj == null || (pairOLrzqt = C56390yDp.OLrzqt(haj.AEQbTJ, haj.KWHzl)) == null) {
            return;
        }
        Object objComponent1 = pairOLrzqt.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objComponent1;
        Object objComponent2 = pairOLrzqt.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "");
        LinearLayout linearLayout = (LinearLayout) objComponent2;
        lottieAnimationView.setVisibility(z ? 0 : 8);
        linearLayout.setVisibility(z ^ true ? 0 : 8);
        if (!z) {
            lottieAnimationView.cancelAnimation();
        } else {
            if (lottieAnimationView.isAnimating()) {
                return;
            }
            C22361hds.OLrzqt(lottieAnimationView, CDNSourceManager.LottieSource.DEX_MARKET_COIN_DETAIL_LOADING);
            lottieAnimationView.playAnimation();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        C55173xeu c55173xeu;
        C21986hTr c21986hTr;
        C21986hTr c21986hTr2;
        AppCompatImageView appCompatImageViewGEmmrt;
        FragmentContainerView fragmentContainerView;
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        hAJ haj = (hAJ) aX_();
        if (haj != null && (c55254xgV = haj.OLrzqt) != null) {
            c55254xgV.setVisibility(8);
        }
        hAJ haj2 = (hAJ) aX_();
        if (haj2 != null && (viewPager2 = haj2.AhwBna) != null) {
            viewPager2.setVisibility(8);
        }
        hAJ haj3 = (hAJ) aX_();
        if (haj3 != null && (fragmentContainerView = haj3.gEmmrt) != null) {
            fragmentContainerView.setVisibility(8);
        }
        hAJ haj4 = (hAJ) aX_();
        if (haj4 != null && (c21986hTr2 = haj4.EZpvd) != null && (appCompatImageViewGEmmrt = c21986hTr2.gEmmrt()) != null) {
            appCompatImageViewGEmmrt.setVisibility(8);
        }
        hAJ haj5 = (hAJ) aX_();
        if (haj5 != null && (c21986hTr = haj5.EZpvd) != null) {
            c21986hTr.setIsShareShown(false);
        }
        hAJ haj6 = (hAJ) aX_();
        if (haj6 == null || (c55173xeu = haj6.valueOf) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        String string = getString(C23274hvD.Fragment.addSocket);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((CharSequence) string);
        c55173xeu.setEmptyTypeImage(6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        hAJ haj = (hAJ) aX_();
        if (haj != null) {
            haj.valueOf.setVisibility(8);
            haj.OLrzqt.setVisibility(0);
            haj.AhwBna.setVisibility(0);
        }
    }

    public static /* synthetic */ void trackPageClick$default(MarketDetailFragment marketDetailFragment, String str, Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, String str2, Boolean bool2, String str3, Boolean bool3, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            tradeType = null;
        }
        if ((i & 8) != 0) {
            subChartTabType = null;
        }
        if ((i & 16) != 0) {
            klineType = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            tokenDetailClickLayer = null;
        }
        if ((i & 1024) != 0) {
            tokenDetailButtonName = null;
        }
        if ((i & 2048) != 0) {
            bool4 = null;
        }
        marketDetailFragment.KWHzl(str, bool, tradeType, subChartTabType, klineType, str2, bool2, str3, bool3, tokenDetailClickLayer, tokenDetailButtonName, bool4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(String str, Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, String str2, Boolean bool2, String str3, Boolean bool3, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName, Boolean bool4) {
        TokenBase tokenBase;
        hAJ haj = (hAJ) aX_();
        if (haj == null || (tokenBase = this.uzCIH) == null) {
            return;
        }
        C21847hOn.trackDexMarketTokenPageClick$default(tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol(), tokenBase.getChainId(), C31256lqb.KWHzl(tokenBase.getChainName(), (Function0<String>) new Function0() { // from class: o.hPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.AxsJAY(this.OLrzqt);
            }
        }), C21847hOn.EZpvd(haj.AhwBna.getCurrentItem(), this.DbNXlk), zsXlph(), bool, tradeType, subChartTabType, klineType, str2, bool2, str3, bool3, str, tokenDetailButtonName, null, fIwbmz().OLrzqt(), tokenDetailClickLayer, bool4, null, AuCTelauCTel().djBIcL(), 1114112, null);
    }

    public static final String AxsJAY(MarketDetailFragment marketDetailFragment) {
        LatestMarketInfoBean second;
        Pair<Boolean, LatestMarketInfoBean> value = marketDetailFragment.iwGUEr().valueOf().getValue();
        String chainName = (value == null || (second = value.getSecond()) == null) ? null : second.getChainName();
        return chainName == null ? "" : chainName;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(LatestMarketInfoBean latestMarketInfoBean) {
        final List<CoinDetailTabInfo> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) C21911hQx.KWHzl.KWHzl(this, AubY(), this.uzCIH, latestMarketInfoBean, iwGUEr(), zsXlph()));
        this.isConnected = new C21882hPv(this, listFJNWhG);
        hAJ haj = (hAJ) aX_();
        if (haj != null) {
            haj.AhwBna.setAdapter(this.isConnected);
            haj.AhwBna.setCurrentItem(AEQbTJ(listFJNWhG), false);
            new TabLayoutMediator(haj.OLrzqt.copydefault(), haj.AhwBna, true, false, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.hQw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    MarketDetailFragment.AEQbTJ(listFJNWhG, this, tab, i);
                }
            }).attach();
        }
        AEQbTJ(iwGUEr().fIwbmz().getValue());
    }

    public static final void AEQbTJ(List list, MarketDetailFragment marketDetailFragment, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        CoinDetailTabInfo coinDetailTabInfo = (CoinDetailTabInfo) list.get(i);
        tab.setText(coinDetailTabInfo.getTabTitle());
        tab.view.setContentDescription("web3_dex_market_token_detail_tab_" + i);
        if (coinDetailTabInfo.getTabType() == CoinDetailTabType.ASSESSMENT && marketDetailFragment.ejfBZ().OLrzqt()) {
            tab.setIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.zNQIcI));
            Drawable icon = tab.getIcon();
            if (icon != null) {
                C33057mpK.copydefault(icon, C25382ivf.KWHzl(C52761wXj.Activity.DQzvGN));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        final hAJ haj = (hAJ) aX_();
        if (haj != null) {
            iwGUEr().getFieldNames().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hPT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AYXKKw(this.AEQbTJ, (java.lang.String) obj);
                }
            }));
            haj.OLrzqt.copydefault().clearOnTabSelectedListeners();
            haj.OLrzqt.AEQbTJ(new StateListAnimator());
            iwGUEr().fJNWhG().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.djBIcL(this.copydefault, (java.lang.Boolean) obj);
                }
            }));
            C25390ivn.collectOnViewLifecycle$default(this, wlaJM().EZpvd(), null, new FragmentManager(haj), 2, null);
            iwGUEr().AkhnZx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.OLrzqt(this.KWHzl, (InterfaceC22618hik) obj);
                }
            }));
            iwGUEr().valueOf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.EZpvd(this.OLrzqt, haj, (kotlin.Pair) obj);
                }
            }));
            iwGUEr().fIwbmz().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.valueOf(this.KWHzl, (java.lang.Boolean) obj);
                }
            }));
            iwGUEr().AubY().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AYXKKw(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
            ejfBZ().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AhwBna(this.copydefault, (java.lang.String) obj);
                }
            }));
            C25390ivn.collectOnViewLifecycle$default(this, AuCTelauCTel().copydefault(), null, new Activity(), 2, null);
            C25352ivB.setOnDoubleCheckClickListener$default(haj.EZpvd.gEmmrt(), 0L, new Function1() { // from class: o.hQp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.KWHzl(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
            haj.EZpvd.setOnAlertClickListener(new Function0() { // from class: o.hQo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketDetailFragment.gHZMYf(this.EZpvd);
                }
            });
            haj.EZpvd.setOnShareClickListener(new Function0() { // from class: o.hQn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketDetailFragment.zuBGHE(this.KWHzl);
                }
            });
            iwGUEr().values().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hPV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AEQbTJ(this.EZpvd, (Unit) obj);
                }
            }));
            iwGUEr().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hPX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.gEmmrt(this.copydefault, (java.lang.Boolean) obj);
                }
            }));
            iwGUEr().OLrzqt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hPU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.isConnected(this.KWHzl, (java.lang.Boolean) obj);
                }
            }));
            iwGUEr().AhwBna().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hPW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AkhnZx(this.EZpvd, (java.lang.Boolean) obj);
                }
            }));
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C22691hkD.class, new String[0]);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
            final Function1 function1 = new Function1() { // from class: o.hQb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.copydefault(haj, (C22691hkD) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hPY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MarketDetailFragment.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hQa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hQc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MarketDetailFragment.OLrzqt(function12, obj);
                }
            });
            haj.AhwBna.registerOnPageChangeCallback(this.fJNWhG);
            iwGUEr().ejfBZ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.OLrzqt(this.KWHzl, haj, (java.lang.Boolean) obj);
                }
            }));
            iwGUEr().iwGUEr().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.gEmmrt(this.EZpvd, (java.lang.String) obj);
                }
            }));
            iwGUEr().EZpvd().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.EZpvd(haj, (java.lang.Boolean) obj);
                }
            }));
            C25390ivn.AEQbTJ(this, values().KWHzl(), Lifecycle.State.STARTED, new ActionBar());
            iwGUEr().djBIcL().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.hQf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketDetailFragment.OLrzqt(this.OLrzqt, haj, (java.util.List) obj);
                }
            }));
        }
    }

    public static final Unit AYXKKw(MarketDetailFragment marketDetailFragment, String str) {
        TokenDetailButtonName.Application application = TokenDetailButtonName.Companion;
        Intrinsics.copydefault((Object) str);
        TokenDetailButtonName tokenDetailButtonNameKWHzl = application.KWHzl(str);
        if (tokenDetailButtonNameKWHzl != null) {
            trackPageClick$default(marketDetailFragment, null, null, null, ChartDetailFragment.Companion.SubChartTabType.Companion.OLrzqt(str), null, null, null, null, null, TokenDetailClickLayer.INNER_TAB, tokenDetailButtonNameKWHzl, null, 2551, null);
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            CoinDetailTabType coinDetailTabTypeEZpvd;
            Intrinsics.checkNotNullParameter(tab, "");
            int position = tab.getPosition();
            if (!MarketDetailFragment.this.AYXKKw && (coinDetailTabTypeEZpvd = C21847hOn.EZpvd(position, MarketDetailFragment.this.DbNXlk)) != null) {
                MarketDetailFragment.trackPageClick$default(MarketDetailFragment.this, CoinDetailTabType.Companion.AEQbTJ(coinDetailTabTypeEZpvd), null, null, null, null, null, null, null, null, TokenDetailClickLayer.TOP_TAB, TokenDetailButtonName.Companion.KWHzl(coinDetailTabTypeEZpvd), null, 2558, null);
            }
            MarketDetailFragment.this.AYXKKw = false;
        }
    }

    public static final Unit djBIcL(MarketDetailFragment marketDetailFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        marketDetailFragment.copydefault(bool.booleanValue());
        if (!bool.booleanValue()) {
            marketDetailFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final class FragmentManager<T> implements FlowCollector {
        public final /* synthetic */ hAJ AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(hAJ haj) {
            this.AEQbTJ = haj;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            C21986hTr c21986hTr = this.AEQbTJ.EZpvd;
            String strKWHzl = tokenDetail.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            c21986hTr.OLrzqt(strKWHzl);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(MarketDetailFragment marketDetailFragment, InterfaceC22618hik interfaceC22618hik) {
        hAJ haj;
        ViewPager2 viewPager2;
        if (interfaceC22618hik != null && (haj = (hAJ) marketDetailFragment.aX_()) != null && (viewPager2 = haj.AhwBna) != null) {
            viewPager2.setCurrentItem(interfaceC22618hik.AEQbTJ(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v27, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v53, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final MarketDetailFragment marketDetailFragment, hAJ haj, Pair pair) {
        C21986hTr c21986hTr;
        hAJ haj2;
        C21986hTr c21986hTr2;
        if (((Boolean) pair.getFirst()).booleanValue() || !((LatestMarketInfoBean) pair.getSecond()).isWaitState()) {
            marketDetailFragment.copydefault(false);
            marketDetailFragment.getNewProxyInstance();
        }
        if (marketDetailFragment.KWHzl((LatestMarketInfoBean) pair.getSecond()) && (haj2 = (hAJ) marketDetailFragment.aX_()) != null && (c21986hTr2 = haj2.EZpvd) != null) {
            c21986hTr2.valueOf();
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            TokenBase tokenBase = marketDetailFragment.uzCIH;
            if (tokenBase != null) {
                if (tokenBase.getTokenContractAddress().length() == 0) {
                    PositionsQuickViewModel positionsQuickViewModelIsConnected = marketDetailFragment.isConnected();
                    String chainId = tokenBase.getChainId();
                    LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) pair.getSecond();
                    String tokenContractAddress = latestMarketInfoBean != null ? latestMarketInfoBean.getTokenContractAddress() : null;
                    PositionsQuickViewModel.getPnl$default(positionsQuickViewModelIsConnected, chainId, tokenContractAddress == null ? "" : tokenContractAddress, false, 4, null);
                }
                LatestMarketInfoBean latestMarketInfoBean2 = (LatestMarketInfoBean) pair.getSecond();
                String tokenContractAddress2 = latestMarketInfoBean2 != null ? latestMarketInfoBean2.getTokenContractAddress() : null;
                String str = tokenContractAddress2 == null ? "" : tokenContractAddress2;
                LatestMarketInfoBean latestMarketInfoBean3 = (LatestMarketInfoBean) pair.getSecond();
                String chainLogoUrl = latestMarketInfoBean3 != null ? latestMarketInfoBean3.getChainLogoUrl() : null;
                marketDetailFragment.uzCIH = tokenBase.copy(((-8392705) & 1) != 0 ? tokenBase.chainId : null, ((-8392705) & 2) != 0 ? tokenBase.tokenContractAddress : str, ((-8392705) & 4) != 0 ? tokenBase.tokenLogoUrl : null, ((-8392705) & 8) != 0 ? tokenBase.chainLogoUrl : chainLogoUrl == null ? "" : chainLogoUrl, ((-8392705) & 16) != 0 ? tokenBase.chainBWLogoUrl : null, ((-8392705) & 32) != 0 ? tokenBase.tokenSymbol : null, ((-8392705) & 64) != 0 ? tokenBase.tokenName : null, ((-8392705) & 128) != 0 ? tokenBase.isCollected : 0, ((-8392705) & 256) != 0 ? tokenBase.decimals : 0, ((-8392705) & 512) != 0 ? tokenBase.isCustomToken : 0, ((-8392705) & 1024) != 0 ? tokenBase.isSubscribe : 0, ((-8392705) & 2048) != 0 ? tokenBase.uniqueId : null, ((-8392705) & 4096) != 0 ? tokenBase.source : null, ((-8392705) & 8192) != 0 ? tokenBase.tokenSource : null, ((-8392705) & 16384) != 0 ? tokenBase.type : null, ((-8392705) & 32768) != 0 ? tokenBase.chainName : null, ((-8392705) & 65536) != 0 ? tokenBase.isLeveraged : null, ((-8392705) & 131072) != 0 ? tokenBase.isSafeMoonToken : 0, ((-8392705) & 262144) != 0 ? tokenBase.isHoneypot : 0, ((-8392705) & 524288) != 0 ? tokenBase.localIsNeedRequestNet : false, ((-8392705) & 1048576) != 0 ? tokenBase.eventSource : null, ((-8392705) & 2097152) != 0 ? tokenBase.marketTabName : null, ((-8392705) & 4194304) != 0 ? tokenBase.showSourceAlert : false, ((-8392705) & 8388608) != 0 ? tokenBase.fromTrading : false, ((-8392705) & 16777216) != 0 ? tokenBase.moduleNameEnglish : null, ((-8392705) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenBase.moduleId : null, ((-8392705) & 67108864) != 0 ? tokenBase.sourcePageName : null, ((-8392705) & 134217728) != 0 ? tokenBase.srcType : 0, ((-8392705) & 268435456) != 0 ? tokenBase.isHighRisk : false, ((-8392705) & 536870912) != 0 ? tokenBase.referralCode : null, ((-8392705) & 1073741824) != 0 ? tokenBase.isNativeToken : null, ((-8392705) & Integer.MIN_VALUE) != 0 ? tokenBase.isMarketDetailEntry : false);
            }
            marketDetailFragment.DbNXlk = ((LatestMarketInfoBean) pair.getSecond()).isShowInfoTab();
            MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = marketDetailFragment.iwGUEr();
            TokenBase tokenBase2 = marketDetailFragment.uzCIH;
            marketCoinDetailViewModelIwGUEr.AEQbTJ(tokenBase2 != null ? tokenBase2.getChainId() : null, C31256lqb.KWHzl(((LatestMarketInfoBean) pair.getSecond()).getTokenContractAddress(), (Function0<String>) new Function0() { // from class: o.hPP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketDetailFragment.AuCTelauCTel(this.KWHzl);
                }
            }));
            marketDetailFragment.AuCTelauCTel().KWHzl(((LatestMarketInfoBean) pair.getSecond()).getTokenContractAddress());
            marketDetailFragment.OLrzqt((LatestMarketInfoBean) pair.getSecond());
            marketDetailFragment.copydefault(((LatestMarketInfoBean) pair.getSecond()).getTokenSymbol(), ((LatestMarketInfoBean) pair.getSecond()).getTokenContractAddress());
            if (!((LatestMarketInfoBean) pair.getSecond()).isSupportTxPrice() || marketDetailFragment.DbNXlk) {
                haj.EZpvd.AYXKKw(C21949hSh.EZpvd.gEmmrt(((LatestMarketInfoBean) pair.getSecond()).getPrice()));
            }
            haj.EZpvd.OLrzqt(((LatestMarketInfoBean) pair.getSecond()).getChange());
            marketDetailFragment.OLrzqt(((LatestMarketInfoBean) pair.getSecond()).isCollectState());
            InterfaceC21867hPg interfaceC21867hPg = marketDetailFragment.AkhnZx;
            if (interfaceC21867hPg != null) {
                interfaceC21867hPg.AEQbTJ((LatestMarketInfoBean) pair.getSecond());
            }
            LatestMarketInfoBean latestMarketInfoBean4 = (LatestMarketInfoBean) pair.getSecond();
            hAJ haj3 = (hAJ) marketDetailFragment.aX_();
            if (haj3 != null && (c21986hTr = haj3.EZpvd) != null) {
                c21986hTr.setShowTokenAddress(!latestMarketInfoBean4.getNotSupportTxNativeToken());
            }
            marketDetailFragment.EZpvd(latestMarketInfoBean4);
            marketDetailFragment.sSMYrx();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) marketDetailFragment, true, (String) null, 2, (Object) null);
            marketDetailFragment.uzCIH();
            LatestMarketInfoBean latestMarketInfoBean5 = (LatestMarketInfoBean) pair.getSecond();
            Iterator<T> it = marketDetailFragment.valueOf.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(latestMarketInfoBean5);
            }
            marketDetailFragment.valueOf.clear();
        } else {
            if (((LatestMarketInfoBean) pair.getSecond()).isWaitState()) {
                return Unit.INSTANCE;
            }
            if (((LatestMarketInfoBean) pair.getSecond()).isCoinNotSupport()) {
                marketDetailFragment.hDKMBd();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) marketDetailFragment, false, (String) null, 2, (Object) null);
            } else {
                marketDetailFragment.zuBGHE();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) marketDetailFragment, false, (String) null, 2, (Object) null);
            }
            TokenBase tokenBase3 = marketDetailFragment.uzCIH;
            String tokenSymbol = tokenBase3 != null ? tokenBase3.getTokenSymbol() : null;
            TokenBase tokenBase4 = marketDetailFragment.uzCIH;
            marketDetailFragment.copydefault(tokenSymbol, tokenBase4 != null ? tokenBase4.getTokenContractAddress() : null);
        }
        return Unit.INSTANCE;
    }

    public static final String AuCTelauCTel(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        return tokenContractAddress == null ? "" : tokenContractAddress;
    }

    public static final Unit valueOf(MarketDetailFragment marketDetailFragment, Boolean bool) {
        marketDetailFragment.AEQbTJ(bool);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(MarketDetailFragment marketDetailFragment, Boolean bool) {
        C21986hTr c21986hTr;
        hAJ haj = (hAJ) marketDetailFragment.aX_();
        if (haj != null && (c21986hTr = haj.EZpvd) != null) {
            Intrinsics.copydefault(bool);
            c21986hTr.KWHzl(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(MarketDetailFragment marketDetailFragment, String str) {
        marketDetailFragment.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C29063kma c29063kma, Continuation<? super Unit> continuation) {
            MarketDetailFragment.this.KWHzl(c29063kma);
            return Unit.INSTANCE;
        }
    }

    public static final Unit KWHzl(MarketDetailFragment marketDetailFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C25352ivB.startVibrator$default(0L, 1, null);
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        if (tokenBase != null) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(marketDetailFragment), null, null, new MarketDetailFragment$initListener$1$11$1$1(marketDetailFragment, tokenBase, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(final MarketDetailFragment marketDetailFragment) {
        boolean zEZpvd = Intrinsics.EZpvd(marketDetailFragment.iwGUEr().AubY().getValue(), Boolean.TRUE);
        TokenDetailClickLayer tokenDetailClickLayer = TokenDetailClickLayer.GLOBAL;
        trackPageClick$default(marketDetailFragment, null, null, null, null, null, null, null, null, Boolean.valueOf(zEZpvd), tokenDetailClickLayer, TokenDetailButtonName.ALERT, null, 2303, null);
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        TokenBase tokenBase2 = marketDetailFragment.uzCIH;
        String tokenSymbol = tokenBase2 != null ? tokenBase2.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        C21847hOn.EZpvd(tokenContractAddress, tokenSymbol, tokenDetailClickLayer);
        Pair<Boolean, LatestMarketInfoBean> value = marketDetailFragment.iwGUEr().valueOf().getValue();
        LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        if (second != null) {
            TokenBase tokenBase3 = marketDetailFragment.uzCIH;
            String chainId = tokenBase3 != null ? tokenBase3.getChainId() : null;
            final TokenInfoForAlert tokenInfoForAlert = new TokenInfoForAlert(chainId == null ? "" : chainId, second.getChainName(), second.getTokenContractAddress(), second.getTokenLogoUrl(), second.getChainLogoUrl(), StringsKt__StringsKt.hDKMBd((CharSequence) second.getTokenSymbol()).toString(), second.getPrice(), second.getMarketCap(), null, true, 256, null);
            if (marketDetailFragment.iwGUEr().wlaJM()) {
                C25632jAp c25632jAp = C25632jAp.KWHzl;
                androidx.fragment.app.FragmentManager childFragmentManager = marketDetailFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25632jAp.OLrzqt(childFragmentManager, tokenInfoForAlert, new Function0() { // from class: o.hPK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MarketDetailFragment.AEQbTJ(this.AEQbTJ, tokenInfoForAlert);
                    }
                });
            } else {
                marketDetailFragment.OLrzqt(tokenInfoForAlert.EZpvd((831 & 1) != 0 ? tokenInfoForAlert.OLrzqt : null, (831 & 2) != 0 ? tokenInfoForAlert.KWHzl : null, (831 & 4) != 0 ? tokenInfoForAlert.djBIcL : null, (831 & 8) != 0 ? tokenInfoForAlert.AYXKKw : null, (831 & 16) != 0 ? tokenInfoForAlert.copydefault : null, (831 & 32) != 0 ? tokenInfoForAlert.values : null, (831 & 64) != 0 ? tokenInfoForAlert.valueOf : null, (831 & 128) != 0 ? tokenInfoForAlert.AhwBna : null, (831 & 256) != 0 ? tokenInfoForAlert.AEQbTJ : null, (831 & 512) != 0 ? tokenInfoForAlert.gEmmrt : false));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MarketDetailFragment marketDetailFragment, TokenInfoForAlert tokenInfoForAlert) {
        C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.WFXFk, 0, 1, (Object) null);
        marketDetailFragment.OLrzqt(tokenInfoForAlert.EZpvd((831 & 1) != 0 ? tokenInfoForAlert.OLrzqt : null, (831 & 2) != 0 ? tokenInfoForAlert.KWHzl : null, (831 & 4) != 0 ? tokenInfoForAlert.djBIcL : null, (831 & 8) != 0 ? tokenInfoForAlert.AYXKKw : null, (831 & 16) != 0 ? tokenInfoForAlert.copydefault : null, (831 & 32) != 0 ? tokenInfoForAlert.values : null, (831 & 64) != 0 ? tokenInfoForAlert.valueOf : null, (831 & 128) != 0 ? tokenInfoForAlert.AhwBna : null, (831 & 256) != 0 ? tokenInfoForAlert.AEQbTJ : null, (831 & 512) != 0 ? tokenInfoForAlert.gEmmrt : false));
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(MarketDetailFragment marketDetailFragment) {
        trackPageClick$default(marketDetailFragment, null, null, null, null, null, null, Boolean.TRUE, null, null, TokenDetailClickLayer.GLOBAL, TokenDetailButtonName.SHARE, null, 2495, null);
        marketDetailFragment.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MarketDetailFragment marketDetailFragment, Unit unit) {
        marketDetailFragment.dismissLoading();
        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.ICustomTabsService, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(MarketDetailFragment marketDetailFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Context contextRequireContext = marketDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C25352ivB.KWHzl(contextRequireContext, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(MarketDetailFragment marketDetailFragment, Boolean bool) {
        marketDetailFragment.dismissLoading();
        if (bool.booleanValue()) {
            Context contextRequireContext = marketDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C25352ivB.KWHzl(contextRequireContext, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(MarketDetailFragment marketDetailFragment, Boolean bool) {
        trackPageClick$default(marketDetailFragment, null, bool, null, null, null, null, null, null, null, null, null, null, 4093, null);
        Intrinsics.copydefault(bool);
        marketDetailFragment.OLrzqt(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(hAJ haj, C22691hkD c22691hkD) {
        haj.AhwBna.setNestedScrollingEnabled(c22691hkD.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MarketDetailFragment marketDetailFragment, hAJ haj, Boolean bool) {
        AbstractC21883hPw abstractC21883hPw = marketDetailFragment.isConnected;
        haj.AhwBna.setCurrentItem(C33129mqd.AhwBna(abstractC21883hPw != null ? C23313hvq.subCheckS$default(Integer.valueOf(abstractC21883hPw.getItemCount()), 1, null, null, null, 14, null) : null), true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(MarketDetailFragment marketDetailFragment, String str) {
        C21986hTr c21986hTr;
        hAJ haj = (hAJ) marketDetailFragment.aX_();
        if (haj != null && (c21986hTr = haj.EZpvd) != null) {
            Intrinsics.copydefault((Object) str);
            c21986hTr.AYXKKw(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hAJ haj, Boolean bool) {
        haj.AhwBna.setUserInputEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(C22398hec c22398hec, Continuation<? super Unit> continuation) {
            TokenBase tokenBase = MarketDetailFragment.this.uzCIH;
            if (tokenBase != null) {
                MarketDetailFragment marketDetailFragment = MarketDetailFragment.this;
                FragmentActivity activity = marketDetailFragment.getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    C25392ivp.AEQbTJ(abstractActivityC33041mov, tokenBase.getChainId(), tokenBase.getTokenContractAddress(), c22398hec, marketDetailFragment);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(final MarketDetailFragment marketDetailFragment, hAJ haj, final List list) {
        final LatestMarketInfoBean second;
        Pair<Boolean, LatestMarketInfoBean> value = marketDetailFragment.iwGUEr().valueOf().getValue();
        if (value != null && (second = value.getSecond()) != null) {
            final Overview overviewAEQbTJ = marketDetailFragment.AuCTelauCTel().copydefault().getValue().AEQbTJ();
            MemeInfo memeInfoOLrzqt = overviewAEQbTJ != null ? overviewAEQbTJ.OLrzqt() : null;
            Intrinsics.copydefault(list);
            List<TagWrapper> listEZpvd = kNA.EZpvd(memeInfoOLrzqt, list);
            marketDetailFragment.AuCTelauCTel().AEQbTJ(listEZpvd);
            C21986hTr c21986hTr = haj.EZpvd;
            TokenBase tokenBase = marketDetailFragment.uzCIH;
            String chainId = tokenBase != null ? tokenBase.getChainId() : null;
            c21986hTr.setTags(listEZpvd, chainId == null ? "" : chainId, second.getTokenSymbol(), second.getTokenContractAddress(), second.getChainName(), marketDetailFragment.zsXlph(), new Function0() { // from class: o.hPF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketDetailFragment.KWHzl(this.OLrzqt, list, second, overviewAEQbTJ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MarketDetailFragment marketDetailFragment, List list, LatestMarketInfoBean latestMarketInfoBean, Overview overview) {
        C29717kys.Activity activity = C29717kys.Companion;
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        TokenBase tokenBase2 = marketDetailFragment.uzCIH;
        String tokenContractAddress = tokenBase2 != null ? tokenBase2.getTokenContractAddress() : null;
        String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
        Intrinsics.copydefault(list);
        List<String> listKWHzl = marketDetailFragment.iwGUEr().fetchVPNInfo().KWHzl();
        TokenBase tokenBase3 = marketDetailFragment.uzCIH;
        String chainId2 = tokenBase3 != null ? tokenBase3.getChainId() : null;
        activity.EZpvd(new TagExplanationBottomSheetParams(str, str2, true, new TagStaticDataParams(list, listKWHzl.contains(chainId2 != null ? chainId2 : ""), latestMarketInfoBean, overview), TagEventSource.TOKEN_DETAIL, false, 32, null)).show(marketDetailFragment.getChildFragmentManager(), C56524yIo.AEQbTJ(C29717kys.class).valueOf());
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C9706bae c9706baeAkhnZx = AkhnZx();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
            Pair[] pairArr = new Pair[2];
            if (str == null) {
                str = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("token_symbol", str);
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("token_address", str2);
            c9706baeAkhnZx.OLrzqt(lifecycleScope, activity, "dex/coin/detail", C56424yEw.gEmmrt(pairArr));
        }
    }

    public final void AEQbTJ(Boolean bool) {
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        if (bool == null || !bool.booleanValue() || value == null || !value.getFirst().booleanValue()) {
            return;
        }
        AbstractC21883hPw abstractC21883hPw = this.isConnected;
        Intrinsics.copydefault(abstractC21883hPw, "");
        int itemCount = ((C21882hPv) abstractC21883hPw).getItemCount();
        CoinDetailTabInfo coinDetailTabInfoOLrzqt = C21911hQx.KWHzl.OLrzqt(this, itemCount, this.uzCIH);
        AbstractC21883hPw abstractC21883hPw2 = this.isConnected;
        Intrinsics.copydefault(abstractC21883hPw2, "");
        ((C21882hPv) abstractC21883hPw2).copydefault(coinDetailTabInfoOLrzqt);
        AbstractC21883hPw abstractC21883hPw3 = this.isConnected;
        if (abstractC21883hPw3 != null) {
            abstractC21883hPw3.notifyItemInserted(itemCount);
        }
    }

    public final boolean KWHzl(LatestMarketInfoBean latestMarketInfoBean) {
        return latestMarketInfoBean.isSupportTxPrice();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC21868hPh
    public void OLrzqt(int i) {
        hAJ haj = (hAJ) aX_();
        if (haj != null) {
            haj.EZpvd.EZpvd(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        hAJ haj;
        final OKAlertBanner oKAlertBanner;
        MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = iwGUEr();
        TokenBase tokenBase = this.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        TokenBase tokenBase2 = this.uzCIH;
        String tokenContractAddress = tokenBase2 != null ? tokenBase2.getTokenContractAddress() : null;
        final BannerConfig bannerConfigCopydefault = marketCoinDetailViewModelIwGUEr.copydefault(chainId, tokenContractAddress != null ? tokenContractAddress : "");
        if (bannerConfigCopydefault == null || (haj = (hAJ) aX_()) == null || (oKAlertBanner = haj.copydefault) == null) {
            return;
        }
        oKAlertBanner.setTitle(bannerConfigCopydefault.KWHzl());
        if (!StringsKt__StringsKt.fARcdN((CharSequence) bannerConfigCopydefault.AYXKKw())) {
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.RJOkX);
            SpannableString spannableString = new SpannableString(bannerConfigCopydefault.copydefault() + " " + strAYXKKw);
            spannableString.setSpan(new UnderlineSpan(), bannerConfigCopydefault.copydefault().length() + 1, bannerConfigCopydefault.copydefault().length() + 1 + strAYXKKw.length(), 33);
            oKAlertBanner.setMessage(spannableString);
            oKAlertBanner.setOnClickListener(new View.OnClickListener() { // from class: o.hPz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MarketDetailFragment.KWHzl(this.OLrzqt, bannerConfigCopydefault, view);
                }
            });
        } else {
            oKAlertBanner.setMessage(bannerConfigCopydefault.copydefault());
        }
        oKAlertBanner.KWHzl().setVisibility(0);
        C25352ivB.setOnDoubleCheckClickListener$default(oKAlertBanner.OLrzqt(), 0L, new Function1() { // from class: o.hPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketDetailFragment.AEQbTJ(this.OLrzqt, bannerConfigCopydefault, oKAlertBanner, (android.view.View) obj);
            }
        }, 1, null);
        oKAlertBanner.setVisibility(0);
    }

    public static final void KWHzl(MarketDetailFragment marketDetailFragment, BannerConfig bannerConfig, View view) {
        C25352ivB.KWHzl(marketDetailFragment.requireContext(), bannerConfig.AYXKKw());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(MarketDetailFragment marketDetailFragment, BannerConfig bannerConfig, OKAlertBanner oKAlertBanner, View view) {
        OKAlertBanner oKAlertBanner2;
        Intrinsics.checkNotNullParameter(view, "");
        hAJ haj = (hAJ) marketDetailFragment.aX_();
        final int height = (haj == null || (oKAlertBanner2 = haj.copydefault) == null) ? 0 : oKAlertBanner2.getHeight();
        marketDetailFragment.iwGUEr().copydefault(bannerConfig.OLrzqt());
        oKAlertBanner.setVisibility(8);
        FragmentActivity activity = marketDetailFragment.getActivity();
        final ViewPager2 viewPager2 = activity != null ? (ViewPager2) activity.findViewById(C23274hvD.Application.setShowAsActionFlags) : null;
        if (viewPager2 != null) {
            viewPager2.post(new Runnable() { // from class: o.hPI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    MarketDetailFragment.EZpvd(viewPager2, height);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewPager2 viewPager2, int i) {
        ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
        layoutParams.height += i;
        viewPager2.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        hAJ haj;
        hAJ haj2;
        TokenBase tokenBase = this.uzCIH;
        if (Intrinsics.EZpvd((Object) (tokenBase != null ? tokenBase.getSource() : null), (Object) "cefi_search") && (haj2 = (hAJ) aX_()) != null) {
            haj2.EZpvd.gEmmrt().setVisibility(8);
            haj2.EZpvd.setIsShareShown(false);
        }
        if (Intrinsics.EZpvd(iwGUEr().fARcdN(), Boolean.TRUE) && (haj = (hAJ) aX_()) != null) {
            TextView textView = haj.AYXKKw;
            textView.setVisibility(0);
            textView.bringToFront();
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDetailFragment$showCefiAlert$2$1$1(textView, null), 3, null);
            iwGUEr().EZpvd(Boolean.FALSE);
        }
    }

    public final void OLrzqt(Object obj) {
        if (Result.m7384isSuccessimpl(obj)) {
            InterfaceC28415kaO interfaceC28415kaO = (InterfaceC28415kaO) obj;
            if (interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog) {
                kCW.Companion.OLrzqt(new TokenGroupSelectionParams(((InterfaceC28415kaO.Dialog) interfaceC28415kaO).EZpvd(), GroupSelectionMode.INDIVIDUAL, null, 4, null)).show(getChildFragmentManager(), "TokenGroupSelectionBottomSheet");
                return;
            } else {
                kCM kcm = this.AhwBna;
                if (kcm != null) {
                    kcm.OLrzqt(interfaceC28415kaO, new Function0() { // from class: o.hPH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return MarketDetailFragment.wlaJM(this.EZpvd);
                        }
                    });
                }
            }
        }
        if (Result.m7380exceptionOrNullimpl(obj) != null) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
        }
    }

    public static final Unit wlaJM(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        if (tokenBase != null) {
            marketDetailFragment.iwGUEr().EZpvd(tokenBase);
        }
        return Unit.INSTANCE;
    }

    @Override // o.kCQ
    public void AEQbTJ(@NotNull List<HomeToken> list, @NotNull Pair<? extends List<Integer>, ? extends List<Integer>> pair) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pair, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDetailFragment$onGroupsSelected$1(pair, this, list, null), 3, null);
    }

    public final void fetchVPNInfo() {
        CoinDetailRedirection coinDetailRedirection;
        Bundle arguments = getArguments();
        if (arguments == null || (coinDetailRedirection = (CoinDetailRedirection) arguments.getParcelable("coin_detail_redirection")) == null) {
            return;
        }
        if (TaskDescription.KWHzl[coinDetailRedirection.getType().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        AEQbTJ(coinDetailRedirection.getValue());
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("coin_detail_redirection");
        }
    }

    public final void AEQbTJ(String str) {
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        if (StringsKt__StringsKt.fARcdN((CharSequence) str) || second == null) {
            return;
        }
        MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = iwGUEr();
        int iOrdinal = CoinDetailTabType.CHART.ordinal();
        TokenBase tokenBase = this.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        marketCoinDetailViewModelIwGUEr.KWHzl(new C22620him(iOrdinal, 0, new Traders(1, chainId, second.getTokenContractAddress(), str, null, null, null, null, null, null, null, null, null, null, 16368, null), 2, null));
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.koL.setData$default(o.koL, boolean, java.lang.String, com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            C29154koL c29154koL;
            hAJ hajEjfBZ = MarketDetailFragment.ejfBZ(MarketDetailFragment.this);
            if (hajEjfBZ != null && (c29154koL = hajEjfBZ.values) != null) {
                final MarketDetailFragment marketDetailFragment = MarketDetailFragment.this;
                C29154koL.setData$default(c29154koL, z, null, null, new Function0() { // from class: o.hQy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MarketDetailFragment.SharedElementCallback.AEQbTJ(marketDetailFragment);
                    }
                }, 6, null);
            }
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(MarketDetailFragment marketDetailFragment) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(marketDetailFragment), null, null, new MarketDetailFragment$setMyPosition$1$1$1(marketDetailFragment, null), 3, null);
            marketDetailFragment.AuCTel();
            return Unit.INSTANCE;
        }
    }

    public final void fJNWhG() {
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().copydefault(), null, new SharedElementCallback(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().OLrzqt(), null, new VoiceInteractor(), 2, null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class VoiceInteractor<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C29095knF c29095knF, Continuation<? super Unit> continuation) {
            C29154koL c29154koL;
            hAJ hajEjfBZ = MarketDetailFragment.ejfBZ(MarketDetailFragment.this);
            if (hajEjfBZ != null && (c29154koL = hajEjfBZ.values) != null) {
                final MarketDetailFragment marketDetailFragment = MarketDetailFragment.this;
                c29154koL.setVisibility(c29095knF.AEQbTJ() != null ? 0 : 8);
                PnLDetailsUiModel pnLDetailsUiModelAEQbTJ = c29095knF.AEQbTJ();
                if (pnLDetailsUiModelAEQbTJ != null) {
                    c29154koL.setData(marketDetailFragment.isConnected().copydefault().getValue().booleanValue(), pnLDetailsUiModelAEQbTJ.copydefault(), pnLDetailsUiModelAEQbTJ, new Function0() { // from class: o.hQB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return MarketDetailFragment.VoiceInteractor.KWHzl(marketDetailFragment);
                        }
                    });
                }
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(MarketDetailFragment marketDetailFragment) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(marketDetailFragment), null, null, new MarketDetailFragment$setMyPosition$2$1$1$1$1(marketDetailFragment, null), 3, null);
            marketDetailFragment.AuCTel();
            return Unit.INSTANCE;
        }
    }

    public final void AuCTel() {
        LatestMarketInfoBean second;
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        if (value == null || (second = value.getSecond()) == null) {
            return;
        }
        String tokenContractAddress = second.getTokenContractAddress();
        TokenBase tokenBase = this.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        C29112knW.Companion.OLrzqt(new PositionDetailsParam(tokenContractAddress, chainId, second.getNotSupportTxNativeToken(), second.getTokenSymbol(), "default_trade", iwGUEr().AuCTelauCTel(), second.getTokenLogoUrl(), false, 128, (DefaultConstructorMarker) null), iwGUEr().fetchVPNInfo(), new Function0() { // from class: o.hPO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.AwvSrB(this.KWHzl);
            }
        }).show(getChildFragmentManager(), "PositionFragmentBottomSheet");
    }

    public static final Unit AwvSrB(MarketDetailFragment marketDetailFragment) {
        marketDetailFragment.isConnected().KWHzl();
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        if (tokenBase != null) {
            marketDetailFragment.isConnected().OLrzqt(tokenBase.getChainId(), tokenBase.getTokenContractAddress(), false);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        hAJ haj = (hAJ) aX_();
        if (haj != null) {
            haj.OLrzqt.copydefault().clearOnTabSelectedListeners();
            haj.AhwBna.unregisterOnPageChangeCallback(this.fJNWhG);
            haj.AhwBna.setAdapter(null);
        }
        this.isConnected = null;
        this.AkhnZx = null;
        this.AhwBna = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResume() {
        boolean z;
        C55113xdn c55113xdn;
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        if (value != null) {
            z = value.getFirst().booleanValue();
        }
        Pair<Boolean, LatestMarketInfoBean> value2 = iwGUEr().valueOf().getValue();
        LatestMarketInfoBean second = value2 != null ? value2.getSecond() : null;
        hAJ haj = (hAJ) aX_();
        if (haj != null && (c55113xdn = haj.isConnected) != null) {
            c55113xdn.copydefault();
        }
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(z, second, null), 2, null);
        super.onResume();
        isConnected().KWHzl();
        OLrzqt(ejfBZ().copydefault().getValue());
        KWHzl(AuCTelauCTel().copydefault().getValue());
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment$onResume$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isReady;
        final /* synthetic */ LatestMarketInfoBean $latest;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, LatestMarketInfoBean latestMarketInfoBean, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isReady = z;
            this.$latest = latestMarketInfoBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarketDetailFragment.this.new AnonymousClass1(this.$isReady, this.$latest, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                kKG kkgFIwbmz = MarketDetailFragment.this.fIwbmz();
                this.label = 1;
                obj = kkgFIwbmz.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            final String str = (String) obj;
            final CoinDetailTabType coinDetailTabTypeEZpvd = C21847hOn.EZpvd(0, MarketDetailFragment.this.DbNXlk);
            if (this.$isReady) {
                TokenBase tokenBase = MarketDetailFragment.this.uzCIH;
                String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
                if (tokenContractAddress == null) {
                    tokenContractAddress = "";
                }
                TokenBase tokenBase2 = MarketDetailFragment.this.uzCIH;
                String tokenSymbol = tokenBase2 != null ? tokenBase2.getTokenSymbol() : null;
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
                TokenBase tokenBase3 = MarketDetailFragment.this.uzCIH;
                String chainId = tokenBase3 != null ? tokenBase3.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                TokenBase tokenBase4 = MarketDetailFragment.this.uzCIH;
                String chainName = tokenBase4 != null ? tokenBase4.getChainName() : null;
                final LatestMarketInfoBean latestMarketInfoBean = this.$latest;
                String strKWHzl = C31256lqb.KWHzl(chainName, (Function0<String>) new Function0() { // from class: o.hQs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MarketDetailFragment.AnonymousClass1.invokeSuspend$lambda$0(latestMarketInfoBean);
                    }
                });
                TokenBase tokenBase5 = MarketDetailFragment.this.uzCIH;
                String source = tokenBase5 != null ? tokenBase5.getSource() : null;
                C21847hOn.KWHzl(tokenContractAddress, tokenSymbol, chainId, strKWHzl, coinDetailTabTypeEZpvd, MarketDetailFragment.this.zsXlph(), source == null ? "" : source, str);
            } else {
                List list = MarketDetailFragment.this.valueOf;
                final MarketDetailFragment marketDetailFragment = MarketDetailFragment.this;
                C56443yFo.KWHzl(list.add(new Function1() { // from class: o.hQz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return MarketDetailFragment.AnonymousClass1.invokeSuspend$lambda$2(marketDetailFragment, coinDetailTabTypeEZpvd, str, (LatestMarketInfoBean) obj2);
                    }
                }));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0(LatestMarketInfoBean latestMarketInfoBean) {
            String chainName = latestMarketInfoBean != null ? latestMarketInfoBean.getChainName() : null;
            return chainName == null ? "" : chainName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(MarketDetailFragment marketDetailFragment, CoinDetailTabType coinDetailTabType, String str, final LatestMarketInfoBean latestMarketInfoBean) {
            TokenBase tokenBase = marketDetailFragment.uzCIH;
            String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
            String str2 = tokenContractAddress == null ? "" : tokenContractAddress;
            TokenBase tokenBase2 = marketDetailFragment.uzCIH;
            String tokenSymbol = tokenBase2 != null ? tokenBase2.getTokenSymbol() : null;
            String str3 = tokenSymbol == null ? "" : tokenSymbol;
            TokenBase tokenBase3 = marketDetailFragment.uzCIH;
            String chainId = tokenBase3 != null ? tokenBase3.getChainId() : null;
            String str4 = chainId == null ? "" : chainId;
            TokenBase tokenBase4 = marketDetailFragment.uzCIH;
            String strKWHzl = C31256lqb.KWHzl(tokenBase4 != null ? tokenBase4.getChainName() : null, (Function0<String>) new Function0() { // from class: o.hQA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return latestMarketInfoBean.getChainName();
                }
            });
            TokenBase tokenBase5 = marketDetailFragment.uzCIH;
            String source = tokenBase5 != null ? tokenBase5.getSource() : null;
            C21847hOn.KWHzl(str2, str3, str4, strKWHzl, coinDetailTabType, marketDetailFragment.zsXlph(), source == null ? "" : source, str);
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(String str) {
        if (str == null) {
            return;
        }
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        String strKWHzl = C31256lqb.KWHzl(second != null ? second.getTokenName() : null, (Function0<String>) new Function0() { // from class: o.hPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.ORxRYg(this.OLrzqt);
            }
        });
        String strKWHzl2 = C31256lqb.KWHzl(second != null ? second.getTokenSymbol() : null, (Function0<String>) new Function0() { // from class: o.hQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.DTwDnp(this.OLrzqt);
            }
        });
        String strKWHzl3 = C31256lqb.KWHzl(second != null ? second.getTokenContractAddress() : null, (Function0<String>) new Function0() { // from class: o.hQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.QOLQEE(this.copydefault);
            }
        });
        String strKWHzl4 = C31256lqb.KWHzl(second != null ? second.getChainName() : null, (Function0<String>) new Function0() { // from class: o.hQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.OcIXYQ(this.OLrzqt);
            }
        });
        TokenBase tokenBase = this.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        C21847hOn.KWHzl(strKWHzl, strKWHzl2, strKWHzl3, strKWHzl4, chainId == null ? "" : chainId, str);
    }

    public static final String ORxRYg(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenName = tokenBase != null ? tokenBase.getTokenName() : null;
        return tokenName == null ? "" : tokenName;
    }

    public static final String DTwDnp(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenSymbol = tokenBase != null ? tokenBase.getTokenSymbol() : null;
        return tokenSymbol == null ? "" : tokenSymbol;
    }

    public static final String QOLQEE(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        return tokenContractAddress == null ? "" : tokenContractAddress;
    }

    public static final String OcIXYQ(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String chainName = tokenBase != null ? tokenBase.getChainName() : null;
        return chainName == null ? "" : chainName;
    }

    public final void KWHzl(C29063kma c29063kma) {
        if (c29063kma.AEQbTJ() == null) {
            return;
        }
        Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
        LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        String strKWHzl = C31256lqb.KWHzl(second != null ? second.getTokenSymbol() : null, (Function0<String>) new Function0() { // from class: o.hPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.QKVWgx(this.EZpvd);
            }
        });
        String strKWHzl2 = C31256lqb.KWHzl(second != null ? second.getTokenContractAddress() : null, (Function0<String>) new Function0() { // from class: o.hPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.QfsBiF(this.EZpvd);
            }
        });
        String strKWHzl3 = C31256lqb.KWHzl(second != null ? second.getChainName() : null, (Function0<String>) new Function0() { // from class: o.hPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketDetailFragment.QUSxYX(this.OLrzqt);
            }
        });
        TokenBase tokenBase = this.uzCIH;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        C21847hOn.KWHzl(strKWHzl, strKWHzl2, strKWHzl3, chainId, c29063kma.AEQbTJ().KWHzl().values());
    }

    public static final String QKVWgx(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenSymbol = tokenBase != null ? tokenBase.getTokenSymbol() : null;
        return tokenSymbol == null ? "" : tokenSymbol;
    }

    public static final String QfsBiF(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        return tokenContractAddress == null ? "" : tokenContractAddress;
    }

    public static final String QUSxYX(MarketDetailFragment marketDetailFragment) {
        TokenBase tokenBase = marketDetailFragment.uzCIH;
        String chainName = tokenBase != null ? tokenBase.getChainName() : null;
        return chainName == null ? "" : chainName;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        isConnected().AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ MarketDetailFragment newInstance$default(Application application, TokenBase tokenBase, String str, String str2, CoinDetailRedirection coinDetailRedirection, int i, Object obj) {
            if ((i & 8) != 0) {
                coinDetailRedirection = null;
            }
            return application.copydefault(tokenBase, str, str2, coinDetailRedirection);
        }

        public final MarketDetailFragment copydefault(@NotNull TokenBase tokenBase, @NotNull String str, @NotNull String str2, CoinDetailRedirection coinDetailRedirection) {
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            MarketDetailFragment marketDetailFragment = new MarketDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("token_base", tokenBase);
            C31200lpY.EZpvd(bundle, str);
            bundle.putString("key.page_from", str2);
            bundle.putParcelable("coin_detail_redirection", coinDetailRedirection);
            marketDetailFragment.setArguments(bundle);
            return marketDetailFragment;
        }
    }

    public final void OLrzqt(TokenInfoForAlert tokenInfoForAlert) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C25632jAp.KWHzl.copydefault(context, tokenInfoForAlert);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC13655dTj
    public void copydefault() {
        C55113xdn c55113xdn;
        hAJ haj = (hAJ) aX_();
        if (haj == null || (c55113xdn = haj.isConnected) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC13655dTj
    public void AEQbTJ() {
        C55113xdn c55113xdn;
        hAJ haj = (hAJ) aX_();
        if (haj == null || (c55113xdn = haj.isConnected) == null) {
            return;
        }
        c55113xdn.copydefault();
    }

    public final void getFieldNames() {
        try {
            Result.Application application = Result.Companion;
            TokenBase tokenBase = this.uzCIH;
            Unit unit = null;
            if (tokenBase != null) {
                MarketCoinSharedViewModel marketCoinSharedViewModelValues = values();
                Pair<Boolean, LatestMarketInfoBean> value = iwGUEr().valueOf().getValue();
                marketCoinSharedViewModelValues.AEQbTJ(tokenBase, value != null ? value.getSecond() : null);
                unit = Unit.INSTANCE;
            }
            Result.m7377constructorimpl(unit);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
