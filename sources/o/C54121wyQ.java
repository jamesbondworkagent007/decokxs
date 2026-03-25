package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawProfitSheet;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsType;
import com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$refreshBenefitList$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$refreshBenefitList$2;
import com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$refreshChart$1$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingConfig;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.BenefitDetailsPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C54066wxO;
import o.C54121wyQ;
import o.C54132wyb;
import o.C55688xof;
import o.InterfaceC43294rma;

/* JADX INFO: renamed from: o.wyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54121wyQ extends AbstractC54505xKx<uOE, BenefitDetailsPresenter> {
    public final InterfaceC56387yDm AEQbTJ;
    public final int OLrzqt = C48033uCm.Activity.QVsKAR;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wyZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54121wyQ.AYXKKw();
        }
    });
    public java.lang.String copydefault = "";

    /* JADX INFO: renamed from: o.wyQ$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public C54121wyQ() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.BenefitDetailsFragment$special$$inlined$activityViewModels$default$3
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

    public final TacticsDetailPresenter valueOf() {
        return (TacticsDetailPresenter) this.AEQbTJ.getValue();
    }

    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw isConnected() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        java.util.List<AutoEarnStakingConfig> listAhwBna;
        java.util.List<AutoEarnStakingConfig> listAhwBna2;
        dxcTrN().OLrzqt(valueOf().AhwBna());
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN = dxcTrN();
        StrategyConfigInfo value = valueOf().valueOf().getValue();
        if (value == null || (listAhwBna = value.getAutoEarn()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        benefitDetailsPresenterDxcTrN.AEQbTJ(listAhwBna);
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN2 = dxcTrN();
        StrategyConfigInfo value2 = valueOf().valueOf().getValue();
        if (value2 == null || (listAhwBna2 = value2.getAutoStaking()) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        benefitDetailsPresenterDxcTrN2.KWHzl(listAhwBna2);
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN3 = dxcTrN();
        StrategyConfigInfo value3 = valueOf().valueOf().getValue();
        if (value3 == null) {
            value3 = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        benefitDetailsPresenterDxcTrN3.OLrzqt(value3);
        djBIcL();
        fetchVPNInfo();
        AkhnZx();
    }

    public final void djBIcL() {
        gGvvIC().gEmmrt.setAdapter(isConnected());
        gGvvIC().gEmmrt.setLayoutManager(new LinearLayoutManager(requireContext()));
        gGvvIC().OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.wyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C54121wyQ.OLrzqt(this.copydefault, view);
            }
        });
        isConnected().register(ItemData.class, new wNH(new Function1() { // from class: o.wyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.EZpvd(this.OLrzqt, (ItemData) obj);
            }
        }, new Function1() { // from class: o.wyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.OLrzqt(this.KWHzl, (ItemData) obj);
            }
        }, null, new Function1() { // from class: o.wyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.valueOf(this.copydefault, (ItemData) obj);
            }
        }, null, 20, null));
    }

    public static final void OLrzqt(C54121wyQ c54121wyQ, android.view.View view) {
        C55173xeu c55173xeu = c54121wyQ.gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        ConstraintLayout constraintLayout = c54121wyQ.gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        TacticsDetailPresenter.queryBotDetails$default(c54121wyQ.valueOf(), false, 1, null);
        c54121wyQ.fetchVPNInfo();
    }

    public static final Unit EZpvd(final C54121wyQ c54121wyQ, ItemData itemData) {
        Intrinsics.checkNotNullParameter(itemData, "");
        if (itemData.djBIcL() != null) {
            TacticsUiConst.BotListSubItemType botListSubItemTypeDjBIcL = itemData.djBIcL();
            if (botListSubItemTypeDjBIcL instanceof TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) {
                BalanceDetailInfoDto balanceDetails = c54121wyQ.valueOf().AhwBna().getBalanceDetails();
                if (balanceDetails != null) {
                    C51046vfd c51046vfdEZpvd = C51046vfd.Companion.EZpvd(c54121wyQ.valueOf().AhwBna().getInstType(), c54121wyQ.valueOf().AhwBna().getInstId(), balanceDetails, new Function0() { // from class: o.wzd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C54121wyQ.valueOf(this.copydefault);
                        }
                    }, new Function0() { // from class: o.wze
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C54121wyQ.copydefault();
                        }
                    });
                    androidx.fragment.app.FragmentManager childFragmentManager = c54121wyQ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    C49662usl.EZpvd(c51046vfdEZpvd, childFragmentManager, "GridProfitBottomSheet");
                }
            } else if ((botListSubItemTypeDjBIcL instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails) || (botListSubItemTypeDjBIcL instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbProfitsDetails)) {
                C52839waG c52839waGCopydefault = C52839waG.Companion.copydefault(itemData.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails ? SmartArbDetailsType.Staking : SmartArbDetailsType.Arbitrage, c54121wyQ.valueOf().zLjUOn(), new Function2() { // from class: o.wzc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C54121wyQ.copydefault(this.EZpvd, (SmartArbDetailsType) obj, (java.lang.String) obj2);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager2 = c54121wyQ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                c52839waGCopydefault.show(childFragmentManager2);
            } else if (botListSubItemTypeDjBIcL instanceof TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) {
                TacticsUiConst.BotListSubItemType botListSubItemTypeDjBIcL2 = itemData.djBIcL();
                Intrinsics.copydefault(botListSubItemTypeDjBIcL2, "");
                java.lang.String strAEQbTJ = ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) botListSubItemTypeDjBIcL2).AEQbTJ();
                TacticsUiConst.BotListSubItemType botListSubItemTypeDjBIcL3 = itemData.djBIcL();
                Intrinsics.copydefault(botListSubItemTypeDjBIcL3, "");
                c54121wyQ.AEQbTJ(strAEQbTJ, ((TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog) botListSubItemTypeDjBIcL3).OLrzqt());
            }
        } else {
            c54121wyQ.AEQbTJ(itemData.AuCTel(), itemData.gEmmrt());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault() {
        C51046vfd.Companion.KWHzl().tryEmit(null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C54121wyQ c54121wyQ) {
        c54121wyQ.valueOf().zuBGHE();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54121wyQ c54121wyQ, SmartArbDetailsType smartArbDetailsType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(smartArbDetailsType, "");
        Intrinsics.checkNotNullParameter(str, "");
        c54121wyQ.valueOf().zuBGHE();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [149=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit OLrzqt(final C54121wyQ c54121wyQ, ItemData itemData) {
        java.lang.String strAYXKKw;
        if (itemData == null || (strAYXKKw = itemData.AYXKKw()) == null) {
            return Unit.INSTANCE;
        }
        switch (strAYXKKw.hashCode()) {
            case -1534675252:
                if (strAYXKKw.equals("show_auto_simple_earn_profit")) {
                    TacticsData tacticsDataZLjUOn = c54121wyQ.valueOf().zLjUOn();
                    C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = c54121wyQ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    taskDescription.copydefault(childFragmentManager, "auto_education_single_earn", tacticsDataZLjUOn, true);
                }
                break;
            case -1001798915:
                if (strAYXKKw.equals("show_auto_earn_profit")) {
                    TacticsData tacticsDataZLjUOn2 = c54121wyQ.valueOf().zLjUOn();
                    C54132wyb.TaskDescription taskDescription2 = C54132wyb.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager2 = c54121wyQ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    C54132wyb.TaskDescription.newInstance$default(taskDescription2, childFragmentManager2, "auto_education_single_earn", tacticsDataZLjUOn2, false, 8, null);
                }
                break;
            case 817027703:
                if (strAYXKKw.equals("show_auto_stake_profit")) {
                    TacticsData tacticsDataZLjUOn3 = c54121wyQ.valueOf().zLjUOn();
                    C54132wyb.TaskDescription taskDescription3 = C54132wyb.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager3 = c54121wyQ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
                    C54132wyb.TaskDescription.newInstance$default(taskDescription3, childFragmentManager3, "auto_education_single_staking", tacticsDataZLjUOn3, false, 8, null);
                }
                break;
            case 1637026727:
                if (strAYXKKw.equals("WithdrawProfitIcon")) {
                    TacticsData tacticsDataZLjUOn4 = c54121wyQ.valueOf().zLjUOn();
                    FuturesGridWithdrawProfitSheet futuresGridWithdrawProfitSheetCopydefault = FuturesGridWithdrawProfitSheet.Companion.copydefault(tacticsDataZLjUOn4.getAlgoId(), tacticsDataZLjUOn4.getInstId(), tacticsDataZLjUOn4.getInstType(), tacticsDataZLjUOn4, new Function1() { // from class: o.wyS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C54121wyQ.EZpvd(this.copydefault, (TacticsData) obj);
                        }
                    });
                    androidx.fragment.app.FragmentManager childFragmentManager4 = c54121wyQ.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "");
                    C49662usl.EZpvd(futuresGridWithdrawProfitSheetCopydefault, childFragmentManager4, "FuturesGridWithdrawProfitSheet");
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C54121wyQ c54121wyQ, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        FragmentActivity activity = c54121wyQ.getActivity();
        ActivityC52272wFg activityC52272wFg = activity instanceof ActivityC52272wFg ? (ActivityC52272wFg) activity : null;
        if (activityC52272wFg != null) {
            activityC52272wFg.EZpvd(c54121wyQ.valueOf().zLjUOn());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit valueOf(C54121wyQ c54121wyQ, ItemData itemData) {
        if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_stake_profit")) {
            TacticsData tacticsDataZLjUOn = c54121wyQ.valueOf().zLjUOn();
            C54066wxO.ActionBar actionBar = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = c54121wyQ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            AutoVipProfitInfo autoVipProfitInfo = tacticsDataZLjUOn.getAutoVipProfitInfo();
            if (autoVipProfitInfo == null) {
                autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
            }
            actionBar.AEQbTJ(childFragmentManager, "auto_education_single_staking", (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.AYXKKw() : null), (java.lang.Object) "show_auto_simple_earn_profit")) {
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_earn_profit")) {
            TacticsData tacticsDataZLjUOn2 = c54121wyQ.valueOf().zLjUOn();
            C54066wxO.ActionBar actionBar2 = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager2 = c54121wyQ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            AutoVipProfitInfo autoVipProfitInfo2 = tacticsDataZLjUOn2.getAutoVipProfitInfo();
            if (autoVipProfitInfo2 == null) {
                autoVipProfitInfo2 = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
            }
            actionBar2.AEQbTJ(childFragmentManager2, "auto_education_single_earn", (56 & 4) != 0 ? null : autoVipProfitInfo2, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
        }
        return Unit.INSTANCE;
    }

    private final void fetchVPNInfo() {
        dxcTrN().EZpvd();
    }

    private final void AkhnZx() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataValueOf = valueOf().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.KWHzl(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = valueOf().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        newProxyInstance.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.wzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.OLrzqt(this.AEQbTJ, (C55804xqp) obj);
            }
        }));
        TradeLiveData<java.util.List<StrategyProfitResponse>> tradeLiveDataAEQbTJ = dxcTrN().AEQbTJ();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner3, new TaskDescription(new Function1() { // from class: o.wzf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        valueOf().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54121wyQ.valueOf(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit KWHzl(C54121wyQ c54121wyQ, StrategyConfigInfo strategyConfigInfo) {
        java.util.List<AutoEarnStakingConfig> listAhwBna;
        java.util.List<AutoEarnStakingConfig> listAhwBna2;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN = c54121wyQ.dxcTrN();
        StrategyConfigInfo value = c54121wyQ.valueOf().valueOf().getValue();
        if (value == null || (listAhwBna = value.getAutoEarn()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        benefitDetailsPresenterDxcTrN.AEQbTJ(listAhwBna);
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN2 = c54121wyQ.dxcTrN();
        StrategyConfigInfo value2 = c54121wyQ.valueOf().valueOf().getValue();
        if (value2 == null || (listAhwBna2 = value2.getAutoStaking()) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        benefitDetailsPresenterDxcTrN2.KWHzl(listAhwBna2);
        BenefitDetailsPresenter benefitDetailsPresenterDxcTrN3 = c54121wyQ.dxcTrN();
        StrategyConfigInfo value3 = c54121wyQ.valueOf().valueOf().getValue();
        if (value3 == null) {
            value3 = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        benefitDetailsPresenterDxcTrN3.OLrzqt(value3);
        c54121wyQ.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54121wyQ c54121wyQ, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c54121wyQ.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54121wyQ c54121wyQ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c54121wyQ.copydefault((java.util.List<StrategyProfitResponse>) list);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C54121wyQ c54121wyQ, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c54121wyQ.showLoading();
        } else {
            c54121wyQ.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C54121wyQ c54121wyQ, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c54121wyQ.dxcTrN().copydefault().bB_())) {
            c54121wyQ.gGvvIC().AhwBna.copydefault(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(C54121wyQ c54121wyQ, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c54121wyQ.valueOf().uzCIH().bB_())) {
            C55173xeu c55173xeu = c54121wyQ.gGvvIC().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(0);
            ConstraintLayout constraintLayout = c54121wyQ.gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<StrategyProfitResponse> list) {
        if (list != null) {
            valueOf().KWHzl(list);
            if (!list.isEmpty()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BenefitDetailsFragment$refreshChart$1$1(this, list, null), 3, null);
            }
            gGvvIC().AhwBna.copydefault(list.isEmpty());
        }
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BenefitDetailsFragment$refreshBenefitList$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getDefault(), null, new BenefitDetailsFragment$refreshBenefitList$2(this, null), 2, null);
    }

    public static /* synthetic */ void showDoubtTips$default(C54121wyQ c54121wyQ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c54121wyQ.AEQbTJ(str, str2);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            viewOnClickListenerC54939xaY.setTitle(str2);
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C54121wyQ.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (isConnected().getItemCount() == 0) {
            super.showLoading();
        }
    }

    public final void copydefault(final java.lang.String str) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean zEZpvd = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(str)) == null) ? false : Intrinsics.EZpvd((java.lang.Object) tradeCoinInfoAhwBna.getSupportAutoEarn(), (java.lang.Object) "1");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.getCurrent), C33070mpX.AYXKKw(C48033uCm.Fragment.hrnhsO));
        if (zEZpvd) {
            java.lang.String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.ibnZAm, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
            ViewOnClickListenerC54939xaY.addTitleAndMessage$default(viewOnClickListenerC54939xaY, (java.lang.CharSequence) null, C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C48033uCm.Fragment.HJWChPQdUnVm, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str), C56390yDp.OLrzqt("cryptoEarnings", strCopydefault))), new java.lang.String[]{strCopydefault}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.wyU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54121wyQ.AEQbTJ(str, viewOnClickListenerC54939xaY, this, (java.util.List) obj);
                }
            }, 10, null), 1, (java.lang.Object) null);
        }
        java.lang.String string = getString(C55688xof.Application.trackPipAnimationHintView);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C54121wyQ.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: renamed from: o.wyQ$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ C54121wyQ AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        public ActionBar(java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C54121wyQ c54121wyQ) {
            this.OLrzqt = str;
            this.KWHzl = viewOnClickListenerC54939xaY;
            this.AEQbTJ = c54121wyQ;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            TradeCoinInfo tradeCoinInfoAhwBna;
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String id = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(this.OLrzqt)) == null) ? null : tradeCoinInfoAhwBna.getId();
            java.lang.String upperCase = this.OLrzqt.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("currencyName", upperCase));
            if (id != null && id.length() != 0) {
                mapDjBIcL.put("currencyId", id);
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(C56071xvr.gEmmrt.ejfBZ() ? C48033uCm.Fragment.QjzqRB : C48033uCm.Fragment.RIKbBf, mapDjBIcL);
            this.KWHzl.dismiss();
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, strCopydefault, null, new Function1() { // from class: o.wzl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54121wyQ.ActionBar.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }

        public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
            return Unit.INSTANCE;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.bgColor = 0;
        }
    }

    public static final Unit AEQbTJ(java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C54121wyQ c54121wyQ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ActionBar(str, viewOnClickListenerC54939xaY, c54121wyQ));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
