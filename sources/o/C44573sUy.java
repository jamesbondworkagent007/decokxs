package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$livestreamAdapter$2$1$1;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$livestreamAdapter$2$2$1;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeFloatingWindow$2;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeLivestreamItems$2;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeStreamState$2;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeUiState$2;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$observeViewModel$1;
import com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$verifyStreamStatus$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC44569sUu;
import o.C44565sUq;
import o.InterfaceC8104awT;
import o.sUN;
import o.sWj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44573sUy extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public InterfaceC44530sTh AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public boolean KWHzl;
    public boolean OLrzqt;
    public sWg copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public boolean valueOf;
    public final int AhwBna = sWj.TaskDescription.KWHzl;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sUM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C44573sUy.ejfBZ(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sWg AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InterfaceC44530sTh interfaceC44530sTh) {
        this.AYXKKw = interfaceC44530sTh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC44530sTh KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    public C44573sUy() {
        Function0 function0 = new Function0() { // from class: o.sUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44573sUy.fJNWhG(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(sUN.class), new Function0<ViewModelStore>() { // from class: com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.oklive.app.ui.list.fragment.LivestreamListFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44573sUy.fIwbmz(this.AEQbTJ);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sUK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44573sUy.AuCTel(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.sUy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sUy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C44573sUy KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C44573sUy c44573sUy = new C44573sUy();
            c44573sUy.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("uid", str), C56390yDp.OLrzqt("authorId", str2)));
            return c44573sUy;
        }
    }

    public final sUP EZpvd() {
        return (sUP) this.AEQbTJ.getValue();
    }

    public static final sUP ejfBZ(C44573sUy c44573sUy) {
        android.content.Context applicationContext = c44573sUy.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return (sUP) C58114yvF.OLrzqt(applicationContext, sUP.class);
    }

    public final sUN djBIcL() {
        return (sUN) this.AkhnZx.getValue();
    }

    public static final ViewModelProvider.Factory fJNWhG(C44573sUy c44573sUy) {
        android.content.Context applicationContext = c44573sUy.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new sUN.StateListAnimator(applicationContext, c44573sUy.EZpvd().dIjzlO(), c44573sUy.EZpvd().DIIpTV(), c44573sUy.EZpvd().invokespecialODCBUN(), c44573sUy.EZpvd().GGlJim(), c44573sUy.EZpvd().gGNlxh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44564sUp AkhnZx() {
        return (C44564sUp) this.gEmmrt.getValue();
    }

    public static final C44564sUp fIwbmz(C44573sUy c44573sUy) {
        return c44573sUy.EZpvd().DcMfJKdMCrTj();
    }

    public final C44565sUq OLrzqt() {
        return (C44565sUq) this.djBIcL.getValue();
    }

    public static final C44565sUq AuCTel(final C44573sUy c44573sUy) {
        return new C44565sUq(new Function1() { // from class: o.sUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44573sUy.EZpvd(this.AEQbTJ, (AbstractC44569sUu.Activity) obj);
            }
        }, new Function1() { // from class: o.sUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44573sUy.OLrzqt(this.OLrzqt, (AbstractC44569sUu.ActionBar) obj);
            }
        }, new Function1() { // from class: o.sUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44573sUy.copydefault(this.AEQbTJ, (AbstractC44569sUu.Activity) obj);
            }
        }, new Function0() { // from class: o.sUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44573sUy.fARcdN(this.AEQbTJ);
            }
        });
    }

    public static final Unit EZpvd(C44573sUy c44573sUy, AbstractC44569sUu.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        c44573sUy.OLrzqt = true;
        c44573sUy.fetchVPNInfo();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c44573sUy), null, null, new LivestreamListFragment$livestreamAdapter$2$1$1(c44573sUy, activity, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C44573sUy c44573sUy, AbstractC44569sUu.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        c44573sUy.OLrzqt = true;
        c44573sUy.fetchVPNInfo();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c44573sUy), null, null, new LivestreamListFragment$livestreamAdapter$2$2$1(c44573sUy, actionBar, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C44573sUy c44573sUy, AbstractC44569sUu.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        c44573sUy.copydefault(activity);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C44573sUy c44573sUy) {
        c44573sUy.AYXKKw();
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
        if (interfaceC8104awT != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.copydefault = sWg.AEQbTJ(layoutInflater, viewGroup, false);
        sWg swgAEQbTJ = AEQbTJ();
        Intrinsics.copydefault(swgAEQbTJ);
        android.widget.FrameLayout frameLayoutAEQbTJ = swgAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutAEQbTJ, "");
        return frameLayoutAEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C31699mAq.Companion.EZpvd(true);
        isConnected();
        valueOf();
        values();
        loadData$default(this, false, false, 3, null);
        sUN sunDjBIcL = djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        sunDjBIcL.OLrzqt(viewLifecycleOwner);
    }

    private final void isConnected() {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(OLrzqt());
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C44572sUx(context, 0, 0, 6, null));
        recyclerView.setHasFixedSize(false);
        recyclerView.setItemAnimator(null);
        recyclerView.addOnScrollListener(new Activity());
    }

    /* JADX INFO: renamed from: o.sUy$Activity */
    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i2 <= 0) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            if (iFindLastVisibleItemPosition < r1.getItemCount() - 5 || iFindLastVisibleItemPosition < 0) {
                return;
            }
            C44573sUy.this.djBIcL().AhwBna();
        }
    }

    private final void values() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LivestreamListFragment$observeViewModel$1(this, null), 3, null);
    }

    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(djBIcL().copydefault(), new LivestreamListFragment$observeLivestreamItems$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(djBIcL().OLrzqt(), new LivestreamListFragment$observeUiState$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(AkhnZx().AYXKKw(), new LivestreamListFragment$observeFloatingWindow$2(this, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(djBIcL().EZpvd(), new LivestreamListFragment$observeStreamState$2(this, new Ref.ObjectRef(), null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public final void AEQbTJ(sUN.TaskDescription taskDescription) {
        final sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ != null) {
            swgAEQbTJ.OLrzqt.AEQbTJ().setVisibility(8);
            if (taskDescription instanceof sUN.TaskDescription.Activity) {
                if (!this.valueOf && OLrzqt().getItemCount() == 0) {
                    C33546myW c33546myW = swgAEQbTJ.AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                    c33546myW.setVisibility(8);
                }
                C55173xeu c55173xeu = swgAEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                C55173xeu c55173xeu2 = swgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(8);
                C55173xeu c55173xeu3 = swgAEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                c55173xeu3.setVisibility(8);
                return;
            }
            if (taskDescription instanceof sUN.TaskDescription.C0943TaskDescription) {
                C33546myW c33546myW2 = swgAEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW2, "");
                c33546myW2.setVisibility(0);
                RecyclerView recyclerView = swgAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                recyclerView.setVisibility(8);
                C55173xeu c55173xeu4 = swgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
                c55173xeu4.setVisibility(8);
                C55173xeu c55173xeu5 = swgAEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55173xeu5, "");
                c55173xeu5.setVisibility(8);
                if (djBIcL().AYXKKw()) {
                    C55173xeu c55173xeu6 = swgAEQbTJ.OLrzqt;
                    java.lang.String string = getString(sWj.Activity.gEmmrt);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c55173xeu6.setTitle(string);
                    C55173xeu c55173xeu7 = swgAEQbTJ.OLrzqt;
                    java.lang.String string2 = getString(sWj.Activity.valueOf);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55173xeu7.setSubTitle((java.lang.CharSequence) string2);
                } else {
                    C55173xeu c55173xeu8 = swgAEQbTJ.OLrzqt;
                    java.lang.String string3 = getString(sWj.Activity.AYXKKw);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    c55173xeu8.setTitle(string3);
                    C55173xeu c55173xeu9 = swgAEQbTJ.OLrzqt;
                    java.lang.String string4 = getString(sWj.Activity.djBIcL);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    c55173xeu9.setSubTitle((java.lang.CharSequence) string4);
                }
                C55173xeu c55173xeu10 = swgAEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu10, "");
                c55173xeu10.setVisibility(0);
                return;
            }
            if (taskDescription instanceof sUN.TaskDescription.ActionBar) {
                C33546myW c33546myW3 = swgAEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW3, "");
                c33546myW3.setVisibility(8);
                C55173xeu c55173xeu11 = swgAEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu11, "");
                c55173xeu11.setVisibility(8);
                C55173xeu c55173xeu12 = swgAEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55173xeu12, "");
                c55173xeu12.setVisibility(8);
                C55173xeu c55173xeu13 = swgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu13, "");
                c55173xeu13.setVisibility(0);
                swgAEQbTJ.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.sUR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C44573sUy.AEQbTJ(this.copydefault, view);
                    }
                });
                return;
            }
            if (taskDescription instanceof sUN.TaskDescription.FragmentManager) {
                C33546myW c33546myW4 = swgAEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW4, "");
                c33546myW4.setVisibility(0);
                RecyclerView recyclerView2 = swgAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(0);
                C55173xeu c55173xeu14 = swgAEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu14, "");
                c55173xeu14.setVisibility(8);
                C55173xeu c55173xeu15 = swgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu15, "");
                c55173xeu15.setVisibility(8);
                C55173xeu c55173xeu16 = swgAEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55173xeu16, "");
                c55173xeu16.setVisibility(8);
                return;
            }
            if (taskDescription instanceof sUN.TaskDescription.StateListAnimator) {
                C33546myW c33546myW5 = swgAEQbTJ.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c33546myW5, "");
                c33546myW5.setVisibility(0);
                RecyclerView recyclerView3 = swgAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "");
                recyclerView3.setVisibility(8);
                C55173xeu c55173xeu17 = swgAEQbTJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu17, "");
                c55173xeu17.setVisibility(8);
                C55173xeu c55173xeu18 = swgAEQbTJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55173xeu18, "");
                c55173xeu18.setVisibility(8);
                swgAEQbTJ.OLrzqt.setTitle(C33070mpX.AYXKKw(sWj.Activity.fARcdN));
                swgAEQbTJ.OLrzqt.setSubTitle((java.lang.CharSequence) "");
                C55173xeu c55173xeu19 = swgAEQbTJ.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55173xeu19, "");
                c55173xeu19.setVisibility(0);
                return;
            }
            if (!(taskDescription instanceof sUN.TaskDescription.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            C33546myW c33546myW6 = swgAEQbTJ.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c33546myW6, "");
            c33546myW6.setVisibility(8);
            C55173xeu c55173xeu20 = swgAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu20, "");
            c55173xeu20.setVisibility(8);
            C55173xeu c55173xeu21 = swgAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu21, "");
            c55173xeu21.setVisibility(8);
            C55173xeu c55173xeu22 = swgAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu22, "");
            c55173xeu22.setVisibility(0);
            swgAEQbTJ.AEQbTJ.setRetryClickListener(new View.OnClickListener() { // from class: o.sUH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44573sUy.OLrzqt(swgAEQbTJ, this, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C44573sUy c44573sUy, android.view.View view) {
        c44573sUy.AYXKKw();
    }

    public static final void OLrzqt(sWg swg, C44573sUy c44573sUy, android.view.View view) {
        RecyclerView recyclerView;
        C55173xeu c55173xeu = swg.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        c44573sUy.valueOf = true;
        c44573sUy.AhwBna();
        loadData$default(c44573sUy, false, true, 1, null);
        sWg swgAEQbTJ = c44573sUy.AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        recyclerView.scrollToPosition(0);
    }

    public static /* synthetic */ void loadData$default(C44573sUy c44573sUy, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        c44573sUy.OLrzqt(z, z2);
    }

    private final void OLrzqt(boolean z, boolean z2) {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("uid")) == null) {
            return;
        }
        djBIcL().EZpvd(string, z, z2);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.OLrzqt) {
            fetchVPNInfo();
        }
        djBIcL().values();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.OLrzqt = false;
        boolean zOLrzqt = OLrzqt().OLrzqt();
        OLrzqt().EZpvd(AkhnZx().valueOf());
        if (zOLrzqt) {
            copydefault();
            gEmmrt();
        } else {
            gEmmrt();
        }
        djBIcL().isConnected();
        djBIcL().fetchVPNInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        djBIcL().ejfBZ();
        AhwBna();
        djBIcL().fIwbmz();
        super.onDestroyView();
        this.copydefault = null;
    }

    public final void copydefault() {
        int itemCount = OLrzqt().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            java.util.List<AbstractC44569sUu> currentList = OLrzqt().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "");
            if (CollectionsKt___CollectionsKt.AkhnZx(currentList, i) instanceof AbstractC44569sUu.Activity) {
                OLrzqt().notifyItemChanged(i);
            }
        }
    }

    public final void copydefault(AbstractC44569sUu.Activity activity) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LivestreamListFragment$verifyStreamStatus$1(this, activity, null), 3, null);
    }

    public final void KWHzl(java.lang.String str) {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        OLrzqt().copydefault(recyclerView, str);
    }

    public final void valueOf() {
        C33546myW c33546myW;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (c33546myW = swgAEQbTJ.AYXKKw) == null) {
            return;
        }
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.sUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C44573sUy.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C44573sUy c44573sUy, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c44573sUy.valueOf = true;
        c44573sUy.AhwBna();
        c44573sUy.djBIcL().fIwbmz();
        loadData$default(c44573sUy, true, false, 2, null);
    }

    public final void fetchVPNInfo() {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        int itemCount = OLrzqt().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            C44565sUq.TaskDescription taskDescription = viewHolderFindViewHolderForAdapterPosition instanceof C44565sUq.TaskDescription ? (C44565sUq.TaskDescription) viewHolderFindViewHolderForAdapterPosition : null;
            if (taskDescription != null) {
                taskDescription.valueOf();
            }
        }
    }

    public final void gEmmrt() {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        int itemCount = OLrzqt().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            C44565sUq.TaskDescription taskDescription = viewHolderFindViewHolderForAdapterPosition instanceof C44565sUq.TaskDescription ? (C44565sUq.TaskDescription) viewHolderFindViewHolderForAdapterPosition : null;
            if (taskDescription != null) {
                taskDescription.copydefault();
            }
        }
    }

    public final void AhwBna() {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        int itemCount = OLrzqt().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            C44565sUq.TaskDescription taskDescription = viewHolderFindViewHolderForAdapterPosition instanceof C44565sUq.TaskDescription ? (C44565sUq.TaskDescription) viewHolderFindViewHolderForAdapterPosition : null;
            if (taskDescription != null) {
                taskDescription.KWHzl();
            }
        }
    }

    public final void copydefault(sUN.Application application) {
        RecyclerView recyclerView;
        sWg swgAEQbTJ = AEQbTJ();
        if (swgAEQbTJ == null || (recyclerView = swgAEQbTJ.EZpvd) == null) {
            return;
        }
        int itemCount = OLrzqt().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            C44565sUq.TaskDescription taskDescription = viewHolderFindViewHolderForAdapterPosition instanceof C44565sUq.TaskDescription ? (C44565sUq.TaskDescription) viewHolderFindViewHolderForAdapterPosition : null;
            if (taskDescription != null) {
                taskDescription.OLrzqt(application.EZpvd());
            }
        }
    }
}
