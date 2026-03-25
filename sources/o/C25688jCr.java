package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.chip.ChipGroup;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$observerData$1;
import com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterViewModel;
import com.okinc.business.market.widget.chart.RankingFilterEditView;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25688jCr extends AbstractC25687jCq {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public wYF AhwBna;
    public java.lang.String AkhnZx;
    public Function1<? super LeaderBoardFilterModel, Unit> djBIcL;
    public C21562hDz isConnected;
    public LeaderBoardFilterModel valueOf;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 80.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C25688jCr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LeaderBoardFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.filter.LeaderBoardFilterBottomSheet$special$$inlined$viewModels$default$5
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
        this.AkhnZx = "";
    }

    public final LeaderBoardFilterViewModel AhwBna() {
        return (LeaderBoardFilterViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.jCr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C25688jCr newInstance$default(Application application, LeaderBoardFilterModel leaderBoardFilterModel, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                leaderBoardFilterModel = null;
            }
            return application.AEQbTJ(leaderBoardFilterModel, function1);
        }

        public final C25688jCr AEQbTJ(LeaderBoardFilterModel leaderBoardFilterModel, @NotNull Function1<? super LeaderBoardFilterModel, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            C25688jCr c25688jCr = new C25688jCr();
            if (leaderBoardFilterModel != null) {
                c25688jCr.valueOf = leaderBoardFilterModel;
            }
            c25688jCr.djBIcL = function1;
            return c25688jCr;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.QCjLjM));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        RankingFilterEditView rankingFilterEditView;
        C55001xbh c55001xbhKWHzl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.isConnected = C21562hDz.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        AYXKKw();
        AhwBna().copydefault();
        valueOf();
        DbNXlk();
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz == null || (rankingFilterEditView = c21562hDz.copydefault) == null || (c55001xbhKWHzl = rankingFilterEditView.KWHzl()) == null) {
            return;
        }
        c55001xbhKWHzl.setContentDescription("web3_dex_market_ranking_filter_advanced_bottomsheet_input");
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        NestedScrollView root;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C29408ktA.KWHzl.AEQbTJ(true);
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null && (root = c21562hDz.getRoot()) != null) {
            root.setContentDescription("web3_dex_market_ranking_filter_advanced_bottomsheet");
        }
        LeaderBoardFilterModel leaderBoardFilterModel = this.valueOf;
        if (leaderBoardFilterModel != null) {
            EZpvd(leaderBoardFilterModel);
        }
    }

    private final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LeaderBoardFilterBottomSheet$observerData$1(this, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            ConstraintLayout constraintLayout = c21562hDz.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z ? 0 : 8);
            android.widget.TextView textView = c21562hDz.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z ? 0 : 8);
        }
    }

    public final void EZpvd(LeaderBoardFilterModel leaderBoardFilterModel) {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            RankingFilterEditView rankingFilterEditView = c21562hDz.copydefault;
            java.lang.String strAEQbTJ = leaderBoardFilterModel.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            rankingFilterEditView.setMaxValue(strAEQbTJ);
            RankingFilterEditView rankingFilterEditView2 = c21562hDz.copydefault;
            java.lang.String strOLrzqt = leaderBoardFilterModel.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            rankingFilterEditView2.setMinValue(strOLrzqt);
            RankingFilterEditView rankingFilterEditView3 = c21562hDz.isConnected;
            java.lang.String strValueOf = leaderBoardFilterModel.valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            rankingFilterEditView3.setMaxValue(strValueOf);
            RankingFilterEditView rankingFilterEditView4 = c21562hDz.isConnected;
            java.lang.String strAhwBna = leaderBoardFilterModel.AhwBna();
            if (strAhwBna == null) {
                strAhwBna = "";
            }
            rankingFilterEditView4.setMinValue(strAhwBna);
            RankingFilterEditView rankingFilterEditView5 = c21562hDz.valueOf;
            java.lang.String strAYXKKw = leaderBoardFilterModel.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            rankingFilterEditView5.setMaxValue(strAYXKKw);
            RankingFilterEditView rankingFilterEditView6 = c21562hDz.valueOf;
            java.lang.String strDjBIcL = leaderBoardFilterModel.djBIcL();
            rankingFilterEditView6.setMinValue(strDjBIcL != null ? strDjBIcL : "");
        }
        copydefault(leaderBoardFilterModel.copydefault(), leaderBoardFilterModel.gEmmrt());
    }

    public final void copydefault(java.util.List<MarketChainBean> list, java.lang.String str) {
        C21562hDz c21562hDz;
        if (list == null || list.isEmpty() || (c21562hDz = this.isConnected) == null) {
            return;
        }
        C28055kNf c28055kNf = c21562hDz.djBIcL;
        c28055kNf.setSpanCount(2);
        c28055kNf.setCallback(new StateListAnimator());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketChainBean marketChainBean : list) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(c28055kNf.getContext(), C52761wXj.LoaderManager.zuBGHE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) marketChainBean.getChainName());
            spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
            arrayList.add(new C28060kNk(marketChainBean.getChainId(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
        }
        c28055kNf.setData(arrayList, str);
    }

    /* JADX INFO: renamed from: o.jCr$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
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
            return new FunctionReferenceImpl(1, C25688jCr.this, C25688jCr.class, "onNetworkChange", "onNetworkChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C25688jCr.this.OLrzqt(str);
        }
    }

    /* JADX INFO: renamed from: o.jCr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25688jCr OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25688jCr c25688jCr) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c25688jCr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.OLrzqt.AkhnZx)) {
                    this.OLrzqt.AhwBna().EZpvd(this.OLrzqt.AkhnZx);
                    this.OLrzqt.AEQbTJ(false);
                    return;
                }
                this.OLrzqt.AEQbTJ(true);
                Function1 function1 = this.OLrzqt.djBIcL;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt.OLrzqt());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jCr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C25688jCr AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25688jCr c25688jCr) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c25688jCr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) throws java.io.IOException {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                LeaderBoardFilterModel leaderBoardFilterModelOLrzqt = this.AEQbTJ.OLrzqt();
                if (leaderBoardFilterModelOLrzqt != null) {
                    jBN.copydefault.KWHzl(leaderBoardFilterModelOLrzqt);
                    Function1 function1 = this.AEQbTJ.djBIcL;
                    if (function1 != null) {
                        function1.invoke(leaderBoardFilterModelOLrzqt);
                    }
                    this.AEQbTJ.AEQbTJ(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jCr$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C21562hDz EZpvd;
        public final /* synthetic */ C25688jCr KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C21562hDz c21562hDz, C25688jCr c25688jCr) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c21562hDz;
            this.KWHzl = c25688jCr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ChipGroup chipGroup = this.EZpvd.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(chipGroup, "");
                if (chipGroup.getChildCount() >= 8) {
                    C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.fdOvFl), C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
                } else {
                    jCA.Companion.copydefault(this.KWHzl.AkhnZx, this.KWHzl.new Fragment(this.EZpvd)).show(this.KWHzl.getParentFragmentManager(), "javaClass");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jCr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Ref.ObjectRef EZpvd;
        public final /* synthetic */ C54984xbQ KWHzl;
        public final /* synthetic */ LeaderBoardFilterModel OLrzqt;
        public final /* synthetic */ android.view.View copydefault;
        public final /* synthetic */ C25688jCr gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25688jCr c25688jCr, LeaderBoardFilterModel leaderBoardFilterModel, Ref.ObjectRef objectRef, C54984xbQ c54984xbQ) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.gEmmrt = c25688jCr;
            this.OLrzqt = leaderBoardFilterModel;
            this.EZpvd = objectRef;
            this.KWHzl = c54984xbQ;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, o.xbQ] */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.gEmmrt.AhwBna().OLrzqt(this.OLrzqt.KWHzl());
                C54984xbQ c54984xbQ = (C54984xbQ) this.EZpvd.element;
                if (c54984xbQ != null) {
                    c54984xbQ.setBackgroundResource(C23274hvD.ActionBar.dxcTrN);
                }
                this.KWHzl.setBackgroundResource(C23274hvD.ActionBar.AEQbTJ);
                this.EZpvd.element = this.KWHzl;
                this.gEmmrt.AkhnZx = this.OLrzqt.KWHzl();
                this.gEmmrt.djBIcL();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        LeaderBoardFilterModel leaderBoardFilterModelOLrzqt;
        LeaderBoardFilterModel leaderBoardFilterModel = this.valueOf;
        if (leaderBoardFilterModel != null) {
            leaderBoardFilterModelOLrzqt = leaderBoardFilterModel.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel.OLrzqt : null, (1022 & 2) != 0 ? leaderBoardFilterModel.AEQbTJ : null, (1022 & 4) != 0 ? leaderBoardFilterModel.EZpvd : null, (1022 & 8) != 0 ? leaderBoardFilterModel.valueOf : str, (1022 & 16) != 0 ? leaderBoardFilterModel.KWHzl : null, (1022 & 32) != 0 ? leaderBoardFilterModel.copydefault : null, (1022 & 64) != 0 ? leaderBoardFilterModel.AYXKKw : null, (1022 & 128) != 0 ? leaderBoardFilterModel.djBIcL : null, (1022 & 256) != 0 ? leaderBoardFilterModel.AhwBna : null, (1022 & 512) != 0 ? leaderBoardFilterModel.gEmmrt : null);
        } else {
            leaderBoardFilterModelOLrzqt = null;
        }
        this.valueOf = leaderBoardFilterModelOLrzqt;
        changeButtonStates$default(this, false, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.util.List<LeaderBoardFilterModel> list) {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            c21562hDz.gEmmrt.removeAllViews();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                LeaderBoardFilterModel leaderBoardFilterModel = (LeaderBoardFilterModel) obj;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C54984xbQ c54984xbQ = new C54984xbQ(contextRequireContext, null, 0, 6, null);
                c54984xbQ.setTitle(leaderBoardFilterModel.EZpvd());
                c54984xbQ.setStyle(2);
                c54984xbQ.setId(i);
                c21562hDz.gEmmrt.addView(c54984xbQ);
                c54984xbQ.setOnClickListener(new TaskDescription(c54984xbQ, 1000L, this, leaderBoardFilterModel, objectRef, c54984xbQ));
                i++;
            }
        }
    }

    private final void DbNXlk() {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            android.widget.TextView textView = c21562hDz.AhwBna;
            textView.setOnClickListener(new FragmentManager(textView, 1000L, c21562hDz, this));
        }
    }

    /* JADX INFO: renamed from: o.jCr$Fragment */
    public static final class Fragment implements Function2<java.lang.String, java.lang.String, Unit> {
        public final /* synthetic */ C21562hDz AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(C21562hDz c21562hDz) {
            this.AEQbTJ = c21562hDz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.String str2) throws java.io.IOException {
            copydefault(str, str2);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str, java.lang.String str2) throws java.io.IOException {
            LeaderBoardFilterModel leaderBoardFilterModel;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) || (leaderBoardFilterModel = C25688jCr.this.valueOf) == null) {
                return;
            }
            C21562hDz c21562hDz = this.AEQbTJ;
            C25688jCr c25688jCr = C25688jCr.this;
            c25688jCr.AhwBna().KWHzl(leaderBoardFilterModel.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel.OLrzqt : null, (1022 & 2) != 0 ? leaderBoardFilterModel.AEQbTJ : str2, (1022 & 4) != 0 ? leaderBoardFilterModel.EZpvd : null, (1022 & 8) != 0 ? leaderBoardFilterModel.valueOf : null, (1022 & 16) != 0 ? leaderBoardFilterModel.KWHzl : c21562hDz.copydefault.copydefault(), (1022 & 32) != 0 ? leaderBoardFilterModel.copydefault : c21562hDz.copydefault.OLrzqt(), (1022 & 64) != 0 ? leaderBoardFilterModel.AYXKKw : c21562hDz.isConnected.copydefault(), (1022 & 128) != 0 ? leaderBoardFilterModel.djBIcL : c21562hDz.isConnected.OLrzqt(), (1022 & 256) != 0 ? leaderBoardFilterModel.AhwBna : c21562hDz.valueOf.copydefault(), (1022 & 512) != 0 ? leaderBoardFilterModel.gEmmrt : c21562hDz.valueOf.OLrzqt()));
            c25688jCr.AEQbTJ(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            c21562hDz.copydefault.setFilterTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.sQOHWT));
            c21562hDz.isConnected.setFilterTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.zuWLRA));
            c21562hDz.valueOf.setFilterTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.USBtdM));
            RankingFilterEditView rankingFilterEditView = c21562hDz.copydefault;
            RankingFilterEditView.InputSymbol inputSymbol = RankingFilterEditView.InputSymbol.Percentage;
            rankingFilterEditView.setHintSymbolMode(inputSymbol);
            c21562hDz.isConnected.setHintSymbolMode(inputSymbol);
            c21562hDz.valueOf.setHintSymbolMode(RankingFilterEditView.InputSymbol.NoSymbol);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        C52794wYp c52794wYpAEQbTJ;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.dpErvT));
        this.AhwBna = wyf;
        changeButtonStates$default(this, false, true, 1, null);
        djBIcL();
        wYF wyf2 = this.AhwBna;
        if (wyf2 != null && (c52794wYpAEQbTJ = wyf2.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
    }

    public final void AEQbTJ(boolean z) {
        java.util.List<MarketChainBean> listCopydefault;
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            LeaderBoardFilterModel leaderBoardFilterModel = this.valueOf;
            LeaderBoardFilterModel leaderBoardFilterModelOLrzqt = null;
            MarketChainBean marketChainBean = (leaderBoardFilterModel == null || (listCopydefault = leaderBoardFilterModel.copydefault()) == null) ? null : (MarketChainBean) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault);
            if (marketChainBean != null) {
                LeaderBoardFilterModel leaderBoardFilterModel2 = this.valueOf;
                if (leaderBoardFilterModel2 != null) {
                    leaderBoardFilterModelOLrzqt = leaderBoardFilterModel2.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel2.OLrzqt : null, (1022 & 2) != 0 ? leaderBoardFilterModel2.AEQbTJ : null, (1022 & 4) != 0 ? leaderBoardFilterModel2.EZpvd : null, (1022 & 8) != 0 ? leaderBoardFilterModel2.valueOf : marketChainBean.getChainId(), (1022 & 16) != 0 ? leaderBoardFilterModel2.KWHzl : null, (1022 & 32) != 0 ? leaderBoardFilterModel2.copydefault : null, (1022 & 64) != 0 ? leaderBoardFilterModel2.AYXKKw : null, (1022 & 128) != 0 ? leaderBoardFilterModel2.djBIcL : null, (1022 & 256) != 0 ? leaderBoardFilterModel2.AhwBna : null, (1022 & 512) != 0 ? leaderBoardFilterModel2.gEmmrt : null);
                }
                this.valueOf = leaderBoardFilterModelOLrzqt;
                if (leaderBoardFilterModelOLrzqt != null) {
                    copydefault(leaderBoardFilterModelOLrzqt.copydefault(), leaderBoardFilterModelOLrzqt.gEmmrt());
                }
            }
            c21562hDz.copydefault.EZpvd();
            c21562hDz.isConnected.EZpvd();
            c21562hDz.valueOf.EZpvd();
            this.AkhnZx = "";
            djBIcL();
            if (z) {
                dismiss();
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.jCq.OLrzqt()V */
    public final LeaderBoardFilterModel OLrzqt() throws java.io.IOException {
        LeaderBoardFilterModel leaderBoardFilterModel;
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz == null || (leaderBoardFilterModel = this.valueOf) == null) {
            return null;
        }
        java.lang.String strOLrzqt = c21562hDz.copydefault.OLrzqt();
        return leaderBoardFilterModel.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel.OLrzqt : null, (1022 & 2) != 0 ? leaderBoardFilterModel.AEQbTJ : null, (1022 & 4) != 0 ? leaderBoardFilterModel.EZpvd : null, (1022 & 8) != 0 ? leaderBoardFilterModel.valueOf : null, (1022 & 16) != 0 ? leaderBoardFilterModel.KWHzl : c21562hDz.copydefault.copydefault(), (1022 & 32) != 0 ? leaderBoardFilterModel.copydefault : strOLrzqt, (1022 & 64) != 0 ? leaderBoardFilterModel.AYXKKw : c21562hDz.isConnected.copydefault(), (1022 & 128) != 0 ? leaderBoardFilterModel.djBIcL : c21562hDz.isConnected.OLrzqt(), (1022 & 256) != 0 ? leaderBoardFilterModel.AhwBna : c21562hDz.valueOf.copydefault(), (1022 & 512) != 0 ? leaderBoardFilterModel.gEmmrt : c21562hDz.valueOf.OLrzqt());
    }

    public final void djBIcL() {
        java.lang.String strAYXKKw;
        wYF wyf = this.AhwBna;
        if (wyf != null) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.AkhnZx)) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fIwbmz);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd);
            }
            wyf.setSecondaryText(strAYXKKw);
        }
    }

    public static /* synthetic */ void changeButtonStates$default(C25688jCr c25688jCr, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c25688jCr.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpCopydefault2;
        C52794wYp c52794wYpAEQbTJ;
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            wYF wyf = this.AhwBna;
            if (wyf != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
                c52794wYpAEQbTJ.setEnabled(!gEmmrt());
            }
            if (gEmmrt()) {
                wYF wyf2 = this.AhwBna;
                if (wyf2 != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
                    c52794wYpCopydefault2.setEnabled(!z2);
                }
                c21562hDz.AhwBna.setEnabled(false);
                c21562hDz.AhwBna.setAlpha(0.3f);
                return;
            }
            wYF wyf3 = this.AhwBna;
            if (wyf3 != null && (c52794wYpCopydefault = wyf3.copydefault()) != null) {
                c52794wYpCopydefault.setEnabled(!z);
            }
            c21562hDz.AhwBna.setEnabled(!z);
            c21562hDz.AhwBna.setAlpha(z ? 0.3f : 1.0f);
        }
    }

    public final boolean gEmmrt() {
        LeaderBoardFilterModel leaderBoardFilterModel = this.valueOf;
        boolean zAkhnZx = leaderBoardFilterModel != null ? leaderBoardFilterModel.AkhnZx() : true;
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            return zAkhnZx && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.copydefault.copydefault()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.copydefault.OLrzqt()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.isConnected.copydefault()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.isConnected.OLrzqt()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.valueOf.copydefault()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c21562hDz.valueOf.OLrzqt());
        }
        return false;
    }

    public final void valueOf() {
        C21562hDz c21562hDz = this.isConnected;
        if (c21562hDz != null) {
            final java.util.List<RankingFilterEditView> listGEmmrt = yDY.gEmmrt(c21562hDz.copydefault, c21562hDz.isConnected, c21562hDz.valueOf);
            for (final RankingFilterEditView rankingFilterEditView : listGEmmrt) {
                rankingFilterEditView.setSaveTextEnableListener(new Function0() { // from class: o.jCp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C25688jCr.EZpvd(listGEmmrt, this);
                    }
                });
                rankingFilterEditView.KWHzl().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jCs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        C25688jCr.copydefault(rankingFilterEditView, view, z);
                    }
                });
                rankingFilterEditView.AEQbTJ().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jCv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        C25688jCr.AEQbTJ(rankingFilterEditView, view, z);
                    }
                });
            }
        }
    }

    public static final void copydefault(RankingFilterEditView rankingFilterEditView, android.view.View view, boolean z) {
        Intrinsics.copydefault(rankingFilterEditView);
        rankingFilterEditView.AEQbTJ(rankingFilterEditView, z, true);
    }

    public static final void AEQbTJ(RankingFilterEditView rankingFilterEditView, android.view.View view, boolean z) {
        Intrinsics.copydefault(rankingFilterEditView);
        rankingFilterEditView.AEQbTJ(rankingFilterEditView, z, false);
    }

    public static final Unit EZpvd(java.util.List list, C25688jCr c25688jCr) {
        boolean z;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                z = true;
                if (!((RankingFilterEditView) it.next()).AhwBna()) {
                    break;
                }
            }
            z = false;
        }
        changeButtonStates$default(c25688jCr, z, false, 2, null);
        return Unit.INSTANCE;
    }
}
