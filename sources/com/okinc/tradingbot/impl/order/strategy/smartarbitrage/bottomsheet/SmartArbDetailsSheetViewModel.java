package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33070mpX;
import o.C33129mqd;
import o.C52680wUj;
import o.C52761wXj;
import o.C52912wba;
import o.C53418wlC;
import o.C56033xvF;
import o.C56051xvX;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.InterfaceC56387yDm;
import o.pTD;
import o.pUU;
import o.uLN;
import o.uLP;
import o.wUL;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbDetailsSheetViewModel extends uLN<Activity> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final SavedStateHandle AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final StateFlow<ActionBar> AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final MutableStateFlow<StrategyDetailsResponse> KWHzl;
    public final CoroutineDispatcher copydefault;
    public final C52680wUj djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public Job values;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SmartArbDetailsType.values().length];
            try {
                iArr[SmartArbDetailsType.Arbitrage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmartArbDetailsType.Staking.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> OLrzqt() {
        return this.AhwBna;
    }

    public static final class Dialog implements Flow<ActionBar> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ SmartArbDetailsSheetViewModel KWHzl;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel$Dialog$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ SmartArbDetailsSheetViewModel AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
                this.EZpvd = flowCollector;
                this.AEQbTJ = smartArbDetailsSheetViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:66:0x0117  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SmartArbDetailsSheetViewModel$special$$inlined$map$1$2$1 smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1;
                ActionBar actionBarAEQbTJ;
                boolean z;
                SmartArbProfitsInfo smartArbProfitsInfo;
                SmartArbProfitsInfo smartArbProfitsInfo2;
                SmartArbitrageVo smartArbitrage;
                ProfitDetailResponse autoStakingProfit;
                SmartArbProfitsInfo smartArbProfitsInfo3;
                SmartArbitrageVo smartArbitrage2;
                SmartArbitrageVo smartArbitrage3;
                SmartArbitrageVo smartArbitrage4;
                SmartArbitrageVo smartArbitrage5;
                if (continuation instanceof SmartArbDetailsSheetViewModel$special$$inlined$map$1$2$1) {
                    smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1 = (SmartArbDetailsSheetViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1 = new SmartArbDetailsSheetViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) obj;
                    int i3 = StateListAnimator.AEQbTJ[this.AEQbTJ.copydefault().ordinal()];
                    if (i3 == 1) {
                        actionBarAEQbTJ = this.AEQbTJ.AEQbTJ(strategyDetailsResponse.getArbitrageProfit());
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel = this.AEQbTJ;
                        String totalSpreadProfit = strategyDetailsResponse.getTotalSpreadProfit();
                        String totalApy = strategyDetailsResponse.getTotalApy();
                        String fee = strategyDetailsResponse.getFee();
                        String totalInterestAmt = strategyDetailsResponse.getTotalInterestAmt();
                        String debtCcy = strategyDetailsResponse.getDebtCcy();
                        ProfitDetailResponse arbitrageProfit = strategyDetailsResponse.getArbitrageProfit();
                        ProfitDetailResponse stakingProfit = strategyDetailsResponse.getStakingProfit();
                        BotVo bot = strategyDetailsResponse.getBot();
                        ProfitDetailResponse autoStakingProfit2 = null;
                        ProfitDetailResponse autoStakingProfit3 = (bot == null || (smartArbitrage5 = bot.getSmartArbitrage()) == null) ? null : smartArbitrage5.getAutoStakingProfit();
                        BotVo bot2 = strategyDetailsResponse.getBot();
                        String autoStakingPos = (bot2 == null || (smartArbitrage4 = bot2.getSmartArbitrage()) == null) ? null : smartArbitrage4.getAutoStakingPos();
                        BotVo bot3 = strategyDetailsResponse.getBot();
                        String autoStakingPosUsdt = (bot3 == null || (smartArbitrage3 = bot3.getSmartArbitrage()) == null) ? null : smartArbitrage3.getAutoStakingPosUsdt();
                        BotVo bot4 = strategyDetailsResponse.getBot();
                        SmartArbProfitsInfo smartArbProfitsInfo4 = new SmartArbProfitsInfo(totalSpreadProfit, totalApy, fee, totalInterestAmt, debtCcy, arbitrageProfit, stakingProfit, autoStakingProfit3, autoStakingPos, autoStakingPosUsdt, (bot4 == null || (smartArbitrage2 = bot4.getSmartArbitrage()) == null) ? null : smartArbitrage2.getStakePosUsdt());
                        ProfitDetailResponse stakingProfit2 = strategyDetailsResponse.getStakingProfit();
                        if (stakingProfit2 == null) {
                            TacticsData tacticsDataAYXKKw = this.AEQbTJ.AYXKKw();
                            stakingProfit2 = (tacticsDataAYXKKw == null || (smartArbProfitsInfo3 = tacticsDataAYXKKw.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo3.getStakingProfit();
                        }
                        if (stakingProfit2 != null) {
                            z = false;
                            smartArbProfitsInfo = smartArbProfitsInfo4;
                            actionBarAEQbTJ = smartArbDetailsSheetViewModel.EZpvd(smartArbProfitsInfo, z);
                        } else {
                            BotVo bot5 = strategyDetailsResponse.getBot();
                            if (bot5 == null || (smartArbitrage = bot5.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) == null) {
                                TacticsData tacticsDataAYXKKw2 = this.AEQbTJ.AYXKKw();
                                if (tacticsDataAYXKKw2 != null && (smartArbProfitsInfo2 = tacticsDataAYXKKw2.getSmartArbProfitsInfo()) != null) {
                                    autoStakingProfit2 = smartArbProfitsInfo2.getAutoStakingProfit();
                                }
                            } else {
                                autoStakingProfit2 = autoStakingProfit;
                            }
                            if (autoStakingProfit2 == null) {
                                smartArbProfitsInfo = smartArbProfitsInfo4;
                                z = true;
                            }
                            actionBarAEQbTJ = smartArbDetailsSheetViewModel.EZpvd(smartArbProfitsInfo, z);
                        }
                    }
                    smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(actionBarAEQbTJ, smartArbDetailsSheetViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Dialog(Flow flow, SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
            this.AEQbTJ = flow;
            this.KWHzl = smartArbDetailsSheetViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ActionBar> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public SmartArbDetailsSheetViewModel(@NotNull C52680wUj c52680wUj, @NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c52680wUj, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c52680wUj;
        this.AEQbTJ = savedStateHandle;
        this.copydefault = coroutineDispatcher;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.waJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbDetailsSheetViewModel.AkhnZx(this.EZpvd);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.waN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbDetailsSheetViewModel.gEmmrt(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.waP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbDetailsSheetViewModel.valueOf(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.waQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbDetailsSheetViewModel.AYXKKw(this.AEQbTJ);
            }
        });
        MutableStateFlow<StrategyDetailsResponse> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AhwBna = FlowKt.stateIn(new Dialog(FlowKt.filterNotNull(MutableStateFlow), this), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), EZpvd(AYXKKw()));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final TacticsData AYXKKw() {
        return (TacticsData) this.AYXKKw.getValue();
    }

    public static final TacticsData AkhnZx(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
        return (TacticsData) smartArbDetailsSheetViewModel.AEQbTJ.get("arg_tactics_data");
    }

    public final SmartArbDetailsType copydefault() {
        return (SmartArbDetailsType) this.EZpvd.getValue();
    }

    public static final SmartArbDetailsType gEmmrt(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
        SmartArbDetailsType smartArbDetailsType = (SmartArbDetailsType) smartArbDetailsSheetViewModel.AEQbTJ.get("arg_details_type");
        return smartArbDetailsType == null ? SmartArbDetailsType.Arbitrage : smartArbDetailsType;
    }

    public final SmartArbPlanLeg EZpvd() {
        return (SmartArbPlanLeg) this.valueOf.getValue();
    }

    public static final SmartArbPlanLeg valueOf(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
        ArrayList<SmartArbListItem> arbList;
        SmartArbListItem smartArbListItem;
        ArrayList<SmartArbPlanLeg> planLeg;
        TacticsData tacticsDataAYXKKw = smartArbDetailsSheetViewModel.AYXKKw();
        Object obj = null;
        if (tacticsDataAYXKKw == null || (arbList = tacticsDataAYXKKw.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
            return null;
        }
        Iterator<T> it = planLeg.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.EZpvd((Object) ((SmartArbPlanLeg) next).getInstType(), (Object) "SWAP")) {
                obj = next;
                break;
            }
        }
        return (SmartArbPlanLeg) obj;
    }

    public final BizInstrument KWHzl() {
        return (BizInstrument) this.gEmmrt.getValue();
    }

    public static final BizInstrument AYXKKw(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel) {
        ArrayList<SmartArbListItem> arbList;
        SmartArbListItem smartArbListItem;
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        TacticsData tacticsDataAYXKKw = smartArbDetailsSheetViewModel.AYXKKw();
        String instFamily = (tacticsDataAYXKKw == null || (arbList = tacticsDataAYXKKw.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        SmartArbPlanLeg smartArbPlanLegEZpvd = smartArbDetailsSheetViewModel.EZpvd();
        String instType = smartArbPlanLegEZpvd != null ? smartArbPlanLegEZpvd.getInstType() : null;
        return c56051xvX.copydefault(instFamily, instType != null ? instType : "");
    }

    public final void EZpvd(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        if (this.values == null) {
            AEQbTJ(lifecycle);
        }
    }

    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        pUU.EZpvd("SmartArbDetailsSheetViewModel", "trigger action: " + application);
        if (!(application instanceof Application.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        valueOf();
    }

    public final void valueOf() {
        ProfitDetailResponse stakingProfit;
        SmartArbProfitsInfo smartArbProfitsInfo;
        SmartArbProfitsInfo smartArbProfitsInfo2;
        BotVo bot;
        SmartArbitrageVo smartArbitrage;
        ProfitDetailResponse autoStakingProfit;
        StrategyDetailsResponse value = this.KWHzl.getValue();
        ProfitDetailResponse autoStakingProfit2 = null;
        if (value == null || (stakingProfit = value.getStakingProfit()) == null) {
            TacticsData tacticsDataAYXKKw = AYXKKw();
            stakingProfit = (tacticsDataAYXKKw == null || (smartArbProfitsInfo = tacticsDataAYXKKw.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo.getStakingProfit();
        }
        StrategyDetailsResponse value2 = this.KWHzl.getValue();
        if (value2 == null || (bot = value2.getBot()) == null || (smartArbitrage = bot.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) == null) {
            TacticsData tacticsDataAYXKKw2 = AYXKKw();
            if (tacticsDataAYXKKw2 != null && (smartArbProfitsInfo2 = tacticsDataAYXKKw2.getSmartArbProfitsInfo()) != null) {
                autoStakingProfit2 = smartArbProfitsInfo2.getAutoStakingProfit();
            }
        } else {
            autoStakingProfit2 = autoStakingProfit;
        }
        if (stakingProfit == null && autoStakingProfit2 == null) {
            return;
        }
        C52912wba c52912wba = C52912wba.copydefault;
        if (stakingProfit == null) {
            stakingProfit = new ProfitDetailResponse((String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, 127, (DefaultConstructorMarker) null);
        }
        C52912wba.ActionBar actionBarKWHzl = c52912wba.KWHzl(stakingProfit, KWHzl());
        if (autoStakingProfit2 == null) {
            autoStakingProfit2 = new ProfitDetailResponse((String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, 127, (DefaultConstructorMarker) null);
        }
        EZpvd(new Activity.ActionBar(actionBarKWHzl, c52912wba.KWHzl(autoStakingProfit2, KWHzl())));
    }

    public final void AEQbTJ() {
        Job job = this.values;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.values = null;
        pUU.EZpvd("SmartArbDetailsSheetViewModel", "websocket cleared, " + ((Object) null));
    }

    public final void AEQbTJ(Lifecycle lifecycle) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmartArbDetailsSheetViewModel$connectWsTasks$1(this, lifecycle, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionBar EZpvd(TacticsData tacticsData) {
        ActionBar actionBarAEQbTJ;
        SmartArbitrageVo smartArbitrage;
        ProfitDetailResponse autoStakingProfit;
        if (tacticsData != null) {
            int i = StateListAnimator.AEQbTJ[copydefault().ordinal()];
            boolean z = true;
            if (i == 1) {
                SmartArbProfitsInfo smartArbProfitsInfo = tacticsData.getSmartArbProfitsInfo();
                actionBarAEQbTJ = AEQbTJ(smartArbProfitsInfo != null ? smartArbProfitsInfo.getArbitrageProfit() : null);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SmartArbProfitsInfo smartArbProfitsInfo2 = tacticsData.getSmartArbProfitsInfo();
                SmartArbProfitsInfo smartArbProfitsInfo3 = tacticsData.getSmartArbProfitsInfo();
                if ((smartArbProfitsInfo3 != null ? smartArbProfitsInfo3.getStakingProfit() : null) != null) {
                    z = false;
                    actionBarAEQbTJ = EZpvd(smartArbProfitsInfo2, z);
                } else {
                    BotVo bot = tacticsData.getBot();
                    if (bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) == null) {
                        SmartArbProfitsInfo smartArbProfitsInfo4 = tacticsData.getSmartArbProfitsInfo();
                        if (smartArbProfitsInfo4 != null) {
                            autoStakingProfit = smartArbProfitsInfo4.getAutoStakingProfit();
                        }
                    } else {
                        autoStakingProfit = autoStakingProfit;
                    }
                    if (autoStakingProfit != null) {
                    }
                    actionBarAEQbTJ = EZpvd(smartArbProfitsInfo2, z);
                }
            }
            if (actionBarAEQbTJ != null) {
                return actionBarAEQbTJ;
            }
        }
        return ActionBar.Companion.copydefault();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvX.getSmartArbProfit$default(o.xvX, java.lang.String, com.okinc.unify_trade.biz.BizInstrument, boolean, boolean, int, java.lang.Object):java.lang.String */
    public final ActionBar AEQbTJ(ProfitDetailResponse profitDetailResponse) {
        String ccy;
        String ccy2;
        String ccy3;
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        String total = profitDetailResponse != null ? profitDetailResponse.getTotal() : null;
        String strKWHzl = C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, total == null ? "" : total, KWHzl(), true, false, 8, null));
        String total2 = profitDetailResponse != null ? profitDetailResponse.getTotal() : null;
        if (total2 == null) {
            total2 = "";
        }
        Pair<? extends String, ? extends String> pairEZpvd = uLP.EZpvd(strKWHzl, total2);
        String total3 = profitDetailResponse != null ? profitDetailResponse.getTotal() : null;
        if (total3 == null) {
            total3 = "";
        }
        int iOLrzqt = C56033xvF.OLrzqt((Object) total3);
        String withdrawable = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
        String strKWHzl2 = C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, withdrawable == null ? "" : withdrawable, KWHzl(), false, false, 8, null));
        if (profitDetailResponse == null || (ccy = profitDetailResponse.getCcy()) == null) {
            ccy = "USDT";
        }
        String strAEQbTJ = pTD.AEQbTJ(strKWHzl2, ccy);
        String withdrawable2 = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
        if (withdrawable2 == null) {
            withdrawable2 = "";
        }
        Pair<? extends String, ? extends String> pairEZpvd2 = uLP.EZpvd(strAEQbTJ, withdrawable2);
        String withdrawn = profitDetailResponse != null ? profitDetailResponse.getWithdrawn() : null;
        String strKWHzl3 = C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, withdrawn == null ? "" : withdrawn, KWHzl(), false, false, 8, null));
        if (profitDetailResponse == null || (ccy2 = profitDetailResponse.getCcy()) == null) {
            ccy2 = "USDT";
        }
        String strAEQbTJ2 = pTD.AEQbTJ(strKWHzl3, ccy2);
        String withdrawn2 = profitDetailResponse != null ? profitDetailResponse.getWithdrawn() : null;
        return new ActionBar(pairEZpvd, iOLrzqt, pairEZpvd2, uLP.EZpvd(strAEQbTJ2, withdrawn2 != null ? withdrawn2 : ""), (profitDetailResponse == null || (ccy3 = profitDetailResponse.getCcy()) == null) ? "USDT" : ccy3, false, null);
    }

    public static /* synthetic */ ActionBar mapStakingToUiModel$default(SmartArbDetailsSheetViewModel smartArbDetailsSheetViewModel, SmartArbProfitsInfo smartArbProfitsInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return smartArbDetailsSheetViewModel.EZpvd(smartArbProfitsInfo, z);
    }

    public final ActionBar EZpvd(SmartArbProfitsInfo smartArbProfitsInfo, boolean z) {
        String ccy;
        String ccy2;
        ProfitDetailResponse stakingProfit;
        ProfitDetailResponse quote;
        String ccy3;
        ProfitDetailResponse stakingProfit2;
        ProfitDetailResponse quote2;
        ProfitDetailResponse stakingProfit3;
        ProfitDetailResponse quote3;
        ProfitDetailResponse stakingProfit4;
        ProfitDetailResponse quote4;
        ProfitDetailResponse stakingProfit5;
        ProfitDetailResponse quote5;
        ProfitDetailResponse stakingProfit6;
        ProfitDetailResponse quote6;
        ProfitDetailResponse stakingProfit7;
        ProfitDetailResponse quote7;
        ProfitDetailResponse autoStakingProfit;
        ProfitDetailResponse quote8;
        ProfitDetailResponse stakingProfit8;
        ProfitDetailResponse quote9;
        String withdrawn = null;
        String total = (smartArbProfitsInfo == null || (stakingProfit8 = smartArbProfitsInfo.getStakingProfit()) == null || (quote9 = stakingProfit8.getQuote()) == null) ? null : quote9.getTotal();
        String str = (total == null || total.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) total)) ? "0" : total;
        String total2 = (smartArbProfitsInfo == null || (autoStakingProfit = smartArbProfitsInfo.getAutoStakingProfit()) == null || (quote8 = autoStakingProfit.getQuote()) == null) ? null : quote8.getTotal();
        String strAddS$default = C33129mqd.addS$default(str, (total2 == null || total2.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) total2)) ? "0" : total2, null, null, null, 14, null);
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        Pair<? extends String, ? extends String> pairEZpvd = uLP.EZpvd(C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, strAddS$default, KWHzl(), true, false, 8, null)), C53418wlC.EZpvd(strAddS$default));
        int iOLrzqt = C56033xvF.OLrzqt((Object) C53418wlC.EZpvd(strAddS$default));
        String strKWHzl = C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, C53418wlC.EZpvd((smartArbProfitsInfo == null || (stakingProfit7 = smartArbProfitsInfo.getStakingProfit()) == null || (quote7 = stakingProfit7.getQuote()) == null) ? null : quote7.getWithdrawable()), KWHzl(), false, false, 8, null));
        if (smartArbProfitsInfo == null || (stakingProfit6 = smartArbProfitsInfo.getStakingProfit()) == null || (quote6 = stakingProfit6.getQuote()) == null || (ccy = quote6.getCcy()) == null) {
            ccy = "USDT";
        }
        Pair<? extends String, ? extends String> pairEZpvd2 = uLP.EZpvd(pTD.AEQbTJ(strKWHzl, ccy), C53418wlC.EZpvd((smartArbProfitsInfo == null || (stakingProfit5 = smartArbProfitsInfo.getStakingProfit()) == null || (quote5 = stakingProfit5.getQuote()) == null) ? null : quote5.getWithdrawable()));
        String strKWHzl2 = C53418wlC.KWHzl(C56051xvX.getSmartArbProfit$default(c56051xvX, C53418wlC.EZpvd((smartArbProfitsInfo == null || (stakingProfit4 = smartArbProfitsInfo.getStakingProfit()) == null || (quote4 = stakingProfit4.getQuote()) == null) ? null : quote4.getWithdrawn()), KWHzl(), false, false, 8, null));
        if (smartArbProfitsInfo == null || (stakingProfit3 = smartArbProfitsInfo.getStakingProfit()) == null || (quote3 = stakingProfit3.getQuote()) == null || (ccy2 = quote3.getCcy()) == null) {
            ccy2 = "USDT";
        }
        String strAEQbTJ = pTD.AEQbTJ(strKWHzl2, ccy2);
        if (smartArbProfitsInfo != null && (stakingProfit2 = smartArbProfitsInfo.getStakingProfit()) != null && (quote2 = stakingProfit2.getQuote()) != null) {
            withdrawn = quote2.getWithdrawn();
        }
        return new ActionBar(pairEZpvd, iOLrzqt, pairEZpvd2, uLP.EZpvd(strAEQbTJ, C53418wlC.EZpvd(withdrawn)), (smartArbProfitsInfo == null || (stakingProfit = smartArbProfitsInfo.getStakingProfit()) == null || (quote = stakingProfit.getQuote()) == null || (ccy3 = quote.getCcy()) == null) ? "USDT" : ccy3, z, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object EZpvd(Lifecycle lifecycle, Continuation<? super Job> continuation) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new SmartArbDetailsSheetViewModel$observeWebSocket$2$1(this, null), 2, null);
            }
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new Function0<Job>() { // from class: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel$observeWebSocket$$inlined$withStateAtLeast$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Job invoke() {
                return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this.this$0), this.this$0.copydefault, null, new SmartArbDetailsSheetViewModel$observeWebSocket$2$1(this.this$0, null), 2, null);
            }
        }, continuation);
    }

    public static final class ActionBar {
        public static final ActionBar AEQbTJ;
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public final Pair<? extends String, ? extends String> AhwBna;
        public final boolean EZpvd;
        public final Pair<? extends String, ? extends String> KWHzl;
        public final String OLrzqt;
        public final Pair<? extends String, ? extends String> copydefault;
        public final int djBIcL;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.Pair), (r2v0 int), (r3v0 kotlin.Pair), (r4v0 kotlin.Pair), (r5v0 java.lang.String), (r6v0 boolean) A[MD:(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, int, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String, boolean):void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel.ActionBar.<init>(kotlin.Pair, int, kotlin.Pair, kotlin.Pair, java.lang.String, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(Pair pair, int i, Pair pair2, Pair pair3, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(pair, i, pair2, pair3, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-J1jVxdU$default, reason: not valid java name */
        public static /* synthetic */ ActionBar m7100copyJ1jVxdU$default(ActionBar actionBar, Pair pair, int i, Pair pair2, Pair pair3, String str, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                pair = actionBar.AhwBna;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.djBIcL;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                pair2 = actionBar.copydefault;
            }
            Pair pair4 = pair2;
            if ((i2 & 8) != 0) {
                pair3 = actionBar.KWHzl;
            }
            Pair pair5 = pair3;
            if ((i2 & 16) != 0) {
                str = actionBar.OLrzqt;
            }
            String str2 = str;
            if ((i2 & 32) != 0) {
                z = actionBar.EZpvd;
            }
            return actionBar.EZpvd(pair, i3, pair4, pair5, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull Pair<? extends String, ? extends String> pair, int i, @NotNull Pair<? extends String, ? extends String> pair2, @NotNull Pair<? extends String, ? extends String> pair3, @NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(pair, i, pair2, pair3, str, z, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return uLP.EZpvd(this.AhwBna, actionBar.AhwBna) && this.djBIcL == actionBar.djBIcL && uLP.EZpvd(this.copydefault, actionBar.copydefault) && uLP.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((uLP.EZpvd(this.AhwBna) * 31) + Integer.hashCode(this.djBIcL)) * 31) + uLP.EZpvd(this.copydefault)) * 31) + uLP.EZpvd(this.KWHzl)) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiModel(totalProfits=" + uLP.gEmmrt(this.AhwBna) + ", totalProfitsTextColor=" + this.djBIcL + ", currentProfit=" + uLP.gEmmrt(this.copydefault) + ", historicalWithdrawal=" + uLP.gEmmrt(this.KWHzl) + ", ccy=" + this.OLrzqt + ", hideUnderline=" + this.EZpvd + ")";
        }

        public ActionBar(Pair<? extends String, ? extends String> pair, int i, Pair<? extends String, ? extends String> pair2, Pair<? extends String, ? extends String> pair3, String str, boolean z) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AhwBna = pair;
            this.djBIcL = i;
            this.copydefault = pair2;
            this.KWHzl = pair3;
            this.OLrzqt = str;
            this.EZpvd = z;
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.bottomsheet.SmartArbDetailsSheetViewModel.ActionBar.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public final ActionBar copydefault() {
                return ActionBar.AEQbTJ;
            }
        }

        static {
            uLP.Application application = uLP.Companion;
            AEQbTJ = new ActionBar(application.OLrzqt(), C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), application.OLrzqt(), application.OLrzqt(), "", false, null);
        }
    }

    public interface Application {

        public static final class StateListAnimator implements Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
            }
        }
    }

    public interface Activity {

        public static final class ActionBar implements Activity {
            public final C52912wba.ActionBar AEQbTJ;
            public final C52912wba.ActionBar EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C52912wba.ActionBar actionBar2, C52912wba.ActionBar actionBar3, int i, Object obj) {
                if ((i & 1) != 0) {
                    actionBar2 = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    actionBar3 = actionBar.AEQbTJ;
                }
                return actionBar.copydefault(actionBar2, actionBar3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52912wba.ActionBar AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52912wba.ActionBar KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull C52912wba.ActionBar actionBar, @NotNull C52912wba.ActionBar actionBar2) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                Intrinsics.checkNotNullParameter(actionBar2, "");
                return new ActionBar(actionBar, actionBar2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowTotalStakeProfitDialog(info=" + this.EZpvd + ", autoInfo=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull C52912wba.ActionBar actionBar, @NotNull C52912wba.ActionBar actionBar2) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                Intrinsics.checkNotNullParameter(actionBar2, "");
                this.EZpvd = actionBar;
                this.AEQbTJ = actionBar2;
            }
        }
    }
}
