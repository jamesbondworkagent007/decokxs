package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$onViewCreated$3;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54136wyf extends androidx.fragment.app.Fragment {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wyg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54136wyf.EZpvd();
        }
    });
    public uOA KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public C54136wyf() {
        final Function0 function0 = new Function0() { // from class: o.wye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54136wyf.KWHzl(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AutoEarnProfitPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnProfitListFragment$special$$inlined$viewModels$default$4
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

    public final uOA OLrzqt() {
        uOA uoa = this.KWHzl;
        Intrinsics.copydefault(uoa);
        return uoa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw EZpvd() {
        return new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw KWHzl() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    public final AutoEarnProfitPresenter copydefault() {
        return (AutoEarnProfitPresenter) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner KWHzl(C54136wyf c54136wyf) {
        androidx.fragment.app.Fragment parentFragment = c54136wyf.getParentFragment();
        return parentFragment != null ? parentFragment : c54136wyf;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.KWHzl = uOA.KWHzl(layoutInflater, viewGroup, false);
        android.view.View root = OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().OLrzqt.setLayoutManager(new LinearLayoutManager(getContext()));
        OLrzqt().OLrzqt.setItemAnimator(null);
        OLrzqt().OLrzqt.setNestedScrollingEnabled(true);
        KWHzl().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54136wyf.copydefault(this.copydefault, (EmptyData) obj);
            }
        }));
        KWHzl().register(C54138wyh.class, new C54142wyl());
        OLrzqt().OLrzqt.setAdapter(KWHzl());
        OLrzqt().KWHzl.KWHzl(new InterfaceC57900yrD() { // from class: o.wyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C54136wyf.AEQbTJ(this.EZpvd, interfaceC57934yrl);
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AutoEarnProfitListFragment$onViewCreated$3(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C54136wyf c54136wyf, EmptyData emptyData) {
        AutoEarnProfitPresenter autoEarnProfitPresenter;
        Intrinsics.checkNotNullParameter(emptyData, "");
        androidx.fragment.app.Fragment parentFragment = c54136wyf.getParentFragment();
        C54132wyb c54132wyb = parentFragment instanceof C54132wyb ? (C54132wyb) parentFragment : null;
        if (c54132wyb != null && (autoEarnProfitPresenter = (AutoEarnProfitPresenter) c54132wyb.OLrzqt()) != null) {
            autoEarnProfitPresenter.AEQbTJ(AutoEarnProfitPresenter.Application.StateListAnimator.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C54136wyf c54136wyf, InterfaceC57934yrl interfaceC57934yrl) {
        AutoEarnProfitPresenter autoEarnProfitPresenter;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        androidx.fragment.app.Fragment parentFragment = c54136wyf.getParentFragment();
        C54132wyb c54132wyb = parentFragment instanceof C54132wyb ? (C54132wyb) parentFragment : null;
        if (c54132wyb == null || (autoEarnProfitPresenter = (AutoEarnProfitPresenter) c54132wyb.OLrzqt()) == null) {
            return;
        }
        autoEarnProfitPresenter.gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.wyf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wyf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C54136wyf OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C54136wyf c54136wyf = new C54136wyf();
            c54136wyf.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_ccy", str)));
            return c54136wyf;
        }
    }
}
