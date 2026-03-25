package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheetViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23274hvD;
import o.InterfaceC28026kMd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29617kwy extends AbstractC29594kwb {
    public final InterfaceC56387yDm AYXKKw;
    public C21593hFc djBIcL;
    public boolean gEmmrt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    public C29617kwy() {
        final Function0 function0 = new Function0() { // from class: o.kwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29617kwy.AEQbTJ(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterSignalFragment$special$$inlined$viewModels$default$1
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterSignalFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterSignalFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterSignalFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.kwy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kwy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29617kwy AEQbTJ() {
            C29617kwy c29617kwy = new C29617kwy();
            c29617kwy.setArguments(new android.os.Bundle());
            return c29617kwy;
        }
    }

    private final SignalFilterBottomSheetViewModel EZpvd() {
        return (SignalFilterBottomSheetViewModel) this.AYXKKw.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(C29617kwy c29617kwy) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c29617kwy.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21593hFc c21593hFcOLrzqt = C21593hFc.OLrzqt(layoutInflater, viewGroup, false);
        this.djBIcL = c21593hFcOLrzqt;
        if (c21593hFcOLrzqt != null) {
            return c21593hFcOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        AYXKKw();
        view.post(new java.lang.Runnable() { // from class: o.kwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29617kwy.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C29617kwy c29617kwy) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29617kwy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        C21593hFc c21593hFc = this.djBIcL;
        if (c21593hFc != null) {
            C28034kMl c28034kMl = c21593hFc.AYXKKw;
            c28034kMl.setInputFieldGap(12.0f);
            c28034kMl.setCallback(new Application());
            C28024kMb c28024kMb = c21593hFc.gEmmrt;
            c28024kMb.setInputFieldGap(12.0f);
            c28024kMb.setCallback(new StateListAnimator(EZpvd()));
            C28024kMb c28024kMb2 = c21593hFc.AhwBna;
            c28024kMb2.setInputFieldGap(12.0f);
            c28024kMb2.setCallback(new Activity(EZpvd()));
            C28024kMb c28024kMb3 = c21593hFc.valueOf;
            c28024kMb3.setInputFieldGap(12.0f);
            c28024kMb3.setCallback(new ActionBar(EZpvd()));
        }
    }

    /* JADX INFO: renamed from: o.kwy$Application */
    public final /* synthetic */ class Application implements InterfaceC28023kMa, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, C29617kwy.this, C29617kwy.class, "onNumAddressesRangeChange", "onNumAddressesRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            C29617kwy.this.KWHzl(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.OLrzqt = signalFilterBottomSheetViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.OLrzqt, SignalFilterBottomSheetViewModel.class, "onTurnoverRangeChange", "onTurnoverRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.OLrzqt.gEmmrt(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwy$Activity */
    public final /* synthetic */ class Activity implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.EZpvd = signalFilterBottomSheetViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.EZpvd, SignalFilterBottomSheetViewModel.class, "onAlertMarketCapRangeChange", "onAlertMarketCapRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.EZpvd.OLrzqt(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwy$ActionBar */
    public final /* synthetic */ class ActionBar implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.OLrzqt = signalFilterBottomSheetViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28023kMa) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.OLrzqt, SignalFilterBottomSheetViewModel.class, "onAlertLiquidityRangeChange", "onAlertLiquidityRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.OLrzqt.copydefault(priceRangeFilter, z);
        }
    }

    private final void AYXKKw() {
        SignalsFilter signalsFilterAEQbTJ;
        C29601kwi value = EZpvd().copydefault().getValue();
        if (value == null || (signalsFilterAEQbTJ = value.AEQbTJ()) == null) {
            return;
        }
        C21593hFc c21593hFc = this.djBIcL;
        if (c21593hFc != null) {
            InterfaceC28026kMd.TaskDescription.setData$default(c21593hFc.AYXKKw, yDY.AhwBna(), PriceRangeFilter.copy$default(signalsFilterAEQbTJ.EZpvd(), null, null, null, null, null, null, false, 63, null), null, 4, null);
            InterfaceC28026kMd.TaskDescription.setData$default(c21593hFc.gEmmrt, yDY.AhwBna(), PriceRangeFilter.copy$default(signalsFilterAEQbTJ.KWHzl(), null, null, null, null, null, null, false, 63, null), null, 4, null);
            InterfaceC28026kMd.TaskDescription.setData$default(c21593hFc.AhwBna, yDY.AhwBna(), PriceRangeFilter.copy$default(signalsFilterAEQbTJ.copydefault(), null, null, null, null, null, null, false, 63, null), null, 4, null);
            InterfaceC28026kMd.TaskDescription.setData$default(c21593hFc.valueOf, yDY.AhwBna(), PriceRangeFilter.copy$default(signalsFilterAEQbTJ.AEQbTJ(), null, null, null, null, null, null, false, 63, null), null, 4, null);
            c21593hFc.AYXKKw.setStartHint(C33070mpX.AYXKKw(C23274hvD.Fragment.QwvEab) + " (2)");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(PriceRangeFilter priceRangeFilter, boolean z) {
        java.lang.String strAhwBna;
        java.lang.String str;
        C21593hFc c21593hFc;
        C28034kMl c28034kMl;
        java.lang.Integer intOrNull;
        java.lang.Integer intOrNull2;
        if (this.gEmmrt) {
            return;
        }
        if (priceRangeFilter.AhwBna().length() > 0 && (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(priceRangeFilter.AhwBna())) != null) {
            strAhwBna = intOrNull2.intValue() < 2 ? "2" : priceRangeFilter.AhwBna();
            if (strAhwBna == null) {
            }
        } else {
            strAhwBna = priceRangeFilter.AhwBna();
        }
        java.lang.String str2 = strAhwBna;
        if (priceRangeFilter.KWHzl().length() > 0 && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(priceRangeFilter.KWHzl())) != null) {
            java.lang.String strKWHzl = intOrNull.intValue() >= 2 ? priceRangeFilter.KWHzl() : "2";
            if (strKWHzl != null) {
                str = strKWHzl;
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) priceRangeFilter.AhwBna()) || !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) priceRangeFilter.KWHzl())) {
                    this.gEmmrt = true;
                    c21593hFc = this.djBIcL;
                    if (c21593hFc != null && (c28034kMl = c21593hFc.AYXKKw) != null) {
                        c28034kMl.setValues(str2, str);
                    }
                    this.gEmmrt = false;
                }
                EZpvd().AYXKKw(PriceRangeFilter.copy$default(priceRangeFilter, str2, str, null, null, null, null, false, 124, null), z);
            }
        }
        java.lang.String strKWHzl2 = priceRangeFilter.KWHzl();
        str = strKWHzl2;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) priceRangeFilter.AhwBna())) {
            this.gEmmrt = true;
            c21593hFc = this.djBIcL;
            if (c21593hFc != null) {
                c28034kMl.setValues(str2, str);
            }
            this.gEmmrt = false;
        }
        EZpvd().AYXKKw(PriceRangeFilter.copy$default(priceRangeFilter, str2, str, null, null, null, null, false, 124, null), z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }
}
