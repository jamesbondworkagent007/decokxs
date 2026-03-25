package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31197lpV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22355hdm extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public Function1<? super TradingType, Unit> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final C59534zip EZpvd;
    public C23489hzG KWHzl;
    public final InterfaceC56387yDm copydefault;

    public C22355hdm() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new Application(this)));
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hdr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22355hdm.copydefault(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C22355hdm.OLrzqt(this.KWHzl));
            }
        });
        this.EZpvd = new C59534zip();
    }

    /* JADX INFO: renamed from: o.hdm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hdm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C22355hdm OLrzqt(@NotNull TradingType tradingType, boolean z, @NotNull Function1<? super TradingType, Unit> function1) {
            Intrinsics.checkNotNullParameter(tradingType, "");
            Intrinsics.checkNotNullParameter(function1, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("extra_universal_1", tradingType.getTypeValue());
            bundle.putBoolean("extra_transaction_dialog_style", z);
            C22355hdm c22355hdm = new C22355hdm();
            c22355hdm.setArguments(bundle);
            c22355hdm.AYXKKw = function1;
            return c22355hdm;
        }
    }

    /* JADX INFO: renamed from: o.hdm$Application */
    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.copydefault, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof DexHomeFragment) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.copydefault.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    private final DexHomeViewModel OLrzqt() {
        return (DexHomeViewModel) this.copydefault.getValue();
    }

    public final TradingType EZpvd() {
        return (TradingType) this.AEQbTJ.getValue();
    }

    public static final TradingType copydefault(C22355hdm c22355hdm) {
        java.lang.String string;
        TradingType tradingTypeKWHzl;
        android.os.Bundle arguments = c22355hdm.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_1")) == null || (tradingTypeKWHzl = TradingType.Companion.KWHzl(string)) == null) ? TradingType.Swap : tradingTypeKWHzl;
    }

    private final boolean copydefault() {
        return ((java.lang.Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(C22355hdm c22355hdm) {
        android.os.Bundle arguments = c22355hdm.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_transaction_dialog_style");
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.util.List<java.lang.Object> listFetchVPNInfo;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C23489hzG c23489hzGOLrzqt = C23489hzG.OLrzqt(getLayoutInflater(), constraintLayout, true);
        this.KWHzl = c23489hzGOLrzqt;
        if (c23489hzGOLrzqt != null) {
            c23489hzGOLrzqt.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
            c23489hzGOLrzqt.AEQbTJ.setAdapter(this.EZpvd);
            this.EZpvd.register(C28244kUf.class, new C22352hdj());
            this.EZpvd.register(C22353hdk.class, new C22351hdi(EZpvd(), new Function1() { // from class: o.hdo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22355hdm.EZpvd(this.copydefault, (C22353hdk) obj);
                }
            }));
        }
        if (!OLrzqt().ejfBZ() && !copydefault()) {
            listFetchVPNInfo = OLrzqt().fetchVPNInfo();
        } else {
            java.util.List<TradingType> listOLrzqt = TradingType.Companion.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (TradingType tradingType : listOLrzqt) {
                arrayList.add(new C22353hdk(tradingType, OLrzqt().AEQbTJ(tradingType), false, 4, null));
            }
            listFetchVPNInfo = arrayList;
        }
        C33064mpR.OLrzqt(this.EZpvd, (java.util.List<? extends java.lang.Object>) listFetchVPNInfo);
    }

    public static final Unit EZpvd(C22355hdm c22355hdm, C22353hdk c22353hdk) {
        Intrinsics.checkNotNullParameter(c22353hdk, "");
        if (!c22353hdk.AEQbTJ()) {
            return Unit.INSTANCE;
        }
        Function1<? super TradingType, Unit> function1 = c22355hdm.AYXKKw;
        if (function1 != null) {
            function1.invoke(c22353hdk.KWHzl());
        }
        c22355hdm.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
