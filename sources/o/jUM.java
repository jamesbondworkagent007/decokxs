package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.common.constants.RangeType;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TimeRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.CommonTrackData;
import com.okinc.business.market.features.filter.ui.FilterAction;
import com.okinc.business.market.features.filter.ui.FilterBottomSheet$updateAddressFilter$1;
import com.okinc.business.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.business.market.features.filter.ui.FilterViewModel;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import com.okinc.business.market.widget.time_range_selection.TimeSelectionWidget;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C23274hvD;
import o.C31197lpV;
import o.C52761wXj;
import o.InterfaceC28002kLg;
import o.jUM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUM extends AbstractC26188jVe {
    public C23461hyf AhwBna;
    public final MutableSharedFlow<java.util.List<java.lang.String>> EZpvd;
    public int KWHzl;
    public final ActionBar OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.KWHzl = i;
    }

    public jUM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.filter.ui.FilterBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.EZpvd = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = new ActionBar();
        this.KWHzl = 2;
    }

    /* JADX DEBUG: Possible override for method o.jVe.EZpvd()V */
    public final FilterBottomSheetParams EZpvd() {
        FilterBottomSheetParams filterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (filterBottomSheetParams = (FilterBottomSheetParams) BundleCompat.getParcelable(arguments, "key.filterBottomSheetParams", FilterBottomSheetParams.class)) == null) ? FilterBottomSheetParams.Companion.copydefault() : filterBottomSheetParams;
    }

    public final FilterViewModel AEQbTJ() {
        return (FilterViewModel) this.djBIcL.getValue();
    }

    private final SharedFilterViewModel gEmmrt() {
        return (SharedFilterViewModel) this.copydefault.getValue();
    }

    public static final class ActionBar implements InterfaceC28002kLg {
        public ActionBar() {
        }

        @Override // o.InterfaceC28002kLg
        public void EZpvd(java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            jUM.this.copydefault(list);
        }

        @Override // o.InterfaceC28002kLg
        public void EZpvd() {
            final NestedScrollView nestedScrollViewCopydefault;
            InterfaceC28002kLg.ActionBar.OLrzqt(this);
            C23461hyf c23461hyf = jUM.this.AhwBna;
            if (c23461hyf == null || (nestedScrollViewCopydefault = c23461hyf.getRoot()) == null) {
                return;
            }
            final jUM jum = jUM.this;
            nestedScrollViewCopydefault.post(new java.lang.Runnable() { // from class: o.jUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    jUM.ActionBar.OLrzqt(jum, nestedScrollViewCopydefault);
                }
            });
        }

        public static final void OLrzqt(jUM jum, NestedScrollView nestedScrollView) {
            InterfaceC28026kMd interfaceC28026kMdCopydefault = jum.copydefault(jum.EZpvd().valueOf());
            if (interfaceC28026kMdCopydefault != null) {
                FragmentActivity fragmentActivityRequireActivity = jum.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                interfaceC28026kMdCopydefault.KWHzl(fragmentActivityRequireActivity);
            }
            nestedScrollView.smoothScrollTo(0, nestedScrollView.getChildAt(0).getHeight() - nestedScrollView.getHeight());
        }

        @Override // o.InterfaceC28002kLg
        public void copydefault() {
            AppCompatTextView appCompatTextView;
            InterfaceC28002kLg.ActionBar.AEQbTJ(this);
            jUM jum = jUM.this;
            final InterfaceC28026kMd interfaceC28026kMdCopydefault = jum.copydefault(jum.EZpvd().valueOf());
            if (interfaceC28026kMdCopydefault != null) {
                final jUM jum2 = jUM.this;
                C23461hyf c23461hyf = jum2.AhwBna;
                if (c23461hyf == null || (appCompatTextView = c23461hyf.gEmmrt) == null) {
                    return;
                }
                appCompatTextView.post(new java.lang.Runnable() { // from class: o.jUQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        jUM.ActionBar.KWHzl(interfaceC28026kMdCopydefault, jum2);
                    }
                });
            }
        }

        public static final void KWHzl(InterfaceC28026kMd interfaceC28026kMd, jUM jum) {
            FragmentActivity fragmentActivityRequireActivity = jum.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC28026kMd.KWHzl(fragmentActivityRequireActivity);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AEQbTJ(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.debounce(this.EZpvd, 200L), null, new Fragment(), 2, null);
        djBIcL();
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jUV juv, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            C54946xaf binding = jUM.this.getBinding();
            android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
            wYF wyf = view instanceof wYF ? (wYF) view : null;
            if (wyf == null) {
                return Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(juv.AEQbTJ());
            }
            C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(juv.OLrzqt());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) {
            jUM.this.AEQbTJ().copydefault(list);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        if (EZpvd().AkhnZx().length() == 0) {
            return;
        }
        wxq.AYXKKw().setText(EZpvd().AkhnZx());
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        AppCompatTextView appCompatTextView;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C23461hyf c23461hyfEZpvd = C23461hyf.EZpvd(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        this.AhwBna = c23461hyfEZpvd;
        if (c23461hyfEZpvd != null && (appCompatTextView = c23461hyfEZpvd.copydefault) != null) {
            appCompatTextView.setVisibility(8);
        }
        TokenFilter tokenFilterValueOf = EZpvd().valueOf();
        java.lang.String strDbNXlk = tokenFilterValueOf != null ? tokenFilterValueOf.DbNXlk() : null;
        AEQbTJ(strDbNXlk != null ? strDbNXlk : "");
        KWHzl(EZpvd().valueOf());
        TokenFilter tokenFilterValueOf2 = EZpvd().valueOf();
        java.util.List<java.lang.String> listOLrzqt = tokenFilterValueOf2 != null ? tokenFilterValueOf2.OLrzqt() : null;
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        EZpvd(listOLrzqt);
        TokenFilter tokenFilterValueOf3 = EZpvd().valueOf();
        KWHzl(tokenFilterValueOf3 != null ? tokenFilterValueOf3.valueOf() : null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            TokenFilter tokenFilterValueOf = EZpvd().valueOf();
            c52794wYpCopydefault.setVisibility(((tokenFilterValueOf == null || (strDbNXlk = tokenFilterValueOf.DbNXlk()) == null) ? null : RangeType.Companion.OLrzqt(strDbNXlk)) != RangeType.TIME_CREATE ? 0 : 8);
        }
        wyf.setPrimaryText(C31256lqb.KWHzl(EZpvd().AYXKKw(), (Function0<java.lang.String>) new Function0() { // from class: o.jUN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jUM.AhwBna(this.copydefault);
            }
        }));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
        wyf.setSecondaryText(C31256lqb.KWHzl(EZpvd().DbNXlk(), (Function0<java.lang.String>) new Function0() { // from class: o.jUU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jUM.values(this.AEQbTJ);
            }
        }));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public static final java.lang.String AhwBna(jUM jum) {
        java.lang.String string = jum.requireContext().getString(C23274hvD.Fragment.dpErvT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String values(jUM jum) {
        java.lang.String string = jum.requireContext().getString(C23274hvD.Fragment.sanrWj);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ jUM KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, jUM jum) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = jum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                jUM jum = this.KWHzl;
                TokenFilter tokenFilterCopydefault = jum.EZpvd().copydefault();
                jum.OLrzqt(tokenFilterCopydefault.OLrzqt((6143 & 1) != 0 ? tokenFilterCopydefault.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterCopydefault.isConnected : null, (6143 & 4) != 0 ? tokenFilterCopydefault.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterCopydefault.AhwBna : null, (6143 & 16) != 0 ? tokenFilterCopydefault.KWHzl : null, (6143 & 32) != 0 ? tokenFilterCopydefault.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterCopydefault.valueOf : false, (6143 & 128) != 0 ? tokenFilterCopydefault.EZpvd : "", (6143 & 256) != 0 ? tokenFilterCopydefault.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterCopydefault.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterCopydefault.copydefault : null, (6143 & 2048) != 0 ? tokenFilterCopydefault.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterCopydefault.fetchVPNInfo : null), this.KWHzl.EZpvd().AhwBna());
                this.KWHzl.dismissAllowingStateLoss();
                TokenFilter tokenFilterCopydefault2 = this.KWHzl.EZpvd().copydefault();
                C21847hOn.OLrzqt(this.KWHzl.EZpvd().isConnected().EZpvd(), tokenFilterCopydefault2.isConnected(), this.KWHzl.EZpvd().values(), tokenFilterCopydefault2.KWHzl(), this.KWHzl.EZpvd().EZpvd(), "reset");
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jUM KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jUM jum) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = jum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jUM jum = this.KWHzl;
                jum.OLrzqt(jum.AEQbTJ().AEQbTJ().getValue().EZpvd(), this.KWHzl.EZpvd().djBIcL());
                this.KWHzl.dismissAllowingStateLoss();
                TokenFilter tokenFilterCopydefault = this.KWHzl.EZpvd().copydefault();
                C21847hOn.OLrzqt(this.KWHzl.EZpvd().isConnected().EZpvd(), tokenFilterCopydefault.isConnected(), this.KWHzl.EZpvd().values(), tokenFilterCopydefault.KWHzl(), this.KWHzl.EZpvd().EZpvd(), "apply");
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        C33570myu.copydefault((android.app.Activity) getActivity());
    }

    public final void AEQbTJ(java.lang.String str) {
        C28055kNf c28055kNf;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        java.util.List<TypeOptionParams> listFetchVPNInfo = EZpvd().fetchVPNInfo();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        for (TypeOptionParams typeOptionParams : listFetchVPNInfo) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) typeOptionParams.OLrzqt());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C28060kNk(typeOptionParams.copydefault(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        C23461hyf c23461hyf = this.AhwBna;
        if (c23461hyf == null || (c28055kNf = c23461hyf.values) == null) {
            return;
        }
        c28055kNf.setSpanCount(3);
        c28055kNf.setCallback(new Dialog());
        c28055kNf.setData(arrayList, str);
        c28055kNf.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
        C23461hyf c23461hyf2 = this.AhwBna;
        if (c23461hyf2 != null && (appCompatTextView2 = c23461hyf2.djBIcL) != null) {
            appCompatTextView2.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
        }
        java.lang.Integer numFARcdN = EZpvd().fARcdN();
        if (numFARcdN != null) {
            int iIntValue = numFARcdN.intValue();
            C23461hyf c23461hyf3 = this.AhwBna;
            if (c23461hyf3 == null || (appCompatTextView = c23461hyf3.djBIcL) == null) {
                return;
            }
            appCompatTextView.setText(iIntValue);
        }
    }

    public final /* synthetic */ class Dialog implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, jUM.this, jUM.class, "onTypeChange", "onTypeChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            jUM.this.EZpvd(str);
        }
    }

    public final void KWHzl(TokenFilter tokenFilter) {
        AppCompatTextView appCompatTextView;
        C23461hyf c23461hyf = this.AhwBna;
        if (c23461hyf != null && (appCompatTextView = c23461hyf.gEmmrt) != null) {
            TokenFilter tokenFilterValueOf = EZpvd().valueOf();
            appCompatTextView.setVisibility((tokenFilterValueOf == null || !tokenFilterValueOf.djBIcL()) ? 8 : 0);
        }
        InterfaceC28026kMd interfaceC28026kMdCopydefault = copydefault(tokenFilter);
        if (interfaceC28026kMdCopydefault != null) {
            interfaceC28026kMdCopydefault.setCallback(new LoaderManager());
            interfaceC28026kMdCopydefault.setSelectionDismissCallback(new Function0() { // from class: o.jUO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return jUM.isConnected(this.EZpvd);
                }
            });
            if (tokenFilter != null && tokenFilter.AEQbTJ()) {
                interfaceC28026kMdCopydefault.setData(EZpvd().gEmmrt(), tokenFilter.copydefault(), EZpvd().valueOf());
            } else {
                interfaceC28026kMdCopydefault.setData(EZpvd().gEmmrt(), tokenFilter != null ? tokenFilter.AYXKKw() : null, EZpvd().valueOf());
            }
        }
    }

    public final /* synthetic */ class LoaderManager implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, jUM.this, jUM.class, "onPriceRangeSelectionChange", "onPriceRangeSelectionChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            jUM.this.copydefault(priceRangeFilter, z);
        }
    }

    public static final Unit isConnected(jUM jum) {
        if (jum.EZpvd().KWHzl()) {
            jum.dismissAllowingStateLoss();
            notifyHost$default(jum, jum.AEQbTJ().AEQbTJ().getValue().EZpvd(), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        C28010kLo c28010kLo;
        AppCompatTextView appCompatTextView;
        TokenFilter tokenFilterValueOf = EZpvd().valueOf();
        boolean zAhwBna = tokenFilterValueOf != null ? tokenFilterValueOf.AhwBna() : false;
        C23461hyf c23461hyf = this.AhwBna;
        if (c23461hyf == null || (c28010kLo = c23461hyf.AYXKKw) == null) {
            return;
        }
        c28010kLo.setVisibility(zAhwBna ? 0 : 8);
        C23461hyf c23461hyf2 = this.AhwBna;
        if (c23461hyf2 != null && (appCompatTextView = c23461hyf2.AEQbTJ) != null) {
            appCompatTextView.setVisibility(zAhwBna ? 0 : 8);
        }
        c28010kLo.setCallback(this.OLrzqt);
        c28010kLo.setData(list);
    }

    public final void KWHzl(TimeRangeFilter timeRangeFilter) {
        TimeSelectionWidget timeSelectionWidget;
        C23461hyf c23461hyf = this.AhwBna;
        if (c23461hyf == null || (timeSelectionWidget = c23461hyf.DbNXlk) == null) {
            return;
        }
        TokenFilter tokenFilterValueOf = EZpvd().valueOf();
        if (tokenFilterValueOf != null && tokenFilterValueOf.gEmmrt()) {
            timeSelectionWidget.setVisibility(0);
            OLrzqt();
        }
        timeSelectionWidget.setCallback(new FragmentManager());
        timeSelectionWidget.setData(timeRangeFilter);
    }

    public final /* synthetic */ class FragmentManager implements kNB, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof kNB) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, jUM.this, jUM.class, "onTimeRangeChange", "onTimeRangeChange(Lcom/okinc/business/market/features/filter/domain/TimeRangeFilter;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.kNB
        public final void copydefault(TimeRangeFilter timeRangeFilter) {
            Intrinsics.checkNotNullParameter(timeRangeFilter, "");
            jUM.this.EZpvd(timeRangeFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(java.lang.String str) {
        AEQbTJ().OLrzqt(str);
    }

    public final void copydefault(PriceRangeFilter priceRangeFilter, boolean z) {
        AEQbTJ().copydefault(priceRangeFilter, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(TimeRangeFilter timeRangeFilter) {
        AEQbTJ().OLrzqt(timeRangeFilter);
    }

    public final void copydefault(java.util.List<java.lang.String> list) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new FilterBottomSheet$updateAddressFilter$1(this, list, null), 3, null);
        TokenFilter tokenFilterCopydefault = EZpvd().copydefault();
        if (EZpvd().isConnected().EZpvd().length() > 0) {
            C21847hOn.OLrzqt(EZpvd().isConnected().EZpvd(), tokenFilterCopydefault.isConnected(), EZpvd().values(), tokenFilterCopydefault.KWHzl(), EZpvd().EZpvd(), "apply");
        }
    }

    public static /* synthetic */ void notifyHost$default(jUM jum, TokenFilter tokenFilter, FilterAction filterAction, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            filterAction = null;
        }
        jum.OLrzqt(tokenFilter, filterAction);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(TokenFilter tokenFilter, FilterAction filterAction) {
        TokenFilter tokenFilter2;
        java.lang.Object next;
        jUZ juz;
        java.lang.Object next2;
        jUZ juz2;
        if (Intrinsics.EZpvd(tokenFilter, EZpvd().valueOf()) && EZpvd().OLrzqt()) {
            return;
        }
        gEmmrt().KWHzl(tokenFilter.OLrzqt((6143 & 1) != 0 ? tokenFilter.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilter.isConnected : null, (6143 & 4) != 0 ? tokenFilter.AkhnZx : null, (6143 & 8) != 0 ? tokenFilter.AhwBna : null, (6143 & 16) != 0 ? tokenFilter.KWHzl : null, (6143 & 32) != 0 ? tokenFilter.AYXKKw : false, (6143 & 64) != 0 ? tokenFilter.valueOf : false, (6143 & 128) != 0 ? tokenFilter.EZpvd : "", (6143 & 256) != 0 ? tokenFilter.gEmmrt : false, (6143 & 512) != 0 ? tokenFilter.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilter.copydefault : null, (6143 & 2048) != 0 ? tokenFilter.djBIcL : null, (6143 & 4096) != 0 ? tokenFilter.fetchVPNInfo : null), false);
        if (filterAction != null) {
            C31197lpV c31197lpV = C31197lpV.EZpvd;
            java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.Application.copydefault)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it.next();
                    if (((androidx.fragment.app.Fragment) next2) instanceof jUZ) {
                        break;
                    }
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next2;
            if (fragment == null) {
                KeyEventDispatcher.Component componentRequireActivity = requireActivity();
                if (!(componentRequireActivity instanceof jUZ)) {
                    componentRequireActivity = null;
                }
                juz2 = (jUZ) componentRequireActivity;
            } else {
                if (!(fragment instanceof jUZ)) {
                    fragment = null;
                }
                juz2 = (jUZ) fragment;
            }
            if (juz2 != null) {
                tokenFilter2 = tokenFilter;
                juz2.AEQbTJ(filterAction, tokenFilter2);
            } else {
                tokenFilter2 = tokenFilter;
            }
        }
        C31197lpV c31197lpV2 = C31197lpV.EZpvd;
        java.util.Iterator it2 = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.Application.copydefault)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((androidx.fragment.app.Fragment) next) instanceof jUZ) {
                    break;
                }
            }
        }
        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) next;
        if (fragment2 == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            juz = (jUZ) (fragmentActivityRequireActivity instanceof jUZ ? fragmentActivityRequireActivity : null);
        } else {
            juz = (jUZ) (fragment2 instanceof jUZ ? fragment2 : null);
        }
        if (juz != null) {
            juz.KWHzl(tokenFilter2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC28026kMd copydefault(TokenFilter tokenFilter) {
        C28040kMr c28040kMr;
        C28029kMg c28029kMg;
        C28034kMl c28034kMl;
        C28044kMv c28044kMv;
        C28024kMb c28024kMb;
        C28040kMr c28040kMr2;
        C28029kMg c28029kMg2;
        C28034kMl c28034kMl2;
        C28044kMv c28044kMv2;
        C28024kMb c28024kMb2;
        boolean z;
        AppCompatTextView appCompatTextView;
        C23461hyf c23461hyf;
        AppCompatTextView appCompatTextView2;
        C23461hyf c23461hyf2;
        AppCompatTextView appCompatTextView3;
        TimeSelectionWidget timeSelectionWidget;
        C28040kMr c28040kMr3;
        C28034kMl c28034kMl3;
        C28044kMv c28044kMv3;
        C28029kMg c28029kMg3;
        C28024kMb c28024kMb3;
        AppCompatTextView appCompatTextView4;
        C28040kMr c28040kMr4;
        C28029kMg c28029kMg4;
        C28034kMl c28034kMl4;
        C28044kMv c28044kMv4;
        C28024kMb c28024kMb4;
        C28040kMr c28040kMr5;
        C28029kMg c28029kMg5;
        C28034kMl c28034kMl5;
        C28044kMv c28044kMv5;
        C28024kMb c28024kMb5;
        java.lang.String strDbNXlk = tokenFilter != null ? tokenFilter.DbNXlk() : null;
        if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.MARKET_CAP.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.TURNOVER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.LIQUIDITY.getValue()))) {
            C23461hyf c23461hyf3 = this.AhwBna;
            if (c23461hyf3 != null && (c28024kMb = c23461hyf3.fetchVPNInfo) != null) {
                c28024kMb.setVisibility(8);
            }
            C23461hyf c23461hyf4 = this.AhwBna;
            if (c23461hyf4 != null && (c28044kMv = c23461hyf4.isConnected) != null) {
                c28044kMv.setVisibility(8);
            }
            C23461hyf c23461hyf5 = this.AhwBna;
            if (c23461hyf5 != null && (c28034kMl = c23461hyf5.valueOf) != null) {
                c28034kMl.setVisibility(8);
            }
            C23461hyf c23461hyf6 = this.AhwBna;
            if (c23461hyf6 != null && (c28029kMg = c23461hyf6.AhwBna) != null) {
                c28029kMg.setVisibility(8);
            }
            C23461hyf c23461hyf7 = this.AhwBna;
            if (c23461hyf7 != null && (c28040kMr = c23461hyf7.AkhnZx) != null) {
                c28040kMr.setVisibility(0);
            }
            C23461hyf c23461hyf8 = this.AhwBna;
            if (c23461hyf8 != null) {
                return c23461hyf8.AkhnZx;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.TIME_CREATE.getValue()))) {
            C23461hyf c23461hyf9 = this.AhwBna;
            if (c23461hyf9 != null && (c28024kMb5 = c23461hyf9.fetchVPNInfo) != null) {
                c28024kMb5.setVisibility(8);
            }
            C23461hyf c23461hyf10 = this.AhwBna;
            if (c23461hyf10 != null && (c28044kMv5 = c23461hyf10.isConnected) != null) {
                c28044kMv5.setVisibility(0);
            }
            C23461hyf c23461hyf11 = this.AhwBna;
            if (c23461hyf11 != null && (c28034kMl5 = c23461hyf11.valueOf) != null) {
                c28034kMl5.setVisibility(8);
            }
            C23461hyf c23461hyf12 = this.AhwBna;
            if (c23461hyf12 != null && (c28029kMg5 = c23461hyf12.AhwBna) != null) {
                c28029kMg5.setVisibility(8);
            }
            C23461hyf c23461hyf13 = this.AhwBna;
            if (c23461hyf13 != null && (c28040kMr5 = c23461hyf13.AkhnZx) != null) {
                c28040kMr5.setVisibility(8);
            }
            C23461hyf c23461hyf14 = this.AhwBna;
            if (c23461hyf14 != null) {
                return c23461hyf14.isConnected;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.TIME_VOLUME.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.CHANGE.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.UNIQUE_TRADER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.HOLDER.getValue())) || Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.TRANSACTION.getValue()))) {
            C23461hyf c23461hyf15 = this.AhwBna;
            if (c23461hyf15 != null && (c28024kMb2 = c23461hyf15.fetchVPNInfo) != null) {
                c28024kMb2.setVisibility(8);
            }
            C23461hyf c23461hyf16 = this.AhwBna;
            if (c23461hyf16 != null && (c28044kMv2 = c23461hyf16.isConnected) != null) {
                c28044kMv2.setVisibility(8);
            }
            C23461hyf c23461hyf17 = this.AhwBna;
            if (c23461hyf17 != null && (c28034kMl2 = c23461hyf17.valueOf) != null) {
                c28034kMl2.setVisibility(0);
            }
            C23461hyf c23461hyf18 = this.AhwBna;
            if (c23461hyf18 != null && (c28029kMg2 = c23461hyf18.AhwBna) != null) {
                c28029kMg2.setVisibility(8);
            }
            C23461hyf c23461hyf19 = this.AhwBna;
            if (c23461hyf19 != null && (c28040kMr2 = c23461hyf19.AkhnZx) != null) {
                c28040kMr2.setVisibility(8);
            }
            C23461hyf c23461hyf20 = this.AhwBna;
            if (c23461hyf20 != null) {
                return c23461hyf20.valueOf;
            }
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) java.lang.String.valueOf(RangeType.FDV.getValue()))) {
            C23461hyf c23461hyf21 = this.AhwBna;
            if (c23461hyf21 != null && (c28024kMb4 = c23461hyf21.fetchVPNInfo) != null) {
                c28024kMb4.setVisibility(8);
            }
            C23461hyf c23461hyf22 = this.AhwBna;
            if (c23461hyf22 != null && (c28044kMv4 = c23461hyf22.isConnected) != null) {
                c28044kMv4.setVisibility(8);
            }
            C23461hyf c23461hyf23 = this.AhwBna;
            if (c23461hyf23 != null && (c28034kMl4 = c23461hyf23.valueOf) != null) {
                c28034kMl4.setVisibility(8);
            }
            C23461hyf c23461hyf24 = this.AhwBna;
            if (c23461hyf24 != null && (c28029kMg4 = c23461hyf24.AhwBna) != null) {
                c28029kMg4.setVisibility(0);
            }
            C23461hyf c23461hyf25 = this.AhwBna;
            if (c23461hyf25 != null && (c28040kMr4 = c23461hyf25.AkhnZx) != null) {
                c28040kMr4.setVisibility(8);
            }
            C23461hyf c23461hyf26 = this.AhwBna;
            if (c23461hyf26 != null) {
                return c23461hyf26.AhwBna;
            }
            return null;
        }
        boolean zAuCTel = EZpvd().AuCTel();
        C23461hyf c23461hyf27 = this.AhwBna;
        if (c23461hyf27 != null && (appCompatTextView4 = c23461hyf27.copydefault) != null) {
            appCompatTextView4.setVisibility(zAuCTel ? 0 : 8);
        }
        if (tokenFilter != null) {
            z = tokenFilter.AEQbTJ();
        }
        C23461hyf c23461hyf28 = this.AhwBna;
        if (c23461hyf28 != null && (c28024kMb3 = c23461hyf28.fetchVPNInfo) != null) {
            c28024kMb3.setVisibility(z ^ true ? 0 : 8);
        }
        C23461hyf c23461hyf29 = this.AhwBna;
        if (c23461hyf29 != null && (c28029kMg3 = c23461hyf29.AhwBna) != null) {
            c28029kMg3.setVisibility(z ? 0 : 8);
        }
        C23461hyf c23461hyf30 = this.AhwBna;
        if (c23461hyf30 != null && (c28044kMv3 = c23461hyf30.isConnected) != null) {
            c28044kMv3.setVisibility(8);
        }
        C23461hyf c23461hyf31 = this.AhwBna;
        if (c23461hyf31 != null && (c28034kMl3 = c23461hyf31.valueOf) != null) {
            c28034kMl3.setVisibility(8);
        }
        C23461hyf c23461hyf32 = this.AhwBna;
        if (c23461hyf32 != null && (c28040kMr3 = c23461hyf32.AkhnZx) != null) {
            c28040kMr3.setVisibility(8);
        }
        C23461hyf c23461hyf33 = this.AhwBna;
        if (c23461hyf33 != null && (timeSelectionWidget = c23461hyf33.DbNXlk) != null) {
            timeSelectionWidget.setVisibility(zAuCTel ? 0 : 8);
        }
        if (EZpvd().ejfBZ() && (c23461hyf2 = this.AhwBna) != null && (appCompatTextView3 = c23461hyf2.gEmmrt) != null) {
            appCompatTextView3.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.ijmTNW));
        }
        if (zAuCTel && (c23461hyf = this.AhwBna) != null && (appCompatTextView2 = c23461hyf.gEmmrt) != null) {
            appCompatTextView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDcMfJK));
        }
        if (!z) {
            C23461hyf c23461hyf34 = this.AhwBna;
            if (c23461hyf34 != null) {
                return c23461hyf34.fetchVPNInfo;
            }
            return null;
        }
        C23461hyf c23461hyf35 = this.AhwBna;
        if (c23461hyf35 != null && (appCompatTextView = c23461hyf35.gEmmrt) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DsL));
        }
        C23461hyf c23461hyf36 = this.AhwBna;
        if (c23461hyf36 != null) {
            return c23461hyf36.AhwBna;
        }
        return null;
    }

    public final void OLrzqt() {
        LinearLayoutCompat linearLayoutCompat;
        AppCompatImageView appCompatImageView;
        C23461hyf c23461hyf = this.AhwBna;
        if (c23461hyf != null && (appCompatImageView = c23461hyf.OLrzqt) != null) {
            appCompatImageView.setVisibility(0);
        }
        C23461hyf c23461hyf2 = this.AhwBna;
        if (c23461hyf2 == null || (linearLayoutCompat = c23461hyf2.EZpvd) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(linearLayoutCompat, 0L, new Function1() { // from class: o.jUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jUM.OLrzqt(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(final jUM jum, android.view.View view) {
        boolean z;
        AppCompatTextView appCompatTextView;
        C28029kMg c28029kMg;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        C28029kMg c28029kMg2;
        Intrinsics.checkNotNullParameter(view, "");
        if (jum.AEQbTJ().AEQbTJ().getValue().EZpvd().AEQbTJ()) {
            C23461hyf c23461hyf = jum.AhwBna;
            z = false;
            if (c23461hyf != null && (c28029kMg2 = c23461hyf.AhwBna) != null) {
                c28029kMg2.EZpvd(false);
            }
            jum.AEQbTJ().OLrzqt(false);
            C23461hyf c23461hyf2 = jum.AhwBna;
            if (c23461hyf2 != null && (appCompatTextView3 = c23461hyf2.gEmmrt) != null) {
                appCompatTextView3.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DcMfJKDcMfJK));
            }
        } else {
            C23461hyf c23461hyf3 = jum.AhwBna;
            z = true;
            if (c23461hyf3 != null && (c28029kMg = c23461hyf3.AhwBna) != null) {
                c28029kMg.EZpvd(true);
            }
            jum.AEQbTJ().OLrzqt(true);
            C23461hyf c23461hyf4 = jum.AhwBna;
            if (c23461hyf4 != null && (appCompatTextView = c23461hyf4.gEmmrt) != null) {
                appCompatTextView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DsL));
            }
        }
        jum.AEQbTJ().OLrzqt(z);
        C23461hyf c23461hyf5 = jum.AhwBna;
        if (c23461hyf5 != null && (appCompatTextView2 = c23461hyf5.gEmmrt) != null) {
            appCompatTextView2.post(new java.lang.Runnable() { // from class: o.jUS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    jUM.fetchVPNInfo(this.AEQbTJ);
                }
            });
        }
        jum.KWHzl(jum.AEQbTJ().AEQbTJ().getValue().EZpvd());
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(jUM jum) {
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        C23461hyf c23461hyf = jum.AhwBna;
        if (c23461hyf != null && (appCompatTextView = c23461hyf.gEmmrt) != null) {
            appCompatTextView.requestLayout();
        }
        C23461hyf c23461hyf2 = jum.AhwBna;
        if (c23461hyf2 == null || (appCompatImageView = c23461hyf2.OLrzqt) == null) {
            return;
        }
        appCompatImageView.requestLayout();
    }

    private final void djBIcL() {
        if (EZpvd().isConnected().copydefault().AEQbTJ().length() == 0) {
            return;
        }
        final CommonTrackData commonTrackDataCopydefault = EZpvd().isConnected().copydefault();
        C32866mlf.onEvent$default(commonTrackDataCopydefault.AEQbTJ(), (TrackChannel[]) null, new Function1() { // from class: o.jUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jUM.OLrzqt(commonTrackDataCopydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(CommonTrackData commonTrackData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, commonTrackData.EZpvd(), commonTrackData.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jUM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final jUM KWHzl(@NotNull FilterBottomSheetParams filterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(filterBottomSheetParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.filterBottomSheetParams", filterBottomSheetParams);
            jUM jum = new jUM();
            jum.setArguments(bundle);
            return jum;
        }
    }
}
