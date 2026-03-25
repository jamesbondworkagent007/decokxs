package o;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.dto.EarnStakingConfig;
import com.okinc.tradingbot.impl.dto.LeveragePrincipalConfig;
import com.okinc.tradingbot.impl.dto.StakingConfig;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$initObserver$7;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$initObserver$8;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualViewModel;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageManualPresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.EstimatedApyVo;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.FundingRateArbCoin;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.HighestApyOverview;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C52852waT;
import o.C52858waZ;
import o.C52914wbc;
import o.C52917wbf;
import o.C52937wbz;
import o.C52946wcH;
import o.C55688xof;
import o.C55770xqH;
import o.InterfaceC54581xNr;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C52903wbR extends AbstractC52893wbH<uSW, SmartArbitrageManualPresenter> {
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public CompoundButton.OnCheckedChangeListener DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public FundingRateArbCoin fARcdN;
    public Function0<Unit> fJNWhG;
    public Function0<Unit> getNewProxyInstance;
    public java.lang.String hDKMBd;
    public java.lang.String uzCIH;
    public final InterfaceC56387yDm valueOf;
    public float values;
    public final int AYXKKw = C48033uCm.Activity.RuDPQV;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wbV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52903wbR.ejfBZ(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.wbT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52903wbR.getFieldNames(this.copydefault);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wck
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52903wbR.getNewProxyInstance(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.wbR$ContextWrapper */
    public static final /* synthetic */ class ContextWrapper implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SmartArbitrageManualPresenter gEmmrt(C52903wbR c52903wbR) {
        return (SmartArbitrageManualPresenter) c52903wbR.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uSW isConnected(C52903wbR c52903wbR) {
        return (uSW) c52903wbR.gGvvIC();
    }

    public C52903wbR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$7
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbitrageManualViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.fragment.SmartArbitrageManualFragment$special$$inlined$viewModels$default$10
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52903wbR.djBIcL();
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.wcy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52903wbR.iwGUEr(this.KWHzl);
            }
        });
        this.values = 1.0f;
    }

    public static final C53518wmx ejfBZ(C52903wbR c52903wbR) {
        android.content.Context contextRequireContext = c52903wbR.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx zuBGHE() {
        return (C53518wmx) this.gEmmrt.getValue();
    }

    public final C53518wmx hDKMBd() {
        return (C53518wmx) this.fetchVPNInfo.getValue();
    }

    public static final C53518wmx getFieldNames(C52903wbR c52903wbR) {
        android.content.Context contextRequireContext = c52903wbR.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C53518wmx c53518wmx = new C53518wmx(contextRequireContext, null, 0, 6, null);
        C53518wmx.setLoginCheck$default(c53518wmx, false, null, 2, null);
        C53518wmx.setTradeLevelCheck$default(c53518wmx, false, null, null, 6, null);
        c53518wmx.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DWgRXt), TextView.BufferType.NORMAL);
        c53518wmx.setButtonType(260);
        c53518wmx.setGravity(17);
        c53518wmx.setContentDescription("previewButton");
        return c53518wmx;
    }

    private final C7773aqE sSMYrx() {
        return (C7773aqE) this.isConnected.getValue();
    }

    public static final C7773aqE getNewProxyInstance(C52903wbR c52903wbR) {
        C7773aqE c7773aqE = new C7773aqE(c52903wbR.getContext());
        c7773aqE.setOrientation(0);
        int iDjBIcL = C33570myu.djBIcL(C32979mnm.EZpvd.OLrzqt());
        android.content.Context contextRequireContext = c52903wbR.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iCopydefault = (iDjBIcL - C55298xhM.copydefault(70.0f, contextRequireContext)) / 2;
        C53518wmx c53518wmxHDKMBd = c52903wbR.hDKMBd();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iCopydefault, -2);
        layoutParams.setMarginEnd(C55298xhM.dp2px$default(6.0f, null, 1, null));
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        Unit unit = Unit.INSTANCE;
        c7773aqE.addView(c53518wmxHDKMBd, layoutParams);
        C53518wmx c53518wmxZuBGHE = c52903wbR.zuBGHE();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iCopydefault, -2);
        layoutParams2.setMarginStart(C55298xhM.dp2px$default(6.0f, null, 1, null));
        layoutParams2.weight = 1.0f;
        layoutParams2.topMargin = C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null);
        layoutParams2.bottomMargin = C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        c7773aqE.addView(c53518wmxZuBGHE, layoutParams2);
        return c7773aqE;
    }

    /* JADX INFO: renamed from: o.wbR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C52903wbR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52903wbR c52903wbR) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.fJNWhG;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ uSW EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52903wbR c52903wbR, uSW usw) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c52903wbR;
            this.EZpvd = usw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                vMU vmu = new vMU();
                vmu.OLrzqt(C52903wbR.gEmmrt(this.AEQbTJ).AhwBna());
                vmu.AEQbTJ(this.AEQbTJ.new AssistContent(this.EZpvd));
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                vmu.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52903wbR c52903wbR) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.sILrnl);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.zeUYeG);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new BroadcastReceiver(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$ClipData */
    public static final class ClipData implements View.OnClickListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ C52903wbR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ uSW OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(android.view.View view, long j, C52903wbR c52903wbR, boolean z, uSW usw) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c52903wbR;
            this.AEQbTJ = z;
            this.OLrzqt = usw;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wbc.ActionBar.newInstance$default(o.wbc$ActionBar, java.lang.String, com.okinc.unify_trade.biz.StrategyDetailsResponse, boolean, boolean, java.lang.String, com.okinc.unify_trade.biz.ArbitrageInfoResponse, com.okinc.tradingbot.impl.order.strategy.smartarbitrage.presenter.SmartArbitrageManualPresenter$PnLDuration, java.lang.String, int, java.lang.Object):o.wbc */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52914wbc.ActionBar actionBar = C52914wbc.Companion;
                SwapInstrument swapInstrumentOLrzqt = C52903wbR.gEmmrt(this.EZpvd).OLrzqt();
                java.lang.String instId = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstId() : null;
                C52914wbc c52914wbcCopydefault = actionBar.copydefault((2 & 1) != 0 ? "" : "running", (2 & 2) != 0 ? null : null, (2 & 4) != 0 ? false : false, (2 & 8) != 0 ? false : false, (2 & 16) != 0 ? null : instId == null ? "" : instId, (2 & 32) != 0 ? null : null, this.AEQbTJ ? C52903wbR.gEmmrt(this.EZpvd).fetchVPNInfo() : SmartArbitrageManualPresenter.PnLDuration.APY_3DAYS, (2 & 128) != 0 ? null : this.OLrzqt.AYXKKw.getText().toString());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                java.lang.String simpleName = C52914wbc.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                C49662usl.EZpvd(c52914wbcCopydefault, parentFragmentManager, simpleName);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$ComponentCallbacks */
    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, C52903wbR c52903wbR) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.getNewProxyInstance;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$ComponentName */
    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52903wbR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(android.view.View view, long j, C52903wbR c52903wbR) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52917wbf.StateListAnimator stateListAnimator = C52917wbf.Companion;
                SwapInstrument swapInstrumentOLrzqt = C52903wbR.gEmmrt(this.EZpvd).OLrzqt();
                java.lang.String instId = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstId() : null;
                if (instId == null) {
                    instId = "";
                }
                SwapInstrument swapInstrumentOLrzqt2 = C52903wbR.gEmmrt(this.EZpvd).OLrzqt();
                java.lang.String instType = swapInstrumentOLrzqt2 != null ? swapInstrumentOLrzqt2.getInstType() : null;
                if (instType == null) {
                    instType = "";
                }
                SwapInstrument swapInstrumentOLrzqt3 = C52903wbR.gEmmrt(this.EZpvd).OLrzqt();
                java.lang.String instFamily = swapInstrumentOLrzqt3 != null ? swapInstrumentOLrzqt3.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                java.lang.String strFARcdN = C52903wbR.isConnected(this.EZpvd).getFieldNames.fARcdN();
                java.lang.String strAkhnZx = this.EZpvd.gHZMYf() ? C52903wbR.isConnected(this.EZpvd).getFieldNames.AkhnZx() : "";
                boolean zOLrzqt = this.EZpvd.fIwbmz().OLrzqt();
                boolean z = this.EZpvd.fIwbmz().OLrzqt() && this.EZpvd.AuCTelauCTel();
                boolean zOLrzqt2 = this.EZpvd.fIwbmz().OLrzqt();
                java.lang.Float fAuCTel = this.EZpvd.AuCTel();
                boolean zKWHzl = this.EZpvd.fIwbmz().KWHzl();
                boolean z2 = this.EZpvd.fIwbmz().KWHzl() && this.EZpvd.wlaJM();
                PlaceOrderCondition placeOrderConditionEjfBZ = this.EZpvd.ejfBZ();
                C52917wbf c52917wbfKWHzl = stateListAnimator.KWHzl(instId, instType, instFamily, null, strFARcdN, strAkhnZx, "from_review", "open", zOLrzqt, z, zOLrzqt2, fAuCTel, zKWHzl, z2, placeOrderConditionEjfBZ != null ? placeOrderConditionEjfBZ.getSpreadRatio() : null, null, this.EZpvd.fIwbmz().copydefault(), C52903wbR.gEmmrt(this.EZpvd).copydefault().getValue());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.EZpvd.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                java.lang.String simpleName = C52917wbf.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                C49662usl.EZpvd(c52917wbfKWHzl, parentFragmentManager, simpleName);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Context */
    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(android.view.View view, long j, C52903wbR c52903wbR) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.getNewProxyInstance;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52903wbR EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ uSW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C52903wbR c52903wbR, uSW usw) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c52903wbR;
            this.copydefault = usw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52903wbR c52903wbR = this.EZpvd;
                C47988uAv c47988uAv = this.copydefault.getFieldNames;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                if (c52903wbR.OLrzqt(c47988uAv, C55688xof.Application.ReportDrawnKtReportDrawnWhen2)) {
                    if (this.copydefault.AuCTelauCTel.isChecked()) {
                        C52903wbR c52903wbR2 = this.EZpvd;
                        C47988uAv c47988uAv2 = this.copydefault.zsXlph;
                        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                        if (!c52903wbR2.OLrzqt(c47988uAv2, C55688xof.Application.search)) {
                            return;
                        }
                    }
                    android.widget.TextView textView = this.copydefault.uzCIH;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() == 0) {
                        C56002xub.KWHzl.OLrzqt();
                        return;
                    }
                    C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new ComponentCallbacks2(C54589xNz.EZpvd.EZpvd() ? "demo" : "live"), 1, (java.lang.Object) null);
                    C52852waT.ActionBar actionBar = C52852waT.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    if (actionBar.KWHzl(childFragmentManager)) {
                        return;
                    }
                    this.EZpvd.ORxRYg();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C52903wbR c52903wbR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String instId;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FundingRateArbCoin value = C52903wbR.gEmmrt(this.AEQbTJ).EZpvd().getValue();
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo((value == null || (instId = value.getInstId()) == null) ? "" : instId, "SWAP", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, contextRequireContext, marketCoinInfo, null, null, "bot_page_trade", null, null, null, null, null, null, 2028, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C52903wbR c52903wbR) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C52856waX c52856waX = new C52856waX();
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c52856waX.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$Intent */
    public static final class Intent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52903wbR KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(android.view.View view, long j, C52903wbR c52903wbR) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.KWHzl.fJNWhG;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C52903wbR c52903wbR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52937wbz.Activity activity = C52937wbz.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                activity.AEQbTJ(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ uSW KWHzl;
        public final /* synthetic */ C52903wbR copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C52903wbR c52903wbR, uSW usw) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c52903wbR;
            this.KWHzl = usw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52917wbf.StateListAnimator stateListAnimator = C52917wbf.Companion;
                SwapInstrument swapInstrumentOLrzqt = C52903wbR.gEmmrt(this.copydefault).OLrzqt();
                java.lang.String instId = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstId() : null;
                if (instId == null) {
                    instId = "";
                }
                SwapInstrument swapInstrumentOLrzqt2 = C52903wbR.gEmmrt(this.copydefault).OLrzqt();
                java.lang.String instType = swapInstrumentOLrzqt2 != null ? swapInstrumentOLrzqt2.getInstType() : null;
                if (instType == null) {
                    instType = "";
                }
                SwapInstrument swapInstrumentOLrzqt3 = C52903wbR.gEmmrt(this.copydefault).OLrzqt();
                java.lang.String instFamily = swapInstrumentOLrzqt3 != null ? swapInstrumentOLrzqt3.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                java.lang.String strFARcdN = this.KWHzl.getFieldNames.fARcdN();
                java.lang.String strAkhnZx = this.copydefault.gHZMYf() ? C52903wbR.isConnected(this.copydefault).getFieldNames.AkhnZx() : "";
                boolean zOLrzqt = this.copydefault.fIwbmz().OLrzqt();
                boolean z = this.copydefault.fIwbmz().OLrzqt() && this.copydefault.AuCTelauCTel();
                boolean z2 = this.copydefault.fIwbmz().OLrzqt() && this.copydefault.AuCTel() != null;
                java.lang.Float fAuCTel = this.copydefault.AuCTel();
                boolean zKWHzl = this.copydefault.fIwbmz().KWHzl();
                boolean z3 = this.copydefault.fIwbmz().KWHzl() && this.copydefault.wlaJM();
                PlaceOrderCondition placeOrderConditionEjfBZ = this.copydefault.ejfBZ();
                C52917wbf c52917wbfKWHzl = stateListAnimator.KWHzl(instId, instType, instFamily, null, strFARcdN, strAkhnZx, "from_pnl", "open", zOLrzqt, z, z2, fAuCTel, zKWHzl, z3, placeOrderConditionEjfBZ != null ? placeOrderConditionEjfBZ.getSpreadRatio() : null, null, this.copydefault.fIwbmz().copydefault(), C52903wbR.gEmmrt(this.copydefault).copydefault().getValue());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.copydefault.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                java.lang.String simpleName = C52917wbf.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                C49662usl.EZpvd(c52917wbfKWHzl, parentFragmentManager, simpleName);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ C52903wbR EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C52903wbR c52903wbR) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52858waZ.Activity activity = C52858waZ.Companion;
                java.lang.String strDbNXlk = C52903wbR.gEmmrt(this.EZpvd).DbNXlk();
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                C52858waZ c52858waZOLrzqt = activity.OLrzqt(strDbNXlk);
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c52858waZOLrzqt.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52903wbR c52903wbR) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.QnnRaN);
                viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.OStAOF);
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new SharedElementCallback(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wbR$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ C52903wbR AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C52903wbR c52903wbR) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c52903wbR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IconCompatParcelizer));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.gVEiQJ));
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new TaskStackBuilder(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public C7773aqE gEmmrt() {
        return sSMYrx();
    }

    private final C55915xsu AwvSrB() {
        return (C55915xsu) this.valueOf.getValue();
    }

    public final SmartArbitrageManualViewModel fIwbmz() {
        return (SmartArbitrageManualViewModel) this.AkhnZx.getValue();
    }

    public static final InterfaceC54581xNr djBIcL() {
        return C54589xNz.EZpvd.copydefault();
    }

    public final InterfaceC54581xNr values() {
        return (InterfaceC54581xNr) this.djBIcL.getValue();
    }

    public final java.util.Map<java.lang.String, FundingRateArbCoin> getFieldNames() {
        return (java.util.Map) this.ejfBZ.getValue();
    }

    public static final java.util.Map iwGUEr(C52903wbR c52903wbR) {
        android.os.Bundle arguments = c52903wbR.getArguments();
        java.util.List parcelableArrayList = arguments != null ? arguments.getParcelableArrayList("FUNDING_RATE_ARB_COIN_LIST") : null;
        if (parcelableArrayList == null) {
            parcelableArrayList = yDY.AhwBna();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(parcelableArrayList, 10)), 16));
        for (java.lang.Object obj : parcelableArrayList) {
            linkedHashMap.put(((FundingRateArbCoin) obj).getInstId(), obj);
        }
        return linkedHashMap;
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SmartArbitrageManualFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        uSW usw = (uSW) gGvvIC();
        EZpvd(usw);
        AEQbTJ(usw);
        KWHzl(usw);
        OLrzqt(usw);
        copydefault(usw);
        C53518wmx c53518wmxHDKMBd = hDKMBd();
        c53518wmxHDKMBd.setOnClickListener(new ComponentName(c53518wmxHDKMBd, 1000L, this));
        QKVWgx();
    }

    public final void OLrzqt(final uSW usw) {
        usw.copydefault.setOnStartConditionClick(new View.OnClickListener() { // from class: o.wcA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52903wbR.copydefault(this.EZpvd, usw, view);
            }
        });
        getChildFragmentManager().setFragmentResultListener("modify_spread_ratio_total_amount", this, new FragmentResultListener() { // from class: o.wcC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52903wbR.AEQbTJ(this.EZpvd, usw, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C52903wbR c52903wbR, uSW usw, android.view.View view) {
        java.lang.String str;
        uSW usw2;
        C52946wcH.StateListAnimator stateListAnimator = C52946wcH.Companion;
        SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).OLrzqt();
        java.lang.String instFamily = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstFamily() : null;
        if (instFamily == null) {
            usw2 = usw;
            str = "";
        } else {
            str = instFamily;
            usw2 = usw;
        }
        java.lang.String strFARcdN = usw2.getFieldNames.fARcdN();
        PlaceOrderCondition placeOrderConditionEjfBZ = c52903wbR.ejfBZ();
        java.lang.String spreadRatio = placeOrderConditionEjfBZ != null ? placeOrderConditionEjfBZ.getSpreadRatio() : null;
        PlaceOrderCondition placeOrderConditionEjfBZ2 = c52903wbR.ejfBZ();
        C52946wcH c52946wcHNewInstance$default = C52946wcH.StateListAnimator.newInstance$default(stateListAnimator, "open", str, "simpleFundingFee", "100000", strFARcdN, false, spreadRatio, null, placeOrderConditionEjfBZ2 != null ? placeOrderConditionEjfBZ2.getUnitAmt() : null, null, null, 1696, null);
        androidx.fragment.app.FragmentManager childFragmentManager = c52903wbR.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = C52946wcH.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        C49662usl.EZpvd(c52946wcHNewInstance$default, childFragmentManager, simpleName);
    }

    public static final void AEQbTJ(C52903wbR c52903wbR, uSW usw, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("spread_ratio_params");
        c52903wbR.uzCIH = bundle.getString("unit_amt_params");
        usw.copydefault.copydefault(string, c52903wbR.uzCIH, bundle.getString("unit_params"));
        c52903wbR.AxsJAY();
    }

    public static final void hDKMBd(C52903wbR c52903wbR) {
        c52903wbR.gHZMYf();
        c52903wbR.DTwDnp();
    }

    public final void KWHzl(final uSW usw) {
        final C47988uAv c47988uAv = usw.getFieldNames;
        valueOf(usw);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wcu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52903wbR.KWHzl(this.KWHzl, usw, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.copydefault(new Function1() { // from class: o.wcs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.EZpvd(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit KWHzl(C52903wbR c52903wbR, uSW usw, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = usw.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        c52903wbR.OLrzqt(c47988uAv2);
        hDKMBd(c52903wbR);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47988uAv c47988uAv, C52903wbR c52903wbR, float f) {
        C47988uAv.setInputContentIgnoreCallback$default(c47988uAv, c47988uAv.zLjUOn() ? C33129mqd.mulS$default(java.lang.Float.valueOf(f), c52903wbR.AwvSrB().AhwBna().getValue(), null, null, null, 14, null) : "", false, false, 6, null);
        hDKMBd(c52903wbR);
        return Unit.INSTANCE;
    }

    public final void copydefault(final uSW usw) {
        C55258xgZ c55258xgZ = usw.DTwDnp;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = usw.iwGUEr;
        c55258xgZ2.setOnClickListener(new Application(c55258xgZ2, 1000L, this));
        AppCompatImageView appCompatImageView = usw.getNewProxyInstance;
        appCompatImageView.setOnClickListener(new PendingIntent(appCompatImageView, 1000L, this, usw));
        C55320xhi c55320xhi = usw.AubY;
        c55320xhi.setOnClickListener(new FragmentManager(c55320xhi, 1000L, this));
        ConstraintLayout constraintLayout = usw.zuBGHE;
        constraintLayout.setOnClickListener(new LoaderManager(constraintLayout, 1000L, this));
        AppCompatImageView appCompatImageView2 = usw.zLjUOn;
        appCompatImageView2.setOnClickListener(new Fragment(appCompatImageView2, 1000L, this));
        C53518wmx c53518wmxZuBGHE = zuBGHE();
        c53518wmxZuBGHE.setOnClickListener(new Dialog(c53518wmxZuBGHE, 1000L, this, usw));
        C55320xhi c55320xhi2 = usw.QOLQEE;
        c55320xhi2.setOnClickListener(new PictureInPictureParams(c55320xhi2, 1000L, this));
        usw.OcIXYQ.setOnClickListener(new View.OnClickListener() { // from class: o.wbX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52903wbR.EZpvd(usw, this, view);
            }
        });
        C55258xgZ c55258xgZ3 = usw.DbNXlk;
        c55258xgZ3.setOnClickListener(new VoiceInteractor(c55258xgZ3, 1000L, this));
        android.view.ViewParent parent = usw.fIwbmz.copydefault().getParent();
        ConstraintLayout constraintLayout2 = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout2 != null) {
            constraintLayout2.setPadding(0, 0, 0, 0);
        }
        C55052xcf c55052xcf = usw.fIwbmz;
        c55052xcf.setOnClickListener(new Activity(c55052xcf, 1000L, this, usw));
    }

    /* JADX INFO: renamed from: o.wbR$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wbR$BroadcastReceiver */
    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wbR$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "smart_arbitrage", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, this.AEQbTJ, false, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(final uSW usw, final C52903wbR c52903wbR, android.view.View view) {
        if (usw.OcIXYQ.isChecked()) {
            C55258xgZ c55258xgZ = usw.djBIcL;
            c55258xgZ.setHelperLabelType(1);
            c55258xgZ.setOnClickListener(new ComponentCallbacks(c55258xgZ, 1000L, c52903wbR));
            android.widget.TextView textView = usw.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setVal$default(c52903wbR, textView, c52903wbR.hDKMBd, false, 2, null);
            c52903wbR.AxsJAY();
            return;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(usw.fetchVPNInfo.getText());
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(usw.fetchVPNInfo.getCurrentTextColor()), 0, spannableString.length(), 0);
        android.content.Context context = usw.OcIXYQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C48033uCm.Fragment.aQtmcU, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).AkhnZx()))));
        android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(context2, C48033uCm.Fragment.fMBJsc, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, new android.text.SpannableString(((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).AkhnZx())), C56390yDp.OLrzqt("apy", spannableString))));
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.clearRegistrations, new View.OnClickListener() { // from class: o.wcq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52903wbR.OLrzqt(usw, viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.v, new View.OnClickListener() { // from class: o.wcv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C52903wbR.AEQbTJ(usw, c52903wbR, viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(uSW usw, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        usw.OcIXYQ.setChecked(true);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(uSW usw, C52903wbR c52903wbR, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        usw.OcIXYQ.setChecked(false);
        usw.djBIcL.setHelperLabelType(2);
        android.widget.TextView textView = usw.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        setVal$default(c52903wbR, textView, null, false, 2, null);
        c52903wbR.AxsJAY();
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.wbR$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wbR$AssistContent */
    public static final class AssistContent implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ uSW EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(uSW usw) {
            this.EZpvd = usw;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            KWHzl(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void KWHzl(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            SmartArbitrageManualPresenter.PnLDuration pnLDuration = objOLrzqt instanceof SmartArbitrageManualPresenter.PnLDuration ? (SmartArbitrageManualPresenter.PnLDuration) objOLrzqt : null;
            if (pnLDuration != null) {
                C52903wbR c52903wbR = C52903wbR.this;
                uSW usw = this.EZpvd;
                C52903wbR.gEmmrt(c52903wbR).EZpvd(pnLDuration);
                c52903wbR.AhwBna(usw);
                ArbitrageInfoResponse arbitrageInfoResponseCopydefault = c52903wbR.fIwbmz().copydefault();
                java.util.List<EstimatedApyVo> estimatedApyList = arbitrageInfoResponseCopydefault != null ? arbitrageInfoResponseCopydefault.getEstimatedApyList() : null;
                if (estimatedApyList == null) {
                    estimatedApyList = yDY.AhwBna();
                }
                c52903wbR.EZpvd(estimatedApyList);
            }
        }
    }

    public final boolean OLrzqt(C47988uAv c47988uAv, @androidx.annotation.StringRes int i) {
        if (c47988uAv.getFieldNames()) {
            AEQbTJ(c47988uAv);
            return false;
        }
        if (!C33129mqd.OLrzqt((java.lang.Object) c47988uAv.AkhnZx(), (java.lang.Object) 0)) {
            return true;
        }
        C55326xho.toast$default(C33069mpW.copydefault(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(i)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        c47988uAv.zsXlph();
        AEQbTJ(c47988uAv);
        return false;
    }

    public final void AEQbTJ(C47988uAv c47988uAv) {
        C49967uyY.EZpvd.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, C56402yEa.EZpvd(c47988uAv));
    }

    public static final void OLrzqt(C52903wbR c52903wbR, uSW usw) {
        C47988uAv c47988uAv = usw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c52903wbR.copydefault(c47988uAv);
    }

    public final void AEQbTJ(final uSW usw) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: o.wbY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C52903wbR.AEQbTJ(usw, this, compoundButton, z);
            }
        };
        this.DbNXlk = onCheckedChangeListener;
        usw.AuCTelauCTel.setOnCheckedChangeListener(onCheckedChangeListener);
        final C47988uAv c47988uAv = usw.zsXlph;
        c47988uAv.setMaxDecimal(1);
        C47988uAv.setInputLabel$default(c47988uAv, fARcdN(), null, 2, null);
        C47988uAv.setInputContent$default(c47988uAv, "1.5", false, false, 6, null);
        c47988uAv.setInputUnit("x");
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wcb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52903wbR.OLrzqt(this.KWHzl, usw, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.copydefault(new Function1() { // from class: o.wcd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.copydefault(c47988uAv, this, usw, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final void AEQbTJ(uSW usw, C52903wbR c52903wbR, android.widget.CompoundButton compoundButton, boolean z) {
        C47988uAv c47988uAv = usw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        C55258xgZ c55258xgZ = usw.AhwBna;
        c55258xgZ.setHelperLabelType(z ? 1 : 2);
        if (z) {
            c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, c52903wbR));
        }
        android.widget.TextView textView = usw.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String str = c52903wbR.AhwBna;
        if (!z) {
            str = null;
        }
        c52903wbR.AEQbTJ(textView, str, true);
        c52903wbR.AxsJAY();
    }

    public static final Unit OLrzqt(C52903wbR c52903wbR, uSW usw, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = usw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        c52903wbR.OLrzqt(c47988uAv2);
        OLrzqt(c52903wbR, usw);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47988uAv c47988uAv, C52903wbR c52903wbR, uSW usw, float f) {
        C47988uAv.setInputContentIgnoreCallback$default(c47988uAv, c47988uAv.zLjUOn() ? C33129mqd.gEmmrt(java.lang.Float.valueOf((c52903wbR.values * f) + ((1 - f) * 1.0f))) : "", false, false, 6, null);
        OLrzqt(c52903wbR, usw);
        return Unit.INSTANCE;
    }

    public final void EZpvd(uSW usw) {
        C49960uyR.setWindowSoftInput$default(this, usw.getFieldNames, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), usw.getFieldNames, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, usw.zsXlph, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), usw.zsXlph, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ORxRYg() {
        showLoading();
        uSW usw = (uSW) gGvvIC();
        ((SmartArbitrageManualPresenter) dxcTrN()).AEQbTJ(usw.getFieldNames.AkhnZx(), usw.getFieldNames.fARcdN(), AuCTel());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        java.lang.String strAkhnZx = ((uSW) gGvvIC()).getFieldNames.AkhnZx();
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) || gHZMYf()) {
            SmartArbitrageManualViewModel smartArbitrageManualViewModelFIwbmz = fIwbmz();
            boolean zWlaJM = wlaJM();
            java.lang.Float fAuCTel = AuCTel();
            PlaceOrderCondition placeOrderConditionEjfBZ = ejfBZ();
            smartArbitrageManualViewModelFIwbmz.EZpvd(zWlaJM, fAuCTel, strAkhnZx, placeOrderConditionEjfBZ != null ? placeOrderConditionEjfBZ.getSpreadRatio() : null, this.uzCIH);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        TradeLiveData<FundingRateArbCoin> tradeLiveDataEZpvd = ((SmartArbitrageManualPresenter) dxcTrN()).EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new ContextWrapper(new Function1() { // from class: o.wcf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.EZpvd(this.OLrzqt, (FundingRateArbCoin) obj);
            }
        }));
        getChildFragmentManager().setFragmentResultListener("smart_arbitrage_select_coin", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wcg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52903wbR.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wcj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52903wbR.djBIcL(this.KWHzl, str, bundle);
            }
        });
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.setFragmentResultListener("preview_close_order", this, new FragmentResultListener() { // from class: o.wci
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C52903wbR.gEmmrt(this.KWHzl, str, bundle);
                }
            });
        }
        C56111xwe<java.lang.String> c56111xweAhwBna = AwvSrB().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweAhwBna.observe(viewLifecycleOwner2, new ContextWrapper(new Function1() { // from class: o.wcp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataCopydefault = ((SmartArbitrageManualPresenter) dxcTrN()).copydefault();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner3, new ContextWrapper(new Function1() { // from class: o.wcl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.AEQbTJ(this.EZpvd, (StrategyConfigInfo) obj);
            }
        }));
        C52692wUv.copydefault(fIwbmz().djBIcL(), this, Lifecycle.State.CREATED, new SmartArbitrageManualFragment$initObserver$7(this, null));
        C52692wUv.flowAndCollect$default(fIwbmz().AEQbTJ(), this, null, new SmartArbitrageManualFragment$initObserver$8(this, null), 2, null);
        C56111xwe<java.util.List<StrategyResponse>> c56111xweGEmmrt = ((SmartArbitrageManualPresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweGEmmrt.observe(viewLifecycleOwner4, new ContextWrapper(new Function1() { // from class: o.wcn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SmartArbitrageManualPresenter) dxcTrN()).AYXKKw().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner5, new ContextWrapper(new Function1() { // from class: o.wco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.copydefault(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        C56111xwe<ArbInvestDetailsBean> c56111xweDjBIcL = ((SmartArbitrageManualPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner6, new ContextWrapper(new Function1() { // from class: o.wcm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.copydefault(this.copydefault, (ArbInvestDetailsBean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = ((SmartArbitrageManualPresenter) dxcTrN()).valueOf().AhwBna();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner7, new ContextWrapper(new Function1() { // from class: o.wcr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.EZpvd(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        C56111xwe<ParamBuilder> c56111xweValues = finit().values();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweValues.observe(viewLifecycleOwner8, new ContextWrapper(new Function1() { // from class: o.wcc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.EZpvd(this.EZpvd, (ParamBuilder) obj);
            }
        }));
        getChildFragmentManager().setFragmentResultListener("tag_confirm_callback", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wch
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52903wbR.AYXKKw(this.OLrzqt, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52903wbR c52903wbR, FundingRateArbCoin fundingRateArbCoin) {
        HighestApyOverview highestApyOverview;
        Intrinsics.checkNotNullParameter(fundingRateArbCoin, "");
        C53028wdk.refreshTpSlView$default(((uSW) c52903wbR.gGvvIC()).copydefault, null, null, null, 7, null);
        android.os.Bundle arguments = c52903wbR.getArguments();
        if (arguments == null) {
            arguments = BundleKt.bundleOf();
        }
        SmartArbitrageReq smartArbitrageReq = (SmartArbitrageReq) BundleCompat.getParcelable(arguments, "bot_copy_req", SmartArbitrageReq.class);
        java.lang.String period = null;
        PlaceOrderCondition openCondition = smartArbitrageReq != null ? smartArbitrageReq.getOpenCondition() : null;
        android.os.Bundle arguments2 = c52903wbR.getArguments();
        if (arguments2 != null) {
            arguments2.remove("bot_copy_req");
        }
        c52903wbR.uzCIH = openCondition != null ? openCondition.getUnitAmt() : null;
        if (openCondition != null) {
            ((uSW) c52903wbR.gGvvIC()).copydefault.copydefault(openCondition.getSpreadRatio(), c52903wbR.uzCIH, ((uSW) c52903wbR.gGvvIC()).getFieldNames.fARcdN());
        }
        ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).isConnected();
        java.lang.String instId = fundingRateArbCoin.getInstId();
        if (instId != null) {
            ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fvQaOB().KWHzl("SWAP", instId);
        }
        SmartArbitrageManualViewModel smartArbitrageManualViewModelFIwbmz = c52903wbR.fIwbmz();
        SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).OLrzqt();
        java.lang.String instFamily = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstFamily() : null;
        if (instFamily == null) {
            instFamily = "";
        }
        smartArbitrageManualViewModelFIwbmz.EZpvd(instFamily);
        c52903wbR.fARcdN = c52903wbR.getFieldNames().get(fundingRateArbCoin.getInstId());
        SmartArbitrageManualPresenter smartArbitrageManualPresenter = (SmartArbitrageManualPresenter) c52903wbR.dxcTrN();
        FundingRateArbCoin fundingRateArbCoin2 = c52903wbR.fARcdN;
        if (fundingRateArbCoin2 != null && (highestApyOverview = fundingRateArbCoin2.getHighestApyOverview()) != null) {
            period = highestApyOverview.getPeriod();
        }
        if (period == null) {
            period = "";
        }
        smartArbitrageManualPresenter.OLrzqt(period);
        uSW usw = (uSW) c52903wbR.gGvvIC();
        c52903wbR.AhwBna(usw);
        usw.OcIXYQ.setChecked(true);
        c52903wbR.isConnected(usw);
        c52903wbR.gEmmrt(usw);
        c52903wbR.djBIcL(usw);
        c52903wbR.valueOf(usw);
        c52903wbR.AYXKKw(usw);
        c52903wbR.EZpvd(usw, fundingRateArbCoin);
        c52903wbR.zLjUOn();
        ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).KWHzl();
        c52903wbR.fIwbmz().EZpvd();
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String instId2 = fundingRateArbCoin.getInstId();
        c55867xrz.OLrzqt("smart_arbitrage", instId2 != null ? instId2 : "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C52903wbR c52903wbR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        FundingRateArbCoin fundingRateArbCoin = (FundingRateArbCoin) bundle.getParcelable("data");
        if (fundingRateArbCoin == null) {
            fundingRateArbCoin = new FundingRateArbCoin((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (HighestApyOverview) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, 2047, (DefaultConstructorMarker) null);
        }
        ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).EZpvd().postValue(fundingRateArbCoin);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(C52903wbR c52903wbR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52903wbR.showLoading();
        ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).AEQbTJ(((uSW) c52903wbR.gGvvIC()).getFieldNames.AkhnZx(), c52903wbR.AuCTel(), c52903wbR.getNewProxyInstance(), c52903wbR.ejfBZ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void gEmmrt(C52903wbR c52903wbR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        uSW usw = (uSW) c52903wbR.gGvvIC();
        C47988uAv c47988uAv = usw.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c52903wbR.OLrzqt(c47988uAv, C55688xof.Application.ReportDrawnKtReportDrawnWhen2)) {
            if (usw.AuCTelauCTel.isChecked()) {
                C47988uAv c47988uAv2 = usw.zsXlph;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                if (!c52903wbR.OLrzqt(c47988uAv2, C55688xof.Application.search)) {
                    return;
                }
            }
            android.widget.TextView textView = usw.uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (textView.getVisibility() == 0) {
                C56002xub.KWHzl.OLrzqt();
                return;
            }
            final java.lang.String str2 = C54589xNz.EZpvd.EZpvd() ? "demo" : "live";
            C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wcz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52903wbR.copydefault(str2, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C52852waT.ActionBar actionBar = C52852waT.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = c52903wbR.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            if (actionBar.KWHzl(childFragmentManager)) {
                return;
            }
            c52903wbR.ORxRYg();
        }
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "smart_arbitrage", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52903wbR c52903wbR, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrValues = c52903wbR.values();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrValues != null) {
            SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).OLrzqt();
            java.lang.String instType = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrValues.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentOLrzqt2 = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).OLrzqt();
                java.lang.String instFamily = swapInstrumentOLrzqt2 != null ? swapInstrumentOLrzqt2.getInstFamily() : null;
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily != null ? instFamily : "", null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        ((uSW) c52903wbR.gGvvIC()).AkhnZx.setFooterAvaValue(safeString$default);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52903wbR c52903wbR, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c52903wbR.AubY();
        c52903wbR.QOLQEE();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52903wbR c52903wbR, java.util.List list) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        c52903wbR.dismissLoading();
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyResponse != null && (algoId = strategyResponse.getAlgoId()) != null) {
            str = algoId;
        }
        c52903wbR.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("smart_arbitrage", str));
        xDM xdmCopydefault = c52903wbR.AwvSrB().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        C47988uAv.setInputContent$default(((uSW) c52903wbR.gGvvIC()).getFieldNames, "", false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52903wbR c52903wbR, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        c52903wbR.dismissLoading();
        pUU.copydefault(c52903wbR.getTAG(), "smart arbitrage order fail cause by: " + exc.getMessage());
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrValues = c52903wbR.values();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "smart_arbitrage", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrValues == null || (newProxyInstance = interfaceC54581xNrValues.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C52903wbR c52903wbR, ArbInvestDetailsBean arbInvestDetailsBean) {
        java.lang.String stakingApy;
        java.util.List<EstimatedApyVo> estimatedApyList;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(arbInvestDetailsBean, "");
        c52903wbR.dismissLoading();
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).EZpvd("SPOT");
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        java.lang.String second = pairEZpvd.getSecond();
        java.lang.String str = second == null ? "" : second;
        java.lang.String first = pairEZpvd.getFirst();
        java.lang.String str2 = first == null ? "" : first;
        StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, "smart_arbitrage", (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 1919, (DefaultConstructorMarker) null);
        java.lang.String strValueOf = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fvQaOB().valueOf();
        ArbInvestDetailsBean arbInvestDetailsBeanCopy = arbInvestDetailsBean.copy((67108831 & 1) != 0 ? arbInvestDetailsBean.arbItems : null, (67108831 & 2) != 0 ? arbInvestDetailsBean.totalAmt : null, (67108831 & 4) != 0 ? arbInvestDetailsBean.unit : null, (67108831 & 8) != 0 ? arbInvestDetailsBean.estimatingArbPnl : null, (67108831 & 16) != 0 ? arbInvestDetailsBean.estimatingEnlargeArbPnl : null, (67108831 & 32) != 0 ? arbInvestDetailsBean.instFamily : null, (67108831 & 64) != 0 ? arbInvestDetailsBean.isStaking : c52903wbR.getNewProxyInstance(), (67108831 & 128) != 0 ? arbInvestDetailsBean.spreadRatio : null, (67108831 & 256) != 0 ? arbInvestDetailsBean.marketSpreadRatio : null, (67108831 & 512) != 0 ? arbInvestDetailsBean.unitAmt : null, (67108831 & 1024) != 0 ? arbInvestDetailsBean.minUnitAmt : null, (67108831 & 2048) != 0 ? arbInvestDetailsBean.userExpectSpreadRatio : null, (67108831 & 4096) != 0 ? arbInvestDetailsBean.userExpectUnitAmt : null, (67108831 & 8192) != 0 ? arbInvestDetailsBean.arbitrageTotalPnlInfo : null, (67108831 & 16384) != 0 ? arbInvestDetailsBean.allowLeverPrincipal : c52903wbR.fIwbmz().OLrzqt(), (67108831 & 32768) != 0 ? arbInvestDetailsBean.enlargedAmt : null, (67108831 & 65536) != 0 ? arbInvestDetailsBean.interestDebt : null, (67108831 & 131072) != 0 ? arbInvestDetailsBean.estimatedStaking : null, (67108831 & 262144) != 0 ? arbInvestDetailsBean.minAmt : null, (67108831 & 524288) != 0 ? arbInvestDetailsBean.displayMinPaybackDays : null, (67108831 & 1048576) != 0 ? arbInvestDetailsBean.highestApyPeriod : null, (67108831 & 2097152) != 0 ? arbInvestDetailsBean.estimatedApyList : null, (67108831 & 4194304) != 0 ? arbInvestDetailsBean.estimatedOpenCost : null, (67108831 & 8388608) != 0 ? arbInvestDetailsBean.estimatedClosePnl : null, (67108831 & 16777216) != 0 ? arbInvestDetailsBean.closeCost : null, (67108831 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? arbInvestDetailsBean.openCost : null);
        java.lang.Float fAuCTel = c52903wbR.AuCTel();
        PlaceOrderCondition placeOrderConditionEjfBZ = c52903wbR.ejfBZ();
        ArbitrageInfoResponse arbitrageInfoResponseCopydefault = c52903wbR.fIwbmz().copydefault();
        if (arbitrageInfoResponseCopydefault == null || (estimatedApyList = arbitrageInfoResponseCopydefault.getEstimatedApyList()) == null) {
            stakingApy = null;
        } else {
            java.util.Iterator<T> it = estimatedApyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedApyVo) next).getPeriod(), (java.lang.Object) ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fetchVPNInfo().getData())) {
                    break;
                }
            }
            EstimatedApyVo estimatedApyVo = (EstimatedApyVo) next;
            if (estimatedApyVo != null) {
                stakingApy = estimatedApyVo.getStakingApy();
            }
        }
        ArbitrageInfoResponse arbitrageInfoResponseCopydefault2 = c52903wbR.fIwbmz().copydefault();
        EstimatedStakingVo estimatedStaking = arbitrageInfoResponseCopydefault2 != null ? arbitrageInfoResponseCopydefault2.getEstimatedStaking() : null;
        ArbitrageInfoResponse arbitrageInfoResponseCopydefault3 = c52903wbR.fIwbmz().copydefault();
        BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault(str, str2, new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, new SmartArbitrageReq(strValueOf, (java.lang.String) null, (java.lang.String) null, arbInvestDetailsBeanCopy, fAuCTel, placeOrderConditionEjfBZ, stakingApy, estimatedStaking, arbitrageInfoResponseCopydefault3 != null ? arbitrageInfoResponseCopydefault3.getEstimatedAutoStaking() : null, ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).copydefault().getValue(), (java.lang.String) null, 1030, (DefaultConstructorMarker) null), (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32638, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
        androidx.fragment.app.FragmentManager childFragmentManager = c52903wbR.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        java.lang.String simpleName = BotOrderConfirmFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        C49662usl.EZpvd(botOrderConfirmFragmentCopydefault, childFragmentManager, simpleName);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52903wbR c52903wbR, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c52903wbR.dismissLoading();
        pUU.copydefault(c52903wbR.getTAG(), "fetch invest details fail cause by: " + exc.getMessage());
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52903wbR c52903wbR, ParamBuilder paramBuilder) {
        java.lang.String instFamily;
        android.os.Bundle arguments;
        android.os.Bundle arguments2;
        if (paramBuilder == null || paramBuilder.isSwitchCoin()) {
            androidx.fragment.app.Fragment parentFragment = c52903wbR.getParentFragment();
            java.lang.String instFamily2 = null;
            if (parentFragment != null && (arguments = parentFragment.getArguments()) != null && arguments.getBoolean("bot_from_deeplink")) {
                androidx.fragment.app.Fragment parentFragment2 = c52903wbR.getParentFragment();
                if (parentFragment2 != null && (arguments2 = parentFragment2.getArguments()) != null) {
                    arguments2.remove("bot_from_deeplink");
                }
                InterfaceC54581xNr interfaceC54581xNrValues = c52903wbR.values();
                if (interfaceC54581xNrValues != null) {
                    java.lang.String instType = paramBuilder != null ? paramBuilder.getInstType() : null;
                    if (instType == null) {
                        instType = "";
                    }
                    BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrValues, instType, paramBuilder != null ? paramBuilder.getInstId() : null, null, null, 12, null);
                    if (suggestedInstrument$default != null) {
                        instFamily2 = suggestedInstrument$default.getInstFamily();
                    }
                }
            } else if (paramBuilder != null && (instFamily = paramBuilder.getInstFamily()) != null) {
                if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) instFamily, (java.lang.CharSequence) "USDT", false, 2, (java.lang.Object) null)) {
                    instFamily = StringsKt__StringsKt.substringBefore$default(instFamily, "-", (java.lang.String) null, 2, (java.lang.Object) null) + "-USDT";
                }
                instFamily2 = instFamily;
            }
            ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).KWHzl(instFamily2);
        } else {
            c52903wbR.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(C52903wbR c52903wbR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52903wbR.ORxRYg();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QOLQEE() {
        StrategyConfigInfo value = ((SmartArbitrageManualPresenter) dxcTrN()).copydefault().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uSW) gGvvIC()).QUSxYX;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, value, (30 & 2) != 0 ? false : true, (30 & 4) != 0 ? false : iwGUEr(), (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : new View.OnClickListener() { // from class: o.wce
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52903wbR.EZpvd(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(C52903wbR c52903wbR, android.view.View view) {
        c52903wbR.isConnected();
    }

    public final void isConnected() {
        Function0<Unit> function0 = this.getNewProxyInstance;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna(uSW usw) {
        usw.fIwbmz.setTitle(((SmartArbitrageManualPresenter) dxcTrN()).fetchVPNInfo().getTitle());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zsXlph() {
        boolean zKWHzl = fIwbmz().KWHzl();
        boolean zOLrzqt = fIwbmz().OLrzqt();
        boolean z = zKWHzl || zOLrzqt;
        uSW usw = (uSW) gGvvIC();
        C55052xcf c55052xcf = usw.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
        c55052xcf.setVisibility(0);
        ConstraintLayout constraintLayout = usw.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat = usw.wlaJM;
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(zOLrzqt ? 0 : 8);
        ConstraintLayout constraintLayout2 = usw.ORxRYg;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        C55296xhK.margin$default(linearLayoutCompat, null, java.lang.Float.valueOf(constraintLayout2.getVisibility() == 0 ? 20.0f : 0.0f), null, null, 13, null);
        android.view.View view = usw.isConnected;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = usw.fARcdN;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat3 = usw.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        linearLayoutCompat3.setVisibility(z ^ true ? 8 : 0);
        LinearLayoutCompat linearLayoutCompat4 = usw.EZpvd;
        Intrinsics.copydefault(linearLayoutCompat4);
        linearLayoutCompat4.setVisibility(8);
        LinearLayoutCompat linearLayoutCompat5 = usw.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
        linearLayoutCompat4.setGravity(linearLayoutCompat5.getVisibility() == 0 ? 8388611 : 8388613);
        C55258xgZ c55258xgZ = usw.valueOf;
        c55258xgZ.setTextValue(C33070mpX.AYXKKw(C48033uCm.Fragment.dbUqJD));
        c55258xgZ.setOnClickListener(new ClipData(c55258xgZ, 1000L, this, z, usw));
        C55258xgZ c55258xgZ2 = usw.djBIcL;
        c55258xgZ2.setTextValue(C33070mpX.AYXKKw(C48033uCm.Fragment.QiTXOm));
        c55258xgZ2.setHelperLabelType(z ? 1 : 2);
        this.getNewProxyInstance = new Function0() { // from class: o.wcw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52903wbR.uzCIH(this.EZpvd);
            }
        };
        c55258xgZ2.setOnClickListener(new Context(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = usw.AhwBna;
        c55258xgZ3.setTextValue(C33070mpX.AYXKKw(C55688xof.Application.INotificationSideChannel));
        c55258xgZ3.setHelperLabelType(z ? 1 : 2);
        if (zOLrzqt) {
            this.fJNWhG = new Function0() { // from class: o.wcx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52903wbR.AuCTelauCTel(this.KWHzl);
                }
            };
        }
        c55258xgZ3.setOnClickListener(new Intent(c55258xgZ3, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v20, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit uzCIH(C52903wbR c52903wbR) {
        java.util.List<AutoEarnStakingConfig> autoEarn;
        java.lang.String strGEmmrt;
        java.lang.String strKWHzl;
        StakingConfig stakingConfigValueOf = c52903wbR.fIwbmz().valueOf();
        LeveragePrincipalConfig leveragePrincipalConfigGEmmrt = c52903wbR.fIwbmz().gEmmrt();
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(leveragePrincipalConfigGEmmrt != null ? java.lang.Integer.valueOf(leveragePrincipalConfigGEmmrt.copydefault()) : null);
        c52903wbR.copydefault(false);
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context contextRequireContext = c52903wbR.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[5];
        pairArr[0] = C56390yDp.OLrzqt("days", java.lang.Integer.valueOf(((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fetchVPNInfo().getValue()));
        java.lang.String str = c52903wbR.hDKMBd;
        if (str == null) {
            str = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("apy", str);
        pairArr[2] = C56390yDp.OLrzqt("type", ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).AEQbTJ());
        pairArr[3] = C56390yDp.OLrzqt("boostCcy", "USDT");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (stakingConfigValueOf != null) {
            if (c52903wbR.fIwbmz().KWHzl()) {
                strKWHzl = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).AkhnZx();
            } else {
                SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).OLrzqt();
                strKWHzl = C53418wlC.KWHzl(swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getTradeSymbol() : null);
            }
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(stakingConfigValueOf.copydefault()));
            java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(stakingConfigValueOf.AEQbTJ()));
            java.util.HashMap<java.lang.String, java.lang.String> mapEZpvd = C55770xqH.ActionBar.OLrzqt.EZpvd();
            FundingRateArbCoin value = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).EZpvd().getValue();
            java.lang.String ccy = value != null ? value.getCcy() : null;
            if (ccy == null) {
                ccy = "";
            }
            java.lang.String str2 = mapEZpvd.get(ccy);
            if (str2 == null) {
                str2 = "onChain";
            }
            listOLrzqt.add(new EarnStakingConfig(strKWHzl, strGEmmrt3, strGEmmrt4, str2));
        }
        StrategyConfigInfo value2 = ((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).copydefault().getValue();
        if (value2 != null && (autoEarn = value2.getAutoEarn()) != null) {
            for (AutoEarnStakingConfig autoEarnStakingConfig : autoEarn) {
                java.lang.String ccy2 = autoEarnStakingConfig.getCcy();
                java.lang.String ccy3 = autoEarnStakingConfig.getCcy();
                int iHashCode = ccy3.hashCode();
                if (iHashCode != 68985) {
                    if (iHashCode != 82288) {
                        if (iHashCode == 2614190 && ccy3.equals("USDT")) {
                            strGEmmrt = strGEmmrt2;
                        }
                    } else if (ccy3.equals("SOL")) {
                        strGEmmrt = C33129mqd.gEmmrt(stakingConfigValueOf != null ? java.lang.Integer.valueOf(stakingConfigValueOf.copydefault()) : null);
                    }
                    strGEmmrt = "";
                } else if (!ccy3.equals("ETH")) {
                    strGEmmrt = "";
                }
                java.lang.String str3 = C55770xqH.ActionBar.OLrzqt.EZpvd().get(autoEarnStakingConfig.getCcy());
                if (str3 == null) {
                    str3 = "simple";
                }
                listOLrzqt.add(new EarnStakingConfig(ccy2, strGEmmrt, "", str3));
            }
        }
        Unit unit = Unit.INSTANCE;
        pairArr[4] = C56390yDp.OLrzqt("chartInfo", C33488mxR.EZpvd(C56402yEa.fARcdN(listOLrzqt)));
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/earn/historical_staking_apy_data", C56424yEw.gEmmrt(pairArr));
        return unit;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AuCTelauCTel(C52903wbR c52903wbR) {
        LeveragePrincipalConfig leveragePrincipalConfigGEmmrt = c52903wbR.fIwbmz().gEmmrt();
        if (leveragePrincipalConfigGEmmrt == null) {
            C55326xho.toast$default(C48033uCm.Fragment.QCjLjM, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        c52903wbR.copydefault(false);
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context contextRequireContext = c52903wbR.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt("quoteCcyId", java.lang.Integer.valueOf(leveragePrincipalConfigGEmmrt.copydefault()));
        pairArr[1] = C56390yDp.OLrzqt("days", java.lang.Integer.valueOf(((SmartArbitrageManualPresenter) c52903wbR.dxcTrN()).fetchVPNInfo().getValue()));
        java.lang.String str = c52903wbR.AhwBna;
        pairArr[2] = C56390yDp.OLrzqt("apy", str != null ? str : "");
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/historical_borrow_data", C56424yEw.gEmmrt(pairArr));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.util.List<EstimatedApyVo> list) {
        java.lang.String arbApy;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String arbApy2;
        java.lang.String str;
        java.lang.Object next3;
        uSW usw = (uSW) gGvvIC();
        djBIcL(usw);
        if (list.isEmpty()) {
            return;
        }
        boolean z = fIwbmz().KWHzl() || fIwbmz().OLrzqt();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            arbApy = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedApyVo) next).getPeriod(), (java.lang.Object) ((SmartArbitrageManualPresenter) dxcTrN()).fetchVPNInfo().getData())) {
                    break;
                }
            }
        }
        EstimatedApyVo estimatedApyVo = (EstimatedApyVo) next;
        this.hDKMBd = estimatedApyVo != null ? estimatedApyVo.getStakingApy() : null;
        this.AhwBna = estimatedApyVo != null ? estimatedApyVo.getInterestYearRate() : null;
        android.widget.TextView textView = usw.AuCTel;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        setVal$default(this, textView, estimatedApyVo != null ? estimatedApyVo.getTotalApy() : null, false, 2, null);
        android.widget.TextView textView2 = usw.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (z) {
            if (estimatedApyVo != null) {
                arbApy2 = estimatedApyVo.getArbApy();
                str = arbApy2;
            }
            str = null;
        } else {
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedApyVo) next2).getPeriod(), (java.lang.Object) ((SmartArbitrageManualPresenter) dxcTrN()).fetchVPNInfo().getData())) {
                        break;
                    }
                }
            }
            EstimatedApyVo estimatedApyVo2 = (EstimatedApyVo) next2;
            if (estimatedApyVo2 != null) {
                arbApy2 = estimatedApyVo2.getArbApy();
                str = arbApy2;
            }
            str = null;
        }
        setVal$default(this, textView2, str, false, 2, null);
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uSW) gGvvIC()).QUSxYX;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, ((SmartArbitrageManualPresenter) dxcTrN()).copydefault().getValue(), true, iwGUEr(), this.hDKMBd, new View.OnClickListener() { // from class: o.wbW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52903wbR.KWHzl(this.OLrzqt, view);
            }
        });
        android.widget.TextView textView3 = usw.values;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        if (z) {
            java.lang.String str2 = this.AhwBna;
            if (usw.AuCTelauCTel.isChecked()) {
                arbApy = str2;
            }
        } else {
            java.util.Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedApyVo) next3).getPeriod(), (java.lang.Object) ((SmartArbitrageManualPresenter) dxcTrN()).fetchVPNInfo().getData())) {
                        break;
                    }
                }
            }
            EstimatedApyVo estimatedApyVo3 = (EstimatedApyVo) next3;
            if (estimatedApyVo3 != null) {
                arbApy = estimatedApyVo3.getArbApy();
            }
        }
        AEQbTJ(textView3, arbApy, z);
    }

    public static final void KWHzl(C52903wbR c52903wbR, android.view.View view) {
        c52903wbR.isConnected();
    }

    public static /* synthetic */ void setVal$default(C52903wbR c52903wbR, android.widget.TextView textView, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c52903wbR.AEQbTJ(textView, str, z);
    }

    public final void AEQbTJ(android.widget.TextView textView, java.lang.String str, boolean z) {
        int iOLrzqt;
        textView.setText((str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : xMR.formatPercentWithSymbol$default(xMR.copydefault, str, 0, 0, RoundingMode.HALF_UP, 6, null));
        if (z) {
            iOLrzqt = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) str);
        }
        textView.setTextColor(iOLrzqt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL(uSW usw) {
        usw.QOLQEE.setText(C33069mpW.copydefault(C55688xof.Application.MediaBrowserCompatCallbackHandler, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, ((SmartArbitrageManualPresenter) dxcTrN()).AkhnZx()))));
    }

    public final void KWHzl(uSW usw, java.lang.String str) {
        java.lang.String strAYXKKw;
        boolean z = str == null;
        ConstraintLayout constraintLayout = usw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z ? 8 : 0);
        if (z) {
            return;
        }
        android.widget.TextView textView = usw.OLrzqt;
        if (C33129mqd.gEmmrt(str, 0)) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.drbYRJ);
        } else {
            strAYXKKw = C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0) ? C33070mpX.AYXKKw(C48033uCm.Fragment.RLmrWm) : C33069mpW.copydefault(C48033uCm.Fragment.RFmUsE, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", str.toString())));
        }
        textView.setText(strAYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Float AuCTel() {
        uSW usw = (uSW) gGvvIC();
        java.lang.Float fValueOf = java.lang.Float.valueOf(C33129mqd.djBIcL(usw.zsXlph.AkhnZx()));
        fValueOf.floatValue();
        LinearLayoutCompat linearLayoutCompat = usw.wlaJM;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        if (linearLayoutCompat.getVisibility() == 0 && usw.AuCTelauCTel.isChecked()) {
            C47988uAv c47988uAv = usw.zsXlph;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            if (copydefault(c47988uAv)) {
                return fValueOf;
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AuCTelauCTel() {
        uSW usw = (uSW) gGvvIC();
        LinearLayoutCompat linearLayoutCompat = usw.wlaJM;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        return linearLayoutCompat.getVisibility() == 0 && usw.AuCTelauCTel.isChecked();
    }

    public final boolean iwGUEr() {
        return !fIwbmz().KWHzl() && fIwbmz().OLrzqt() && AuCTelauCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        ArbitrageInfoResponse arbitrageInfoResponseKWHzl = fIwbmz().AEQbTJ().getValue().KWHzl();
        java.lang.String minAmt = arbitrageInfoResponseKWHzl != null ? arbitrageInfoResponseKWHzl.getMinAmt() : null;
        java.lang.String str = "";
        if (minAmt == null) {
            minAmt = "";
        }
        StrategyConfigInfo value = ((SmartArbitrageManualPresenter) dxcTrN()).copydefault().getValue();
        java.lang.String maxAmt = value != null ? value.getMaxAmt() : null;
        if (maxAmt == null) {
            maxAmt = "";
        }
        C47988uAv c47988uAv = ((uSW) gGvvIC()).getFieldNames;
        if (minAmt.length() != 0 && maxAmt.length() != 0) {
            str = pTB.formatLocalized$default(minAmt, null, 1, null) + " - " + pTB.formatLocalized$default(maxAmt, null, 1, null);
        }
        C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final ArbInvestDetailsBeanStakingType4UI getNewProxyInstance() {
        if (!fIwbmz().KWHzl()) {
            return ArbInvestDetailsBeanStakingType4UI.NOT_SUPPORT_STAKING;
        }
        if (((uSW) gGvvIC()).OcIXYQ.isChecked()) {
            return ArbInvestDetailsBeanStakingType4UI.STAKING;
        }
        return ArbInvestDetailsBeanStakingType4UI.NOT_STAKING;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final PlaceOrderCondition ejfBZ() {
        PlaceOrderCondition placeOrderConditionEZpvd = ((uSW) gGvvIC()).copydefault.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) placeOrderConditionEZpvd.getSpreadRatio()) && C33129mqd.OLrzqt((java.lang.CharSequence) placeOrderConditionEZpvd.getUnitAmt())) {
            return placeOrderConditionEZpvd;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean wlaJM() {
        return fIwbmz().KWHzl() && ((uSW) gGvvIC()).OcIXYQ.isChecked();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(uSW usw) {
        java.lang.Object marginDig;
        C47988uAv c47988uAv = usw.getFieldNames;
        InterfaceC54581xNr interfaceC54581xNrValues = values();
        if (interfaceC54581xNrValues == null) {
            marginDig = 2;
        } else {
            SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt();
            java.lang.String instType = swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrValues.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                SwapInstrument swapInstrumentOLrzqt2 = ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt();
                java.lang.String instFamily = swapInstrumentOLrzqt2 != null ? swapInstrumentOLrzqt2.getInstFamily() : null;
                if (instFamily == null) {
                    instFamily = "";
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
                if (idxConfigAkhnZx == null || (marginDig = idxConfigAkhnZx.getMarginDig()) == null) {
                }
            }
        }
        int iAhwBna = C33129mqd.AhwBna(marginDig);
        SwapInstrument swapInstrumentOLrzqt3 = ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt();
        c47988uAv.setInputUnit(swapInstrumentOLrzqt3 != null ? swapInstrumentOLrzqt3.getQuoteSymbol() : null);
        c47988uAv.setMaxDecimal(iAhwBna);
        C47988uAv.setInputLabel$default(c47988uAv, "", null, 2, null);
        C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(int i) {
        HighestApyOverview highestApyOverview;
        this.values = C33129mqd.djBIcL(java.lang.Integer.valueOf(i));
        FundingRateArbCoin fundingRateArbCoin = this.fARcdN;
        boolean z = true;
        boolean z2 = fundingRateArbCoin != null;
        java.lang.String leveragePrincipal = (fundingRateArbCoin == null || (highestApyOverview = fundingRateArbCoin.getHighestApyOverview()) == null) ? null : highestApyOverview.getLeveragePrincipal();
        boolean zOLrzqt = C55770xqH.Activity.copydefault.OLrzqt(leveragePrincipal);
        if (z2 && !zOLrzqt) {
            z = false;
        }
        if (!z2 || !zOLrzqt) {
            leveragePrincipal = "1.5";
        }
        uSW usw = (uSW) gGvvIC();
        C55239xgG c55239xgG = usw.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        AEQbTJ(c55239xgG, z);
        C47988uAv c47988uAv = usw.zsXlph;
        Intrinsics.copydefault(c47988uAv);
        c47988uAv.setVisibility(z ? 0 : 8);
        OLrzqt(c47988uAv);
        C47988uAv.setInputContent$default(c47988uAv, leveragePrincipal, false, false, 6, null);
        C47988uAv.setInputLabel$default(c47988uAv, fARcdN(), null, 2, null);
        c47988uAv.setSeekBarPercent(C56548yJl.KWHzl((C33129mqd.djBIcL(leveragePrincipal) - 1.0f) / (this.values - 1.0f), 0.0f, 1.0f));
        LinearLayoutCompat linearLayoutCompat = usw.wlaJM;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(fIwbmz().OLrzqt() ? 0 : 8);
    }

    public final java.lang.String fARcdN() {
        return C56033xvF.EZpvd(java.lang.Float.valueOf(1.0f), "") + " - " + C56033xvF.EZpvd(java.lang.Float.valueOf(this.values), "");
    }

    public final void AEQbTJ(C55239xgG c55239xgG, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = null;
        c55239xgG.setOnCheckedChangeListener(null);
        c55239xgG.setChecked(z);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = this.DbNXlk;
        if (onCheckedChangeListener2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            onCheckedChangeListener = onCheckedChangeListener2;
        }
        c55239xgG.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw(uSW usw) {
        java.lang.String quoteSymbol;
        C53539wnR c53539wnR = usw.AkhnZx;
        SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt();
        if (swapInstrumentOLrzqt == null || (quoteSymbol = swapInstrumentOLrzqt.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        c53539wnR.setTransferCoin(quoteSymbol);
    }

    public final void EZpvd(uSW usw, FundingRateArbCoin fundingRateArbCoin) {
        java.lang.String strValueOf;
        usw.sSMYrx.setText(fundingRateArbCoin != null ? fundingRateArbCoin.getCcy() : null);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(requireContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        InterfaceC54581xNr interfaceC54581xNrValues = values();
        if (interfaceC54581xNrValues != null) {
            java.lang.String ccy = fundingRateArbCoin != null ? fundingRateArbCoin.getCcy() : null;
            if (ccy == null) {
                ccy = "";
            }
            strValueOf = interfaceC54581xNrValues.valueOf(ccy);
        } else {
            strValueOf = null;
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf != null ? strValueOf : "", "lfit", 28, 28).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getContext())).djBIcL().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(usw.AwvSrB);
        usw.hDKMBd.AEQbTJ(fundingRateArbCoin != null ? fundingRateArbCoin.getInstId() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zLjUOn() {
        AwvSrB().AYXKKw();
        AwvSrB().EZpvd("smart_arbitrage", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt(), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    public final void gEmmrt(final uSW usw) {
        C47988uAv c47988uAv = usw.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        EZpvd(c47988uAv, new Function1() { // from class: o.wbZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.KWHzl(this.KWHzl, usw, (java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv2 = usw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        EZpvd(c47988uAv2, new Function1() { // from class: o.wca
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52903wbR.AEQbTJ(this.copydefault, usw, (java.lang.String) obj);
            }
        });
    }

    public static final Unit KWHzl(C52903wbR c52903wbR, uSW usw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52903wbR.AxsJAY();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            android.widget.TextView textView = usw.ejfBZ;
            textView.setText("--");
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        C56028xvA.OLrzqt("investLayout", C56424yEw.AYXKKw(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, str)));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52903wbR c52903wbR, uSW usw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = usw.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c52903wbR.copydefault(c47988uAv)) {
            c52903wbR.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wbR$TaskDescription */
    public static final class TaskDescription extends uBF {
        public final /* synthetic */ Function1<java.lang.String, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Function1<? super java.lang.String, Unit> function1) {
            this.KWHzl = function1;
        }

        @Override // o.uBH, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            this.KWHzl.invoke(java.lang.String.valueOf(charSequence));
        }
    }

    public final void EZpvd(C47988uAv c47988uAv, Function1<? super java.lang.String, Unit> function1) {
        c47988uAv.setDelayed(240L);
        c47988uAv.copydefault(new TaskDescription(function1));
    }

    public final void isConnected(uSW usw) {
        usw.getFieldNames.EZpvd();
        usw.zsXlph.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        zLjUOn();
        gEmmrt((uSW) gGvvIC());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        AwvSrB().AYXKKw();
        isConnected((uSW) gGvvIC());
    }

    public final void OLrzqt(C47988uAv c47988uAv) {
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean gHZMYf() {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((uSW) gGvvIC()).getFieldNames.AkhnZx())) {
            ((uSW) gGvvIC()).getFieldNames.copydefault();
            return false;
        }
        ArbitrageInfoResponse arbitrageInfoResponseCopydefault = fIwbmz().copydefault();
        java.lang.String s$default = C33129mqd.formatS$default(arbitrageInfoResponseCopydefault != null ? arbitrageInfoResponseCopydefault.getMinAmt() : null, java.lang.Integer.valueOf(((uSW) gGvvIC()).getFieldNames.AuCTel()), null, null, 6, null);
        if (C33129mqd.OLrzqt((java.lang.Object) ((uSW) gGvvIC()).getFieldNames.AkhnZx(), (java.lang.Object) 0)) {
            ((uSW) gGvvIC()).getFieldNames.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMedia, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("0")), C56390yDp.OLrzqt("unit", ((uSW) gGvvIC()).getFieldNames.fARcdN()))));
            return false;
        }
        if (C33129mqd.gEmmrt(((uSW) gGvvIC()).getFieldNames.AkhnZx(), s$default)) {
            ((uSW) gGvvIC()).getFieldNames.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(s$default)), C56390yDp.OLrzqt("unit", ((uSW) gGvvIC()).getFieldNames.fARcdN()))));
            return false;
        }
        if (C33129mqd.AEQbTJ(((uSW) gGvvIC()).getFieldNames.AkhnZx(), fJNWhG())) {
            ((uSW) gGvvIC()).getFieldNames.setInputErrorMsg(C33069mpW.copydefault(C48033uCm.Fragment.gmHjFq, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(fJNWhG())), C56390yDp.OLrzqt("unit", ((uSW) gGvvIC()).getFieldNames.fARcdN()))));
            return false;
        }
        ((uSW) gGvvIC()).getFieldNames.copydefault();
        return true;
    }

    public final boolean copydefault(C47988uAv c47988uAv) {
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            c47988uAv.copydefault();
        } else if (!C55770xqH.Activity.copydefault.OLrzqt(strAkhnZx) || C33129mqd.AEQbTJ(strAkhnZx, java.lang.Float.valueOf(this.values))) {
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(C48033uCm.Fragment.OAhWiU, C56423yEv.EZpvd(C56390yDp.OLrzqt("maxMultiple", C33129mqd.gEmmrt(java.lang.Float.valueOf(this.values))))));
        } else {
            c47988uAv.copydefault();
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String fJNWhG() {
        int iAuCTel = ((uSW) gGvvIC()).getFieldNames.AuCTel();
        StrategyConfigInfo value = ((SmartArbitrageManualPresenter) dxcTrN()).copydefault().getValue();
        return C33129mqd.formatS$default(value != null ? value.getMaxAmt() : null, java.lang.Integer.valueOf(iAuCTel), null, null, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        java.lang.String value = AwvSrB().AhwBna().getValue();
        android.widget.TextView textView = ((uSW) gGvvIC()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((value == null || !C33129mqd.AEQbTJ(((uSW) gGvvIC()).getFieldNames.AkhnZx(), C33129mqd.formatS$default(value, java.lang.Integer.valueOf(((uSW) gGvvIC()).getFieldNames.AuCTel()), null, null, 6, null))) ? 8 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        SwapInstrument swapInstrumentOLrzqt = ((SmartArbitrageManualPresenter) dxcTrN()).OLrzqt();
        SPUtils.put("sp_smart_arbitrage_inst_family", swapInstrumentOLrzqt != null ? swapInstrumentOLrzqt.getInstFly() : null);
        isConnected((uSW) gGvvIC());
        super.onDestroyView();
    }
}
