package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.bean.CandleResultBean;
import com.okinc.business.dexlogic.bean.KLineTokenParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.KLineFragmentParams;
import com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$initView$2$1;
import com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$setObserver$1$1$1;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.market.features.chart.ui.ChartDataViewModel;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.meme.domain.model.MemeSocialMediaData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.MarketInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.overview.ui.widget.InfoItem;
import com.okinc.business.market.features.tag.domain.TagBelongType;
import com.okinc.business.market.features.tag.domain.TagEventProperty;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagStaticDataParams;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.business.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.business.market.features.token_detail.TokenDetail;
import com.okinc.business.market.widget.tag.TagEventSource;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C28832kiH;
import o.C29167koY;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC23254huk;
import o.hRF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hRN extends hRM<hAK> implements hRW, InterfaceC23254huk {
    public boolean AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public java.util.List<TagWrapper> DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public TokenBase fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public boolean fetchVPNInfo;
    public java.util.List<TagWrapper> gEmmrt;
    public LatestMarketInfoBean isConnected;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MARKET_CAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hRW
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.InterfaceC23254huk
    public void KWHzl(@NotNull java.lang.String str) {
        InterfaceC23254huk.Application.OLrzqt(this, str);
    }

    public hRN() {
        final Function0 function0 = null;
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$3
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$6
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$9
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
        final Function0 function02 = new Function0() { // from class: o.hRX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hRN.isConnected(this.KWHzl);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$4
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$6
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$9
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$11
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$12
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
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = yDY.AhwBna();
    }

    private final MarketCoinDetailViewModel isConnected() {
        return (MarketCoinDetailViewModel) this.ejfBZ.getValue();
    }

    private final OverviewViewModel AuCTel() {
        return (OverviewViewModel) this.AuCTel.getValue();
    }

    private final RealtimeDataViewModel fJNWhG() {
        return (RealtimeDataViewModel) this.fJNWhG.getValue();
    }

    private final ChartViewModel values() {
        return (ChartViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner isConnected(hRN hrn) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = hrn.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataViewModel fetchVPNInfo() {
        return (ChartDataViewModel) this.djBIcL.getValue();
    }

    public final TagViewModel djBIcL() {
        return (TagViewModel) this.fARcdN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String ejfBZ() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("key.page_from") : null;
        return string == null ? "" : string;
    }

    public static final class PendingIntent<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) ((TagWrapper) t2).copydefault().OLrzqt().gEmmrt())), java.lang.Boolean.valueOf(C33129mqd.OLrzqt((java.lang.CharSequence) ((TagWrapper) t).copydefault().OLrzqt().gEmmrt())));
        }
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.fIwbmz = (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
            this.isConnected = (LatestMarketInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", LatestMarketInfoBean.class));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hAK KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAK hakEZpvd = hAK.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hakEZpvd, "");
        return hakEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAK hak, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hak, "");
        C23508hzZ c23508hzZ = hak.valueOf;
        android.content.Context context = c23508hzZ.getRoot().getContext();
        ConstraintLayout constraintLayout = c23508hzZ.EZpvd;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
        c23508hzZ.values.setTitle(context.getString(C23274hvD.Fragment.avCqka));
        c23508hzZ.fetchVPNInfo.setTitle(context.getString(C23274hvD.Fragment.onRelationshipValidationResult));
        isShowLocalPrice$default(this, hak, false, 2, null);
        LatestMarketInfoBean latestMarketInfoBean = this.isConnected;
        if (latestMarketInfoBean != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineContainerFragment$initView$2$1(this, latestMarketInfoBean, null), 3, null);
        }
        if (bundle == null) {
            AEQbTJ(hak, this.isConnected);
            updateDateVisibility$default(this, false, 1, null);
        }
        fARcdN();
        hak.getRoot().post(new java.lang.Runnable() { // from class: o.hRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                hRN.AkhnZx(this.AEQbTJ);
            }
        });
    }

    public static final void AkhnZx(hRN hrn) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hrn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fARcdN() {
        values().djBIcL().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.hRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hRN.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(hRN hrn, kotlin.Pair pair) {
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return Unit.INSTANCE;
        }
        LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) pair.getSecond();
        hrn.isConnected = latestMarketInfoBean;
        if (latestMarketInfoBean != null) {
            LifecycleOwner viewLifecycleOwner = hrn.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineContainerFragment$setObserver$1$1$1(hrn, latestMarketInfoBean, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ hRN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TokenDetail OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, hRN hrn, TokenDetail tokenDetail) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = hrn;
            this.OLrzqt = tokenDetail;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(TokenDetailTabType.TAG_EXPLANATION);
                java.lang.String strFetchVPNInfo = this.OLrzqt.fetchVPNInfo();
                TokenBase tokenBase = this.AEQbTJ.fIwbmz;
                java.lang.String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
                if (tokenContractAddress == null) {
                    tokenContractAddress = "";
                }
                java.lang.String str = (strFetchVPNInfo == null || strFetchVPNInfo.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo)) ? tokenContractAddress : strFetchVPNInfo;
                TokenBase tokenBase2 = this.AEQbTJ.fIwbmz;
                java.lang.String tokenSymbol = tokenBase2 != null ? tokenBase2.getTokenSymbol() : null;
                java.lang.String str2 = tokenSymbol == null ? "" : tokenSymbol;
                TokenBase tokenBase3 = this.AEQbTJ.fIwbmz;
                java.lang.String chainName = tokenBase3 != null ? tokenBase3.getChainName() : null;
                java.lang.String str3 = chainName == null ? "" : chainName;
                java.lang.String strCopydefault = this.OLrzqt.copydefault();
                TokenBase tokenBase4 = this.AEQbTJ.fIwbmz;
                java.lang.String chainId = tokenBase4 != null ? tokenBase4.getChainId() : null;
                C21847hOn.copydefault("kline_label", str, (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) ? chainId != null ? chainId : "" : strCopydefault, this.AEQbTJ.ejfBZ(), str2, str3);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ hRN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, hRN hrn) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = hrn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.gEmmrt();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ TagEventProperty AEQbTJ;
        public final /* synthetic */ hRN EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ TagWrapper copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, TagEventProperty tagEventProperty, hRN hrn, TagWrapper tagWrapper) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = tagEventProperty;
            this.EZpvd = hrn;
            this.copydefault = tagWrapper;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TagEventProperty tagEventProperty = this.AEQbTJ;
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                kNA.AEQbTJ(tagEventProperty, contextRequireContext, TagEventSource.TOKEN_DETAIL);
                if (Intrinsics.EZpvd((java.lang.Object) this.copydefault.OLrzqt(), (java.lang.Object) "launchpool")) {
                    this.EZpvd.OLrzqt(TokenDetailButtonName.X_LAUNCH_TAG);
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ hRN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, hRN hrn) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = hrn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.fetchVPNInfo().copydefault();
            }
        }
    }

    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ hRN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, hRN hrn) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = hrn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.EZpvd(TokenDetailTabType.SOCIAL);
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ hRN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TagWrapper KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, TagWrapper tagWrapper, hRN hrn) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = tagWrapper;
            this.AEQbTJ = hrn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl.copydefault().OLrzqt().gEmmrt())) {
                    this.AEQbTJ.EZpvd(TokenDetailTabType.TAG_EXPLANATION);
                    return;
                }
                C29167koY.TaskDescription taskDescription = C29167koY.Companion;
                java.lang.String strGEmmrt = this.KWHzl.copydefault().OLrzqt().gEmmrt();
                if (strGEmmrt == null) {
                    strGEmmrt = "";
                }
                C29167koY c29167koYKWHzl = taskDescription.KWHzl(strGEmmrt);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c29167koYKWHzl.show(parentFragmentManager);
                this.AEQbTJ.OLrzqt(TokenDetailButtonName.MARKET_STATUS);
            }
        }
    }

    public static /* synthetic */ void isShowLocalPrice$default(hRN hrn, hAK hak, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hrn.AEQbTJ(hak, z);
    }

    public final void AEQbTJ(hAK hak, boolean z) {
        C23508hzZ c23508hzZ;
        android.widget.TextView textView;
        if (hak == null || (c23508hzZ = hak.valueOf) == null || (textView = c23508hzZ.djBIcL) == null) {
            return;
        }
        textView.setVisibility((C23272hvB.KWHzl.OLrzqt().getCurrencyId() == 0 || z) ? 8 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C23508hzZ c23508hzZ;
        ConstraintLayout constraintLayout;
        super.onResume();
        MarketCoinDetailViewModel marketCoinDetailViewModelIsConnected = isConnected();
        hAK hak = (hAK) aX_();
        marketCoinDetailViewModelIsConnected.EZpvd(java.lang.Integer.valueOf((hak == null || (c23508hzZ = hak.valueOf) == null || (constraintLayout = c23508hzZ.AEQbTJ) == null) ? C55298xhM.copydefault(60.0f, (android.content.Context) C32979mnm.EZpvd.OLrzqt()) : constraintLayout.getHeight()));
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.DbNXlk = yDY.AhwBna();
        this.gEmmrt = yDY.AhwBna();
        this.fetchVPNInfo = false;
        this.AkhnZx = false;
        this.values = null;
    }

    public final void AEQbTJ(hAK hak, LatestMarketInfoBean latestMarketInfoBean) {
        java.lang.String tokenContractAddress;
        java.lang.String chainId;
        androidx.fragment.app.Fragment fragment;
        if (latestMarketInfoBean != null && KWHzl(latestMarketInfoBean)) {
            fetchVPNInfo().copydefault(latestMarketInfoBean.hasMarketCapData(), latestMarketInfoBean.getCirculatingSupply());
            TokenBase tokenBase = this.fIwbmz;
            java.lang.String chainId2 = tokenBase != null ? tokenBase.getChainId() : null;
            hQM hqmOLrzqt = hQM.Companion.OLrzqt(new KLineFragmentParams(chainId2 != null ? chainId2 : "", latestMarketInfoBean.realTokenContractAddress(), latestMarketInfoBean.hasMarketCapData(), latestMarketInfoBean.getCirculatingSupply()));
            hqmOLrzqt.OLrzqt(this);
            fragment = hqmOLrzqt;
        } else {
            fetchVPNInfo().copydefault(false, "");
            hRF.Activity activity = hRF.Companion;
            TokenBase tokenBase2 = this.fIwbmz;
            java.lang.String str = (tokenBase2 == null || (chainId = tokenBase2.getChainId()) == null) ? "" : chainId;
            TokenBase tokenBase3 = this.fIwbmz;
            hRF hrfAEQbTJ = activity.AEQbTJ("default_trade", new KLineTokenParam(str, (tokenBase3 == null || (tokenContractAddress = tokenBase3.getTokenContractAddress()) == null) ? "" : tokenContractAddress, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 60, (DefaultConstructorMarker) null));
            hrfAEQbTJ.OLrzqt(this);
            fragment = hrfAEQbTJ;
        }
        getChildFragmentManager().beginTransaction().replace(hak.EZpvd.getId(), fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        if (this.fIwbmz != null) {
            C25390ivn.collectOnViewLifecycle$default(this, fJNWhG().EZpvd(), null, new Application(), 2, null);
            DbNXlk();
        }
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().OLrzqt(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AuCTel().copydefault(), null, new Fragment(), 2, null);
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            hRN.this.AhwBna(tokenDetail);
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ChartType chartType, Continuation<? super Unit> continuation) {
            if (chartType != null) {
                hRN.this.copydefault(chartType);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29063kma c29063kma, Continuation<? super Unit> continuation) {
            hRN.this.AkhnZx();
            return Unit.INSTANCE;
        }
    }

    public final void DbNXlk() {
        isConnected().djBIcL().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.hRS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hRN.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(hRN hrn, java.util.List list) {
        java.lang.Object next;
        final C28072kNw c28072kNwFromTagWrapper$default;
        TagEventProperty tagEventPropertyKWHzl;
        java.lang.String strCopydefault;
        final hAK hak = (hAK) hrn.aX_();
        if (hak != null) {
            final android.content.Context context = hak.getRoot().getContext();
            hak.djBIcL.setVisibility(8);
            Intrinsics.copydefault(list);
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TagWrapper tagWrapper = (TagWrapper) next;
                if (Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "duringEvent") || Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "launchpool")) {
                    break;
                }
            }
            TagWrapper tagWrapper2 = (TagWrapper) next;
            if (tagWrapper2 != null && (c28072kNwFromTagWrapper$default = C28074kNy.fromTagWrapper$default(tagWrapper2, false, context, 2, null)) != null && (tagEventPropertyKWHzl = tagWrapper2.copydefault().OLrzqt().KWHzl()) != null) {
                android.content.Context contextRequireContext = hrn.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C25386ivj.OLrzqt(contextRequireContext, c28072kNwFromTagWrapper$default.KWHzl(), C33070mpX.KWHzl(C52761wXj.TaskDescription.sElUiK), new Function1() { // from class: o.hRT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return hRN.AEQbTJ(c28072kNwFromTagWrapper$default, hak, context, (android.graphics.drawable.Drawable) obj);
                    }
                }, new Function0() { // from class: o.hRR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return hRN.OLrzqt(hak);
                    }
                });
                hak.fARcdN.setText(((java.lang.Object) c28072kNwFromTagWrapper$default.valueOf()) + ":");
                if (Intrinsics.EZpvd((java.lang.Object) tagWrapper2.OLrzqt(), (java.lang.Object) "launchpool")) {
                    strCopydefault = C33070mpX.AYXKKw(C23274hvD.Fragment.RhjxDW);
                } else {
                    int i = C23274hvD.Fragment.addOnPictureInPictureModeChangedListener;
                    LatestMarketInfoBean latestMarketInfoBean = hrn.isConnected;
                    java.lang.String tokenSymbol = latestMarketInfoBean != null ? latestMarketInfoBean.getTokenSymbol() : null;
                    strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol != null ? tokenSymbol : "")));
                }
                hak.values.setText(strCopydefault);
                android.widget.LinearLayout linearLayout = hak.djBIcL;
                linearLayout.setOnClickListener(new FragmentManager(linearLayout, 1000L, tagEventPropertyKWHzl, hrn, tagWrapper2));
                hak.djBIcL.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C28072kNw c28072kNw, hAK hak, android.content.Context context, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        java.lang.Integer numCopydefault = c28072kNw.copydefault();
        if (numCopydefault != null) {
            int iIntValue = numCopydefault.intValue();
            Intrinsics.copydefault(context);
            drawable.setTint(C25382ivf.copydefault(iIntValue, context));
        }
        hak.AYXKKw.setImageDrawable(drawable);
        hak.AYXKKw.setVisibility(0);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(hAK hak) {
        hak.AYXKKw.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna(TokenDetail tokenDetail) {
        C23508hzZ c23508hzZ;
        int iCopydefault;
        hAK hak = (hAK) aX_();
        if (hak == null || (c23508hzZ = hak.valueOf) == null) {
            return;
        }
        android.content.Context context = c23508hzZ.getRoot().getContext();
        AppCompatTextView appCompatTextView = c23508hzZ.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        java.lang.String strKWHzl = tokenDetail.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        kLY.AEQbTJ(appCompatTextView, strKWHzl, DisplaySign.EXCEPT_ZERO, java.lang.Float.valueOf(-99.999f), java.lang.Float.valueOf(99999.0f), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        AppCompatTextView appCompatTextView2 = c23508hzZ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        java.lang.String strKWHzl2 = tokenDetail.KWHzl();
        if (strKWHzl2 == null) {
            strKWHzl2 = "";
        }
        kLY.KWHzl(appCompatTextView2, strKWHzl2, java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        C21977hTi c21977hTi = c23508hzZ.isConnected;
        C21949hSh c21949hSh = C21949hSh.EZpvd;
        java.lang.String strAhwBna = tokenDetail.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        c21977hTi.setText(c21949hSh.EZpvd(strAhwBna));
        C21977hTi c21977hTi2 = c23508hzZ.fetchVPNInfo;
        java.lang.String strFIwbmz = tokenDetail.fIwbmz();
        if (strFIwbmz == null) {
            strFIwbmz = "";
        }
        c21977hTi2.setText(c21949hSh.copydefault(strFIwbmz));
        c23508hzZ.DbNXlk.setText(C23319hvw.getNumberICU$default(tokenDetail.AYXKKw(), RoundingMode.DOWN, null, null, null, 14, null));
        java.lang.String strEjfBZ = tokenDetail.ejfBZ();
        if (strEjfBZ != null) {
            c23508hzZ.AkhnZx.setText(C23311hvo.formatPercentWithoutSymbol$default(strEjfBZ, false, 0, new BigDecimal(0.01d), true, null, 19, null));
            AppCompatTextView appCompatTextViewAEQbTJ = c23508hzZ.AkhnZx.AEQbTJ();
            if (C33129mqd.djBIcL(strEjfBZ) >= 80.0f) {
                int i = C52761wXj.ActionBar.OuxcSI;
                Intrinsics.copydefault(context);
                iCopydefault = C25382ivf.copydefault(i, context);
            } else {
                int i2 = C52761wXj.Activity.DQYQgr;
                Intrinsics.copydefault(context);
                iCopydefault = C25382ivf.copydefault(i2, context);
            }
            appCompatTextViewAEQbTJ.setTextColor(iCopydefault);
        }
        copydefault(tokenDetail);
        java.lang.String strDbNXlk = tokenDetail.DbNXlk();
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        java.lang.String strAkhnZx = tokenDetail.AkhnZx();
        EZpvd(strDbNXlk, strAkhnZx != null ? strAkhnZx : "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(ChartType chartType) {
        C23508hzZ c23508hzZ;
        kotlin.Pair pair;
        hAK hak = (hAK) aX_();
        if (hak != null && (c23508hzZ = hak.valueOf) != null) {
            android.content.Context context = c23508hzZ.getRoot().getContext();
            LatestMarketInfoBean latestMarketInfoBean = this.isConnected;
            boolean z = latestMarketInfoBean != null && latestMarketInfoBean.hasMarketCapData() && KWHzl(this.isConnected);
            int i = ActionBar.KWHzl[chartType.ordinal()];
            if (i == 1) {
                pair = new kotlin.Pair(c23508hzZ.AYXKKw, c23508hzZ.values.copydefault());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new kotlin.Pair(c23508hzZ.values.copydefault(), c23508hzZ.AYXKKw);
            }
            java.lang.Object objComponent1 = pair.component1();
            Intrinsics.checkNotNullExpressionValue(objComponent1, "");
            java.lang.Object objComponent2 = pair.component2();
            Intrinsics.checkNotNullExpressionValue(objComponent2, "");
            ((android.widget.TextView) objComponent2).setText(context.getString(C23274hvD.Fragment.fbC));
            ((android.widget.TextView) objComponent1).setText(context.getString(C23274hvD.Fragment.fcfzuX));
            android.widget.LinearLayout linearLayout = c23508hzZ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(z ? 0 : 8);
        }
        EZpvd(AhwBna(), AYXKKw());
    }

    /* JADX DEBUG: Possible override for method o.hRM.AhwBna()V */
    public final java.lang.String AhwBna() {
        return C31256lqb.KWHzl(fJNWhG().EZpvd().getValue().DbNXlk(), (Function0<java.lang.String>) new Function0() { // from class: o.hRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hRN.fetchVPNInfo(this.copydefault);
            }
        });
    }

    public static final java.lang.String fetchVPNInfo(hRN hrn) {
        LatestMarketInfoBean latestMarketInfoBean = hrn.isConnected;
        java.lang.String price = latestMarketInfoBean != null ? latestMarketInfoBean.getPrice() : null;
        return price == null ? "" : price;
    }

    public final java.lang.String AYXKKw() {
        return C31256lqb.KWHzl(fJNWhG().EZpvd().getValue().AkhnZx(), (Function0<java.lang.String>) new Function0() { // from class: o.hRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hRN.values(this.EZpvd);
            }
        });
    }

    public static final java.lang.String values(hRN hrn) {
        LatestMarketInfoBean latestMarketInfoBean = hrn.isConnected;
        java.lang.String marketCap = latestMarketInfoBean != null ? latestMarketInfoBean.getMarketCap() : null;
        return marketCap == null ? "" : marketCap;
    }

    public final boolean KWHzl(LatestMarketInfoBean latestMarketInfoBean) {
        return latestMarketInfoBean != null && latestMarketInfoBean.isSupportTxPrice();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        hAK hak;
        C23508hzZ c23508hzZ;
        ChartType value = fetchVPNInfo().OLrzqt().getValue();
        if (value == null || (hak = (hAK) aX_()) == null || (c23508hzZ = hak.valueOf) == null) {
            return;
        }
        int i = ActionBar.KWHzl[value.ordinal()];
        if (i == 1) {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            RoundingMode roundingMode = RoundingMode.DOWN;
            java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, str, false, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            java.lang.String strEZpvd = C21949hSh.EZpvd.EZpvd(str2);
            java.lang.String scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(c23272hvB, str, false, roundingMode, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
            c23508hzZ.AhwBna.setText(scientificCurrency$default);
            c23508hzZ.values.AEQbTJ().setText(strEZpvd);
            c23508hzZ.djBIcL.setText("≈" + scientificCurrency$default2);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C21949hSh c21949hSh = C21949hSh.EZpvd;
        java.lang.String strAEQbTJ = c21949hSh.AEQbTJ(str2);
        java.lang.String scientificCurrency$default3 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, RoundingMode.DOWN, true, false, false, false, null, false, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        java.lang.String strEZpvd2 = c21949hSh.EZpvd(str2);
        c23508hzZ.AhwBna.setText(strAEQbTJ);
        c23508hzZ.values.AEQbTJ().setText(scientificCurrency$default3);
        c23508hzZ.djBIcL.setText("≈" + strEZpvd2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(TokenDetail tokenDetail) {
        Overview overviewAEQbTJ;
        BasicInfo basicInfoKWHzl;
        android.widget.FrameLayout frameLayout;
        android.widget.HorizontalScrollView horizontalScrollView;
        BasicInfo basicInfoKWHzl2;
        C29063kma value = AuCTel().copydefault().getValue();
        Overview overviewAEQbTJ2 = value.AEQbTJ();
        if ((overviewAEQbTJ2 != null && (basicInfoKWHzl2 = overviewAEQbTJ2.KWHzl()) != null && basicInfoKWHzl2.djBIcL()) || (((overviewAEQbTJ = value.AEQbTJ()) != null && (basicInfoKWHzl = overviewAEQbTJ.KWHzl()) != null && basicInfoKWHzl.AYXKKw()) || !KWHzl(this.isConnected))) {
            hAK hak = (hAK) aX_();
            if (hak != null && (horizontalScrollView = hak.OLrzqt) != null) {
                horizontalScrollView.setVisibility(8);
            }
        } else {
            KWHzl(tokenDetail);
            AkhnZx();
            AEQbTJ(tokenDetail.fARcdN());
            OLrzqt(tokenDetail);
        }
        hAK hak2 = (hAK) aX_();
        if (hak2 == null || (frameLayout = hak2.KWHzl) == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(TokenDetail tokenDetail) {
        boolean z;
        java.lang.String strValueOf;
        hAK hak = (hAK) aX_();
        if (hak != null) {
            java.util.List<TagWrapper> listIsConnected = tokenDetail.isConnected();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listIsConnected) {
                if (((TagWrapper) obj).copydefault().OLrzqt().copydefault() == TagBelongType.RWA) {
                    arrayList.add(obj);
                }
            }
            java.util.List<TagWrapper> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new PendingIntent());
            if (listEZpvd.isEmpty()) {
                android.widget.LinearLayout linearLayout = hak.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                return;
            }
            if (Intrinsics.EZpvd(this.DbNXlk, listEZpvd)) {
                return;
            }
            this.DbNXlk = listEZpvd;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String strGEmmrt = ((TagWrapper) it.next()).copydefault().OLrzqt().gEmmrt();
                java.lang.String str = (strGEmmrt == null || !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt) ^ true)) ? null : strGEmmrt;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                AuCTel().copydefault((java.lang.String) it2.next());
            }
            hak.AhwBna.removeAllViews();
            android.content.Context context = hak.AhwBna.getContext();
            int i = 0;
            for (java.lang.Object obj2 : listEZpvd) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                TagWrapper tagWrapper = (TagWrapper) obj2;
                C28072kNw c28072kNwEZpvd = C28074kNy.EZpvd(tagWrapper, z, context);
                if (c28072kNwEZpvd != null) {
                    Intrinsics.copydefault(context);
                    kNE kneEZpvd = EZpvd(context, c28072kNwEZpvd, i, listEZpvd.size());
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) tagWrapper.copydefault().OLrzqt().gEmmrt())) {
                        if (C33054mpH.AEQbTJ(context)) {
                            TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
                            strValueOf = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.gEmmrt() : null;
                            kneEZpvd.setTagBackground(C25386ivj.generateSolidBackground$default(C55298xhM.KWHzl(2.0f, context), java.lang.Integer.valueOf(C29164koV.OLrzqt(strValueOf, context).getSecond().intValue()), 0.0f, null, 12, null));
                        } else {
                            TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
                            if (tagMetaAEQbTJ2 != null) {
                                strValueOf = tagMetaAEQbTJ2.valueOf();
                            }
                            kneEZpvd.setTagBackground(C25386ivj.generateSolidBackground$default(C55298xhM.KWHzl(2.0f, context), java.lang.Integer.valueOf(C29164koV.OLrzqt(strValueOf, context).getSecond().intValue()), 0.0f, null, 12, null));
                        }
                    }
                    kneEZpvd.setOnClickListener(new VoiceInteractor(kneEZpvd, 1000L, tagWrapper, this));
                    hak.AhwBna.addView(kneEZpvd);
                }
                i++;
                z = true;
            }
            android.widget.LinearLayout linearLayout2 = hak.AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
        }
    }

    public final void OLrzqt(TokenDetailButtonName tokenDetailButtonName) {
        TokenBase tokenBase = this.fIwbmz;
        if (tokenBase != null) {
            C21847hOn.trackDexMarketTokenPageClick$default(tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol(), tokenBase.getChainId(), tokenBase.getChainName(), CoinDetailTabType.CHART, tokenBase.getSourcePageName(), null, null, null, null, null, null, null, null, null, tokenDetailButtonName, null, isConnected().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, null, null, AuCTel().djBIcL(), 1671104, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        hAK hak;
        android.widget.LinearLayout linearLayout;
        if (this.fetchVPNInfo || (hak = (hAK) aX_()) == null || (linearLayout = hak.fetchVPNInfo) == null) {
            return;
        }
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(12.0f, context);
        if (KWHzl(this.isConnected)) {
            android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
            imageView.setImageResource(C52761wXj.TaskDescription.UJpkuA);
            int i = C52761wXj.Activity.DCUTEIddSDPG;
            android.content.Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            imageView.setColorFilter(C25382ivf.copydefault(i, context2));
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iCopydefault, iCopydefault));
            Overview overviewAEQbTJ = AuCTel().copydefault().getValue().AEQbTJ();
            java.util.List<MemeSocialMediaData> listAYXKKw = overviewAEQbTJ != null ? overviewAEQbTJ.AYXKKw() : null;
            if (listAYXKKw == null) {
                listAYXKKw = yDY.AhwBna();
            }
            android.content.Context context3 = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            java.util.Iterator it = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends android.widget.ImageView>) C28914kjk.EZpvd(context3, listAYXKKw, 12.0f, 4.0f), imageView).iterator();
            while (it.hasNext()) {
                linearLayout.addView((android.widget.ImageView) it.next());
            }
        } else {
            android.widget.ImageView imageView2 = new android.widget.ImageView(linearLayout.getContext());
            imageView2.setImageResource(C52761wXj.TaskDescription.UJpkuA);
            int i2 = C52761wXj.Activity.QwvEab;
            android.content.Context context4 = imageView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            imageView2.setColorFilter(C25382ivf.copydefault(i2, context4));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iCopydefault, iCopydefault);
            android.content.Context context5 = imageView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            marginLayoutParams.setMarginEnd(C55298xhM.copydefault(2.0f, context5));
            imageView2.setLayoutParams(marginLayoutParams);
            linearLayout.addView(imageView2);
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            textView.setText(textView.getContext().getString(C23274hvD.Fragment.ComponentActivity4));
            textView.setTextAppearance(C52761wXj.LoaderManager.QUSxYX);
            int i3 = C52761wXj.Activity.QwvEab;
            android.content.Context context6 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            textView.setTextColor(C25382ivf.copydefault(i3, context6));
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            linearLayout.addView(textView);
        }
        linearLayout.setOnClickListener(new TaskStackBuilder(linearLayout, 1000L, this));
        int iDpInt$default = C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        int i4 = C52761wXj.Activity.invokespecialDPHOMC;
        android.content.Context context7 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        linearLayout.setBackground(C25386ivj.generateSolidBackground$default(iDpInt$default, java.lang.Integer.valueOf(C25382ivf.copydefault(i4, context7)), 0.0f, null, 12, null));
        this.fetchVPNInfo = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        java.lang.String chainLogoUrl;
        hAK hak = (hAK) aX_();
        if (hak != null) {
            if (C33129mqd.djBIcL(str) == 0.0f) {
                android.widget.LinearLayout linearLayout = hak.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                return;
            }
            if (!this.AkhnZx) {
                LatestMarketInfoBean latestMarketInfoBean = this.isConnected;
                if (latestMarketInfoBean != null && (chainLogoUrl = latestMarketInfoBean.getChainLogoUrl()) != null) {
                    android.widget.ImageView imageView = hak.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(imageView, "");
                    int i = C57406yhn.Activity.QKVWgx;
                    android.content.Context context = hak.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C25386ivj.KWHzl(imageView, chainLogoUrl, new C25385ivi(C33070mpX.EZpvd(i, context), null, 0.0f, 0, 14, null));
                }
                android.widget.LinearLayout linearLayout2 = hak.AEQbTJ;
                int iDpInt$default = C55298xhM.dpInt$default(2.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                int i2 = C52761wXj.Activity.invokespecialDPHOMC;
                android.content.Context context2 = hak.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                linearLayout2.setBackground(C25386ivj.generateSolidBackground$default(iDpInt$default, java.lang.Integer.valueOf(C25382ivf.copydefault(i2, context2)), 0.0f, null, 12, null));
                android.widget.LinearLayout linearLayout3 = hak.AEQbTJ;
                linearLayout3.setOnClickListener(new Dialog(linearLayout3, 1000L, this));
                this.AkhnZx = true;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) str)) {
                hak.fJNWhG.setText(C23271hvA.getNumberICUWithPrecision$default(C23271hvA.copydefault, str, null, 1, null));
                this.values = str;
            }
            android.widget.LinearLayout linearLayout4 = hak.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
            linearLayout4.setVisibility(0);
        }
    }

    public final void gEmmrt() {
        C29051kmO c29051kmOCopydefault = C29051kmO.Companion.copydefault(C56402yEa.EZpvd(new InfoItem(C23274hvD.Fragment.onDraw, C23274hvD.Fragment.ComponentActivityReportFullyDrawnExecutorApi16Impl)));
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c29051kmOCopydefault.show(parentFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(TokenDetail tokenDetail) {
        android.widget.LinearLayout linearLayout;
        android.content.Context context;
        hAK hak = (hAK) aX_();
        if (hak == null || (linearLayout = hak.DbNXlk) == null || (context = getContext()) == null) {
            return;
        }
        java.util.List<TagWrapper> listIsConnected = tokenDetail.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listIsConnected) {
            if (((TagWrapper) obj).copydefault().OLrzqt().copydefault() != TagBelongType.RWA) {
                arrayList.add(obj);
            }
        }
        if (Intrinsics.EZpvd(this.gEmmrt, arrayList)) {
            return;
        }
        this.gEmmrt = arrayList;
        java.util.List<C28072kNw> listKWHzl = C28072kNw.Companion.KWHzl(arrayList, true, requireContext());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listKWHzl) {
            if (!yEE.AhwBna("communityRecognized", "duringEvent", "launchpool", "sniper").contains(((C28072kNw) obj2).OLrzqt())) {
                arrayList2.add(obj2);
            }
        }
        linearLayout.removeAllViews();
        if (arrayList2.isEmpty()) {
            linearLayout.setVisibility(8);
            return;
        }
        int i = 0;
        for (java.lang.Object obj3 : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            linearLayout.addView(EZpvd(context, (C28072kNw) obj3, i, arrayList2.size()));
            i++;
        }
        linearLayout.setVisibility(0);
        linearLayout.setOnClickListener(new AssistContent(linearLayout, 1000L, this, tokenDetail));
    }

    public final kNE EZpvd(android.content.Context context, C28072kNw c28072kNw, int i, int i2) {
        int iKWHzl = C55298xhM.KWHzl(4.0f, context);
        int iCopydefault = C55298xhM.copydefault(4.0f, context);
        kNE kne = new kNE(context, null, 0, 6, null);
        kne.EZpvd(c28072kNw);
        kne.setTagPadding(java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(iKWHzl), java.lang.Integer.valueOf(iKWHzl));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        if (i < i2 - 1) {
            marginLayoutParams.setMarginEnd(iCopydefault);
        }
        kne.setLayoutParams(marginLayoutParams);
        return kne;
    }

    public final void EZpvd(TokenDetailTabType tokenDetailTabType) {
        MarketInfo marketInfoAEQbTJ;
        TokenDetailTabData[] tokenDetailTabDataArr = new TokenDetailTabData[2];
        Overview overviewAEQbTJ = AuCTel().copydefault().getValue().AEQbTJ();
        java.util.List<MemeSocialMediaData> listAYXKKw = overviewAEQbTJ != null ? overviewAEQbTJ.AYXKKw() : null;
        if (listAYXKKw == null) {
            listAYXKKw = yDY.AhwBna();
        }
        java.util.List<MemeSocialMediaData> list = listAYXKKw;
        Overview overviewAEQbTJ2 = AuCTel().copydefault().getValue().AEQbTJ();
        java.lang.String strAhwBna = (overviewAEQbTJ2 == null || (marketInfoAEQbTJ = overviewAEQbTJ2.AEQbTJ()) == null) ? null : marketInfoAEQbTJ.AhwBna();
        tokenDetailTabDataArr[0] = new TokenDetailTabData.SocialTab(false, list, strAhwBna == null ? "" : strAhwBna, null, null, 24, null);
        java.util.List<TagWrapper> value = isConnected().djBIcL().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        java.util.List<java.lang.String> listKWHzl = isConnected().fetchVPNInfo().KWHzl();
        TokenBase tokenBase = this.fIwbmz;
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        boolean zContains = listKWHzl.contains(chainId);
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = isConnected().valueOf().getValue();
        tokenDetailTabDataArr[1] = new TokenDetailTabData.TagExplanationTab(true, new TagStaticDataParams(value, zContains, value2 != null ? value2.getSecond() : null, AuCTel().copydefault().getValue().AEQbTJ()), TagEventSource.TOKEN_DETAIL);
        java.util.List listGEmmrt = yDY.gEmmrt(tokenDetailTabDataArr);
        C28832kiH.StateListAnimator stateListAnimator = C28832kiH.Companion;
        TokenBase tokenBase2 = this.fIwbmz;
        java.lang.String chainId2 = tokenBase2 != null ? tokenBase2.getChainId() : null;
        java.lang.String str = chainId2 == null ? "" : chainId2;
        LatestMarketInfoBean latestMarketInfoBean = this.isConnected;
        java.lang.String tokenSymbol = latestMarketInfoBean != null ? latestMarketInfoBean.getTokenSymbol() : null;
        java.lang.String str2 = tokenSymbol == null ? "" : tokenSymbol;
        LatestMarketInfoBean latestMarketInfoBean2 = this.isConnected;
        java.lang.String tokenContractAddress = latestMarketInfoBean2 != null ? latestMarketInfoBean2.getTokenContractAddress() : null;
        java.lang.String str3 = tokenContractAddress == null ? "" : tokenContractAddress;
        LatestMarketInfoBean latestMarketInfoBean3 = this.isConnected;
        java.lang.String tokenName = latestMarketInfoBean3 != null ? latestMarketInfoBean3.getTokenName() : null;
        java.lang.String str4 = tokenName == null ? "" : tokenName;
        LatestMarketInfoBean latestMarketInfoBean4 = this.isConnected;
        java.lang.String tokenLogoUrl = latestMarketInfoBean4 != null ? latestMarketInfoBean4.getTokenLogoUrl() : null;
        C28832kiH c28832kiHOLrzqt = stateListAnimator.OLrzqt(new TokenDetailBottomSheetParams(new TokenDetailCommonParams(str, str2, str3, str4, tokenLogoUrl == null ? "" : tokenLogoUrl, false, false, null, null, false, FaceDetector.NUM_BOXES, null), listGEmmrt, tokenDetailTabType));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28832kiHOLrzqt.show(childFragmentManager);
    }

    public static /* synthetic */ void updateDateVisibility$default(hRN hrn, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        hrn.EZpvd(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        C23508hzZ c23508hzZ;
        AppCompatTextView appCompatTextView;
        int i = KWHzl(this.isConnected) ? 8 : 4;
        hAK hak = (hAK) aX_();
        if (hak == null || (c23508hzZ = hak.valueOf) == null || (appCompatTextView = c23508hzZ.gEmmrt) == null) {
            return;
        }
        if (z) {
            i = 0;
        }
        appCompatTextView.setVisibility(i);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hRN.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final hRN KWHzl(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            hRN hrn = new hRN();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("token_base", tokenBase);
            bundle.putParcelable("data", latestMarketInfoBean);
            bundle.putString("key.page_from", str);
            hrn.setArguments(bundle);
            return hrn;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hRW
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        C23508hzZ c23508hzZ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        hAK hak = (hAK) aX_();
        if (hak == null || (c23508hzZ = hak.valueOf) == null) {
            return;
        }
        final TokenDetail value = fJNWhG().EZpvd().getValue();
        EZpvd(C31256lqb.AEQbTJ(C31256lqb.AEQbTJ(str2, (Function0<java.lang.String>) new Function0() { // from class: o.hRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hRN.AEQbTJ(value);
            }
        }), (Function0<java.lang.String>) new Function0() { // from class: o.hRY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hRN.fARcdN(this.copydefault);
            }
        }), AYXKKw());
        AppCompatTextView appCompatTextView = c23508hzZ.valueOf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(z ^ true ? 0 : 8);
        EZpvd(z);
        if (z) {
            c23508hzZ.gEmmrt.setText(str);
            AppCompatTextView appCompatTextView2 = c23508hzZ.AhwBna;
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = c23508hzZ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView2.setTextColor(C25382ivf.copydefault(i, context));
            return;
        }
        AppCompatTextView appCompatTextView3 = c23508hzZ.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        java.lang.String strKWHzl = value.KWHzl();
        kLY.updateColorByValue$default(appCompatTextView3, strKWHzl != null ? strKWHzl : "", null, 2, null);
    }

    public static final java.lang.String AEQbTJ(TokenDetail tokenDetail) {
        java.lang.String strDbNXlk = tokenDetail.DbNXlk();
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public static final java.lang.String fARcdN(hRN hrn) {
        LatestMarketInfoBean latestMarketInfoBean = hrn.isConnected;
        java.lang.String price = latestMarketInfoBean != null ? latestMarketInfoBean.getPrice() : null;
        return price == null ? "" : price;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hRW
    public void AEQbTJ(@NotNull CandleResultBean candleResultBean) {
        Intrinsics.checkNotNullParameter(candleResultBean, "");
        AEQbTJ((hAK) aX_(), candleResultBean.getResults().isEmpty());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC23254huk
    public void KWHzl(@NotNull java.util.List<? extends oUO> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ((hAK) aX_(), list.isEmpty());
        oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(list);
        if (ouo != null) {
            double d = ouo.KWHzl;
            EZpvd(java.lang.String.valueOf(d), AYXKKw());
            isConnected().iwGUEr().setValue(C21949hSh.EZpvd.gEmmrt(java.lang.String.valueOf(ouo.KWHzl)));
        }
    }

    @Override // o.InterfaceC23254huk
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "http")) {
            EZpvd("", AYXKKw());
            isConnected().iwGUEr().setValue("--");
        }
    }
}
