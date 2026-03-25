package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.core.os.BundleCompat;
import androidx.core.view.PointerIconCompat;
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
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$initLandView$1$5$1$1$1;
import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.KlineSettingType;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C21916hRb;
import o.C23274hvD;
import o.C32113mPz;
import o.C36250oUv;
import o.C52761wXj;
import o.InterfaceC21944hSc;
import o.InterfaceC23254huk;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hRb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21916hRb extends hQL<hAP> implements C36250oUv.ActionBar {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public InterfaceC39560pue AhwBna;
    public final LoaderManager AkhnZx;
    public int AuCTel;
    public final java.util.List<HistoryOrderData> DbNXlk;
    public int ejfBZ;
    public C36312oXc fARcdN;
    public int fIwbmz;
    public LatestMarketInfoBean fJNWhG;
    public final Fragment fetchVPNInfo;
    public final InterfaceC56387yDm getNewProxyInstance;
    public C23258huo hDKMBd;
    public final java.util.Map<java.lang.String, HistoryOrderData> isConnected;
    public TokenBase iwGUEr;
    public final InterfaceC56387yDm uzCIH;
    public InterfaceC35976oKr values;
    public final java.lang.Object djBIcL = new java.lang.Object();
    public final InterfaceC56387yDm getFieldNames = C31200lpY.copydefault(this);

    /* JADX INFO: renamed from: o.hRb$FragmentManager */
    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
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

    @Override // o.C36250oUv.ActionBar
    public void EZpvd(java.lang.String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hAP gEmmrt(C21916hRb c21916hRb) {
        return (hAP) c21916hRb.aX_();
    }

    public C21916hRb() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$5
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$3
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$6
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
        this.DbNXlk = new java.util.ArrayList();
        this.isConnected = new LinkedHashMap();
        this.AkhnZx = new LoaderManager();
        this.fetchVPNInfo = new Fragment();
    }

    private final java.lang.String AuCTel() {
        return (java.lang.String) this.getFieldNames.getValue();
    }

    private final ChartViewModel fetchVPNInfo() {
        return (ChartViewModel) this.AYXKKw.getValue();
    }

    private final SharedFilterViewModel fIwbmz() {
        return (SharedFilterViewModel) this.getNewProxyInstance.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel ejfBZ() {
        return (MarketCoinDetailViewModel) this.uzCIH.getValue();
    }

    /* JADX INFO: renamed from: o.hRb$LoaderManager */
    public static final class LoaderManager implements InterfaceC23254huk {
        public LoaderManager() {
        }

        @Override // o.InterfaceC23254huk
        public void KWHzl(java.lang.String str) {
            InterfaceC23254huk.Application.OLrzqt(this, str);
        }

        @Override // o.InterfaceC23254huk
        public void KWHzl(java.util.List<? extends oUO> list, java.lang.String str) {
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            hAP hapGEmmrt;
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            C36250oUv c36250oUv2;
            C36250oUv c36250oUv3;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            hAP hapGEmmrt2 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt2 != null && (c36250oUv3 = hapGEmmrt2.AEQbTJ) != null) {
                c36250oUv3.invalidate();
            }
            hAP hapGEmmrt3 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt3 != null && (c36250oUv2 = hapGEmmrt3.AEQbTJ) != null) {
                c36250oUv2.AEQbTJ(list);
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http") && (hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this)) != null && (c36250oUv = hapGEmmrt.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
                C21916hRb c21916hRb = C21916hRb.this;
                TimeIntervalItem timeIntervalItemKWHzl = hRZ.OLrzqt.KWHzl(java.lang.Integer.valueOf(sPTimeInterval).intValue());
                if (timeIntervalItemKWHzl != null) {
                    c21916hRb.EZpvd(timeIntervalItemKWHzl);
                }
            }
            C21916hRb.this.KWHzl(false);
            oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(list);
            if (ouo != null) {
                C21916hRb c21916hRb2 = C21916hRb.this;
                hAP hapGEmmrt4 = C21916hRb.gEmmrt(c21916hRb2);
                if (hapGEmmrt4 != null && (appCompatTextView2 = hapGEmmrt4.zuBGHE) != null) {
                    appCompatTextView2.setText(C21949hSh.EZpvd.KWHzl(java.lang.String.valueOf(ouo.KWHzl)));
                }
                hAP hapGEmmrt5 = C21916hRb.gEmmrt(c21916hRb2);
                if (hapGEmmrt5 != null && (appCompatTextView = hapGEmmrt5.zLjUOn) != null) {
                    appCompatTextView.setText(C21949hSh.getTokenPrice$default(C21949hSh.EZpvd, java.lang.String.valueOf(ouo.KWHzl), false, 2, null));
                }
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C21916hRb.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        @Override // o.InterfaceC23254huk
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C21916hRb.this.KWHzl(false);
            C21916hRb.this.AEQbTJ(Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "http"));
            hAP hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt != null && (c36250oUv2 = hapGEmmrt.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
            }
            hAP hapGEmmrt2 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt2 != null && (c36250oUv = hapGEmmrt2.AEQbTJ) != null) {
                c36250oUv.invalidate();
            }
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "http")) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C21916hRb.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.hRb$Fragment */
    public static final class Fragment implements InterfaceC23253huj {
        public Fragment() {
        }

        @Override // o.InterfaceC23253huj
        public void copydefault(java.util.List<MarketBuySellKLinePoint> list) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(list, "");
            C21916hRb.this.DbNXlk.clear();
            C21916hRb.this.DbNXlk.addAll(C27602jyL.EZpvd(list));
            hAP hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt != null && (c36250oUv2 = hapGEmmrt.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(C21952hSk.copydefault.AYXKKw());
            }
            hAP hapGEmmrt2 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt2 == null || (c36250oUv = hapGEmmrt2.AEQbTJ) == null) {
                return;
            }
            c36250oUv.OLrzqt(C27602jyL.EZpvd(list), java.lang.Boolean.TRUE);
        }

        @Override // o.InterfaceC23253huj
        public void KWHzl(MarketBuySellKLinePoint marketBuySellKLinePoint) {
            C36250oUv c36250oUv;
            Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
            C21916hRb.this.isConnected.put(marketBuySellKLinePoint.AhwBna(), C27602jyL.OLrzqt(marketBuySellKLinePoint));
            hAP hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt == null || (c36250oUv = hapGEmmrt.AEQbTJ) == null) {
                return;
            }
            C21916hRb c21916hRb = C21916hRb.this;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.getFieldNames()));
            if (c21916hRb.isConnected.containsKey(strGEmmrt)) {
                c36250oUv.OLrzqt(C56402yEa.EZpvd(c21916hRb.isConnected.get(strGEmmrt)), java.lang.Boolean.FALSE);
                c21916hRb.isConnected.remove(strGEmmrt);
            }
        }
    }

    /* JADX INFO: renamed from: o.hRb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hRb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C21916hRb EZpvd(TokenBase tokenBase, @NotNull java.lang.String str, LatestMarketInfoBean latestMarketInfoBean) {
            Intrinsics.checkNotNullParameter(str, "");
            C21916hRb c21916hRb = new C21916hRb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("token_base", tokenBase);
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", latestMarketInfoBean);
            c21916hRb.setArguments(bundle);
            return c21916hRb;
        }
    }

    /* JADX INFO: renamed from: o.hRb$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C21916hRb AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C21916hRb c21916hRb) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c21916hRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.hRb$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C21916hRb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C21916hRb c21916hRb) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c21916hRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.hRb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C21916hRb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C21916hRb c21916hRb) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c21916hRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.hRb$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C21916hRb OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C21916hRb c21916hRb) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c21916hRb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.djBIcL();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hAP KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAP hapCopydefault = hAP.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hapCopydefault, "");
        return hapCopydefault;
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.iwGUEr = arguments != null ? (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class)) : null;
        android.os.Bundle arguments2 = getArguments();
        this.fJNWhG = arguments2 != null ? (LatestMarketInfoBean) ((android.os.Parcelable) BundleCompat.getParcelable(arguments2, "data", LatestMarketInfoBean.class)) : null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAP hap, android.os.Bundle bundle) {
        java.lang.String chainId;
        java.lang.String strRealTokenContractAddress;
        java.lang.String chainId2;
        java.lang.String strRealTokenContractAddress2;
        java.lang.String chainId3;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(hap, "");
        android.os.Bundle arguments = getArguments();
        this.iwGUEr = arguments != null ? (TokenBase) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class)) : null;
        valueOf();
        hap.AEQbTJ.setCurrentDataSource("");
        C21945hSd.KWHzl.valueOf();
        hap.AEQbTJ.djBIcL("light");
        oWN.KWHzl(C33570myu.djBIcL(requireContext()));
        hap.ejfBZ.EZpvd(true);
        hap.ejfBZ.setData();
        fJNWhG();
        hap.zLjUOn.setVisibility(C23272hvB.KWHzl.OLrzqt().getCurrencyId() == 0 ? 8 : 0);
        zLjUOn();
        LatestMarketInfoBean latestMarketInfoBean = this.fJNWhG;
        if (latestMarketInfoBean != null) {
            KWHzl(latestMarketInfoBean.getChange(), latestMarketInfoBean.getMarketCap());
            copydefault(latestMarketInfoBean.getMaxPrice(), latestMarketInfoBean.getMinPrice(), latestMarketInfoBean.getVolume());
            if (this.hDKMBd == null) {
                java.lang.String strAuCTel = AuCTel();
                java.lang.String tokenContractAddress = latestMarketInfoBean.getTokenContractAddress();
                TokenBase tokenBase = this.iwGUEr;
                if (tokenBase == null || (chainId3 = tokenBase.getChainId()) == null) {
                    chainId3 = "";
                }
                C23258huo c23258huo = new C23258huo(strAuCTel, tokenContractAddress, chainId3);
                this.hDKMBd = c23258huo;
                c23258huo.EZpvd(new Function1() { // from class: o.hRl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C21916hRb.AEQbTJ(this.copydefault, (MarketTxWsInfoItemBean) obj);
                    }
                });
                C23258huo c23258huo2 = this.hDKMBd;
                if (c23258huo2 != null) {
                    c23258huo2.OLrzqt(new Function1() { // from class: o.hRm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C21916hRb.OLrzqt(this.copydefault, (MarketTradeRealTimeBean) obj);
                        }
                    });
                }
            }
            C23258huo c23258huo3 = this.hDKMBd;
            if (c23258huo3 != null) {
                c23258huo3.KWHzl(true);
            }
            C23258huo c23258huo4 = this.hDKMBd;
            if (c23258huo4 != null) {
                c23258huo4.copydefault();
            }
        }
        if (hRZ.OLrzqt.KWHzl(hap.AEQbTJ.wlaJM().getSPTimeInterval()) != null) {
            ChartViewModel chartViewModelFetchVPNInfo = fetchVPNInfo();
            TokenBase tokenBase2 = this.iwGUEr;
            if (tokenBase2 == null || (chainId = tokenBase2.getChainId()) == null) {
                chainId = "";
            }
            LatestMarketInfoBean latestMarketInfoBean2 = this.fJNWhG;
            if (latestMarketInfoBean2 == null || (strRealTokenContractAddress = latestMarketInfoBean2.realTokenContractAddress()) == null) {
                strRealTokenContractAddress = "";
            }
            chartViewModelFetchVPNInfo.KWHzl(new C23245hub(chainId, strRealTokenContractAddress, new WeakReference(this.AkhnZx)));
            ChartViewModel chartViewModelFetchVPNInfo2 = fetchVPNInfo();
            TokenBase tokenBase3 = this.iwGUEr;
            if (tokenBase3 == null || (chainId2 = tokenBase3.getChainId()) == null) {
                chainId2 = "";
            }
            LatestMarketInfoBean latestMarketInfoBean3 = this.fJNWhG;
            if (latestMarketInfoBean3 != null && (strRealTokenContractAddress2 = latestMarketInfoBean3.realTokenContractAddress()) != null) {
                str = strRealTokenContractAddress2;
            }
            chartViewModelFetchVPNInfo2.EZpvd(new C23184htT(chainId2, str, new WeakReference(this.fetchVPNInfo)));
        }
    }

    public static final Unit AEQbTJ(C21916hRb c21916hRb, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        c21916hRb.KWHzl(marketTxWsInfoItemBean.AEQbTJ(), marketTxWsInfoItemBean.values());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C21916hRb c21916hRb, MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        c21916hRb.copydefault(marketTradeRealTimeBean.valueOf(), marketTradeRealTimeBean.AYXKKw(), marketTradeRealTimeBean.AuCTel());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        pGX pgx;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.hRv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21916hRb.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C21916hRb.OLrzqt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.djBIcL);
        hAP hap = (hAP) aX_();
        if (hap != null && (pgx = hap.ejfBZ) != null) {
            pgx.setOnItemSelectListener(new Function1() { // from class: o.hRA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21916hRb.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        fetchVPNInfo().OLrzqt().observe(this, new FragmentManager(new Function1() { // from class: o.hRk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21916hRb.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C21916hRb c21916hRb, java.lang.String str) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv3;
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap != null && (c36250oUv2 = hap.AEQbTJ) != null && (mapEjfBZ = c36250oUv2.ejfBZ()) != null) {
            hAP hap2 = (hAP) c21916hRb.aX_();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get((hap2 == null || (c36250oUv3 = hap2.AEQbTJ) == null) ? null : c36250oUv3.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        hAP hap3 = (hAP) c21916hRb.aX_();
        if (hap3 != null && (c36250oUv = hap3.AEQbTJ) != null) {
            c36250oUv.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C21916hRb c21916hRb, int i) {
        pGX pgx;
        c21916hRb.KWHzl(i);
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap != null && (pgx = hap.ejfBZ) != null) {
            pgx.setData();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C21916hRb c21916hRb, java.util.List list) {
        hAP hap;
        C36250oUv c36250oUv;
        hAP hap2;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        hAP hap3 = (hAP) c21916hRb.aX_();
        if (hap3 != null && (c36250oUv3 = hap3.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
        }
        if (C33129mqd.KWHzl((java.util.Collection) list) && (hap2 = (hAP) c21916hRb.aX_()) != null && (c36250oUv2 = hap2.AEQbTJ) != null) {
            c36250oUv2.KWHzl((java.util.List<? extends oUO>) list);
        }
        ChartViewModel chartViewModelFetchVPNInfo = c21916hRb.fetchVPNInfo();
        TokenBase tokenBase = c21916hRb.iwGUEr;
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String strAEQbTJ = chartViewModelFetchVPNInfo.AEQbTJ(chainId);
        TokenFilter tokenFilterCopydefault = c21916hRb.fIwbmz().copydefault();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tokenFilterCopydefault.OLrzqt());
        if (str != null) {
            strAEQbTJ = str;
        }
        java.lang.String strEZpvd = tokenFilterCopydefault.EZpvd();
        if (C33129mqd.KWHzl((java.util.Collection) list) && ((strAEQbTJ.length() > 0 || strEZpvd.length() > 0) && (hap = (hAP) c21916hRb.aX_()) != null && (c36250oUv = hap.AEQbTJ) != null)) {
            c36250oUv.OLrzqt(c21916hRb.DbNXlk, java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        hAP hap;
        LatestMarketInfoBean latestMarketInfoBean = this.fJNWhG;
        if (latestMarketInfoBean == null || (hap = (hAP) aX_()) == null) {
            return;
        }
        hap.AwvSrB.setText(latestMarketInfoBean.getTokenSymbol());
        C21983hTo.loadLargeImage$default(hap.OcIXYQ, latestMarketInfoBean.getTokenLogoUrl(), null, 2, null);
        C21983hTo.loadSmallImage$default(hap.OcIXYQ, latestMarketInfoBean.getChainBWLogoUrl(), null, 2, null);
        AppCompatTextView appCompatTextView = hap.AubY;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        appCompatTextView.setText(c32979mnm.OLrzqt().getString(C23274hvD.Fragment.ComponentActivityExternalSyntheticLambda1));
        hap.ORxRYg.setText(C33069mpW.KWHzl(c32979mnm.OLrzqt(), C23274hvD.Fragment.saveState, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", "USD"))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        hAP hap = (hAP) aX_();
        if (hap != null && (appCompatTextView2 = hap.sSMYrx) != null) {
            C25352ivB.setRiseDownPercentColorAndValue$default(appCompatTextView2, str, false, 0, 6, null);
        }
        hAP hap2 = (hAP) aX_();
        if (hap2 == null || (appCompatTextView = hap2.AuCTelauCTel) == null) {
            return;
        }
        appCompatTextView.setText(C21949hSh.EZpvd.EZpvd(str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hAP hap = (hAP) aX_();
        if (hap != null) {
            AppCompatTextView appCompatTextView = hap.wlaJM;
            C21949hSh c21949hSh = C21949hSh.EZpvd;
            appCompatTextView.setText(c21949hSh.OLrzqt(str));
            hap.gHZMYf.setText(c21949hSh.OLrzqt(str2));
            hap.DTwDnp.setText(c21949hSh.copydefault(str3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.isConnected.clear();
        this.DbNXlk.clear();
        ChartViewModel chartViewModelFetchVPNInfo = fetchVPNInfo();
        TokenBase tokenBase = this.iwGUEr;
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String strAEQbTJ = chartViewModelFetchVPNInfo.AEQbTJ(chainId);
        TokenFilter tokenFilterCopydefault = fIwbmz().copydefault();
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tokenFilterCopydefault.OLrzqt());
        if (str != null) {
            strAEQbTJ = str;
        }
        java.lang.String strEZpvd = tokenFilterCopydefault.EZpvd();
        if ((tokenFilterCopydefault.OLrzqt().size() < 2 && strAEQbTJ.length() > 0) || strEZpvd.length() > 0) {
            C23184htT c23184htTCopydefault = fetchVPNInfo().copydefault();
            if (c23184htTCopydefault != null) {
                c23184htTCopydefault.AEQbTJ(hRZ.OLrzqt.AEQbTJ(timeIntervalItem.timeInterval), strAEQbTJ, strEZpvd);
                return;
            }
            return;
        }
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv = hap.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(false);
        }
        C23184htT c23184htTCopydefault2 = fetchVPNInfo().copydefault();
        if (c23184htTCopydefault2 != null) {
            c23184htTCopydefault2.EZpvd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        LinkedHashMap<java.lang.String, ChartArea> areas;
        super.onVisible();
        hAP hap = (hAP) aX_();
        KWHzl(hap != null ? hap.AEQbTJ : null);
        hAP hap2 = (hAP) aX_();
        if (hap2 != null && (c36250oUv2 = hap2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
            hRZ hrz = hRZ.OLrzqt;
            hAP hap3 = (hAP) aX_();
            hrz.AEQbTJ(hap3 != null ? hap3.AEQbTJ : null);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        hAP hap4 = (hAP) aX_();
        this.fARcdN = C36312oXc.AEQbTJ(hap4 != null ? hap4.AEQbTJ : null);
        hAP hap5 = (hAP) aX_();
        if (hap5 != null && (c36250oUv = hap5.AEQbTJ) != null) {
            c36250oUv.setCurrentStateMachine(this.fARcdN);
        }
        iwGUEr();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onInvisible() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv4;
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv3 = hap.AEQbTJ) != null && (mapEjfBZ = c36250oUv3.ejfBZ()) != null) {
            hAP hap2 = (hAP) aX_();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get((hap2 == null || (c36250oUv4 = hap2.AEQbTJ) == null) ? null : c36250oUv4.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        hAP hap3 = (hAP) aX_();
        if (hap3 != null && (c36250oUv2 = hap3.AEQbTJ) != null) {
            c36250oUv2.QUSxYX();
        }
        hAP hap4 = (hAP) aX_();
        if (hap4 != null && (c36250oUv = hap4.AEQbTJ) != null) {
            c36250oUv.OLrzqt();
        }
        fetchVPNInfo().AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C36250oUv c36250oUv;
        super.onResume();
        hAP hap = (hAP) aX_();
        if (hap == null || (c36250oUv = hap.AEQbTJ) == null) {
            return;
        }
        c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.hRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.PendingIntent
            public final void AEQbTJ() {
                C21916hRb.uzCIH(this.AEQbTJ);
            }
        });
    }

    public static final void uzCIH(C21916hRb c21916hRb) {
        c21916hRb.getClass();
        java.lang.System.currentTimeMillis();
        c21916hRb.DbNXlk();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36246oUr.copydefault().AubY(false);
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv3 = hap.AEQbTJ) != null) {
            c36250oUv3.RcXXUw();
        }
        hAP hap2 = (hAP) aX_();
        if (hap2 != null && (c36250oUv2 = hap2.AEQbTJ) != null) {
            c36250oUv2.copydefault();
        }
        hAP hap3 = (hAP) aX_();
        if (hap3 != null && (c36250oUv = hap3.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
        C23245hub c23245hubAEQbTJ = fetchVPNInfo().AEQbTJ();
        if (c23245hubAEQbTJ != null) {
            c23245hubAEQbTJ.EZpvd();
        }
        fetchVPNInfo().KWHzl(null);
        C23184htT c23184htTCopydefault = fetchVPNInfo().copydefault();
        if (c23184htTCopydefault != null) {
            c23184htTCopydefault.EZpvd();
        }
        fetchVPNInfo().EZpvd((C23184htT) null);
        C23258huo c23258huo = this.hDKMBd;
        if (c23258huo != null) {
            c23258huo.OLrzqt();
        }
        C23258huo c23258huo2 = this.hDKMBd;
        if (c23258huo2 != null) {
            c23258huo2.KWHzl();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.djBIcL);
        fetchVPNInfo().AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        hAP hap = (hAP) aX_();
        if (hap == null || (c36250oUv = hap.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        hRZ hrz = hRZ.OLrzqt;
        TimeIntervalItem timeIntervalItemKWHzl = hrz.KWHzl(iIntValue);
        if (timeIntervalItemKWHzl != null) {
            KWHzl(true);
            C23245hub c23245hubAEQbTJ = fetchVPNInfo().AEQbTJ();
            if (c23245hubAEQbTJ != null) {
                java.lang.String strCopydefault = hrz.copydefault(timeIntervalItemKWHzl);
                hAP hap2 = (hAP) aX_();
                c23245hubAEQbTJ.KWHzl(strCopydefault, C33129mqd.gEmmrt((hap2 == null || (c36250oUv2 = hap2.AEQbTJ) == null) ? null : java.lang.Long.valueOf(c36250oUv2.fARcdN())));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        java.lang.String strRealTokenContractAddress;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        hAP hap = (hAP) aX_();
        if (hap == null || (c36250oUv = hap.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        hRZ hrz = hRZ.OLrzqt;
        TimeIntervalItem timeIntervalItemKWHzl = hrz.KWHzl(iIntValue);
        if (timeIntervalItemKWHzl != null) {
            hAP hap2 = (hAP) aX_();
            if (hap2 != null && (c36250oUv3 = hap2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(true);
            }
            TokenBase tokenBase = this.iwGUEr;
            if (tokenBase != null) {
                ChartViewModel chartViewModelFetchVPNInfo = fetchVPNInfo();
                java.lang.String chainId = tokenBase.getChainId();
                LatestMarketInfoBean latestMarketInfoBean = this.fJNWhG;
                if (latestMarketInfoBean == null || (strRealTokenContractAddress = latestMarketInfoBean.realTokenContractAddress()) == null) {
                    strRealTokenContractAddress = "";
                }
                java.lang.String str = strRealTokenContractAddress;
                hAP hap3 = (hAP) aX_();
                chartViewModelFetchVPNInfo.AEQbTJ("default_trade", new DexTokenCandleParam(chainId, str, C33129mqd.gEmmrt((hap3 == null || (c36250oUv2 = hap3.AEQbTJ) == null) ? null : java.lang.Long.valueOf(c36250oUv2.fARcdN())), null, hrz.copydefault(timeIntervalItemKWHzl), null, null, 104, null), this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C55113xdn c55113xdn4;
        if (z) {
            hAP hap = (hAP) aX_();
            if (hap != null && (c55113xdn4 = hap.QOLQEE) != null) {
                c55113xdn4.setVisibility(0);
            }
            hAP hap2 = (hAP) aX_();
            if (hap2 == null || (c55113xdn3 = hap2.QOLQEE) == null) {
                return;
            }
            c55113xdn3.playAnimation();
            return;
        }
        hAP hap3 = (hAP) aX_();
        if (hap3 != null && (c55113xdn2 = hap3.QOLQEE) != null) {
            c55113xdn2.setVisibility(8);
        }
        hAP hap4 = (hAP) aX_();
        if (hap4 == null || (c55113xdn = hap4.QOLQEE) == null) {
            return;
        }
        c55113xdn.cancelAnimation();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        C36250oUv c36250oUv;
        hAP hap = (hAP) aX_();
        if (hap == null || (c36250oUv = hap.AEQbTJ) == null) {
            return;
        }
        c36250oUv.setShowEmptyUi(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void valueOf() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        C21952hSk c21952hSk = C21952hSk.copydefault;
        chartViewOutSideConfig.setMShowHistoryOrder(c21952hSk.AYXKKw());
        chartViewOutSideConfig.setMShowCurrentOrder(c21952hSk.OLrzqt());
        chartViewOutSideConfig.setMShowCostLine(c21952hSk.EZpvd());
        chartViewOutSideConfig.setColumnChart(c21952hSk.AhwBna());
        chartViewOutSideConfig.setMShowPriceLine(c21952hSk.gEmmrt());
        chartViewOutSideConfig.setScreen(false);
        chartViewOutSideConfig.setHideTradeDrawingLine(false);
        chartViewOutSideConfig.setChartTag("kline_dex_market_time_preference");
        chartViewOutSideConfig.setMode("defi_mode_dex");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setKLineInfiniteScale(true);
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv2 = hap.AEQbTJ) != null) {
            c36250oUv2.OLrzqt(chartViewOutSideConfig);
        }
        hAP hap2 = (hAP) aX_();
        if (hap2 != null && (c36250oUv = hap2.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(false);
        }
        pFN pfn = pFN.OLrzqt;
        C21945hSd c21945hSd = C21945hSd.KWHzl;
        pfn.EZpvd(c21945hSd.OLrzqt(), c21945hSd);
        InterfaceC35976oKr klineSettingFragment$default = oKA.TaskDescription.getKlineSettingFragment$default((oKA) C43248rlh.KWHzl.AEQbTJ(oKA.class), "SPOT", true, false, false, false, false, false, false, false, false, false, false, false, false, KlineSettingType.CHART_LANDSCAPE, null, 47604, null);
        this.values = klineSettingFragment$default;
        if (klineSettingFragment$default != null) {
            hAP hap3 = (hAP) aX_();
            klineSettingFragment$default.OLrzqt(new C21953hSl(new WeakReference(hap3 != null ? hap3.AEQbTJ : null), ejfBZ(), this.ejfBZ, this.AuCTel));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull C36250oUv c36250oUv) {
        pGY pgy;
        java.lang.String tokenSymbol;
        java.lang.String tokenContractAddress;
        java.lang.String chainId;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        hRZ hrz = hRZ.OLrzqt;
        hAP hap = (hAP) aX_();
        pGY pgy2 = hap != null ? hap.fARcdN : null;
        TokenBase tokenBase = this.iwGUEr;
        java.lang.String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
        TokenBase tokenBase2 = this.iwGUEr;
        java.lang.String str2 = (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress;
        TokenBase tokenBase3 = this.iwGUEr;
        InterfaceC21944hSc.Activity.initChartView$default(hrz, c36250oUv, pgy2, str, str2, (tokenBase3 == null || (tokenSymbol = tokenBase3.getTokenSymbol()) == null) ? "" : tokenSymbol, false, 32, null);
        this.fARcdN = C36312oXc.AEQbTJ((C36250oUv) null);
        c36250oUv.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.hRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.TaskDescription
            public final void AEQbTJ() {
                C21916hRb.AuCTel(this.copydefault);
            }
        });
        getNewProxyInstance();
        hAP hap2 = (hAP) aX_();
        if (hap2 == null || (pgy = hap2.fARcdN) == null) {
            return;
        }
        pgy.setOnItemSelectListener(new Function1() { // from class: o.hRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21916hRb.KWHzl(this.EZpvd, (MarketTypeSelect) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AuCTel(C21916hRb c21916hRb) {
        pGR pgr;
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap == null || (pgr = hap.AkhnZx) == null) {
            return;
        }
        pgr.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C21916hRb c21916hRb, MarketTypeSelect marketTypeSelect) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap != null && (c36250oUv = hap.AEQbTJ) != null) {
            hRZ.OLrzqt.copydefault(c36250oUv, marketTypeSelect, c21916hRb.fIwbmz, new Function0() { // from class: o.hRt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21916hRb.fJNWhG(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C21916hRb c21916hRb) {
        c21916hRb.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C21976hTh c21976hTh;
        hAP hap = (hAP) aX_();
        if (hap == null || (c21976hTh = hap.getFieldNames) == null) {
            return;
        }
        c21976hTh.post(new java.lang.Runnable() { // from class: o.hRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21916hRb.getFieldNames(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getFieldNames(C21916hRb c21916hRb) {
        C21976hTh c21976hTh;
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap == null || (c21976hTh = hap.getFieldNames) == null) {
            return;
        }
        c21976hTh.fullScroll(130);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        C21976hTh c21976hTh;
        hAP hap = (hAP) aX_();
        if (hap == null || (c21976hTh = hap.getFieldNames) == null) {
            return;
        }
        c21976hTh.post(new java.lang.Runnable() { // from class: o.hRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C21916hRb.hDKMBd(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hDKMBd(C21916hRb c21916hRb) {
        C21976hTh c21976hTh;
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap == null || (c21976hTh = hap.getFieldNames) == null) {
            return;
        }
        c21976hTh.fullScroll(33);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        final hAP hap = (hAP) aX_();
        if (hap != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = hap.AEQbTJ.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                chartViewOutSideConfigAkhnZx.setScreenType(0);
            }
            C36250oUv c36250oUv = hap.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c36250oUv, "");
            OLrzqt(c36250oUv);
            hap.DbNXlk.setPanelClickListener(new StateListAnimator(hap, this));
            hap.AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.hRh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C21916hRb.EZpvd(hap, this, view);
                }
            });
            hap.ejfBZ.setOnItemSelectListener(new Function1() { // from class: o.hRq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21916hRb.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
            hap.AkhnZx.setShowShareIcon(false);
            hap.getNewProxyInstance.setOnClickListener(new View.OnClickListener() { // from class: o.hRx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C21916hRb.OLrzqt(hap, this, view);
                }
            });
            hap.AkhnZx.setOnItemClickTypeListener(new Function1() { // from class: o.hRw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21916hRb.EZpvd(this.copydefault, hap, ((java.lang.Integer) obj).intValue());
                }
            });
            hap.AkhnZx.setOnLineHideListener(new Function1() { // from class: o.hRz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C21916hRb.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            hap.uzCIH.setOnClickListener(new View.OnClickListener() { // from class: o.hRy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C21916hRb.AEQbTJ(this.KWHzl, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.hRb$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC21980hTl {
        public final /* synthetic */ hAP AEQbTJ;
        public final /* synthetic */ C21916hRb KWHzl;

        public StateListAnimator(hAP hap, C21916hRb c21916hRb) {
            this.AEQbTJ = hap;
            this.KWHzl = c21916hRb;
        }

        @Override // o.InterfaceC21980hTl
        public void copydefault(int i) {
            C36250oUv c36250oUv;
            if (i == 0) {
                oWO owo = C36312oXc.AEQbTJ(this.AEQbTJ.AEQbTJ).AubY;
                Intrinsics.copydefault(owo, "");
                ((C36311oXb) owo).djBIcL();
            }
            hAP hapGEmmrt = C21916hRb.gEmmrt(this.KWHzl);
            if (hapGEmmrt == null || (c36250oUv = hapGEmmrt.AEQbTJ) == null) {
                return;
            }
            c36250oUv.copydefault();
        }
    }

    public static final void EZpvd(hAP hap, C21916hRb c21916hRb, android.view.View view) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = hap.AEQbTJ.AkhnZx();
        if (chartViewOutSideConfigAkhnZx != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        C36312oXc c36312oXc = c21916hRb.fARcdN;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(false);
        }
        RxBus.KWHzl("kline_portrait_screen");
    }

    public static final Unit AEQbTJ(C21916hRb c21916hRb, int i) {
        c21916hRb.KWHzl(i);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(hAP hap, C21916hRb c21916hRb, android.view.View view) {
        android.view.View viewKWHzl;
        hap.AkhnZx.setVisibility(0);
        InterfaceC35967oKi interfaceC35967oKiEZpvd = hap.AkhnZx.EZpvd();
        if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
            viewKWHzl.setVisibility(0);
        }
        hap.fJNWhG.setVisibility(8);
        c21916hRb.OLrzqt(true);
        hap.getFieldNames.setScrollingEnabled(false);
        c21916hRb.uzCIH();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r11v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C21916hRb c21916hRb, hAP hap, int i) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, oWN> timelines;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        LinkedHashMap<java.lang.String, ChartArea> areas;
        ChartArea chartArea;
        C36250oUv c36250oUv5;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        java.util.HashMap<java.lang.String, oWN> timelines2;
        android.view.View viewKWHzl;
        int iDjBIcL = 0;
        switch (i) {
            case 1001:
            case 1002:
                DrawLineData drawLineData = DrawLineData.copydefault;
                if (drawLineData.valueOf() == DrawLineData.LineType.PRICE_LINE || drawLineData.valueOf() == DrawLineData.LineType.FIBONACCI) {
                    hAP hap2 = (hAP) c21916hRb.aX_();
                    oWN own = (hap2 == null || (c36250oUv2 = hap2.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) == null || (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) == null) ? null : timelines.get("ds0");
                    if (own != null) {
                        own.AwvSrB();
                    }
                    drawLineData.EZpvd((DrawLineData.LineType) null);
                    hAP hap3 = (hAP) c21916hRb.aX_();
                    if (hap3 != null && (c36250oUv = hap3.AEQbTJ) != null) {
                        c36250oUv.invalidate();
                    }
                }
                break;
            case 1003:
            case 1004:
            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                hAP hap4 = (hAP) c21916hRb.aX_();
                oWN own2 = (hap4 == null || (c36250oUv5 = hap4.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx3 = c36250oUv5.AkhnZx()) == null || (timelines2 = chartViewOutSideConfigAkhnZx3.getTimelines()) == null) ? null : timelines2.get("ds0");
                if (own2 != null) {
                    hAP hap5 = (hAP) c21916hRb.aX_();
                    C36250oUv c36250oUv6 = hap5 != null ? hap5.AEQbTJ : null;
                    Intrinsics.copydefault(c36250oUv6);
                    int measuredWidth = c36250oUv6.getMeasuredWidth() / 2;
                    hAP hap6 = (hAP) c21916hRb.aX_();
                    if (hap6 != null && (c36250oUv4 = hap6.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv4.AkhnZx()) != null && (areas = chartViewOutSideConfigAkhnZx2.getAreas()) != null && (chartArea = areas.get("ds0.m")) != null) {
                        iDjBIcL = chartArea.djBIcL();
                    }
                    own2.KWHzl(measuredWidth, iDjBIcL / 2);
                }
                hAP hap7 = (hAP) c21916hRb.aX_();
                if (hap7 != null && (c36250oUv3 = hap7.AEQbTJ) != null) {
                    c36250oUv3.invalidate();
                }
                c21916hRb.OLrzqt(true);
                break;
            case 1006:
                c21916hRb.values();
                break;
            case 1007:
                TokenBase tokenBase = c21916hRb.iwGUEr;
                if (tokenBase != null && c21916hRb.getActivity() != null) {
                    LifecycleOwner viewLifecycleOwner = c21916hRb.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MarketLandscapeFragment$initLandView$1$5$1$1$1(tokenBase, c21916hRb, null), 3, null);
                }
                break;
            case 1008:
                hap.AkhnZx.setVisibility(8);
                InterfaceC35967oKi interfaceC35967oKiEZpvd = hap.AkhnZx.EZpvd();
                if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
                    viewKWHzl.setVisibility(8);
                }
                hap.fJNWhG.setVisibility(0);
                C36312oXc c36312oXc = c21916hRb.fARcdN;
                if (c36312oXc != null) {
                    c36312oXc.AEQbTJ(false);
                }
                hap.getFieldNames.setScrollingEnabled(true);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C21916hRb c21916hRb, boolean z) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (z) {
            hAP hap = (hAP) c21916hRb.aX_();
            if (hap != null && (c36250oUv4 = hap.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv4.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMHideKlineDrawingData(true);
            }
            C36312oXc c36312oXc = c21916hRb.fARcdN;
            if (c36312oXc != null) {
                c36312oXc.AEQbTJ(true);
            }
            hAP hap2 = (hAP) c21916hRb.aX_();
            if (hap2 != null && (c36250oUv3 = hap2.AEQbTJ) != null) {
                c36250oUv3.invalidate();
            }
        } else {
            hAP hap3 = (hAP) c21916hRb.aX_();
            if (hap3 != null && (c36250oUv2 = hap3.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(false);
            }
            hAP hap4 = (hAP) c21916hRb.aX_();
            if (hap4 != null && (c36250oUv = hap4.AEQbTJ) != null) {
                c36250oUv.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C21916hRb c21916hRb, android.view.View view) {
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap != null) {
            java.lang.Object obj = c21916hRb.values;
            Intrinsics.copydefault(obj, "");
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
            if (fragment != null) {
                c21916hRb.AEQbTJ(fragment);
            }
            hap.EZpvd.openDrawer(8388613);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(boolean z) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv = hap.AEQbTJ) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(z);
        }
        C36312oXc c36312oXc = this.fARcdN;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(int i) {
        android.widget.ImageView imageView;
        hAP hap = (hAP) aX_();
        if (hap == null || (imageView = hap.djBIcL) == null) {
            return;
        }
        imageView.setImageResource(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        android.widget.ImageView imageView;
        InterfaceC39560pue interfaceC39560pue = this.AhwBna;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setLineLocked(!drawLineItemIsConnected.getLocked());
            hAP hap = (hAP) aX_();
            if (hap == null || (imageView = hap.djBIcL) == null) {
                return;
            }
            imageView.setImageResource(drawLineItemIsConnected.getLocked() ? C52761wXj.TaskDescription.unregister : C52761wXj.TaskDescription.UUsvzU);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        pGR pgr;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, oWN> timelines;
        C36250oUv c36250oUv2;
        java.lang.String coinId;
        java.lang.Integer type;
        DrawLineData drawLineData = DrawLineData.copydefault;
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setDelete(true);
            oUJ ouj = oUJ.KWHzl;
            DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
            if (drawLineBeanAEQbTJ == null || (coinId = drawLineBeanAEQbTJ.getCoinId()) == null) {
                coinId = "";
            }
            drawLineItemIsConnected.setContract(coinId);
            DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
            drawLineItemIsConnected.setKlineType((drawLineBeanAEQbTJ2 == null || (type = drawLineBeanAEQbTJ2.getType()) == null) ? 0 : type.intValue());
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListEZpvd = drawLineData.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEZpvd) {
                if (!((DrawLineData.DrawLineItem) obj).equals(drawLineItemIsConnected)) {
                    arrayList.add(obj);
                }
            }
            DrawLineData drawLineData2 = DrawLineData.copydefault;
            drawLineData2.EZpvd().clear();
            drawLineData2.EZpvd().addAll(arrayList);
            drawLineData2.EZpvd((java.util.List<DrawLineData.DrawLineItem>) arrayList);
        }
        hAP hap = (hAP) aX_();
        if (hap != null && (c36250oUv2 = hap.AEQbTJ) != null) {
            c36250oUv2.invalidate();
        }
        OLrzqt(true);
        DrawLineData drawLineData3 = DrawLineData.copydefault;
        drawLineData3.KWHzl((DrawLineData.DrawLineItem) null);
        hAP hap2 = (hAP) aX_();
        oWN own = (hap2 == null || (c36250oUv = hap2.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) == null) ? null : timelines.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        drawLineData3.EZpvd((DrawLineData.LineType) null);
        hAP hap3 = (hAP) aX_();
        if (hap3 != null && (pgr = hap3.AkhnZx) != null) {
            pgr.KWHzl();
        }
        InterfaceC39560pue interfaceC39560pue = this.AhwBna;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(InterfaceC39560pue interfaceC39560pue) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        this.AhwBna = interfaceC39560pue;
        hAP hap = (hAP) aX_();
        if (hap != null && (imageView2 = hap.djBIcL) != null) {
            imageView2.setOnClickListener(new Dialog(imageView2, 1000L, this));
        }
        hAP hap2 = (hAP) aX_();
        if (hap2 == null || (imageView = hap2.AhwBna) == null) {
            return;
        }
        imageView.setOnClickListener(new VoiceInteractor(imageView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        android.widget.LinearLayout linearLayout;
        hAP hap = (hAP) aX_();
        if (hap == null || (linearLayout = hap.fetchVPNInfo) == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        android.widget.LinearLayout linearLayout;
        hAP hap = (hAP) aX_();
        if (hap != null && (linearLayout = hap.fetchVPNInfo) != null) {
            linearLayout.setVisibility(8);
        }
        getFieldNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        hAP hap;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        hAP hap2 = (hAP) aX_();
        if (hap2 != null && (imageView4 = hap2.djBIcL) != null) {
            imageView4.setClickable(true);
        }
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null && (hap = (hAP) aX_()) != null && (imageView3 = hap.djBIcL) != null) {
            imageView3.setImageResource(drawLineItemIsConnected.getLocked() ? C52761wXj.TaskDescription.unregister : C52761wXj.TaskDescription.UUsvzU);
        }
        hAP hap3 = (hAP) aX_();
        if (hap3 != null && (imageView2 = hap3.AhwBna) != null) {
            imageView2.setClickable(true);
        }
        hAP hap4 = (hAP) aX_();
        if (hap4 == null || (imageView = hap4.AhwBna) == null) {
            return;
        }
        imageView.setImageResource(C52761wXj.TaskDescription.hNurIN);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v15, resolved type: o.oKm */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(int i) {
        java.lang.String tokenContractAddress;
        java.lang.String chainId;
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        hAP hap = (hAP) aX_();
        if (hap != null) {
            if (i == 10) {
                hAP hap2 = (hAP) aX_();
                InterfaceC35971oKm interfaceC35971oKmEZpvd = ((oKA) C43248rlh.KWHzl.AEQbTJ(oKA.class)).EZpvd((hap2 == null || (c36250oUv = hap2.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 60 : templateSettingWlaJM.getSPTimeInterval());
                Intrinsics.copydefault(interfaceC35971oKmEZpvd, "");
                AEQbTJ((androidx.fragment.app.Fragment) interfaceC35971oKmEZpvd);
                hap.EZpvd.openDrawer(8388613);
                interfaceC35971oKmEZpvd.OLrzqt(new Activity(hap));
                return;
            }
            C36250oUv c36250oUv2 = hap.AEQbTJ;
            hRZ hrz = hRZ.OLrzqt;
            Intrinsics.copydefault(c36250oUv2);
            TimeIntervalItem timeIntervalItem = C21945hSd.KWHzl.AEQbTJ().get(i);
            Intrinsics.checkNotNullExpressionValue(timeIntervalItem, "");
            TimeIntervalItem timeIntervalItem2 = timeIntervalItem;
            C36312oXc c36312oXc = this.fARcdN;
            hAP hap3 = (hAP) aX_();
            pGX pgx = hap3 != null ? hap3.ejfBZ : null;
            TokenBase tokenBase = this.iwGUEr;
            java.lang.String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
            TokenBase tokenBase2 = this.iwGUEr;
            hrz.EZpvd(c36250oUv2, timeIntervalItem2, c36312oXc, pgx, str, (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress, new Function0() { // from class: o.hRj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21916hRb.fIwbmz(this.KWHzl);
                }
            }, new Function0() { // from class: o.hRg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C21916hRb.fARcdN(this.EZpvd);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.hRb$Activity */
    public static final class Activity implements oKC {
        public final /* synthetic */ hAP AEQbTJ;

        public Activity(hAP hap) {
            this.AEQbTJ = hap;
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            C36250oUv c36250oUv;
            java.lang.String tokenContractAddress;
            java.lang.String chainId;
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            hAP hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt != null && (c36250oUv = hapGEmmrt.AEQbTJ) != null) {
                final C21916hRb c21916hRb = C21916hRb.this;
                hRZ hrz = hRZ.OLrzqt;
                java.lang.Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                TimeIntervalItem timeIntervalItem = (TimeIntervalItem) data;
                C36312oXc c36312oXc = c21916hRb.fARcdN;
                hAP hapGEmmrt2 = C21916hRb.gEmmrt(c21916hRb);
                pGX pgx = hapGEmmrt2 != null ? hapGEmmrt2.ejfBZ : null;
                TokenBase tokenBase = c21916hRb.iwGUEr;
                java.lang.String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
                TokenBase tokenBase2 = c21916hRb.iwGUEr;
                hrz.EZpvd(c36250oUv, timeIntervalItem, c36312oXc, pgx, str, (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress, new Function0() { // from class: o.hRE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21916hRb.Activity.EZpvd(c21916hRb);
                    }
                }, new Function0() { // from class: o.hRC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21916hRb.Activity.AEQbTJ(c21916hRb);
                    }
                });
            }
            this.AEQbTJ.EZpvd.closeDrawer(8388613);
        }

        public static final Unit EZpvd(C21916hRb c21916hRb) {
            c21916hRb.fARcdN();
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C21916hRb c21916hRb) {
            c21916hRb.iwGUEr();
            return Unit.INSTANCE;
        }
    }

    public static final Unit fARcdN(C21916hRb c21916hRb) {
        c21916hRb.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C21916hRb c21916hRb) {
        c21916hRb.fARcdN();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        android.view.View viewKWHzl;
        hAP hap = (hAP) aX_();
        if (hap != null) {
            if (hap.AkhnZx.getVisibility() == 0) {
                hap.AkhnZx.setVisibility(8);
                InterfaceC35967oKi interfaceC35967oKiEZpvd = hap.AkhnZx.EZpvd();
                if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
                    viewKWHzl.setVisibility(8);
                }
                hap.fJNWhG.setVisibility(0);
                OLrzqt(false);
                hap.AkhnZx.KWHzl();
                hap.getFieldNames.setScrollingEnabled(true);
                android.widget.ImageView imageView = hap.djBIcL;
                imageView.setOnClickListener(new Application(imageView, 1000L, this));
            }
            android.widget.ImageView imageView2 = hap.AhwBna;
            imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, this));
        }
    }

    private final void values() {
        if (getContext() == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd("It will clear all tools including hidden items,sure?");
        java.lang.String string = getString(C32113mPz.LoaderManager.valueOf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.OLrzqt(string, new View.OnClickListener() { // from class: o.hRn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C21916hRb.KWHzl(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = getString(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C21916hRb c21916hRb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        pGR pgr;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        java.util.HashMap<java.lang.String, oWN> timelines;
        C36250oUv c36250oUv2;
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd().clear();
        drawLineData.EZpvd((java.util.List<DrawLineData.DrawLineItem>) null);
        hAP hap = (hAP) c21916hRb.aX_();
        if (hap != null && (c36250oUv2 = hap.AEQbTJ) != null) {
            c36250oUv2.invalidate();
        }
        c21916hRb.OLrzqt(true);
        viewOnClickListenerC54939xaY.dismiss();
        hAP hap2 = (hAP) c21916hRb.aX_();
        oWN own = (hap2 == null || (c36250oUv = hap2.AEQbTJ) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) == null) ? null : timelines.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        drawLineData.EZpvd((DrawLineData.LineType) null);
        hAP hap3 = (hAP) c21916hRb.aX_();
        if (hap3 == null || (pgr = hap3.AkhnZx) == null) {
            return;
        }
        pgr.KWHzl();
    }

    private final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        getChildFragmentManager().beginTransaction().replace(C23274hvD.Application.sElUiK, fragment).commit();
    }

    /* JADX INFO: renamed from: o.hRb$PendingIntent */
    public static final class PendingIntent implements ViewTreeObserver.OnGlobalLayoutListener {
        public PendingIntent() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM;
            java.util.ArrayList<java.lang.String> sideIndicatorNames;
            C21976hTh c21976hTh;
            android.view.ViewTreeObserver viewTreeObserver;
            C21976hTh c21976hTh2;
            C21976hTh c21976hTh3;
            C21976hTh c21976hTh4;
            android.view.ViewTreeObserver viewTreeObserver2;
            if (C21916hRb.this.getContext() == null) {
                hAP hapGEmmrt = C21916hRb.gEmmrt(C21916hRb.this);
                if (hapGEmmrt == null || (c21976hTh4 = hapGEmmrt.getFieldNames) == null || (viewTreeObserver2 = c21976hTh4.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
                return;
            }
            C33566myq c33566myq = C33566myq.EZpvd;
            android.content.Context context = C21916hRb.this.getContext();
            Intrinsics.copydefault(context);
            int iOLrzqt = c33566myq.OLrzqt(context);
            android.content.Context context2 = C21916hRb.this.getContext();
            Intrinsics.copydefault(context2);
            int iEZpvd = c33566myq.EZpvd(context2);
            hAP hapGEmmrt2 = C21916hRb.gEmmrt(C21916hRb.this);
            java.lang.Integer numValueOf = null;
            java.lang.Integer numValueOf2 = (hapGEmmrt2 == null || (c21976hTh3 = hapGEmmrt2.getFieldNames) == null) ? null : java.lang.Integer.valueOf(c21976hTh3.getMeasuredHeight());
            hAP hapGEmmrt3 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt3 != null && (c21976hTh2 = hapGEmmrt3.getFieldNames) != null) {
                numValueOf = java.lang.Integer.valueOf(c21976hTh2.getMeasuredWidth());
            }
            int size = 0;
            if (iOLrzqt > iEZpvd) {
                C21916hRb.this.fIwbmz = C33129mqd.AhwBna(java.lang.Double.valueOf(((double) iEZpvd) * 0.75d));
            } else {
                C21916hRb.this.fIwbmz = numValueOf2 != null ? numValueOf2.intValue() : 0;
            }
            Objects.toString(numValueOf2);
            Objects.toString(numValueOf);
            hAP hapGEmmrt4 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt4 != null && (c21976hTh = hapGEmmrt4.getFieldNames) != null && (viewTreeObserver = c21976hTh.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            hAP hapGEmmrt5 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt5 != null && (c36250oUv2 = hapGEmmrt5.AEQbTJ) != null && (templateSettingWlaJM = c36250oUv2.wlaJM()) != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null) {
                size = sideIndicatorNames.size();
            }
            int iAKErDB = size > 1 ? C21916hRb.this.fIwbmz + (C36246oUr.copydefault().aKErDB() * (size - 1)) : C21916hRb.this.fIwbmz;
            hAP hapGEmmrt6 = C21916hRb.gEmmrt(C21916hRb.this);
            if (hapGEmmrt6 == null || (c36250oUv = hapGEmmrt6.AEQbTJ) == null) {
                return;
            }
            c36250oUv.setMinimumHeight(iAKErDB);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        C21976hTh c21976hTh;
        android.view.ViewTreeObserver viewTreeObserver;
        hAP hap = (hAP) aX_();
        if (hap == null || (c21976hTh = hap.getFieldNames) == null || (viewTreeObserver = c21976hTh.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new PendingIntent());
    }

    public void KWHzl(C36250oUv c36250oUv) {
        java.lang.String chainId;
        java.lang.String tokenContractAddress;
        hRZ hrz = hRZ.OLrzqt;
        C36312oXc c36312oXc = this.fARcdN;
        TokenBase tokenBase = this.iwGUEr;
        java.lang.String str = "";
        if (tokenBase == null || (chainId = tokenBase.getChainId()) == null) {
            chainId = "";
        }
        TokenBase tokenBase2 = this.iwGUEr;
        if (tokenBase2 != null && (tokenContractAddress = tokenBase2.getTokenContractAddress()) != null) {
            str = tokenContractAddress;
        }
        hrz.OLrzqt(c36250oUv, c36312oXc, chainId, str);
    }

    private final void AubY() {
        C32866mlf.onEvent$default("DEXMarket_Token_KlineBuy/sell_Click", (TrackChannel[]) null, new Function1() { // from class: o.hRr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21916hRb.EZpvd(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C21916hRb c21916hRb, EventParamsList eventParamsList) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String tabName = c21916hRb.fIwbmz().AEQbTJ().getValue().getTabName();
        TokenFilter tokenFilterCopydefault = c21916hRb.fIwbmz().copydefault();
        TokenBase tokenBase = c21916hRb.iwGUEr;
        java.lang.String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        EventParamsList.put$default(eventParamsList, "token_chain", chainId == null ? "" : chainId, false, 4, null);
        TokenBase tokenBase2 = c21916hRb.iwGUEr;
        java.lang.String tokenContractAddress = tokenBase2 != null ? tokenBase2.getTokenContractAddress() : null;
        EventParamsList.put$default(eventParamsList, "token_address", tokenContractAddress == null ? "" : tokenContractAddress, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", tabName, false, 4, null);
        java.lang.String lowerCase = tokenFilterCopydefault.EZpvd().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (lowerCase.length() == 0) {
            lowerCase = "all";
        }
        EventParamsList.put$default(eventParamsList, "holder_label_tab", lowerCase, false, 4, null);
        hRZ hrz = hRZ.OLrzqt;
        hAP hap = (hAP) c21916hRb.aX_();
        EventParamsList.put$default(eventParamsList, "kline_time", hrz.AEQbTJ((hap == null || (c36250oUv = hap.AEQbTJ) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 0 : templateSettingWlaJM.getSPTimeInterval()), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C36250oUv.ActionBar
    public void copydefault(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            AubY();
        }
    }
}
