package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$toggleStrategyStatus$1;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingHomeVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexui.widget.DexEmptyData;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
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
import o.gWR;
import o.gXU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19965gVx extends gVY<C21523hCn> implements gUO {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.gVx$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    public C19965gVx() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingHomeVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesFragment$special$$inlined$activityViewModels$default$6
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
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.gVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C19965gVx.djBIcL(this.OLrzqt));
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.gVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19965gVx.gEmmrt(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.gVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19965gVx.AYXKKw(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.gVx$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gVx.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C19965gVx newInstance$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return activity.KWHzl(z);
        }

        public final C19965gVx KWHzl(boolean z) {
            C19965gVx c19965gVx = new C19965gVx();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key.is_history", z);
            c19965gVx.setArguments(bundle);
            return c19965gVx;
        }
    }

    public final CopyTradingStrategiesVM OLrzqt() {
        return (CopyTradingStrategiesVM) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gVY.AEQbTJ()V */
    public final CopyTradingStrategiesVM AEQbTJ() {
        return (CopyTradingStrategiesVM) this.djBIcL.getValue();
    }

    private final CopyTradingHomeVM values() {
        return (CopyTradingHomeVM) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AkhnZx() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean djBIcL(C19965gVx c19965gVx) {
        android.os.Bundle arguments = c19965gVx.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key.is_history", false);
        }
        return false;
    }

    public final InterfaceC19969gWa EZpvd() {
        return (InterfaceC19969gWa) this.OLrzqt.getValue();
    }

    public static final C19971gWc gEmmrt(C19965gVx c19965gVx) {
        return new C19971gWc(c19965gVx);
    }

    private final C59534zip djBIcL() {
        return (C59534zip) this.EZpvd.getValue();
    }

    public static final C59534zip AYXKKw(final C19965gVx c19965gVx) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C19983gWo.class, new gVU(c19965gVx.EZpvd(), new Function1() { // from class: o.gVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19965gVx.OLrzqt(this.OLrzqt, (C19983gWo) obj);
            }
        }, new Function1() { // from class: o.gVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19965gVx.EZpvd(this.EZpvd, (C19983gWo) obj);
            }
        }));
        c59534zip.register(DexEmptyData.class, new C25449iwt(new Function0() { // from class: o.gVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19965gVx.values(this.AEQbTJ);
            }
        }));
        c59534zip.register(C22264hcA.class, new C22314hcy(0, 0, 0, new Function0() { // from class: o.gVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19965gVx.fetchVPNInfo(this.OLrzqt);
            }
        }, 7, null));
        c59534zip.register(gWC.class, new C19994gWz());
        return c59534zip;
    }

    public static final Unit OLrzqt(C19965gVx c19965gVx, C19983gWo c19983gWo) {
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        c19965gVx.EZpvd(c19983gWo);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19965gVx c19965gVx, C19983gWo c19983gWo) {
        Intrinsics.checkNotNullParameter(c19983gWo, "");
        c19965gVx.AEQbTJ(c19983gWo);
        return Unit.INSTANCE;
    }

    public static final Unit values(C19965gVx c19965gVx) {
        c19965gVx.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C19965gVx c19965gVx) {
        c19965gVx.valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21523hCn OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21523hCn c21523hCnCopydefault = C21523hCn.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21523hCnCopydefault, "");
        return c21523hCnCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21523hCn c21523hCn, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21523hCn, "");
        c21523hCn.copydefault.djBIcL(false);
        c21523hCn.copydefault.AhwBna(AkhnZx());
        c21523hCn.copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.gVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C19965gVx.OLrzqt(this.copydefault, interfaceC57934yrl);
            }
        });
        c21523hCn.gEmmrt.setAdapter(djBIcL());
        c21523hCn.gEmmrt.setItemAnimator(null);
        c21523hCn.gEmmrt.addItemDecoration(new StateListAnimator());
        AEQbTJ().EZpvd();
    }

    public static final void OLrzqt(C19965gVx c19965gVx, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c19965gVx.isConnected();
    }

    /* JADX INFO: renamed from: o.gVx$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) == state.getItemCount() - 1) {
                rect.bottom = C55298xhM.dpInt$default(40, (android.content.Context) null, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.gVx$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                C19965gVx.showLoader$default(C19965gVx.this, false, 1, null);
            } else {
                C19965gVx.hideLoader$default(C19965gVx.this, false, 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C25390ivn.collectOnViewLifecycle$default(this, values().OLrzqt(), null, new Application(), 2, null);
        StateFlow<gWR> stateFlowOLrzqt = AEQbTJ().OLrzqt();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C25390ivn.AEQbTJ(this, stateFlowOLrzqt, state, new ActionBar());
        C25390ivn.AEQbTJ(this, OLrzqt().OLrzqt(), state, new Fragment());
        C25390ivn.AEQbTJ(this, AEQbTJ().copydefault(), state, new Dialog());
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.gVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19965gVx.KWHzl(this.EZpvd, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19965gVx.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19965gVx.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19965gVx.EZpvd(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, AEQbTJ().call());
    }

    /* JADX INFO: renamed from: o.gVx$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(gWR gwr, Continuation<? super Unit> continuation) {
            if (!C19965gVx.this.AkhnZx()) {
                C19965gVx.this.copydefault(gwr);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.gVx$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(gWR gwr, Continuation<? super Unit> continuation) {
            if (C19965gVx.this.AkhnZx()) {
                C19965gVx.this.copydefault(gwr);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.gVx$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC20007gXl abstractC20007gXl, Continuation<? super Unit> continuation) {
            C19965gVx.this.AEQbTJ(abstractC20007gXl);
            return Unit.INSTANCE;
        }
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C19965gVx c19965gVx, xXO xxo) {
        c19965gVx.valueOf();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.gUO
    public void KWHzl() {
        valueOf();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        valueOf();
    }

    private final void valueOf() {
        if (AkhnZx()) {
            CopyTradingStrategiesVM.fetchStrategies$default(OLrzqt(), true, true, false, 4, null);
        } else {
            CopyTradingStrategiesVM.fetchStrategies$default(AEQbTJ(), true, false, false, 4, null);
        }
    }

    public final void copydefault(gWR gwr) {
        if (gwr instanceof gWR.Activity) {
            if (AkhnZx() && ((gWR.Activity) gwr).OLrzqt()) {
                showLoader$default(this, false, 1, null);
                return;
            }
            return;
        }
        if (gwr instanceof gWR.TaskDescription) {
            if (AkhnZx()) {
                hideLoader$default(this, false, 1, null);
            }
            gWR.TaskDescription taskDescription = (gWR.TaskDescription) gwr;
            OLrzqt(taskDescription.OLrzqt(), taskDescription.EZpvd());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return;
        }
        if (gwr instanceof gWR.ActionBar) {
            if (AkhnZx()) {
                hideLoader$default(this, false, 1, null);
            }
            gWR.ActionBar actionBar = (gWR.ActionBar) gwr;
            values().EZpvd(actionBar.KWHzl());
            copydefault(actionBar.KWHzl());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void AEQbTJ(AbstractC20007gXl abstractC20007gXl) {
        if (abstractC20007gXl instanceof AbstractC20007gXl.Activity) {
            EZpvd(false);
            return;
        }
        if (abstractC20007gXl instanceof AbstractC20007gXl.TaskDescription) {
            copydefault(false);
            AbstractC20007gXl.TaskDescription taskDescription = (AbstractC20007gXl.TaskDescription) abstractC20007gXl;
            OLrzqt(taskDescription.OLrzqt(), taskDescription.KWHzl());
        } else if (abstractC20007gXl instanceof AbstractC20007gXl.ActionBar) {
            copydefault(false);
            AEQbTJ((AbstractC20007gXl.ActionBar) abstractC20007gXl);
        }
    }

    public final void OLrzqt(java.lang.String str, StrategyStatus strategyStatus) {
        if (AkhnZx()) {
            return;
        }
        CopyTradingStrategiesVM.fetchStrategies$default(AEQbTJ(), true, false, false, 4, null);
        int i = TaskDescription.KWHzl[strategyStatus.ordinal()];
        int i2 = i != 1 ? i != 2 ? -1 : C23274hvD.Fragment.pause : C23274hvD.Fragment.config;
        if (i2 == -1) {
            return;
        }
        C55326xho.toast$default(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        AEQbTJ().gEmmrt();
    }

    public final void AEQbTJ(final AbstractC20007gXl.ActionBar actionBar) {
        if (AkhnZx()) {
            return;
        }
        if (actionBar.EZpvd()) {
            C22274hcK c22274hcK = C22274hcK.OLrzqt;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gVE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19965gVx.AEQbTJ(actionBar, this);
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
        AEQbTJ().gEmmrt();
    }

    public static final Unit AEQbTJ(AbstractC20007gXl.ActionBar actionBar, C19965gVx c19965gVx) {
        c19965gVx.AEQbTJ().KWHzl(actionBar.OLrzqt(), actionBar.KWHzl() == StrategyStatus.Active);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.util.List<C19983gWo> list, boolean z) {
        C33546myW c33546myW;
        C33546myW c33546myW2;
        boolean z2 = false;
        if (list.isEmpty()) {
            KWHzl(false);
        } else {
            djBIcL().setItems(list);
            djBIcL().notifyDataSetChanged();
        }
        C21523hCn c21523hCn = (C21523hCn) fARcdN();
        if (c21523hCn != null && (c33546myW2 = c21523hCn.copydefault) != null) {
            if (AkhnZx() && z) {
                z2 = true;
            }
            c33546myW2.AhwBna(z2);
        }
        C21523hCn c21523hCn2 = (C21523hCn) fARcdN();
        if (c21523hCn2 == null || (c33546myW = c21523hCn2.copydefault) == null) {
            return;
        }
        c33546myW.valueOf();
    }

    public final void EZpvd(C19983gWo c19983gWo) {
        values().AEQbTJ(TrackButtonName.COPY_DETAILS.getButtonName());
        gXU.Application application = gXU.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application.KWHzl(fragmentActivityRequireActivity, c19983gWo.valueOf());
    }

    public final void AEQbTJ(C19983gWo c19983gWo) {
        values().AEQbTJ(c19983gWo.djBIcL() ? TrackButtonName.PAUSE_BUTTON.getButtonName() : TrackButtonName.START_BUTTON.getButtonName());
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingStrategiesFragment$toggleStrategyStatus$1(this, c19983gWo, null), 3, null);
    }

    public static /* synthetic */ void showLoader$default(C19965gVx c19965gVx, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c19965gVx.EZpvd(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C55113xdn c55113xdn;
        RecyclerView recyclerView;
        if (z) {
            C21523hCn c21523hCn = (C21523hCn) fARcdN();
            if (c21523hCn != null) {
                EZpvd(c21523hCn);
            }
            C21523hCn c21523hCn2 = (C21523hCn) fARcdN();
            if (c21523hCn2 == null || (recyclerView = c21523hCn2.gEmmrt) == null) {
                return;
            }
            C55418xja.AEQbTJ(recyclerView);
            return;
        }
        C21523hCn c21523hCn3 = (C21523hCn) fARcdN();
        if (c21523hCn3 == null || (c55113xdn = c21523hCn3.AEQbTJ) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    public static /* synthetic */ void hideLoader$default(C19965gVx c19965gVx, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c19965gVx.copydefault(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        C55113xdn c55113xdn;
        RecyclerView recyclerView;
        if (z) {
            C21523hCn c21523hCn = (C21523hCn) fARcdN();
            if (c21523hCn == null || (recyclerView = c21523hCn.gEmmrt) == null) {
                return;
            }
            C55418xja.EZpvd(recyclerView);
            return;
        }
        C21523hCn c21523hCn2 = (C21523hCn) fARcdN();
        if (c21523hCn2 == null || (c55113xdn = c21523hCn2.AEQbTJ) == null) {
            return;
        }
        c55113xdn.copydefault();
    }

    public final void copydefault(InterfaceC19946gVe interfaceC19946gVe) {
        if (interfaceC19946gVe instanceof InterfaceC19946gVe.StateListAnimator) {
            djBIcL().setItems(C56402yEa.EZpvd(new C22264hcA(C33070mpX.AYXKKw(C23274hvD.Fragment.RFmUsE), null, 2, null)));
            djBIcL().notifyDataSetChanged();
        } else {
            KWHzl(true);
        }
    }

    public final void KWHzl(boolean z) {
        DexEmptyData dexEmptyData;
        C59534zip c59534zipDjBIcL = djBIcL();
        if (z) {
            dexEmptyData = new DexEmptyData(8, C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt), C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 32, null);
        } else {
            dexEmptyData = new DexEmptyData(6, C33070mpX.AYXKKw(C23274hvD.Fragment.DMb), null, null, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, 44, null);
        }
        c59534zipDjBIcL.setItems(C56402yEa.EZpvd(dexEmptyData));
        djBIcL().notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(C21523hCn c21523hCn) {
        RecyclerView recyclerView;
        C21523hCn c21523hCn2 = (C21523hCn) fARcdN();
        if (c21523hCn2 != null && (recyclerView = c21523hCn2.gEmmrt) != null) {
            C55418xja.EZpvd(recyclerView);
        }
        RecyclerView recyclerView2 = c21523hCn.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        C55418xja.KWHzl(recyclerView2, new C55363xiY(false, false, false, null, null, false, null, false, false, 3, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(C23274hvD.Activity.init), FrameMetricsAggregator.EVERY_DURATION, null));
        C33603mza c33603mza = c21523hCn.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33603mza, "");
        C55418xja.KWHzl(c33603mza, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
        C55113xdn c55113xdn = c21523hCn.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        C55418xja.KWHzl(c55113xdn, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
    }

    private final void isConnected() {
        OLrzqt().AEQbTJ();
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AEQbTJ().AhwBna();
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33016moW
    public boolean onRefresh(@NotNull java.lang.Object obj, @NotNull InterfaceC33014moU interfaceC33014moU) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(interfaceC33014moU, "");
        if (isAdded()) {
            if (AkhnZx()) {
                OLrzqt().OLrzqt(true);
            } else {
                AEQbTJ().OLrzqt(false);
            }
        }
        return super.onRefresh(obj, interfaceC33014moU);
    }
}
