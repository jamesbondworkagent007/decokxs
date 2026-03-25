package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.business.dexui.main.market.detail.fragment.chart.KLineFragmentParams;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.market.features.chart.ui.ChartDataViewModel;
import com.okinc.business.market.features.filter.ChartDetailSubTabName;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineDexAvgDataBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C36250oUv;
import o.C52761wXj;
import o.InterfaceC21944hSc;
import o.InterfaceC23254huk;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hQM extends hQH<hAS> implements InterfaceC39500ptX, C36250oUv.ActionBar {
    public int AkhnZx;
    public int AuCTel;
    public final Activity DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.hQR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return hQM.AuCTel(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fARcdN;
    public C36312oXc fIwbmz;
    public int fJNWhG;
    public final java.util.Map<java.lang.String, HistoryOrderData> fetchVPNInfo;
    public final ActionBar gEmmrt;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final java.util.List<HistoryOrderData> isConnected;
    public final InterfaceC56387yDm valueOf;
    public WeakReference<InterfaceC23254huk> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    @Override // o.C36250oUv.ActionBar
    public void EZpvd(java.lang.String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hAS KWHzl(hQM hqm) {
        return (hAS) hqm.aX_();
    }

    public hQM() {
        final Function0 function0 = new Function0() { // from class: o.hQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hQM.fIwbmz(this.copydefault);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$1
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$4
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$3
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
        final Function0 function03 = new Function0() { // from class: o.hQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hQM.fARcdN(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$6
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$7
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$viewModels$default$8
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
        this.isConnected = new java.util.ArrayList();
        this.fetchVPNInfo = new LinkedHashMap();
        this.values = new WeakReference<>(null);
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = new Activity();
        this.gEmmrt = new ActionBar();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hQM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final hQM OLrzqt(@NotNull KLineFragmentParams kLineFragmentParams) {
            Intrinsics.checkNotNullParameter(kLineFragmentParams, "");
            hQM hqm = new hQM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.kline_fragment", kLineFragmentParams);
            hqm.setArguments(bundle);
            return hqm;
        }
    }

    public final KLineFragmentParams isConnected() {
        return (KLineFragmentParams) this.ejfBZ.getValue();
    }

    public static final KLineFragmentParams AuCTel(hQM hqm) {
        KLineFragmentParams kLineFragmentParams;
        android.os.Bundle arguments = hqm.getArguments();
        return (arguments == null || (kLineFragmentParams = (KLineFragmentParams) BundleCompat.getParcelable(arguments, "key.kline_fragment", KLineFragmentParams.class)) == null) ? new KLineFragmentParams(null, null, false, null, 15, null) : kLineFragmentParams;
    }

    private final java.lang.String getNewProxyInstance() {
        return isConnected().OLrzqt();
    }

    private final java.lang.String iwGUEr() {
        return isConnected().EZpvd();
    }

    public final ChartViewModel djBIcL() {
        return (ChartViewModel) this.valueOf.getValue();
    }

    public static final ViewModelStoreOwner fIwbmz(hQM hqm) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = hqm.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final SharedFilterViewModel DbNXlk() {
        return (SharedFilterViewModel) this.getNewProxyInstance.getValue();
    }

    public static final ViewModelStoreOwner fARcdN(hQM hqm) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = hqm.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.hQH.gEmmrt()V */
    public final ChartDataViewModel gEmmrt() {
        return (ChartDataViewModel) this.djBIcL.getValue();
    }

    private final MarketCoinDetailViewModel getFieldNames() {
        return (MarketCoinDetailViewModel) this.fARcdN.getValue();
    }

    public static final class Activity implements InterfaceC23254huk {
        public Activity() {
        }

        @Override // o.InterfaceC23254huk
        public void KWHzl(java.lang.String str) {
            InterfaceC23254huk.Application.OLrzqt(this, str);
        }

        @Override // o.InterfaceC23254huk
        public void KWHzl(java.util.List<? extends oUO> list, java.lang.String str) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC23254huk interfaceC23254huk = (InterfaceC23254huk) hQM.this.values.get();
            if (interfaceC23254huk != null) {
                interfaceC23254huk.KWHzl(list, str);
            }
            java.util.List<oUO> listKWHzl = hQM.this.gEmmrt().KWHzl(list);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")) {
                oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(listKWHzl);
                if (ouo != null) {
                    C36246oUr.copydefault().iwGUEr().AEQbTJ(ouo.KWHzl);
                }
                hAS hasKWHzl = hQM.KWHzl(hQM.this);
                if (hasKWHzl != null && (c36250oUv2 = hasKWHzl.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv2.wlaJM()) != null) {
                    int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
                    hQM hqm = hQM.this;
                    TimeIntervalItem timeIntervalItemKWHzl = hRZ.OLrzqt.KWHzl(java.lang.Integer.valueOf(sPTimeInterval).intValue());
                    if (timeIntervalItemKWHzl != null) {
                        hqm.KWHzl(timeIntervalItemKWHzl);
                    }
                }
            }
            oUO ouo2 = (oUO) CollectionsKt___CollectionsKt.wlaJM(list);
            if (ouo2 != null) {
                double d = ouo2.KWHzl;
                hQM hqm2 = hQM.this;
                hqm2.djBIcL().EZpvd(d, hqm2.DbNXlk().AEQbTJ().getValue());
            }
            hAS hasKWHzl2 = hQM.KWHzl(hQM.this);
            if (hasKWHzl2 != null && (c36250oUv = hasKWHzl2.AEQbTJ) != null) {
                c36250oUv.AEQbTJ(listKWHzl);
            }
            hQM.this.OLrzqt(false);
            if (listKWHzl.isEmpty()) {
                hQM.this.uzCIH();
            } else {
                hQM.this.fIwbmz();
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hQM.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        @Override // o.InterfaceC23254huk
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            hQM.this.OLrzqt(false);
            InterfaceC23254huk interfaceC23254huk = (InterfaceC23254huk) hQM.this.values.get();
            if (interfaceC23254huk != null) {
                interfaceC23254huk.AEQbTJ(str, str2);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "http")) {
                hQM.this.ejfBZ();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) hQM.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            hAS hasKWHzl = hQM.KWHzl(hQM.this);
            if (hasKWHzl == null || (c36250oUv = hasKWHzl.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
    }

    public static final class ActionBar implements InterfaceC23253huj {
        public ActionBar() {
        }

        @Override // o.InterfaceC23253huj
        public void copydefault(java.util.List<MarketBuySellKLinePoint> list) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(list, "");
            hQM.this.isConnected.clear();
            hQM.this.isConnected.addAll(C27602jyL.EZpvd(list));
            hAS hasKWHzl = hQM.KWHzl(hQM.this);
            if (hasKWHzl != null && (c36250oUv2 = hasKWHzl.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(C21952hSk.copydefault.AYXKKw());
            }
            hAS hasKWHzl2 = hQM.KWHzl(hQM.this);
            if (hasKWHzl2 == null || (c36250oUv = hasKWHzl2.AEQbTJ) == null) {
                return;
            }
            c36250oUv.OLrzqt(C27602jyL.EZpvd(list), java.lang.Boolean.TRUE);
        }

        @Override // o.InterfaceC23253huj
        public void KWHzl(MarketBuySellKLinePoint marketBuySellKLinePoint) {
            C36250oUv c36250oUv;
            Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
            hQM.this.fetchVPNInfo.put(marketBuySellKLinePoint.AhwBna(), C27602jyL.OLrzqt(marketBuySellKLinePoint));
            hAS hasKWHzl = hQM.KWHzl(hQM.this);
            if (hasKWHzl == null || (c36250oUv = hasKWHzl.AEQbTJ) == null) {
                return;
            }
            hQM hqm = hQM.this;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.getFieldNames()));
            if (hqm.fetchVPNInfo.containsKey(strGEmmrt)) {
                c36250oUv.OLrzqt(C56402yEa.EZpvd(hqm.fetchVPNInfo.get(strGEmmrt)), java.lang.Boolean.FALSE);
                hqm.fetchVPNInfo.remove(strGEmmrt);
            }
        }
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hAS KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAS hasAEQbTJ = hAS.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hasAEQbTJ, "");
        return hasAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAS has, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(has, "");
        fetchVPNInfo();
        has.AEQbTJ.setCurrentDataSource("");
        C21945hSd.KWHzl.valueOf();
        oWN.KWHzl(C33570myu.djBIcL(requireContext()));
        has.copydefault.EZpvd(true);
        has.copydefault.setData(isConnected().KWHzl());
        C36250oUv c36250oUv = has.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c36250oUv, "");
        copydefault(c36250oUv);
        has.AEQbTJ.setActionListener(this);
        has.AEQbTJ.setChartSelectionListener(this);
        if (hRZ.OLrzqt.KWHzl(has.AEQbTJ.wlaJM().getSPTimeInterval()) != null) {
            djBIcL().KWHzl(new C23245hub(getNewProxyInstance(), iwGUEr(), new WeakReference(this.DbNXlk)));
            C23184htT c23184htTCopydefault = djBIcL().copydefault();
            if (c23184htTCopydefault != null) {
                c23184htTCopydefault.EZpvd();
            }
            djBIcL().EZpvd(new C23184htT(getNewProxyInstance(), iwGUEr(), new WeakReference(this.gEmmrt)));
        }
        android.view.View view = has.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(isConnected().KWHzl() ? 0 : 8);
        if (isConnected().KWHzl()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, gEmmrt().OLrzqt(), null, new StateListAnimator(), 2, null);
        }
        values();
        loadKLine$default(this, false, 1, null);
        AkhnZx();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ChartType chartType, Continuation<? super Unit> continuation) {
            if (chartType != null) {
                hQM.this.copydefault(chartType);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        pGX pgx;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        LinkedHashMap<java.lang.String, ChartArea> areas;
        hAS has = (hAS) aX_();
        EZpvd(has != null ? has.AEQbTJ : null);
        hAS has2 = (hAS) aX_();
        if (has2 != null && (c36250oUv2 = has2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
            hRZ hrz = hRZ.OLrzqt;
            hAS has3 = (hAS) aX_();
            hrz.AEQbTJ(has3 != null ? has3.AEQbTJ : null);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        hAS has4 = (hAS) aX_();
        this.fIwbmz = C36312oXc.AEQbTJ(has4 != null ? has4.AEQbTJ : null);
        hAS has5 = (hAS) aX_();
        if (has5 != null && (c36250oUv = has5.AEQbTJ) != null) {
            c36250oUv.setCurrentStateMachine(this.fIwbmz);
        }
        hAS has6 = (hAS) aX_();
        if (has6 == null || (pgx = has6.copydefault) == null) {
            return;
        }
        pgx.setData(isConnected().KWHzl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(ChartType chartType) {
        C36250oUv c36250oUv;
        OLrzqt(true);
        fARcdN();
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv = has.AEQbTJ) != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
            ChartType chartType2 = ChartType.MARKET_CAP;
            c36250oUv.OLrzqt(ChartViewOutSideConfig.copy$default(chartViewOutSideConfigAkhnZx, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, chartType == chartType2, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, chartType == chartType2, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -268435457, 2147352575, null));
            EZpvd(c36250oUv);
            loadKLine$default(this, false, 1, null);
        }
        KWHzl(djBIcL().KWHzl().getValue());
        OLrzqt(djBIcL().EZpvd().getValue());
    }

    public final void OLrzqt(@NotNull InterfaceC23254huk interfaceC23254huk) {
        Intrinsics.checkNotNullParameter(interfaceC23254huk, "");
        this.values = new WeakReference<>(interfaceC23254huk);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        hAS has = (hAS) aX_();
        java.lang.Integer numValueOf = (has == null || (c36250oUv2 = has.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv2.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : java.lang.Integer.valueOf(sideIndicatorNames.size());
        int iRlQdEF = C36246oUr.copydefault().RlQdEF();
        int iAccept = C36246oUr.copydefault().accept();
        Intrinsics.copydefault(numValueOf);
        this.fJNWhG = iRlQdEF + (iAccept * numValueOf.intValue());
        int iIntValue = (int) (this.fJNWhG * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f));
        hAS has2 = (hAS) aX_();
        if (has2 == null || (c36250oUv = has2.AEQbTJ) == null) {
            return;
        }
        c36250oUv.setMinimumHeight(iIntValue);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        pGX pgx;
        super.setListener();
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.hQZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                hQM.EZpvd(function1, obj);
            }
        });
        hAS has = (hAS) aX_();
        if (has != null && (pgx = has.copydefault) != null) {
            pgx.setOnItemSelectListener(new Function1() { // from class: o.hQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hQM.djBIcL(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        djBIcL().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.hQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        getFieldNames().hDKMBd().observe(this, new Application(new Function1() { // from class: o.hRa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, DbNXlk().OLrzqt(), null, new FragmentManager(), 2, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner2, DbNXlk().AEQbTJ(), null, new Fragment(), 2, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner3, djBIcL().KWHzl(), null, new Dialog(), 2, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner4, gEmmrt().EZpvd(), null, new PendingIntent(), 2, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner5, djBIcL().EZpvd(), null, new LoaderManager(), 2, null);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(hQM hqm, java.lang.String str) {
        hqm.fARcdN();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: o.pGX */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit djBIcL(final hQM hqm, int i) {
        java.util.ArrayList<TimeIntervalItem> arrayListAEQbTJ;
        java.util.ArrayList<TimeIntervalItem> arrayListKWHzl;
        TimeIntervalItem timeIntervalItem;
        pGX pgx;
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        pFN pfn = pFN.OLrzqt;
        InterfaceC39509ptg interfaceC39509ptgDjBIcL = pfn.djBIcL();
        if (interfaceC39509ptgDjBIcL != null && (arrayListAEQbTJ = interfaceC39509ptgDjBIcL.AEQbTJ()) != null && ((TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListAEQbTJ, i)) != null) {
            if (i == 4) {
                hRZ hrz = hRZ.OLrzqt;
                androidx.fragment.app.FragmentManager childFragmentManager = hqm.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                hAS has = (hAS) hqm.aX_();
                C36250oUv c36250oUv3 = has != null ? has.AEQbTJ : null;
                hAS has2 = (hAS) hqm.aX_();
                hrz.copydefault(childFragmentManager, c36250oUv3, has2 != null ? has2.copydefault : null, hqm.fIwbmz, hqm.getNewProxyInstance(), hqm.iwGUEr(), hqm.isConnected().KWHzl(), new Function1() { // from class: o.hQU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return hQM.AEQbTJ(this.AEQbTJ, (TimeIntervalItem) obj);
                    }
                });
            } else {
                InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
                if (interfaceC39509ptgDjBIcL2 != null && (arrayListKWHzl = interfaceC39509ptgDjBIcL2.KWHzl()) != null && (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListKWHzl, i)) != null) {
                    hAS has3 = (hAS) hqm.aX_();
                    if (has3 != null && has3.AEQbTJ != null) {
                        hRZ hrz2 = hRZ.OLrzqt;
                        hAS has4 = (hAS) hqm.aX_();
                        hrz2.OLrzqt(has4 != null ? has4.AEQbTJ : null, timeIntervalItem, hqm.fIwbmz, hqm.getNewProxyInstance(), hqm.iwGUEr());
                    }
                    hqm.OLrzqt(!C22416heu.ejfBZ());
                    C23245hub c23245hubAEQbTJ = hqm.djBIcL().AEQbTJ();
                    if (c23245hubAEQbTJ != null) {
                        java.lang.String strCopydefault = hRZ.OLrzqt.copydefault(timeIntervalItem);
                        hAS has5 = (hAS) hqm.aX_();
                        if (has5 != null && (c36250oUv2 = has5.AEQbTJ) != null) {
                            objValueOf = java.lang.Long.valueOf(c36250oUv2.fARcdN());
                        }
                        c23245hubAEQbTJ.KWHzl(strCopydefault, C33129mqd.gEmmrt(objValueOf));
                    }
                    hAS has6 = (hAS) hqm.aX_();
                    if (has6 != null && (c36250oUv = has6.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                        templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
                    }
                    hAS has7 = (hAS) hqm.aX_();
                    if (has7 != null && (pgx = has7.copydefault) != null) {
                        pgx.setData(hqm.isConnected().KWHzl());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(hQM hqm, TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        hqm.OLrzqt(!C22416heu.ejfBZ());
        C23245hub c23245hubAEQbTJ = hqm.djBIcL().AEQbTJ();
        if (c23245hubAEQbTJ != null) {
            java.lang.String strCopydefault = hRZ.OLrzqt.copydefault(timeIntervalItem);
            hAS has = (hAS) hqm.aX_();
            c23245hubAEQbTJ.KWHzl(strCopydefault, C33129mqd.gEmmrt((has == null || (c36250oUv = has.AEQbTJ) == null) ? null : java.lang.Long.valueOf(c36250oUv.fARcdN())));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(hQM hqm, java.util.List list) {
        hAS has;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        hAS has2 = (hAS) hqm.aX_();
        if (has2 != null && (c36250oUv3 = has2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
        }
        ChartDataViewModel chartDataViewModelGEmmrt = hqm.gEmmrt();
        Intrinsics.copydefault(list);
        java.util.List<oUO> listKWHzl = chartDataViewModelGEmmrt.KWHzl(list);
        hAS has3 = (hAS) hqm.aX_();
        if (has3 != null && (c36250oUv2 = has3.AEQbTJ) != null) {
            c36250oUv2.KWHzl(listKWHzl);
        }
        java.lang.String strAEQbTJ = hqm.djBIcL().AEQbTJ(hqm.getNewProxyInstance());
        TokenFilter tokenFilterCopydefault = hqm.DbNXlk().copydefault();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tokenFilterCopydefault.OLrzqt());
        if (str != null) {
            strAEQbTJ = str;
        }
        java.lang.String strEZpvd = tokenFilterCopydefault.EZpvd();
        if (C33129mqd.KWHzl((java.util.Collection) list) && ((strAEQbTJ.length() > 0 || strEZpvd.length() > 0) && (has = (hAS) hqm.aX_()) != null && (c36250oUv = has.AEQbTJ) != null)) {
            c36250oUv.OLrzqt(hqm.isConnected, java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hQM hqm, java.lang.Boolean bool) {
        hqm.AuCTel();
        return Unit.INSTANCE;
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenFilter tokenFilter, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            hAS hasKWHzl = hQM.KWHzl(hQM.this);
            if (hasKWHzl != null && (c36250oUv = hasKWHzl.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(templateSettingWlaJM.getSPTimeInterval());
                hQM hqm = hQM.this;
                TimeIntervalItem timeIntervalItemKWHzl = hRZ.OLrzqt.KWHzl(numAEQbTJ.intValue());
                if (timeIntervalItemKWHzl != null) {
                    hqm.KWHzl(timeIntervalItemKWHzl);
                }
            }
            hQM.this.fJNWhG();
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ChartDetailSubTabName chartDetailSubTabName, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            hAS hasKWHzl = hQM.KWHzl(hQM.this);
            if (hasKWHzl != null && (c36250oUv = hasKWHzl.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(templateSettingWlaJM.getSPTimeInterval());
                hQM hqm = hQM.this;
                TimeIntervalItem timeIntervalItemKWHzl = hRZ.OLrzqt.KWHzl(numAEQbTJ.intValue());
                if (timeIntervalItemKWHzl != null) {
                    hqm.KWHzl(timeIntervalItemKWHzl);
                }
            }
            hQM.this.djBIcL().copydefault(chartDetailSubTabName);
            return Unit.INSTANCE;
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<KlineOpenOrderBean> list, Continuation<? super Unit> continuation) {
            hQM.this.KWHzl(list);
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ChartDataViewModel.Application application, Continuation<? super Unit> continuation) {
            hAS hasKWHzl;
            C36250oUv c36250oUv;
            if ((application instanceof ChartDataViewModel.Application.Activity) && (hasKWHzl = hQM.KWHzl(hQM.this)) != null && (c36250oUv = hasKWHzl.AEQbTJ) != null) {
                hQM hqm = hQM.this;
                c36250oUv.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUv.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, ((ChartDataViewModel.Application.Activity) application).KWHzl() == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
                hQM.loadKLine$default(hqm, false, 1, null);
            }
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
        public final java.lang.Object emit(java.util.List<C25982jNo> list, Continuation<? super Unit> continuation) {
            hQM.this.OLrzqt(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.fetchVPNInfo.clear();
        this.isConnected.clear();
        java.lang.String strAEQbTJ = djBIcL().AEQbTJ(getNewProxyInstance());
        TokenFilter tokenFilterCopydefault = DbNXlk().copydefault();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tokenFilterCopydefault.OLrzqt());
        if (str != null) {
            strAEQbTJ = str;
        }
        java.lang.String strEZpvd = tokenFilterCopydefault.EZpvd();
        if ((tokenFilterCopydefault.OLrzqt().size() < 2 && strAEQbTJ.length() > 0) || strEZpvd.length() > 0) {
            C23184htT c23184htTCopydefault = djBIcL().copydefault();
            if (c23184htTCopydefault != null) {
                c23184htTCopydefault.AEQbTJ(hRZ.OLrzqt.AEQbTJ(timeIntervalItem.timeInterval), strAEQbTJ, strEZpvd);
                return;
            }
            return;
        }
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv = has.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(false);
        }
        C23184htT c23184htTCopydefault2 = djBIcL().copydefault();
        if (c23184htTCopydefault2 != null) {
            c23184htTCopydefault2.EZpvd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        hAS has;
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        super.onVisible();
        if (djBIcL().AEQbTJ() != null || (has = (hAS) aX_()) == null || (c36250oUv = has.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        if (hRZ.OLrzqt.KWHzl(java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue()) != null) {
            djBIcL().KWHzl(new C23245hub(getNewProxyInstance(), iwGUEr(), new WeakReference(this.DbNXlk)));
            C23184htT c23184htTCopydefault = djBIcL().copydefault();
            if (c23184htTCopydefault != null) {
                c23184htTCopydefault.EZpvd();
            }
            djBIcL().EZpvd(new C23184htT(getNewProxyInstance(), iwGUEr(), new WeakReference(this.gEmmrt)));
            loadKLine$default(this, false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onInvisible() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        AYXKKw();
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv2 = has.AEQbTJ) != null) {
            c36250oUv2.QUSxYX();
        }
        hAS has2 = (hAS) aX_();
        if (has2 == null || (c36250oUv = has2.AEQbTJ) == null) {
            return;
        }
        c36250oUv.OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        C36250oUv c36250oUv;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv2;
        C23245hub c23245hubAEQbTJ = djBIcL().AEQbTJ();
        if (c23245hubAEQbTJ != null) {
            c23245hubAEQbTJ.EZpvd();
        }
        java.lang.String strFIwbmz = null;
        djBIcL().KWHzl(null);
        C23184htT c23184htTCopydefault = djBIcL().copydefault();
        if (c23184htTCopydefault != null) {
            c23184htTCopydefault.EZpvd();
        }
        djBIcL().EZpvd((C23184htT) null);
        hAS has = (hAS) aX_();
        if (has == null || (c36250oUv = has.AEQbTJ) == null || (mapEjfBZ = c36250oUv.ejfBZ()) == null) {
            return;
        }
        hAS has2 = (hAS) aX_();
        if (has2 != null && (c36250oUv2 = has2.AEQbTJ) != null) {
            strFIwbmz = c36250oUv2.fIwbmz();
        }
        com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get(strFIwbmz);
        if (dataSource != null) {
            dataSource.KWHzl();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C36250oUv c36250oUv;
        super.onResume();
        hAS has = (hAS) aX_();
        if (has == null || (c36250oUv = has.AEQbTJ) == null) {
            return;
        }
        c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.hQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.PendingIntent
            public final void AEQbTJ() {
                hQM.fJNWhG(this.OLrzqt);
            }
        });
    }

    public static final void fJNWhG(hQM hqm) {
        hqm.valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv5;
        C36250oUv c36250oUv6;
        this.values = new WeakReference<>(null);
        C36246oUr.copydefault().AubY(false);
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv6 = has.AEQbTJ) != null) {
            c36250oUv6.RcXXUw();
        }
        hAS has2 = (hAS) aX_();
        if (has2 != null && (c36250oUv5 = has2.AEQbTJ) != null) {
            c36250oUv5.copydefault();
        }
        hAS has3 = (hAS) aX_();
        if (has3 != null && (c36250oUv4 = has3.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
        hAS has4 = (hAS) aX_();
        if (has4 != null && (c36250oUv3 = has4.AEQbTJ) != null) {
            c36250oUv3.setActionListener(null);
        }
        hAS has5 = (hAS) aX_();
        if (has5 != null && (c36250oUv2 = has5.AEQbTJ) != null) {
            c36250oUv2.setLoadHistoryKlineListener(null);
        }
        hAS has6 = (hAS) aX_();
        if (has6 != null && (c36250oUv = has6.AEQbTJ) != null) {
            c36250oUv.setChartSelectionListener(null);
        }
        C23245hub c23245hubAEQbTJ = djBIcL().AEQbTJ();
        if (c23245hubAEQbTJ != null) {
            c23245hubAEQbTJ.EZpvd();
        }
        djBIcL().KWHzl(null);
        C23184htT c23184htTCopydefault = djBIcL().copydefault();
        if (c23184htTCopydefault != null) {
            c23184htTCopydefault.EZpvd();
        }
        djBIcL().EZpvd((C23184htT) null);
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        djBIcL().AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C55113xdn c55113xdn4;
        C55113xdn c55113xdn5;
        if (z) {
            hAS has = (hAS) aX_();
            if (has != null && (c55113xdn5 = has.AkhnZx) != null) {
                c55113xdn5.setVisibility(0);
            }
            hAS has2 = (hAS) aX_();
            if (has2 != null && (c55113xdn4 = has2.AkhnZx) != null) {
                c55113xdn4.setAnimation(C52761wXj.PendingIntent.isConnected);
            }
            hAS has3 = (hAS) aX_();
            if (has3 == null || (c55113xdn3 = has3.AkhnZx) == null) {
                return;
            }
            c55113xdn3.playAnimation();
            return;
        }
        hAS has4 = (hAS) aX_();
        if (has4 != null && (c55113xdn2 = has4.AkhnZx) != null) {
            c55113xdn2.setVisibility(8);
        }
        hAS has5 = (hAS) aX_();
        if (has5 == null || (c55113xdn = has5.AkhnZx) == null) {
            return;
        }
        c55113xdn.cancelAnimation();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        hAS has = (hAS) aX_();
        if (has == null || (c36250oUv = has.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        hRZ hrz = hRZ.OLrzqt;
        TimeIntervalItem timeIntervalItemKWHzl = hrz.KWHzl(iIntValue);
        if (timeIntervalItemKWHzl != null) {
            hAS has2 = (hAS) aX_();
            if (has2 != null && (c36250oUv3 = has2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(true);
            }
            ChartViewModel chartViewModelDjBIcL = djBIcL();
            java.lang.String newProxyInstance = getNewProxyInstance();
            java.lang.String strIwGUEr = iwGUEr();
            hAS has3 = (hAS) aX_();
            DexTokenCandleParam dexTokenCandleParam = new DexTokenCandleParam(newProxyInstance, strIwGUEr, C33129mqd.gEmmrt((has3 == null || (c36250oUv2 = has3.AEQbTJ) == null) ? null : java.lang.Long.valueOf(c36250oUv2.fARcdN())), null, hrz.copydefault(timeIntervalItemKWHzl), null, null, 104, null);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            chartViewModelDjBIcL.AEQbTJ("default_trade", dexTokenCandleParam, viewLifecycleOwner);
        }
    }

    public static /* synthetic */ void loadKLine$default(hQM hqm, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        hqm.copydefault(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        if (z) {
            fARcdN();
        }
        hAS has = (hAS) aX_();
        if (has == null || (c36250oUv = has.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        hRZ hrz = hRZ.OLrzqt;
        TimeIntervalItem timeIntervalItemKWHzl = hrz.KWHzl(iIntValue);
        if (timeIntervalItemKWHzl != null) {
            OLrzqt(!C22416heu.ejfBZ());
            C23245hub c23245hubAEQbTJ = djBIcL().AEQbTJ();
            if (c23245hubAEQbTJ != null) {
                java.lang.String strCopydefault = hrz.copydefault(timeIntervalItemKWHzl);
                hAS has2 = (hAS) aX_();
                c23245hubAEQbTJ.KWHzl(strCopydefault, C33129mqd.gEmmrt((has2 == null || (c36250oUv2 = has2.AEQbTJ) == null) ? null : java.lang.Long.valueOf(c36250oUv2.fARcdN())));
            }
            hAS has3 = (hAS) aX_();
            EZpvd(has3 != null ? has3.AEQbTJ : null);
        }
    }

    public final void AkhnZx() {
        djBIcL().KWHzl(getNewProxyInstance(), iwGUEr());
        ChartViewModel.getAvgPrice$default(djBIcL(), getNewProxyInstance(), iwGUEr(), null, null, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<KlineOpenOrderBean> list) {
        hAS has;
        ChartType value = gEmmrt().OLrzqt().getValue();
        if (value == null || (has = (hAS) aX_()) == null) {
            return;
        }
        if (value == ChartType.MARKET_CAP) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (KlineOpenOrderBean klineOpenOrderBean : list) {
                KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
                klineOpenOrderBean2.setOrdType(klineOpenOrderBean.getOrdType());
                klineOpenOrderBean2.setAmountNoSign(klineOpenOrderBean.getAmountNoSign());
                klineOpenOrderBean2.setSide(klineOpenOrderBean.getSide());
                klineOpenOrderBean2.setPrice(C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(klineOpenOrderBean.getPrice()) * C33129mqd.AEQbTJ(isConnected().AEQbTJ()))));
                arrayList.add(klineOpenOrderBean2);
            }
            list = arrayList;
        }
        has.AEQbTJ.AkhnZx().setOpenOrderDataList(list);
        has.AEQbTJ.invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.util.List<C25982jNo> list) {
        hAS has;
        double dAEQbTJ;
        ChartType value = gEmmrt().OLrzqt().getValue();
        if (value == null || (has = (hAS) aX_()) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C25982jNo c25982jNo : list) {
            double dValueOf = c25982jNo.valueOf();
            double dEZpvd = c25982jNo.EZpvd();
            if (value == ChartType.MARKET_CAP) {
                dAEQbTJ = c25982jNo.AEQbTJ() * C33129mqd.AEQbTJ(isConnected().AEQbTJ());
            } else {
                dAEQbTJ = c25982jNo.AEQbTJ();
            }
            KlineDexAvgDataBean klineDexAvgDataBean = new KlineDexAvgDataBean();
            klineDexAvgDataBean.setAccAvgPx(java.lang.String.valueOf(dAEQbTJ));
            klineDexAvgDataBean.setFilterAddress(c25982jNo.OLrzqt());
            klineDexAvgDataBean.setPnlAmount(java.lang.String.valueOf(dValueOf + dEZpvd));
            klineDexAvgDataBean.setPnlRate(C23311hvo.formatPercentWithSymbol$default(c25982jNo.copydefault(), false, 0, 0, null, null, 30, null));
            klineDexAvgDataBean.setPositionAmount(java.lang.String.valueOf(c25982jNo.KWHzl()));
            arrayList.add(klineDexAvgDataBean);
        }
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = has.AEQbTJ.AkhnZx();
        KlineSpotAverageBean klineSpotAverageBean = new KlineSpotAverageBean();
        klineSpotAverageBean.setShowSpotAverageLine(true);
        klineSpotAverageBean.setDexAvgDataList(arrayList);
        chartViewOutSideConfigAkhnZx.setKlineSpotAverageBean(klineSpotAverageBean);
        has.AEQbTJ.invalidate();
    }

    public final void fJNWhG() {
        TokenFilter tokenFilterCopydefault = DbNXlk().copydefault();
        ChartDetailSubTabName value = DbNXlk().AEQbTJ().getValue();
        if (tokenFilterCopydefault.OLrzqt().size() == 1) {
            djBIcL().EZpvd(getNewProxyInstance(), iwGUEr(), (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(tokenFilterCopydefault.OLrzqt()), value);
        } else {
            djBIcL().AEQbTJ(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void fetchVPNInfo() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        chartViewOutSideConfig.setDexChartSource("dex_src_market");
        C21952hSk c21952hSk = C21952hSk.copydefault;
        chartViewOutSideConfig.setMShowHistoryOrder(c21952hSk.AYXKKw());
        chartViewOutSideConfig.setMShowCurrentOrder(c21952hSk.OLrzqt());
        chartViewOutSideConfig.setMShowCostLine(c21952hSk.EZpvd());
        chartViewOutSideConfig.setColumnChart(c21952hSk.AhwBna());
        chartViewOutSideConfig.setMShowPriceLine(c21952hSk.gEmmrt());
        chartViewOutSideConfig.setMDexAvgShowPnlAmt(c21952hSk.valueOf());
        chartViewOutSideConfig.setShowSpotAveragePrice(c21952hSk.AEQbTJ());
        chartViewOutSideConfig.setMDexAvgShowRight(c21952hSk.copydefault());
        chartViewOutSideConfig.setMDexAvgExtend(c21952hSk.KWHzl());
        chartViewOutSideConfig.setScreen(true);
        chartViewOutSideConfig.setHideTradeDrawingLine(gEmmrt().OLrzqt().getValue() == ChartType.MARKET_CAP);
        chartViewOutSideConfig.setChartTag("kline_dex_market_time_preference");
        chartViewOutSideConfig.setMode("defi_mode_dex");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setMarketCap(false);
        chartViewOutSideConfig.setKLineInfiniteScale(true);
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv2 = has.AEQbTJ) != null) {
            c36250oUv2.OLrzqt(chartViewOutSideConfig);
        }
        hAS has2 = (hAS) aX_();
        if (has2 != null && (c36250oUv = has2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(false);
        }
        pFN pfn = pFN.OLrzqt;
        C21945hSd c21945hSd = C21945hSd.KWHzl;
        pfn.EZpvd(c21945hSd.OLrzqt(), c21945hSd);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void copydefault(@NotNull C36250oUv c36250oUv) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        pGY pgy;
        LatestMarketInfoBean second;
        java.lang.String tokenSymbol;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.fIwbmz = C36312oXc.AEQbTJ((C36250oUv) null);
        hRZ hrz = hRZ.OLrzqt;
        hAS has = (hAS) aX_();
        pGY pgy2 = has != null ? has.valueOf : null;
        java.lang.String newProxyInstance = getNewProxyInstance();
        java.lang.String strIwGUEr = iwGUEr();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = getFieldNames().valueOf().getValue();
        InterfaceC21944hSc.Activity.initChartView$default(hrz, c36250oUv, pgy2, newProxyInstance, strIwGUEr, (value == null || (second = value.getSecond()) == null || (tokenSymbol = second.getTokenSymbol()) == null) ? "" : tokenSymbol, false, 32, null);
        hAS has2 = (hAS) aX_();
        if (has2 != null && (pgy = has2.valueOf) != null) {
            pgy.setOnItemSelectListener(new Function1() { // from class: o.hRc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hQM.AEQbTJ(this.EZpvd, (MarketTypeSelect) obj);
                }
            });
        }
        hAS has3 = (hAS) aX_();
        if (has3 != null && (appCompatImageView2 = has3.AhwBna) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView2, 0L, new Function1() { // from class: o.hRd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hQM.KWHzl(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
        hAS has4 = (hAS) aX_();
        if (has4 == null || (appCompatImageView = has4.djBIcL) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView, 0L, new Function1() { // from class: o.hRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.copydefault(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final hQM hqm, MarketTypeSelect marketTypeSelect) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        hAS has = (hAS) hqm.aX_();
        if (has != null && (c36250oUv = has.AEQbTJ) != null) {
            hRZ.OLrzqt.KWHzl(c36250oUv, marketTypeSelect, new Function1() { // from class: o.hQQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hQM.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hQM hqm, int i) {
        hqm.fJNWhG += i;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final hQM hqm, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        hRZ hrz = hRZ.OLrzqt;
        androidx.fragment.app.FragmentManager childFragmentManager = hqm.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        hAS has = (hAS) hqm.aX_();
        C36250oUv c36250oUv = has != null ? has.AEQbTJ : null;
        hAS has2 = (hAS) hqm.aX_();
        pGX pgx = has2 != null ? has2.copydefault : null;
        hAS has3 = (hAS) hqm.aX_();
        hrz.copydefault(childFragmentManager, c36250oUv, pgx, has3 != null ? has3.valueOf : null, hqm.isConnected().KWHzl(), new Function1() { // from class: o.hQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hQM hqm, int i) {
        hqm.fJNWhG += i;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(hQM hqm, android.view.View view) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(view, "");
        hqm.AkhnZx = hqm.AuCTel;
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> mutableLiveDataIsConnected = hqm.getFieldNames().isConnected();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        hAS has = (hAS) hqm.aX_();
        mutableLiveDataIsConnected.setValue(C56390yDp.OLrzqt(bool, java.lang.Integer.valueOf((has == null || (c36250oUv = has.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) ? 0 : chartViewOutSideConfigAkhnZx.getTopPanelHeight())));
        InterfaceC35976oKr klineSettingFragment$default = oKA.TaskDescription.getKlineSettingFragment$default((oKA) C43251rlk.copydefault(oKA.class), "SPOT", true, true, false, false, false, false, true, true, true, true, false, true, false, null, null, 57408, null);
        hAS has2 = (hAS) hqm.aX_();
        klineSettingFragment$default.OLrzqt(new C21953hSl(new WeakReference(has2 != null ? has2.AEQbTJ : null), hqm.getFieldNames(), hqm.fJNWhG, hqm.AkhnZx));
        androidx.fragment.app.FragmentManager childFragmentManager = hqm.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = hQM.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        klineSettingFragment$default.copydefault(childFragmentManager, simpleName);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        C55173xeu c55173xeu;
        Group group;
        hAS has = (hAS) aX_();
        if (has != null && (group = has.gEmmrt) != null) {
            group.setVisibility(8);
        }
        hAS has2 = (hAS) aX_();
        if (has2 == null || (c55173xeu = has2.AYXKKw) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        java.lang.String string = getString(C23274hvD.Fragment.ActivityResultKt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string3 = getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.hQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hQM.valueOf(this.EZpvd, view);
            }
        });
    }

    public static final void valueOf(hQM hqm, android.view.View view) {
        loadKLine$default(hqm, false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C55173xeu c55173xeu;
        Group group;
        hAS has = (hAS) aX_();
        if (has != null && (group = has.gEmmrt) != null) {
            group.setVisibility(8);
        }
        hAS has2 = (hAS) aX_();
        if (has2 == null || (c55173xeu = has2.AYXKKw) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.addOnConfigurationChangedListener));
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        c55173xeu.setEmptyTypeImage(6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        hAS has = (hAS) aX_();
        if (has != null) {
            has.gEmmrt.setVisibility(0);
            has.AYXKKw.setVisibility(8);
        }
    }

    public void EZpvd(C36250oUv c36250oUv) {
        hRZ hrz = hRZ.OLrzqt;
        hrz.KWHzl(c36250oUv, hrz.OLrzqt(c36250oUv, getNewProxyInstance(), iwGUEr()), this.fIwbmz);
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
        getFieldNames().EZpvd().setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        C36250oUv c36250oUv;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv2;
        hAS has = (hAS) aX_();
        if (has != null && (c36250oUv = has.AEQbTJ) != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            hAS has2 = (hAS) aX_();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get((has2 == null || (c36250oUv2 = has2.AEQbTJ) == null) ? null : c36250oUv2.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36246oUr.copydefault().valueOf();
    }

    private final void hDKMBd() {
        C32866mlf.onEvent$default("DEXMarket_Token_KlineBuy/sell_Click", (TrackChannel[]) null, new Function1() { // from class: o.hQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return hQM.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(hQM hqm, EventParamsList eventParamsList) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String tabName = hqm.DbNXlk().AEQbTJ().getValue().getTabName();
        TokenFilter tokenFilterCopydefault = hqm.DbNXlk().copydefault();
        EventParamsList.put$default(eventParamsList, "token_chain", hqm.isConnected().OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", hqm.iwGUEr(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", tabName, false, 4, null);
        java.lang.String lowerCase = tokenFilterCopydefault.EZpvd().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        EventParamsList.put$default(eventParamsList, "holder_label_tab", lowerCase.length() == 0 ? "all" : lowerCase, false, 4, null);
        hRZ hrz = hRZ.OLrzqt;
        hAS has = (hAS) hqm.aX_();
        EventParamsList.put$default(eventParamsList, "kline_time", hrz.AEQbTJ((has == null || (c36250oUv = has.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 0 : templateSettingWlaJM.getSPTimeInterval()), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C36250oUv.ActionBar
    public void copydefault(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            hDKMBd();
        }
    }
}
