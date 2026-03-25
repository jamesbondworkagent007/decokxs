package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.api.BSCProConvertEntranceParameters;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C6814aWV;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lOH extends lOL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC31466luZ AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public TargetTab AEQbTJ = TargetTab.CONVERT;
    public boolean copydefault = true;
    public final java.lang.Object KWHzl = new java.lang.Object();

    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TargetTab.values().length];
            try {
                iArr[TargetTab.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TargetTab.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetTab.CONVERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C31351lsQ.ActionBar.DTwDnp;
    }

    public lOH() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.pro.entrance.BSCProContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.pro.entrance.BSCProContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.pro.entrance.BSCProContainerFragment$special$$inlined$activityViewModels$default$3
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

    private final BSCMasterViewModel djBIcL() {
        return (BSCMasterViewModel) this.EZpvd.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC31466luZ abstractC31466luZAEQbTJ = AbstractC31466luZ.AEQbTJ(layoutInflater, viewGroup, false);
        this.AhwBna = abstractC31466luZAEQbTJ;
        if (abstractC31466luZAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC31466luZAEQbTJ = null;
        }
        android.view.View root = abstractC31466luZAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C6814aWV.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final java.lang.Object obj = this.KWHzl;
        abstractC58185ywXEZpvd.subscribe(new RxBus.EventCallback<C6814aWV>(obj) { // from class: com.okinc.buysell.ui.pro.entrance.BSCProContainerFragment$initView$1
            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C6814aWV c6814aWV) {
                Intrinsics.checkNotNullParameter(c6814aWV, "");
                pUU.KWHzl(this.this$0.getTAG(), "listener: " + c6814aWV.EZpvd() + " bundle: " + c6814aWV.AEQbTJ());
                this.this$0.KWHzl(c6814aWV.AEQbTJ());
            }
        });
        gEmmrt();
        KWHzl();
    }

    private final void gEmmrt() {
        djBIcL().iwGUEr().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.lON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lOH.copydefault(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit copydefault(lOH loh, java.lang.Integer num) {
        TargetTab targetTab;
        int index = BSCTabIndex.BUY.getIndex();
        if (num != null && num.intValue() == index) {
            targetTab = TargetTab.BUY;
        } else {
            targetTab = (num != null && num.intValue() == BSCTabIndex.SELL.getIndex()) ? TargetTab.SELL : TargetTab.CONVERT;
        }
        loh.AEQbTJ = targetTab;
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        BSCLevel bSCLevel;
        if (this.copydefault && getChildFragmentManager().findFragmentById(C31351lsQ.Application.hrjNmC) == null) {
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (bSCLevel = (BSCLevel) arguments.getParcelable("arg_level")) == null) {
                bSCLevel = BSCLevel.LEVEL1;
            }
            android.os.Bundle arguments2 = getArguments();
            BSCProConvertEntranceParameters bSCProConvertEntranceParameters = arguments2 != null ? (BSCProConvertEntranceParameters) arguments2.getParcelable("arg_prefilled_pro_convert_parameters") : null;
            java.lang.String strKWHzl = this.AEQbTJ == TargetTab.CONVERT ? bSCProConvertEntranceParameters != null ? bSCProConvertEntranceParameters.KWHzl() : null : null;
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            copydefault(bSCLevel, strKWHzl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(android.os.Bundle bundle) {
        TargetTab targetTab;
        java.lang.String string = bundle.getString("target_tab");
        if (string == null) {
            targetTab = TargetTab.CONVERT;
        } else {
            int iHashCode = string.hashCode();
            if (iHashCode != 245348956) {
                if (iHashCode == 1197917480 && string.equals("sell_tab")) {
                    targetTab = TargetTab.SELL;
                }
            } else if (string.equals("buy_tab")) {
                targetTab = TargetTab.BUY;
            }
        }
        this.AEQbTJ = targetTab;
        java.lang.String string2 = bundle.getString("fromCurrency");
        if (string2 == null) {
            string2 = "";
        }
        if (this.AEQbTJ == TargetTab.CONVERT && string2.length() > 0) {
            copydefault(BSCLevel.LEVEL1, string2);
        } else {
            djBIcL().AEQbTJ(OLrzqt());
        }
    }

    /* JADX DEBUG: Possible override for method o.lOL.OLrzqt()V */
    public final BSCTabIndex OLrzqt() {
        int i = Activity.AEQbTJ[this.AEQbTJ.ordinal()];
        if (i == 1) {
            return BSCTabIndex.BUY;
        }
        if (i == 2) {
            return BSCTabIndex.SELL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BSCTabIndex.CONVERT;
    }

    public final void copydefault(BSCLevel bSCLevel, java.lang.String str) {
        if (this.copydefault) {
            this.copydefault = false;
        }
        getChildFragmentManager().beginTransaction().replace(C31351lsQ.Application.hrjNmC, BSCMasterFragmentV3.Companion.EZpvd(bSCLevel, new BuySellConvertParameters(OKPaymentSource.PAYMENT_INTERNAL_FLOW, this.AEQbTJ, str, null, null, null, null, null, null, null, null, null, false, null, null, true, false, 98296, null))).commit();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        RxBus.AEQbTJ(C6814aWV.class);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lOH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ lOH newInstance$default(TaskDescription taskDescription, BSCLevel bSCLevel, BSCProConvertEntranceParameters bSCProConvertEntranceParameters, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                bSCProConvertEntranceParameters = null;
            }
            return taskDescription.copydefault(bSCLevel, bSCProConvertEntranceParameters);
        }

        public final lOH copydefault(@NotNull BSCLevel bSCLevel, BSCProConvertEntranceParameters bSCProConvertEntranceParameters) {
            Intrinsics.checkNotNullParameter(bSCLevel, "");
            lOH loh = new lOH();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("arg_level", bSCLevel);
            if (bSCProConvertEntranceParameters != null) {
                bundle.putParcelable("arg_prefilled_pro_convert_parameters", bSCProConvertEntranceParameters);
            }
            loh.setArguments(bundle);
            return loh;
        }
    }
}
