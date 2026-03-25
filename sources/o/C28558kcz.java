package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.chain_picker.ChainPickerParams;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.QuickFilterConfig;
import com.okinc.business.market.features.filter.ui.params.FilterTabFragmentParams;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home.ui.HomeSharedFilterViewModel;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFilterViewModel;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$adapter$2$1$4$1;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$handleFavoriteStatusResult$1;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$onResume$1;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListViewModel;
import com.okinc.business.market.features.interval_picker.ui.IntervalPickerParams;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C31197lpV;
import o.C52761wXj;
import o.InterfaceC28519kcM;
import o.InterfaceC28591kdf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28558kcz extends AbstractC28551kcs implements InterfaceC23406hxd, InterfaceC28591kdf, InterfaceC26190jVg, kCQ {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final ActionBar djBIcL;
    public C21473hAr fARcdN;
    public final InterfaceC28047kMy fetchVPNInfo;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.kcB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28558kcz.fJNWhG(this.KWHzl);
        }
    });
    public kCM valueOf;
    public boolean values;

    /* JADX INFO: renamed from: o.kcz$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeIntervalType.values().length];
            try {
                iArr[TimeIntervalType.FIVE_MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimeIntervalType.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeIntervalType.FOUR_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeIntervalType.TWENTY_FOUR_HOUR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.dLBcXg;
    }

    public C28558kcz() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$2
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeTokenListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.kcA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28558kcz.ejfBZ(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$6
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeSharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$9
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$10
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$11
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeTokenListFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$12
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$13
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$special$$inlined$viewModels$default$14
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28558kcz.isConnected(this.copydefault);
            }
        });
        this.djBIcL = new ActionBar();
        this.fetchVPNInfo = new InterfaceC28047kMy() { // from class: o.kcF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC28047kMy
            public final void KWHzl(kMC kmc) {
                C28558kcz.AEQbTJ(this.copydefault, kmc);
            }
        };
    }

    public final HomeTab djBIcL() {
        return (HomeTab) this.isConnected.getValue();
    }

    public static final HomeTab fJNWhG(C28558kcz c28558kcz) {
        HomeTab homeTab;
        android.os.Bundle arguments = c28558kcz.getArguments();
        return (arguments == null || (homeTab = (HomeTab) BundleCompat.getParcelable(arguments, "key.tab_data", HomeTab.class)) == null) ? new HomeTab(null, null, new AdvancedFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, null, null, false, null, false, -1, 3, null), null, null, null, 59, null) : homeTab;
    }

    public final boolean valueOf() {
        return Intrinsics.EZpvd((java.lang.Object) djBIcL().OLrzqt(), (java.lang.Object) "scanner");
    }

    public final HomeTokenListViewModel AYXKKw() {
        return (HomeTokenListViewModel) this.AuCTel.getValue();
    }

    public final HomeSharedFilterViewModel AhwBna() {
        return (HomeSharedFilterViewModel) this.DbNXlk.getValue();
    }

    public static final ViewModelStoreOwner ejfBZ(C28558kcz c28558kcz) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28558kcz.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.kcs.EZpvd()V */
    public final HomeTokenListFilterViewModel EZpvd() {
        return (HomeTokenListFilterViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM DbNXlk() {
        return (kMM) this.AYXKKw.getValue();
    }

    public static final kMM isConnected(final C28558kcz c28558kcz) {
        kMM kmm = new kMM();
        Function0 function0 = new Function0() { // from class: o.kcJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28558kcz.fIwbmz(this.KWHzl);
            }
        };
        Function1 function1 = new Function1() { // from class: o.kcx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28558kcz.EZpvd(this.EZpvd, (HomeToken) obj);
            }
        };
        Function2 function2 = new Function2() { // from class: o.kcv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28558kcz.EZpvd(this.AEQbTJ, (kotlin.Pair) obj, (HomeToken) obj2);
            }
        };
        Function1 function12 = new Function1() { // from class: o.kcC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28558kcz.KWHzl(this.AEQbTJ, (HomeToken) obj);
            }
        };
        java.lang.String strCopydefault = C28518kcL.copydefault(c28558kcz.djBIcL().EZpvd());
        androidx.fragment.app.FragmentManager childFragmentManager = c28558kcz.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kmm.register(HomeToken.class, new C28528kcV(function0, function1, function2, function12, strCopydefault, childFragmentManager));
        kmm.register(C28526kcT.class, new C28524kcR(c28558kcz.valueOf(), new Function0() { // from class: o.kcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28558kcz.AuCTel(this.EZpvd);
            }
        }));
        return kmm;
    }

    public static final android.content.Context fIwbmz(C28558kcz c28558kcz) {
        android.content.Context contextRequireContext = c28558kcz.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return contextRequireContext;
    }

    public static final Unit EZpvd(C28558kcz c28558kcz, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(homeToken, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.LoaderManager.copydefault);
        c28558kcz.OLrzqt(homeToken);
        java.lang.String strAEQbTJ = c28558kcz.EZpvd().copydefault().getValue().EZpvd().AEQbTJ().AEQbTJ();
        java.lang.String strAYXKKw = homeToken.AYXKKw();
        java.lang.String strOLrzqt = homeToken.OLrzqt();
        if (!Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "all")) {
            strAEQbTJ = c28558kcz.EZpvd().copydefault().getValue().EZpvd().AEQbTJ().OLrzqt();
        }
        TimeIntervalType timeIntervalTypeCopydefault = c28558kcz.AhwBna().copydefault().getValue().copydefault();
        java.lang.String strCopydefault = C28518kcL.copydefault(c28558kcz.djBIcL().EZpvd());
        java.lang.String strOLrzqt2 = c28558kcz.AYXKKw().OLrzqt();
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : strCopydefault, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : timeIntervalTypeCopydefault, (114682 & 32) != 0 ? null : strAEQbTJ, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : strAYXKKw, (114682 & 1024) != 0 ? null : strOLrzqt, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : "token_detail", strOLrzqt2, (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(c28558kcz.valueOf()), (114682 & 65536) != 0 ? null : c28558kcz.djBIcL().EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C28558kcz c28558kcz, kotlin.Pair pair, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(homeToken, "");
        c28558kcz.KWHzl((kotlin.Pair<java.lang.Integer, java.lang.Integer>) pair, homeToken);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28558kcz c28558kcz, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(homeToken, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(c28558kcz), null, null, new HomeTokenListFragment$adapter$2$1$4$1(c28558kcz, homeToken, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C28558kcz c28558kcz) {
        c28558kcz.EZpvd().gEmmrt();
        jUD.copydefault.AEQbTJ(c28558kcz.djBIcL().KWHzl());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kcz$ActionBar */
    public static final class ActionBar implements kLR {
        public ActionBar() {
        }

        @Override // o.kLR
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C23407hxe c23407hxeCopydefault = C23407hxe.Companion.copydefault(new ChainPickerParams(str));
            androidx.fragment.app.FragmentManager childFragmentManager = C28558kcz.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c23407hxeCopydefault.show(childFragmentManager);
        }

        @Override // o.kLR
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C28558kcz.this.AhwBna().AEQbTJ(new HomeChainFilterUiModel(str, str2, null, 4, null));
            TimeIntervalType timeIntervalTypeCopydefault = C28558kcz.this.AhwBna().copydefault().getValue().copydefault();
            java.lang.String strCopydefault = C28518kcL.copydefault(C28558kcz.this.djBIcL().EZpvd());
            C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : strCopydefault, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : timeIntervalTypeCopydefault, (114682 & 32) != 0 ? null : str2, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : str, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : "network_selected", C28558kcz.this.AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(C28558kcz.this.valueOf()), (114682 & 65536) != 0 ? null : C28558kcz.this.djBIcL().EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.kcz$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28558kcz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C28558kcz c28558kcz) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c28558kcz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ((C55052xcf) this.KWHzl).setSelected(true);
                C28594kdi c28594kdiAEQbTJ = C28594kdi.Companion.AEQbTJ(new IntervalPickerParams(yDY.gEmmrt(TimeIntervalType.FIVE_MIN, TimeIntervalType.ONE_HOUR, TimeIntervalType.FOUR_HOUR, TimeIntervalType.TWENTY_FOUR_HOUR), this.copydefault.EZpvd().EZpvd().getValue().fetchVPNInfo()));
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c28594kdiAEQbTJ.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.kcz$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C28558kcz OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C28558kcz c28558kcz) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c28558kcz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.gEmmrt();
            }
        }
    }

    public static final void AEQbTJ(C28558kcz c28558kcz, kMC kmc) {
        Intrinsics.checkNotNullParameter(kmc, "");
        c28558kcz.EZpvd().copydefault(kmc);
        java.lang.String strAEQbTJ = c28558kcz.EZpvd().copydefault().getValue().EZpvd().AEQbTJ().AEQbTJ();
        RankingType rankingTypeEZpvd = kmc.EZpvd();
        java.lang.Integer numValueOf = rankingTypeEZpvd != null ? java.lang.Integer.valueOf(rankingTypeEZpvd.getValue()) : null;
        boolean zAEQbTJ = kmc.AEQbTJ();
        TimeIntervalType timeIntervalTypeCopydefault = c28558kcz.AhwBna().copydefault().getValue().copydefault();
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : C28518kcL.copydefault(c28558kcz.djBIcL().EZpvd()), (114682 & 8) != 0 ? null : numValueOf, (114682 & 16) != 0 ? null : timeIntervalTypeCopydefault, (114682 & 32) != 0 ? null : Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "all") ? strAEQbTJ : c28558kcz.EZpvd().copydefault().getValue().EZpvd().AEQbTJ().OLrzqt(), (114682 & 64) != 0 ? null : java.lang.Boolean.valueOf(zAEQbTJ), (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : strAEQbTJ, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28558kcz.AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(c28558kcz.valueOf()), (114682 & 65536) != 0 ? null : c28558kcz.djBIcL().EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AhwBna = bundle != null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.fARcdN = C21473hAr.EZpvd(view);
        values();
        this.valueOf = new kCM();
        StateFlow<C28451kay> stateFlowCopydefault = AhwBna().copydefault();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C25390ivn.AEQbTJ(this, stateFlowCopydefault, state, new TaskDescription());
        C25390ivn.AEQbTJ(this, EZpvd().EZpvd(), state, new StateListAnimator());
        C25390ivn.AEQbTJ(this, EZpvd().copydefault(), state, new FragmentManager());
        C25390ivn.AEQbTJ(this, AYXKKw().copydefault(), state, new Fragment());
        C25390ivn.AEQbTJ(this, AYXKKw().KWHzl(), state, new Dialog());
    }

    /* JADX INFO: renamed from: o.kcz$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28451kay c28451kay, Continuation<? super Unit> continuation) {
            C28558kcz.this.EZpvd().EZpvd(c28451kay);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kcz$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AdvancedFilter advancedFilter, Continuation<? super Unit> continuation) {
            C28558kcz.this.AYXKKw().EZpvd(advancedFilter, C28558kcz.this.AhwBna);
            C28558kcz.this.AhwBna = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kcz$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C28549kcq c28549kcq, Continuation<? super Unit> continuation) {
            C28558kcz.this.copydefault(c28549kcq);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kcz$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28519kcM interfaceC28519kcM, Continuation<? super Unit> continuation) {
            C28558kcz.this.EZpvd(interfaceC28519kcM);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kcz$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<HomeToken> list, Continuation<? super Unit> continuation) {
            kMM.setData$default(C28558kcz.this.DbNXlk(), list, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AdvancedFilter value = EZpvd().EZpvd().getValue();
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(value.AEQbTJ(), ",", null, null, 0, null, null, 62, null);
        TimeIntervalType timeIntervalTypeFetchVPNInfo = value.fetchVPNInfo();
        java.lang.String strCopydefault = C28518kcL.copydefault(djBIcL().EZpvd());
        if (Intrinsics.EZpvd((java.lang.Object) strJoinToString$default, (java.lang.Object) "all")) {
            strJoinToString$default = "-100";
        }
        java.lang.String str = strJoinToString$default;
        java.lang.String strOLrzqt = EZpvd().copydefault().getValue().EZpvd().AEQbTJ().OLrzqt();
        java.lang.String strOLrzqt2 = AYXKKw().OLrzqt();
        boolean zValueOf = valueOf();
        C21847hOn.KWHzl(strCopydefault, str, strOLrzqt, timeIntervalTypeFetchVPNInfo, "app_web3", "default_trade", strOLrzqt2, java.lang.Boolean.valueOf(zValueOf), djBIcL().EZpvd());
        InterfaceC28519kcM value2 = AYXKKw().copydefault().getValue();
        if ((value2 instanceof InterfaceC28519kcM.ActionBar) || (value2 instanceof InterfaceC28519kcM.Application)) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeTokenListFragment$onResume$1(this, value, null), 3, null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        AYXKKw().AhwBna();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.fARcdN = null;
        this.valueOf = null;
        super.onDestroyView();
    }

    @Override // o.InterfaceC23406hxd
    public void KWHzl(@NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        java.lang.String chainId = marketChainBean.getChainId();
        if (Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) "-100")) {
            chainId = "all";
        }
        java.lang.String str = chainId;
        HomeChainFilterUiModel homeChainFilterUiModel = new HomeChainFilterUiModel(str, marketChainBean.getChainName(), marketChainBean.getChainLogo());
        java.lang.String chainName = marketChainBean.getChainName();
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : chainName, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : str, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : "network_selected", AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(valueOf()), (114682 & 65536) != 0 ? null : djBIcL().EZpvd());
        AhwBna().AEQbTJ(homeChainFilterUiModel);
    }

    @Override // o.InterfaceC28591kdf
    public void OLrzqt(@NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        AhwBna().copydefault(timeIntervalType);
        java.lang.String strAEQbTJ = EZpvd().copydefault().getValue().EZpvd().AEQbTJ().AEQbTJ();
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "all") ? strAEQbTJ : EZpvd().copydefault().getValue().EZpvd().AEQbTJ().OLrzqt();
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : C28518kcL.copydefault(djBIcL().EZpvd()), (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : timeIntervalType, (114682 & 32) != 0 ? null : strOLrzqt, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : strAEQbTJ, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : "time_dimension", AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(valueOf()), (114682 & 65536) != 0 ? null : djBIcL().EZpvd());
    }

    @Override // o.InterfaceC28591kdf
    public void isConnected() {
        C55052xcf c55052xcf;
        InterfaceC28591kdf.Activity.KWHzl(this);
        C21473hAr c21473hAr = this.fARcdN;
        if (c21473hAr == null || (c55052xcf = c21473hAr.OLrzqt) == null) {
            return;
        }
        c55052xcf.setSelected(false);
    }

    @Override // o.InterfaceC26190jVg
    public void KWHzl(@NotNull AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        EZpvd().copydefault(advancedFilter);
    }

    public final void EZpvd(InterfaceC28519kcM interfaceC28519kcM) {
        if (interfaceC28519kcM instanceof InterfaceC28519kcM.Application) {
            return;
        }
        final C21473hAr c21473hAr = this.fARcdN;
        if (c21473hAr != null) {
            boolean z = interfaceC28519kcM instanceof InterfaceC28519kcM.TaskDescription;
            if (!z) {
                c21473hAr.isConnected.AEQbTJ();
            }
            C55173xeu c55173xeu = c21473hAr.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(interfaceC28519kcM instanceof InterfaceC28519kcM.Activity ? 0 : 8);
            if (interfaceC28519kcM instanceof InterfaceC28519kcM.ActionBar) {
                DbNXlk().EZpvd(((InterfaceC28519kcM.ActionBar) interfaceC28519kcM).AEQbTJ(), new Function0() { // from class: o.kcG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28558kcz.EZpvd(c21473hAr, this);
                    }
                });
                return;
            } else {
                if (interfaceC28519kcM instanceof InterfaceC28519kcM.StateListAnimator) {
                    DbNXlk().AEQbTJ(C56402yEa.EZpvd(new C28526kcT(EZpvd().copydefault().getValue().OLrzqt())), new Function0() { // from class: o.kcH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C28558kcz.OLrzqt(c21473hAr, this);
                        }
                    });
                    return;
                }
                android.widget.FrameLayout frameLayout = c21473hAr.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility((!z || this.values) ? 8 : 0);
                AYXKKw().EZpvd();
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C21473hAr c21473hAr, C28558kcz c28558kcz) {
        android.widget.FrameLayout frameLayout = c21473hAr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        c28558kcz.AYXKKw().EZpvd();
        c28558kcz.values = false;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C21473hAr c21473hAr, C28558kcz c28558kcz) {
        android.widget.FrameLayout frameLayout = c21473hAr.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        c28558kcz.AYXKKw().EZpvd();
        return Unit.INSTANCE;
    }

    public final void copydefault(C28549kcq c28549kcq) {
        KWHzl(c28549kcq.EZpvd().OLrzqt());
        C21473hAr c21473hAr = this.fARcdN;
        if (c21473hAr != null) {
            kLP.setSelection$default(c21473hAr.AEQbTJ, c28549kcq.EZpvd().AEQbTJ(), -20, 0, 4, null);
            c21473hAr.OLrzqt.copydefault().setText(EZpvd(c28549kcq.EZpvd().copydefault()));
            kMC kmcCopydefault = c28549kcq.copydefault();
            if (kmcCopydefault != null) {
                kMB.setData$default(c21473hAr.DbNXlk, kmcCopydefault, false, 2, null);
            }
            c21473hAr.KWHzl.setImageDrawable(ContextCompat.getDrawable(requireContext(), c28549kcq.OLrzqt() ? C52761wXj.TaskDescription.GVpNrs : C52761wXj.TaskDescription.dPnHjp));
        }
    }

    private final void values() {
        C55052xcf c55052xcf;
        C21473hAr c21473hAr;
        LinearLayoutCompat linearLayoutCompatAEQbTJ;
        if (valueOf() && (c21473hAr = this.fARcdN) != null && (linearLayoutCompatAEQbTJ = c21473hAr.getRoot()) != null) {
            android.content.Context context = linearLayoutCompatAEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            linearLayoutCompatAEQbTJ.setPadding(0, C55298xhM.KWHzl(10.0f, context), 0, 0);
        }
        C21473hAr c21473hAr2 = this.fARcdN;
        if (c21473hAr2 != null && (c55052xcf = c21473hAr2.OLrzqt) != null) {
            c55052xcf.setOKDSSize(-4);
            c55052xcf.setOnClickListener(new LoaderManager(c55052xcf, 1000L, this));
        }
        C21473hAr c21473hAr3 = this.fARcdN;
        if (c21473hAr3 != null) {
            c21473hAr3.valueOf.setAdapter(DbNXlk());
            c21473hAr3.valueOf.setItemAnimator(null);
            c21473hAr3.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.kcy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28558kcz.OLrzqt(this.AEQbTJ, view);
                }
            });
            C55113xdn c55113xdn = c21473hAr3.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_MARKET_TOKEN_LIST_LOADING);
            c21473hAr3.DbNXlk.EZpvd(false);
            c21473hAr3.DbNXlk.setCallback(this.fetchVPNInfo);
            wYC wyc = c21473hAr3.KWHzl;
            wyc.setOnClickListener(new PendingIntent(wyc, 1000L, this));
            c21473hAr3.AEQbTJ.EZpvd(true);
            c21473hAr3.AEQbTJ.OLrzqt(24);
            c21473hAr3.AEQbTJ.setCallback(this.djBIcL);
            C33546myW c33546myW = c21473hAr3.isConnected;
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.kcw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C28558kcz.OLrzqt(this.copydefault, interfaceC57934yrl);
                }
            });
            c33546myW.djBIcL(valueOf());
        }
    }

    public static final void OLrzqt(C28558kcz c28558kcz, android.view.View view) {
        c28558kcz.AYXKKw().EZpvd(c28558kcz.EZpvd().EZpvd().getValue(), true);
    }

    public static final void OLrzqt(C28558kcz c28558kcz, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c28558kcz.values = true;
        c28558kcz.AYXKKw().EZpvd(c28558kcz.EZpvd().EZpvd().getValue(), true);
    }

    public final void KWHzl(java.util.List<MarketChainBean> list) {
        kLP klp;
        C21473hAr c21473hAr = this.fARcdN;
        if (c21473hAr == null || (klp = c21473hAr.AEQbTJ) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketChainBean marketChainBean : list) {
            arrayList.add(new HomeChainFilterUiModel(marketChainBean.getChainId(), marketChainBean.getChainName(), marketChainBean.getChainLogo()));
        }
        klp.setQuickPickOptions(arrayList);
    }

    public final void gEmmrt() {
        AdvancedFilter value = EZpvd().EZpvd().getValue();
        AdvancedFilter advancedFilterAEQbTJ = djBIcL().AEQbTJ();
        QuickFilterConfig quickFilterConfigAhwBna = djBIcL().AhwBna();
        FilterTabFragmentParams filterTabFragmentParams = new FilterTabFragmentParams(value, advancedFilterAEQbTJ, quickFilterConfigAhwBna != null ? C28518kcL.KWHzl(quickFilterConfigAhwBna) : null, null, djBIcL().KWHzl(), value.fetchVPNInfo(), C28518kcL.copydefault(djBIcL().EZpvd()), 8, null);
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : "filter", AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(valueOf()), (114682 & 65536) != 0 ? null : djBIcL().EZpvd());
        C26191jVh c26191jVhOLrzqt = C26191jVh.Companion.OLrzqt(filterTabFragmentParams);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c26191jVhOLrzqt.show(childFragmentManager);
    }

    private final void OLrzqt(HomeToken homeToken) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(homeToken.OLrzqt(), homeToken.AYXKKw(), homeToken.djBIcL(), "", "", homeToken.values(), "", homeToken.DbNXlk() ? 1 : 0, 0, 0, 0, null, "default_trade", null, null, homeToken.EZpvd(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), C28518kcL.copydefault(djBIcL().EZpvd()), null, new int[0], 8, null);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hTk.TaskDescription.showAtPosition$default(o.hTk$TaskDescription, int, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, java.lang.Object):o.hTk */
    private final void KWHzl(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, final HomeToken homeToken) {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        C21979hTk c21979hTkOLrzqt = C21979hTk.Companion.OLrzqt(pair.getSecond().intValue(), !homeToken.DbNXlk(), new Function0() { // from class: o.kcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28558kcz.OLrzqt(homeToken, this);
            }
        }, (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null);
        Intrinsics.copydefault(childFragmentManager);
        c21979hTkOLrzqt.show(childFragmentManager, C28558kcz.class.getName());
        AEQbTJ(pair);
    }

    public static final Unit OLrzqt(HomeToken homeToken, C28558kcz c28558kcz) {
        C25352ivB.startVibrator$default(0L, 1, null);
        FavoriteAction favoriteAction = homeToken.DbNXlk() ? FavoriteAction.RemoveFromWatchList : FavoriteAction.AddToWatchList;
        C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : homeToken.DbNXlk() ? "no" : "yes", (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28558kcz.AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : java.lang.Boolean.valueOf(c28558kcz.valueOf()), (114682 & 65536) != 0 ? null : c28558kcz.djBIcL().EZpvd());
        handleFavoriteStatusResult$default(c28558kcz, favoriteAction, C56402yEa.EZpvd(homeToken), null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kcz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleFavoriteStatusResult$default(C28558kcz c28558kcz, FavoriteAction favoriteAction, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        c28558kcz.OLrzqt(favoriteAction, list, list2, list3);
    }

    private final void OLrzqt(FavoriteAction favoriteAction, java.util.List<HomeToken> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeTokenListFragment$handleFavoriteStatusResult$1(this, favoriteAction, list, list2, list3, null), 3, null);
    }

    @Override // o.kCQ
    public void AEQbTJ(@NotNull java.util.List<HomeToken> list, @NotNull kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> pair) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pair, "");
        OLrzqt(FavoriteAction.UpdateWatchList, list, pair.component1(), pair.component2());
    }

    public final java.lang.String EZpvd(TimeIntervalType timeIntervalType) {
        int i = timeIntervalType == null ? -1 : Application.AEQbTJ[timeIntervalType.ordinal()];
        java.lang.String string = getString(i != 1 ? i != 2 ? i != 3 ? C23274hvD.Fragment.ZNPcth : C23274hvD.Fragment.ZGRCNj : C23274hvD.Fragment.sSi : C23274hvD.Fragment.DuQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final void AEQbTJ(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        java.lang.Object next;
        hNW hnw;
        android.view.View view;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(android.os.SystemClock.uptimeMillis(), android.os.SystemClock.uptimeMillis(), 3, pair.getFirst().intValue(), pair.getSecond().intValue(), 0);
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.Application.copydefault)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof hNW) {
                    break;
                }
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            hnw = (hNW) (fragmentActivityRequireActivity instanceof hNW ? fragmentActivityRequireActivity : null);
        } else {
            hnw = (hNW) (fragment instanceof hNW ? fragment : null);
        }
        if (hnw == null || (view = hnw.getView()) == null) {
            return;
        }
        view.dispatchTouchEvent(motionEventObtain);
    }

    public final void EZpvd(java.util.List<java.lang.String> list, boolean z) {
        java.util.List<?> items = DbNXlk().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            HomeToken homeToken = next instanceof HomeToken ? (HomeToken) next : null;
            if (homeToken != null) {
                arrayList.add(homeToken);
            }
        }
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        for (java.lang.String str : list) {
            java.util.Iterator it2 = listFJNWhG.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                HomeToken homeToken2 = (HomeToken) it2.next();
                if (!(homeToken2 instanceof HomeToken)) {
                    homeToken2 = null;
                }
                if (Intrinsics.EZpvd((java.lang.Object) (homeToken2 != null ? homeToken2.AYXKKw() : null), (java.lang.Object) str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0 && i < listFJNWhG.size()) {
                java.lang.Object obj = listFJNWhG.get(i);
                HomeToken homeToken3 = obj instanceof HomeToken ? (HomeToken) obj : null;
                HomeToken homeTokenEZpvd = homeToken3 != null ? homeToken3.EZpvd((1048541 & 1) != 0 ? homeToken3.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken3.KWHzl : null, (1048541 & 4) != 0 ? homeToken3.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken3.fARcdN : null, (1048541 & 16) != 0 ? homeToken3.fIwbmz : null, (1048541 & 32) != 0 ? homeToken3.OLrzqt : null, (1048541 & 64) != 0 ? homeToken3.AkhnZx : null, (1048541 & 128) != 0 ? homeToken3.EZpvd : null, (1048541 & 256) != 0 ? homeToken3.ejfBZ : null, (1048541 & 512) != 0 ? homeToken3.copydefault : null, (1048541 & 1024) != 0 ? homeToken3.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken3.AuCTel : null, (1048541 & 4096) != 0 ? homeToken3.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken3.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken3.djBIcL : null, (1048541 & 32768) != 0 ? homeToken3.AhwBna : null, (1048541 & 65536) != 0 ? homeToken3.AYXKKw : z, (1048541 & 131072) != 0 ? homeToken3.values : null, (1048541 & 262144) != 0 ? homeToken3.valueOf : null, (1048541 & 524288) != 0 ? homeToken3.isConnected : null) : null;
                if (homeTokenEZpvd != null) {
                    listFJNWhG.set(i, homeTokenEZpvd);
                }
            }
        }
        kMM.setData$default(DbNXlk(), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(listFJNWhG), null, 2, null);
    }

    /* JADX INFO: renamed from: o.kcz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kcz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28558kcz OLrzqt(@NotNull HomeTab homeTab) {
            Intrinsics.checkNotNullParameter(homeTab, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.tab_data", homeTab);
            C28558kcz c28558kcz = new C28558kcz();
            c28558kcz.setArguments(bundle);
            return c28558kcz;
        }
    }
}
