package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.market.features.module.domain.ModuleDetailEventManager;
import com.okinc.business.market.features.module.domain.model.MarketSortBy;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.business.market.features.module.ui.detail.ModuleDetailViewModel;
import com.okinc.business.market.features.module.ui.detail.ModuleInfo;
import com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$setUpObserver$2;
import com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$setUpObserver$3;
import com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListViewModel;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31197lpV;
import o.InterfaceC28933kkC;
import o.InterfaceC29021kll;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kkW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28953kkW extends AbstractC28946kkP {
    public final InterfaceC56387yDm AYXKKw;
    public java.lang.String AkhnZx;
    public C28948kkR DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public TimeType fetchVPNInfo;
    public hAZ gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    /* JADX INFO: renamed from: o.kkW$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeType.values().length];
            try {
                iArr[TimeType.ONE_DAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimeType.FOUR_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeType.ONE_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeType.FIVE_MINUTES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.kkW$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
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
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public C28953kkW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleDetailListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$5
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
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleDetailViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        this.fetchVPNInfo = TimeType.FIVE_MINUTES;
        this.AkhnZx = "";
        final Function0 function03 = new Function0() { // from class: o.klc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28953kkW.AhwBna(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$6
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleDetailEventManager.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$8
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.module.ui.detail.list.ModuleDetailListFragment$special$$inlined$viewModels$default$9
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
    }

    public final ModuleDetailListViewModel valueOf() {
        return (ModuleDetailListViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kkP.OLrzqt()V */
    public final ModuleDetailViewModel OLrzqt() {
        return (ModuleDetailViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.kkW$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C28979kkw) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleDetailEventManager AYXKKw() {
        return (ModuleDetailEventManager) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C28953kkW c28953kkW) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28953kkW.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: o.kkW$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kkW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C28953kkW AEQbTJ(@NotNull TimeType timeType, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(timeType, "");
            Intrinsics.checkNotNullParameter(str, "");
            C28953kkW c28953kkW = new C28953kkW();
            c28953kkW.fetchVPNInfo = timeType;
            c28953kkW.AkhnZx = str;
            return c28953kkW;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAZ hazOLrzqt = hAZ.OLrzqt(layoutInflater, viewGroup, false);
        this.gEmmrt = hazOLrzqt;
        if (hazOLrzqt != null) {
            return hazOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        AhwBna();
        isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    private final void fetchVPNInfo() {
        hAZ haz = this.gEmmrt;
        if (haz != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            this.DbNXlk = new C28948kkR(childFragmentManager, new Function1() { // from class: o.kle
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28953kkW.copydefault(this.OLrzqt, (C28902kjY) obj);
                }
            });
            RecyclerView recyclerView = haz.OLrzqt;
            recyclerView.setItemAnimator(null);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.DbNXlk);
        }
    }

    public static final Unit copydefault(C28953kkW c28953kkW, C28902kjY c28902kjY) {
        Intrinsics.checkNotNullParameter(c28902kjY, "");
        android.content.Context context = c28953kkW.getContext();
        if (context != null) {
            C25352ivB.openMarketDetailPage$default(context, "default_trade", new TokenBase(c28902kjY.KWHzl(), c28902kjY.djBIcL(), c28902kjY.AYXKKw(), c28902kjY.AEQbTJ(), null, c28902kjY.AhwBna(), null, 0, 0, 0, 0, null, "module_list", null, null, null, null, 0, 0, false, null, null, false, false, c28953kkW.AkhnZx, c28953kkW.OLrzqt().OLrzqt(), null, 0, false, null, null, false, -50335792, null), C21847hOn.OLrzqt(c28953kkW.AkhnZx), null, new int[0], 8, null);
        }
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        hAZ haz = this.gEmmrt;
        if (haz != null) {
            C28057kNh c28057kNh = haz.AhwBna;
            c28057kNh.setSortClickListener(true);
            c28057kNh.setSortChangedListener(new Function2() { // from class: o.klb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C28953kkW.EZpvd(this.OLrzqt, (OKSortTextView.SortType) obj, (MarketSortBy) obj2);
                }
            });
            kotlin.Pair<OKSortTextView.SortType, MarketSortBy> value = AYXKKw().copydefault().getValue();
            if (value != null) {
                c28057kNh.setDefaultSort(value.component2(), value.component1());
            }
        }
    }

    public static final Unit EZpvd(C28953kkW c28953kkW, final OKSortTextView.SortType sortType, MarketSortBy marketSortBy) {
        Intrinsics.checkNotNullParameter(sortType, "");
        Intrinsics.checkNotNullParameter(marketSortBy, "");
        c28953kkW.AYXKKw().AEQbTJ(marketSortBy, sortType);
        if (marketSortBy == MarketSortBy.RANK) {
            C32866mlf.onEvent$default("DEX_Boost_Section_Click", (TrackChannel[]) null, new Function1() { // from class: o.kkU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28953kkW.OLrzqt(sortType, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OKSortTextView.SortType sortType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "rank", sortType == OKSortTextView.SortType.DOWN ? "rank_descending" : "rank_ascending", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        valueOf().KWHzl().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.kla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28953kkW.copydefault(this.OLrzqt, (InterfaceC29021kll) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ModuleDetailListFragment$setUpObserver$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new ModuleDetailListFragment$setUpObserver$3(this, null), 3, null);
        AYXKKw().OLrzqt().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.kkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28953kkW.AEQbTJ(this.AEQbTJ, (TimeType) obj);
            }
        }));
        AYXKKw().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.kkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28953kkW.copydefault(this.EZpvd, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(final C28953kkW c28953kkW, final InterfaceC29021kll interfaceC29021kll) {
        android.widget.LinearLayout linearLayout;
        if (interfaceC29021kll instanceof InterfaceC29021kll.TaskDescription) {
            InterfaceC29021kll.TaskDescription taskDescription = (InterfaceC29021kll.TaskDescription) interfaceC29021kll;
            if (!taskDescription.copydefault()) {
                c28953kkW.djBIcL();
            }
            C28948kkR c28948kkR = c28953kkW.DbNXlk;
            if (c28948kkR != null) {
                c28948kkR.submitList(taskDescription.OLrzqt().isConnected(), new java.lang.Runnable() { // from class: o.kkX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28953kkW.OLrzqt(interfaceC29021kll, c28953kkW);
                    }
                });
            }
            if (taskDescription.OLrzqt().isConnected().isEmpty()) {
                c28953kkW.AEQbTJ(true);
            } else {
                hAZ haz = c28953kkW.gEmmrt;
                if (haz != null && (linearLayout = haz.copydefault) != null) {
                    linearLayout.setVisibility(0);
                }
            }
            c28953kkW.KWHzl(false);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28953kkW, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd(interfaceC29021kll, InterfaceC29021kll.Application.KWHzl)) {
            c28953kkW.AEQbTJ(false);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28953kkW, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd(interfaceC29021kll, InterfaceC29021kll.ActionBar.AEQbTJ)) {
            c28953kkW.KWHzl(true);
        } else if (!(interfaceC29021kll instanceof InterfaceC29021kll.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        ModuleDetailEventManager moduleDetailEventManagerAYXKKw = c28953kkW.AYXKKw();
        TimeType timeType = c28953kkW.fetchVPNInfo;
        Intrinsics.copydefault(interfaceC29021kll);
        moduleDetailEventManagerAYXKKw.copydefault(timeType, interfaceC29021kll);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(InterfaceC29021kll interfaceC29021kll, C28953kkW c28953kkW) {
        hAZ haz;
        RecyclerView recyclerView;
        if (((InterfaceC29021kll.TaskDescription) interfaceC29021kll).copydefault() || (haz = c28953kkW.gEmmrt) == null || (recyclerView = haz.OLrzqt) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public static final Unit AEQbTJ(C28953kkW c28953kkW, TimeType timeType) {
        if (timeType == c28953kkW.fetchVPNInfo && (c28953kkW.OLrzqt().KWHzl().getValue() instanceof InterfaceC28933kkC.TaskDescription)) {
            c28953kkW.gEmmrt();
        } else {
            c28953kkW.valueOf().djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C28953kkW c28953kkW, kotlin.Pair pair) {
        C28057kNh c28057kNh;
        OKSortTextView.SortType sortType = (OKSortTextView.SortType) pair.component1();
        MarketSortBy marketSortBy = (MarketSortBy) pair.component2();
        if (c28953kkW.AYXKKw().OLrzqt().getValue() == c28953kkW.fetchVPNInfo) {
            ModuleDetailListViewModel.sortModule$default(c28953kkW.valueOf(), sortType, marketSortBy, false, 4, null);
        } else {
            c28953kkW.valueOf().OLrzqt(sortType, marketSortBy);
            hAZ haz = c28953kkW.gEmmrt;
            if (haz != null && (c28057kNh = haz.AhwBna) != null) {
                c28057kNh.EZpvd(sortType, marketSortBy);
            }
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C28057kNh c28057kNh;
        C28057kNh c28057kNh2;
        C28057kNh c28057kNh3;
        if (this.valueOf) {
            return;
        }
        this.valueOf = true;
        boolean zEZpvd = valueOf().EZpvd();
        hAZ haz = this.gEmmrt;
        if (haz != null && (c28057kNh3 = haz.AhwBna) != null) {
            c28057kNh3.setRankSortVisible(zEZpvd);
        }
        C28948kkR c28948kkR = this.DbNXlk;
        if (c28948kkR != null) {
            c28948kkR.AEQbTJ(zEZpvd);
        }
        if (zEZpvd) {
            hAZ haz2 = this.gEmmrt;
            if (haz2 != null && (c28057kNh2 = haz2.AhwBna) != null) {
                c28057kNh2.AEQbTJ();
            }
            ModuleDetailListViewModel moduleDetailListViewModelValueOf = valueOf();
            OKSortTextView.SortType sortType = OKSortTextView.SortType.DOWN;
            MarketSortBy marketSortBy = MarketSortBy.RANK;
            moduleDetailListViewModelValueOf.OLrzqt(sortType, marketSortBy);
            hAZ haz3 = this.gEmmrt;
            if (haz3 == null || (c28057kNh = haz3.AhwBna) == null) {
                return;
            }
            c28057kNh.setDefaultSort(marketSortBy, sortType);
        }
    }

    public final void gEmmrt() {
        if (valueOf().KWHzl().getValue() instanceof InterfaceC29021kll.ActionBar) {
            return;
        }
        InterfaceC28933kkC value = OLrzqt().KWHzl().getValue();
        InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
        ModuleInfo moduleInfoEZpvd = taskDescription != null ? taskDescription.EZpvd() : null;
        java.lang.String strEZpvd = EZpvd(moduleInfoEZpvd);
        ModuleDetailListViewModel moduleDetailListViewModelValueOf = valueOf();
        java.lang.String strOLrzqt = OLrzqt().OLrzqt();
        java.lang.String strEZpvd2 = OLrzqt().EZpvd();
        TimeType timeType = this.fetchVPNInfo;
        java.lang.String value2 = OLrzqt().gEmmrt().getValue();
        if (value2 == null) {
            value2 = "";
        }
        moduleDetailListViewModelValueOf.OLrzqt(strOLrzqt, strEZpvd2, timeType, value2, strEZpvd, moduleInfoEZpvd != null ? moduleInfoEZpvd.isConnected() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(ModuleInfo moduleInfo) {
        java.lang.String strFetchVPNInfo;
        int i = StateListAnimator.OLrzqt[this.fetchVPNInfo.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strFetchVPNInfo = moduleInfo != null ? moduleInfo.values() : null;
                } else if (moduleInfo != null) {
                    strFetchVPNInfo = moduleInfo.AYXKKw();
                }
            } else if (moduleInfo != null) {
                strFetchVPNInfo = moduleInfo.DbNXlk();
            }
        } else if (moduleInfo != null) {
            strFetchVPNInfo = moduleInfo.fetchVPNInfo();
        }
        return strFetchVPNInfo == null ? "" : strFetchVPNInfo;
    }

    private final void KWHzl(boolean z) {
        hAZ haz = this.gEmmrt;
        if (haz != null) {
            if (z) {
                C55113xdn c55113xdn = haz.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_MARKET_MODULE_LOADING);
                haz.EZpvd.playAnimation();
                haz.KWHzl.setVisibility(8);
                return;
            }
            haz.EZpvd.copydefault();
        }
    }

    private final void AEQbTJ(boolean z) {
        hAZ haz = this.gEmmrt;
        if (haz != null) {
            KWHzl(false);
            haz.copydefault.setVisibility(8);
            haz.KWHzl.setVisibility(0);
            if (z) {
                C55173xeu c55173xeu = haz.KWHzl;
                c55173xeu.setTitle("");
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.DBxZfM));
                c55173xeu.setEmptyTypeImage(6);
                return;
            }
            C55173xeu c55173xeu2 = haz.KWHzl;
            c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
            c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu2.setEmptyTypeImage(8);
            c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.klh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28953kkW.copydefault(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void copydefault(C28953kkW c28953kkW, android.view.View view) {
        c28953kkW.KWHzl(true);
        ModuleDetailListViewModel.getModuleData$default(c28953kkW.valueOf(), null, null, null, null, null, false, 63, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        valueOf().djBIcL();
    }
}
