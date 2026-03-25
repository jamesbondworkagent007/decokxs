package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.collection.ArrayMapKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexui.main.market.MarketFragment$startAnimation$1;
import com.okinc.business.dexui.main.market.MarketParams;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.favorite_list_signal.ui.FavoriteListSignalViewModel;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home.ui.HomeSharedFilterViewModel;
import com.okinc.business.market.features.home.ui.MarketHomeViewModel;
import com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.wallet.api.bean.WalletSearchConfiguration;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C46541tYd;
import o.C52761wXj;
import o.InterfaceC28403kaC;
import o.InterfaceC43294rma;
import o.InterfaceC9847bdM;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hNW extends hNT {
    public hAL AYXKKw;
    public boolean AkhnZx;
    public AbstractC28450kax AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final FragmentManager ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public Job gEmmrt;
    public final C58216yxB isConnected;
    public final ActionBar values;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.getPriority;
    }

    public hNW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = true;
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeSharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FavoriteListSignalViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$14
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$15
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$16
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$17
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedWatchListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$18
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$19
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
                Function0 function06 = function02;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.MarketFragment$special$$inlined$viewModels$default$20
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.hOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hNW.AYXKKw();
            }
        });
        this.isConnected = new C58216yxB();
        this.values = new ActionBar();
        this.ejfBZ = new FragmentManager();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hNW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final hNW copydefault(@NotNull MarketParams marketParams) {
            Intrinsics.checkNotNullParameter(marketParams, "");
            hNW hnw = new hNW();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, "default_trade");
            bundle.putParcelable("key.market", marketParams);
            hnw.setArguments(bundle);
            return hnw;
        }
    }

    public final MarketHomeViewModel DbNXlk() {
        return (MarketHomeViewModel) this.fJNWhG.getValue();
    }

    public final MarketParams AkhnZx() {
        MarketParams marketParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (marketParams = (MarketParams) arguments.getParcelable("key.market")) == null) ? (MarketParams) C31200lpY.throwIfDebug$default(new MarketParams("", null, null, 6, null), null, 2, null) : marketParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeSharedFilterViewModel fetchVPNInfo() {
        return (HomeSharedFilterViewModel) this.fARcdN.getValue();
    }

    public final xWA djBIcL() {
        return (xWA) this.DbNXlk.getValue();
    }

    public static final xWA AYXKKw() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl != null) {
            return (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl);
        }
        return null;
    }

    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.hOn.trackDexMarketFullPageClickEvent$default(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, int, java.lang.Object):void */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            AbstractC28450kax abstractC28450kax;
            java.lang.String strCopydefault;
            java.lang.String strCopydefault2;
            hNW.this.DbNXlk().EZpvd(i);
            if (hNW.this.AkhnZx || (abstractC28450kax = hNW.this.AuCTel) == null || (strCopydefault = abstractC28450kax.copydefault(i)) == null || (strCopydefault2 = C28518kcL.copydefault(strCopydefault)) == null) {
                return;
            }
            hNW hnw = hNW.this;
            C21847hOn.EZpvd(hnw.AkhnZx().EZpvd(), (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : strCopydefault2, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, hnw.DbNXlk().gEmmrt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        }
    }

    public static final class FragmentManager implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public FragmentManager() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            C33546myW c33546myW;
            FragmentContainerView fragmentContainerView;
            C28957kka c28957kka;
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            hAL hal = hNW.this.AYXKKw;
            if (hal != null && (fragmentContainerView = hal.AYXKKw) != null && (c28957kka = (C28957kka) fragmentContainerView.getFragment()) != null) {
                c28957kka.djBIcL();
            }
            hNW.this.DbNXlk().EZpvd(hNW.this.AkhnZx().EZpvd());
            hAL hal2 = hNW.this.AYXKKw;
            if (hal2 == null || (c33546myW = hal2.AuCTel) == null) {
                return;
            }
            c33546myW.AEQbTJ();
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ hNW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, hNW hnw) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = hnw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                androidx.fragment.app.Fragment fragmentEZpvd = ((xWQ) C43251rlk.copydefault(xWQ.class)).EZpvd(new WalletSearchConfiguration(true, "default_trade", new WalletSearchConfiguration.DisplayOptions("dex_search_bar_shared_element", true)));
                C21847hOn.EZpvd(this.copydefault.AkhnZx().EZpvd(), (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : java.lang.Boolean.TRUE, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, this.copydefault.DbNXlk().gEmmrt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
                DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this.copydefault);
                if (dexFragmentNavigatorAEQbTJ != null) {
                    dexFragmentNavigatorAEQbTJ.EZpvd(fragmentEZpvd, (6 & 2) != 0 ? fragmentEZpvd.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ hNW AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ hAL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, hNW hnw, hAL hal) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = hnw;
            this.copydefault = hal;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                xWA xwaDjBIcL = this.AEQbTJ.djBIcL();
                if (xwaDjBIcL != null) {
                    android.content.Context context = this.copydefault.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    xwaDjBIcL.KWHzl(context, this.AEQbTJ.getParentFragmentManager(), java.lang.Integer.valueOf(C23274hvD.Application.zeUYeG));
                }
                this.AEQbTJ.isConnected();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ hNW OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, hNW hnw) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = hnw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity != null) {
                    InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, gKZ.EZpvd.AEQbTJ("wallet/referral/dashboard"), null, VoiceInteractor.copydefault, 4, null);
                    C32866mlf.onEvent$default("DexReferral_EntryPoint_Tokenpage_Click", (TrackChannel[]) null, this.OLrzqt.new SharedElementCallback(), 1, (java.lang.Object) null);
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ hAL EZpvd;
        public final /* synthetic */ hNW KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, hNW hnw, hAL hal) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = hnw;
            this.EZpvd = hal;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                androidx.fragment.app.Fragment fragmentEZpvd = ((xWQ) C43251rlk.copydefault(xWQ.class)).EZpvd(new WalletSearchConfiguration(true, "default_trade", new WalletSearchConfiguration.DisplayOptions("dex_search_bar_shared_element", true)));
                DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this.KWHzl);
                if (dexFragmentNavigatorAEQbTJ != null) {
                    C31197lpV c31197lpV = C31197lpV.EZpvd;
                    DexFragmentNavigator.Activity activity = new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    C55230xfy c55230xfy = this.EZpvd.isConnected;
                    Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
                    dexFragmentNavigatorAEQbTJ.EZpvd(fragmentEZpvd, (6 & 2) != 0 ? fragmentEZpvd.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : c31197lpV.OLrzqt(activity, c55230xfy, "dex_search_bar_shared_element"));
                }
            }
        }
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        DbNXlk().OLrzqt();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
    }

    @Override // o.AbstractC23346hwW, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C58216yxB c58216yxB = this.isConnected;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNW.AEQbTJ(this.AEQbTJ, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                hNW.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNW.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                hNW.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.AEQbTJ(c58216yxB, interfaceC58217yxCAEQbTJ);
        C58216yxB c58216yxB2 = this.isConnected;
        AbstractC58185ywX abstractC58185ywXKWHzl2 = RxBus.KWHzl(C46541tYd.TaskDescription.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXKWHzl3 = C58156yvv.EZpvd(abstractC58185ywXKWHzl2, this).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.hOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNW.KWHzl(this.AEQbTJ, (C46541tYd.TaskDescription) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                hNW.OLrzqt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        yBK.AEQbTJ(c58216yxB2, interfaceC58217yxCAEQbTJ2);
        DbNXlk().EZpvd(AkhnZx().EZpvd());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(hNW hnw, xXO xxo) {
        hnw.DbNXlk().EZpvd(hnw.AkhnZx().EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(hNW hnw, C46541tYd.TaskDescription taskDescription) {
        hnw.DbNXlk().EZpvd(hnw.AkhnZx().EZpvd());
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.AYXKKw = hAL.copydefault(view);
        fIwbmz();
        C25390ivn.collectOnViewLifecycle$default(this, DbNXlk().copydefault(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, DbNXlk().AEQbTJ(), null, new StateListAnimator(), 2, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28403kaC interfaceC28403kaC, Continuation<? super Unit> continuation) {
            hNW.this.OLrzqt(interfaceC28403kaC);
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28404kaD c28404kaD, Continuation<? super Unit> continuation) {
            hNW.this.copydefault(c28404kaD);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        DbNXlk().EZpvd(AkhnZx().EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C55113xdn c55113xdn;
        super.onDestroy();
        this.isConnected.OLrzqt();
        hAL hal = this.AYXKKw;
        if (hal != null && (c55113xdn = hal.DbNXlk) != null) {
            c55113xdn.copydefault();
        }
        this.AYXKKw = null;
    }

    public final void OLrzqt(InterfaceC28403kaC interfaceC28403kaC) {
        if (interfaceC28403kaC instanceof InterfaceC28403kaC.TaskDescription) {
            return;
        }
        EZpvd(interfaceC28403kaC instanceof InterfaceC28403kaC.ActionBar);
        boolean z = interfaceC28403kaC instanceof InterfaceC28403kaC.Activity;
        copydefault(z);
        if (interfaceC28403kaC instanceof InterfaceC28403kaC.StateListAnimator) {
            AEQbTJ(((InterfaceC28403kaC.StateListAnimator) interfaceC28403kaC).AEQbTJ());
            EZpvd(DbNXlk().KWHzl());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        if (z) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        DbNXlk().AhwBna();
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        if (list.size() > 1) {
            copydefault(list, 400L, 2000L);
            return;
        }
        fARcdN();
        if (list.size() == 1) {
            KWHzl(list.get(0));
        } else {
            KWHzl("");
        }
    }

    public final void AEQbTJ(java.util.List<HomeTab> list) {
        AbstractC28450kax c28452kaz;
        hAL hal = this.AYXKKw;
        if (hal == null) {
            return;
        }
        final java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        xWA xwaDjBIcL = djBIcL();
        if (xwaDjBIcL != null) {
            if (xwaDjBIcL.copydefault("dapp_home")) {
                listFJNWhG.add(new HomeTab("dapp_home", null, null, null, null, AkhnZx().EZpvd(), 30, null));
            }
            c28452kaz = new C28402kaB(this, AkhnZx().EZpvd(), listFJNWhG, xwaDjBIcL);
        } else {
            c28452kaz = new C28452kaz(this, AkhnZx().EZpvd(), listFJNWhG);
        }
        this.AuCTel = c28452kaz;
        hal.copydefault.setAdapter(c28452kaz);
        hal.copydefault.setOffscreenPageLimit(2);
        new TabLayoutMediator(hal.OLrzqt.copydefault(), hal.copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.hNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                hNW.AEQbTJ(listFJNWhG, this, tab, i);
            }
        }).attach();
        int iEZpvd = DbNXlk().EZpvd();
        if (iEZpvd >= 0 && iEZpvd < listFJNWhG.size()) {
            hal.copydefault.setCurrentItem(iEZpvd, false);
        }
        hal.copydefault.registerOnPageChangeCallback(this.values);
        InterfaceC22598hiQ interfaceC22598hiQCopydefault = C22380heK.OLrzqt.copydefault(AEQbTJ()).copydefault();
        C25390ivn.collectOnViewLifecycle$default(this, interfaceC22598hiQCopydefault.AYXKKw(), null, new Application(listFJNWhG, interfaceC22598hiQCopydefault), 2, null);
        if (this.AkhnZx) {
            AdvancedFilter advancedFilterAEQbTJ = ((HomeTab) listFJNWhG.get(iEZpvd)).AEQbTJ();
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(advancedFilterAEQbTJ.AEQbTJ(), ",", null, null, 0, null, null, 62, null);
            TimeIntervalType timeIntervalTypeFetchVPNInfo = advancedFilterAEQbTJ.fetchVPNInfo();
            java.lang.String strCopydefault = C28518kcL.copydefault(((HomeTab) listFJNWhG.get(iEZpvd)).EZpvd());
            if (Intrinsics.EZpvd((java.lang.Object) strJoinToString$default, (java.lang.Object) "all")) {
                strJoinToString$default = "-100";
            }
            C21847hOn.KWHzl(strCopydefault, strJoinToString$default, fetchVPNInfo().copydefault().getValue().AEQbTJ().OLrzqt(), timeIntervalTypeFetchVPNInfo, "app_web3", "default_trade", DbNXlk().gEmmrt(), (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? null : null);
            this.AkhnZx = false;
        }
    }

    public static final void AEQbTJ(java.util.List list, hNW hnw, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        java.lang.String strEZpvd = ((HomeTab) list.get(i)).EZpvd();
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "watchlist")) {
            tab.setText(hnw.getString(C23274hvD.Fragment.onMessageChannelReady));
            tab.view.setContentDescription("web3_dex_market_home_tokens_list_tab_watchlist");
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "dapp_home")) {
            tab.setText(hnw.getString(C23274hvD.Fragment.DGUQLIOvDItG));
            tab.view.setContentDescription("web3_dex_market_home_tokens_list_tab_}dapps");
            return;
        }
        tab.setText(((HomeTab) list.get(i)).KWHzl());
        tab.view.setContentDescription("web3_dex_market_home_tokens_list_tab_" + i);
    }

    public final void EZpvd(boolean z) {
        hAL hal = this.AYXKKw;
        if (hal == null) {
            return;
        }
        android.widget.FrameLayout frameLayout = hal.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(z ? 0 : 8);
        if (z) {
            C55113xdn c55113xdn = hal.DbNXlk;
            Intrinsics.copydefault(c55113xdn);
            C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_MARKET_HOME_LOADING);
            c55113xdn.playAnimation();
            Intrinsics.copydefault(c55113xdn);
            return;
        }
        hal.DbNXlk.copydefault();
    }

    public final void copydefault(boolean z) {
        C55173xeu c55173xeu;
        hAL hal = this.AYXKKw;
        if (hal == null || (c55173xeu = hal.KWHzl) == null) {
            return;
        }
        c55173xeu.setVisibility(z ? 0 : 8);
        if (z) {
            c55173xeu.setEmptyTypeImage(8);
            java.lang.String string = getString(C23274hvD.Fragment.ActivityResultKt);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            java.lang.String string2 = getString(C23274hvD.Fragment.UscePu);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            java.lang.String string3 = getString(C23274hvD.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hNY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    hNW.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void copydefault(hNW hnw, android.view.View view) {
        FragmentContainerView fragmentContainerView;
        C28957kka c28957kka;
        hnw.DbNXlk().EZpvd(hnw.AkhnZx().EZpvd());
        hAL hal = hnw.AYXKKw;
        if (hal == null || (fragmentContainerView = hal.AYXKKw) == null || (c28957kka = (C28957kka) fragmentContainerView.getFragment()) == null) {
            return;
        }
        c28957kka.djBIcL();
    }

    private final void fIwbmz() {
        final hAL hal = this.AYXKKw;
        if (hal == null) {
            return;
        }
        hal.EZpvd.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.hOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                hNW.EZpvd(hal, appBarLayout, i);
            }
        });
        hal.isConnected.setTransitionName("dex_search_bar_shared_element");
        C55230xfy c55230xfy = hal.isConnected;
        c55230xfy.setOnClickListener(new PendingIntent(c55230xfy, 1000L, this, hal));
        hal.isConnected.setOnSearchBarClick(new Function0() { // from class: o.hOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hNW.AhwBna(this.EZpvd);
            }
        });
        AppCompatImageView appCompatImageView = hal.AhwBna;
        appCompatImageView.setOnClickListener(new Dialog(appCompatImageView, 1000L, this));
        hal.DbNXlk.setAutoMirrored(true);
        hal.AkhnZx.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        hal.AuCTel.setNoMoreDataEffective(false);
        hal.AuCTel.AhwBna(false);
        hal.AuCTel.OLrzqt((InterfaceC57901yrE) this.ejfBZ);
        hal.OLrzqt.KWHzl(false);
        hal.copydefault.registerOnPageChangeCallback(this.values);
        ((C28957kka) hal.AYXKKw.getFragment()).KWHzl(AkhnZx().EZpvd());
        android.widget.FrameLayout frameLayout = hal.valueOf;
        frameLayout.setOnClickListener(new Fragment(frameLayout, 1000L, this, hal));
        valueOf();
        hal.gEmmrt.setAnimation(values());
        LottieAnimationView lottieAnimationView = hal.gEmmrt;
        lottieAnimationView.setOnClickListener(new LoaderManager(lottieAnimationView, 1000L, this));
    }

    public static final void EZpvd(hAL hal, AppBarLayout appBarLayout, int i) {
        hal.AuCTel.setEnabled(C23313hvq.EZpvd(java.lang.Integer.valueOf(i), 0));
        AppCompatImageView appCompatImageView = hal.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(i >= C55298xhM.dpInt$default(52, (android.content.Context) null, 1, (java.lang.Object) null) * (-1) ? 8 : 0);
    }

    public static final Unit AhwBna(hNW hnw) {
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.ClipData.EZpvd);
        C21847hOn.EZpvd(hnw.AkhnZx().EZpvd(), (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : java.lang.Boolean.TRUE, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, hnw.DbNXlk().gEmmrt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final class VoiceInteractor implements Function1<AbstractC43238rlX, Unit> {
        public static final VoiceInteractor copydefault = new VoiceInteractor();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            copydefault(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public static final class SharedElementCallback implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.lang.String strGEmmrt = hNW.this.DbNXlk().gEmmrt();
            EventParamsList.put$default(eventParamsList, "wallet_id", strGEmmrt == null ? "" : strGEmmrt, false, 4, null);
        }
    }

    public final void copydefault(java.util.List<java.lang.String> list, long j, long j2) {
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketFragment$startAnimation$1(this, list, j2, j, null), 3, null);
    }

    private final void fARcdN() {
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gEmmrt = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        fARcdN();
    }

    public final void KWHzl(java.lang.String str) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        C55230xfy c55230xfy2;
        OKEditText oKEditTextKWHzl2;
        if (str.length() == 0) {
            hAL hal = this.AYXKKw;
            if (hal == null || (c55230xfy2 = hal.isConnected) == null || (oKEditTextKWHzl2 = c55230xfy2.KWHzl()) == null) {
                return;
            }
            oKEditTextKWHzl2.setHint(getString(C23274hvD.Fragment.clearObservers));
            return;
        }
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.gkJEwt);
        android.text.SpannableString spannableString = new android.text.SpannableString("icon " + C33069mpW.copydefault(this, C23274hvD.Fragment.getAudioAttributes, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", str))) + " ");
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            spannableString.setSpan(new C28406kaF(drawableKWHzl), 0, 4, 33);
        }
        hAL hal2 = this.AYXKKw;
        if (hal2 == null || (c55230xfy = hal2.isConnected) == null || (oKEditTextKWHzl = c55230xfy.KWHzl()) == null) {
            return;
        }
        oKEditTextKWHzl.setHint(spannableString);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf();
    }

    public final void copydefault(C28404kaD c28404kaD) {
        final hAL hal = this.AYXKKw;
        if (hal != null) {
            LottieAnimationView lottieAnimationView = hal.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
            lottieAnimationView.setVisibility(c28404kaD.OLrzqt() ? 0 : 8);
            if (c28404kaD.OLrzqt() && c28404kaD.AEQbTJ()) {
                hal.gEmmrt.postDelayed(new java.lang.Runnable() { // from class: o.hOb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hNW.OLrzqt(hal, this);
                    }
                }, 1000L);
            }
        }
    }

    public static final void OLrzqt(hAL hal, hNW hnw) {
        hal.gEmmrt.playAnimation();
        hnw.DbNXlk().valueOf();
    }

    public final int values() {
        return C33492mxV.OLrzqt() ? C52761wXj.PendingIntent.gEmmrt : C52761wXj.PendingIntent.djBIcL;
    }

    public final void valueOf() {
        hAL hal = this.AYXKKw;
        if (hal != null) {
            xWA xwaDjBIcL = djBIcL();
            if (xwaDjBIcL != null) {
                int iOLrzqt = xwaDjBIcL.OLrzqt();
                android.widget.FrameLayout frameLayout = hal.valueOf;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility(0);
                if (iOLrzqt > 0) {
                    hal.djBIcL.setImageResource(C52761wXj.TaskDescription.zblBkD);
                    hal.fJNWhG.setText(java.lang.String.valueOf(iOLrzqt));
                    return;
                } else {
                    hal.djBIcL.setImageResource(C52761wXj.TaskDescription.ArkbYM);
                    hal.fJNWhG.setText("");
                    return;
                }
            }
            android.widget.FrameLayout frameLayout2 = hal.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
        }
    }

    public final void isConnected() {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_DApps_Icon_Click", new TrackChannel[0], new Function1() { // from class: o.hNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hNW.AEQbTJ(this.copydefault, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(hNW hnw, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "position", "explore", false, 4, null);
        java.lang.String strGEmmrt = hnw.DbNXlk().gEmmrt();
        if (strGEmmrt == null) {
            strGEmmrt = "none";
        } else {
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                strGEmmrt = null;
            }
            if (strGEmmrt == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", strGEmmrt, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class Application<T> implements FlowCollector {
        public final /* synthetic */ InterfaceC22598hiQ EZpvd;
        public final /* synthetic */ java.util.List<HomeTab> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.util.List<HomeTab> list, InterfaceC22598hiQ interfaceC22598hiQ) {
            this.OLrzqt = list;
            this.EZpvd = interfaceC22598hiQ;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(MarketParams marketParams, Continuation<? super Unit> continuation) {
            java.lang.String strAEQbTJ;
            java.lang.String strOLrzqt;
            hNW hnw = hNW.this;
            java.util.List<HomeTab> list = this.OLrzqt;
            InterfaceC22598hiQ interfaceC22598hiQ = this.EZpvd;
            try {
                Result.Application application = Result.Companion;
            } catch (CancellationException e) {
                throw e;
            } catch (java.lang.Throwable th) {
                pUU.AEQbTJ("DEX", "dexRunCatching", th);
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (marketParams != null) {
                hAL hal = hnw.AYXKKw;
                if (hal != null && (strAEQbTJ = marketParams.AEQbTJ()) != null) {
                    java.util.Iterator<HomeTab> it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (C59449zhJ.gEmmrt(it.next().EZpvd(), strAEQbTJ, true)) {
                            break;
                        }
                        i++;
                    }
                    java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
                    if (numAEQbTJ.intValue() == -1) {
                        numAEQbTJ = null;
                    }
                    if (numAEQbTJ != null) {
                        int iIntValue = numAEQbTJ.intValue();
                        hal.copydefault.setCurrentItem(iIntValue, false);
                        if (iIntValue != 0 && (strOLrzqt = marketParams.OLrzqt()) != null) {
                            hnw.fetchVPNInfo().copydefault(strOLrzqt);
                        }
                    }
                    interfaceC22598hiQ.AEQbTJ(null);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }
}
