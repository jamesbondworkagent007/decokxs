package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
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
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.BotOrderItem;
import com.okinc.kline.api.bean.IBotOrdersDataBean;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.tradingbot.impl.order.strategy.common.CommonDcaManualViewModel;
import com.okinc.tradingbot.impl.order.strategy.contractdca.model.ContractDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaBasePresenter;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$initObserve$1;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractLeverTierLimitResult;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.DcaLeadShareMode;
import com.okinc.unify_trade.bot.config.SpotDcaRiskModeData;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.util.dca.DcaPreviewData;
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
import o.C48033uCm;
import o.C53274wiR;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vEm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C50170vEm extends AbstractC50187vFc<AbstractC50778vaa, ContractDcaManualPresenter> {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final Function2<C47988uAv, java.lang.String, Unit> AhwBna;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final int djBIcL = C48033uCm.Activity.HJWChPOZOJIj;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.vEm$PictureInPictureParams */
    public static final /* synthetic */ class PictureInPictureParams implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC50778vaa DbNXlk(C50170vEm c50170vEm) {
        return (AbstractC50778vaa) c50170vEm.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractDcaManualPresenter values(C50170vEm c50170vEm) {
        return (ContractDcaManualPresenter) c50170vEm.dxcTrN();
    }

    public C50170vEm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CommonDcaManualViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$7
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$viewModels$default$10
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.fragment.ContractDcaManualFragment$special$$inlined$activityViewModels$default$3
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.isConnected(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.fIwbmz(this.copydefault);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.fJNWhG(this.OLrzqt);
            }
        });
        this.AhwBna = new Function2() { // from class: o.vEK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50170vEm.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.EZpvd = new Function2() { // from class: o.vEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50170vEm.OLrzqt(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.AkhnZx(this.AEQbTJ);
            }
        });
    }

    public final CommonDcaManualViewModel fARcdN() {
        return (CommonDcaManualViewModel) this.gEmmrt.getValue();
    }

    public final C55915xsu djBIcL() {
        return (C55915xsu) this.KWHzl.getValue();
    }

    public final BotTradePresenter values() {
        return (BotTradePresenter) this.OLrzqt.getValue();
    }

    public static final C53518wmx isConnected(C50170vEm c50170vEm) {
        android.content.Context contextRequireContext = c50170vEm.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    public final C53518wmx isConnected() {
        return (C53518wmx) this.AEQbTJ.getValue();
    }

    public final C53518wmx fJNWhG() {
        return (C53518wmx) this.valueOf.getValue();
    }

    public static final C53518wmx fIwbmz(C50170vEm c50170vEm) {
        android.content.Context contextRequireContext = c50170vEm.requireContext();
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

    public final C7773aqE AuCTel() {
        return (C7773aqE) this.AYXKKw.getValue();
    }

    public static final C7773aqE fJNWhG(C50170vEm c50170vEm) {
        C7773aqE c7773aqE = new C7773aqE(c50170vEm.getContext());
        c7773aqE.addView(c50170vEm.fJNWhG());
        c7773aqE.addView(c50170vEm.isConnected());
        c7773aqE.setOrientation(0);
        return c7773aqE;
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public C7773aqE gEmmrt() {
        return AuCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        OcIXYQ();
        sSMYrx();
        ejfBZ();
        ORxRYg();
        QOLQEE();
        AEQbTJ();
        values().EZpvd(new Function0() { // from class: o.vEH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.AuCTel(this.KWHzl);
            }
        });
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        BizInstrument bizInstrumentAhwBna = ((ContractDcaManualPresenter) dxcTrN()).fvQaOB().AhwBna();
        java.lang.String instId = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstId() : null;
        c55867xrz.OLrzqt("contract_dca", instId != null ? instId : "");
        AEQbTJ(true);
    }

    public static final Unit AuCTel(C50170vEm c50170vEm) {
        c50170vEm.hDKMBd();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "ContractDcaManualFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        ((AbstractC50778vaa) gGvvIC()).uzCIH.setMaxDecimal(2);
        ((AbstractC50778vaa) gGvvIC()).zsXlph.setMaxDecimal(2);
        ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.setMaxDecimal(0);
        ((AbstractC50778vaa) gGvvIC()).values.setOnLeverChangeCallback(new Function1() { // from class: o.vEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.DbNXlk(this.KWHzl, (java.lang.String) obj);
            }
        });
        ((AbstractC50778vaa) gGvvIC()).KWHzl.KWHzl();
        ((AbstractC50778vaa) gGvvIC()).fIwbmz.setText("--");
        ((AbstractC50778vaa) gGvvIC()).AhwBna.setFooterAvaValue("--");
        boolean zAwvSrB = ((ContractDcaManualPresenter) dxcTrN()).AwvSrB();
        ((AbstractC50778vaa) gGvvIC()).copydefault.setChecked(zAwvSrB);
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(zAwvSrB ? 0 : 8);
        C53513wms c53513wms = ((AbstractC50778vaa) gGvvIC()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c53513wms, "");
        c53513wms.setVisibility(C48291uMa.Companion.AEQbTJ().KWHzl() ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.vEm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50170vEm KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50170vEm c50170vEm) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.OEgNct), java.lang.Integer.valueOf(C55688xof.Application.UfveVb), java.lang.Integer.valueOf(C55688xof.Application.OijiEz));
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault2 = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.Dap), java.lang.Integer.valueOf(C55688xof.Application.sIqKDg), java.lang.Integer.valueOf(C55688xof.Application.aeJQwa));
                C53274wiR.StateListAnimator stateListAnimator = C53274wiR.Companion;
                java.lang.String string = this.KWHzl.requireActivity().getString(C55688xof.Application.NRYds);
                ContractDcaManualPresenter contractDcaManualPresenterValues = C50170vEm.values(this.KWHzl);
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.AEQbTJ(string, contractDcaManualPresenterValues.OLrzqt(fragmentActivityRequireActivity, arrayListCopydefault, arrayListCopydefault2)).show(this.KWHzl.getChildFragmentManager(), C56524yIo.AEQbTJ(C53273wiQ.class).valueOf());
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50170vEm KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50170vEm c50170vEm) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C53518wmx c53518wmx = (C53518wmx) this.OLrzqt;
                boolean z = (this.KWHzl.KWHzl() && this.KWHzl.EZpvd()) ? false : true;
                C49967uyY.EZpvd.KWHzl(c53518wmx, C48033uCm.Application.fvQaOB, this.KWHzl.zuBGHE());
                if (z) {
                    return;
                }
                if (Intrinsics.EZpvd(C50170vEm.values(this.KWHzl).getNewProxyInstance().getValue(), java.lang.Boolean.TRUE)) {
                    C56002xub.KWHzl.OLrzqt();
                    return;
                }
                ContractDcaManualPresenter contractDcaManualPresenterValues = C50170vEm.values(this.KWHzl);
                C50170vEm c50170vEm = this.KWHzl;
                C47988uAv c47988uAv = C50170vEm.DbNXlk(c50170vEm).uzCIH;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                java.lang.String strOLrzqt = c50170vEm.OLrzqt(c47988uAv);
                java.lang.String strAkhnZx = C50170vEm.DbNXlk(this.KWHzl).zsXlph.AkhnZx();
                java.lang.String strAkhnZx2 = C50170vEm.DbNXlk(this.KWHzl).getFieldNames.AkhnZx();
                C50170vEm c50170vEm2 = this.KWHzl;
                C47988uAv c47988uAv2 = C50170vEm.DbNXlk(c50170vEm2).zLjUOn;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                java.lang.String strOLrzqt2 = c50170vEm2.OLrzqt(c47988uAv2);
                java.lang.String strAkhnZx3 = C50170vEm.DbNXlk(this.KWHzl).getNewProxyInstance.AkhnZx();
                java.lang.String strOLrzqt3 = C50170vEm.DbNXlk(this.KWHzl).fARcdN.OLrzqt();
                TradeMenuItemBean tradeMenuItemBeanKWHzl = C50170vEm.DbNXlk(this.KWHzl).fARcdN.KWHzl();
                java.lang.Object data = tradeMenuItemBeanKWHzl != null ? tradeMenuItemBeanKWHzl.getData() : null;
                java.lang.String str = data instanceof java.lang.String ? (java.lang.String) data : null;
                boolean zIsChecked = C50170vEm.DbNXlk(this.KWHzl).copydefault.isChecked();
                java.lang.String strAkhnZx4 = C50170vEm.DbNXlk(this.KWHzl).EZpvd.AkhnZx();
                boolean zIsChecked2 = C50170vEm.DbNXlk(this.KWHzl).iwGUEr.isChecked();
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                contractDcaManualPresenterValues.EZpvd(strOLrzqt, strAkhnZx, strAkhnZx2, strOLrzqt2, strAkhnZx3, strOLrzqt3, str, zIsChecked, strAkhnZx4, zIsChecked2, childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50170vEm KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50170vEm c50170vEm) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.Integer[] numArr = new java.lang.Integer[2];
                numArr[0] = java.lang.Integer.valueOf(Intrinsics.EZpvd((java.lang.Object) C50170vEm.values(this.KWHzl).OLrzqt().getValue(), (java.lang.Object) "long") ? C55688xof.Application.gqOnQv : C55688xof.Application.hfdhUn);
                numArr[1] = java.lang.Integer.valueOf(C55688xof.Application.zDGrpR);
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault = yDY.copydefault(numArr);
                java.util.ArrayList<java.lang.Integer> arrayListCopydefault2 = yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.v), java.lang.Integer.valueOf(C55688xof.Application.GCXiNH));
                C53274wiR.StateListAnimator stateListAnimator = C53274wiR.Companion;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GFUIi);
                ContractDcaManualPresenter contractDcaManualPresenterValues = C50170vEm.values(this.KWHzl);
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                stateListAnimator.AEQbTJ(strAYXKKw, contractDcaManualPresenterValues.OLrzqt(fragmentActivityRequireActivity, arrayListCopydefault, arrayListCopydefault2)).show(this.KWHzl.getChildFragmentManager(), C56524yIo.AEQbTJ(C53273wiQ.class).valueOf());
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50170vEm EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C50170vEm c50170vEm) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.OLrzqt(C48033uCm.Fragment.fsSxsn, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.OLrzqt(C48033uCm.Fragment.gUEfcq, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), (View.OnClickListener) new TaskStackBuilder(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50170vEm OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50170vEm c50170vEm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c50170vEm;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.vFe.showSelectLeverDialog$default(o.vFe, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, androidx.fragment.app.FragmentManager, java.lang.String, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            BotRangeConfig lever;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C50189vFe c50189vFe = (C50189vFe) this.KWHzl;
                java.lang.String strGEmmrt = C50170vEm.values(this.OLrzqt).fvQaOB().gEmmrt();
                java.lang.String strDjBIcL = C50170vEm.values(this.OLrzqt).fvQaOB().djBIcL();
                StrategyConfigInfo value = C50170vEm.values(this.OLrzqt).valueOf().getValue();
                java.lang.String min = null;
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = C50170vEm.values(this.OLrzqt).valueOf().getValue();
                if (value2 != null && (lever = value2.getLever()) != null) {
                    min = lever.getMin();
                }
                java.lang.String value3 = C50170vEm.values(this.OLrzqt).OLrzqt().getValue();
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c50189vFe.copydefault(strGEmmrt, strDjBIcL, leveragePercents, min, (16 & 16) != 0 ? null : null, value3, "cross", childFragmentManager, "contract_dca");
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50170vEm OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C50170vEm c50170vEm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.getString(C55688xof.Application.sYcwUD));
                java.lang.String string = this.OLrzqt.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Dialog(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50170vEm KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C50170vEm c50170vEm) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C53274wiR c53274wiRAEQbTJ = C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DuXjdv), C50170vEm.values(this.KWHzl).fIwbmz());
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53274wiRAEQbTJ.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50170vEm OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50170vEm c50170vEm) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C53518wmx c53518wmx = (C53518wmx) this.KWHzl;
                boolean z = (this.OLrzqt.KWHzl() && this.OLrzqt.EZpvd()) ? false : true;
                C49967uyY.EZpvd.KWHzl(c53518wmx, C48033uCm.Application.fvQaOB, this.OLrzqt.zuBGHE());
                if (z) {
                    return;
                }
                AbstractC50778vaa abstractC50778vaaDbNXlk = C50170vEm.DbNXlk(this.OLrzqt);
                ContractDcaManualPresenter contractDcaManualPresenterValues = C50170vEm.values(this.OLrzqt);
                java.lang.String strAkhnZx = abstractC50778vaaDbNXlk.getFieldNames.AkhnZx();
                C50170vEm c50170vEm = this.OLrzqt;
                C47988uAv c47988uAv = abstractC50778vaaDbNXlk.zLjUOn;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                java.lang.String strOLrzqt = c50170vEm.OLrzqt(c47988uAv);
                C50170vEm c50170vEm2 = this.OLrzqt;
                C47988uAv c47988uAv2 = abstractC50778vaaDbNXlk.uzCIH;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                this.OLrzqt.fARcdN().copydefault(contractDcaManualPresenterValues.AEQbTJ(strAkhnZx, strOLrzqt, c50170vEm2.OLrzqt(c47988uAv2), abstractC50778vaaDbNXlk.getNewProxyInstance.AkhnZx(), abstractC50778vaaDbNXlk.zsXlph.AkhnZx()));
            }
        }
    }

    /* JADX INFO: renamed from: o.vEm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50170vEm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50170vEm c50170vEm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c50170vEm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getString(C55688xof.Application.FSMca));
                java.lang.String string = this.copydefault.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new VoiceInteractor(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(C50170vEm c50170vEm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).KWHzl(str);
        c50170vEm.getNewProxyInstance();
        c50170vEm.iwGUEr();
        c50170vEm.getFieldNames();
        c50170vEm.zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        BotRangeConfig pxStepsMult;
        BotRangeConfig volMult;
        C53513wms c53513wms = ((AbstractC50778vaa) gGvvIC()).gEmmrt;
        boolean z = true;
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.uzCIH.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.zsXlph.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r0.getNewProxyInstance.AkhnZx()))) {
            StrategyConfigInfo value = ((ContractDcaManualPresenter) dxcTrN()).valueOf().getValue();
            java.lang.String str = (value == null || (volMult = value.getVolMult()) == null) ? null : volMult.getDefault();
            ContractDcaAdvancedParams value2 = ((ContractDcaManualPresenter) dxcTrN()).copydefault().getValue();
            if (!C33129mqd.AhwBna(str, value2 != null ? value2.valueOf() : null)) {
                StrategyConfigInfo value3 = ((ContractDcaManualPresenter) dxcTrN()).valueOf().getValue();
                java.lang.String str2 = (value3 == null || (pxStepsMult = value3.getPxStepsMult()) == null) ? null : pxStepsMult.getDefault();
                ContractDcaAdvancedParams value4 = ((ContractDcaManualPresenter) dxcTrN()).copydefault().getValue();
                if (!C33129mqd.AhwBna(str2, value4 != null ? value4.KWHzl() : null)) {
                    z = false;
                }
            }
        }
        c53513wms.setClear(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v23, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        ((AbstractC50778vaa) gGvvIC()).gEmmrt.setCallBack("contract_dca", new Function1() { // from class: o.vEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }, new Function0() { // from class: o.vEA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50170vEm.ejfBZ(this.copydefault);
            }
        });
        C53518wmx c53518wmxIsConnected = isConnected();
        c53518wmxIsConnected.setOnClickListener(new Activity(c53518wmxIsConnected, 1000L, this));
        C53518wmx c53518wmxFJNWhG = fJNWhG();
        c53518wmxFJNWhG.setOnClickListener(new StateListAnimator(c53518wmxFJNWhG, 1000L, this));
        C55258xgZ c55258xgZ = ((AbstractC50778vaa) gGvvIC()).AuCTelauCTel;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = ((AbstractC50778vaa) gGvvIC()).DbNXlk;
        c55258xgZ2.setOnClickListener(new ActionBar(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = ((AbstractC50778vaa) gGvvIC()).AuCTel;
        c55258xgZ3.setOnClickListener(new TaskDescription(c55258xgZ3, 1000L, this));
        ((AbstractC50778vaa) gGvvIC()).AkhnZx.setTabSelectedCallBack(new Function1() { // from class: o.vEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        });
        ((AbstractC50778vaa) gGvvIC()).AkhnZx.OLrzqt();
        C50189vFe c50189vFe = ((AbstractC50778vaa) gGvvIC()).values;
        c50189vFe.setOnClickListener(new FragmentManager(c50189vFe, 1000L, this));
        C55258xgZ c55258xgZ4 = ((AbstractC50778vaa) gGvvIC()).gHZMYf;
        c55258xgZ4.setOnClickListener(new LoaderManager(c55258xgZ4, 1000L, this));
        C55258xgZ c55258xgZ5 = ((AbstractC50778vaa) gGvvIC()).hDKMBd;
        c55258xgZ5.setOnClickListener(new Fragment(c55258xgZ5, 1000L, this));
        C55258xgZ c55258xgZ6 = ((AbstractC50778vaa) gGvvIC()).OLrzqt;
        c55258xgZ6.setOnClickListener(new PendingIntent(c55258xgZ6, 1000L, this));
        ((AbstractC50778vaa) gGvvIC()).copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C50170vEm.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit ejfBZ(C50170vEm c50170vEm) {
        java.lang.String str;
        BotRangeConfig pxStepsMult;
        java.lang.String str2;
        BotRangeConfig volMult;
        AbstractC50778vaa abstractC50778vaa = (AbstractC50778vaa) c50170vEm.gGvvIC();
        C47988uAv.setInputContent$default(abstractC50778vaa.uzCIH, "", false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC50778vaa.zsXlph, "", false, false, 6, null);
        C47988uAv.setInputContent$default(abstractC50778vaa.getNewProxyInstance, "", false, false, 6, null);
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) c50170vEm.dxcTrN();
        ContractDcaAdvancedParams value = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).copydefault().getValue();
        if (value != null) {
            StrategyConfigInfo value2 = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue();
            java.lang.String str3 = "1";
            if (value2 == null || (volMult = value2.getVolMult()) == null || (str = volMult.getDefault()) == null) {
                str = "1";
            }
            value.AEQbTJ(str);
            StrategyConfigInfo value3 = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue();
            if (value3 != null && (pxStepsMult = value3.getPxStepsMult()) != null && (str2 = pxStepsMult.getDefault()) != null) {
                str3 = str2;
            }
            value.KWHzl(str3);
        } else {
            value = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).EZpvd((DcaOrderReq) null);
        }
        contractDcaManualPresenter.EZpvd(value);
        ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).gHZMYf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vEm$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C50170vEm c50170vEm, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("FuturesDCABotPlaceOrder_Top_Direction_Click", (TrackChannel[]) null, new Function1() { // from class: o.vEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C56028xvA.OLrzqt("FuturesDCABotPlaceOrder_Top_Direction_Click", C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str)));
        ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).OLrzqt(str);
        c50170vEm.getNewProxyInstance();
        c50170vEm.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vEm$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vEm$TaskStackBuilder */
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

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C50170vEm c50170vEm, android.widget.CompoundButton compoundButton, boolean z) {
        ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).OLrzqt(z);
        C47988uAv c47988uAv = ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        if (z) {
            ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd.zsXlph();
            return;
        }
        C47988uAv.setInputContent$default(((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd, "", false, false, 6, null);
        android.content.Context context = c50170vEm.getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd);
        }
        ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd.copydefault();
        AppCompatTextView appCompatTextView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
    }

    public final java.lang.String OLrzqt(C47988uAv c47988uAv) {
        return c47988uAv.isConnected() == InputLayoutState.NORMAL ? c47988uAv.AkhnZx() : "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v51, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        C52692wUv.copydefault(fARcdN().KWHzl(), this, Lifecycle.State.CREATED, new ContractDcaManualFragment$initObserve$1(this, null));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataValueOf = ((ContractDcaManualPresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new PictureInPictureParams(new Function1() { // from class: o.vEy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.OLrzqt(this.KWHzl, (StrategyConfigInfo) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((ContractDcaManualPresenter) dxcTrN()).KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new PictureInPictureParams(new Function1() { // from class: o.vEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.EZpvd(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        ((ContractDcaManualPresenter) dxcTrN()).hDKMBd().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AEQbTJ(this.KWHzl, (Unit) obj);
            }
        }));
        ((ContractDcaManualPresenter) dxcTrN()).wlaJM().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.copydefault(this.OLrzqt, (Unit) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataZLjUOn = ((ContractDcaManualPresenter) dxcTrN()).zLjUOn();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataZLjUOn.observe(viewLifecycleOwner3, new PictureInPictureParams(new Function1() { // from class: o.vEx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.gEmmrt(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataAubY = ((ContractDcaManualPresenter) dxcTrN()).AubY();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataAubY.observe(viewLifecycleOwner4, new PictureInPictureParams(new Function1() { // from class: o.vEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AhwBna(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ = ((ContractDcaManualPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner5, new PictureInPictureParams(new Function1() { // from class: o.vEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AkhnZx(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> newProxyInstance = ((ContractDcaManualPresenter) dxcTrN()).getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        newProxyInstance.observe(viewLifecycleOwner6, new PictureInPictureParams(new Function1() { // from class: o.vEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.Boolean> c56111xweValues = ((ContractDcaManualPresenter) dxcTrN()).values();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56111xweValues.observe(viewLifecycleOwner7, new PictureInPictureParams(new Function1() { // from class: o.vEw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.KWHzl(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = djBIcL().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweAhwBna.observe(viewLifecycleOwner8, new PictureInPictureParams(new Function1() { // from class: o.vEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.values(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweGEmmrt = ((ContractDcaManualPresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweGEmmrt.observe(viewLifecycleOwner9, new PictureInPictureParams(new Function1() { // from class: o.vEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AEQbTJ(this.copydefault, (StrategyResponse) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataOLrzqt = ((ContractDcaManualPresenter) dxcTrN()).OLrzqt();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner10, new PictureInPictureParams(new Function1() { // from class: o.vES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.isConnected(this.KWHzl, (java.lang.String) obj);
            }
        }));
        TradeLiveData<Triple<java.lang.String, java.lang.Boolean, java.lang.Boolean>> fieldNames = ((ContractDcaManualPresenter) dxcTrN()).getFieldNames();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        fieldNames.observe(viewLifecycleOwner11, new PictureInPictureParams(new Function1() { // from class: o.vEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.OLrzqt(this.copydefault, (Triple) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = ((ContractDcaManualPresenter) dxcTrN()).iwGUEr().AhwBna();
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner12, new PictureInPictureParams(new Function1() { // from class: o.vEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
        TradeLiveData<ContractLeverTierLimitResult> tradeLiveDataSSMYrx = ((ContractDcaManualPresenter) dxcTrN()).sSMYrx();
        LifecycleOwner viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "");
        tradeLiveDataSSMYrx.observe(viewLifecycleOwner13, new PictureInPictureParams(new Function1() { // from class: o.vEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AEQbTJ(this.AEQbTJ, (ContractLeverTierLimitResult) obj);
            }
        }));
        TradeLiveData<ContractDcaAdvancedParams> tradeLiveDataCopydefault = ((ContractDcaManualPresenter) dxcTrN()).copydefault();
        LifecycleOwner viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner14, new PictureInPictureParams(new Function1() { // from class: o.vEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AEQbTJ(this.OLrzqt, (ContractDcaAdvancedParams) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna3 = ((ContractDcaManualPresenter) dxcTrN()).AhwBna().AhwBna();
        LifecycleOwner viewLifecycleOwner15 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner15, "");
        c56109xwcAhwBna3.observe(viewLifecycleOwner15, new Observer() { // from class: o.vFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50170vEm.AhwBna(this.OLrzqt, (java.lang.Exception) obj);
            }
        });
    }

    public static final Unit OLrzqt(C50170vEm c50170vEm, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c50170vEm.copydefault(strategyConfigInfo);
        c50170vEm.wlaJM();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50170vEm, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C50170vEm c50170vEm, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        fillWithConfigInfo$default(c50170vEm, null, 1, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c50170vEm, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50170vEm c50170vEm, Unit unit) {
        c50170vEm.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50170vEm c50170vEm, Unit unit) {
        c50170vEm.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C50170vEm c50170vEm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50170vEm.AkhnZx(str);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C50170vEm c50170vEm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50170vEm.AkhnZx(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AkhnZx(C50170vEm c50170vEm, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).AYXKKw;
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = xMR.copydefault.copydefault(str) + " " + ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).fvQaOB().fetchVPNInfo();
        } else {
            str2 = "--";
        }
        textView.setText(str2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C50170vEm c50170vEm, boolean z) {
        android.widget.TextView textView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50170vEm c50170vEm, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        java.util.Iterator<T> it = c50170vEm.zuBGHE().iterator();
        while (it.hasNext()) {
            ((C47988uAv) it.next()).copydefault();
        }
        android.widget.TextView textView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).wlaJM;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit values(C50170vEm c50170vEm, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        xMV xmvKWHzl = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).fvQaOB().KWHzl();
        java.lang.String safeString$default = null;
        if (xmvKWHzl != null && (c54536xMLCopydefault = xmvKWHzl.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
        }
        ((AbstractC50778vaa) c50170vEm.gGvvIC()).AhwBna.setFooterAvaValue(safeString$default);
        c50170vEm.zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50170vEm c50170vEm, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = c50170vEm.finit().AuCTel();
        java.lang.String algoId = strategyResponse.getAlgoId();
        c56126xwtAuCTel.KWHzl(C56390yDp.OLrzqt("contract_dca", algoId != null ? algoId : ""));
        xDM xdmCopydefault = c50170vEm.djBIcL().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        ContractDcaTriggerType.ActionBar actionBar = ContractDcaTriggerType.Companion;
        DcaTriggerParam[] dcaTriggerParamArr = new DcaTriggerParam[1];
        ContractDcaAdvancedParams value = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).copydefault().getValue();
        dcaTriggerParamArr[0] = value != null ? value.EZpvd() : null;
        if (actionBar.OLrzqt(dcaTriggerParamArr)) {
            RxBus.KWHzl(new vSS());
        }
        c50170vEm.valueOf();
        c50170vEm.AEQbTJ(((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue(), (android.os.Bundle) null, false);
        c50170vEm.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit isConnected(C50170vEm c50170vEm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50170vEm.getFieldNames();
        c50170vEm.fetchVPNInfo(str);
        StrategyConfigInfo value = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue();
        refreshPriceStep$default(c50170vEm, value, null, 2, null);
        refreshTpTarget$default(c50170vEm, value, null, 2, null);
        c50170vEm.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50170vEm c50170vEm, Triple triple) {
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.String str = (java.lang.String) triple.component1();
        boolean zBooleanValue = ((java.lang.Boolean) triple.component2()).booleanValue();
        if (((java.lang.Boolean) triple.component3()).booleanValue()) {
            return Unit.INSTANCE;
        }
        android.widget.TextView textView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).fIwbmz;
        if (C33129mqd.AEQbTJ(str, 0)) {
            xMS xmsCopydefault = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).fvQaOB().copydefault();
            safeString$default = null;
            if (xmsCopydefault != null) {
                if (str == null) {
                    str = "";
                }
                C54536xML c54536xMLAYXKKw = xmsCopydefault.AYXKKw(str);
                if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
                }
            }
        } else {
            safeString$default = "--";
        }
        textView.setText(safeString$default);
        android.widget.TextView textView2 = ((AbstractC50778vaa) c50170vEm.gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(zBooleanValue ? 0 : 8);
        c50170vEm.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50170vEm c50170vEm, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        ((AbstractC50778vaa) c50170vEm.gGvvIC()).fIwbmz.setText("--");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C50170vEm c50170vEm, ContractLeverTierLimitResult contractLeverTierLimitResult) {
        Intrinsics.checkNotNullParameter(contractLeverTierLimitResult, "");
        ((AbstractC50778vaa) c50170vEm.gGvvIC()).values.AEQbTJ(contractLeverTierLimitResult.getMaxLever());
        if (((ContractDcaManualPresenter) c50170vEm.dxcTrN()).fetchVPNInfo()) {
            android.widget.TextView textView = ((AbstractC50778vaa) c50170vEm.gGvvIC()).fJNWhG;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        } else {
            android.widget.TextView textView2 = ((AbstractC50778vaa) c50170vEm.gGvvIC()).fJNWhG;
            Intrinsics.copydefault(textView2);
            textView2.setVisibility(0);
            int i = C55688xof.Application.OxVOHk;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C48033uCm.Fragment.OHsvZP));
            xMR xmr = xMR.copydefault;
            java.lang.String maxLever = contractLeverTierLimitResult.getMaxLever();
            pairArr[1] = C56390yDp.OLrzqt("minValue", xmr.copydefault(maxLever != null ? maxLever : ""));
            textView2.setText(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50170vEm c50170vEm, ContractDcaAdvancedParams contractDcaAdvancedParams) {
        Intrinsics.checkNotNullParameter(contractDcaAdvancedParams, "");
        c50170vEm.zsXlph();
        c50170vEm.iwGUEr();
        c50170vEm.getFieldNames();
        c50170vEm.AubY();
        c50170vEm.AYXKKw();
        c50170vEm.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AhwBna(C50170vEm c50170vEm, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "arbitrage", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    private final void ORxRYg() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50170vEm.AEQbTJ(this.copydefault, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50170vEm.copydefault(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C50170vEm c50170vEm, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = c50170vEm.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C50170vEm c50170vEm, java.lang.String str, android.os.Bundle bundle) {
        android.os.Bundle arguments;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c50170vEm.valueOf();
        buildInputParams$default(c50170vEm, ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue(), bundle, false, 4, null);
        android.os.Parcelable parcelable = bundle.getParcelable("bot_copy_req");
        DcaOrderReq dcaOrderReq = parcelable instanceof DcaOrderReq ? (DcaOrderReq) parcelable : null;
        if (dcaOrderReq == null || (arguments = c50170vEm.getArguments()) == null) {
            return;
        }
        arguments.putParcelable("bot_copy_req", dcaOrderReq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        ((ContractDcaManualPresenter) dxcTrN()).zsXlph().setValue(java.lang.Boolean.valueOf(!((ContractDcaManualPresenter) dxcTrN()).DbNXlk()));
    }

    public static /* synthetic */ void fillWithConfigInfo$default(C50170vEm c50170vEm, StrategyConfigInfo strategyConfigInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyConfigInfo = null;
        }
        c50170vEm.copydefault(strategyConfigInfo);
    }

    public final void copydefault(StrategyConfigInfo strategyConfigInfo) {
        buildInputParams$default(this, strategyConfigInfo, getArguments(), false, 4, null);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.remove("bot_copy_req");
        }
        AYXKKw();
    }

    public static /* synthetic */ void buildInputParams$default(C50170vEm c50170vEm, StrategyConfigInfo strategyConfigInfo, android.os.Bundle bundle, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c50170vEm.AEQbTJ(strategyConfigInfo, bundle, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter.setInputRange$default(com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter, o.uAv, com.okinc.unify_trade.biz.BotRangeConfig, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Class process forced to load method for inline: o.wmB.setShareModes$default(o.wmB, java.util.List, androidx.fragment.app.FragmentManager, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(StrategyConfigInfo strategyConfigInfo, android.os.Bundle bundle, boolean z) {
        BotRangeConfig pxSteps;
        java.lang.String pxSteps2;
        BotRangeConfig tpPct;
        java.lang.String tpPct2;
        java.lang.String str;
        java.lang.String str2;
        BotRangeConfig botRangeConfig;
        BotRangeConfig lever;
        BotRangeConfig maxSafetyOrds;
        BotRangeConfig lever2;
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
        if (maxSafetyOrds3 == null || maxSafetyOrds3.length() == 0) {
            maxSafetyOrds3 = str;
        }
        java.lang.String direction = dcaOrderReq != null ? dcaOrderReq.getDirection() : null;
        if (direction == null || direction.length() == 0) {
            direction = "long";
        }
        java.lang.String lever3 = dcaOrderReq != null ? dcaOrderReq.getLever() : null;
        if (strategyConfigInfo == null || (lever2 = strategyConfigInfo.getLever()) == null || (str2 = lever2.getDefault()) == null) {
            str2 = "";
        }
        if (lever3 == null || lever3.length() == 0) {
            lever3 = str2;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) ((AbstractC50778vaa) gGvvIC()).AkhnZx.EZpvd())) {
            ((AbstractC50778vaa) gGvvIC()).AkhnZx.setDirectionType(direction);
            fetchVPNInfo(direction);
        }
        EZpvd(strategyConfigInfo, pxSteps2);
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (strategyConfigInfo == null || (maxSafetyOrds = strategyConfigInfo.getMaxSafetyOrds()) == null) {
            botRangeConfig = null;
        } else {
            maxSafetyOrds.setDefault(maxSafetyOrds3);
            Unit unit = Unit.INSTANCE;
            botRangeConfig = maxSafetyOrds;
        }
        contractDcaManualPresenter.OLrzqt(c47988uAv, botRangeConfig, (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.valueOf((java.lang.String) obj);
            }
        });
        ((AbstractC50778vaa) gGvvIC()).values.EZpvd(lever3);
        ((AbstractC50778vaa) gGvvIC()).values.AEQbTJ((strategyConfigInfo == null || (lever = strategyConfigInfo.getLever()) == null) ? null : lever.getMax());
        AEQbTJ(strategyConfigInfo, tpPct2);
        ((ContractDcaManualPresenter) dxcTrN()).EZpvd(((ContractDcaManualPresenter) dxcTrN()).EZpvd(dcaOrderReq));
        C53470wmB c53470wmB = ((AbstractC50778vaa) gGvvIC()).fARcdN;
        c53470wmB.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getProfitSharingRatio() : null);
        ContractDcaManualPresenter contractDcaManualPresenter2 = (ContractDcaManualPresenter) dxcTrN();
        java.lang.String trackingMode = dcaOrderReq != null ? dcaOrderReq.getTrackingMode() : null;
        java.lang.String mode = DcaLeadShareMode.SYNC.getMode();
        if (trackingMode == null || trackingMode.length() == 0) {
            trackingMode = mode;
        }
        java.util.List<TradeMenuItemBean> listAEQbTJ = contractDcaManualPresenter2.AEQbTJ(trackingMode);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C53470wmB.setShareModes$default(c53470wmB, listAEQbTJ, childFragmentManager, null, 4, null);
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wys.handleManualView$default(o.wys, o.wyx, com.okinc.unify_trade.biz.StrategyConfigInfo, boolean, boolean, java.lang.String, android.view.View$OnClickListener, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void wlaJM() {
        StrategyConfigInfo value = ((ContractDcaManualPresenter) dxcTrN()).valueOf().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((AbstractC50778vaa) gGvvIC()).AxsJAY;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, value, (30 & 2) != 0 ? false : false, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx(java.lang.String str) {
        android.widget.TextView textView = ((AbstractC50778vaa) gGvvIC()).wlaJM;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        ((AbstractC50778vaa) gGvvIC()).wlaJM.setText(str);
        C47988uAv.setInputErrorMsg$default(((AbstractC50778vaa) gGvvIC()).uzCIH, null, 1, null);
        C47988uAv.setInputErrorMsg$default(((AbstractC50778vaa) gGvvIC()).getNewProxyInstance, null, 1, null);
    }

    public static final void OLrzqt(C50170vEm c50170vEm, android.view.View view, android.view.View view2) {
        C49960uyR.setWindowSoftInput$default(c50170vEm, view, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), view2, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QOLQEE() {
        AbstractC50778vaa abstractC50778vaa = (AbstractC50778vaa) gGvvIC();
        C47988uAv c47988uAv = abstractC50778vaa.uzCIH;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        C47988uAv c47988uAv2 = abstractC50778vaa.uzCIH;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        OLrzqt(this, c47988uAv, c47988uAv2);
        C47988uAv c47988uAv3 = abstractC50778vaa.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
        C47988uAv c47988uAv4 = abstractC50778vaa.zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
        OLrzqt(this, c47988uAv3, c47988uAv4);
        C47988uAv c47988uAv5 = abstractC50778vaa.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv5, "");
        C47988uAv c47988uAv6 = abstractC50778vaa.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c47988uAv6, "");
        OLrzqt(this, c47988uAv5, c47988uAv6);
        C47988uAv c47988uAv7 = abstractC50778vaa.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(c47988uAv7, "");
        C47988uAv c47988uAv8 = abstractC50778vaa.zLjUOn;
        Intrinsics.checkNotNullExpressionValue(c47988uAv8, "");
        OLrzqt(this, c47988uAv7, c47988uAv8);
        C47988uAv c47988uAv9 = abstractC50778vaa.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(c47988uAv9, "");
        C47988uAv c47988uAv10 = abstractC50778vaa.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(c47988uAv10, "");
        OLrzqt(this, c47988uAv9, c47988uAv10);
        C47988uAv c47988uAv11 = abstractC50778vaa.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv11, "");
        C47988uAv c47988uAv12 = abstractC50778vaa.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv12, "");
        OLrzqt(this, c47988uAv11, c47988uAv12);
    }

    public final void AEQbTJ() {
        for (C47988uAv c47988uAv : zuBGHE()) {
            c47988uAv.setOnTextChangeCallback(this.AhwBna);
            c47988uAv.setOnFocusChangeCallback(this.EZpvd);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zsXlph() {
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        java.lang.String strAkhnZx = ((AbstractC50778vaa) gGvvIC()).getFieldNames.AkhnZx();
        java.lang.String strAkhnZx2 = ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.AkhnZx();
        java.lang.String strAkhnZx3 = ((AbstractC50778vaa) gGvvIC()).zLjUOn.AkhnZx();
        java.lang.String strAkhnZx4 = ((AbstractC50778vaa) gGvvIC()).uzCIH.AkhnZx();
        MaxAvailableResp maxAvailableResp = djBIcL().AEQbTJ().get();
        contractDcaManualPresenter.OLrzqt(strAkhnZx, strAkhnZx2, strAkhnZx3, strAkhnZx4, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        BotRangeConfig initOrdAmt;
        java.lang.String str;
        BotRangeConfig initOrdAmt2;
        java.lang.String max;
        java.lang.String strEZpvd = null;
        java.lang.String strCalculateMinInitOrder$default = ContractDcaBasePresenter.calculateMinInitOrder$default((ContractDcaBasePresenter) dxcTrN(), ((ContractDcaManualPresenter) dxcTrN()).uzCIH().getValue(), null, 2, null);
        if (C33129mqd.valueOf(strCalculateMinInitOrder$default, 0)) {
            return;
        }
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).getFieldNames;
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        Intrinsics.copydefault(c47988uAv);
        ContractDcaManualPresenter contractDcaManualPresenter2 = (ContractDcaManualPresenter) dxcTrN();
        RoundingMode roundingMode = RoundingMode.UP;
        java.lang.String strEZpvd2 = contractDcaManualPresenter2.EZpvd(strCalculateMinInitOrder$default, roundingMode);
        StrategyConfigInfo value = ((ContractDcaManualPresenter) dxcTrN()).valueOf().getValue();
        java.lang.String strEZpvd3 = (value == null || (initOrdAmt2 = value.getInitOrdAmt()) == null || (max = initOrdAmt2.getMax()) == null) ? null : ((ContractDcaManualPresenter) dxcTrN()).EZpvd(max, roundingMode);
        StrategyConfigInfo value2 = ((ContractDcaManualPresenter) dxcTrN()).valueOf().getValue();
        if (value2 != null && (initOrdAmt = value2.getInitOrdAmt()) != null && (str = initOrdAmt.getDefault()) != null) {
            strEZpvd = ((ContractDcaManualPresenter) dxcTrN()).EZpvd(str, roundingMode);
        }
        contractDcaManualPresenter.OLrzqt(c47988uAv, new BotRangeConfig(strEZpvd2, strEZpvd3, strEZpvd, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (12 & 4) != 0 ? null : ((ContractDcaManualPresenter) dxcTrN()).EZpvd(strCalculateMinInitOrder$default, roundingMode), (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AhwBna((java.lang.String) obj);
            }
        });
        if (c47988uAv.getNewProxyInstance()) {
            return;
        }
        if (c47988uAv.getFieldNames() || c47988uAv.AkhnZx().length() > 0) {
            ((ContractDcaManualPresenter) dxcTrN()).EZpvd(c47988uAv, AEQbTJ(c47988uAv));
        }
    }

    public static final java.lang.String AhwBna(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        java.lang.String strKWHzl = ((ContractDcaManualPresenter) dxcTrN()).KWHzl(((AbstractC50778vaa) gGvvIC()).uzCIH.AkhnZx(), ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.AkhnZx(), ((ContractDcaManualPresenter) dxcTrN()).uzCIH().getValue());
        if (C33129mqd.valueOf(strKWHzl, 0)) {
            return;
        }
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).zLjUOn;
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        Intrinsics.copydefault(c47988uAv);
        contractDcaManualPresenter.OLrzqt(c47988uAv, (BotRangeConfig) null, (12 & 4) != 0 ? null : ((ContractDcaManualPresenter) dxcTrN()).EZpvd(strKWHzl, RoundingMode.UP), (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.AYXKKw((java.lang.String) obj);
            }
        });
        if (c47988uAv.getNewProxyInstance()) {
            return;
        }
        if (c47988uAv.getFieldNames() || c47988uAv.AkhnZx().length() > 0) {
            ((ContractDcaManualPresenter) dxcTrN()).EZpvd(c47988uAv, AEQbTJ(c47988uAv));
        }
    }

    public static final java.lang.String AYXKKw(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r12v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        djBIcL().EZpvd("contract_dca", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
        if (z) {
            C53470wmB c53470wmB = ((AbstractC50778vaa) gGvvIC()).fARcdN;
            c53470wmB.AEQbTJ(((ContractDcaManualPresenter) dxcTrN()).fvQaOB());
            c53470wmB.EZpvd();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c53470wmB.AEQbTJ(childFragmentManager);
            C53470wmB.setDoubtOrCallback$default(c53470wmB, null, new Function0() { // from class: o.vER
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C50170vEm.fARcdN(this.AEQbTJ);
                }
            }, 1, null);
            valueOf();
            OLrzqt(((ContractDcaManualPresenter) dxcTrN()).fvQaOB().AhwBna());
            ((ContractDcaManualPresenter) dxcTrN()).AEQbTJ();
            ((ContractDcaManualPresenter) dxcTrN()).EZpvd();
        }
    }

    public static final Unit fARcdN(C50170vEm c50170vEm) {
        C53274wiR.Companion.AEQbTJ("", yDY.copydefault(new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda2), C33070mpX.AYXKKw(C55688xof.Application.setVolumeTo)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.QWpYiD), C33070mpX.AYXKKw(C55688xof.Application.ORWKdN)), new ExplainItemModel(C33070mpX.AYXKKw(C55688xof.Application.QKDJJA), C33070mpX.AYXKKw(C55688xof.Application.FhERFw)))).show(c50170vEm.getChildFragmentManager(), "BotExplainGatherFragment");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        C47988uAv.setInputContent$default(((AbstractC50778vaa) gGvvIC()).getFieldNames, "", false, false, 6, null);
        C47988uAv.setInputContent$default(((AbstractC50778vaa) gGvvIC()).zLjUOn, "", false, false, 6, null);
        ((ContractDcaManualPresenter) dxcTrN()).gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(BizInstrument bizInstrument) {
        java.lang.Object marginDig;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        IdxConfig idxConfigAkhnZx;
        if (bizInstrument == null) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(bizInstrument.getInstType())) == null || (idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(bizInstrument.getInstFamily())) == null || (marginDig = idxConfigAkhnZx.getMarginDig()) == null) {
            marginDig = 2;
        }
        int iAhwBna = C33129mqd.AhwBna(marginDig);
        ((AbstractC50778vaa) gGvvIC()).AhwBna.setTransferCoin(bizInstrument.getQuoteSymbol());
        ((AbstractC50778vaa) gGvvIC()).getFieldNames.setInputUnit(bizInstrument.getQuoteSymbol());
        ((AbstractC50778vaa) gGvvIC()).getFieldNames.setMaxDecimal(iAhwBna);
        ((AbstractC50778vaa) gGvvIC()).zLjUOn.setInputUnit(bizInstrument.getQuoteSymbol());
        ((AbstractC50778vaa) gGvvIC()).zLjUOn.setMaxDecimal(iAhwBna);
        ((AbstractC50778vaa) gGvvIC()).EZpvd.setInputUnit(bizInstrument.getQuoteSymbol());
        ((AbstractC50778vaa) gGvvIC()).EZpvd.setMaxDecimal(iAhwBna);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C50170vEm c50170vEm, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        if (Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) c50170vEm.gGvvIC()).uzCIH) || Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) c50170vEm.gGvvIC()).zsXlph)) {
            c50170vEm.AYXKKw();
        } else if (Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd)) {
            c50170vEm.EZpvd();
        } else if (Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) c50170vEm.gGvvIC()).getNewProxyInstance)) {
            c50170vEm.fIwbmz();
            c50170vEm.AYXKKw();
        }
        c50170vEm.zsXlph();
        c50170vEm.iwGUEr();
        c50170vEm.getFieldNames();
        c50170vEm.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        boolean z;
        boolean z2;
        java.lang.String strAkhnZx = ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.AkhnZx();
        java.util.Iterator it = C56424yEw.gEmmrt(C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).uzCIH, C56402yEa.EZpvd("0")), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).zLjUOn, C56402yEa.EZpvd("0"))).entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
                z2 = false;
            } else {
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd(it2.next(), (java.lang.Object) strAkhnZx)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            boolean z3 = true ^ z2;
            C47988uAv.setInputLayoutState$default((C47988uAv) entry.getKey(), z3 ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
            if (!z3) {
                ((C47988uAv) entry.getKey()).copydefault();
            }
        }
        C50192vFh c50192vFh = ((AbstractC50778vaa) gGvvIC()).KWHzl;
        if (!Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "0") && !Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "1")) {
            z = true;
        }
        c50192vFh.setAppendEnable(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50170vEm c50170vEm, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) c50170vEm.gGvvIC()).EZpvd) && !z && c47988uAv.AkhnZx().length() > 0) {
            ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).EZpvd(c47988uAv, c50170vEm.AEQbTJ(c47988uAv));
            c50170vEm.EZpvd(c47988uAv);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AEQbTJ(C47988uAv c47988uAv) {
        return (Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) gGvvIC()).uzCIH) || Intrinsics.EZpvd(c47988uAv, ((AbstractC50778vaa) gGvvIC()).zsXlph)) ? "%" : c47988uAv.fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean EZpvd() {
        if (!((AbstractC50778vaa) gGvvIC()).copydefault.isChecked()) {
            return true;
        }
        java.lang.String strAkhnZx = ((AbstractC50778vaa) gGvvIC()).EZpvd.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || C33129mqd.valueOf(strAkhnZx, "0")) {
            ((AbstractC50778vaa) gGvvIC()).EZpvd.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.gkZNMa));
            AppCompatTextView appCompatTextView = ((AbstractC50778vaa) gGvvIC()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            return false;
        }
        MaxAvailableResp maxAvailableResp = djBIcL().AEQbTJ().get();
        if (C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null)) {
            AppCompatTextView appCompatTextView2 = ((AbstractC50778vaa) gGvvIC()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            ((AbstractC50778vaa) gGvvIC()).EZpvd.copydefault();
            return true;
        }
        ((AbstractC50778vaa) gGvvIC()).EZpvd.copydefault();
        AppCompatTextView appCompatTextView3 = ((AbstractC50778vaa) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(8);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean KWHzl() {
        java.util.List<C47988uAv> listZuBGHE = zuBGHE();
        java.util.ArrayList<C47988uAv> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listZuBGHE) {
            C47988uAv c47988uAv = (C47988uAv) obj;
            if (c47988uAv.getVisibility() == 0 && c47988uAv.isConnected() == InputLayoutState.NORMAL) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        for (C47988uAv c47988uAv2 : arrayList) {
            if (c47988uAv2.AkhnZx().length() != 0) {
                ((ContractDcaManualPresenter) dxcTrN()).EZpvd(c47988uAv2, AEQbTJ(c47988uAv2));
                if (z && !c47988uAv2.hDKMBd()) {
                    c47988uAv2.zsXlph();
                    z = false;
                }
            } else if (z) {
                c47988uAv2.zsXlph();
                z = false;
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        if (C55697xoo.OLrzqt.isConnected()) {
            ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
            contractDcaManualPresenter.KWHzl(((AbstractC50778vaa) gGvvIC()).getFieldNames.AkhnZx(), ((AbstractC50778vaa) gGvvIC()).zLjUOn.AkhnZx(), ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.AkhnZx(), xMR.formatHundredQuot$default(xMR.copydefault, ((AbstractC50778vaa) gGvvIC()).uzCIH.AkhnZx(), 0, false, null, 14, null), (1008 & 16) != 0 ? contractDcaManualPresenter.AuCTelauCTel() : null, (1008 & 32) != 0 ? contractDcaManualPresenter.zuBGHE() : null, (1008 & 64) != 0 ? contractDcaManualPresenter.OLrzqt().getValue() : null, (1008 & 128) != 0 ? contractDcaManualPresenter.DbNXlk.getValue() : null, (1008 & 256) != 0 ? false : false, (1008 & 512) != 0 ? null : null);
        }
    }

    public final void fetchVPNInfo(java.lang.String str) {
        int i;
        java.lang.String strAYXKKw;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long")) {
            i = 261;
        } else {
            i = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short") ? 262 : 259;
        }
        isConnected().setButtonType(i);
        C53518wmx c53518wmxIsConnected = isConnected();
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
        } else {
            strAYXKKw = C33069mpW.copydefault(C55688xof.Application.glVQsU, C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, C56033xvF.AhwBna(str))));
        }
        c53518wmxIsConnected.setText(strAYXKKw);
    }

    public static /* synthetic */ void refreshPriceStep$default(C50170vEm c50170vEm, StrategyConfigInfo strategyConfigInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c50170vEm.EZpvd(strategyConfigInfo, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(StrategyConfigInfo strategyConfigInfo, java.lang.String str) {
        java.lang.String strAYXKKw;
        java.lang.String str2;
        BotRangeConfig pxSteps;
        BotRangeConfig pxSteps2;
        java.lang.String max;
        BotRangeConfig pxSteps3;
        java.lang.String min;
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractDcaManualPresenter) dxcTrN()).OLrzqt().getValue(), (java.lang.Object) "long")) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.gqOnQv);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.hfdhUn);
        }
        C47988uAv.setInputLabel$default(((AbstractC50778vaa) gGvvIC()).uzCIH, strAYXKKw, null, 2, null);
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        xMR xmr = xMR.copydefault;
        java.lang.String hundredfold$default = xMR.formatHundredfold$default(xmr, (strategyConfigInfo == null || (pxSteps3 = strategyConfigInfo.getPxSteps()) == null || (min = pxSteps3.getMin()) == null) ? "" : min, 0, false, null, 14, null);
        java.lang.String hundredfold$default2 = xMR.formatHundredfold$default(xmr, (strategyConfigInfo == null || (pxSteps2 = strategyConfigInfo.getPxSteps()) == null || (max = pxSteps2.getMax()) == null) ? "" : max, 0, false, null, 14, null);
        if (str == null) {
            java.lang.String str3 = (strategyConfigInfo == null || (pxSteps = strategyConfigInfo.getPxSteps()) == null) ? null : pxSteps.getDefault();
            str2 = str3 == null ? "" : str3;
        } else {
            str2 = str;
        }
        contractDcaManualPresenter.OLrzqt(c47988uAv, new BotRangeConfig(hundredfold$default, hundredfold$default2, xMR.formatHundredfold$default(xmr, str2, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.djBIcL((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    public static /* synthetic */ void refreshTpTarget$default(C50170vEm c50170vEm, StrategyConfigInfo strategyConfigInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c50170vEm.AEQbTJ(strategyConfigInfo, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(StrategyConfigInfo strategyConfigInfo, java.lang.String str) {
        java.lang.String min;
        java.lang.String maxLongFuture;
        java.lang.String hundredfold$default;
        BotRangeConfig tpPct;
        java.lang.String str2;
        BotRangeConfig tpPct2;
        BotRangeConfig tpPct3;
        java.lang.String max;
        BotRangeConfig tpPct4;
        java.lang.String value = ((ContractDcaManualPresenter) dxcTrN()).OLrzqt().getValue();
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).zsXlph;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        xMR xmr = xMR.copydefault;
        if (strategyConfigInfo == null || (tpPct4 = strategyConfigInfo.getTpPct()) == null || (min = tpPct4.getMin()) == null) {
            min = "0.005";
        }
        java.lang.String hundredfold$default2 = xMR.formatHundredfold$default(xmr, min, 0, false, null, 14, null);
        if (Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) "short")) {
            hundredfold$default = xMR.formatHundredfold$default(xmr, (strategyConfigInfo == null || (tpPct3 = strategyConfigInfo.getTpPct()) == null || (max = tpPct3.getMax()) == null) ? "" : max, 0, false, null, 14, null);
        } else {
            if (strategyConfigInfo == null || (tpPct = strategyConfigInfo.getTpPct()) == null || (maxLongFuture = tpPct.getMaxLongFuture()) == null) {
                maxLongFuture = "10";
            }
            hundredfold$default = xMR.formatHundredfold$default(xmr, maxLongFuture, 0, false, null, 14, null);
        }
        java.lang.String str3 = hundredfold$default;
        if (str == null) {
            java.lang.String str4 = (strategyConfigInfo == null || (tpPct2 = strategyConfigInfo.getTpPct()) == null) ? null : tpPct2.getDefault();
            str2 = str4 == null ? "" : str4;
        } else {
            str2 = str;
        }
        contractDcaManualPresenter.OLrzqt(c47988uAv, new BotRangeConfig(hundredfold$default2, str3, xMR.formatHundredfold$default(xmr, str2, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.gEmmrt((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.Map<C47988uAv, java.lang.String> AxsJAY() {
        if (giSNqX()) {
            return C56424yEw.gEmmrt(C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).uzCIH, "price_step"), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).zsXlph, "tp_target"), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).getFieldNames, "initial_margin"), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).zLjUOn, "safety_margin"), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).getNewProxyInstance, "safety_orders"), C56390yDp.OLrzqt(((AbstractC50778vaa) gGvvIC()).EZpvd, "auto_margin_limit"));
        }
        return C56424yEw.KWHzl();
    }

    private final C53519wmy gHZMYf() {
        return (C53519wmy) this.copydefault.getValue();
    }

    public static final C53519wmy AkhnZx(C50170vEm c50170vEm) {
        return new C53519wmy(c50170vEm.AxsJAY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<C47988uAv> zuBGHE() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(AxsJAY().keySet());
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        isConnected().OLrzqt();
        fJNWhG().OLrzqt();
        gHZMYf().EZpvd();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        gHZMYf().copydefault();
    }

    public final void EZpvd(C47988uAv c47988uAv) {
        final java.lang.String orDefault = AxsJAY().getOrDefault(c47988uAv, "");
        C32866mlf.onEvent$default("DCABotPlaceOrder_Full_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50170vEm.copydefault(orDefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "contract_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL().AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        BigDecimal bigDecimalAdd;
        DcaTriggerParam dcaTriggerParamAYXKKw;
        BigDecimal bigDecimalCopydefault;
        java.lang.String strOLrzqt;
        androidx.fragment.app.Fragment fragmentDbNXlk = values().DbNXlk();
        if (fragmentDbNXlk == null) {
            return;
        }
        java.lang.String value = ((ContractDcaManualPresenter) dxcTrN()).OLrzqt().getValue();
        java.lang.String str = value == null ? "" : value;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "short");
        ContractDcaManualPresenter contractDcaManualPresenter = (ContractDcaManualPresenter) dxcTrN();
        java.lang.String strAkhnZx = ((AbstractC50778vaa) gGvvIC()).getFieldNames.AkhnZx();
        C47988uAv c47988uAv = ((AbstractC50778vaa) gGvvIC()).zLjUOn;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        java.lang.String strOLrzqt2 = OLrzqt(c47988uAv);
        C47988uAv c47988uAv2 = ((AbstractC50778vaa) gGvvIC()).uzCIH;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        Triple<BotOrderItem, java.util.ArrayList<BotOrderItem>, DcaPreviewData> tripleEZpvd = contractDcaManualPresenter.EZpvd(strAkhnZx, strOLrzqt2, OLrzqt(c47988uAv2), ((AbstractC50778vaa) gGvvIC()).getNewProxyInstance.AkhnZx(), ((AbstractC50778vaa) gGvvIC()).zsXlph.AkhnZx());
        BotOrderItem botOrderItemComponent1 = tripleEZpvd.component1();
        java.util.ArrayList<BotOrderItem> arrayListComponent2 = tripleEZpvd.component2();
        DcaPreviewData dcaPreviewDataComponent3 = tripleEZpvd.component3();
        BigDecimal bigDecimalNegate = BigDecimal.ONE;
        if (!zEZpvd) {
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "");
            bigDecimalNegate = bigDecimalNegate.negate();
            Intrinsics.checkNotNullExpressionValue(bigDecimalNegate, "");
        }
        ContractDcaAdvancedParams value2 = ((ContractDcaManualPresenter) dxcTrN()).copydefault().getValue();
        java.lang.String triggerPx = null;
        if (value2 == null || (strOLrzqt = value2.OLrzqt()) == null) {
            bigDecimalAdd = null;
        } else {
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strOLrzqt);
            Intrinsics.copydefault(bigDecimalNegate);
            BigDecimal bigDecimalMultiply = bigDecimalEZpvd.multiply(bigDecimalNegate);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            bigDecimalAdd = bigDecimalMultiply.add(BigDecimal.ONE);
        }
        BigDecimal bigDecimalMultiply2 = (bigDecimalAdd == null || dcaPreviewDataComponent3 == null || (bigDecimalCopydefault = dcaPreviewDataComponent3.copydefault()) == null) ? null : bigDecimalCopydefault.multiply(bigDecimalAdd);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            java.util.ArrayList<BotOrderItem> arrayList = zEZpvd ? new java.util.ArrayList<>() : arrayListComponent2;
            java.util.ArrayList<BotOrderItem> arrayList2 = zEZpvd ? arrayListComponent2 : new java.util.ArrayList<>();
            Triple<java.lang.String, java.lang.Boolean, java.lang.Boolean> value3 = ((ContractDcaManualPresenter) dxcTrN()).getFieldNames().getValue();
            java.lang.String first = value3 != null ? value3.getFirst() : null;
            java.lang.String str2 = first == null ? "" : first;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(dcaPreviewDataComponent3 != null ? dcaPreviewDataComponent3.AYXKKw() : null);
            java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(bigDecimalMultiply2);
            if (value2 != null && (dcaTriggerParamAYXKKw = value2.AYXKKw()) != null) {
                triggerPx = dcaTriggerParamAYXKKw.getTriggerPx();
            }
            oka.AEQbTJ(fragmentDbNXlk, new IBotOrdersDataBean("contract_dca", str, arrayList, arrayList2, str2, strGEmmrt, strGEmmrt2, null, triggerPx != null ? triggerPx : "", botOrderItemComponent1, null, 1152, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50170vEm c50170vEm, java.util.List list) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            SmartRecommendResp smartRecommendResp = (SmartRecommendResp) next;
            StgyParam stgyParam = smartRecommendResp.getStgyParam();
            if (Intrinsics.EZpvd((java.lang.Object) (stgyParam != null ? stgyParam.getUserRiskMode() : null), (java.lang.Object) SpotDcaRiskModeData.MODERATE.getMode())) {
                StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
                if (Intrinsics.EZpvd(stgyParam2 != null ? stgyParam2.getDirection() : null, (java.lang.Object) ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).OLrzqt().getValue())) {
                    obj = next;
                    break;
                }
            }
        }
        SmartRecommendResp smartRecommendResp2 = (SmartRecommendResp) obj;
        if (smartRecommendResp2 != null) {
            StrategyConfigInfo value = ((ContractDcaManualPresenter) c50170vEm.dxcTrN()).valueOf().getValue();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_copy_req", BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp2));
            Unit unit = Unit.INSTANCE;
            c50170vEm.AEQbTJ(value, bundle, false);
        }
        return Unit.INSTANCE;
    }
}
