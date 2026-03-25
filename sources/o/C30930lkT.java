package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.widget.SimpleNetworkFeeParam;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.CommonMemeQuoteParams;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PriorityParam;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.mev.MevRouteParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetBuySellViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetChildViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionActivityViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionViewModel;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import java.util.NoSuchElementException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28294kWb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30930lkT extends AbstractC30921lkK<C21574hEk> {
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public BuySellPreset djBIcL;
    public kXA ejfBZ;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm values;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.lkW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30930lkT.fJNWhG(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.lkY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30930lkT.isConnected(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.lkU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30930lkT.fetchVPNInfo(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.lkX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C30930lkT.ejfBZ(this.OLrzqt));
        }
    });

    /* JADX INFO: renamed from: o.lkT$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.aeJQwa;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21574hEk gEmmrt(C30930lkT c30930lkT) {
        return (C21574hEk) c30930lkT.AEQbTJ();
    }

    public C30930lkT() {
        final Function0 function0 = null;
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetChildViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.llc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30930lkT.DbNXlk(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0 function04 = new Function0() { // from class: o.lld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30930lkT.values(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetBuySellViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$12
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
                Function0 function05 = function0;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$special$$inlined$viewModels$default$13
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: o.lkT$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lkT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C30930lkT newInstance$default(Activity activity, java.lang.String str, MemeSelectionActivityResultContract.Input input, int i, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                i = TransactionType.Buy.getType();
            }
            return activity.copydefault(str, input, i);
        }

        public final C30930lkT copydefault(@NotNull java.lang.String str, @NotNull MemeSelectionActivityResultContract.Input input, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(input, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key.preset_type", str);
            bundle.putParcelable("key.preset_user_config", input);
            bundle.putInt("key.transaction_type", i);
            C30930lkT c30930lkT = new C30930lkT();
            c30930lkT.setArguments(bundle);
            return c30930lkT;
        }
    }

    /* JADX INFO: renamed from: o.lkT$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55001xbh c55001xbh) {
            this.KWHzl = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C24380icj c24380icj;
            C24380icj c24380icj2;
            C21574hEk c21574hEkGEmmrt = C30930lkT.gEmmrt(C30930lkT.this);
            if (c21574hEkGEmmrt == null || (c24380icj2 = c21574hEkGEmmrt.AYXKKw) == null || !c24380icj2.OLrzqt()) {
                java.lang.String strIsConnected = this.KWHzl.isConnected();
                C21574hEk c21574hEkGEmmrt2 = C30930lkT.gEmmrt(C30930lkT.this);
                if (c21574hEkGEmmrt2 != null && (c24380icj = c21574hEkGEmmrt2.AYXKKw) != null) {
                    c24380icj.setPriorityMessageStyle(strIsConnected);
                }
                pUU.copydefault("MemeModeSettingBottomDialog", "okInputFieldCustomPriority listener event: isCustom: true\n>>>>priorityFee: " + strIsConnected);
                C30930lkT.this.values().KWHzl().setValue(C30930lkT.this.fARcdN());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fARcdN() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public static final java.lang.String fJNWhG(C30930lkT c30930lkT) {
        android.os.Bundle arguments = c30930lkT.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("key.preset_type") : null;
        return string == null ? "" : string;
    }

    /* JADX DEBUG: Possible override for method o.lkK.gEmmrt()V */
    public final MemeSelectionActivityResultContract.Input gEmmrt() {
        return (MemeSelectionActivityResultContract.Input) this.AhwBna.getValue();
    }

    public static final MemeSelectionActivityResultContract.Input isConnected(C30930lkT c30930lkT) {
        android.os.Bundle arguments = c30930lkT.getArguments();
        if (arguments != null) {
            return (MemeSelectionActivityResultContract.Input) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.preset_user_config", MemeSelectionActivityResultContract.Input.class));
        }
        return null;
    }

    public static final java.lang.String fetchVPNInfo(C30930lkT c30930lkT) {
        MemeQuoteAdapter memeQuoteAdapter;
        MemeSelectionActivityResultContract.Input inputGEmmrt = c30930lkT.gEmmrt();
        java.lang.String chainId = (inputGEmmrt == null || (memeQuoteAdapter = inputGEmmrt.getMemeQuoteAdapter()) == null) ? null : memeQuoteAdapter.getChainId();
        return chainId == null ? "" : chainId;
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public final int isConnected() {
        return ((java.lang.Number) this.fJNWhG.getValue()).intValue();
    }

    public static final int ejfBZ(C30930lkT c30930lkT) {
        android.os.Bundle arguments = c30930lkT.getArguments();
        return arguments != null ? arguments.getInt("key.transaction_type") : TransactionType.Buy.getType();
    }

    public final PresetSelectionActivityViewModel values() {
        return (PresetSelectionActivityViewModel) this.AkhnZx.getValue();
    }

    public final PresetChildViewModel AkhnZx() {
        return (PresetChildViewModel) this.DbNXlk.getValue();
    }

    public final PresetSelectionViewModel fetchVPNInfo() {
        return (PresetSelectionViewModel) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelStoreOwner DbNXlk(C30930lkT c30930lkT) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30930lkT.requireParentFragment().requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final PresetBuySellViewModel DbNXlk() {
        return (PresetBuySellViewModel) this.values.getValue();
    }

    public static final ViewModelStoreOwner values(C30930lkT c30930lkT) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30930lkT.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21574hEk AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21574hEk c21574hEkOLrzqt = C21574hEk.OLrzqt(view);
        Intrinsics.checkNotNullExpressionValue(c21574hEkOLrzqt, "");
        return c21574hEkOLrzqt;
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AhwBna();
        fIwbmz();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        C24380icj c24380icj;
        C24380icj c24380icj2;
        AkhnZx().EZpvd().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        }));
        DbNXlk().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.copydefault(this.AEQbTJ, (Triple) obj);
            }
        }));
        DbNXlk().OLrzqt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.AEQbTJ(this.copydefault, (PresetUserConfigBean) obj);
            }
        }));
        AkhnZx().copydefault().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C21574hEk c21574hEk = (C21574hEk) AEQbTJ();
        if (c21574hEk != null && (c24380icj2 = c21574hEk.AYXKKw) != null) {
            c24380icj2.setFeeValueCallback(new Function1() { // from class: o.llb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30930lkT.OLrzqt(this.copydefault, (PriorityParam) obj);
                }
            });
        }
        C21574hEk c21574hEk2 = (C21574hEk) AEQbTJ();
        C55001xbh c55001xbhEZpvd = (c21574hEk2 == null || (c24380icj = c21574hEk2.AYXKKw) == null) ? null : c24380icj.EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.addTextChangedListener(new Application(c55001xbhEZpvd));
        }
        AkhnZx().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.lli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.llg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C30930lkT.KWHzl(this.KWHzl, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C30930lkT c30930lkT, kotlin.Pair pair) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            C21574hEk c21574hEk = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk != null && (constraintLayout2 = c21574hEk.OLrzqt) != null) {
                constraintLayout2.setVisibility(0);
            }
            MemeModeQuoteBean memeModeQuoteBean = (MemeModeQuoteBean) pair.getSecond();
            if (memeModeQuoteBean != null) {
                C30986llW c30986llWEZpvd = C30982llS.EZpvd(memeModeQuoteBean);
                c30930lkT.OLrzqt(c30986llWEZpvd, memeModeQuoteBean);
                c30930lkT.AuCTel();
                c30930lkT.KWHzl(memeModeQuoteBean);
                c30930lkT.ejfBZ();
                BuySellPreset buySellPreset = c30930lkT.djBIcL;
                if (buySellPreset != null) {
                    PresetChildViewModel presetChildViewModelAkhnZx = c30930lkT.AkhnZx();
                    java.util.List<FeeOption> feeOptions = buySellPreset.getFeeConfig().getFeeOptions();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : feeOptions) {
                        if (((FeeOption) obj).getFeeLevel() != PriorityFeeType.PriorityCustom.getValue()) {
                            arrayList.add(obj);
                        }
                    }
                    presetChildViewModelAkhnZx.copydefault(arrayList, c30986llWEZpvd, c30930lkT.AkhnZx().AEQbTJ(c30930lkT.valueOf(), buySellPreset.getRouteConfig().getRouterModeType(), c30930lkT.AkhnZx().copydefault(memeModeQuoteBean).KWHzl()), c30930lkT.fJNWhG());
                }
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c30930lkT, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C21574hEk c21574hEk2 = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk2 != null && (constraintLayout = c21574hEk2.OLrzqt) != null) {
                constraintLayout.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30930lkT c30930lkT, Triple triple) {
        BuySellPreset buySellPreset;
        int iIntValue = ((java.lang.Number) triple.component1()).intValue();
        CommonMemeQuoteParams commonMemeQuoteParams = (CommonMemeQuoteParams) triple.component3();
        if (iIntValue == c30930lkT.isConnected() && (buySellPreset = c30930lkT.djBIcL) != null) {
            for (FeeOption feeOption : buySellPreset.getFeeConfig().getFeeOptions()) {
                if (feeOption.getSelected()) {
                    int iComponent1 = feeOption.component1();
                    java.lang.String strComponent2 = feeOption.component2();
                    PresetChildViewModel presetChildViewModelAkhnZx = c30930lkT.AkhnZx();
                    java.lang.String routerModeType = buySellPreset.getRouteConfig().getRouterModeType();
                    DexPresetResultVO value = c30930lkT.fetchVPNInfo().gEmmrt().getValue();
                    presetChildViewModelAkhnZx.OLrzqt(commonMemeQuoteParams, new C28294kWb.StateListAnimator(iIntValue, routerModeType, iComponent1, strComponent2, value != null ? value.getSupportCustomGasFee() : false, null, null, null, 224, null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C30930lkT c30930lkT, PresetUserConfigBean presetUserConfigBean) {
        C24380icj c24380icj;
        C24380icj c24380icj2;
        C55001xbh c55001xbhEZpvd;
        C24380icj c24380icj3;
        MemeSelectionActivityResultContract.Input inputGEmmrt = c30930lkT.gEmmrt();
        if (inputGEmmrt == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) c30930lkT.values().EZpvd().getValue(), (java.lang.Object) c30930lkT.fARcdN()) && c30930lkT.isConnected() == inputGEmmrt.getFromTransactionType()) {
            C21574hEk c21574hEk = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk != null && (c24380icj3 = c21574hEk.AYXKKw) != null) {
                c24380icj3.setUpdatingProgrammatically(true);
            }
            C21574hEk c21574hEk2 = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk2 != null && (c24380icj2 = c21574hEk2.AYXKKw) != null && (c55001xbhEZpvd = c24380icj2.EZpvd()) != null) {
                c55001xbhEZpvd.setText("");
            }
            C21574hEk c21574hEk3 = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk3 != null && (c24380icj = c21574hEk3.AYXKKw) != null) {
                c24380icj.setUpdatingProgrammatically(false);
            }
            PresetSelectionViewModel presetSelectionViewModelFetchVPNInfo = c30930lkT.fetchVPNInfo();
            java.lang.String strValueOf = c30930lkT.valueOf();
            java.lang.String strFARcdN = c30930lkT.fARcdN();
            Intrinsics.copydefault(presetUserConfigBean);
            presetSelectionViewModelFetchVPNInfo.copydefault(strValueOf, strFARcdN, presetUserConfigBean);
            c30930lkT.fetchVPNInfo().AYXKKw().setValue(C56390yDp.OLrzqt(c30930lkT.fARcdN(), presetUserConfigBean.getName()));
            int iIsConnected = c30930lkT.isConnected();
            TransactionType transactionType = TransactionType.Buy;
            c30930lkT.djBIcL = iIsConnected == transactionType.getType() ? presetUserConfigBean.getBuyPreset() : presetUserConfigBean.getSellPreset();
            c30930lkT.KWHzl(c30930lkT.DbNXlk().EZpvd(inputGEmmrt.getMemeQuoteAdapter(), c30930lkT.isConnected() == transactionType.getType() ? presetUserConfigBean.getBuyPreset() : presetUserConfigBean.getSellPreset(), c30930lkT.isConnected() == TransactionType.Sell.getType()));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C30930lkT c30930lkT, java.lang.Boolean bool) {
        C30969llF c30969llF;
        ConstraintLayout constraintLayout;
        pUU.KWHzl(c30930lkT.getTAG(), "presetLoadingLiveData: showLoading=" + bool);
        if (bool.booleanValue()) {
            C21574hEk c21574hEk = (C21574hEk) c30930lkT.AEQbTJ();
            if (c21574hEk == null || (constraintLayout = c21574hEk.OLrzqt) == null || constraintLayout.getVisibility() != 0) {
                androidx.fragment.app.Fragment parentFragment = c30930lkT.getParentFragment();
                c30969llF = parentFragment instanceof C30969llF ? (C30969llF) parentFragment : null;
                if (c30969llF != null) {
                    c30969llF.copydefault(false);
                }
            }
            c30930lkT.showLoadingWithLogo(0L);
        } else {
            androidx.fragment.app.Fragment parentFragment2 = c30930lkT.getParentFragment();
            c30969llF = parentFragment2 instanceof C30969llF ? (C30969llF) parentFragment2 : null;
            if (c30969llF != null) {
                c30969llF.copydefault(true);
            }
            c30930lkT.djBIcL();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C30930lkT c30930lkT, PriorityParam priorityParam) {
        Intrinsics.checkNotNullParameter(priorityParam, "");
        c30930lkT.AkhnZx().AEQbTJ(priorityParam, c30930lkT.djBIcL, MemeTransactionSceneType.Market.getValue());
        c30930lkT.ejfBZ();
        c30930lkT.values().KWHzl().setValue(c30930lkT.fARcdN());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C30930lkT c30930lkT, java.util.List list) {
        MemeModeQuoteBean second;
        kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value = c30930lkT.AkhnZx().EZpvd().getValue();
        if (value != null && (second = value.getSecond()) != null) {
            Intrinsics.copydefault(list);
            c30930lkT.OLrzqt(second, (java.util.List<PrioritySelectionBean>) list);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C30930lkT c30930lkT, boolean z) {
        C25308iuK c25308iuK;
        C55008xbo c55008xboEZpvd;
        C25308iuK c25308iuK2;
        C55008xbo c55008xboAEQbTJ;
        C24380icj c24380icj;
        C55001xbh c55001xbhEZpvd;
        if (z) {
            return;
        }
        C21574hEk c21574hEk = (C21574hEk) c30930lkT.AEQbTJ();
        if (c21574hEk != null && (c24380icj = c21574hEk.AYXKKw) != null && (c55001xbhEZpvd = c24380icj.EZpvd()) != null) {
            c55001xbhEZpvd.clearFocus();
        }
        C21574hEk c21574hEk2 = (C21574hEk) c30930lkT.AEQbTJ();
        if (c21574hEk2 != null && (c25308iuK2 = c21574hEk2.AhwBna) != null && (c55008xboAEQbTJ = c25308iuK2.AEQbTJ()) != null) {
            c55008xboAEQbTJ.clearFocus();
        }
        C21574hEk c21574hEk3 = (C21574hEk) c30930lkT.AEQbTJ();
        if (c21574hEk3 == null || (c25308iuK = c21574hEk3.AhwBna) == null || (c55008xboEZpvd = c25308iuK.EZpvd()) == null) {
            return;
        }
        c55008xboEZpvd.clearFocus();
    }

    private final java.lang.String fJNWhG() {
        return Intrinsics.EZpvd((java.lang.Object) AkhnZx().OLrzqt(), (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue()) ? fetchVPNInfo().KWHzl().getTokenSymbol() : "Gwei";
    }

    public final void djBIcL() {
        if (isResumed()) {
            dismissLoadingWithLogo();
        } else {
            getViewLifecycleOwner().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetMarketChildFragment$dismissLoadingOnResumed$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    Intrinsics.checkNotNullParameter(event, "");
                    if (event != Lifecycle.Event.ON_RESUME) {
                        return;
                    }
                    this.OLrzqt.dismissLoadingWithLogo();
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            });
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.icj.setData$default(o.icj, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.dexlogic.bean.MemeTransactionSceneType, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(MemeModeQuoteBean memeModeQuoteBean, java.util.List<PrioritySelectionBean> list) {
        C22312hcw c22312hcw;
        C24380icj c24380icj;
        C24380icj c24380icj2;
        C22312hcw c22312hcw2;
        BuySellPreset buySellPreset = this.djBIcL;
        if (buySellPreset != null) {
            boolean zEZpvd = Intrinsics.EZpvd(fetchVPNInfo().fetchVPNInfo(), java.lang.Boolean.TRUE);
            C21574hEk c21574hEk = (C21574hEk) AEQbTJ();
            if (c21574hEk != null && (c22312hcw2 = c21574hEk.AEQbTJ) != null) {
                c22312hcw2.setVisibility(zEZpvd ^ true ? 0 : 8);
            }
            C21574hEk c21574hEk2 = (C21574hEk) AEQbTJ();
            if (c21574hEk2 != null && (c24380icj2 = c21574hEk2.AYXKKw) != null) {
                c24380icj2.setVisibility(zEZpvd ? 0 : 8);
            }
            if (!zEZpvd) {
                C21574hEk c21574hEk3 = (C21574hEk) AEQbTJ();
                if (c21574hEk3 == null || (c22312hcw = c21574hEk3.AEQbTJ) == null) {
                    return;
                }
                c22312hcw.setData(new SimpleNetworkFeeParam(TradeMode.Meme, C33070mpX.AYXKKw(C23274hvD.Fragment.PipHintTrackerKttrackPipAnimationHintViewflow11), memeModeQuoteBean.getMemeModeCommonDexInfo().getNonMevPriorityFeeInfo().getBaseFeeUsd()));
                return;
            }
            for (FeeOption feeOption : buySellPreset.getFeeConfig().getFeeOptions()) {
                if (feeOption.getSelected()) {
                    int iComponent1 = feeOption.component1();
                    java.lang.String strComponent2 = feeOption.component2();
                    C21574hEk c21574hEk4 = (C21574hEk) AEQbTJ();
                    if (c21574hEk4 == null || (c24380icj = c21574hEk4.AYXKKw) == null) {
                        return;
                    }
                    java.lang.String memeChainType = memeModeQuoteBean.getMemeModeCommonDexInfo().getMemeChainType();
                    java.lang.String max = buySellPreset.getFeeConfig().getMax();
                    java.lang.String min = buySellPreset.getFeeConfig().getMin();
                    java.lang.String tokenSymbol = Intrinsics.EZpvd((java.lang.Object) memeModeQuoteBean.getMemeModeCommonDexInfo().getMemeChainType(), (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue()) ? fetchVPNInfo().KWHzl().getTokenSymbol() : "Gwei";
                    java.lang.String strOLrzqt = fetchVPNInfo().OLrzqt();
                    if (strOLrzqt == null) {
                        return;
                    }
                    c24380icj.setData(memeChainType, list, (48 & 4) != 0 ? "" : max, (48 & 8) != 0 ? "" : min, (48 & 16) != 0 ? "" : null, (48 & 32) != 0 ? "" : null, iComponent1, AkhnZx().KWHzl(iComponent1, AkhnZx().copydefault(memeModeQuoteBean), AkhnZx().AEQbTJ(valueOf(), buySellPreset.getRouteConfig().getRouterModeType(), AkhnZx().copydefault(memeModeQuoteBean).KWHzl()), strComponent2), tokenSymbol, strOLrzqt, !memeModeQuoteBean.getMemeModeCommonDexInfo().getSupportEip1559(), MemeTransactionSceneType.Market);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        BuySellPreset sellPreset;
        PresetUserConfigBean presetUserConfigBeanKWHzl = fetchVPNInfo().KWHzl(valueOf(), fARcdN());
        if (isConnected() == TransactionType.Buy.getType()) {
            sellPreset = presetUserConfigBeanKWHzl != null ? presetUserConfigBeanKWHzl.getBuyPreset() : null;
        } else if (presetUserConfigBeanKWHzl != null) {
            sellPreset = presetUserConfigBeanKWHzl.getSellPreset();
        }
        this.djBIcL = sellPreset;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(MemeModeQuoteBean memeModeQuoteBean) {
        java.lang.Object next;
        java.lang.Object next2;
        C25308iuK c25308iuK;
        C25308iuK c25308iuK2;
        MemeModeQuoteBean second;
        DeFiPlatformForSwap selectedDeFiPlatform;
        BuySellPreset buySellPreset = this.djBIcL;
        if (buySellPreset != null) {
            java.util.Iterator<T> it = buySellPreset.getSlippageConfig().getSlippageRange().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((SlippageRange) next).getSelected()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SlippageRange slippageRange = (SlippageRange) next;
            java.lang.String slippageValue = slippageRange != null ? slippageRange.getSlippageValue() : null;
            SlippageMode slippageModeEZpvd = SlippageMode.Companion.EZpvd(buySellPreset.getSlippageConfig().getSlippageType());
            java.util.Iterator<T> it2 = buySellPreset.getSlippageConfig().getSlippageRange().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    if (((SlippageRange) next2).getSelected()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            SlippageRange slippageRange2 = (SlippageRange) next2;
            int slippageLevel = slippageRange2 != null ? slippageRange2.getSlippageLevel() : SlippageFeeType.SlippageLow.getValue();
            kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> pairAEQbTJ = AkhnZx().copydefault(memeModeQuoteBean).copydefault().AEQbTJ();
            kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value = AkhnZx().EZpvd().getValue();
            DexAutoSlippageInfoParam autoSlippageInfo = (value == null || (second = value.getSecond()) == null || (selectedDeFiPlatform = second.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform.getAutoSlippageInfo();
            DexPresetResultVO value2 = fetchVPNInfo().gEmmrt().getValue();
            if (value2 == null) {
                return;
            }
            kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(autoSlippageInfo, buySellPreset.getSlippageConfig());
            C21574hEk c21574hEk = (C21574hEk) AEQbTJ();
            if (c21574hEk != null && (c25308iuK2 = c21574hEk.AhwBna) != null) {
                c25308iuK2.setListener(this.ejfBZ);
            }
            C21574hEk c21574hEk2 = (C21574hEk) AEQbTJ();
            if (c21574hEk2 == null || (c25308iuK = c21574hEk2.AhwBna) == null) {
                return;
            }
            TradeMode tradeMode = TradeMode.Meme;
            SlippageMode slippageModeEZpvd2 = SlippageMode.Companion.EZpvd(buySellPreset.getSlippageConfig().getSlippageType());
            boolean dynamicSupportMax = value2.getDynamicSupportMax();
            java.lang.String dynamicMaxSlippageValue = buySellPreset.getSlippageConfig().getDynamicMaxSlippageValue();
            java.lang.String referenceSlippage = autoSlippageInfo != null ? autoSlippageInfo.getReferenceSlippage() : null;
            java.lang.String str = referenceSlippage == null ? "" : referenceSlippage;
            java.lang.String autoSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoSlippage() : null;
            DynamicParam dynamicParam = new DynamicParam(dynamicSupportMax, dynamicMaxSlippageValue, str, autoSlippage == null ? "" : autoSlippage, buySellPreset.getSlippageConfig().getDynamicMin(), buySellPreset.getSlippageConfig().getDynamicMax(), buySellPreset.getSlippageConfig().getDynamicRecommendMinValue(), buySellPreset.getSlippageConfig().getDynamicRecommendMaxValue(), false, false, pairAEQbTJ.getSecond().getTokenSymbol(), pairAEQbTJ.getFirst().booleanValue(), false, true, null, 21248, null);
            java.lang.String str2 = slippageValue == null ? "" : slippageValue;
            SlippageFeeType slippageFeeTypeOLrzqt = slippageModeEZpvd == SlippageMode.Fixed ? SlippageFeeType.Companion.OLrzqt(slippageLevel) : SlippageFeeType.SlippageLow;
            java.util.List<SlippageRange> slippageRange3 = buySellPreset.getSlippageConfig().getSlippageRange();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : slippageRange3) {
                if (((SlippageRange) obj).getSlippageLevel() != SlippageFeeType.SlippageCustom.getValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((SlippageRange) it3.next()).getSlippageValue());
            }
            c25308iuK.setData(new SlippageViewParam(tradeMode, slippageModeEZpvd2, dynamicParam, new FixedParam(str2, arrayList2, buySellPreset.getSlippageConfig().getFixedMax(), buySellPreset.getSlippageConfig().getFixedMin(), slippageFeeTypeOLrzqt, true, "7", pairKWHzl.getSecond(), pairKWHzl.getFirst(), MemeTransactionSceneType.Market.getValue())));
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(DexAutoSlippageInfoParam dexAutoSlippageInfoParam, SlippageConfigPreset slippageConfigPreset) {
        java.lang.String referenceSlippage;
        java.lang.String referenceSlippage2 = dexAutoSlippageInfoParam != null ? dexAutoSlippageInfoParam.getReferenceSlippage() : null;
        if (referenceSlippage2 == null || referenceSlippage2.length() == 0) {
            return C56390yDp.OLrzqt(slippageConfigPreset.getFixedRecommendMin(), slippageConfigPreset.getFixedRecommendMax());
        }
        if (C23313hvq.OLrzqt(dexAutoSlippageInfoParam != null ? dexAutoSlippageInfoParam.getReferenceSlippage() : null, slippageConfigPreset.getFixedRecommendMax())) {
            java.lang.String fixedRecommendMax = slippageConfigPreset.getFixedRecommendMax();
            referenceSlippage = dexAutoSlippageInfoParam != null ? dexAutoSlippageInfoParam.getReferenceSlippage() : null;
            return C56390yDp.OLrzqt(fixedRecommendMax, referenceSlippage != null ? referenceSlippage : "");
        }
        referenceSlippage = dexAutoSlippageInfoParam != null ? dexAutoSlippageInfoParam.getReferenceSlippage() : null;
        return C56390yDp.OLrzqt(referenceSlippage != null ? referenceSlippage : "", slippageConfigPreset.getFixedRecommendMax());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        MemeModeQuoteBean second;
        C25337iun c25337iun;
        final BuySellPreset buySellPreset;
        DexPresetResultVO value;
        C25337iun c25337iun2;
        kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value2 = AkhnZx().EZpvd().getValue();
        if (value2 == null || (second = value2.getSecond()) == null) {
            return;
        }
        final InterfaceC30984llU interfaceC30984llUCopydefault = AkhnZx().copydefault(second);
        C21574hEk c21574hEk = (C21574hEk) AEQbTJ();
        if (c21574hEk == null || (c25337iun = c21574hEk.EZpvd) == null || (buySellPreset = this.djBIcL) == null || (value = fetchVPNInfo().gEmmrt().getValue()) == null) {
            return;
        }
        C21574hEk c21574hEk2 = (C21574hEk) AEQbTJ();
        if (c21574hEk2 != null && (c25337iun2 = c21574hEk2.EZpvd) != null) {
            c25337iun2.setVisibility(value.getSupportAutoMode() ? 0 : 8);
        }
        if (value.getSupportAutoMode()) {
            c25337iun.setData(new MevRouteParam(TradeMode.Meme, PresetRouteType.Companion.EZpvd(buySellPreset.getRouteConfig().getRouterModeType()), interfaceC30984llUCopydefault.copydefault().copydefault().getChainName(), value.getMevPriceThreshold(), true, MevUnstableShowLevelType.NORMAL, null, 64, null));
            c25337iun.setListener(new C24390ict(new Function1() { // from class: o.llh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30930lkT.copydefault(buySellPreset, this, interfaceC30984llUCopydefault, (PresetRouteType) obj);
                }
            }));
        }
    }

    public static final Unit copydefault(BuySellPreset buySellPreset, C30930lkT c30930lkT, InterfaceC30984llU interfaceC30984llU, PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        buySellPreset.getRouteConfig().setRouterModeType(presetRouteType.getValue());
        PresetChildViewModel presetChildViewModelAkhnZx = c30930lkT.AkhnZx();
        java.util.List<FeeOption> feeOptions = buySellPreset.getFeeConfig().getFeeOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : feeOptions) {
            if (((FeeOption) obj).getFeeLevel() != PriorityFeeType.PriorityCustom.getValue()) {
                arrayList.add(obj);
            }
        }
        presetChildViewModelAkhnZx.copydefault(arrayList, interfaceC30984llU, c30930lkT.AkhnZx().AEQbTJ(c30930lkT.valueOf(), buySellPreset.getRouteConfig().getRouterModeType(), interfaceC30984llU.KWHzl()), c30930lkT.fJNWhG());
        c30930lkT.ejfBZ();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C30986llW c30986llW, MemeModeQuoteBean memeModeQuoteBean) {
        kXA kxa = new kXA(new Function1() { // from class: o.lle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30930lkT.copydefault(this.AEQbTJ, (C25301iuD) obj);
            }
        });
        this.ejfBZ = kxa;
        DeFiPlatformForSwap selectedDeFiPlatform = memeModeQuoteBean.getSelectedDeFiPlatform();
        kxa.OLrzqt(c30986llW, selectedDeFiPlatform != null ? selectedDeFiPlatform.getAutoSlippageInfo() : null);
    }

    public static final Unit copydefault(C30930lkT c30930lkT, C25301iuD c25301iuD) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(c25301iuD, "");
        BuySellPreset buySellPreset = c30930lkT.djBIcL;
        if (buySellPreset != null) {
            buySellPreset.getSlippageConfig().setSlippageType(c25301iuD.copydefault().getType());
            if (c25301iuD.copydefault().getType() == SlippageMode.Dynamic.getType()) {
                buySellPreset.getSlippageConfig().setDynamicMaxSlippageValue(C33129mqd.gEmmrt(c25301iuD.AEQbTJ()));
            } else {
                SlippageFeeType slippageFeeTypeKWHzl = c25301iuD.KWHzl();
                if (slippageFeeTypeKWHzl != null) {
                    int iIntValue = java.lang.Integer.valueOf(slippageFeeTypeKWHzl.getValue()).intValue();
                    for (SlippageRange slippageRange : buySellPreset.getSlippageConfig().getSlippageRange()) {
                        slippageRange.setSelected(slippageRange.getSlippageLevel() == iIntValue);
                    }
                    if (c25301iuD.KWHzl() == SlippageFeeType.SlippageCustom) {
                        java.util.Iterator<T> it = buySellPreset.getSlippageConfig().getSlippageRange().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((SlippageRange) next).getSelected()) {
                                break;
                            }
                        }
                        SlippageRange slippageRange2 = (SlippageRange) next;
                        if (slippageRange2 != null && (strOLrzqt = c25301iuD.OLrzqt()) != null) {
                            slippageRange2.setSlippageValue(strOLrzqt);
                        }
                    }
                }
            }
            c30930lkT.values().KWHzl().setValue(c30930lkT.fARcdN());
        }
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull CommonMemeQuoteParams commonMemeQuoteParams) {
        Intrinsics.checkNotNullParameter(commonMemeQuoteParams, "");
        PresetChildViewModel.memeQuote$default(AkhnZx(), commonMemeQuoteParams, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        java.lang.Object next;
        MemeModeQuoteBean second;
        java.lang.String value;
        MemeModeQuoteBean second2;
        C24380icj c24380icj;
        C24380icj c24380icj2;
        RouteConfig routeConfig;
        BuySellPreset buySellPreset = this.djBIcL;
        if (buySellPreset != null) {
            java.util.Iterator<T> it = buySellPreset.getFeeConfig().getFeeOptions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((FeeOption) next).getSelected()) {
                        break;
                    }
                }
            }
            FeeOption feeOption = (FeeOption) next;
            PresetChildViewModel presetChildViewModelAkhnZx = AkhnZx();
            int feeLevel = feeOption != null ? feeOption.getFeeLevel() : PriorityFeeType.PriorityMarket.getValue();
            PresetChildViewModel presetChildViewModelAkhnZx2 = AkhnZx();
            kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value2 = AkhnZx().EZpvd().getValue();
            if (value2 == null || (second = value2.getSecond()) == null) {
                return;
            }
            InterfaceC30984llU interfaceC30984llUCopydefault = presetChildViewModelAkhnZx2.copydefault(second);
            PresetChildViewModel presetChildViewModelAkhnZx3 = AkhnZx();
            java.lang.String strValueOf = valueOf();
            BuySellPreset buySellPreset2 = this.djBIcL;
            if (buySellPreset2 == null || (routeConfig = buySellPreset2.getRouteConfig()) == null || (value = routeConfig.getRouterModeType()) == null) {
                value = PresetRouteType.RouteTypeAuto.getValue();
            }
            PresetChildViewModel presetChildViewModelAkhnZx4 = AkhnZx();
            kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value3 = AkhnZx().EZpvd().getValue();
            if (value3 == null || (second2 = value3.getSecond()) == null) {
                return;
            }
            java.lang.String strOLrzqt = presetChildViewModelAkhnZx.OLrzqt(feeLevel, interfaceC30984llUCopydefault, presetChildViewModelAkhnZx3.AEQbTJ(strValueOf, value, presetChildViewModelAkhnZx4.copydefault(second2).KWHzl()), (feeOption == null || feeOption.getFeeLevel() != PriorityFeeType.PriorityCustom.getValue()) ? "" : feeOption.getFeeValue());
            C21574hEk c21574hEk = (C21574hEk) AEQbTJ();
            if (c21574hEk != null && (c24380icj2 = c21574hEk.AYXKKw) != null) {
                c24380icj2.setTotalFeeView(C33070mpX.AYXKKw(C23274hvD.Fragment.prepareFromUri), C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, strOLrzqt, false, false, null, false, 30, null), Intrinsics.EZpvd((java.lang.Object) AkhnZx().OLrzqt(), (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue()));
            }
            C21574hEk c21574hEk2 = (C21574hEk) AEQbTJ();
            if (c21574hEk2 == null || (c24380icj = c21574hEk2.AYXKKw) == null) {
                return;
            }
            c24380icj.setTotalFeeShowDetailDialog(new Function0() { // from class: o.llf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C30930lkT.AkhnZx(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit AkhnZx(C30930lkT c30930lkT) {
        MemeModeQuoteBean second;
        MemeModeCommonDexInfo memeModeCommonDexInfo;
        kotlin.Pair<java.lang.Boolean, MemeModeQuoteBean> value = c30930lkT.AkhnZx().EZpvd().getValue();
        if (value != null && (second = value.getSecond()) != null && (memeModeCommonDexInfo = second.getMemeModeCommonDexInfo()) != null) {
            android.content.Context contextRequireContext = c30930lkT.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            new C31047lme(contextRequireContext, c30930lkT.fetchVPNInfo().KWHzl().getTokenSymbol(), memeModeCommonDexInfo.getNonMevPriorityFeeInfo(), c30930lkT.AkhnZx(), c30930lkT.valueOf(), c30930lkT.djBIcL).copydefault();
        }
        return Unit.INSTANCE;
    }
}
