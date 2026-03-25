package o;

import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.ui.AdvanceFilterRankViewModel;
import com.okinc.business.market.features.filter.ui.params.FilterRankFragmentParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26205jVv extends AbstractC26189jVf<hDW> implements InterfaceC26193jVj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.jVv$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public C26205jVv() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRankFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRankFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvanceFilterRankViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRankFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRankFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRankFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26205jVv.copydefault(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.jVv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jVv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26205jVv AEQbTJ(@NotNull FilterRankFragmentParams filterRankFragmentParams) {
            Intrinsics.checkNotNullParameter(filterRankFragmentParams, "");
            C26205jVv c26205jVv = new C26205jVv();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.filter_rank_params", filterRankFragmentParams);
            c26205jVv.setArguments(bundle);
            return c26205jVv;
        }
    }

    public final FilterRankFragmentParams AYXKKw() {
        FilterRankFragmentParams filterRankFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (filterRankFragmentParams = (FilterRankFragmentParams) BundleCompat.getParcelable(arguments, "key.filter_rank_params", FilterRankFragmentParams.class)) == null) ? new FilterRankFragmentParams(null, null, null, 7, null) : filterRankFragmentParams;
    }

    /* JADX DEBUG: Possible override for method o.jVf.gEmmrt()V */
    public final AdvanceFilterRankViewModel gEmmrt() {
        return (AdvanceFilterRankViewModel) this.valueOf.getValue();
    }

    private final kMM AhwBna() {
        return (kMM) this.AYXKKw.getValue();
    }

    public static final kMM copydefault(final C26205jVv c26205jVv) {
        C26282jYr c26282jYr = new C26282jYr(new Function1() { // from class: o.jVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26205jVv.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        jVF jvf = new jVF();
        kMM kmm = new kMM();
        kmm.register(C26280jYp.class, c26282jYr);
        kmm.register(jVG.class, jvf);
        return kmm;
    }

    public static final Unit OLrzqt(C26205jVv c26205jVv, int i) {
        jUY value = c26205jVv.gEmmrt().EZpvd().getValue();
        if (value != null) {
            int i2 = 0;
            for (java.lang.Object obj : value.EZpvd()) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                ((C26280jYp) obj).AEQbTJ(i2 == i);
                i2++;
            }
            c26205jVv.AEQbTJ(value.EZpvd());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hDW KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hDW hdwCopydefault = hDW.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdwCopydefault, "");
        return hdwCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    public void KWHzl(@NotNull final hDW hdw, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hdw, "");
        hdw.AEQbTJ.setAdapter(AhwBna());
        isConnected();
        C25352ivB.setOnDoubleCheckClickListener$default(hdw.OLrzqt, 0L, new Function1() { // from class: o.jVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26205jVv.copydefault(hdw, this, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(hdw.KWHzl, 0L, new Function1() { // from class: o.jVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26205jVv.EZpvd(hdw, this, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit copydefault(hDW hdw, C26205jVv c26205jVv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C54984xbQ.setSelectedStyle$default(hdw.OLrzqt, true, 0, 2, null);
        C54984xbQ.setSelectedStyle$default(hdw.KWHzl, false, 0, 2, null);
        c26205jVv.AhwBna = true;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hDW hdw, C26205jVv c26205jVv, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C54984xbQ.setSelectedStyle$default(hdw.OLrzqt, false, 0, 2, null);
        C54984xbQ.setSelectedStyle$default(hdw.KWHzl, true, 0, 2, null);
        c26205jVv.AhwBna = false;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        C54984xbQ c54984xbQ;
        C54984xbQ c54984xbQ2;
        AdvancedFilter advancedFilterCopydefault = AYXKKw().copydefault();
        this.AhwBna = advancedFilterCopydefault != null ? advancedFilterCopydefault.EZpvd() : false;
        hDW hdw = (hDW) aX_();
        if (hdw != null && (c54984xbQ2 = hdw.OLrzqt) != null) {
            C54984xbQ.setSelectedStyle$default(c54984xbQ2, this.AhwBna, 0, 2, null);
        }
        hDW hdw2 = (hDW) aX_();
        if (hdw2 == null || (c54984xbQ = hdw2.KWHzl) == null) {
            return;
        }
        C54984xbQ.setSelectedStyle$default(c54984xbQ, !this.AhwBna, 0, 2, null);
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        values();
    }

    private final void djBIcL() {
        gEmmrt().OLrzqt(AYXKKw().copydefault());
    }

    private final void values() {
        gEmmrt().EZpvd().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.jVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26205jVv.copydefault(this.KWHzl, (jUY) obj);
            }
        }));
    }

    public static final Unit copydefault(C26205jVv c26205jVv, jUY juy) {
        kMM.setData$default(c26205jVv.AhwBna(), juy.EZpvd(), null, 2, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c26205jVv, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.util.List<? extends kMU> list) {
        AhwBna().setItems(list);
        AhwBna().notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC26193jVj
    public void KWHzl() {
        C54984xbQ c54984xbQ;
        C54984xbQ c54984xbQ2;
        AdvancedFilter advancedFilterAEQbTJ = AYXKKw().AEQbTJ();
        this.AhwBna = advancedFilterAEQbTJ != null ? advancedFilterAEQbTJ.EZpvd() : false;
        hDW hdw = (hDW) aX_();
        if (hdw != null && (c54984xbQ2 = hdw.OLrzqt) != null) {
            C54984xbQ.setSelectedStyle$default(c54984xbQ2, this.AhwBna, 0, 2, null);
        }
        hDW hdw2 = (hDW) aX_();
        if (hdw2 != null && (c54984xbQ = hdw2.KWHzl) != null) {
            C54984xbQ.setSelectedStyle$default(c54984xbQ, !this.AhwBna, 0, 2, null);
        }
        gEmmrt().OLrzqt(AYXKKw().AEQbTJ());
    }

    @Override // o.InterfaceC26193jVj
    public AdvancedFilter AEQbTJ() {
        return gEmmrt().AEQbTJ(this.AhwBna);
    }
}
