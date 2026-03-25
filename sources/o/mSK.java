package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel.ChartViewModel;
import com.okinc.dexkline.dexlogic.track.enums.KlineType;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KLineFragmentParams;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$initView$2;
import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.dexkline.market.features.chart.domain.ChartType;
import com.okinc.dexkline.market.features.chart.ui.ChartDataViewModel;
import com.okinc.dexkline.market.features.filter.ChartDetailSubTabName;
import com.okinc.dexkline.market.features.filter.SharedFilterViewModel;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.kline.api.bean.EntryType;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C32278mWb;
import o.C32392mcI;
import o.C35964oKf;
import o.C35966oKh;
import o.C36250oUv;
import o.C52761wXj;
import o.mTI;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mSK extends mSG<oNU> implements InterfaceC39500ptX, InterfaceC32287mWk, C36250oUv.ActionBar {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public int AuCTel;
    public boolean djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public C36312oXc fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm hDKMBd = C56392yDr.copydefault(new Function0() { // from class: o.mSU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mSK.DbNXlk(this.OLrzqt);
        }
    });
    public final java.util.List<HistoryOrderData> isConnected = new java.util.ArrayList();
    public final java.util.Map<java.lang.String, HistoryOrderData> DbNXlk = new LinkedHashMap();
    public WeakReference<InterfaceC32157mRp> AkhnZx = new WeakReference<>(null);
    public final StateListAnimator values = new StateListAnimator();
    public final TaskDescription fetchVPNInfo = new TaskDescription();

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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

    private final void AubY() {
    }

    @Override // o.C36250oUv.ActionBar
    public void EZpvd(java.lang.String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oNU OLrzqt(mSK msk) {
        return (oNU) msk.KWHzl();
    }

    public mSK() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$3
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChartDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$9
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.KlineVerticalFragment$special$$inlined$activityViewModels$default$12
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mSK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final mSK OLrzqt(@NotNull KLineFragmentParams kLineFragmentParams) {
            Intrinsics.checkNotNullParameter(kLineFragmentParams, "");
            mSK msk = new mSK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.kline_fragment", kLineFragmentParams);
            msk.setArguments(bundle);
            return msk;
        }
    }

    public final KLineFragmentParams valueOf() {
        return (KLineFragmentParams) this.hDKMBd.getValue();
    }

    public static final KLineFragmentParams DbNXlk(mSK msk) {
        KLineFragmentParams kLineFragmentParams;
        android.os.Bundle arguments = msk.getArguments();
        return (arguments == null || (kLineFragmentParams = (KLineFragmentParams) BundleCompat.getParcelable(arguments, "key.kline_fragment", KLineFragmentParams.class)) == null) ? new KLineFragmentParams(null, null, false, null, 15, null) : kLineFragmentParams;
    }

    private final java.lang.String AkhnZx() {
        return valueOf().EZpvd();
    }

    private final java.lang.String AuCTel() {
        return valueOf().OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartViewModel fARcdN() {
        return (ChartViewModel) this.AYXKKw.getValue();
    }

    public final SharedFilterViewModel gEmmrt() {
        return (SharedFilterViewModel) this.uzCIH.getValue();
    }

    public final ChartDataViewModel djBIcL() {
        return (ChartDataViewModel) this.gEmmrt.getValue();
    }

    private final MarketCoinDetailViewModel fIwbmz() {
        return (MarketCoinDetailViewModel) this.ejfBZ.getValue();
    }

    public static final class StateListAnimator implements InterfaceC32157mRp {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC32157mRp
        public void OLrzqt(java.util.List<? extends oUO> list, java.lang.String str) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            TemplateSetting templateSettingWlaJM;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC32157mRp interfaceC32157mRp = (InterfaceC32157mRp) mSK.this.AkhnZx.get();
            if (interfaceC32157mRp != null) {
                interfaceC32157mRp.OLrzqt(list, str);
            }
            java.util.List<oUO> listCopydefault = mSK.this.djBIcL().copydefault(list);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")) {
                oUO ouo = (oUO) CollectionsKt___CollectionsKt.wlaJM(listCopydefault);
                if (ouo != null) {
                    C36246oUr.copydefault().iwGUEr().AEQbTJ(ouo.KWHzl);
                }
                oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
                if (onuOLrzqt != null && (c36250oUv2 = onuOLrzqt.copydefault) != null && (templateSettingWlaJM = c36250oUv2.wlaJM()) != null) {
                    int sPTimeInterval = templateSettingWlaJM.getSPTimeInterval();
                    mSK msk = mSK.this;
                    TimeIntervalItem timeIntervalItemCopydefault = mTL.KWHzl.copydefault(java.lang.Integer.valueOf(sPTimeInterval).intValue());
                    if (timeIntervalItemCopydefault != null) {
                        msk.KWHzl(timeIntervalItemCopydefault);
                    }
                }
            }
            oNU onuOLrzqt2 = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt2 != null && (c36250oUv = onuOLrzqt2.copydefault) != null) {
                c36250oUv.AEQbTJ(listCopydefault);
            }
            mSK.this.OLrzqt(false);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http") && listCopydefault.isEmpty()) {
                mSK.this.uzCIH();
            } else if (C33129mqd.KWHzl((java.util.Collection) listCopydefault)) {
                mSK.this.wlaJM();
            }
        }

        @Override // o.InterfaceC32157mRp
        public void EZpvd(java.lang.String str, java.lang.String str2) {
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            mSK.this.OLrzqt(false);
            InterfaceC32157mRp interfaceC32157mRp = (InterfaceC32157mRp) mSK.this.AkhnZx.get();
            if (interfaceC32157mRp != null) {
                interfaceC32157mRp.EZpvd(str, str2);
            }
            oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt == null || (c36250oUv = onuOLrzqt.copydefault) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) {
                return;
            }
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }

        @Override // o.InterfaceC32157mRp
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "51001")) {
                mSK.this.uzCIH();
            } else {
                mSK.this.iwGUEr();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ mSK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, mSK msk) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = msk;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.mWb.Activity.newInstance$default(o.mWb$Activity, com.okinc.dexkline.market.features.chart.domain.ChartType, kotlin.jvm.functions.Function0, int, java.lang.Object):o.mWb */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32278mWb c32278mWbNewInstance$default = C32278mWb.Activity.newInstance$default(C32278mWb.Companion, this.copydefault.djBIcL().AEQbTJ(), null, 2, null);
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c32278mWbNewInstance$default.show(childFragmentManager);
            }
        }
    }

    public static final class TaskDescription implements InterfaceC32154mRm {
        public TaskDescription() {
        }

        @Override // o.InterfaceC32154mRm
        public void AEQbTJ(java.util.List<MarketBuySellKLinePoint> list) {
            C36250oUv c36250oUv;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            Intrinsics.checkNotNullParameter(list, "");
            mSK.this.isConnected.clear();
            mSK.this.isConnected.addAll(C32267mVr.EZpvd(list));
            oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt != null && (c36250oUv2 = onuOLrzqt.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(mTR.EZpvd.AEQbTJ());
            }
            oNU onuOLrzqt2 = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt2 == null || (c36250oUv = onuOLrzqt2.copydefault) == null) {
                return;
            }
            c36250oUv.OLrzqt(C32267mVr.EZpvd(list), java.lang.Boolean.TRUE);
        }

        @Override // o.InterfaceC32154mRm
        public void KWHzl(MarketBuySellKLinePoint marketBuySellKLinePoint) {
            C36250oUv c36250oUv;
            Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
            mSK.this.DbNXlk.put(marketBuySellKLinePoint.djBIcL(), C32267mVr.copydefault(marketBuySellKLinePoint));
            oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt == null || (c36250oUv = onuOLrzqt.copydefault) == null) {
                return;
            }
            mSK msk = mSK.this;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(c36250oUv.getFieldNames()));
            if (msk.DbNXlk.containsKey(strGEmmrt)) {
                c36250oUv.OLrzqt(C56402yEa.EZpvd(msk.DbNXlk.get(strGEmmrt)), java.lang.Boolean.FALSE);
                msk.DbNXlk.remove(strGEmmrt);
            }
        }
    }

    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL().EZpvd(valueOf().AEQbTJ(), valueOf().copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public oNU KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNU onuKWHzl = oNU.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onuKWHzl, "");
        return onuKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oNU onu, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(onu, "");
        AhwBna();
        onu.copydefault.setCurrentDataSource("");
        mTH.copydefault.valueOf();
        oWN.KWHzl(C33570myu.djBIcL(requireContext()));
        onu.djBIcL.EZpvd(true);
        onu.djBIcL.setData(valueOf().AEQbTJ());
        C36250oUv c36250oUv = onu.copydefault;
        Intrinsics.checkNotNullExpressionValue(c36250oUv, "");
        OLrzqt(c36250oUv);
        onu.copydefault.setActionListener(this);
        onu.copydefault.setChartSelectionListener(this);
        int sPTimeInterval = onu.copydefault.wlaJM().getSPTimeInterval();
        if (mTL.KWHzl.copydefault(sPTimeInterval) != null) {
            fARcdN().KWHzl(new C32144mRc(AkhnZx(), AuCTel(), new WeakReference(this.values)));
            mQW mqwKWHzl = fARcdN().KWHzl();
            if (mqwKWHzl != null) {
                mqwKWHzl.AEQbTJ();
            }
            fARcdN().EZpvd(new mQW(AkhnZx(), AuCTel(), new WeakReference(this.fetchVPNInfo)));
        }
        OLrzqt(C33129mqd.gEmmrt(java.lang.Integer.valueOf(sPTimeInterval)));
        C55052xcf c55052xcf = onu.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        c55052xcf.setVisibility(valueOf().AEQbTJ() ? 0 : 8);
        android.view.View view = onu.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(valueOf().AEQbTJ() ? 0 : 8);
        if (valueOf().AEQbTJ()) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new KlineVerticalFragment$initView$2(this, onu, null), 3, null);
            C55052xcf c55052xcf2 = onu.KWHzl;
            c55052xcf2.setOnClickListener(new Application(c55052xcf2, 1000L, this));
        }
        fJNWhG();
        getFieldNames();
    }

    public final void EZpvd(ChartType chartType) {
        java.lang.String tokenSymbol;
        LatestMarketInfoBean second;
        java.lang.String chainName;
        LatestMarketInfoBean second2;
        java.lang.String strAuCTel = AuCTel();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = fIwbmz().AhwBna().getValue();
        java.lang.String str = "";
        if (value == null || (second2 = value.getSecond()) == null || (tokenSymbol = second2.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        java.lang.String strAkhnZx = AkhnZx();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = fIwbmz().AhwBna().getValue();
        if (value2 != null && (second = value2.getSecond()) != null && (chainName = second.getChainName()) != null) {
            str = chainName;
        }
        mRG.OLrzqt(strAuCTel, tokenSymbol, strAkhnZx, str, chartType == ChartType.PRICE ? FirebaseAnalytics.Param.PRICE : "mcap");
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String tokenSymbol;
        LatestMarketInfoBean second;
        java.lang.String chainName;
        LatestMarketInfoBean second2;
        java.lang.String strAuCTel = AuCTel();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = fIwbmz().AhwBna().getValue();
        java.lang.String str2 = "";
        if (value == null || (second2 = value.getSecond()) == null || (tokenSymbol = second2.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        java.lang.String strAkhnZx = AkhnZx();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = fIwbmz().AhwBna().getValue();
        if (value2 != null && (second = value2.getSecond()) != null && (chainName = second.getChainName()) != null) {
            str2 = chainName;
        }
        mRG.copydefault(strAuCTel, tokenSymbol, strAkhnZx, str2, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        pGX pgx;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        LinkedHashMap<java.lang.String, ChartArea> areas;
        oNU onu = (oNU) KWHzl();
        copydefault(onu != null ? onu.copydefault : null);
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (c36250oUv2 = onu2.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv2.AkhnZx()) != null && (areas = chartViewOutSideConfigAkhnZx.getAreas()) != null && areas.size() > 0) {
            mTL mtl = mTL.KWHzl;
            oNU onu3 = (oNU) KWHzl();
            mtl.OLrzqt(onu3 != null ? onu3.copydefault : null);
        }
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        oNU onu4 = (oNU) KWHzl();
        this.fARcdN = C36312oXc.AEQbTJ(onu4 != null ? onu4.copydefault : null);
        oNU onu5 = (oNU) KWHzl();
        if (onu5 != null && (c36250oUv = onu5.copydefault) != null) {
            c36250oUv.setCurrentStateMachine(this.fARcdN);
        }
        oNU onu6 = (oNU) KWHzl();
        if (onu6 == null || (pgx = onu6.djBIcL) == null) {
            return;
        }
        pgx.setData(valueOf().AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC32287mWk
    public void AEQbTJ(@NotNull ChartType chartType) {
        C36250oUv c36250oUv;
        C55052xcf c55052xcf;
        java.lang.String value = "";
        Intrinsics.checkNotNullParameter(chartType, "");
        if (chartType == djBIcL().AEQbTJ()) {
            return;
        }
        OLrzqt(true);
        hDKMBd();
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c55052xcf = onu.KWHzl) != null) {
            c55052xcf.setTitle(copydefault(chartType));
        }
        djBIcL().OLrzqt(chartType);
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (c36250oUv = onu2.copydefault) != null) {
            c36250oUv.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUv.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, chartType == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
            copydefault(c36250oUv);
            oUJ ouj = oUJ.KWHzl;
            java.lang.String strKWHzl = mTL.KWHzl.KWHzl();
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
            if (chartViewOutSideConfigAkhnZx != null && chartViewOutSideConfigAkhnZx.isMarketCap()) {
                value = KlineType.MARKET_CAP.getValue();
            }
            ouj.OLrzqt(strKWHzl + value, "SPOT");
            values();
        }
        KWHzl(fARcdN().OLrzqt().getValue());
        AEQbTJ(fARcdN().EZpvd().getValue());
    }

    public final void EZpvd(@NotNull InterfaceC32157mRp interfaceC32157mRp) {
        Intrinsics.checkNotNullParameter(interfaceC32157mRp, "");
        this.AkhnZx = new WeakReference<>(interfaceC32157mRp);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getNewProxyInstance() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        oNU onu = (oNU) KWHzl();
        java.lang.Integer numValueOf = (onu == null || (c36250oUv2 = onu.copydefault) == null || (templateSettingWlaJM = c36250oUv2.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : java.lang.Integer.valueOf(sideIndicatorNames.size());
        int iRlQdEF = C36246oUr.copydefault().RlQdEF();
        int iAccept = C36246oUr.copydefault().accept();
        Intrinsics.copydefault(numValueOf);
        this.AuCTel = iRlQdEF + (iAccept * numValueOf.intValue());
        int iIntValue = (int) (this.AuCTel * ((((SPUtils.getInt("chart_height", 25).intValue() - 50) * 1.0f) / 200.0f) + 1.0f));
        oNU onu2 = (oNU) KWHzl();
        if (onu2 == null || (c36250oUv = onu2.copydefault) == null) {
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
        final Function1 function1 = new Function1() { // from class: o.mSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mSK.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mSV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mSK.AEQbTJ(function1, obj);
            }
        });
        oNU onu = (oNU) KWHzl();
        if (onu != null && (pgx = onu.djBIcL) != null) {
            pgx.setOnItemSelectListener(new Function1() { // from class: o.mSJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mSK.djBIcL(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        fARcdN().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.mSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mSK.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        fIwbmz().fJNWhG().observe(this, new LoaderManager(new Function1() { // from class: o.mSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mSK.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUN.collectOnLifecycle$default(viewLifecycleOwner, gEmmrt().KWHzl(), null, new PendingIntent(), 2, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mUN.collectOnLifecycle$default(viewLifecycleOwner2, gEmmrt().copydefault(), null, new Dialog(), 2, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mUN.collectOnLifecycle$default(viewLifecycleOwner3, fARcdN().OLrzqt(), null, new FragmentManager(), 2, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mUN.collectOnLifecycle$default(viewLifecycleOwner4, djBIcL().copydefault(), null, new Fragment(), 2, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mUN.collectOnLifecycle$default(viewLifecycleOwner5, fARcdN().EZpvd(), null, new SharedElementCallback(), 2, null);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(mSK msk, java.lang.String str) {
        msk.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
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
    public static final Unit djBIcL(final mSK msk, int i) {
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
                mTL mtl = mTL.KWHzl;
                androidx.fragment.app.FragmentManager childFragmentManager = msk.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                oNU onu = (oNU) msk.KWHzl();
                C36250oUv c36250oUv3 = onu != null ? onu.copydefault : null;
                oNU onu2 = (oNU) msk.KWHzl();
                mtl.OLrzqt(childFragmentManager, c36250oUv3, onu2 != null ? onu2.djBIcL : null, msk.fARcdN, msk.AkhnZx(), msk.AuCTel(), msk.valueOf().AEQbTJ(), new Function1() { // from class: o.mSW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mSK.copydefault(this.EZpvd, (TimeIntervalItem) obj);
                    }
                });
            } else {
                InterfaceC39509ptg interfaceC39509ptgDjBIcL2 = pfn.djBIcL();
                if (interfaceC39509ptgDjBIcL2 != null && (arrayListKWHzl = interfaceC39509ptgDjBIcL2.KWHzl()) != null && (timeIntervalItem = (TimeIntervalItem) CollectionsKt___CollectionsKt.AkhnZx(arrayListKWHzl, i)) != null) {
                    oNU onu3 = (oNU) msk.KWHzl();
                    if (onu3 != null && onu3.copydefault != null) {
                        mTL mtl2 = mTL.KWHzl;
                        oNU onu4 = (oNU) msk.KWHzl();
                        mtl2.OLrzqt(onu4 != null ? onu4.copydefault : null, timeIntervalItem, msk.fARcdN, msk.AkhnZx(), msk.AuCTel());
                    }
                    msk.OLrzqt(true);
                    C32144mRc c32144mRcAEQbTJ = msk.fARcdN().AEQbTJ();
                    if (c32144mRcAEQbTJ != null) {
                        java.lang.String strAEQbTJ = mTL.KWHzl.AEQbTJ(timeIntervalItem);
                        oNU onu5 = (oNU) msk.KWHzl();
                        if (onu5 != null && (c36250oUv2 = onu5.copydefault) != null) {
                            objValueOf = java.lang.Long.valueOf(c36250oUv2.fARcdN());
                        }
                        c32144mRcAEQbTJ.copydefault(strAEQbTJ, C33129mqd.gEmmrt(objValueOf));
                    }
                    oNU onu6 = (oNU) msk.KWHzl();
                    if (onu6 != null && (c36250oUv = onu6.copydefault) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                        templateSettingWlaJM.putTimeInterval(timeIntervalItem.timeInterval);
                    }
                    oNU onu7 = (oNU) msk.KWHzl();
                    if (onu7 != null && (pgx = onu7.djBIcL) != null) {
                        pgx.setData(msk.valueOf().AEQbTJ());
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(mSK msk, TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        msk.OLrzqt(true);
        C32144mRc c32144mRcAEQbTJ = msk.fARcdN().AEQbTJ();
        if (c32144mRcAEQbTJ != null) {
            java.lang.String strAEQbTJ = mTL.KWHzl.AEQbTJ(timeIntervalItem);
            oNU onu = (oNU) msk.KWHzl();
            c32144mRcAEQbTJ.copydefault(strAEQbTJ, C33129mqd.gEmmrt((onu == null || (c36250oUv = onu.copydefault) == null) ? null : java.lang.Long.valueOf(c36250oUv.fARcdN())));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(mSK msk, java.util.List list) {
        oNU onu;
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oNU onu2 = (oNU) msk.KWHzl();
        if (onu2 != null && (c36250oUv3 = onu2.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(list.size() < C33129mqd.AhwBna("300"));
        }
        ChartDataViewModel chartDataViewModelDjBIcL = msk.djBIcL();
        Intrinsics.copydefault(list);
        java.util.List<oUO> listCopydefault = chartDataViewModelDjBIcL.copydefault(list);
        oNU onu3 = (oNU) msk.KWHzl();
        if (onu3 != null && (c36250oUv2 = onu3.copydefault) != null) {
            c36250oUv2.KWHzl(listCopydefault);
        }
        java.lang.String strOLrzqt = msk.fARcdN().OLrzqt(msk.AkhnZx());
        java.lang.String strCopydefault = msk.gEmmrt().EZpvd().copydefault();
        if (C33129mqd.KWHzl((java.util.Collection) list) && ((strOLrzqt.length() > 0 || strCopydefault.length() > 0) && (onu = (oNU) msk.KWHzl()) != null && (c36250oUv = onu.copydefault) != null)) {
            c36250oUv.OLrzqt(msk.isConnected, java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(mSK msk, java.lang.Boolean bool) {
        msk.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(TokenFilter tokenFilter, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt != null && (c36250oUv = onuOLrzqt.copydefault) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(templateSettingWlaJM.getSPTimeInterval());
                mSK msk = mSK.this;
                TimeIntervalItem timeIntervalItemCopydefault = mTL.KWHzl.copydefault(numAEQbTJ.intValue());
                if (timeIntervalItemCopydefault != null) {
                    msk.KWHzl(timeIntervalItemCopydefault);
                }
            }
            mSK.this.zLjUOn();
            return Unit.INSTANCE;
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(ChartDetailSubTabName chartDetailSubTabName, Continuation<? super Unit> continuation) {
            C36250oUv c36250oUv;
            TemplateSetting templateSettingWlaJM;
            oNU onuOLrzqt = mSK.OLrzqt(mSK.this);
            if (onuOLrzqt != null && (c36250oUv = onuOLrzqt.copydefault) != null && (templateSettingWlaJM = c36250oUv.wlaJM()) != null) {
                java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(templateSettingWlaJM.getSPTimeInterval());
                mSK msk = mSK.this;
                TimeIntervalItem timeIntervalItemCopydefault = mTL.KWHzl.copydefault(numAEQbTJ.intValue());
                if (timeIntervalItemCopydefault != null) {
                    msk.KWHzl(timeIntervalItemCopydefault);
                }
            }
            mSK.this.fARcdN().OLrzqt(chartDetailSubTabName);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<KlineOpenOrderBean> list, Continuation<? super Unit> continuation) {
            mSK.this.KWHzl(list);
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
        public final java.lang.Object emit(ChartDataViewModel.Application application, Continuation<? super Unit> continuation) {
            oNU onuOLrzqt;
            C36250oUv c36250oUv;
            if ((application instanceof ChartDataViewModel.Application.ActionBar) && (onuOLrzqt = mSK.OLrzqt(mSK.this)) != null && (c36250oUv = onuOLrzqt.copydefault) != null) {
                mSK msk = mSK.this;
                c36250oUv.OLrzqt(ChartViewOutSideConfig.copy$default(c36250oUv.AkhnZx(), false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, ((ChartDataViewModel.Application.ActionBar) application).copydefault() == ChartType.MARKET_CAP, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, 2147352575, null));
                oUJ ouj = oUJ.KWHzl;
                java.lang.String strKWHzl = mTL.KWHzl.KWHzl();
                ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx();
                ouj.OLrzqt(strKWHzl + ((chartViewOutSideConfigAkhnZx == null || !chartViewOutSideConfigAkhnZx.isMarketCap()) ? "" : KlineType.MARKET_CAP.getValue()), "SPOT");
                msk.values();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<KlineDexAvgDataBean> list, Continuation<? super Unit> continuation) {
            mSK.this.AEQbTJ(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(TimeIntervalItem timeIntervalItem) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        this.DbNXlk.clear();
        this.isConnected.clear();
        java.lang.String strOLrzqt = fARcdN().OLrzqt(AkhnZx());
        TokenFilter tokenFilterEZpvd = gEmmrt().EZpvd();
        java.lang.String strCopydefault = tokenFilterEZpvd.copydefault();
        if ((tokenFilterEZpvd.EZpvd().size() < 2 && strOLrzqt.length() > 0) || strCopydefault.length() > 0) {
            mQW mqwKWHzl = fARcdN().KWHzl();
            if (mqwKWHzl != null) {
                mqwKWHzl.copydefault(mTL.KWHzl.OLrzqt(timeIntervalItem.timeInterval), strOLrzqt, strCopydefault);
                return;
            }
            return;
        }
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c36250oUv = onu.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setMShowHistoryOrder(false);
        }
        mQW mqwKWHzl2 = fARcdN().KWHzl();
        if (mqwKWHzl2 != null) {
            mqwKWHzl2.AEQbTJ();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, o.AbstractC32998moE
    public void onInvisible() {
        oNU onu;
        C36250oUv c36250oUv;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (c36250oUv4 = onu2.copydefault) != null) {
            c36250oUv4.QUSxYX();
        }
        oNU onu3 = (oNU) KWHzl();
        if (onu3 != null && (c36250oUv3 = onu3.copydefault) != null) {
            c36250oUv3.OLrzqt();
        }
        if (!this.djBIcL || (onu = (oNU) KWHzl()) == null || (c36250oUv = onu.copydefault) == null || (mapEjfBZ = c36250oUv.ejfBZ()) == null) {
            return;
        }
        oNU onu4 = (oNU) KWHzl();
        com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get((onu4 == null || (c36250oUv2 = onu4.copydefault) == null) ? null : c36250oUv2.fIwbmz());
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
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c36250oUv = onu.copydefault) != null) {
            c36250oUv.setLoadHistoryKlineListener(new C36250oUv.PendingIntent() { // from class: o.mST
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C36250oUv.PendingIntent
                public final void AEQbTJ() {
                    mSK.isConnected(this.AEQbTJ);
                }
            });
        }
        if (this.djBIcL) {
            fetchVPNInfo();
            this.djBIcL = false;
        }
    }

    public static final void isConnected(mSK msk) {
        msk.ejfBZ();
    }

    public final void fetchVPNInfo() {
        fJNWhG();
        getNewProxyInstance();
        DbNXlk();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        oNU onu;
        pGY pgy;
        pGY pgy2;
        oNU onu2 = (oNU) KWHzl();
        if (onu2 == null || (c36250oUv = onu2.copydefault) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        oNU onu3 = (oNU) KWHzl();
        if (onu3 != null && (pgy2 = onu3.AYXKKw) != null) {
            pgy2.setMainIndicatorSelect();
        }
        java.util.ArrayList<java.lang.String> sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames();
        if (sideIndicatorNames == null || (onu = (oNU) KWHzl()) == null || (pgy = onu.AYXKKw) == null) {
            return;
        }
        pgy.setSideIndicators(sideIndicatorNames);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C36250oUv c36250oUv;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        C36250oUv c36250oUv5;
        C36250oUv c36250oUv6;
        this.AkhnZx = new WeakReference<>(null);
        C36246oUr.copydefault().AubY(false);
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c36250oUv6 = onu.copydefault) != null) {
            c36250oUv6.RcXXUw();
        }
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (c36250oUv5 = onu2.copydefault) != null) {
            c36250oUv5.copydefault();
        }
        oNU onu3 = (oNU) KWHzl();
        if (onu3 != null && (c36250oUv4 = onu3.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv4.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(false);
        }
        oNU onu4 = (oNU) KWHzl();
        if (onu4 != null && (c36250oUv3 = onu4.copydefault) != null) {
            c36250oUv3.setActionListener(null);
        }
        oNU onu5 = (oNU) KWHzl();
        if (onu5 != null && (c36250oUv2 = onu5.copydefault) != null) {
            c36250oUv2.setLoadHistoryKlineListener(null);
        }
        oNU onu6 = (oNU) KWHzl();
        if (onu6 != null && (c36250oUv = onu6.copydefault) != null) {
            c36250oUv.setChartSelectionListener(null);
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
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        fARcdN().gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C55113xdn c55113xdn4;
        C55113xdn c55113xdn5;
        if (z) {
            oNU onu = (oNU) KWHzl();
            if (onu != null && (c55113xdn5 = onu.AkhnZx) != null) {
                c55113xdn5.setVisibility(0);
            }
            oNU onu2 = (oNU) KWHzl();
            if (onu2 != null && (c55113xdn4 = onu2.AkhnZx) != null) {
                c55113xdn4.setAnimation(C52761wXj.PendingIntent.isConnected);
            }
            oNU onu3 = (oNU) KWHzl();
            if (onu3 == null || (c55113xdn3 = onu3.AkhnZx) == null) {
                return;
            }
            c55113xdn3.playAnimation();
            return;
        }
        oNU onu4 = (oNU) KWHzl();
        if (onu4 != null && (c55113xdn2 = onu4.AkhnZx) != null) {
            c55113xdn2.setVisibility(8);
        }
        oNU onu5 = (oNU) KWHzl();
        if (onu5 == null || (c55113xdn = onu5.AkhnZx) == null) {
            return;
        }
        c55113xdn.cancelAnimation();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        oNU onu = (oNU) KWHzl();
        if (onu == null || (c36250oUv = onu.copydefault) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        mTL mtl = mTL.KWHzl;
        TimeIntervalItem timeIntervalItemCopydefault = mtl.copydefault(iIntValue);
        if (timeIntervalItemCopydefault != null) {
            oNU onu2 = (oNU) KWHzl();
            if (onu2 != null && (c36250oUv3 = onu2.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv3.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.setHistoryCandlesLoading(true);
            }
            ChartViewModel chartViewModelFARcdN = fARcdN();
            java.lang.String strAkhnZx = AkhnZx();
            java.lang.String strAuCTel = AuCTel();
            oNU onu3 = (oNU) KWHzl();
            DexTokenCandleParam dexTokenCandleParam = new DexTokenCandleParam(strAkhnZx, strAuCTel, C33129mqd.gEmmrt((onu3 == null || (c36250oUv2 = onu3.copydefault) == null) ? null : java.lang.Long.valueOf(c36250oUv2.fARcdN())), null, mtl.AEQbTJ(timeIntervalItemCopydefault), null, null, 104, null);
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            chartViewModelFARcdN.copydefault("default_trade", dexTokenCandleParam, viewLifecycleOwner);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        C36250oUv c36250oUv;
        TemplateSetting templateSettingWlaJM;
        C36250oUv c36250oUv2;
        C36246oUr.copydefault().AhwBna(false);
        java.lang.Long lValueOf = null;
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        oNU onu = (oNU) KWHzl();
        this.fARcdN = C36312oXc.AEQbTJ(onu != null ? onu.copydefault : null);
        oNU onu2 = (oNU) KWHzl();
        if (onu2 == null || (c36250oUv = onu2.copydefault) == null || (templateSettingWlaJM = c36250oUv.wlaJM()) == null) {
            return;
        }
        int iIntValue = java.lang.Integer.valueOf(templateSettingWlaJM.getSPTimeInterval()).intValue();
        mTL mtl = mTL.KWHzl;
        TimeIntervalItem timeIntervalItemCopydefault = mtl.copydefault(iIntValue);
        if (timeIntervalItemCopydefault != null) {
            OLrzqt(true);
            C32144mRc c32144mRcAEQbTJ = fARcdN().AEQbTJ();
            if (c32144mRcAEQbTJ != null) {
                java.lang.String strAEQbTJ = mtl.AEQbTJ(timeIntervalItemCopydefault);
                oNU onu3 = (oNU) KWHzl();
                if (onu3 != null && (c36250oUv2 = onu3.copydefault) != null) {
                    lValueOf = java.lang.Long.valueOf(c36250oUv2.fARcdN());
                }
                c32144mRcAEQbTJ.copydefault(strAEQbTJ, C33129mqd.gEmmrt(lValueOf));
            }
        }
    }

    private final void getFieldNames() {
        ChartViewModel.getAvgPrice$default(fARcdN(), AkhnZx(), AuCTel(), null, null, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<KlineOpenOrderBean> list) {
        oNU onu = (oNU) KWHzl();
        if (onu != null) {
            if (djBIcL().AEQbTJ() == ChartType.MARKET_CAP) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (KlineOpenOrderBean klineOpenOrderBean : list) {
                    KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
                    klineOpenOrderBean2.setOrdType(klineOpenOrderBean.getOrdType());
                    klineOpenOrderBean2.setAmountNoSign(klineOpenOrderBean.getAmountNoSign());
                    klineOpenOrderBean2.setSide(klineOpenOrderBean.getSide());
                    klineOpenOrderBean2.setPrice(C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(klineOpenOrderBean.getPrice()) * C33129mqd.AEQbTJ(valueOf().copydefault()))));
                    arrayList.add(klineOpenOrderBean2);
                }
                list = arrayList;
            }
            onu.copydefault.AkhnZx().setOpenOrderDataList(list);
            onu.copydefault.invalidate();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.util.List<KlineDexAvgDataBean> list) {
        oNU onu = (oNU) KWHzl();
        if (onu != null) {
            if (djBIcL().AEQbTJ() == ChartType.MARKET_CAP) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (KlineDexAvgDataBean klineDexAvgDataBean : list) {
                    KlineDexAvgDataBean klineDexAvgDataBean2 = new KlineDexAvgDataBean();
                    klineDexAvgDataBean2.setAccAvgPx(C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(klineDexAvgDataBean.getAccAvgPx()) * C33129mqd.AEQbTJ(valueOf().copydefault()))));
                    klineDexAvgDataBean2.setFilterAddress(klineDexAvgDataBean.getFilterAddress());
                    klineDexAvgDataBean2.setPnlAmount(klineDexAvgDataBean.getPnlAmount());
                    klineDexAvgDataBean2.setPnlRate(klineDexAvgDataBean.getPnlRate());
                    klineDexAvgDataBean2.setPositionAmount(klineDexAvgDataBean.getPositionAmount());
                    arrayList.add(klineDexAvgDataBean2);
                }
                list = arrayList;
            }
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx = onu.copydefault.AkhnZx();
            KlineSpotAverageBean klineSpotAverageBean = new KlineSpotAverageBean();
            klineSpotAverageBean.setShowSpotAverageLine(true);
            klineSpotAverageBean.setDexAvgDataList(list);
            chartViewOutSideConfigAkhnZx.setKlineSpotAverageBean(klineSpotAverageBean);
            onu.copydefault.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        TokenFilter tokenFilterEZpvd = gEmmrt().EZpvd();
        ChartDetailSubTabName value = gEmmrt().copydefault().getValue();
        if (tokenFilterEZpvd.EZpvd().size() == 1) {
            fARcdN().EZpvd(AkhnZx(), AuCTel(), (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(tokenFilterEZpvd.EZpvd()), value);
        } else {
            fARcdN().KWHzl(value);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void AhwBna() {
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
        chartViewOutSideConfig.setShowSpotAveragePrice(mtr.EZpvd());
        chartViewOutSideConfig.setScreen(true);
        chartViewOutSideConfig.setChartTag("sp_timeinterval_okx_cedefi");
        chartViewOutSideConfig.setMode("cedefi_mode");
        chartViewOutSideConfig.setDefaultTime(1);
        chartViewOutSideConfig.setMarketCap(false);
        chartViewOutSideConfig.setKLineInfiniteScale(true);
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c36250oUv2 = onu.copydefault) != null) {
            c36250oUv2.OLrzqt(chartViewOutSideConfig);
        }
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (c36250oUv = onu2.copydefault) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
            chartViewOutSideConfigAkhnZx.setShowCountdown(false);
        }
        pFN pfn = pFN.OLrzqt;
        mTH mth = mTH.copydefault;
        pfn.EZpvd(mth.copydefault(), mth);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public void OLrzqt(@NotNull C36250oUv c36250oUv) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        pGY pgy;
        LatestMarketInfoBean second;
        java.lang.String tokenSymbol;
        Intrinsics.checkNotNullParameter(c36250oUv, "");
        this.fARcdN = C36312oXc.AEQbTJ((C36250oUv) null);
        mTL mtl = mTL.KWHzl;
        oNU onu = (oNU) KWHzl();
        pGY pgy2 = onu != null ? onu.AYXKKw : null;
        java.lang.String strAkhnZx = AkhnZx();
        java.lang.String strAuCTel = AuCTel();
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = fIwbmz().AhwBna().getValue();
        mTI.StateListAnimator.initChartView$default(mtl, c36250oUv, pgy2, strAkhnZx, strAuCTel, (value == null || (second = value.getSecond()) == null || (tokenSymbol = second.getTokenSymbol()) == null) ? "" : tokenSymbol, false, 32, null);
        oNU onu2 = (oNU) KWHzl();
        if (onu2 != null && (pgy = onu2.AYXKKw) != null) {
            pgy.setOnItemSelectListener(new Function1() { // from class: o.mSL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mSK.EZpvd(this.AEQbTJ, (MarketTypeSelect) obj);
                }
            });
        }
        oNU onu3 = (oNU) KWHzl();
        if (onu3 != null && (appCompatImageView2 = onu3.gEmmrt) != null) {
            mUO.setOnDoubleCheckClickListener$default(appCompatImageView2, 0L, new Function1() { // from class: o.mSM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mSK.copydefault(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
        }
        oNU onu4 = (oNU) KWHzl();
        if (onu4 == null || (appCompatImageView = onu4.values) == null) {
            return;
        }
        mUO.setOnDoubleCheckClickListener$default(appCompatImageView, 0L, new Function1() { // from class: o.mSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mSK.EZpvd(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final mSK msk, MarketTypeSelect marketTypeSelect) {
        C36250oUv c36250oUv;
        Intrinsics.checkNotNullParameter(marketTypeSelect, "");
        oNU onu = (oNU) msk.KWHzl();
        if (onu != null && (c36250oUv = onu.copydefault) != null) {
            mTL.KWHzl.copydefault(c36250oUv, marketTypeSelect, new Function1() { // from class: o.mSN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return mSK.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(mSK msk, int i) {
        msk.AuCTel += i;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r9v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final mSK msk, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        mTL mtl = mTL.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = msk.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        oNU onu = (oNU) msk.KWHzl();
        C36250oUv c36250oUv = onu != null ? onu.copydefault : null;
        oNU onu2 = (oNU) msk.KWHzl();
        pGX pgx = onu2 != null ? onu2.djBIcL : null;
        oNU onu3 = (oNU) msk.KWHzl();
        mtl.AEQbTJ(childFragmentManager, c36250oUv, pgx, onu3 != null ? onu3.AYXKKw : null, msk.valueOf().AEQbTJ(), new Function1() { // from class: o.mSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mSK.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(mSK msk, int i) {
        msk.AuCTel += i;
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(mSK msk, android.view.View view) {
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        Intrinsics.checkNotNullParameter(view, "");
        msk.fIwbmz = msk.fJNWhG;
        MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Integer>> mutableLiveDataValues = msk.fIwbmz().values();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        oNU onu = (oNU) msk.KWHzl();
        mutableLiveDataValues.setValue(C56390yDp.OLrzqt(bool, java.lang.Integer.valueOf((onu == null || (c36250oUv = onu.copydefault) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null) ? 0 : chartViewOutSideConfigAkhnZx.getTopPanelHeight())));
        InterfaceC35976oKr klineSettingFragment$default = oKA.TaskDescription.getKlineSettingFragment$default((oKA) C43251rlk.copydefault(oKA.class), "SPOT", true, true, false, false, false, false, true, true, false, true, false, true, true, null, EntryType.CEDEFI_DEX, 16448, null);
        oNU onu2 = (oNU) msk.KWHzl();
        klineSettingFragment$default.OLrzqt(new mTS(new WeakReference(onu2 != null ? onu2.copydefault : null), msk.fIwbmz(), msk.AuCTel, msk.fIwbmz));
        androidx.fragment.app.FragmentManager childFragmentManager = msk.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = mSK.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        klineSettingFragment$default.copydefault(childFragmentManager, simpleName);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        C55173xeu c55173xeu;
        Group group;
        oNU onu = (oNU) KWHzl();
        if (onu != null && (group = onu.valueOf) != null) {
            group.setVisibility(8);
        }
        oNU onu2 = (oNU) KWHzl();
        if (onu2 == null || (c55173xeu = onu2.AhwBna) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        java.lang.String string = getString(C35964oKf.Fragment.hCLrkq);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C35966oKh.TaskDescription.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((java.lang.CharSequence) string2);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string3 = getString(C35964oKf.Fragment.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mSK.valueOf(this.copydefault, view);
            }
        });
    }

    public static final void valueOf(mSK msk, android.view.View view) {
        msk.values();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C55173xeu c55173xeu;
        Group group;
        oNU onu = (oNU) KWHzl();
        if (onu != null && (group = onu.valueOf) != null) {
            group.setVisibility(8);
        }
        oNU onu2 = (oNU) KWHzl();
        if (onu2 == null || (c55173xeu = onu2.AhwBna) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C32392mcI.Dialog.hlkKmr));
        c55173xeu.setSubTitle((java.lang.CharSequence) "");
        c55173xeu.setRetry("");
        c55173xeu.setEmptyTypeImage(6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wlaJM() {
        oNU onu = (oNU) KWHzl();
        if (onu != null) {
            onu.valueOf.setVisibility(0);
            onu.AhwBna.setVisibility(8);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public void copydefault(C36250oUv c36250oUv) {
        mTL mtl = mTL.KWHzl;
        mtl.EZpvd(c36250oUv, mtl.copydefault(c36250oUv, AkhnZx(), AuCTel()), this.fARcdN);
    }

    @Override // o.InterfaceC39500ptX
    public void setViewPagerScroll(boolean z) {
        fIwbmz().AEQbTJ().setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C36250oUv c36250oUv;
        java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> mapEjfBZ;
        C36250oUv c36250oUv2;
        oNU onu = (oNU) KWHzl();
        if (onu != null && (c36250oUv = onu.copydefault) != null && (mapEjfBZ = c36250oUv.ejfBZ()) != null) {
            oNU onu2 = (oNU) KWHzl();
            com.okinc.kline.library.data.DataSource dataSource = mapEjfBZ.get((onu2 == null || (c36250oUv2 = onu2.copydefault) == null) ? null : c36250oUv2.fIwbmz());
            if (dataSource != null) {
                dataSource.KWHzl();
            }
        }
        C36246oUr.copydefault().valueOf();
    }

    public final java.lang.String copydefault(ChartType chartType) {
        int i;
        int i2 = ActionBar.EZpvd[chartType.ordinal()];
        if (i2 == 1) {
            i = C35964oKf.Fragment.DMb;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C35964oKf.Fragment.zpGcln;
        }
        android.content.Context context = getContext();
        java.lang.String string = context != null ? context.getString(i) : null;
        return string == null ? "" : string;
    }

    @Override // o.C36250oUv.ActionBar
    public void aI_() {
        C55489xks.startVibratorIfCan$default(0L, 1, null);
    }

    @Override // o.C36250oUv.ActionBar
    public void copydefault(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            AubY();
        }
    }
}
