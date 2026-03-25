package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.ui.WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingWalletPageStrategiesVM;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexui.widget.DexEmptyData;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC20007gXl;
import o.C23274hvD;
import o.InterfaceC19946gVe;
import o.gWO;
import o.gXU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gWk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19979gWk extends AbstractC19972gWd<C21525hCp> implements gUO, InterfaceC54847xXn {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gWu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19979gWk.AYXKKw(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.gWv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19979gWk.AhwBna(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.gWk$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyStatus.values().length];
            try {
                iArr[StrategyStatus.Pause.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyStatus.Active.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public C19979gWk() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingWalletPageStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.WalletPageCopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.WalletPageCopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.WalletPageCopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.gWk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gWk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19979gWk copydefault() {
            return new C19979gWk();
        }
    }

    public final CopyTradingWalletPageStrategiesVM AYXKKw() {
        return (CopyTradingWalletPageStrategiesVM) this.valueOf.getValue();
    }

    private final InterfaceC19969gWa AhwBna() {
        return (InterfaceC19969gWa) this.gEmmrt.getValue();
    }

    public static final C19971gWc AYXKKw(C19979gWk c19979gWk) {
        return new C19971gWc(c19979gWk);
    }

    private final C59534zip djBIcL() {
        return (C59534zip) this.AYXKKw.getValue();
    }

    public static final C59534zip AhwBna(final C19979gWk c19979gWk) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C19983gWo.class, new gVU(c19979gWk.AhwBna(), new Function1() { // from class: o.gWs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19979gWk.EZpvd(this.AEQbTJ, (C19983gWo) obj);
            }
        }, new Function1() { // from class: o.gWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19979gWk.OLrzqt(this.EZpvd, (C19983gWo) obj);
            }
        }));
        c59534zip.register(DexEmptyData.class, new C25449iwt(new Function0() { // from class: o.gWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19979gWk.gEmmrt(this.EZpvd);
            }
        }));
        c59534zip.register(C22264hcA.class, new C22314hcy(0, 0, 0, new Function0() { // from class: o.gWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19979gWk.valueOf(this.copydefault);
            }
        }, 7, null));
        c59534zip.register(gWC.class, new C19994gWz());
        return c59534zip;
    }

    public static final Unit EZpvd(C19979gWk c19979gWk, C19983gWo c19983gWo) {
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        c19979gWk.KWHzl(c19983gWo);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19979gWk c19979gWk, C19983gWo c19983gWo) {
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        c19979gWk.copydefault(c19983gWo);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C19979gWk c19979gWk) {
        c19979gWk.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C19979gWk c19979gWk) {
        c19979gWk.valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21525hCp OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21525hCp c21525hCpOLrzqt = C21525hCp.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21525hCpOLrzqt, "");
        return c21525hCpOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21525hCp c21525hCp, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21525hCp, "");
        c21525hCp.AEQbTJ.setAdapter(djBIcL());
        c21525hCp.AEQbTJ.setItemAnimator(null);
        AYXKKw().KWHzl();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        StateFlow<gWO> stateFlowAEQbTJ = AYXKKw().AEQbTJ();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C25390ivn.AEQbTJ(this, stateFlowAEQbTJ, state, new StateListAnimator());
        C25390ivn.AEQbTJ(this, AYXKKw().OLrzqt(), state, new Activity());
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.gWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19979gWk.EZpvd(this.OLrzqt, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19979gWk.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19979gWk.KWHzl((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19979gWk.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, AYXKKw().call());
    }

    /* JADX INFO: renamed from: o.gWk$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(gWO gwo, Continuation<? super Unit> continuation) {
            C19979gWk.this.AEQbTJ(gwo);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.gWk$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC20007gXl abstractC20007gXl, Continuation<? super Unit> continuation) {
            C19979gWk.this.KWHzl(abstractC20007gXl);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19979gWk c19979gWk, xXO xxo) {
        c19979gWk.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.gUO
    public void KWHzl() {
        valueOf();
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        valueOf();
        AYXKKw().djBIcL();
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        AYXKKw().gEmmrt();
        super.onInvisible();
    }

    private final void valueOf() {
        AYXKKw().copydefault(true);
    }

    public final void AEQbTJ(gWO gwo) {
        if (gwo instanceof gWO.ActionBar) {
            showLoader$default(this, false, 1, null);
            return;
        }
        if (gwo instanceof gWO.Application) {
            hideLoader$default(this, false, 1, null);
            OLrzqt(((gWO.Application) gwo).OLrzqt());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (gwo instanceof gWO.StateListAnimator) {
            hideLoader$default(this, false, 1, null);
            EZpvd(((gWO.StateListAnimator) gwo).KWHzl());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            if (!(gwo instanceof gWO.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            hideLoader$default(this, false, 1, null);
            djBIcL().setItems(C56402yEa.EZpvd(new gWC(((gWO.TaskDescription) gwo).OLrzqt())));
            djBIcL().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(AbstractC20007gXl abstractC20007gXl) {
        if (abstractC20007gXl instanceof AbstractC20007gXl.Activity) {
            copydefault(false);
            return;
        }
        if (abstractC20007gXl instanceof AbstractC20007gXl.TaskDescription) {
            OLrzqt(false);
            AbstractC20007gXl.TaskDescription taskDescription = (AbstractC20007gXl.TaskDescription) abstractC20007gXl;
            OLrzqt(taskDescription.OLrzqt(), taskDescription.KWHzl());
        } else if (abstractC20007gXl instanceof AbstractC20007gXl.ActionBar) {
            OLrzqt(false);
            KWHzl((AbstractC20007gXl.ActionBar) abstractC20007gXl);
        }
    }

    private final void OLrzqt(java.lang.String str, StrategyStatus strategyStatus) {
        AYXKKw().copydefault(true);
        int i = ActionBar.EZpvd[strategyStatus.ordinal()];
        int i2 = i != 1 ? i != 2 ? -1 : C23274hvD.Fragment.pause : C23274hvD.Fragment.config;
        if (i2 == -1) {
            return;
        }
        C55326xho.toast$default(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        AYXKKw().AhwBna();
    }

    private final void KWHzl(final AbstractC20007gXl.ActionBar actionBar) {
        AYXKKw().copydefault(true);
        if (actionBar.EZpvd()) {
            C22274hcK c22274hcK = C22274hcK.OLrzqt;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gWt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19979gWk.KWHzl(actionBar, this);
                }
            });
        } else if (actionBar.AEQbTJ() != null) {
            C25352ivB.AEQbTJ(actionBar.AEQbTJ());
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.copydefault())) {
            java.lang.String strCopydefault = actionBar.copydefault();
            if (strCopydefault != null) {
                C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
            }
        } else {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.RihMUf, 0, 1, (java.lang.Object) null);
        }
        AYXKKw().AhwBna();
    }

    public static final Unit KWHzl(AbstractC20007gXl.ActionBar actionBar, C19979gWk c19979gWk) {
        c19979gWk.AYXKKw().KWHzl(actionBar.OLrzqt(), actionBar.KWHzl() == StrategyStatus.Active);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<C19983gWo> list) {
        djBIcL().setItems(list);
        djBIcL().notifyDataSetChanged();
    }

    private final void KWHzl(C19983gWo c19983gWo) {
        AYXKKw().OLrzqt(TrackButtonName.COPY_DETAILS.getButtonName());
        gXU.Application application = gXU.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application.KWHzl(fragmentActivityRequireActivity, c19983gWo.valueOf());
    }

    private final void copydefault(C19983gWo c19983gWo) {
        AYXKKw().OLrzqt(c19983gWo.djBIcL() ? TrackButtonName.PAUSE_BUTTON.getButtonName() : TrackButtonName.START_BUTTON.getButtonName());
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletPageCopyTradingStrategiesFragment$toggleStrategyStatus$1(this, c19983gWo, null), 3, null);
    }

    public static /* synthetic */ void showLoader$default(C19979gWk c19979gWk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c19979gWk.copydefault(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        C55113xdn c55113xdn;
        RecyclerView recyclerView;
        if (z) {
            Intrinsics.checkNotNullExpressionValue(djBIcL().getItems(), "");
            if (!r0.isEmpty()) {
                return;
            }
        }
        if (z) {
            C21525hCp c21525hCp = (C21525hCp) fARcdN();
            if (c21525hCp != null) {
                KWHzl(c21525hCp);
            }
            C21525hCp c21525hCp2 = (C21525hCp) fARcdN();
            if (c21525hCp2 == null || (recyclerView = c21525hCp2.AEQbTJ) == null) {
                return;
            }
            C55418xja.AEQbTJ(recyclerView);
            return;
        }
        C21525hCp c21525hCp3 = (C21525hCp) fARcdN();
        if (c21525hCp3 == null || (c55113xdn = c21525hCp3.OLrzqt) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    public static /* synthetic */ void hideLoader$default(C19979gWk c19979gWk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c19979gWk.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(boolean z) {
        C55113xdn c55113xdn;
        RecyclerView recyclerView;
        if (z) {
            C21525hCp c21525hCp = (C21525hCp) fARcdN();
            if (c21525hCp == null || (recyclerView = c21525hCp.AEQbTJ) == null) {
                return;
            }
            C55418xja.EZpvd(recyclerView);
            return;
        }
        C21525hCp c21525hCp2 = (C21525hCp) fARcdN();
        if (c21525hCp2 == null || (c55113xdn = c21525hCp2.OLrzqt) == null) {
            return;
        }
        c55113xdn.copydefault();
    }

    private final void EZpvd(InterfaceC19946gVe interfaceC19946gVe) {
        if (interfaceC19946gVe instanceof InterfaceC19946gVe.StateListAnimator) {
            djBIcL().setItems(C56402yEa.EZpvd(new C22264hcA(C33070mpX.AYXKKw(C23274hvD.Fragment.RFmUsE), null, 2, null)));
            djBIcL().notifyDataSetChanged();
        } else {
            djBIcL().setItems(C56402yEa.EZpvd(new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 32, null)));
            djBIcL().notifyDataSetChanged();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C21525hCp c21525hCp) {
        RecyclerView recyclerView;
        C21525hCp c21525hCp2 = (C21525hCp) fARcdN();
        if (c21525hCp2 != null && (recyclerView = c21525hCp2.AEQbTJ) != null) {
            C55418xja.EZpvd(recyclerView);
        }
        RecyclerView recyclerView2 = c21525hCp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        C55418xja.KWHzl(recyclerView2, new C55363xiY(false, false, false, null, null, false, null, false, false, 3, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(C23274hvD.Activity.init), FrameMetricsAggregator.EVERY_DURATION, null));
        C55113xdn c55113xdn = c21525hCp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        C55418xja.KWHzl(c55113xdn, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AYXKKw().valueOf();
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        if (isAdded()) {
            AYXKKw().EZpvd();
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        if (isAdded()) {
            CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVMAYXKKw = AYXKKw();
            java.lang.Long lValueOf = java.lang.Long.valueOf(j2);
            if (!C33129mqd.AhwBna(java.lang.Long.valueOf(lValueOf.longValue()), -1)) {
                lValueOf = null;
            }
            java.lang.String string = lValueOf != null ? lValueOf.toString() : null;
            if (string == null) {
                string = "";
            }
            copyTradingWalletPageStrategiesVMAYXKKw.copydefault(string);
        }
    }
}
