package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedDefaultListEvents;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC30608leP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lgM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30711lgM extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super UIPricingToken, Unit> KWHzl;
    public AdvancedTradeType EZpvd = AdvancedTradeType.BUY;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.lgN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30711lgM.KWHzl(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.lgM$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C30711lgM() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedPlaceOrderVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPricingTokenSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPricingTokenSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPricingTokenSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.lgM$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lgM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lgM$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C30711lgM newInstance$default(ActionBar actionBar, AdvancedTradeType advancedTradeType, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return actionBar.EZpvd(advancedTradeType, function1);
        }

        public final C30711lgM EZpvd(@NotNull AdvancedTradeType advancedTradeType, Function1<? super UIPricingToken, Unit> function1) {
            Intrinsics.checkNotNullParameter(advancedTradeType, "");
            C30711lgM c30711lgM = new C30711lgM();
            c30711lgM.EZpvd = advancedTradeType;
            c30711lgM.KWHzl = function1;
            return c30711lgM;
        }
    }

    private final AdvancedPlaceOrderVM AEQbTJ() {
        return (AdvancedPlaceOrderVM) this.AEQbTJ.getValue();
    }

    public final C30723lgY OLrzqt() {
        return (C30723lgY) this.OLrzqt.getValue();
    }

    public static final C30723lgY KWHzl(final C30711lgM c30711lgM) {
        return new C30723lgY(new Function1() { // from class: o.lgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30711lgM.OLrzqt(this.KWHzl, (UIPricingToken) obj);
            }
        });
    }

    public static final Unit OLrzqt(C30711lgM c30711lgM, UIPricingToken uIPricingToken) {
        Intrinsics.checkNotNullParameter(uIPricingToken, "");
        c30711lgM.copydefault(AdvancedDefaultListEvents.TokenSelect);
        Function1<? super UIPricingToken, Unit> function1 = c30711lgM.KWHzl;
        if (function1 != null) {
            function1.invoke(uIPricingToken);
        }
        c30711lgM.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        int i;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        int i2 = StateListAnimator.KWHzl[this.EZpvd.ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.putRating;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.putText;
        }
        wxq.setTitle(C33070mpX.AYXKKw(i));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl();
        C23414hxl.OLrzqt(getCustomLayoutInflater(), constraintLayout, true).OLrzqt.setAdapter(OLrzqt());
        OLrzqt().setItems(AEQbTJ().zsXlph().getValue());
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        copydefault(AdvancedDefaultListEvents.Back);
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

    private final Unit KWHzl() {
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP == null) {
            return null;
        }
        InterfaceC30608leP.ActionBar.trackView$default(interfaceC30608leP, "advanced_tokenlist", null, 2, null);
        return Unit.INSTANCE;
    }
}
