package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.market.features.home.domain.HomeTab;
import com.okinc.business.market.features.home.ui.HomeSharedFilterViewModel;
import com.okinc.business.market.features.scanner.ScannerViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.WalletSearchConfiguration;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC29288kqn;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29280kqf extends AbstractC29228kpg {
    public final C58216yxB AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final java.util.List<java.lang.Integer> fetchVPNInfo = new java.util.ArrayList();
    public int gEmmrt = 1;
    public C21498hBp isConnected;
    public final Application valueOf;
    public C29286kql values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.fGQ;
    }

    public C29280kqf() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ScannerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = new C58216yxB();
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$7
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeSharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.scanner.ScannerFragment$special$$inlined$viewModels$default$10
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
        this.valueOf = new Application();
    }

    public final ScannerViewModel AhwBna() {
        return (ScannerViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.kqf$Application */
    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C29280kqf.this.gEmmrt = i;
            java.lang.String strOLrzqt = C29280kqf.this.OLrzqt(i);
            if (strOLrzqt.length() > 0) {
                C29229kph.EZpvd(strOLrzqt, i, C29280kqf.this.values);
            }
            C29286kql c29286kql = C29280kqf.this.values;
            androidx.fragment.app.Fragment fragmentOLrzqt = c29286kql != null ? c29286kql.OLrzqt(i, C29280kqf.this) : null;
            InterfaceC29291kqq interfaceC29291kqq = fragmentOLrzqt instanceof InterfaceC29291kqq ? (InterfaceC29291kqq) fragmentOLrzqt : null;
            if (interfaceC29291kqq != null) {
                interfaceC29291kqq.AEQbTJ(i, C29280kqf.this.fetchVPNInfo);
            }
            C28848kiX.Companion.KWHzl(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            C21498hBp c21498hBp;
            ViewPager2 viewPager2;
            if (i != 1 || !C28848kiX.Companion.KWHzl(true) || (c21498hBp = C29280kqf.this.isConnected) == null || (viewPager2 = c21498hBp.AhwBna) == null) {
                return;
            }
            viewPager2.setCurrentItem(C29280kqf.this.gEmmrt, false);
        }
    }

    @Override // o.AbstractC23346hwW, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C58216yxB c58216yxB = this.AYXKKw;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.kqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29280kqf.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.kqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C29280kqf.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.AEQbTJ(c58216yxB, interfaceC58217yxCAEQbTJ);
    }

    public static final Unit EZpvd(C29280kqf c29280kqf, java.lang.String str) {
        c29280kqf.AhwBna().KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.isConnected = C21498hBp.KWHzl(view);
        djBIcL();
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().OLrzqt(), null, new ActionBar(), 2, null);
    }

    /* JADX INFO: renamed from: o.kqf$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC29288kqn abstractC29288kqn, Continuation<? super Unit> continuation) {
            C29280kqf.this.KWHzl(abstractC29288kqn);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(AbstractC29288kqn abstractC29288kqn) {
        EZpvd(abstractC29288kqn instanceof AbstractC29288kqn.Activity);
        boolean z = abstractC29288kqn instanceof AbstractC29288kqn.TaskDescription;
        copydefault(z);
        if (abstractC29288kqn instanceof AbstractC29288kqn.ActionBar) {
            if (this.values == null) {
                this.values = new C29286kql(this, ((AbstractC29288kqn.ActionBar) abstractC29288kqn).copydefault());
                gEmmrt();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        if (z) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    private final void EZpvd(boolean z) {
        C21559hDw c21559hDw;
        NestedScrollView root;
        C21498hBp c21498hBp = this.isConnected;
        if (c21498hBp == null || (c21559hDw = c21498hBp.OLrzqt) == null || (root = c21559hDw.getRoot()) == null) {
            return;
        }
        root.setVisibility(z ? 0 : 8);
        if (z) {
            C55418xja.AEQbTJ(root);
        } else {
            C55418xja.EZpvd(root);
        }
    }

    private final void copydefault(boolean z) {
        C55173xeu c55173xeu;
        C21498hBp c21498hBp = this.isConnected;
        if (c21498hBp == null || (c55173xeu = c21498hBp.copydefault) == null) {
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
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kqj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29280kqf.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C29280kqf c29280kqf, android.view.View view) {
        c29280kqf.AhwBna().KWHzl();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AYXKKw.OLrzqt();
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
    }

    private final void djBIcL() {
        C21498hBp c21498hBp = this.isConnected;
        if (c21498hBp != null) {
            c21498hBp.getRoot().setContentDescription("web3_dex_scanner_title_view");
            c21498hBp.EZpvd.setTransitionName("dex_search_bar_shared_element");
            android.widget.ImageView imageView = c21498hBp.EZpvd;
            imageView.setOnClickListener(new Activity(imageView, 1000L, this, c21498hBp));
            c21498hBp.getRoot().setPaddingRelative(0, C33570myu.AEQbTJ(requireContext()), 0, 0);
        }
    }

    /* JADX INFO: renamed from: o.kqf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C29280kqf EZpvd;
        public final /* synthetic */ C21498hBp OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29280kqf c29280kqf, C21498hBp c21498hBp) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c29280kqf;
            this.OLrzqt = c21498hBp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C29229kph.EZpvd("scanner_search", this.EZpvd.gEmmrt, this.EZpvd.values);
                androidx.fragment.app.Fragment fragmentEZpvd = ((xWQ) C43251rlk.copydefault(xWQ.class)).EZpvd(new WalletSearchConfiguration(true, "default_trade", new WalletSearchConfiguration.DisplayOptions("dex_search_bar_shared_element", true)));
                DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this.EZpvd);
                if (dexFragmentNavigatorAEQbTJ != null) {
                    C31197lpV c31197lpV = C31197lpV.EZpvd;
                    DexFragmentNavigator.Activity activity = new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    android.widget.ImageView imageView = this.OLrzqt.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    dexFragmentNavigatorAEQbTJ.EZpvd(fragmentEZpvd, (6 & 2) != 0 ? fragmentEZpvd.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : c31197lpV.OLrzqt(activity, imageView, "dex_search_bar_shared_element"));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kqf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C21498hBp EZpvd;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C21498hBp c21498hBp, int i) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c21498hBp;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AhwBna.setCurrentItem(this.OLrzqt, false);
            }
        }
    }

    public final void gEmmrt() {
        TabLayout.TabView tabView;
        C21498hBp c21498hBp = this.isConnected;
        if (c21498hBp != null) {
            c21498hBp.djBIcL.copydefault().removeAllTabs();
            c21498hBp.AhwBna.setAdapter(this.values);
            c21498hBp.AhwBna.setOffscreenPageLimit(2);
            ViewPager2 viewPager2 = c21498hBp.AhwBna;
            InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
            viewPager2.setUserInputEnabled(!(interfaceC25414iwK != null && interfaceC25414iwK.AYXKKw()));
            new TabLayoutMediator(c21498hBp.djBIcL.copydefault(), c21498hBp.AhwBna, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kqm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C29280kqf.KWHzl(this.OLrzqt, tab, i);
                }
            }).attach();
            TabLayout tabLayoutCopydefault = c21498hBp.djBIcL.copydefault();
            int tabCount = tabLayoutCopydefault.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.Tab tabAt = tabLayoutCopydefault.getTabAt(i);
                if (tabAt != null && (tabView = tabAt.view) != null) {
                    tabView.setOnClickListener(new StateListAnimator(tabView, 1000L, c21498hBp, i));
                }
            }
            c21498hBp.AhwBna.setCurrentItem(this.gEmmrt, false);
            c21498hBp.AhwBna.registerOnPageChangeCallback(this.valueOf);
        }
    }

    public static final void KWHzl(C29280kqf c29280kqf, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c29280kqf.AEQbTJ(i));
        tab.view.setContentDescription(c29280kqf.copydefault(i));
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String strKWHzl;
        C29286kql c29286kql = this.values;
        if (c29286kql == null) {
            return "";
        }
        if (i == 1) {
            java.lang.String string = getString(C23274hvD.Fragment.DcMfJKRKUgwx);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (i == c29286kql.OLrzqt()) {
            java.lang.String string2 = getString(C23274hvD.Fragment.DcMfJKfbSiEC);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        if (i != c29286kql.AEQbTJ()) {
            HomeTab homeTabAEQbTJ = c29286kql.AEQbTJ(i);
            return (homeTabAEQbTJ == null || (strKWHzl = homeTabAEQbTJ.KWHzl()) == null) ? "Unknown" : strKWHzl;
        }
        java.lang.String string3 = getString(C23274hvD.Fragment.DcMfJKfNUfqk);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }

    public final java.lang.String copydefault(int i) {
        C29286kql c29286kql = this.values;
        if (c29286kql == null || i == 1) {
            return "";
        }
        if (i == c29286kql.OLrzqt()) {
            return "web3_dex_scanner_tab_meme_pump";
        }
        if (i == c29286kql.AEQbTJ()) {
            return "web3_dex_scanner_tab_watchlist";
        }
        HomeTab homeTabAEQbTJ = c29286kql.AEQbTJ(i);
        return (homeTabAEQbTJ != null ? homeTabAEQbTJ.EZpvd() : null) != null ? "web3_dex_scanner_tab_trending" : "";
    }

    public final java.lang.String OLrzqt(int i) {
        C29286kql c29286kql = this.values;
        if (c29286kql == null) {
            return "";
        }
        if (i == 1) {
            return "surge_tab";
        }
        if (i == c29286kql.OLrzqt()) {
            return "trenches_tab";
        }
        if (i == c29286kql.AEQbTJ()) {
            return "watchlist_tab";
        }
        if (!c29286kql.KWHzl(i)) {
            return "unknown_key";
        }
        HomeTab homeTabAEQbTJ = c29286kql.AEQbTJ(i);
        return (homeTabAEQbTJ != null ? homeTabAEQbTJ.EZpvd() : null) + "_tab";
    }
}
