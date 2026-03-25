package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$leftCallback$1$onCoinSelected$1;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$onMgnModeChanged$1;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$onMgnModeChanged$2;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$rightCallback$1$onCoinSelected$1;
import com.okinc.tradingbot.impl.order.strategy.arbitrage.presenter.ArbTradeViewModel;
import com.okinc.tradingbot.impl.order.strategy.view.OrderType;
import com.okinc.tradingbot.impl.widget.ArbitrageOrderConfirmData;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.ArbitrageInst;
import com.okinc.unify_trade.biz.ArbitrageOrderData;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.ValuationCurrencyData;
import com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.ArbitrageType;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.EnableState;
import com.okinc.unify_trade.bot.data.TradeBalanceData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C50062vAm;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.InterfaceC54581xNr;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50062vAm extends AbstractC56129xww<InterfaceC49435uoW> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public android.widget.LinearLayout AYXKKw;
    public InterfaceC50102vBz AhwBna;
    public BizInstrument AkhnZx;
    public kotlin.Pair<java.lang.String, java.lang.String> AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public final uBH AwvSrB;
    public Observer<TradeBalanceData> AxsJAY;
    public final vBB AxsJAYaxsJAY;
    public java.lang.String AxsJAYsNCnLh;
    public kotlin.Pair<java.lang.String, java.lang.String> DAIeex;
    public C53501wmg DCJXGO;
    public android.widget.LinearLayout DCUTEI;
    public Observer<xMJ.TaskDescription> DTwDnp;
    public java.lang.String DXXBbs;
    public TickersData DarRvM;
    public Observer<java.lang.String> DbNXlk;
    public android.widget.LinearLayout KWHzl;
    public Observer<kotlin.Pair<java.lang.String, java.lang.String>> ODWQjV;
    public Observer<java.lang.Boolean> OLrzqt;
    public vBK ORxRYg;
    public xMJ.TaskDescription OcIXYQ;
    public Observer<TickersData> OqFWZa;
    public Observer<ArbitragePriceSetting> OuxcSI;
    public final InterfaceC56387yDm QHmsKR;
    public final uBH QKVWgx;
    public Observer<java.lang.String> QKudOq;
    public Observer<java.lang.Boolean> QOLQEE;
    public final uBH QUSxYX;
    public final uBH QVAiDq;
    public Observer<java.lang.String> QbewEr;
    public Observer<java.lang.String> QfsBiF;
    public Observer<TradeBalanceData> RJOkX;
    public Observer<java.lang.Boolean> RcXXUw;
    public Observer<java.lang.String> RlQdEF;
    public xMJ.TaskDescription UeEOUB;
    public vBK aKErDB;
    public java.lang.String accept;
    public final InterfaceC56387yDm copydefault;
    public Observer<xMJ.TaskDescription> dNCPSb;
    public final vBB djBIcL;
    public C53427wlL djSkpj;
    public Observer<EnableState> dvKsVJ;
    public Observer<SettingType> dxcTrN;
    public C53501wmg ejfBZ;
    public java.lang.String fARcdN;
    public Observer<java.lang.String> fFgQHt;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public Observer<EnableState> fZBcTu;
    public Observer<java.lang.String> fetchVPNInfo;
    public Observer<java.lang.Object> ffGIBT;
    public final uBH finit;
    public android.widget.TextView flVtFt;
    public C55258xgZ fvQaOB;
    public C53441wlZ gEmmrt;
    public C53497wmc gGvvIC;
    public Observer<java.lang.String> gHZMYf;
    public ArbitragePriceSetting gasjUx;
    public final java.lang.String getFieldNames;
    public Observer<TickersData> getNewProxyInstance;
    public android.widget.LinearLayout getPostValueLengthLimit;
    public InterfaceC50102vBz giSNqX;
    public Observer<BizInstrument> gkJEwt;
    public Observer<kotlin.Pair<java.lang.String, java.lang.String>> hDKMBd;
    public java.lang.String hUfVAv;
    public BizInstrument iRxXKY;
    public C53441wlZ iZzfmt;
    public java.lang.String isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public C53427wlL sSMYrx;
    public TickersData uzCIH;
    public android.widget.ImageView valueOf;
    public Observer<BizInstrument> values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public Observer<java.lang.Boolean> zsXlph;
    public final uBH zuBGHE;
    public C52794wYp zuWLRA;

    /* JADX INFO: renamed from: o.vAm$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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

    /* JADX INFO: renamed from: o.vAm$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EnableState.values().length];
            try {
                iArr[EnableState.ABLE_SELECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EnableState.ABLE_UNSELECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EnableState.DISABLE_SELECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[EnableState.DISABLE_UNSELECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[SettingType.values().length];
            try {
                iArr2[SettingType.TRADING_UNIT_FUTURES_SWAP_USDT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SettingType.TRADING_UNIT_FUTURES_SWAP_COIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SettingType.TRADING_UNIT_OPTIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SettingType.TRADING_LEGAL_UNIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[SettingType.CURRENCY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.QCjLjM;
    }

    /* JADX INFO: renamed from: o.vAm$Activity */
    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.LinearLayout linearLayout = C50062vAm.this.KWHzl;
            if (linearLayout != null) {
                linearLayout.post(C50062vAm.this.new StateListAnimator());
            }
        }
    }

    /* JADX INFO: renamed from: o.vAm$Dialog */
    public static final class Dialog implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Dialog() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.LinearLayout linearLayout = C50062vAm.this.KWHzl;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
    }

    public C50062vAm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$2
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
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vBG.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$7
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
        this.QHmsKR = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ArbTradeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$viewModels$default$10
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
        this.gasjUx = valueOf();
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vBJ.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.arbitrage.ArbitrageTradeFragment$special$$inlined$activityViewModels$default$3
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
        this.zLjUOn = SPUtils.getBoolean("arbitrage_same_amt_type", false);
        this.AubY = SPUtils.getBoolean("arbitrage_same_total_type", false);
        this.AuCTelauCTel = SPUtils.getBoolean("arbitrage_left_reduce_only_type", false);
        this.wlaJM = SPUtils.getBoolean("arbitrage_right_reduce_only_type", false);
        this.djBIcL = new Fragment();
        this.AxsJAYaxsJAY = new PendingIntent();
        this.AwvSrB = new uBH(new Function0() { // from class: o.vAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.wlaJM(this.EZpvd);
            }
        });
        this.QKVWgx = new uBH(new Function0() { // from class: o.vAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.sSMYrx(this.EZpvd);
            }
        });
        this.QVAiDq = new uBH(new Function0() { // from class: o.vAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.zuBGHE(this.AEQbTJ);
            }
        });
        this.finit = new uBH(new Function0() { // from class: o.vAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.AxsJAY(this.EZpvd);
            }
        });
        this.zuBGHE = new uBH(new Function0() { // from class: o.vAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.zsXlph(this.EZpvd);
            }
        });
        this.QUSxYX = new uBH(new Function0() { // from class: o.vAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.AwvSrB(this.EZpvd);
            }
        });
        this.getFieldNames = "com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment";
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.zLjUOn(this.AEQbTJ);
            }
        });
    }

    public final vBG AkhnZx() {
        return (vBG) this.iwGUEr.getValue();
    }

    public final ArbTradeViewModel isConnected() {
        return (ArbTradeViewModel) this.QHmsKR.getValue();
    }

    public final vBJ AYXKKw() {
        return (vBJ) this.AEQbTJ.getValue();
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt__StringsKt.AhwBna((java.lang.CharSequence) str, (java.lang.CharSequence) "_UM", true);
    }

    /* JADX INFO: renamed from: o.vAm$Fragment */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Fragment implements vBB {
        public Fragment() {
        }

        @Override // o.vBB
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BizInstrument bizInstrument = C50062vAm.this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null))) {
                BizInstrument bizInstrument2 = C50062vAm.this.iRxXKY;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstId() : null))) {
                    C33134mqi.copydefault(C55688xof.Application.play);
                    return;
                }
            }
            if ((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) && C50062vAm.this.EZpvd(str)) {
                C33134mqi.copydefault(C48033uCm.Fragment.QzqeNH);
                return;
            }
            C56036xvI.KWHzl.copydefault(str2, str);
            vBK vbk = C50062vAm.this.ORxRYg;
            if (vbk != null) {
                vbk.copydefault();
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C50062vAm.this), null, null, new ArbitrageTradeFragment$leftCallback$1$onCoinSelected$1(C50062vAm.this, null), 3, null);
            C50062vAm.this.AYXKKw().AEQbTJ().postValue(str);
            C56028xvA.OLrzqt("leftCoinSelectedView", C56424yEw.gEmmrt(C56390yDp.OLrzqt("instId", str), C56390yDp.OLrzqt("instType", str2)));
        }

        @Override // o.vBB
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C56036xvI.KWHzl.OLrzqt(str);
            ArbTradeViewModel arbTradeViewModelIsConnected = C50062vAm.this.isConnected();
            ArbitrageType arbitrageType = ArbitrageType.LEFT;
            arbTradeViewModelIsConnected.KWHzl(arbitrageType);
            C50062vAm c50062vAm = C50062vAm.this;
            c50062vAm.OLrzqt(c50062vAm.AkhnZx, str, arbitrageType, C50062vAm.this.isConnected().djBIcL());
        }

        @Override // o.vBB
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C56036xvI.KWHzl.EZpvd(str, str2);
            C50062vAm.this.isConnected().valueOf().postValue(new kotlin.Pair<>(str, str2));
            C50062vAm.this.isConnected().KWHzl(ArbitrageType.LEFT);
        }

        @Override // o.vBB
        public void OLrzqt() {
            C50062vAm.this.isConnected().KWHzl(ArbitrageType.LEFT);
        }

        @Override // o.vBB
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C50062vAm.this.gEmmrt(true);
        }
    }

    /* JADX INFO: renamed from: o.vAm$PendingIntent */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PendingIntent implements vBB {
        public PendingIntent() {
        }

        @Override // o.vBB
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            BizInstrument bizInstrument = C50062vAm.this.AkhnZx;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null))) {
                BizInstrument bizInstrument2 = C50062vAm.this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstId() : null))) {
                    C33134mqi.copydefault(C55688xof.Application.play);
                    return;
                }
            }
            if ((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) && C50062vAm.this.EZpvd(str)) {
                C33134mqi.copydefault(C48033uCm.Fragment.QzqeNH);
                return;
            }
            C56036xvI.KWHzl.KWHzl(str2, str);
            vBK vbk = C50062vAm.this.aKErDB;
            if (vbk != null) {
                vbk.copydefault();
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C50062vAm.this), null, null, new ArbitrageTradeFragment$rightCallback$1$onCoinSelected$1(C50062vAm.this, null), 3, null);
            C50062vAm.this.AYXKKw().gEmmrt().postValue(str);
            C56028xvA.OLrzqt("rightCoinSelectedView", C56424yEw.gEmmrt(C56390yDp.OLrzqt("instId", str), C56390yDp.OLrzqt("instType", str2)));
        }

        @Override // o.vBB
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C56036xvI.KWHzl.AEQbTJ(str);
            ArbTradeViewModel arbTradeViewModelIsConnected = C50062vAm.this.isConnected();
            ArbitrageType arbitrageType = ArbitrageType.RIGHT;
            arbTradeViewModelIsConnected.KWHzl(arbitrageType);
            C50062vAm c50062vAm = C50062vAm.this;
            c50062vAm.OLrzqt(c50062vAm.iRxXKY, str, arbitrageType, C50062vAm.this.isConnected().fetchVPNInfo());
        }

        @Override // o.vBB
        public void AEQbTJ(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C56036xvI.KWHzl.OLrzqt(str, str2);
            C50062vAm.this.isConnected().AkhnZx().postValue(new kotlin.Pair<>(str, str2));
            C50062vAm.this.isConnected().KWHzl(ArbitrageType.RIGHT);
        }

        @Override // o.vBB
        public void OLrzqt() {
            C50062vAm.this.isConnected().KWHzl(ArbitrageType.RIGHT);
        }

        @Override // o.vBB
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C50062vAm.this.gEmmrt(false);
        }
    }

    public final void OLrzqt(boolean z, java.lang.String str, java.lang.String str2) {
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, str, str2)) {
                vBK vbk = this.ORxRYg;
                if (vbk != null) {
                    vbk.copydefault();
                }
                vBK vbk2 = this.ORxRYg;
                if (vbk2 != null) {
                    vbk2.copydefault(true);
                    return;
                }
                return;
            }
            vBK vbk3 = this.ORxRYg;
            if (vbk3 != null) {
                vbk3.copydefault();
            }
            vBK vbk4 = this.ORxRYg;
            kotlin.Pair<java.lang.String, java.lang.String> pair = (vbk4 == null || !vbk4.AEQbTJ()) ? new kotlin.Pair<>("", "") : AhwBna();
            vBK vbk5 = this.ORxRYg;
            if (vbk5 != null) {
                vbk5.KWHzl(true, OLrzqt(true), pair.getSecond(), pair.getFirst());
            }
            BizInstrument bizInstrument2 = this.AkhnZx;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "SWAP")) {
                BizInstrument bizInstrument3 = this.AkhnZx;
                if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "FUTURES")) {
                    vBK vbk6 = this.ORxRYg;
                    if (vbk6 != null) {
                        if (str == null) {
                            str = "";
                        }
                        vbk6.KWHzl(str);
                        return;
                    }
                    return;
                }
            }
            vBK vbk7 = this.ORxRYg;
            if (vbk7 != null) {
                java.lang.String strDbNXlk = DbNXlk();
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy");
                if (str2 == null) {
                    str2 = "";
                }
                vbk7.OLrzqt(strDbNXlk, zEZpvd, str2);
                return;
            }
            return;
        }
        BizInstrument bizInstrument4 = this.iRxXKY;
        if (OLrzqt(bizInstrument4 != null ? bizInstrument4.getInstType() : null, str, str2)) {
            vBK vbk8 = this.aKErDB;
            if (vbk8 != null) {
                vbk8.copydefault();
            }
            vBK vbk9 = this.aKErDB;
            if (vbk9 != null) {
                vbk9.copydefault(false);
                return;
            }
            return;
        }
        vBK vbk10 = this.aKErDB;
        if (vbk10 != null) {
            vbk10.copydefault();
        }
        vBK vbk11 = this.aKErDB;
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = (vbk11 == null || !vbk11.AEQbTJ()) ? new kotlin.Pair<>("", "") : djBIcL();
        vBK vbk12 = this.aKErDB;
        if (vbk12 != null) {
            vbk12.KWHzl(false, OLrzqt(false), pair2.getSecond(), pair2.getFirst());
        }
        BizInstrument bizInstrument5 = this.iRxXKY;
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument5 != null ? bizInstrument5.getInstType() : null), (java.lang.Object) "SWAP")) {
            BizInstrument bizInstrument6 = this.iRxXKY;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument6 != null ? bizInstrument6.getInstType() : null), (java.lang.Object) "FUTURES")) {
                vBK vbk13 = this.aKErDB;
                if (vbk13 != null) {
                    if (str == null) {
                        str = "";
                    }
                    vbk13.KWHzl(str);
                    return;
                }
                return;
            }
        }
        vBK vbk14 = this.aKErDB;
        if (vbk14 != null) {
            java.lang.String strDbNXlk2 = DbNXlk();
            boolean zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "buy");
            if (str2 == null) {
                str2 = "";
            }
            vbk14.OLrzqt(strDbNXlk2, zEZpvd2, str2);
        }
    }

    public final void AYXKKw(boolean z) {
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.fJNWhG, this.fIwbmz)) {
                vBK vbk = this.ORxRYg;
                if (vbk != null) {
                    vbk.copydefault();
                }
                vBK vbk2 = this.ORxRYg;
                if (vbk2 != null) {
                    vbk2.copydefault(true);
                    return;
                }
                return;
            }
            vBK vbk3 = this.ORxRYg;
            if (vbk3 != null) {
                vbk3.copydefault();
            }
            vBK vbk4 = this.ORxRYg;
            kotlin.Pair<java.lang.String, java.lang.String> pair = (vbk4 == null || !vbk4.AEQbTJ()) ? new kotlin.Pair<>("", "") : AhwBna();
            vBK vbk5 = this.ORxRYg;
            if (vbk5 != null) {
                vbk5.KWHzl(true, OLrzqt(true), pair.getSecond(), pair.getFirst());
                return;
            }
            return;
        }
        BizInstrument bizInstrument2 = this.iRxXKY;
        if (OLrzqt(bizInstrument2 != null ? bizInstrument2.getInstType() : null, this.DXXBbs, this.AxsJAYsNCnLh)) {
            vBK vbk6 = this.aKErDB;
            if (vbk6 != null) {
                vbk6.copydefault();
            }
            vBK vbk7 = this.aKErDB;
            if (vbk7 != null) {
                vbk7.copydefault(false);
                return;
            }
            return;
        }
        vBK vbk8 = this.aKErDB;
        if (vbk8 != null) {
            vbk8.copydefault();
        }
        vBK vbk9 = this.aKErDB;
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = (vbk9 == null || !vbk9.AEQbTJ()) ? new kotlin.Pair<>("", "") : djBIcL();
        vBK vbk10 = this.aKErDB;
        if (vbk10 != null) {
            vbk10.KWHzl(false, OLrzqt(false), pair2.getSecond(), pair2.getFirst());
        }
    }

    public final boolean OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        xOW newProxyInstance;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "long_short_mode") && ((Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "short")) || (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "long")))) {
                return true;
            }
        }
        return false;
    }

    public static final Unit wlaJM(C50062vAm c50062vAm) {
        java.lang.String strAkhnZx;
        java.lang.String strEZpvd;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C53427wlL c53427wlL = c50062vAm.sSMYrx;
        if (c53427wlL == null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null || (strAkhnZx = c47988uAvOLrzqt2.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        java.lang.String str = strAkhnZx;
        C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null) {
            xVK xvk = xVK.EZpvd;
            BizInstrument bizInstrument = c50062vAm.AkhnZx;
            java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
            BizInstrument bizInstrument2 = c50062vAm.AkhnZx;
            c47988uAvOLrzqt.setInputErrorMsg(xvk.OLrzqt(str, instId, bizInstrument2 != null ? bizInstrument2.getInstType() : null));
        }
        if (c50062vAm.AhwBna(true) && (vbk = c50062vAm.ORxRYg) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            vbk.EZpvd(str, pair != null ? pair.getSecond() : null);
        }
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.AuCTel;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair2, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
        if (c50062vAm.djBIcL(true)) {
            strEZpvd = str;
        } else {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            xMJ.TaskDescription taskDescription = c50062vAm.OcIXYQ;
            strEZpvd = vbgAkhnZx.EZpvd(true, strGEmmrt, str, taskDescription != null ? taskDescription.OLrzqt() : null);
        }
        c50062vAm.AkhnZx().OLrzqt(true, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.AuCTel, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), str, strEZpvd, c50062vAm.djBIcL(false));
        if (C33129mqd.OLrzqt((java.lang.Object) strGEmmrt, (java.lang.Object) 0)) {
            return Unit.INSTANCE;
        }
        C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
        if (c53427wlL3 != null && (c47988uAvKWHzl3 = c53427wlL3.KWHzl()) != null) {
            c47988uAvKWHzl3.OLrzqt(c50062vAm.QKVWgx);
        }
        C53427wlL c53427wlL4 = c50062vAm.sSMYrx;
        if (c53427wlL4 != null && (c47988uAvKWHzl2 = c53427wlL4.KWHzl()) != null) {
            C47988uAv.setInputContent$default(c47988uAvKWHzl2, strEZpvd, false, false, 6, null);
        }
        C53427wlL c53427wlL5 = c50062vAm.sSMYrx;
        if (c53427wlL5 != null && (c47988uAvKWHzl = c53427wlL5.KWHzl()) != null) {
            c47988uAvKWHzl.KWHzl(c50062vAm.QKVWgx);
        }
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(C50062vAm c50062vAm) {
        java.lang.String strAkhnZx;
        java.lang.String strOLrzqt;
        java.lang.String str;
        C47988uAv c47988uAvOLrzqt;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvOLrzqt3;
        C47988uAv c47988uAvKWHzl;
        C53427wlL c53427wlL = c50062vAm.sSMYrx;
        if (c53427wlL == null || (c47988uAvKWHzl = c53427wlL.KWHzl()) == null || (strAkhnZx = c47988uAvKWHzl.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        java.lang.String str2 = strAkhnZx;
        kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
        if (c50062vAm.djBIcL(true)) {
            strOLrzqt = str2;
        } else {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            xMJ.TaskDescription taskDescription = c50062vAm.OcIXYQ;
            strOLrzqt = vbgAkhnZx.OLrzqt(true, strGEmmrt, str2, taskDescription != null ? taskDescription.OLrzqt() : null);
        }
        c50062vAm.AkhnZx().KWHzl(true, strGEmmrt, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), str2, strOLrzqt, c50062vAm.djBIcL(false));
        if (C33129mqd.OLrzqt((java.lang.Object) strGEmmrt, (java.lang.Object) 0)) {
            return Unit.INSTANCE;
        }
        C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvOLrzqt3 = c53427wlL2.OLrzqt()) != null) {
            c47988uAvOLrzqt3.OLrzqt(c50062vAm.AwvSrB);
        }
        C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
        if (c53427wlL3 == null || (c47988uAvOLrzqt2 = c53427wlL3.OLrzqt()) == null) {
            str = strOLrzqt;
        } else {
            str = strOLrzqt;
            C47988uAv.setInputContent$default(c47988uAvOLrzqt2, strOLrzqt, false, false, 6, null);
        }
        if (c50062vAm.AhwBna(true) && (vbk = c50062vAm.ORxRYg) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.AuCTel;
            vbk.EZpvd(str, pair2 != null ? pair2.getSecond() : null);
        }
        C53427wlL c53427wlL4 = c50062vAm.sSMYrx;
        if (c53427wlL4 != null && (c47988uAvOLrzqt = c53427wlL4.OLrzqt()) != null) {
            c47988uAvOLrzqt.KWHzl(c50062vAm.AwvSrB);
        }
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(C50062vAm c50062vAm) {
        java.lang.String strAkhnZx;
        java.lang.String strEZpvd;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C53427wlL c53427wlL = c50062vAm.djSkpj;
        if (c53427wlL == null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null || (strAkhnZx = c47988uAvOLrzqt2.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        java.lang.String str = strAkhnZx;
        C53427wlL c53427wlL2 = c50062vAm.djSkpj;
        if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null) {
            xVK xvk = xVK.EZpvd;
            BizInstrument bizInstrument = c50062vAm.iRxXKY;
            java.lang.String instId = bizInstrument != null ? bizInstrument.getInstId() : null;
            BizInstrument bizInstrument2 = c50062vAm.iRxXKY;
            c47988uAvOLrzqt.setInputErrorMsg(xvk.OLrzqt(str, instId, bizInstrument2 != null ? bizInstrument2.getInstType() : null));
        }
        if (c50062vAm.AhwBna(false) && (vbk = c50062vAm.aKErDB) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            vbk.EZpvd(str, pair != null ? pair.getSecond() : null);
        }
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.DAIeex;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair2, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
        if (c50062vAm.djBIcL(false)) {
            strEZpvd = str;
        } else {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            xMJ.TaskDescription taskDescription = c50062vAm.UeEOUB;
            strEZpvd = vbgAkhnZx.EZpvd(false, strGEmmrt, str, taskDescription != null ? taskDescription.OLrzqt() : null);
        }
        c50062vAm.AkhnZx().OLrzqt(false, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.AuCTel, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), str, strEZpvd, c50062vAm.djBIcL(true));
        if (C33129mqd.OLrzqt((java.lang.Object) strGEmmrt, (java.lang.Object) 0)) {
            return Unit.INSTANCE;
        }
        C53427wlL c53427wlL3 = c50062vAm.djSkpj;
        if (c53427wlL3 != null && (c47988uAvKWHzl3 = c53427wlL3.KWHzl()) != null) {
            c47988uAvKWHzl3.OLrzqt(c50062vAm.finit);
        }
        C53427wlL c53427wlL4 = c50062vAm.djSkpj;
        if (c53427wlL4 != null && (c47988uAvKWHzl2 = c53427wlL4.KWHzl()) != null) {
            C47988uAv.setInputContent$default(c47988uAvKWHzl2, strEZpvd, false, false, 6, null);
        }
        C53427wlL c53427wlL5 = c50062vAm.djSkpj;
        if (c53427wlL5 != null && (c47988uAvKWHzl = c53427wlL5.KWHzl()) != null) {
            c47988uAvKWHzl.KWHzl(c50062vAm.finit);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(C50062vAm c50062vAm) {
        java.lang.String strAkhnZx;
        java.lang.String strOLrzqt;
        java.lang.String str;
        C47988uAv c47988uAvOLrzqt;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvOLrzqt3;
        C47988uAv c47988uAvKWHzl;
        C53427wlL c53427wlL = c50062vAm.djSkpj;
        if (c53427wlL == null || (c47988uAvKWHzl = c53427wlL.KWHzl()) == null || (strAkhnZx = c47988uAvKWHzl.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        java.lang.String str2 = strAkhnZx;
        kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.DAIeex;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
        if (c50062vAm.djBIcL(false)) {
            strOLrzqt = str2;
        } else {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            xMJ.TaskDescription taskDescription = c50062vAm.UeEOUB;
            strOLrzqt = vbgAkhnZx.OLrzqt(false, strGEmmrt, str2, taskDescription != null ? taskDescription.OLrzqt() : null);
        }
        c50062vAm.AkhnZx().KWHzl(false, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.AuCTel, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), strGEmmrt, str2, strOLrzqt, c50062vAm.djBIcL(true));
        if (C33129mqd.OLrzqt((java.lang.Object) strGEmmrt, (java.lang.Object) 0)) {
            return Unit.INSTANCE;
        }
        C53427wlL c53427wlL2 = c50062vAm.djSkpj;
        if (c53427wlL2 != null && (c47988uAvOLrzqt3 = c53427wlL2.OLrzqt()) != null) {
            c47988uAvOLrzqt3.OLrzqt(c50062vAm.QVAiDq);
        }
        C53427wlL c53427wlL3 = c50062vAm.djSkpj;
        if (c53427wlL3 == null || (c47988uAvOLrzqt2 = c53427wlL3.OLrzqt()) == null) {
            str = strOLrzqt;
        } else {
            str = strOLrzqt;
            C47988uAv.setInputContent$default(c47988uAvOLrzqt2, strOLrzqt, false, false, 6, null);
        }
        if (c50062vAm.AhwBna(false) && (vbk = c50062vAm.aKErDB) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.DAIeex;
            vbk.EZpvd(str, pair2 != null ? pair2.getSecond() : null);
        }
        C53427wlL c53427wlL4 = c50062vAm.djSkpj;
        if (c53427wlL4 != null && (c47988uAvOLrzqt = c53427wlL4.OLrzqt()) != null) {
            c47988uAvOLrzqt.KWHzl(c50062vAm.QVAiDq);
        }
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(C50062vAm c50062vAm) {
        vBK vbk = c50062vAm.ORxRYg;
        if (vbk == null || !vbk.AEQbTJ()) {
            return Unit.INSTANCE;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairAhwBna = c50062vAm.AhwBna();
        vBK vbk2 = c50062vAm.ORxRYg;
        if (vbk2 != null) {
            vbk2.EZpvd(pairAhwBna.getFirst(), pairAhwBna.getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(C50062vAm c50062vAm) {
        vBK vbk = c50062vAm.aKErDB;
        if (vbk == null || !vbk.AEQbTJ()) {
            return Unit.INSTANCE;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL = c50062vAm.djBIcL();
        vBK vbk2 = c50062vAm.aKErDB;
        if (vbk2 != null) {
            vbk2.EZpvd(pairDjBIcL.getFirst(), pairDjBIcL.getSecond());
        }
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AhwBna() {
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
        return C56390yDp.OLrzqt(KWHzl(OrderType.LEFT), C33129mqd.OLrzqt((java.lang.Object) (pair != null ? pair.getSecond() : null), (java.lang.Object) 0) ? null : C33129mqd.gEmmrt(java.lang.Double.valueOf(KWHzl(this.AuCTel, C56036xvI.KWHzl.copydefault(), this.uzCIH, this.AkhnZx))));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> djBIcL() {
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.DAIeex;
        return C56390yDp.OLrzqt(KWHzl(OrderType.RIGHT), C33129mqd.OLrzqt((java.lang.Object) (pair != null ? pair.getSecond() : null), (java.lang.Object) 0) ? null : C33129mqd.gEmmrt(java.lang.Double.valueOf(KWHzl(this.DAIeex, C56036xvI.KWHzl.AEQbTJ(), this.DarRvM, this.iRxXKY))));
    }

    /* JADX INFO: renamed from: o.vAm$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vAm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String instId;
        java.lang.String str2;
        java.lang.String instId2;
        Intrinsics.checkNotNullParameter(view, "");
        this.gGvvIC = (C53497wmc) view.findViewById(C48033uCm.Application.ODXsMY);
        this.gEmmrt = (C53441wlZ) view.findViewById(C48033uCm.Application.dmfpNf);
        this.iZzfmt = (C53441wlZ) view.findViewById(C48033uCm.Application.hrNTAI);
        this.getPostValueLengthLimit = (android.widget.LinearLayout) view.findViewById(C48033uCm.Application.hBpjJd);
        this.ejfBZ = (C53501wmg) view.findViewById(C48033uCm.Application.OHqIaq);
        this.DCJXGO = (C53501wmg) view.findViewById(C48033uCm.Application.DLWbHP);
        this.DCUTEI = (android.widget.LinearLayout) view.findViewById(C48033uCm.Application.getOptionsList);
        this.fvQaOB = (C55258xgZ) view.findViewById(C48033uCm.Application.removeDelegateFromActives);
        this.AYXKKw = (android.widget.LinearLayout) view.findViewById(C48033uCm.Application.DdI);
        this.sSMYrx = (C53427wlL) view.findViewById(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi23);
        this.djSkpj = (C53427wlL) view.findViewById(C48033uCm.Application.removeOnConfigurationChangedListener);
        this.KWHzl = (android.widget.LinearLayout) view.findViewById(C48033uCm.Application.onContextAvailable);
        this.valueOf = (android.widget.ImageView) view.findViewById(C48033uCm.Application.INotificationSideChannel);
        this.flVtFt = (android.widget.TextView) view.findViewById(C48033uCm.Application.AppCompatDelegateImplApi21Impl);
        this.zuWLRA = (C52794wYp) view.findViewById(C48033uCm.Application.isNight);
        fIwbmz();
        ejfBZ();
        QOLQEE();
        android.widget.ImageView imageView = this.valueOf;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.vBg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50062vAm.AEQbTJ(this.AEQbTJ, view2);
                }
            });
        }
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.ruDxL, new C53994wvw(), this.getFieldNames).commitAllowingStateLoss();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.AhwBna = new vBS(childFragmentManager, getActivity(), this.gEmmrt, this.ejfBZ, this.djBIcL, null, 32, null);
        androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        this.giSNqX = new vBS(childFragmentManager2, getActivity(), this.iZzfmt, this.DCJXGO, this.AxsJAYaxsJAY, null, 32, null);
        C53441wlZ c53441wlZ = this.gEmmrt;
        if (c53441wlZ != null) {
            c53441wlZ.setPresenter(this.AhwBna);
        }
        C53501wmg c53501wmg = this.ejfBZ;
        if (c53501wmg != null) {
            c53501wmg.setPresenter(this.AhwBna);
        }
        C53441wlZ c53441wlZ2 = this.iZzfmt;
        if (c53441wlZ2 != null) {
            c53441wlZ2.setPresenter(this.giSNqX);
        }
        C53501wmg c53501wmg2 = this.DCJXGO;
        if (c53501wmg2 != null) {
            c53501wmg2.setPresenter(this.giSNqX);
        }
        android.widget.LinearLayout linearLayout = this.DCUTEI;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.vBu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50062vAm.KWHzl(this.OLrzqt, view2);
                }
            });
        }
        C55258xgZ c55258xgZ = this.fvQaOB;
        if (c55258xgZ != null) {
            c55258xgZ.setOnClickListener(new View.OnClickListener() { // from class: o.vBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50062vAm.AYXKKw(this.AEQbTJ, view2);
                }
            });
        }
        C53497wmc c53497wmc = this.gGvvIC;
        if (c53497wmc != null) {
            c53497wmc.setCallback(new ActionBar());
        }
        C53501wmg c53501wmg3 = this.ejfBZ;
        if (c53501wmg3 != null) {
            c53501wmg3.setPriceChangeCallback(new Function2() { // from class: o.vBx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50062vAm.EZpvd(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
        C53501wmg c53501wmg4 = this.DCJXGO;
        if (c53501wmg4 != null) {
            c53501wmg4.setPriceChangeCallback(new Function2() { // from class: o.vBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C50062vAm.AEQbTJ(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
        C53501wmg c53501wmg5 = this.ejfBZ;
        if (c53501wmg5 != null) {
            c53501wmg5.setOnTradeModeClickListener(new View.OnClickListener() { // from class: o.vAs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50062vAm.copydefault(view2);
                }
            });
        }
        C53501wmg c53501wmg6 = this.DCJXGO;
        if (c53501wmg6 != null) {
            c53501wmg6.setOnTradeModeClickListener(new View.OnClickListener() { // from class: o.vAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50062vAm.AEQbTJ(view2);
                }
            });
        }
        C53441wlZ c53441wlZ3 = this.gEmmrt;
        if (c53441wlZ3 != null) {
            c53441wlZ3.setOpponentPriceView(this.iZzfmt);
        }
        C53441wlZ c53441wlZ4 = this.iZzfmt;
        if (c53441wlZ4 != null) {
            c53441wlZ4.setOpponentPriceView(this.gEmmrt);
        }
        AxsJAY();
        DTwDnp();
        C52794wYp c52794wYp = this.zuWLRA;
        if (c52794wYp != null) {
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
            C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.vAu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C50062vAm.OLrzqt(this.EZpvd, obj);
                }
            });
        }
        zsXlph();
        BizInstrument bizInstrument = this.AkhnZx;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            str = null;
        } else {
            BizInstrument bizInstrument2 = this.iRxXKY;
            if (bizInstrument2 == null || (instId2 = bizInstrument2.getInstId()) == null) {
                str2 = null;
            } else if (instId2.length() > 0) {
                str2 = "," + instId2;
            } else {
                str2 = "";
            }
            str = instId + str2;
        }
        C55867xrz.KWHzl.OLrzqt("arbitrage", str != null ? str : "");
        C56028xvA.registerBotFragmentTrack$default(this, "ArbitrageTradeFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C50062vAm c50062vAm, android.view.View view) {
        android.widget.LinearLayout linearLayout = c50062vAm.KWHzl;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    public static final void KWHzl(C50062vAm c50062vAm, android.view.View view) {
        C50060vAk.Companion.AEQbTJ(c50062vAm.gasjUx).show(c50062vAm.getChildFragmentManager(), "arbitrageSetPrice");
        C56028xvA.botClickTrack$default("setPriceContainer", null, 2, null);
    }

    public static final void AYXKKw(C50062vAm c50062vAm, android.view.View view) {
        new C50065vAp().show(c50062vAm.getChildFragmentManager(), "arbitrageSetPriceTip");
    }

    /* JADX INFO: renamed from: o.vAm$ActionBar */
    public static final class ActionBar implements InterfaceC53561wnn {
        public ActionBar() {
        }

        @Override // o.InterfaceC53561wnn
        public void copydefault(OrderType orderType) {
            xOW newProxyInstance;
            xOW newProxyInstance2;
            Intrinsics.checkNotNullParameter(orderType, "");
            if (C50062vAm.this.OLrzqt(orderType)) {
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                final java.lang.String str = c54589xNz.EZpvd() ? "demo" : "live";
                EventParamsList eventParamsList = new EventParamsList();
                eventParamsList.put("entrust_type", "arbitrage", true);
                eventParamsList.put(OtcExtraKeys.MODE, str, true);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM();
                if (strWlaJM != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
                    eventParamsList.put("account_type", strWlaJM, true);
                }
                Unit unit = Unit.INSTANCE;
                C32866mlf.onEvent$default("app_trade_strategy_confirm_create_click", null, null, eventParamsList, null, null, 27, null);
                C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vBC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50062vAm.ActionBar.EZpvd(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                    C50062vAm.this.EZpvd(orderType);
                } else {
                    pUU.KWHzl("BotOrder", "二次确认关闭 ArbitrageTradeFragment Start Order");
                    C50062vAm.this.copydefault(orderType);
                }
            }
        }

        public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "arbitrage", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(C50062vAm c50062vAm, java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        C47988uAv c47988uAvOLrzqt3;
        TickersData tickersData;
        C47988uAv c47988uAvKWHzl4;
        C47988uAv c47988uAvOLrzqt4;
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c50062vAm.AuCTel = new kotlin.Pair<>(str, str2);
        c50062vAm.zuBGHE();
        c50062vAm.fetchVPNInfo(true);
        C53427wlL c53427wlL = c50062vAm.sSMYrx;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL == null || (c47988uAvOLrzqt4 = c53427wlL.OLrzqt()) == null) ? null : c47988uAvOLrzqt4.AkhnZx()))) {
            if (c50062vAm.djBIcL(true)) {
                C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
                strEZpvd = (c53427wlL2 == null || (c47988uAvOLrzqt3 = c53427wlL2.OLrzqt()) == null) ? null : c47988uAvOLrzqt3.AkhnZx();
            } else {
                vBG vbgAkhnZx = c50062vAm.AkhnZx();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.AuCTel, C56036xvI.KWHzl.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
                C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
                java.lang.String strAkhnZx = (c53427wlL3 == null || (c47988uAvOLrzqt = c53427wlL3.OLrzqt()) == null) ? null : c47988uAvOLrzqt.AkhnZx();
                xMJ.TaskDescription taskDescription = c50062vAm.OcIXYQ;
                strEZpvd = vbgAkhnZx.EZpvd(true, strGEmmrt, strAkhnZx, taskDescription != null ? taskDescription.OLrzqt() : null);
            }
            C53427wlL c53427wlL4 = c50062vAm.sSMYrx;
            if (c53427wlL4 != null && (c47988uAvKWHzl3 = c53427wlL4.KWHzl()) != null) {
                c47988uAvKWHzl3.OLrzqt(c50062vAm.QKVWgx);
            }
            C53427wlL c53427wlL5 = c50062vAm.sSMYrx;
            if (c53427wlL5 != null && (c47988uAvKWHzl2 = c53427wlL5.KWHzl()) != null) {
                C47988uAv.setInputContent$default(c47988uAvKWHzl2, strEZpvd, false, false, 6, null);
            }
            C53427wlL c53427wlL6 = c50062vAm.sSMYrx;
            if (c53427wlL6 != null && (c47988uAvKWHzl = c53427wlL6.KWHzl()) != null) {
                c47988uAvKWHzl.KWHzl(c50062vAm.QKVWgx);
            }
            vBG vbgAkhnZx2 = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
            C53427wlL c53427wlL7 = c50062vAm.sSMYrx;
            vbgAkhnZx2.KWHzl(true, strGEmmrt2, strGEmmrt3, strEZpvd, (c53427wlL7 == null || (c47988uAvOLrzqt2 = c53427wlL7.OLrzqt()) == null) ? null : c47988uAvOLrzqt2.AkhnZx(), c50062vAm.djBIcL(false));
        } else {
            C53427wlL c53427wlL8 = c50062vAm.sSMYrx;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL8 == null || (c47988uAvKWHzl4 = c53427wlL8.KWHzl()) == null) ? null : c47988uAvKWHzl4.AkhnZx()))) {
            }
        }
        BizInstrument bizInstrument = c50062vAm.AkhnZx;
        if (!c50062vAm.OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, c50062vAm.fJNWhG, c50062vAm.fIwbmz)) {
            java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.AuCTel, C56036xvI.KWHzl.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt4) && ((tickersData = c50062vAm.uzCIH) == null || (strGEmmrt4 = tickersData.getLast()) == null)) {
                strGEmmrt4 = "";
            }
            java.lang.String str3 = C33129mqd.OLrzqt(strGEmmrt4, "0") ? null : strGEmmrt4;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "enter")) {
                vBK vbk = c50062vAm.ORxRYg;
                if (vbk != null) {
                    if (vbk != null && vbk.AEQbTJ()) {
                        strKWHzl = c50062vAm.KWHzl(OrderType.LEFT);
                    }
                    vbk.EZpvd(strKWHzl, str3);
                }
            } else {
                vBK vbk2 = c50062vAm.ORxRYg;
                if (vbk2 != null) {
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "marketPrice");
                    vBK vbk3 = c50062vAm.ORxRYg;
                    if (vbk3 != null && vbk3.AEQbTJ()) {
                        strKWHzl = c50062vAm.KWHzl(OrderType.LEFT);
                    }
                    vbk2.OLrzqt(zEZpvd, str3, strKWHzl);
                }
            }
            c50062vAm.valueOf(true);
        }
        C56028xvA.OLrzqt("leftPriceView", C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", str), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, C33129mqd.gEmmrt(str2))));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C50062vAm c50062vAm, java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        C47988uAv c47988uAvOLrzqt3;
        TickersData tickersData;
        C47988uAv c47988uAvKWHzl4;
        C47988uAv c47988uAvOLrzqt4;
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c50062vAm.DAIeex = new kotlin.Pair<>(str, str2);
        c50062vAm.zuBGHE();
        c50062vAm.fetchVPNInfo(false);
        C53427wlL c53427wlL = c50062vAm.djSkpj;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL == null || (c47988uAvOLrzqt4 = c53427wlL.OLrzqt()) == null) ? null : c47988uAvOLrzqt4.AkhnZx()))) {
            if (c50062vAm.djBIcL(false)) {
                C53427wlL c53427wlL2 = c50062vAm.djSkpj;
                strEZpvd = (c53427wlL2 == null || (c47988uAvOLrzqt3 = c53427wlL2.OLrzqt()) == null) ? null : c47988uAvOLrzqt3.AkhnZx();
            } else {
                vBG vbgAkhnZx = c50062vAm.AkhnZx();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, C56036xvI.KWHzl.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
                C53427wlL c53427wlL3 = c50062vAm.djSkpj;
                java.lang.String strAkhnZx = (c53427wlL3 == null || (c47988uAvOLrzqt = c53427wlL3.OLrzqt()) == null) ? null : c47988uAvOLrzqt.AkhnZx();
                xMJ.TaskDescription taskDescription = c50062vAm.UeEOUB;
                strEZpvd = vbgAkhnZx.EZpvd(false, strGEmmrt, strAkhnZx, taskDescription != null ? taskDescription.OLrzqt() : null);
            }
            C53427wlL c53427wlL4 = c50062vAm.djSkpj;
            if (c53427wlL4 != null && (c47988uAvKWHzl3 = c53427wlL4.KWHzl()) != null) {
                c47988uAvKWHzl3.OLrzqt(c50062vAm.finit);
            }
            C53427wlL c53427wlL5 = c50062vAm.djSkpj;
            if (c53427wlL5 != null && (c47988uAvKWHzl2 = c53427wlL5.KWHzl()) != null) {
                C47988uAv.setInputContent$default(c47988uAvKWHzl2, strEZpvd, false, false, 6, null);
            }
            C53427wlL c53427wlL6 = c50062vAm.djSkpj;
            if (c53427wlL6 != null && (c47988uAvKWHzl = c53427wlL6.KWHzl()) != null) {
                c47988uAvKWHzl.KWHzl(c50062vAm.finit);
            }
            vBG vbgAkhnZx2 = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx)));
            java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
            C53427wlL c53427wlL7 = c50062vAm.djSkpj;
            vbgAkhnZx2.KWHzl(false, strGEmmrt2, strGEmmrt3, strEZpvd, (c53427wlL7 == null || (c47988uAvOLrzqt2 = c53427wlL7.OLrzqt()) == null) ? null : c47988uAvOLrzqt2.AkhnZx(), c50062vAm.djBIcL(true));
        } else {
            C53427wlL c53427wlL8 = c50062vAm.djSkpj;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL8 == null || (c47988uAvKWHzl4 = c53427wlL8.KWHzl()) == null) ? null : c47988uAvKWHzl4.AkhnZx()))) {
            }
        }
        BizInstrument bizInstrument = c50062vAm.iRxXKY;
        if (!c50062vAm.OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, c50062vAm.DXXBbs, c50062vAm.AxsJAYsNCnLh)) {
            java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, C56036xvI.KWHzl.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY)));
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt4) && ((tickersData = c50062vAm.DarRvM) == null || (strGEmmrt4 = tickersData.getLast()) == null)) {
                strGEmmrt4 = "";
            }
            java.lang.String str3 = C33129mqd.OLrzqt(strGEmmrt4, "0") ? null : strGEmmrt4;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "enter")) {
                vBK vbk = c50062vAm.aKErDB;
                if (vbk != null) {
                    if (vbk != null && vbk.AEQbTJ()) {
                        strKWHzl = c50062vAm.KWHzl(OrderType.RIGHT);
                    }
                    vbk.EZpvd(strKWHzl, str3);
                }
            } else {
                vBK vbk2 = c50062vAm.aKErDB;
                if (vbk2 != null) {
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "marketPrice");
                    vBK vbk3 = c50062vAm.aKErDB;
                    if (vbk3 != null && vbk3.AEQbTJ()) {
                        strKWHzl = c50062vAm.KWHzl(OrderType.RIGHT);
                    }
                    vbk2.OLrzqt(zEZpvd, str3, strKWHzl);
                }
            }
            c50062vAm.valueOf(false);
        }
        C56028xvA.OLrzqt("rightPriceView", C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", str), C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, C33129mqd.gEmmrt(str2))));
        return Unit.INSTANCE;
    }

    public static final void copydefault(android.view.View view) {
        C56028xvA.botClickTrack$default("leftTradeMode", null, 2, null);
    }

    public static final void AEQbTJ(android.view.View view) {
        C56028xvA.botClickTrack$default("rightTradeMode", null, 2, null);
    }

    public static final void OLrzqt(C50062vAm c50062vAm, java.lang.Object obj) {
        FragmentActivity activity = c50062vAm.getActivity();
        if (activity != null) {
            InterfaceC49496upe.Application.startAccountModeActivity$default(C53685wqE.copydefault.copydefault(), activity, "2", null, 4, null);
        }
    }

    public final void fIwbmz() {
        C53441wlZ c53441wlZ = this.gEmmrt;
        if (c53441wlZ != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c53441wlZ.setFragmentManger(childFragmentManager);
        }
        C53441wlZ c53441wlZ2 = this.gEmmrt;
        if (c53441wlZ2 != null) {
            c53441wlZ2.setCoinSelectCallback(this.djBIcL);
        }
        C53441wlZ c53441wlZ3 = this.iZzfmt;
        if (c53441wlZ3 != null) {
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            c53441wlZ3.setFragmentManger(childFragmentManager2);
        }
        C53441wlZ c53441wlZ4 = this.iZzfmt;
        if (c53441wlZ4 != null) {
            c53441wlZ4.setCoinSelectCallback(this.AxsJAYaxsJAY);
        }
        C53441wlZ c53441wlZ5 = this.iZzfmt;
        if (c53441wlZ5 != null) {
            c53441wlZ5.OLrzqt();
        }
    }

    public final void ejfBZ() {
        C53501wmg c53501wmg = this.ejfBZ;
        if (c53501wmg != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c53501wmg.setFragmentManger(childFragmentManager);
        }
        C53501wmg c53501wmg2 = this.ejfBZ;
        if (c53501wmg2 != null) {
            c53501wmg2.setPriceCallback(this.djBIcL);
        }
        C53501wmg c53501wmg3 = this.DCJXGO;
        if (c53501wmg3 != null) {
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            c53501wmg3.setFragmentManger(childFragmentManager2);
        }
        C53501wmg c53501wmg4 = this.DCJXGO;
        if (c53501wmg4 != null) {
            c53501wmg4.setPriceCallback(this.AxsJAYaxsJAY);
        }
        C53441wlZ c53441wlZ = this.iZzfmt;
        if (c53441wlZ != null) {
            c53441wlZ.OLrzqt();
        }
    }

    public final void zsXlph() {
        TradeLiveData<Unit> tradeLiveDataEZpvd = isConnected().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new LoaderManager(new Function1() { // from class: o.vAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50062vAm.EZpvd(this.OLrzqt, (Unit) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataCopydefault = isConnected().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new Observer() { // from class: o.vAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.EZpvd(((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(C50062vAm c50062vAm, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c50062vAm.AYXKKw().AhwBna().postValue(unit);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(boolean z) {
        if (z) {
            C55326xho.toastWithSuccessfulIcon$default(C48033uCm.Fragment.OAjjVP, 0, 1, (java.lang.Object) null);
        }
    }

    public static final void OLrzqt(C50062vAm c50062vAm, android.view.View view, android.view.View view2) {
        C49960uyR.setWindowSoftInput$default(c50062vAm, view, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), view2, 0, 8, (java.lang.Object) null);
    }

    private final void QOLQEE() {
        android.widget.LinearLayout linearLayout = this.getPostValueLengthLimit;
        Intrinsics.copydefault(linearLayout);
        C53501wmg c53501wmg = this.ejfBZ;
        Intrinsics.copydefault(c53501wmg);
        OLrzqt(this, linearLayout, c53501wmg);
        android.widget.LinearLayout linearLayout2 = this.getPostValueLengthLimit;
        Intrinsics.copydefault(linearLayout2);
        C53501wmg c53501wmg2 = this.DCJXGO;
        Intrinsics.copydefault(c53501wmg2);
        OLrzqt(this, linearLayout2, c53501wmg2);
        C53427wlL c53427wlL = this.sSMYrx;
        Intrinsics.copydefault(c53427wlL);
        C47988uAv c47988uAvOLrzqt = c53427wlL.OLrzqt();
        C53427wlL c53427wlL2 = this.sSMYrx;
        Intrinsics.copydefault(c53427wlL2);
        OLrzqt(this, c47988uAvOLrzqt, c53427wlL2.OLrzqt());
        C53427wlL c53427wlL3 = this.djSkpj;
        Intrinsics.copydefault(c53427wlL3);
        C47988uAv c47988uAvOLrzqt2 = c53427wlL3.OLrzqt();
        C53427wlL c53427wlL4 = this.djSkpj;
        Intrinsics.copydefault(c53427wlL4);
        OLrzqt(this, c47988uAvOLrzqt2, c53427wlL4.OLrzqt());
        C53427wlL c53427wlL5 = this.sSMYrx;
        Intrinsics.copydefault(c53427wlL5);
        C47988uAv c47988uAvKWHzl = c53427wlL5.KWHzl();
        C53427wlL c53427wlL6 = this.sSMYrx;
        Intrinsics.copydefault(c53427wlL6);
        OLrzqt(this, c47988uAvKWHzl, c53427wlL6.KWHzl());
        C53427wlL c53427wlL7 = this.djSkpj;
        Intrinsics.copydefault(c53427wlL7);
        C47988uAv c47988uAvKWHzl2 = c53427wlL7.KWHzl();
        C53427wlL c53427wlL8 = this.djSkpj;
        Intrinsics.copydefault(c53427wlL8);
        OLrzqt(this, c47988uAvKWHzl2, c53427wlL8.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(boolean z) {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        java.lang.String str = "quote_ccy";
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.fJNWhG, this.fIwbmz)) {
                return;
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            java.lang.String strWlaJM = (interfaceC54581xNrCopydefault == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM();
            if (Intrinsics.EZpvd((java.lang.Object) strWlaJM, (java.lang.Object) "2")) {
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "SPOT")) {
                    kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
                    if (Intrinsics.EZpvd((java.lang.Object) (pair != null ? pair.getFirst() : null), (java.lang.Object) "marketPrice")) {
                        if (!Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "buy")) {
                            str = "base_ccy";
                        }
                    }
                } else {
                    str = null;
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) strWlaJM, (java.lang.Object) "3")) {
                BizInstrument bizInstrument3 = this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "SPOT")) {
                    kotlin.Pair<java.lang.String, java.lang.String> pair2 = this.AuCTel;
                    if (Intrinsics.EZpvd((java.lang.Object) (pair2 != null ? pair2.getFirst() : null), (java.lang.Object) "marketPrice") && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "cross")) {
                        if (!Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "buy")) {
                        }
                    }
                } else {
                    BizInstrument bizInstrument4 = this.AkhnZx;
                    if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "MARGIN")) {
                    }
                }
            }
            vBK vbk = this.ORxRYg;
            if (vbk != null) {
                vbk.valueOf(str);
                return;
            }
            return;
        }
        BizInstrument bizInstrument5 = this.iRxXKY;
        if (OLrzqt(bizInstrument5 != null ? bizInstrument5.getInstType() : null, this.DXXBbs, this.AxsJAYsNCnLh)) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
        java.lang.String strWlaJM2 = (interfaceC54581xNrCopydefault2 == null || (newProxyInstance = interfaceC54581xNrCopydefault2.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
        if (Intrinsics.EZpvd((java.lang.Object) strWlaJM2, (java.lang.Object) "2")) {
            BizInstrument bizInstrument6 = this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument6 != null ? bizInstrument6.getInstType() : null), (java.lang.Object) "SPOT")) {
                kotlin.Pair<java.lang.String, java.lang.String> pair3 = this.DAIeex;
                if (Intrinsics.EZpvd((java.lang.Object) (pair3 != null ? pair3.getFirst() : null), (java.lang.Object) "marketPrice")) {
                    if (!Intrinsics.EZpvd((java.lang.Object) this.DXXBbs, (java.lang.Object) "buy")) {
                        str = "base_ccy";
                    }
                }
            } else {
                str = null;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strWlaJM2, (java.lang.Object) "3")) {
            BizInstrument bizInstrument7 = this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument7 != null ? bizInstrument7.getInstType() : null), (java.lang.Object) "SPOT")) {
                kotlin.Pair<java.lang.String, java.lang.String> pair4 = this.DAIeex;
                if (Intrinsics.EZpvd((java.lang.Object) (pair4 != null ? pair4.getFirst() : null), (java.lang.Object) "marketPrice") && Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "cross")) {
                    if (!Intrinsics.EZpvd((java.lang.Object) this.DXXBbs, (java.lang.Object) "buy")) {
                    }
                }
            } else {
                BizInstrument bizInstrument8 = this.iRxXKY;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument8 != null ? bizInstrument8.getInstType() : null), (java.lang.Object) "MARGIN")) {
                }
            }
        }
        vBK vbk2 = this.aKErDB;
        if (vbk2 != null) {
            vbk2.valueOf(str);
        }
    }

    public final void gEmmrt(boolean z) {
        InterfaceC50102vBz interfaceC50102vBz;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        java.lang.String quoteSymbol = null;
        java.lang.String strEZpvd = (!z ? (interfaceC50102vBz = this.giSNqX) != null : (interfaceC50102vBz = this.AhwBna) != null) ? null : interfaceC50102vBz.EZpvd();
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.fJNWhG, this.fIwbmz)) {
                return;
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            java.lang.String strWlaJM = (interfaceC54581xNrCopydefault == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM();
            if (Intrinsics.EZpvd((java.lang.Object) strWlaJM, (java.lang.Object) "2")) {
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "MARGIN") || !Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "isolated")) {
                    BizInstrument bizInstrument3 = this.AkhnZx;
                    if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "cross")) {
                        quoteSymbol = strEZpvd;
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "buy")) {
                    BizInstrument bizInstrument4 = this.AkhnZx;
                    if (bizInstrument4 != null) {
                        quoteSymbol = bizInstrument4.getTradeSymbol();
                    }
                } else {
                    BizInstrument bizInstrument5 = this.AkhnZx;
                    if (bizInstrument5 != null) {
                        quoteSymbol = bizInstrument5.getQuoteSymbol();
                    }
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) strWlaJM, (java.lang.Object) "3")) {
                BizInstrument bizInstrument6 = this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument6 != null ? bizInstrument6.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "isolated")) {
                    if (Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "buy")) {
                        BizInstrument bizInstrument7 = this.AkhnZx;
                        if (bizInstrument7 != null) {
                            quoteSymbol = bizInstrument7.getTradeSymbol();
                        }
                    } else {
                        BizInstrument bizInstrument8 = this.AkhnZx;
                        if (bizInstrument8 != null) {
                            quoteSymbol = bizInstrument8.getQuoteSymbol();
                        }
                    }
                }
            }
            vBK vbk = this.ORxRYg;
            if (vbk != null) {
                vbk.EZpvd(quoteSymbol);
                return;
            }
            return;
        }
        BizInstrument bizInstrument9 = this.iRxXKY;
        if (OLrzqt(bizInstrument9 != null ? bizInstrument9.getInstType() : null, this.DXXBbs, this.AxsJAYsNCnLh)) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
        java.lang.String strWlaJM2 = (interfaceC54581xNrCopydefault2 == null || (newProxyInstance = interfaceC54581xNrCopydefault2.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
        if (Intrinsics.EZpvd((java.lang.Object) strWlaJM2, (java.lang.Object) "2")) {
            BizInstrument bizInstrument10 = this.iRxXKY;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument10 != null ? bizInstrument10.getInstType() : null), (java.lang.Object) "MARGIN") || !Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "isolated")) {
                BizInstrument bizInstrument11 = this.iRxXKY;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument11 != null ? bizInstrument11.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "cross")) {
                    quoteSymbol = strEZpvd;
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) this.DXXBbs, (java.lang.Object) "buy")) {
                BizInstrument bizInstrument12 = this.iRxXKY;
                if (bizInstrument12 != null) {
                    quoteSymbol = bizInstrument12.getTradeSymbol();
                }
            } else {
                BizInstrument bizInstrument13 = this.iRxXKY;
                if (bizInstrument13 != null) {
                    quoteSymbol = bizInstrument13.getQuoteSymbol();
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) strWlaJM2, (java.lang.Object) "3")) {
            BizInstrument bizInstrument14 = this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument14 != null ? bizInstrument14.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "isolated")) {
                if (Intrinsics.EZpvd((java.lang.Object) this.DXXBbs, (java.lang.Object) "buy")) {
                    BizInstrument bizInstrument15 = this.iRxXKY;
                    if (bizInstrument15 != null) {
                        quoteSymbol = bizInstrument15.getTradeSymbol();
                    }
                } else {
                    BizInstrument bizInstrument16 = this.iRxXKY;
                    if (bizInstrument16 != null) {
                        quoteSymbol = bizInstrument16.getQuoteSymbol();
                    }
                }
            }
        }
        vBK vbk2 = this.aKErDB;
        if (vbk2 != null) {
            vbk2.EZpvd(quoteSymbol);
        }
    }

    public final void wlaJM() {
        isConnected(true);
        BizInstrument bizInstrument = this.AkhnZx;
        if (!OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.fJNWhG, this.fIwbmz)) {
            values(true);
        }
        OLrzqt(true, this.fJNWhG, this.fIwbmz);
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.setOnIvReduceClickListener(new Function0() { // from class: o.vAC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.OcIXYQ(this.EZpvd);
                }
            });
        }
        C53427wlL c53427wlL2 = this.sSMYrx;
        if (c53427wlL2 != null) {
            c53427wlL2.setOnClickTransferCallback(true ^ C54589xNz.EZpvd.EZpvd(), new Function0() { // from class: o.vAP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.DTwDnp(this.OLrzqt);
                }
            });
        }
        C53427wlL c53427wlL3 = this.sSMYrx;
        if (c53427wlL3 != null) {
            c53427wlL3.setOnClickReduceCallback(new Function0() { // from class: o.vAZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.QKVWgx(this.EZpvd);
                }
            });
        }
    }

    public static final Unit OcIXYQ(C50062vAm c50062vAm) {
        c50062vAm.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final Unit DTwDnp(C50062vAm c50062vAm) {
        c50062vAm.KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(C50062vAm c50062vAm) {
        boolean z = !c50062vAm.AuCTelauCTel;
        c50062vAm.AuCTelauCTel = z;
        SPUtils.put("arbitrage_left_reduce_only_type", java.lang.Boolean.valueOf(z));
        c50062vAm.values(true);
        return Unit.INSTANCE;
    }

    public final void AwvSrB() {
        isConnected(false);
        BizInstrument bizInstrument = this.iRxXKY;
        if (!OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.DXXBbs, this.AxsJAYsNCnLh)) {
            values(false);
        }
        OLrzqt(false, this.DXXBbs, this.AxsJAYsNCnLh);
        C53427wlL c53427wlL = this.djSkpj;
        if (c53427wlL != null) {
            c53427wlL.setOnIvReduceClickListener(new Function0() { // from class: o.vBa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.ORxRYg(this.OLrzqt);
                }
            });
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.setOnClickTransferCallback(!C54589xNz.EZpvd.EZpvd(), new Function0() { // from class: o.vBe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.QfsBiF(this.EZpvd);
                }
            });
        }
        C53427wlL c53427wlL3 = this.djSkpj;
        if (c53427wlL3 != null) {
            c53427wlL3.setOnClickReduceCallback(new Function0() { // from class: o.vBd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.QUSxYX(this.EZpvd);
                }
            });
        }
    }

    public static final Unit ORxRYg(C50062vAm c50062vAm) {
        c50062vAm.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final Unit QfsBiF(C50062vAm c50062vAm) {
        c50062vAm.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final Unit QUSxYX(C50062vAm c50062vAm) {
        boolean z = !c50062vAm.wlaJM;
        c50062vAm.wlaJM = z;
        SPUtils.put("arbitrage_right_reduce_only_type", java.lang.Boolean.valueOf(z));
        c50062vAm.values(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uzCIH() {
        boolean z;
        java.lang.String instType;
        vBK vbk = this.ORxRYg;
        if (vbk != null) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            java.lang.String str = this.fJNWhG;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.fIwbmz;
            z = vbk.OLrzqt(instType, str, str2 != null ? str2 : "");
        }
        if (z) {
            C53427wlL c53427wlL = this.sSMYrx;
            if (c53427wlL != null) {
                c53427wlL.setAvailUseLabelType(1);
            }
            C53427wlL c53427wlL2 = this.sSMYrx;
            if (c53427wlL2 != null) {
                c53427wlL2.setAvailUseUnderStyle(0);
            }
            C53427wlL c53427wlL3 = this.sSMYrx;
            if (c53427wlL3 != null) {
                c53427wlL3.setAvailUseClick(new Function0() { // from class: o.vBf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50062vAm.gHZMYf(this.copydefault);
                    }
                });
            }
        } else {
            C53427wlL c53427wlL4 = this.sSMYrx;
            if (c53427wlL4 != null) {
                C53427wlL.setAvailUseClick$default(c53427wlL4, null, 1, null);
            }
            C53427wlL c53427wlL5 = this.sSMYrx;
            if (c53427wlL5 != null) {
                c53427wlL5.setAvailUseLabelType(2);
            }
        }
        C53427wlL c53427wlL6 = this.sSMYrx;
        if (c53427wlL6 != null) {
            c53427wlL6.setAvailTradeVisible(!z);
        }
    }

    public static final Unit gHZMYf(C50062vAm c50062vAm) {
        android.content.Context context = c50062vAm.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticLambda1));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanion), new View.OnClickListener() { // from class: o.vAX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50062vAm.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wlL.setAvailUseClick$default(o.wlL, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getFieldNames() {
        boolean z;
        java.lang.String instType;
        vBK vbk = this.aKErDB;
        if (vbk != null) {
            BizInstrument bizInstrument = this.iRxXKY;
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            java.lang.String str = this.DXXBbs;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.AxsJAYsNCnLh;
            z = vbk.OLrzqt(instType, str, str2 != null ? str2 : "");
        }
        if (z) {
            C53427wlL c53427wlL = this.djSkpj;
            if (c53427wlL != null) {
                c53427wlL.setAvailUseLabelType(1);
            }
            C53427wlL c53427wlL2 = this.djSkpj;
            if (c53427wlL2 != null) {
                c53427wlL2.setAvailUseUnderStyle(0);
            }
            C53427wlL c53427wlL3 = this.djSkpj;
            if (c53427wlL3 != null) {
                c53427wlL3.setAvailUseClick(new Function0() { // from class: o.vBb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C50062vAm.QOLQEE(this.AEQbTJ);
                    }
                });
            }
        } else {
            C53427wlL c53427wlL4 = this.djSkpj;
            if (c53427wlL4 != null) {
                C53427wlL.setAvailUseClick$default(c53427wlL4, null, 1, null);
            }
            C53427wlL c53427wlL5 = this.djSkpj;
            if (c53427wlL5 != null) {
                c53427wlL5.setAvailUseLabelType(2);
            }
        }
        C53427wlL c53427wlL6 = this.djSkpj;
        if (c53427wlL6 != null) {
            c53427wlL6.setAvailTradeVisible(!z);
        }
    }

    public static final Unit QOLQEE(C50062vAm c50062vAm) {
        android.content.Context context = c50062vAm.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ComponentDialogExternalSyntheticLambda1));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanion), new View.OnClickListener() { // from class: o.vBj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50062vAm.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AubY() {
        fetchVPNInfo(true);
        DbNXlk(true);
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.setSameAmtVisible(true);
        }
        C53427wlL c53427wlL2 = this.sSMYrx;
        if (c53427wlL2 != null) {
            c53427wlL2.setSameTotalVisible(true);
        }
    }

    public final void gHZMYf() {
        fetchVPNInfo(false);
        DbNXlk(false);
        C53427wlL c53427wlL = this.djSkpj;
        if (c53427wlL != null) {
            c53427wlL.setSameAmtVisible(false);
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.setSameTotalVisible(false);
        }
    }

    public final void AxsJAY() {
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.setSameAmtClickCallback(new Function0() { // from class: o.vAQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.QVAiDq(this.copydefault);
                }
            });
        }
        C53427wlL c53427wlL2 = this.sSMYrx;
        if (c53427wlL2 != null) {
            c53427wlL2.setSameTotalClickCallback(new Function0() { // from class: o.vAW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50062vAm.RJOkX(this.OLrzqt);
                }
            });
        }
    }

    public static final Unit QVAiDq(C50062vAm c50062vAm) {
        java.lang.String strFARcdN;
        C47988uAv c47988uAvOLrzqt;
        java.lang.String strFARcdN2;
        C47988uAv c47988uAvOLrzqt2;
        if (c50062vAm.AkhnZx().AYXKKw().getValue() == EnableState.DISABLE_SELECT || c50062vAm.AkhnZx().AYXKKw().getValue() == EnableState.DISABLE_UNSELECT) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getPackageName));
        } else {
            boolean z = !c50062vAm.zLjUOn;
            c50062vAm.zLjUOn = z;
            SPUtils.put("arbitrage_same_amt_type", java.lang.Boolean.valueOf(z));
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            C53427wlL c53427wlL = c50062vAm.sSMYrx;
            java.lang.String str = "";
            if (c53427wlL == null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null || (strFARcdN = c47988uAvOLrzqt2.fARcdN()) == null) {
                strFARcdN = "";
            }
            C53427wlL c53427wlL2 = c50062vAm.djSkpj;
            if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null && (strFARcdN2 = c47988uAvOLrzqt.fARcdN()) != null) {
                str = strFARcdN2;
            }
            vbgAkhnZx.EZpvd(strFARcdN, str, c50062vAm.zLjUOn);
        }
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(C50062vAm c50062vAm) {
        java.lang.String strFARcdN;
        C47988uAv c47988uAvKWHzl;
        java.lang.String strFARcdN2;
        C47988uAv c47988uAvKWHzl2;
        if (c50062vAm.AkhnZx().djBIcL().getValue() == EnableState.DISABLE_SELECT || c50062vAm.AkhnZx().djBIcL().getValue() == EnableState.DISABLE_UNSELECT) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getMetadata));
        } else {
            boolean z = !c50062vAm.AubY;
            c50062vAm.AubY = z;
            SPUtils.put("arbitrage_same_total_type", java.lang.Boolean.valueOf(z));
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            C53427wlL c53427wlL = c50062vAm.sSMYrx;
            java.lang.String str = "";
            if (c53427wlL == null || (c47988uAvKWHzl2 = c53427wlL.KWHzl()) == null || (strFARcdN = c47988uAvKWHzl2.fARcdN()) == null) {
                strFARcdN = "";
            }
            C53427wlL c53427wlL2 = c50062vAm.djSkpj;
            if (c53427wlL2 != null && (c47988uAvKWHzl = c53427wlL2.KWHzl()) != null && (strFARcdN2 = c47988uAvKWHzl.fARcdN()) != null) {
                str = strFARcdN2;
            }
            vbgAkhnZx.AEQbTJ(strFARcdN, str, c50062vAm.AubY);
        }
        return Unit.INSTANCE;
    }

    private final void DTwDnp() {
        this.values = new Observer() { // from class: o.vAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.OLrzqt(this.AEQbTJ, (BizInstrument) obj);
            }
        };
        this.gkJEwt = new Observer() { // from class: o.vAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.KWHzl(this.AEQbTJ, (BizInstrument) obj);
            }
        };
        this.OuxcSI = new Observer() { // from class: o.vAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.KWHzl(this.AEQbTJ, (ArbitragePriceSetting) obj);
            }
        };
        this.getNewProxyInstance = new Observer() { // from class: o.vAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.copydefault(this.KWHzl, (TickersData) obj);
            }
        };
        this.OqFWZa = new Observer() { // from class: o.vAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AEQbTJ(this.OLrzqt, (TickersData) obj);
            }
        };
        this.DbNXlk = new Observer() { // from class: o.vAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.gEmmrt(this.copydefault, (java.lang.String) obj);
            }
        };
        this.RlQdEF = new Observer() { // from class: o.vAN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.hDKMBd = new Observer() { // from class: o.vAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        this.ODWQjV = new Observer() { // from class: o.vAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        this.fetchVPNInfo = new Observer() { // from class: o.vAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        this.QKudOq = new Observer() { // from class: o.vAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.fetchVPNInfo(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.ffGIBT = new Observer() { // from class: o.vAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.KWHzl(this.EZpvd, obj);
            }
        };
        this.OLrzqt = new Observer() { // from class: o.vAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.zsXlph = new Observer() { // from class: o.vAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AhwBna(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        };
    }

    public static final void OLrzqt(C50062vAm c50062vAm, BizInstrument bizInstrument) {
        C53497wmc c53497wmc;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        c50062vAm.AkhnZx = bizInstrument;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.KWHzl(bizInstrument);
        }
        c50062vAm.zLjUOn();
        c50062vAm.zuBGHE();
        c50062vAm.AkhnZx().EZpvd(true, c50062vAm.OcIXYQ);
        c50062vAm.AYXKKw().OLrzqt().postValue(C56036xvI.KWHzl.copydefault());
        BizInstrument bizInstrument2 = c50062vAm.AkhnZx;
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "OPTION")) {
            c50062vAm.AkhnZx().KWHzl(c50062vAm.AkhnZx);
        }
        java.lang.String str = c50062vAm.fJNWhG;
        if (str != null && (c53497wmc = c50062vAm.gGvvIC) != null) {
            c53497wmc.OLrzqt(str, bizInstrument);
        }
        c50062vAm.AubY();
        c50062vAm.values();
        c50062vAm.AYXKKw(true);
        c50062vAm.wlaJM();
        c50062vAm.uzCIH();
        c50062vAm.valueOf(true);
    }

    public static final void KWHzl(C50062vAm c50062vAm, BizInstrument bizInstrument) {
        C53497wmc c53497wmc;
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        c50062vAm.gEmmrt();
        c50062vAm.iRxXKY = bizInstrument;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.giSNqX;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.KWHzl(bizInstrument);
        }
        c50062vAm.sSMYrx();
        c50062vAm.zuBGHE();
        c50062vAm.AkhnZx().EZpvd(false, c50062vAm.UeEOUB);
        c50062vAm.AYXKKw().copydefault().postValue(C56036xvI.KWHzl.AEQbTJ());
        BizInstrument bizInstrument2 = c50062vAm.iRxXKY;
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "OPTION")) {
            c50062vAm.AkhnZx().EZpvd(c50062vAm.iRxXKY);
        }
        java.lang.String str = c50062vAm.DXXBbs;
        if (str != null && (c53497wmc = c50062vAm.gGvvIC) != null) {
            c53497wmc.KWHzl(str, c50062vAm.iRxXKY);
        }
        c50062vAm.gHZMYf();
        c50062vAm.values();
        c50062vAm.AYXKKw(false);
        c50062vAm.AwvSrB();
        c50062vAm.getFieldNames();
        c50062vAm.valueOf(false);
    }

    public static final void KWHzl(C50062vAm c50062vAm, ArbitragePriceSetting arbitragePriceSetting) {
        if (arbitragePriceSetting != null) {
            c50062vAm.gasjUx = arbitragePriceSetting;
        }
        C53501wmg c53501wmg = c50062vAm.ejfBZ;
        if (c53501wmg != null) {
            c53501wmg.setPriceSetting(c50062vAm.gasjUx);
        }
        C53501wmg c53501wmg2 = c50062vAm.DCJXGO;
        if (c53501wmg2 != null) {
            c53501wmg2.setPriceSetting(c50062vAm.gasjUx);
        }
    }

    public static final void copydefault(C50062vAm c50062vAm, TickersData tickersData) {
        if (tickersData == null) {
            return;
        }
        c50062vAm.AYXKKw().EZpvd().postValue(tickersData);
        c50062vAm.uzCIH = tickersData;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.EZpvd(tickersData);
        }
        c50062vAm.zuBGHE();
        vBK vbk = c50062vAm.ORxRYg;
        if (vbk != null) {
            vbk.OLrzqt(tickersData);
        }
    }

    public static final void AEQbTJ(C50062vAm c50062vAm, TickersData tickersData) {
        if (tickersData == null) {
            return;
        }
        c50062vAm.AYXKKw().valueOf().postValue(tickersData);
        c50062vAm.DarRvM = tickersData;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.giSNqX;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.EZpvd(tickersData);
        }
        c50062vAm.zuBGHE();
        vBK vbk = c50062vAm.aKErDB;
        if (vbk != null) {
            vbk.OLrzqt(tickersData);
        }
    }

    public static final void gEmmrt(C50062vAm c50062vAm, java.lang.String str) {
        c50062vAm.isConnected = str;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.copydefault(str);
        }
        c50062vAm.AYXKKw(true);
    }

    public static final void djBIcL(C50062vAm c50062vAm, java.lang.String str) {
        c50062vAm.hUfVAv = str;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.giSNqX;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.copydefault(str);
        }
        c50062vAm.AYXKKw(false);
    }

    public static final void AEQbTJ(C50062vAm c50062vAm, kotlin.Pair pair) {
        C53497wmc c53497wmc;
        Intrinsics.checkNotNullParameter(pair, "");
        c50062vAm.fJNWhG = (java.lang.String) pair.getFirst();
        c50062vAm.fIwbmz = (java.lang.String) pair.getSecond();
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.AEQbTJ((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
        }
        java.lang.String str = c50062vAm.fJNWhG;
        if (str != null && (c53497wmc = c50062vAm.gGvvIC) != null) {
            c53497wmc.OLrzqt(str, c50062vAm.AkhnZx);
        }
        c50062vAm.AYXKKw().OLrzqt().postValue(C56036xvI.KWHzl.copydefault());
        c50062vAm.fetchVPNInfo(true);
        c50062vAm.OLrzqt(true, c50062vAm.fJNWhG, c50062vAm.fIwbmz);
        c50062vAm.uzCIH();
        c50062vAm.valueOf(true);
        c50062vAm.values();
    }

    public static final void OLrzqt(C50062vAm c50062vAm, kotlin.Pair pair) {
        C53497wmc c53497wmc;
        Intrinsics.checkNotNullParameter(pair, "");
        c50062vAm.DXXBbs = (java.lang.String) pair.getFirst();
        c50062vAm.AxsJAYsNCnLh = (java.lang.String) pair.getSecond();
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.giSNqX;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.AEQbTJ((java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
        }
        java.lang.String str = c50062vAm.DXXBbs;
        if (str != null && (c53497wmc = c50062vAm.gGvvIC) != null) {
            c53497wmc.KWHzl(str, c50062vAm.iRxXKY);
        }
        c50062vAm.AYXKKw().copydefault().postValue(C56036xvI.KWHzl.AEQbTJ());
        c50062vAm.fetchVPNInfo(false);
        c50062vAm.OLrzqt(false, c50062vAm.DXXBbs, c50062vAm.AxsJAYsNCnLh);
        c50062vAm.getFieldNames();
        c50062vAm.valueOf(false);
        c50062vAm.values();
    }

    public static final void AkhnZx(C50062vAm c50062vAm, java.lang.String str) {
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(str, "");
        c50062vAm.fARcdN = str;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.EZpvd(str);
        }
        c50062vAm.isConnected(true);
        BizInstrument bizInstrument = c50062vAm.AkhnZx;
        if (c50062vAm.OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, c50062vAm.fJNWhG, c50062vAm.fIwbmz)) {
            vBK vbk = c50062vAm.ORxRYg;
            if (vbk != null) {
                vbk.copydefault();
            }
            vBK vbk2 = c50062vAm.ORxRYg;
            if (vbk2 != null) {
                vbk2.copydefault(true);
                return;
            }
            return;
        }
        vBK vbk3 = c50062vAm.ORxRYg;
        if (vbk3 != null) {
            vbk3.copydefault();
        }
        c50062vAm.values(true);
        c50062vAm.gEmmrt(true);
        vBK vbk4 = c50062vAm.ORxRYg;
        if (vbk4 != null) {
            BizInstrument bizInstrument2 = c50062vAm.AkhnZx;
            if (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) {
                instType = "";
            }
            java.lang.String str2 = c50062vAm.fARcdN;
            vbk4.OLrzqt(instType, str2 != null ? str2 : "");
        }
    }

    public static final void fetchVPNInfo(C50062vAm c50062vAm, java.lang.String str) {
        java.lang.String instType;
        Intrinsics.checkNotNullParameter(str, "");
        c50062vAm.accept = str;
        InterfaceC50102vBz interfaceC50102vBz = c50062vAm.giSNqX;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.EZpvd(str);
        }
        c50062vAm.isConnected(false);
        BizInstrument bizInstrument = c50062vAm.iRxXKY;
        if (c50062vAm.OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, c50062vAm.DXXBbs, c50062vAm.AxsJAYsNCnLh)) {
            vBK vbk = c50062vAm.aKErDB;
            if (vbk != null) {
                vbk.copydefault();
            }
            vBK vbk2 = c50062vAm.aKErDB;
            if (vbk2 != null) {
                vbk2.copydefault(false);
                return;
            }
            return;
        }
        vBK vbk3 = c50062vAm.aKErDB;
        if (vbk3 != null) {
            vbk3.copydefault();
        }
        c50062vAm.values(false);
        c50062vAm.gEmmrt(false);
        vBK vbk4 = c50062vAm.aKErDB;
        if (vbk4 != null) {
            BizInstrument bizInstrument2 = c50062vAm.iRxXKY;
            if (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) {
                instType = "";
            }
            java.lang.String str2 = c50062vAm.accept;
            vbk4.OLrzqt(instType, str2 != null ? str2 : "");
        }
    }

    public static final void KWHzl(C50062vAm c50062vAm, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        c50062vAm.isConnected().fARcdN();
        c50062vAm.AYXKKw().AhwBna().postValue(null);
    }

    public static final void valueOf(C50062vAm c50062vAm, boolean z) {
        c50062vAm.values();
    }

    public static final void AhwBna(final C50062vAm c50062vAm, boolean z) {
        if (z) {
            android.widget.LinearLayout linearLayout = c50062vAm.KWHzl;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout2 = c50062vAm.KWHzl;
        if (linearLayout2 == null || linearLayout2.getVisibility() != 0) {
            android.widget.LinearLayout linearLayout3 = c50062vAm.KWHzl;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(4);
            }
            android.widget.LinearLayout linearLayout4 = c50062vAm.KWHzl;
            if (linearLayout4 != null) {
                linearLayout4.post(new java.lang.Runnable() { // from class: o.vAB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C50062vAm.AuCTelauCTel(this.KWHzl);
                    }
                });
            }
        }
    }

    public static final void AuCTelauCTel(C50062vAm c50062vAm) {
        android.widget.LinearLayout linearLayout = c50062vAm.KWHzl;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
        }
        android.widget.LinearLayout linearLayout2 = c50062vAm.KWHzl;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(marginLayoutParams);
        }
        android.widget.LinearLayout linearLayout3 = c50062vAm.KWHzl;
        if (linearLayout3 != null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(linearLayout3, "translationY", C55298xhM.dp2pxFloat$default(-32.0f, null, 1, null), 0.0f);
            objectAnimatorOfFloat.setDuration(350L);
            Intrinsics.copydefault(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addListener(c50062vAm.new Dialog());
            objectAnimatorOfFloat.addListener(c50062vAm.new Activity());
            objectAnimatorOfFloat.start();
        }
    }

    /* JADX INFO: renamed from: o.vAm$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.widget.TextView textView = C50062vAm.this.flVtFt;
            if (textView != null) {
                textView.requestFocus();
            }
        }
    }

    public final void hDKMBd() {
        this.QOLQEE = new Observer() { // from class: o.vBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.RcXXUw = new Observer() { // from class: o.vBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AYXKKw(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        };
    }

    public static final void gEmmrt(C50062vAm c50062vAm, boolean z) {
        vBK vbk;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl;
        if (z) {
            if (c50062vAm.ORxRYg == null) {
                c50062vAm.ORxRYg = new vBK();
            }
            c50062vAm.AYXKKw(true);
            Observer<TradeBalanceData> observer = c50062vAm.AxsJAY;
            if (observer == null || (vbk = c50062vAm.ORxRYg) == null || (tradeLiveDataKWHzl = vbk.KWHzl()) == null) {
                return;
            }
            tradeLiveDataKWHzl.observeForever(observer);
        }
    }

    public static final void AYXKKw(C50062vAm c50062vAm, boolean z) {
        vBK vbk;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl;
        if (z) {
            if (c50062vAm.aKErDB == null) {
                c50062vAm.aKErDB = new vBK();
            }
            c50062vAm.AYXKKw(false);
            Observer<TradeBalanceData> observer = c50062vAm.RJOkX;
            if (observer == null || (vbk = c50062vAm.aKErDB) == null || (tradeLiveDataKWHzl = vbk.KWHzl()) == null) {
                return;
            }
            tradeLiveDataKWHzl.observeForever(observer);
        }
    }

    public final void values() {
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String instType2;
        java.lang.String instId2;
        C55879xsK c55879xsKAEQbTJ = C55886xsR.OLrzqt.AEQbTJ();
        if (this.AkhnZx == null || this.iRxXKY == null || c55879xsKAEQbTJ == null) {
            return;
        }
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        ArbitrageInfo arbitrageInfoCopydefault = c56036xvI.copydefault();
        ArbitrageInfo arbitrageInfoAEQbTJ = c56036xvI.AEQbTJ();
        BizInstrument bizInstrument = this.AkhnZx;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        BizInstrument bizInstrument2 = this.AkhnZx;
        if (bizInstrument2 == null || (instType = bizInstrument2.getInstType()) == null) {
            instType = "";
        }
        java.lang.String side = arbitrageInfoCopydefault.getSide();
        java.lang.String str = side == null ? "" : side;
        BizInstrument bizInstrument3 = this.iRxXKY;
        java.lang.String str2 = (bizInstrument3 == null || (instId2 = bizInstrument3.getInstId()) == null) ? "" : instId2;
        BizInstrument bizInstrument4 = this.iRxXKY;
        java.lang.String str3 = (bizInstrument4 == null || (instType2 = bizInstrument4.getInstType()) == null) ? "" : instType2;
        java.lang.String side2 = arbitrageInfoAEQbTJ.getSide();
        if (side2 == null) {
            side2 = "";
        }
        AYXKKw().KWHzl().postValue(java.lang.Boolean.valueOf(c55879xsKAEQbTJ.AEQbTJ(instId, instType, str, str2, str3, side2) != null));
    }

    public final ArbitragePriceSetting valueOf() {
        ArbitragePriceSetting arbitragePriceSetting = new ArbitragePriceSetting();
        arbitragePriceSetting.setTakerRange(10);
        arbitragePriceSetting.setMakerRange(5);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        arbitragePriceSetting.setAutomaticTracking(bool);
        arbitragePriceSetting.setTimeInterval(30);
        arbitragePriceSetting.setPauseTracking(bool);
        arbitragePriceSetting.setPauseThreshold("0.03");
        return arbitragePriceSetting;
    }

    public final void AuCTel() {
        this.DTwDnp = new Observer() { // from class: o.vBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.EZpvd(this.OLrzqt, (xMJ.TaskDescription) obj);
            }
        };
        this.dNCPSb = new Observer() { // from class: o.vBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AEQbTJ(this.copydefault, (xMJ.TaskDescription) obj);
            }
        };
        this.dvKsVJ = new Observer() { // from class: o.vBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.OLrzqt(this.AEQbTJ, (EnableState) obj);
            }
        };
        this.fZBcTu = new Observer() { // from class: o.vBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.KWHzl(this.KWHzl, (EnableState) obj);
            }
        };
        this.gHZMYf = new Observer() { // from class: o.vBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.values(this.KWHzl, (java.lang.String) obj);
            }
        };
        this.QfsBiF = new Observer() { // from class: o.vBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.isConnected(this.EZpvd, (java.lang.String) obj);
            }
        };
        this.QbewEr = new Observer() { // from class: o.vBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.DbNXlk(this.OLrzqt, (java.lang.String) obj);
            }
        };
        this.fFgQHt = new Observer() { // from class: o.vBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AuCTel(this.copydefault, (java.lang.String) obj);
            }
        };
        this.dxcTrN = new Observer() { // from class: o.vBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.KWHzl(this.EZpvd, (SettingType) obj);
            }
        };
    }

    public static final void EZpvd(C50062vAm c50062vAm, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c50062vAm.OcIXYQ = taskDescription;
        c50062vAm.AkhnZx().EZpvd(true, taskDescription);
    }

    public static final void AEQbTJ(C50062vAm c50062vAm, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        c50062vAm.UeEOUB = taskDescription;
        c50062vAm.AkhnZx().EZpvd(false, taskDescription);
    }

    public static final void OLrzqt(C50062vAm c50062vAm, EnableState enableState) {
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        Intrinsics.checkNotNullParameter(enableState, "");
        int i = TaskDescription.copydefault[enableState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C53427wlL c53427wlL = c50062vAm.sSMYrx;
                if (c53427wlL != null) {
                    c53427wlL.setSameAmtSelectedStatus(true, false);
                    return;
                }
                return;
            }
            if (i == 3) {
                C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
                if (c53427wlL2 != null) {
                    c53427wlL2.setSameAmtSelectedStatus(false, true);
                    return;
                }
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
            if (c53427wlL3 != null) {
                c53427wlL3.setSameAmtSelectedStatus(false, false);
                return;
            }
            return;
        }
        if (c50062vAm.zLjUOn && c50062vAm.AkhnZx().djBIcL().getValue() == EnableState.ABLE_SELECT) {
            boolean z = !c50062vAm.AubY;
            c50062vAm.AubY = z;
            SPUtils.put("arbitrage_same_total_type", java.lang.Boolean.valueOf(z));
            c50062vAm.AkhnZx().djBIcL().postValue(EnableState.ABLE_UNSELECT);
        }
        C53427wlL c53427wlL4 = c50062vAm.sSMYrx;
        if (c53427wlL4 != null) {
            c53427wlL4.setSameAmtSelectedStatus(true, true);
        }
        C53427wlL c53427wlL5 = c50062vAm.sSMYrx;
        java.lang.String strAkhnZx = null;
        java.lang.String strAkhnZx2 = (c53427wlL5 == null || (c47988uAvOLrzqt2 = c53427wlL5.OLrzqt()) == null) ? null : c47988uAvOLrzqt2.AkhnZx();
        C53427wlL c53427wlL6 = c50062vAm.djSkpj;
        if (c53427wlL6 != null && (c47988uAvOLrzqt = c53427wlL6.OLrzqt()) != null) {
            strAkhnZx = c47988uAvOLrzqt.AkhnZx();
        }
        java.lang.String str = strAkhnZx;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx2)) {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            vbgAkhnZx.copydefault(true, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), strAkhnZx2, c50062vAm.djBIcL(false));
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            vBG vbgAkhnZx2 = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.AuCTel;
            C56036xvI c56036xvI2 = C56036xvI.KWHzl;
            vbgAkhnZx2.copydefault(false, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair2, c56036xvI2.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI2.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), str, c50062vAm.djBIcL(true));
        }
    }

    public static final void KWHzl(C50062vAm c50062vAm, EnableState enableState) {
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        Intrinsics.checkNotNullParameter(enableState, "");
        int i = TaskDescription.copydefault[enableState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C53427wlL c53427wlL = c50062vAm.sSMYrx;
                if (c53427wlL != null) {
                    c53427wlL.setSameTotalSelectedStatus(true, false);
                    return;
                }
                return;
            }
            if (i == 3) {
                C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
                if (c53427wlL2 != null) {
                    c53427wlL2.setSameTotalSelectedStatus(false, true);
                    return;
                }
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
            if (c53427wlL3 != null) {
                c53427wlL3.setSameTotalSelectedStatus(false, false);
                return;
            }
            return;
        }
        if (c50062vAm.AubY && c50062vAm.AkhnZx().AYXKKw().getValue() == EnableState.ABLE_SELECT) {
            boolean z = !c50062vAm.zLjUOn;
            c50062vAm.zLjUOn = z;
            SPUtils.put("arbitrage_same_amt_type", java.lang.Boolean.valueOf(z));
            c50062vAm.AkhnZx().AYXKKw().postValue(EnableState.ABLE_UNSELECT);
        }
        C53427wlL c53427wlL4 = c50062vAm.sSMYrx;
        if (c53427wlL4 != null) {
            c53427wlL4.setSameTotalSelectedStatus(true, true);
        }
        C53427wlL c53427wlL5 = c50062vAm.sSMYrx;
        java.lang.String strAkhnZx = null;
        java.lang.String strAkhnZx2 = (c53427wlL5 == null || (c47988uAvKWHzl2 = c53427wlL5.KWHzl()) == null) ? null : c47988uAvKWHzl2.AkhnZx();
        C53427wlL c53427wlL6 = c50062vAm.djSkpj;
        if (c53427wlL6 != null && (c47988uAvKWHzl = c53427wlL6.KWHzl()) != null) {
            strAkhnZx = c47988uAvKWHzl.AkhnZx();
        }
        java.lang.String str = strAkhnZx;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strAkhnZx2)) {
            vBG vbgAkhnZx = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            vbgAkhnZx.OLrzqt(true, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair, c56036xvI.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), strAkhnZx2, c50062vAm.djBIcL(false));
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            vBG vbgAkhnZx2 = c50062vAm.AkhnZx();
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = c50062vAm.AuCTel;
            C56036xvI c56036xvI2 = C56036xvI.KWHzl;
            vbgAkhnZx2.OLrzqt(false, C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(pair2, c56036xvI2.copydefault(), c50062vAm.uzCIH, c50062vAm.AkhnZx))), C33129mqd.gEmmrt(java.lang.Double.valueOf(c50062vAm.KWHzl(c50062vAm.DAIeex, c56036xvI2.AEQbTJ(), c50062vAm.DarRvM, c50062vAm.iRxXKY))), str, c50062vAm.djBIcL(true));
        }
    }

    public static final void values(C50062vAm c50062vAm, java.lang.String str) {
        C47988uAv c47988uAvOLrzqt;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvOLrzqt3;
        Intrinsics.checkNotNullParameter(str, "");
        C53427wlL c53427wlL = c50062vAm.sSMYrx;
        if (c53427wlL != null && (c47988uAvOLrzqt3 = c53427wlL.OLrzqt()) != null) {
            c47988uAvOLrzqt3.OLrzqt(c50062vAm.AwvSrB);
        }
        C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvOLrzqt2 = c53427wlL2.OLrzqt()) != null) {
            C47988uAv.setInputContent$default(c47988uAvOLrzqt2, str, false, false, 6, null);
        }
        if (c50062vAm.AhwBna(true) && (vbk = c50062vAm.ORxRYg) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.AuCTel;
            vbk.EZpvd(str, pair != null ? pair.getSecond() : null);
        }
        C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
        if (c53427wlL3 == null || (c47988uAvOLrzqt = c53427wlL3.OLrzqt()) == null) {
            return;
        }
        c47988uAvOLrzqt.KWHzl(c50062vAm.AwvSrB);
    }

    public static final void isConnected(C50062vAm c50062vAm, java.lang.String str) {
        C47988uAv c47988uAvOLrzqt;
        vBK vbk;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvOLrzqt3;
        Intrinsics.checkNotNullParameter(str, "");
        C53427wlL c53427wlL = c50062vAm.djSkpj;
        if (c53427wlL != null && (c47988uAvOLrzqt3 = c53427wlL.OLrzqt()) != null) {
            c47988uAvOLrzqt3.OLrzqt(c50062vAm.QVAiDq);
        }
        C53427wlL c53427wlL2 = c50062vAm.djSkpj;
        if (c53427wlL2 != null && (c47988uAvOLrzqt2 = c53427wlL2.OLrzqt()) != null) {
            C47988uAv.setInputContent$default(c47988uAvOLrzqt2, str, false, false, 6, null);
        }
        if (c50062vAm.AhwBna(false) && (vbk = c50062vAm.aKErDB) != null) {
            kotlin.Pair<java.lang.String, java.lang.String> pair = c50062vAm.DAIeex;
            vbk.EZpvd(str, pair != null ? pair.getSecond() : null);
        }
        C53427wlL c53427wlL3 = c50062vAm.djSkpj;
        if (c53427wlL3 == null || (c47988uAvOLrzqt = c53427wlL3.OLrzqt()) == null) {
            return;
        }
        c47988uAvOLrzqt.KWHzl(c50062vAm.QVAiDq);
    }

    public static final void DbNXlk(C50062vAm c50062vAm, java.lang.String str) {
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        Intrinsics.checkNotNullParameter(str, "");
        C53427wlL c53427wlL = c50062vAm.sSMYrx;
        if (c53427wlL != null && (c47988uAvKWHzl3 = c53427wlL.KWHzl()) != null) {
            c47988uAvKWHzl3.OLrzqt(c50062vAm.QKVWgx);
        }
        C53427wlL c53427wlL2 = c50062vAm.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvKWHzl2 = c53427wlL2.KWHzl()) != null) {
            C47988uAv.setInputContent$default(c47988uAvKWHzl2, str, false, false, 6, null);
        }
        C53427wlL c53427wlL3 = c50062vAm.sSMYrx;
        if (c53427wlL3 == null || (c47988uAvKWHzl = c53427wlL3.KWHzl()) == null) {
            return;
        }
        c47988uAvKWHzl.KWHzl(c50062vAm.QKVWgx);
    }

    public static final void AuCTel(C50062vAm c50062vAm, java.lang.String str) {
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvKWHzl3;
        Intrinsics.checkNotNullParameter(str, "");
        C53427wlL c53427wlL = c50062vAm.djSkpj;
        if (c53427wlL != null && (c47988uAvKWHzl3 = c53427wlL.KWHzl()) != null) {
            c47988uAvKWHzl3.OLrzqt(c50062vAm.finit);
        }
        C53427wlL c53427wlL2 = c50062vAm.djSkpj;
        if (c53427wlL2 != null && (c47988uAvKWHzl2 = c53427wlL2.KWHzl()) != null) {
            C47988uAv.setInputContent$default(c47988uAvKWHzl2, str, false, false, 6, null);
        }
        C53427wlL c53427wlL3 = c50062vAm.djSkpj;
        if (c53427wlL3 == null || (c47988uAvKWHzl = c53427wlL3.KWHzl()) == null) {
            return;
        }
        c47988uAvKWHzl.KWHzl(c50062vAm.finit);
    }

    public static final void KWHzl(C50062vAm c50062vAm, SettingType settingType) {
        Intrinsics.checkNotNullParameter(settingType, "");
        c50062vAm.copydefault(settingType);
    }

    public final void copydefault(SettingType settingType) {
        int i = TaskDescription.KWHzl[settingType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            fJNWhG();
        } else if (i == 4 || i == 5) {
            iwGUEr();
        }
    }

    public final void fJNWhG() {
        fetchVPNInfo(true);
        OLrzqt(true, this.fJNWhG, this.fIwbmz);
        fetchVPNInfo(false);
        OLrzqt(false, this.DXXBbs, this.AxsJAYsNCnLh);
    }

    public final void iwGUEr() {
        InterfaceC50102vBz interfaceC50102vBz = this.AhwBna;
        if (interfaceC50102vBz != null) {
            interfaceC50102vBz.copydefault();
        }
        InterfaceC50102vBz interfaceC50102vBz2 = this.giSNqX;
        if (interfaceC50102vBz2 != null) {
            interfaceC50102vBz2.copydefault();
        }
    }

    public final void fARcdN() {
        this.AxsJAY = new Observer() { // from class: o.vBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.OLrzqt(this.OLrzqt, (TradeBalanceData) obj);
            }
        };
        this.RJOkX = new Observer() { // from class: o.vBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50062vAm.AEQbTJ(this.KWHzl, (TradeBalanceData) obj);
            }
        };
    }

    public static final void OLrzqt(C50062vAm c50062vAm, TradeBalanceData tradeBalanceData) {
        Intrinsics.checkNotNullParameter(tradeBalanceData, "");
        c50062vAm.copydefault(true, tradeBalanceData);
    }

    public static final void AEQbTJ(C50062vAm c50062vAm, TradeBalanceData tradeBalanceData) {
        Intrinsics.checkNotNullParameter(tradeBalanceData, "");
        c50062vAm.copydefault(false, tradeBalanceData);
    }

    public final java.lang.String OLrzqt(boolean z) {
        InterfaceC50102vBz interfaceC50102vBz;
        if (!z ? (interfaceC50102vBz = this.giSNqX) != null : (interfaceC50102vBz = this.AhwBna) != null) {
            return null;
        }
        return interfaceC50102vBz.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z, TradeBalanceData tradeBalanceData) {
        BizInstrument bizInstrument;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = "";
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = "";
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "";
        OLrzqt(objectRef, tradeBalanceData, objectRef2, objectRef3, objectRef4, (!z ? (bizInstrument = this.iRxXKY) != null : (bizInstrument = this.AkhnZx) != null) ? null : bizInstrument.getInstType(), z ? this.fJNWhG : this.DXXBbs, z ? this.fIwbmz : this.AxsJAYsNCnLh);
        if (z) {
            C53427wlL c53427wlL = this.sSMYrx;
            if (c53427wlL != null) {
                c53427wlL.setAvailUse((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
            }
            C53427wlL c53427wlL2 = this.sSMYrx;
            if (c53427wlL2 != null) {
                c53427wlL2.setAvailTrade((java.lang.String) objectRef3.element, (java.lang.String) objectRef4.element);
                return;
            }
            return;
        }
        C53427wlL c53427wlL3 = this.djSkpj;
        if (c53427wlL3 != null) {
            c53427wlL3.setAvailUse((java.lang.String) objectRef.element, (java.lang.String) objectRef2.element);
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null) {
            c53427wlL4.setAvailTrade((java.lang.String) objectRef3.element, (java.lang.String) objectRef4.element);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v29, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v30, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v31, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v100, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v101, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v102, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v103, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v104, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v105, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v106, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v107, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v108, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v109, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v110, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v37, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v38, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v41, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v50, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v51, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v53, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v54, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v63, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v64, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v66, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v67, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v76, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v77, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v80, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v81, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v88, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v89, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v97, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v98, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v99, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v20, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v26, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v27, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v39, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v40, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v44, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v51, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v52, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v53, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v54, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v55, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v56, resolved type: T */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(Ref.ObjectRef<java.lang.String> objectRef, TradeBalanceData tradeBalanceData, Ref.ObjectRef<java.lang.String> objectRef2, Ref.ObjectRef<java.lang.String> objectRef3, Ref.ObjectRef<java.lang.String> objectRef4, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.Pair<java.lang.String, java.lang.String> showAvailable;
        T t;
        kotlin.Pair<java.lang.String, java.lang.String> showAvailable2;
        T t2;
        T t3;
        T t4;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        T t5;
        T t6;
        T t7;
        T t8;
        T t9;
        T t10;
        T t11;
        T t12;
        T t13;
        T t14;
        T t15;
        T t16;
        T t17;
        T t18;
        T t19;
        T t20;
        xOW newProxyInstance;
        if (str != null) {
            java.lang.String str4 = "";
            switch (str.hashCode()) {
                case -2027980370:
                    if (!str.equals("MARGIN")) {
                    }
                    showAvailable = tradeBalanceData.getShowAvailable();
                    if (showAvailable != null) {
                        java.lang.String first = showAvailable.getFirst();
                        t = first;
                        if (first == null) {
                            t = "";
                        }
                    }
                    objectRef.element = t;
                    showAvailable2 = tradeBalanceData.getShowAvailable();
                    if (showAvailable2 != null) {
                        java.lang.String second = showAvailable2.getSecond();
                        t2 = second;
                        if (second == null) {
                            t2 = "";
                        }
                    }
                    objectRef2.element = t2;
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                        kotlin.Pair<java.lang.String, java.lang.String> showCanBuy = tradeBalanceData.getShowCanBuy();
                        if (showCanBuy != null) {
                            java.lang.String first2 = showCanBuy.getFirst();
                            t4 = first2;
                            if (first2 == null) {
                                t4 = "";
                            }
                        }
                        objectRef3.element = t4;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanBuy2 = tradeBalanceData.getShowCanBuy();
                        T t21 = str4;
                        if (showCanBuy2 != null) {
                            java.lang.String second2 = showCanBuy2.getSecond();
                            t21 = str4;
                            if (second2 != null) {
                                t21 = second2;
                            }
                        }
                        objectRef4.element = t21;
                    } else {
                        kotlin.Pair<java.lang.String, java.lang.String> showCanSell = tradeBalanceData.getShowCanSell();
                        if (showCanSell != null) {
                            java.lang.String first3 = showCanSell.getFirst();
                            t3 = first3;
                            if (first3 == null) {
                                t3 = "";
                            }
                        }
                        objectRef3.element = t3;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanSell2 = tradeBalanceData.getShowCanSell();
                        T t22 = str4;
                        if (showCanSell2 != null) {
                            java.lang.String second3 = showCanSell2.getSecond();
                            t22 = str4;
                            if (second3 != null) {
                                t22 = second3;
                            }
                        }
                        objectRef4.element = t22;
                    }
                    break;
                case -1956807563:
                    if (!str.equals("OPTION")) {
                    }
                    showAvailable = tradeBalanceData.getShowAvailable();
                    if (showAvailable != null) {
                    }
                    objectRef.element = t;
                    showAvailable2 = tradeBalanceData.getShowAvailable();
                    if (showAvailable2 != null) {
                    }
                    objectRef2.element = t2;
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                    }
                    break;
                case 2552066:
                    if (!str.equals("SPOT")) {
                    }
                    showAvailable = tradeBalanceData.getShowAvailable();
                    if (showAvailable != null) {
                    }
                    objectRef.element = t;
                    showAvailable2 = tradeBalanceData.getShowAvailable();
                    if (showAvailable2 != null) {
                    }
                    objectRef2.element = t2;
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                    }
                    break;
                case 2558355:
                    if (!str.equals("SWAP")) {
                    }
                    interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                    if (!Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault != null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "net_mode")) {
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable3 = tradeBalanceData.getShowAvailable();
                        if (showAvailable3 != null) {
                            java.lang.String first4 = showAvailable3.getFirst();
                            t17 = first4;
                            if (first4 == null) {
                                t17 = "";
                            }
                        }
                        objectRef.element = t17;
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable4 = tradeBalanceData.getShowAvailable();
                        if (showAvailable4 != null) {
                            java.lang.String second4 = showAvailable4.getSecond();
                            t18 = second4;
                            if (second4 == null) {
                                t18 = "";
                            }
                        }
                        objectRef2.element = t18;
                        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy")) {
                            kotlin.Pair<java.lang.String, java.lang.String> showCanBuy3 = tradeBalanceData.getShowCanBuy();
                            if (showCanBuy3 != null) {
                                java.lang.String first5 = showCanBuy3.getFirst();
                                t20 = first5;
                                if (first5 == null) {
                                    t20 = "";
                                }
                            }
                            objectRef3.element = t20;
                            kotlin.Pair<java.lang.String, java.lang.String> showCanBuy4 = tradeBalanceData.getShowCanBuy();
                            T t23 = str4;
                            if (showCanBuy4 != null) {
                                java.lang.String second5 = showCanBuy4.getSecond();
                                t23 = str4;
                                if (second5 != null) {
                                    t23 = second5;
                                }
                            }
                            objectRef4.element = t23;
                        } else {
                            kotlin.Pair<java.lang.String, java.lang.String> showCanSell3 = tradeBalanceData.getShowCanSell();
                            if (showCanSell3 != null) {
                                java.lang.String first6 = showCanSell3.getFirst();
                                t19 = first6;
                                if (first6 == null) {
                                    t19 = "";
                                }
                            }
                            objectRef3.element = t19;
                            kotlin.Pair<java.lang.String, java.lang.String> showCanSell4 = tradeBalanceData.getShowCanSell();
                            T t24 = str4;
                            if (showCanSell4 != null) {
                                java.lang.String second6 = showCanSell4.getSecond();
                                t24 = str4;
                                if (second6 != null) {
                                    t24 = second6;
                                }
                            }
                            objectRef4.element = t24;
                        }
                    } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "long")) {
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable5 = tradeBalanceData.getShowAvailable();
                        if (showAvailable5 != null) {
                            java.lang.String first7 = showAvailable5.getFirst();
                            t14 = first7;
                            if (first7 == null) {
                                t14 = "";
                            }
                        }
                        objectRef.element = t14;
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable6 = tradeBalanceData.getShowAvailable();
                        if (showAvailable6 != null) {
                            java.lang.String second7 = showAvailable6.getSecond();
                            t15 = second7;
                            if (second7 == null) {
                                t15 = "";
                            }
                        }
                        objectRef2.element = t15;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanOpenLong = tradeBalanceData.getShowCanOpenLong();
                        if (showCanOpenLong != null) {
                            java.lang.String first8 = showCanOpenLong.getFirst();
                            t16 = first8;
                            if (first8 == null) {
                                t16 = "";
                            }
                        }
                        objectRef3.element = t16;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanOpenLong2 = tradeBalanceData.getShowCanOpenLong();
                        T t25 = str4;
                        if (showCanOpenLong2 != null) {
                            java.lang.String second8 = showCanOpenLong2.getSecond();
                            t25 = str4;
                            if (second8 != null) {
                                t25 = second8;
                            }
                        }
                        objectRef4.element = t25;
                    } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "short")) {
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable7 = tradeBalanceData.getShowAvailable();
                        if (showAvailable7 != null) {
                            java.lang.String first9 = showAvailable7.getFirst();
                            t11 = first9;
                            if (first9 == null) {
                                t11 = "";
                            }
                        }
                        objectRef.element = t11;
                        kotlin.Pair<java.lang.String, java.lang.String> showAvailable8 = tradeBalanceData.getShowAvailable();
                        if (showAvailable8 != null) {
                            java.lang.String second9 = showAvailable8.getSecond();
                            t12 = second9;
                            if (second9 == null) {
                                t12 = "";
                            }
                        }
                        objectRef2.element = t12;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanOpenShort = tradeBalanceData.getShowCanOpenShort();
                        if (showCanOpenShort != null) {
                            java.lang.String first10 = showCanOpenShort.getFirst();
                            t13 = first10;
                            if (first10 == null) {
                                t13 = "";
                            }
                        }
                        objectRef3.element = t13;
                        kotlin.Pair<java.lang.String, java.lang.String> showCanOpenShort2 = tradeBalanceData.getShowCanOpenShort();
                        T t26 = str4;
                        if (showCanOpenShort2 != null) {
                            java.lang.String second10 = showCanOpenShort2.getSecond();
                            t26 = str4;
                            if (second10 != null) {
                                t26 = second10;
                            }
                        }
                        objectRef4.element = t26;
                    } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "short")) {
                        kotlin.Pair<java.lang.String, java.lang.String> showAvaCloseShort = tradeBalanceData.getShowAvaCloseShort();
                        if (showAvaCloseShort != null) {
                            java.lang.String first11 = showAvaCloseShort.getFirst();
                            t8 = first11;
                            if (first11 == null) {
                                t8 = "";
                            }
                        }
                        objectRef.element = t8;
                        kotlin.Pair<java.lang.String, java.lang.String> showAvaCloseShort2 = tradeBalanceData.getShowAvaCloseShort();
                        if (showAvaCloseShort2 != null) {
                            java.lang.String second11 = showAvaCloseShort2.getSecond();
                            t9 = second11;
                            if (second11 == null) {
                                t9 = "";
                            }
                        }
                        objectRef2.element = t9;
                        kotlin.Pair<java.lang.String, java.lang.String> showCloseShort = tradeBalanceData.getShowCloseShort();
                        if (showCloseShort != null) {
                            java.lang.String first12 = showCloseShort.getFirst();
                            t10 = first12;
                            if (first12 == null) {
                                t10 = "";
                            }
                        }
                        objectRef3.element = t10;
                        kotlin.Pair<java.lang.String, java.lang.String> showCloseShort2 = tradeBalanceData.getShowCloseShort();
                        T t27 = str4;
                        if (showCloseShort2 != null) {
                            java.lang.String second12 = showCloseShort2.getSecond();
                            t27 = str4;
                            if (second12 != null) {
                                t27 = second12;
                            }
                        }
                        objectRef4.element = t27;
                    } else {
                        kotlin.Pair<java.lang.String, java.lang.String> showAvaCloseLong = tradeBalanceData.getShowAvaCloseLong();
                        if (showAvaCloseLong != null) {
                            java.lang.String first13 = showAvaCloseLong.getFirst();
                            t5 = first13;
                            if (first13 == null) {
                                t5 = "";
                            }
                        }
                        objectRef.element = t5;
                        kotlin.Pair<java.lang.String, java.lang.String> showAvaCloseLong2 = tradeBalanceData.getShowAvaCloseLong();
                        if (showAvaCloseLong2 != null) {
                            java.lang.String second13 = showAvaCloseLong2.getSecond();
                            t6 = second13;
                            if (second13 == null) {
                                t6 = "";
                            }
                        }
                        objectRef2.element = t6;
                        kotlin.Pair<java.lang.String, java.lang.String> showCloseLongPos = tradeBalanceData.getShowCloseLongPos();
                        if (showCloseLongPos != null) {
                            java.lang.String first14 = showCloseLongPos.getFirst();
                            t7 = first14;
                            if (first14 == null) {
                                t7 = "";
                            }
                        }
                        objectRef3.element = t7;
                        kotlin.Pair<java.lang.String, java.lang.String> showCloseLongPos2 = tradeBalanceData.getShowCloseLongPos();
                        T t28 = str4;
                        if (showCloseLongPos2 != null) {
                            java.lang.String second14 = showCloseLongPos2.getSecond();
                            t28 = str4;
                            if (second14 != null) {
                                t28 = second14;
                            }
                        }
                        objectRef4.element = t28;
                    }
                    break;
                case 214415088:
                    if (!str.equals("FUTURES")) {
                    }
                    interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                    if (!Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault != null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null) ? null : newProxyInstance.AuCTelauCTel()), (java.lang.Object) "net_mode")) {
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zLjUOn() {
        java.lang.String strFIwbmz;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String instFamily;
        if (this.AkhnZx == null) {
            iAhwBna = 2;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                BizInstrument bizInstrument = this.AkhnZx;
                java.lang.String str = "";
                if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    BizInstrument bizInstrument2 = this.AkhnZx;
                    if (bizInstrument2 != null && (instFamily = bizInstrument2.getInstFamily()) != null) {
                        str = instFamily;
                    }
                    strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                } else {
                    strFIwbmz = null;
                }
                iAhwBna = C33129mqd.AhwBna(strFIwbmz);
            }
        }
        C53501wmg c53501wmg = this.ejfBZ;
        if (c53501wmg != null) {
            c53501wmg.setPriceInputFilters(iAhwBna);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sSMYrx() {
        java.lang.String strFIwbmz;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String instFamily;
        if (this.iRxXKY == null) {
            iAhwBna = 2;
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                BizInstrument bizInstrument = this.iRxXKY;
                java.lang.String str = "";
                if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    BizInstrument bizInstrument2 = this.iRxXKY;
                    if (bizInstrument2 != null && (instFamily = bizInstrument2.getInstFamily()) != null) {
                        str = instFamily;
                    }
                    strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                } else {
                    strFIwbmz = null;
                }
                iAhwBna = C33129mqd.AhwBna(strFIwbmz);
            }
        }
        C53501wmg c53501wmg = this.DCJXGO;
        if (c53501wmg != null) {
            c53501wmg.setPriceInputFilters(iAhwBna);
        }
    }

    public final void zuBGHE() {
        C55312xha c55312xhaValueOf;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf3;
        C55320xhi c55320xhiKWHzl2;
        C55312xha c55312xhaValueOf4;
        C55312xha c55312xhaValueOf5;
        C55320xhi c55320xhiKWHzl3;
        C55312xha c55312xhaValueOf6;
        C55320xhi c55320xhiKWHzl4;
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        double dKWHzl = KWHzl(pair, c56036xvI.copydefault(), this.uzCIH, this.AkhnZx);
        double dKWHzl2 = KWHzl(this.DAIeex, c56036xvI.AEQbTJ(), this.DarRvM, this.iRxXKY);
        BizInstrument bizInstrument = this.AkhnZx;
        java.lang.String quoteSymbol = bizInstrument != null ? bizInstrument.getQuoteSymbol() : null;
        BizInstrument bizInstrument2 = this.iRxXKY;
        if (Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getQuoteSymbol() : null))) {
            double dEZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
            if (dKWHzl != AudioStats.AUDIO_AMPLITUDE_NONE && dKWHzl2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (dKWHzl2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    dEZpvd = C33129mqd.EZpvd((java.lang.Object) java.lang.Double.valueOf((dKWHzl - dKWHzl2) / dKWHzl2), (java.lang.Integer) 4, java.lang.Boolean.TRUE, RoundingMode.HALF_UP);
                }
                C55258xgZ c55258xgZ = this.fvQaOB;
                if (c55258xgZ != null && (c55312xhaValueOf6 = c55258xgZ.valueOf()) != null && (c55320xhiKWHzl4 = c55312xhaValueOf6.KWHzl()) != null) {
                    c55320xhiKWHzl4.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.uzCIH));
                }
                C55258xgZ c55258xgZ2 = this.fvQaOB;
                if (c55258xgZ2 != null && (c55312xhaValueOf5 = c55258xgZ2.valueOf()) != null && (c55320xhiKWHzl3 = c55312xhaValueOf5.KWHzl()) != null) {
                    c55320xhiKWHzl3.setText(C33070mpX.AYXKKw(C55688xof.Application.getToolbarNavigationClickListener) + " " + xMR.copydefault.EZpvd(C33129mqd.gEmmrt(java.lang.Double.valueOf(dEZpvd)), 2, 0, RoundingMode.DOWN));
                }
                C55258xgZ c55258xgZ3 = this.fvQaOB;
                if (c55258xgZ3 == null || (c55312xhaValueOf4 = c55258xgZ3.valueOf()) == null) {
                    return;
                }
                c55312xhaValueOf4.requestLayout();
                return;
            }
        }
        C55258xgZ c55258xgZ4 = this.fvQaOB;
        if (c55258xgZ4 != null && (c55312xhaValueOf3 = c55258xgZ4.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf3.KWHzl()) != null) {
            c55320xhiKWHzl2.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.getFieldNames));
        }
        C55258xgZ c55258xgZ5 = this.fvQaOB;
        if (c55258xgZ5 != null && (c55312xhaValueOf2 = c55258xgZ5.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) != null) {
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.getToolbarNavigationClickListener) + " --");
        }
        C55258xgZ c55258xgZ6 = this.fvQaOB;
        if (c55258xgZ6 == null || (c55312xhaValueOf = c55258xgZ6.valueOf()) == null) {
            return;
        }
        c55312xhaValueOf.requestLayout();
    }

    public final void OLrzqt(BizInstrument bizInstrument, java.lang.String str, ArbitrageType arbitrageType, TradeLiveData<java.lang.String> tradeLiveData) {
        xOW newProxyInstance;
        xOV xovEZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt()) {
            tradeLiveData.postValue(str);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT") && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated")) {
            if (arbitrageType == ArbitrageType.LEFT) {
                C56036xvI.KWHzl.copydefault("MARGIN", bizInstrument != null ? bizInstrument.getInstId() : null);
            } else {
                C56036xvI.KWHzl.KWHzl("MARGIN", bizInstrument != null ? bizInstrument.getInstId() : null);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ArbitrageTradeFragment$onMgnModeChanged$1(this, arbitrageType, null), 3, null);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "MARGIN") && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cross")) {
            if (arbitrageType == ArbitrageType.LEFT) {
                C56036xvI.KWHzl.copydefault("SPOT", bizInstrument != null ? bizInstrument.getInstId() : null);
            } else {
                C56036xvI.KWHzl.KWHzl("SPOT", bizInstrument != null ? bizInstrument.getInstId() : null);
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ArbitrageTradeFragment$onMgnModeChanged$2(this, arbitrageType, null), 3, null);
            return;
        }
        tradeLiveData.postValue(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1474=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final double KWHzl(kotlin.Pair<java.lang.String, java.lang.String> pair, ArbitrageInfo arbitrageInfo, TickersData tickersData, BizInstrument bizInstrument) {
        double d;
        double dAEQbTJ;
        java.lang.Integer takerRange;
        java.lang.String askPx;
        double d2;
        double dAEQbTJ2;
        java.lang.Integer takerRange2;
        java.lang.String bidPx;
        java.lang.Integer makerRange;
        java.lang.String askPx2;
        java.lang.Integer makerRange2;
        java.lang.String bidPx2;
        java.lang.String bidPx3;
        java.lang.String askPx3;
        java.lang.String second;
        java.lang.String last;
        java.lang.String first = pair != null ? pair.getFirst() : null;
        double dAEQbTJ3 = AudioStats.AUDIO_AMPLITUDE_NONE;
        if (first == null) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int iIntValue = 0;
        switch (first.hashCode()) {
            case -1823029745:
                if (!first.equals("overpriced")) {
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
                if (!Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getSide(), (java.lang.Object) "buy")) {
                    if (tickersData != null && (askPx = tickersData.getAskPx()) != null) {
                        return C33129mqd.AEQbTJ(askPx);
                    }
                    ArbitragePriceSetting arbitragePriceSetting = this.gasjUx;
                    if (arbitragePriceSetting != null && (takerRange = arbitragePriceSetting.getTakerRange()) != null) {
                        iIntValue = takerRange.intValue();
                    }
                    d = iIntValue;
                    dAEQbTJ = C33129mqd.AEQbTJ(bizInstrument != null ? bizInstrument.getTickerSize() : null);
                    return AudioStats.AUDIO_AMPLITUDE_NONE - (d * dAEQbTJ);
                }
                if (tickersData != null && (bidPx = tickersData.getBidPx()) != null) {
                    return C33129mqd.AEQbTJ(bidPx);
                }
                ArbitragePriceSetting arbitragePriceSetting2 = this.gasjUx;
                if (arbitragePriceSetting2 != null && (takerRange2 = arbitragePriceSetting2.getTakerRange()) != null) {
                    iIntValue = takerRange2.intValue();
                }
                d2 = iIntValue;
                dAEQbTJ2 = C33129mqd.AEQbTJ(bizInstrument != null ? bizInstrument.getTickerSize() : null);
                break;
                break;
            case -1596402597:
                if (!first.equals("queuingPrice")) {
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
                if (Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getSide(), (java.lang.Object) "buy")) {
                    if (tickersData != null && (bidPx2 = tickersData.getBidPx()) != null) {
                        return C33129mqd.AEQbTJ(bidPx2);
                    }
                    ArbitragePriceSetting arbitragePriceSetting3 = this.gasjUx;
                    if (arbitragePriceSetting3 != null && (makerRange2 = arbitragePriceSetting3.getMakerRange()) != null) {
                        iIntValue = makerRange2.intValue();
                    }
                    d = iIntValue;
                    dAEQbTJ = C33129mqd.AEQbTJ(bizInstrument != null ? bizInstrument.getTickerSize() : null);
                    return AudioStats.AUDIO_AMPLITUDE_NONE - (d * dAEQbTJ);
                }
                if (tickersData != null && (askPx2 = tickersData.getAskPx()) != null) {
                    return C33129mqd.AEQbTJ(askPx2);
                }
                ArbitragePriceSetting arbitragePriceSetting4 = this.gasjUx;
                if (arbitragePriceSetting4 != null && (makerRange = arbitragePriceSetting4.getMakerRange()) != null) {
                    iIntValue = makerRange.intValue();
                }
                d2 = iIntValue;
                dAEQbTJ2 = C33129mqd.AEQbTJ(bizInstrument != null ? bizInstrument.getTickerSize() : null);
                break;
                break;
            case -1534029569:
                return !first.equals("counterpartyPrice") ? AudioStats.AUDIO_AMPLITUDE_NONE : Intrinsics.EZpvd((java.lang.Object) arbitrageInfo.getSide(), (java.lang.Object) "buy") ? (tickersData == null || (askPx3 = tickersData.getAskPx()) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : C33129mqd.AEQbTJ(askPx3) : (tickersData == null || (bidPx3 = tickersData.getBidPx()) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : C33129mqd.AEQbTJ(bidPx3);
            case 96667352:
                if (!first.equals("enter")) {
                    return AudioStats.AUDIO_AMPLITUDE_NONE;
                }
                if (pair != null && (second = pair.getSecond()) != null) {
                    dAEQbTJ3 = C33129mqd.AEQbTJ(second);
                }
                return EZpvd(java.lang.Double.valueOf(dAEQbTJ3), bizInstrument);
            case 271544941:
                return (!first.equals("marketPrice") || tickersData == null || (last = tickersData.getLast()) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : C33129mqd.AEQbTJ(last);
            default:
                return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE + (d2 * dAEQbTJ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double EZpvd(java.lang.Double d, BizInstrument bizInstrument) {
        xMS xmsGEmmrt;
        java.lang.String instType;
        java.lang.String instFamily;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strEZpvd = null;
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String str = "";
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrument != null && (instFamily = bizInstrument.getInstFamily()) != null) {
                    str = instFamily;
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(str);
            } else {
                xmsGEmmrt = null;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "OPTION")) {
            if (xmsGEmmrt != null) {
                strEZpvd = xmsGEmmrt.valueOf(C33129mqd.gEmmrt(d));
            }
        } else if (xmsGEmmrt != null) {
            strEZpvd = xmsGEmmrt.EZpvd(C33129mqd.gEmmrt(d));
        }
        return C33129mqd.AEQbTJ(strEZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(final OrderType orderType) {
        java.lang.String str;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        boolean zAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        java.lang.Boolean boolValueOf;
        ArbitrageOrderConfirmData arbitrageOrderConfirmData;
        xOU xouWlaJM;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.Boolean automaticTracking;
        C47988uAv c47988uAvKWHzl;
        java.lang.String strFARcdN;
        xOU xouWlaJM2;
        java.lang.String instId2;
        java.lang.String instType2;
        C47988uAv c47988uAvKWHzl2;
        java.lang.String strAkhnZx;
        C47988uAv c47988uAvOLrzqt;
        java.lang.String strFARcdN2;
        java.lang.String strOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        java.lang.String strAkhnZx2;
        java.lang.String strAEQbTJ;
        java.lang.String strAEQbTJ2;
        java.lang.String strEZpvd;
        java.lang.String instId3;
        java.lang.String str2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        boolean zAhwBna2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt4;
        java.lang.Boolean boolValueOf2;
        xOU xouWlaJM3;
        java.lang.String instId4;
        java.lang.String instType3;
        java.lang.Boolean automaticTracking2;
        C47988uAv c47988uAvKWHzl3;
        java.lang.String strFARcdN3;
        xOU xouWlaJM4;
        java.lang.String instId5;
        java.lang.String instType4;
        C47988uAv c47988uAvKWHzl4;
        java.lang.String strAkhnZx3;
        C47988uAv c47988uAvOLrzqt3;
        java.lang.String strFARcdN4;
        java.lang.String strOLrzqt2;
        C47988uAv c47988uAvOLrzqt4;
        java.lang.String strAkhnZx4;
        java.lang.String strAEQbTJ3;
        java.lang.String strAEQbTJ4;
        java.lang.String strEZpvd2;
        java.lang.String instId6;
        ArbitrageOrderConfirmData arbitrageOrderConfirmData2 = new ArbitrageOrderConfirmData(null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 262143, null);
        ArbitrageOrderConfirmData arbitrageOrderConfirmData3 = new ArbitrageOrderConfirmData(null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, 262143, null);
        OrderType orderType2 = OrderType.BOTH;
        java.lang.String str3 = "";
        if (orderType == orderType2 || orderType == OrderType.LEFT) {
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            BizInstrument bizInstrument = this.AkhnZx;
            Intrinsics.copydefault(bizInstrument);
            java.lang.String strOLrzqt3 = c54799xVt.OLrzqt(bizInstrument);
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt5 == null) {
                str = "";
                C53441wlZ c53441wlZ = this.gEmmrt;
                java.lang.String str4 = (c53441wlZ != null || (strEZpvd = c53441wlZ.EZpvd()) == null) ? "" : strEZpvd;
                C53441wlZ c53441wlZ2 = this.gEmmrt;
                java.lang.String str5 = (c53441wlZ2 != null || (strAEQbTJ2 = c53441wlZ2.AEQbTJ()) == null) ? "" : strAEQbTJ2;
                java.lang.String str6 = this.fJNWhG;
                java.lang.String str7 = str6 != null ? "" : str6;
                C53501wmg c53501wmg = this.ejfBZ;
                java.lang.String str8 = (c53501wmg != null || (strAEQbTJ = c53501wmg.AEQbTJ()) == null) ? "" : strAEQbTJ;
                C53427wlL c53427wlL = this.sSMYrx;
                java.lang.String str9 = (c53427wlL != null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null || (strAkhnZx2 = c47988uAvOLrzqt2.AkhnZx()) == null) ? "" : strAkhnZx2;
                kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
                C53501wmg c53501wmg2 = this.ejfBZ;
                java.lang.String str10 = (c53501wmg2 != null || (strOLrzqt = c53501wmg2.OLrzqt()) == null) ? "" : strOLrzqt;
                C53427wlL c53427wlL2 = this.sSMYrx;
                java.lang.String str11 = (c53427wlL2 != null || (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) == null || (strFARcdN2 = c47988uAvOLrzqt.fARcdN()) == null) ? "" : strFARcdN2;
                C53427wlL c53427wlL3 = this.sSMYrx;
                java.lang.String str12 = (c53427wlL3 != null || (c47988uAvKWHzl2 = c53427wlL3.KWHzl()) == null || (strAkhnZx = c47988uAvKWHzl2.AkhnZx()) == null) ? "" : strAkhnZx;
                interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null || (xouWlaJM2 = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
                    zAhwBna = false;
                } else {
                    BizInstrument bizInstrument2 = this.AkhnZx;
                    if (bizInstrument2 == null || (instId2 = bizInstrument2.getInstId()) == null) {
                        instId2 = "";
                    }
                    BizInstrument bizInstrument3 = this.AkhnZx;
                    if (bizInstrument3 == null || (instType2 = bizInstrument3.getInstType()) == null) {
                        instType2 = "";
                    }
                    zAhwBna = xouWlaJM2.AhwBna(instId2, instType2);
                }
                C53427wlL c53427wlL4 = this.sSMYrx;
                java.lang.String str13 = (c53427wlL4 != null || (c47988uAvKWHzl = c53427wlL4.KWHzl()) == null || (strFARcdN = c47988uAvKWHzl.fARcdN()) == null) ? "" : strFARcdN;
                ArbitragePriceSetting arbitragePriceSetting = this.gasjUx;
                boolean zBooleanValue = (arbitragePriceSetting != null || (automaticTracking = arbitragePriceSetting.getAutomaticTracking()) == null) ? false : automaticTracking.booleanValue();
                ArbitragePriceSetting arbitragePriceSetting2 = this.gasjUx;
                java.lang.Integer takerRange = arbitragePriceSetting2 == null ? arbitragePriceSetting2.getTakerRange() : null;
                ArbitragePriceSetting arbitragePriceSetting3 = this.gasjUx;
                java.lang.Integer makerRange = arbitragePriceSetting3 == null ? arbitragePriceSetting3.getMakerRange() : null;
                interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt2 != null || (xouWlaJM = interfaceC54581xNrOLrzqt2.wlaJM()) == null) {
                    boolValueOf = null;
                } else {
                    BizInstrument bizInstrument4 = this.AkhnZx;
                    if (bizInstrument4 == null || (instId = bizInstrument4.getInstId()) == null) {
                        instId = "";
                    }
                    BizInstrument bizInstrument5 = this.AkhnZx;
                    if (bizInstrument5 == null || (instType = bizInstrument5.getInstType()) == null) {
                        instType = "";
                    }
                    boolValueOf = java.lang.Boolean.valueOf(xouWlaJM.AhwBna(instId, instType));
                }
                BizInstrument bizInstrument6 = this.AkhnZx;
                SpotInstrument spotInstrument = !(bizInstrument6 instanceof SpotInstrument) ? (SpotInstrument) bizInstrument6 : null;
                arbitrageOrderConfirmData = new ArbitrageOrderConfirmData(strOLrzqt3, str, str4, str5, str7, str8, str9, pair, str10, str11, str12, zAhwBna, str13, zBooleanValue, takerRange, makerRange, boolValueOf, spotInstrument == null ? spotInstrument.getLevel() : null);
            } else {
                BizInstrument bizInstrument7 = this.AkhnZx;
                if (bizInstrument7 == null || (instId3 = bizInstrument7.getInstId()) == null) {
                    instId3 = "";
                }
                java.lang.String upperCase = o.TaskDescription.AEQbTJ(instId3).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                java.lang.String strValueOf = interfaceC54581xNrOLrzqt5.valueOf(upperCase);
                if (strValueOf != null) {
                    str = strValueOf;
                }
                C53441wlZ c53441wlZ3 = this.gEmmrt;
                if (c53441wlZ3 != null) {
                    C53441wlZ c53441wlZ22 = this.gEmmrt;
                    if (c53441wlZ22 != null) {
                        java.lang.String str62 = this.fJNWhG;
                        if (str62 != null) {
                        }
                        C53501wmg c53501wmg3 = this.ejfBZ;
                        if (c53501wmg3 != null) {
                            C53427wlL c53427wlL5 = this.sSMYrx;
                            if (c53427wlL5 != null) {
                                kotlin.Pair<java.lang.String, java.lang.String> pair2 = this.AuCTel;
                                C53501wmg c53501wmg22 = this.ejfBZ;
                                if (c53501wmg22 != null) {
                                    C53427wlL c53427wlL22 = this.sSMYrx;
                                    if (c53427wlL22 != null) {
                                        C53427wlL c53427wlL32 = this.sSMYrx;
                                        if (c53427wlL32 != null) {
                                            interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                                            if (interfaceC54581xNrOLrzqt != null) {
                                                zAhwBna = false;
                                                C53427wlL c53427wlL42 = this.sSMYrx;
                                                if (c53427wlL42 != null) {
                                                    ArbitragePriceSetting arbitragePriceSetting4 = this.gasjUx;
                                                    if (arbitragePriceSetting4 != null) {
                                                        ArbitragePriceSetting arbitragePriceSetting22 = this.gasjUx;
                                                        if (arbitragePriceSetting22 == null) {
                                                        }
                                                        ArbitragePriceSetting arbitragePriceSetting32 = this.gasjUx;
                                                        if (arbitragePriceSetting32 == null) {
                                                        }
                                                        interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                                                        if (interfaceC54581xNrOLrzqt2 != null) {
                                                            boolValueOf = null;
                                                            BizInstrument bizInstrument62 = this.AkhnZx;
                                                            if (!(bizInstrument62 instanceof SpotInstrument)) {
                                                            }
                                                            arbitrageOrderConfirmData = new ArbitrageOrderConfirmData(strOLrzqt3, str, str4, str5, str7, str8, str9, pair2, str10, str11, str12, zAhwBna, str13, zBooleanValue, takerRange, makerRange, boolValueOf, spotInstrument == null ? spotInstrument.getLevel() : null);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            arbitrageOrderConfirmData = arbitrageOrderConfirmData2;
        }
        if (orderType == orderType2 || orderType == OrderType.RIGHT) {
            C54799xVt c54799xVt2 = C54799xVt.AEQbTJ;
            BizInstrument bizInstrument8 = this.iRxXKY;
            Intrinsics.copydefault(bizInstrument8);
            java.lang.String strOLrzqt4 = c54799xVt2.OLrzqt(bizInstrument8);
            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt6 = c54589xNz2.OLrzqt();
            if (interfaceC54581xNrOLrzqt6 == null) {
                str2 = "";
                C53441wlZ c53441wlZ4 = this.iZzfmt;
                java.lang.String str14 = (c53441wlZ4 != null || (strEZpvd2 = c53441wlZ4.EZpvd()) == null) ? "" : strEZpvd2;
                C53441wlZ c53441wlZ5 = this.iZzfmt;
                java.lang.String str15 = (c53441wlZ5 != null || (strAEQbTJ4 = c53441wlZ5.AEQbTJ()) == null) ? "" : strAEQbTJ4;
                java.lang.String str16 = this.DXXBbs;
                java.lang.String str17 = str16 != null ? "" : str16;
                C53501wmg c53501wmg4 = this.DCJXGO;
                java.lang.String str18 = (c53501wmg4 != null || (strAEQbTJ3 = c53501wmg4.AEQbTJ()) == null) ? "" : strAEQbTJ3;
                C53427wlL c53427wlL6 = this.djSkpj;
                java.lang.String str19 = (c53427wlL6 != null || (c47988uAvOLrzqt4 = c53427wlL6.OLrzqt()) == null || (strAkhnZx4 = c47988uAvOLrzqt4.AkhnZx()) == null) ? "" : strAkhnZx4;
                kotlin.Pair<java.lang.String, java.lang.String> pair3 = this.DAIeex;
                C53501wmg c53501wmg5 = this.DCJXGO;
                java.lang.String str20 = (c53501wmg5 != null || (strOLrzqt2 = c53501wmg5.OLrzqt()) == null) ? "" : strOLrzqt2;
                C53427wlL c53427wlL7 = this.djSkpj;
                java.lang.String str21 = (c53427wlL7 != null || (c47988uAvOLrzqt3 = c53427wlL7.OLrzqt()) == null || (strFARcdN4 = c47988uAvOLrzqt3.fARcdN()) == null) ? "" : strFARcdN4;
                C53427wlL c53427wlL8 = this.djSkpj;
                java.lang.String str22 = (c53427wlL8 != null || (c47988uAvKWHzl4 = c53427wlL8.KWHzl()) == null || (strAkhnZx3 = c47988uAvKWHzl4.AkhnZx()) == null) ? "" : strAkhnZx3;
                interfaceC54581xNrOLrzqt3 = c54589xNz2.OLrzqt();
                if (interfaceC54581xNrOLrzqt3 != null || (xouWlaJM4 = interfaceC54581xNrOLrzqt3.wlaJM()) == null) {
                    zAhwBna2 = false;
                } else {
                    BizInstrument bizInstrument9 = this.iRxXKY;
                    if (bizInstrument9 == null || (instId5 = bizInstrument9.getInstId()) == null) {
                        instId5 = "";
                    }
                    BizInstrument bizInstrument10 = this.iRxXKY;
                    if (bizInstrument10 == null || (instType4 = bizInstrument10.getInstType()) == null) {
                        instType4 = "";
                    }
                    zAhwBna2 = xouWlaJM4.AhwBna(instId5, instType4);
                }
                C53427wlL c53427wlL9 = this.djSkpj;
                java.lang.String str23 = (c53427wlL9 != null || (c47988uAvKWHzl3 = c53427wlL9.KWHzl()) == null || (strFARcdN3 = c47988uAvKWHzl3.fARcdN()) == null) ? "" : strFARcdN3;
                ArbitragePriceSetting arbitragePriceSetting5 = this.gasjUx;
                boolean zBooleanValue2 = (arbitragePriceSetting5 != null || (automaticTracking2 = arbitragePriceSetting5.getAutomaticTracking()) == null) ? false : automaticTracking2.booleanValue();
                ArbitragePriceSetting arbitragePriceSetting6 = this.gasjUx;
                java.lang.Integer takerRange2 = arbitragePriceSetting6 == null ? arbitragePriceSetting6.getTakerRange() : null;
                ArbitragePriceSetting arbitragePriceSetting7 = this.gasjUx;
                java.lang.Integer makerRange2 = arbitragePriceSetting7 == null ? arbitragePriceSetting7.getMakerRange() : null;
                interfaceC54581xNrOLrzqt4 = c54589xNz2.OLrzqt();
                if (interfaceC54581xNrOLrzqt4 != null || (xouWlaJM3 = interfaceC54581xNrOLrzqt4.wlaJM()) == null) {
                    boolValueOf2 = null;
                } else {
                    BizInstrument bizInstrument11 = this.iRxXKY;
                    if (bizInstrument11 == null || (instId4 = bizInstrument11.getInstId()) == null) {
                        instId4 = "";
                    }
                    BizInstrument bizInstrument12 = this.iRxXKY;
                    if (bizInstrument12 != null && (instType3 = bizInstrument12.getInstType()) != null) {
                        str3 = instType3;
                    }
                    boolValueOf2 = java.lang.Boolean.valueOf(xouWlaJM3.AhwBna(instId4, str3));
                }
                BizInstrument bizInstrument13 = this.iRxXKY;
                SpotInstrument spotInstrument2 = !(bizInstrument13 instanceof SpotInstrument) ? (SpotInstrument) bizInstrument13 : null;
                arbitrageOrderConfirmData3 = new ArbitrageOrderConfirmData(strOLrzqt4, str2, str14, str15, str17, str18, str19, pair3, str20, str21, str22, zAhwBna2, str23, zBooleanValue2, takerRange2, makerRange2, boolValueOf2, spotInstrument2 == null ? spotInstrument2.getLevel() : null);
            } else {
                BizInstrument bizInstrument14 = this.iRxXKY;
                if (bizInstrument14 == null || (instId6 = bizInstrument14.getInstId()) == null) {
                    instId6 = "";
                }
                java.lang.String upperCase2 = o.TaskDescription.AEQbTJ(instId6).copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                java.lang.String strValueOf2 = interfaceC54581xNrOLrzqt6.valueOf(upperCase2);
                if (strValueOf2 != null) {
                    str2 = strValueOf2;
                }
                C53441wlZ c53441wlZ42 = this.iZzfmt;
                if (c53441wlZ42 != null) {
                    C53441wlZ c53441wlZ52 = this.iZzfmt;
                    if (c53441wlZ52 != null) {
                        java.lang.String str162 = this.DXXBbs;
                        if (str162 != null) {
                        }
                        C53501wmg c53501wmg42 = this.DCJXGO;
                        if (c53501wmg42 != null) {
                            C53427wlL c53427wlL62 = this.djSkpj;
                            if (c53427wlL62 != null) {
                                kotlin.Pair<java.lang.String, java.lang.String> pair32 = this.DAIeex;
                                C53501wmg c53501wmg52 = this.DCJXGO;
                                if (c53501wmg52 != null) {
                                    C53427wlL c53427wlL72 = this.djSkpj;
                                    if (c53427wlL72 != null) {
                                        C53427wlL c53427wlL82 = this.djSkpj;
                                        if (c53427wlL82 != null) {
                                            interfaceC54581xNrOLrzqt3 = c54589xNz2.OLrzqt();
                                            if (interfaceC54581xNrOLrzqt3 != null) {
                                                zAhwBna2 = false;
                                                C53427wlL c53427wlL92 = this.djSkpj;
                                                if (c53427wlL92 != null) {
                                                    ArbitragePriceSetting arbitragePriceSetting52 = this.gasjUx;
                                                    if (arbitragePriceSetting52 != null) {
                                                        ArbitragePriceSetting arbitragePriceSetting62 = this.gasjUx;
                                                        if (arbitragePriceSetting62 == null) {
                                                        }
                                                        ArbitragePriceSetting arbitragePriceSetting72 = this.gasjUx;
                                                        if (arbitragePriceSetting72 == null) {
                                                        }
                                                        interfaceC54581xNrOLrzqt4 = c54589xNz2.OLrzqt();
                                                        if (interfaceC54581xNrOLrzqt4 != null) {
                                                            boolValueOf2 = null;
                                                            BizInstrument bizInstrument132 = this.iRxXKY;
                                                            if (!(bizInstrument132 instanceof SpotInstrument)) {
                                                            }
                                                            arbitrageOrderConfirmData3 = new ArbitrageOrderConfirmData(strOLrzqt4, str2, str14, str15, str17, str18, str19, pair32, str20, str21, str22, zAhwBna2, str23, zBooleanValue2, takerRange2, makerRange2, boolValueOf2, spotInstrument2 == null ? spotInstrument2.getLevel() : null);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        pUU.KWHzl("BotOrder", "二次确认 ArbitrageOrderConfirmFragment Show");
        C52117vzo.Companion.copydefault(arbitrageOrderConfirmData, arbitrageOrderConfirmData3, new Function0() { // from class: o.vAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50062vAm.OLrzqt(this.KWHzl, orderType);
            }
        }).show(getChildFragmentManager(), C52117vzo.class.getSimpleName());
    }

    public static final Unit OLrzqt(C50062vAm c50062vAm, OrderType orderType) {
        pUU.KWHzl("BotOrder", "二次确认 ArbitrageOrderConfirmFragment Start Order");
        c50062vAm.copydefault(orderType);
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(OrderType orderType) {
        C47988uAv c47988uAvOLrzqt;
        java.lang.String strAkhnZx;
        C47988uAv c47988uAvOLrzqt2;
        java.lang.String strAkhnZx2;
        if (orderType == OrderType.LEFT) {
            BizInstrument bizInstrument = this.AkhnZx;
            C53427wlL c53427wlL = this.sSMYrx;
            return OLrzqt(bizInstrument, (c53427wlL == null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null || (strAkhnZx2 = c47988uAvOLrzqt2.AkhnZx()) == null) ? "" : strAkhnZx2, this.AuCTel, C56036xvI.KWHzl.copydefault(), this.uzCIH, this.fJNWhG);
        }
        BizInstrument bizInstrument2 = this.iRxXKY;
        C53427wlL c53427wlL2 = this.djSkpj;
        return OLrzqt(bizInstrument2, (c53427wlL2 == null || (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) == null || (strAkhnZx = c47988uAvOLrzqt.AkhnZx()) == null) ? "" : strAkhnZx, this.DAIeex, C56036xvI.KWHzl.AEQbTJ(), this.DarRvM, this.DXXBbs);
    }

    public final void copydefault(OrderType orderType) {
        java.lang.String instType;
        java.lang.String instId;
        boolean z;
        boolean z2;
        java.lang.String instType2;
        java.lang.String instId2;
        ArbitrageOrderData arbitrageOrderData = new ArbitrageOrderData();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        OrderType orderType2 = OrderType.LEFT;
        if (orderType == orderType2 || orderType == OrderType.BOTH) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            BizInstrument bizInstrument2 = this.AkhnZx;
            if (bizInstrument2 == null || (instId = bizInstrument2.getInstId()) == null) {
                instId = "";
            }
            kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
            java.lang.String strKWHzl = KWHzl(orderType2);
            java.lang.String str = this.fARcdN;
            InterfaceC50102vBz interfaceC50102vBz = this.AhwBna;
            z = false;
            arrayList.add(EZpvd(instType, instId, pair, strKWHzl, str, interfaceC50102vBz != null ? interfaceC50102vBz.AEQbTJ() : null, this.fJNWhG, this.fIwbmz, AEQbTJ(true), true));
            z2 = false;
        } else {
            z = false;
            z2 = true;
        }
        OrderType orderType3 = OrderType.RIGHT;
        if (orderType == orderType3 || orderType == OrderType.BOTH) {
            BizInstrument bizInstrument3 = this.iRxXKY;
            if (bizInstrument3 == null || (instType2 = bizInstrument3.getInstType()) == null) {
                instType2 = "";
            }
            BizInstrument bizInstrument4 = this.iRxXKY;
            if (bizInstrument4 == null || (instId2 = bizInstrument4.getInstId()) == null) {
                instId2 = "";
            }
            kotlin.Pair<java.lang.String, java.lang.String> pair2 = this.DAIeex;
            java.lang.String strKWHzl2 = KWHzl(orderType3);
            java.lang.String str2 = this.accept;
            InterfaceC50102vBz interfaceC50102vBz2 = this.giSNqX;
            arrayList.add(EZpvd(instType2, instId2, pair2, strKWHzl2, str2, interfaceC50102vBz2 != null ? interfaceC50102vBz2.AEQbTJ() : null, this.DXXBbs, this.AxsJAYsNCnLh, AEQbTJ(z), z2));
        }
        C53497wmc c53497wmc = this.gGvvIC;
        arbitrageOrderData.setAssociate(java.lang.Boolean.valueOf((c53497wmc == null || !c53497wmc.copydefault() || arrayList.size() <= 1) ? z : true));
        arbitrageOrderData.setInstList(arrayList);
        arbitrageOrderData.setOrdType("arbitrage");
        showLoading();
        isConnected().AEQbTJ(arbitrageOrderData, new yHO() { // from class: o.vBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C50062vAm.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(C50062vAm c50062vAm, boolean z, java.lang.String str, java.lang.String str2) {
        xOW newProxyInstance;
        java.lang.String instId;
        xOW newProxyInstance2;
        java.lang.String instId2;
        c50062vAm.dismissLoading();
        if (z) {
            c50062vAm.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("arbitrage", ""));
            c50062vAm.EZpvd();
        } else {
            boolean z2 = false;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "58108")) {
                C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.toggle));
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                BizInstrument bizInstrument = c50062vAm.AkhnZx;
                java.lang.String str3 = (bizInstrument == null || (instId2 = bizInstrument.getInstId()) == null) ? "" : instId2;
                java.lang.String str4 = str == null ? "" : str;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance2.QbewEr()) {
                    z2 = true;
                }
                c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "arbitrage", str3, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str4, str2, z2, 1, null));
            } else {
                C33134mqi.AEQbTJ(str);
                C55867xrz c55867xrz2 = C55867xrz.KWHzl;
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                BizInstrument bizInstrument2 = c50062vAm.AkhnZx;
                java.lang.String str5 = (bizInstrument2 == null || (instId = bizInstrument2.getInstId()) == null) ? "" : instId;
                java.lang.String str6 = str == null ? "" : str;
                java.lang.String str7 = str2 == null ? "" : str2;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
                c55867xrz2.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis2), "arbitrage", str5, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str6, str7, (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 1, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(BizInstrument bizInstrument, java.lang.String str, kotlin.Pair<java.lang.String, java.lang.String> pair, ArbitrageInfo arbitrageInfo, TickersData tickersData, java.lang.String str2) {
        java.lang.String instId;
        java.lang.String instType;
        boolean z;
        java.lang.String strKWHzl;
        java.lang.String strGEmmrt;
        C54797xVr c54797xVr = C54797xVr.copydefault;
        if (bizInstrument == null || (instId = bizInstrument.getInstId()) == null) {
            instId = "";
        }
        if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
            instType = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
            z = Intrinsics.EZpvd((java.lang.Object) (pair != null ? pair.getFirst() : null), (java.lang.Object) "marketPrice") && Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "buy");
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "MARGIN")) {
            }
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, instId, instType, null, z, null, 20, null);
        if (c54571xNhCreateAmtConvertor$default != null) {
            c54571xNhCreateAmtConvertor$default.AhwBna(java.lang.String.valueOf(KWHzl(pair, arbitrageInfo, tickersData, bizInstrument)));
        }
        return (c54571xNhCreateAmtConvertor$default == null || (strKWHzl = c54571xNhCreateAmtConvertor$default.KWHzl(str)) == null || (strGEmmrt = C33129mqd.gEmmrt(strKWHzl)) == null) ? "" : strGEmmrt;
    }

    public final boolean OLrzqt(OrderType orderType) {
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvOLrzqt3;
        C47988uAv c47988uAvOLrzqt4;
        java.lang.String strFetchVPNInfo = null;
        if (orderType == OrderType.LEFT || orderType == OrderType.BOTH) {
            if (!AEQbTJ(this.AuCTel, this.ejfBZ) || !KWHzl()) {
                return false;
            }
            C53427wlL c53427wlL = this.sSMYrx;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL == null || (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) == null) ? null : c47988uAvOLrzqt2.fetchVPNInfo()))) {
                C53427wlL c53427wlL2 = this.sSMYrx;
                if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null) {
                    c47988uAvOLrzqt.AuCTelauCTel();
                }
                return false;
            }
        }
        if (orderType != OrderType.RIGHT && orderType != OrderType.BOTH) {
            return true;
        }
        if (!AEQbTJ(this.DAIeex, this.DCJXGO) || !AEQbTJ()) {
            return false;
        }
        C53427wlL c53427wlL3 = this.djSkpj;
        if (c53427wlL3 != null && (c47988uAvOLrzqt4 = c53427wlL3.OLrzqt()) != null) {
            strFetchVPNInfo = c47988uAvOLrzqt4.fetchVPNInfo();
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strFetchVPNInfo)) {
            return true;
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null && (c47988uAvOLrzqt3 = c53427wlL4.OLrzqt()) != null) {
            c47988uAvOLrzqt3.AuCTelauCTel();
        }
        return false;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wmg.showEnterInputModel$default(o.wmg, boolean, int, java.lang.Object):void */
    public final boolean AEQbTJ(kotlin.Pair<java.lang.String, java.lang.String> pair, C53501wmg c53501wmg) {
        if (pair != null && (!Intrinsics.EZpvd((java.lang.Object) pair.getFirst(), (java.lang.Object) "enter") || !android.text.TextUtils.isEmpty(pair.getSecond()))) {
            return true;
        }
        if (c53501wmg != null) {
            C53501wmg.showEnterInputModel$default(c53501wmg, false, 1, null);
        }
        return false;
    }

    public final ArbitrageInst EZpvd(java.lang.String str, java.lang.String str2, kotlin.Pair<java.lang.String, java.lang.String> pair, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.Boolean bool, boolean z) {
        ArbitrageInst arbitrageInst = new ArbitrageInst();
        arbitrageInst.setInstId(str2);
        arbitrageInst.setPxType(pair != null ? pair.getFirst() : null);
        if (Intrinsics.EZpvd((java.lang.Object) (pair != null ? pair.getFirst() : null), (java.lang.Object) "enter")) {
            xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(str2, str);
            arbitrageInst.setEnterPx(xmsAEQbTJ != null ? xmsAEQbTJ.valueOf(pair.getSecond()) : null);
        }
        arbitrageInst.setSz(str3);
        arbitrageInst.setTdMode(str4);
        arbitrageInst.setCcy(str5);
        arbitrageInst.setSide(str6);
        arbitrageInst.setPosSide(str7);
        arbitrageInst.setReduceOnly(bool);
        arbitrageInst.setMajor(java.lang.Boolean.valueOf(z));
        return arbitrageInst;
    }

    public final void fetchVPNInfo(boolean z) {
        java.lang.String instType;
        java.lang.String instFamily;
        C47988uAv c47988uAvOLrzqt;
        java.lang.String instFamily2;
        C47988uAv c47988uAvOLrzqt2;
        java.lang.String strFARcdN;
        C47988uAv c47988uAvOLrzqt3;
        java.lang.String strFARcdN2;
        C47988uAv c47988uAvOLrzqt4;
        java.lang.String instType2;
        java.lang.String instFamily3;
        C47988uAv c47988uAvOLrzqt5;
        java.lang.String instFamily4;
        C47988uAv c47988uAvOLrzqt6;
        java.lang.String str = "";
        if (z) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault == null) {
                return;
            }
            BizInstrument bizInstrument = this.AkhnZx;
            if (bizInstrument == null || (instType2 = bizInstrument.getInstType()) == null) {
                instType2 = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType2);
            if (abstractC54531xLwOLrzqt == null) {
                return;
            }
            if (djBIcL(true)) {
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (bizInstrument2 == null || (instFamily4 = bizInstrument2.getInstFamily()) == null) {
                    instFamily4 = "";
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily4);
                int iAhwBna = C33129mqd.AhwBna(idxConfigAkhnZx != null ? idxConfigAkhnZx.getQuoteDig() : null);
                C53427wlL c53427wlL = this.sSMYrx;
                if (c53427wlL != null && (c47988uAvOLrzqt6 = c53427wlL.OLrzqt()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvOLrzqt6, C33070mpX.AYXKKw(C55688xof.Application.ContextAware), null, 2, null);
                    c47988uAvOLrzqt6.setInputUnit(abstractC54531xLwOLrzqt.djBIcL(this.AkhnZx));
                    c47988uAvOLrzqt6.setMaxDecimal(iAhwBna);
                }
            } else {
                BizInstrument bizInstrument3 = this.AkhnZx;
                if (bizInstrument3 == null || (instFamily3 = bizInstrument3.getInstFamily()) == null) {
                    instFamily3 = "";
                }
                int iAhwBna2 = C33129mqd.AhwBna(abstractC54531xLwOLrzqt.djBIcL(instFamily3));
                C53427wlL c53427wlL2 = this.sSMYrx;
                if (c53427wlL2 != null && (c47988uAvOLrzqt5 = c53427wlL2.OLrzqt()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvOLrzqt5, C33070mpX.AYXKKw(C55688xof.Application.ContextAware), null, 2, null);
                    c47988uAvOLrzqt5.setInputUnit(abstractC54531xLwOLrzqt.OLrzqt(this.AkhnZx));
                    c47988uAvOLrzqt5.setMaxDecimal(iAhwBna2);
                }
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault2 == null) {
                return;
            }
            BizInstrument bizInstrument4 = this.iRxXKY;
            if (bizInstrument4 == null || (instType = bizInstrument4.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault2.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt2 == null) {
                return;
            }
            if (djBIcL(false)) {
                BizInstrument bizInstrument5 = this.iRxXKY;
                if (bizInstrument5 == null || (instFamily2 = bizInstrument5.getInstFamily()) == null) {
                    instFamily2 = "";
                }
                IdxConfig idxConfigAkhnZx2 = abstractC54531xLwOLrzqt2.AkhnZx(instFamily2);
                int iAhwBna3 = C33129mqd.AhwBna(idxConfigAkhnZx2 != null ? idxConfigAkhnZx2.getQuoteDig() : null);
                C53427wlL c53427wlL3 = this.djSkpj;
                if (c53427wlL3 != null && (c47988uAvOLrzqt2 = c53427wlL3.OLrzqt()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvOLrzqt2, C33070mpX.AYXKKw(C55688xof.Application.ContextAware), null, 2, null);
                    c47988uAvOLrzqt2.setInputUnit(abstractC54531xLwOLrzqt2.djBIcL(this.iRxXKY));
                    c47988uAvOLrzqt2.setMaxDecimal(iAhwBna3);
                }
            } else {
                BizInstrument bizInstrument6 = this.iRxXKY;
                if (bizInstrument6 == null || (instFamily = bizInstrument6.getInstFamily()) == null) {
                    instFamily = "";
                }
                int iAhwBna4 = C33129mqd.AhwBna(abstractC54531xLwOLrzqt2.djBIcL(instFamily));
                C53427wlL c53427wlL4 = this.djSkpj;
                if (c53427wlL4 != null && (c47988uAvOLrzqt = c53427wlL4.OLrzqt()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvOLrzqt, C33070mpX.AYXKKw(C55688xof.Application.ContextAware), null, 2, null);
                    c47988uAvOLrzqt.setInputUnit(abstractC54531xLwOLrzqt2.OLrzqt(this.iRxXKY));
                    c47988uAvOLrzqt.setMaxDecimal(iAhwBna4);
                }
            }
        }
        vBG vbgAkhnZx = AkhnZx();
        C53427wlL c53427wlL5 = this.sSMYrx;
        if (c53427wlL5 == null || (c47988uAvOLrzqt4 = c53427wlL5.OLrzqt()) == null || (strFARcdN = c47988uAvOLrzqt4.fARcdN()) == null) {
            strFARcdN = "";
        }
        C53427wlL c53427wlL6 = this.djSkpj;
        if (c53427wlL6 != null && (c47988uAvOLrzqt3 = c53427wlL6.OLrzqt()) != null && (strFARcdN2 = c47988uAvOLrzqt3.fARcdN()) != null) {
            str = strFARcdN2;
        }
        vbgAkhnZx.EZpvd(strFARcdN, str, this.zLjUOn);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean djBIcL(boolean z) {
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "MARGIN")) {
                }
            }
            kotlin.Pair<java.lang.String, java.lang.String> pair = this.AuCTel;
            return Intrinsics.EZpvd((java.lang.Object) (pair != null ? pair.getFirst() : null), (java.lang.Object) "marketPrice") && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "buy");
        }
        BizInstrument bizInstrument3 = this.iRxXKY;
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "SPOT")) {
            BizInstrument bizInstrument4 = this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "MARGIN")) {
            }
        }
        kotlin.Pair<java.lang.String, java.lang.String> pair2 = this.DAIeex;
        if (!Intrinsics.EZpvd((java.lang.Object) (pair2 != null ? pair2.getFirst() : null), (java.lang.Object) "marketPrice") || !Intrinsics.EZpvd((java.lang.Object) this.DXXBbs, (java.lang.Object) "buy")) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DbNXlk(boolean z) {
        java.lang.String instType;
        int iAhwBna;
        C53427wlL c53427wlL;
        C47988uAv c47988uAvKWHzl;
        xOW newProxyInstance;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ;
        java.lang.String instFamily;
        BizInstrument bizInstrument;
        xOW newProxyInstance2;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ2;
        java.lang.String instFamily2;
        java.lang.String strFARcdN;
        C47988uAv c47988uAvKWHzl2;
        java.lang.String strFARcdN2;
        C47988uAv c47988uAvKWHzl3;
        java.lang.String instType2;
        int iAhwBna2;
        C53427wlL c53427wlL2;
        C47988uAv c47988uAvKWHzl4;
        xOW newProxyInstance3;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ3;
        java.lang.String instFamily3;
        BizInstrument bizInstrument2;
        xOW newProxyInstance4;
        ValuationCurrencyData valuationCurrencyDataAEQbTJ4;
        java.lang.String instFamily4;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ContextAwareKt);
        java.lang.String strDjBIcL = "USD";
        java.lang.String str = "";
        int iAhwBna3 = 0;
        if (z) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault == null) {
                return;
            }
            BizInstrument bizInstrument3 = this.AkhnZx;
            if (bizInstrument3 == null || (instType2 = bizInstrument3.getInstType()) == null) {
                instType2 = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType2);
            if (abstractC54531xLwOLrzqt == null) {
                return;
            }
            BizInstrument bizInstrument4 = this.AkhnZx;
            java.lang.String instType3 = bizInstrument4 != null ? bizInstrument4.getInstType() : null;
            if (instType3 != null) {
                switch (instType3.hashCode()) {
                    case -2027980370:
                        if (!instType3.equals("MARGIN")) {
                            strDjBIcL = "";
                        } else {
                            BizInstrument bizInstrument5 = this.AkhnZx;
                            if (bizInstrument5 == null || (instFamily3 = bizInstrument5.getInstFamily()) == null) {
                                instFamily3 = "";
                            }
                            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily3);
                            iAhwBna3 = C33129mqd.AhwBna(idxConfigAkhnZx != null ? idxConfigAkhnZx.getQuoteDig() : null);
                            strDjBIcL = abstractC54531xLwOLrzqt.djBIcL(this.AkhnZx);
                            if (strDjBIcL == null) {
                                strDjBIcL = "";
                            }
                        }
                        break;
                    case -1956807563:
                        if (!instType3.equals("OPTION")) {
                            strDjBIcL = "";
                        } else {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
                            iAhwBna2 = C33129mqd.AhwBna((interfaceC54581xNrCopydefault2 == null || (newProxyInstance3 = interfaceC54581xNrCopydefault2.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ3 = newProxyInstance3.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ3.getPrecision());
                        }
                        break;
                    case 2552066:
                        if (!instType3.equals("SPOT")) {
                            strDjBIcL = "";
                            break;
                        }
                        break;
                    case 2558355:
                        if (!instType3.equals("SWAP")) {
                            strDjBIcL = "";
                        }
                        bizInstrument2 = this.AkhnZx;
                        if (bizInstrument2 == null && bizInstrument2.isPositiveContract()) {
                            java.lang.String strDjBIcL2 = abstractC54531xLwOLrzqt.djBIcL(this.AkhnZx);
                            strDjBIcL = strDjBIcL2 == null ? "" : strDjBIcL2;
                            BizInstrument bizInstrument6 = this.AkhnZx;
                            if (bizInstrument6 == null || (instFamily4 = bizInstrument6.getInstFamily()) == null) {
                                instFamily4 = "";
                            }
                            iAhwBna2 = C33129mqd.AhwBna(abstractC54531xLwOLrzqt.fJNWhG(instFamily4));
                        } else {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault3 = c54589xNz.copydefault();
                            iAhwBna2 = C33129mqd.AhwBna((interfaceC54581xNrCopydefault3 != null || (newProxyInstance4 = interfaceC54581xNrCopydefault3.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ4 = newProxyInstance4.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ4.getPrecision());
                        }
                        break;
                    case 214415088:
                        if (!instType3.equals("FUTURES")) {
                            strDjBIcL = "";
                        }
                        bizInstrument2 = this.AkhnZx;
                        if (bizInstrument2 == null) {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault32 = c54589xNz.copydefault();
                            if (interfaceC54581xNrCopydefault32 != null) {
                                iAhwBna2 = C33129mqd.AhwBna((interfaceC54581xNrCopydefault32 != null || (newProxyInstance4 = interfaceC54581xNrCopydefault32.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ4 = newProxyInstance4.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ4.getPrecision());
                                break;
                            }
                        }
                        break;
                    default:
                        strDjBIcL = "";
                        break;
                }
                c53427wlL2 = this.sSMYrx;
                if (c53427wlL2 != null && (c47988uAvKWHzl4 = c53427wlL2.KWHzl()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvKWHzl4, strAYXKKw, null, 2, null);
                    c47988uAvKWHzl4.setInputUnit(strDjBIcL);
                    c47988uAvKWHzl4.setMaxDecimal(iAhwBna2);
                }
            } else {
                strDjBIcL = "";
            }
            iAhwBna2 = iAhwBna3;
            c53427wlL2 = this.sSMYrx;
            if (c53427wlL2 != null) {
                C47988uAv.setInputLabel$default(c47988uAvKWHzl4, strAYXKKw, null, 2, null);
                c47988uAvKWHzl4.setInputUnit(strDjBIcL);
                c47988uAvKWHzl4.setMaxDecimal(iAhwBna2);
            }
        } else {
            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault4 = c54589xNz2.copydefault();
            if (interfaceC54581xNrCopydefault4 == null) {
                return;
            }
            BizInstrument bizInstrument7 = this.iRxXKY;
            if (bizInstrument7 == null || (instType = bizInstrument7.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrCopydefault4.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt2 == null) {
                return;
            }
            BizInstrument bizInstrument8 = this.iRxXKY;
            java.lang.String instType4 = bizInstrument8 != null ? bizInstrument8.getInstType() : null;
            if (instType4 != null) {
                switch (instType4.hashCode()) {
                    case -2027980370:
                        if (!instType4.equals("MARGIN")) {
                            strDjBIcL = "";
                        } else {
                            BizInstrument bizInstrument9 = this.iRxXKY;
                            if (bizInstrument9 == null || (instFamily = bizInstrument9.getInstFamily()) == null) {
                                instFamily = "";
                            }
                            IdxConfig idxConfigAkhnZx2 = abstractC54531xLwOLrzqt2.AkhnZx(instFamily);
                            iAhwBna3 = C33129mqd.AhwBna(idxConfigAkhnZx2 != null ? idxConfigAkhnZx2.getQuoteDig() : null);
                            strDjBIcL = abstractC54531xLwOLrzqt2.djBIcL(this.iRxXKY);
                            if (strDjBIcL == null) {
                                strDjBIcL = "";
                            }
                        }
                        break;
                    case -1956807563:
                        if (!instType4.equals("OPTION")) {
                            strDjBIcL = "";
                        } else {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault5 = c54589xNz2.copydefault();
                            iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrCopydefault5 == null || (newProxyInstance = interfaceC54581xNrCopydefault5.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ = newProxyInstance.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ.getPrecision());
                        }
                        break;
                    case 2552066:
                        if (!instType4.equals("SPOT")) {
                            strDjBIcL = "";
                            break;
                        }
                        break;
                    case 2558355:
                        if (!instType4.equals("SWAP")) {
                            strDjBIcL = "";
                        }
                        bizInstrument = this.iRxXKY;
                        if (bizInstrument == null && bizInstrument.isPositiveContract()) {
                            java.lang.String strDjBIcL3 = abstractC54531xLwOLrzqt2.djBIcL(this.iRxXKY);
                            strDjBIcL = strDjBIcL3 == null ? "" : strDjBIcL3;
                            BizInstrument bizInstrument10 = this.iRxXKY;
                            if (bizInstrument10 == null || (instFamily2 = bizInstrument10.getInstFamily()) == null) {
                                instFamily2 = "";
                            }
                            iAhwBna = C33129mqd.AhwBna(abstractC54531xLwOLrzqt2.fJNWhG(instFamily2));
                        } else {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault6 = c54589xNz2.copydefault();
                            iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrCopydefault6 != null || (newProxyInstance2 = interfaceC54581xNrCopydefault6.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ2 = newProxyInstance2.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ2.getPrecision());
                        }
                        break;
                    case 214415088:
                        if (!instType4.equals("FUTURES")) {
                            strDjBIcL = "";
                        }
                        bizInstrument = this.iRxXKY;
                        if (bizInstrument == null) {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault62 = c54589xNz2.copydefault();
                            if (interfaceC54581xNrCopydefault62 != null) {
                                iAhwBna = C33129mqd.AhwBna((interfaceC54581xNrCopydefault62 != null || (newProxyInstance2 = interfaceC54581xNrCopydefault62.getNewProxyInstance()) == null || (valuationCurrencyDataAEQbTJ2 = newProxyInstance2.AEQbTJ("USD")) == null) ? null : valuationCurrencyDataAEQbTJ2.getPrecision());
                                break;
                            }
                        }
                        break;
                    default:
                        strDjBIcL = "";
                        break;
                }
                c53427wlL = this.djSkpj;
                if (c53427wlL != null && (c47988uAvKWHzl = c53427wlL.KWHzl()) != null) {
                    C47988uAv.setInputLabel$default(c47988uAvKWHzl, strAYXKKw, null, 2, null);
                    c47988uAvKWHzl.setInputUnit(strDjBIcL);
                    c47988uAvKWHzl.setMaxDecimal(iAhwBna);
                }
            } else {
                strDjBIcL = "";
            }
            iAhwBna = iAhwBna3;
            c53427wlL = this.djSkpj;
            if (c53427wlL != null) {
                C47988uAv.setInputLabel$default(c47988uAvKWHzl, strAYXKKw, null, 2, null);
                c47988uAvKWHzl.setInputUnit(strDjBIcL);
                c47988uAvKWHzl.setMaxDecimal(iAhwBna);
            }
        }
        vBG vbgAkhnZx = AkhnZx();
        C53427wlL c53427wlL3 = this.sSMYrx;
        if (c53427wlL3 == null || (c47988uAvKWHzl3 = c53427wlL3.KWHzl()) == null || (strFARcdN = c47988uAvKWHzl3.fARcdN()) == null) {
            strFARcdN = "";
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null && (c47988uAvKWHzl2 = c53427wlL4.KWHzl()) != null && (strFARcdN2 = c47988uAvKWHzl2.fARcdN()) != null) {
            str = strFARcdN2;
        }
        vbgAkhnZx.AEQbTJ(strFARcdN, str, this.AubY);
    }

    public final void AuCTelauCTel() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(getString(C55688xof.Application.ddhgMB));
        java.lang.String string = getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50062vAm.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void values(boolean z) {
        vBK vbk;
        vBK vbk2;
        if (z) {
            C53427wlL c53427wlL = this.sSMYrx;
            if (c53427wlL != null) {
                c53427wlL.setReduceSelect(this.AuCTelauCTel);
            }
            BizInstrument bizInstrument = this.AkhnZx;
            if (OLrzqt(bizInstrument != null ? bizInstrument.getInstType() : null, this.fJNWhG, this.fIwbmz) || (vbk2 = this.ORxRYg) == null) {
                return;
            }
            vbk2.EZpvd(AEQbTJ(true));
            return;
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.setReduceSelect(this.wlaJM);
        }
        BizInstrument bizInstrument2 = this.iRxXKY;
        if (OLrzqt(bizInstrument2 != null ? bizInstrument2.getInstType() : null, this.DXXBbs, this.AxsJAYsNCnLh) || (vbk = this.aKErDB) == null) {
            return;
        }
        vbk.EZpvd(AEQbTJ(false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1936=4, 1913=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void isConnected(boolean z) {
        C53427wlL c53427wlL;
        C53427wlL c53427wlL2;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        xOW newProxyInstance2;
        xOW newProxyInstance3;
        C53427wlL c53427wlL3;
        C53427wlL c53427wlL4;
        xOW newProxyInstance4;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        xOW newProxyInstance5;
        xOW newProxyInstance6;
        java.lang.String strAuCTelauCTel = null;
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (instType != null) {
                switch (instType.hashCode()) {
                    case -2027980370:
                        if (instType.equals("MARGIN") && (c53427wlL3 = this.sSMYrx) != null) {
                            c53427wlL3.setReduceVisible(true);
                            return;
                        }
                        return;
                    case -1956807563:
                        if (instType.equals("OPTION") && (c53427wlL4 = this.sSMYrx) != null) {
                            c53427wlL4.setReduceVisible(false);
                            return;
                        }
                        return;
                    case 2552066:
                        if (instType.equals("SPOT")) {
                            InterfaceC54581xNr interfaceC54581xNrCopydefault3 = C54589xNz.EZpvd.copydefault();
                            if (interfaceC54581xNrCopydefault3 == null || (newProxyInstance4 = interfaceC54581xNrCopydefault3.getNewProxyInstance()) == null || !newProxyInstance4.gEmmrt() || !Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "isolated")) {
                                C53427wlL c53427wlL5 = this.sSMYrx;
                                if (c53427wlL5 != null) {
                                    c53427wlL5.setReduceVisible(false);
                                    return;
                                }
                                return;
                            }
                            C53427wlL c53427wlL6 = this.sSMYrx;
                            if (c53427wlL6 != null) {
                                c53427wlL6.setReduceVisible(true);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2558355:
                        if (!instType.equals("SWAP")) {
                            return;
                        }
                        break;
                    case 214415088:
                        if (!instType.equals("FUTURES")) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrCopydefault4 = c54589xNz.copydefault();
                if (interfaceC54581xNrCopydefault4 != null && (newProxyInstance6 = interfaceC54581xNrCopydefault4.getNewProxyInstance()) != null) {
                    strAuCTelauCTel = newProxyInstance6.AuCTelauCTel();
                }
                if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode") || (interfaceC54581xNrCopydefault2 = c54589xNz.copydefault()) == null || (newProxyInstance5 = interfaceC54581xNrCopydefault2.getNewProxyInstance()) == null || !newProxyInstance5.isConnected()) {
                    C53427wlL c53427wlL7 = this.sSMYrx;
                    if (c53427wlL7 != null) {
                        c53427wlL7.setReduceVisible(false);
                        return;
                    }
                    return;
                }
                C53427wlL c53427wlL8 = this.sSMYrx;
                if (c53427wlL8 != null) {
                    c53427wlL8.setReduceVisible(true);
                    return;
                }
                return;
            }
            return;
        }
        BizInstrument bizInstrument2 = this.iRxXKY;
        java.lang.String instType2 = bizInstrument2 != null ? bizInstrument2.getInstType() : null;
        if (instType2 != null) {
            switch (instType2.hashCode()) {
                case -2027980370:
                    if (instType2.equals("MARGIN") && (c53427wlL = this.djSkpj) != null) {
                        c53427wlL.setReduceVisible(true);
                        return;
                    }
                    return;
                case -1956807563:
                    if (instType2.equals("OPTION") && (c53427wlL2 = this.djSkpj) != null) {
                        c53427wlL2.setReduceVisible(false);
                        return;
                    }
                    return;
                case 2552066:
                    if (instType2.equals("SPOT")) {
                        InterfaceC54581xNr interfaceC54581xNrCopydefault5 = C54589xNz.EZpvd.copydefault();
                        if (interfaceC54581xNrCopydefault5 == null || (newProxyInstance = interfaceC54581xNrCopydefault5.getNewProxyInstance()) == null || !newProxyInstance.gEmmrt() || !Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "isolated")) {
                            C53427wlL c53427wlL9 = this.djSkpj;
                            if (c53427wlL9 != null) {
                                c53427wlL9.setReduceVisible(false);
                                return;
                            }
                            return;
                        }
                        C53427wlL c53427wlL10 = this.djSkpj;
                        if (c53427wlL10 != null) {
                            c53427wlL10.setReduceVisible(true);
                            return;
                        }
                        return;
                    }
                    return;
                case 2558355:
                    if (!instType2.equals("SWAP")) {
                        return;
                    }
                    break;
                case 214415088:
                    if (!instType2.equals("FUTURES")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault6 = c54589xNz2.copydefault();
            if (interfaceC54581xNrCopydefault6 != null && (newProxyInstance3 = interfaceC54581xNrCopydefault6.getNewProxyInstance()) != null) {
                strAuCTelauCTel = newProxyInstance3.AuCTelauCTel();
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strAuCTelauCTel, (java.lang.Object) "net_mode") || (interfaceC54581xNrCopydefault = c54589xNz2.copydefault()) == null || (newProxyInstance2 = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null || !newProxyInstance2.isConnected()) {
                C53427wlL c53427wlL11 = this.djSkpj;
                if (c53427wlL11 != null) {
                    c53427wlL11.setReduceVisible(false);
                    return;
                }
                return;
            }
            C53427wlL c53427wlL12 = this.djSkpj;
            if (c53427wlL12 != null) {
                c53427wlL12.setReduceVisible(true);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.Boolean AEQbTJ(boolean z) {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        xOW newProxyInstance;
        xOW newProxyInstance2;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        xOW newProxyInstance3;
        xOW newProxyInstance4;
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (instType == null) {
                return null;
            }
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        return java.lang.Boolean.valueOf(this.AuCTelauCTel);
                    }
                    return null;
                case -1956807563:
                    instType.equals("OPTION");
                    return null;
                case 2552066:
                    if (instType.equals("SPOT") && (interfaceC54581xNrCopydefault2 = C54589xNz.EZpvd.copydefault()) != null && (newProxyInstance3 = interfaceC54581xNrCopydefault2.getNewProxyInstance()) != null && newProxyInstance3.gEmmrt() && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) "isolated")) {
                        return java.lang.Boolean.valueOf(this.AuCTelauCTel);
                    }
                    return null;
                case 2558355:
                    if (!instType.equals("SWAP")) {
                        return null;
                    }
                    break;
                case 214415088:
                    if (!instType.equals("FUTURES")) {
                        return null;
                    }
                    break;
                default:
                    return null;
            }
            InterfaceC54581xNr interfaceC54581xNrCopydefault3 = C54589xNz.EZpvd.copydefault();
            if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault3 == null || (newProxyInstance4 = interfaceC54581xNrCopydefault3.getNewProxyInstance()) == null) ? null : newProxyInstance4.AuCTelauCTel()), (java.lang.Object) "net_mode")) {
                return java.lang.Boolean.valueOf(this.AuCTelauCTel);
            }
            return null;
        }
        BizInstrument bizInstrument2 = this.iRxXKY;
        java.lang.String instType2 = bizInstrument2 != null ? bizInstrument2.getInstType() : null;
        if (instType2 == null) {
            return null;
        }
        switch (instType2.hashCode()) {
            case -2027980370:
                if (instType2.equals("MARGIN")) {
                    return java.lang.Boolean.valueOf(this.wlaJM);
                }
                return null;
            case -1956807563:
                instType2.equals("OPTION");
                return null;
            case 2552066:
                if (instType2.equals("SPOT") && (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) != null && (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) != null && newProxyInstance.gEmmrt() && Intrinsics.EZpvd((java.lang.Object) this.accept, (java.lang.Object) "isolated")) {
                    return java.lang.Boolean.valueOf(this.wlaJM);
                }
                return null;
            case 2558355:
                if (!instType2.equals("SWAP")) {
                    return null;
                }
                break;
            case 214415088:
                if (!instType2.equals("FUTURES")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault4 = C54589xNz.EZpvd.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrCopydefault4 == null || (newProxyInstance2 = interfaceC54581xNrCopydefault4.getNewProxyInstance()) == null) ? null : newProxyInstance2.AuCTelauCTel()), (java.lang.Object) "net_mode")) {
            return java.lang.Boolean.valueOf(this.wlaJM);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0196, code lost:
    
        if (r10.equals("SPOT") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01d3, code lost:
    
        if (r10.equals("MARGIN") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r17.DXXBbs, (java.lang.Object) "buy") == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01de, code lost:
    
        r1 = com.okinc.biz.TradeType.BUY_OPEN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01e1, code lost:
    
        r1 = com.okinc.biz.TradeType.SELL_CLOSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01e3, code lost:
    
        r2 = o.C49855uwS.copydefault;
        r3 = r17.iRxXKY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01e7, code lost:
    
        if (r3 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01e9, code lost:
    
        r3 = r3.getInstType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01ed, code lost:
    
        if (r3 != null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01ef, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01f0, code lost:
    
        r4 = r17.iRxXKY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01f2, code lost:
    
        if (r4 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01f4, code lost:
    
        r4 = r4.getInstId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01f8, code lost:
    
        if (r4 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01fa, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01fb, code lost:
    
        r5 = r17.giSNqX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01fd, code lost:
    
        if (r5 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01ff, code lost:
    
        r5 = r5.AEQbTJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0203, code lost:
    
        if (r5 != null) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0206, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0207, code lost:
    
        r1 = r2.KWHzl(r3, r4, r1, r7);
        r2 = o.C54589xNz.EZpvd.OLrzqt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0211, code lost:
    
        if (r2 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0213, code lost:
    
        r2 = r2.AhwBna(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0217, code lost:
    
        if (r2 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0219, code lost:
    
        r8 = r2.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x021d, code lost:
    
        r2 = o.C33129mqd.AhwBna(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (r10.equals("SPOT") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        if (r10.equals("MARGIN") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r17.fJNWhG, (java.lang.Object) "buy") == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d9, code lost:
    
        r1 = com.okinc.biz.TradeType.BUY_OPEN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00dc, code lost:
    
        r1 = com.okinc.biz.TradeType.SELL_CLOSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00de, code lost:
    
        r2 = o.C49855uwS.copydefault;
        r3 = r17.AkhnZx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e2, code lost:
    
        if (r3 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e4, code lost:
    
        r3 = r3.getInstType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e8, code lost:
    
        if (r3 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ea, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00eb, code lost:
    
        r4 = r17.AkhnZx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ed, code lost:
    
        if (r4 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00ef, code lost:
    
        r4 = r4.getInstId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f3, code lost:
    
        if (r4 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f5, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f6, code lost:
    
        r5 = r17.AhwBna;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f8, code lost:
    
        if (r5 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00fa, code lost:
    
        r5 = r5.AEQbTJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fe, code lost:
    
        if (r5 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0101, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0102, code lost:
    
        r1 = r2.KWHzl(r3, r4, r1, r7);
        r2 = o.C54589xNz.EZpvd.OLrzqt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x010c, code lost:
    
        if (r2 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010e, code lost:
    
        r2 = r2.AhwBna(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0112, code lost:
    
        if (r2 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0114, code lost:
    
        r8 = r2.getId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0118, code lost:
    
        r2 = o.C33129mqd.AhwBna(r8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(boolean z) {
        java.lang.String str;
        java.lang.String instId;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String id;
        java.lang.String instId2;
        java.lang.String instType;
        java.lang.String instId3;
        java.lang.String id2;
        java.lang.String instId4;
        java.lang.String instType2;
        str = "";
        java.lang.String id3 = null;
        int iAhwBna = -1;
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            java.lang.String instType3 = bizInstrument != null ? bizInstrument.getInstType() : null;
            if (instType3 != null) {
                switch (instType3.hashCode()) {
                    case -2027980370:
                        break;
                    case -1956807563:
                        if (instType3.equals("OPTION")) {
                            C49855uwS c49855uwS = C49855uwS.copydefault;
                            BizInstrument bizInstrument2 = this.AkhnZx;
                            if (bizInstrument2 == null || (instId3 = bizInstrument2.getInstId()) == null) {
                                instId3 = "";
                            }
                            java.lang.String strKWHzl = c49855uwS.OLrzqt("OPTION", instId3);
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt != null) {
                                TradeCoinInfo tradeCoinInfoAhwBna2 = interfaceC54581xNrOLrzqt.AhwBna(strKWHzl != null ? strKWHzl : "");
                                if (tradeCoinInfoAhwBna2 != null) {
                                    id3 = tradeCoinInfoAhwBna2.getId();
                                }
                            }
                            int iAhwBna2 = C33129mqd.AhwBna(id3);
                            id3 = strKWHzl;
                            iAhwBna = iAhwBna2;
                        }
                        break;
                    case 2552066:
                        break;
                    case 2558355:
                        if (instType3.equals("SWAP")) {
                            C54589xNz c54589xNz = C54589xNz.EZpvd;
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                            if (interfaceC54581xNrOLrzqt2 != null) {
                                BizInstrument bizInstrument3 = this.AkhnZx;
                                java.lang.String str2 = (bizInstrument3 == null || (instType2 = bizInstrument3.getInstType()) == null) ? "" : instType2;
                                BizInstrument bizInstrument4 = this.AkhnZx;
                                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2, (bizInstrument4 == null || (instId4 = bizInstrument4.getInstId()) == null) ? "" : instId4, null, null, 12, null);
                                if (suggestedInstrument$default != null) {
                                    id3 = suggestedInstrument$default.getMarginSymbol();
                                }
                            }
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
                            if (interfaceC54581xNrOLrzqt3 != null) {
                                TradeCoinInfo tradeCoinInfoAhwBna3 = interfaceC54581xNrOLrzqt3.AhwBna(id3 != null ? id3 : "");
                                if (tradeCoinInfoAhwBna3 != null && (id2 = tradeCoinInfoAhwBna3.getId()) != null) {
                                    iAhwBna = C33129mqd.AhwBna(id2);
                                }
                            }
                        }
                        break;
                    case 214415088:
                        if (instType3.equals("FUTURES")) {
                        }
                        break;
                }
            }
        } else {
            BizInstrument bizInstrument5 = this.iRxXKY;
            java.lang.String instType4 = bizInstrument5 != null ? bizInstrument5.getInstType() : null;
            if (instType4 != null) {
                switch (instType4.hashCode()) {
                    case -2027980370:
                        break;
                    case -1956807563:
                        if (instType4.equals("OPTION")) {
                            C49855uwS c49855uwS2 = C49855uwS.copydefault;
                            BizInstrument bizInstrument6 = this.iRxXKY;
                            if (bizInstrument6 == null || (instId = bizInstrument6.getInstId()) == null) {
                                instId = "";
                            }
                            java.lang.String strOLrzqt = c49855uwS2.OLrzqt("OPTION", instId);
                            str = strOLrzqt != null ? strOLrzqt : "";
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = C54589xNz.EZpvd.OLrzqt();
                            if (interfaceC54581xNrOLrzqt4 != null && (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt4.AhwBna(str)) != null) {
                                id3 = tradeCoinInfoAhwBna.getId();
                            }
                            iAhwBna = C33129mqd.AhwBna(id3);
                            id3 = str;
                        }
                        break;
                    case 2552066:
                        break;
                    case 2558355:
                        if (instType4.equals("SWAP")) {
                            C54589xNz c54589xNz2 = C54589xNz.EZpvd;
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz2.OLrzqt();
                            if (interfaceC54581xNrOLrzqt5 != null) {
                                BizInstrument bizInstrument7 = this.iRxXKY;
                                java.lang.String str3 = (bizInstrument7 == null || (instType = bizInstrument7.getInstType()) == null) ? "" : instType;
                                BizInstrument bizInstrument8 = this.iRxXKY;
                                BizInstrument suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt5, str3, (bizInstrument8 == null || (instId2 = bizInstrument8.getInstId()) == null) ? "" : instId2, null, null, 12, null);
                                if (suggestedInstrument$default2 != null) {
                                    id3 = suggestedInstrument$default2.getMarginSymbol();
                                }
                            }
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt6 = c54589xNz2.OLrzqt();
                            if (interfaceC54581xNrOLrzqt6 != null) {
                                TradeCoinInfo tradeCoinInfoAhwBna4 = interfaceC54581xNrOLrzqt6.AhwBna(id3 != null ? id3 : "");
                                if (tradeCoinInfoAhwBna4 != null && (id = tradeCoinInfoAhwBna4.getId()) != null) {
                                    iAhwBna = C33129mqd.AhwBna(id);
                                }
                            }
                        }
                        break;
                    case 214415088:
                        if (instType4.equals("FUTURES")) {
                        }
                        break;
                }
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(activity, new CurrencyModel(iAhwBna, java.lang.String.valueOf(id3)), false);
        }
    }

    public final boolean KWHzl() {
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            return c53427wlL.EZpvd();
        }
        return false;
    }

    public final boolean AEQbTJ() {
        C53427wlL c53427wlL = this.djSkpj;
        if (c53427wlL != null) {
            return c53427wlL.EZpvd();
        }
        return false;
    }

    public final void EZpvd() {
        copydefault();
        gEmmrt();
    }

    public final void copydefault() {
        C53427wlL c53427wlL;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvOLrzqt;
        C53427wlL c53427wlL2 = this.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null) {
            C47988uAv.setInputContent$default(c47988uAvOLrzqt, "", false, false, 6, null);
        }
        C53427wlL c53427wlL3 = this.sSMYrx;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL3 == null || (c47988uAvKWHzl2 = c53427wlL3.KWHzl()) == null) ? null : c47988uAvKWHzl2.AkhnZx())) || (c53427wlL = this.sSMYrx) == null || (c47988uAvKWHzl = c53427wlL.KWHzl()) == null) {
            return;
        }
        C47988uAv.setInputContent$default(c47988uAvKWHzl, "", false, false, 6, null);
    }

    public final void gEmmrt() {
        C53427wlL c53427wlL;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvOLrzqt;
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null && (c47988uAvOLrzqt = c53427wlL2.OLrzqt()) != null) {
            C47988uAv.setInputContent$default(c47988uAvOLrzqt, "", false, false, 6, null);
        }
        C53427wlL c53427wlL3 = this.djSkpj;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((c53427wlL3 == null || (c47988uAvKWHzl2 = c53427wlL3.KWHzl()) == null) ? null : c47988uAvKWHzl2.AkhnZx())) || (c53427wlL = this.djSkpj) == null || (c47988uAvKWHzl = c53427wlL.KWHzl()) == null) {
            return;
        }
        C47988uAv.setInputContent$default(c47988uAvKWHzl, "", false, false, 6, null);
    }

    public final java.lang.String DbNXlk() {
        xOW newProxyInstance;
        java.lang.String strAuCTelauCTel;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return (interfaceC54581xNrCopydefault == null || (newProxyInstance = interfaceC54581xNrCopydefault.getNewProxyInstance()) == null || (strAuCTelauCTel = newProxyInstance.AuCTelauCTel()) == null) ? "" : strAuCTelauCTel;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0060 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AhwBna(boolean z) {
        if (z) {
            BizInstrument bizInstrument = this.AkhnZx;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
                BizInstrument bizInstrument2 = this.AkhnZx;
                if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "MARGIN")) {
                }
            }
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            return c56059xvf.fetchVPNInfo() && c56059xvf.AkhnZx();
        }
        BizInstrument bizInstrument3 = this.iRxXKY;
        if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "SPOT")) {
            BizInstrument bizInstrument4 = this.iRxXKY;
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "MARGIN")) {
            }
        }
        C56059xvf c56059xvf2 = C56059xvf.EZpvd;
        if (!c56059xvf2.fetchVPNInfo() || !c56059xvf2.AkhnZx()) {
        }
    }

    private final void OcIXYQ() {
        vBK vbk;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl;
        vBK vbk2;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl2;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvOLrzqt3;
        C47988uAv c47988uAvOLrzqt4;
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.copydefault();
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.copydefault();
        }
        C53427wlL c53427wlL3 = this.sSMYrx;
        if (c53427wlL3 != null && (c47988uAvOLrzqt4 = c53427wlL3.OLrzqt()) != null) {
            c47988uAvOLrzqt4.KWHzl(this.AwvSrB);
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null && (c47988uAvOLrzqt3 = c53427wlL4.OLrzqt()) != null) {
            c47988uAvOLrzqt3.KWHzl(this.QVAiDq);
        }
        C53427wlL c53427wlL5 = this.sSMYrx;
        if (c53427wlL5 != null && (c47988uAvKWHzl2 = c53427wlL5.KWHzl()) != null) {
            c47988uAvKWHzl2.KWHzl(this.QKVWgx);
        }
        C53427wlL c53427wlL6 = this.djSkpj;
        if (c53427wlL6 != null && (c47988uAvKWHzl = c53427wlL6.KWHzl()) != null) {
            c47988uAvKWHzl.KWHzl(this.finit);
        }
        C53427wlL c53427wlL7 = this.sSMYrx;
        if (c53427wlL7 != null && (c47988uAvOLrzqt2 = c53427wlL7.OLrzqt()) != null) {
            c47988uAvOLrzqt2.copydefault(this.zuBGHE);
        }
        C53427wlL c53427wlL8 = this.djSkpj;
        if (c53427wlL8 != null && (c47988uAvOLrzqt = c53427wlL8.OLrzqt()) != null) {
            c47988uAvOLrzqt.copydefault(this.QUSxYX);
        }
        hDKMBd();
        fARcdN();
        AuCTel();
        Observer<EnableState> observer = this.dvKsVJ;
        if (observer != null) {
            AkhnZx().AYXKKw().observeForever(observer);
        }
        Observer<EnableState> observer2 = this.fZBcTu;
        if (observer2 != null) {
            AkhnZx().djBIcL().observeForever(observer2);
        }
        Observer<java.lang.String> observer3 = this.gHZMYf;
        if (observer3 != null) {
            AkhnZx().EZpvd().observeForever(observer3);
        }
        Observer<java.lang.String> observer4 = this.QfsBiF;
        if (observer4 != null) {
            AkhnZx().AEQbTJ().observeForever(observer4);
        }
        Observer<java.lang.String> observer5 = this.QbewEr;
        if (observer5 != null) {
            AkhnZx().KWHzl().observeForever(observer5);
        }
        Observer<java.lang.String> observer6 = this.fFgQHt;
        if (observer6 != null) {
            AkhnZx().gEmmrt().observeForever(observer6);
        }
        Observer<TradeBalanceData> observer7 = this.AxsJAY;
        if (observer7 != null && (vbk2 = this.ORxRYg) != null && (tradeLiveDataKWHzl2 = vbk2.KWHzl()) != null) {
            tradeLiveDataKWHzl2.observeForever(observer7);
        }
        Observer<TradeBalanceData> observer8 = this.RJOkX;
        if (observer8 != null && (vbk = this.aKErDB) != null && (tradeLiveDataKWHzl = vbk.KWHzl()) != null) {
            tradeLiveDataKWHzl.observeForever(observer8);
        }
        Observer<java.lang.Boolean> observer9 = this.QOLQEE;
        if (observer9 != null) {
            isConnected().gEmmrt().observeForever(observer9);
        }
        Observer<java.lang.Boolean> observer10 = this.RcXXUw;
        if (observer10 != null) {
            isConnected().DbNXlk().observeForever(observer10);
        }
        Observer<xMJ.TaskDescription> observer11 = this.DTwDnp;
        if (observer11 != null) {
            AkhnZx().OLrzqt().observeForever(observer11);
        }
        Observer<xMJ.TaskDescription> observer12 = this.dNCPSb;
        if (observer12 != null) {
            AkhnZx().copydefault().observeForever(observer12);
        }
        isConnected(true);
        isConnected(false);
        fetchVPNInfo(true);
        fetchVPNInfo(false);
        Observer<BizInstrument> observer13 = this.values;
        if (observer13 != null) {
            isConnected().AEQbTJ().observeForever(observer13);
        }
        Observer<BizInstrument> observer14 = this.gkJEwt;
        if (observer14 != null) {
            isConnected().values().observeForever(observer14);
        }
        Observer<ArbitragePriceSetting> observer15 = this.OuxcSI;
        if (observer15 != null) {
            isConnected().AuCTel().observeForever(observer15);
        }
        Observer<TickersData> observer16 = this.getNewProxyInstance;
        if (observer16 != null) {
            isConnected().AhwBna().observeForever(observer16);
        }
        Observer<TickersData> observer17 = this.OqFWZa;
        if (observer17 != null) {
            isConnected().ejfBZ().observeForever(observer17);
        }
        Observer<java.lang.String> observer18 = this.DbNXlk;
        if (observer18 != null) {
            isConnected().AYXKKw().observeForever(observer18);
        }
        Observer<java.lang.String> observer19 = this.RlQdEF;
        if (observer19 != null) {
            isConnected().isConnected().observeForever(observer19);
        }
        Observer<kotlin.Pair<java.lang.String, java.lang.String>> observer20 = this.hDKMBd;
        if (observer20 != null) {
            isConnected().valueOf().observeForever(observer20);
        }
        Observer<kotlin.Pair<java.lang.String, java.lang.String>> observer21 = this.ODWQjV;
        if (observer21 != null) {
            isConnected().AkhnZx().observeForever(observer21);
        }
        Observer<java.lang.String> observer22 = this.fetchVPNInfo;
        if (observer22 != null) {
            isConnected().djBIcL().observeForever(observer22);
        }
        Observer<java.lang.String> observer23 = this.QKudOq;
        if (observer23 != null) {
            isConnected().fetchVPNInfo().observeForever(observer23);
        }
        Observer<? super java.lang.Object> observer24 = this.ffGIBT;
        if (observer24 != null) {
            AYXKKw().AYXKKw().observeForever(observer24);
        }
        Observer<java.lang.Boolean> observer25 = this.OLrzqt;
        if (observer25 != null) {
            isConnected().KWHzl().observeForever(observer25);
        }
        Observer<java.lang.Boolean> observer26 = this.zsXlph;
        if (observer26 != null) {
            AYXKKw().KWHzl().observeForever(observer26);
        }
        Observer<SettingType> observer27 = this.dxcTrN;
        if (observer27 != null) {
            AYXKKw().djBIcL().observeForever(observer27);
        }
    }

    public final void getNewProxyInstance() {
        vBK vbk;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl;
        vBK vbk2;
        TradeLiveData<TradeBalanceData> tradeLiveDataKWHzl2;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvOLrzqt2;
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvOLrzqt3;
        C47988uAv c47988uAvOLrzqt4;
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.valueOf();
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.valueOf();
        }
        vBK vbk3 = this.ORxRYg;
        if (vbk3 != null) {
            vbk3.copydefault();
        }
        vBK vbk4 = this.aKErDB;
        if (vbk4 != null) {
            vbk4.copydefault();
        }
        C53427wlL c53427wlL3 = this.sSMYrx;
        if (c53427wlL3 != null && (c47988uAvOLrzqt4 = c53427wlL3.OLrzqt()) != null) {
            c47988uAvOLrzqt4.OLrzqt(this.AwvSrB);
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null && (c47988uAvOLrzqt3 = c53427wlL4.OLrzqt()) != null) {
            c47988uAvOLrzqt3.OLrzqt(this.QVAiDq);
        }
        C53427wlL c53427wlL5 = this.sSMYrx;
        if (c53427wlL5 != null && (c47988uAvKWHzl2 = c53427wlL5.KWHzl()) != null) {
            c47988uAvKWHzl2.OLrzqt(this.QKVWgx);
        }
        C53427wlL c53427wlL6 = this.djSkpj;
        if (c53427wlL6 != null && (c47988uAvKWHzl = c53427wlL6.KWHzl()) != null) {
            c47988uAvKWHzl.OLrzqt(this.finit);
        }
        C53427wlL c53427wlL7 = this.sSMYrx;
        if (c53427wlL7 != null && (c47988uAvOLrzqt2 = c53427wlL7.OLrzqt()) != null) {
            c47988uAvOLrzqt2.AEQbTJ(this.zuBGHE);
        }
        C53427wlL c53427wlL8 = this.djSkpj;
        if (c53427wlL8 != null && (c47988uAvOLrzqt = c53427wlL8.OLrzqt()) != null) {
            c47988uAvOLrzqt.AEQbTJ(this.QUSxYX);
        }
        Observer<EnableState> observer = this.dvKsVJ;
        if (observer != null) {
            AkhnZx().AYXKKw().removeObserver(observer);
        }
        Observer<EnableState> observer2 = this.fZBcTu;
        if (observer2 != null) {
            AkhnZx().djBIcL().removeObserver(observer2);
        }
        Observer<java.lang.String> observer3 = this.gHZMYf;
        if (observer3 != null) {
            AkhnZx().EZpvd().removeObserver(observer3);
        }
        Observer<java.lang.String> observer4 = this.QfsBiF;
        if (observer4 != null) {
            AkhnZx().AEQbTJ().removeObserver(observer4);
        }
        Observer<java.lang.String> observer5 = this.QbewEr;
        if (observer5 != null) {
            AkhnZx().KWHzl().removeObserver(observer5);
        }
        Observer<java.lang.String> observer6 = this.fFgQHt;
        if (observer6 != null) {
            AkhnZx().gEmmrt().removeObserver(observer6);
        }
        Observer<TradeBalanceData> observer7 = this.AxsJAY;
        if (observer7 != null && (vbk2 = this.ORxRYg) != null && (tradeLiveDataKWHzl2 = vbk2.KWHzl()) != null) {
            tradeLiveDataKWHzl2.removeObserver(observer7);
        }
        Observer<TradeBalanceData> observer8 = this.RJOkX;
        if (observer8 != null && (vbk = this.aKErDB) != null && (tradeLiveDataKWHzl = vbk.KWHzl()) != null) {
            tradeLiveDataKWHzl.removeObserver(observer8);
        }
        Observer<java.lang.Boolean> observer9 = this.QOLQEE;
        if (observer9 != null) {
            isConnected().gEmmrt().removeObserver(observer9);
        }
        Observer<java.lang.Boolean> observer10 = this.RcXXUw;
        if (observer10 != null) {
            isConnected().DbNXlk().removeObserver(observer10);
        }
        Observer<xMJ.TaskDescription> observer11 = this.DTwDnp;
        if (observer11 != null) {
            AkhnZx().OLrzqt().removeObserver(observer11);
        }
        Observer<xMJ.TaskDescription> observer12 = this.dNCPSb;
        if (observer12 != null) {
            AkhnZx().copydefault().removeObserver(observer12);
        }
        Observer<BizInstrument> observer13 = this.values;
        if (observer13 != null) {
            isConnected().AEQbTJ().removeObserver(observer13);
        }
        Observer<BizInstrument> observer14 = this.gkJEwt;
        if (observer14 != null) {
            isConnected().values().removeObserver(observer14);
        }
        Observer<ArbitragePriceSetting> observer15 = this.OuxcSI;
        if (observer15 != null) {
            isConnected().AuCTel().removeObserver(observer15);
        }
        Observer<TickersData> observer16 = this.getNewProxyInstance;
        if (observer16 != null) {
            isConnected().AhwBna().removeObserver(observer16);
        }
        Observer<TickersData> observer17 = this.OqFWZa;
        if (observer17 != null) {
            isConnected().ejfBZ().removeObserver(observer17);
        }
        Observer<java.lang.String> observer18 = this.DbNXlk;
        if (observer18 != null) {
            isConnected().AYXKKw().removeObserver(observer18);
        }
        Observer<java.lang.String> observer19 = this.RlQdEF;
        if (observer19 != null) {
            isConnected().isConnected().removeObserver(observer19);
        }
        Observer<kotlin.Pair<java.lang.String, java.lang.String>> observer20 = this.hDKMBd;
        if (observer20 != null) {
            isConnected().valueOf().removeObserver(observer20);
        }
        Observer<kotlin.Pair<java.lang.String, java.lang.String>> observer21 = this.ODWQjV;
        if (observer21 != null) {
            isConnected().AkhnZx().removeObserver(observer21);
        }
        Observer<java.lang.String> observer22 = this.fetchVPNInfo;
        if (observer22 != null) {
            isConnected().djBIcL().removeObserver(observer22);
        }
        Observer<java.lang.String> observer23 = this.QKudOq;
        if (observer23 != null) {
            isConnected().fetchVPNInfo().removeObserver(observer23);
        }
        Observer<? super java.lang.Object> observer24 = this.ffGIBT;
        if (observer24 != null) {
            AYXKKw().AYXKKw().removeObserver(observer24);
        }
        Observer<java.lang.Boolean> observer25 = this.OLrzqt;
        if (observer25 != null) {
            isConnected().KWHzl().removeObserver(observer25);
        }
        Observer<java.lang.Boolean> observer26 = this.zsXlph;
        if (observer26 != null) {
            AYXKKw().KWHzl().removeObserver(observer26);
        }
        Observer<SettingType> observer27 = this.dxcTrN;
        if (observer27 != null) {
            AYXKKw().djBIcL().removeObserver(observer27);
        }
        this.dvKsVJ = null;
        this.fZBcTu = null;
        this.gHZMYf = null;
        this.QfsBiF = null;
        this.QbewEr = null;
        this.fFgQHt = null;
        this.AxsJAY = null;
        this.RJOkX = null;
        this.QOLQEE = null;
        this.RcXXUw = null;
        this.DTwDnp = null;
        this.dNCPSb = null;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        OcIXYQ();
        if (C56036xvI.KWHzl.KWHzl()) {
            TradeLiveData<SourceResp<C55879xsK>> tradeLiveData = new TradeLiveData<>();
            tradeLiveData.observe(this, new LoaderManager(new Function1() { // from class: o.vAY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50062vAm.copydefault(this.AEQbTJ, (SourceResp) obj);
                }
            }));
            C55886xsR.OLrzqt.KWHzl(tradeLiveData, false);
        } else {
            isConnected().fARcdN();
        }
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null) {
            c53427wlL.setBalanceVisible(C55697xoo.OLrzqt.isConnected());
        }
        C53427wlL c53427wlL2 = this.djSkpj;
        if (c53427wlL2 != null) {
            c53427wlL2.setBalanceVisible(C55697xoo.OLrzqt.isConnected());
        }
        C53497wmc c53497wmc = this.gGvvIC;
        if (c53497wmc != null) {
            c53497wmc.setLeftAndRightVisible(C55697xoo.OLrzqt.isConnected());
        }
        fetchVPNInfo();
        QKVWgx().EZpvd();
    }

    public static final Unit copydefault(C50062vAm c50062vAm, SourceResp sourceResp) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList<FundingRateArbitrageData> arrayListKWHzl;
        java.util.ArrayList<FundingRateArbitrageData> arrayListKWHzl2;
        Intrinsics.checkNotNullParameter(sourceResp, "");
        C55879xsK c55879xsK = (C55879xsK) sourceResp.getData();
        FundingRateArbitrageData fundingRateArbitrageData = null;
        if (c55879xsK == null || (arrayListKWHzl2 = c55879xsK.KWHzl()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListKWHzl2) {
                FundingRateArbitrageData fundingRateArbitrageData2 = (FundingRateArbitrageData) obj;
                if (Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData2.getState(), (java.lang.Object) "live") && Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData2.getCtType(), (java.lang.Object) "linear") && Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData2.getCcy(), (java.lang.Object) "BTC")) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            fundingRateArbitrageData = (FundingRateArbitrageData) arrayList.get(0);
            C56036xvI c56036xvI = C56036xvI.KWHzl;
            java.lang.String sellInstType = fundingRateArbitrageData.getSellInstType();
            if (sellInstType == null) {
                sellInstType = "";
            }
            c56036xvI.copydefault(sellInstType, fundingRateArbitrageData.getSellInstId());
            java.lang.String buyInstType = fundingRateArbitrageData.getBuyInstType();
            if (buyInstType == null) {
                buyInstType = "";
            }
            c56036xvI.KWHzl(buyInstType, fundingRateArbitrageData.getBuyInstId());
        } else {
            C55879xsK c55879xsK2 = (C55879xsK) sourceResp.getData();
            if (c55879xsK2 == null || (arrayListKWHzl = c55879xsK2.KWHzl()) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayListKWHzl) {
                    FundingRateArbitrageData fundingRateArbitrageData3 = (FundingRateArbitrageData) obj2;
                    if (Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData3.getState(), (java.lang.Object) "live") && Intrinsics.EZpvd((java.lang.Object) fundingRateArbitrageData3.getCtType(), (java.lang.Object) "linear")) {
                        arrayList2.add(obj2);
                    }
                }
            }
            if (arrayList2 != null && arrayList2.size() > 0 && arrayList2 != null) {
                fundingRateArbitrageData = (FundingRateArbitrageData) arrayList2.get(0);
            }
        }
        if (fundingRateArbitrageData != null) {
            C56036xvI c56036xvI2 = C56036xvI.KWHzl;
            java.lang.String sellInstType2 = fundingRateArbitrageData.getSellInstType();
            if (sellInstType2 == null) {
                sellInstType2 = "";
            }
            c56036xvI2.copydefault(sellInstType2, fundingRateArbitrageData.getSellInstId());
            java.lang.String buyInstType2 = fundingRateArbitrageData.getBuyInstType();
            c56036xvI2.KWHzl(buyInstType2 != null ? buyInstType2 : "", fundingRateArbitrageData.getBuyInstId());
        }
        C56036xvI.KWHzl.EZpvd();
        c50062vAm.isConnected().fARcdN();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fetchVPNInfo() {
        boolean z;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            z = interfaceC54581xNrOLrzqt2.sSMYrx() && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.zuBGHE();
        }
        C53497wmc c53497wmc = this.gGvvIC;
        if (c53497wmc != null) {
            c53497wmc.setVisibility(z ^ true ? 0 : 8);
        }
        C52794wYp c52794wYp = this.zuWLRA;
        if (c52794wYp != null) {
            c52794wYp.setVisibility(z ? 0 : 8);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        isConnected().fIwbmz();
        AkhnZx().valueOf();
        EZpvd();
        getNewProxyInstance();
        QKVWgx().copydefault();
    }

    private final java.util.Map<C47988uAv, java.lang.String> ORxRYg() {
        C47988uAv c47988uAvKWHzl;
        C47988uAv c47988uAvOLrzqt;
        C47988uAv c47988uAvKWHzl2;
        C47988uAv c47988uAvOLrzqt2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C53427wlL c53427wlL = this.sSMYrx;
        if (c53427wlL != null && (c47988uAvOLrzqt2 = c53427wlL.OLrzqt()) != null) {
        }
        C53427wlL c53427wlL2 = this.sSMYrx;
        if (c53427wlL2 != null && (c47988uAvKWHzl2 = c53427wlL2.KWHzl()) != null) {
        }
        C53427wlL c53427wlL3 = this.djSkpj;
        if (c53427wlL3 != null && (c47988uAvOLrzqt = c53427wlL3.OLrzqt()) != null) {
        }
        C53427wlL c53427wlL4 = this.djSkpj;
        if (c53427wlL4 != null && (c47988uAvKWHzl = c53427wlL4.KWHzl()) != null) {
        }
        return linkedHashMap;
    }

    private final C53519wmy QKVWgx() {
        return (C53519wmy) this.copydefault.getValue();
    }

    public static final C53519wmy zLjUOn(C50062vAm c50062vAm) {
        return new C53519wmy(c50062vAm.ORxRYg());
    }
}
