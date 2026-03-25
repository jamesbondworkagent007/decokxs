package o;

import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
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
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.RankTypeFilter;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetParams;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* JADX INFO: renamed from: o.kqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29260kqL extends AbstractC29256kqH {
    public C21626hGi djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public TabLayoutMediator valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;
    public static boolean AYXKKw = true;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C29260kqL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrendingFilterBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.kqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29260kqL.AEQbTJ(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.kqL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kqL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29260kqL OLrzqt(@NotNull TrendingFilterBottomSheetParams trendingFilterBottomSheetParams) {
            Intrinsics.checkNotNullParameter(trendingFilterBottomSheetParams, "");
            C29260kqL c29260kqL = new C29260kqL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.trending_filter_params", trendingFilterBottomSheetParams);
            c29260kqL.setArguments(bundle);
            return c29260kqL;
        }
    }

    public final TrendingFilterBottomSheetParams AYXKKw() {
        TrendingFilterBottomSheetParams trendingFilterBottomSheetParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (trendingFilterBottomSheetParams = (TrendingFilterBottomSheetParams) BundleCompat.getParcelable(arguments, "key.trending_filter_params", TrendingFilterBottomSheetParams.class)) == null) ? new TrendingFilterBottomSheetParams(null, null, null, null, null, null, null, 127, null) : trendingFilterBottomSheetParams;
    }

    public final TrendingFilterBottomSheetViewModel djBIcL() {
        return (TrendingFilterBottomSheetViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kqH.KWHzl()V */
    public final C29329krb KWHzl() {
        return (C29329krb) this.gEmmrt.getValue();
    }

    public static final C29329krb AEQbTJ(C29260kqL c29260kqL) {
        return new C29329krb(c29260kqL);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL().AEQbTJ(AYXKKw());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C23274hvD.Fragment.copydefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setContentDescription("web3_dex_scanner_filter_title_view");
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = C21626hGi.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        valueOf();
        AhwBna();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().EZpvd(), null, new FragmentManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.kqL$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29264kqP c29264kqP, Continuation<? super Unit> continuation) {
            ConstraintLayout constraintLayout;
            Sequence<android.view.View> children;
            C54946xaf binding = C29260kqL.this.getBinding();
            android.view.View view = (binding == null || (constraintLayout = binding.OLrzqt) == null || (children = ViewGroupKt.getChildren(constraintLayout)) == null) ? null : (android.view.View) C59467zhb.zLjUOn(children);
            wYF wyf = view instanceof wYF ? (wYF) view : null;
            if (wyf == null) {
                return Unit.INSTANCE;
            }
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(C29260kqL.this.OLrzqt(c29264kqP));
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean OLrzqt(C29264kqP c29264kqP) {
        java.util.List<InterfaceC28823khz.ActionBar> listAEQbTJ = c29264kqP.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAEQbTJ) {
            if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        C29259kqK c29259kqKCopydefault = c29264kqP.copydefault();
        return c29259kqKCopydefault.AEQbTJ() && c29259kqKCopydefault.OLrzqt() && c29259kqKCopydefault.copydefault();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
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
            c52794wYpCopydefault2.setContentDescription("web3_dex_scanner_filter_apply_btn");
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new StateListAnimator(c52794wYpCopydefault3, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new Activity(c52794wYpAEQbTJ3, 1000L, this));
        }
    }

    public final InterfaceC29270kqV gEmmrt() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC29270kqV) {
            return (InterfaceC29270kqV) parentFragment;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View, androidx.appcompat.widget.LinearLayoutCompat] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final void valueOf() {
        C21626hGi c21626hGi = this.djBIcL;
        if (c21626hGi != null) {
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) djBIcL().EZpvd().getValue().OLrzqt(), 4);
            java.lang.String strKWHzl = djBIcL().EZpvd().getValue().KWHzl();
            if (listAhwBna.isEmpty()) {
                return;
            }
            c21626hGi.KWHzl.removeAllViews();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C23274hvD.ActionBar.AEQbTJ);
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C23274hvD.ActionBar.dxcTrN);
            ?? r9 = 0;
            int i = 0;
            for (java.lang.Object obj : listAhwBna) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                RankTypeFilter rankTypeFilter = (RankTypeFilter) obj;
                C21555hDs c21555hDsAEQbTJ = C21555hDs.AEQbTJ(getLayoutInflater(), c21626hGi.KWHzl, r9);
                Intrinsics.checkNotNullExpressionValue(c21555hDsAEQbTJ, "");
                ?? root = c21555hDsAEQbTJ.getRoot();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(r9, -2, 1.0f);
                if (i > 0) {
                    layoutParams.setMarginStart(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                }
                root.setLayoutParams(layoutParams);
                c21555hDsAEQbTJ.KWHzl.setText(rankTypeFilter.KWHzl());
                c21555hDsAEQbTJ.AEQbTJ.setBackground(Intrinsics.EZpvd((java.lang.Object) rankTypeFilter.EZpvd(), (java.lang.Object) strKWHzl) ? drawableKWHzl : drawableKWHzl2);
                LinearLayoutCompat linearLayoutCompat = c21555hDsAEQbTJ.AEQbTJ;
                linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, arrayList, c21555hDsAEQbTJ, drawableKWHzl, this, rankTypeFilter, drawableKWHzl2));
                c21626hGi.KWHzl.addView(c21555hDsAEQbTJ.getRoot());
                arrayList.add(c21555hDsAEQbTJ);
                i++;
                r9 = r9 == true ? 1 : 0;
            }
        }
    }

    /* JADX INFO: renamed from: o.kqL$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29260kqL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C29260kqL c29260kqL) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c29260kqL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC29270kqV interfaceC29270kqVGEmmrt = this.OLrzqt.gEmmrt();
                if (interfaceC29270kqVGEmmrt != null) {
                    interfaceC29270kqVGEmmrt.KWHzl(null);
                }
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.kqL$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ RankTypeFilter EZpvd;
        public final /* synthetic */ android.graphics.drawable.Drawable KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C21555hDs copydefault;
        public final /* synthetic */ java.util.List gEmmrt;
        public final /* synthetic */ C29260kqL valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, java.util.List list, C21555hDs c21555hDs, android.graphics.drawable.Drawable drawable, C29260kqL c29260kqL, RankTypeFilter rankTypeFilter, android.graphics.drawable.Drawable drawable2) {
            this.OLrzqt = view;
            this.AYXKKw = j;
            this.gEmmrt = list;
            this.copydefault = c21555hDs;
            this.KWHzl = drawable;
            this.valueOf = c29260kqL;
            this.EZpvd = rankTypeFilter;
            this.AEQbTJ = drawable2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AYXKKw || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.util.Iterator it = this.gEmmrt.iterator();
                while (it.hasNext()) {
                    ((C21555hDs) it.next()).AEQbTJ.setBackground(this.AEQbTJ);
                }
                this.copydefault.AEQbTJ.setBackground(this.KWHzl);
                this.valueOf.djBIcL().AEQbTJ(this.EZpvd.EZpvd());
            }
        }
    }

    /* JADX INFO: renamed from: o.kqL$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C29260kqL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29260kqL c29260kqL) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c29260kqL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC29270kqV interfaceC29270kqVGEmmrt = this.copydefault.gEmmrt();
                if (interfaceC29270kqVGEmmrt != null) {
                    interfaceC29270kqVGEmmrt.KWHzl(this.copydefault.djBIcL().EZpvd().getValue());
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    private final void AhwBna() {
        final java.util.ArrayList arrayListCopydefault = yDY.copydefault(getString(C23274hvD.Fragment.gZKUVK), getString(C23274hvD.Fragment.onProviderDisabled));
        C21626hGi c21626hGi = this.djBIcL;
        if (c21626hGi != null) {
            c21626hGi.EZpvd.setAdapter(KWHzl());
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c21626hGi.copydefault.copydefault(), c21626hGi.EZpvd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kqN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C29260kqL.EZpvd(arrayListCopydefault, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.valueOf = tabLayoutMediator;
            C55254xgV c55254xgV = c21626hGi.copydefault;
            if (!AYXKKw && arrayListCopydefault.size() >= 1) {
                c21626hGi.EZpvd.setCurrentItem(1, false);
            }
            c55254xgV.setFadingEdgeLength(0);
            android.view.View viewFindViewById = c55254xgV.findViewById(C52761wXj.FragmentManager.hrjNmC);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            android.view.View viewFindViewById2 = c55254xgV.findViewById(C52761wXj.FragmentManager.AxsJAYaxsJAY);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            c55254xgV.AEQbTJ(new ActionBar());
        }
    }

    public static final void EZpvd(java.util.ArrayList arrayList, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText((java.lang.CharSequence) arrayList.get(i));
        tab.view.setContentDescription(i == 1 ? "web3_dex_scanner_filter_tab_metrics" : "");
    }

    /* JADX INFO: renamed from: o.kqL$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TaskDescription taskDescription = C29260kqL.Companion;
            C29260kqL.AYXKKw = tab != null && tab.getPosition() == 0;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
        TabLayoutMediator tabLayoutMediator = this.valueOf;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.valueOf = null;
    }
}
