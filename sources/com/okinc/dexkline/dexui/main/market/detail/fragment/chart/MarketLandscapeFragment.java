package com.okinc.dexkline.dexui.main.market.detail.fragment.chart;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.core.os.BundleCompat;
import androidx.core.view.PointerIconCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean;
import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.dexkline.market.features.chart.ui.ChartDataViewModel;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.kline.api.bean.KlineSettingType;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.TimeIntervalItem;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.view.model.MarketTypeSelect;
import com.okinc.rxutils.RxBus;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.ActivityC38834pgs;
import o.C32144mRc;
import o.C32158mRq;
import o.C32167mRz;
import o.C32239mUq;
import o.C32267mVr;
import o.C32866mlf;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33129mqd;
import o.C33566myq;
import o.C33570myu;
import o.C34656ngH;
import o.C35964oKf;
import o.C36246oUr;
import o.C36250oUv;
import o.C36311oXb;
import o.C36312oXc;
import o.C37897pEt;
import o.C38768pff;
import o.C39805pzK;
import o.C43248rlh;
import o.C55113xdn;
import o.C55173xeu;
import o.C55489xks;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56524yIo;
import o.C58156yvv;
import o.InterfaceC32154mRm;
import o.InterfaceC32157mRp;
import o.InterfaceC32245mUw;
import o.InterfaceC35967oKi;
import o.InterfaceC35971oKm;
import o.InterfaceC35976oKr;
import o.InterfaceC35980oKv;
import o.InterfaceC35982oKx;
import o.InterfaceC39499ptW;
import o.InterfaceC39560pue;
import o.InterfaceC46557tYt;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.ViewOnClickListenerC39742pyA;
import o.mQW;
import o.mRJ;
import o.mSD;
import o.mTH;
import o.mTI;
import o.mTL;
import o.mTR;
import o.mTS;
import o.mTU;
import o.mUO;
import o.oKA;
import o.oKC;
import o.oNV;
import o.oUJ;
import o.oUO;
import o.oWN;
import o.oWO;
import o.pES;
import o.pFN;
import o.pGR;
import o.pGX;
import o.pGY;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketLandscapeFragment extends mSD<oNV> implements C36250oUv.ActionBar {
    public LatestMarketInfoBean AuCTel;
    public TokenBase AubY;
    public final ActionBar DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public InterfaceC35976oKr ejfBZ;
    public final Map<String, HistoryOrderData> fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public final List<HistoryOrderData> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public C36312oXc getNewProxyInstance;
    public final InterfaceC56387yDm hDKMBd;
    public final Dialog isConnected;
    public int iwGUEr;

    @yCM
    public InterfaceC46557tYt upDownTimeZoneService;
    public C32158mRq uzCIH;
    public InterfaceC39499ptW valueOf;
    public InterfaceC39560pue values;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final Object AkhnZx = new Object();
    public final InterfaceC56387yDm AuCTelauCTel = C34656ngH.EZpvd(this);

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    @Override // o.C36250oUv.ActionBar
    public void EZpvd(String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oNV valueOf(MarketLandscapeFragment marketLandscapeFragment) {
        return (oNV) marketLandscapeFragment.KWHzl();
    }

    public MarketLandscapeFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$3
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
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$6
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
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment$special$$inlined$activityViewModels$default$9
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
        this.fetchVPNInfo = new ArrayList();
        this.fARcdN = new LinkedHashMap();
        this.isConnected = new Dialog();
        this.DbNXlk = new ActionBar();
    }

    private final String hDKMBd() {
        return (String) this.AuCTelauCTel.getValue();
    }

    private final ChartViewModel fARcdN() {
        return (ChartViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataViewModel AuCTel() {
        return (ChartDataViewModel) this.djBIcL.getValue();
    }

    private final SharedFilterViewModel iwGUEr() {
        return (SharedFilterViewModel) this.getFieldNames.getValue();
    }

    private final MarketCoinDetailViewModel uzCIH() {
        return (MarketCoinDetailViewModel) this.hDKMBd.getValue();
    }

    public final InterfaceC46557tYt gEmmrt() {
        InterfaceC46557tYt interfaceC46557tYt = this.upDownTimeZoneService;
        if (interfaceC46557tYt != null) {
            return interfaceC46557tYt;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Dialog implements InterfaceC32157mRp {
        public Dialog() {
        }

        @Override // o.InterfaceC32157mRp
        public void OLrzqt(List<? extends oUO> list, String str) {
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            oNV onvValueOf;
            C36250oUv c36250oUv3;
            TemplateSetting templateSettingWlaJM;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            List<oUO> listCopydefault = MarketLandscapeFragment.this.AuCTel().copydefault(list);
            if (Intrinsics.EZpvd((Object) str, (Object) "http") && (onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this)) != null && (c36250oUv3 = onvValueOf.EZpvd) != null && (templateSettingWlaJM = c36250oUv3.wlaJM()) != null) {
                int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
                MarketLandscapeFragment marketLandscapeFragment = MarketLandscapeFragment.this;
                TimeIntervalItem timeIntervalItemCopydefault = mTL.KWHzl.copydefault(Integer.valueOf(sPTimeInterval).intValue());
                if (timeIntervalItemCopydefault != null) {
                    marketLandscapeFragment.EZpvd(timeIntervalItemCopydefault);
                }
            }
            oNV onvValueOf2 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf2 != null && (c36250oUv2 = onvValueOf2.EZpvd) != null) {
                c36250oUv2.AEQbTJ(listCopydefault);
            }
            oNV onvValueOf3 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf3 != null && (c36250oUv = onvValueOf3.EZpvd) != null) {
                c36250oUv.invalidate();
            }
            boolean z = false;
            MarketLandscapeFragment.this.AEQbTJ(false);
            oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(list);
            if (ouo != null) {
                MarketLandscapeFragment marketLandscapeFragment2 = MarketLandscapeFragment.this;
                oNV onvValueOf4 = MarketLandscapeFragment.valueOf(marketLandscapeFragment2);
                if (onvValueOf4 != null && (appCompatTextView2 = onvValueOf4.AxsJAY) != null) {
                    appCompatTextView2.setText(mTU.OLrzqt.AEQbTJ(String.valueOf(ouo.KWHzl)));
                }
                oNV onvValueOf5 = MarketLandscapeFragment.valueOf(marketLandscapeFragment2);
                if (onvValueOf5 != null && (appCompatTextView = onvValueOf5.getFieldNames) != null) {
                    appCompatTextView.setText(mTU.getTokenPrice$default(mTU.OLrzqt, String.valueOf(ouo.KWHzl), false, 2, null));
                }
            }
            if (Intrinsics.EZpvd((Object) str, (Object) "http") && list.isEmpty()) {
                z = true;
            }
            MarketLandscapeFragment.this.copydefault(z);
            if (Intrinsics.EZpvd((Object) str, (Object) "http")) {
                rVN.reportFullyDrawn$default(MarketLandscapeFragment.this, !z, (String) null, 2, (Object) null);
            }
        }

        @Override // o.InterfaceC32157mRp
        public void EZpvd(String str, String str2) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            MarketLandscapeFragment.this.AEQbTJ(false);
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf != null && (c36250oUv2 = onvValueOf.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
            }
            oNV onvValueOf2 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf2 == null || (c36250oUv = onvValueOf2.EZpvd) == null) {
                return;
            }
            c36250oUv.invalidate();
        }

        @Override // o.InterfaceC32157mRp
        public void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((Object) str, (Object) "51001")) {
                MarketLandscapeFragment.this.copydefault(true);
            } else {
                MarketLandscapeFragment.this.OLrzqt(true);
            }
        }
    }

    public static final class ActionBar implements InterfaceC32154mRm {
        public ActionBar() {
        }

        @Override // o.InterfaceC32154mRm
        public void AEQbTJ(List<MarketBuySellKLinePoint> list) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(list, "");
            MarketLandscapeFragment.this.fetchVPNInfo.clear();
            MarketLandscapeFragment.this.fetchVPNInfo.addAll(C32267mVr.EZpvd(list));
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf != null && (c36250oUv2 = onvValueOf.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(true);
            }
            oNV onvValueOf2 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf2 == null || (c36250oUv = onvValueOf2.EZpvd) == null) {
                return;
            }
            c36250oUv.OLrzqt(C32267mVr.EZpvd(list), Boolean.TRUE);
        }

        @Override // o.InterfaceC32154mRm
        public void KWHzl(MarketBuySellKLinePoint marketBuySellKLinePoint) {
            C36250oUv c36250oUv;
            Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
            MarketLandscapeFragment.this.fARcdN.put(marketBuySellKLinePoint.djBIcL(), C32267mVr.copydefault(marketBuySellKLinePoint));
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf == null || (c36250oUv = onvValueOf.EZpvd) == null) {
                return;
            }
            MarketLandscapeFragment marketLandscapeFragment = MarketLandscapeFragment.this;
            String strGEmmrt = C33129mqd.gEmmrt(Long.valueOf(c36250oUv.getFieldNames()));
            if (marketLandscapeFragment.fARcdN.containsKey(strGEmmrt)) {
                c36250oUv.OLrzqt(C56402yEa.EZpvd(marketLandscapeFragment.fARcdN.get(strGEmmrt)), Boolean.FALSE);
                marketLandscapeFragment.fARcdN.remove(strGEmmrt);
            }
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.MarketLandscapeFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MarketLandscapeFragment AEQbTJ(TokenBase tokenBase, @NotNull String str, LatestMarketInfoBean latestMarketInfoBean) {
            Intrinsics.checkNotNullParameter(str, "");
            MarketLandscapeFragment marketLandscapeFragment = new MarketLandscapeFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("token_base", tokenBase);
            C34656ngH.AEQbTJ(bundle, str);
            bundle.putParcelable("data", latestMarketInfoBean);
            marketLandscapeFragment.setArguments(bundle);
            return marketLandscapeFragment;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mSD, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        InterfaceC39499ptW interfaceC39499ptW = null;
        if (!(getActivity() instanceof ActivityC38834pgs)) {
            if (context instanceof InterfaceC39499ptW) {
                interfaceC39499ptW = (InterfaceC39499ptW) context;
            }
        } else {
            if (this instanceof InterfaceC39499ptW) {
                obj = this;
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                while (parentFragment != null && !(parentFragment instanceof InterfaceC39499ptW)) {
                    parentFragment = parentFragment.getParentFragment();
                }
                obj = (InterfaceC39499ptW) (parentFragment instanceof InterfaceC39499ptW ? parentFragment : null);
            }
            interfaceC39499ptW = (InterfaceC39499ptW) obj;
        }
        this.valueOf = interfaceC39499ptW;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public oNV KWHzl(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNV onvEZpvd = oNV.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onvEZpvd, "");
        return onvEZpvd;
    }

    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.AubY = arguments != null ? (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class)) : null;
        Bundle arguments2 = getArguments();
        this.AuCTel = arguments2 != null ? (LatestMarketInfoBean) ((Parcelable) BundleCompat.getParcelable(arguments2, "data", LatestMarketInfoBean.class)) : null;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oNV onv, Bundle bundle) {
        String chainId;
        String strRealTokenContractAddress;
        String chainId2;
        String strRealTokenContractAddress2;
        String chainId3;
        String str = "";
        Intrinsics.checkNotNullParameter(onv, "");
        Bundle arguments = getArguments();
        this.AubY = arguments != null ? (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class)) : null;
        DbNXlk();
        onv.EZpvd.setCurrentDataSource("");
        mTH.copydefault.valueOf();
        onv.EZpvd.djBIcL("light");
        oWN.KWHzl(C33570myu.djBIcL(requireContext()));
        onv.fIwbmz.EZpvd(true);
        onv.fIwbmz.setData();
        AubY();
        onv.getFieldNames.setVisibility(mRJ.AEQbTJ.EZpvd().getCurrencyId() == 0 ? 8 : 0);
        fJNWhG();
        LatestMarketInfoBean latestMarketInfoBean = this.AuCTel;
        if (latestMarketInfoBean != null) {
            EZpvd(latestMarketInfoBean.getChange(), latestMarketInfoBean.getChangeUtc0(), latestMarketInfoBean.getChangeUtc8(), latestMarketInfoBean.getMarketCap());
            OLrzqt(latestMarketInfoBean.getMaxPrice(), latestMarketInfoBean.getMinPrice(), latestMarketInfoBean.getVolume());
            if (this.uzCIH == null) {
                String strHDKMBd = hDKMBd();
                String tokenContractAddress = latestMarketInfoBean.getTokenContractAddress();
                TokenBase tokenBase = this.AubY;
                if (tokenBase == null || (chainId3 = tokenBase.getChainId()) == null) {
                    chainId3 = "";
                }
                C32158mRq c32158mRq = new C32158mRq(strHDKMBd, tokenContractAddress, chainId3);
                this.uzCIH = c32158mRq;
                c32158mRq.copydefault(new Function1() { // from class: o.mTj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return MarketLandscapeFragment.AEQbTJ(this.copydefault, (MarketTxWsInfoItemBean) obj);
                    }
                });
                C32158mRq c32158mRq2 = this.uzCIH;
                if (c32158mRq2 != null) {
                    c32158mRq2.KWHzl(new Function1() { // from class: o.mTh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return MarketLandscapeFragment.AEQbTJ(this.KWHzl, (MarketTradeRealTimeBean) obj);
                        }
                    });
                }
            }
            C32158mRq c32158mRq3 = this.uzCIH;
            if (c32158mRq3 != null) {
                c32158mRq3.AEQbTJ(true);
            }
            C32158mRq c32158mRq4 = this.uzCIH;
            if (c32158mRq4 != null) {
                c32158mRq4.copydefault();
            }
        }
        if (mTL.KWHzl.copydefault(onv.EZpvd.wlaJM().getSPTimeInterval()) != null) {
            ChartViewModel chartViewModelFARcdN = fARcdN();
            TokenBase tokenBase2 = this.AubY;
            if (tokenBase2 == null || (chainId = tokenBase2.getChainId()) == null) {
                chainId = "";
            }
            LatestMarketInfoBean latestMarketInfoBean2 = this.AuCTel;
            if (latestMarketInfoBean2 == null || (strRealTokenContractAddress = latestMarketInfoBean2.realTokenContractAddress()) == null) {
                strRealTokenContractAddress = "";
            }
            chartViewModelFARcdN.KWHzl(new C32144mRc(chainId, strRealTokenContractAddress, new WeakReference(this.isConnected)));
            ChartViewModel chartViewModelFARcdN2 = fARcdN();
            TokenBase tokenBase3 = this.AubY;
            if (tokenBase3 == null || (chainId2 = tokenBase3.getChainId()) == null) {
                chainId2 = "";
            }
            LatestMarketInfoBean latestMarketInfoBean3 = this.AuCTel;
            if (latestMarketInfoBean3 != null && (strRealTokenContractAddress2 = latestMarketInfoBean3.realTokenContractAddress()) != null) {
                str = strRealTokenContractAddress2;
            }
            chartViewModelFARcdN2.EZpvd(new mQW(chainId2, str, new WeakReference(this.DbNXlk)));
        }
        onv.EZpvd.setChartSelectionListener(this);
    }

    public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment, MarketTxWsInfoItemBean marketTxWsInfoItemBean) {
        Intrinsics.checkNotNullParameter(marketTxWsInfoItemBean, "");
        marketLandscapeFragment.EZpvd(marketTxWsInfoItemBean.AEQbTJ(), marketTxWsInfoItemBean.AhwBna(), marketTxWsInfoItemBean.djBIcL(), marketTxWsInfoItemBean.fARcdN());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment, MarketTradeRealTimeBean marketTradeRealTimeBean) {
        Intrinsics.checkNotNullParameter(marketTradeRealTimeBean, "");
        marketLandscapeFragment.OLrzqt(marketTradeRealTimeBean.valueOf(), marketTradeRealTimeBean.AhwBna(), marketTradeRealTimeBean.ejfBZ());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        pGX pgx;
        AbstractC58185ywX<String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("up_down_time_changed");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function1 = new Function1() { // from class: o.mTi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketLandscapeFragment.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mTp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                MarketLandscapeFragment.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.AkhnZx);
        oNV onv = (oNV) KWHzl();
        if (onv != null && (pgx = onv.fIwbmz) != null) {
            pgx.setOnItemSelectListener(new Function1() { // from class: o.mTr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketLandscapeFragment.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        fARcdN().copydefault().observe(this, new Fragment(new Function1() { // from class: o.mTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketLandscapeFragment.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        oNV onv2 = (oNV) KWHzl();
        if (onv2 == null || (viewOnClickListenerC39742pyA = onv2.AEQbTJ) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.setClickListener(new PendingIntent());
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(MarketLandscapeFragment marketLandscapeFragment, String str) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv3;
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null && (c36250oUv2 = onv.EZpvd) != null && (mapEjfBZ = c36250oUv2.ejfBZ()) != null) {
            oNV onv2 = (oNV) marketLandscapeFragment.KWHzl();
            DataSource dataSource = mapEjfBZ.get((onv2 == null || (c36250oUv3 = onv2.EZpvd) == null) ? null : c36250oUv3.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        oNV onv3 = (oNV) marketLandscapeFragment.KWHzl();
        if (onv3 != null && (c36250oUv = onv3.EZpvd) != null) {
            c36250oUv.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(MarketLandscapeFragment marketLandscapeFragment, int i) {
        pGX pgx;
        marketLandscapeFragment.OLrzqt(i);
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null && (pgx = onv.fIwbmz) != null) {
            pgx.setData();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment, List list) {
        oNV onv;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oNV onv2 = (oNV) marketLandscapeFragment.KWHzl();
        if (onv2 != null && (c36250oUv3 = onv2.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
        }
        ChartDataViewModel chartDataViewModelAuCTel = marketLandscapeFragment.AuCTel();
        Intrinsics.copydefault(list);
        List<oUO> listCopydefault = chartDataViewModelAuCTel.copydefault(list);
        oNV onv3 = (oNV) marketLandscapeFragment.KWHzl();
        if (onv3 != null && (c36250oUv2 = onv3.EZpvd) != null) {
            c36250oUv2.KWHzl(listCopydefault);
        }
        ChartViewModel chartViewModelFARcdN = marketLandscapeFragment.fARcdN();
        TokenBase tokenBase = marketLandscapeFragment.AubY;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        String strOLrzqt = chartViewModelFARcdN.OLrzqt(chainId);
        String strCopydefault = marketLandscapeFragment.iwGUEr().EZpvd().copydefault();
        if (C33129mqd.KWHzl((Collection) list) && ((strOLrzqt.length() > 0 || strCopydefault.length() > 0) && (onv = (oNV) marketLandscapeFragment.KWHzl()) != null && (c36250oUv = onv.EZpvd) != null)) {
            c36250oUv.OLrzqt(marketLandscapeFragment.fetchVPNInfo, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final class PendingIntent implements InterfaceC35982oKx {
        public PendingIntent() {
        }

        @Override // o.InterfaceC35982oKx
        public void copydefault() {
            C36250oUv c36250oUv;
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf == null || (c36250oUv = onvValueOf.EZpvd) == null) {
                return;
            }
            c36250oUv.invalidate();
        }

        @Override // o.InterfaceC35982oKx
        public void OLrzqt() {
            C36250oUv c36250oUv;
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf == null || (c36250oUv = onvValueOf.EZpvd) == null) {
                return;
            }
            c36250oUv.invalidate();
        }

        @Override // o.InterfaceC35982oKx
        public void AEQbTJ() {
            C36250oUv c36250oUv;
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf == null || (c36250oUv = onvValueOf.EZpvd) == null) {
                return;
            }
            c36250oUv.invalidate();
        }

        @Override // o.InterfaceC35982oKx
        public void EZpvd() {
            MarketLandscapeFragment.this.zuBGHE();
        }

        @Override // o.InterfaceC35982oKx
        public void AYXKKw() {
            MarketLandscapeFragment.this.AuCTelauCTel();
            InterfaceC39499ptW interfaceC39499ptW = MarketLandscapeFragment.this.valueOf;
            if (interfaceC39499ptW != null) {
                interfaceC39499ptW.fJNWhG();
            }
        }

        @Override // o.InterfaceC35982oKx
        public void KWHzl() {
            MarketLandscapeFragment.this.values();
            InterfaceC39499ptW interfaceC39499ptW = MarketLandscapeFragment.this.valueOf;
            if (interfaceC39499ptW != null) {
                interfaceC39499ptW.DbNXlk();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        oNV onv;
        LatestMarketInfoBean latestMarketInfoBean = this.AuCTel;
        if (latestMarketInfoBean == null || (onv = (oNV) KWHzl()) == null) {
            return;
        }
        onv.gHZMYf.setText(latestMarketInfoBean.getTokenSymbol());
        onv.OcIXYQ.EZpvd(latestMarketInfoBean.getTokenLogoUrl());
        onv.OcIXYQ.copydefault(latestMarketInfoBean.getChainLogoUrl());
        AppCompatTextView appCompatTextView = onv.wlaJM;
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        appCompatTextView.setText(c32979mnm.OLrzqt().getString(C35964oKf.Fragment.QKDJJA));
        onv.zuBGHE.setText(C33069mpW.KWHzl(c32979mnm.OLrzqt(), C35964oKf.Fragment.fiXcQa, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("currency", "USD"))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(String str, String str2, String str3, String str4) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        int iEZpvd = gEmmrt().EZpvd();
        if (iEZpvd == 1) {
            str = str2;
        } else if (iEZpvd == 2) {
            str = str3;
        }
        oNV onv = (oNV) KWHzl();
        if (onv != null && (appCompatTextView3 = onv.sSMYrx) != null) {
            mUO.setRiseDownPercentColorAndValue$default(appCompatTextView3, str, false, 0, 6, null);
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 != null && (appCompatTextView2 = onv2.AubY) != null) {
            appCompatTextView2.setText(mTU.OLrzqt.copydefault(str4));
        }
        oNV onv3 = (oNV) KWHzl();
        if (onv3 == null || (appCompatTextView = onv3.AxsJAY) == null) {
            return;
        }
        mUO.OLrzqt(appCompatTextView, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(String str, String str2, String str3) {
        oNV onv = (oNV) KWHzl();
        if (onv != null) {
            AppCompatTextView appCompatTextView = onv.zLjUOn;
            mTU mtu = mTU.OLrzqt;
            appCompatTextView.setText(mtu.OLrzqt(str));
            onv.AwvSrB.setText(mtu.OLrzqt(str2));
            onv.QKVWgx.setText(mtu.EZpvd(str3));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.fARcdN.clear();
        this.fetchVPNInfo.clear();
        ChartViewModel chartViewModelFARcdN = fARcdN();
        TokenBase tokenBase = this.AubY;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        String strOLrzqt = chartViewModelFARcdN.OLrzqt(chainId);
        TokenFilter tokenFilterEZpvd = iwGUEr().EZpvd();
        String strCopydefault = tokenFilterEZpvd.copydefault();
        if ((tokenFilterEZpvd.EZpvd().size() < 2 && strOLrzqt.length() > 0) || strCopydefault.length() > 0) {
            mQW mqwKWHzl = fARcdN().KWHzl();
            if (mqwKWHzl != null) {
                mqwKWHzl.copydefault(mTL.KWHzl.OLrzqt(timeIntervalItem.timeInterval), strOLrzqt, strCopydefault);
                return;
            }
            return;
        }
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv = onv.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(false);
        }
        mQW mqwKWHzl2 = fARcdN().KWHzl();
        if (mqwKWHzl2 != null) {
            mqwKWHzl2.AEQbTJ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, o.AbstractC32998moE
    public void onVisible() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        LinkedHashMap<String, ChartArea> areas;
        super.onVisible();
        oNV onv = (oNV) KWHzl();
        AEQbTJ(onv != null ? onv.EZpvd : null);
        oNV onv2 = (oNV) KWHzl();
        if (onv2 != null && (c36250oUv2 = onv2.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
            mTL mtl = mTL.KWHzl;
            oNV onv3 = (oNV) KWHzl();
            mtl.OLrzqt(onv3 != null ? onv3.EZpvd : null);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        oNV onv4 = (oNV) KWHzl();
        this.getNewProxyInstance = C36312oXc.AEQbTJ(onv4 != null ? onv4.EZpvd : null);
        oNV onv5 = (oNV) KWHzl();
        if (onv5 != null && (c36250oUv = onv5.EZpvd) != null) {
            c36250oUv.setCurrentStateMachine(this.getNewProxyInstance);
        }
        wlaJM();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, o.AbstractC32998moE
    public void onInvisible() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        HashMap<String, DataSource> mapEjfBZ;
        C36250oUv c36250oUv4;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv3 = onv.EZpvd) != null && (mapEjfBZ = c36250oUv3.ejfBZ()) != null) {
            oNV onv2 = (oNV) KWHzl();
            DataSource dataSource = mapEjfBZ.get((onv2 == null || (c36250oUv4 = onv2.EZpvd) == null) ? null : c36250oUv4.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        oNV onv3 = (oNV) KWHzl();
        if (onv3 != null && (c36250oUv2 = onv3.EZpvd) != null) {
            c36250oUv2.QUSxYX();
        }
        oNV onv4 = (oNV) KWHzl();
        if (onv4 != null && (c36250oUv = onv4.EZpvd) != null) {
            c36250oUv.OLrzqt();
        }
        fARcdN().gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        C36250oUv c36250oUv;
        super.onResume();
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c36250oUv = onv.EZpvd) == null) {
            return;
        }
        c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.mTl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.PendingIntent
            public final void AEQbTJ() {
                MarketLandscapeFragment.zLjUOn(this.AEQbTJ);
            }
        });
    }

    public static final void zLjUOn(MarketLandscapeFragment marketLandscapeFragment) {
        marketLandscapeFragment.getClass();
        System.currentTimeMillis();
        marketLandscapeFragment.getFieldNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36246oUr.copydefault().AubY(false);
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv3 = onv.EZpvd) != null) {
            c36250oUv3.RcXXUw();
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 != null && (c36250oUv2 = onv2.EZpvd) != null) {
            c36250oUv2.copydefault();
        }
        oNV onv3 = (oNV) KWHzl();
        if (onv3 != null && (c36250oUv = onv3.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
        C32144mRc c32144mRcAEQbTJ = fARcdN().AEQbTJ();
        if (c32144mRcAEQbTJ != null) {
            c32144mRcAEQbTJ.OLrzqt();
        }
        fARcdN().KWHzl((C32144mRc) null);
        mQW mqwKWHzl = fARcdN().KWHzl();
        if (mqwKWHzl != null) {
            mqwKWHzl.AEQbTJ();
        }
        fARcdN().EZpvd((mQW) null);
        C32158mRq c32158mRq = this.uzCIH;
        if (c32158mRq != null) {
            c32158mRq.EZpvd();
        }
        C32158mRq c32158mRq2 = this.uzCIH;
        if (c32158mRq2 != null) {
            c32158mRq2.AEQbTJ();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33050mpD.OLrzqt(this.AkhnZx);
        fARcdN().gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wlaJM() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c36250oUv = onv.EZpvd) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        mTL mtl = mTL.KWHzl;
        TimeIntervalItem timeIntervalItemCopydefault = mtl.copydefault(iIntValue);
        if (timeIntervalItemCopydefault != null) {
            AEQbTJ(true);
            C32144mRc c32144mRcAEQbTJ = fARcdN().AEQbTJ();
            if (c32144mRcAEQbTJ != null) {
                String strAEQbTJ = mtl.AEQbTJ(timeIntervalItemCopydefault);
                oNV onv2 = (oNV) KWHzl();
                c32144mRcAEQbTJ.copydefault(strAEQbTJ, C33129mqd.gEmmrt((onv2 == null || (c36250oUv2 = onv2.EZpvd) == null) ? null : Long.valueOf(c36250oUv2.fARcdN())));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        String strRealTokenContractAddress;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c36250oUv = onv.EZpvd) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        mTL mtl = mTL.KWHzl;
        TimeIntervalItem timeIntervalItemCopydefault = mtl.copydefault(iIntValue);
        if (timeIntervalItemCopydefault != null) {
            oNV onv2 = (oNV) KWHzl();
            if (onv2 != null && (c36250oUv3 = onv2.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(true);
            }
            TokenBase tokenBase = this.AubY;
            if (tokenBase != null) {
                ChartViewModel chartViewModelFARcdN = fARcdN();
                String chainId = tokenBase.getChainId();
                LatestMarketInfoBean latestMarketInfoBean = this.AuCTel;
                if (latestMarketInfoBean == null || (strRealTokenContractAddress = latestMarketInfoBean.realTokenContractAddress()) == null) {
                    strRealTokenContractAddress = "";
                }
                String str = strRealTokenContractAddress;
                oNV onv3 = (oNV) KWHzl();
                chartViewModelFARcdN.copydefault("default_trade", new DexTokenCandleParam(chainId, str, C33129mqd.gEmmrt((onv3 == null || (c36250oUv2 = onv3.EZpvd) == null) ? null : Long.valueOf(c36250oUv2.fARcdN())), null, mtl.AEQbTJ(timeIntervalItemCopydefault), null, null, 104, null), this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(boolean z) {
        if (z) {
            fetchVPNInfo();
        } else {
            AYXKKw();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c55113xdn2 = onv.valueOf) != null) {
            c55113xdn2.setVisibility(0);
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 == null || (c55113xdn = onv2.valueOf) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c55113xdn2 = onv.valueOf) != null) {
            c55113xdn2.setVisibility(8);
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 == null || (c55113xdn = onv2.valueOf) == null) {
            return;
        }
        c55113xdn.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        final C55173xeu c55173xeu;
        C36250oUv c36250oUv;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv = onv.EZpvd) != null) {
            c36250oUv.setVisibility(4);
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 == null || (c55173xeu = onv2.AYXKKw) == null) {
            return;
        }
        c55173xeu.setVisibility(z ? 0 : 8);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mTo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                MarketLandscapeFragment.OLrzqt(this.copydefault, c55173xeu, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(MarketLandscapeFragment marketLandscapeFragment, C55173xeu c55173xeu, View view) {
        C36250oUv c36250oUv;
        marketLandscapeFragment.wlaJM();
        c55173xeu.setVisibility(8);
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv == null || (c36250oUv = onv.EZpvd) == null) {
            return;
        }
        c36250oUv.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        C36250oUv c36250oUv;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c36250oUv = onv.EZpvd) == null) {
            return;
        }
        c36250oUv.setShowEmptyUi(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void DbNXlk() {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfig = new ChartViewOutSideConfig(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
        mTR mtr = mTR.EZpvd;
        chartViewOutSideConfig.setMShowHistoryOrder(mtr.AEQbTJ());
        chartViewOutSideConfig.setMShowCurrentOrder(mtr.OLrzqt());
        chartViewOutSideConfig.setMShowCostLine(mtr.copydefault());
        chartViewOutSideConfig.setColumnChart(mtr.AYXKKw());
        chartViewOutSideConfig.setMShowPriceLine(mtr.KWHzl());
        chartViewOutSideConfig.setScreen(false);
        chartViewOutSideConfig.setChartTag("sp_timeinterval_okx_cedefi");
        chartViewOutSideConfig.setMode("cedefi_mode");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setKLineInfiniteScale(true);
        chartViewOutSideConfig.setMarketCap(AuCTel().EZpvd());
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv2 = onv.EZpvd) != null) {
            c36250oUv2.OLrzqt(chartViewOutSideConfig);
        }
        oNV onv2 = (oNV) KWHzl();
        if (onv2 != null && (c36250oUv = onv2.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(false);
        }
        pFN pfn = pFN.OLrzqt;
        mTH mth = mTH.copydefault;
        pfn.EZpvd(mth.copydefault(), mth);
        InterfaceC35976oKr klineSettingFragment$default = oKA.TaskDescription.getKlineSettingFragment$default((oKA) C43248rlh.KWHzl.AEQbTJ(oKA.class), "SPOT", true, false, false, false, false, false, false, false, false, true, false, false, false, KlineSettingType.CHART_LANDSCAPE, null, 47604, null);
        this.ejfBZ = klineSettingFragment$default;
        if (klineSettingFragment$default != null) {
            oNV onv3 = (oNV) KWHzl();
            klineSettingFragment$default.OLrzqt(new mTS(new WeakReference(onv3 != null ? onv3.EZpvd : null), uzCIH(), this.fJNWhG, this.fIwbmz));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull C36250oUv c36250oUv) {
        pGY pgy;
        String tokenSymbol;
        String tokenContractAddress;
        String chainId;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        mTL mtl = mTL.KWHzl;
        oNV onv = (oNV) KWHzl();
        pGY pgy2 = onv != null ? onv.fARcdN : null;
        TokenBase tokenBase = this.AubY;
        String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
        TokenBase tokenBase2 = this.AubY;
        String str2 = (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress;
        TokenBase tokenBase3 = this.AubY;
        mTI.StateListAnimator.initChartView$default(mtl, c36250oUv, pgy2, str, str2, (tokenBase3 == null || (tokenSymbol = tokenBase3.getTokenSymbol()) == null) ? "" : tokenSymbol, false, 32, null);
        this.getNewProxyInstance = C36312oXc.AEQbTJ((C36250oUv) null);
        c36250oUv.setDrawingFinishListener(new C36250oUv.TaskDescription() { // from class: o.mTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C36250oUv.TaskDescription
            public final void AEQbTJ() {
                MarketLandscapeFragment.getNewProxyInstance(this.AEQbTJ);
            }
        });
        zsXlph();
        oNV onv2 = (oNV) KWHzl();
        if (onv2 == null || (pgy = onv2.fARcdN) == null) {
            return;
        }
        pgy.setOnItemSelectListener(new Function1() { // from class: o.mTq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketLandscapeFragment.OLrzqt(this.AEQbTJ, (MarketTypeSelect) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getNewProxyInstance(MarketLandscapeFragment marketLandscapeFragment) {
        pGR pgr;
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null && drawLineItemIsConnected.getIndexId().length() == 0) {
            drawLineItemIsConnected.setIndexId(C37897pEt.KWHzl.copydefault(System.currentTimeMillis()));
        }
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null && (pgr = onv.fetchVPNInfo) != null) {
            pgr.KWHzl();
        }
        marketLandscapeFragment.AwvSrB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final MarketLandscapeFragment marketLandscapeFragment, MarketTypeSelect marketTypeSelect) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null && (c36250oUv = onv.EZpvd) != null) {
            mTL.KWHzl.KWHzl(c36250oUv, marketTypeSelect, marketLandscapeFragment.iwGUEr, new Function0() { // from class: o.mTd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketLandscapeFragment.iwGUEr(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(MarketLandscapeFragment marketLandscapeFragment) {
        marketLandscapeFragment.zLjUOn();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        C32239mUq c32239mUq;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c32239mUq = onv.ejfBZ) == null) {
            return;
        }
        c32239mUq.post(new Runnable() { // from class: o.mTk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MarketLandscapeFragment.AuCTelauCTel(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AuCTelauCTel(MarketLandscapeFragment marketLandscapeFragment) {
        C32239mUq c32239mUq;
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv == null || (c32239mUq = onv.ejfBZ) == null) {
            return;
        }
        c32239mUq.fullScroll(130);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        C32239mUq c32239mUq;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c32239mUq = onv.ejfBZ) == null) {
            return;
        }
        c32239mUq.post(new Runnable() { // from class: o.mTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MarketLandscapeFragment.wlaJM(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void wlaJM(MarketLandscapeFragment marketLandscapeFragment) {
        C32239mUq c32239mUq;
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv == null || (c32239mUq = onv.ejfBZ) == null) {
            return;
        }
        c32239mUq.fullScroll(33);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AubY() {
        final oNV onv = (oNV) KWHzl();
        if (onv != null) {
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = onv.EZpvd.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null) {
                chartViewOutSideConfigAkhnZx.setScreenType(0);
            }
            C36250oUv c36250oUv = onv.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c36250oUv, "");
            OLrzqt(c36250oUv);
            onv.isConnected.setPanelClickListener(new TaskDescription(onv, this));
            onv.DbNXlk.setOnClickListener(new View.OnClickListener() { // from class: o.mTu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MarketLandscapeFragment.OLrzqt(onv, this, view);
                }
            });
            onv.fIwbmz.setOnItemSelectListener(new Function1() { // from class: o.mTy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketLandscapeFragment.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
            onv.fetchVPNInfo.setShowShareIcon(false);
            onv.getNewProxyInstance.setOnClickListener(new View.OnClickListener() { // from class: o.mTa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MarketLandscapeFragment.EZpvd(onv, this, view);
                }
            });
            onv.fetchVPNInfo.setOnItemClickTypeListener(new Function1() { // from class: o.mSZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketLandscapeFragment.AEQbTJ(this.EZpvd, onv, ((java.lang.Integer) obj).intValue());
                }
            });
            onv.fetchVPNInfo.setOnLineHideListener(new Function1() { // from class: o.mTc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketLandscapeFragment.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            onv.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.mTe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MarketLandscapeFragment.EZpvd(this.KWHzl, view);
                }
            });
        }
    }

    public static final class TaskDescription implements InterfaceC32245mUw {
        public final /* synthetic */ oNV AEQbTJ;
        public final /* synthetic */ MarketLandscapeFragment copydefault;

        public TaskDescription(oNV onv, MarketLandscapeFragment marketLandscapeFragment) {
            this.AEQbTJ = onv;
            this.copydefault = marketLandscapeFragment;
        }

        @Override // o.InterfaceC32245mUw
        public void EZpvd(int i) {
            C36250oUv c36250oUv;
            if (i == 0) {
                oWO owo = C36312oXc.AEQbTJ(this.AEQbTJ.EZpvd).AubY;
                Intrinsics.copydefault(owo, "");
                ((C36311oXb) owo).djBIcL();
            }
            oNV onvValueOf = MarketLandscapeFragment.valueOf(this.copydefault);
            if (onvValueOf == null || (c36250oUv = onvValueOf.EZpvd) == null) {
                return;
            }
            c36250oUv.copydefault();
        }
    }

    public static final void OLrzqt(oNV onv, MarketLandscapeFragment marketLandscapeFragment, View view) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = onv.EZpvd.AkhnZx();
        if (chartViewOutSideConfigAkhnZx != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(false);
        }
        C36312oXc c36312oXc = marketLandscapeFragment.getNewProxyInstance;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(false);
        }
        RxBus.KWHzl("kline_portrait_screen");
    }

    public static final Unit OLrzqt(MarketLandscapeFragment marketLandscapeFragment, int i) {
        marketLandscapeFragment.OLrzqt(i);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(oNV onv, MarketLandscapeFragment marketLandscapeFragment, View view) {
        View viewKWHzl;
        onv.fetchVPNInfo.setVisibility(0);
        InterfaceC35967oKi interfaceC35967oKiEZpvd = onv.fetchVPNInfo.EZpvd();
        if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
            viewKWHzl.setVisibility(0);
        }
        onv.AuCTel.setVisibility(8);
        marketLandscapeFragment.KWHzl(true);
        onv.ejfBZ.setScrollingEnabled(false);
        marketLandscapeFragment.AxsJAY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment, oNV onv, int i) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        HashMap<String, oWN> timelines;
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        LinkedHashMap<String, ChartArea> areas;
        ChartArea chartArea;
        C36250oUv c36250oUv5;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        HashMap<String, oWN> timelines2;
        View viewKWHzl;
        switch (i) {
            case 1001:
            case 1002:
                DrawLineData drawLineData = DrawLineData.copydefault;
                if (drawLineData.valueOf() == DrawLineData.LineType.PRICE_LINE || drawLineData.valueOf() == DrawLineData.LineType.FIBONACCI) {
                    oNV onv2 = (oNV) marketLandscapeFragment.KWHzl();
                    oWN own = (onv2 == null || (c36250oUv2 = onv2.EZpvd) == null || (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) == null || (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) == null) ? null : timelines.get("ds0");
                    if (own != null) {
                        own.AwvSrB();
                    }
                    drawLineData.EZpvd((DrawLineData.LineType) null);
                    oNV onv3 = (oNV) marketLandscapeFragment.KWHzl();
                    if (onv3 != null && (c36250oUv = onv3.EZpvd) != null) {
                        c36250oUv.invalidate();
                    }
                }
                break;
            case 1003:
            case 1004:
            case PointerIconCompat.TYPE_VERTICAL_TEXT /* 1009 */:
                oNV onv4 = (oNV) marketLandscapeFragment.KWHzl();
                oWN own2 = (onv4 == null || (c36250oUv5 = onv4.EZpvd) == null || (chartViewOutSideConfigAkhnZx3 = c36250oUv5.AkhnZx()) == null || (timelines2 = chartViewOutSideConfigAkhnZx3.getTimelines()) == null) ? null : timelines2.get("ds0");
                if (own2 != null) {
                    oNV onv5 = (oNV) marketLandscapeFragment.KWHzl();
                    C36250oUv c36250oUv6 = onv5 != null ? onv5.EZpvd : null;
                    Intrinsics.copydefault(c36250oUv6);
                    int measuredWidth = c36250oUv6.getMeasuredWidth() / 2;
                    oNV onv6 = (oNV) marketLandscapeFragment.KWHzl();
                    own2.KWHzl(measuredWidth, ((onv6 == null || (c36250oUv4 = onv6.EZpvd) == null || (chartViewOutSideConfigAkhnZx2 = c36250oUv4.AkhnZx()) == null || (areas = chartViewOutSideConfigAkhnZx2.getAreas()) == null || (chartArea = areas.get("ds0.m")) == null) ? 100 : chartArea.djBIcL()) / 2);
                }
                oNV onv7 = (oNV) marketLandscapeFragment.KWHzl();
                if (onv7 != null && (c36250oUv3 = onv7.EZpvd) != null) {
                    c36250oUv3.invalidate();
                }
                marketLandscapeFragment.KWHzl(true);
                oNV onv8 = (oNV) marketLandscapeFragment.KWHzl();
                if (onv8 != null && (viewOnClickListenerC39742pyA = onv8.AEQbTJ) != null) {
                    viewOnClickListenerC39742pyA.AYXKKw();
                }
                break;
            case 1006:
                marketLandscapeFragment.fIwbmz();
                break;
            case 1008:
                onv.fetchVPNInfo.setVisibility(8);
                InterfaceC35967oKi interfaceC35967oKiEZpvd = onv.fetchVPNInfo.EZpvd();
                if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
                    viewKWHzl.setVisibility(8);
                }
                onv.AuCTel.setVisibility(0);
                C36312oXc c36312oXc = marketLandscapeFragment.getNewProxyInstance;
                if (c36312oXc != null) {
                    c36312oXc.AEQbTJ(false);
                }
                onv.ejfBZ.setScrollingEnabled(true);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment, boolean z) {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        if (z) {
            oNV onv = (oNV) marketLandscapeFragment.KWHzl();
            if (onv != null && (c36250oUv4 = onv.EZpvd) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv4.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx2.setMHideKlineDrawingData(true);
            }
            C36312oXc c36312oXc = marketLandscapeFragment.getNewProxyInstance;
            if (c36312oXc != null) {
                c36312oXc.AEQbTJ(true);
            }
            oNV onv2 = (oNV) marketLandscapeFragment.KWHzl();
            if (onv2 != null && (c36250oUv3 = onv2.EZpvd) != null) {
                c36250oUv3.invalidate();
            }
        } else {
            oNV onv3 = (oNV) marketLandscapeFragment.KWHzl();
            if (onv3 != null && (c36250oUv2 = onv3.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMHideKlineDrawingData(false);
            }
            oNV onv4 = (oNV) marketLandscapeFragment.KWHzl();
            if (onv4 != null && (c36250oUv = onv4.EZpvd) != null) {
                c36250oUv.invalidate();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(MarketLandscapeFragment marketLandscapeFragment, View view) {
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null) {
            Object obj = marketLandscapeFragment.ejfBZ;
            androidx.fragment.app.Fragment fragment = obj instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) obj : null;
            if (fragment != null) {
                marketLandscapeFragment.AEQbTJ(fragment);
            }
            onv.OLrzqt.openDrawer(8388613);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(boolean z) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (c36250oUv = onv.EZpvd) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMDrawLineEnable(z);
        }
        C36312oXc c36312oXc = this.getNewProxyInstance;
        if (c36312oXc != null) {
            c36312oXc.AEQbTJ(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(int i) {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (viewOnClickListenerC39742pyA = onv.AEQbTJ) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.setImageBackground(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (viewOnClickListenerC39742pyA = onv.AEQbTJ) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.gEmmrt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTelauCTel() {
        InterfaceC39560pue interfaceC39560pue = this.values;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
        DrawLineData.DrawLineItem drawLineItemIsConnected = DrawLineData.copydefault.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineItemIsConnected.setLineLocked(!drawLineItemIsConnected.getLocked());
        }
    }

    public final void values() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        DrawLineData.DrawLineItem drawLineItemIsConnected = drawLineData.isConnected();
        if (drawLineItemIsConnected != null) {
            drawLineData.EZpvd().remove(drawLineItemIsConnected);
            drawLineData.EZpvd(drawLineData.EZpvd());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (viewOnClickListenerC39742pyA = onv.AEQbTJ) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oNV onv = (oNV) KWHzl();
        if (onv != null && (viewOnClickListenerC39742pyA = onv.AEQbTJ) != null) {
            viewOnClickListenerC39742pyA.setVisibility(8);
        }
        AwvSrB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        ViewOnClickListenerC39742pyA viewOnClickListenerC39742pyA;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (viewOnClickListenerC39742pyA = onv.AEQbTJ) == null) {
            return;
        }
        viewOnClickListenerC39742pyA.djBIcL();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v12, resolved type: o.oKm */
    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r12v8, resolved type: VB */
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
    private final void OLrzqt(int i) {
        String tokenContractAddress;
        String chainId;
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oNV onv = (oNV) KWHzl();
        if (onv != null) {
            if (i == 10) {
                oNV onv2 = (oNV) KWHzl();
                InterfaceC35971oKm interfaceC35971oKmEZpvd = ((oKA) C43248rlh.KWHzl.AEQbTJ(oKA.class)).EZpvd((onv2 == null || (c36250oUv = onv2.EZpvd) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 60 : templateSettingWlaJM.getSPTimeInterval());
                androidx.fragment.app.Fragment fragment = interfaceC35971oKmEZpvd instanceof androidx.fragment.app.Fragment ? (androidx.fragment.app.Fragment) interfaceC35971oKmEZpvd : null;
                if (fragment != null) {
                    AEQbTJ(fragment);
                }
                onv.OLrzqt.openDrawer(8388613);
                interfaceC35971oKmEZpvd.OLrzqt(new StateListAnimator(onv));
                return;
            }
            C36250oUv c36250oUv2 = onv.EZpvd;
            mTL mtl = mTL.KWHzl;
            Intrinsics.copydefault(c36250oUv2);
            TimeIntervalItem timeIntervalItem = mTH.copydefault.AEQbTJ().get(i);
            Intrinsics.checkNotNullExpressionValue(timeIntervalItem, "");
            TimeIntervalItem timeIntervalItem2 = timeIntervalItem;
            C36312oXc c36312oXc = this.getNewProxyInstance;
            oNV onv3 = (oNV) KWHzl();
            pGX pgx = onv3 != null ? onv3.fIwbmz : null;
            TokenBase tokenBase = this.AubY;
            String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
            TokenBase tokenBase2 = this.AubY;
            mtl.copydefault(c36250oUv2, timeIntervalItem2, c36312oXc, pgx, str, (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress, new Function0() { // from class: o.mTg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketLandscapeFragment.hDKMBd(this.copydefault);
                }
            }, new Function0() { // from class: o.mTf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketLandscapeFragment.uzCIH(this.AEQbTJ);
                }
            });
        }
    }

    public static final class StateListAnimator implements oKC {
        public final /* synthetic */ oNV EZpvd;

        public StateListAnimator(oNV onv) {
            this.EZpvd = onv;
        }

        @Override // o.oKC
        public void copydefault(MarketTypeSelect marketTypeSelect) {
            C36250oUv c36250oUv;
            String tokenContractAddress;
            String chainId;
            Intrinsics.checkNotNullParameter(marketTypeSelect, "");
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf != null && (c36250oUv = onvValueOf.EZpvd) != null) {
                final MarketLandscapeFragment marketLandscapeFragment = MarketLandscapeFragment.this;
                mTL mtl = mTL.KWHzl;
                Object data = marketTypeSelect.getData();
                Intrinsics.copydefault(data, "");
                TimeIntervalItem timeIntervalItem = (TimeIntervalItem) data;
                C36312oXc c36312oXc = marketLandscapeFragment.getNewProxyInstance;
                oNV onvValueOf2 = MarketLandscapeFragment.valueOf(marketLandscapeFragment);
                pGX pgx = onvValueOf2 != null ? onvValueOf2.fIwbmz : null;
                TokenBase tokenBase = marketLandscapeFragment.AubY;
                String str = (tokenBase == null || (chainId = tokenBase.getChainId()) == null) ? "" : chainId;
                TokenBase tokenBase2 = marketLandscapeFragment.AubY;
                mtl.copydefault(c36250oUv, timeIntervalItem, c36312oXc, pgx, str, (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) ? "" : tokenContractAddress, new Function0() { // from class: o.mTw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MarketLandscapeFragment.StateListAnimator.KWHzl(marketLandscapeFragment);
                    }
                }, new Function0() { // from class: o.mTA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return MarketLandscapeFragment.StateListAnimator.AEQbTJ(marketLandscapeFragment);
                    }
                });
            }
            this.EZpvd.OLrzqt.closeDrawer(8388613);
        }

        public static final Unit KWHzl(MarketLandscapeFragment marketLandscapeFragment) {
            marketLandscapeFragment.getNewProxyInstance();
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(MarketLandscapeFragment marketLandscapeFragment) {
            marketLandscapeFragment.wlaJM();
            return Unit.INSTANCE;
        }
    }

    public static final Unit hDKMBd(MarketLandscapeFragment marketLandscapeFragment) {
        marketLandscapeFragment.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(MarketLandscapeFragment marketLandscapeFragment) {
        marketLandscapeFragment.wlaJM();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        View viewKWHzl;
        oNV onv = (oNV) KWHzl();
        if (onv != null) {
            pGR pgr = onv.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(pgr, "");
            if (pgr.getVisibility() == 0) {
                onv.fetchVPNInfo.setVisibility(8);
                InterfaceC35967oKi interfaceC35967oKiEZpvd = onv.fetchVPNInfo.EZpvd();
                if (interfaceC35967oKiEZpvd != null && (viewKWHzl = interfaceC35967oKiEZpvd.KWHzl()) != null) {
                    viewKWHzl.setVisibility(8);
                }
                onv.AuCTel.setVisibility(0);
                KWHzl(false);
                onv.fetchVPNInfo.KWHzl();
                onv.ejfBZ.setScrollingEnabled(true);
            }
        }
    }

    private final void fIwbmz() {
        Context context = getContext();
        if (context != null) {
            pES.EZpvd.KWHzl(context, new Function0() { // from class: o.mTt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MarketLandscapeFragment.getFieldNames(this.EZpvd);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getFieldNames(MarketLandscapeFragment marketLandscapeFragment) {
        pGR pgr;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        HashMap<String, oWN> timelines;
        C36250oUv c36250oUv2;
        final DrawLineBean drawLineBeanAEQbTJ = oUJ.KWHzl.AEQbTJ();
        if (drawLineBeanAEQbTJ != null) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            ArrayList<DrawLineData.DrawLineItem> arrayListEZpvd = drawLineData.EZpvd();
            final Function1 function1 = new Function1() { // from class: o.mSY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(MarketLandscapeFragment.OLrzqt(drawLineBeanAEQbTJ, (DrawLineData.DrawLineItem) obj));
                }
            };
            arrayListEZpvd.removeIf(new Predicate() { // from class: o.mTb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return MarketLandscapeFragment.copydefault(function1, obj);
                }
            });
            drawLineData.EZpvd(drawLineData.EZpvd());
        }
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        if (onv != null && (c36250oUv2 = onv.EZpvd) != null) {
            c36250oUv2.invalidate();
        }
        marketLandscapeFragment.KWHzl(true);
        oNV onv2 = (oNV) marketLandscapeFragment.KWHzl();
        oWN own = (onv2 == null || (c36250oUv = onv2.EZpvd) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || (timelines = chartViewOutSideConfigAkhnZx.getTimelines()) == null) ? null : timelines.get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
        oNV onv3 = (oNV) marketLandscapeFragment.KWHzl();
        if (onv3 != null && (pgr = onv3.fetchVPNInfo) != null) {
            pgr.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean OLrzqt(DrawLineBean drawLineBean, DrawLineData.DrawLineItem drawLineItem) {
        Intrinsics.checkNotNullParameter(drawLineItem, "");
        if (Intrinsics.EZpvd((Object) drawLineItem.getContract(), (Object) drawLineBean.getCoinId())) {
            int klineType = drawLineItem.getKlineType();
            Integer type = drawLineBean.getType();
            if (type != null && klineType == type.intValue()) {
                return true;
            }
        }
        return false;
    }

    private final void AEQbTJ(androidx.fragment.app.Fragment fragment) {
        getChildFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.RZNAhV, fragment).commit();
    }

    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iIntValue;
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM;
            ArrayList<String> sideIndicatorNames;
            C32239mUq c32239mUq;
            ViewTreeObserver viewTreeObserver;
            C32239mUq c32239mUq2;
            C32239mUq c32239mUq3;
            ViewTreeObserver viewTreeObserver2;
            if (MarketLandscapeFragment.this.getContext() == null) {
                oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
                if (onvValueOf == null || (c32239mUq3 = onvValueOf.ejfBZ) == null || (viewTreeObserver2 = c32239mUq3.getViewTreeObserver()) == null) {
                    return;
                }
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
                return;
            }
            C33566myq c33566myq = C33566myq.EZpvd;
            Context context = MarketLandscapeFragment.this.getContext();
            Intrinsics.copydefault(context);
            int iOLrzqt = c33566myq.OLrzqt(context);
            Context context2 = MarketLandscapeFragment.this.getContext();
            Intrinsics.copydefault(context2);
            int iEZpvd = c33566myq.EZpvd(context2);
            oNV onvValueOf2 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            Integer numValueOf = (onvValueOf2 == null || (c32239mUq2 = onvValueOf2.ejfBZ) == null) ? null : Integer.valueOf(c32239mUq2.getMeasuredHeight());
            MarketLandscapeFragment marketLandscapeFragment = MarketLandscapeFragment.this;
            int size = 0;
            if (iOLrzqt > iEZpvd) {
                iIntValue = C33129mqd.AhwBna(Double.valueOf(((double) iEZpvd) * 0.75d));
            } else {
                iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            }
            marketLandscapeFragment.iwGUEr = iIntValue;
            oNV onvValueOf3 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf3 != null && (c32239mUq = onvValueOf3.ejfBZ) != null && (viewTreeObserver = c32239mUq.getViewTreeObserver()) != null) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            oNV onvValueOf4 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf4 != null && (c36250oUv2 = onvValueOf4.EZpvd) != null && (templateSettingWlaJM = c36250oUv2.wlaJM()) != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null) {
                size = sideIndicatorNames.size();
            }
            int iAKErDB = size > 1 ? MarketLandscapeFragment.this.iwGUEr + (C36246oUr.copydefault().aKErDB() * (size - 1)) : MarketLandscapeFragment.this.iwGUEr;
            oNV onvValueOf5 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf5 == null || (c36250oUv = onvValueOf5.EZpvd) == null) {
                return;
            }
            c36250oUv.setMinimumHeight(iAKErDB);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        C32239mUq c32239mUq;
        ViewTreeObserver viewTreeObserver;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c32239mUq = onv.ejfBZ) == null || (viewTreeObserver = c32239mUq.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new Application());
    }

    public void AEQbTJ(C36250oUv c36250oUv) {
        String chainId;
        String tokenContractAddress;
        mTL mtl = mTL.KWHzl;
        C36312oXc c36312oXc = this.getNewProxyInstance;
        TokenBase tokenBase = this.AubY;
        String str = "";
        if (tokenBase == null || (chainId = tokenBase.getChainId()) == null) {
            chainId = "";
        }
        TokenBase tokenBase2 = this.AubY;
        if (tokenBase2 != null && (tokenContractAddress = tokenBase2.getTokenContractAddress()) != null) {
            str = tokenContractAddress;
        }
        mtl.KWHzl(c36250oUv, c36312oXc, chainId, str);
    }

    private final void gHZMYf() {
        TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
        C32866mlf.EZpvd("DEXMarket_Token_KlineBuy/sell_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MarketLandscapeFragment.KWHzl(this.OLrzqt, (EventParamsList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(MarketLandscapeFragment marketLandscapeFragment, EventParamsList eventParamsList) {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        String tabName = marketLandscapeFragment.iwGUEr().copydefault().getValue().getTabName();
        TokenFilter tokenFilterEZpvd = marketLandscapeFragment.iwGUEr().EZpvd();
        TokenBase tokenBase = marketLandscapeFragment.AubY;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        EventParamsList.put$default(eventParamsList, "token_chain", chainId == null ? "" : chainId, false, 4, null);
        TokenBase tokenBase2 = marketLandscapeFragment.AubY;
        String tokenContractAddress = tokenBase2 != null ? tokenBase2.getTokenContractAddress() : null;
        EventParamsList.put$default(eventParamsList, "token_address", tokenContractAddress == null ? "" : tokenContractAddress, false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", tabName, false, 4, null);
        String lowerCase = tokenFilterEZpvd.copydefault().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (lowerCase.length() == 0) {
            lowerCase = "all";
        }
        EventParamsList.put$default(eventParamsList, "holder_label_tab", lowerCase, false, 4, null);
        mTL mtl = mTL.KWHzl;
        oNV onv = (oNV) marketLandscapeFragment.KWHzl();
        EventParamsList.put$default(eventParamsList, "kline_time", mtl.OLrzqt((onv == null || (c36250oUv = onv.EZpvd) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) ? 0 : templateSettingWlaJM.getSPTimeInterval()), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.C36250oUv.ActionBar
    public void aI_() {
        C55489xks.startVibratorIfCan$default(0L, 1, null);
    }

    @Override // o.C36250oUv.ActionBar
    public void copydefault(Boolean bool) {
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            gHZMYf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zuBGHE() {
        DrawerLayout drawerLayout;
        C38768pff c38768pffAEQbTJ = C38768pff.Companion.AEQbTJ();
        oNV onv = (oNV) KWHzl();
        if (onv != null && (drawerLayout = onv.OLrzqt) != null) {
            drawerLayout.openDrawer(5);
        }
        AEQbTJ(c38768pffAEQbTJ);
        c38768pffAEQbTJ.copydefault(new FragmentManager());
    }

    public static final class FragmentManager implements InterfaceC35980oKv {
        public FragmentManager() {
        }

        @Override // o.InterfaceC35980oKv
        public void AEQbTJ() {
            C36250oUv c36250oUv;
            DrawerLayout drawerLayout;
            oNV onvValueOf = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf != null && (drawerLayout = onvValueOf.OLrzqt) != null) {
                drawerLayout.closeDrawer(5);
            }
            oNV onvValueOf2 = MarketLandscapeFragment.valueOf(MarketLandscapeFragment.this);
            if (onvValueOf2 == null || (c36250oUv = onvValueOf2.EZpvd) == null) {
                return;
            }
            c36250oUv.invalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(double d, double d2) {
        C36250oUv c36250oUv;
        oNV onv;
        C39805pzK c39805pzK;
        C39805pzK c39805pzK2;
        oNV onv2 = (oNV) KWHzl();
        if (onv2 != null && (c39805pzK2 = onv2.hDKMBd) != null) {
            c39805pzK2.setVisibility(0);
        }
        oNV onv3 = (oNV) KWHzl();
        if (onv3 == null || (c36250oUv = onv3.EZpvd) == null || (onv = (oNV) KWHzl()) == null || (c39805pzK = onv.hDKMBd) == null) {
            return;
        }
        c39805pzK.setBitmapAndPos(c36250oUv, d, d2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        C39805pzK c39805pzK;
        oNV onv = (oNV) KWHzl();
        if (onv == null || (c39805pzK = onv.hDKMBd) == null) {
            return;
        }
        c39805pzK.setVisibility(8);
    }
}
