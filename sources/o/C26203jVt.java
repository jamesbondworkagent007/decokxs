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
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.AdvanceFilterRangeViewModel;
import com.okinc.business.market.features.filter.ui.CommonTrackData;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.business.market.features.filter.ui.FilterSheetTrackParams;
import com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.jUZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26203jVt extends AbstractC26187jVd<hDQ> implements jUZ, InterfaceC26193jVj {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.jVt$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    @Override // o.jUZ
    public void AEQbTJ(@NotNull FilterAction filterAction, @NotNull TokenFilter tokenFilter) {
        jUZ.TaskDescription.AEQbTJ(this, filterAction, tokenFilter);
    }

    public C26203jVt() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRangeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRangeFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvanceFilterRangeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRangeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRangeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.filter.ui.MarketFilterRangeFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.jVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26203jVt.OLrzqt(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.jVt$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jVt.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C26203jVt AEQbTJ(@NotNull FilterRangeFragmentParams filterRangeFragmentParams) {
            Intrinsics.checkNotNullParameter(filterRangeFragmentParams, "");
            C26203jVt c26203jVt = new C26203jVt();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.filter_range_params", filterRangeFragmentParams);
            c26203jVt.setArguments(bundle);
            return c26203jVt;
        }
    }

    public final FilterRangeFragmentParams gEmmrt() {
        FilterRangeFragmentParams filterRangeFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (filterRangeFragmentParams = (FilterRangeFragmentParams) BundleCompat.getParcelable(arguments, "key.filter_range_params", FilterRangeFragmentParams.class)) == null) ? new FilterRangeFragmentParams(null, null, null, null, null, 31, null) : filterRangeFragmentParams;
    }

    public final AdvanceFilterRangeViewModel AYXKKw() {
        return (AdvanceFilterRangeViewModel) this.djBIcL.getValue();
    }

    private final kMM djBIcL() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM OLrzqt(final C26203jVt c26203jVt) {
        jVI jvi = new jVI(new Function1() { // from class: o.jVr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26203jVt.OLrzqt(this.KWHzl, (jVE) obj);
            }
        });
        jVL jvl = new jVL(new Function1() { // from class: o.jVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26203jVt.OLrzqt(this.EZpvd, (kotlin.Pair) obj);
            }
        });
        jVF jvf = new jVF();
        C26283jYs c26283jYs = new C26283jYs();
        kMM kmm = new kMM();
        kmm.register(jVE.class, jvi);
        kmm.register(jVK.class, jvl);
        kmm.register(jVG.class, jvf);
        kmm.register(C26281jYq.class, c26283jYs);
        return kmm;
    }

    public static final Unit OLrzqt(C26203jVt c26203jVt, jVE jve) {
        Intrinsics.checkNotNullParameter(jve, "");
        c26203jVt.AEQbTJ(jve);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C26203jVt c26203jVt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c26203jVt.EZpvd(pair);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public hDQ KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hDQ hdqCopydefault = hDQ.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hdqCopydefault, "");
        return hdqCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hDQ hdq, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hdq, "");
        hdq.AEQbTJ.setAdapter(djBIcL());
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
        AkhnZx();
    }

    private final void AhwBna() {
        AYXKKw().copydefault();
        AYXKKw().OLrzqt(gEmmrt().AEQbTJ());
    }

    private final void AkhnZx() {
        AYXKKw().AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.jVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26203jVt.KWHzl(this.KWHzl, (jUW) obj);
            }
        }));
    }

    public static final Unit KWHzl(C26203jVt c26203jVt, jUW juw) {
        c26203jVt.djBIcL().setItems(juw.EZpvd());
        c26203jVt.djBIcL().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c26203jVt, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(jVE jve) {
        if (getChildFragmentManager().findFragmentByTag("tag.FilterBottomSheet") != null) {
            return;
        }
        jUM.Companion.KWHzl(new FilterBottomSheetParams(jve.EZpvd(), null, gEmmrt().EZpvd(jve.AEQbTJ()), null, AYXKKw().copydefault(jve.AEQbTJ()), AYXKKw().EZpvd(jve.AEQbTJ()), null, null, new FilterSheetTrackParams(null, new CommonTrackData("DEXMarket_Home_Filter_Sheet_View", "type", jve.gEmmrt()), 1, null), null, null, null, null, false, true, false, false, 114378, null)).show(getChildFragmentManager(), "tag.FilterBottomSheet");
    }

    @Override // o.jUZ
    public void KWHzl(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        AYXKKw().AEQbTJ(tokenFilter);
        jUW value = AYXKKw().AEQbTJ().getValue();
        if (value != null) {
            int i = 0;
            for (java.lang.Object obj : value.EZpvd()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (obj instanceof jVE) {
                    jVE jve = (jVE) obj;
                    if (jve.AEQbTJ().getValue() == java.lang.Integer.parseInt(tokenFilter.DbNXlk())) {
                        java.lang.String strAhwBna = tokenFilter.AYXKKw().AhwBna();
                        java.lang.String strKWHzl = tokenFilter.AYXKKw().KWHzl();
                        jve.EZpvd(strAhwBna);
                        jve.AEQbTJ(strKWHzl);
                        jve.OLrzqt(tokenFilter.AYXKKw().djBIcL());
                        jve.KWHzl(tokenFilter.AYXKKw().OLrzqt());
                        jve.OLrzqt(tokenFilter.AYXKKw().AEQbTJ());
                    }
                }
                i++;
            }
            AEQbTJ((java.util.List<? extends java.lang.Object>) value.EZpvd());
        }
    }

    public final void AEQbTJ(java.util.List<? extends java.lang.Object> list) {
        djBIcL().setItems(list);
        djBIcL().notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final kotlin.Pair<java.lang.Integer, java.lang.Boolean> pair) {
        RecyclerView recyclerView;
        java.lang.Object obj = djBIcL().getItems().get(pair.getFirst().intValue());
        jVK jvk = obj instanceof jVK ? (jVK) obj : null;
        if (jvk != null) {
            jvk.copydefault(pair.getSecond().booleanValue());
        }
        hDQ hdq = (hDQ) aX_();
        if (hdq != null && (recyclerView = hdq.AEQbTJ) != null) {
            RecyclerView recyclerView2 = recyclerView.isComputingLayout() ? recyclerView : null;
            if (recyclerView2 != null) {
                recyclerView2.post(new java.lang.Runnable() { // from class: o.jVp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26203jVt.KWHzl(this.OLrzqt, pair);
                    }
                });
                return;
            }
        }
        djBIcL().notifyItemChanged(pair.getFirst().intValue());
    }

    public static final void KWHzl(C26203jVt c26203jVt, kotlin.Pair pair) {
        c26203jVt.djBIcL().notifyItemChanged(((java.lang.Number) pair.getFirst()).intValue());
    }

    @Override // o.InterfaceC26193jVj
    public void KWHzl() {
        AYXKKw().OLrzqt(gEmmrt().EZpvd());
    }

    @Override // o.InterfaceC26193jVj
    public AdvancedFilter AEQbTJ() {
        AYXKKw().valueOf();
        return AYXKKw().EZpvd();
    }
}
