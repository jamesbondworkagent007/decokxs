package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.core.widget.SortTextView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.ExpandableGridDealRecordItemData;
import com.okinc.unify_trade.bot.data.GridDealRecordArbitrageRecordHeaderData;
import com.okinc.unify_trade.bot.data.GridDealRecordFilterBarData;
import com.okinc.unify_trade.bot.data.GridDealRecordSummaryHeaderData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C54066wxO;
import o.C54132wyb;
import o.C55688xof;
import o.InterfaceC55705xow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54167wzJ extends AbstractC54505xKx<AbstractC48431uRd, DealRecordPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public InterfaceC55705xow AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final int copydefault = C48033uCm.Activity.zAEkPU;
    public final InterfaceC56387yDm OLrzqt = C56389yDo.AEQbTJ(new C54165wzH());
    public java.lang.String djBIcL = "";

    /* JADX INFO: renamed from: o.wzJ$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
        return this.copydefault;
    }

    public C54167wzJ() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridDealRecordFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridDealRecordFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridDealRecordFragment$special$$inlined$activityViewModels$default$3
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

    public final C54165wzH AEQbTJ() {
        return (C54165wzH) this.OLrzqt.getValue();
    }

    private final TacticsDetailPresenter valueOf() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.wzJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wzJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ().register(GridDealRecordSummaryHeaderData.class, new C52313wGu());
        AEQbTJ().register(ItemData.class, new C52302wGj(new Function1() { // from class: o.wzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.KWHzl(this.AEQbTJ, (ItemData) obj);
            }
        }, new Function1() { // from class: o.wAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.AEQbTJ(this.AEQbTJ, (ItemData) obj);
            }
        }, null, new Function1() { // from class: o.wzN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.djBIcL(this.OLrzqt, (ItemData) obj);
            }
        }, 4, null));
        AEQbTJ().register(GridDealRecordArbitrageRecordHeaderData.class, new C52300wGh());
        AEQbTJ().register(GridDealRecordFilterBarData.class, new C52306wGn(new Function2() { // from class: o.wzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C54167wzJ.AEQbTJ(this.AEQbTJ, (SortTextView) obj, (SortTextView.SortType) obj2);
            }
        }, new View.OnClickListener() { // from class: o.wzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C54167wzJ.AEQbTJ(this.EZpvd, view2);
            }
        }));
        AEQbTJ().register(ExpandableGridDealRecordItemData.class, new C52305wGm(new Function1() { // from class: o.wzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.OLrzqt(this.OLrzqt, (ExpandableGridDealRecordItemData) obj);
            }
        }));
        AEQbTJ().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wzS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.OLrzqt(this.EZpvd, (EmptyData) obj);
            }
        }));
        gGvvIC().AEQbTJ.setAdapter(AEQbTJ());
        gGvvIC().AEQbTJ.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (gGvvIC().AEQbTJ.getItemDecorationCount() == 0) {
            gGvvIC().AEQbTJ.addItemDecoration(new C52299wGg());
        }
        C33546myW c33546myW = gGvvIC().EZpvd;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.djBIcL(false);
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.wzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C54167wzJ.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.wzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C54167wzJ.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final Unit KWHzl(final C54167wzJ c54167wzJ, ItemData itemData) {
        BalanceDetailInfoDto balanceDetails;
        Intrinsics.checkNotNullParameter(itemData, "");
        if (itemData.djBIcL() != null && (itemData.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) && (balanceDetails = c54167wzJ.valueOf().AhwBna().getBalanceDetails()) != null) {
            C51046vfd c51046vfdEZpvd = C51046vfd.Companion.EZpvd(c54167wzJ.valueOf().AhwBna().getInstType(), c54167wzJ.valueOf().AhwBna().getInstId(), balanceDetails, new Function0() { // from class: o.wzK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C54167wzJ.AEQbTJ(this.AEQbTJ);
                }
            }, new Function0() { // from class: o.wzL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C54167wzJ.KWHzl();
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = c54167wzJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C49662usl.EZpvd(c51046vfdEZpvd, childFragmentManager, "GridProfitBottomSheet");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        C51046vfd.Companion.KWHzl().tryEmit(null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54167wzJ c54167wzJ) {
        c54167wzJ.valueOf().zuBGHE();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54167wzJ c54167wzJ, ItemData itemData) {
        java.lang.String strAYXKKw;
        java.lang.String fundingRate;
        if (itemData == null || (strAYXKKw = itemData.AYXKKw()) == null) {
            return Unit.INSTANCE;
        }
        int iHashCode = strAYXKKw.hashCode();
        if (iHashCode != -1001798915) {
            if (iHashCode != 817027703) {
                if (iHashCode == 884038914 && strAYXKKw.equals("show_funding_fee")) {
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = C56390yDp.OLrzqt("sId", java.lang.String.valueOf(c54167wzJ.valueOf().KWHzl()));
                    pairArr[1] = C56390yDp.OLrzqt("fee", c54167wzJ.dxcTrN().EZpvd().getFundingFee());
                    FundingRateData value = c54167wzJ.dxcTrN().copydefault().getValue();
                    if (value == null || (fundingRate = value.getFundingRate()) == null) {
                        fundingRate = "";
                    }
                    pairArr[2] = C56390yDp.OLrzqt("rate", fundingRate);
                    pairArr[3] = C56390yDp.OLrzqt("precision", java.lang.String.valueOf(C56033xvF.gEmmrt(c54167wzJ.valueOf().AhwBna().getInstId(), c54167wzJ.valueOf().AhwBna().getInstType(), C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, c54167wzJ.valueOf().AhwBna().getInstId(), c54167wzJ.valueOf().AhwBna().getInstType(), null, 4, null))));
                    java.util.Map<java.lang.String, ? extends java.lang.Object> mapGEmmrt = C56424yEw.gEmmrt(pairArr);
                    pUU.EZpvd("GRID_DETAIL", "/bot/grid/funding-fee-history req : " + mapGEmmrt);
                    C43056riA c43056riA = C43056riA.AEQbTJ;
                    android.content.Context contextRequireContext = c54167wzJ.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/grid/funding-fee-history", mapGEmmrt);
                }
            } else if (strAYXKKw.equals("show_auto_stake_profit")) {
                TacticsData tacticsDataZLjUOn = c54167wzJ.valueOf().zLjUOn();
                C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager = c54167wzJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C54132wyb.TaskDescription.newInstance$default(taskDescription, childFragmentManager, "auto_education_single_staking", tacticsDataZLjUOn, false, 8, null);
            }
        } else if (strAYXKKw.equals("show_auto_earn_profit")) {
            TacticsData tacticsDataZLjUOn2 = c54167wzJ.valueOf().zLjUOn();
            C54132wyb.TaskDescription taskDescription2 = C54132wyb.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager2 = c54167wzJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C54132wyb.TaskDescription.newInstance$default(taskDescription2, childFragmentManager2, "auto_education_single_earn", tacticsDataZLjUOn2, false, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C54167wzJ c54167wzJ, ItemData itemData) {
        if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_earn_profit")) {
            TacticsData tacticsDataZLjUOn = c54167wzJ.valueOf().zLjUOn();
            C54066wxO.ActionBar actionBar = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = c54167wzJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            AutoVipProfitInfo autoVipProfitInfo = tacticsDataZLjUOn.getAutoVipProfitInfo();
            if (autoVipProfitInfo == null) {
                autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
            }
            actionBar.AEQbTJ(childFragmentManager, "auto_education_single_earn", (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_stake_profit")) {
                TacticsData tacticsDataZLjUOn2 = c54167wzJ.valueOf().zLjUOn();
                C54066wxO.ActionBar actionBar2 = C54066wxO.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager2 = c54167wzJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                AutoVipProfitInfo autoVipProfitInfo2 = tacticsDataZLjUOn2.getAutoVipProfitInfo();
                if (autoVipProfitInfo2 == null) {
                    autoVipProfitInfo2 = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
                }
                actionBar2.AEQbTJ(childFragmentManager2, "auto_education_single_staking", (56 & 4) != 0 ? null : autoVipProfitInfo2, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C54167wzJ c54167wzJ, SortTextView sortTextView, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        c54167wzJ.OLrzqt(yDY.AhwBna());
        InterfaceC55705xow interfaceC55705xow = c54167wzJ.AEQbTJ;
        if (interfaceC55705xow != null) {
            interfaceC55705xow.OLrzqt(sortType);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C54167wzJ c54167wzJ, android.view.View view) {
        android.content.Context contextRequireContext = c54167wzJ.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.onMenuKeyEvent);
        viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.HrMTQN);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C54167wzJ.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit OLrzqt(C54167wzJ c54167wzJ, ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
        Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
        if (expandableGridDealRecordItemData.isExpanded()) {
            c54167wzJ.dxcTrN().AEQbTJ(expandableGridDealRecordItemData.getGroupId());
        } else {
            boolean z = expandableGridDealRecordItemData.getDetails().size() < 2;
            if (z) {
                super.showLoading();
            }
            c54167wzJ.dxcTrN().OLrzqt(expandableGridDealRecordItemData.getGroupId(), z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C54167wzJ c54167wzJ, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c54167wzJ.dxcTrN().fARcdN();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C54167wzJ c54167wzJ, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c54167wzJ.OLrzqt(yDY.AhwBna());
        InterfaceC55705xow interfaceC55705xow = c54167wzJ.AEQbTJ;
        if (interfaceC55705xow != null) {
            InterfaceC55705xow.Application.refresh$default(interfaceC55705xow, null, 1, null);
        }
    }

    public static final void copydefault(C54167wzJ c54167wzJ, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        InterfaceC55705xow interfaceC55705xow = c54167wzJ.AEQbTJ;
        if (interfaceC55705xow != null) {
            interfaceC55705xow.EZpvd();
        }
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(valueOf().AhwBna());
        AYXKKw();
        this.djBIcL = (java.lang.String) valueOf().KWHzl(new Function1() { // from class: o.wzZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.KWHzl(this.OLrzqt, (C55887xsS) obj);
            }
        });
        dxcTrN().EZpvd(dxcTrN().EZpvd().getInstId());
    }

    public static final java.lang.String KWHzl(C54167wzJ c54167wzJ, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        java.lang.String pnlUnit$default = C56066xvm.getPnlUnit$default(C56066xvm.EZpvd, c54167wzJ.valueOf().AhwBna().getInstId(), c54167wzJ.valueOf().AhwBna().getInstType(), null, 4, null);
        java.lang.String sourceCcy = c54167wzJ.dxcTrN().EZpvd().getSourceCcy();
        java.lang.String strAkhnZx = c55887xsS.AkhnZx();
        if (strAkhnZx != null && strAkhnZx.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            pnlUnit$default = strAkhnZx;
        }
        return (sourceCcy == null || sourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy)) ? pnlUnit$default : sourceCcy;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().fARcdN();
    }

    private final void AYXKKw() {
        dxcTrN().isConnected().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wzV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.OLrzqt(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wzX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.AEQbTJ(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wzT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        valueOf().KWHzl(new Function1() { // from class: o.wzU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.copydefault(this.EZpvd, (C55887xsS) obj);
            }
        });
    }

    public static final Unit OLrzqt(C54167wzJ c54167wzJ, C55804xqp c55804xqp) {
        c54167wzJ.AEQbTJ = c55804xqp.KWHzl();
        C33546myW c33546myW = c54167wzJ.gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, Intrinsics.EZpvd(c55804xqp.AEQbTJ(), java.lang.Boolean.TRUE));
        java.util.List<? extends java.lang.Object> list = (java.util.List) c55804xqp.copydefault();
        c54167wzJ.AEQbTJ(!list.isEmpty());
        if (!list.isEmpty()) {
            c54167wzJ.OLrzqt(list);
        } else {
            c54167wzJ.OLrzqt(CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 60, null, null, false, false, 60, null));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c54167wzJ, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C54167wzJ c54167wzJ, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c54167wzJ.showLoading();
        } else {
            c54167wzJ.dismissLoading();
            if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c54167wzJ.dxcTrN().AEQbTJ().bB_())) {
                C33546myW c33546myW = c54167wzJ.gGvvIC().EZpvd;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                C57589ylK.finishStatus$default(c33546myW, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C54167wzJ c54167wzJ, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) c54167wzJ.dxcTrN().AEQbTJ().bB_())) {
            c54167wzJ.AEQbTJ(false);
            CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            c54167wzJ.OLrzqt(CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c54167wzJ, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C54167wzJ c54167wzJ, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        TradeLiveData<FundingRateData> tradeLiveDataCopydefault = c54167wzJ.dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = c54167wzJ.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wzW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54167wzJ.EZpvd((FundingRateData) obj);
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(FundingRateData fundingRateData) {
        Intrinsics.checkNotNullParameter(fundingRateData, "");
        pUU.EZpvd("GRID_DETAIL", "fundingRate = " + fundingRateData);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.util.List<? extends java.lang.Object> list) {
        boolean z = false;
        BenefitDetails benefitDetailsKWHzl = new C55894xsZ(false, 1, null).KWHzl(new C55804xqp<>("", dxcTrN().EZpvd(), null, null, 12, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderDataDjBIcL = dxcTrN().djBIcL();
        if (gridDealRecordSummaryHeaderDataDjBIcL != null) {
            arrayList.add(gridDealRecordSummaryHeaderDataDjBIcL);
        }
        arrayList.add(dxcTrN().OLrzqt(benefitDetailsKWHzl));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        StrategyConfigInfo value = valueOf().valueOf().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        C55884xsP.copydefault((java.util.ArrayList<ItemData>) arrayList2, benefitDetailsKWHzl, value);
        if (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(dxcTrN().KWHzl());
        java.lang.String str = this.djBIcL;
        java.lang.String algoOrdType = dxcTrN().EZpvd().getAlgoOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "grid") || (Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "contract_grid") && Intrinsics.EZpvd((java.lang.Object) dxcTrN().EZpvd().getDirection(), (java.lang.Object) "long") && dxcTrN().EZpvd().getBasePos())) {
            z = true;
        }
        arrayList.add(new GridDealRecordFilterBarData(str, z));
        arrayList.addAll(list);
        C33064mpR.OLrzqt(AEQbTJ(), arrayList);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (AEQbTJ().getItemCount() == 0) {
            super.showLoading();
        }
    }

    public final void AEQbTJ(boolean z) {
        gGvvIC().EZpvd.AhwBna(z);
    }
}
