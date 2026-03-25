package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterBottomSheetViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterMetricsFragment$observeViewModel$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C28729kgK;
import o.C52761wXj;
import o.InterfaceC28026kMd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29607kwo extends AbstractC29539kvZ implements InterfaceC28728kgJ {
    public boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C21592hFb valueOf;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;

    public C29607kwo() {
        final Function0 function0 = new Function0() { // from class: o.kwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29607kwo.gEmmrt(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterMetricsFragment$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalFilterBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterMetricsFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterMetricsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.smart_money.signal.ui.filter.SignalFilterMetricsFragment$special$$inlined$viewModels$default$4
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

    /* JADX INFO: renamed from: o.kwo$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kwo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C29607kwo copydefault() {
            C29607kwo c29607kwo = new C29607kwo();
            c29607kwo.setArguments(new android.os.Bundle());
            return c29607kwo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalFilterBottomSheetViewModel gEmmrt() {
        return (SignalFilterBottomSheetViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(C29607kwo c29607kwo) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c29607kwo.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21592hFb c21592hFbAEQbTJ = C21592hFb.AEQbTJ(layoutInflater, viewGroup, false);
        this.valueOf = c21592hFbAEQbTJ;
        if (c21592hFbAEQbTJ != null) {
            return c21592hFbAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        AhwBna();
        AYXKKw();
        djBIcL();
        view.post(new java.lang.Runnable() { // from class: o.kwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C29607kwo.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(C29607kwo c29607kwo) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c29607kwo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void valueOf() {
        C21592hFb c21592hFb = this.valueOf;
        if (c21592hFb != null) {
            C28024kMb c28024kMb = c21592hFb.AuCTel;
            c28024kMb.setInputFieldGap(12.0f);
            c28024kMb.setCallback(new StateListAnimator(gEmmrt()));
            C28024kMb c28024kMb2 = c21592hFb.fJNWhG;
            c28024kMb2.setInputFieldGap(12.0f);
            c28024kMb2.setCallback(new ActionBar(gEmmrt()));
            C28034kMl c28034kMl = c21592hFb.fARcdN;
            c28034kMl.setInputFieldGap(12.0f);
            c28034kMl.setCallback(new LoaderManager(gEmmrt()));
            C28034kMl c28034kMl2 = c21592hFb.ejfBZ;
            c28034kMl2.setInputFieldGap(12.0f);
            c28034kMl2.setCallback(new FragmentManager(gEmmrt()));
            C28034kMl c28034kMl3 = c21592hFb.values;
            c28034kMl3.setInputFieldGap(12.0f);
            c28034kMl3.setCallback(new PendingIntent(gEmmrt()));
            C28034kMl c28034kMl4 = c21592hFb.fIwbmz;
            c28034kMl4.setInputFieldGap(12.0f);
            c28034kMl4.setCallback(new Dialog(gEmmrt()));
        }
    }

    /* JADX INFO: renamed from: o.kwo$StateListAnimator */
    public final /* synthetic */ class StateListAnimator implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.AEQbTJ = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.AEQbTJ, SignalFilterBottomSheetViewModel.class, "onMarketCapRangeChange", "onMarketCapRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.AEQbTJ.KWHzl(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwo$ActionBar */
    public final /* synthetic */ class ActionBar implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.AEQbTJ = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.AEQbTJ, SignalFilterBottomSheetViewModel.class, "onVolumeRangeChange", "onVolumeRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.AEQbTJ.djBIcL(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwo$LoaderManager */
    public final /* synthetic */ class LoaderManager implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.KWHzl = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.KWHzl, SignalFilterBottomSheetViewModel.class, "onHoldersRangeChange", "onHoldersRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.KWHzl.AEQbTJ(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwo$FragmentManager */
    public final /* synthetic */ class FragmentManager implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.KWHzl = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.KWHzl, SignalFilterBottomSheetViewModel.class, "onTransactionsRangeChange", "onTransactionsRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.KWHzl.AhwBna(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwo$PendingIntent */
    public final /* synthetic */ class PendingIntent implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.KWHzl = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.KWHzl, SignalFilterBottomSheetViewModel.class, "onBuyTransactionsRangeChange", "onBuyTransactionsRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.KWHzl.EZpvd(priceRangeFilter, z);
        }
    }

    /* JADX INFO: renamed from: o.kwo$Dialog */
    public final /* synthetic */ class Dialog implements InterfaceC28023kMa, InterfaceC56514yIe {
        public final /* synthetic */ SignalFilterBottomSheetViewModel AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(SignalFilterBottomSheetViewModel signalFilterBottomSheetViewModel) {
            this.AEQbTJ = signalFilterBottomSheetViewModel;
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
            return new FunctionReferenceImpl(2, this.AEQbTJ, SignalFilterBottomSheetViewModel.class, "onSellTransactionsRangeChange", "onSellTransactionsRangeChange(Lcom/okinc/business/market/features/filter/domain/PriceRangeFilter;Z)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28023kMa
        public final void AEQbTJ(PriceRangeFilter priceRangeFilter, boolean z) {
            Intrinsics.checkNotNullParameter(priceRangeFilter, "");
            this.AEQbTJ.valueOf(priceRangeFilter, z);
        }
    }

    public final void AhwBna() {
        C21592hFb c21592hFb = this.valueOf;
        if (c21592hFb != null) {
            C55008xbo c55008xbo = c21592hFb.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            C55008xbo c55008xbo2 = c21592hFb.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            AEQbTJ(c55008xbo, c55008xbo2, new Function2() { // from class: o.kwl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29607kwo.EZpvd(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
            LinearLayoutCompat linearLayoutCompat = c21592hFb.AEQbTJ;
            linearLayoutCompat.setOnClickListener(new TaskDescription(linearLayoutCompat, 1000L, this, c21592hFb));
        }
    }

    public static final Unit EZpvd(C29607kwo c29607kwo, java.lang.String str, java.lang.String str2) {
        TokenAgeType tokenAgeTypeGEmmrt;
        SignalMetricsFilter signalMetricsFilterEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c29607kwo.AEQbTJ(str, str2);
        C29601kwi value = c29607kwo.gEmmrt().copydefault().getValue();
        if (value == null || (signalMetricsFilterEZpvd = value.EZpvd()) == null || (tokenAgeTypeGEmmrt = signalMetricsFilterEZpvd.gEmmrt()) == null) {
            tokenAgeTypeGEmmrt = TokenAgeType.D;
        }
        c29607kwo.gEmmrt().OLrzqt(str, str2, tokenAgeTypeGEmmrt);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kwo$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ Function2<java.lang.String, java.lang.String, Unit> EZpvd;
        public final /* synthetic */ C55008xbo OLrzqt;
        public final /* synthetic */ C55008xbo copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            this.OLrzqt = c55008xbo;
            this.copydefault = c55008xbo2;
            this.EZpvd = function2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            android.text.Editable text;
            android.text.Editable text2;
            if (C29607kwo.this.djBIcL) {
                return;
            }
            C55001xbh c55001xbhAkhnZx = this.OLrzqt.AkhnZx();
            java.lang.String string = null;
            java.lang.String string2 = (c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null) ? null : text2.toString();
            if (string2 == null) {
                string2 = "";
            }
            C55001xbh c55001xbhAkhnZx2 = this.copydefault.AkhnZx();
            if (c55001xbhAkhnZx2 != null && (text = c55001xbhAkhnZx2.getText()) != null) {
                string = text.toString();
            }
            this.EZpvd.invoke(string2, string != null ? string : "");
        }
    }

    private final void AEQbTJ(C55008xbo c55008xbo, C55008xbo c55008xbo2, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Activity activity = new Activity(c55008xbo, c55008xbo2, function2);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(activity);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(activity);
        }
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C21592hFb c21592hFb = this.valueOf;
        if (c21592hFb != null) {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                android.widget.TextView textView = c21592hFb.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            } else {
                boolean z = C33129mqd.AhwBna(str) >= C33129mqd.AhwBna(str2);
                android.widget.TextView textView2 = c21592hFb.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(z ? 0 : 8);
            }
        }
    }

    private final void AYXKKw() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SignalFilterMetricsFragment$observeViewModel$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kwo$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29607kwo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C21592hFb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C29607kwo c29607kwo, C21592hFb c21592hFb) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c29607kwo;
            this.copydefault = c21592hFb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.fetchVPNInfo();
                android.widget.ImageView imageView = this.copydefault.EZpvd;
                int i = C52761wXj.TaskDescription.DNMMPQ;
                android.content.Context context = imageView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                imageView.setImageDrawable(C33070mpX.EZpvd(i, context));
            }
        }
    }

    private final void djBIcL() {
        SignalMetricsFilter signalMetricsFilterEZpvd;
        C21592hFb c21592hFb;
        C29601kwi value = gEmmrt().copydefault().getValue();
        if (value == null || (signalMetricsFilterEZpvd = value.EZpvd()) == null || (c21592hFb = this.valueOf) == null) {
            return;
        }
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.AuCTel, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.copydefault(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.fJNWhG, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.AhwBna(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.fARcdN, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.OLrzqt(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.ejfBZ, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.valueOf(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.values, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.KWHzl(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        InterfaceC28026kMd.TaskDescription.setData$default(c21592hFb.fIwbmz, yDY.AhwBna(), PriceRangeFilter.copy$default(signalMetricsFilterEZpvd.AEQbTJ(), null, null, null, null, null, null, false, 63, null), null, 4, null);
        C55001xbh c55001xbhAkhnZx = c21592hFb.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(signalMetricsFilterEZpvd.djBIcL());
        }
        C55001xbh c55001xbhAkhnZx2 = c21592hFb.copydefault.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setText(signalMetricsFilterEZpvd.EZpvd());
        }
        c21592hFb.fetchVPNInfo.setText(c21592hFb.getRoot().getContext().getString(signalMetricsFilterEZpvd.gEmmrt().toDisplayString()));
        AEQbTJ(signalMetricsFilterEZpvd.djBIcL(), signalMetricsFilterEZpvd.EZpvd());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        TokenAgeType tokenAgeTypeGEmmrt;
        NestedScrollView root;
        android.content.Context context;
        SignalMetricsFilter signalMetricsFilterEZpvd;
        C29601kwi value = gEmmrt().copydefault().getValue();
        if (value == null || (signalMetricsFilterEZpvd = value.EZpvd()) == null || (tokenAgeTypeGEmmrt = signalMetricsFilterEZpvd.gEmmrt()) == null) {
            tokenAgeTypeGEmmrt = TokenAgeType.D;
        }
        C28729kgK.StateListAnimator stateListAnimator = C28729kgK.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.openFileOutput);
        java.util.List<TokenAgeType> listGEmmrt = yDY.gEmmrt(TokenAgeType.m, TokenAgeType.H, TokenAgeType.D);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (TokenAgeType tokenAgeType : listGEmmrt) {
            int value2 = tokenAgeType.getValue();
            C21592hFb c21592hFb = this.valueOf;
            java.lang.String string = (c21592hFb == null || (root = c21592hFb.getRoot()) == null || (context = root.getContext()) == null) ? null : context.getString(tokenAgeType.toDisplayString());
            arrayList.add(new MemeSelection(string == null ? "" : string, null, null, null, tokenAgeTypeGEmmrt.getValue() == tokenAgeType.getValue(), java.lang.String.valueOf(value2), null, 78, null));
        }
        C28729kgK c28729kgKAEQbTJ = stateListAnimator.AEQbTJ(new MemeUnitSelectionBottomSheetParams(strAYXKKw, arrayList));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28729kgKAEQbTJ.show(childFragmentManager);
    }

    @Override // o.InterfaceC28728kgJ
    public void EZpvd(MemeSelection memeSelection) {
        SignalMetricsFilter signalMetricsFilterEZpvd;
        if (memeSelection != null) {
            C29601kwi value = gEmmrt().copydefault().getValue();
            if (value == null || (signalMetricsFilterEZpvd = value.EZpvd()) == null) {
                return;
            } else {
                gEmmrt().OLrzqt(signalMetricsFilterEZpvd.djBIcL(), signalMetricsFilterEZpvd.EZpvd(), TokenAgeType.Companion.AEQbTJ(C33129mqd.AhwBna(memeSelection.KWHzl())));
            }
        }
        C21592hFb c21592hFb = this.valueOf;
        if (c21592hFb != null) {
            android.widget.ImageView imageView = c21592hFb.EZpvd;
            int i = C52761wXj.TaskDescription.DCUTEIddSDPG;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            imageView.setImageDrawable(C33070mpX.EZpvd(i, context));
        }
    }

    @Override // o.InterfaceC28728kgJ
    public void KWHzl() {
        C21592hFb c21592hFb = this.valueOf;
        if (c21592hFb != null) {
            c21592hFb.EZpvd.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.QSLkRj));
        }
    }
}
