package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams;
import com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheetViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28823khz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29597kwe extends AbstractC29536kvW {
    public final InterfaceC56387yDm AYXKKw;
    public TabLayoutMediator djBIcL;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kwf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29597kwe.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public hEY values;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C29597kwe() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C29597kwe.AYXKKw(this.KWHzl));
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29597kwe.AhwBna(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.kwe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kwe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C29597kwe AEQbTJ(@NotNull SignalFilterBottomSheetParams signalFilterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(signalFilterBottomSheetParams, "");
            C29597kwe c29597kwe = new C29597kwe();
            c29597kwe.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.signal_filter_params", signalFilterBottomSheetParams)));
            return c29597kwe;
        }
    }

    public final SignalFilterBottomSheetParams AYXKKw() {
        return (SignalFilterBottomSheetParams) this.gEmmrt.getValue();
    }

    public static final SignalFilterBottomSheetParams valueOf(C29597kwe c29597kwe) {
        SignalFilterBottomSheetParams signalFilterBottomSheetParams;
        android.os.Bundle arguments = c29597kwe.getArguments();
        return (arguments == null || (signalFilterBottomSheetParams = (SignalFilterBottomSheetParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.signal_filter_params", SignalFilterBottomSheetParams.class))) == null) ? new SignalFilterBottomSheetParams(null, null, null, 7, null) : signalFilterBottomSheetParams;
    }

    public final SignalFilterBottomSheetViewModel AhwBna() {
        return (SignalFilterBottomSheetViewModel) this.isConnected.getValue();
    }

    public static final boolean AYXKKw(C29597kwe c29597kwe) {
        return c29597kwe.AYXKKw().KWHzl().size() > 2;
    }

    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    /* JADX DEBUG: Possible override for method o.kvW.EZpvd()V */
    public final C29609kwq EZpvd() {
        return (C29609kwq) this.AYXKKw.getValue();
    }

    public static final C29609kwq AhwBna(C29597kwe c29597kwe) {
        return new C29609kwq(c29597kwe, c29597kwe.gEmmrt());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna().KWHzl(AYXKKw());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.iRxXKY));
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.values = hEY.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        valueOf();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().copydefault(), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.kwe$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29601kwi c29601kwi, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            if (c29601kwi != null) {
                C54946xaf binding = C29597kwe.this.getBinding();
                android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
                wYF wyf = view instanceof wYF ? (wYF) view : null;
                if (wyf == null) {
                    return Unit.INSTANCE;
                }
                C52794wYp c52794wYpCopydefault = wyf.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(C29597kwe.this.KWHzl(c29601kwi));
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean KWHzl(C29601kwi c29601kwi) {
        java.util.List<InterfaceC28823khz.ActionBar> listOLrzqt = c29601kwi.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        C29537kvX c29537kvXCopydefault = c29601kwi.copydefault();
        return c29537kvXCopydefault.AEQbTJ() && c29537kvXCopydefault.isConnected() && c29537kvXCopydefault.EZpvd() && c29537kvXCopydefault.AhwBna() && c29537kvXCopydefault.copydefault() && c29537kvXCopydefault.valueOf() && c29537kvXCopydefault.AYXKKw() && c29537kvXCopydefault.djBIcL() && c29537kvXCopydefault.gEmmrt() && c29537kvXCopydefault.OLrzqt() && c29537kvXCopydefault.KWHzl();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.OLrzqt(C23274hvD.Fragment.dpErvT, requireContext()));
        wyf.setSecondaryText(C33070mpX.OLrzqt(C23274hvD.Fragment.hDKMBd, requireContext()));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new ActionBar(c52794wYpAEQbTJ3, 1000L, this));
        }
    }

    public final InterfaceC29606kwn djBIcL() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC29606kwn) {
            return (InterfaceC29606kwn) parentFragment;
        }
        return null;
    }

    private final void valueOf() {
        hEY hey = this.values;
        if (hey != null) {
            hey.AEQbTJ.setAdapter(EZpvd());
            hey.AEQbTJ.setOffscreenPageLimit(1);
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            if (gEmmrt()) {
                java.lang.String string = getString(C23274hvD.Fragment.hUfVAv);
                Intrinsics.checkNotNullExpressionValue(string, "");
                listOLrzqt.add(string);
            }
            java.lang.String string2 = getString(C23274hvD.Fragment.iZzfmt);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            listOLrzqt.add(string2);
            java.lang.String string3 = getString(C23274hvD.Fragment.gkJEwt);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            listOLrzqt.add(string3);
            final java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(hey.KWHzl.copydefault(), hey.AEQbTJ, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kwh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C29597kwe.AEQbTJ(listFARcdN, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.djBIcL = tabLayoutMediator;
            hey.KWHzl.setFadingEdgeLength(0);
            C55254xgV c55254xgV = hey.KWHzl;
            android.view.View viewFindViewById = c55254xgV.findViewById(C52761wXj.FragmentManager.hrjNmC);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            android.view.View viewFindViewById2 = c55254xgV.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
        }
    }

    public static final void AEQbTJ(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText((java.lang.CharSequence) list.get(i));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.values = null;
        TabLayoutMediator tabLayoutMediator = this.djBIcL;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.djBIcL = null;
    }

    /* JADX INFO: renamed from: o.kwe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29597kwe EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29597kwe c29597kwe) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c29597kwe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC29606kwn interfaceC29606kwnDjBIcL = this.EZpvd.djBIcL();
                if (interfaceC29606kwnDjBIcL != null) {
                    interfaceC29606kwnDjBIcL.AEQbTJ(null);
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.kwe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C29597kwe AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29597kwe c29597kwe) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c29597kwe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC29606kwn interfaceC29606kwnDjBIcL = this.AEQbTJ.djBIcL();
                if (interfaceC29606kwnDjBIcL != null) {
                    interfaceC29606kwnDjBIcL.AEQbTJ(this.AEQbTJ.AhwBna().copydefault().getValue());
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
