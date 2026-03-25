package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.market.features.smart_money.common.event_tracking.SignalButtonNameEvent;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFilterViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.SignalTab;
import com.okinc.business.market.features.smart_money.signal.ui.model.SingleOverviewDetailFragmentParams;
import com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import com.okinc.business.market.features.smart_money.ui.SmartMoneySharedViewModel;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C29525kvL;
import o.C31197lpV;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29586kwT extends AbstractC29585kwS<C21598hFh> implements InterfaceC29581kwO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public C29481kuU AYXKKw;
    public InterfaceC29581kwO AhwBna;
    public final Activity AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm values;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.kwZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29586kwT.valueOf(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.kxa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29586kwT.AhwBna(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.kwT$Dialog */
    public static final class Dialog implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kwT$FragmentManager */
    public static final class FragmentManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.kwT$LoaderManager */
    public static final class LoaderManager implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29644kxY) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    public C29586kwT() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        LoaderManager loaderManager = new LoaderManager(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(loaderManager));
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalOverviewViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new Dialog(this)));
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(new FragmentManager(this)));
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartMoneySharedViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29586kwT.AYXKKw(this.OLrzqt);
            }
        });
        this.AkhnZx = new Activity();
    }

    /* JADX INFO: renamed from: o.kwT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kwT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29586kwT KWHzl(@NotNull SmartMoneyConfig smartMoneyConfig, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(smartMoneyConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            C29586kwT c29586kwT = new C29586kwT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("keys.config", smartMoneyConfig);
            bundle.putString("module_name_english", str);
            c29586kwT.setArguments(bundle);
            return c29586kwT;
        }
    }

    private final java.lang.String isConnected() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public static final java.lang.String valueOf(C29586kwT c29586kwT) {
        java.lang.String string;
        android.os.Bundle arguments = c29586kwT.getArguments();
        return (arguments == null || (string = arguments.getString("module_name_english")) == null) ? "--" : string;
    }

    /* JADX INFO: renamed from: o.kwT$PendingIntent */
    public static final class PendingIntent implements InterfaceC29538kvY {
        public PendingIntent() {
        }

        @Override // o.InterfaceC29538kvY
        public void OLrzqt(java.lang.String str, java.lang.String str2, TimeIntervalSelector timeIntervalSelector) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
            C29586kwT.this.djBIcL().AEQbTJ(str, str2, timeIntervalSelector);
        }
    }

    public final InterfaceC29538kvY gEmmrt() {
        return (InterfaceC29538kvY) this.AuCTel.getValue();
    }

    public static final PendingIntent AhwBna(C29586kwT c29586kwT) {
        return c29586kwT.new PendingIntent();
    }

    public final SignalOverviewViewModel djBIcL() {
        return (SignalOverviewViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalFilterViewModel AkhnZx() {
        return (SignalFilterViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartMoneySharedViewModel values() {
        return (SmartMoneySharedViewModel) this.DbNXlk.getValue();
    }

    private final kMM valueOf() {
        return (kMM) this.djBIcL.getValue();
    }

    public static final kMM AYXKKw(C29586kwT c29586kwT) {
        kMM kmm = new kMM();
        kmm.register(SignalOverviewUiModel.class, new C29533kvT(c29586kwT, c29586kwT.gEmmrt(), c29586kwT.isConnected()));
        return kmm;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21598hFh KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21598hFh c21598hFhEZpvd = C21598hFh.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21598hFhEZpvd, "");
        return c21598hFhEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL().KWHzl(AkhnZx().KWHzl());
        if (djBIcL().AEQbTJ().getValue() == null || !(!r0.isEmpty())) {
            return;
        }
        C21598hFh c21598hFh = (C21598hFh) aX_();
        copydefault(c21598hFh != null ? c21598hFh.djBIcL : null);
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        djBIcL().KWHzl();
        djBIcL().gEmmrt();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21598hFh c21598hFh, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21598hFh, "");
        fetchVPNInfo();
        DbNXlk();
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().copydefault(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().EZpvd(), null, new ActionBar(c21598hFh), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().gEmmrt(), null, new StateListAnimator(), 2, null);
    }

    /* JADX INFO: renamed from: o.kwT$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29558kvs c29558kvs, Continuation<? super Unit> continuation) {
            C29586kwT.this.OLrzqt(c29558kvs);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kwT$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        public final /* synthetic */ C21598hFh EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C21598hFh c21598hFh) {
            this.EZpvd = c21598hFh;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(SignalOverviewViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
            if (taskDescription != null) {
                C29586kwT.this.AEQbTJ(taskDescription.KWHzl(), this.EZpvd, taskDescription.copydefault());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C29586kwT.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kwT$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29481kuU c29481kuU, Continuation<? super Unit> continuation) {
            if (!C29586kwT.this.values().EZpvd()) {
                return Unit.INSTANCE;
            }
            if (!C29586kwT.this.AkhnZx().KWHzl(C29586kwT.this.AYXKKw)) {
                return Unit.INSTANCE;
            }
            C29586kwT.this.djBIcL().copydefault(C29586kwT.this.AkhnZx().KWHzl(), true, c29481kuU);
            C29586kwT.this.AYXKKw = c29481kuU;
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        C21598hFh c21598hFh = (C21598hFh) aX_();
        if (c21598hFh != null) {
            c21598hFh.djBIcL.setAdapter(valueOf());
            c21598hFh.djBIcL.addItemDecoration(new C29647kxb(C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QUSxYX)));
            c21598hFh.djBIcL.setItemAnimator(null);
            AhwBna();
            c21598hFh.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.kwY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29586kwT.copydefault(this.OLrzqt, view);
                }
            });
            C33546myW c33546myW = c21598hFh.AYXKKw;
            c21598hFh.gEmmrt.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
            c33546myW.djBIcL(true);
            c33546myW.gEmmrt();
            c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.kwU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C29586kwT.OLrzqt(this.OLrzqt, interfaceC57934yrl);
                }
            });
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.kwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C29586kwT.EZpvd(this.EZpvd, interfaceC57934yrl);
                }
            });
        }
    }

    public static final void copydefault(C29586kwT c29586kwT, android.view.View view) {
        c29586kwT.values().OLrzqt();
        if (!c29586kwT.AkhnZx().AhwBna()) {
            c29586kwT.AkhnZx().copydefault((C29601kwi) null);
        }
        c29586kwT.djBIcL().copydefault(c29586kwT.AkhnZx().KWHzl(), true, c29586kwT.AkhnZx().gEmmrt().getValue());
    }

    public static final void OLrzqt(C29586kwT c29586kwT, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        SignalOverviewViewModel.fetchOverviews$default(c29586kwT.djBIcL(), null, false, c29586kwT.AkhnZx().gEmmrt().getValue(), 1, null);
    }

    public static final void EZpvd(C29586kwT c29586kwT, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c29586kwT.djBIcL().copydefault(c29586kwT.AkhnZx().KWHzl(), true, c29586kwT.AkhnZx().gEmmrt().getValue());
    }

    /* JADX INFO: renamed from: o.kwT$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            C29586kwT.this.copydefault(recyclerView);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        RecyclerView recyclerView;
        C21598hFh c21598hFh = (C21598hFh) aX_();
        if (c21598hFh == null || (recyclerView = c21598hFh.djBIcL) == null) {
            return;
        }
        recyclerView.addOnScrollListener(this.AkhnZx);
    }

    public final void copydefault(RecyclerView recyclerView) {
        java.util.List<SignalOverviewUiModel> value;
        kotlin.Pair pair;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || (value = djBIcL().AEQbTJ().getValue()) == null || value.isEmpty()) {
            return;
        }
        kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            if (iNextInt < 0 || iNextInt >= value.size()) {
                pair = null;
            } else {
                SignalOverviewUiModel signalOverviewUiModel = value.get(iNextInt);
                pair = new kotlin.Pair(signalOverviewUiModel.valueOf(), signalOverviewUiModel.values());
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList);
        if (!listQbewEr.isEmpty()) {
            djBIcL().EZpvd(listQbewEr);
        }
    }

    private final void DbNXlk() {
        this.AhwBna = new C29578kwL(this);
    }

    public static /* synthetic */ void handleSignalOverviewList$default(C29586kwT c29586kwT, java.util.List list, C21598hFh c21598hFh, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c29586kwT.AEQbTJ(list, c21598hFh, z);
    }

    public final void AEQbTJ(java.util.List<SignalOverviewUiModel> list, final C21598hFh c21598hFh, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean zAEQbTJ = AEQbTJ(c21598hFh);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list);
        kMM.setData$default(valueOf(), arrayList, null, 2, null);
        c21598hFh.djBIcL.post(new java.lang.Runnable() { // from class: o.kwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29586kwT.copydefault(this.AEQbTJ, c21598hFh);
            }
        });
        if (zAEQbTJ && z) {
            c21598hFh.djBIcL.post(new java.lang.Runnable() { // from class: o.kwX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C29586kwT.EZpvd(c21598hFh);
                }
            });
            djBIcL().OLrzqt();
        } else if (z) {
            djBIcL().OLrzqt();
        }
    }

    public static final void copydefault(C29586kwT c29586kwT, C21598hFh c21598hFh) {
        c29586kwT.copydefault(c21598hFh.djBIcL);
    }

    public static final void EZpvd(C21598hFh c21598hFh) {
        c21598hFh.djBIcL.smoothScrollToPosition(0);
    }

    public final boolean AEQbTJ(C21598hFh c21598hFh) {
        RecyclerView.LayoutManager layoutManager = c21598hFh.djBIcL.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        return linearLayoutManager != null && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C29558kvs c29558kvs) {
        java.util.List<SignalOverviewUiModel> value;
        C21598hFh c21598hFh = (C21598hFh) aX_();
        if (c21598hFh != null) {
            boolean z = c29558kvs.OLrzqt() != null || ((value = djBIcL().AEQbTJ().getValue()) != null && value.isEmpty());
            C55113xdn c55113xdn = c21598hFh.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(c29558kvs.copydefault() ? 0 : 8);
            C55173xeu c55173xeu = c21598hFh.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility((c29558kvs.copydefault() || !z) ? 8 : 0);
            C33546myW c33546myW = c21598hFh.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility((c29558kvs.copydefault() || z) ? 8 : 0);
            if (z) {
                OLrzqt(!AkhnZx().AhwBna());
            }
            if (c29558kvs.copydefault()) {
                kMM.setData$default(valueOf(), yDY.AhwBna(), null, 2, null);
            }
            c21598hFh.AYXKKw.KWHzl(!c29558kvs.EZpvd());
            if (!c29558kvs.AEQbTJ()) {
                c21598hFh.AYXKKw.valueOf();
            }
            if (c29558kvs.EZpvd() && c29558kvs.OLrzqt() == null) {
                return;
            }
            c21598hFh.AYXKKw.valueOf();
            C33546myW c33546myW2 = c21598hFh.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
            C57589ylK.KWHzl(c33546myW2, true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(boolean z) {
        C55173xeu c55173xeu;
        C21598hFh c21598hFh = (C21598hFh) aX_();
        if (c21598hFh == null || (c55173xeu = c21598hFh.AEQbTJ) == null) {
            return;
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        if (z) {
            c55173xeu.setEmptyTypeImage(7);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.DbNXlk));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21Callback));
        } else {
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.hkDICb));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        RecyclerView recyclerView;
        super.onDestroyView();
        djBIcL().KWHzl();
        djBIcL().gEmmrt();
        C21598hFh c21598hFh = (C21598hFh) aX_();
        if (c21598hFh != null && (recyclerView = c21598hFh.djBIcL) != null) {
            recyclerView.removeOnScrollListener(this.AkhnZx);
        }
        C29665kxt.Companion.OLrzqt();
        this.AhwBna = null;
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.ActionBar) {
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PictureInPictureParams.EZpvd);
            C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.TOKEN_SIGNAL_DETAILS, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, values().KWHzl(), SignalTab.OVERVIEW, (java.lang.String) null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, (java.lang.Object) null);
            InterfaceC29579kwM.ActionBar actionBar = (InterfaceC29579kwM.ActionBar) interfaceC29579kwM;
            djBIcL().KWHzl(actionBar.copydefault());
            DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
            if (dexFragmentNavigatorAEQbTJ != null) {
                C29652kxg c29652kxgOLrzqt = C29652kxg.Companion.OLrzqt(new SingleOverviewDetailFragmentParams(actionBar.copydefault().valueOf(), actionBar.copydefault().values(), values().KWHzl()));
                dexFragmentNavigatorAEQbTJ.EZpvd(c29652kxgOLrzqt, (6 & 2) != 0 ? c29652kxgOLrzqt.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
                return;
            }
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Application) {
            java.lang.String str = values().KWHzl() ? "scanner_signal" : "signal";
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.SharedElementCallback.EZpvd);
            InterfaceC29581kwO interfaceC29581kwO = this.AhwBna;
            if (interfaceC29581kwO != null) {
                interfaceC29581kwO.AEQbTJ(InterfaceC29579kwM.Application.copy$default((InterfaceC29579kwM.Application) interfaceC29579kwM, null, 0, null, str, 7, null));
                return;
            }
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.StateListAnimator) {
            InterfaceC29579kwM.StateListAnimator stateListAnimator = (InterfaceC29579kwM.StateListAnimator) interfaceC29579kwM;
            djBIcL().copydefault(stateListAnimator.copydefault(), stateListAnimator.KWHzl(), stateListAnimator.EZpvd());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.FragmentManager) {
            InterfaceC29579kwM.FragmentManager fragmentManager = (InterfaceC29579kwM.FragmentManager) interfaceC29579kwM;
            djBIcL().AEQbTJ(fragmentManager.EZpvd(), fragmentManager.KWHzl(), fragmentManager.OLrzqt());
            return;
        }
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.Dialog) {
            C29525kvL.TaskDescription taskDescription = C29525kvL.Companion;
            InterfaceC29579kwM.Dialog dialog = (InterfaceC29579kwM.Dialog) interfaceC29579kwM;
            java.lang.String strOLrzqt = dialog.OLrzqt();
            java.lang.String strKWHzl = dialog.KWHzl();
            java.util.List<SignalMultiSelectUiModel> listOLrzqt = AkhnZx().gEmmrt().getValue().OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna(((SignalMultiSelectUiModel) it.next()).copydefault())));
            }
            C29525kvL c29525kvLEZpvd = taskDescription.EZpvd(strOLrzqt, strKWHzl, arrayList);
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c29525kvLEZpvd.show(parentFragmentManager);
            return;
        }
        if (!(interfaceC29579kwM instanceof InterfaceC29579kwM.Fragment)) {
            InterfaceC29581kwO interfaceC29581kwO2 = this.AhwBna;
            if (interfaceC29581kwO2 != null) {
                interfaceC29581kwO2.AEQbTJ(interfaceC29579kwM);
                return;
            }
            return;
        }
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.PictureInPictureParams.EZpvd);
        C29408ktA.trackSignalPageClick$default(C29408ktA.KWHzl, SignalButtonNameEvent.QUICK_BUY_BUTTON, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, values().KWHzl(), SignalTab.OVERVIEW, (java.lang.String) null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, (java.lang.Object) null);
        InterfaceC29581kwO interfaceC29581kwO3 = this.AhwBna;
        if (interfaceC29581kwO3 != null) {
            interfaceC29581kwO3.AEQbTJ(interfaceC29579kwM);
        }
    }
}
