package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.event.ui.BannerEventViewModel;
import com.okinc.business.market.widget.tag.TagEventSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jRW extends AbstractC26105jSc {
    public LinearSnapHelper AEQbTJ;
    public jRS EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C21461hAf copydefault;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public jRW() {
        final Function0 function0 = new Function0() { // from class: o.jRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jRW.AEQbTJ(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.event.ui.BannerEventFragment$special$$inlined$viewModels$default$1
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BannerEventViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.event.ui.BannerEventFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.event.ui.BannerEventFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.event.ui.BannerEventFragment$special$$inlined$viewModels$default$4
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

    /* JADX DEBUG: Possible override for method o.jSc.KWHzl()V */
    public final BannerEventViewModel KWHzl() {
        return (BannerEventViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(jRW jrw) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = jrw.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21461hAf c21461hAfKWHzl = C21461hAf.KWHzl(layoutInflater, viewGroup, false);
        this.copydefault = c21461hAfKWHzl;
        if (c21461hAfKWHzl != null) {
            return c21461hAfKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        AhwBna();
    }

    private final void AhwBna() {
        ConstraintLayout root;
        C21461hAf c21461hAf = this.copydefault;
        if (c21461hAf != null && (root = c21461hAf.getRoot()) != null) {
            root.setVisibility(8);
        }
        android.content.Context context = getContext();
        if (context != null) {
            this.EZpvd = new jRS(context, new Function1() { // from class: o.jRX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jRW.copydefault(this.copydefault, (jRP) obj);
                }
            });
            gEmmrt();
        }
    }

    public static final Unit copydefault(jRW jrw, jRP jrp) {
        Intrinsics.checkNotNullParameter(jrp, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = jrw.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        gKZ gkz = gKZ.EZpvd;
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, gkz.OLrzqt(gkz.AEQbTJ(jrp.EZpvd()), C56390yDp.OLrzqt("from", TagEventSource.SEARCH_BANNER.getValue())), null, new Function1() { // from class: o.jSa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jRW.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        RecyclerView recyclerView;
        C21461hAf c21461hAf = this.copydefault;
        if (c21461hAf == null || (recyclerView = c21461hAf.KWHzl) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.EZpvd);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.AEQbTJ = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new StateListAnimator());
    }

    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                jRW.this.valueOf();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        RecyclerView recyclerView;
        android.view.View viewFindSnapView;
        wXO wxo;
        C21461hAf c21461hAf = this.copydefault;
        if (c21461hAf == null || (recyclerView = c21461hAf.KWHzl) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        LinearSnapHelper linearSnapHelper = this.AEQbTJ;
        if (linearSnapHelper == null || (viewFindSnapView = linearSnapHelper.findSnapView(linearLayoutManager)) == null) {
            return;
        }
        int position = linearLayoutManager != null ? linearLayoutManager.getPosition(viewFindSnapView) : 0;
        C21461hAf c21461hAf2 = this.copydefault;
        if (c21461hAf2 == null || (wxo = c21461hAf2.OLrzqt) == null) {
            return;
        }
        wxo.setSelectedItem(position);
    }

    private final void djBIcL() {
        final C21461hAf c21461hAf = this.copydefault;
        if (c21461hAf != null) {
            KWHzl().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.jSf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jRW.AEQbTJ(c21461hAf, this, (java.util.List) obj);
                }
            }));
        }
    }

    public static final Unit AEQbTJ(final C21461hAf c21461hAf, jRW jrw, final java.util.List list) {
        ConstraintLayout root = c21461hAf.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        Intrinsics.copydefault(list);
        root.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        jRS jrs = jrw.EZpvd;
        if (jrs != null) {
            jrs.submitList(list, new java.lang.Runnable() { // from class: o.jRZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    jRW.KWHzl(c21461hAf, list);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jrw, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C21461hAf c21461hAf, java.util.List list) {
        c21461hAf.OLrzqt.setCount(list.size());
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            c21461hAf.OLrzqt.setSelectedItem(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        jRS jrs = this.EZpvd;
        if (jrs != null) {
            jrs.copydefault();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        jRS jrs = this.EZpvd;
        if (jrs != null) {
            jrs.copydefault();
        }
    }
}
