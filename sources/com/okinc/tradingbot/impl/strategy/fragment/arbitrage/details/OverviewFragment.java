package com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage;
import com.okinc.tradingbot.impl.dto.GridReinvestedProfitsQueryVO;
import com.okinc.tradingbot.impl.dto.GridWithdrawnProfitsQueryVO;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsType;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment;
import com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.view.AllocationItem;
import com.okinc.tradingbot.impl.strategy.view.CoinPriceItem;
import com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.ProfitMarginPerCcyVo;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.SwapCoinMProfitSwitchUiModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVipProfitData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
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
import kotlinx.coroutines.Job;
import o.AbstractC54033wwi;
import o.AbstractC54531xLw;
import o.ActivityC52122vzt;
import o.C32866mlf;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43056riA;
import o.C43251rlk;
import o.C48033uCm;
import o.C48168uHm;
import o.C48194uIl;
import o.C48208uIz;
import o.C48264uLa;
import o.C49662usl;
import o.C50225vGn;
import o.C50252vHn;
import o.C51046vfd;
import o.C51601vqB;
import o.C51972vxB;
import o.C52499wNr;
import o.C52534wOz;
import o.C52566wQd;
import o.C52659wTp;
import o.C52692wUv;
import o.C52761wXj;
import o.C52839waG;
import o.C53660wpg;
import o.C53698wqR;
import o.C53858wtS;
import o.C54066wxO;
import o.C54132wyb;
import o.C54589xNz;
import o.C55249xgQ;
import o.C55251xgS;
import o.C55258xgZ;
import o.C55284xgz;
import o.C55296xhK;
import o.C55298xhM;
import o.C55372xih;
import o.C55688xof;
import o.C55804xqp;
import o.C55889xsU;
import o.C55930xtI;
import o.C55936xtO;
import o.C56033xvF;
import o.C56066xvm;
import o.C56071xvr;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56424yEw;
import o.C56524yIo;
import o.InterfaceC52662wTs;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.ViewOnClickListenerC54939xaY;
import o.oKA;
import o.pUU;
import o.uHJ;
import o.uIG;
import o.uII;
import o.uLY;
import o.uSF;
import o.wMT;
import o.wOC;
import o.wOD;
import o.wUF;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class OverviewFragment extends AbstractC54033wwi implements InterfaceC52662wTs, LifecycleObserver, uHJ {
    public final InterfaceC56387yDm AYXKKw;
    public uSF AhwBna;
    public WeakReference<C52499wNr> AkhnZx;
    public wOD AuCTel;
    public final int DbNXlk = C48033uCm.Activity.invokespecialROgMPW;
    public C52499wNr djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public TacticsData fARcdN;
    public List<StrategyProfitResponse> fIwbmz;
    public List<StrategyProfitResponse> fJNWhG;
    public String fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public Job isConnected;
    public final InterfaceC56387yDm valueOf;
    public TabLayout.OnTabSelectedListener values;

    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
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

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsType.values().length];
            try {
                iArr[TacticsType.TACTICS_GRDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsType.TACTICS_SPOT_DCA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull String str, @NotNull String str2) {
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

    public OverviewFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$viewModels$default$2
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
        this.ejfBZ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.details.OverviewFragment$special$$inlined$activityViewModels$default$3
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.wwp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OverviewFragment.djBIcL(this.copydefault);
            }
        });
        this.fARcdN = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        this.fJNWhG = new ArrayList();
        this.fIwbmz = new ArrayList();
        this.AkhnZx = new WeakReference<>(null);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OverviewFragment.values(this.OLrzqt);
            }
        });
    }

    public final OverviewViewModel AkhnZx() {
        return (OverviewViewModel) this.ejfBZ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsDetailPresenter isConnected() {
        return (TacticsDetailPresenter) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyDetailsResponse AuCTel() {
        return (StrategyDetailsResponse) this.AYXKKw.getValue();
    }

    public static final StrategyDetailsResponse djBIcL(OverviewFragment overviewFragment) {
        return overviewFragment.isConnected().AhwBna();
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, View view2, TacticsData tacticsData) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = view2;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setMetadata));
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.getCTime());
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ProfitDetailResponse AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ProfitDetailResponse KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ OverviewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, OverviewFragment overviewFragment, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = overviewFragment;
            this.KWHzl = profitDetailResponse;
            this.AEQbTJ = profitDetailResponse2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SmartArbitrageVo smartArbitrage;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Pair pairAEQbTJ = this.copydefault.AEQbTJ(this.KWHzl);
                String str = (String) pairAEQbTJ.component1();
                String str2 = (String) pairAEQbTJ.component2();
                Pair pairAEQbTJ2 = this.copydefault.AEQbTJ(this.AEQbTJ);
                String str3 = (String) pairAEQbTJ2.component1();
                String str4 = (String) pairAEQbTJ2.component2();
                OverviewFragment overviewFragment = this.copydefault;
                BotVo bot = overviewFragment.AuCTel().getBot();
                Pair pairAEQbTJ3 = overviewFragment.AEQbTJ((bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingProfit());
                String str5 = (String) pairAEQbTJ3.component1();
                String str6 = (String) pairAEQbTJ3.component2();
                C43056riA c43056riA = C43056riA.AEQbTJ;
                Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/profit_history", C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", this.copydefault.AuCTel().getAlgoId()), C56390yDp.OLrzqt("arbPnl", str), C56390yDp.OLrzqt("arbCcy", str2), C56390yDp.OLrzqt("stakePnl", str3), C56390yDp.OLrzqt("stakeCcy", str4), C56390yDp.OLrzqt("autoStakeCcy", str6), C56390yDp.OLrzqt("autoStakePnl", str5)));
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ OverviewFragment AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ TacticsListLabelUiData OLrzqt;
        public final /* synthetic */ TacticsData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, TacticsListLabelUiData tacticsListLabelUiData, OverviewFragment overviewFragment, TacticsData tacticsData) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = tacticsListLabelUiData;
            this.AEQbTJ = overviewFragment;
            this.copydefault = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yHO<TacticsVoucherInfo, TacticsType, Boolean, Unit> yhoDbNXlk;
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            BizInstrument bizInstrumentValueOf;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                TacticsListLabelUiData tacticsListLabelUiData = this.OLrzqt;
                if (tacticsListLabelUiData instanceof TacticsListLabelVoucherData) {
                    C52499wNr c52499wNr = (C52499wNr) this.AEQbTJ.AkhnZx.get();
                    if (c52499wNr == null || (yhoDbNXlk = c52499wNr.DbNXlk()) == null) {
                        return;
                    }
                    TacticsVoucherInfo tacticsVoucherInfoEZpvd = ((TacticsListLabelVoucherData) this.OLrzqt).EZpvd();
                    TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(this.copydefault.getOrderType());
                    InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                    yhoDbNXlk.invoke(tacticsVoucherInfoEZpvd, tacticsTypeAEQbTJ, Boolean.valueOf((interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(this.copydefault.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.copydefault.getInstId())) == null) ? false : Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), Boolean.TRUE)));
                    return;
                }
                if (tacticsListLabelUiData instanceof TacticsListLabelLeverPrincipalData) {
                    C51972vxB c51972vxB = new C51972vxB(((TacticsListLabelLeverPrincipalData) tacticsListLabelUiData).djBIcL(), ((TacticsListLabelLeverPrincipalData) this.OLrzqt).gEmmrt(), ((TacticsListLabelLeverPrincipalData) this.OLrzqt).EZpvd());
                    androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    c51972vxB.show(childFragmentManager);
                    return;
                }
                if (tacticsListLabelUiData instanceof TacticsListLabelVipProfitData) {
                    C54066wxO.ActionBar actionBar = C54066wxO.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager2 = this.AEQbTJ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    String strKWHzl = ((TacticsListLabelVipProfitData) this.OLrzqt).EZpvd().KWHzl();
                    actionBar.AEQbTJ(childFragmentManager2, strKWHzl == null ? "" : strKWHzl, (56 & 4) != 0 ? null : null, (56 & 8) != 0 ? null : ((TacticsListLabelVipProfitData) this.OLrzqt).EZpvd(), (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
                }
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ OverviewFragment AEQbTJ;
        public final /* synthetic */ TextView EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ GridReinvestedProfitsQueryVO OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, TextView textView, GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO, OverviewFragment overviewFragment) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = textView;
            this.OLrzqt = gridReinvestedProfitsQueryVO;
            this.AEQbTJ = overviewFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Context context = this.EZpvd.getContext();
                if (context != null) {
                    C43056riA.AEQbTJ.OLrzqt(context, "okluatradingeco", "/bot/grid/profit-info", C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", "reinvested"), C56390yDp.OLrzqt("algoId", this.OLrzqt.OLrzqt()), C56390yDp.OLrzqt("precision", C56033xvF.getBotPrecision$default(this.AEQbTJ.isConnected().AhwBna().getInstId(), this.AEQbTJ.isConnected().AhwBna().getInstType(), this.OLrzqt.copydefault(), null, 8, null))));
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ OverviewFragment AEQbTJ;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, OverviewFragment overviewFragment, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = overviewFragment;
            this.EZpvd = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Function1<TacticsData, Unit> function1KWHzl;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52499wNr c52499wNr = (C52499wNr) this.AEQbTJ.AkhnZx.get();
                if (c52499wNr == null || (function1KWHzl = c52499wNr.KWHzl()) == null) {
                    return;
                }
                function1KWHzl.invoke(this.EZpvd);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ TacticsData AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ OverviewFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, OverviewFragment overviewFragment, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = overviewFragment;
            this.AEQbTJ = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                if (context != null) {
                    C50252vHn.OLrzqt.KWHzl(context, this.AEQbTJ);
                }
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ GridWithdrawnProfitsQueryVO AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ GridReinvestedProfitsQueryVO KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ TextView copydefault;
        public final /* synthetic */ OverviewFragment djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(View view, long j, TextView textView, GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVO, OverviewFragment overviewFragment, GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVO) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = textView;
            this.AEQbTJ = gridWithdrawnProfitsQueryVO;
            this.djBIcL = overviewFragment;
            this.KWHzl = gridReinvestedProfitsQueryVO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Context context = this.copydefault.getContext();
                if (context != null) {
                    C43056riA.AEQbTJ.OLrzqt(context, "okluatradingeco", "/bot/grid/profit-info", C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", "withdrawn"), C56390yDp.OLrzqt("algoId", this.AEQbTJ.EZpvd()), C56390yDp.OLrzqt("precision", C56033xvF.getBotPrecision$default(this.djBIcL.isConnected().AhwBna().getInstId(), this.djBIcL.isConnected().AhwBna().getInstType(), this.KWHzl.copydefault(), null, 8, null))));
                }
            }
        }
    }

    private final void uzCIH() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = isConnected().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.copydefault(this.OLrzqt, (C55804xqp) obj);
            }
        }));
    }

    public static final Unit copydefault(OverviewFragment overviewFragment, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(overviewFragment), null, null, new OverviewFragment$subscribeOnUIChange$1$1(overviewFragment, c55804xqp, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull List<StrategyProfitResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fIwbmz = list;
        isConnected().KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [244=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        TacticsData tacticsData;
        SmartArbitrageVo smartArbitrage;
        Intrinsics.checkNotNullParameter(view, "");
        fIwbmz();
        uzCIH();
        uSF usfOLrzqt = uSF.OLrzqt(view);
        usfOLrzqt.OLrzqt.OLrzqt(copydefault(AuCTel(), AuCTel().getOrderType()));
        ProfitDetailResponse arbitrageProfit = AuCTel().getArbitrageProfit();
        ProfitDetailResponse stakingProfit = AuCTel().getStakingProfit();
        BotVo bot = AuCTel().getBot();
        ProfitDetailResponse autoStakingProfit = (bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null) ? null : smartArbitrage.getAutoStakingProfit();
        String strKWHzl = KWHzl(arbitrageProfit);
        boolean zFARcdN = StringsKt__StringsKt.fARcdN((CharSequence) strKWHzl);
        String strKWHzl2 = KWHzl(stakingProfit);
        String strKWHzl3 = KWHzl(autoStakingProfit);
        boolean zFARcdN2 = StringsKt__StringsKt.fARcdN((CharSequence) strKWHzl2);
        boolean zFARcdN3 = StringsKt__StringsKt.fARcdN((CharSequence) strKWHzl2);
        TextView textView = usfOLrzqt.AuCTel;
        if (zFARcdN && (zFARcdN2 || zFARcdN3)) {
            strKWHzl = "0.00";
        } else if (zFARcdN) {
            strKWHzl = strKWHzl3 + " + " + strKWHzl2;
        } else if (!zFARcdN2 && !zFARcdN3) {
            strKWHzl = strKWHzl + " + " + strKWHzl3 + " + " + strKWHzl2;
        }
        textView.setText(strKWHzl);
        String orderType = AuCTel().getOrderType();
        switch (orderType.hashCode()) {
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    LinearLayoutCompat linearLayoutCompat = usfOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                    linearLayoutCompat.setVisibility(0);
                    LinearLayoutCompat linearLayoutCompat2 = usfOLrzqt.copydefault;
                    linearLayoutCompat2.setOnClickListener(new Application(linearLayoutCompat2, 1000L, this, arbitrageProfit, stakingProfit));
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    LinearLayoutCompat linearLayoutCompat3 = usfOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                    linearLayoutCompat3.setVisibility(8);
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    LinearLayoutCompat linearLayoutCompat4 = usfOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat4, "");
                    linearLayoutCompat4.setVisibility(0);
                    usfOLrzqt.AEQbTJ.setText(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnAfter2));
                    LinearLayoutCompat linearLayoutCompat5 = usfOLrzqt.iwGUEr;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat5, "");
                    linearLayoutCompat5.setVisibility(0);
                    usfOLrzqt.getNewProxyInstance.setText(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKdMCrTj));
                }
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    LinearLayoutCompat linearLayoutCompat6 = usfOLrzqt.copydefault;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat6, "");
                    linearLayoutCompat6.setVisibility(8);
                    LinearLayoutCompat linearLayoutCompat7 = usfOLrzqt.iwGUEr;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat7, "");
                    linearLayoutCompat7.setVisibility(8);
                }
                break;
        }
        uIG uigEjfBZ = ejfBZ();
        if (uigEjfBZ != null) {
            uIG.configure$default(uigEjfBZ, AuCTel().getAlgoId(), AuCTel().getOrderType(), AuCTel().isHistory(), false, 8, null);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (tacticsData = (TacticsData) arguments.getParcelable("data")) == null) {
            tacticsData = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
        }
        this.fARcdN = tacticsData;
        MpStgyCopyProfitChangeData profitData = tacticsData.getProfitData();
        if (C33129mqd.KWHzl((Collection) (profitData != null ? profitData.getProfitList() : null))) {
            EZpvd(view, usfOLrzqt, this.fARcdN);
        }
        this.AhwBna = usfOLrzqt;
        AEQbTJ(this.fARcdN, true);
        getFieldNames();
    }

    private final void getFieldNames() {
        C52692wUv.copydefault(AkhnZx().OLrzqt(), this, Lifecycle.State.CREATED, new OverviewFragment$initViewModel$1(this, null));
        C52692wUv.flowAndCollect$default(AkhnZx().KWHzl(), this, null, new OverviewFragment$initViewModel$2(this, null), 2, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (Intrinsics.EZpvd((Object) AuCTel().getOrderType(), (Object) "grid")) {
            AkhnZx().EZpvd(AuCTel().getAlgoId());
        }
    }

    public final String KWHzl(ProfitDetailResponse profitDetailResponse) {
        if (profitDetailResponse == null || C33129mqd.valueOf(profitDetailResponse.getWithdrawn(), 0)) {
            return "";
        }
        return C56033xvF.copydefault(profitDetailResponse.getWithdrawn(), profitDetailResponse.getCcy(), (88 & 4) != 0 ? false : true, (88 & 8) != 0 ? null : null, (88 & 16) != 0 ? false : false, (88 & 32) == 0 ? false : false, (88 & 64) == 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, String> AEQbTJ(ProfitDetailResponse profitDetailResponse) {
        return profitDetailResponse == null ? uLY.AEQbTJ.AEQbTJ() : C56390yDp.OLrzqt(profitDetailResponse.getWithdrawn(), profitDetailResponse.getCcy());
    }

    public final void EZpvd(Pair<? extends GridReinvestedProfitsQueryVO, ? extends GridWithdrawnProfitsQueryVO> pair) {
        uSF usf = this.AhwBna;
        if (usf != null) {
            GridReinvestedProfitsQueryVO gridReinvestedProfitsQueryVOAEQbTJ = OverviewViewModel.TaskDescription.AEQbTJ(pair);
            TextView textView = usf.AuCTel;
            textView.setText(C56033xvF.getBotPnl$default(isConnected().AhwBna().getInstId(), isConnected().AhwBna().getInstType(), gridReinvestedProfitsQueryVOAEQbTJ.KWHzl(), gridReinvestedProfitsQueryVOAEQbTJ.copydefault(), true, false, null, false, gridReinvestedProfitsQueryVOAEQbTJ.copydefault(), 2, null, 1248, null));
            textView.setOnClickListener(new FragmentManager(textView, 1000L, textView, gridReinvestedProfitsQueryVOAEQbTJ, this));
            GridWithdrawnProfitsQueryVO gridWithdrawnProfitsQueryVOEZpvd = OverviewViewModel.TaskDescription.EZpvd(pair);
            TextView textView2 = usf.getFieldNames;
            textView2.setText(C56033xvF.getBotPnl$default(isConnected().AhwBna().getInstId(), isConnected().AhwBna().getInstType(), gridWithdrawnProfitsQueryVOEZpvd.copydefault(), gridWithdrawnProfitsQueryVOEZpvd.KWHzl(), true, false, null, false, gridReinvestedProfitsQueryVOAEQbTJ.copydefault(), 2, null, 1248, null));
            textView2.setOnClickListener(new VoiceInteractor(textView2, 1000L, textView2, gridWithdrawnProfitsQueryVOEZpvd, this, gridReinvestedProfitsQueryVOAEQbTJ));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        this.AkhnZx.clear();
        this.djBIcL = null;
        super.onDestroyView();
    }

    public final Pair<C55930xtI.ActionBar, String> copydefault(boolean z, MarginPerCcyVo marginPerCcyVo) {
        Pair<? extends String, ? extends String> pairAEQbTJ;
        String pnlRatio;
        if (z && marginPerCcyVo != null) {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(C55889xsU.copydefault.AEQbTJ(this.fARcdN.getInstId(), this.fARcdN.getInstType(), marginPerCcyVo.getTotalPnl()), marginPerCcyVo.getTotalPnl());
        } else {
            pairAEQbTJ = C55930xtI.ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(this.fARcdN.getInstId(), this.fARcdN.getInstType(), this.fARcdN.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null), this.fARcdN.getTotalPnl());
        }
        if (z && marginPerCcyVo != null) {
            pnlRatio = marginPerCcyVo.getPnlRatio();
        } else {
            pnlRatio = this.fARcdN.getPnlRatio();
        }
        return new Pair<>(C55930xtI.ActionBar.OLrzqt(pairAEQbTJ), pnlRatio);
    }

    public final void AhwBna() {
        C55249xgQ c55249xgQ;
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.values;
        if (onTabSelectedListener != null) {
            uSF usf = this.AhwBna;
            if (usf != null && (c55249xgQ = usf.gEmmrt) != null) {
                c55249xgQ.removeOnTabSelectedListener(onTabSelectedListener);
            }
            this.values = null;
        }
    }

    public final void values() {
        C55249xgQ c55249xgQ;
        AhwBna();
        uSF usf = this.AhwBna;
        if (usf == null || (c55249xgQ = usf.gEmmrt) == null) {
            return;
        }
        c55249xgQ.removeAllTabs();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:132:0x0313 */
    /* JADX DEBUG: Type inference failed for r0v68. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r0v69. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d3  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.wPY] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Collection] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(View view, uSF usf, final TacticsData tacticsData) {
        String tvTitle;
        MarginPerCcyVo marginPerCcyVo;
        ?? r0;
        int iHashCode;
        List<TacticsListButtonItem> operateList;
        ?? KWHzl;
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel;
        MarginPerCcyVo marginPerCcyVo2;
        String str;
        ?? profitList;
        String algoId;
        MpStgyCopyProfitChangeData profitData;
        String totalPnl;
        String pnlRatio;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        Map<String, MarginPerCcyVo> marginPerCcy;
        MarginPerCcyVo marginPerCcyVo3;
        BotVo bot;
        ContractGridVo contractGrid2;
        UnitDisplayVo unitDisplayVO2;
        Map<String, MarginPerCcyVo> marginPerCcy2;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        BotCommon common;
        BotCommon common2;
        if (usf == null) {
            return;
        }
        int i = 2;
        AttributeSet attributeSet = null;
        boolean z = false;
        if (this.AuCTel == null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            wOD wod = new wOD(context, attributeSet, i, z ? 1 : 0);
            this.AuCTel = wod;
            usf.fARcdN.addView(wod);
        }
        TextView textView = usf.hDKMBd;
        BotVo bot2 = tacticsData.getBot();
        if (C33129mqd.OLrzqt((CharSequence) ((bot2 == null || (common2 = bot2.getCommon()) == null) ? null : common2.getStgyName()))) {
            BotVo bot3 = tacticsData.getBot();
            tvTitle = (bot3 == null || (common = bot3.getCommon()) == null) ? null : common.getStgyName();
        } else {
            tvTitle = tacticsData.getTvTitle();
        }
        textView.setText(tvTitle);
        valueOf(tacticsData);
        wMT wmt = wMT.OLrzqt;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayoutCompat root = usf.valueOf.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ArrayList<TacticsInsideItemData> subData = tacticsData.getSubData();
        Function0<Unit> function0 = new Function0() { // from class: o.wwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OverviewFragment.EZpvd(this.EZpvd, tacticsData);
            }
        };
        C52499wNr c52499wNr = this.AkhnZx.get();
        Function1<Triple<String, ? extends Object, TacticsInsideItemData>, Unit> function1AEQbTJ = c52499wNr != null ? c52499wNr.AEQbTJ() : null;
        C52499wNr c52499wNr2 = this.AkhnZx.get();
        Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends Object, TacticsInsideItemData>, Unit> function1Values = c52499wNr2 != null ? c52499wNr2.values() : null;
        String orderType = tacticsData.getOrderType();
        wmt.OLrzqt(context2, root, subData, tacticsData, function0, function1AEQbTJ, function1Values, (Intrinsics.EZpvd((Object) orderType, (Object) "twap") || Intrinsics.EZpvd((Object) orderType, (Object) "smart_iceberg")) ? false : true);
        if (!Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "smart_arbitrage")) {
            marginPerCcyVo = null;
        } else {
            if (C33129mqd.KWHzl((Collection) tacticsData.getOperateList())) {
                List<TacticsListButtonItem> operateList2 = tacticsData.getOperateList();
                if (operateList2 != null) {
                    arrayList = new ArrayList(C56403yEb.AYXKKw(operateList2, 10));
                    Iterator it = operateList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(TacticsListButtonItem.copy$default((TacticsListButtonItem) it.next(), null, false, null, 7, null));
                    }
                } else {
                    arrayList = null;
                }
                List<TacticsListButtonItem> extraOperatorList = tacticsData.getExtraOperatorList();
                if (extraOperatorList != null) {
                    arrayList2 = new ArrayList(C56403yEb.AYXKKw(extraOperatorList, 10));
                    Iterator it2 = extraOperatorList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(TacticsListButtonItem.copy$default((TacticsListButtonItem) it2.next(), null, false, null, 7, null));
                    }
                } else {
                    arrayList2 = null;
                }
                Pair pair = new Pair(arrayList, arrayList2);
                marginPerCcyVo = null;
                r0 = pair;
                String orderType2 = tacticsData.getOrderType();
                iHashCode = orderType2.hashCode();
                if (iHashCode == -1831183611) {
                    if (iHashCode != -1402017003) {
                        if (iHashCode == -557961837 && orderType2.equals("smart_arbitrage")) {
                            if (C33129mqd.KWHzl((Collection) (r0 != 0 ? (List) r0.getFirst() : marginPerCcyVo))) {
                                ?? ValueOf = (r0 == 0 || (list = (List) r0.getFirst()) == null) ? marginPerCcyVo : Integer.valueOf(list.size());
                                Intrinsics.copydefault((Object) ValueOf);
                                if (ValueOf.intValue() > 1) {
                                    Object first = r0.getFirst();
                                    Intrinsics.copydefault(first);
                                    KWHzl = CollectionsKt___CollectionsKt.djBIcL((Iterable) first, 1);
                                }
                            } else if (C33129mqd.KWHzl((Collection) (r0 != 0 ? (List) r0.getFirst() : marginPerCcyVo))) {
                                Object obj = r0 != 0 ? (List) r0.getFirst() : marginPerCcyVo;
                                Intrinsics.copydefault(obj);
                                KWHzl = obj;
                            } else {
                                KWHzl = yDY.AhwBna();
                            }
                        }
                    } else if (orderType2.equals("contract_dca")) {
                        KWHzl = C48168uHm.EZpvd.OLrzqt(tacticsData.getOrderType(), tacticsData.getState(), true, tacticsData.getHistory()).KWHzl();
                    }
                    operateList = tacticsData.getOperateList();
                    KWHzl = operateList;
                    if (operateList == null) {
                        KWHzl = yDY.AhwBna();
                    }
                } else if (!orderType2.equals("spot_dca")) {
                    operateList = tacticsData.getOperateList();
                    KWHzl = operateList;
                    if (operateList == null) {
                    }
                }
                usf.djBIcL.setData(KWHzl, tacticsData, new yHO() { // from class: o.www
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return OverviewFragment.EZpvd(this.KWHzl, (java.lang.String) obj2, (TacticsData) obj3, (Function0) obj4);
                    }
                }, new Function2() { // from class: o.wwA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return OverviewFragment.AEQbTJ(this.OLrzqt, (java.lang.String) obj2, (TacticsData) obj3);
                    }
                });
                KWHzl(view, usf, tacticsData);
                AhwBna();
                swapCoinMProfitSwitchUiModel = tacticsData.getSwapCoinMProfitSwitchUiModel();
                if (swapCoinMProfitSwitchUiModel == null) {
                    boolean zIsCoinM = swapCoinMProfitSwitchUiModel.isCoinM();
                    LinearLayoutCompat linearLayoutCompat = usf.values;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                    linearLayoutCompat.setVisibility(zIsCoinM ? 0 : 8);
                    if (zIsCoinM) {
                        C55258xgZ c55258xgZ = usf.DbNXlk;
                        str = "";
                        marginPerCcyVo2 = null;
                        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this, tacticsData));
                        C55249xgQ c55249xgQ = usf.gEmmrt;
                        if (c55249xgQ.getTabCount() != 2) {
                            c55249xgQ.removeAllTabs();
                            TabLayout.Tab tag = c55249xgQ.newTab().setTag("base_ccy");
                            CoinRemoteImage.StateListAnimator stateListAnimator = CoinRemoteImage.Companion;
                            Intrinsics.copydefault(tag);
                            CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(stateListAnimator, tag, swapCoinMProfitSwitchUiModel.getCcy(), null, 2, null);
                            Intrinsics.checkNotNullExpressionValue(tag, str);
                            TabLayout.Tab tag2 = c55249xgQ.newTab().setTag("usdt_ccy");
                            Intrinsics.copydefault(tag2);
                            stateListAnimator.KWHzl(tag2, "USDT", C33070mpX.KWHzl(C52761wXj.TaskDescription.zCTncp));
                            Intrinsics.checkNotNullExpressionValue(tag2, str);
                            c55249xgQ.addTab(tag, CoinMarginedCcyDisplay.COIN.getIndex());
                            c55249xgQ.addTab(tag2, CoinMarginedCcyDisplay.USDT.getIndex());
                        } else {
                            TabLayout.Tab tabAt = c55249xgQ.getTabAt(CoinMarginedCcyDisplay.COIN.getIndex());
                            if (tabAt != null) {
                                CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(CoinRemoteImage.Companion, tabAt, swapCoinMProfitSwitchUiModel.getCcy(), null, 2, null);
                            }
                        }
                        TabLayout.Tab tabAt2 = c55249xgQ.getTabAt(swapCoinMProfitSwitchUiModel.getSelectedIndex());
                        if (tabAt2 != null) {
                            if ((c55249xgQ.getSelectedTabPosition() >= 0 ? c55249xgQ.getSelectedTabPosition() : -1) != swapCoinMProfitSwitchUiModel.getSelectedIndex()) {
                                c55249xgQ.selectTab(tabAt2);
                            }
                        }
                        ActionBar actionBar = new ActionBar(tacticsData);
                        this.values = actionBar;
                        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) actionBar);
                        Intrinsics.copydefault(c55249xgQ);
                    } else {
                        marginPerCcyVo2 = marginPerCcyVo;
                        str = "";
                        values();
                    }
                } else {
                    marginPerCcyVo2 = marginPerCcyVo;
                    str = "";
                    LinearLayoutCompat linearLayoutCompat2 = usf.values;
                    Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, str);
                    linearLayoutCompat2.setVisibility(8);
                    values();
                }
                MpStgyCopyProfitChangeData profitData2 = tacticsData.getProfitData();
                profitList = profitData2 == null ? profitData2.getProfitList() : marginPerCcyVo2;
                if (profitList == 0) {
                    profitList = yDY.AhwBna();
                }
                algoId = tacticsData.getAlgoId();
                profitData = tacticsData.getProfitData();
                if (!Intrinsics.EZpvd(algoId, profitData == null ? profitData.getAlgoId() : marginPerCcyVo2) && (!profitList.isEmpty())) {
                    if (Intrinsics.EZpvd((Object) AuCTel().getOrderType(), (Object) "contract_grid")) {
                        int iAEQbTJ = C55889xsU.copydefault.AEQbTJ(this.fARcdN.getAlgoId());
                        boolean zAEQbTJ = AEQbTJ(this.fARcdN, iAEQbTJ);
                        KWHzl(this.fARcdN, iAEQbTJ);
                        Pair<C55930xtI.ActionBar, String> pairCopydefault = copydefault(zAEQbTJ, (!zAEQbTJ || (bot = this.fARcdN.getBot()) == null || (contractGrid2 = bot.getContractGrid()) == null || (unitDisplayVO2 = contractGrid2.getUnitDisplayVO()) == null || (marginPerCcy2 = unitDisplayVO2.getMarginPerCcy()) == null) ? marginPerCcyVo2 : marginPerCcy2.get("USDT"));
                        Pair pairKWHzl = pairCopydefault.component1().KWHzl();
                        String strComponent2 = pairCopydefault.component2();
                        BotVo bot4 = tacticsData.getBot();
                        if (bot4 == null || (contractGrid = bot4.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null || (marginPerCcyVo3 = marginPerCcy.get("USDT")) == null || (totalPnl = marginPerCcyVo3.getTotalPnl()) == null) {
                            totalPnl = tacticsData.getTotalPnl();
                        }
                        String str2 = totalPnl;
                        ?? r3 = profitList;
                        if (zAEQbTJ) {
                            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(profitList, 10));
                            for (StrategyProfitResponse strategyProfitResponse : profitList) {
                                ProfitMarginPerCcyVo profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT");
                                if (profitMarginPerCcyVo == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                                    pnlRatio = strategyProfitResponse.getPnlRatio();
                                }
                                String str3 = pnlRatio;
                                arrayList3.add(strategyProfitResponse.copy((512 & 1) != 0 ? strategyProfitResponse.cycleId : null, (512 & 2) != 0 ? strategyProfitResponse.profitNum : null, (512 & 4) != 0 ? strategyProfitResponse.cTime : null, (512 & 8) != 0 ? strategyProfitResponse.totalPnl : null, (512 & 16) != 0 ? strategyProfitResponse.pnlRatio : str3, (512 & 32) != 0 ? strategyProfitResponse.timeUnit : null, (512 & 64) != 0 ? strategyProfitResponse.sourceCcy : null, (512 & 128) != 0 ? strategyProfitResponse.pnlRatioInSourceCcy : str3, (512 & 256) != 0 ? strategyProfitResponse.totalPnlInSourceCcy : null, (512 & 512) != 0 ? strategyProfitResponse.marginPerCcy : null));
                            }
                            r3 = arrayList3;
                        }
                        usf.isConnected.KWHzl();
                        uII uii = usf.isConnected;
                        int iOLrzqt = C56033xvF.OLrzqt((Object) C55930xtI.ActionBar.KWHzl(pairKWHzl));
                        C48264uLa c48264uLa = new C48264uLa(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getTradeQuoteCcy(), tacticsData.getOrderType(), str2, zAEQbTJ, 0, 64, null);
                        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(tacticsData.getOrderType());
                        if (tacticsTypeAEQbTJ == null) {
                            tacticsTypeAEQbTJ = TacticsType.TACTICS_GRDE;
                        }
                        uii.KWHzl(new uII.Activity(strComponent2, r3, c48264uLa, iOLrzqt, tacticsTypeAEQbTJ));
                    } else {
                        usf.isConnected.KWHzl();
                        uII uii2 = usf.isConnected;
                        String pnlRatio2 = tacticsData.getPnlRatio();
                        int iOLrzqt2 = C56033xvF.OLrzqt((Object) tacticsData.getPnlRatio());
                        C48264uLa c48264uLa2 = new C48264uLa(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getTradeQuoteCcy(), tacticsData.getOrderType(), tacticsData.getTotalPnl(), false, 0, 96, null);
                        TacticsType tacticsTypeAEQbTJ2 = TacticsType.Companion.AEQbTJ(tacticsData.getOrderType());
                        if (tacticsTypeAEQbTJ2 == null) {
                            tacticsTypeAEQbTJ2 = TacticsType.TACTICS_GRDE;
                        }
                        uii2.KWHzl(new uII.Activity(pnlRatio2, profitList, c48264uLa2, iOLrzqt2, tacticsTypeAEQbTJ2));
                    }
                    uII uii3 = usf.isConnected;
                    Intrinsics.checkNotNullExpressionValue(uii3, str);
                    uii3.setVisibility(0);
                } else {
                    uII uii4 = usf.isConnected;
                    Intrinsics.checkNotNullExpressionValue(uii4, str);
                    uii4.setVisibility(8);
                }
                usf.OLrzqt.OLrzqt(copydefault(isConnected().AhwBna(), tacticsData.getOrderType()));
            }
            marginPerCcyVo = null;
            tacticsData.setOperateList(null);
            tacticsData.setExtraOperatorList(null);
        }
        r0 = marginPerCcyVo;
        String orderType22 = tacticsData.getOrderType();
        iHashCode = orderType22.hashCode();
        if (iHashCode == -1831183611) {
        }
        usf.djBIcL.setData(KWHzl, tacticsData, new yHO() { // from class: o.www
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return OverviewFragment.EZpvd(this.KWHzl, (java.lang.String) obj2, (TacticsData) obj3, (Function0) obj4);
            }
        }, new Function2() { // from class: o.wwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return OverviewFragment.AEQbTJ(this.OLrzqt, (java.lang.String) obj2, (TacticsData) obj3);
            }
        });
        KWHzl(view, usf, tacticsData);
        AhwBna();
        swapCoinMProfitSwitchUiModel = tacticsData.getSwapCoinMProfitSwitchUiModel();
        if (swapCoinMProfitSwitchUiModel == null) {
        }
        MpStgyCopyProfitChangeData profitData22 = tacticsData.getProfitData();
        if (profitData22 == null) {
        }
        if (profitList == 0) {
        }
        algoId = tacticsData.getAlgoId();
        profitData = tacticsData.getProfitData();
        if (!Intrinsics.EZpvd(algoId, profitData == null ? profitData.getAlgoId() : marginPerCcyVo2)) {
            uII uii42 = usf.isConnected;
            Intrinsics.checkNotNullExpressionValue(uii42, str);
            uii42.setVisibility(8);
        }
        usf.OLrzqt.OLrzqt(copydefault(isConnected().AhwBna(), tacticsData.getOrderType()));
    }

    public static final Unit EZpvd(OverviewFragment overviewFragment, TacticsData tacticsData) {
        Function1<TacticsData, Unit> function1Copydefault;
        C52499wNr c52499wNr = overviewFragment.AkhnZx.get();
        if (c52499wNr != null && (function1Copydefault = c52499wNr.copydefault()) != null) {
            function1Copydefault.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OverviewFragment overviewFragment, String str, TacticsData tacticsData, Function0 function0) {
        Function2<Pair<String, TacticsData>, Function0<Unit>, Unit> function2OLrzqt;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C52499wNr c52499wNr = overviewFragment.AkhnZx.get();
        if (c52499wNr != null && (function2OLrzqt = c52499wNr.OLrzqt()) != null) {
            function2OLrzqt.invoke(new Pair<>(str, tacticsData), function0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OverviewFragment overviewFragment, String str, TacticsData tacticsData) {
        Function1<Pair<String, TacticsData>, Unit> function1EZpvd;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C52499wNr c52499wNr = overviewFragment.AkhnZx.get();
        if (c52499wNr != null && (function1EZpvd = c52499wNr.EZpvd()) != null) {
            function1EZpvd.invoke(new Pair<>(str, tacticsData));
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ TacticsData EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar(TacticsData tacticsData) {
            this.EZpvd = tacticsData;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Function2<TacticsData, Integer, Unit> function2GEmmrt;
            if (tab != null) {
                int position = tab.getPosition();
                OverviewFragment overviewFragment = OverviewFragment.this;
                TacticsData tacticsData = this.EZpvd;
                C52499wNr c52499wNr = (C52499wNr) overviewFragment.AkhnZx.get();
                if (c52499wNr == null || (function2GEmmrt = c52499wNr.gEmmrt()) == null) {
                    return;
                }
                function2GEmmrt.invoke(tacticsData, Integer.valueOf(position));
            }
        }
    }

    public final C48208uIz.Activity copydefault(final StrategyDetailsResponse strategyDetailsResponse, String str) {
        C48208uIz.StateListAnimator stateListAnimator;
        String assetInBot;
        if (Intrinsics.EZpvd((Object) str, (Object) "contract_grid")) {
            String instId = strategyDetailsResponse.getInstId();
            String instType = strategyDetailsResponse.getInstType();
            BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
            if (balanceDetails == null || (assetInBot = balanceDetails.getAssetInBot()) == null) {
                assetInBot = "";
            }
            stateListAnimator = new C48208uIz.StateListAnimator(C56033xvF.getBotPnl$default(instId, instType, assetInBot, isConnected().AkhnZx(), true, false, null, false, null, null, null, 2016, null), new Function0() { // from class: o.wwH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OverviewFragment.KWHzl(this.KWHzl, strategyDetailsResponse);
                }
            });
        } else {
            stateListAnimator = null;
        }
        return new C48208uIz.Activity(strategyDetailsResponse.getAlgoId(), C33129mqd.valueOf(strategyDetailsResponse.getCTime()), strategyDetailsResponse.isHistory() ? strategyDetailsResponse.getPTime() : null, stateListAnimator, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    public static final Unit KWHzl(OverviewFragment overviewFragment, StrategyDetailsResponse strategyDetailsResponse) {
        String extraMargin;
        String actualMargin;
        String assetInBot;
        C43056riA c43056riA = C43056riA.AEQbTJ;
        Context contextRequireContext = overviewFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Pair[] pairArr = new Pair[8];
        BalanceDetailInfoDto balanceDetails = strategyDetailsResponse.getBalanceDetails();
        if (balanceDetails == null || (extraMargin = balanceDetails.getExtraMargin()) == null) {
            extraMargin = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("extraMargin", extraMargin);
        BalanceDetailInfoDto balanceDetails2 = strategyDetailsResponse.getBalanceDetails();
        if (balanceDetails2 == null || (actualMargin = balanceDetails2.getActualMargin()) == null) {
            actualMargin = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("actualMargin", actualMargin);
        BalanceDetailInfoDto balanceDetails3 = strategyDetailsResponse.getBalanceDetails();
        if (balanceDetails3 == null || (assetInBot = balanceDetails3.getAssetInBot()) == null) {
            assetInBot = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("assetInBot", assetInBot);
        pairArr[3] = C56390yDp.OLrzqt("reservedMargin", strategyDetailsResponse.getExtraMarginSz());
        pairArr[4] = C56390yDp.OLrzqt("addedMargin", strategyDetailsResponse.getNetMarginTransfer());
        String fee = strategyDetailsResponse.getFee();
        if (fee == null) {
            fee = "";
        }
        pairArr[5] = C56390yDp.OLrzqt("fee", fee);
        pairArr[6] = C56390yDp.OLrzqt("precision", String.valueOf(C56033xvF.gEmmrt(strategyDetailsResponse.getInstId(), strategyDetailsResponse.getInstType(), C56033xvF.OLrzqt(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), ""))));
        pairArr[7] = C56390yDp.OLrzqt("ccy", overviewFragment.isConnected().AkhnZx());
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/grid/asset_info", C56424yEw.gEmmrt(pairArr));
        return Unit.INSTANCE;
    }

    public final void KWHzl(View view, uSF usf, TacticsData tacticsData) {
        float f;
        ViewGroup viewGroup;
        wOD wod = this.AuCTel;
        if (wod != null) {
            wod.copydefault(tacticsData);
            pUU.EZpvd("TacticsListItemBinder", "Label Layout UPDATE status view");
        }
        wOD wod2 = this.AuCTel;
        if (wod2 != null && wod2.OLrzqt(tacticsData)) {
            C55372xih c55372xih = usf.fARcdN;
            c55372xih.setOnClickListener(new Activity(c55372xih, 1000L, view, tacticsData));
        } else {
            usf.fARcdN.setOnClickListener(null);
        }
        ArrayList<TacticsListLabelUiData> labelList = tacticsData.getLabelList();
        if (labelList == null || labelList.isEmpty()) {
            LinearLayoutCompat linearLayoutCompat = usf.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(8);
            C55372xih c55372xih2 = usf.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55372xih2, "");
            c55372xih2.setVisibility(8);
            return;
        }
        usf.ejfBZ.removeAllViews();
        usf.fIwbmz.removeAllViews();
        ArrayList<View> arrayList = new ArrayList();
        ArrayList<TacticsListLabelUiData> labelList2 = tacticsData.getLabelList();
        float f2 = 0.0f;
        float f3 = 4.0f;
        if (labelList2 != null) {
            float fCopydefault = 0.0f;
            for (TacticsListLabelUiData tacticsListLabelUiData : labelList2) {
                tacticsListLabelUiData.EZpvd(-5);
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                C55251xgS c55251xgSCopydefault = c52534wOz.copydefault(context, tacticsListLabelUiData);
                c55251xgSCopydefault.setOnClickListener(new Fragment(c55251xgSCopydefault, 1000L, tacticsListLabelUiData, this, tacticsData));
                arrayList.add(c55251xgSCopydefault);
                String string = c55251xgSCopydefault.getText().toString();
                Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
                float fOLrzqt = wOC.OLrzqt(c55251xgSCopydefault, string, C55298xhM.copydefault(r12, r1) * 2.0f);
                Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
                fCopydefault += fOLrzqt + C55298xhM.copydefault(r12, r1);
                f3 = f3;
            }
            f = f3;
            f2 = fCopydefault;
        } else {
            f = 4.0f;
        }
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (copydefault(context2, f2)) {
            LinearLayoutCompat linearLayoutCompat2 = usf.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            linearLayoutCompat2.setVisibility(0);
            C55372xih c55372xih3 = usf.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55372xih3, "");
            c55372xih3.setVisibility(8);
            viewGroup = usf.ejfBZ;
            Intrinsics.copydefault(viewGroup);
        } else {
            LinearLayoutCompat linearLayoutCompat3 = usf.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
            linearLayoutCompat3.setVisibility(8);
            C55372xih c55372xih4 = usf.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55372xih4, "");
            c55372xih4.setVisibility(0);
            viewGroup = usf.fIwbmz;
            Intrinsics.copydefault(viewGroup);
        }
        for (View view2 : arrayList) {
            if (viewGroup instanceof LinearLayoutCompat) {
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, C55298xhM.dp2px$default(16.0f, null, 1, null));
                ((LinearLayout.LayoutParams) layoutParams).topMargin = C55298xhM.dp2px$default(0.5f, null, 1, null);
                layoutParams.setMarginStart(C55298xhM.dp2px$default(f, null, 1, null));
                view2.setLayoutParams(layoutParams);
                viewGroup.addView(view2);
            } else {
                viewGroup.addView(view2);
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.EZpvd.dismiss();
        }
    }

    public final boolean copydefault(Context context, float f) {
        TextView textView;
        CharSequence text;
        int iAEQbTJ = C33570myu.AEQbTJ();
        int iCopydefault = C55298xhM.copydefault(48.0f, context);
        uSF usf = this.AhwBna;
        float fOLrzqt = 0.0f;
        if (usf != null && (textView = usf.hDKMBd) != null) {
            if (usf == null || textView == null || (text = textView.getText()) == null) {
                text = "";
            }
            fOLrzqt = wOC.OLrzqt(textView, text.toString(), 0.0f);
        }
        return ((float) (((iAEQbTJ - (C56071xvr.gEmmrt.DbNXlk() * 2)) - iCopydefault) - C55298xhM.copydefault(8.0f, context))) - fOLrzqt > f;
    }

    public final List<TacticsData> AEQbTJ(C55804xqp<List<StrategyDetailsResponse>> c55804xqp) {
        return new C55936xtO().EZpvd(c55804xqp);
    }

    public final void valueOf(TacticsData tacticsData) {
        C51601vqB c51601vqB;
        C51601vqB c51601vqB2;
        uSF usf = this.AhwBna;
        if (usf != null && (c51601vqB2 = usf.AkhnZx) != null) {
            c51601vqB2.AEQbTJ(tacticsData);
        }
        uSF usf2 = this.AhwBna;
        if (usf2 == null || (c51601vqB = usf2.AkhnZx) == null) {
            return;
        }
        c51601vqB.setOnClickListener(new PendingIntent(c51601vqB, 1000L, this, tacticsData));
    }

    private final void fIwbmz() {
        this.djBIcL = new C52499wNr(null, new Function1() { // from class: o.wwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.OLrzqt((TacticsData) obj);
            }
        }, new Function1() { // from class: o.wws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.OLrzqt(this.copydefault, (TacticsData) obj);
            }
        }, new Function2() { // from class: o.wwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OverviewFragment.OLrzqt(this.OLrzqt, (kotlin.Pair) obj, (Function0) obj2);
            }
        }, new Function1() { // from class: o.wwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        }, new Function1() { // from class: o.wwu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.AEQbTJ(this.KWHzl, (Triple) obj);
            }
        }, new Function1() { // from class: o.wwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.AhwBna((TacticsData) obj);
            }
        }, new Function1() { // from class: o.wwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.OLrzqt(this.AEQbTJ, (Triple) obj);
            }
        }, new yHO() { // from class: o.wwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return OverviewFragment.EZpvd(this.copydefault, (TacticsData) obj, ((java.lang.Boolean) obj2).booleanValue(), (Function2) obj3);
            }
        }, new Function1() { // from class: o.wwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.gEmmrt((TacticsData) obj);
            }
        }, null, null, new yHO() { // from class: o.wwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return OverviewFragment.KWHzl(this.EZpvd, (TacticsVoucherInfo) obj, (TacticsType) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        }, null, null, null, new Function2() { // from class: o.wwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OverviewFragment.KWHzl(this.KWHzl, (TacticsData) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, 60417, null);
        this.AkhnZx = new WeakReference<>(this.djBIcL);
    }

    public static final Unit OLrzqt(TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OverviewFragment overviewFragment, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Context context = overviewFragment.getContext();
        if (context != null) {
            ActivityC52122vzt.Companion.OLrzqt(context, new BotTradeData(tacticsData.getOrderType(), tacticsData.getInstId(), tacticsData.getInstType(), (Parcelable) null, false, (String) null, tacticsData.getInstFamily(), false, (List) null, 440, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_un_know_source", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OverviewFragment overviewFragment, TacticsData tacticsData, boolean z, Function2 function2) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (Intrinsics.EZpvd((Object) tacticsData.getOrderType(), (Object) "contract_grid")) {
            C50225vGn c50225vGnCopydefault = C50225vGn.Companion.copydefault(tacticsData);
            androidx.fragment.app.FragmentManager parentFragmentManager = overviewFragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            c50225vGnCopydefault.show(parentFragmentManager);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final OverviewFragment overviewFragment, final Pair pair, Function0 function0) {
        Intrinsics.checkNotNullParameter(pair, "");
        ((TacticsData) pair.getSecond()).setSource("");
        BotOperatorButtonDisposer.dispose$default(overviewFragment.fJNWhG(), (String) pair.getFirst(), (TacticsData) pair.getSecond(), function0, new Function0() { // from class: o.wwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OverviewFragment.KWHzl(pair, overviewFragment);
            }
        }, null, null, 48, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(final Pair pair, OverviewFragment overviewFragment) {
        C32866mlf.onEvent$default("TradingBot_SharePoster_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OverviewFragment.OLrzqt(pair, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        String orderType = ((TacticsData) pair.getSecond()).getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    wUF.EZpvd();
                    overviewFragment.AYXKKw((TacticsData) pair.getSecond());
                }
                break;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    overviewFragment.AYXKKw((TacticsData) pair.getSecond());
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                }
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Pair pair, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", ((TacticsData) pair.getSecond()).getHistory() ? "history" : "pendding", true);
        EventParamsList.put$default(eventParamsList, "bot_type", ((TacticsData) pair.getSecond()).getOrderType(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OverviewFragment overviewFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        BotOperatorButtonDisposer.disposeDisableClick$default(overviewFragment.fJNWhG(), (String) pair.getFirst(), null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OverviewFragment overviewFragment, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        androidx.fragment.app.FragmentManager childFragmentManager = overviewFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        overviewFragment.copydefault((Triple<String, ? extends Object, TacticsInsideItemData>) triple, childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OverviewFragment overviewFragment, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        overviewFragment.copydefault((Triple<? extends TacticsUiConst.BotListSubItemType, ? extends Object, TacticsInsideItemData>) triple);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OverviewFragment overviewFragment, TacticsVoucherInfo tacticsVoucherInfo, TacticsType tacticsType, boolean z) {
        Intrinsics.checkNotNullParameter(tacticsVoucherInfo, "");
        C52659wTp c52659wTp = C52659wTp.copydefault;
        FragmentActivity fragmentActivityRequireActivity = overviewFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c52659wTp.AEQbTJ(fragmentActivityRequireActivity, tacticsVoucherInfo, false, tacticsType, z);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OverviewFragment overviewFragment, TacticsData tacticsData, int i) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        overviewFragment.OLrzqt(tacticsData, i);
        return Unit.INSTANCE;
    }

    private final void copydefault(Triple<? extends TacticsUiConst.BotListSubItemType, ? extends Object, TacticsInsideItemData> triple) {
        TacticsData tacticsData;
        String doubtTitle;
        String doubtMsg;
        if (triple.getSecond() == null || !(triple.getSecond() instanceof TacticsData)) {
            return;
        }
        TacticsUiConst.BotListSubItemType first = triple.getFirst();
        String str = "";
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.Default) {
            TacticsInsideItemData third = triple.getThird();
            if (third == null || (doubtTitle = third.getDoubtTitle()) == null) {
                doubtTitle = "";
            }
            TacticsInsideItemData third2 = triple.getThird();
            if (third2 != null && (doubtMsg = third2.getDoubtMsg()) != null) {
                str = doubtMsg;
            }
            copydefault(doubtTitle, str);
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) {
            TacticsUiConst.BotListSubItemType first2 = triple.getFirst();
            Intrinsics.copydefault(first2, "");
            String strOLrzqt = ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) first2).OLrzqt();
            TacticsUiConst.BotListSubItemType first3 = triple.getFirst();
            Intrinsics.copydefault(first3, "");
            copydefault(strOLrzqt, ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) first3).AEQbTJ());
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbProfitsDetails) {
            Object second = triple.getSecond();
            tacticsData = second instanceof TacticsData ? (TacticsData) second : null;
            if (tacticsData != null) {
                EZpvd(SmartArbDetailsType.Arbitrage, tacticsData);
                return;
            }
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) {
            TacticsUiConst.BotListSubItemType first4 = triple.getFirst();
            Intrinsics.copydefault(first4, "");
            TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails contractGridProfitDetails = (TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) first4;
            this.fetchVPNInfo = contractGridProfitDetails.AEQbTJ();
            C51046vfd c51046vfdEZpvd = C51046vfd.Companion.EZpvd(contractGridProfitDetails.EZpvd(), contractGridProfitDetails.KWHzl(), contractGridProfitDetails.copydefault(), new Function0() { // from class: o.wwI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OverviewFragment.valueOf();
                }
            }, new Function0() { // from class: o.wwJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OverviewFragment.AkhnZx(this.copydefault);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C49662usl.EZpvd(c51046vfdEZpvd, childFragmentManager, "GridProfitBottomSheet");
            return;
        }
        if (Intrinsics.EZpvd(first, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails.copydefault)) {
            Object second2 = triple.getSecond();
            tacticsData = second2 instanceof TacticsData ? (TacticsData) second2 : null;
            if (tacticsData != null) {
                EZpvd(SmartArbDetailsType.Staking, tacticsData);
                return;
            }
            return;
        }
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbAutoEarn) {
            Object second3 = triple.getSecond();
            tacticsData = second3 instanceof TacticsData ? (TacticsData) second3 : null;
            if (tacticsData == null) {
                return;
            }
            C54066wxO.ActionBar actionBar = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            actionBar.AEQbTJ(childFragmentManager2, "auto_earn_and_staking", (56 & 4) != 0 ? null : null, (56 & 8) != 0 ? null : new TacticsVipProfitData(tacticsData.getInstId(), null, "auto_earn_and_staking", "smart_arbitrage", null, null, 50, null), (56 & 16) != 0 ? false : true, (56 & 32) != 0 ? 0 : 0);
        }
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(OverviewFragment overviewFragment) {
        overviewFragment.fetchVPNInfo = null;
        Job job = overviewFragment.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        overviewFragment.isConnected = null;
        C51046vfd.Companion.KWHzl().tryEmit(null);
        return Unit.INSTANCE;
    }

    private final void EZpvd(SmartArbDetailsType smartArbDetailsType, TacticsData tacticsData) {
        C52839waG c52839waGCopydefault = C52839waG.Companion.copydefault(smartArbDetailsType, tacticsData, new Function2() { // from class: o.wwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return OverviewFragment.KWHzl(this.copydefault, (SmartArbDetailsType) obj, (java.lang.String) obj2);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c52839waGCopydefault.show(childFragmentManager);
    }

    public static final Unit KWHzl(OverviewFragment overviewFragment, SmartArbDetailsType smartArbDetailsType, String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        ProfitDetailResponse arbitrageProfit = overviewFragment.AuCTel().getArbitrageProfit();
        ProfitDetailResponse stakingProfit = overviewFragment.AuCTel().getStakingProfit();
        Pair<String, String> pairAEQbTJ = overviewFragment.AEQbTJ(arbitrageProfit);
        String strComponent1 = pairAEQbTJ.component1();
        String strComponent2 = pairAEQbTJ.component2();
        Pair<String, String> pairAEQbTJ2 = overviewFragment.AEQbTJ(stakingProfit);
        String strComponent12 = pairAEQbTJ2.component1();
        String strComponent22 = pairAEQbTJ2.component2();
        C43056riA c43056riA = C43056riA.AEQbTJ;
        Context contextRequireContext = overviewFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/arb/profit_history", C56424yEw.gEmmrt(C56390yDp.OLrzqt("algoId", str), C56390yDp.OLrzqt("arbPnl", strComponent1), C56390yDp.OLrzqt("arbCcy", strComponent2), C56390yDp.OLrzqt("stakePnl", strComponent12), C56390yDp.OLrzqt("stakeCcy", strComponent22)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showTitleMsgDialog$default(OverviewFragment overviewFragment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        overviewFragment.copydefault(str, str2);
    }

    private final void copydefault(String str, String str2) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        viewOnClickListenerC54939xaY.EZpvd(str2);
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OverviewFragment.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final BotOperatorButtonDisposer fJNWhG() {
        return (BotOperatorButtonDisposer) this.valueOf.getValue();
    }

    public static final BotOperatorButtonDisposer values(OverviewFragment overviewFragment) {
        return new BotOperatorButtonDisposer(overviewFragment, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1164=4, 1125=5, 1127=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void copydefault(Triple<String, ? extends Object, TacticsInsideItemData> triple, androidx.fragment.app.FragmentManager fragmentManager) {
        Context context;
        String first;
        String first2;
        Context context2;
        Context context3;
        List<CoinPriceItem> listAhwBna;
        if (triple.getSecond() instanceof TacticsData) {
            Object second = triple.getSecond();
            Intrinsics.copydefault(second, "");
            TacticsData tacticsData = (TacticsData) second;
            String orderType = tacticsData.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    if (!orderType.equals("spot_dca")) {
                        return;
                    }
                    break;
                case -1402017003:
                    if (!orderType.equals("contract_dca")) {
                        return;
                    }
                    break;
                case -557961837:
                    if (orderType.equals("smart_arbitrage") && (first = triple.getFirst()) != null) {
                        switch (first.hashCode()) {
                            case -1036831448:
                                if (first.equals("loan_interest_order")) {
                                    AkhnZx().OLrzqt(AuCTel().getAccountId(), AuCTel().getAlgoId(), AuCTel().isHistory());
                                    break;
                                }
                                break;
                            case 1316365756:
                                if (first.equals("arbitrage_pnl_more")) {
                                    C52839waG c52839waGCopydefault = C52839waG.Companion.copydefault(SmartArbDetailsType.Arbitrage, tacticsData, new Function2() { // from class: o.wwC
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return OverviewFragment.EZpvd((SmartArbDetailsType) obj, (java.lang.String) obj2);
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
                                    C52839waG c52839waGCopydefault2 = C52839waG.Companion.copydefault(SmartArbDetailsType.Staking, tacticsData, new Function2() { // from class: o.wwE
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return OverviewFragment.copydefault((SmartArbDetailsType) obj, (java.lang.String) obj2);
                                        }
                                    });
                                    androidx.fragment.app.FragmentManager childFragmentManager3 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                                    c52839waGCopydefault2.show(childFragmentManager3);
                                    break;
                                }
                                break;
                        }
                        return;
                    }
                    return;
                case -512749997:
                    if (orderType.equals("contract_grid") && (first2 = triple.getFirst()) != null) {
                        switch (first2.hashCode()) {
                            case -2015371680:
                                if (first2.equals("last_price") && (context2 = getContext()) != null) {
                                    MarketCoinInfo marketCoinInfo = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
                                    oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                                    if (oka != null) {
                                        oKA.TaskDescription.gotoNewKlinePage$default(oka, context2, marketCoinInfo, null, null, null, null, null, null, null, null, null, 2044, null);
                                    }
                                }
                                break;
                            case -1632678308:
                                if (first2.equals("grid_out_of_range_warning")) {
                                    copydefault(C33070mpX.AYXKKw(C55688xof.Application.setLocationManually), C33070mpX.AYXKKw(C55688xof.Application.GqbzPL));
                                    break;
                                }
                                break;
                            case 1230585021:
                                if (first2.equals("extra_margin")) {
                                    C53858wtS.Companion.copydefault(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getAlgoId(), tacticsData.getDirection(), tacticsData.getLevel(), false, tacticsData.getSignalOrderAmtParam()).show(fragmentManager, C53858wtS.class.getSimpleName());
                                    break;
                                }
                                break;
                            case 1637026727:
                                if (first2.equals("WithdrawProfitIcon")) {
                                    FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheetCopydefault = FuturesGridWithdrawProfitSheet.Companion.copydefault(tacticsData.getAlgoId(), tacticsData.getInstId(), tacticsData.getInstType(), tacticsData, new OverviewFragment$handleContentClick$4(this));
                                    androidx.fragment.app.FragmentManager childFragmentManager4 = getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
                                    C49662usl.EZpvd(futuresGridWithdrawProfitSheetCopydefault, childFragmentManager4, "FuturesGridWithdrawProfitSheet");
                                    break;
                                }
                                break;
                        }
                        return;
                    }
                    return;
                case 3181382:
                    if (orderType.equals("grid")) {
                        String first3 = triple.getFirst();
                        if (Intrinsics.EZpvd((Object) first3, (Object) "WithdrawProfitIcon")) {
                            fJNWhG().valueOf(tacticsData, fragmentManager);
                            return;
                        }
                        if (!Intrinsics.EZpvd((Object) first3, (Object) "last_price") || (context3 = getContext()) == null) {
                            return;
                        }
                        MarketCoinInfo marketCoinInfo2 = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
                        oKA oka2 = (oKA) C43251rlk.OLrzqt(oKA.class);
                        if (oka2 != null) {
                            oKA.TaskDescription.gotoNewKlinePage$default(oka2, context3, marketCoinInfo2, null, null, null, null, null, null, null, null, null, 2044, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 1165749981:
                    if (orderType.equals("recurring")) {
                        String first4 = triple.getFirst();
                        if (Intrinsics.EZpvd((Object) first4, (Object) "coin_target_scale")) {
                            List<AllocationItem> listKWHzl = AllocationItem.Companion.KWHzl(tacticsData.getRecItemList());
                            if (!listKWHzl.isEmpty()) {
                                C52566wQd.Companion.KWHzl(listKWHzl).show(getChildFragmentManager(), "CoinTargetAllocationRingChartBottomSheet");
                                return;
                            }
                            return;
                        }
                        if (Intrinsics.EZpvd((Object) first4, (Object) "bot_sub_recurring_avg_price")) {
                            ArrayList<RecurringListItem> recItemList = tacticsData.getRecItemList();
                            if (recItemList != null) {
                                listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(recItemList, 10));
                                for (RecurringListItem recurringListItem : recItemList) {
                                    String ccy = recurringListItem.getCcy();
                                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                                    String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(recurringListItem.getCcy()) : null;
                                    if (strValueOf == null) {
                                        strValueOf = "";
                                    }
                                    listAhwBna.add(new CoinPriceItem(ccy, strValueOf, C56033xvF.getBotPrice$default(tacticsData.getInstType(), recurringListItem.getCcy() + "-" + tacticsData.getInvestCcy(), recurringListItem.getAvgPx(), false, false, RoundingMode.HALF_UP, null, 88, null)));
                                }
                            } else {
                                listAhwBna = yDY.AhwBna();
                            }
                            if (!listAhwBna.isEmpty()) {
                                CoinsPriceBottomSheet.Companion.copydefault(listAhwBna, CoinsPriceBottomSheet.Mode.AVERAGE_PRICE).show(getChildFragmentManager(), "CoinsPriceBottomSheet");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
            if (!Intrinsics.EZpvd((Object) triple.getFirst(), (Object) "last_price") || (context = getContext()) == null) {
                return;
            }
            MarketCoinInfo marketCoinInfo3 = new MarketCoinInfo(tacticsData.getInstId(), tacticsData.getInstType(), (String) null, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
            oKA oka3 = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka3 != null) {
                oKA.TaskDescription.gotoNewKlinePage$default(oka3, context, marketCoinInfo3, null, null, null, null, null, null, null, null, null, 2044, null);
            }
        }
    }

    public static final Unit EZpvd(SmartArbDetailsType smartArbDetailsType, String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SmartArbDetailsType smartArbDetailsType, String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(TacticsData tacticsData, boolean z) {
        C48194uIl c48194uIlFetchVPNInfo = fetchVPNInfo();
        if (c48194uIlFetchVPNInfo == null) {
            return;
        }
        TacticsType tacticsType = tacticsData.getTacticsType();
        int i = tacticsType == null ? -1 : TaskDescription.EZpvd[tacticsType.ordinal()];
        if (i == 1 || i == 2) {
            c48194uIlFetchVPNInfo.copydefault(tacticsData, z);
        } else {
            c48194uIlFetchVPNInfo.valueOf();
        }
    }

    public final C48194uIl fetchVPNInfo() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C48033uCm.Application.DQYQgr);
        if (fragmentFindFragmentById instanceof C48194uIl) {
            return (C48194uIl) fragmentFindFragmentById;
        }
        return null;
    }

    private final uIG ejfBZ() {
        androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C48033uCm.Application.DPHsZd);
        if (fragmentFindFragmentById instanceof uIG) {
            return (uIG) fragmentFindFragmentById;
        }
        return null;
    }

    /* JADX DEBUG: Possible override for method o.wwi.OLrzqt()V */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<ArrayList<Object>> OLrzqt() {
        TradeLiveData<ArrayList<Object>> tradeLiveData = new TradeLiveData<>();
        tradeLiveData.setValue(yDY.copydefault(this.fARcdN));
        return tradeLiveData;
    }

    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull String str, int i, boolean z) {
        NestedScrollView nestedScrollView;
        C55284xgz c55284xgzAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        uSF usf = this.AhwBna;
        if (usf == null || (nestedScrollView = usf.fetchVPNInfo) == null || (c55284xgzAEQbTJ = C55284xgz.Companion.AEQbTJ(requireContext(), nestedScrollView, str)) == null) {
            return;
        }
        c55284xgzAEQbTJ.isConnected(i);
        c55284xgzAEQbTJ.hDKMBd();
    }

    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        AYXKKw(tacticsData);
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
        TacticsDetailPresenter.queryBotDetails$default(isConnected(), false, 1, null);
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
        uIG uigEjfBZ = ejfBZ();
        if (uigEjfBZ != null) {
            uigEjfBZ.AEQbTJ();
        }
    }

    private final void AYXKKw(TacticsData tacticsData) {
        boolean z = !AuCTel().isHistory() && C53660wpg.Companion.EZpvd().AEQbTJ(new C53660wpg.Activity(AuCTel().getOrderType())).booleanValue();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C53698wqR.TaskDescription.share$default(C53698wqR.Companion, tacticsData, activity, true, this.fIwbmz, z, null, 32, null);
        }
    }

    public final boolean AEQbTJ(TacticsData tacticsData, int i) {
        return C55889xsU.copydefault.copydefault(tacticsData.getInstId(), tacticsData.getInstType(), tacticsData.getBot()) && i == CoinMarginedCcyDisplay.USDT.getIndex();
    }

    public final void KWHzl(TacticsData tacticsData, int i) {
        BotVo bot;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        Map<String, MarginPerCcyVo> marginPerCcy;
        boolean zAEQbTJ = AEQbTJ(tacticsData, i);
        String strKWHzl = C56066xvm.EZpvd.KWHzl(tacticsData.getInstId(), tacticsData.getInstType(), (!zAEQbTJ || ((!zAEQbTJ || (bot = tacticsData.getBot()) == null || (contractGrid = bot.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null) ? null : marginPerCcy.get("USDT")) == null) ? tacticsData.getCcy() : "USDT");
        uSF usf = this.AhwBna;
        if (usf != null) {
            usf.isConnected.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnAfter2) + " (" + strKWHzl + ")");
        }
    }

    public final void OLrzqt(@NotNull TacticsData tacticsData, int i) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (tacticsData.getAlgoId().length() == 0) {
            return;
        }
        C55889xsU.copydefault.EZpvd(tacticsData.getAlgoId(), i);
        KWHzl(tacticsData, i);
        C55804xqp<StrategyDetailsResponse> value = isConnected().getNewProxyInstance().getValue();
        if (value == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OverviewFragment$updateProfitDisplaySwitchToggle$1(this, value, i, null), 3, null);
    }
}
