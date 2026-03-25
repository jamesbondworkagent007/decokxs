package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$scrollListener$1$onScrollChange$1;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsParams;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.kLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26309jZr extends AbstractC26308jZq<C21467hAl> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public InterfaceC26310jZs AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final Activity DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public boolean gEmmrt;
    public Job isConnected;
    public jZT valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.jZr$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public C26309jZr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HolderDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$viewModels$default$5
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$3
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.detail.HolderDetailsFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = new Activity();
    }

    /* JADX DEBUG: Possible override for method o.jZq.AYXKKw()V */
    public final HolderDetailsViewModel AYXKKw() {
        return (HolderDetailsViewModel) this.fetchVPNInfo.getValue();
    }

    private final MarketCoinDetailViewModel djBIcL() {
        return (MarketCoinDetailViewModel) this.values.getValue();
    }

    private final TrackingAddressViewModel values() {
        return (TrackingAddressViewModel) this.AkhnZx.getValue();
    }

    public final HolderDetailsParams gEmmrt() {
        HolderDetailsParams holderDetailsParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (holderDetailsParams = (HolderDetailsParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "holder_detail", HolderDetailsParams.class))) == null) ? new HolderDetailsParams(null, null, null, null, null, null, null, 0, null, false, null, null, false, null, 16383, null) : holderDetailsParams;
    }

    /* JADX INFO: renamed from: o.jZr$Activity */
    public static final class Activity implements NestedScrollView.OnScrollChangeListener {
        public Activity() {
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            Intrinsics.checkNotNullParameter(nestedScrollView, "");
            Job job = C26309jZr.this.isConnected;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            C26309jZr.this.gEmmrt = true;
            C26309jZr c26309jZr = C26309jZr.this;
            LifecycleOwner viewLifecycleOwner = c26309jZr.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c26309jZr.isConnected = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HolderDetailsFragment$scrollListener$1$onScrollChange$1(C26309jZr.this, null), 3, null);
            if (i2 <= i4) {
                return;
            }
            boolean z = C26309jZr.this.AYXKKw().OLrzqt().getValue().AYXKKw() || C26309jZr.this.AYXKKw().OLrzqt().getValue().AhwBna();
            boolean zCanScrollVertically = nestedScrollView.canScrollVertically(1);
            if (!C26309jZr.this.AYXKKw().OLrzqt().getValue().OLrzqt() || z || zCanScrollVertically) {
                return;
            }
            C26309jZr.this.DbNXlk();
        }
    }

    /* JADX INFO: renamed from: o.jZr$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jZr.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C26309jZr AEQbTJ(@NotNull HolderDetailsParams holderDetailsParams, @NotNull InterfaceC26310jZs interfaceC26310jZs) {
            Intrinsics.checkNotNullParameter(holderDetailsParams, "");
            Intrinsics.checkNotNullParameter(interfaceC26310jZs, "");
            C26309jZr c26309jZr = new C26309jZr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("holder_detail", holderDetailsParams);
            c26309jZr.setArguments(bundle);
            c26309jZr.AYXKKw = interfaceC26310jZs;
            return c26309jZr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21467hAl KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21467hAl c21467hAlKWHzl = C21467hAl.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21467hAlKWHzl, "");
        return c21467hAlKWHzl;
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        AYXKKw().DbNXlk();
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        AYXKKw().isConnected();
    }

    /* JADX INFO: renamed from: o.jZr$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jZP jzp, Continuation<? super Unit> continuation) {
            C26309jZr.this.EZpvd(jzp);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21467hAl c21467hAl, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21467hAl, "");
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().DbNXlk(), null, new ActionBar(), 2, null);
        values().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.jZA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26309jZr.EZpvd(this.AEQbTJ, (java.lang.Long) obj);
            }
        }));
        AYXKKw().AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.jZw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26309jZr.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo();
        AYXKKw().gEmmrt();
    }

    /* JADX INFO: renamed from: o.jZr$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.Boolean bool, Continuation<? super Unit> continuation) {
            if (bool != null) {
                C26309jZr c26309jZr = C26309jZr.this;
                bool.booleanValue();
                c26309jZr.AYXKKw().gEmmrt();
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(C26309jZr c26309jZr, java.lang.Long l) {
        if (c26309jZr.AYXKKw().OLrzqt().getValue().AYXKKw()) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            c26309jZr.AYXKKw().gEmmrt();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C26309jZr c26309jZr, java.lang.Boolean bool) {
        jZT jzt = c26309jZr.valueOf;
        if (jzt != null) {
            Intrinsics.copydefault(bool);
            jzt.KWHzl(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AkhnZx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        NestedScrollView root;
        RecyclerView recyclerView;
        jZE jzeCopydefault = jZE.Companion.copydefault(gEmmrt(), this.AYXKKw);
        java.lang.Boolean value = AYXKKw().AEQbTJ().getValue();
        boolean zBooleanValue = value != null ? value.booleanValue() : false;
        java.lang.String strDjBIcL = gEmmrt().djBIcL();
        java.lang.String strAhwBna = gEmmrt().AhwBna();
        Function1 function1 = new Function1() { // from class: o.jZz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26309jZr.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        };
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.valueOf = new jZT(zBooleanValue, strDjBIcL, strAhwBna, function1, childFragmentManager, jzeCopydefault, "tag.holder_details_header_fragment");
        C21467hAl c21467hAl = (C21467hAl) aX_();
        if (c21467hAl != null && (recyclerView = c21467hAl.copydefault) != null) {
            recyclerView.setAdapter(this.valueOf);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setItemAnimator(null);
        }
        C21467hAl c21467hAl2 = (C21467hAl) aX_();
        if (c21467hAl2 == null || (root = c21467hAl2.getRoot()) == null) {
            return;
        }
        root.setOnScrollChangeListener(this.DbNXlk);
    }

    public static final Unit AEQbTJ(C26309jZr c26309jZr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c26309jZr.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C26277jYm c26277jYm;
        java.lang.String strAEQbTJ;
        jZT jzt;
        java.util.List<C26277jYm> listCopydefault = AYXKKw().OLrzqt().getValue().copydefault();
        if (listCopydefault == null || (c26277jYm = (C26277jYm) CollectionsKt___CollectionsKt.wlaJM(listCopydefault)) == null || (strAEQbTJ = c26277jYm.AEQbTJ()) == null) {
            return;
        }
        jZT jzt2 = this.valueOf;
        java.util.List<C26277jYm> listDjBIcL = jzt2 != null ? jzt2.djBIcL() : null;
        if (listDjBIcL != null && (jzt = this.valueOf) != null) {
            kLH.updateList$default(jzt, listDjBIcL, true, null, 4, null);
        }
        AYXKKw().OLrzqt(strAEQbTJ);
    }

    private final void isConnected() {
        jZT jzt = this.valueOf;
        java.util.ArrayList arrayList = null;
        java.lang.Iterable currentList = jzt != null ? jzt.getCurrentList() : null;
        jZT jzt2 = this.valueOf;
        if (jzt2 != null) {
            if (currentList != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : currentList) {
                    if (!(((kLL) obj) instanceof kLL.FragmentManager)) {
                        arrayList.add(obj);
                    }
                }
            }
            jzt2.submitList(arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C21467hAl c21467hAl = (C21467hAl) aX_();
        if (c21467hAl != null) {
            C55173xeu c55173xeu = c21467hAl.OLrzqt;
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(z ? 0 : 8);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jZt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26309jZr.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void copydefault(C26309jZr c26309jZr, android.view.View view) {
        c26309jZr.AYXKKw().gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        C21467hAl c21467hAl = (C21467hAl) aX_();
        if (c21467hAl != null) {
            C55173xeu c55173xeu = c21467hAl.OLrzqt;
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivityReportFullyDrawnExecutorApi1));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.gwwzsY));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jZu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C26309jZr.EZpvd(this.KWHzl, view);
                }
            });
        }
    }

    public static final void EZpvd(final C26309jZr c26309jZr, android.view.View view) {
        c26309jZr.OLrzqt(C31256lqb.KWHzl(c26309jZr.AYXKKw().OLrzqt().getValue().KWHzl(), (Function0<java.lang.String>) new Function0() { // from class: o.jZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26309jZr.KWHzl(this.EZpvd);
            }
        }));
    }

    public static final java.lang.String KWHzl(C26309jZr c26309jZr) {
        return c26309jZr.gEmmrt().OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(jZP jzp) {
        C21467hAl c21467hAl = (C21467hAl) aX_();
        if (c21467hAl != null) {
            C55113xdn c55113xdn = c21467hAl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(jzp.AYXKKw() ? 0 : 8);
            EZpvd((jzp.AYXKKw() || jzp.EZpvd() == null) ? false : true);
            if (jzp.AYXKKw()) {
                C55113xdn.showLoading$default(c21467hAl.KWHzl, 0L, 1, null);
            } else {
                c21467hAl.KWHzl.copydefault();
            }
            if (jzp.djBIcL()) {
                isConnected();
            }
            if (jzp.valueOf() != null && !jzp.AYXKKw() && !jzp.AhwBna()) {
                AEQbTJ(jzp);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            if (!jzp.AYXKKw() && jzp.EZpvd() != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            RecyclerView recyclerView = c21467hAl.copydefault;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (jzp.EZpvd() == null && !jzp.AYXKKw()) {
                i = 0;
            }
            recyclerView.setVisibility(i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(jZP jzp) {
        jZT jzt;
        java.util.List<C26277jYm> listCopydefault;
        if (((C21467hAl) aX_()) != null) {
            if (!jzp.AEQbTJ() || (listCopydefault = jzp.copydefault()) == null || !listCopydefault.isEmpty()) {
                if (this.gEmmrt || (jzt = this.valueOf) == null) {
                    return;
                }
                kLH.updateList$default(jzt, jzp.copydefault(), false, null, 6, null);
                return;
            }
            valueOf();
            jZT jzt2 = this.valueOf;
            if (jzt2 != null) {
                kLH.updateList$default(jzt2, null, false, null, 6, null);
            }
        }
    }

    public final void OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        if (context != null) {
            C25352ivB.KWHzl(context, str);
        }
    }

    private final void AkhnZx() {
        C32866mlf.onEvent$default("DEXMarket_Token_Holders_Detailed_View", (TrackChannel[]) null, new Function1() { // from class: o.jZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26309jZr.copydefault(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C26309jZr c26309jZr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", c26309jZr.gEmmrt().valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "holder_address", c26309jZr.gEmmrt().KWHzl(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        NestedScrollView root;
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        C21467hAl c21467hAl = (C21467hAl) aX_();
        if (c21467hAl != null && (root = c21467hAl.getRoot()) != null) {
            root.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) null);
        }
        C21467hAl c21467hAl2 = (C21467hAl) aX_();
        if (c21467hAl2 != null && (recyclerView2 = c21467hAl2.copydefault) != null) {
            recyclerView2.setAdapter(null);
        }
        C21467hAl c21467hAl3 = (C21467hAl) aX_();
        if (c21467hAl3 != null && (recyclerView = c21467hAl3.copydefault) != null) {
            recyclerView.setLayoutManager(null);
        }
        this.valueOf = null;
        this.AYXKKw = null;
        super.onDestroyView();
    }
}
