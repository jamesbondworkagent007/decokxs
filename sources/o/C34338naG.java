package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinSharedViewModel;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.dexkline.market.features.coincheck.CoinCheckViewModel;
import com.okinc.dexkline.market.features.overview.domain.BasicInfo;
import com.okinc.dexkline.market.features.overview.domain.MarketInfo;
import com.okinc.dexkline.market.features.overview.domain.MemeInfo;
import com.okinc.dexkline.market.features.overview.domain.Overview;
import com.okinc.dexkline.market.features.overview.domain.TransactionInfo;
import com.okinc.dexkline.market.features.overview.ui.OverviewFragment$displayInfoGrid$1;
import com.okinc.dexkline.market.features.overview.ui.OverviewFragment$displayTagsSection$1;
import com.okinc.dexkline.market.features.overview.ui.OverviewViewModel;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C34496ndF;
import o.C35964oKf;
import o.C52761wXj;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.naG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34338naG extends AbstractC34333naB<oNY> {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public InterfaceC54831xWy AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public int fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public Overview valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.naG$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oNY AYXKKw(C34338naG c34338naG) {
        return (oNY) c34338naG.KWHzl();
    }

    public C34338naG() {
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$3
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$6
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$9
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$12
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$15
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$2
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$5
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
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.naF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34338naG.values(this.OLrzqt);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.naI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34338naG.fetchVPNInfo(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.naG$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.naG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C34338naG copydefault(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            C34338naG c34338naG = new C34338naG();
            android.os.Bundle bundle = new android.os.Bundle();
            C34656ngH.AEQbTJ(bundle, str);
            bundle.putParcelable("latest_market_info_bean", latestMarketInfoBean);
            bundle.putParcelable("token_base", tokenBase);
            c34338naG.setArguments(bundle);
            return c34338naG;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OverviewViewModel fetchVPNInfo() {
        return (OverviewViewModel) this.isConnected.getValue();
    }

    private final MarketCoinSharedViewModel AhwBna() {
        return (MarketCoinSharedViewModel) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Possible override for method o.naB.valueOf()V */
    public final MarketCoinDetailViewModel valueOf() {
        return (MarketCoinDetailViewModel) this.djBIcL.getValue();
    }

    private final RealtimeDataViewModel DbNXlk() {
        return (RealtimeDataViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagViewModel AkhnZx() {
        return (TagViewModel) this.AuCTel.getValue();
    }

    public final CoinCheckViewModel gEmmrt() {
        return (CoinCheckViewModel) this.ejfBZ.getValue();
    }

    private final TokenBase isConnected() {
        return (TokenBase) this.fARcdN.getValue();
    }

    public static final TokenBase values(C34338naG c34338naG) {
        android.os.Bundle arguments = c34338naG.getArguments();
        if (arguments != null) {
            return (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
        }
        return null;
    }

    public final LatestMarketInfoBean AYXKKw() {
        return (LatestMarketInfoBean) this.values.getValue();
    }

    public static final LatestMarketInfoBean fetchVPNInfo(C34338naG c34338naG) {
        android.os.Bundle arguments = c34338naG.getArguments();
        if (arguments != null) {
            return (LatestMarketInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "latest_market_info_bean", LatestMarketInfoBean.class));
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public oNY KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNY onyEZpvd = oNY.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onyEZpvd, "");
        return onyEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    public void copydefault(@NotNull oNY ony, android.os.Bundle bundle) {
        LatestMarketInfoBean latestMarketInfoBeanAYXKKw;
        Intrinsics.checkNotNullParameter(ony, "");
        ony.AkhnZx.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.getNewProxyInstance);
        ony.DbNXlk.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.naJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                C34338naG.OLrzqt(this.KWHzl, view, i, i2, i3, i4);
            }
        });
        values();
        if (fetchVPNInfo().AEQbTJ().getValue().EZpvd() == null) {
            OverviewViewModel.getOverviewData$default(fetchVPNInfo(), false, 1, null);
        }
        fetchVPNInfo().EZpvd();
        OverviewViewModel.getTransactionData$default(fetchVPNInfo(), null, 1, null);
        TokenBase tokenBaseIsConnected = isConnected();
        if (tokenBaseIsConnected == null || (latestMarketInfoBeanAYXKKw = AYXKKw()) == null || latestMarketInfoBeanAYXKKw.getNotSupportTxNativeToken()) {
            return;
        }
        CoinCheckViewModel.loadCoinCheckData$default(gEmmrt(), tokenBaseIsConnected.getTokenContractAddress(), tokenBaseIsConnected.getChainId(), false, 4, null);
    }

    public static final void OLrzqt(C34338naG c34338naG, android.view.View view, int i, int i2, int i3, int i4) {
        c34338naG.fetchVPNInfo = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, o.AbstractC32998moE
    public void onVisible() {
        C34429nbs c34429nbs;
        oNY ony = (oNY) KWHzl();
        if (ony == null || (c34429nbs = ony.copydefault) == null) {
            return;
        }
        c34429nbs.setonPlatformClickListener(new Function0() { // from class: o.naK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34338naG.AkhnZx(this.KWHzl);
            }
        });
    }

    public static final Unit AkhnZx(C34338naG c34338naG) {
        MemeInfo memeInfoEZpvd;
        java.lang.String strEZpvd;
        Overview overview = c34338naG.valueOf;
        if (overview != null && (memeInfoEZpvd = overview.EZpvd()) != null && (strEZpvd = memeInfoEZpvd.EZpvd()) != null) {
            c34338naG.AEQbTJ(strEZpvd);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, o.AbstractC32998moE
    public void onInvisible() {
        C34429nbs c34429nbs;
        oNY ony = (oNY) KWHzl();
        if (ony == null || (c34429nbs = ony.copydefault) == null) {
            return;
        }
        c34429nbs.setonPlatformClickListener(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C34400nbP c34400nbP;
        super.setListener();
        oNY ony = (oNY) KWHzl();
        if (ony != null) {
            ony.isConnected.AhwBna(false);
            ony.isConnected.OLrzqt((InterfaceC57901yrE) new ActionBar());
        }
        mUN.collectOnViewLifecycle$default(this, fetchVPNInfo().AEQbTJ(), null, new TaskDescription(), 2, null);
        mUN.collectOnViewLifecycle$default(this, fetchVPNInfo().copydefault(), null, new FragmentManager(), 2, null);
        mUN.AEQbTJ(this, DbNXlk().EZpvd(), Lifecycle.State.RESUMED, new LoaderManager());
        oNY ony2 = (oNY) KWHzl();
        if (ony2 != null && (c34400nbP = ony2.values) != null) {
            c34400nbP.setOnTimeClick(new Function1() { // from class: o.naC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34338naG.AEQbTJ(this.OLrzqt, (FilterTimeDuration) obj);
                }
            });
        }
        mUN.collectOnViewLifecycle$default(this, fetchVPNInfo().KWHzl(), null, Dialog.KWHzl, 2, null);
        gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.naD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34338naG.copydefault(this.OLrzqt, (C32296mWt) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.naG$ActionBar */
    public static final class ActionBar implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public ActionBar() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C34338naG.this.fetchVPNInfo().EZpvd(false);
            OverviewViewModel.getTransactionData$default(C34338naG.this.fetchVPNInfo(), null, 1, null);
            InterfaceC54831xWy interfaceC54831xWy = C34338naG.this.AYXKKw;
            if (interfaceC54831xWy != null) {
                interfaceC54831xWy.OLrzqt();
            }
        }
    }

    /* JADX INFO: renamed from: o.naG$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34350naS c34350naS, Continuation<? super Unit> continuation) {
            C33546myW c33546myW;
            oNY onyAYXKKw = C34338naG.AYXKKw(C34338naG.this);
            if (onyAYXKKw != null && (c33546myW = onyAYXKKw.isConnected) != null) {
                c33546myW.djBIcL(!c34350naS.AEQbTJ());
            }
            C34338naG.this.EZpvd(c34350naS.AEQbTJ());
            oNY onyAYXKKw2 = C34338naG.AYXKKw(C34338naG.this);
            if (onyAYXKKw2 != null) {
                C55113xdn c55113xdn = onyAYXKKw2.valueOf;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(c34350naS.KWHzl() ? 0 : 8);
                NestedScrollView nestedScrollView = onyAYXKKw2.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                nestedScrollView.setVisibility((c34350naS.AEQbTJ() || c34350naS.KWHzl()) ? 8 : 0);
            }
            C34338naG.this.AEQbTJ(c34350naS.EZpvd());
            if (!c34350naS.KWHzl()) {
                rVN.reportFullyDrawn$default(C34338naG.this, !c34350naS.AEQbTJ(), (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.naG$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34351naT c34351naT, Continuation<? super Unit> continuation) {
            oNY onyAYXKKw;
            C34400nbP c34400nbP;
            if (!c34351naT.copydefault() && (onyAYXKKw = C34338naG.AYXKKw(C34338naG.this)) != null && (c34400nbP = onyAYXKKw.values) != null) {
                c34400nbP.copydefault(c34351naT.EZpvd());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.naG$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TransactionInfo transactionInfo, Continuation<? super Unit> continuation) {
            oNY onyAYXKKw;
            C34400nbP c34400nbP;
            if (transactionInfo != null && (onyAYXKKw = C34338naG.AYXKKw(C34338naG.this)) != null && (c34400nbP = onyAYXKKw.values) != null) {
                c34400nbP.copydefault(transactionInfo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit AEQbTJ(C34338naG c34338naG, FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        c34338naG.fetchVPNInfo().copydefault(filterTimeDuration);
        c34338naG.DbNXlk().KWHzl(filterTimeDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.naG$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        public static final Dialog<T> KWHzl = new Dialog<>();

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<EarnRecommendApyBean> list, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C34338naG c34338naG, C32296mWt c32296mWt) {
        oNY ony;
        C34412nbb c34412nbb;
        C32299mWw c32299mWwCopydefault = c32296mWt.copydefault();
        if (c32299mWwCopydefault != null && (ony = (oNY) c34338naG.KWHzl()) != null && (c34412nbb = ony.AEQbTJ) != null) {
            c34412nbb.KWHzl(c32299mWwCopydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C33546myW c33546myW;
        C55173xeu c55173xeu;
        oNY ony = (oNY) KWHzl();
        if (ony != null && (c55173xeu = ony.OLrzqt) != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.RKcVTr));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.AwvSrB));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.naE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34338naG.OLrzqt(this.OLrzqt, view);
                }
            });
        }
        oNY ony2 = (oNY) KWHzl();
        if (ony2 == null || (c33546myW = ony2.isConnected) == null) {
            return;
        }
        C57589ylK.KWHzl(c33546myW, false);
    }

    public static final void OLrzqt(C34338naG c34338naG, android.view.View view) {
        if (c34338naG.isConnected() != null) {
            OverviewViewModel.getOverviewData$default(c34338naG.fetchVPNInfo(), false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(Overview overview) {
        C34390nbF c34390nbF;
        C34390nbF c34390nbF2;
        C34429nbs c34429nbs;
        if (overview == null) {
            return;
        }
        this.valueOf = overview;
        oNY ony = (oNY) KWHzl();
        if (ony != null) {
            C33546myW c33546myW = ony.isConnected;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, false);
            ony.DbNXlk.setVisibility(0);
            oNY ony2 = (oNY) KWHzl();
            if (ony2 != null && (c34429nbs = ony2.copydefault) != null) {
                LatestMarketInfoBean latestMarketInfoBeanAYXKKw = AYXKKw();
                java.lang.String tokenLogoUrl = latestMarketInfoBeanAYXKKw != null ? latestMarketInfoBeanAYXKKw.getTokenLogoUrl() : null;
                java.lang.String str = tokenLogoUrl == null ? "" : tokenLogoUrl;
                LatestMarketInfoBean latestMarketInfoBeanAYXKKw2 = AYXKKw();
                java.lang.String tokenLargeLogoUrl = latestMarketInfoBeanAYXKKw2 != null ? latestMarketInfoBeanAYXKKw2.getTokenLargeLogoUrl() : null;
                java.lang.String str2 = tokenLargeLogoUrl == null ? "" : tokenLargeLogoUrl;
                java.lang.String strEZpvd = overview.AEQbTJ().EZpvd();
                java.lang.String strValueOf = overview.AEQbTJ().valueOf();
                java.lang.String strOLrzqt = overview.AEQbTJ().OLrzqt();
                java.lang.String strDjBIcL = overview.KWHzl().djBIcL();
                java.lang.String strAEQbTJ = overview.AEQbTJ().AEQbTJ();
                java.lang.String strOLrzqt2 = overview.EZpvd().OLrzqt();
                java.lang.String strAEQbTJ2 = overview.EZpvd().AEQbTJ();
                java.lang.String strEZpvd2 = overview.EZpvd().EZpvd();
                java.util.List<TagWrapper> value = valueOf().valueOf().getValue();
                if (value == null) {
                    value = yDY.AhwBna();
                }
                c34429nbs.OLrzqt(new C34422nbl(str, str2, strEZpvd, strValueOf, strOLrzqt, strDjBIcL, strAEQbTJ, strOLrzqt2, strAEQbTJ2, strEZpvd2, value));
            }
            EZpvd(overview);
            copydefault(overview);
            AhwBna().OLrzqt(overview.KWHzl());
            java.lang.Float fCopydefault = overview.EZpvd().copydefault();
            if (fCopydefault != null) {
                fCopydefault.floatValue();
                oNY ony3 = (oNY) KWHzl();
                if (ony3 != null && (c34390nbF2 = ony3.AYXKKw) != null) {
                    c34390nbF2.setVisibility(0);
                }
                oNY ony4 = (oNY) KWHzl();
                if (ony4 != null && (c34390nbF = ony4.AYXKKw) != null) {
                    c34390nbF.setData(overview.EZpvd());
                }
            }
            OLrzqt(overview);
            ony.values.copydefault(overview.AYXKKw());
        }
    }

    /* JADX INFO: renamed from: o.naG$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            C34338naG.this.EZpvd(tokenDetail);
            return Unit.INSTANCE;
        }
    }

    private final void values() {
        mUN.collectOnViewLifecycle$default(this, DbNXlk().OLrzqt(), null, new StateListAnimator(), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(Overview overview) {
        C34396nbL c34396nbL;
        oNY ony = (oNY) KWHzl();
        if (ony == null || (c34396nbL = ony.gEmmrt) == null) {
            return;
        }
        BasicInfo basicInfoAEQbTJ = overview.AEQbTJ();
        final java.lang.String str = "https://x.com/search?q=(%24" + basicInfoAEQbTJ.valueOf() + "%20OR%20" + basicInfoAEQbTJ.copydefault() + ")";
        c34396nbL.setOnSearchClickListener(new Function0() { // from class: o.naL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34338naG.AEQbTJ(this.EZpvd, str);
            }
        });
        c34396nbL.OLrzqt(overview.djBIcL());
    }

    public static final Unit AEQbTJ(C34338naG c34338naG, java.lang.String str) {
        c34338naG.EZpvd(str);
        return Unit.INSTANCE;
    }

    private final void EZpvd(final java.lang.String str) {
        if (fetchVPNInfo().OLrzqt()) {
            android.content.Context context = getContext();
            if (context != null) {
                mUO.KWHzl(context, C33070mpX.AYXKKw(C35964oKf.Fragment.QWpYiD), C33070mpX.AYXKKw(C35964oKf.Fragment.DGGHxk), C33070mpX.AYXKKw(C35964oKf.Fragment.getSessionID), C35964oKf.Fragment.aKErDB, C33070mpX.AYXKKw(C35964oKf.Fragment.RcXXUw), new Function1() { // from class: o.naH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34338naG.EZpvd(this.copydefault, str, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            return;
        }
        AEQbTJ(str);
    }

    public static final Unit EZpvd(C34338naG c34338naG, java.lang.String str, boolean z) {
        if (z) {
            c34338naG.fetchVPNInfo().gEmmrt();
            c34338naG.fetchVPNInfo().EZpvd();
        }
        c34338naG.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.lang.String str) {
        java.lang.String message;
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            startActivity(intent);
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }

    public final void EZpvd(Overview overview) {
        BasicInfo basicInfoAEQbTJ = overview.AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OverviewFragment$displayTagsSection$1(this, overview, basicInfoAEQbTJ, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(TokenDetail tokenDetail) {
        C34412nbb c34412nbb;
        oNY ony = (oNY) KWHzl();
        if (ony == null || (c34412nbb = ony.AEQbTJ) == null) {
            return;
        }
        c34412nbb.AEQbTJ(tokenDetail);
    }

    public final void copydefault(Overview overview) {
        MarketInfo marketInfoKWHzl = overview.KWHzl();
        BasicInfo basicInfoAEQbTJ = overview.AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OverviewFragment$displayInfoGrid$1(this, basicInfoAEQbTJ, marketInfoKWHzl, null), 3, null);
    }

    public final void KWHzl(Overview overview) {
        TokenBase tokenBaseIsConnected = isConnected();
        if (tokenBaseIsConnected != null) {
            C32318mXo c32318mXoCopydefault = C32318mXo.Companion.copydefault(tokenBaseIsConnected.getChainId(), tokenBaseIsConnected.getTokenContractAddress(), overview.EZpvd().OLrzqt().length() > 0, false, overview.AEQbTJ().OLrzqt(), overview.AEQbTJ().KWHzl(), "header");
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c32318mXoCopydefault.show(parentFragmentManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ejfBZ() {
        boolean z;
        C34496ndF.Application application = C34496ndF.Companion;
        TokenBase tokenBaseIsConnected = isConnected();
        java.lang.String chainId = tokenBaseIsConnected != null ? tokenBaseIsConnected.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        TokenBase tokenBaseIsConnected2 = isConnected();
        if (tokenBaseIsConnected2 != null) {
            z = tokenBaseIsConnected2.isMemeToken();
        }
        application.KWHzl(new TagExplanationBottomSheetParams(chainId, z)).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C34496ndF.class).valueOf());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C34396nbL c34396nbL;
        C34431nbu c34431nbu;
        C34400nbP c34400nbP;
        oNY ony = (oNY) KWHzl();
        if (ony != null && (c34400nbP = ony.values) != null) {
            c34400nbP.EZpvd();
        }
        oNY ony2 = (oNY) KWHzl();
        if (ony2 != null && (c34431nbu = ony2.AhwBna) != null) {
            c34431nbu.copydefault();
        }
        oNY ony3 = (oNY) KWHzl();
        if (ony3 != null && (c34396nbL = ony3.gEmmrt) != null) {
            c34396nbL.KWHzl();
        }
        super.onDestroyView();
    }
}
