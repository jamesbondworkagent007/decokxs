package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$setListener$1;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyPositionViewModel;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.uilab.view.OKSortTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20037gYo extends gXC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public boolean AkhnZx;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C30765lhN isConnected;

    /* JADX INFO: renamed from: o.gYo$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKSortTextView.SortType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public static final /* synthetic */ hBC KWHzl(C20037gYo c20037gYo) {
        return c20037gYo.fARcdN();
    }

    /* JADX INFO: renamed from: o.gYo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gYo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20037gYo OLrzqt() {
            return new C20037gYo();
        }
    }

    public C20037gYo() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(StrategyPositionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyPositionFragment$special$$inlined$viewModels$default$5
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
        this.AkhnZx = true;
    }

    /* JADX DEBUG: Possible override for method o.gXC.djBIcL()V */
    public final StrategyPositionViewModel djBIcL() {
        return (StrategyPositionViewModel) this.fetchVPNInfo.getValue();
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL().OLrzqt(AEQbTJ().AEQbTJ());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC20011gXp, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        isConnected();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StrategyPositionFragment$setListener$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, djBIcL().EZpvd(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.gYo$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return copydefault(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            OKSortTextView oKSortTextView;
            OKSortTextView oKSortTextView2;
            OKSortTextView oKSortTextView3;
            hBC hbcKWHzl = C20037gYo.KWHzl(C20037gYo.this);
            if (hbcKWHzl != null && (oKSortTextView3 = hbcKWHzl.AEQbTJ) != null) {
                oKSortTextView3.setEnabled(z);
            }
            hBC hbcKWHzl2 = C20037gYo.KWHzl(C20037gYo.this);
            if (hbcKWHzl2 != null && (oKSortTextView2 = hbcKWHzl2.AEQbTJ) != null) {
                oKSortTextView2.setAlpha(z ? 1.0f : 0.5f);
            }
            if (!z && C20037gYo.this.djBIcL().copydefault().getSortBy() == AdvancedAssetSort.PNL) {
                hBC hbcKWHzl3 = C20037gYo.KWHzl(C20037gYo.this);
                if (hbcKWHzl3 != null && (oKSortTextView = hbcKWHzl3.AEQbTJ) != null) {
                    OKSortTextView.setSortType$default(oKSortTextView, OKSortTextView.SortType.NONE, false, 2, null);
                }
                C20037gYo.this.fetchVPNInfo();
                C20037gYo.this.djBIcL().OLrzqt(false);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC20011gXp
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        djBIcL().OLrzqt(str);
        StrategyPositionViewModel.loadPositions$default(djBIcL(), false, 1, null);
    }

    @Override // o.hTH
    public void DbNXlk() {
        StrategyPositionViewModel.loadPositions$default(djBIcL(), false, 1, null);
    }

    private final void isConnected() {
        final hBC hbcFARcdN = fARcdN();
        if (hbcFARcdN != null) {
            LinearLayoutCompat linearLayoutCompat = hbcFARcdN.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            final OKSortTextView oKSortTextView = hbcFARcdN.copydefault;
            oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.gYr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20037gYo.KWHzl(this.EZpvd, oKSortTextView, hbcFARcdN, view);
                }
            });
            final OKSortTextView oKSortTextView2 = hbcFARcdN.AEQbTJ;
            oKSortTextView2.setOnClickListener(new View.OnClickListener() { // from class: o.gYs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20037gYo.AEQbTJ(this.KWHzl, oKSortTextView2, hbcFARcdN, view);
                }
            });
        }
    }

    public static final void KWHzl(C20037gYo c20037gYo, OKSortTextView oKSortTextView, hBC hbc, android.view.View view) {
        Intrinsics.copydefault(oKSortTextView);
        OKSortTextView oKSortTextView2 = hbc.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        c20037gYo.KWHzl(oKSortTextView, oKSortTextView2, AdvancedAssetSort.VALUE);
    }

    public static final void AEQbTJ(C20037gYo c20037gYo, OKSortTextView oKSortTextView, hBC hbc, android.view.View view) {
        Intrinsics.copydefault(oKSortTextView);
        OKSortTextView oKSortTextView2 = hbc.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        c20037gYo.KWHzl(oKSortTextView, oKSortTextView2, AdvancedAssetSort.PNL);
    }

    private final void KWHzl(OKSortTextView oKSortTextView, OKSortTextView oKSortTextView2, AdvancedAssetSort advancedAssetSort) {
        OKSortTextView.SortType sortType;
        if (advancedAssetSort != AdvancedAssetSort.PNL || djBIcL().EZpvd().getValue().booleanValue()) {
            int i = TaskDescription.copydefault[oKSortTextView.AEQbTJ().ordinal()];
            if (i == 1) {
                sortType = OKSortTextView.SortType.UP;
            } else if (i == 2) {
                sortType = OKSortTextView.SortType.NONE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sortType = OKSortTextView.SortType.DOWN;
            }
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            OKSortTextView.SortType sortType2 = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView2, sortType2, false, 2, null);
            AdvancedAssetsFilter advancedAssetsFilterCopydefault = djBIcL().copydefault();
            if (sortType == sortType2) {
                advancedAssetSort = AdvancedAssetSort.DEFAULT;
            }
            djBIcL().AEQbTJ(AdvancedAssetsFilter.copy$default(advancedAssetsFilterCopydefault, false, advancedAssetSort, sortType != OKSortTextView.SortType.UP, 1, null), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        hBC hbcFARcdN = fARcdN();
        if (hbcFARcdN != null) {
            OKSortTextView oKSortTextView = hbcFARcdN.copydefault;
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            OKSortTextView.setSortType$default(hbcFARcdN.AEQbTJ, sortType, false, 2, null);
        }
        djBIcL().KWHzl();
    }

    private final void valueOf() {
        djBIcL().OLrzqt(false);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        djBIcL().OLrzqt();
        if (this.AkhnZx) {
            this.AkhnZx = false;
        } else {
            valueOf();
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        djBIcL().djBIcL();
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55113xdn c55113xdn;
        this.isConnected = null;
        hBC hbcFARcdN = fARcdN();
        if (hbcFARcdN != null && (c55113xdn = hbcFARcdN.KWHzl) != null) {
            c55113xdn.copydefault();
        }
        super.onDestroyView();
    }
}
