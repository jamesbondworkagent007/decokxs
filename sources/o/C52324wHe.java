package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
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
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.okinc.biz.TacticsType;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradeuilib.positions.history_positions.utils.LinearLayoutManagerWrapper;
import com.okinc.tradingbot.api.constants.TacticsDetailsActionEnum;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import com.okinc.tradingbot.impl.market_place.home.filter.BotStyleManagerViewModel;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsType;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$handleContentClick$2;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$handleCurrentViewingBot$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$handleSubItemClick$6;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$onVisible$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$processProfitData$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$subscribeOnUIChange$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$subscribeOnUIChange$19;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$subscribeOnUIChange$4;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$subscribeOnUIChange$7$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$subscribeOnUIChange$8$1$1;
import com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.tradingbot.impl.strategy.utils.BotReminderOperatorDisposer;
import com.okinc.tradingbot.impl.strategy.view.AllocationItem;
import com.okinc.tradingbot.impl.strategy.view.CoinPriceItem;
import com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.ArbitrageInfoResponse;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.biz.PinBotResp;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SlippageVo;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BotGuiderViewData;
import com.okinc.unify_trade.bot.data.BotNoticeData;
import com.okinc.unify_trade.bot.data.BotToMPRecommendCard;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.OngoingBotsOnshoreEmptyData;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.presenter.TacticsListPresenter;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C48033uCm;
import o.C50308vJp;
import o.C52004vxh;
import o.C52324wHe;
import o.C52761wXj;
import o.C52917wbf;
import o.C52946wcH;
import o.C53660wpg;
import o.C53698wqR;
import o.C53922wud;
import o.C54132wyb;
import o.C55688xof;
import o.C55770xqH;
import o.C55959xtl;
import o.InterfaceC43294rma;
import o.InterfaceC52662wTs;
import o.InterfaceC54581xNr;
import o.InterfaceC55705xow;
import o.InterfaceC8104awT;
import o.oKA;
import o.vSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wHe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52324wHe extends AbstractC52321wHb<AbstractC50758vaG, TacticsListPresenter> implements InterfaceC52662wTs {
    public static final Application Companion = new Application(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C52499wNr AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public C52517wOi AuCTelauCTel;
    public final InterfaceC56387yDm AubY;
    public kotlin.Pair<java.lang.String, TacticsData> DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public Job fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final C52663wTt fJNWhG;
    public java.lang.String fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm gHZMYf;
    public final InterfaceC56387yDm getFieldNames;
    public final int getNewProxyInstance = C48033uCm.Activity.gCNefq;
    public uKR hDKMBd;
    public int isConnected;
    public boolean iwGUEr;
    public boolean uzCIH;
    public Function0<Unit> values;
    public final InterfaceC56387yDm wlaJM;
    public boolean zLjUOn;
    public InterfaceC55705xow zsXlph;

    /* JADX INFO: renamed from: o.wHe$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_ARBITRAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_LLM_BOT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.wHe$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.vaG) (wrap:Binding:0x0000: INVOKE (r0v0 o.wHe) VIRTUAL call: o.xKx.gGvvIC():androidx.databinding.ViewDataBinding A[MD:():Binding extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:243)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC50758vaG AkhnZx(C52324wHe c52324wHe) {
        return (AbstractC50758vaG) c52324wHe.gGvvIC();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.unify_trade.bot.presenter.TacticsListPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.wHe) VIRTUAL call: o.xKx.dxcTrN():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:243)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ TacticsListPresenter values(C52324wHe c52324wHe) {
        return (TacticsListPresenter) c52324wHe.dxcTrN();
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC52662wTs.TaskDescription.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        InterfaceC52662wTs.TaskDescription.KWHzl(this);
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        InterfaceC52662wTs.TaskDescription.copydefault(this);
    }

    public C52324wHe() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotOrderListPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$2
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
        this.gHZMYf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$5
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
        this.AubY = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C52004vxh.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$6
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$7
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$viewModels$default$10
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
        this.fJNWhG = new C52663wTt();
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotStyleManagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$8
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.list_common.TacticsListFragment$special$$inlined$activityViewModels$default$9
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
        this.isConnected = -1;
        this.iwGUEr = true;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.AwvSrB();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.DbNXlk(this.KWHzl);
            }
        });
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.wHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C52324wHe.getFieldNames(this.OLrzqt));
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.wHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.fJNWhG(this.OLrzqt);
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.wHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.fetchVPNInfo();
            }
        });
        this.wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.wHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.uzCIH(this.KWHzl);
            }
        });
        this.zLjUOn = true;
    }

    public final BotOrderListPresenter iwGUEr() {
        return (BotOrderListPresenter) this.AhwBna.getValue();
    }

    public final TacticsListViewModel AubY() {
        return (TacticsListViewModel) this.gHZMYf.getValue();
    }

    private final C52004vxh sSMYrx() {
        return (C52004vxh) this.AubY.getValue();
    }

    private final C55915xsu gHZMYf() {
        return (C55915xsu) this.gEmmrt.getValue();
    }

    private final BotStyleManagerViewModel AxsJAY() {
        return (BotStyleManagerViewModel) this.AuCTel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AwvSrB() {
        return new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw zuBGHE() {
        return (C43316rmw) this.djBIcL.getValue();
    }

    public final BotOperatorButtonDisposer getNewProxyInstance() {
        return (BotOperatorButtonDisposer) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final BotOperatorButtonDisposer DbNXlk(C52324wHe c52324wHe) {
        return new BotOperatorButtonDisposer(c52324wHe, ((TacticsListPresenter) c52324wHe.dxcTrN()).RJOkX());
    }

    private final boolean ORxRYg() {
        return ((java.lang.Boolean) this.getFieldNames.getValue()).booleanValue();
    }

    public static final boolean getFieldNames(C52324wHe c52324wHe) {
        BotOngoingParams botOngoingParams;
        android.os.Bundle arguments = c52324wHe.getArguments();
        return (arguments == null || (botOngoingParams = (BotOngoingParams) arguments.getParcelable("bot_ongoing_param")) == null || !botOngoingParams.isFromCRActivity()) ? false : true;
    }

    public final java.lang.Integer hDKMBd() {
        return (java.lang.Integer) this.fIwbmz.getValue();
    }

    public static final java.lang.Integer fJNWhG(C52324wHe c52324wHe) {
        BotOngoingParams botOngoingParams;
        android.os.Bundle arguments = c52324wHe.getArguments();
        if (arguments == null || (botOngoingParams = (BotOngoingParams) arguments.getParcelable("bot_ongoing_param")) == null) {
            return null;
        }
        return botOngoingParams.getFirstItemTopPaddingDp();
    }

    public final ChoreographerFrameCallbackC47498trI getFieldNames() {
        return (ChoreographerFrameCallbackC47498trI) this.ejfBZ.getValue();
    }

    public static final ChoreographerFrameCallbackC47498trI fetchVPNInfo() {
        return new ChoreographerFrameCallbackC47498trI(new yHO() { // from class: o.wHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.AEQbTJ((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EventData eventData = new EventData();
        eventData.setAct("bot_ongoing_list_page_fps");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("totalTime", str3);
        linkedHashMap.put("start_mode", str);
        linkedHashMap.put("type", str2);
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData, false);
        return Unit.INSTANCE;
    }

    public final BotReminderOperatorDisposer wlaJM() {
        return (BotReminderOperatorDisposer) this.wlaJM.getValue();
    }

    public static final BotReminderOperatorDisposer uzCIH(C52324wHe c52324wHe) {
        return new BotReminderOperatorDisposer(c52324wHe);
    }

    /* JADX INFO: renamed from: o.wHe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wHe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C52324wHe newInstance$default(Application application, BotOngoingParams botOngoingParams, int i, java.lang.Object obj) {
            Application application2;
            BotOngoingParams botOngoingParams2;
            if ((i & 1) != 0) {
                botOngoingParams2 = new BotOngoingParams(null, false, false, false, false, false, false, false, false, false, false, null, 4095, null);
                application2 = application;
            } else {
                application2 = application;
                botOngoingParams2 = botOngoingParams;
            }
            return application2.OLrzqt(botOngoingParams2);
        }

        public final C52324wHe OLrzqt(@NotNull BotOngoingParams botOngoingParams) {
            Intrinsics.checkNotNullParameter(botOngoingParams, "");
            C52324wHe c52324wHe = new C52324wHe();
            c52324wHe.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_ongoing_param", botOngoingParams)));
            return c52324wHe;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        if (ORxRYg()) {
            wPQ.KWHzl(view, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        } else {
            wPQ.copydefault(view);
        }
        OcIXYQ();
        QKVWgx();
        QOLQEE();
        QUSxYX();
        kotlin.Pair[] pairArr = new kotlin.Pair[1];
        android.os.Bundle arguments = getArguments();
        pairArr[0] = new kotlin.Pair("bot_ongoing_param", C33129mqd.gEmmrt(arguments != null ? (BotOngoingParams) arguments.getParcelable("bot_ongoing_param") : null));
        C56028xvA.registerBotFragmentTrack$default(this, "TacticsListFragment", pairArr, null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v23, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v33, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v41, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww
    public void bt_() {
        BotOngoingParams botOngoingParams;
        java.lang.String str;
        java.lang.String str2;
        ((TacticsListPresenter) dxcTrN()).OLrzqt(iwGUEr().valueOf());
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (botOngoingParams = (BotOngoingParams) arguments.getParcelable("bot_ongoing_param")) != null) {
            ((TacticsListPresenter) dxcTrN()).DbNXlk().setBotType(botOngoingParams.getBotType());
            ((TacticsListPresenter) dxcTrN()).AEQbTJ(botOngoingParams.isHistory());
            ((TacticsListPresenter) dxcTrN()).KWHzl(botOngoingParams.isHome());
            ((TacticsListPresenter) dxcTrN()).AYXKKw(botOngoingParams.isMyBot());
            ((TacticsListPresenter) dxcTrN()).valueOf(botOngoingParams.isNmp());
            ((TacticsListPresenter) dxcTrN()).EZpvd(botOngoingParams.isBotOnGoing());
            ((TacticsListPresenter) dxcTrN()).copydefault(botOngoingParams.isEnableRefresh());
            ((TacticsListPresenter) dxcTrN()).AhwBna(botOngoingParams.isNmpOnGoing());
            ((TacticsListPresenter) dxcTrN()).gEmmrt(botOngoingParams.isManualMyTradeOngoing());
            ((TacticsListPresenter) dxcTrN()).OLrzqt(botOngoingParams.isFromCRActivity());
            TacticsListPresenter tacticsListPresenter = (TacticsListPresenter) dxcTrN();
            if (((TacticsListPresenter) dxcTrN()).iwGUEr()) {
                str = ((TacticsListPresenter) dxcTrN()).QUSxYX() ? "my_bot_history" : "my_bot_ongoing";
            } else {
                str = ((TacticsListPresenter) dxcTrN()).RJOkX() ? "bot_home_ongoing" : "bot_un_know_source";
            }
            tacticsListPresenter.copydefault(str);
            TacticsListPresenter tacticsListPresenter2 = (TacticsListPresenter) dxcTrN();
            if (((TacticsListPresenter) dxcTrN()).RJOkX()) {
                str2 = "manualtrade_bot";
            } else if (((TacticsListPresenter) dxcTrN()).djSkpj()) {
                str2 = "nmpmybot";
            } else if (((TacticsListPresenter) dxcTrN()).getFieldNames()) {
                str2 = "bothomepage_ongoing";
            } else if (((TacticsListPresenter) dxcTrN()).QbewEr()) {
                str2 = "manualtrade_history_bot";
            } else {
                str2 = ((TacticsListPresenter) dxcTrN()).iwGUEr() ? "mpmybot" : "";
            }
            tacticsListPresenter2.AEQbTJ(str2);
            EZpvd(botOngoingParams.isAlternateBackgroundColor());
        }
        ((AbstractC50758vaG) gGvvIC()).copydefault.setNoMoreDataEffective(true);
        ((AbstractC50758vaG) gGvvIC()).copydefault.AhwBna(((TacticsListPresenter) dxcTrN()).QUSxYX());
        ((AbstractC50758vaG) gGvvIC()).copydefault.djBIcL(((TacticsListPresenter) dxcTrN()).QOLQEE());
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        if (!((TacticsListPresenter) dxcTrN()).QUSxYX()) {
            getFieldNames().KWHzl();
        }
        if (this.uzCIH) {
            this.uzCIH = false;
            loadDataList$default(this, false, false, false, 7, null);
        }
        this.iwGUEr = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (((TacticsListPresenter) dxcTrN()).QUSxYX()) {
            return;
        }
        getFieldNames().OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        android.view.View childAt;
        C55237xgE c55237xgEDjBIcL = ((AbstractC50758vaG) gGvvIC()).EZpvd.djBIcL(C48033uCm.Activity.invokespecialhlXVux);
        java.lang.Integer numHDKMBd = hDKMBd();
        if (numHDKMBd != null) {
            int iIntValue = numHDKMBd.intValue();
            android.view.View viewAEQbTJ = c55237xgEDjBIcL.AEQbTJ(StatefulView.Status.Loading);
            android.widget.LinearLayout linearLayout = viewAEQbTJ instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) viewAEQbTJ : null;
            if (linearLayout == null || (childAt = linearLayout.getChildAt(0)) == null) {
                return;
            }
            childAt.setPadding(childAt.getPaddingLeft(), C55298xhM.dpInt$default(iIntValue, (android.content.Context) null, 1, (java.lang.Object) null), childAt.getPaddingRight(), childAt.getPaddingBottom());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        ((AbstractC50758vaG) gGvvIC()).copydefault.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(z ? C52761wXj.Activity.invokespecialaKhcqp : C52761wXj.Activity.EZpvd)));
    }

    private final void QOLQEE() {
        getParentFragmentManager().setFragmentResultListener("bot_filter", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52324wHe.EZpvd(this.AEQbTJ, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("BOT_REFRESH_AFTER_SORT", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52324wHe.djBIcL(this.OLrzqt, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52324wHe.valueOf(this.OLrzqt, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("bot_nmp_empty_status", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52324wHe.AYXKKw(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void EZpvd(C52324wHe c52324wHe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52324wHe.fJNWhG.AhwBna();
        loadDataList$default(c52324wHe, false, false, false, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(C52324wHe c52324wHe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52324wHe.fJNWhG.AhwBna();
        ((TacticsListPresenter) c52324wHe.dxcTrN()).djBIcL(true);
        loadDataList$default(c52324wHe, false, false, false, 7, null);
    }

    public static final void valueOf(C52324wHe c52324wHe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        InterfaceC55705xow interfaceC55705xow = c52324wHe.zsXlph;
        if (interfaceC55705xow != null) {
            InterfaceC55705xow.Application.refresh$default(interfaceC55705xow, null, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: com.okinc.unify_trade.bot.presenter.TacticsListPresenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AYXKKw(C52324wHe c52324wHe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        TacticsListPresenter tacticsListPresenter = (TacticsListPresenter) c52324wHe.dxcTrN();
        C55804xqp c55804xqp = new C55804xqp("", yDY.AhwBna(), null, null, 12, null);
        java.util.List<?> items = c52324wHe.zuBGHE().getItems();
        Intrinsics.copydefault(items, "");
        tacticsListPresenter.OLrzqt((C55804xqp<java.util.List<BizTradeStrategyInfo>>) c55804xqp, (java.util.List<? extends java.lang.Object>) items, false);
    }

    public final void KWHzl(TacticsData tacticsData, java.util.List<StrategyProfitResponse> list) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new TacticsListFragment$processProfitData$1(this, tacticsData, list, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QUSxYX() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new TacticsListFragment$subscribeOnUIChange$1(this, null), 2, null);
        C56111xwe<java.lang.String> c56111xweAhwBna = gHZMYf().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweAhwBna.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.valueOf(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner2, new Function1() { // from class: o.wHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.fetchVPNInfo(this.KWHzl, (java.lang.String) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new TacticsListFragment$subscribeOnUIChange$4(this, null), 3, null);
        TradeLiveData<OrderPositionData> tradeLiveDataValueOf = ((TacticsListPresenter) dxcTrN()).valueOf();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner4, new TaskDescription(new Function1() { // from class: o.wHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.EZpvd(this.OLrzqt, (OrderPositionData) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataDjBIcL = ((TacticsListPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner5, new TaskDescription(new Function1() { // from class: o.wHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<C55804xqp<java.util.List<BizTradeStrategyInfo>>> tradeLiveDataIsConnected = ((TacticsListPresenter) dxcTrN()).isConnected();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataIsConnected.observe(viewLifecycleOwner6, new TaskDescription(new Function1() { // from class: o.wHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.OLrzqt(this.AEQbTJ, (C55804xqp) obj);
            }
        }));
        TradeLiveData<C55804xqp<java.util.List<BizTradeStrategyInfo>>> tradeLiveDataAxsJAY = ((TacticsListPresenter) dxcTrN()).AxsJAY();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataAxsJAY.observe(viewLifecycleOwner7, new TaskDescription(new Function1() { // from class: o.wHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.EZpvd(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        ((TacticsListPresenter) dxcTrN()).fetchVPNInfo().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.copydefault(this.OLrzqt, (BotToMPRecommendCard) obj);
            }
        }));
        TradeLiveData<kotlin.Pair<java.util.List<java.lang.Object>, DiffUtil.DiffResult>> tradeLiveDataWlaJM = ((TacticsListPresenter) dxcTrN()).wlaJM();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataWlaJM.observe(viewLifecycleOwner8, new TaskDescription(new Function1() { // from class: o.wHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.valueOf(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        TradeLiveData<java.util.List<TickersData>> tradeLiveDataAhwBna = ((TacticsListPresenter) dxcTrN()).AhwBna();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner9, new TaskDescription(new Function1() { // from class: o.wHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        TradeLiveData<TacticsData> tradeLiveDataGHZMYf = ((TacticsListPresenter) dxcTrN()).gHZMYf();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner10, new TaskDescription(new Function1() { // from class: o.wHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.fetchVPNInfo(this.KWHzl, (TacticsData) obj);
            }
        }));
        TradeLiveData<java.util.List<PinBotResp>> tradeLiveDataZsXlph = ((TacticsListPresenter) dxcTrN()).zsXlph();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner11, new TaskDescription(new Function1() { // from class: o.wHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.util.List<java.lang.Object>> tradeLiveDataAYXKKw = ((TacticsListPresenter) dxcTrN()).AYXKKw();
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner12, new TaskDescription(new Function1() { // from class: o.wHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AYXKKw(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        ((TacticsListPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        C56126xwt<kotlin.Pair<java.lang.String, java.lang.String>> c56126xwtAuCTel = finit().AuCTel();
        LifecycleOwner viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "");
        c56126xwtAuCTel.AEQbTJ(viewLifecycleOwner13, new Function1() { // from class: o.wHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.gEmmrt(this.OLrzqt, (kotlin.Pair) obj);
            }
        });
        C56126xwt<Unit> c56126xwtFARcdN = finit().fARcdN();
        LifecycleOwner viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "");
        c56126xwtFARcdN.AEQbTJ(viewLifecycleOwner14, new Function1() { // from class: o.wHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.OLrzqt(this.copydefault, (Unit) obj);
            }
        });
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> tradeLiveDataZuBGHE = ((TacticsListPresenter) dxcTrN()).zuBGHE();
        LifecycleOwner viewLifecycleOwner15 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner15, "");
        tradeLiveDataZuBGHE.observe(viewLifecycleOwner15, new TaskDescription(new Function1() { // from class: o.wHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AhwBna(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        C52692wUv.copydefault(AubY().copydefault(), this, Lifecycle.State.CREATED, new TacticsListFragment$subscribeOnUIChange$19(this, null));
    }

    public static final Unit valueOf(C52324wHe c52324wHe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("TacticsListFragment balanceViewModel.mQuoteMax " + str);
        if (c52324wHe.DbNXlk != null) {
            c52324wHe.dismissLoading();
            kotlin.Pair<java.lang.String, TacticsData> pair = c52324wHe.DbNXlk;
            Intrinsics.copydefault(pair);
            c52324wHe.KWHzl(pair, c52324wHe.values);
            c52324wHe.values = null;
            c52324wHe.DbNXlk = null;
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C52324wHe c52324wHe, java.lang.String str) {
        if (c52324wHe.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            c52324wHe.zLjUOn = true;
            loadDataList$default(c52324wHe, false, false, false, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final C52324wHe c52324wHe, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c52324wHe.AxsJAY().EZpvd(orderPositionData.getBotAmtData().getTotalPinCount());
        if (c52324wHe.isResumed()) {
            int totalAmt = orderPositionData.getBotAmtData().getTotalAmt();
            int i = c52324wHe.isConnected;
            if (i != -1 && totalAmt > i) {
                c52324wHe.zLjUOn = true;
                c52324wHe.showLoading();
                ((AbstractC50758vaG) c52324wHe.gGvvIC()).getRoot().postDelayed(new java.lang.Runnable() { // from class: o.wHT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C52324wHe.iwGUEr(this.EZpvd);
                    }
                }, 300L);
            }
        }
        c52324wHe.isConnected = orderPositionData.getBotAmtData().getTotalAmt();
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(C52324wHe c52324wHe) {
        loadDataList$default(c52324wHe, false, false, false, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52324wHe c52324wHe, boolean z) {
        loadDataList$default(c52324wHe, false, false, !((TacticsListPresenter) c52324wHe.dxcTrN()).ORxRYg() || ((TacticsListPresenter) c52324wHe.dxcTrN()).QVAiDq(), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52324wHe c52324wHe, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c52324wHe.zsXlph = c55804xqp.KWHzl();
        if (Intrinsics.EZpvd((java.lang.Object) c55804xqp.OLrzqt(), (java.lang.Object) "http")) {
            C33546myW c33546myW = ((AbstractC50758vaG) c52324wHe.gGvvIC()).copydefault;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.KWHzl(c33546myW, Intrinsics.EZpvd(c55804xqp.AEQbTJ(), java.lang.Boolean.TRUE));
            c52324wHe.fJNWhG();
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c52324wHe), Dispatchers.getIO(), null, new TacticsListFragment$subscribeOnUIChange$7$1(c52324wHe, c55804xqp, c52324wHe.iwGUEr().values(), null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52324wHe c52324wHe, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        BizTradeStrategyInfo bizTradeStrategyInfo = (BizTradeStrategyInfo) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) c55804xqp.copydefault());
        if (bizTradeStrategyInfo != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c52324wHe), Dispatchers.getIO(), null, new TacticsListFragment$subscribeOnUIChange$8$1$1(c52324wHe, bizTradeStrategyInfo, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52324wHe c52324wHe, BotToMPRecommendCard botToMPRecommendCard) {
        if (!c52324wHe.iwGUEr && !((TacticsListPresenter) c52324wHe.dxcTrN()).ORxRYg()) {
            c52324wHe.iwGUEr = true;
            loadDataList$default(c52324wHe, false, true, true, 1, null);
        } else {
            c52324wHe.dismissLoading();
            C43316rmw c43316rmwZuBGHE = c52324wHe.zuBGHE();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(botToMPRecommendCard);
            c43316rmwZuBGHE.setItems(arrayList);
            c52324wHe.zuBGHE().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C52324wHe c52324wHe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c52324wHe.dismissLoading();
        pUU.EZpvd(c52324wHe.getTAG(), "orderResult change , refresh now!");
        java.util.List list = (java.util.List) pair.getFirst();
        java.util.List<?> items = c52324wHe.zuBGHE().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(items);
        java.util.List<?> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        if (c52324wHe.ORxRYg()) {
            listFJNWhG.add(new wOI(null, 1, null));
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new StateListAnimator(listAxsJAYsNCnLh, listFJNWhG));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
        c52324wHe.zuBGHE().setItems(listFJNWhG);
        diffResultCalculateDiff.dispatchUpdatesTo(c52324wHe.zuBGHE());
        ((TacticsListPresenter) c52324wHe.dxcTrN()).values(false);
        if (((TacticsListPresenter) c52324wHe.dxcTrN()).RcXXUw()) {
            c52324wHe.DTwDnp();
            ((TacticsListPresenter) c52324wHe.dxcTrN()).djBIcL(false);
        }
        c52324wHe.copydefault((java.util.List<? extends java.lang.Object>) pair.getFirst());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wHe$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<java.lang.Object> AEQbTJ;
        public final /* synthetic */ java.util.List<java.lang.Object> OLrzqt;

        public StateListAnimator(java.util.List<? extends java.lang.Object> list, java.util.List<java.lang.Object> list2) {
            this.AEQbTJ = list;
            this.OLrzqt = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.OLrzqt.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            java.lang.Object obj = this.AEQbTJ.get(i);
            java.lang.Object obj2 = this.OLrzqt.get(i2);
            return ((obj instanceof TacticsData) && (obj2 instanceof TacticsData)) ? Intrinsics.EZpvd((java.lang.Object) ((TacticsData) obj).getAlgoId(), (java.lang.Object) ((TacticsData) obj2).getAlgoId()) : ((obj instanceof wOI) && (obj2 instanceof wOI)) || ((obj instanceof BotGuiderViewData) && (obj2 instanceof BotGuiderViewData)) || ((obj instanceof EmptyData) && (obj2 instanceof EmptyData));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.AEQbTJ.get(i), this.OLrzqt.get(i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52324wHe c52324wHe, java.util.List list) {
        java.lang.String botDataValue1;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        TacticsData tacticsDataDTwDnp = ((TacticsListPresenter) c52324wHe.dxcTrN()).DTwDnp();
        if (tacticsDataDTwDnp != null) {
            if (yDY.gEmmrt("grid", "contract_grid").contains(tacticsDataDTwDnp.getOrderType()) && ((botDataValue1 = tacticsDataDTwDnp.getShareData().getBotDataValue1()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) botDataValue1))) {
                if (!list.isEmpty()) {
                    TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
                    java.lang.String last = tickersData != null ? tickersData.getLast() : null;
                    if (last != null) {
                        str = last;
                    }
                }
                kotlin.Pair titleOne$default = C55959xtl.ActionBar.getTitleOne$default(C55959xtl.Companion, null, str, 1, null);
                java.lang.String str2 = (java.lang.String) titleOne$default.component1();
                java.lang.String str3 = (java.lang.String) titleOne$default.component2();
                tacticsDataDTwDnp.getShareData().setBotDataTitle1(str2);
                tacticsDataDTwDnp.getShareData().setBotDataValue1(str3);
            }
            c52324wHe.AEQbTJ(tacticsDataDTwDnp);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C52324wHe c52324wHe, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        c52324wHe.AEQbTJ(tacticsData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52324wHe c52324wHe, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        PinBotResp pinBotResp = (PinBotResp) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        if (pinBotResp != null && pinBotResp.isPinned()) {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(c52324wHe, C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKtviewModels4), 3, false, 4, null);
            ((TacticsListPresenter) c52324wHe.dxcTrN()).djBIcL(true);
        } else {
            InterfaceC52662wTs.TaskDescription.showSnackbar$default(c52324wHe, C33070mpX.AYXKKw(C55688xof.Application.invoke), 3, false, 4, null);
        }
        loadDataList$default(c52324wHe, false, false, false, 7, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C52324wHe c52324wHe, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC52662wTs.TaskDescription.showSnackbar$default(c52324wHe, C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatMediaSessionImplApi18), 3, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52324wHe c52324wHe, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsListPresenter) c52324wHe.dxcTrN()).OcIXYQ().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsListPresenter) c52324wHe.dxcTrN()).AkhnZx().bB_())) {
            c52324wHe.KWHzl(((java.lang.Exception) pair.second).getMessage());
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52324wHe, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsListPresenter) c52324wHe.dxcTrN()).gEmmrt().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsListPresenter) c52324wHe.dxcTrN()).values().bB_())) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C52324wHe c52324wHe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ((TacticsListPresenter) c52324wHe.dxcTrN()).djBIcL(true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52324wHe c52324wHe, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c52324wHe.DTwDnp();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C52324wHe c52324wHe, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) c55804xqp.copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrdType(), (java.lang.Object) "smart_arbitrage")) {
            c52324wHe.AubY().AEQbTJ(strategyDetailsResponse.getAccountId(), strategyDetailsResponse.getAlgoId(), strategyDetailsResponse.isHistory());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        int iPx2dp$default;
        dismissLoading();
        boolean z = (((TacticsListPresenter) dxcTrN()).RJOkX() || ((TacticsListPresenter) dxcTrN()).iwGUEr() || ((TacticsListPresenter) dxcTrN()).hDKMBd() || ((TacticsListPresenter) dxcTrN()).getFieldNames()) ? false : true;
        C43316rmw c43316rmwZuBGHE = zuBGHE();
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(str);
        if (z) {
            C55237xgE c55237xgE = ((AbstractC50758vaG) gGvvIC()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55237xgE, "");
            iPx2dp$default = C55298xhM.px2dp$default(C49953uyK.KWHzl(c55237xgE), (android.content.Context) null, 1, (java.lang.Object) null);
        } else {
            iPx2dp$default = 48;
        }
        c43316rmwZuBGHE.setItems(CommonEmptyData.ActionBar.buildErrorData$default(actionBar, strGEmmrt, iPx2dp$default, z ? false : ((TacticsListPresenter) dxcTrN()).QfsBiF(), null, null, false, 56, null));
        zuBGHE().notifyDataSetChanged();
        C33546myW c33546myW = ((AbstractC50758vaG) gGvvIC()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.finishStatus$default(c33546myW, false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        ((AbstractC50758vaG) gGvvIC()).copydefault.OLrzqt(new InterfaceC57903yrG() { // from class: o.wHh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C52324wHe.copydefault(this.EZpvd, interfaceC57934yrl);
            }
        });
        ((AbstractC50758vaG) gGvvIC()).copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.wHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C52324wHe.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C52324wHe c52324wHe, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        InterfaceC55705xow interfaceC55705xow = c52324wHe.zsXlph;
        if (interfaceC55705xow != null) {
            InterfaceC55705xow.Application.refresh$default(interfaceC55705xow, null, 1, null);
        }
    }

    public static final void KWHzl(C52324wHe c52324wHe, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        InterfaceC55705xow interfaceC55705xow = c52324wHe.zsXlph;
        if (interfaceC55705xow != null) {
            interfaceC55705xow.EZpvd();
        }
    }

    public final void zLjUOn() {
        this.AkhnZx = new C52499wNr(null, new Function1() { // from class: o.wId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AhwBna(this.EZpvd, (TacticsData) obj);
            }
        }, new Function1() { // from class: o.wIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.valueOf(this.KWHzl, (TacticsData) obj);
            }
        }, new Function2() { // from class: o.wIp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.copydefault(this.OLrzqt, (kotlin.Pair) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: o.wIq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        }, new Function1() { // from class: o.wIo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.OLrzqt(this.copydefault, (Triple) obj);
            }
        }, new Function1() { // from class: o.wIs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.gEmmrt(this.KWHzl, (TacticsData) obj);
            }
        }, new Function1() { // from class: o.wIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AEQbTJ(this.KWHzl, (Triple) obj);
            }
        }, new yHO() { // from class: o.wIr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.KWHzl(this.AEQbTJ, (TacticsData) obj, ((java.lang.Boolean) obj2).booleanValue(), (Function2) obj3);
            }
        }, new Function1() { // from class: o.wIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AYXKKw(this.copydefault, (TacticsData) obj);
            }
        }, new yHO() { // from class: o.wIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.EZpvd(this.copydefault, (TacticsData) obj, ((java.lang.Integer) obj2).intValue(), (Function1) obj3);
            }
        }, new yHO() { // from class: o.wIf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.KWHzl(this.AEQbTJ, (TacticsData) obj, ((java.lang.Integer) obj2).intValue(), (yHO) obj3);
            }
        }, new yHO() { // from class: o.wIl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.AEQbTJ(this.copydefault, (TacticsVoucherInfo) obj, (TacticsType) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        }, new yHO() { // from class: o.wIi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52324wHe.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, new Function2() { // from class: o.wIk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.AEQbTJ(this.OLrzqt, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: o.wIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.DbNXlk(this.AEQbTJ, (TacticsData) obj);
            }
        }, new Function2() { // from class: o.wIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.AEQbTJ(this.KWHzl, (TacticsData) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 1, null);
    }

    public static final Unit AhwBna(C52324wHe c52324wHe, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C32866mlf.onEvent$default("trade_strategy_operation", (TrackChannel[]) null, new Function1() { // from class: o.wHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c52324wHe.KWHzl(tacticsData.getOrderType(), "card");
        FragmentActivity activity = c52324wHe.getActivity();
        if (activity != null) {
            ActivityC52272wFg.Companion.KWHzl(activity, tacticsData.getAlgoId(), tacticsData.getOrderType(), (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : tacticsData, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "details", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(C52324wHe c52324wHe, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        android.content.Context context = c52324wHe.getContext();
        if (context != null) {
            if (C49955uyM.copydefault(context) instanceof ActivityC52122vzt) {
                c52324wHe.finit().AkhnZx().KWHzl(wPN.AEQbTJ(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getOrderType(), tacticsData.getInstFamily()));
            } else if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "twap") || Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "smart_iceberg")) {
                InterfaceC54581xNr interfaceC54581xNrAEQbTJ = C56066xvm.EZpvd.AEQbTJ();
                if ((interfaceC54581xNrAEQbTJ != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrAEQbTJ, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null) != null) {
                    ActivityC52122vzt.Companion.OLrzqt(context, new BotTradeData(tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), (android.os.Parcelable) null, false, (java.lang.String) null, tacticsData.getInstFamily(), false, (java.util.List) null, 440, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : ((TacticsListPresenter) c52324wHe.dxcTrN()).AuCTel(), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                } else {
                    pUU.KWHzl(c52324wHe.getTAG(), "Clicked on invalid/ delisted " + tacticsData.getInstType() + ", " + tacticsData.getInstId());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52324wHe c52324wHe, kotlin.Pair pair, Function0 function0) {
        Intrinsics.checkNotNullParameter(pair, "");
        ((TacticsData) pair.getSecond()).setSource(((TacticsListPresenter) c52324wHe.dxcTrN()).fARcdN());
        if (yDY.gEmmrt("grid", "contract_grid").contains(((TacticsData) pair.getSecond()).getOrderType())) {
            c52324wHe.DbNXlk = pair;
            c52324wHe.values = function0;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) ((TacticsData) pair.getSecond()).getOrderType(), (java.lang.Object) "grid");
            c52324wHe.showLoading();
            C55915xsu c55915xsuGHZMYf = c52324wHe.gHZMYf();
            java.lang.String orderType = ((TacticsData) pair.getSecond()).getOrderType();
            java.lang.String str = zEZpvd ? "cash" : "cross";
            java.lang.String str2 = zEZpvd ? "" : "net_mode";
            java.lang.Boolean bool = zEZpvd ? java.lang.Boolean.TRUE : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55915xsuGHZMYf.EZpvd(orderType, (64 & 2) != 0 ? "cash" : str, (64 & 4) != 0 ? "" : str2, (64 & 8) != 0 ? java.lang.Boolean.TRUE : bool, (64 & 16) != 0, (64 & 32) != 0 ? null : interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, ((TacticsData) pair.getSecond()).getInstType(), ((TacticsData) pair.getSecond()).getInstId(), null, null, 12, null) : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? ((TacticsData) pair.getSecond()).getTradeQuoteCcy() : null);
        } else {
            c52324wHe.KWHzl((kotlin.Pair<java.lang.String, TacticsData>) pair, (Function0<Unit>) function0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52324wHe c52324wHe, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        BotOperatorButtonDisposer.disposeDisableClick$default(c52324wHe.getNewProxyInstance(), (java.lang.String) pair.getFirst(), null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52324wHe c52324wHe, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c52324wHe.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c52324wHe.EZpvd((Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>) triple, childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C52324wHe c52324wHe, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        vSR.StateListAnimator.newInstance$default(vSR.Companion, tacticsData.getAlgoId(), (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "running") || Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "stopping")) ? false : true, false, 4, null).show(c52324wHe.getChildFragmentManager(), "CopyTradingviewInfoDialog");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52324wHe c52324wHe, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        c52324wHe.AEQbTJ((Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>) triple);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wbf.StateListAnimator.newInstance$default(o.wbf$StateListAnimator, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Float, boolean, boolean, java.lang.String, com.okinc.unify_trade.biz.StrategyDetailsResponse, com.okinc.unify_trade.biz.ArbitrageInfoResponse, com.okinc.unify_trade.biz.StrategyConfigInfo, int, java.lang.Object):o.wbf */
    /* JADX DEBUG: Multi-variable search result rejected for r32v0, resolved type: com.okinc.unify_trade.biz.StrategyConfigInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C52324wHe c52324wHe, TacticsData tacticsData, boolean z, Function2 function2) {
        java.lang.String quoteSymbol;
        java.lang.String quoteSymbol2;
        BotCommon common;
        xOR xorCopydefault;
        ContractGridVo contractGrid;
        SlippageVo slippage;
        java.lang.String closePosSlippage;
        java.lang.String str;
        ContractGridVo contractGrid2;
        SlippageVo slippage2;
        ContractGridVo contractGrid3;
        SlippageVo slippage3;
        ContractGridVo contractGrid4;
        SlippageVo slippage4;
        BotCommon common2;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "dcd_bot")) {
            c52324wHe.wlaJM().OLrzqt(tacticsData);
        } else {
            java.lang.String orderType = tacticsData.getOrderType();
            int iHashCode = orderType.hashCode();
            java.lang.String str2 = "open";
            if (iHashCode != -557961837) {
                if (iHashCode != -512749997) {
                    if (iHashCode == 3181382 && orderType.equals("grid")) {
                        BotVo bot = tacticsData.getBot();
                        if (Intrinsics.EZpvd((java.lang.Object) (bot != null ? bot.getCompliancePauseDisplayType() : null), (java.lang.Object) "complianceResumeFail")) {
                            BotOperatorButtonDisposer.dispose$default(c52324wHe.getNewProxyInstance(), "complianceResumeFail", tacticsData, null, null, null, null, 56, null);
                        } else {
                            BotVo bot2 = tacticsData.getBot();
                            if (Intrinsics.EZpvd(bot2 != null ? bot2.getCompliancePauseDisplayType() : null, (java.lang.Object) "compliancePause")) {
                                FragmentActivity activity = c52324wHe.getActivity();
                                if (activity != null) {
                                    InterfaceC8109awY interfaceC8109awY = (InterfaceC8109awY) C43251rlk.copydefault(InterfaceC8109awY.class);
                                    LifecycleOwner viewLifecycleOwner = c52324wHe.getViewLifecycleOwner();
                                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                                    interfaceC8109awY.OLrzqt(activity, viewLifecycleOwner, "130", new Function0() { // from class: o.wHS
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C52324wHe.AuCTel();
                                        }
                                    }, new Function0() { // from class: o.wHU
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C52324wHe.ejfBZ();
                                        }
                                    });
                                }
                            } else if (tacticsData.getOutOfRange() || C55935xtN.Companion.AEQbTJ(tacticsData.getPerMinProfitRate())) {
                                vGL vglOLrzqt = vGL.Companion.OLrzqt(tacticsData);
                                androidx.fragment.app.FragmentManager parentFragmentManager = c52324wHe.getParentFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                                vglOLrzqt.show(parentFragmentManager);
                            } else {
                                BotVo bot3 = tacticsData.getBot();
                                if (bot3 != null && (common2 = bot3.getCommon()) != null && Intrinsics.EZpvd(common2.getSyncParamFailed(), java.lang.Boolean.TRUE)) {
                                    c52324wHe.KWHzl(z, tacticsData, (Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
                                }
                            }
                        }
                    }
                } else if (orderType.equals("contract_grid")) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) != null && !xorCopydefault.AYXKKw()) {
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        BotVo bot4 = tacticsData.getBot();
                        pairArr[0] = C56390yDp.OLrzqt((bot4 == null || (contractGrid4 = bot4.getContractGrid()) == null || (slippage4 = contractGrid4.getSlippage()) == null) ? null : slippage4.getOpenPosSlippage(), "starting");
                        BotVo bot5 = tacticsData.getBot();
                        pairArr[1] = C56390yDp.OLrzqt((bot5 == null || (contractGrid3 = bot5.getContractGrid()) == null || (slippage3 = contractGrid3.getSlippage()) == null) ? null : slippage3.getClosePosSlippage(), "stopping");
                        java.util.List listGEmmrt = yDY.gEmmrt(pairArr);
                        if (!(listGEmmrt instanceof java.util.Collection) || !listGEmmrt.isEmpty()) {
                            java.util.Iterator it = listGEmmrt.iterator();
                            while (it.hasNext()) {
                                java.lang.String str3 = (java.lang.String) ((kotlin.Pair) it.next()).component1();
                                if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), r5.component2()) && str3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str3) && C33129mqd.AEQbTJ(str3, "0")) {
                                    C50308vJp.Activity activity2 = C50308vJp.Companion;
                                    java.lang.String state = tacticsData.getState();
                                    java.lang.String str4 = (!Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) "starting") && Intrinsics.EZpvd((java.lang.Object) state, (java.lang.Object) "stopping")) ? EopTrackEvent.CLOSE : "open";
                                    java.lang.String algoId = tacticsData.getAlgoId();
                                    java.lang.String instId = tacticsData.getInstId();
                                    java.lang.String instType = tacticsData.getInstType();
                                    java.lang.String state2 = tacticsData.getState();
                                    if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "starting")) {
                                        BotVo bot6 = tacticsData.getBot();
                                        if (bot6 != null && (contractGrid2 = bot6.getContractGrid()) != null && (slippage2 = contractGrid2.getSlippage()) != null) {
                                            closePosSlippage = slippage2.getOpenPosSlippage();
                                            str = closePosSlippage;
                                        }
                                        str = null;
                                    } else {
                                        BotVo bot7 = tacticsData.getBot();
                                        if (bot7 != null && (contractGrid = bot7.getContractGrid()) != null && (slippage = contractGrid.getSlippage()) != null) {
                                            closePosSlippage = slippage.getClosePosSlippage();
                                            str = closePosSlippage;
                                        }
                                        str = null;
                                    }
                                    activity2.AEQbTJ((1600 & 1) != 0 ? false : true, (1600 & 2) != 0 ? "" : str4, (1600 & 4) != 0 ? null : algoId, (1600 & 8) != 0 ? "" : instId, (1600 & 16) != 0 ? "" : instType, (1600 & 32) != 0 ? "" : null, (1600 & 64) == 0 ? state2 : "", (1600 & 128) != 0 ? null : str, (1600 & 256) != 0 ? null : null, (1600 & 512) != 0 ? null : null, (1600 & 1024) == 0 ? tacticsData : null).show(c52324wHe.getParentFragmentManager(), C50308vJp.class.getSimpleName());
                                }
                            }
                            if (!tacticsData.getOutOfRange()) {
                            }
                        }
                    } else if (!tacticsData.getOutOfRange()) {
                        C50225vGn c50225vGnCopydefault = C50225vGn.Companion.copydefault(tacticsData);
                        androidx.fragment.app.FragmentManager parentFragmentManager2 = c52324wHe.getParentFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "");
                        c50225vGnCopydefault.show(parentFragmentManager2);
                    } else {
                        BotVo bot8 = tacticsData.getBot();
                        if (bot8 != null && (common = bot8.getCommon()) != null && Intrinsics.EZpvd(common.getSyncParamFailed(), java.lang.Boolean.TRUE)) {
                            c52324wHe.KWHzl(z, tacticsData, (Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>) function2);
                        }
                    }
                }
            } else if (orderType.equals("smart_arbitrage")) {
                if (tacticsData.getDisplayMinPaybackDays()) {
                    java.lang.String strEZpvd = pDZ.KWHzl.EZpvd(tacticsData.getInstId());
                    C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                    java.lang.String instFamily = tacticsData.getInstFamily();
                    if (instFamily == null) {
                        instFamily = "";
                    }
                    BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, tacticsData.getInstType());
                    java.lang.String str5 = (bizInstrumentCopydefault == null || (quoteSymbol2 = bizInstrumentCopydefault.getQuoteSymbol()) == null) ? "" : quoteSymbol2;
                    C52917wbf.StateListAnimator stateListAnimator = C52917wbf.Companion;
                    java.lang.String instId2 = tacticsData.getInstId();
                    java.lang.String instType2 = tacticsData.getInstType();
                    java.lang.String instFamily2 = tacticsData.getInstFamily();
                    java.lang.String str6 = instFamily2 == null ? "" : instFamily2;
                    java.lang.String algoId2 = tacticsData.getAlgoId();
                    java.lang.String totalAmt = tacticsData.getTotalAmt();
                    java.lang.String str7 = totalAmt == null ? "" : totalAmt;
                    java.lang.String state3 = tacticsData.getState();
                    if (!Intrinsics.EZpvd((java.lang.Object) state3, (java.lang.Object) "opening")) {
                        str2 = Intrinsics.EZpvd((java.lang.Object) state3, (java.lang.Object) "stopping") ? EopTrackEvent.CLOSE : "running";
                    }
                    java.lang.String str8 = str2;
                    boolean zContains = yDY.copydefault("SOL", "ETH", "BTC").contains(strEZpvd);
                    boolean z2 = yDY.copydefault("SOL", "ETH", "BTC").contains(strEZpvd) && C55770xqH.Activity.copydefault.OLrzqt(tacticsData.getLeverPrincipal());
                    java.lang.Float leverPrincipal = tacticsData.getLeverPrincipal();
                    boolean zContains2 = yDY.copydefault("SOL", "ETH").contains(strEZpvd);
                    boolean z3 = yDY.copydefault("SOL", "ETH").contains(strEZpvd) && tacticsData.isSmartArbitrageWithStaking();
                    BotVo bot9 = tacticsData.getBot();
                    ArbitrageInfoResponse arbitrageInfoResponseKWHzl = bot9 != null ? stateListAnimator.KWHzl(bot9, tacticsData) : null;
                    BotVo bot10 = tacticsData.getBot();
                    stateListAnimator.KWHzl(instId2, instType2, (576 & 4) != 0 ? "" : str6, (576 & 8) != 0 ? null : algoId2, (576 & 16) != 0 ? "" : str5, (576 & 32) != 0 ? "" : str7, (576 & 64) != 0 ? "" : null, (576 & 128) != 0 ? "" : str8, (576 & 256) != 0 ? false : zContains, (576 & 512) != 0 ? false : false, (576 & 1024) != 0 ? false : z2, (576 & 2048) != 0 ? null : leverPrincipal, (576 & 4096) != 0 ? false : zContains2, (576 & 8192) != 0 ? false : z3, (576 & 16384) != 0 ? null : "", (32768 & 576) != 0 ? null : null, (65536 & 576) != 0 ? null : arbitrageInfoResponseKWHzl, (576 & 131072) != 0 ? null : bot10 != null ? stateListAnimator.copydefault(bot10, tacticsData) : null).show(c52324wHe.getParentFragmentManager(), C52917wbf.class.getSimpleName());
                } else {
                    C56051xvX c56051xvX2 = C56051xvX.AEQbTJ;
                    java.lang.String instFamily3 = tacticsData.getInstFamily();
                    if (instFamily3 == null) {
                        instFamily3 = "";
                    }
                    BizInstrument bizInstrumentCopydefault2 = c56051xvX2.copydefault(instFamily3, tacticsData.getInstType());
                    java.lang.String str9 = (bizInstrumentCopydefault2 == null || (quoteSymbol = bizInstrumentCopydefault2.getQuoteSymbol()) == null) ? "" : quoteSymbol;
                    C52946wcH.StateListAnimator stateListAnimator2 = C52946wcH.Companion;
                    java.lang.String state4 = tacticsData.getState();
                    java.lang.String str10 = (!Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) "opening") && Intrinsics.EZpvd((java.lang.Object) state4, (java.lang.Object) "stopping")) ? EopTrackEvent.CLOSE : "open";
                    java.lang.String instFamily4 = tacticsData.getInstFamily();
                    java.lang.String str11 = instFamily4 == null ? "" : instFamily4;
                    java.lang.String totalAmt2 = tacticsData.getTotalAmt();
                    stateListAnimator2.copydefault(str10, str11, "simpleFundingFee", totalAmt2 == null ? "" : totalAmt2, str9, true, null, tacticsData.getAlgoId(), null, null, null).show(c52324wHe.getParentFragmentManager(), C52946wcH.class.getSimpleName());
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel() {
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ() {
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C52324wHe c52324wHe, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        wQK wqk = wQK.OLrzqt;
        android.content.Context context = c52324wHe.getContext();
        androidx.fragment.app.FragmentManager childFragmentManager = c52324wHe.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        wqk.AEQbTJ(context, childFragmentManager, tacticsData);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52324wHe c52324wHe, TacticsVoucherInfo tacticsVoucherInfo, TacticsType tacticsType, boolean z) {
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        C52659wTp c52659wTp = C52659wTp.copydefault;
        FragmentActivity fragmentActivityRequireActivity = c52324wHe.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c52659wTp.AEQbTJ(fragmentActivityRequireActivity, tacticsVoucherInfo, ((TacticsListPresenter) c52324wHe.dxcTrN()).QUSxYX(), tacticsType, z);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final C52324wHe c52324wHe, final TacticsData tacticsData, final int i, final Function1 function1) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ((TacticsListPresenter) c52324wHe.dxcTrN()).AEQbTJ(tacticsData.getAlgoId(), new Function1() { // from class: o.wHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.EZpvd(this.copydefault, tacticsData, function1, i, (java.util.List) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52324wHe c52324wHe, TacticsData tacticsData, Function1 function1, int i, java.util.List list) {
        c52324wHe.KWHzl(tacticsData, (java.util.List<StrategyProfitResponse>) list);
        c52324wHe.zLjUOn = false;
        if (function1 != null) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52324wHe c52324wHe, TacticsData tacticsData, int i, yHO yho) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (yho != null) {
            yho.invoke(java.lang.Boolean.valueOf(c52324wHe.zLjUOn), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(c52324wHe.zuBGHE().getItemCount()));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52324wHe c52324wHe, int i, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (((AbstractC50758vaG) c52324wHe.gGvvIC()).AEQbTJ.getScrollState() == 0) {
            if (((TacticsListPresenter) c52324wHe.dxcTrN()).dNCPSb()) {
                ((TacticsListPresenter) c52324wHe.dxcTrN()).OLrzqt(i, str, str2);
            }
            java.lang.Object obj = c52324wHe.zuBGHE().getItems().get(i);
            TacticsData tacticsData = obj instanceof TacticsData ? (TacticsData) obj : null;
            if (tacticsData != null) {
                c52324wHe.OLrzqt(tacticsData);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(final C52324wHe c52324wHe, final TacticsData tacticsData) {
        java.lang.String tvTitle;
        BotVo bot;
        BotCommon common;
        BotCommon common2;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotVo bot2 = tacticsData.getBot();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((bot2 == null || (common2 = bot2.getCommon()) == null) ? null : common2.getStgyName())) || (bot = tacticsData.getBot()) == null || (common = bot.getCommon()) == null || (tvTitle = common.getStgyName()) == null) {
            tvTitle = tacticsData.getTvTitle();
        }
        C50404vNd.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder), tvTitle, (52 & 4) != 0 ? 40 : 0, true, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, new Function2() { // from class: o.wHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.OLrzqt(this.KWHzl, tacticsData, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }).show(c52324wHe.getChildFragmentManager(), c52324wHe.getTAG());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52324wHe c52324wHe, TacticsData tacticsData, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            ((TacticsListPresenter) c52324wHe.dxcTrN()).EZpvd(tacticsData.getAlgoId(), str);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52324wHe c52324wHe, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        ((TacticsListPresenter) c52324wHe.dxcTrN()).OLrzqt(str, z);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52324wHe c52324wHe, TacticsData tacticsData, int i) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ((TacticsListPresenter) c52324wHe.dxcTrN()).copydefault(tacticsData, i);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        ((TacticsListPresenter) dxcTrN()).OLrzqt(str, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z, TacticsData tacticsData, final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        java.lang.String str;
        java.lang.String username;
        str = "";
        if (z) {
            if (((TacticsListPresenter) dxcTrN()).AwvSrB() == null) {
                TacticsListPresenter tacticsListPresenter = (TacticsListPresenter) dxcTrN();
                java.lang.String sourceAlgoId = tacticsData.getSourceAlgoId();
                tacticsListPresenter.OLrzqt(sourceAlgoId != null ? sourceAlgoId : "", new Function1() { // from class: o.wHW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52324wHe.EZpvd(function2, (java.util.List) obj);
                    }
                });
                return;
            } else {
                if (function2 != null) {
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    StgySourceInfo stgySourceInfoAwvSrB = ((TacticsListPresenter) dxcTrN()).AwvSrB();
                    if (stgySourceInfoAwvSrB != null && (username = stgySourceInfoAwvSrB.getUsername()) != null) {
                        str = username;
                    }
                    function2.invoke(bool, str);
                    return;
                }
                return;
            }
        }
        C53922wud.Application application = C53922wud.Companion;
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        application.OLrzqt(parentFragmentManager, tacticsData, ((TacticsListPresenter) dxcTrN()).AwvSrB(), new Function2() { // from class: o.wHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.copydefault(this.KWHzl, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Unit EZpvd(Function2 function2, java.util.List list) {
        java.lang.String username;
        StgySourceInfo stgySourceInfo;
        if (function2 != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (list == null || (stgySourceInfo = (StgySourceInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (username = stgySourceInfo.getUsername()) == null) {
                username = "";
            }
            function2.invoke(bool, username);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52324wHe c52324wHe, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        c52324wHe.copydefault(str, i, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(final TacticsData tacticsData) {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            final boolean z = !((TacticsListPresenter) dxcTrN()).QUSxYX() && C53660wpg.Companion.EZpvd().AEQbTJ(new C53660wpg.Activity(tacticsData.getOrderType())).booleanValue();
            ((TacticsListPresenter) dxcTrN()).AEQbTJ(tacticsData.getAlgoId(), new Function1() { // from class: o.wIg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52324wHe.KWHzl(tacticsData, activity, z, (java.util.List) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(TacticsData tacticsData, FragmentActivity fragmentActivity, boolean z, java.util.List list) {
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "ai_bot")) {
            if ((fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null) != null) {
                C53772wrm.shareAiBot$default(tacticsData, (AbstractActivityC33041mov) fragmentActivity, false, false, 6, null);
            }
            return Unit.INSTANCE;
        }
        C53698wqR.TaskDescription taskDescription = C53698wqR.Companion;
        if (list == null) {
            list = yDY.AhwBna();
        }
        C53698wqR.TaskDescription.share$default(taskDescription, tacticsData, fragmentActivity, true, list, z, null, 32, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
            C55867xrz.clickMyGridBotCard$default(C55867xrz.KWHzl, str, str2, null, 4, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        RecyclerView.LayoutManager layoutManager = ((AbstractC50758vaG) gGvvIC()).AEQbTJ.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1184=4, 1227=4, 1104=5, 1106=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v43, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v52, resolved type: Presenter */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData> triple, androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String first;
        java.lang.String first2;
        android.content.Context context;
        android.content.Context context2;
        java.lang.String first3;
        java.lang.String title;
        java.lang.String title2;
        java.lang.String strValueOf;
        android.content.Context context3;
        if (triple.getSecond() instanceof TacticsData) {
            java.lang.Object second = triple.getSecond();
            java.lang.String str = "";
            Intrinsics.copydefault(second, "");
            TacticsData tacticsData = (TacticsData) second;
            java.lang.String orderType = tacticsData.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (!orderType.equals("spot_dca")) {
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) triple.getFirst(), (java.lang.Object) "last_price") && (context3 = getContext()) != null) {
                        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                        if (oka != null) {
                            oKA.TaskDescription.gotoNewKlinePage$default(oka, context3, marketCoinInfo, null, null, null, null, null, null, null, null, null, 2044, null);
                        }
                        break;
                    }
                    break;
                case -1402017003:
                    if (!orderType.equals("contract_dca")) {
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) triple.getFirst(), (java.lang.Object) "last_price")) {
                    }
                    break;
                case -1216369070:
                    if (!orderType.equals("smart_portfolio")) {
                    }
                    first3 = triple.getFirst();
                    if (first3 == null) {
                        switch (first3.hashCode()) {
                            case -1967119875:
                                if (first3.equals("coin_current_value")) {
                                    TacticsInsideItemData third = triple.getThird();
                                    if (third != null && (title = third.getTitle()) != null) {
                                        str = title;
                                    }
                                    KWHzl(str, ((TacticsListPresenter) dxcTrN()).OLrzqt(tacticsData));
                                    break;
                                }
                                break;
                            case 223653149:
                                if (first3.equals("coin_current_position")) {
                                    TacticsInsideItemData third2 = triple.getThird();
                                    if (third2 != null && (title2 = third2.getTitle()) != null) {
                                        str = title2;
                                    }
                                    KWHzl(str, ((TacticsListPresenter) dxcTrN()).AEQbTJ(tacticsData));
                                    break;
                                }
                                break;
                            case 1594317834:
                                if (first3.equals("coin_target_scale")) {
                                    java.util.List<AllocationItem> listKWHzl = AllocationItem.Companion.KWHzl(tacticsData.getRecItemList());
                                    if (!listKWHzl.isEmpty()) {
                                        C52566wQd.Companion.KWHzl(listKWHzl).show(getChildFragmentManager(), "CoinTargetAllocationRingChartBottomSheet");
                                    }
                                    break;
                                }
                                break;
                            case 1999465411:
                                if (first3.equals("bot_sub_recurring_avg_price")) {
                                    java.util.ArrayList<C55846xre> arrayListEZpvd = ((TacticsListPresenter) dxcTrN()).EZpvd(tacticsData);
                                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
                                    for (C55846xre c55846xre : arrayListEZpvd) {
                                        java.lang.String strOLrzqt = c55846xre.OLrzqt();
                                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                                        if (interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(c55846xre.OLrzqt())) == null) {
                                            strValueOf = "";
                                        }
                                        arrayList.add(new CoinPriceItem(strOLrzqt, strValueOf, c55846xre.KWHzl()));
                                    }
                                    if (!arrayList.isEmpty()) {
                                        CoinsPriceBottomSheet.Companion.copydefault(arrayList, CoinsPriceBottomSheet.Mode.AVERAGE_PRICE).show(getChildFragmentManager(), "CoinsPriceBottomSheet");
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -557961837:
                    if (orderType.equals("smart_arbitrage") && (first = triple.getFirst()) != null) {
                        switch (first.hashCode()) {
                            case -1036831448:
                                if (first.equals("loan_interest_order")) {
                                    ((TacticsListPresenter) dxcTrN()).OLrzqt(tacticsData.getAlgoId());
                                    break;
                                }
                                break;
                            case 1316365756:
                                if (first.equals("arbitrage_pnl_more")) {
                                    C52839waG c52839waGCopydefault = C52839waG.Companion.copydefault(SmartArbDetailsType.Arbitrage, tacticsData, new Function2() { // from class: o.wHK
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return C52324wHe.OLrzqt(this.OLrzqt, (SmartArbDetailsType) obj, (java.lang.String) obj2);
                                        }
                                    });
                                    androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                    c52839waGCopydefault.show(childFragmentManager);
                                    break;
                                }
                                break;
                            case 1764334642:
                                if (first.equals("arbitrage_auto_earn")) {
                                    C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
                                    androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                                    C54132wyb.TaskDescription.newInstance$default(taskDescription, childFragmentManager2, "auto_education_single_earn", tacticsData, false, 8, null);
                                    break;
                                }
                                break;
                            case 1968406406:
                                if (first.equals("arbitrage_rewards_more")) {
                                    C52839waG c52839waGCopydefault2 = C52839waG.Companion.copydefault(SmartArbDetailsType.Staking, tacticsData, new Function2() { // from class: o.wHM
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return C52324wHe.copydefault(this.copydefault, (SmartArbDetailsType) obj, (java.lang.String) obj2);
                                        }
                                    });
                                    androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                                    c52839waGCopydefault2.show(childFragmentManager3);
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid") && (first2 = triple.getFirst()) != null) {
                        switch (first2.hashCode()) {
                            case -2015371680:
                                if (first2.equals("last_price") && (context = getContext()) != null) {
                                    MarketCoinInfo marketCoinInfo2 = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                                    oKA oka2 = (oKA) C43251rlk.OLrzqt(oKA.class);
                                    if (oka2 != null) {
                                        oKA.TaskDescription.gotoNewKlinePage$default(oka2, context, marketCoinInfo2, null, null, null, null, null, null, null, null, null, 2044, null);
                                    }
                                }
                                break;
                            case -1632678308:
                                if (first2.equals("grid_out_of_range_warning")) {
                                    AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.setLocationManually), C33070mpX.AYXKKw(C55688xof.Application.GqbzPL));
                                    break;
                                }
                                break;
                            case 1230585021:
                                if (first2.equals("extra_margin")) {
                                    C53858wtS.Companion.copydefault(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), tacticsData.getDirection(), tacticsData.getLevel(), Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "signal_bot"), tacticsData.getSignalOrderAmtParam()).show(fragmentManager, C53858wtS.class.getSimpleName());
                                    break;
                                }
                                break;
                            case 1637026727:
                                if (first2.equals("WithdrawProfitIcon")) {
                                    FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheetCopydefault = FuturesGridWithdrawProfitSheet.Companion.copydefault(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData, new TacticsListFragment$handleContentClick$2(this));
                                    androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
                                    C49662usl.EZpvd(futuresGridWithdrawProfitSheetCopydefault, childFragmentManager4, "FuturesGridWithdrawProfitSheet");
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                        java.lang.String first4 = triple.getFirst();
                        if (Intrinsics.EZpvd((java.lang.Object) first4, (java.lang.Object) "WithdrawProfitIcon")) {
                            getNewProxyInstance().valueOf(tacticsData, fragmentManager);
                            break;
                        } else if (Intrinsics.EZpvd((java.lang.Object) first4, (java.lang.Object) "last_price") && (context2 = getContext()) != null) {
                            MarketCoinInfo marketCoinInfo3 = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                            oKA oka3 = (oKA) C43251rlk.OLrzqt(oKA.class);
                            if (oka3 != null) {
                                oKA.TaskDescription.gotoNewKlinePage$default(oka3, context2, marketCoinInfo3, null, null, null, null, null, null, null, null, null, 2044, null);
                            }
                            break;
                        }
                    }
                    break;
                case 1165749981:
                    if (!orderType.equals("recurring")) {
                    }
                    first3 = triple.getFirst();
                    if (first3 == null) {
                    }
                    break;
                case 1485620813:
                    if (!orderType.equals("dcd_bot")) {
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) triple.getFirst(), (java.lang.Object) "last_price")) {
                    }
                    break;
            }
        }
    }

    public static final Unit OLrzqt(C52324wHe c52324wHe, SmartArbDetailsType smartArbDetailsType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        c52324wHe.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52324wHe c52324wHe, SmartArbDetailsType smartArbDetailsType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        c52324wHe.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData> triple) {
        TacticsData tacticsData;
        androidx.fragment.app.FragmentManager childFragmentManager;
        java.lang.String doubtTitle;
        java.lang.String doubtMsg;
        if (triple.getSecond() == null || !(triple.getSecond() instanceof TacticsData)) {
            return;
        }
        TacticsUiConst.BotListSubItemType first = triple.getFirst();
        java.lang.String str = "";
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.Default) {
            TacticsInsideItemData third = triple.getThird();
            if (third == null || (doubtTitle = third.getDoubtTitle()) == null) {
                doubtTitle = "";
            }
            TacticsInsideItemData third2 = triple.getThird();
            if (third2 != null && (doubtMsg = third2.getDoubtMsg()) != null) {
                str = doubtMsg;
            }
            AEQbTJ(doubtTitle, str);
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) {
            TacticsUiConst.BotListSubItemType first2 = triple.getFirst();
            Intrinsics.copydefault(first2, "");
            java.lang.String strOLrzqt = ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) first2).OLrzqt();
            TacticsUiConst.BotListSubItemType first3 = triple.getFirst();
            Intrinsics.copydefault(first3, "");
            AEQbTJ(strOLrzqt, ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) first3).AEQbTJ());
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbProfitsDetails) {
            java.lang.Object second = triple.getSecond();
            tacticsData = second instanceof TacticsData ? (TacticsData) second : null;
            if (tacticsData != null) {
                AEQbTJ(SmartArbDetailsType.Arbitrage, tacticsData);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(first, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails.copydefault)) {
            java.lang.Object second2 = triple.getSecond();
            tacticsData = second2 instanceof TacticsData ? (TacticsData) second2 : null;
            if (tacticsData != null) {
                AEQbTJ(SmartArbDetailsType.Staking, tacticsData);
                return;
            }
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbAutoEarn) {
            java.lang.Object second3 = triple.getSecond();
            tacticsData = second3 instanceof TacticsData ? (TacticsData) second3 : null;
            if (tacticsData == null || (childFragmentManager = getChildFragmentManager()) == null) {
                return;
            }
            C54066wxO.Companion.AEQbTJ(childFragmentManager, "auto_earn_and_staking", null, new TacticsVipProfitData(tacticsData.getInstId(), null, "auto_earn_and_staking", "smart_arbitrage", null, null, 50, null), true, 0);
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) {
            TacticsUiConst.BotListSubItemType first4 = triple.getFirst();
            Intrinsics.copydefault(first4, "");
            final TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails contractGridProfitDetails = (TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) first4;
            this.fetchVPNInfo = contractGridProfitDetails.AEQbTJ();
            C51046vfd c51046vfdEZpvd = C51046vfd.Companion.EZpvd(contractGridProfitDetails.EZpvd(), contractGridProfitDetails.KWHzl(), contractGridProfitDetails.copydefault(), new Function0() { // from class: o.wHD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52324wHe.copydefault(this.KWHzl, contractGridProfitDetails);
                }
            }, new Function0() { // from class: o.wHF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52324wHe.fIwbmz(this.KWHzl);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C49662usl.EZpvd(c51046vfdEZpvd, childFragmentManager2, "GridProfitBottomSheet");
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.WithdrawContractGridProfits) {
            java.lang.Object second4 = triple.getSecond();
            TacticsData tacticsData2 = second4 instanceof TacticsData ? (TacticsData) second4 : null;
            if (tacticsData2 == null) {
                return;
            }
            FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheetCopydefault = FuturesGridWithdrawProfitSheet.Companion.copydefault(tacticsData2.getAlgoId(), tacticsData2.getInstId(), tacticsData2.getInstType(), tacticsData2, new TacticsListFragment$handleSubItemClick$6(this));
            androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            C49662usl.EZpvd(futuresGridWithdrawProfitSheetCopydefault, childFragmentManager3, "FuturesGridWithdrawProfitSheet");
            return;
        }
        if (!(first instanceof TacticsUiConst.BotListSubItemType.BotSubPosition) && !Intrinsics.EZpvd(first, TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final Unit copydefault(C52324wHe c52324wHe, TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails contractGridProfitDetails) {
        c52324wHe.AEQbTJ(contractGridProfitDetails.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C52324wHe c52324wHe) {
        c52324wHe.fetchVPNInfo = null;
        Job job = c52324wHe.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        c52324wHe.fARcdN = null;
        C51046vfd.Companion.KWHzl().tryEmit(null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(SmartArbDetailsType smartArbDetailsType, final TacticsData tacticsData) {
        C52839waG c52839waGCopydefault = C52839waG.Companion.copydefault(smartArbDetailsType, tacticsData, new Function2() { // from class: o.wHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.KWHzl(tacticsData, this, (SmartArbDetailsType) obj, (java.lang.String) obj2);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c52839waGCopydefault.show(childFragmentManager);
    }

    public static final Unit KWHzl(TacticsData tacticsData, C52324wHe c52324wHe, SmartArbDetailsType smartArbDetailsType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        SmartArbProfitsInfo smartArbProfitsInfo = tacticsData.getSmartArbProfitsInfo();
        ProfitDetailResponse arbitrageProfit = smartArbProfitsInfo != null ? smartArbProfitsInfo.getArbitrageProfit() : null;
        SmartArbProfitsInfo smartArbProfitsInfo2 = tacticsData.getSmartArbProfitsInfo();
        ProfitDetailResponse stakingProfit = smartArbProfitsInfo2 != null ? smartArbProfitsInfo2.getStakingProfit() : null;
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = c52324wHe.AEQbTJ(arbitrageProfit);
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ2 = c52324wHe.AEQbTJ(stakingProfit);
        java.lang.String strComponent12 = pairAEQbTJ2.component1();
        java.lang.String strComponent22 = pairAEQbTJ2.component2();
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context contextRequireContext = c52324wHe.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/profit_history", C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", str), C56390yDp.OLrzqt("arbPnl", strComponent1), C56390yDp.OLrzqt("arbCcy", strComponent2), C56390yDp.OLrzqt("stakePnl", strComponent12), C56390yDp.OLrzqt("stakeCcy", strComponent22)));
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(ProfitDetailResponse profitDetailResponse) {
        return profitDetailResponse == null ? uLY.AEQbTJ.AEQbTJ() : C56390yDp.OLrzqt(profitDetailResponse.getWithdrawn(), profitDetailResponse.getCcy());
    }

    public final void AEQbTJ(java.lang.String str) {
        android.content.Context context = getContext();
        if (context != null) {
            C51001vel.copydefault.copydefault(context, "trade_bot/bot_detail/page", BundleKt.bundleOf(C56390yDp.OLrzqt("algoId", java.lang.Long.valueOf(C33129mqd.valueOf(str))), C56390yDp.OLrzqt("detailAction", java.lang.Integer.valueOf(TacticsDetailsActionEnum.NAVIGATE_EVENT_HISTORY.getCode()))));
        }
    }

    public final void AuCTelauCTel() {
        loadDataList$default(this, !iwGUEr().isConnected(), false, false, 6, null);
    }

    public static /* synthetic */ void showTitleMsgDialog$default(C52324wHe c52324wHe, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c52324wHe.AEQbTJ(str, str2);
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52324wHe.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        zLjUOn();
        C52499wNr c52499wNr = this.AkhnZx;
        if (c52499wNr == null) {
            return;
        }
        C52517wOi c52517wOi = new C52517wOi(c52499wNr, getParentFragmentManager(), ORxRYg(), hDKMBd());
        this.AuCTelauCTel = c52517wOi;
        uKR ukr = new uKR(c52499wNr, ORxRYg(), hDKMBd());
        this.hDKMBd = ukr;
        zuBGHE().register(TacticsData.class).copydefault(new wMN(c52499wNr), ukr, c52517wOi, new wMX()).OLrzqt(new InterfaceC59526zih() { // from class: o.wHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59526zih
            public final java.lang.Class EZpvd(int i, java.lang.Object obj) {
                return C52324wHe.KWHzl(i, (TacticsData) obj);
            }
        });
        zuBGHE().register(EmptyData.class, new C50041uzt(new Function1() { // from class: o.wHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.KWHzl(this.KWHzl, (EmptyData) obj);
            }
        }));
        zuBGHE().register(BotToMPRecommendCard.class, new C52497wNp(new Function0() { // from class: o.wHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.fARcdN(this.KWHzl);
            }
        }, new Function1() { // from class: o.wIj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        zuBGHE().register(BotNoticeData.class, new C52483wNb(new Function0() { // from class: o.wIu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.AuCTel(this.OLrzqt);
            }
        }));
        zuBGHE().register(BotGuiderViewData.class, new C52715wVr(new Function1() { // from class: o.wIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AhwBna(this.EZpvd, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AYXKKw(this.EZpvd, (java.lang.String) obj);
            }
        }, ORxRYg()));
        zuBGHE().register(wOI.class, new wOG(new Function0() { // from class: o.wHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.ejfBZ(this.KWHzl);
            }
        }));
        RecyclerView recyclerView = ((AbstractC50758vaG) gGvvIC()).AEQbTJ;
        recyclerView.setAdapter(zuBGHE());
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(getActivity()));
        recyclerView.addOnChildAttachStateChangeListener(new ActionBar());
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
        C52663wTt c52663wTt = this.fJNWhG;
        Intrinsics.copydefault(recyclerView);
        C52663wTt.attachToRecyclerView$default(c52663wTt, recyclerView, 0, false, new Function1() { // from class: o.wHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.OLrzqt(this.KWHzl, (C52661wTr) obj);
            }
        }, 6, null);
    }

    public static final java.lang.Class KWHzl(int i, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (tacticsData.getOrderType().length() == 0 || tacticsData.getState().length() == 0) {
            return wMX.class;
        }
        TacticsType tacticsType = tacticsData.getTacticsType();
        int i2 = tacticsType == null ? -1 : Activity.EZpvd[tacticsType.ordinal()];
        return i2 != 1 ? i2 != 2 ? C52517wOi.class : uKR.class : wMN.class;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52324wHe c52324wHe, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        if (emptyData instanceof OngoingBotsOnshoreEmptyData) {
            c52324wHe.sSMYrx().copydefault(C52004vxh.Activity.TaskDescription.EZpvd);
        } else if (((TacticsListPresenter) c52324wHe.dxcTrN()).getFieldNames() && !C55697xoo.OLrzqt.isConnected()) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                android.content.Context contextRequireContext = c52324wHe.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
            }
        } else {
            loadDataList$default(c52324wHe, false, false, false, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fARcdN(C52324wHe c52324wHe) {
        C55867xrz.clickForOngoingNmpRecommend$default(C55867xrz.KWHzl, ((TacticsListPresenter) c52324wHe.dxcTrN()).getFieldNames(), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(C52324wHe c52324wHe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55867xrz.KWHzl.KWHzl(((TacticsListPresenter) c52324wHe.dxcTrN()).getFieldNames(), str);
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C52324wHe c52324wHe) {
        SPUtils.put("ice_berg_offline_notice-" + C55697xoo.OLrzqt.gEmmrt(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        loadDataList$default(c52324wHe, false, false, false, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AhwBna(C52324wHe c52324wHe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String strDjBIcL = c56059xvf.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strAYXKKw = c56059xvf.AYXKKw();
        java.lang.String str2 = strAYXKKw == null ? "" : strAYXKKw;
        FragmentActivity activity = c52324wHe.getActivity();
        if (activity != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "all_bot")) {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, C56071xvr.getBotMpPagePath$default(C56071xvr.gEmmrt, null, null, false, 7, null), null, new Function1() { // from class: o.wIa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52324wHe.EZpvd((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return Unit.INSTANCE;
            }
            if (activity instanceof ActivityC52122vzt) {
                ((TacticsListPresenter) c52324wHe.dxcTrN()).sSMYrx().KWHzl().postValue(wPN.buildJumpData$default(strDjBIcL, str2, str, null, 8, null));
            } else {
                C32866mlf.onEvent$default("PlaceOrder_BotPrompt_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wIb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52324wHe.OLrzqt((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "twap") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_iceberg")) {
                    InterfaceC54581xNr interfaceC54581xNrAEQbTJ = C56066xvm.EZpvd.AEQbTJ();
                    if ((interfaceC54581xNrAEQbTJ != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrAEQbTJ, str2, strDjBIcL, null, null, 12, null) : null) != null) {
                        ActivityC52122vzt.Companion.OLrzqt(activity, new BotTradeData(str, strDjBIcL, str2, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : ((TacticsListPresenter) c52324wHe.dxcTrN()).AuCTel(), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                    } else {
                        pUU.KWHzl(c52324wHe.getTAG(), "Clicked on invalid/ delisted " + str2 + ", " + strDjBIcL);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C52324wHe c52324wHe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = c52324wHe.getActivity();
        if (activity != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_tactics") ? C56071xvr.getBotMpPagePath$default(C56071xvr.gEmmrt, null, null, false, 7, null) : "social/trade/community?location=HOT", null, new Function1() { // from class: o.wIc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52324wHe.KWHzl((AbstractC43238rlX) obj);
                }
            }, 4, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C52324wHe c52324wHe) {
        if (c52324wHe.getContext() != null) {
            if (c52324wHe.ORxRYg()) {
                C32866mlf.onEvent$default("OEXActivityTab_BotsTab_ViewHistory_Click", (TrackChannel[]) null, new Function1() { // from class: o.wHN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C52324wHe.copydefault((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }
            InterfaceC49499uph interfaceC49499uphEZpvd = C53685wqE.copydefault.EZpvd();
            FragmentActivity fragmentActivityRequireActivity = c52324wHe.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC49499uphEZpvd.EZpvd(fragmentActivityRequireActivity, "his_bot");
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wHe$ActionBar */
    public static final class ActionBar implements RecyclerView.OnChildAttachStateChangeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public ActionBar() {
        }

        public static final void KWHzl(C52324wHe c52324wHe) {
            c52324wHe.fJNWhG();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            final C52324wHe c52324wHe = C52324wHe.this;
            view.post(new java.lang.Runnable() { // from class: o.wIF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C52324wHe.ActionBar.KWHzl(c52324wHe);
                }
            });
        }
    }

    public static final Unit OLrzqt(final C52324wHe c52324wHe, C52661wTr c52661wTr) {
        Intrinsics.checkNotNullParameter(c52661wTr, "");
        c52661wTr.OLrzqt(new Function2() { // from class: o.wHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52324wHe.KWHzl(this.AEQbTJ, (android.view.View) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52324wHe c52324wHe, android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.List<java.lang.Integer> listEZpvd = c52324wHe.fJNWhG.EZpvd(i, c52324wHe.zuBGHE().getItemCount());
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.lang.Object obj = c52324wHe.zuBGHE().getItems().get(iIntValue);
            TacticsData tacticsData = obj instanceof TacticsData ? (TacticsData) obj : null;
            if (tacticsData != null) {
                if (((TacticsListPresenter) c52324wHe.dxcTrN()).dNCPSb()) {
                    ((TacticsListPresenter) c52324wHe.dxcTrN()).OLrzqt(iIntValue, tacticsData.getAlgoId(), tacticsData.getOrderType());
                }
                c52324wHe.OLrzqt(tacticsData);
            }
        }
        java.util.Iterator<T> it2 = c52324wHe.fJNWhG.AEQbTJ(listEZpvd, c52324wHe.zuBGHE().getItemCount()).iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((java.lang.Number) it2.next()).intValue();
            java.lang.Object obj2 = c52324wHe.zuBGHE().getItems().get(iIntValue2);
            TacticsData tacticsData2 = obj2 instanceof TacticsData ? (TacticsData) obj2 : null;
            if (tacticsData2 != null) {
                ((TacticsListPresenter) c52324wHe.dxcTrN()).KWHzl(iIntValue2, tacticsData2.getAlgoId());
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadDataList$default(C52324wHe c52324wHe, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        c52324wHe.copydefault(z, z2, z3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z, boolean z2, boolean z3) {
        if (C55697xoo.OLrzqt.isConnected()) {
            boolean z4 = false;
            if (((TacticsListPresenter) dxcTrN()).RJOkX()) {
                ((TacticsListPresenter) dxcTrN()).isConnected(iwGUEr().isConnected());
            } else {
                ((TacticsListPresenter) dxcTrN()).isConnected(false);
            }
            if (((TacticsListPresenter) dxcTrN()).QVAiDq() || z) {
                ((TacticsListPresenter) dxcTrN()).copydefault();
                zuBGHE().setItems(yDY.AhwBna());
                zuBGHE().notifyDataSetChanged();
            }
            if (z2) {
                showLoading();
            }
            TacticsListPresenter tacticsListPresenter = (TacticsListPresenter) dxcTrN();
            if (z3 || (((TacticsListPresenter) dxcTrN()).RJOkX() && ((TacticsListPresenter) dxcTrN()).aKErDB())) {
                z4 = true;
            }
            tacticsListPresenter.EZpvd(z4, AxsJAY().copydefault(), AxsJAY().AEQbTJ());
            ((TacticsListPresenter) dxcTrN()).dxcTrN();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(final TacticsData tacticsData) {
        MpStgyCopyProfitChangeData profitData;
        java.util.List<StrategyProfitResponse> profitList;
        if (((TacticsListPresenter) dxcTrN()).QUSxYX() || AxsJAY().copydefault().getCardStyle() != CardStyle.DETAILED) {
            return;
        }
        if ((tacticsData.getProfitData() == null || (profitData = tacticsData.getProfitData()) == null || (profitList = profitData.getProfitList()) == null || !C33129mqd.KWHzl((java.util.Collection) profitList)) && !C33129mqd.KWHzl((java.util.Collection) tacticsData.getProfitSnapshots())) {
            ((TacticsListPresenter) dxcTrN()).AEQbTJ(tacticsData.getAlgoId(), new Function1() { // from class: o.wIz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52324wHe.OLrzqt(this.AEQbTJ, tacticsData, (java.util.List) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(C52324wHe c52324wHe, TacticsData tacticsData, java.util.List list) {
        c52324wHe.KWHzl(tacticsData, (java.util.List<StrategyProfitResponse>) list);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        return ((TacticsListPresenter) dxcTrN()).zLjUOn();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        android.view.View root;
        android.view.View view;
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = getContext();
        if (context != null) {
            if (z) {
                root = ((AbstractC50758vaG) gGvvIC()).getRoot();
                if (root == null) {
                    return;
                }
            } else {
                androidx.fragment.app.Fragment parentFragment = getParentFragment();
                if (parentFragment == null || (view = parentFragment.getView()) == null || (root = view.getRootView()) == null) {
                    root = ((AbstractC50758vaG) gGvvIC()).getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                }
            }
            C55284xgz c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(context, root, str);
            if (c55284xgzAEQbTJ != null) {
                c55284xgzAEQbTJ.isConnected(i);
                c55284xgzAEQbTJ.hDKMBd();
            }
        }
    }

    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        AEQbTJ(tacticsData);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        if (!C55697xoo.OLrzqt.isConnected()) {
            C49952uyJ.copydefault(zuBGHE(), yDY.AhwBna(), "", ((TacticsListPresenter) dxcTrN()).getFieldNames() ? 48 : 96, ((TacticsListPresenter) dxcTrN()).getFieldNames() ? C33070mpX.AYXKKw(C55688xof.Application.uzCIH) : "", C33070mpX.AYXKKw(C55688xof.Application.Experimental), (((TacticsListPresenter) dxcTrN()).RJOkX() || ((TacticsListPresenter) dxcTrN()).iwGUEr() || ((TacticsListPresenter) dxcTrN()).getFieldNames()) ? false : true);
        } else {
            showLoading();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TacticsListFragment$onVisible$1(this, null), 3, null);
        }
    }

    public final void zsXlph() {
        loadDataList$default(this, false, false, false, 7, null);
    }

    public final void KWHzl(java.lang.String str, java.util.ArrayList<C55846xre> arrayList) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(str);
        C52559wPx.KWHzl(viewOnClickListenerC54939xaY, arrayList);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52324wHe.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (zuBGHE().getItems().isEmpty()) {
            StatefulView.Status statusOLrzqt = ((AbstractC50758vaG) gGvvIC()).EZpvd.OLrzqt();
            StatefulView.Status status = StatefulView.Status.Loading;
            if (statusOLrzqt != status) {
                ((AbstractC50758vaG) gGvvIC()).EZpvd.setLoadingDelayedTime(100L);
                ((AbstractC50758vaG) gGvvIC()).EZpvd.setStatus(status);
                android.view.View viewAEQbTJ = ((AbstractC50758vaG) gGvvIC()).EZpvd.AEQbTJ(status);
                if (viewAEQbTJ != null) {
                    wMZ.copydefault(viewAEQbTJ);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        StatefulView.Status statusOLrzqt = ((AbstractC50758vaG) gGvvIC()).EZpvd.OLrzqt();
        StatefulView.Status status = StatefulView.Status.Loading;
        if (statusOLrzqt == status) {
            android.view.View viewAEQbTJ = ((AbstractC50758vaG) gGvvIC()).EZpvd.AEQbTJ(status);
            if (viewAEQbTJ != null) {
                wMZ.KWHzl(viewAEQbTJ);
            }
            ((AbstractC50758vaG) gGvvIC()).EZpvd.setStatus(StatefulView.Status.Content);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AkhnZx = null;
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fARcdN = null;
        zuBGHE().setItems(yDY.AhwBna());
        ((AbstractC50758vaG) gGvvIC()).AEQbTJ.setAdapter(null);
        this.fJNWhG.EZpvd();
        C52690wUt c52690wUt = C52690wUt.copydefault;
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c52690wUt.OLrzqt(parentFragmentManager, "bot_filter", "refresh_bot_action", "bot_nmp_empty_status");
        C52517wOi c52517wOi = this.AuCTelauCTel;
        if (c52517wOi != null) {
            c52517wOi.AEQbTJ();
        }
        this.AuCTelauCTel = null;
        this.zsXlph = null;
        gHZMYf().AYXKKw();
        super.onDestroyView();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        this.fJNWhG.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        if (!isVisible() || !((TacticsListPresenter) dxcTrN()).dNCPSb() || zuBGHE().getItemCount() <= 0 || this.fJNWhG.KWHzl()) {
            return;
        }
        this.fJNWhG.OLrzqt();
    }

    public final void copydefault(java.util.List<? extends java.lang.Object> list) {
        java.lang.String str = this.fetchVPNInfo;
        if (str == null) {
            return;
        }
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fARcdN = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), null, new TacticsListFragment$handleCurrentViewingBot$1(list, str, null), 2, null);
    }

    public final void KWHzl(final kotlin.Pair<java.lang.String, TacticsData> pair, Function0<Unit> function0) {
        getNewProxyInstance().AEQbTJ(pair.getFirst(), pair.getSecond(), function0, new Function0() { // from class: o.wIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52324wHe.djBIcL(this.EZpvd, pair);
            }
        }, gHZMYf().AhwBna(), gHZMYf().EZpvd());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit djBIcL(C52324wHe c52324wHe, final kotlin.Pair pair) {
        C32866mlf.onEvent$default("TradingBot_SharePoster_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52324wHe.AEQbTJ(pair, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        c52324wHe.KWHzl(((TacticsData) pair.getSecond()).getOrderType(), "share");
        java.lang.String orderType = ((TacticsData) pair.getSecond()).getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    c52324wHe.AEQbTJ((TacticsData) pair.getSecond());
                } else {
                    if (C53685wqE.copydefault.copydefault().EZpvd(c52324wHe.getContext())) {
                        if (((TacticsListPresenter) c52324wHe.dxcTrN()).QUSxYX()) {
                            wUF.OLrzqt();
                        } else {
                            wUF.AEQbTJ();
                        }
                    } else {
                        wUF.EZpvd();
                    }
                    ((TacticsListPresenter) c52324wHe.dxcTrN()).copydefault((TacticsData) pair.getSecond());
                }
                break;
            case -1418042064:
                if (!orderType.equals("ai_bot")) {
                }
                break;
            case -1402017003:
                if (!orderType.equals("contract_dca")) {
                }
                break;
            case -1216369070:
                if (!orderType.equals("smart_portfolio")) {
                }
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    ((TacticsListPresenter) c52324wHe.dxcTrN()).KWHzl((TacticsData) pair.getSecond());
                    break;
                }
                break;
            case -557961837:
                if (!orderType.equals("smart_arbitrage")) {
                }
                break;
            case 1165749981:
                if (!orderType.equals("recurring")) {
                }
                break;
            case 1485620813:
                if (!orderType.equals("dcd_bot")) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(kotlin.Pair pair, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", ((TacticsData) pair.getSecond()).getHistory() ? "history" : "pendding", true);
        EventParamsList.put$default(eventParamsList, "bot_type", ((TacticsData) pair.getSecond()).getOrderType(), false, 4, null);
        return Unit.INSTANCE;
    }
}
