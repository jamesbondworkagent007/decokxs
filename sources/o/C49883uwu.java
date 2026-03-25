package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridAdjustLeverPresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49883uwu extends AbstractC49732uuB {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public java.lang.String copydefault;
    public int djBIcL = 2;

    /* JADX INFO: renamed from: o.uwu$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public int getSoftInputStyle() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public void setSoftInputStyle(int i) {
        this.djBIcL = i;
    }

    public C49883uwu() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradeuilib.menu.mvp.ContractGridAdjustLeverFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradeuilib.menu.mvp.ContractGridAdjustLeverFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ContractGridAdjustLeverPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradeuilib.menu.mvp.ContractGridAdjustLeverFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradeuilib.menu.mvp.ContractGridAdjustLeverFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradeuilib.menu.mvp.ContractGridAdjustLeverFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.uwu$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uwu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C49883uwu copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Function1<? super android.content.Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C49883uwu c49883uwu = new C49883uwu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instType", str2);
            bundle.putString("instId", str);
            c49883uwu.setArguments(bundle);
            c49883uwu.KWHzl(function1);
            return c49883uwu;
        }
    }

    /* JADX DEBUG: Possible override for method o.uuB.OLrzqt()V */
    public final ContractGridAdjustLeverPresenter OLrzqt() {
        return (ContractGridAdjustLeverPresenter) this.EZpvd.getValue();
    }

    @Override // o.AbstractC49732uuB, o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        this.AEQbTJ = arguments != null ? arguments.getString("instType") : null;
        android.os.Bundle arguments2 = getArguments();
        this.copydefault = arguments2 != null ? arguments2.getString("instId") : null;
        AEQbTJ();
        ContractGridAdjustLeverPresenter contractGridAdjustLeverPresenterOLrzqt = OLrzqt();
        java.lang.String str = this.copydefault;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.AEQbTJ;
        contractGridAdjustLeverPresenterOLrzqt.EZpvd(str, str2 != null ? str2 : "");
        KWHzl(fetchVPNInfo());
        AuCTel();
        copydefault(true);
    }

    private final void AEQbTJ() {
        C56109xwc<kotlin.Pair<java.lang.String, java.lang.Object>> c56109xwcFJNWhG = OLrzqt().copydefault().fJNWhG();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcFJNWhG.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.uwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49883uwu.EZpvd(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        TradeLiveData<C55774xqL> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.uwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49883uwu.KWHzl(this.copydefault, (C55774xqL) obj);
            }
        }));
        C56109xwc<kotlin.Pair<java.lang.String, java.lang.Exception>> c56109xwcFARcdN = OLrzqt().copydefault().fARcdN();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcFARcdN.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.uwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49883uwu.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(C49883uwu c49883uwu, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c49883uwu.OLrzqt().copydefault(pair);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C49883uwu c49883uwu, C55774xqL c55774xqL) {
        Intrinsics.checkNotNullParameter(c55774xqL, "");
        c49883uwu.EZpvd("", c55774xqL.KWHzl(), c55774xqL.AEQbTJ());
        c49883uwu.OLrzqt(c55774xqL.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49883uwu c49883uwu, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (Intrinsics.EZpvd(pair.getFirst(), (java.lang.Object) c49883uwu.OLrzqt().copydefault().EZpvd())) {
            c49883uwu.EZpvd("", "0.01", "50");
            c49883uwu.OLrzqt("1,2,3,5,10,20,30,50");
        }
        return Unit.INSTANCE;
    }

    private final void OLrzqt(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        int i = 0;
        if (listSplit$default.size() == 1 && Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
        for (java.lang.Object obj : listSplit$default) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str2 = (java.lang.String) obj;
            arrayList.add(new C49777uuu(str2 + "x", str2, C33129mqd.OLrzqt(str2, fetchVPNInfo()), i));
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            OLrzqt(arrayList);
        }
    }

    @Override // o.AbstractC49732uuB
    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55774xqL value = OLrzqt().KWHzl().getValue();
        java.lang.String strAEQbTJ = null;
        java.lang.String strKWHzl = C33129mqd.valueOf(value != null ? value.KWHzl() : null, 0) ? "0.01" : value != null ? value.KWHzl() : null;
        if (C33129mqd.valueOf(value != null ? value.AEQbTJ() : null, 0)) {
            strAEQbTJ = "50";
        } else if (value != null) {
            strAEQbTJ = value.AEQbTJ();
        }
        copydefault(OLrzqt().OLrzqt(str, strKWHzl, strAEQbTJ));
        KWHzl(str);
    }

    public final void KWHzl(java.lang.String str) {
        java.lang.String strCopydefault;
        if (C33129mqd.gEmmrt(str, 10)) {
            strCopydefault = C33070mpX.AYXKKw(C49511upt.Activity.fIwbmz);
        } else {
            strCopydefault = C33069mpW.copydefault(C49511upt.Activity.djBIcL, C56423yEv.EZpvd(C56390yDp.OLrzqt("warnLeverage", "10")));
        }
        AEQbTJ(strCopydefault, "", true);
    }

    @Override // o.AbstractC49732uuB
    public void AEQbTJ(@NotNull java.lang.String str) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(str, "");
        C33054mpH.copydefault(this);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
        Function1<? super java.lang.String, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(str);
        }
    }
}
