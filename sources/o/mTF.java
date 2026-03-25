package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
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
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KLineFragmentParams;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$initView$1$1;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$setObserver$1$1$1;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$showFlashNewDialog$1;
import com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.dexkline.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C34496ndF;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC32157mRp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mTF extends mTB<oNX> implements InterfaceC32157mRp {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public TokenBase fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public LatestMarketInfoBean valueOf;
    public final InterfaceC56387yDm values;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oNX copydefault(mTF mtf) {
        return (oNX) mtf.KWHzl();
    }

    @Override // o.InterfaceC32157mRp
    public void EZpvd(@NotNull java.lang.String str) {
        InterfaceC32157mRp.Application.OLrzqt(this, str);
    }

    public mTF() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$9
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
        final Function0 function02 = new Function0() { // from class: o.mTG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mTF.gEmmrt(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$viewModels$default$4
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$11
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.kline.KlineContainerFragment$special$$inlined$activityViewModels$default$12
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel isConnected() {
        return (MarketCoinDetailViewModel) this.AhwBna.getValue();
    }

    private final RealtimeDataViewModel DbNXlk() {
        return (RealtimeDataViewModel) this.isConnected.getValue();
    }

    private final RiskControlViewModel AkhnZx() {
        return (RiskControlViewModel) this.DbNXlk.getValue();
    }

    private final ChartViewModel fetchVPNInfo() {
        return (ChartViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(mTF mtf) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = mtf.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final TagViewModel AYXKKw() {
        return (TagViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String values() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("key.page_from") : null;
        return string == null ? "" : string;
    }

    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.fetchVPNInfo = (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
            this.valueOf = (LatestMarketInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", LatestMarketInfoBean.class));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public oNX KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNX onxAEQbTJ = oNX.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onxAEQbTJ, "");
        return onxAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    public void copydefault(@NotNull oNX onx, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(onx, "");
        C32247mUy c32247mUy = onx.OLrzqt.AkhnZx;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        c32247mUy.setTitle(c32979mnm.OLrzqt().getString(C35964oKf.Fragment.QKDJJA));
        onx.OLrzqt.fetchVPNInfo.setTitle(C33069mpW.KWHzl(c32979mnm.OLrzqt(), C35964oKf.Fragment.fiXcQa, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", mRJ.AEQbTJ.EZpvd().getIsoCode()))));
        isShowLocalPrice$default(this, onx, false, 2, null);
        LatestMarketInfoBean latestMarketInfoBean = this.valueOf;
        if (latestMarketInfoBean != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineContainerFragment$initView$1$1(this, latestMarketInfoBean, null), 3, null);
        }
        if (bundle == null) {
            EZpvd(onx, this.valueOf);
        }
        AuCTel();
    }

    private final void AuCTel() {
        fetchVPNInfo().AYXKKw().observe(this, new Activity(new Function1() { // from class: o.mTK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mTF.EZpvd(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        gEmmrt();
        djBIcL();
    }

    public static final Unit EZpvd(mTF mtf, kotlin.Pair pair) {
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return Unit.INSTANCE;
        }
        LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) pair.getSecond();
        mtf.valueOf = latestMarketInfoBean;
        if (latestMarketInfoBean != null) {
            LifecycleOwner viewLifecycleOwner = mtf.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineContainerFragment$setObserver$1$1$1(mtf, latestMarketInfoBean, null), 3, null);
            if (mtf.AkhnZx().AYXKKw().getValue().booleanValue()) {
                mtf.KWHzl(latestMarketInfoBean, mtf.AkhnZx().KWHzl().getValue().booleanValue());
            }
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return copydefault(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            LatestMarketInfoBean latestMarketInfoBean = mTF.this.valueOf;
            if (latestMarketInfoBean != null) {
                mTF.this.KWHzl(latestMarketInfoBean, z);
            }
            return Unit.INSTANCE;
        }
    }

    public final void djBIcL() {
        mUN.collectOnViewLifecycle$default(this, AkhnZx().KWHzl(), null, new TaskDescription(), 2, null);
    }

    public final void gEmmrt() {
        isConnected().KWHzl().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.mTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mTF.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(mTF mtf, kotlin.Pair pair) {
        C39826pzf c39826pzf;
        C39826pzf c39826pzf2;
        oNX onx = (oNX) mtf.KWHzl();
        if (onx != null && (c39826pzf2 = onx.KWHzl) != null) {
            c39826pzf2.setFlashNewsData((java.util.List) pair.getSecond());
        }
        if (((java.util.List) pair.getSecond()).isEmpty()) {
            oNX onx2 = (oNX) mtf.KWHzl();
            if (onx2 != null && (c39826pzf = onx2.KWHzl) != null) {
                c39826pzf.OLrzqt();
            }
        } else {
            mtf.OLrzqt(((java.lang.Boolean) pair.getFirst()).booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        oNX onx;
        C39826pzf c39826pzf;
        if (isAdded() && AhwBna()) {
            TokenBase tokenBase = this.fetchVPNInfo;
            final java.lang.String tokenSymbol = tokenBase != null ? tokenBase.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            TokenBase tokenBase2 = this.fetchVPNInfo;
            final java.lang.String chainId = tokenBase2 != null ? tokenBase2.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            TokenBase tokenBase3 = this.fetchVPNInfo;
            java.lang.String tokenContractAddress = tokenBase3 != null ? tokenBase3.getTokenContractAddress() : null;
            final java.lang.String str = tokenContractAddress != null ? tokenContractAddress : "";
            if (tokenSymbol.length() == 0 || (onx = (oNX) KWHzl()) == null || (c39826pzf = onx.KWHzl) == null) {
                return;
            }
            c39826pzf.setOnFlashNewsClick(new Function1() { // from class: o.mTD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mTF.OLrzqt(tokenSymbol, this, chainId, str, (KlineFlashItem) obj);
                }
            });
            c39826pzf.copydefault(tokenSymbol, z);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ mTF KWHzl;
        public final /* synthetic */ TokenDetail OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, TokenDetail tokenDetail, mTF mtf) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = tokenDetail;
            this.KWHzl = mtf;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(android.view.View view) {
            boolean z;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C34496ndF.Application application = C34496ndF.Companion;
                java.lang.String strCopydefault = this.OLrzqt.copydefault();
                TokenBase tokenBase = this.KWHzl.fetchVPNInfo;
                java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                if (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
                    strCopydefault = chainId;
                }
                TokenBase tokenBase2 = this.KWHzl.fetchVPNInfo;
                if (tokenBase2 != null) {
                    z = tokenBase2.isMemeToken();
                }
                application.KWHzl(new TagExplanationBottomSheetParams(strCopydefault, z)).show(this.KWHzl.getChildFragmentManager(), C56524yIo.AEQbTJ(C34496ndF.class).valueOf());
                java.lang.String strAkhnZx = this.OLrzqt.AkhnZx();
                TokenBase tokenBase3 = this.KWHzl.fetchVPNInfo;
                java.lang.String tokenContractAddress = tokenBase3 != null ? tokenBase3.getTokenContractAddress() : null;
                if (tokenContractAddress == null) {
                    tokenContractAddress = "";
                }
                java.lang.String str = (strAkhnZx == null || strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) ? tokenContractAddress : strAkhnZx;
                TokenBase tokenBase4 = this.KWHzl.fetchVPNInfo;
                java.lang.String tokenSymbol = tokenBase4 != null ? tokenBase4.getTokenSymbol() : null;
                java.lang.String str2 = tokenSymbol == null ? "" : tokenSymbol;
                TokenBase tokenBase5 = this.KWHzl.fetchVPNInfo;
                java.lang.String chainName = tokenBase5 != null ? tokenBase5.getChainName() : null;
                java.lang.String str3 = chainName == null ? "" : chainName;
                java.lang.String strCopydefault2 = this.OLrzqt.copydefault();
                TokenBase tokenBase6 = this.KWHzl.fetchVPNInfo;
                java.lang.String chainId2 = tokenBase6 != null ? tokenBase6.getChainId() : null;
                mRG.KWHzl("kline_label", str, (strCopydefault2 == null || strCopydefault2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2)) ? chainId2 != null ? chainId2 : "" : strCopydefault2, this.KWHzl.values(), str2, str3);
            }
        }
    }

    public static final Unit OLrzqt(final java.lang.String str, mTF mtf, java.lang.String str2, java.lang.String str3, final KlineFlashItem klineFlashItem) {
        Intrinsics.checkNotNullParameter(klineFlashItem, "");
        androidx.fragment.app.FragmentManager childFragmentManager = mtf.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        mtf.OLrzqt(childFragmentManager, str, str2, str3);
        C32866mlf.onEvent$default("KLine_Top_News_Click", (TrackChannel[]) null, new Function1() { // from class: o.mTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mTF.copydefault(str, klineFlashItem, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, KlineFlashItem klineFlashItem, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "feed_item_id", klineFlashItem.getFlashId(), false, 4, null);
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "");
        EventParamsList.put$default(eventParamsList, "user_language", language, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(LatestMarketInfoBean latestMarketInfoBean, boolean z) {
        TokenBase tokenBase = this.fetchVPNInfo;
        if (tokenBase != null) {
            isConnected().AEQbTJ(tokenBase.getChainId(), latestMarketInfoBean.getTokenContractAddress(), latestMarketInfoBean.getTokenSymbol(), z);
            return;
        }
        isConnected().KWHzl().postValue(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, yDY.AhwBna()));
    }

    public final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineContainerFragment$showFlashNewDialog$1(this, str2, str3, str, fragmentManager, null), 3, null);
    }

    public static /* synthetic */ void isShowLocalPrice$default(mTF mtf, oNX onx, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mtf.EZpvd(onx, z);
    }

    public final void EZpvd(oNX onx, boolean z) {
        oNH onh;
        android.widget.TextView textView;
        if (onx == null || (onh = onx.OLrzqt) == null || (textView = onh.AYXKKw) == null) {
            return;
        }
        textView.setVisibility((mRJ.AEQbTJ.EZpvd().getCurrencyId() == 0 || z) ? 8 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        oNX onx;
        C39826pzf c39826pzf;
        C39826pzf c39826pzf2;
        oNH onh;
        ConstraintLayout constraintLayout;
        super.onResume();
        MarketCoinDetailViewModel marketCoinDetailViewModelIsConnected = isConnected();
        oNX onx2 = (oNX) KWHzl();
        marketCoinDetailViewModelIsConnected.copydefault(java.lang.Integer.valueOf((onx2 == null || (onh = onx2.OLrzqt) == null || (constraintLayout = onh.OLrzqt) == null) ? C55298xhM.copydefault(60.0f, (android.content.Context) C32979mnm.EZpvd.OLrzqt()) : constraintLayout.getHeight()));
        if (!SPUtils.getBoolean("kline_flash_news_on", true)) {
            oNX onx3 = (oNX) KWHzl();
            if (onx3 == null || (c39826pzf2 = onx3.KWHzl) == null) {
                return;
            }
            c39826pzf2.OLrzqt();
            return;
        }
        if (AhwBna()) {
            TokenBase tokenBase = this.fetchVPNInfo;
            java.lang.String tokenSymbol = tokenBase != null ? tokenBase.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            if (tokenSymbol.length() <= 0 || (onx = (oNX) KWHzl()) == null || (c39826pzf = onx.KWHzl) == null) {
                return;
            }
            c39826pzf.AEQbTJ(tokenSymbol);
        }
    }

    public final boolean AhwBna() {
        return isConnected().AEQbTJ(AkhnZx().KWHzl().getValue().booleanValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        oNX onx;
        C39826pzf c39826pzf;
        super.onPause();
        if (C55608xnE.OLrzqt() || (onx = (oNX) KWHzl()) == null || (c39826pzf = onx.KWHzl) == null) {
            return;
        }
        c39826pzf.KWHzl();
    }

    public final void EZpvd(oNX onx, LatestMarketInfoBean latestMarketInfoBean) {
        java.lang.String strRealTokenContractAddress;
        java.lang.String circulatingSupply;
        TokenBase tokenBase = this.fetchVPNInfo;
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        java.lang.String str = "";
        if (chainId == null) {
            chainId = "";
        }
        if (latestMarketInfoBean == null || (strRealTokenContractAddress = latestMarketInfoBean.realTokenContractAddress()) == null) {
            strRealTokenContractAddress = "";
        }
        boolean zHasMarketCapData = latestMarketInfoBean != null ? latestMarketInfoBean.hasMarketCapData() : false;
        if (latestMarketInfoBean != null && (circulatingSupply = latestMarketInfoBean.getCirculatingSupply()) != null) {
            str = circulatingSupply;
        }
        mSK mskOLrzqt = mSK.Companion.OLrzqt(new KLineFragmentParams(chainId, strRealTokenContractAddress, zHasMarketCapData, str));
        mskOLrzqt.EZpvd(this);
        getChildFragmentManager().beginTransaction().replace(onx.EZpvd.getId(), mskOLrzqt, mSK.class.getName()).commitAllowingStateLoss();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        if (this.fetchVPNInfo != null) {
            mUN.collectOnViewLifecycle$default(this, DbNXlk().OLrzqt(), null, new StateListAnimator(), 2, null);
        }
        mUN.AEQbTJ(this, AkhnZx().AEQbTJ(), Lifecycle.State.CREATED, new LoaderManager());
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            mTF.this.copydefault(tokenDetail);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) mTF.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
            oNH onh;
            C34546neC c34546neC;
            if (!z) {
                return Unit.INSTANCE;
            }
            C34604nfI c34604nfIOLrzqt = C34498ndH.OLrzqt.OLrzqt();
            mTF mtf = mTF.this;
            android.content.Context contextRequireContext = mtf.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C34611nfP c34611nfP = new C34611nfP(contextRequireContext, null, 0, 6, null);
            c34611nfP.AEQbTJ(c34604nfIOLrzqt);
            oNX onxCopydefault = mTF.copydefault(mtf);
            if (onxCopydefault != null && (onh = onxCopydefault.OLrzqt) != null && (c34546neC = onh.KWHzl) != null) {
                c34546neC.setFirstIcon(c34611nfP);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v19, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(TokenDetail tokenDetail) {
        oNH onh;
        oNH onh2;
        android.widget.TextView textView;
        oNH onh3;
        AppCompatTextView appCompatTextView;
        oNH onh4;
        AppCompatTextView appCompatTextView2;
        oNX onx = (oNX) KWHzl();
        if (onx == null || (onh = onx.OLrzqt) == null) {
            return;
        }
        java.lang.String strKWHzl = tokenDetail.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        AppCompatTextView appCompatTextView3 = onh.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        mUO.setRiseDownPercentColorAndValue$default(appCompatTextView3, strKWHzl, false, 0, 6, null);
        oNX onx2 = (oNX) KWHzl();
        if (onx2 != null && (onh4 = onx2.OLrzqt) != null && (appCompatTextView2 = onh4.AhwBna) != null) {
            mUO.OLrzqt(appCompatTextView2, strKWHzl);
        }
        C32247mUy c32247mUy = onh.AkhnZx;
        mTU mtu = mTU.OLrzqt;
        java.lang.String strValues = tokenDetail.values();
        if (strValues == null) {
            strValues = "";
        }
        c32247mUy.setText(mtu.copydefault(strValues));
        C32247mUy c32247mUy2 = onh.gEmmrt;
        java.lang.String strDjBIcL = tokenDetail.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        c32247mUy2.setText(mtu.copydefault(strDjBIcL));
        C32247mUy c32247mUy3 = onh.fetchVPNInfo;
        java.lang.String strFJNWhG = tokenDetail.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        c32247mUy3.setText(mtu.EZpvd(strFJNWhG));
        C32247mUy c32247mUy4 = onh.valueOf;
        java.lang.String strAhwBna = tokenDetail.AhwBna();
        RoundingMode roundingMode = RoundingMode.DOWN;
        c32247mUy4.setText(mRA.getNumberICU$default(strAhwBna, roundingMode, null, null, null, 14, null));
        if (this.valueOf != null && (!r4.isSupportTxPrice())) {
            oNX onx3 = (oNX) KWHzl();
            if (onx3 != null && (onh3 = onx3.OLrzqt) != null && (appCompatTextView = onh3.AhwBna) != null) {
                mRJ mrj = mRJ.AEQbTJ;
                java.lang.String strDbNXlk = tokenDetail.DbNXlk();
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                appCompatTextView.setText(mrj.OLrzqt(strDbNXlk, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : roundingMode, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
            }
            oNX onx4 = (oNX) KWHzl();
            if (onx4 != null && (onh2 = onx4.OLrzqt) != null && (textView = onh2.AYXKKw) != null) {
                mRJ mrj2 = mRJ.AEQbTJ;
                java.lang.String strDbNXlk2 = tokenDetail.DbNXlk();
                if (strDbNXlk2 == null) {
                    strDbNXlk2 = "";
                }
                textView.setText(mrj2.OLrzqt(strDbNXlk2, (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : null, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
            }
            java.lang.String strDbNXlk3 = tokenDetail.DbNXlk();
            mTU.getTokenPrice$default(mtu, strDbNXlk3 != null ? strDbNXlk3 : "", false, 2, null);
        }
        java.lang.String strAuCTel = tokenDetail.AuCTel();
        if (strAuCTel != null) {
            onh.isConnected.setText(C32163mRv.formatPercentWithoutSymbol$default(strAuCTel, false, 0, new BigDecimal(0.01d), true, null, 19, null));
            onh.isConnected.EZpvd().setTextColor(C33129mqd.djBIcL(strAuCTel) >= 80.0f ? mUM.copydefault(C52761wXj.ActionBar.OuxcSI) : mUM.copydefault(C52761wXj.Activity.DQYQgr));
        }
        if (!tokenDetail.fetchVPNInfo().isEmpty()) {
            AEQbTJ(tokenDetail);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(TokenDetail tokenDetail) {
        oNH onh;
        C34546neC c34546neC;
        oNX onx = (oNX) KWHzl();
        if (onx == null || (onh = onx.OLrzqt) == null || (c34546neC = onh.KWHzl) == null) {
            return;
        }
        java.util.List<C34604nfI> listOLrzqt = C34604nfI.Companion.OLrzqt(tokenDetail.fetchVPNInfo(), true, requireContext());
        java.util.ArrayList<C34604nfI> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            C34604nfI c34604nfI = (C34604nfI) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) c34604nfI.EZpvd(), (java.lang.Object) "communityRecognized") && !Intrinsics.EZpvd((java.lang.Object) c34604nfI.EZpvd(), (java.lang.Object) "duringEvent")) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C34604nfI c34604nfI2 : arrayList) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C34611nfP c34611nfP = new C34611nfP(contextRequireContext, null, 0, 6, null);
            c34611nfP.AEQbTJ(c34604nfI2);
            arrayList2.add(c34611nfP);
        }
        c34546neC.setItems(arrayList2);
        c34546neC.setOnClickListener(new ActionBar(c34546neC, 1000L, tokenDetail, this));
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mTF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final mTF OLrzqt(TokenBase tokenBase, @NotNull LatestMarketInfoBean latestMarketInfoBean, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(latestMarketInfoBean, "");
            Intrinsics.checkNotNullParameter(str, "");
            mTF mtf = new mTF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("token_base", tokenBase);
            bundle.putParcelable("data", latestMarketInfoBean);
            bundle.putString("key.page_from", str);
            mtf.setArguments(bundle);
            return mtf;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC32157mRp
    public void OLrzqt(@NotNull java.util.List<? extends oUO> list, @NotNull java.lang.String str) {
        oNH onh;
        AppCompatTextView appCompatTextView;
        oNH onh2;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd((oNX) KWHzl(), list.isEmpty());
        oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(list);
        if (ouo != null) {
            oNX onx = (oNX) KWHzl();
            if (onx != null && (onh2 = onx.OLrzqt) != null && (textView = onh2.AYXKKw) != null) {
                textView.setText(mTU.getTokenPrice$default(mTU.OLrzqt, java.lang.String.valueOf(ouo.KWHzl), false, 2, null));
            }
            oNX onx2 = (oNX) KWHzl();
            if (onx2 != null && (onh = onx2.OLrzqt) != null && (appCompatTextView = onh.AhwBna) != null) {
                appCompatTextView.setText(mRJ.AEQbTJ.OLrzqt(java.lang.String.valueOf(ouo.KWHzl), (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
            }
            isConnected().fIwbmz().setValue(mTU.OLrzqt.AEQbTJ(java.lang.String.valueOf(ouo.KWHzl)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC32157mRp
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        oNH onh;
        android.widget.TextView textView;
        oNH onh2;
        AppCompatTextView appCompatTextView;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "http")) {
            oNX onx = (oNX) KWHzl();
            if (onx != null && (onh2 = onx.OLrzqt) != null && (appCompatTextView = onh2.AhwBna) != null) {
                appCompatTextView.setText(mRJ.AEQbTJ.OLrzqt("", (252 & 1) != 0 ? false : false, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
            }
            oNX onx2 = (oNX) KWHzl();
            if (onx2 != null && (onh = onx2.OLrzqt) != null && (textView = onh.AYXKKw) != null) {
                textView.setText("--");
            }
            isConnected().fIwbmz().setValue("--");
        }
    }
}
