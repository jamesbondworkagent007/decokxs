package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthDisplayEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDepthTierEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.OrderFilter;
import com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC30608leP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lfs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30690lfs extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public Function1<? super C55276xgr, Unit> AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public AdvancedMarketFilter EZpvd = AdvancedMarketFilter.SWITCH_FILTER;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lfx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30690lfs.copydefault(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.lfs$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedMarketFilter.values().length];
            try {
                iArr[AdvancedMarketFilter.AMOUNTS_FILTER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedMarketFilter.SWITCH_FILTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public C30690lfs() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMarketInfoVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilterSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilterSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.orderbook.AdvancedMarketFilterSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.lfs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lfs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C30690lfs OLrzqt(@NotNull AdvancedMarketFilter advancedMarketFilter, @NotNull Function1<? super C55276xgr, Unit> function1) {
            Intrinsics.checkNotNullParameter(advancedMarketFilter, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C30690lfs c30690lfs = new C30690lfs();
            c30690lfs.AEQbTJ = function1;
            c30690lfs.EZpvd = advancedMarketFilter;
            return c30690lfs;
        }
    }

    public final AdvancedMarketInfoVM OLrzqt() {
        return (AdvancedMarketInfoVM) this.KWHzl.getValue();
    }

    public final C30688lfq AEQbTJ() {
        return (C30688lfq) this.copydefault.getValue();
    }

    public static final C30688lfq copydefault(final C30690lfs c30690lfs) {
        return new C30688lfq(c30690lfs.EZpvd, new Function1() { // from class: o.lfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30690lfs.AEQbTJ(this.copydefault, (C55276xgr) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C30690lfs c30690lfs, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c30690lfs.copydefault(c55276xgr);
        Function1<? super C55276xgr, Unit> function1 = c30690lfs.AEQbTJ;
        if (function1 != null) {
            function1.invoke(c55276xgr);
        }
        c30690lfs.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.List<C55276xgr> value;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd();
        C23414hxl c23414hxlOLrzqt = C23414hxl.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
        c23414hxlOLrzqt.OLrzqt.setContentDescription("web3_dex_selection_sheet_container");
        c23414hxlOLrzqt.OLrzqt.setAdapter(AEQbTJ());
        C30688lfq c30688lfqAEQbTJ = AEQbTJ();
        int i = TaskDescription.AEQbTJ[this.EZpvd.ordinal()];
        if (i == 1) {
            value = OLrzqt().KWHzl().getValue();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            value = OLrzqt().AEQbTJ().getValue();
        }
        c30688lfqAEQbTJ.setItems(value);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        InterfaceC30619lea interfaceC30619lea;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        int i = TaskDescription.AEQbTJ[this.EZpvd.ordinal()];
        if (i == 1) {
            interfaceC30619lea = AdvancedDepthTierEvents.Close;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC30619lea = AdvancedDepthDisplayEvents.Close;
        }
        copydefault(interfaceC30619lea);
        super.onDismiss(dialogInterface);
    }

    private final Unit copydefault(InterfaceC30619lea interfaceC30619lea) {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP == null) {
            return null;
        }
        InterfaceC30608leP.ActionBar.trackEvent$default(interfaceC30608leP, interfaceC30619lea, null, 2, null);
        return Unit.INSTANCE;
    }

    public final Unit EZpvd() {
        java.lang.String str;
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP == null) {
            return null;
        }
        int i = TaskDescription.AEQbTJ[this.EZpvd.ordinal()];
        if (i == 1) {
            str = "advanced_depthtier";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "advanced_depthdisplay";
        }
        InterfaceC30608leP.ActionBar.trackView$default(interfaceC30608leP, str, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(C55276xgr c55276xgr) {
        InterfaceC30619lea interfaceC30619leaAEQbTJ;
        int i = TaskDescription.AEQbTJ[this.EZpvd.ordinal()];
        if (i == 1) {
            interfaceC30619leaAEQbTJ = AEQbTJ(c55276xgr);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC30619leaAEQbTJ = KWHzl(c55276xgr);
        }
        copydefault(interfaceC30619leaAEQbTJ);
    }

    public final InterfaceC30619lea KWHzl(C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        return objOLrzqt == OrderFilter.Amount ? AdvancedDepthDisplayEvents.Amount : objOLrzqt == OrderFilter.Volume ? AdvancedDepthDisplayEvents.Value : AdvancedDepthDisplayEvents.Value;
    }

    public final InterfaceC30619lea AEQbTJ(C55276xgr c55276xgr) {
        java.util.List<?> items = AEQbTJ().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) items), c55276xgr);
        if (iCopydefault == 0) {
            return AdvancedDepthTierEvents.All;
        }
        if (iCopydefault == 1) {
            return AdvancedDepthTierEvents.One;
        }
        if (iCopydefault == 2) {
            return AdvancedDepthTierEvents.Two;
        }
        if (iCopydefault == 3) {
            return AdvancedDepthTierEvents.Three;
        }
        if (iCopydefault == 4) {
            return AdvancedDepthTierEvents.Four;
        }
        if (iCopydefault == 5) {
            return AdvancedDepthTierEvents.Five;
        }
        return AdvancedDepthTierEvents.All;
    }
}
