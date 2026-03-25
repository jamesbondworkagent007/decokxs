package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$initView$2$1;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC46197tLk;
import o.C47501trL;
import o.InterfaceC47502trM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tAU extends AbstractC32996moC implements InterfaceC47502trM<tNU> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public tNU AEQbTJ;
    public final int KWHzl = C47501trL.Application.QSBOWP;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Landroidx/viewbinding/ViewBinding; */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public tNU OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;)V */
    @Override // o.InterfaceC47502trM
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void EZpvd(tNU tnu) {
        this.AEQbTJ = tnu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroidx/lifecycle/LifecycleOwner;)V */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull tNU tnu, @NotNull LifecycleOwner lifecycleOwner) {
        InterfaceC47502trM.Application.KWHzl(this, tnu, lifecycleOwner);
    }

    public void OLrzqt(@NotNull Function1<? super tNU, Unit> function1) {
        InterfaceC47502trM.Application.EZpvd(this, function1);
    }

    public tAU() {
        Function0 function0 = new Function0() { // from class: o.tAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tAU.OLrzqt(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45919tBc.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_performance.assets.ProfileAssetsFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tAU.copydefault();
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final tAU AEQbTJ(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            tAU tau = new tAU();
            tau.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(PlanetAuthorId.Key, PlanetAuthorId.OLrzqt(str)), C56390yDp.OLrzqt("isSummary", java.lang.Boolean.valueOf(z))));
            return tau;
        }
    }

    public final C45919tBc valueOf() {
        return (C45919tBc) this.gEmmrt.getValue();
    }

    public static final C45919tBc AEQbTJ(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        return new C45919tBc(savedStateHandle, null, 2, null);
    }

    public static final ViewModelProvider.Factory OLrzqt(tAU tau) {
        return new tRJ(tau, tau.getArguments(), new Function1() { // from class: o.tAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tAU.AEQbTJ((SavedStateHandle) obj);
            }
        });
    }

    public final tAT EZpvd() {
        return (tAT) this.OLrzqt.getValue();
    }

    public static final tAT copydefault() {
        return new tAT();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        android.widget.FrameLayout root;
        super.onResume();
        tNU tnuOLrzqt = OLrzqt();
        if (tnuOLrzqt != null && (root = tnuOLrzqt.getRoot()) != null) {
            root.requestLayout();
        }
        if (valueOf().KWHzl().getValue().OLrzqt() != null || (valueOf().KWHzl().getValue() instanceof AbstractC46197tLk.StateListAnimator)) {
            return;
        }
        valueOf().EZpvd();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNU tnuOLrzqt = tNU.OLrzqt(view);
        Intrinsics.copydefault(tnuOLrzqt);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        OLrzqt(tnuOLrzqt, viewLifecycleOwner);
        EZpvd(tnuOLrzqt);
        OLrzqt(new Function1() { // from class: o.tAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tAU.OLrzqt(this.AEQbTJ, (tNU) obj);
            }
        });
    }

    public static final Unit OLrzqt(tAU tau, tNU tnu) {
        Intrinsics.checkNotNullParameter(tnu, "");
        tnu.copydefault.setWrapContent(true);
        tnu.copydefault.setNestedScrollingEnabled(false);
        tnu.copydefault.setOverScrollMode(2);
        tau.valueOf().EZpvd();
        tnu.copydefault.setAdapter(tau.EZpvd());
        tnu.copydefault.addItemDecoration(new tAY());
        tnu.copydefault.setLayoutManager(new LinearLayoutManager(tau.requireContext()));
        tnu.copydefault.setItemAnimator(null);
        StateFlow<AbstractC46197tLk<java.util.List<tBG>>> stateFlowKWHzl = tau.valueOf().KWHzl();
        LifecycleOwner viewLifecycleOwner = tau.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C46373tRy.AEQbTJ(stateFlowKWHzl, viewLifecycleOwner, Lifecycle.State.CREATED, new ProfileAssetsFragment$initView$2$1(tnu, tau, null));
        return Unit.INSTANCE;
    }
}
