package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory.FilterTimeDuration;
import com.okinc.business.market.features.ai_summary.MemeAiFragmentParams;
import com.okinc.business.market.features.coincheck.CoinCheckViewModel;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.MemeInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.domain.StockInfo;
import com.okinc.business.market.features.overview.domain.TransactionInfo;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayDefiInfo$1$1;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displaySocialInfo$1;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayStockInfo$1$1;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayTagsInfo$1;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayVibes$1$1;
import com.okinc.business.market.features.overview.ui.OverviewFragment$displayVibes$1$2;
import com.okinc.business.market.features.overview.ui.OverviewFragment$getDevAnalysisTagWrapper$1;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.overview.ui.widget.InfoItem;
import com.okinc.business.market.features.overview.ui.widget.WidgetOrderManager;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagLocalProperty;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.features.tag.ui.TagStaticDataParams;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import com.okinc.business.market.widget.tag.TagEventSource;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C26032jPk;
import o.C29717kys;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.klE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28988klE extends AbstractC28990klG<hAO> {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public TokenDetailEventTrackingInfo AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public WidgetOrderManager ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public InterfaceC21868hPh fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public C25787jGi values;

    /* JADX INFO: renamed from: o.klE$Application */
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
    public final void AEQbTJ(@NotNull InterfaceC21868hPh interfaceC21868hPh) {
        Intrinsics.checkNotNullParameter(interfaceC21868hPh, "");
        this.fetchVPNInfo = interfaceC21868hPh;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hAO EZpvd(C28988klE c28988klE) {
        return (hAO) c28988klE.aX_();
    }

    public C28988klE() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$6
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$9
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$activityViewModels$default$12
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$2
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.overview.ui.OverviewFragment$special$$inlined$viewModels$default$5
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
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.klQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28988klE.fIwbmz(this.KWHzl);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.klM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28988klE.ejfBZ(this.EZpvd);
            }
        });
    }

    /* JADX INFO: renamed from: o.klE$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.klE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C28988klE AEQbTJ(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            C28988klE c28988klE = new C28988klE();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("latest_market_info_bean", latestMarketInfoBean);
            bundle.putParcelable("token_base", tokenBase);
            c28988klE.setArguments(bundle);
            return c28988klE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OverviewViewModel fIwbmz() {
        return (OverviewViewModel) this.DbNXlk.getValue();
    }

    public final MarketCoinDetailViewModel gEmmrt() {
        return (MarketCoinDetailViewModel) this.AYXKKw.getValue();
    }

    private final RealtimeDataViewModel fARcdN() {
        return (RealtimeDataViewModel) this.AkhnZx.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TagViewModel fJNWhG() {
        return (TagViewModel) this.AuCTel.getValue();
    }

    /* JADX DEBUG: Possible override for method o.klG.valueOf()V */
    public final CoinCheckViewModel valueOf() {
        return (CoinCheckViewModel) this.fARcdN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenBase ejfBZ() {
        return (TokenBase) this.fIwbmz.getValue();
    }

    public static final TokenBase fIwbmz(C28988klE c28988klE) {
        android.os.Bundle arguments = c28988klE.getArguments();
        if (arguments != null) {
            return (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
        }
        return null;
    }

    public final LatestMarketInfoBean djBIcL() {
        return (LatestMarketInfoBean) this.isConnected.getValue();
    }

    public static final LatestMarketInfoBean ejfBZ(C28988klE c28988klE) {
        android.os.Bundle arguments = c28988klE.getArguments();
        if (arguments != null) {
            return (LatestMarketInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "latest_market_info_bean", LatestMarketInfoBean.class));
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hAO KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAO haoAEQbTJ = hAO.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(haoAEQbTJ, "");
        return haoAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    public void KWHzl(@NotNull hAO hao, android.os.Bundle bundle) {
        LatestMarketInfoBean latestMarketInfoBeanDjBIcL;
        Intrinsics.checkNotNullParameter(hao, "");
        hao.djBIcL.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        hao.AhwBna.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.klO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                C28988klE.AEQbTJ(this.AEQbTJ, view, i, i2, i3, i4);
            }
        });
        this.ejfBZ = new WidgetOrderManager(hao);
        isConnected();
        if (fIwbmz().copydefault().getValue().AEQbTJ() == null) {
            OverviewViewModel.getOverviewData$default(fIwbmz(), false, 1, null);
        }
        fIwbmz().OLrzqt();
        OverviewViewModel.getTransactionData$default(fIwbmz(), null, 1, null);
        OverviewViewModel overviewViewModelFIwbmz = fIwbmz();
        LatestMarketInfoBean latestMarketInfoBeanDjBIcL2 = djBIcL();
        overviewViewModelFIwbmz.KWHzl(latestMarketInfoBeanDjBIcL2 != null ? latestMarketInfoBeanDjBIcL2.getTokenContractAddress() : null);
        fIwbmz().gEmmrt();
        TokenBase tokenBaseEjfBZ = ejfBZ();
        if (tokenBaseEjfBZ == null || (latestMarketInfoBeanDjBIcL = djBIcL()) == null || latestMarketInfoBeanDjBIcL.getNotSupportTxNativeToken()) {
            return;
        }
        CoinCheckViewModel.loadCoinCheckData$default(valueOf(), tokenBaseEjfBZ.getTokenContractAddress(), tokenBaseEjfBZ.getChainId(), false, 4, null);
    }

    public static final void AEQbTJ(C28988klE c28988klE, android.view.View view, int i, int i2, int i3, int i4) {
        InterfaceC21868hPh interfaceC21868hPh = c28988klE.fetchVPNInfo;
        if (interfaceC21868hPh != null) {
            interfaceC21868hPh.OLrzqt(i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C29049kmM c29049kmM;
        super.setListener();
        hAO hao = (hAO) aX_();
        if (hao != null) {
            hao.gEmmrt.AhwBna(false);
            hao.gEmmrt.OLrzqt((InterfaceC57901yrE) new ActionBar());
        }
        C25390ivn.collectOnViewLifecycle$default(this, fIwbmz().copydefault(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fIwbmz().valueOf(), null, new PendingIntent(), 2, null);
        C25390ivn.AEQbTJ(this, fARcdN().AEQbTJ(), Lifecycle.State.RESUMED, new FragmentManager());
        hAO hao2 = (hAO) aX_();
        if (hao2 != null && (c29049kmM = hao2.isConnected) != null) {
            c29049kmM.setOnTimeClick(new Function1() { // from class: o.klL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28988klE.OLrzqt(this.copydefault, (FilterTimeDuration) obj);
                }
            });
        }
        C25390ivn.collectOnViewLifecycle$default(this, fIwbmz().AhwBna(), null, new Dialog(), 2, null);
        valueOf().AEQbTJ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.klI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28988klE.OLrzqt(this.OLrzqt, (jNF) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.klE$ActionBar */
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
            C28988klE.this.fIwbmz().EZpvd(false);
            OverviewViewModel.getTransactionData$default(C28988klE.this.fIwbmz(), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.klE$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29063kma c29063kma, Continuation<? super Unit> continuation) {
            BasicInfo basicInfoKWHzl;
            BasicInfo basicInfoKWHzl2;
            BasicInfo basicInfoKWHzl3;
            C28988klE.this.KWHzl(c29063kma.OLrzqt());
            hAO haoEZpvd = C28988klE.EZpvd(C28988klE.this);
            if (haoEZpvd != null) {
                C55113xdn c55113xdn = haoEZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                int i = 8;
                c55113xdn.setVisibility(c29063kma.copydefault() ? 0 : 8);
                NestedScrollView nestedScrollView = haoEZpvd.AhwBna;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                if (!c29063kma.OLrzqt() && !c29063kma.copydefault()) {
                    i = 0;
                }
                nestedScrollView.setVisibility(i);
            }
            C28988klE.this.valueOf(c29063kma.AEQbTJ());
            C28988klE c28988klE = C28988klE.this;
            java.lang.String strKWHzl = c28988klE.fIwbmz().KWHzl();
            Overview overviewAEQbTJ = c29063kma.AEQbTJ();
            java.lang.String strEZpvd = (overviewAEQbTJ == null || (basicInfoKWHzl3 = overviewAEQbTJ.KWHzl()) == null) ? null : basicInfoKWHzl3.EZpvd();
            java.lang.String str = strEZpvd == null ? "" : strEZpvd;
            TokenBase tokenBaseEjfBZ = C28988klE.this.ejfBZ();
            java.lang.String chainId = tokenBaseEjfBZ != null ? tokenBaseEjfBZ.getChainId() : null;
            java.lang.String str2 = chainId == null ? "" : chainId;
            Overview overviewAEQbTJ2 = c29063kma.AEQbTJ();
            java.lang.String strAhwBna = (overviewAEQbTJ2 == null || (basicInfoKWHzl2 = overviewAEQbTJ2.KWHzl()) == null) ? null : basicInfoKWHzl2.AhwBna();
            java.lang.String str3 = strAhwBna == null ? "" : strAhwBna;
            Overview overviewAEQbTJ3 = c29063kma.AEQbTJ();
            java.lang.String strGEmmrt = (overviewAEQbTJ3 == null || (basicInfoKWHzl = overviewAEQbTJ3.KWHzl()) == null) ? null : basicInfoKWHzl.gEmmrt();
            c28988klE.AhwBna = new TokenDetailEventTrackingInfo(strKWHzl, str, str2, str3, strGEmmrt == null ? "" : strGEmmrt, C28988klE.this.gEmmrt().getNewProxyInstance(), C28988klE.this.fIwbmz().djBIcL());
            hAO haoEZpvd2 = C28988klE.EZpvd(C28988klE.this);
            if (haoEZpvd2 != null) {
                C28988klE c28988klE2 = C28988klE.this;
                haoEZpvd2.AkhnZx.setEventTrackingInfo(c28988klE2.AhwBna);
                haoEZpvd2.isConnected.setEventTrackingInfo(c28988klE2.AhwBna);
                haoEZpvd2.ejfBZ.setEventTrackingInfo(c28988klE2.AhwBna);
            }
            C25787jGi c25787jGi = C28988klE.this.values;
            if (c25787jGi != null) {
                c25787jGi.OLrzqt(C28988klE.this.AhwBna);
            }
            if (c29063kma.AEQbTJ() != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C28988klE.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (c29063kma.OLrzqt()) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C28988klE.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.klE$PendingIntent */
    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29009klZ c29009klZ, Continuation<? super Unit> continuation) {
            hAO haoEZpvd;
            C29049kmM c29049kmM;
            if (!c29009klZ.OLrzqt() && (haoEZpvd = C28988klE.EZpvd(C28988klE.this)) != null && (c29049kmM = haoEZpvd.isConnected) != null) {
                c29049kmM.EZpvd(c29009klZ.AEQbTJ());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.klE$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TransactionInfo transactionInfo, Continuation<? super Unit> continuation) {
            hAO haoEZpvd;
            C29049kmM c29049kmM;
            if (transactionInfo != null && (haoEZpvd = C28988klE.EZpvd(C28988klE.this)) != null && (c29049kmM = haoEZpvd.isConnected) != null) {
                c29049kmM.KWHzl(transactionInfo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(C28988klE c28988klE, FilterTimeDuration filterTimeDuration) {
        Intrinsics.checkNotNullParameter(filterTimeDuration, "");
        c28988klE.fIwbmz().copydefault(filterTimeDuration);
        c28988klE.fARcdN().copydefault(filterTimeDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.klE$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29116kna c29116kna, Continuation<? super Unit> continuation) {
            C28988klE.this.OLrzqt(c29116kna);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C28988klE c28988klE, jNF jnf) {
        hAO hao;
        C29086kmx c29086kmx;
        C4147AzP c4147AzPCopydefault = jnf.copydefault();
        if (c4147AzPCopydefault != null && (hao = (hAO) c28988klE.aX_()) != null && (c29086kmx = hao.values) != null) {
            c29086kmx.EZpvd(c4147AzPCopydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        C33546myW c33546myW;
        C55173xeu c55173xeu;
        hAO hao = (hAO) aX_();
        if (hao != null && (c55173xeu = hao.EZpvd) != null) {
            c55173xeu.setVisibility(z ? 0 : 8);
            java.lang.String string = getString(C23274hvD.Fragment.ActivityResultKt);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            java.lang.String string2 = getString(C23274hvD.Fragment.UscePu);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            java.lang.String string3 = getString(C23274hvD.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.klN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28988klE.OLrzqt(this.EZpvd, view);
                }
            });
        }
        hAO hao2 = (hAO) aX_();
        if (hao2 == null || (c33546myW = hao2.gEmmrt) == null) {
            return;
        }
        C57589ylK.KWHzl(c33546myW, false);
    }

    public static final void OLrzqt(C28988klE c28988klE, android.view.View view) {
        if (c28988klE.ejfBZ() != null) {
            OverviewViewModel.getOverviewData$default(c28988klE.fIwbmz(), false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf(Overview overview) {
        hAO hao;
        if (overview == null || (hao = (hAO) aX_()) == null) {
            return;
        }
        C33546myW c33546myW = hao.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, false);
        NestedScrollView nestedScrollView = hao.AhwBna;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
        nestedScrollView.setVisibility(0);
        boolean zAYXKKw = overview.KWHzl().AYXKKw();
        boolean zDjBIcL = overview.KWHzl().djBIcL();
        boolean zValues = overview.KWHzl().values();
        copydefault(overview, zAYXKKw);
        if (zAYXKKw) {
            hao.copydefault.setBackground(null);
            LinearLayoutCompat linearLayoutCompat = hao.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            android.content.Context context = hao.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            linearLayoutCompat.setPadding(0, C55298xhM.copydefault(8.0f, context), 0, 0);
        } else {
            copydefault(overview);
            KWHzl(overview.OLrzqt());
            if (!zDjBIcL && !zValues) {
                OLrzqt(overview);
            }
        }
        if (zValues && overview.djBIcL() != null) {
            EZpvd(overview.djBIcL());
        }
        AEQbTJ(overview.AEQbTJ().AhwBna(), overview.KWHzl().OLrzqt(), zAYXKKw || zDjBIcL);
        KWHzl(overview);
        AEQbTJ(overview);
        AYXKKw();
        C29049kmM c29049kmM = hao.isConnected;
        Intrinsics.checkNotNullExpressionValue(c29049kmM, "");
        TokenBase tokenBaseEjfBZ = ejfBZ();
        c29049kmM.setVisibility((tokenBaseEjfBZ != null && tokenBaseEjfBZ.isBtc()) ^ true ? 0 : 8);
        hao.isConnected.KWHzl(overview.AhwBna());
        WidgetOrderManager widgetOrderManager = this.ejfBZ;
        if (widgetOrderManager != null) {
            widgetOrderManager.AEQbTJ(zAYXKKw, zDjBIcL, zValues);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(Overview overview, boolean z) {
        C29068kmf c29068kmf;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29068kmf = hao.DbNXlk) == null) {
            return;
        }
        LatestMarketInfoBean latestMarketInfoBeanDjBIcL = djBIcL();
        java.lang.String tokenLogoUrl = latestMarketInfoBeanDjBIcL != null ? latestMarketInfoBeanDjBIcL.getTokenLogoUrl() : null;
        java.lang.String str = tokenLogoUrl == null ? "" : tokenLogoUrl;
        LatestMarketInfoBean latestMarketInfoBeanDjBIcL2 = djBIcL();
        java.lang.String tokenLargeLogoUrl = latestMarketInfoBeanDjBIcL2 != null ? latestMarketInfoBeanDjBIcL2.getTokenLargeLogoUrl() : null;
        java.lang.String str2 = tokenLargeLogoUrl == null ? "" : tokenLargeLogoUrl;
        java.lang.String strAEQbTJ = overview.KWHzl().AEQbTJ();
        java.lang.String strGEmmrt = overview.KWHzl().gEmmrt();
        java.lang.String strValueOf = overview.KWHzl().valueOf();
        java.lang.String strAhwBna = z ? overview.AEQbTJ().AhwBna() : null;
        java.lang.String str3 = strAhwBna == null ? "" : strAhwBna;
        java.lang.String strAEQbTJ2 = overview.OLrzqt().AEQbTJ();
        java.lang.String strEZpvd = overview.OLrzqt().EZpvd();
        java.lang.String strOLrzqt = overview.OLrzqt().OLrzqt();
        java.util.List<TagWrapper> value = gEmmrt().djBIcL().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        c29068kmf.copydefault(new C29064kmb(str, str2, null, null, null, strAEQbTJ, null, strGEmmrt, strValueOf, str3, strAEQbTJ2, strEZpvd, strOLrzqt, value, fIwbmz().djBIcL(), 92, null), gEmmrt().getNewProxyInstance());
    }

    /* JADX INFO: renamed from: o.klE$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            C28988klE.this.copydefault(tokenDetail);
            return Unit.INSTANCE;
        }
    }

    public final void isConnected() {
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().EZpvd(), null, new TaskDescription(), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        TokenBase tokenBaseEjfBZ;
        hAO hao;
        C29053kmQ c29053kmQ;
        if (!Intrinsics.EZpvd(gEmmrt().fIwbmz().getValue(), java.lang.Boolean.TRUE) || this.valueOf || (tokenBaseEjfBZ = ejfBZ()) == null || (hao = (hAO) aX_()) == null || (c29053kmQ = hao.AuCTel) == null) {
            return;
        }
        InterfaceC25429iwZ interfaceC25429iwZ = (InterfaceC25429iwZ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25429iwZ.class));
        androidx.fragment.app.Fragment fragmentEZpvd = interfaceC25429iwZ != null ? interfaceC25429iwZ.EZpvd(C33129mqd.valueOf(tokenBaseEjfBZ.getChainId()), tokenBaseEjfBZ.getTokenContractAddress(), true) : null;
        if (fragmentEZpvd != null) {
            c29053kmQ.setVisibility(0);
            c29053kmQ.setOnTitleClick(new OverviewFragment$displayDefiInfo$1$1(this));
            getChildFragmentManager().beginTransaction().replace(c29053kmQ.copydefault(), fragmentEZpvd).commitAllowingStateLoss();
            this.valueOf = true;
            return;
        }
        c29053kmQ.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(StockInfo stockInfo) {
        C29057kmU c29057kmU;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29057kmU = hao.fIwbmz) == null) {
            return;
        }
        c29057kmU.setVisibility(0);
        c29057kmU.OLrzqt(stockInfo, new OverviewFragment$displayStockInfo$1$1(this), new Function1() { // from class: o.klH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28988klE.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: o.klK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28988klE.AuCTel(this.OLrzqt);
            }
        });
    }

    public static final Unit copydefault(C28988klE c28988klE, boolean z) {
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo;
        if (z && (tokenDetailEventTrackingInfo = c28988klE.AhwBna) != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.EXPAND_STOCK_INFO, CoinDetailTabType.INFO);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C28988klE c28988klE) {
        C25796jGr c25796jGrOLrzqt = C25796jGr.Companion.OLrzqt(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhenfullyDrawnReporter1, C23274hvD.Fragment.ReportDrawnKtReportDrawnAfter2);
        androidx.fragment.app.FragmentManager childFragmentManager = c28988klE.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25796jGrOLrzqt.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        TokenBase tokenBaseEjfBZ;
        hAO hao;
        android.widget.FrameLayout frameLayout;
        if (this.values == null) {
            if ((z && str2.length() == 0) || (tokenBaseEjfBZ = ejfBZ()) == null || (hao = (hAO) aX_()) == null || (frameLayout = hao.KWHzl) == null) {
                return;
            }
            frameLayout.setVisibility(0);
            C25787jGi c25787jGiCopydefault = C25787jGi.Companion.copydefault(new MemeAiFragmentParams(tokenBaseEjfBZ.getChainId(), tokenBaseEjfBZ.getTokenSymbol(), tokenBaseEjfBZ.getTokenContractAddress(), true, str, str2));
            getChildFragmentManager().beginTransaction().replace(frameLayout.getId(), c25787jGiCopydefault).commitNowAllowingStateLoss();
            this.values = c25787jGiCopydefault;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        android.widget.FrameLayout frameLayout;
        hAO hao = (hAO) aX_();
        if (hao == null || (frameLayout = hao.KWHzl) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(Overview overview) {
        C29044kmH c29044kmH;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29044kmH = hao.AkhnZx) == null) {
            return;
        }
        c29044kmH.OLrzqt(overview.valueOf(), overview.KWHzl().AhwBna(), overview.KWHzl().valueOf(), overview.KWHzl().gEmmrt(), new OverviewFragment$displaySocialInfo$1(this));
    }

    public final void EZpvd(final java.lang.String str) {
        if (fIwbmz().AYXKKw()) {
            android.content.Context context = getContext();
            if (context != null) {
                java.lang.String string = getString(C23274hvD.Fragment.ComponentActivityNonConfigurationInstances);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String string2 = getString(C23274hvD.Fragment.onStateChanged);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                java.lang.String string3 = getString(C23274hvD.Fragment.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                int i = C23274hvD.Fragment.QKVWgx;
                java.lang.String string4 = getString(C23274hvD.Fragment.ORxRYg);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                C25352ivB.KWHzl(context, string, string2, string3, i, string4, new Function1() { // from class: o.klP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C28988klE.KWHzl(this.KWHzl, str, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            return;
        }
        android.content.Context context2 = getContext();
        if (context2 != null) {
            C25352ivB.copydefault(context2, str);
        }
    }

    public static final Unit KWHzl(C28988klE c28988klE, java.lang.String str, boolean z) {
        if (z) {
            c28988klE.fIwbmz().DbNXlk();
            c28988klE.fIwbmz().OLrzqt();
        }
        android.content.Context context = c28988klE.getContext();
        if (context != null) {
            C25352ivB.copydefault(context, str);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(Overview overview) {
        C29055kmS c29055kmS;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29055kmS = hao.AYXKKw) == null) {
            return;
        }
        boolean z = overview.AEQbTJ().AhwBna().length() > 0 || overview.KWHzl().AhwBna().length() > 0;
        c29055kmS.setVisibility(z ? 0 : 8);
        if (z) {
            c29055kmS.OLrzqt(overview.KWHzl().AhwBna(), overview.AEQbTJ().AhwBna());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(MemeInfo memeInfo) {
        C29037kmA c29037kmA;
        java.lang.Float fKWHzl;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29037kmA = hao.AEQbTJ) == null || (fKWHzl = memeInfo.KWHzl()) == null) {
            return;
        }
        fKWHzl.floatValue();
        c29037kmA.setVisibility(0);
        c29037kmA.setData(memeInfo);
    }

    public final void OLrzqt(Overview overview) {
        BasicInfo basicInfoKWHzl = overview.KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OverviewFragment$displayTagsInfo$1(this, basicInfoKWHzl, overview, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(TokenDetail tokenDetail) {
        C29086kmx c29086kmx;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29086kmx = hao.values) == null) {
            return;
        }
        c29086kmx.EZpvd(tokenDetail);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(Overview overview) {
        C29086kmx c29086kmx;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29086kmx = hao.values) == null) {
            return;
        }
        C29087kmy c29087kmy = new C29087kmy(overview.AEQbTJ().djBIcL(), overview.AEQbTJ().copydefault(), overview.AEQbTJ().OLrzqt(), overview.AEQbTJ().EZpvd(), overview.AEQbTJ().AEQbTJ(), overview.AEQbTJ().AYXKKw(), overview.KWHzl().EZpvd(), overview.KWHzl().AEQbTJ(), overview.AEQbTJ().gEmmrt(), overview.AEQbTJ().KWHzl());
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.AhwBna;
        TokenBase tokenBaseEjfBZ = ejfBZ();
        c29086kmx.KWHzl(c29087kmy, tokenDetailEventTrackingInfo, (tokenBaseEjfBZ == null || !tokenBaseEjfBZ.isBtc()) ? new Function1() { // from class: o.klJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28988klE.KWHzl(this.copydefault, (kotlin.Pair) obj);
            }
        } : null);
    }

    public static final Unit KWHzl(C28988klE c28988klE, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c28988klE.gEmmrt().KWHzl(new C22622hio(((java.lang.Number) pair.component1()).intValue(), ((java.lang.Number) pair.component2()).intValue()));
        return Unit.INSTANCE;
    }

    public final void copydefault(TagWrapper tagWrapper) {
        TokenBase tokenBaseEjfBZ = ejfBZ();
        if (tokenBaseEjfBZ == null) {
            return;
        }
        jOM jomAEQbTJ = jOM.Companion.AEQbTJ(tokenBaseEjfBZ.getChainId(), tokenBaseEjfBZ.getTokenContractAddress(), tagWrapper);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        jomAEQbTJ.show(childFragmentManager);
        C21847hOn.EZpvd("token_detail_tab_click", "dev_token", gEmmrt().getNewProxyInstance());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, Continuation<? super TagWrapper> continuation) throws java.lang.Throwable {
        OverviewFragment$getDevAnalysisTagWrapper$1 overviewFragment$getDevAnalysisTagWrapper$1;
        java.lang.Object objEZpvd;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof OverviewFragment$getDevAnalysisTagWrapper$1) {
            overviewFragment$getDevAnalysisTagWrapper$1 = (OverviewFragment$getDevAnalysisTagWrapper$1) continuation;
            int i = overviewFragment$getDevAnalysisTagWrapper$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                overviewFragment$getDevAnalysisTagWrapper$1.label = i - Integer.MIN_VALUE;
            } else {
                overviewFragment$getDevAnalysisTagWrapper$1 = new OverviewFragment$getDevAnalysisTagWrapper$1(this, continuation);
            }
        }
        java.lang.Object obj = overviewFragment$getDevAnalysisTagWrapper$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = overviewFragment$getDevAnalysisTagWrapper$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<java.lang.String> listKWHzl = gEmmrt().fetchVPNInfo().KWHzl();
            TokenBase tokenBaseEjfBZ = ejfBZ();
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), tokenBaseEjfBZ != null ? tokenBaseEjfBZ.getChainId() : null)) {
                return null;
            }
            TagViewModel tagViewModelFJNWhG = fJNWhG();
            overviewFragment$getDevAnalysisTagWrapper$1.L$0 = str;
            overviewFragment$getDevAnalysisTagWrapper$1.L$1 = str2;
            overviewFragment$getDevAnalysisTagWrapper$1.label = 1;
            objEZpvd = tagViewModelFJNWhG.EZpvd("dev", overviewFragment$getDevAnalysisTagWrapper$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str3 = str;
            str4 = str2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (java.lang.String) overviewFragment$getDevAnalysisTagWrapper$1.L$1;
            str3 = (java.lang.String) overviewFragment$getDevAnalysisTagWrapper$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        return new TagWrapper(new CompactTag(null, false, new TagExtra(null, null, null, new TagLocalProperty(null, null, null, null, str3 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str3) : null, str4 != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str4) : null, null, 79, null), null, null, null, null, 247, null), 3, null), (TagMeta) objEZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(Overview overview) {
        boolean z;
        java.lang.String strIsSupportHolderExpandData;
        TokenBase tokenBaseEjfBZ = ejfBZ();
        if (tokenBaseEjfBZ == null) {
            return;
        }
        C26032jPk.StateListAnimator stateListAnimator = C26032jPk.Companion;
        java.lang.String chainId = tokenBaseEjfBZ.getChainId();
        java.lang.String tokenContractAddress = tokenBaseEjfBZ.getTokenContractAddress();
        LatestMarketInfoBean latestMarketInfoBeanDjBIcL = djBIcL();
        if (latestMarketInfoBeanDjBIcL == null || (strIsSupportHolderExpandData = latestMarketInfoBeanDjBIcL.isSupportHolderExpandData()) == null) {
            z = false;
        } else {
            z = true;
            if (!C27722kAy.OLrzqt(strIsSupportHolderExpandData)) {
            }
        }
        C26032jPk c26032jPkEZpvd = stateListAnimator.EZpvd(chainId, tokenContractAddress, z, overview.KWHzl().valueOf(), overview.KWHzl().EZpvd(), "header");
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c26032jPkEZpvd.show(parentFragmentManager);
    }

    public final void values() {
        gEmmrt().KWHzl(new C22622hio(CoinDetailTabType.EARN.ordinal(), 0));
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.AhwBna;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.INFO_DEFI, CoinDetailTabType.INFO);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(C29116kna c29116kna) {
        C29060kmX c29060kmX;
        hAO hao = (hAO) aX_();
        if (hao == null || (c29060kmX = hao.ejfBZ) == null) {
            return;
        }
        if (c29116kna != null && C33129mqd.AEQbTJ(c29116kna.EZpvd(), "0")) {
            c29060kmX.setVisibility(0);
            c29060kmX.AEQbTJ(c29116kna, new OverviewFragment$displayVibes$1$1(this), new OverviewFragment$displayVibes$1$2(this));
        } else {
            c29060kmX.setVisibility(8);
        }
    }

    public final void AuCTel() {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        TokenBase tokenBaseEjfBZ = ejfBZ();
        java.lang.String chainId = tokenBaseEjfBZ != null ? tokenBaseEjfBZ.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        TokenBase tokenBaseEjfBZ2 = ejfBZ();
        java.lang.String tokenContractAddress = tokenBaseEjfBZ2 != null ? tokenBaseEjfBZ2.getTokenContractAddress() : null;
        gko.KWHzl(context, chainId, tokenContractAddress != null ? tokenContractAddress : "");
    }

    public final void KWHzl(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
        C29051kmO c29051kmOCopydefault = C29051kmO.Companion.copydefault(yDY.gEmmrt(new InfoItem(C23274hvD.Fragment.dispatchOnContextAvailable, i), new InfoItem(C23274hvD.Fragment.ContextAwareKt, i2), new InfoItem(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen1, C23274hvD.Fragment.ContextAwareHelper), new InfoItem(C23274hvD.Fragment.ReportDrawnKtReportDrawnWhen2, C23274hvD.Fragment.clearAvailableContext)));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29051kmOCopydefault.show(childFragmentManager);
    }

    public final void AkhnZx() {
        C29051kmO c29051kmOCopydefault = C29051kmO.Companion.copydefault(yDY.gEmmrt(new InfoItem(C23274hvD.Fragment.FullyDrawnReporterKtreportWhenComplete1, C23274hvD.Fragment.reportWhenCompleteforInline), new InfoItem(C23274hvD.Fragment.FullyDrawnReporterOwner, C23274hvD.Fragment.invokeSuspend), new InfoItem(C23274hvD.Fragment.getEnabledChangedCallbackactivity_release, C23274hvD.Fragment.ImmLeaksCleaner), new InfoItem(C23274hvD.Fragment.addCancellable, C23274hvD.Fragment.reportWhenComplete)));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c29051kmOCopydefault.show(childFragmentManager);
    }

    public final void DbNXlk() {
        TokenBase tokenBaseEjfBZ = ejfBZ();
        if (tokenBaseEjfBZ == null) {
            return;
        }
        C29717kys.Activity activity = C29717kys.Companion;
        java.lang.String chainId = tokenBaseEjfBZ.getChainId();
        java.lang.String tokenContractAddress = tokenBaseEjfBZ.getTokenContractAddress();
        java.util.List<TagWrapper> value = gEmmrt().djBIcL().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        boolean zContains = gEmmrt().fetchVPNInfo().KWHzl().contains(tokenBaseEjfBZ.getChainId());
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = gEmmrt().valueOf().getValue();
        activity.EZpvd(new TagExplanationBottomSheetParams(chainId, tokenContractAddress, true, new TagStaticDataParams(value, zContains, value2 != null ? value2.getSecond() : null, fIwbmz().copydefault().getValue().AEQbTJ()), TagEventSource.TOKEN_DETAIL, false, 32, null)).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C29717kys.class).valueOf());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C29049kmM c29049kmM;
        this.values = null;
        this.ejfBZ = null;
        hAO hao = (hAO) aX_();
        if (hao != null && (c29049kmM = hao.isConnected) != null) {
            c29049kmM.OLrzqt();
        }
        super.onDestroyView();
    }
}
