package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54061wxJ extends AbstractC54505xKx<uOG, AutoEarnPresenter> {
    public C47976uAj<EducationTabType> AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public java.lang.String OLrzqt;
    public TabLayoutMediator copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String KWHzl = "autoType";

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.aUsmxb;
    }

    public C54061wxJ() {
        final Function0 function0 = new Function0() { // from class: o.wxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C54061wxJ.KWHzl(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoBotEarnStakingFragment$special$$inlined$viewModels$default$1
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AutoEarnPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoBotEarnStakingFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoBotEarnStakingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoBotEarnStakingFragment$special$$inlined$viewModels$default$4
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
        this.OLrzqt = "";
    }

    public final AutoEarnPresenter copydefault() {
        return (AutoEarnPresenter) this.EZpvd.getValue();
    }

    public static final ViewModelStoreOwner KWHzl(C54061wxJ c54061wxJ) {
        androidx.fragment.app.Fragment parentFragment = c54061wxJ.getParentFragment();
        return parentFragment != null ? parentFragment : c54061wxJ;
    }

    /* JADX INFO: renamed from: o.wxJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wxJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String AEQbTJ() {
            return C54061wxJ.KWHzl;
        }

        public final C54061wxJ KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C54061wxJ c54061wxJ = new C54061wxJ();
            c54061wxJ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(C54061wxJ.Companion.AEQbTJ(), str)));
            return c54061wxJ;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(KWHzl)) != null) {
            str = string;
        }
        this.OLrzqt = str;
        dxcTrN().copydefault(copydefault().OLrzqt());
        KWHzl();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        uOG uogGGvvIC = gGvvIC();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        java.util.List<EducationTabType> listKWHzl = dxcTrN().KWHzl(this.OLrzqt);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C47976uAj<EducationTabType> c47976uAj = new C47976uAj<>(childFragmentManager, listKWHzl, lifecycle, C56390yDp.OLrzqt(dxcTrN().KWHzl(), getArguments()));
        this.AhwBna = c47976uAj;
        uogGGvvIC.OLrzqt.setAdapter(c47976uAj);
        uogGGvvIC.OLrzqt.setUserInputEnabled(false);
        android.view.View childAt = uogGGvvIC.OLrzqt.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(uogGGvvIC.AEQbTJ.copydefault(), uogGGvvIC.OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C54061wxJ.KWHzl(this.copydefault, tab, i);
            }
        });
        this.copydefault = tabLayoutMediator;
        tabLayoutMediator.attach();
    }

    public static final void KWHzl(C54061wxJ c54061wxJ, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.wxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C54061wxJ.AEQbTJ(view);
            }
        });
        tab.setText(EducationTabType.Companion.copydefault(c54061wxJ.dxcTrN().KWHzl(c54061wxJ.OLrzqt).get(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TabLayoutMediator tabLayoutMediator = this.copydefault;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.copydefault = null;
    }
}
