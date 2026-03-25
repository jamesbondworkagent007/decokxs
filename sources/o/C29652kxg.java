package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.model.SingleOverviewDetailFragmentParams;
import com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$fetchTrendAddresses$1;
import com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.C29525kvL;
import o.C29665kxt;
import o.InterfaceC29579kwM;
import o.InterfaceC29663kxr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29652kxg extends AbstractC29583kwQ implements InterfaceC29581kwO {
    public InterfaceC29581kwO AYXKKw;
    public boolean AkhnZx;
    public boolean DbNXlk;
    public SignalOverviewUiModel djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C21604hFn gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    public C29652kxg() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalSingleOverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalSingleOverviewDetailFragment$special$$inlined$viewModels$default$5
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.kxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29652kxg.valueOf(this.OLrzqt);
            }
        });
        this.AYXKKw = new C29578kwL(this);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29652kxg.gEmmrt(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.kxg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kxg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C29652kxg OLrzqt(@NotNull SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParams) {
            Intrinsics.checkNotNullParameter(singleOverviewDetailFragmentParams, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.single_overview_detail_fragment_params", singleOverviewDetailFragmentParams);
            C29652kxg c29652kxg = new C29652kxg();
            c29652kxg.setArguments(bundle);
            return c29652kxg;
        }
    }

    public final SingleOverviewDetailFragmentParams gEmmrt() {
        SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (singleOverviewDetailFragmentParams = (SingleOverviewDetailFragmentParams) BundleCompat.getParcelable(arguments, "key.single_overview_detail_fragment_params", SingleOverviewDetailFragmentParams.class)) == null) ? new SingleOverviewDetailFragmentParams(null, null, false, 7, null) : singleOverviewDetailFragmentParams;
    }

    public final C21604hFn valueOf() {
        C21604hFn c21604hFn = this.gEmmrt;
        Intrinsics.copydefault(c21604hFn);
        return c21604hFn;
    }

    public final SignalSingleOverviewViewModel djBIcL() {
        return (SignalSingleOverviewViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.kxg$ActionBar */
    public static final class ActionBar implements InterfaceC29538kvY {
        public ActionBar() {
        }

        @Override // o.InterfaceC29538kvY
        public void OLrzqt(java.lang.String str, java.lang.String str2, TimeIntervalSelector timeIntervalSelector) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
            C29652kxg.this.djBIcL().AEQbTJ(str, str2, timeIntervalSelector);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC29538kvY AYXKKw() {
        return (InterfaceC29538kvY) this.fetchVPNInfo.getValue();
    }

    public static final ActionBar valueOf(C29652kxg c29652kxg) {
        return c29652kxg.new ActionBar();
    }

    /* JADX DEBUG: Possible override for method o.kwQ.OLrzqt()V */
    public final kMM OLrzqt() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM gEmmrt(final C29652kxg c29652kxg) {
        kMM kmm = new kMM();
        kmm.register(C29468kuH.class, new C29534kvU(c29652kxg.AYXKKw, new Function0() { // from class: o.kxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29652kxg.djBIcL(this.OLrzqt);
            }
        }));
        return kmm;
    }

    public static final Unit djBIcL(C29652kxg c29652kxg) {
        if (c29652kxg.DbNXlk) {
            c29652kxg.AkhnZx = true;
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.gEmmrt = C21604hFn.KWHzl(layoutInflater, viewGroup, false);
        android.widget.FrameLayout root = valueOf().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo();
        AkhnZx();
        AhwBna();
        SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParamsGEmmrt = gEmmrt();
        djBIcL().OLrzqt(singleOverviewDetailFragmentParamsGEmmrt.KWHzl(), singleOverviewDetailFragmentParamsGEmmrt.EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        djBIcL().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL().copydefault(gEmmrt().KWHzl(), gEmmrt().EZpvd());
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(false);
    }

    private final void fetchVPNInfo() {
        C33537myN c33537myN = valueOf().KWHzl.EZpvd;
        Intrinsics.copydefault(c33537myN);
        c33537myN.setVisibility(0);
        c33537myN.setAppBarColor(0);
        c33537myN.setStatusBarVisible(4);
        c33537myN.setBackVisible(0);
        valueOf().OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.kxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29652kxg.KWHzl(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(C29652kxg c29652kxg, android.view.View view) {
        SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParamsGEmmrt = c29652kxg.gEmmrt();
        c29652kxg.djBIcL().OLrzqt(singleOverviewDetailFragmentParamsGEmmrt.KWHzl(), singleOverviewDetailFragmentParamsGEmmrt.EZpvd());
    }

    /* JADX INFO: renamed from: o.kxg$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC29663kxr interfaceC29663kxr, Continuation<? super Unit> continuation) {
            C29652kxg.this.OLrzqt(interfaceC29663kxr);
            return Unit.INSTANCE;
        }
    }

    private final void AkhnZx() {
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().OLrzqt(), null, new Activity(), 2, null);
    }

    public final void OLrzqt(InterfaceC29663kxr interfaceC29663kxr) {
        C21604hFn c21604hFnValueOf = valueOf();
        C55113xdn c55113xdn = c21604hFnValueOf.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(interfaceC29663kxr instanceof InterfaceC29663kxr.ActionBar ? 0 : 8);
        C55173xeu c55173xeu = c21604hFnValueOf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC29663kxr instanceof InterfaceC29663kxr.TaskDescription ? 0 : 8);
        LinearLayoutCompat root = c21604hFnValueOf.KWHzl.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        boolean z = interfaceC29663kxr instanceof InterfaceC29663kxr.StateListAnimator;
        root.setVisibility(z ? 0 : 8);
        if (z) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            SignalOverviewUiModel signalOverviewUiModelEZpvd = ((InterfaceC29663kxr.StateListAnimator) interfaceC29663kxr).EZpvd();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C21600hFj c21600hFj = valueOf().KWHzl;
            if (this.djBIcL == null) {
                AEQbTJ(signalOverviewUiModelEZpvd);
            } else {
                Intrinsics.copydefault(c21600hFj);
                C29531kvR.copydefault(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd, this, "", true);
                OLrzqt(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd);
                SignalOverviewUiModel signalOverviewUiModel = this.djBIcL;
                if (!Intrinsics.EZpvd(signalOverviewUiModel != null ? signalOverviewUiModel.OLrzqt() : null, signalOverviewUiModelEZpvd.OLrzqt())) {
                    C29531kvR.OLrzqt(c21600hFj, signalOverviewUiModelEZpvd, this);
                    C29531kvR.AEQbTJ(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd);
                }
                SignalOverviewUiModel signalOverviewUiModel2 = this.djBIcL;
                if (!Intrinsics.EZpvd(signalOverviewUiModel2 != null ? signalOverviewUiModel2.gEmmrt() : null, signalOverviewUiModelEZpvd.gEmmrt())) {
                    C29531kvR.OLrzqt(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd, this, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : false);
                    copydefault(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd);
                    AEQbTJ(c21600hFj, contextRequireContext, signalOverviewUiModelEZpvd.gEmmrt());
                }
            }
            this.djBIcL = signalOverviewUiModelEZpvd;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kvR.bindSignalTrendInfo$default(o.hFj, android.content.Context, com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel, o.kwO, boolean, boolean, int, java.lang.Object):void */
    public final void AEQbTJ(SignalOverviewUiModel signalOverviewUiModel) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C21600hFj c21600hFj = valueOf().KWHzl;
        int iDpInt$default = C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        NestedScrollView nestedScrollView = c21600hFj.wlaJM;
        nestedScrollView.setPadding(iDpInt$default, nestedScrollView.getPaddingTop(), iDpInt$default, nestedScrollView.getPaddingBottom());
        LinearLayoutCompat linearLayoutCompat = c21600hFj.uzCIH;
        linearLayoutCompat.setPadding(iDpInt$default, linearLayoutCompat.getPaddingTop(), iDpInt$default, linearLayoutCompat.getPaddingBottom());
        Intrinsics.copydefault(c21600hFj);
        C29531kvR.copydefault(c21600hFj, contextRequireContext, signalOverviewUiModel, this, "", true);
        C29531kvR.OLrzqt(c21600hFj, signalOverviewUiModel, this);
        c21600hFj.fJNWhG.OLrzqt((InterfaceC29581kwO) this, (C29665kxt.TaskDescription) new StateListAnimator(signalOverviewUiModel), true, signalOverviewUiModel.OLrzqt().OLrzqt());
        C29531kvR.AEQbTJ(c21600hFj, contextRequireContext, signalOverviewUiModel);
        C29531kvR.OLrzqt(c21600hFj, contextRequireContext, signalOverviewUiModel, this, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : false);
        EZpvd(c21600hFj);
        OLrzqt(c21600hFj, contextRequireContext, signalOverviewUiModel);
        copydefault(c21600hFj, contextRequireContext, signalOverviewUiModel);
        AEQbTJ(c21600hFj, contextRequireContext, signalOverviewUiModel.gEmmrt());
    }

    /* JADX INFO: renamed from: o.kxg$StateListAnimator */
    public static final class StateListAnimator implements C29665kxt.TaskDescription {
        public final /* synthetic */ SignalOverviewUiModel OLrzqt;

        public StateListAnimator(SignalOverviewUiModel signalOverviewUiModel) {
            this.OLrzqt = signalOverviewUiModel;
        }

        @Override // o.C29665kxt.TaskDescription
        public void copydefault() {
            C29652kxg.this.AYXKKw().OLrzqt(this.OLrzqt.valueOf(), this.OLrzqt.values(), this.OLrzqt.OLrzqt().AEQbTJ());
        }
    }

    public final void EZpvd(C21600hFj c21600hFj) {
        FlexboxLayout flexboxLayout = c21600hFj.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
        flexboxLayout.setVisibility(8);
        ConstraintLayout constraintLayout = c21600hFj.valueOf;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = c21600hFj.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        android.view.View view = c21600hFj.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        ConstraintLayout constraintLayout3 = c21600hFj.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(0);
        RecyclerView recyclerView = c21600hFj.AubY;
        recyclerView.setAdapter(OLrzqt());
        recyclerView.addItemDecoration(new C24290iaz(C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), false, 2, null));
        recyclerView.setItemAnimator(null);
    }

    public final void copydefault(final C21600hFj c21600hFj, final android.content.Context context, SignalOverviewUiModel signalOverviewUiModel) {
        final SignalUiModel signalUiModelGEmmrt = signalOverviewUiModel.gEmmrt();
        c21600hFj.QOLQEE.setText(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalUiModelGEmmrt.gEmmrt()) ? "--" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, signalUiModelGEmmrt.gEmmrt(), false, false, RoundingMode.DOWN, false, 20, null));
        c21600hFj.AxsJAY.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(C23272hvB.KWHzl, signalUiModelGEmmrt.DbNXlk(), null, null, false, 14, null));
        c21600hFj.gHZMYf.setText(C23319hvw.getNumberICU$default(signalUiModelGEmmrt.AhwBna(), RoundingMode.HALF_DOWN, null, null, null, 14, null));
        c21600hFj.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.kxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29652kxg.OLrzqt(this.KWHzl, c21600hFj, context, signalUiModelGEmmrt, view);
            }
        });
    }

    public static final void OLrzqt(C29652kxg c29652kxg, C21600hFj c21600hFj, android.content.Context context, SignalUiModel signalUiModel, android.view.View view) {
        c29652kxg.AEQbTJ(c21600hFj, context, signalUiModel);
    }

    public final void OLrzqt(C21600hFj c21600hFj, android.content.Context context, SignalOverviewUiModel signalOverviewUiModel) {
        SignalUiModel signalUiModelGEmmrt = signalOverviewUiModel.gEmmrt();
        c21600hFj.RJOkX.setText(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalOverviewUiModel.EZpvd()) ? "--" : C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, signalOverviewUiModel.EZpvd(), false, false, RoundingMode.DOWN, false, 20, null));
        c21600hFj.QUSxYX.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(C23272hvB.KWHzl, signalOverviewUiModel.AEQbTJ(), null, null, false, 14, null));
        c21600hFj.ORxRYg.setText(C23319hvw.getNumberICU$default(signalOverviewUiModel.KWHzl(), RoundingMode.HALF_DOWN, null, null, null, 14, null));
        c21600hFj.RJOkX.setTextColor(signalOverviewUiModel.copydefault(signalOverviewUiModel.EZpvd(), signalUiModelGEmmrt.gEmmrt(), context));
        c21600hFj.QUSxYX.setTextColor(signalOverviewUiModel.copydefault(signalOverviewUiModel.AEQbTJ(), signalUiModelGEmmrt.DbNXlk(), context));
        c21600hFj.ORxRYg.setTextColor(signalOverviewUiModel.copydefault(signalOverviewUiModel.KWHzl(), signalUiModelGEmmrt.AhwBna(), context));
    }

    public final void AEQbTJ(C21600hFj c21600hFj, android.content.Context context, SignalUiModel signalUiModel) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalSingleOverviewDetailFragment$fetchTrendAddresses$1(this, c21600hFj, signalUiModel, context, null), 3, null);
    }

    public final void AhwBna() {
        valueOf().OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.kxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29652kxg.EZpvd(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(C29652kxg c29652kxg, android.view.View view) {
        SingleOverviewDetailFragmentParams singleOverviewDetailFragmentParamsGEmmrt = c29652kxg.gEmmrt();
        c29652kxg.djBIcL().AEQbTJ(singleOverviewDetailFragmentParamsGEmmrt.KWHzl(), singleOverviewDetailFragmentParamsGEmmrt.EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        super.onDestroyView();
        djBIcL().copydefault();
        valueOf().KWHzl.fJNWhG.KWHzl();
        C29665kxt.Companion.OLrzqt();
        this.gEmmrt = null;
        this.djBIcL = null;
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Application) {
            java.lang.String str = gEmmrt().AEQbTJ() ? "scanner_signal" : "signal";
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.SharedElementCallback.EZpvd);
            this.AYXKKw.AEQbTJ(InterfaceC29579kwM.Application.copy$default((InterfaceC29579kwM.Application) interfaceC29579kwM, null, 0, null, str, 7, null));
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.StateListAnimator) {
            InterfaceC29579kwM.StateListAnimator stateListAnimator = (InterfaceC29579kwM.StateListAnimator) interfaceC29579kwM;
            djBIcL().KWHzl(stateListAnimator.copydefault(), stateListAnimator.KWHzl(), stateListAnimator.EZpvd());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.FragmentManager) {
            djBIcL().KWHzl(((InterfaceC29579kwM.FragmentManager) interfaceC29579kwM).EZpvd());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Dialog) {
            C29525kvL.TaskDescription taskDescription = C29525kvL.Companion;
            InterfaceC29579kwM.Dialog dialog = (InterfaceC29579kwM.Dialog) interfaceC29579kwM;
            java.lang.String strOLrzqt = dialog.OLrzqt();
            java.lang.String strKWHzl = dialog.KWHzl();
            InterfaceC56445yFq<InfluencerType> entries = InfluencerType.getEntries();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(entries, 10));
            java.util.Iterator<InfluencerType> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna(it.next().getValue())));
            }
            C29525kvL c29525kvLEZpvd = taskDescription.EZpvd(strOLrzqt, strKWHzl, arrayList);
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c29525kvLEZpvd.show(parentFragmentManager);
            return;
        }
        this.AYXKKw.AEQbTJ(interfaceC29579kwM);
    }
}
