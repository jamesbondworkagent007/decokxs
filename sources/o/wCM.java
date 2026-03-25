package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
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

/* JADX INFO: loaded from: classes19.dex */
public final class wCM extends AbstractC54505xKx<uQX, DealRecordPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public InterfaceC55705xow AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public final int EZpvd = C48033uCm.Activity.vLaW;
    public final InterfaceC56387yDm OLrzqt = C56389yDo.AEQbTJ(new wCI());
    public java.lang.String valueOf = "";

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return this.EZpvd;
    }

    public wCM() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridDealRecordFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridDealRecordFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.GridDealRecordFragment$special$$inlined$activityViewModels$default$3
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

    public final wCI copydefault() {
        return (wCI) this.OLrzqt.getValue();
    }

    private final TacticsDetailPresenter KWHzl() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wCM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault().register(GridDealRecordSummaryHeaderData.class, new C52313wGu());
        copydefault().register(ItemData.class, new C52302wGj(new Function1() { // from class: o.wCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.OLrzqt(this.EZpvd, (ItemData) obj);
            }
        }, new Function1() { // from class: o.wCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.EZpvd(this.copydefault, (ItemData) obj);
            }
        }, null, new Function1() { // from class: o.wCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.gEmmrt(this.KWHzl, (ItemData) obj);
            }
        }, 4, null));
        copydefault().register(GridDealRecordArbitrageRecordHeaderData.class, new C52300wGh());
        copydefault().register(GridDealRecordFilterBarData.class, new C52306wGn(new Function2() { // from class: o.wCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wCM.copydefault(this.AEQbTJ, (SortTextView) obj, (SortTextView.SortType) obj2);
            }
        }, new View.OnClickListener() { // from class: o.wCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                wCM.EZpvd(this.copydefault, view2);
            }
        }));
        copydefault().register(ExpandableGridDealRecordItemData.class, new C52305wGm(new Function1() { // from class: o.wDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.AEQbTJ(this.EZpvd, (ExpandableGridDealRecordItemData) obj);
            }
        }));
        copydefault().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.AEQbTJ(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        gGvvIC().EZpvd.setAdapter(copydefault());
        gGvvIC().EZpvd.setLayoutManager(new LinearLayoutManager(getActivity()));
        if (gGvvIC().EZpvd.getItemDecorationCount() == 0) {
            gGvvIC().EZpvd.addItemDecoration(new C52299wGg());
        }
        C33546myW c33546myW = gGvvIC().KWHzl;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.AhwBna(true);
        c33546myW.djBIcL(false);
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.wCJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                wCM.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.wCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                wCM.OLrzqt(this.copydefault, interfaceC57934yrl);
            }
        });
    }

    public static final Unit OLrzqt(final wCM wcm, ItemData itemData) {
        BalanceDetailInfoDto balanceDetails;
        Intrinsics.checkNotNullParameter(itemData, "");
        if (itemData.djBIcL() != null && (itemData.djBIcL() instanceof TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails) && (balanceDetails = wcm.KWHzl().AhwBna().getBalanceDetails()) != null) {
            C51046vfd c51046vfdEZpvd = C51046vfd.Companion.EZpvd(wcm.KWHzl().AhwBna().getInstType(), wcm.KWHzl().AhwBna().getInstId(), balanceDetails, new Function0() { // from class: o.wCP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wCM.EZpvd(this.KWHzl);
                }
            }, new Function0() { // from class: o.wCQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wCM.valueOf();
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = wcm.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C49662usl.EZpvd(c51046vfdEZpvd, childFragmentManager, "GridProfitBottomSheet");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit valueOf() {
        C51046vfd.Companion.KWHzl().tryEmit(null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wCM wcm) {
        wcm.KWHzl().zuBGHE();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wCM wcm, ItemData itemData) {
        java.lang.String strAYXKKw;
        if (itemData == null || (strAYXKKw = itemData.AYXKKw()) == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "show_auto_stake_profit")) {
            TacticsData tacticsDataZLjUOn = wcm.KWHzl().zLjUOn();
            C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = wcm.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C54132wyb.TaskDescription.newInstance$default(taskDescription, childFragmentManager, "auto_education_single_staking", tacticsDataZLjUOn, false, 8, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "show_auto_earn_profit")) {
            TacticsData tacticsDataZLjUOn2 = wcm.KWHzl().zLjUOn();
            C54132wyb.TaskDescription taskDescription2 = C54132wyb.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager2 = wcm.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            C54132wyb.TaskDescription.newInstance$default(taskDescription2, childFragmentManager2, "auto_education_single_earn", tacticsDataZLjUOn2, false, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(wCM wcm, ItemData itemData) {
        if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_earn_profit")) {
            TacticsData tacticsDataZLjUOn = wcm.KWHzl().zLjUOn();
            C54066wxO.ActionBar actionBar = C54066wxO.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = wcm.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            AutoVipProfitInfo autoVipProfitInfo = tacticsDataZLjUOn.getAutoVipProfitInfo();
            if (autoVipProfitInfo == null) {
                autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
            }
            actionBar.AEQbTJ(childFragmentManager, "auto_education_single_earn", (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) (itemData != null ? itemData.EZpvd() : null), (java.lang.Object) "show_auto_stake_profit")) {
                TacticsData tacticsDataZLjUOn2 = wcm.KWHzl().zLjUOn();
                C54066wxO.ActionBar actionBar2 = C54066wxO.Companion;
                androidx.fragment.app.FragmentManager childFragmentManager2 = wcm.getChildFragmentManager();
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

    public static final Unit copydefault(wCM wcm, SortTextView sortTextView, SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortTextView, "");
        Intrinsics.checkNotNullParameter(sortType, "");
        wcm.AEQbTJ(yDY.AhwBna());
        InterfaceC55705xow interfaceC55705xow = wcm.AEQbTJ;
        if (interfaceC55705xow != null) {
            interfaceC55705xow.OLrzqt(sortType);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(wCM wcm, android.view.View view) {
        android.content.Context contextRequireContext = wcm.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.onMenuKeyEvent);
        viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.HrMTQN);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.wCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                wCM.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(wCM wcm, ExpandableGridDealRecordItemData expandableGridDealRecordItemData) {
        Intrinsics.checkNotNullParameter(expandableGridDealRecordItemData, "");
        if (expandableGridDealRecordItemData.isExpanded()) {
            wcm.dxcTrN().AEQbTJ(expandableGridDealRecordItemData.getGroupId());
        } else {
            boolean z = expandableGridDealRecordItemData.getDetails().size() < 2;
            if (z) {
                super.showLoading();
            }
            wcm.dxcTrN().OLrzqt(expandableGridDealRecordItemData.getGroupId(), z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(wCM wcm, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        wcm.dxcTrN().fARcdN();
        return Unit.INSTANCE;
    }

    public static final void copydefault(wCM wcm, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        C33064mpR.OLrzqt(wcm.copydefault(), (java.util.List<? extends java.lang.Object>) yDY.AhwBna());
        InterfaceC55705xow interfaceC55705xow = wcm.AEQbTJ;
        if (interfaceC55705xow != null) {
            InterfaceC55705xow.Application.refresh$default(interfaceC55705xow, null, 1, null);
        }
    }

    public static final void OLrzqt(wCM wcm, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        InterfaceC55705xow interfaceC55705xow = wcm.AEQbTJ;
        if (interfaceC55705xow != null) {
            interfaceC55705xow.EZpvd();
        }
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(KWHzl().AhwBna());
        AYXKKw();
        this.valueOf = (java.lang.String) KWHzl().KWHzl(new Function1() { // from class: o.wCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.copydefault(this.EZpvd, (C55887xsS) obj);
            }
        });
        dxcTrN().EZpvd(dxcTrN().EZpvd().getInstId());
    }

    public static final java.lang.String copydefault(wCM wcm, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(wcm.KWHzl().AhwBna().getInstType(), wcm.KWHzl().AhwBna().getInstId(), "");
        java.lang.String sourceCcy = wcm.dxcTrN().EZpvd().getSourceCcy();
        java.lang.String strAkhnZx = c55887xsS.AkhnZx();
        if (strAkhnZx != null && strAkhnZx.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            strOLrzqt = strAkhnZx;
        }
        return (sourceCcy == null || sourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy)) ? strOLrzqt : sourceCcy;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        dxcTrN().fARcdN();
    }

    private final void AYXKKw() {
        dxcTrN().isConnected().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wCK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.EZpvd(this.KWHzl, (C55804xqp) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wCL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wCM.AEQbTJ(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit EZpvd(wCM wcm, C55804xqp c55804xqp) {
        wcm.AEQbTJ = c55804xqp.KWHzl();
        C33546myW c33546myW = wcm.gGvvIC().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, Intrinsics.EZpvd(c55804xqp.AEQbTJ(), java.lang.Boolean.TRUE));
        java.util.List<? extends java.lang.Object> list = (java.util.List) c55804xqp.copydefault();
        wcm.OLrzqt(!list.isEmpty());
        if (!list.isEmpty()) {
            wcm.AEQbTJ(list);
        } else {
            wcm.AEQbTJ(CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 60, null, null, false, false, 60, null));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wcm, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(wCM wcm, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            wcm.showLoading();
        } else {
            wcm.dismissLoading();
            if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) wcm.dxcTrN().AEQbTJ().bB_())) {
                C33546myW c33546myW = wcm.gGvvIC().KWHzl;
                Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                C57589ylK.finishStatus$default(c33546myW, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wCM wcm, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) wcm.dxcTrN().AEQbTJ().bB_())) {
            wcm.OLrzqt(false);
            wCI wciCopydefault = wcm.copydefault();
            CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            C33064mpR.OLrzqt(wciCopydefault, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wcm, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (copydefault().getItemCount() == 0) {
            super.showLoading();
        }
    }

    private final void AEQbTJ(java.util.List<? extends java.lang.Object> list) {
        BenefitDetails benefitDetailsKWHzl = new C55952xte().KWHzl(new C55804xqp<>("", dxcTrN().EZpvd(), null, null, 12, null));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderDataDjBIcL = dxcTrN().djBIcL();
        if (gridDealRecordSummaryHeaderDataDjBIcL != null) {
            arrayList.add(gridDealRecordSummaryHeaderDataDjBIcL);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        StrategyConfigInfo value = KWHzl().valueOf().getValue();
        if (value == null) {
            value = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        C55884xsP.copydefault((java.util.ArrayList<ItemData>) arrayList2, benefitDetailsKWHzl, value);
        arrayList.addAll(arrayList2);
        arrayList.add(dxcTrN().KWHzl());
        java.lang.String str = this.valueOf;
        java.lang.String algoOrdType = dxcTrN().EZpvd().getAlgoOrdType();
        arrayList.add(new GridDealRecordFilterBarData(str, Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "grid") || (Intrinsics.EZpvd((java.lang.Object) algoOrdType, (java.lang.Object) "contract_grid") && Intrinsics.EZpvd((java.lang.Object) dxcTrN().EZpvd().getDirection(), (java.lang.Object) "long") && dxcTrN().EZpvd().getBasePos())));
        arrayList.addAll(list);
        C33064mpR.OLrzqt(copydefault(), arrayList);
    }

    private final void OLrzqt(boolean z) {
        gGvvIC().KWHzl.AhwBna(z);
    }
}
