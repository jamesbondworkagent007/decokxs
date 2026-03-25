package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
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
import com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18929frg extends AbstractC18930frh {
    public final InterfaceC56387yDm AYXKKw;
    public C17169exi AhwBna;
    public C18933frk djBIcL;
    public LinearSnapHelper gEmmrt;

    /* JADX INFO: renamed from: o.frg$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    public C18929frg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletBannerEventViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.search.banner.ui.WalletBannerEventFragment$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.frh.OLrzqt()V */
    public final WalletBannerEventViewModel OLrzqt() {
        return (WalletBannerEventViewModel) this.AYXKKw.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C17169exi c17169exiEZpvd = C17169exi.EZpvd(layoutInflater, viewGroup, false);
        this.AhwBna = c17169exiEZpvd;
        if (c17169exiEZpvd != null) {
            return c17169exiEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
        djBIcL();
        if (view.getParent() instanceof android.view.View) {
            java.lang.Object parent = view.getParent();
            Intrinsics.copydefault(parent, "");
            if (((android.view.View) parent).getVisibility() == 0) {
                OLrzqt().KWHzl();
            }
        }
    }

    private final void djBIcL() {
        ConstraintLayout root;
        C17169exi c17169exi = this.AhwBna;
        if (c17169exi != null && (root = c17169exi.getRoot()) != null) {
            root.setVisibility(8);
        }
        android.content.Context context = getContext();
        if (context != null) {
            this.djBIcL = new C18933frk(context, new Function1() { // from class: o.frl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18929frg.KWHzl(this.EZpvd, (C18927fre) obj);
                }
            });
            AhwBna();
        }
    }

    public static final Unit KWHzl(C18929frg c18929frg, C18927fre c18927fre) {
        Intrinsics.checkNotNullParameter(c18927fre, "");
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c18929frg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, c18927fre.EZpvd(), null, new Function1() { // from class: o.frm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18929frg.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        RecyclerView recyclerView;
        C17169exi c17169exi = this.AhwBna;
        if (c17169exi == null || (recyclerView = c17169exi.copydefault) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(this.djBIcL);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();
        this.gEmmrt = linearSnapHelper;
        linearSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.frg$TaskDescription */
    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C18929frg.this.AYXKKw();
            }
        }
    }

    public final void AYXKKw() {
        RecyclerView recyclerView;
        android.view.View viewFindSnapView;
        AppCompatTextView appCompatTextView;
        C17169exi c17169exi = this.AhwBna;
        if (c17169exi == null || (recyclerView = c17169exi.copydefault) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        LinearSnapHelper linearSnapHelper = this.gEmmrt;
        if (linearSnapHelper == null || (viewFindSnapView = linearSnapHelper.findSnapView(linearLayoutManager)) == null) {
            return;
        }
        C18933frk c18933frk = this.djBIcL;
        int itemCount = c18933frk != null ? c18933frk.getItemCount() : 0;
        if (itemCount > 1) {
            int position = linearLayoutManager != null ? linearLayoutManager.getPosition(viewFindSnapView) : 0;
            C17169exi c17169exi2 = this.AhwBna;
            if (c17169exi2 == null || (appCompatTextView = c17169exi2.AEQbTJ) == null) {
                return;
            }
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%d/%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(position + 1), java.lang.Integer.valueOf(itemCount)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "");
            appCompatTextView.setText(str);
        }
    }

    private final void gEmmrt() {
        final C17169exi c17169exi = this.AhwBna;
        if (c17169exi != null) {
            OLrzqt().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.frp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18929frg.OLrzqt(c17169exi, this, (java.util.List) obj);
                }
            }));
        }
    }

    public static final Unit OLrzqt(final C17169exi c17169exi, final C18929frg c18929frg, final java.util.List list) {
        ConstraintLayout root = c17169exi.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        Intrinsics.copydefault(list);
        root.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        C18933frk c18933frk = c18929frg.djBIcL;
        if (c18933frk != null) {
            c18933frk.submitList(list, new java.lang.Runnable() { // from class: o.frn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C18929frg.KWHzl(list, c17169exi, c18929frg);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.util.List list, C17169exi c17169exi, C18929frg c18929frg) {
        C17169exi c17169exi2;
        AppCompatTextView appCompatTextView;
        int size = list.size();
        boolean z = size > 1;
        CardView cardView = c17169exi.EZpvd;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setVisibility(z ? 0 : 8);
        if (z && (c17169exi2 = c18929frg.AhwBna) != null && (appCompatTextView = c17169exi2.AEQbTJ) != null) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("1/%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            appCompatTextView.setText(str);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18929frg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C18933frk c18933frk = this.djBIcL;
        if (c18933frk != null) {
            c18933frk.copydefault();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C18933frk c18933frk = this.djBIcL;
        if (c18933frk != null) {
            c18933frk.copydefault();
        }
    }
}
