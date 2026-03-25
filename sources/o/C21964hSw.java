package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.liquiditypools.LiquidityPoolTabListingViewModel;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$setBottomRecyclerView$1$2;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.LiquidityPoolListingUIItem;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.LiquidityPoolPairUIItem;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21964hSw extends AbstractC21962hSu {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final C43316rmw AYXKKw = new C43316rmw();
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt;
    public hDK valueOf;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C21964hSw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LiquidityPoolTabListingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.LiquidityPoolDetailsBottomSheet$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21964hSw.KWHzl(this.KWHzl);
            }
        });
    }

    public final LiquidityPoolTabListingViewModel gEmmrt() {
        return (LiquidityPoolTabListingViewModel) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.hSu.AEQbTJ()V */
    public final LiquidityPoolListingUIItem AEQbTJ() {
        return (LiquidityPoolListingUIItem) this.AhwBna.getValue();
    }

    public static final LiquidityPoolListingUIItem KWHzl(C21964hSw c21964hSw) {
        android.os.Bundle arguments = c21964hSw.getArguments();
        if (arguments != null) {
            return (LiquidityPoolListingUIItem) arguments.getParcelable("key-change-price-selected-position");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.hSw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hSw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C21964hSw newInstance$default(ActionBar actionBar, LiquidityPoolPairUIItem liquidityPoolPairUIItem, LiquidityPoolListingUIItem liquidityPoolListingUIItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                liquidityPoolPairUIItem = null;
            }
            if ((i & 2) != 0) {
                liquidityPoolListingUIItem = null;
            }
            return actionBar.copydefault(liquidityPoolPairUIItem, liquidityPoolListingUIItem);
        }

        public final C21964hSw copydefault(LiquidityPoolPairUIItem liquidityPoolPairUIItem, LiquidityPoolListingUIItem liquidityPoolListingUIItem) {
            C21964hSw c21964hSw = new C21964hSw();
            android.os.Bundle bundle = new android.os.Bundle();
            if (liquidityPoolPairUIItem != null) {
                bundle.putParcelable("key-paginationData-currency-selected-position", liquidityPoolPairUIItem);
            }
            if (liquidityPoolListingUIItem != null) {
                bundle.putParcelable("key-change-price-selected-position", liquidityPoolListingUIItem);
            }
            c21964hSw.setArguments(bundle);
            return c21964hSw;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = hDK.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.addMenuProvider));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (AEQbTJ() != null) {
            djBIcL();
        }
    }

    public final void djBIcL() {
        RecyclerView recyclerView;
        hDK hdk = this.valueOf;
        if (hdk == null || (recyclerView = hdk.EZpvd) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.AYXKKw);
        LiquidityPoolListingUIItem liquidityPoolListingUIItemAEQbTJ = AEQbTJ();
        if (liquidityPoolListingUIItemAEQbTJ != null) {
            gEmmrt().AEQbTJ(liquidityPoolListingUIItemAEQbTJ);
        }
        this.AYXKKw.register(hSH.class, new hSA());
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new LiquidityPoolDetailsBottomSheet$setBottomRecyclerView$1$2(this, null));
    }

    public final void OLrzqt(java.util.List<hSE> list) {
        hDK hdk = this.valueOf;
        if (hdk != null) {
            hdk.KWHzl.setVisibility(8);
            hdk.EZpvd.setVisibility(0);
            this.AYXKKw.setItems(list);
            this.AYXKKw.notifyDataSetChanged();
        }
    }

    public final void AhwBna() {
        hDK hdk = this.valueOf;
        if (hdk != null) {
            hdk.KWHzl.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.fmdvVn));
            hdk.KWHzl.setEmptyTypeImage(6);
            hdk.KWHzl.setVisibility(0);
            hdk.EZpvd.setVisibility(8);
        }
    }
}
