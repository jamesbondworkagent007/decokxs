package o;

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
import com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$setListener$3;
import com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingHomeVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingPnLVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gVh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19949gVh extends gVX<C21519hCj> implements InterfaceC19679gLh {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public C25333iuj KWHzl;
    public final InterfaceC56387yDm copydefault;

    public C19949gVh() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingHomeVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$6
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingPnLVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$activityViewModels$default$9
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
        final Function0 function02 = new Function0() { // from class: o.gVl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19949gVh.fetchVPNInfo(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$viewModels$default$1
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingHomeFragment$special$$inlined$viewModels$default$4
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gVm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19949gVh.djBIcL(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.gVh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gVh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C19949gVh newInstance$default(Activity activity, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return activity.AEQbTJ(i);
        }

        public final C19949gVh AEQbTJ(int i) {
            C19949gVh c19949gVh = new C19949gVh();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tab", i);
            c19949gVh.setArguments(bundle);
            return c19949gVh;
        }
    }

    public final CopyTradingHomeVM valueOf() {
        return (CopyTradingHomeVM) this.AhwBna.getValue();
    }

    public final CopyTradingStrategiesVM gEmmrt() {
        return (CopyTradingStrategiesVM) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gVX.EZpvd()V */
    public final CopyTradingPnLVM EZpvd() {
        return (CopyTradingPnLVM) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner fetchVPNInfo(C19949gVh c19949gVh) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c19949gVh.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final DexHomeViewModel OLrzqt() {
        return (DexHomeViewModel) this.AEQbTJ.getValue();
    }

    public static final C19680gLi djBIcL(C19949gVh c19949gVh) {
        return new C19680gLi(c19949gVh);
    }

    private final C19680gLi fetchVPNInfo() {
        return (C19680gLi) this.copydefault.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21519hCj OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21519hCj c21519hCjAEQbTJ = C21519hCj.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21519hCjAEQbTJ, "");
        return c21519hCjAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21519hCj c21519hCj, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21519hCj, "");
        FragmentContainerView fragmentContainerView = c21519hCj.EZpvd;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        copydefault(fragmentContainerView, "CopyTradingPnLFragment", new Function0() { // from class: o.gVo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19949gVh.AEQbTJ();
            }
        });
        FragmentContainerView fragmentContainerView2 = c21519hCj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
        copydefault(fragmentContainerView2, "CopyTradingStrategiesPagerFragment", new Function0() { // from class: o.gVq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19949gVh.AhwBna(this.OLrzqt);
            }
        });
        c21519hCj.OLrzqt.setEnableRefresh(true);
        c21519hCj.OLrzqt.setEnableLoadMore(false);
        c21519hCj.OLrzqt.setOnRefreshListener(new Function0() { // from class: o.gVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19949gVh.DbNXlk(this.copydefault);
            }
        });
        c21519hCj.getRoot().post(new java.lang.Runnable() { // from class: o.gVr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19949gVh.AkhnZx(this.AEQbTJ);
            }
        });
    }

    public static final androidx.fragment.app.Fragment AEQbTJ() {
        return CopyTradingPnLFragment.Companion.copydefault();
    }

    public static final androidx.fragment.app.Fragment AhwBna(C19949gVh c19949gVh) {
        android.os.Bundle arguments = c19949gVh.getArguments();
        return gVO.Companion.copydefault(arguments != null ? arguments.getInt("tab", 0) : 0);
    }

    public static final Unit DbNXlk(C19949gVh c19949gVh) {
        c19949gVh.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(C19949gVh c19949gVh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c19949gVh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.gVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19949gVh.OLrzqt(this.AEQbTJ, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19949gVh.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gVu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19949gVh.OLrzqt((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gVn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19949gVh.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, valueOf().call());
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingHomeFragment$setListener$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19949gVh c19949gVh, xXO xxo) {
        c19949gVh.valueOf().EZpvd();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        valueOf().AEQbTJ();
        valueOf().EZpvd();
        fetchVPNInfo().EZpvd();
        C25333iuj c25333iuj = this.KWHzl;
        if (c25333iuj != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25333iuj.EZpvd(fragmentActivityRequireActivity);
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        fetchVPNInfo().OLrzqt();
        super.onInvisible();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroid/view/View; */
    @Override // o.InterfaceC19679gLh
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C25333iuj copydefault() {
        C25333iuj c25333iuj = this.KWHzl;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25333iuj c25333iuj2 = new C25333iuj(contextRequireContext, null, true, OLrzqt().fARcdN(), OLrzqt().isConnected(), 2, null);
        this.KWHzl = c25333iuj2;
        djBIcL();
        return c25333iuj2;
    }

    public final void djBIcL() {
        C25333iuj c25333iuj = this.KWHzl;
        if (c25333iuj != null) {
            c25333iuj.KWHzl(false);
            c25333iuj.setOnMoreIconClick(new Function1() { // from class: o.gVp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19949gVh.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(C19949gVh c19949gVh, int i) {
        c19949gVh.EZpvd(i);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        C22281hcR c22281hcR;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("CopyTradingPnLFragment");
        if (fragmentFindFragmentByTag != 0 && (fragmentFindFragmentByTag instanceof gUO)) {
            if (fragmentFindFragmentByTag.isAdded() && !fragmentFindFragmentByTag.isDetached() && !fragmentFindFragmentByTag.isRemoving()) {
                ((gUO) fragmentFindFragmentByTag).KWHzl();
            } else {
                pUU.KWHzl(getTAG(), "CopyTradingPnLFragment fragment is not active yet");
            }
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("CopyTradingStrategiesPagerFragment");
        if (fragmentFindFragmentByTag2 != 0 && (fragmentFindFragmentByTag2 instanceof gUO)) {
            if (fragmentFindFragmentByTag2.isAdded() && !fragmentFindFragmentByTag2.isDetached() && !fragmentFindFragmentByTag2.isRemoving()) {
                ((gUO) fragmentFindFragmentByTag2).KWHzl();
            } else {
                pUU.KWHzl(getTAG(), "CopyTradingStrategiesPagerFragment fragment is not active yet");
            }
        }
        C21519hCj c21519hCj = (C21519hCj) fARcdN();
        if (c21519hCj == null || (c22281hcR = c21519hCj.OLrzqt) == null) {
            return;
        }
        c22281hcR.KWHzl();
    }

    private final void copydefault(FragmentContainerView fragmentContainerView, java.lang.String str, Function0<? extends androidx.fragment.app.Fragment> function0) {
        getChildFragmentManager().beginTransaction().replace(fragmentContainerView.getId(), function0.invoke(), str).commitAllowingStateLoss();
    }

    public final void EZpvd(int i) {
        C24473ieW.Companion.AEQbTJ("default_trade", new SwapBottomParamsBean(true, false, "", false, "default_trade", null, null, false, null, null, null, null, false, i, true, null, 40928, null), false, TriggeredFrom.CopyTrade).show(getChildFragmentManager(), C24473ieW.class.getName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewPager2 AhwBna() {
        C21519hCj c21519hCj = (C21519hCj) fARcdN();
        if (c21519hCj != null) {
            return c21519hCj.AEQbTJ;
        }
        return null;
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = null;
        super.onDestroyView();
    }
}
