package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.Observable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
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
import com.okinc.biz.TradeType;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$initListener$7$4;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartPortfolioPresenter;
import com.okinc.tradingbot.impl.order.strategy.smartportfolio.presenter.SmartRecommendPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.PortfolioData;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.MaxCapital;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.data.SmartInvestDetail;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C50404vNd;
import o.C50576vTn;
import o.C52761wXj;
import o.C53118wfU;
import o.C53125wfb;
import o.C53179wgc;
import o.C53565wnr;
import o.C55688xof;
import o.InterfaceC53520wmz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53125wfb extends AbstractC48165uHj<uQL, SmartPortfolioPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final AssistContent AhwBna;
    public final Function2<C47988uAv, java.lang.String, Unit> KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;
    public final int djBIcL = C48033uCm.Activity.gUEfcq;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wfD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53125wfb.values(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.wfb$FragmentManager */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uQL AYXKKw(C53125wfb c53125wfb) {
        return (uQL) c53125wfb.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SmartPortfolioPresenter gEmmrt(C53125wfb c53125wfb) {
        return (SmartPortfolioPresenter) c53125wfb.dxcTrN();
    }

    public C53125wfb() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$7
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartRecommendPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AutoEarnPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$14
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartportfolio.SmartPortfolioFragment$special$$inlined$viewModels$default$15
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.KWHzl = new Function2() { // from class: o.wfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53125wfb.AEQbTJ(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C53125wfb.AEQbTJ());
            }
        });
        this.AhwBna = new AssistContent();
    }

    public static final C53518wmx values(C53125wfb c53125wfb) {
        android.content.Context contextRequireContext = c53125wfb.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx zsXlph() {
        return (C53518wmx) this.EZpvd.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return zsXlph();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SmartPortfolioFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX INFO: renamed from: o.wfb$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wfb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final C55915xsu wlaJM() {
        return (C55915xsu) this.AEQbTJ.getValue();
    }

    public final SmartRecommendPresenter values() {
        return (SmartRecommendPresenter) this.AYXKKw.getValue();
    }

    public final AutoEarnPresenter isConnected() {
        return (AutoEarnPresenter) this.copydefault.getValue();
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (str.length() > 0) {
            return str;
        }
        return null;
    }

    public final java.lang.Integer OLrzqt(int i) {
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() > 0) {
            return numValueOf;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C53125wfb c53125wfb, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (((uQL) c53125wfb.gGvvIC()).EZpvd.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(((uQL) c53125wfb.gGvvIC()).EZpvd, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean AuCTel() {
        return ((java.lang.Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean AEQbTJ() {
        return C48291uMa.Companion.AEQbTJ().valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.copydefault(view);
        ((uQL) gGvvIC()).EZpvd(wlaJM());
        fIwbmz();
        zLjUOn();
        AuCTelauCTel();
        KWHzl(false);
        copydefault();
        AxsJAY();
        zuBGHE();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww
    public void bt_() {
        SmartPortfolioPresenter smartPortfolioPresenter = (SmartPortfolioPresenter) dxcTrN();
        android.os.Bundle arguments = getArguments();
        SmartPortfolioReq smartPortfolioReq = arguments != null ? (SmartPortfolioReq) arguments.getParcelable("bot_copy_req") : null;
        smartPortfolioPresenter.copydefault(smartPortfolioReq instanceof SmartPortfolioReq ? smartPortfolioReq : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        iwGUEr();
        copydefault(this.AhwBna);
        wlaJM().EZpvd("smart_portfolio", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ((SmartPortfolioPresenter) dxcTrN()).fvQaOB(), (64 & 128) == 0 ? null : null);
        zsXlph().OLrzqt();
        ((uQL) gGvvIC()).EZpvd.copydefault(new PendingIntent());
        C47988uAv c47988uAv = ((uQL) gGvvIC()).EZpvd;
        java.util.ArrayList<uBH> arrayListFIwbmz = c47988uAv.fIwbmz();
        if (arrayListFIwbmz == null || arrayListFIwbmz.isEmpty()) {
            c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.wfE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C53125wfb.AkhnZx(this.KWHzl);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: o.wfb$PendingIntent */
    public static final class PendingIntent extends uBF {
        @Override // o.uBH, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C56028xvA.OLrzqt("coinAmount", C56423yEv.EZpvd(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, java.lang.String.valueOf(charSequence))));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AkhnZx(C53125wfb c53125wfb) {
        ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).copydefault(((uQL) c53125wfb.gGvvIC()).EZpvd.AkhnZx());
        if (checkTotalAmtIsValid$default(c53125wfb, false, 1, null) && ((uQL) c53125wfb.gGvvIC()).fIwbmz.isSelected()) {
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).zLjUOn();
        }
        c53125wfb.gHZMYf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wfb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53125wfb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53125wfb c53125wfb) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c53125wfb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.EZpvd;
                if (textView.isEnabled()) {
                    C53118wfU.TaskDescription taskDescription = C53118wfU.Companion;
                    SmartInvestDetail value = C53125wfb.gEmmrt(this.copydefault).AuCTel().getValue();
                    android.content.Context context = textView.getContext();
                    Intrinsics.copydefault(context, "");
                    androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    taskDescription.EZpvd(value, supportFragmentManager);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wfb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C53125wfb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53125wfb c53125wfb) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c53125wfb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOW newProxyInstance;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (!this.copydefault.AYXKKw()) {
                    try {
                        C49967uyY c49967uyY = C49967uyY.EZpvd;
                        C47988uAv c47988uAv = C53125wfb.AYXKKw(this.copydefault).EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, yDY.gEmmrt(C53125wfb.AYXKKw(this.copydefault).KWHzl.AEQbTJ(), C53125wfb.AYXKKw(this.copydefault).EZpvd));
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                android.widget.TextView textView = C53125wfb.AYXKKw(this.copydefault).djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() == 0) {
                    C56002xub.KWHzl.OLrzqt();
                    return;
                }
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                java.lang.String str = c54589xNz.EZpvd() ? "demo" : "live";
                C32866mlf.onEvent$default("app_trade_strategy_confirm_create_click", (TrackChannel[]) null, new LoaderManager(str), 1, (java.lang.Object) null);
                C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Fragment(str), 1, (java.lang.Object) null);
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.copydefault), null, null, new SmartPortfolioFragment$initListener$7$4(this.copydefault, null), 3, null);
                    C50576vTn.Activity activity = C50576vTn.Companion;
                    boolean zIsSelected = C53125wfb.AYXKKw(this.copydefault).fIwbmz.isSelected();
                    java.lang.String strFARcdN = C53125wfb.gEmmrt(this.copydefault).fARcdN();
                    java.lang.String strKWHzl = C53125wfb.gEmmrt(this.copydefault).KWHzl();
                    java.lang.String newProxyInstance2 = C53125wfb.gEmmrt(this.copydefault).getNewProxyInstance();
                    java.util.ArrayList<SelectCoinData> arrayListFJNWhG = C53125wfb.gEmmrt(this.copydefault).fJNWhG();
                    AutoEarnStakingQueryConfig value = this.copydefault.isConnected().copydefault().getValue();
                    if (value == null) {
                        value = new AutoEarnStakingQueryConfig((java.util.List) null, (java.util.List) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
                    }
                    activity.KWHzl(zIsSelected, strFARcdN, strKWHzl, newProxyInstance2, arrayListFJNWhG, value).show(this.copydefault.getChildFragmentManager(), C50576vTn.class.getSimpleName());
                    return;
                }
                pUU.KWHzl("BotOrder", "二次确认关闭 SmartPortfolioFragment Start Order");
                C53125wfb.gEmmrt(this.copydefault).KWHzl(C53125wfb.AYXKKw(this.copydefault).fIwbmz.isSelected());
            }
        }
    }

    /* JADX INFO: renamed from: o.wfb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C53125wfb AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53125wfb c53125wfb) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c53125wfb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C53179wgc.ActionBar actionBar = C53179wgc.Companion;
                java.lang.String strGEmmrt = C53125wfb.gEmmrt(this.AEQbTJ).fvQaOB().gEmmrt();
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                actionBar.KWHzl(strGEmmrt, childFragmentManager);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        wlaJM().AYXKKw();
        ((uQL) gGvvIC()).EZpvd.EZpvd();
        KWHzl(this.AhwBna);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        iwGUEr();
        AwvSrB();
        getNewProxyInstance();
        fARcdN();
        hDKMBd();
        djBIcL();
        if (isReenter()) {
            return;
        }
        C55867xrz.KWHzl.OLrzqt("smart_portfolio", CollectionsKt___CollectionsKt.joinToString$default(((uQL) gGvvIC()).copydefault.EZpvd(), ",", null, null, 0, null, new Function1() { // from class: o.wfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault((SelectCoinData) obj);
            }
        }, 30, null));
    }

    public static final java.lang.CharSequence copydefault(SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        java.lang.String instId = selectCoinData.getInstId();
        return instId == null ? "" : instId;
    }

    /* JADX INFO: renamed from: o.wfb$AssistContent */
    public static final class AssistContent extends Observable.OnPropertyChangedCallback {
        public AssistContent() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C53125wfb c53125wfb = C53125wfb.this;
            c53125wfb.EZpvd(c53125wfb.AubY());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBP ubpCopydefault = ((uQL) gGvvIC()).OLrzqt.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.EZpvd(onPropertyChangedCallback);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBP ubpCopydefault = ((uQL) gGvvIC()).OLrzqt.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.copydefault(onPropertyChangedCallback);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        BizInstrument bizInstrumentAhwBna = ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().AhwBna();
        if (bizInstrumentAhwBna != null) {
            java.lang.String strAkhnZx = ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().AkhnZx();
            ((uQL) gGvvIC()).OLrzqt.setFm(getChildFragmentManager());
            ((uQL) gGvvIC()).OLrzqt.copydefault(this, bizInstrumentAhwBna, TradeType.BUY_OPEN, false);
            uBL ubl = ((uQL) gGvvIC()).OLrzqt;
            int i = C55688xof.Application.getLegacyAudioStream;
            java.lang.String strAYXKKw = ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            ubl.setReminderText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("investCcy", strAYXKKw))));
            ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().gEmmrt(AubY());
            uBL ubl2 = ((uQL) gGvvIC()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(ubl2, "");
            ubl2.setVisibility(bizInstrumentAhwBna.isDisplayTradeReceive() ? 0 : 8);
            if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) AubY())) {
                return;
            }
            EZpvd(AubY());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().gEmmrt(str);
        ejfBZ();
        sSMYrx();
        getNewProxyInstance();
        fARcdN();
        valueOf();
        if (((uQL) gGvvIC()).fIwbmz.isSelected()) {
            ((SmartPortfolioPresenter) dxcTrN()).zLjUOn();
            ((SmartPortfolioPresenter) dxcTrN()).zsXlph();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        if (((uQL) gGvvIC()).EZpvd.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(((uQL) gGvvIC()).EZpvd, false, 1, null);
            ((uQL) gGvvIC()).EZpvd.setInputCover(null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        wlaJM().AYXKKw();
        wlaJM().EZpvd("smart_portfolio", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ((SmartPortfolioPresenter) dxcTrN()).fvQaOB(), (64 & 128) == 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AubY() {
        return ((uQL) gGvvIC()).OLrzqt.OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        ((uQL) gGvvIC()).AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.wfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53125wfb.copydefault(this.KWHzl, view);
            }
        });
        ((uQL) gGvvIC()).copydefault.setCallback(new StateListAnimator());
        final C53487wmS c53487wmS = ((uQL) gGvvIC()).copydefault;
        c53487wmS.valueOf().setOnClickListener(new View.OnClickListener() { // from class: o.wfg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53125wfb.EZpvd(c53487wmS, this, view);
            }
        });
        c53487wmS.OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.wfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53125wfb.AEQbTJ(c53487wmS, view);
            }
        });
        ((uQL) gGvvIC()).KWHzl.OLrzqt(new Dialog());
        final C47988uAv c47988uAv = ((uQL) gGvvIC()).EZpvd;
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.AEQbTJ, c47988uAv, ((java.lang.Float) obj).floatValue());
            }
        });
        ((uQL) gGvvIC()).EZpvd.KWHzl(new uBH(new Function0() { // from class: o.wfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53125wfb.DbNXlk(this.KWHzl);
            }
        }));
        C53518wmx c53518wmxZsXlph = zsXlph();
        c53518wmxZsXlph.setOnClickListener(new Activity(c53518wmxZsXlph, 1000L, this));
        C53534wnM c53534wnM = ((uQL) gGvvIC()).AkhnZx;
        c53534wnM.setOnClickListener(new TaskDescription(c53534wnM, 1000L, this));
        ((uQL) gGvvIC()).fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.wfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53125wfb.OLrzqt(this.KWHzl, view);
            }
        });
        ((uQL) gGvvIC()).fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.wfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53125wfb.djBIcL(this.AEQbTJ, view);
            }
        });
        android.widget.TextView textView = ((uQL) gGvvIC()).gEmmrt;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(final C53125wfb c53125wfb, android.view.View view) {
        java.lang.String string;
        C50404vNd.Application application = C50404vNd.Companion;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.value);
        java.lang.CharSequence text = ((uQL) c53125wfb.gGvvIC()).AYXKKw.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        application.AEQbTJ(strAYXKKw, string, (52 & 4) != 0 ? 40 : ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).DbNXlk(), false, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, new Function2() { // from class: o.wfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53125wfb.EZpvd(this.copydefault, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }).show(c53125wfb.getChildFragmentManager(), "BottomEditStrategyNameDialog");
        C56028xvA.botClickTrack$default("coinName", null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C53125wfb c53125wfb, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AhwBna(true);
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AhwBna(str);
            ((uQL) c53125wfb.gGvvIC()).AYXKKw.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wfb$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC53559wnl {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC53559wnl
        public void copydefault(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C53565wnr.Activity activity = C53565wnr.Companion;
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.FontRes);
            java.util.ArrayList<SelectCoinData> arrayListAEQbTJ = C53125wfb.gEmmrt(C53125wfb.this).AEQbTJ();
            final C53125wfb c53125wfb = C53125wfb.this;
            activity.EZpvd(2, 10, strAYXKKw, arrayListAEQbTJ, arrayList, new Function1() { // from class: o.wfK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53125wfb.StateListAnimator.AEQbTJ(c53125wfb, (java.util.ArrayList) obj);
                }
            }).show(C53125wfb.this.getChildFragmentManager(), "SelectCoinFragment");
            C56028xvA.botClickTrack$default("coinConfigView-addCoin", null, 2, null);
        }

        public static final Unit AEQbTJ(C53125wfb c53125wfb, java.util.ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C53487wmS c53487wmS = C53125wfb.AYXKKw(c53125wfb).copydefault;
            if (c53487wmS.valueOf().isSelected()) {
                c53487wmS.KWHzl(arrayList);
                c53487wmS.gEmmrt();
                c53487wmS.isConnected();
                C53125wfb.gEmmrt(c53125wfb).wlaJM();
            } else {
                c53487wmS.setSelectCoins(arrayList);
            }
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC53559wnl
        public void OLrzqt(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            C53125wfb.gEmmrt(C53125wfb.this).fJNWhG().clear();
            if (!arrayList.isEmpty()) {
                C53125wfb.gEmmrt(C53125wfb.this).fJNWhG().addAll(arrayList);
            }
            C53125wfb.this.getFieldNames();
            if (C53125wfb.AYXKKw(C53125wfb.this).fIwbmz.isSelected()) {
                C53125wfb.gEmmrt(C53125wfb.this).zLjUOn();
                C53125wfb.gEmmrt(C53125wfb.this).zsXlph();
            }
            C53125wfb.gEmmrt(C53125wfb.this).AuCTelauCTel();
        }

        @Override // o.InterfaceC53559wnl
        public void OLrzqt(boolean z, boolean z2) {
            C53487wmS c53487wmS = C53125wfb.AYXKKw(C53125wfb.this).copydefault;
            C53125wfb c53125wfb = C53125wfb.this;
            if (z) {
                c53487wmS.gEmmrt();
                c53487wmS.isConnected();
                C53125wfb.gEmmrt(c53125wfb).wlaJM();
            }
            if (z2) {
                c53487wmS.AEQbTJ(true);
            }
            C53125wfb.gEmmrt(C53125wfb.this).AuCTelauCTel();
            C56028xvA.botClickTrack$default("coinConfigView-deleteCoin", null, 2, null);
        }

        @Override // o.InterfaceC53559wnl
        public void AEQbTJ(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            if (C53125wfb.AYXKKw(C53125wfb.this).fIwbmz.isSelected()) {
                C53125wfb.gEmmrt(C53125wfb.this).zLjUOn();
                C53125wfb.gEmmrt(C53125wfb.this).zsXlph();
            }
            C53125wfb.AYXKKw(C53125wfb.this).copydefault.gEmmrt();
            C53125wfb.AYXKKw(C53125wfb.this).copydefault.AEQbTJ(false);
            C53125wfb.gEmmrt(C53125wfb.this).AuCTelauCTel();
        }

        @Override // o.InterfaceC53559wnl
        public void AEQbTJ(boolean z) {
            C53125wfb.gEmmrt(C53125wfb.this).OLrzqt(z);
            C53125wfb.this.fJNWhG();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C53487wmS c53487wmS, C53125wfb c53125wfb, android.view.View view) {
        if (!view.isSelected()) {
            c53487wmS.AEQbTJ(false);
            c53487wmS.isConnected();
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).wlaJM();
        }
        C56028xvA.botClickTrack$default("smartAllocButton", null, 2, null);
    }

    public static final void AEQbTJ(C53487wmS c53487wmS, android.view.View view) {
        if (!view.isSelected()) {
            c53487wmS.AEQbTJ(true);
            c53487wmS.copydefault();
            c53487wmS.gEmmrt();
        }
        C56028xvA.botClickTrack$default("avgAllocButton", null, 2, null);
    }

    /* JADX INFO: renamed from: o.wfb$Dialog */
    public static final class Dialog implements InterfaceC53520wmz {
        public Dialog() {
        }

        @Override // o.InterfaceC53520wmz
        public void AEQbTJ(int i) {
            InterfaceC53520wmz.ActionBar.AEQbTJ(this, i);
        }

        @Override // o.InterfaceC53520wmz
        public void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C53125wfb.gEmmrt(C53125wfb.this).AEQbTJ(str);
            C53125wfb.gEmmrt(C53125wfb.this).KWHzl(str2);
            C53125wfb.gEmmrt(C53125wfb.this).OLrzqt(str3);
            C53125wfb.gEmmrt(C53125wfb.this).AuCTelauCTel();
        }

        @Override // o.InterfaceC53520wmz
        public void copydefault(int i) {
            InterfaceC53520wmz.ActionBar.KWHzl(this, i);
            C53125wfb.gEmmrt(C53125wfb.this).OLrzqt(i);
            C53125wfb.gEmmrt(C53125wfb.this).AuCTelauCTel();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(C53125wfb c53125wfb, C47988uAv c47988uAv, float f) {
        java.lang.String str;
        C54571xNh c54571xNhCreateAmtConvert$default;
        C54536xML c54536xMLAYXKKw;
        c53125wfb.EZpvd("BotPlaceOrder_Btm_InvestmentAmount_Drag", "bot_type", "smart_portfolio");
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            java.lang.String safeString$default = null;
            c47988uAv.setOnTextChangeCallback(null);
            java.lang.String strAYXKKw = ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AYXKKw();
            if (!((uQL) c53125wfb.gGvvIC()).fIwbmz.isSelected() || !C33129mqd.AEQbTJ(strAYXKKw, 0)) {
                MaxAvailableResp maxAvailableResp = c53125wfb.wlaJM().AEQbTJ().get();
                if (maxAvailableResp != null) {
                    strAYXKKw = maxAvailableResp.getQuoteMax();
                    str = strAYXKKw;
                    c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
                    if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(java.lang.Float.valueOf(c47988uAv.fJNWhG()), str, null, null, null, 14, null))) != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                    }
                    C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
                    c47988uAv.setOnTextChangeCallback(c53125wfb.KWHzl);
                    c53125wfb.gHZMYf();
                } else {
                    str = null;
                    c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
                    if (c54571xNhCreateAmtConvert$default != null) {
                        safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                    }
                    C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
                    c47988uAv.setOnTextChangeCallback(c53125wfb.KWHzl);
                    c53125wfb.gHZMYf();
                }
            } else {
                str = strAYXKKw;
                c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
                if (c54571xNhCreateAmtConvert$default != null) {
                }
                C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
                c47988uAv.setOnTextChangeCallback(c53125wfb.KWHzl);
                c53125wfb.gHZMYf();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(C53125wfb c53125wfb) {
        ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).copydefault(((uQL) c53125wfb.gGvvIC()).EZpvd.AkhnZx());
        if (checkTotalAmtIsValid$default(c53125wfb, false, 1, null) && ((uQL) c53125wfb.gGvvIC()).fIwbmz.isSelected()) {
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).zLjUOn();
        }
        c53125wfb.gHZMYf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wfb$LoaderManager */
    public static final class LoaderManager implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            xOW newProxyInstance;
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("entrust_type", "smart_portfolio", true);
            eventParamsList.put(OtcExtraKeys.MODE, this.KWHzl, true);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
            if (strWlaJM == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
                return;
            }
            eventParamsList.put("account_type", strWlaJM, true);
        }
    }

    /* JADX INFO: renamed from: o.wfb$Fragment */
    public static final class Fragment implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "bot_type", "smart_portfolio", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, this.EZpvd, false, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(C53125wfb c53125wfb, android.view.View view) {
        view.setSelected(!view.isSelected());
        if (view.isSelected()) {
            if (((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AubY()) {
                ((uQL) c53125wfb.gGvvIC()).fetchVPNInfo.performClick();
                ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).gEmmrt(false);
            }
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).zLjUOn();
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).zsXlph();
        } else {
            c53125wfb.KWHzl(false);
            c53125wfb.fJNWhG();
        }
        checkTotalAmtIsValid$default(c53125wfb, false, 1, null);
        ConstraintLayout constraintLayout = ((uQL) c53125wfb.gGvvIC()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(view.isSelected() ? 0 : 8);
        if (((uQL) c53125wfb.gGvvIC()).EZpvd.zLjUOn()) {
            C47988uAv.setInputContent$default(((uQL) c53125wfb.gGvvIC()).EZpvd, "", false, true, 2, null);
        }
        c53125wfb.gHZMYf();
    }

    public static final void djBIcL(C53125wfb c53125wfb, android.view.View view) {
        android.content.Context contextRequireContext = c53125wfb.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        android.view.View viewInflate = android.view.LayoutInflater.from(c53125wfb.requireContext()).inflate(C48033uCm.Activity.gwTjWJ, (android.view.ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
        java.lang.String string = c53125wfb.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C53125wfb.KWHzl(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        int iCopydefault = C33070mpX.copydefault(z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe);
        android.widget.TextView textView = ((uQL) gGvvIC()).gEmmrt;
        Intrinsics.copydefault(textView);
        textView.setVisibility(z ? 0 : 8);
        textView.setTextColor(iCopydefault);
        TextViewCompat.setCompoundDrawableTintList(textView, android.content.res.ColorStateList.valueOf(iCopydefault));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gHZMYf() {
        int i;
        android.widget.TextView textView = ((uQL) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (!((uQL) gGvvIC()).fIwbmz.isSelected()) {
            MaxAvailableResp maxAvailableResp = wlaJM().AEQbTJ().get();
            if ((maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null) != null) {
                java.lang.String strAkhnZx = ((uQL) gGvvIC()).EZpvd.AkhnZx();
                MaxAvailableResp maxAvailableResp2 = wlaJM().AEQbTJ().get();
                i = C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp2 != null ? maxAvailableResp2.getQuoteMax() : null) ? 0 : 8;
            }
        }
        textView.setVisibility(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        TradeLiveData<PortfolioData> tradeLiveDataEjfBZ = ((SmartPortfolioPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner, new FragmentManager(new Function1() { // from class: o.wfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.AEQbTJ(this.EZpvd, (PortfolioData) obj);
            }
        }));
        C56111xwe<java.util.List<StrategyResponse>> c56111xweValueOf = ((SmartPortfolioPresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValueOf.observe(viewLifecycleOwner2, new FragmentManager(new Function1() { // from class: o.wfn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        TradeLiveData<SmartInvestDetail> tradeLiveDataAuCTel = ((SmartPortfolioPresenter) dxcTrN()).AuCTel();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAuCTel.observe(viewLifecycleOwner3, new FragmentManager(new Function1() { // from class: o.wfm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.KWHzl(this.OLrzqt, (SmartInvestDetail) obj);
            }
        }));
        TradeLiveData<MaxCapital> tradeLiveDataDjBIcL = ((SmartPortfolioPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner4, new FragmentManager(new Function1() { // from class: o.wfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.EZpvd(this.copydefault, (MaxCapital) obj);
            }
        }));
        ((SmartPortfolioPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.wfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.KWHzl(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        ((SmartPortfolioPresenter) dxcTrN()).AkhnZx().AkhnZx().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.wfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = wlaJM().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweAhwBna.observe(viewLifecycleOwner5, new FragmentManager(new Function1() { // from class: o.wft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.util.List<SmartRecommendResp>> tradeLiveDataAEQbTJ = values().AEQbTJ();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner6, new FragmentManager(new Function1() { // from class: o.wfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = values().copydefault().AhwBna();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner7, new FragmentManager(new Function1() { // from class: o.wfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        isConnected().copydefault().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.wfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.EZpvd(this.KWHzl, (AutoEarnStakingQueryConfig) obj);
            }
        }));
        isConnected().AEQbTJ().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.wfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C53125wfb c53125wfb, PortfolioData portfolioData) {
        Intrinsics.checkNotNullParameter(portfolioData, "");
        ((uQL) c53125wfb.gGvvIC()).copydefault.djBIcL();
        c53125wfb.OLrzqt(portfolioData.getPortfolioList());
        c53125wfb.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53125wfb c53125wfb, java.util.List list) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = c53125wfb.finit().AuCTel();
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyResponse != null && (algoId = strategyResponse.getAlgoId()) != null) {
            str = algoId;
        }
        c56126xwtAuCTel.KWHzl(C56390yDp.OLrzqt("smart_portfolio", str));
        xDM xdmCopydefault = c53125wfb.wlaJM().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53125wfb c53125wfb, SmartInvestDetail smartInvestDetail) {
        Intrinsics.checkNotNullParameter(smartInvestDetail, "");
        ((uQL) c53125wfb.gGvvIC()).DbNXlk.setText(smartInvestDetail.getTotalQuoteInvestPx());
        c53125wfb.KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53125wfb c53125wfb, MaxCapital maxCapital) {
        Intrinsics.checkNotNullParameter(maxCapital, "");
        c53125wfb.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53125wfb c53125wfb, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AkhnZx().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).fvQaOB().gEmmrt();
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 == null) {
                message2 = "";
            }
            java.lang.String str2 = message2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "smart_portfolio", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str2, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).isConnected().bB_())) {
            c53125wfb.fJNWhG();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).fIwbmz().bB_())) {
            pUU.copydefault(c53125wfb.getTAG(), "smartAllocUseCase: " + ((java.lang.Exception) pair.second).getMessage());
            C53487wmS c53487wmS = ((uQL) c53125wfb.gGvvIC()).copydefault;
            c53487wmS.djBIcL();
            c53487wmS.gEmmrt();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).values().bB_())) {
            pUU.copydefault(c53125wfb.getTAG(), "preInvestDetailUseCase: " + ((java.lang.Exception) pair.second).getMessage());
            ((uQL) c53125wfb.gGvvIC()).DbNXlk.setText("-- " + ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).gEmmrt());
            c53125wfb.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53125wfb c53125wfb, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c53125wfb.showLoading();
        } else {
            c53125wfb.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53125wfb c53125wfb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53125wfb.gHZMYf();
        ((uQL) c53125wfb.gGvvIC()).AEQbTJ.setFooterAvaValue(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53125wfb c53125wfb, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c53125wfb.KWHzl(c53125wfb.values().AEQbTJ(0));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C53125wfb c53125wfb, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.copydefault(c53125wfb.getTAG(), "smartRecommendUseCase: " + exc.getMessage());
        if (c53125wfb.AuCTel()) {
            ((uQL) c53125wfb.gGvvIC()).copydefault.valueOf().performClick();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53125wfb c53125wfb, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        if (autoEarnStakingQueryConfig != null) {
            c53125wfb.AEQbTJ(autoEarnStakingQueryConfig);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53125wfb c53125wfb, java.lang.String str) {
        if (str != null) {
            pUU.copydefault(c53125wfb.getTAG(), "AutoEarnStakingConfig error: " + str);
        }
        return Unit.INSTANCE;
    }

    private final void zuBGHE() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53125wfb.AEQbTJ(this.copydefault, str, bundle);
            }
        });
        final androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.setFragmentResultListener("smart_card_qreq", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53125wfb.KWHzl(childFragmentManager, this, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C53125wfb c53125wfb, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).copydefault((SmartPortfolioReq) bundle.getParcelable("bot_copy_req"));
    }

    public static final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, C53125wfb c53125wfb, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Parcelable parcelable = bundle.getParcelable("bot_copy_req");
        SmartPortfolioReq smartPortfolioReq = parcelable instanceof SmartPortfolioReq ? (SmartPortfolioReq) parcelable : null;
        if (smartPortfolioReq != null) {
            c53125wfb.KWHzl(smartPortfolioReq);
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("SmartRecommendDialog");
        androidx.fragment.app.DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = fragmentManager.findFragmentByTag("SmartIntroDialog");
        androidx.fragment.app.DialogFragment dialogFragment2 = fragmentFindFragmentByTag2 instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag2 : null;
        if (dialogFragment2 != null) {
            dialogFragment2.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(SmartPortfolioReq smartPortfolioReq) {
        ((SmartPortfolioPresenter) dxcTrN()).copydefault(smartPortfolioReq);
        djBIcL();
        java.lang.String stgyName = smartPortfolioReq.getStgyName();
        if (stgyName != null) {
            ((SmartPortfolioPresenter) dxcTrN()).AhwBna(true);
            ((SmartPortfolioPresenter) dxcTrN()).AhwBna(stgyName);
            ((uQL) gGvvIC()).AYXKKw.setText(stgyName);
        }
        ((SmartPortfolioPresenter) dxcTrN()).EZpvd(smartPortfolioReq.getRecommendId());
        ((uQL) gGvvIC()).EZpvd.post(new java.lang.Runnable() { // from class: o.wff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53125wfb.fetchVPNInfo(this.OLrzqt);
            }
        });
        if (AuCTel()) {
            ((uQL) gGvvIC()).copydefault.gEmmrt();
            ((uQL) gGvvIC()).copydefault.AEQbTJ(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fetchVPNInfo(C53125wfb c53125wfb) {
        ((uQL) c53125wfb.gGvvIC()).EZpvd.zsXlph();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        C47988uAv.setInputLabel$default(((uQL) gGvvIC()).EZpvd, ((SmartPortfolioPresenter) dxcTrN()).uzCIH() ? ((SmartPortfolioPresenter) dxcTrN()).KWHzl(((uQL) gGvvIC()).fIwbmz.isSelected(), ((uQL) gGvvIC()).copydefault.AYXKKw(), wlaJM().AEQbTJ().get()) : "", null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AYXKKw() {
        return ((uQL) gGvvIC()).copydefault.AEQbTJ() && ((uQL) gGvvIC()).KWHzl.copydefault() && OLrzqt(true);
    }

    public static /* synthetic */ boolean checkTotalAmtIsValid$default(C53125wfb c53125wfb, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c53125wfb.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean OLrzqt(boolean z) {
        java.lang.String strAEQbTJ = ((SmartPortfolioPresenter) dxcTrN()).AEQbTJ(((uQL) gGvvIC()).fIwbmz.isSelected(), ((uQL) gGvvIC()).EZpvd.AkhnZx(), wlaJM().AEQbTJ().get());
        boolean z2 = !z ? !(((SmartPortfolioPresenter) dxcTrN()).OLrzqt().length() == 0 || strAEQbTJ.length() == 0) : ((SmartPortfolioPresenter) dxcTrN()).OLrzqt().length() <= 0 || strAEQbTJ.length() != 0;
        if (z2) {
            ((uQL) gGvvIC()).EZpvd.copydefault();
        } else {
            ((uQL) gGvvIC()).EZpvd.setInputErrorMsg(strAEQbTJ);
            KWHzl(false);
        }
        return z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTelauCTel() {
        ConstraintLayout constraintLayout = ((uQL) gGvvIC()).ejfBZ;
        int i = C48033uCm.Application.fvQaOB;
        C49960uyR.setWindowSoftInput$default(this, constraintLayout, java.lang.Integer.valueOf(i), ((uQL) gGvvIC()).EZpvd, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        ((SmartPortfolioPresenter) dxcTrN()).copydefault(new Function1() { // from class: o.wfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(this.copydefault, (StrategyConfigInfo) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C53125wfb c53125wfb, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        java.lang.String strOLrzqt = c53125wfb.OLrzqt(strategyConfigInfo.getDefaultRatio());
        if (strOLrzqt != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.setDefaultRatio(strOLrzqt);
        }
        java.lang.String strOLrzqt2 = c53125wfb.OLrzqt(strategyConfigInfo.getDefaultTime());
        if (strOLrzqt2 != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.setDefaultTime(strOLrzqt2);
        }
        java.lang.Integer numOLrzqt = c53125wfb.OLrzqt(C33129mqd.AhwBna(strategyConfigInfo.getNameMax()));
        if (numOLrzqt != null) {
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).copydefault(numOLrzqt.intValue());
        }
        java.lang.Integer numOLrzqt2 = c53125wfb.OLrzqt(C33129mqd.AhwBna(strategyConfigInfo.getPerCoinMinAmt()));
        if (numOLrzqt2 != null) {
            int iIntValue = numOLrzqt2.intValue();
            ((SmartPortfolioPresenter) c53125wfb.dxcTrN()).AEQbTJ(iIntValue);
            ((uQL) c53125wfb.gGvvIC()).copydefault.setPerCoinMinAmt(iIntValue);
        }
        java.lang.String strOLrzqt3 = c53125wfb.OLrzqt(strategyConfigInfo.getIntervalMax());
        if (strOLrzqt3 != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.setIntervalMax(strOLrzqt3);
        }
        java.lang.String strOLrzqt4 = c53125wfb.OLrzqt(strategyConfigInfo.getIntervalMin());
        if (strOLrzqt4 != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.copydefault(strOLrzqt4);
        }
        java.lang.String strOLrzqt5 = c53125wfb.OLrzqt(strategyConfigInfo.getDeltaRatioMin());
        if (strOLrzqt5 != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.OLrzqt(strOLrzqt5);
        }
        java.lang.String strOLrzqt6 = c53125wfb.OLrzqt(strategyConfigInfo.getDeltaRatioMax());
        if (strOLrzqt6 != null) {
            ((uQL) c53125wfb.gGvvIC()).KWHzl.setDeltaRatioMax(strOLrzqt6);
        }
        c53125wfb.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        final uQL uql = (uQL) gGvvIC();
        uql.ejfBZ.post(new java.lang.Runnable() { // from class: o.wfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53125wfb.AEQbTJ(uql);
            }
        });
    }

    public static final void AEQbTJ(uQL uql) {
        int width = uql.ejfBZ.getWidth();
        int width2 = uql.fIwbmz.getWidth();
        if (((width - width2) - C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null)) - uql.fetchVPNInfo.getWidth() < uql.gEmmrt.getWidth()) {
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.startToStart = 0;
            layoutParams.topToBottom = uql.fetchVPNInfo.getId();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
            uql.gEmmrt.setLayoutParams(layoutParams);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void hDKMBd() {
        java.util.ArrayList arrayList;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.util.ArrayList<BizInstrument> arrayListEZpvd = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) == null) ? null : abstractC54531xLwOLrzqt.EZpvd();
        ((SmartPortfolioPresenter) dxcTrN()).AEQbTJ().clear();
        if (arrayListEZpvd != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListEZpvd) {
                if (C59449zhJ.endsWith$default(((BizInstrument) obj).getInstId(), "-" + ((SmartPortfolioPresenter) dxcTrN()).EZpvd(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(((SmartPortfolioPresenter) dxcTrN()).AhwBna());
        if (arrayList != null) {
            int i = 0;
            for (java.lang.Object obj2 : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                BizInstrument bizInstrument = (BizInstrument) obj2;
                CountDownInfo countDownInfo = bizInstrument.getCountDownInfo();
                if (countDownInfo == null || !countDownInfo.isInvalidForBot()) {
                    java.lang.String upperCase = o.TaskDescription.AEQbTJ(bizInstrument.getInstId()).copydefault().toUpperCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    bizInstrument.fullCoinName();
                    C54589xNz c54589xNz = C54589xNz.EZpvd;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                    java.lang.String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(upperCase) : null;
                    InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
                    SelectCoinData selectCoinData = new SelectCoinData(strValueOf, upperCase, SlippageConfigVo.MAX_SLIP, false, interfaceC54581xNrCopydefault2 != null ? interfaceC54581xNrCopydefault2.fetchVPNInfo(upperCase) : true, false, bizInstrument.getInstId(), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, AudioStats.AUDIO_AMPLITUDE_NONE, 8104, null);
                    ((SmartPortfolioPresenter) dxcTrN()).AEQbTJ().add(selectCoinData);
                    if (((SmartPortfolioPresenter) dxcTrN()).hDKMBd() && arrayListCopydefault.size() < 2) {
                        if (!arrayListCopydefault.isEmpty()) {
                            java.util.Iterator it = arrayListCopydefault.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.EZpvd((java.lang.Object) ((SelectCoinData) it.next()).getName(), (java.lang.Object) upperCase)) {
                                    break;
                                }
                            }
                            if (!selectCoinData.isShow()) {
                            }
                        } else if (!selectCoinData.isShow()) {
                            arrayListCopydefault.add(selectCoinData);
                        }
                    }
                }
                i++;
            }
        }
        if (((SmartPortfolioPresenter) dxcTrN()).hDKMBd() && arrayListCopydefault.size() == 2 && ((SmartPortfolioPresenter) dxcTrN()).copydefault() == null) {
            ((uQL) gGvvIC()).copydefault.setSelectCoins(arrayListCopydefault);
            ((SmartPortfolioPresenter) dxcTrN()).AEQbTJ(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        java.lang.String strIwGUEr = ((SmartPortfolioPresenter) dxcTrN()).iwGUEr();
        ((uQL) gGvvIC()).AYXKKw.setText(strIwGUEr);
        ((SmartPortfolioPresenter) dxcTrN()).AhwBna(strIwGUEr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        if (AuCTel()) {
            C53534wnM c53534wnM = ((uQL) gGvvIC()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c53534wnM, "");
            c53534wnM.setVisibility(0);
            ((uQL) gGvvIC()).AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.dump));
            C53487wmS c53487wmS = ((uQL) gGvvIC()).copydefault;
            Intrinsics.checkNotNullExpressionValue(c53487wmS, "");
            c53487wmS.setVisibility(0);
            C53487wmS c53487wmS2 = ((uQL) gGvvIC()).copydefault;
            c53487wmS2.EZpvd(true);
            c53487wmS2.setAtLeastCoin(2);
            c53487wmS2.setMaxCoin(10);
        } else {
            C53534wnM c53534wnM2 = ((uQL) gGvvIC()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c53534wnM2, "");
            c53534wnM2.setVisibility(8);
            C53487wmS c53487wmS3 = ((uQL) gGvvIC()).copydefault;
            Intrinsics.copydefault(c53487wmS3);
            c53487wmS3.setVisibility(0);
            c53487wmS3.EZpvd(false);
        }
        android.widget.TextView textView = ((uQL) gGvvIC()).AYXKKw;
        java.lang.String strOLrzqt = ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        textView.setText(strOLrzqt + " " + C33070mpX.AYXKKw(C55688xof.Application.to));
        ((uQL) gGvvIC()).AEQbTJ.setFooterAvaValue("");
        ((uQL) gGvvIC()).values.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21TransportControls));
        C53605woe c53605woe = ((uQL) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c53605woe, "");
        c53605woe.setVisibility(C55697xoo.OLrzqt.isConnected() ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        ((uQL) gGvvIC()).EZpvd.setInputUnit(AubY());
        ((uQL) gGvvIC()).AEQbTJ.setTransferCoin(((SmartPortfolioPresenter) dxcTrN()).gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String sizeDig = (interfaceC54581xNrCopydefault == null || (tradeCoinInfoAhwBna = interfaceC54581xNrCopydefault.AhwBna(((SmartPortfolioPresenter) dxcTrN()).gEmmrt())) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        ((uQL) gGvvIC()).EZpvd.setMaxDecimal((sizeDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sizeDig)) ? 8 : C33129mqd.AhwBna(sizeDig));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        SmartPortfolioReq smartPortfolioReqCopydefault = ((SmartPortfolioPresenter) dxcTrN()).copydefault();
        if (smartPortfolioReqCopydefault != null) {
            OLrzqt(smartPortfolioReqCopydefault.getPortfolioList());
            C53477wmI c53477wmI = ((uQL) gGvvIC()).KWHzl;
            if (Intrinsics.EZpvd((java.lang.Object) smartPortfolioReqCopydefault.getBalType(), (java.lang.Object) "ratio")) {
                c53477wmI.gEmmrt();
                java.lang.String deltaRatio = smartPortfolioReqCopydefault.getDeltaRatio();
                if (deltaRatio != null) {
                    c53477wmI.setDefaultBalanceText(C33129mqd.mulS$default(deltaRatio, 100, null, null, null, 14, null));
                }
            } else {
                c53477wmI.AhwBna();
                java.lang.String interval = smartPortfolioReqCopydefault.getInterval();
                if (interval != null) {
                    if (C33129mqd.AhwBna(interval) % 60 == 0) {
                        c53477wmI.djBIcL();
                        c53477wmI.setDefaultBalanceText(C33129mqd.divS$default(java.lang.Integer.valueOf(C33129mqd.AhwBna(interval)), 60, 0, null, null, 12, null));
                    } else {
                        c53477wmI.valueOf();
                        c53477wmI.setDefaultBalanceText(C33129mqd.gEmmrt(interval));
                    }
                }
            }
            java.lang.String stgyName = smartPortfolioReqCopydefault.getStgyName();
            if (stgyName != null) {
                ((uQL) gGvvIC()).AYXKKw.setText(stgyName);
            }
            java.lang.String quoteSz = smartPortfolioReqCopydefault.getQuoteSz();
            if (quoteSz != null) {
                C47988uAv.setInputContent$default(((uQL) gGvvIC()).EZpvd, quoteSz, false, false, 6, null);
            }
            setArguments(null);
            ((SmartPortfolioPresenter) dxcTrN()).copydefault((SmartPortfolioReq) null);
            return;
        }
        if (((SmartPortfolioPresenter) dxcTrN()).getFieldNames() && AuCTel()) {
            android.os.Bundle arguments = getArguments();
            java.lang.String string = arguments != null ? arguments.getString("recommendId") : null;
            if (C33129mqd.AEQbTJ(string, "0")) {
                values().copydefault(string, ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().gEmmrt());
            } else {
                ((uQL) gGvvIC()).copydefault.valueOf().performClick();
            }
            ((SmartPortfolioPresenter) dxcTrN()).EZpvd(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.util.List<CoinRatioParam> list) {
        java.lang.Object next;
        ((SmartPortfolioPresenter) dxcTrN()).fJNWhG().clear();
        if (list != null) {
            for (CoinRatioParam coinRatioParam : list) {
                java.util.Iterator<T> it = ((SmartPortfolioPresenter) dxcTrN()).AEQbTJ().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((SelectCoinData) next).getName(), (java.lang.Object) coinRatioParam.getCcy())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                SelectCoinData selectCoinData = (SelectCoinData) next;
                if (selectCoinData != null) {
                    java.util.ArrayList<SelectCoinData> arrayListFJNWhG = ((SmartPortfolioPresenter) dxcTrN()).fJNWhG();
                    selectCoinData.setRatio(coinRatioParam.getRatio());
                    selectCoinData.setSelected(true);
                    arrayListFJNWhG.add(selectCoinData);
                }
            }
        }
        if (AuCTel()) {
            ((uQL) gGvvIC()).copydefault.KWHzl(((SmartPortfolioPresenter) dxcTrN()).fJNWhG());
        }
    }

    private final void EZpvd(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.wfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.copydefault(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        pUU.EZpvd(getTAG(), "AutoEarnStakingConfig loaded: " + autoEarnStakingQueryConfig);
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uQL) gGvvIC()).fARcdN;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.copydefault(c54154wyx, autoEarnStakingQueryConfig);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        java.lang.String strGEmmrt = ((SmartPortfolioPresenter) dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String strAubY = AubY();
        if (strAubY == null) {
            strAubY = "";
        }
        java.lang.String str = strAubY;
        isConnected().copydefault(new TacticsVipProfitData(strGEmmrt, null, null, "smart_portfolio", str, CollectionsKt___CollectionsKt.joinToString$default(((SmartPortfolioPresenter) dxcTrN()).fJNWhG(), ",", null, null, 0, null, new Function1() { // from class: o.wfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53125wfb.KWHzl((SelectCoinData) obj);
            }
        }, 30, null) + "," + str, 6, null));
    }

    public static final java.lang.CharSequence KWHzl(SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        java.lang.String name = selectCoinData.getName();
        return name == null ? "" : name;
    }
}
