package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData;
import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.business.market.features.scanner.trench.TrenchTabFragment$adapter$2$2;
import com.okinc.business.market.features.scanner.trench.TrenchTabFragment$adapter$2$5;
import com.okinc.business.market.features.scanner.trench.TrenchTabFragment$startDataCollection$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C31197lpV;
import o.InterfaceC28694kfc;
import o.InterfaceC28695kfd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ksP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29370ksP extends AbstractC29363ksI {
    public final InterfaceC56387yDm AhwBna;
    public RecyclerView.OnScrollListener AkhnZx;
    public boolean DbNXlk;
    public hAV djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fIwbmz;
    public boolean fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public boolean isConnected;
    public Job valueOf;
    public final InterfaceC56387yDm values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.ksP$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C29366ksL) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.AEQbTJ.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    public C29370ksP() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        TaskDescription taskDescription = new TaskDescription(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(taskDescription));
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeActivityViewModelV2.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.ksR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C29370ksP.uzCIH(this.copydefault));
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.ktb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29370ksP.iwGUEr(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ksZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29370ksP.values(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.kte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29370ksP.fARcdN(this.copydefault);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeActivityViewModelV2 AkhnZx() {
        return (MemeActivityViewModelV2) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ejfBZ() {
        return ((java.lang.Number) this.ejfBZ.getValue()).intValue();
    }

    public static final int uzCIH(C29370ksP c29370ksP) {
        android.os.Bundle arguments = c29370ksP.getArguments();
        if (arguments != null) {
            return arguments.getInt("tab_index", 0);
        }
        return 0;
    }

    /* JADX DEBUG: Possible override for method o.ksI.EZpvd()V */
    public final StateFlow<InterfaceC28695kfd> EZpvd() {
        return (StateFlow) this.fIwbmz.getValue();
    }

    public static final StateFlow iwGUEr(C29370ksP c29370ksP) {
        return (StateFlow) CollectionsKt___CollectionsKt.AkhnZx(c29370ksP.AkhnZx().copydefault(), c29370ksP.ejfBZ());
    }

    private final C28908kje DbNXlk() {
        return (C28908kje) this.gEmmrt.getValue();
    }

    public static final C28908kje values(final C29370ksP c29370ksP) {
        int iEjfBZ = c29370ksP.ejfBZ();
        LifecycleOwner viewLifecycleOwner = c29370ksP.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C28908kje(iEjfBZ, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new Function1() { // from class: o.ksU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29370ksP.KWHzl(this.OLrzqt, (MemeUiModel) obj);
            }
        }, new TrenchTabFragment$adapter$2$2(c29370ksP), new Function2() { // from class: o.ksX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29370ksP.AEQbTJ(this.AEQbTJ, (MemeUiModel) obj, (TokenDetailTabType) obj2);
            }
        }, new Function1() { // from class: o.kta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29370ksP.AEQbTJ(this.EZpvd, (MemeUiModel) obj);
            }
        }, new TrenchTabFragment$adapter$2$5(c29370ksP), new Function2() { // from class: o.ksY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C29370ksP.EZpvd(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(C29370ksP c29370ksP, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        C28648kej.copydefault(c29370ksP, memeUiModel.KWHzl(), memeUiModel.AuCTel());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C29370ksP c29370ksP, MemeUiModel memeUiModel, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        Intrinsics.checkNotNullParameter(tokenDetailTabType, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Dialog.EZpvd);
        C28648kej.EZpvd(c29370ksP, memeUiModel, "default_trade", tokenDetailTabType);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C29370ksP c29370ksP, MemeUiModel memeUiModel) {
        Intrinsics.checkNotNullParameter(memeUiModel, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.FragmentManager.OLrzqt);
        c29370ksP.EZpvd(memeUiModel);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C29370ksP c29370ksP, int i, java.lang.String str) {
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(str, "");
        hAV hav = c29370ksP.djBIcL;
        if (hav != null && (recyclerView = hav.DbNXlk) != null) {
            C28648kej.KWHzl(recyclerView, str);
        }
        return Unit.INSTANCE;
    }

    public static final C28607kdv fARcdN(C29370ksP c29370ksP) {
        return new C28607kdv(c29370ksP);
    }

    private final C28607kdv values() {
        return (C28607kdv) this.AhwBna.getValue();
    }

    /* JADX INFO: renamed from: o.ksP$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ksP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C29370ksP copydefault(int i) {
            C29370ksP c29370ksP = new C29370ksP();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tab_index", i);
            c29370ksP.setArguments(bundle);
            return c29370ksP;
        }
    }

    public final void fetchVPNInfo() {
        this.fetchVPNInfo = false;
        isConnected();
        DbNXlk().valueOf();
        values().AEQbTJ();
    }

    public final void valueOf() {
        RecyclerView recyclerView;
        this.fetchVPNInfo = true;
        gEmmrt();
        AkhnZx().KWHzl(ejfBZ(), false);
        if (this.isConnected) {
            DbNXlk().EZpvd();
        }
        hAV hav = this.djBIcL;
        RecyclerView.LayoutManager layoutManager = (hav == null || (recyclerView = hav.DbNXlk) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.findFirstVisibleItemPosition() != 0) {
            return;
        }
        AkhnZx().OLrzqt(ejfBZ(), InterfaceC28695kfd.Activity.copydefault);
    }

    public final void djBIcL() {
        MemeActivityViewModelV2.initContentTab$default(AkhnZx(), ejfBZ(), false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAV havCopydefault = hAV.copydefault(layoutInflater, viewGroup, false);
        this.djBIcL = havCopydefault;
        if (havCopydefault != null) {
            return havCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        AhwBna();
    }

    public final void AhwBna() {
        StateFlow<InterfaceC28695kfd> stateFlowEZpvd = EZpvd();
        if (stateFlowEZpvd != null) {
            C25390ivn.AEQbTJ(this, stateFlowEZpvd, Lifecycle.State.STARTED, new Application());
        }
    }

    /* JADX INFO: renamed from: o.ksP$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28695kfd interfaceC28695kfd, Continuation<? super Unit> continuation) {
            if (C29370ksP.this.fetchVPNInfo) {
                C29370ksP.this.OLrzqt(interfaceC28695kfd);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        AkhnZx().AYXKKw(ejfBZ());
        valueOf();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AkhnZx().gEmmrt(ejfBZ());
        fetchVPNInfo();
        if (this.isConnected) {
            DbNXlk().valueOf();
        }
    }

    public final void gEmmrt() {
        Job job = this.valueOf;
        if (job == null || !job.isActive()) {
            this.valueOf = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TrenchTabFragment$startDataCollection$1(this, null), 3, null);
        }
    }

    public final void isConnected() {
        MemeActivityViewModelV2.pauseUpdates$default(AkhnZx(), ejfBZ(), false, 2, null);
        Job job = this.valueOf;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.valueOf = null;
    }

    private final void AuCTel() {
        hAV hav = this.djBIcL;
        if (hav != null) {
            LinearLayoutCompat linearLayoutCompat = hav.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            RecyclerView recyclerView = hav.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(0);
            RecyclerView recyclerView2 = hav.DbNXlk;
            C28908kje c28908kjeDbNXlk = DbNXlk();
            this.isConnected = true;
            recyclerView2.setAdapter(c28908kjeDbNXlk);
            hav.DbNXlk.setClipToPadding(false);
            hav.DbNXlk.setItemAnimator(null);
            hav.DbNXlk.setPadding(0, 0, 0, C55298xhM.dp2px$default(24.0f, null, 1, null));
            RecyclerView.OnScrollListener onScrollListenerAEQbTJ = C28648kej.AEQbTJ(new Function0() { // from class: o.ktf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C29370ksP.fJNWhG(this.OLrzqt));
                }
            }, new Function0() { // from class: o.kti
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29370ksP.ejfBZ(this.EZpvd);
                }
            }, new Function0() { // from class: o.ksQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29370ksP.fIwbmz(this.KWHzl);
                }
            }, new Function0() { // from class: o.ksT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(C29370ksP.AuCTel(this.copydefault));
                }
            }, new Function0() { // from class: o.ksW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29370ksP.getNewProxyInstance(this.AEQbTJ);
                }
            }, new Function0() { // from class: o.ksV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29370ksP.hDKMBd(this.copydefault);
                }
            });
            this.AkhnZx = onScrollListenerAEQbTJ;
            RecyclerView recyclerView3 = hav.DbNXlk;
            Intrinsics.copydefault(onScrollListenerAEQbTJ);
            recyclerView3.addOnScrollListener(onScrollListenerAEQbTJ);
            C33546myW c33546myW = hav.AkhnZx;
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.ksS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C29370ksP.AEQbTJ(this.AEQbTJ, interfaceC57934yrl);
                }
            });
            c33546myW.djBIcL(true);
        }
    }

    public static final boolean fJNWhG(C29370ksP c29370ksP) {
        return c29370ksP.DbNXlk;
    }

    public static final Unit ejfBZ(C29370ksP c29370ksP) {
        c29370ksP.AkhnZx().copydefault(c29370ksP.ejfBZ(), false);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C29370ksP c29370ksP) {
        MemeActivityViewModelV2.pauseUpdates$default(c29370ksP.AkhnZx(), c29370ksP.ejfBZ(), false, 2, null);
        return Unit.INSTANCE;
    }

    public static final boolean AuCTel(C29370ksP c29370ksP) {
        return !((c29370ksP.EZpvd() != null ? r0.getValue() : null) instanceof InterfaceC28695kfd.Activity);
    }

    public static final Unit getNewProxyInstance(C29370ksP c29370ksP) {
        c29370ksP.DbNXlk().copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(C29370ksP c29370ksP) {
        c29370ksP.DbNXlk = false;
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C29370ksP c29370ksP, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c29370ksP.AkhnZx().djBIcL(c29370ksP.ejfBZ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(InterfaceC28694kfc interfaceC28694kfc) {
        final hAV hav = this.djBIcL;
        if (hav != null) {
            boolean z = interfaceC28694kfc instanceof InterfaceC28694kfc.TaskDescription;
            if (!z) {
                hav.AYXKKw.copydefault();
                hav.AkhnZx.AEQbTJ();
            }
            C55113xdn c55113xdn = hav.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(z ? 0 : 8);
            boolean z2 = interfaceC28694kfc instanceof InterfaceC28694kfc.Application;
            if (!z2) {
                DbNXlk().submitList(yDY.AhwBna());
            }
            C55173xeu c55173xeu = hav.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(((interfaceC28694kfc instanceof InterfaceC28694kfc.Activity) || (interfaceC28694kfc instanceof InterfaceC28694kfc.StateListAnimator)) ? 0 : 8);
            if (z2) {
                InterfaceC28694kfc.Application application = (InterfaceC28694kfc.Application) interfaceC28694kfc;
                if (!application.KWHzl().isEmpty()) {
                    RecyclerView recyclerView = hav.DbNXlk;
                    C28607kdv c28607kdvValues = values();
                    java.util.List<MemeUiModel> listKWHzl = application.KWHzl();
                    boolean zEZpvd = application.EZpvd();
                    Intrinsics.copydefault(recyclerView);
                    c28607kdvValues.EZpvd(listKWHzl, zEZpvd, recyclerView, ejfBZ(), AkhnZx());
                    C28908kje c28908kjeDbNXlk = DbNXlk();
                    this.isConnected = true;
                    c28908kjeDbNXlk.submitList(application.KWHzl(), new java.lang.Runnable() { // from class: o.ktd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29370ksP.EZpvd(this.EZpvd, hav);
                        }
                    });
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.Activity.KWHzl)) {
                C55173xeu c55173xeu2 = hav.copydefault;
                c55173xeu2.setEmptyTypeImage(7);
                java.lang.String string = c55173xeu2.getContext().getString(C23274hvD.Fragment.isConnected);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55173xeu2.setTitle(string);
                java.lang.String string2 = c55173xeu2.getContext().getString(C23274hvD.Fragment.EZpvd);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                c55173xeu2.setRetry(string2);
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.ktc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29370ksP.EZpvd(this.KWHzl, view);
                    }
                });
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.TaskDescription.EZpvd)) {
                C55113xdn.showLoading$default(hav.AYXKKw, 0L, 1, null);
            } else {
                if (!Intrinsics.EZpvd(interfaceC28694kfc, InterfaceC28694kfc.StateListAnimator.copydefault)) {
                    throw new NoWhenBranchMatchedException();
                }
                AYXKKw();
            }
        }
    }

    public static final void EZpvd(C29370ksP c29370ksP, hAV hav) {
        RecyclerView recyclerView = hav.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c29370ksP.copydefault(recyclerView);
    }

    public static final void EZpvd(C29370ksP c29370ksP, android.view.View view) {
        c29370ksP.AkhnZx().djBIcL(c29370ksP.ejfBZ());
    }

    public final void AYXKKw() {
        C55173xeu c55173xeu;
        final C28634keV c28634keVAEQbTJ = AkhnZx().AEQbTJ(ejfBZ());
        hAV hav = this.djBIcL;
        if (hav == null || (c55173xeu = hav.copydefault) == null) {
            return;
        }
        if (c28634keVAEQbTJ.AEQbTJ().copydefault().equals(c28634keVAEQbTJ.AEQbTJ().EZpvd()) && c28634keVAEQbTJ.KWHzl().equals(new MemeFilter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 0, -1, 31, (DefaultConstructorMarker) null))) {
            c55173xeu.setEmptyTypeImage(4);
            java.lang.String string = c55173xeu.getContext().getString(C23274hvD.Fragment.addSocket);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            c55173xeu.setRetry("");
            return;
        }
        c55173xeu.setEmptyTypeImage(7);
        java.lang.String string2 = c55173xeu.getContext().getString(C23274hvD.Fragment.isConnected);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setTitle(string2);
        java.lang.String string3 = c55173xeu.getContext().getString(C23274hvD.Fragment.MediaControllerCompatApi21Callback);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ksO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29370ksP.OLrzqt(this.AEQbTJ, c28634keVAEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(C29370ksP c29370ksP, C28634keV c28634keV, android.view.View view) {
        MemeActivityViewModelV2.modifyTabFilter$default(c29370ksP.AkhnZx(), c29370ksP.ejfBZ(), c28634keV.copydefault(), MemeProtocolFilterUiData.copy$default(c28634keV.AEQbTJ(), c28634keV.AEQbTJ().EZpvd(), null, null, 6, null), new MemeFilter((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 0, -1, 31, (DefaultConstructorMarker) null), false, 16, null);
    }

    public final void OLrzqt(InterfaceC28695kfd interfaceC28695kfd) {
        hAV hav = this.djBIcL;
        if (hav != null) {
            if (Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.ActionBar.KWHzl) || Intrinsics.EZpvd(interfaceC28695kfd, InterfaceC28695kfd.Activity.copydefault)) {
                RecyclerView recyclerView = hav.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                copydefault(recyclerView);
            }
        }
    }

    public final void copydefault(RecyclerView recyclerView) {
        if (recyclerView.getScrollState() != 1) {
            StateFlow<InterfaceC28695kfd> stateFlowEZpvd = EZpvd();
            if ((stateFlowEZpvd != null ? stateFlowEZpvd.getValue() : null) instanceof InterfaceC28695kfd.ActionBar) {
                this.DbNXlk = true;
                recyclerView.scrollToPosition(0);
            }
        }
    }

    public final void AEQbTJ(MemeUiModel memeUiModel) {
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.Dialog.EZpvd);
        C29229kph.AEQbTJ("quick_buy_button", ejfBZ());
        C28648kej.OLrzqt(this, memeUiModel, "default_trade");
    }

    public final void EZpvd(MemeUiModel memeUiModel) {
        C28648kej.AEQbTJ(this, memeUiModel, "default_trade", "scanner_trenches");
        C29229kph.AEQbTJ("token_detail", ejfBZ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, MemeUiModel memeUiModel, int i) {
        C28648kej.EZpvd(this, pair, memeUiModel, i, AkhnZx(), DbNXlk(), new Function0() { // from class: o.ktg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29370ksP.getFieldNames(this.copydefault);
            }
        });
    }

    public static final Unit getFieldNames(C29370ksP c29370ksP) {
        C28648kej.KWHzl(c29370ksP);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        hAV hav;
        RecyclerView recyclerView;
        super.onDestroyView();
        isConnected();
        RecyclerView.OnScrollListener onScrollListener = this.AkhnZx;
        if (onScrollListener != null && (hav = this.djBIcL) != null && (recyclerView = hav.DbNXlk) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.AkhnZx = null;
        if (this.isConnected) {
            DbNXlk().KWHzl();
        }
        values().AEQbTJ();
        this.djBIcL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            if (this.isConnected) {
                DbNXlk().EZpvd();
            }
        } else {
            C28648kej.OLrzqt(this);
            values().AEQbTJ();
            if (this.isConnected) {
                DbNXlk().valueOf();
            }
        }
    }
}
