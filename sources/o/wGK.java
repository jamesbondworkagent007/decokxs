package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.presenter.NoClosePositionPresenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wGK extends wGF<AbstractC48403uQe, NoClosePositionPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public boolean djBIcL;

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.ULRxlR;
    }

    public wGK() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.nocloseposition.NoClosePositionContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.nocloseposition.NoClosePositionContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.nocloseposition.NoClosePositionContainerFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wGK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final wGK copydefault(java.lang.String str) {
            wGK wgk = new wGK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("BOT_TYPE_KEY", str);
            wgk.setArguments(bundle);
            return wgk;
        }
    }

    private final TacticsDetailPresenter gEmmrt() {
        return (TacticsDetailPresenter) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("BOT_TYPE_KEY");
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C55804xqp<StrategyDetailsResponse> value = gEmmrt().getNewProxyInstance().getValue();
        if (value != null && (strategyDetailsResponseCopydefault = value.copydefault()) != null) {
            ((NoClosePositionPresenter) dxcTrN()).EZpvd(strategyDetailsResponseCopydefault);
        }
        this.djBIcL = gEmmrt().AubY();
        djBIcL();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.djBIcL != gEmmrt().AubY()) {
            this.djBIcL = gEmmrt().AubY();
            djBIcL();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ((AbstractC48403uQe) gGvvIC()).OLrzqt.setAdapter(new StateListAnimator(this, this));
        if (this.djBIcL) {
            C55244xgL c55244xgL = ((AbstractC48403uQe) gGvvIC()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
            c55244xgL.setVisibility(8);
            ViewPager2 viewPager2 = ((AbstractC48403uQe) gGvvIC()).OLrzqt;
            ViewGroup.LayoutParams layoutParams = ((AbstractC48403uQe) gGvvIC()).OLrzqt.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = null;
            ConstraintLayout.LayoutParams layoutParams3 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams3 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = C55298xhM.dp2px$default(16.0f, null, 1, null);
                layoutParams2 = layoutParams3;
            }
            viewPager2.setLayoutParams(layoutParams2);
            return;
        }
        C55244xgL c55244xgL2 = ((AbstractC48403uQe) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55244xgL2, "");
        c55244xgL2.setVisibility(0);
        new TabLayoutMediator(((AbstractC48403uQe) gGvvIC()).AEQbTJ.AYXKKw(), ((AbstractC48403uQe) gGvvIC()).OLrzqt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                wGK.OLrzqt(this.KWHzl, tab, i);
            }
        }).attach();
    }

    public static final void OLrzqt(wGK wgk, TabLayout.Tab tab, int i) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(tab, "");
        if (i == 0) {
            string = wgk.getString(C55688xof.Application.addObserver);
        } else if (i == 1) {
            string = wgk.getString(C55688xof.Application.removeCancellable);
        } else if (i == 2) {
            string = wgk.getString(C55688xof.Application.ActivityResultRegistryKt);
        }
        tab.setText(string);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator extends FragmentStateAdapter {
        public final /* synthetic */ wGK OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull wGK wgk, androidx.fragment.app.Fragment fragment) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.OLrzqt = wgk;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.djBIcL ? 1 : 3;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (this.OLrzqt.djBIcL) {
                return wGX.Companion.OLrzqt(this.OLrzqt.valueOf());
            }
            if (i == 0) {
                return C52179wBv.Companion.copydefault(true);
            }
            if (i == 1) {
                return wGT.Companion.copydefault(this.OLrzqt.valueOf());
            }
            if (i == 2) {
                return wGX.Companion.OLrzqt(this.OLrzqt.valueOf());
            }
            return C52179wBv.Companion.copydefault(true);
        }
    }
}
