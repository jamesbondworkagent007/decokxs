package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Observable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.tradingbot.impl.order.strategy.common.CommonDcaManualViewModel;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$initListener$1$1;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$initObserve$1;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.config.SpotDcaRiskModeData;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C53274wiR;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53273wiQ extends AbstractC53270wiN<AbstractC50752vaA, SpotDcaManualPresenter> {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final FragmentManager fARcdN;
    public uBL fJNWhG;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public final Function2<C47988uAv, java.lang.String, Unit> isConnected;
    public final InterfaceC56387yDm valueOf;
    public final int fetchVPNInfo = C48033uCm.Activity.RSmiaq;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.wiW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53273wiQ.ORxRYg();
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wiU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53273wiQ.ejfBZ(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wiQ$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC50752vaA AkhnZx(C53273wiQ c53273wiQ) {
        return (AbstractC50752vaA) c53273wiQ.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SpotDcaManualPresenter gEmmrt(C53273wiQ c53273wiQ) {
        return (SpotDcaManualPresenter) c53273wiQ.dxcTrN();
    }

    public C53273wiQ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$2
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
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CommonDcaManualViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$7
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$viewModels$default$10
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.fragment.SpotDcaManualFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.fetchVPNInfo(this.copydefault);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.wjn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.fIwbmz(this.copydefault);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wjv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.fJNWhG(this.copydefault);
            }
        });
        this.isConnected = new Function2() { // from class: o.wjs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53273wiQ.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.gEmmrt = new Function2() { // from class: o.wjw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53273wiQ.KWHzl(this.AEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wjy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.isConnected(this.OLrzqt);
            }
        });
        this.fARcdN = new FragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BizInfoConfig.DefaultBizConfig ORxRYg() {
        return BizInfoConfig.DefaultBizConfig.copydefault;
    }

    private final BizInfoConfig.DefaultBizConfig wlaJM() {
        return (BizInfoConfig.DefaultBizConfig) this.values.getValue();
    }

    private final xLY AuCTelauCTel() {
        return (xLY) this.AkhnZx.getValue();
    }

    public static final xLY ejfBZ(C53273wiQ c53273wiQ) {
        return new xLY(c53273wiQ.wlaJM());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CommonDcaManualViewModel zLjUOn() {
        return (CommonDcaManualViewModel) this.getFieldNames.getValue();
    }

    private final C55915xsu ejfBZ() {
        return (C55915xsu) this.djBIcL.getValue();
    }

    private final BotTradePresenter fARcdN() {
        return (BotTradePresenter) this.valueOf.getValue();
    }

    public static final C53518wmx fetchVPNInfo(C53273wiQ c53273wiQ) {
        android.content.Context contextRequireContext = c53273wiQ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    private final C53518wmx iwGUEr() {
        return (C53518wmx) this.AYXKKw.getValue();
    }

    private final C53518wmx zsXlph() {
        return (C53518wmx) this.ejfBZ.getValue();
    }

    public static final C53518wmx fIwbmz(C53273wiQ c53273wiQ) {
        android.content.Context contextRequireContext = c53273wiQ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C53518wmx c53518wmx = new C53518wmx(contextRequireContext, null, 0, 6, null);
        C53518wmx.setLoginCheck$default(c53518wmx, false, null, 2, null);
        C53518wmx.setTradeLevelCheck$default(c53518wmx, false, null, null, 6, null);
        c53518wmx.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DWgRXt), TextView.BufferType.NORMAL);
        c53518wmx.setButtonType(260);
        ViewGroup.LayoutParams layoutParams = c53518wmx.getLayoutParams();
        layoutParams.width = -2;
        c53518wmx.setLayoutParams(layoutParams);
        android.content.Context context = c53518wmx.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wPQ.EZpvd(c53518wmx, 0, C55298xhM.OLrzqt(12, context));
        c53518wmx.setContentDescription("previewButton");
        return c53518wmx;
    }

    private final C7773aqE hDKMBd() {
        return (C7773aqE) this.DbNXlk.getValue();
    }

    public static final C7773aqE fJNWhG(C53273wiQ c53273wiQ) {
        C7773aqE c7773aqE = new C7773aqE(c53273wiQ.getContext());
        c7773aqE.addView(c53273wiQ.zsXlph());
        c7773aqE.addView(c53273wiQ.iwGUEr());
        c7773aqE.setOrientation(0);
        return c7773aqE;
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C7773aqE gEmmrt() {
        return hDKMBd();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SpotDcaManualFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.OLrzqt(view);
        sSMYrx();
        gHZMYf();
        AxsJAY();
        QUSxYX();
        AwvSrB();
        values();
        fARcdN().EZpvd(new Function0() { // from class: o.wjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.fARcdN(this.EZpvd);
            }
        });
        C55867xrz.KWHzl.OLrzqt("spot_dca", ((SpotDcaManualPresenter) dxcTrN()).fvQaOB().gEmmrt());
        AEQbTJ(true);
    }

    public static final Unit fARcdN(C53273wiQ c53273wiQ) {
        c53273wiQ.OcIXYQ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        ((AbstractC50752vaA) gGvvIC()).ejfBZ.setMaxDecimal(2);
        ((AbstractC50752vaA) gGvvIC()).getFieldNames.setMaxDecimal(2);
        ((AbstractC50752vaA) gGvvIC()).AuCTel.setMaxDecimal(0);
        ((AbstractC50752vaA) gGvvIC()).KWHzl.EZpvd();
        this.fJNWhG = ((AbstractC50752vaA) gGvvIC()).KWHzl.AEQbTJ();
        ((SpotDcaManualPresenter) dxcTrN()).fvQaOB().gEmmrt(AubY());
        ((AbstractC50752vaA) gGvvIC()).AEQbTJ.setFooterAvaValue("--");
    }

    /* JADX INFO: renamed from: o.wiQ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53273wiQ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53273wiQ c53273wiQ) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c53273wiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C53518wmx c53518wmx = (C53518wmx) this.EZpvd;
                boolean zFetchVPNInfo = this.KWHzl.fetchVPNInfo();
                C49967uyY.EZpvd.KWHzl(c53518wmx, C48033uCm.Application.fvQaOB, this.KWHzl.getNewProxyInstance());
                if (!zFetchVPNInfo) {
                    return;
                }
                if (Intrinsics.EZpvd(C53273wiQ.gEmmrt(this.KWHzl).fetchVPNInfo().getValue(), java.lang.Boolean.TRUE)) {
                    C56002xub.KWHzl.OLrzqt();
                    return;
                }
                SpotDcaManualPresenter spotDcaManualPresenterGEmmrt = C53273wiQ.gEmmrt(this.KWHzl);
                C53273wiQ c53273wiQ = this.KWHzl;
                C47988uAv c47988uAv = C53273wiQ.AkhnZx(c53273wiQ).ejfBZ;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                java.lang.String strCopydefault = c53273wiQ.copydefault(c47988uAv);
                java.lang.String strAkhnZx = C53273wiQ.AkhnZx(this.KWHzl).getFieldNames.AkhnZx();
                java.lang.String strAkhnZx2 = C53273wiQ.AkhnZx(this.KWHzl).fJNWhG.AkhnZx();
                C53273wiQ c53273wiQ2 = this.KWHzl;
                C47988uAv c47988uAv2 = C53273wiQ.AkhnZx(c53273wiQ2).fIwbmz;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                java.lang.String strCopydefault2 = c53273wiQ2.copydefault(c47988uAv2);
                java.lang.String strAkhnZx3 = C53273wiQ.AkhnZx(this.KWHzl).AuCTel.AkhnZx();
                boolean zIsChecked = C53273wiQ.AkhnZx(this.KWHzl).fetchVPNInfo.isChecked();
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                spotDcaManualPresenterGEmmrt.AEQbTJ(strCopydefault, strAkhnZx, strAkhnZx2, strCopydefault2, strAkhnZx3, zIsChecked, childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wiQ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53273wiQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53273wiQ c53273wiQ) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c53273wiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.KWHzl.getString(C55688xof.Application.hrNTAI));
                java.lang.String string = this.KWHzl.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Dialog(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wiQ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C53273wiQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53273wiQ c53273wiQ) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c53273wiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C53518wmx c53518wmx = (C53518wmx) this.KWHzl;
                boolean zFetchVPNInfo = this.copydefault.fetchVPNInfo();
                C49967uyY.EZpvd.KWHzl(c53518wmx, C48033uCm.Application.fvQaOB, this.copydefault.getNewProxyInstance());
                if (!zFetchVPNInfo) {
                    return;
                }
                AbstractC50752vaA abstractC50752vaAAkhnZx = C53273wiQ.AkhnZx(this.copydefault);
                SpotDcaManualPresenter spotDcaManualPresenterGEmmrt = C53273wiQ.gEmmrt(this.copydefault);
                java.lang.String strAkhnZx = abstractC50752vaAAkhnZx.fJNWhG.AkhnZx();
                C53273wiQ c53273wiQ = this.copydefault;
                C47988uAv c47988uAv = abstractC50752vaAAkhnZx.fIwbmz;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                java.lang.String strCopydefault = c53273wiQ.copydefault(c47988uAv);
                C53273wiQ c53273wiQ2 = this.copydefault;
                C47988uAv c47988uAv2 = abstractC50752vaAAkhnZx.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                this.copydefault.zLjUOn().copydefault(spotDcaManualPresenterGEmmrt.copydefault(strAkhnZx, strCopydefault, c53273wiQ2.copydefault(c47988uAv2), abstractC50752vaAAkhnZx.AuCTel.AkhnZx(), abstractC50752vaAAkhnZx.getFieldNames.AkhnZx()));
            }
        }
    }

    /* JADX INFO: renamed from: o.wiQ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53273wiQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53273wiQ c53273wiQ) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c53273wiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.Dmq), java.lang.Integer.valueOf(C55688xof.Application.DCUTEIddSDPG), java.lang.Integer.valueOf(C55688xof.Application.spnCvw));
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault2 = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.KDccX), java.lang.Integer.valueOf(C55688xof.Application.DBxZfM), java.lang.Integer.valueOf(C55688xof.Application.DWgRXt));
                C53274wiR.StateListAnimator stateListAnimator = C53274wiR.Companion;
                java.lang.String string = this.copydefault.requireActivity().getString(C55688xof.Application.QDqgQU);
                SpotDcaManualPresenter spotDcaManualPresenterGEmmrt = C53273wiQ.gEmmrt(this.copydefault);
                FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.AEQbTJ(string, spotDcaManualPresenterGEmmrt.AEQbTJ(fragmentActivityRequireActivity, arrayListCopydefault, arrayListCopydefault2)).show(this.copydefault.getChildFragmentManager(), C56524yIo.AEQbTJ(C53273wiQ.class).valueOf());
            }
        }
    }

    /* JADX INFO: renamed from: o.wiQ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C53273wiQ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53273wiQ c53273wiQ) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c53273wiQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.zblBkD), java.lang.Integer.valueOf(C55688xof.Application.DGOPHZ));
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault2 = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.DcqEDu), java.lang.Integer.valueOf(C55688xof.Application.aHXSQp));
                C53274wiR.StateListAnimator stateListAnimator = C53274wiR.Companion;
                java.lang.String string = this.EZpvd.requireActivity().getString(C55688xof.Application.RKcVTr);
                SpotDcaManualPresenter spotDcaManualPresenterGEmmrt = C53273wiQ.gEmmrt(this.EZpvd);
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.AEQbTJ(string, spotDcaManualPresenterGEmmrt.AEQbTJ(fragmentActivityRequireActivity, arrayListCopydefault, arrayListCopydefault2)).show(this.EZpvd.getChildFragmentManager(), C56524yIo.AEQbTJ(C53273wiQ.class).valueOf());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        BotRangeConfig pxStepsMult;
        BotRangeConfig volMult;
        AbstractC50752vaA abstractC50752vaA = (AbstractC50752vaA) gGvvIC();
        C53513wms c53513wms = abstractC50752vaA.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c53513wms, "");
        boolean z = true;
        c53513wms.setVisibility(C56071xvr.isSupportAiBot$default(C56071xvr.gEmmrt, null, 1, null) ? 0 : 8);
        C53513wms c53513wms2 = abstractC50752vaA.OLrzqt;
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50752vaA.ejfBZ.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50752vaA.getFieldNames.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) abstractC50752vaA.AuCTel.AkhnZx()))) {
            StrategyConfigInfo value = ((SpotDcaManualPresenter) dxcTrN()).KWHzl().getValue();
            java.lang.String str = (value == null || (volMult = value.getVolMult()) == null) ? null : volMult.getDefault();
            SpotDcaAdvancedParams value2 = ((SpotDcaManualPresenter) dxcTrN()).valueOf().getValue();
            if (!C33129mqd.AhwBna(str, value2 != null ? value2.AhwBna() : null)) {
                StrategyConfigInfo value3 = ((SpotDcaManualPresenter) dxcTrN()).KWHzl().getValue();
                java.lang.String str2 = (value3 == null || (pxStepsMult = value3.getPxStepsMult()) == null) ? null : pxStepsMult.getDefault();
                SpotDcaAdvancedParams value4 = ((SpotDcaManualPresenter) dxcTrN()).valueOf().getValue();
                if (!C33129mqd.AhwBna(str2, value4 != null ? value4.OLrzqt() : null)) {
                    z = false;
                }
            }
        }
        c53513wms2.setClear(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gHZMYf() {
        ((AbstractC50752vaA) gGvvIC()).OLrzqt.setCallBack("spot_dca", new Function1() { // from class: o.wiS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }, new Function0() { // from class: o.wiT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53273wiQ.AuCTel(this.KWHzl);
            }
        });
        ((AbstractC50752vaA) gGvvIC()).fetchVPNInfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wiV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C53273wiQ.EZpvd(this.copydefault, compoundButton, z);
            }
        });
        C53518wmx c53518wmxIwGUEr = iwGUEr();
        c53518wmxIwGUEr.setOnClickListener(new ActionBar(c53518wmxIwGUEr, 1000L, this));
        C53518wmx c53518wmxZsXlph = zsXlph();
        c53518wmxZsXlph.setOnClickListener(new Application(c53518wmxZsXlph, 1000L, this));
        C55258xgZ c55258xgZ = ((AbstractC50752vaA) gGvvIC()).uzCIH;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = ((AbstractC50752vaA) gGvvIC()).hDKMBd;
        c55258xgZ2.setOnClickListener(new TaskDescription(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = ((AbstractC50752vaA) gGvvIC()).AYXKKw;
        c55258xgZ3.setOnClickListener(new StateListAnimator(c55258xgZ3, 1000L, this));
    }

    public static final Unit KWHzl(C53273wiQ c53273wiQ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C56071xvr.gEmmrt.ejfBZ()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c53273wiQ), null, null, new SpotDcaManualFragment$initListener$1$1(c53273wiQ, list, null), 3, null);
        } else {
            c53273wiQ.copydefault((java.util.List<SmartRecommendResp>) list);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AuCTel(C53273wiQ c53273wiQ) {
        java.lang.String str;
        BotRangeConfig pxStepsMult;
        java.lang.String str2;
        BotRangeConfig volMult;
        AbstractC50752vaA abstractC50752vaA = (AbstractC50752vaA) c53273wiQ.gGvvIC();
        C47988uAv.setInputContent$default(abstractC50752vaA.ejfBZ, "", false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC50752vaA.getFieldNames, "", false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC50752vaA.AuCTel, "", false, false, 6, null);
        SpotDcaManualPresenter spotDcaManualPresenter = (SpotDcaManualPresenter) c53273wiQ.dxcTrN();
        SpotDcaAdvancedParams value = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).valueOf().getValue();
        if (value != null) {
            StrategyConfigInfo value2 = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue();
            java.lang.String str3 = "1";
            if (value2 == null || (volMult = value2.getVolMult()) == null || (str = volMult.getDefault()) == null) {
                str = "1";
            }
            value.KWHzl(str);
            StrategyConfigInfo value3 = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue();
            if (value3 != null && (pxStepsMult = value3.getPxStepsMult()) != null && (str2 = pxStepsMult.getDefault()) != null) {
                str3 = str2;
            }
            value.copydefault(str3);
        } else {
            value = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).copydefault((DcaOrderReq) null);
        }
        spotDcaManualPresenter.AEQbTJ(value);
        ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(C53273wiQ c53273wiQ, android.widget.CompoundButton compoundButton, boolean z) {
        ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).copydefault(z);
    }

    /* JADX INFO: renamed from: o.wiQ$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String copydefault(C47988uAv c47988uAv) {
        return c47988uAv.isConnected() == InputLayoutState.NORMAL ? c47988uAv.AkhnZx() : "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        C52692wUv.copydefault(zLjUOn().KWHzl(), this, Lifecycle.State.CREATED, new SpotDcaManualFragment$initObserve$1(this, null));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataKWHzl = ((SpotDcaManualPresenter) dxcTrN()).KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.wje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.OLrzqt(this.KWHzl, (StrategyConfigInfo) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Fragment(new Function1() { // from class: o.wjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        ((SpotDcaManualPresenter) dxcTrN()).fIwbmz().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.wjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.AhwBna(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataFARcdN = ((SpotDcaManualPresenter) dxcTrN()).fARcdN();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataFARcdN.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.wjm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.AYXKKw(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ = ((SpotDcaManualPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner4, new Fragment(new Function1() { // from class: o.wjq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.gEmmrt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataDbNXlk = ((SpotDcaManualPresenter) dxcTrN()).DbNXlk();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataDbNXlk.observe(viewLifecycleOwner5, new Fragment(new Function1() { // from class: o.wjo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataAkhnZx = ((SpotDcaManualPresenter) dxcTrN()).AkhnZx();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner6, new Fragment(new Function1() { // from class: o.wjp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataValues = ((SpotDcaManualPresenter) dxcTrN()).values();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataValues.observe(viewLifecycleOwner7, new Fragment(new Function1() { // from class: o.wju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.isConnected(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataFetchVPNInfo = ((SpotDcaManualPresenter) dxcTrN()).fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner8, new Fragment(new Function1() { // from class: o.wjr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.Boolean> c56111xweDjBIcL = ((SpotDcaManualPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner9, new Fragment(new Function1() { // from class: o.wjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.djBIcL(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = ejfBZ().AhwBna();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        c56111xweAhwBna.observe(viewLifecycleOwner10, new Fragment(new Function1() { // from class: o.wjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.values(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweOLrzqt = ((SpotDcaManualPresenter) dxcTrN()).OLrzqt();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner11, new Fragment(new Function1() { // from class: o.wjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.KWHzl(this.EZpvd, (StrategyResponse) obj);
            }
        }));
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf = ((SpotDcaManualPresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner12, new Fragment(new Function1() { // from class: o.wji
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.KWHzl(this.EZpvd, (SpotDcaAdvancedParams) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = ((SpotDcaManualPresenter) dxcTrN()).EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner13, new Observer() { // from class: o.wjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53273wiQ.AEQbTJ(this.copydefault, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit OLrzqt(C53273wiQ c53273wiQ, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c53273wiQ.KWHzl(strategyConfigInfo);
        c53273wiQ.QbewEr();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53273wiQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53273wiQ c53273wiQ, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        fillWithConfigInfo$default(c53273wiQ, null, 1, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c53273wiQ, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wTo.setInputRange$default(o.wTo, o.uAv, com.okinc.unify_trade.biz.BotRangeConfig, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C53273wiQ c53273wiQ, java.lang.String str) {
        BotRangeConfig initOrdAmt;
        java.lang.String str2;
        BotRangeConfig initOrdAmt2;
        if (((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).fJNWhG()) {
            return Unit.INSTANCE;
        }
        StrategyConfigInfo value = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue();
        java.lang.String strAEQbTJ = null;
        java.lang.String max = (value == null || (initOrdAmt2 = value.getInitOrdAmt()) == null) ? null : initOrdAmt2.getMax();
        if (max == null || max.length() == 0) {
            max = "10000";
        }
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        SpotDcaManualPresenter spotDcaManualPresenter = (SpotDcaManualPresenter) c53273wiQ.dxcTrN();
        RoundingMode roundingMode = RoundingMode.UP;
        java.lang.String strAEQbTJ2 = spotDcaManualPresenter.AEQbTJ(str, roundingMode);
        java.lang.String strAEQbTJ3 = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).AEQbTJ(max, roundingMode);
        StrategyConfigInfo value2 = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue();
        if (value2 != null && (initOrdAmt = value2.getInitOrdAmt()) != null && (str2 = initOrdAmt.getDefault()) != null) {
            strAEQbTJ = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).AEQbTJ(str2, roundingMode);
        }
        c52658wTo.copydefault(c47988uAv, new BotRangeConfig(strAEQbTJ2, strAEQbTJ3, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).AEQbTJ(str, roundingMode), (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wjA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.valueOf((java.lang.String) obj);
            }
        });
        c53273wiQ.QOLQEE();
        c53273wiQ.QfsBiF();
        return Unit.INSTANCE;
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    public static final Unit AYXKKw(C53273wiQ c53273wiQ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53273wiQ.isConnected(str);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C53273wiQ c53273wiQ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53273wiQ.isConnected(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53273wiQ c53273wiQ, boolean z) {
        android.widget.TextView textView = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean z2 = !z;
        textView.setVisibility(z2 ? 0 : 8);
        ConstraintLayout constraintLayout = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z2 ? 0 : 8);
        c53273wiQ.QfsBiF();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AkhnZx(C53273wiQ c53273wiQ, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAkhnZx = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).fvQaOB().AkhnZx();
        android.widget.TextView textView = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).DbNXlk;
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = xMR.copydefault.copydefault(str) + " " + strAkhnZx;
        } else {
            str2 = "--";
        }
        textView.setText(str2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isConnected(C53273wiQ c53273wiQ, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAkhnZx = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).fvQaOB().AkhnZx();
        android.widget.TextView textView = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).copydefault;
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = xMR.copydefault.copydefault(str) + " " + strAkhnZx;
        } else {
            str2 = "--";
        }
        textView.setText(str2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53273wiQ c53273wiQ, boolean z) {
        android.widget.TextView textView = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C53273wiQ c53273wiQ, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        java.util.Iterator<T> it = c53273wiQ.getNewProxyInstance().iterator();
        while (it.hasNext()) {
            ((C47988uAv) it.next()).copydefault();
        }
        android.widget.TextView textView = ((AbstractC50752vaA) c53273wiQ.gGvvIC()).getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit values(C53273wiQ c53273wiQ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC50752vaA) c53273wiQ.gGvvIC()).AEQbTJ.setFooterAvaValue(str);
        c53273wiQ.QfsBiF();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53273wiQ c53273wiQ, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = c53273wiQ.finit().AuCTel();
        java.lang.String algoId = strategyResponse.getAlgoId();
        c56126xwtAuCTel.KWHzl(C56390yDp.OLrzqt("spot_dca", algoId != null ? algoId : ""));
        xDM xdmCopydefault = c53273wiQ.ejfBZ().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        c53273wiQ.fJNWhG();
        c53273wiQ.KWHzl(((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue(), (android.os.Bundle) null, false);
        c53273wiQ.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53273wiQ c53273wiQ, SpotDcaAdvancedParams spotDcaAdvancedParams) {
        Intrinsics.checkNotNullParameter(spotDcaAdvancedParams, "");
        c53273wiQ.QfsBiF();
        c53273wiQ.QOLQEE();
        c53273wiQ.AuCTel();
        c53273wiQ.OcIXYQ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C53273wiQ c53273wiQ, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "spot_dca", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    private final void QUSxYX() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wiX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53273wiQ.OLrzqt(this.EZpvd, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wjb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53273wiQ.copydefault(this.copydefault, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C53273wiQ c53273wiQ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = c53273wiQ.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C53273wiQ c53273wiQ, java.lang.String str, android.os.Bundle bundle) {
        android.os.Bundle arguments;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c53273wiQ.fJNWhG();
        buildInputParams$default(c53273wiQ, ((SpotDcaManualPresenter) c53273wiQ.dxcTrN()).KWHzl().getValue(), bundle, false, 4, null);
        android.os.Parcelable parcelable = bundle.getParcelable("bot_copy_req");
        DcaOrderReq dcaOrderReq = parcelable instanceof DcaOrderReq ? (DcaOrderReq) parcelable : null;
        if (dcaOrderReq == null || (arguments = c53273wiQ.getArguments()) == null) {
            return;
        }
        arguments.putParcelable("bot_copy_req", dcaOrderReq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QbewEr() {
        StrategyConfigInfo value = ((SpotDcaManualPresenter) dxcTrN()).KWHzl().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((AbstractC50752vaA) gGvvIC()).iwGUEr;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, value, (30 & 2) != 0 ? false : false, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : null);
    }

    public static /* synthetic */ void fillWithConfigInfo$default(C53273wiQ c53273wiQ, StrategyConfigInfo strategyConfigInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyConfigInfo = null;
        }
        c53273wiQ.KWHzl(strategyConfigInfo);
    }

    private final void KWHzl(StrategyConfigInfo strategyConfigInfo) {
        buildInputParams$default(this, strategyConfigInfo, getArguments(), false, 4, null);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.remove("bot_copy_req");
        }
        AuCTel();
    }

    public static /* synthetic */ void buildInputParams$default(C53273wiQ c53273wiQ, StrategyConfigInfo strategyConfigInfo, android.os.Bundle bundle, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c53273wiQ.KWHzl(strategyConfigInfo, bundle, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v26, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(StrategyConfigInfo strategyConfigInfo, android.os.Bundle bundle, boolean z) {
        BotRangeConfig pxSteps;
        java.lang.String pxSteps2;
        BotRangeConfig tpPct;
        java.lang.String tpPct2;
        java.lang.String str;
        java.lang.String min;
        java.lang.String max;
        java.lang.String min2;
        java.lang.String max2;
        BotRangeConfig maxSafetyOrds;
        BotRangeConfig botRangeConfig;
        BotRangeConfig tpPct3;
        BotRangeConfig tpPct4;
        BotRangeConfig pxSteps3;
        BotRangeConfig pxSteps4;
        BotRangeConfig maxSafetyOrds2;
        DcaOrderReq dcaOrderReq = bundle != null ? (DcaOrderReq) bundle.getParcelable("bot_copy_req") : null;
        if (!(dcaOrderReq instanceof DcaOrderReq)) {
            dcaOrderReq = null;
        }
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getPxSteps() : null, 0)) {
            pxSteps2 = dcaOrderReq != null ? dcaOrderReq.getPxSteps() : null;
        } else if (strategyConfigInfo != null && (pxSteps = strategyConfigInfo.getPxSteps()) != null) {
            pxSteps2 = pxSteps.getDefault();
        }
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getTpPct() : null, 0)) {
            tpPct2 = dcaOrderReq != null ? dcaOrderReq.getTpPct() : null;
        } else if (strategyConfigInfo != null && (tpPct = strategyConfigInfo.getTpPct()) != null) {
            tpPct2 = tpPct.getDefault();
        }
        java.lang.String maxSafetyOrds3 = dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null;
        if (strategyConfigInfo == null || (maxSafetyOrds2 = strategyConfigInfo.getMaxSafetyOrds()) == null || (str = maxSafetyOrds2.getDefault()) == null) {
            str = "";
        }
        java.lang.String str2 = (maxSafetyOrds3 == null || maxSafetyOrds3.length() == 0) ? str : maxSafetyOrds3;
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = ((AbstractC50752vaA) gGvvIC()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        xMR xmr = xMR.copydefault;
        if (strategyConfigInfo == null || (pxSteps4 = strategyConfigInfo.getPxSteps()) == null || (min = pxSteps4.getMin()) == null) {
            min = "0.002";
        }
        java.lang.String hundredfold$default = xMR.formatHundredfold$default(xmr, min, 0, false, null, 14, null);
        if (strategyConfigInfo == null || (pxSteps3 = strategyConfigInfo.getPxSteps()) == null || (max = pxSteps3.getMax()) == null) {
            max = "0.1";
        }
        c52658wTo.copydefault(c47988uAv, new BotRangeConfig(hundredfold$default, xMR.formatHundredfold$default(xmr, max, 0, false, null, 14, null), xMR.formatHundredfold$default(xmr, pxSteps2 == null ? "" : pxSteps2, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wiZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.gEmmrt((java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv2 = ((AbstractC50752vaA) gGvvIC()).getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        if (strategyConfigInfo == null || (tpPct4 = strategyConfigInfo.getTpPct()) == null || (min2 = tpPct4.getMin()) == null) {
            min2 = "0.005";
        }
        java.lang.String hundredfold$default2 = xMR.formatHundredfold$default(xmr, min2, 0, false, null, 14, null);
        if (strategyConfigInfo == null || (tpPct3 = strategyConfigInfo.getTpPct()) == null || (max2 = tpPct3.getMax()) == null) {
            max2 = "10";
        }
        c52658wTo.copydefault(c47988uAv2, new BotRangeConfig(hundredfold$default2, xMR.formatHundredfold$default(xmr, max2, 0, false, null, 14, null), xMR.formatHundredfold$default(xmr, tpPct2 == null ? "" : tpPct2, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wiY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.djBIcL((java.lang.String) obj);
            }
        });
        if ((strategyConfigInfo != null ? strategyConfigInfo.getMaxSafetyOrds() : null) == null) {
            maxSafetyOrds = new BotRangeConfig("1", "20", str2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null);
        } else {
            maxSafetyOrds = strategyConfigInfo.getMaxSafetyOrds();
            if (maxSafetyOrds != null) {
                maxSafetyOrds.setDefault(str2);
            } else {
                botRangeConfig = null;
                C47988uAv c47988uAv3 = ((AbstractC50752vaA) gGvvIC()).AuCTel;
                Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
                c52658wTo.copydefault(c47988uAv3, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wjg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53273wiQ.AhwBna((java.lang.String) obj);
                    }
                });
                ((AbstractC50752vaA) gGvvIC()).fetchVPNInfo.setChecked(!(dcaOrderReq != null ? Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.FALSE) : false));
                ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ(((SpotDcaManualPresenter) dxcTrN()).copydefault(dcaOrderReq));
                ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ(dcaOrderReq == null ? dcaOrderReq.getSystemSource() : null);
                ((SpotDcaManualPresenter) dxcTrN()).EZpvd(dcaOrderReq != null ? dcaOrderReq.getNmpUnderlyingId() : null);
            }
        }
        botRangeConfig = maxSafetyOrds;
        C47988uAv c47988uAv32 = ((AbstractC50752vaA) gGvvIC()).AuCTel;
        Intrinsics.checkNotNullExpressionValue(c47988uAv32, "");
        c52658wTo.copydefault(c47988uAv32, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.AhwBna((java.lang.String) obj);
            }
        });
        ((AbstractC50752vaA) gGvvIC()).fetchVPNInfo.setChecked(!(dcaOrderReq != null ? Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.FALSE) : false));
        ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ(((SpotDcaManualPresenter) dxcTrN()).copydefault(dcaOrderReq));
        ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ(dcaOrderReq == null ? dcaOrderReq.getSystemSource() : null);
        ((SpotDcaManualPresenter) dxcTrN()).EZpvd(dcaOrderReq != null ? dcaOrderReq.getNmpUnderlyingId() : null);
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    public static final java.lang.String AhwBna(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected(java.lang.String str) {
        android.widget.TextView textView = ((AbstractC50752vaA) gGvvIC()).getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        ((AbstractC50752vaA) gGvvIC()).getNewProxyInstance.setText(str);
        C47988uAv.setInputErrorMsg$default(((AbstractC50752vaA) gGvvIC()).ejfBZ, null, 1, null);
        C47988uAv.setInputErrorMsg$default(((AbstractC50752vaA) gGvvIC()).AuCTel, null, 1, null);
    }

    public static final void copydefault(C53273wiQ c53273wiQ, android.view.View view, android.view.View view2) {
        C49960uyR.setWindowSoftInput$default(c53273wiQ, view, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), view2, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        C47988uAv c47988uAv = ((AbstractC50752vaA) gGvvIC()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        C47988uAv c47988uAv2 = ((AbstractC50752vaA) gGvvIC()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        copydefault(this, c47988uAv, c47988uAv2);
        C47988uAv c47988uAv3 = ((AbstractC50752vaA) gGvvIC()).getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
        C47988uAv c47988uAv4 = ((AbstractC50752vaA) gGvvIC()).getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
        copydefault(this, c47988uAv3, c47988uAv4);
        C47988uAv c47988uAv5 = ((AbstractC50752vaA) gGvvIC()).fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c47988uAv5, "");
        C47988uAv c47988uAv6 = ((AbstractC50752vaA) gGvvIC()).fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c47988uAv6, "");
        copydefault(this, c47988uAv5, c47988uAv6);
        C47988uAv c47988uAv7 = ((AbstractC50752vaA) gGvvIC()).fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c47988uAv7, "");
        C47988uAv c47988uAv8 = ((AbstractC50752vaA) gGvvIC()).fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c47988uAv8, "");
        copydefault(this, c47988uAv7, c47988uAv8);
        C47988uAv c47988uAv9 = ((AbstractC50752vaA) gGvvIC()).AuCTel;
        Intrinsics.checkNotNullExpressionValue(c47988uAv9, "");
        C47988uAv c47988uAv10 = ((AbstractC50752vaA) gGvvIC()).AuCTel;
        Intrinsics.checkNotNullExpressionValue(c47988uAv10, "");
        copydefault(this, c47988uAv9, c47988uAv10);
    }

    private final void values() {
        for (C47988uAv c47988uAv : getNewProxyInstance()) {
            c47988uAv.setOnTextChangeCallback(this.isConnected);
            c47988uAv.setOnFocusChangeCallback(this.gEmmrt);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QfsBiF() {
        java.lang.String strAkhnZx = ((AbstractC50752vaA) gGvvIC()).fJNWhG.AkhnZx();
        java.lang.String strAkhnZx2 = ((AbstractC50752vaA) gGvvIC()).fIwbmz.AkhnZx();
        java.lang.String strAkhnZx3 = ((AbstractC50752vaA) gGvvIC()).AuCTel.AkhnZx();
        SpotDcaManualPresenter spotDcaManualPresenter = (SpotDcaManualPresenter) dxcTrN();
        MaxAvailableResp maxAvailableResp = ejfBZ().AEQbTJ().get();
        spotDcaManualPresenter.copydefault(strAkhnZx, strAkhnZx3, strAkhnZx2, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter.calculateMinSafetyOrder$default(com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter, java.lang.String, java.lang.String, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QOLQEE() {
        if (((SpotDcaManualPresenter) dxcTrN()).fJNWhG()) {
            return;
        }
        java.lang.String strCalculateMinSafetyOrder$default = SpotDcaManualPresenter.calculateMinSafetyOrder$default((SpotDcaManualPresenter) dxcTrN(), ((AbstractC50752vaA) gGvvIC()).AuCTel.AkhnZx(), null, 2, null);
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = ((AbstractC50752vaA) gGvvIC()).fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c52658wTo.copydefault(c47988uAv, null, (8 & 4) != 0 ? null : ((SpotDcaManualPresenter) dxcTrN()).AEQbTJ(strCalculateMinSafetyOrder$default, RoundingMode.UP), (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.AYXKKw((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String AYXKKw(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        ejfBZ().EZpvd("spot_dca", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ((SpotDcaManualPresenter) dxcTrN()).fvQaOB(), (64 & 128) == 0 ? null : null);
        if (z) {
            fJNWhG();
            QVAiDq();
            ((SpotDcaManualPresenter) dxcTrN()).copydefault();
            QKVWgx();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        C47988uAv.setInputContent$default(((AbstractC50752vaA) gGvvIC()).fJNWhG, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((AbstractC50752vaA) gGvvIC()).fIwbmz, "", false, false, 6, null);
        ((SpotDcaManualPresenter) dxcTrN()).getFieldNames();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QVAiDq() {
        if (((SpotDcaManualPresenter) dxcTrN()).fvQaOB().AhwBna() == null) {
            return;
        }
        int iValues = ((SpotDcaManualPresenter) dxcTrN()).fvQaOB().values();
        ((AbstractC50752vaA) gGvvIC()).AEQbTJ.setTransferCoin(((SpotDcaManualPresenter) dxcTrN()).fvQaOB().copydefault("spot_dca"));
        ((AbstractC50752vaA) gGvvIC()).fJNWhG.setInputUnit(AubY());
        ((AbstractC50752vaA) gGvvIC()).fJNWhG.setMaxDecimal(iValues);
        ((AbstractC50752vaA) gGvvIC()).fIwbmz.setInputUnit(AubY());
        ((AbstractC50752vaA) gGvvIC()).fIwbmz.setMaxDecimal(iValues);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C53273wiQ c53273wiQ, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        c53273wiQ.QfsBiF();
        if (Intrinsics.EZpvd(c47988uAv, ((AbstractC50752vaA) c53273wiQ.gGvvIC()).ejfBZ) || Intrinsics.EZpvd(c47988uAv, ((AbstractC50752vaA) c53273wiQ.gGvvIC()).getFieldNames)) {
            c53273wiQ.AuCTel();
        } else if (Intrinsics.EZpvd(c47988uAv, ((AbstractC50752vaA) c53273wiQ.gGvvIC()).AuCTel)) {
            c53273wiQ.QOLQEE();
            c53273wiQ.zuBGHE();
            c53273wiQ.AuCTel();
        }
        c53273wiQ.OcIXYQ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zuBGHE() {
        C55320xhi c55320xhiKWHzl;
        boolean z;
        java.lang.String strAkhnZx = ((AbstractC50752vaA) gGvvIC()).AuCTel.AkhnZx();
        java.util.Iterator it = C56424yEw.gEmmrt(C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).ejfBZ, C56402yEa.EZpvd("0")), C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).fIwbmz, C56402yEa.EZpvd("0"))).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd(it2.next(), (java.lang.Object) strAkhnZx)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            boolean z2 = true ^ z;
            C47988uAv.setInputLayoutState$default((C47988uAv) entry.getKey(), z2 ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
            if (!z2) {
                ((C47988uAv) entry.getKey()).copydefault();
            }
        }
        boolean z3 = (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "1")) ? false : true;
        ((AbstractC50752vaA) gGvvIC()).fetchVPNInfo.setEnabled(z3);
        C55312xha c55312xhaValueOf = ((AbstractC50752vaA) gGvvIC()).uzCIH.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextColor(C33070mpX.copydefault(z3 ? C32113mPz.ActionBar.zLjUOn : C32113mPz.ActionBar.getFieldNames));
        }
        if (!((AbstractC50752vaA) gGvvIC()).fetchVPNInfo.isChecked()) {
            android.widget.TextView textView = ((AbstractC50752vaA) gGvvIC()).fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z3 ? 0 : 8);
            ConstraintLayout constraintLayout = ((AbstractC50752vaA) gGvvIC()).isConnected;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z3 ? 0 : 8);
        }
        ((AbstractC50752vaA) gGvvIC()).KWHzl.setAppendEnable(z3);
    }

    public static final Unit KWHzl(C53273wiQ c53273wiQ, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && c47988uAv.AkhnZx().length() > 0) {
            C52658wTo.AEQbTJ.OLrzqt(c47988uAv, c53273wiQ.OLrzqt(c47988uAv));
            c53273wiQ.KWHzl(c47988uAv);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String OLrzqt(C47988uAv c47988uAv) {
        return (Intrinsics.EZpvd(c47988uAv, ((AbstractC50752vaA) gGvvIC()).ejfBZ) || Intrinsics.EZpvd(c47988uAv, ((AbstractC50752vaA) gGvvIC()).getFieldNames)) ? "%" : c47988uAv.fARcdN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fetchVPNInfo() {
        java.util.List<C47988uAv> newProxyInstance = getNewProxyInstance();
        java.util.ArrayList<C47988uAv> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : newProxyInstance) {
            if (((C47988uAv) obj).isConnected() == InputLayoutState.NORMAL) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        for (C47988uAv c47988uAv : arrayList) {
            if (c47988uAv.AkhnZx().length() != 0) {
                C52658wTo.AEQbTJ.OLrzqt(c47988uAv, OLrzqt(c47988uAv));
                if (z && !c47988uAv.hDKMBd()) {
                    c47988uAv.zsXlph();
                    z = false;
                }
            } else if (z) {
                c47988uAv.zsXlph();
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.Map<C47988uAv, java.lang.String> getFieldNames() {
        if (giSNqX()) {
            return C56424yEw.gEmmrt(C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).ejfBZ, "price_step"), C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).getFieldNames, "tp_target"), C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).fJNWhG, "initial_margin"), C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).fIwbmz, "safety_margin"), C56390yDp.OLrzqt(((AbstractC50752vaA) gGvvIC()).AuCTel, "safety_orders"));
        }
        return C56424yEw.KWHzl();
    }

    private final C53519wmy fIwbmz() {
        return (C53519wmy) this.AhwBna.getValue();
    }

    public static final C53519wmy isConnected(C53273wiQ c53273wiQ) {
        return new C53519wmy(c53273wiQ.getFieldNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<C47988uAv> getNewProxyInstance() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(getFieldNames().keySet());
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        iwGUEr().OLrzqt();
        zsXlph().OLrzqt();
        fIwbmz().EZpvd();
        QKVWgx();
        copydefault(this.fARcdN);
    }

    /* JADX INFO: renamed from: o.wiQ$FragmentManager */
    public static final class FragmentManager extends Observable.OnPropertyChangedCallback {
        public FragmentManager() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C53273wiQ c53273wiQ = C53273wiQ.this;
            c53273wiQ.fetchVPNInfo(c53273wiQ.AubY());
        }
    }

    private final void copydefault(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBL ubl = this.fJNWhG;
        if (ubl == null) {
            Intrinsics.gEmmrt("");
            ubl = null;
        }
        uBP ubpCopydefault = ubl.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.EZpvd(onPropertyChangedCallback);
        }
    }

    private final void EZpvd(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBL ubl = this.fJNWhG;
        if (ubl == null) {
            Intrinsics.gEmmrt("");
            ubl = null;
        }
        uBP ubpCopydefault = ubl.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.copydefault(onPropertyChangedCallback);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        ((SpotDcaManualPresenter) dxcTrN()).fvQaOB().gEmmrt(AubY());
        BizInstrument bizInstrumentAYXKKw = AYXKKw();
        if (bizInstrumentAYXKKw != null) {
            java.lang.String strAubY = AubY();
            uBL ubl = this.fJNWhG;
            uBL ubl2 = null;
            if (ubl == null) {
                Intrinsics.gEmmrt("");
                ubl = null;
            }
            ubl.setFm(getChildFragmentManager());
            uBL ubl3 = this.fJNWhG;
            if (ubl3 == null) {
                Intrinsics.gEmmrt("");
                ubl3 = null;
            }
            ubl3.copydefault(this, bizInstrumentAYXKKw, TradeType.BUY_OPEN, false);
            uBL ubl4 = this.fJNWhG;
            if (ubl4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ubl2 = ubl4;
            }
            ubl2.setVisibility(bizInstrumentAYXKKw.isDisplayTradeReceive() ? 0 : 8);
            if (Intrinsics.EZpvd((java.lang.Object) strAubY, (java.lang.Object) AubY())) {
                return;
            }
            fetchVPNInfo(AubY());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo(java.lang.String str) {
        ((SpotDcaManualPresenter) dxcTrN()).fvQaOB().gEmmrt(str);
        DTwDnp();
        QfsBiF();
        QVAiDq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AubY() {
        uBL ubl = this.fJNWhG;
        if (ubl == null) {
            Intrinsics.gEmmrt("");
            ubl = null;
        }
        return ubl.OLrzqt();
    }

    public final BizInstrument AYXKKw() {
        return AuCTelauCTel().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        ejfBZ().AYXKKw();
        ejfBZ().EZpvd("spot_dca", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : ((SpotDcaManualPresenter) dxcTrN()).fvQaOB(), (64 & 128) == 0 ? null : null);
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        ejfBZ().AYXKKw();
        fIwbmz().copydefault();
        EZpvd(this.fARcdN);
    }

    private final void KWHzl(C47988uAv c47988uAv) {
        final java.lang.String orDefault = getFieldNames().getOrDefault(c47988uAv, "");
        C32866mlf.onEvent$default("DCABotPlaceOrder_Full_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.wja
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53273wiQ.KWHzl(orDefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "spot_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        java.util.List<DcaTriggerParam> listAYXKKw;
        DcaTriggerParam dcaTriggerParam;
        BigDecimal bigDecimalCopydefault;
        java.lang.String strEZpvd;
        BigDecimal bigDecimalEZpvd;
        BigDecimal bigDecimalNegate;
        androidx.fragment.app.Fragment fragmentDbNXlk = fARcdN().DbNXlk();
        if (fragmentDbNXlk == null) {
            return;
        }
        SpotDcaManualPresenter spotDcaManualPresenter = (SpotDcaManualPresenter) dxcTrN();
        java.lang.String strAkhnZx = ((AbstractC50752vaA) gGvvIC()).fJNWhG.AkhnZx();
        C47988uAv c47988uAv = ((AbstractC50752vaA) gGvvIC()).fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        java.lang.String strCopydefault = copydefault(c47988uAv);
        C47988uAv c47988uAv2 = ((AbstractC50752vaA) gGvvIC()).ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        Triple<BotOrderItem, java.util.ArrayList<BotOrderItem>, DcaPreviewData> tripleEZpvd = spotDcaManualPresenter.EZpvd(strAkhnZx, strCopydefault, copydefault(c47988uAv2), ((AbstractC50752vaA) gGvvIC()).AuCTel.AkhnZx(), ((AbstractC50752vaA) gGvvIC()).getFieldNames.AkhnZx());
        BotOrderItem botOrderItemComponent1 = tripleEZpvd.component1();
        java.util.ArrayList<BotOrderItem> arrayListComponent2 = tripleEZpvd.component2();
        DcaPreviewData dcaPreviewDataComponent3 = tripleEZpvd.component3();
        SpotDcaAdvancedParams value = ((SpotDcaManualPresenter) dxcTrN()).valueOf().getValue();
        java.lang.String triggerPx = null;
        BigDecimal bigDecimalAdd = (value == null || (strEZpvd = value.EZpvd()) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strEZpvd)) == null || (bigDecimalNegate = bigDecimalEZpvd.negate()) == null) ? null : bigDecimalNegate.add(BigDecimal.ONE);
        BigDecimal bigDecimalMultiply = (bigDecimalAdd == null || dcaPreviewDataComponent3 == null || (bigDecimalCopydefault = dcaPreviewDataComponent3.copydefault()) == null) ? null : bigDecimalCopydefault.multiply(bigDecimalAdd);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(dcaPreviewDataComponent3 != null ? dcaPreviewDataComponent3.AYXKKw() : null);
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(bigDecimalMultiply);
            if (value != null && (listAYXKKw = value.AYXKKw()) != null && (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw)) != null) {
                triggerPx = dcaTriggerParam.getTriggerPx();
            }
            oka.AEQbTJ(fragmentDbNXlk, new IBotOrdersDataBean("contract_dca", null, arrayListComponent2, null, null, strGEmmrt, strGEmmrt2, null, triggerPx == null ? "" : triggerPx, botOrderItemComponent1, null, 1178, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.util.List<SmartRecommendResp> list) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            StgyParam stgyParam = ((SmartRecommendResp) next).getStgyParam();
            if (Intrinsics.EZpvd(stgyParam != null ? stgyParam.getUserRiskMode() : null, (java.lang.Object) SpotDcaRiskModeData.MODERATE.getMode())) {
                obj = next;
                break;
            }
        }
        SmartRecommendResp smartRecommendResp = (SmartRecommendResp) obj;
        if (smartRecommendResp != null) {
            StrategyConfigInfo value = ((SpotDcaManualPresenter) dxcTrN()).KWHzl().getValue();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_copy_req", BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp));
            Unit unit = Unit.INSTANCE;
            KWHzl(value, bundle, false);
        }
    }
}
