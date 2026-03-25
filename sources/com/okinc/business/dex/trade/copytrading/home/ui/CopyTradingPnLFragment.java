package com.okinc.business.dex.trade.copytrading.home.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingHomeVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingPnLVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC20003gXh;
import o.C19945gVd;
import o.C19983gWo;
import o.C21522hCm;
import o.C22359hdq;
import o.C23274hvD;
import o.C25390ivn;
import o.C33069mpW;
import o.C43251rlk;
import o.C52794wYp;
import o.C55296xhK;
import o.C55326xho;
import o.C55363xiY;
import o.C55418xja;
import o.C56390yDp;
import o.C56423yEv;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC19944gVc;
import o.InterfaceC19946gVe;
import o.InterfaceC56387yDm;
import o.gKN;
import o.gLQ;
import o.gSN;
import o.gTI;
import o.gUO;
import o.gVV;
import o.gWR;
import o.gWU;
import o.rVN;
import o.yCM;
import o.yHT;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingPnLFragment extends gVV<C21522hCm> implements InterfaceC19944gVc, gUO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public InterfaceC19944gVc AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm EZpvd;
    public final ActivityResultLauncher<gSN.Application> KWHzl;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public gTI editStrategyNavigator;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(gSN.StateListAnimator stateListAnimator) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21522hCm EZpvd(CopyTradingPnLFragment copyTradingPnLFragment) {
        return (C21522hCm) copyTradingPnLFragment.fARcdN();
    }

    public CopyTradingPnLFragment() {
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.gVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                CopyTradingPnLFragment.KWHzl((gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingPnLVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$3
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$6
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingHomeVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$8
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$special$$inlined$activityViewModels$default$9
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
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final CopyTradingPnLFragment copydefault() {
            CopyTradingPnLFragment copyTradingPnLFragment = new CopyTradingPnLFragment();
            copyTradingPnLFragment.setArguments(new Bundle());
            return copyTradingPnLFragment;
        }
    }

    public final gTI EZpvd() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.gVV.AEQbTJ()V */
    public final CopyTradingPnLVM AEQbTJ() {
        return (CopyTradingPnLVM) this.AYXKKw.getValue();
    }

    private final CopyTradingStrategiesVM values() {
        return (CopyTradingStrategiesVM) this.EZpvd.getValue();
    }

    public final CopyTradingHomeVM OLrzqt() {
        return (CopyTradingHomeVM) this.copydefault.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21522hCm OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21522hCm c21522hCmAEQbTJ = C21522hCm.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21522hCmAEQbTJ, "");
        return c21522hCmAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21522hCm c21522hCm, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21522hCm, "");
        this.AEQbTJ = new C19945gVd(c21522hCm, AEQbTJ());
        c21522hCm.getRoot().setContentDescription("web3_dex_copytrading_home_container");
        c21522hCm.KWHzl.setContentDescription("web3_dex_copytrading_home_copytrade_btn");
        OLrzqt(c21522hCm);
        copydefault(c21522hCm);
        AEQbTJ().EZpvd();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return KWHzl(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            ConstraintLayout root;
            ConstraintLayout root2;
            if (z) {
                C21522hCm c21522hCmEZpvd = CopyTradingPnLFragment.EZpvd(CopyTradingPnLFragment.this);
                if (c21522hCmEZpvd != null && (root2 = c21522hCmEZpvd.getRoot()) != null) {
                    C55418xja.AEQbTJ(root2);
                }
            } else {
                C21522hCm c21522hCmEZpvd2 = CopyTradingPnLFragment.EZpvd(CopyTradingPnLFragment.this);
                if (c21522hCmEZpvd2 != null && (root = c21522hCmEZpvd2.getRoot()) != null) {
                    C55418xja.EZpvd(root);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C25390ivn.collectOnViewLifecycle$default(this, OLrzqt().OLrzqt(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().KWHzl(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(OLrzqt().copydefault(), OLrzqt().KWHzl(), values().OLrzqt(), AnonymousClass5.INSTANCE), null, new Application(), 2, null);
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(gWU gwu, Continuation<? super Unit> continuation) {
            C22359hdq c22359hdq;
            C21522hCm c21522hCmEZpvd = CopyTradingPnLFragment.EZpvd(CopyTradingPnLFragment.this);
            if (c21522hCmEZpvd != null && (c22359hdq = c21522hCmEZpvd.djBIcL) != null) {
                c22359hdq.OLrzqt(gwu);
            }
            if (gwu instanceof gWU.Activity) {
                rVN.reportFullyDrawn$default((Fragment) CopyTradingPnLFragment.this, true, (String) null, 2, (Object) null);
            } else if (gwu instanceof gWU.Application) {
                rVN.reportFullyDrawn$default((Fragment) CopyTradingPnLFragment.this, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingPnLFragment$setListener$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends AdaptedFunctionReference implements yHT<InterfaceC19946gVe, Boolean, gWR, Continuation<? super Triple<? extends InterfaceC19946gVe, ? extends Boolean, ? extends gWR>>, Object> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5() {
            super(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* synthetic */ Object invoke(InterfaceC19946gVe interfaceC19946gVe, Boolean bool, gWR gwr, Continuation<? super Triple<? extends InterfaceC19946gVe, ? extends Boolean, ? extends gWR>> continuation) {
            return invoke(interfaceC19946gVe, bool.booleanValue(), gwr, (Continuation<? super Triple<? extends InterfaceC19946gVe, Boolean, ? extends gWR>>) continuation);
        }

        public final Object invoke(InterfaceC19946gVe interfaceC19946gVe, boolean z, gWR gwr, Continuation<? super Triple<? extends InterfaceC19946gVe, Boolean, ? extends gWR>> continuation) {
            return CopyTradingPnLFragment.EZpvd(interfaceC19946gVe, z, gwr, continuation);
        }
    }

    public static final /* synthetic */ Object EZpvd(InterfaceC19946gVe interfaceC19946gVe, boolean z, gWR gwr, Continuation continuation) {
        return new Triple(interfaceC19946gVe, C56443yFo.KWHzl(z), gwr);
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(Triple<? extends InterfaceC19946gVe, Boolean, ? extends gWR> triple, Continuation<? super Unit> continuation) {
            C52794wYp c52794wYp;
            InterfaceC19946gVe interfaceC19946gVeComponent1 = triple.component1();
            boolean zBooleanValue = triple.component2().booleanValue();
            gWR gwrComponent3 = triple.component3();
            CopyTradingPnLFragment.this.KWHzl(interfaceC19946gVeComponent1);
            if (gwrComponent3 instanceof gWR.Activity) {
                return Unit.INSTANCE;
            }
            C21522hCm c21522hCmEZpvd = CopyTradingPnLFragment.EZpvd(CopyTradingPnLFragment.this);
            if (c21522hCmEZpvd != null && (c52794wYp = c21522hCmEZpvd.KWHzl) != null) {
                c52794wYp.setEnabled(CopyTradingPnLFragment.this.KWHzl(interfaceC19946gVeComponent1, zBooleanValue, gwrComponent3));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.hTH
    public void DbNXlk() {
        CopyTradingPnLVM.fetchCopyTradeStat$default(AEQbTJ(), null, false, 3, null);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        KWHzl();
    }

    @Override // o.InterfaceC19944gVc
    public void KWHzl(@NotNull InterfaceC19946gVe interfaceC19946gVe) {
        Intrinsics.checkNotNullParameter(interfaceC19946gVe, "");
        InterfaceC19944gVc interfaceC19944gVc = this.AEQbTJ;
        if (interfaceC19944gVc != null) {
            interfaceC19944gVc.KWHzl(interfaceC19946gVe);
        }
    }

    @Override // o.gUO
    public void KWHzl() {
        CopyTradingPnLVM.fetchCopyTradeStat$default(AEQbTJ(), null, true, 1, null);
    }

    public final boolean KWHzl(InterfaceC19946gVe interfaceC19946gVe, boolean z, gWR gwr) {
        if (z && (gwr instanceof gWR.TaskDescription)) {
            if (interfaceC19946gVe instanceof InterfaceC19946gVe.Activity) {
                InterfaceC19946gVe.Activity activity = (InterfaceC19946gVe.Activity) interfaceC19946gVe;
                if ((activity.OLrzqt() instanceof gLQ.PendingIntent) || (activity.OLrzqt() instanceof gLQ.TaskDescription) || (activity.OLrzqt() instanceof gLQ.StateListAnimator) || (activity.OLrzqt() instanceof gLQ.Application)) {
                }
            }
            return true;
        }
        return false;
    }

    public final void copydefault(C21522hCm c21522hCm) {
        C52794wYp c52794wYp = c21522hCm.KWHzl;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c21522hCm.EZpvd;
        c52794wYp2.setOnClickListener(new FragmentManager(c52794wYp2, 1000L, this));
    }

    public final void djBIcL() {
        List<C19983gWo> listOLrzqt;
        int iKWHzl;
        if (values().OLrzqt().getValue() instanceof gWR.TaskDescription) {
            gWR value = values().OLrzqt().getValue();
            Intrinsics.copydefault(value, "");
            listOLrzqt = ((gWR.TaskDescription) value).OLrzqt();
        } else {
            listOLrzqt = null;
        }
        if (listOLrzqt == null) {
            return;
        }
        if (values().KWHzl().getValue() instanceof AbstractC20003gXh.TaskDescription) {
            AbstractC20003gXh value2 = values().KWHzl().getValue();
            Intrinsics.copydefault(value2, "");
            iKWHzl = ((AbstractC20003gXh.TaskDescription) value2).KWHzl();
        } else {
            iKWHzl = 10;
        }
        if (listOLrzqt.size() < iKWHzl) {
            EZpvd().EZpvd(LifecycleOwnerKt.getLifecycleScope(this), this.KWHzl, (64 & 4) != 0 ? null : null, (64 & 8) != 0 ? null : null, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : DexTrackEventParameter.EditStrategyFrom.DASHBOARD, (64 & 64) != 0 ? null : null);
            OLrzqt().AEQbTJ(TrackButtonName.CREATE_TRADE.getButtonName());
        } else {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C23274hvD.Fragment.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(iKWHzl)))), 0, 1, (Object) null);
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ CopyTradingPnLFragment AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, CopyTradingPnLFragment copyTradingPnLFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = copyTradingPnLFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ CopyTradingPnLFragment OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, CopyTradingPnLFragment copyTradingPnLFragment) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = copyTradingPnLFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.valueOf();
            }
        }
    }

    public final void valueOf() {
        OLrzqt().AEQbTJ(TrackButtonName.LEADERBOARD.getButtonName());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((gKN) C43251rlk.copydefault(gKN.class)).AEQbTJ(activity);
        }
    }

    public final void OLrzqt(C21522hCm c21522hCm) {
        C52794wYp c52794wYp = c21522hCm.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        Integer numValueOf = Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        C55418xja.KWHzl(c52794wYp, new C55363xiY(false, false, true, 44, numValueOf, false, 36, false, false, 0, null, null, MTAnalysisConstants.MainWhat.ON_ACCOUNT, null));
        C52794wYp c52794wYp2 = c21522hCm.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        C55418xja.KWHzl(c52794wYp2, new C55363xiY(false, false, true, 44, numValueOf, false, 36, false, false, 0, null, null, MTAnalysisConstants.MainWhat.ON_ACCOUNT, null));
        LinearLayout linearLayout = c21522hCm.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        C55418xja.KWHzl(linearLayout, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AEQbTJ = null;
        AEQbTJ().copydefault();
        super.onDestroyView();
    }
}
