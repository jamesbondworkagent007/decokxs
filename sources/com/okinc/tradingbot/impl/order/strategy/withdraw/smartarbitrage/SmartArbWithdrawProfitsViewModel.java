package com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.order.strategy.api.dto.smartarb.SmartArbWithdrawProfitResponse;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC54531xLw;
import o.AbstractC55737xpb;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C52912wba;
import o.C53418wlC;
import o.C54589xNz;
import o.C55887xsS;
import o.C56034xvG;
import o.C56051xvX;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.pTD;
import o.pUU;
import o.uLN;
import o.uLP;
import o.uLU;
import o.vNF;
import o.vNG;
import o.vNI;
import o.wUL;
import o.xMR;
import o.xMS;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbWithdrawProfitsViewModel extends uLN<Application> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<Map<SmartArbWithdrawType, String>> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableStateFlow<SmartArbWithdrawType> EZpvd;
    public final MutableStateFlow<Map<SmartArbWithdrawType, Dialog>> OLrzqt;
    public final MutableStateFlow<uLU<SmartArbWithdrawProfitResponse>> copydefault;
    public final MutableStateFlow<TickersData> djBIcL;
    public final SavedStateHandle ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final vNG gEmmrt;
    public final StateFlow<PendingIntent> getNewProxyInstance;
    public final vNF hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public final CoroutineDispatcher valueOf;
    public final vNI values;
    public final InterfaceC56387yDm zsXlph;

    public final /* synthetic */ class FragmentManager {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SmartArbWithdrawType.values().length];
            try {
                iArr[SmartArbWithdrawType.Arbitrage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmartArbWithdrawType.Staking.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PendingIntent> AYXKKw() {
        return this.getNewProxyInstance;
    }

    @yCM
    public SmartArbWithdrawProfitsViewModel(@NotNull vNI vni, @NotNull vNF vnf, @NotNull vNG vng, @NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(vni, "");
        Intrinsics.checkNotNullParameter(vnf, "");
        Intrinsics.checkNotNullParameter(vng, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.values = vni;
        this.hDKMBd = vnf;
        this.gEmmrt = vng;
        this.ejfBZ = savedStateHandle;
        this.valueOf = coroutineDispatcher;
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.woL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.OcIXYQ(this.KWHzl);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.woT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.wlaJM(this.KWHzl);
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.woU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.QOLQEE(this.copydefault);
            }
        });
        this.AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.woR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.AwvSrB(this.AEQbTJ);
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.woS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.zuBGHE(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.woQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.zsXlph(this.copydefault);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.woV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.sSMYrx(this.OLrzqt);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.woW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.AuCTelauCTel(this.copydefault);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.woM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.gHZMYf(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.woN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.AxsJAY(this.KWHzl);
            }
        });
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.woP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.DTwDnp(this.AEQbTJ);
            }
        });
        this.zsXlph = C56392yDr.copydefault(new Function0() { // from class: o.woO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SmartArbWithdrawProfitsViewModel.ORxRYg(this.OLrzqt);
            }
        });
        MutableStateFlow<SmartArbWithdrawType> MutableStateFlow = StateFlowKt.MutableStateFlow(AEQbTJ());
        this.EZpvd = MutableStateFlow;
        MutableStateFlow<uLU<SmartArbWithdrawProfitResponse>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(uLU.StateListAnimator.loading$default(uLU.Companion, false, 1, null));
        this.copydefault = MutableStateFlow2;
        MutableStateFlow<TickersData> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow3;
        SmartArbWithdrawType smartArbWithdrawType = SmartArbWithdrawType.Arbitrage;
        Pair pairOLrzqt = C56390yDp.OLrzqt(smartArbWithdrawType, null);
        SmartArbWithdrawType smartArbWithdrawType2 = SmartArbWithdrawType.Staking;
        MutableStateFlow<Map<SmartArbWithdrawType, String>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt(smartArbWithdrawType2, null)));
        this.AEQbTJ = MutableStateFlow4;
        MutableStateFlow<Map<SmartArbWithdrawType, Dialog>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(C56424yEw.gEmmrt(C56390yDp.OLrzqt(smartArbWithdrawType, Dialog.OLrzqt(Dialog.EZpvd(null, null))), C56390yDp.OLrzqt(smartArbWithdrawType2, Dialog.OLrzqt(Dialog.EZpvd(null, null)))));
        this.OLrzqt = MutableStateFlow5;
        this.getNewProxyInstance = FlowKt.stateIn(FlowKt.combine(MutableStateFlow2, MutableStateFlow, MutableStateFlow3, MutableStateFlow4, MutableStateFlow5, new SmartArbWithdrawProfitsViewModel$uiModel$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new PendingIntent(AEQbTJ(), AEQbTJ(null, AEQbTJ(), null, null, null, null), uLP.EZpvd("--", "0"), "USDT", null, null, false, 4, "", "", null));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData hDKMBd() {
        return (TacticsData) this.fARcdN.getValue();
    }

    public static final TacticsData OcIXYQ(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        return (TacticsData) smartArbWithdrawProfitsViewModel.ejfBZ.get("key_tactics_data");
    }

    public final SmartArbWithdrawType AEQbTJ() {
        return (SmartArbWithdrawType) this.isConnected.getValue();
    }

    public static final SmartArbWithdrawType wlaJM(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        BotVo bot;
        BotVo bot2;
        SmartArbitrageVo smartArbitrage;
        ProfitDetailResponse autoStakingProfit;
        String ccy;
        SmartArbProfitsInfo smartArbProfitsInfo;
        ProfitDetailResponse stakingProfit;
        BotVo bot3;
        SmartArbitrageVo smartArbitrage2;
        ProfitDetailResponse autoStakingProfit2;
        String ccy2;
        TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel.hDKMBd();
        String ccy3 = "";
        if (tacticsDataHDKMBd != null && tacticsDataHDKMBd.isSmartArbitrageWithStaking()) {
            SmartArbWithdrawType smartArbWithdrawType = SmartArbWithdrawType.Staking;
            TacticsData tacticsDataHDKMBd2 = smartArbWithdrawProfitsViewModel.hDKMBd();
            if (tacticsDataHDKMBd2 == null || (bot3 = tacticsDataHDKMBd2.getBot()) == null || (smartArbitrage2 = bot3.getSmartArbitrage()) == null || (autoStakingProfit2 = smartArbitrage2.getAutoStakingProfit()) == null || (ccy2 = autoStakingProfit2.getCcy()) == null) {
                TacticsData tacticsDataHDKMBd3 = smartArbWithdrawProfitsViewModel.hDKMBd();
                if (tacticsDataHDKMBd3 != null && (smartArbProfitsInfo = tacticsDataHDKMBd3.getSmartArbProfitsInfo()) != null && (stakingProfit = smartArbProfitsInfo.getStakingProfit()) != null) {
                    ccy3 = stakingProfit.getCcy();
                }
            } else {
                ccy3 = ccy2;
            }
            smartArbWithdrawType.setCcy(ccy3);
            return smartArbWithdrawType;
        }
        TacticsData tacticsDataHDKMBd4 = smartArbWithdrawProfitsViewModel.hDKMBd();
        if (tacticsDataHDKMBd4 != null && (bot = tacticsDataHDKMBd4.getBot()) != null && bot.isAutoStaking()) {
            SmartArbWithdrawType smartArbWithdrawType2 = SmartArbWithdrawType.Staking;
            TacticsData tacticsDataHDKMBd5 = smartArbWithdrawProfitsViewModel.hDKMBd();
            if (tacticsDataHDKMBd5 == null || (bot2 = tacticsDataHDKMBd5.getBot()) == null || (smartArbitrage = bot2.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage.getAutoStakingProfit()) == null || (ccy = autoStakingProfit.getCcy()) == null) {
                String strOLrzqt = smartArbWithdrawProfitsViewModel.OLrzqt();
                if (strOLrzqt != null) {
                    ccy3 = strOLrzqt;
                }
            } else {
                ccy3 = ccy;
            }
            smartArbWithdrawType2.setCcy(ccy3);
            return smartArbWithdrawType2;
        }
        return SmartArbWithdrawType.Arbitrage;
    }

    private final SmartArbPlanLeg AuCTel() {
        return (SmartArbPlanLeg) this.fIwbmz.getValue();
    }

    public static final SmartArbPlanLeg QOLQEE(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        ArrayList<SmartArbListItem> arbList;
        SmartArbListItem smartArbListItem;
        ArrayList<SmartArbPlanLeg> planLeg;
        TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel.hDKMBd();
        Object obj = null;
        if (tacticsDataHDKMBd == null || (arbList = tacticsDataHDKMBd.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
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

    public final SmartArbPlanLeg djBIcL() {
        return (SmartArbPlanLeg) this.AuCTel.getValue();
    }

    public static final SmartArbPlanLeg AwvSrB(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        ArrayList<SmartArbListItem> arbList;
        SmartArbListItem smartArbListItem;
        ArrayList<SmartArbPlanLeg> planLeg;
        TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel.hDKMBd();
        Object obj = null;
        if (tacticsDataHDKMBd == null || (arbList = tacticsDataHDKMBd.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
            return null;
        }
        for (Object obj2 : planLeg) {
            SmartArbPlanLeg smartArbPlanLeg = (SmartArbPlanLeg) obj2;
            if (Intrinsics.EZpvd((Object) smartArbPlanLeg.getInstType(), (Object) "SPOT") || Intrinsics.EZpvd((Object) smartArbPlanLeg.getInstType(), (Object) "MARGIN")) {
                obj = obj2;
                break;
            }
        }
        return (SmartArbPlanLeg) obj;
    }

    private final BizInstrument ejfBZ() {
        return (BizInstrument) this.fJNWhG.getValue();
    }

    public static final BizInstrument zuBGHE(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        ArrayList<SmartArbListItem> arbList;
        SmartArbListItem smartArbListItem;
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        TacticsData tacticsDataHDKMBd = smartArbWithdrawProfitsViewModel.hDKMBd();
        String instFamily = (tacticsDataHDKMBd == null || (arbList = tacticsDataHDKMBd.getArbList()) == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList)) == null) ? null : smartArbListItem.getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        SmartArbPlanLeg smartArbPlanLegAuCTel = smartArbWithdrawProfitsViewModel.AuCTel();
        String instType = smartArbPlanLegAuCTel != null ? smartArbPlanLegAuCTel.getInstType() : null;
        return c56051xvX.copydefault(instFamily, instType != null ? instType : "");
    }

    private final C55887xsS values() {
        return (C55887xsS) this.AYXKKw.getValue();
    }

    public static final C55887xsS zsXlph(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        SmartArbPlanLeg smartArbPlanLegDjBIcL = smartArbWithdrawProfitsViewModel.djBIcL();
        String instType = smartArbPlanLegDjBIcL != null ? smartArbPlanLegDjBIcL.getInstType() : null;
        if (instType == null) {
            instType = "";
        }
        SmartArbPlanLeg smartArbPlanLegDjBIcL2 = smartArbWithdrawProfitsViewModel.djBIcL();
        String instId = smartArbPlanLegDjBIcL2 != null ? smartArbPlanLegDjBIcL2.getInstId() : null;
        return new C55887xsS(instType, instId != null ? instId : "");
    }

    private final BizInstrument fIwbmz() {
        return (BizInstrument) this.AkhnZx.getValue();
    }

    public static final BizInstrument sSMYrx(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        return smartArbWithdrawProfitsViewModel.values().AhwBna();
    }

    public static final String AuCTelauCTel(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        BizInstrument bizInstrumentFIwbmz = smartArbWithdrawProfitsViewModel.fIwbmz();
        if (bizInstrumentFIwbmz != null) {
            return bizInstrumentFIwbmz.getTradeSymbol();
        }
        return null;
    }

    public final String OLrzqt() {
        return (String) this.AhwBna.getValue();
    }

    public static final String gHZMYf(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        BizInstrument bizInstrumentFIwbmz = smartArbWithdrawProfitsViewModel.fIwbmz();
        if (bizInstrumentFIwbmz != null) {
            return bizInstrumentFIwbmz.getQuoteSymbol();
        }
        return null;
    }

    public final String gEmmrt() {
        return (String) this.fetchVPNInfo.getValue();
    }

    private final xMS fARcdN() {
        return (xMS) this.DbNXlk.getValue();
    }

    public static final xMS AxsJAY(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(smartArbWithdrawProfitsViewModel.values().djBIcL())) == null) {
            return null;
        }
        BizInstrument bizInstrumentFIwbmz = smartArbWithdrawProfitsViewModel.fIwbmz();
        String instFamily = bizInstrumentFIwbmz != null ? bizInstrumentFIwbmz.getInstFamily() : null;
        if (instFamily == null) {
            instFamily = "";
        }
        return abstractC54531xLwOLrzqt.gEmmrt(instFamily);
    }

    public final TaskDescription valueOf() {
        return (TaskDescription) this.iwGUEr.getValue();
    }

    public static final TaskDescription DTwDnp(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        SmartArbPlanLeg smartArbPlanLegDjBIcL = smartArbWithdrawProfitsViewModel.djBIcL();
        if (smartArbPlanLegDjBIcL == null) {
            return null;
        }
        String instId = smartArbPlanLegDjBIcL.getInstId();
        if (instId == null) {
            instId = "";
        }
        return new TaskDescription(smartArbWithdrawProfitsViewModel, instId, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<Object> uzCIH() {
        return (ArrayList) this.zsXlph.getValue();
    }

    public static final ArrayList ORxRYg(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel) {
        ArrayList arrayList = new ArrayList();
        TaskDescription taskDescriptionValueOf = smartArbWithdrawProfitsViewModel.valueOf();
        if (taskDescriptionValueOf != null) {
            arrayList.add(taskDescriptionValueOf);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AhwBna() {
        ProfitDetailResponse arbitrageProfit;
        Object next;
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseKWHzl = this.copydefault.getValue().KWHzl();
        int i = FragmentManager.OLrzqt[this.EZpvd.getValue().ordinal()];
        if (i == 1) {
            SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseKWHzl2 = this.copydefault.getValue().KWHzl();
            if (smartArbWithdrawProfitResponseKWHzl2 != null && (arbitrageProfit = smartArbWithdrawProfitResponseKWHzl2.getArbitrageProfit()) != null) {
                ccy = arbitrageProfit.getCcy();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ProfitDetailResponse[] profitDetailResponseArr = new ProfitDetailResponse[2];
            profitDetailResponseArr[0] = smartArbWithdrawProfitResponseKWHzl != null ? smartArbWithdrawProfitResponseKWHzl.getStakingProfit() : null;
            profitDetailResponseArr[1] = smartArbWithdrawProfitResponseKWHzl != null ? smartArbWithdrawProfitResponseKWHzl.getAutoStakingProfit() : null;
            Iterator it = yDY.valueOf(profitDetailResponseArr).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((ProfitDetailResponse) next).getCcy(), (Object) this.EZpvd.getValue().getCcy())) {
                    break;
                }
            }
            ProfitDetailResponse profitDetailResponse = (ProfitDetailResponse) next;
            ccy = profitDetailResponse != null ? profitDetailResponse.getCcy() : null;
        }
    }

    public final Pair<? extends String, ? extends String> KWHzl() {
        return this.getNewProxyInstance.getValue().gEmmrt();
    }

    public final void OLrzqt(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        pUU.EZpvd("SmartArbWithdrawProfitsViewModel", "trigger action: " + stateListAnimator);
        if (stateListAnimator instanceof StateListAnimator.TaskDescription) {
            EZpvd();
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.C0663StateListAnimator) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SmartArbWithdrawProfitsViewModel$trigger$1(this, stateListAnimator, null), 3, null);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Dialog) {
            EZpvd(Application.Activity.copydefault);
            DbNXlk();
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.ActionBar) {
            StateListAnimator.ActionBar actionBar = (StateListAnimator.ActionBar) stateListAnimator;
            AEQbTJ(actionBar.copydefault(), actionBar.AEQbTJ(), actionBar.KWHzl());
        } else if (Intrinsics.EZpvd(stateListAnimator, StateListAnimator.Application.OLrzqt)) {
            AkhnZx();
        } else if (Intrinsics.EZpvd(stateListAnimator, StateListAnimator.Activity.EZpvd)) {
            fetchVPNInfo();
        } else {
            if (!Intrinsics.EZpvd(stateListAnimator, StateListAnimator.FragmentManager.copydefault)) {
                throw new NoWhenBranchMatchedException();
            }
            EZpvd(Application.LoaderManager.OLrzqt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(SmartArbWithdrawType smartArbWithdrawType, String str, String str2) {
        ProfitDetailResponse arbitrageProfit;
        String withdrawable;
        Map<SmartArbWithdrawType, Dialog> value;
        Map mapIsConnected;
        Object next;
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseOLrzqt = this.copydefault.getValue().OLrzqt();
        int i = FragmentManager.OLrzqt[smartArbWithdrawType.ordinal()];
        String strAYXKKw = null;
        if (i == 1) {
            SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseOLrzqt2 = this.copydefault.getValue().OLrzqt();
            if (smartArbWithdrawProfitResponseOLrzqt2 != null && (arbitrageProfit = smartArbWithdrawProfitResponseOLrzqt2.getArbitrageProfit()) != null) {
                withdrawable = arbitrageProfit.getWithdrawable();
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ProfitDetailResponse[] profitDetailResponseArr = new ProfitDetailResponse[2];
            profitDetailResponseArr[0] = smartArbWithdrawProfitResponseOLrzqt != null ? smartArbWithdrawProfitResponseOLrzqt.getStakingProfit() : null;
            profitDetailResponseArr[1] = smartArbWithdrawProfitResponseOLrzqt != null ? smartArbWithdrawProfitResponseOLrzqt.getAutoStakingProfit() : null;
            Iterator it = yDY.valueOf(profitDetailResponseArr).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((ProfitDetailResponse) next).getCcy(), (Object) str2)) {
                        break;
                    }
                }
            }
            ProfitDetailResponse profitDetailResponse = (ProfitDetailResponse) next;
            withdrawable = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
        }
        if (withdrawable == null) {
            return;
        }
        if (str.length() != 0) {
            if (C33129mqd.OLrzqt((Object) C33129mqd.EZpvd(str), (Object) 0)) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.OijiEz);
            } else if (C33129mqd.AEQbTJ(C33129mqd.EZpvd(str), C33129mqd.EZpvd(withdrawable))) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.dPkBzA);
            }
        }
        MutableStateFlow<Map<SmartArbWithdrawType, Dialog>> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
            mapIsConnected = C56424yEw.isConnected(value);
            mapIsConnected.put(smartArbWithdrawType, Dialog.OLrzqt(Dialog.EZpvd(str, strAYXKKw)));
        } while (!mutableStateFlow.compareAndSet(value, C56424yEw.values(mapIsConnected)));
        if (strAYXKKw == null) {
            OLrzqt(smartArbWithdrawType, str);
        }
    }

    public final Job OLrzqt(SmartArbWithdrawType smartArbWithdrawType, String str) {
        return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new SmartArbWithdrawProfitsViewModel$fetchLiquidationPrice$1(this, str, smartArbWithdrawType, null), 2, null);
    }

    public final Job EZpvd() {
        return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new SmartArbWithdrawProfitsViewModel$fetchProfitsInfo$1(this, null), 2, null);
    }

    public final Job DbNXlk() {
        return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new SmartArbWithdrawProfitsViewModel$withdrawProfits$1(this, null), 2, null);
    }

    public interface StateListAnimator {

        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription KWHzl = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0663StateListAnimator implements StateListAnimator {
            public final SmartArbWithdrawType AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0663StateListAnimator copy$default(C0663StateListAnimator c0663StateListAnimator, SmartArbWithdrawType smartArbWithdrawType, int i, Object obj) {
                if ((i & 1) != 0) {
                    smartArbWithdrawType = c0663StateListAnimator.AEQbTJ;
                }
                return c0663StateListAnimator.AEQbTJ(smartArbWithdrawType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0663StateListAnimator AEQbTJ(@NotNull SmartArbWithdrawType smartArbWithdrawType) {
                Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
                return new C0663StateListAnimator(smartArbWithdrawType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SmartArbWithdrawType EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0663StateListAnimator) && this.AEQbTJ == ((C0663StateListAnimator) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SelectType(type=" + this.AEQbTJ + ")";
            }

            public C0663StateListAnimator(@NotNull SmartArbWithdrawType smartArbWithdrawType) {
                Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
                this.AEQbTJ = smartArbWithdrawType;
            }
        }

        public static final class Dialog implements StateListAnimator {
            public static final Dialog OLrzqt = new Dialog();

            private Dialog() {
            }
        }

        public static final class ActionBar implements StateListAnimator {
            public String AEQbTJ;
            public final String EZpvd;
            public final SmartArbWithdrawType OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SmartArbWithdrawType smartArbWithdrawType, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    smartArbWithdrawType = actionBar.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str = actionBar.EZpvd;
                }
                if ((i & 4) != 0) {
                    str2 = actionBar.AEQbTJ;
                }
                return actionBar.KWHzl(smartArbWithdrawType, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull SmartArbWithdrawType smartArbWithdrawType, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ActionBar(smartArbWithdrawType, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SmartArbWithdrawType copydefault() {
                return this.OLrzqt;
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
                return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "HandleInputAmountChange(type=" + this.OLrzqt + ", inputAmount=" + this.EZpvd + ", profitCcy=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull SmartArbWithdrawType smartArbWithdrawType, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = smartArbWithdrawType;
                this.EZpvd = str;
                this.AEQbTJ = str2;
            }
        }

        public static final class FragmentManager implements StateListAnimator {
            public static final FragmentManager copydefault = new FragmentManager();

            private FragmentManager() {
            }
        }

        public static final class Activity implements StateListAnimator {
            public static final Activity EZpvd = new Activity();

            private Activity() {
            }
        }

        public static final class Application implements StateListAnimator {
            public static final Application OLrzqt = new Application();

            private Application() {
            }
        }
    }

    public interface Application {

        public static final class TaskDescription implements Application {
            public final String AEQbTJ;
            public final Pair<? extends String, ? extends String> copydefault;

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 kotlin.Pair), (r2v0 java.lang.String) A[MD:(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Application.TaskDescription.<init>(kotlin.Pair, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(Pair pair, String str, DefaultConstructorMarker defaultConstructorMarker) {
                this(pair, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$Application$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: copy-uRw8rZc$default, reason: not valid java name */
            public static /* synthetic */ TaskDescription m7102copyuRw8rZc$default(TaskDescription taskDescription, Pair pair, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    pair = taskDescription.copydefault;
                }
                if ((i & 2) != 0) {
                    str = taskDescription.AEQbTJ;
                }
                return taskDescription.OLrzqt(pair, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Pair<? extends String, ? extends String> AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(@NotNull Pair<? extends String, ? extends String> pair, @NotNull String str) {
                Intrinsics.checkNotNullParameter(pair, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(pair, str, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return uLP.EZpvd(this.copydefault, taskDescription.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (uLP.EZpvd(this.copydefault) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OnWithdrawProfitsSuccess(withdrawnAmount=" + uLP.gEmmrt(this.copydefault) + ", ccy=" + this.AEQbTJ + ")";
            }

            public TaskDescription(Pair<? extends String, ? extends String> pair, String str) {
                Intrinsics.checkNotNullParameter(pair, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = pair;
                this.AEQbTJ = str;
            }
        }

        public static final class StateListAnimator implements Application {
            public final Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.AEQbTJ, ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "OnWithdrawProfitsError(error=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }

        public static final class Activity implements Application {
            public static final Activity copydefault = new Activity();

            private Activity() {
            }
        }

        public static final class LoaderManager implements Application {
            public static final LoaderManager OLrzqt = new LoaderManager();

            private LoaderManager() {
            }
        }

        public static final class ActionBar implements Application {
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
                return actionBar.EZpvd(actionBar2, actionBar3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull C52912wba.ActionBar actionBar, @NotNull C52912wba.ActionBar actionBar2) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                Intrinsics.checkNotNullParameter(actionBar2, "");
                return new ActionBar(actionBar, actionBar2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52912wba.ActionBar KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52912wba.ActionBar OLrzqt() {
                return this.EZpvd;
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
                return "ShowCurrentStakeProfitDialog(info=" + this.EZpvd + ", autoInfo=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull C52912wba.ActionBar actionBar, @NotNull C52912wba.ActionBar actionBar2) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                Intrinsics.checkNotNullParameter(actionBar2, "");
                this.EZpvd = actionBar;
                this.AEQbTJ = actionBar2;
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0662Application implements Application {
            public final C52912wba.StateListAnimator EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0662Application copy$default(C0662Application c0662Application, C52912wba.StateListAnimator stateListAnimator, int i, Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = c0662Application.EZpvd;
                }
                return c0662Application.AEQbTJ(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0662Application AEQbTJ(@NotNull C52912wba.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new C0662Application(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52912wba.StateListAnimator EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0662Application) && Intrinsics.EZpvd(this.EZpvd, ((C0662Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowCurrentArbitrageProfitDialog(info=" + this.EZpvd + ")";
            }

            public C0662Application(@NotNull C52912wba.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.EZpvd = stateListAnimator;
            }
        }
    }

    public static final class PendingIntent {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final int AhwBna;
        public final SmartArbWithdrawType EZpvd;
        public final boolean KWHzl;
        public final String OLrzqt;
        public final List<Object> copydefault;
        public final String djBIcL;
        public final Pair<? extends String, ? extends String> gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType)
  (r2v0 java.util.List)
  (r3v0 kotlin.Pair)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 boolean)
  (r8v0 int)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
 A[MD:(com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType, java.util.List<? extends java.lang.Object>, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String):void (m)] call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.PendingIntent.<init>(com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType, java.util.List, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ PendingIntent(SmartArbWithdrawType smartArbWithdrawType, List list, Pair pair, String str, String str2, String str3, boolean z, int i, String str4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
            this(smartArbWithdrawType, list, pair, str, str2, str3, z, i, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PendingIntent AEQbTJ(@NotNull SmartArbWithdrawType smartArbWithdrawType, @NotNull List<? extends Object> list, @NotNull Pair<? extends String, ? extends String> pair, @NotNull String str, String str2, String str3, boolean z, int i, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new PendingIntent(smartArbWithdrawType, list, pair, str, str2, str3, z, i, str4, str5, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartArbWithdrawType AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Object> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return this.EZpvd == pendingIntent.EZpvd && Intrinsics.EZpvd(this.copydefault, pendingIntent.copydefault) && uLP.EZpvd(this.gEmmrt, pendingIntent.gEmmrt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) pendingIntent.djBIcL) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) pendingIntent.OLrzqt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) pendingIntent.valueOf) && this.KWHzl == pendingIntent.KWHzl && this.AhwBna == pendingIntent.AhwBna && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) pendingIntent.AYXKKw) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) pendingIntent.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<? extends String, ? extends String> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iEZpvd = uLP.EZpvd(this.gEmmrt);
            int iHashCode3 = this.djBIcL.hashCode();
            String str = this.OLrzqt;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.valueOf;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iEZpvd) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Integer.hashCode(this.AhwBna)) * 31) + this.AYXKKw.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiModel(currentSelectedType=" + this.EZpvd + ", detailsList=" + this.copydefault + ", maxWithdrawalAmount=" + uLP.gEmmrt(this.gEmmrt) + ", maxWithdrawalAmountCcy=" + this.djBIcL + ", inputContent=" + this.OLrzqt + ", inputErrorMessage=" + this.valueOf + ", displayNoProfitError=" + this.KWHzl + ", inputMaxPrecision=" + this.AhwBna + ", stakingProfitCcy=" + this.AYXKKw + ", autoStakingProfitCcy=" + this.AEQbTJ + ")";
        }

        public PendingIntent(SmartArbWithdrawType smartArbWithdrawType, List<? extends Object> list, Pair<? extends String, ? extends String> pair, String str, String str2, String str3, boolean z, int i, String str4, String str5) {
            Intrinsics.checkNotNullParameter(smartArbWithdrawType, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.EZpvd = smartArbWithdrawType;
            this.copydefault = list;
            this.gEmmrt = pair;
            this.djBIcL = str;
            this.OLrzqt = str2;
            this.valueOf = str3;
            this.KWHzl = z;
            this.AhwBna = i;
            this.AYXKKw = str4;
            this.AEQbTJ = str5;
        }

        public final boolean AYXKKw() {
            return C33129mqd.OLrzqt((CharSequence) this.OLrzqt) && this.valueOf == null && !this.KWHzl;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Object> AEQbTJ(ProfitDetailResponse profitDetailResponse, SmartArbWithdrawType smartArbWithdrawType, TickersData tickersData, String str, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3) {
        String ccy;
        ProfitDetailResponse quote;
        String strJoinToString$default;
        List listOLrzqt = C56402yEa.OLrzqt();
        int i = FragmentManager.OLrzqt[smartArbWithdrawType.ordinal()];
        if (i == 1) {
            listOLrzqt.add(new Activity.Application(C33070mpX.AYXKKw(C48033uCm.Fragment.fiXcQa), false, uLP.AEQbTJ(EZpvd(smartArbWithdrawType, profitDetailResponse, true)), 2, null));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.QFTsTN);
            String[] strArr = new String[2];
            strArr[0] = profitDetailResponse3 != null ? uLP.AEQbTJ(EZpvd(smartArbWithdrawType, profitDetailResponse3, true)) : null;
            strArr[1] = profitDetailResponse2 != null ? uLP.AEQbTJ(EZpvd(smartArbWithdrawType, profitDetailResponse2, true)) : null;
            List listValueOf = yDY.valueOf(strArr);
            List list = listValueOf.isEmpty() ^ true ? listValueOf : null;
            if (list == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " + ", null, null, 0, null, null, 62, null)) == null) {
                strJoinToString$default = "--";
            }
            listOLrzqt.add(new Activity.StateListAnimator(strAYXKKw, false, strJoinToString$default, 2, null));
        }
        listOLrzqt.add(new TacticsInsideLineItemData(0, 0, 0, 4, null));
        if (smartArbWithdrawType == SmartArbWithdrawType.Staking) {
            ccy = (profitDetailResponse == null || (quote = profitDetailResponse.getQuote()) == null) ? null : quote.getCcy();
        } else if (profitDetailResponse != null) {
            ccy = profitDetailResponse.getCcy();
        }
        int i2 = C48033uCm.Fragment.UfveVb;
        if (ccy == null) {
            ccy = "";
        }
        String strCopydefault = C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy)));
        String last = tickersData != null ? tickersData.getLast() : null;
        if (last == null) {
            last = "";
        }
        listOLrzqt.add(new Activity.ActionBar(strCopydefault, false, AEQbTJ(last)));
        listOLrzqt.add(new Activity.C0661Activity(C33070mpX.AYXKKw(C48033uCm.Fragment.hfdhUn), false, AEQbTJ(str != null ? str : ""), 2, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    private final String AEQbTJ(String str) {
        if (str.length() == 0) {
            return "--";
        }
        xMR xmr = xMR.copydefault;
        xMS xmsFARcdN = fARcdN();
        String strAhwBna = xmsFARcdN != null ? xmsFARcdN.AhwBna(str) : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        xMS xmsFARcdN2 = fARcdN();
        return xmr.AEQbTJ(strAhwBna, C33129mqd.AhwBna(xmsFARcdN2 != null ? xmsFARcdN2.AEQbTJ() : null));
    }

    public final Pair<? extends String, ? extends String> EZpvd(SmartArbWithdrawType smartArbWithdrawType, ProfitDetailResponse profitDetailResponse, boolean z) {
        String withdrawable;
        ProfitDetailResponse quote;
        if (smartArbWithdrawType == SmartArbWithdrawType.Staking) {
            String strKWHzl = C53418wlC.KWHzl(new C56034xvG(profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null, (profitDetailResponse == null || (quote = profitDetailResponse.getQuote()) == null) ? null : quote.getWithdrawable(), profitDetailResponse != null ? profitDetailResponse.getCcy() : null).KWHzl(false, z));
            withdrawable = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
            return uLP.EZpvd(strKWHzl, withdrawable != null ? withdrawable : "");
        }
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        String withdrawable2 = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
        String smartArbProfit$default = C56051xvX.getSmartArbProfit$default(c56051xvX, withdrawable2 == null ? "" : withdrawable2, ejfBZ(), false, false, 8, null);
        if (z) {
            String ccy = profitDetailResponse != null ? profitDetailResponse.getCcy() : null;
            if (ccy == null) {
                ccy = "";
            }
            smartArbProfit$default = pTD.AEQbTJ(smartArbProfit$default, ccy);
        }
        String strKWHzl2 = C53418wlC.KWHzl(smartArbProfit$default);
        withdrawable = profitDetailResponse != null ? profitDetailResponse.getWithdrawable() : null;
        return uLP.EZpvd(strKWHzl2, withdrawable != null ? withdrawable : "");
    }

    public final void fetchVPNInfo() {
        SmartArbProfitsInfo smartArbProfitsInfo;
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseOLrzqt = this.copydefault.getValue().OLrzqt();
        if (smartArbWithdrawProfitResponseOLrzqt == null) {
            return;
        }
        ProfitDetailResponse stakingProfit = smartArbWithdrawProfitResponseOLrzqt.getStakingProfit();
        if (stakingProfit == null) {
            stakingProfit = new ProfitDetailResponse((String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, 127, (DefaultConstructorMarker) null);
        }
        ProfitDetailResponse autoStakingProfit = smartArbWithdrawProfitResponseOLrzqt.getAutoStakingProfit();
        if (autoStakingProfit == null) {
            TacticsData tacticsDataHDKMBd = hDKMBd();
            autoStakingProfit = (tacticsDataHDKMBd == null || (smartArbProfitsInfo = tacticsDataHDKMBd.getSmartArbProfitsInfo()) == null) ? null : smartArbProfitsInfo.getAutoStakingProfit();
            if (autoStakingProfit == null) {
                autoStakingProfit = new ProfitDetailResponse((String) null, (String) null, (String) null, (String) null, (String) null, (ProfitDetailResponse) null, (String) null, 127, (DefaultConstructorMarker) null);
            }
        }
        C52912wba c52912wba = C52912wba.copydefault;
        EZpvd(new Application.ActionBar(c52912wba.KWHzl(stakingProfit, ejfBZ()), c52912wba.KWHzl(autoStakingProfit, ejfBZ())));
    }

    public final void AkhnZx() {
        ProfitDetailResponse arbitrageProfit;
        SmartArbWithdrawProfitResponse smartArbWithdrawProfitResponseOLrzqt = this.copydefault.getValue().OLrzqt();
        if (smartArbWithdrawProfitResponseOLrzqt == null || (arbitrageProfit = smartArbWithdrawProfitResponseOLrzqt.getArbitrageProfit()) == null) {
            return;
        }
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        EZpvd(new Application.C0662Application(new C52912wba.StateListAnimator(C56051xvX.getSmartArbProfit$default(c56051xvX, arbitrageProfit.getTotal(), ejfBZ(), false, false, 8, null), C56051xvX.getSmartArbProfit$default(c56051xvX, arbitrageProfit.getWithdrawable(), ejfBZ(), false, false, 8, null), C56051xvX.getSmartArbProfit$default(c56051xvX, arbitrageProfit.getWithdrawn(), ejfBZ(), false, false, 8, null), arbitrageProfit.getCcy())));
    }

    public final class TaskDescription extends AbstractC55737xpb {
        public final /* synthetic */ SmartArbWithdrawProfitsViewModel copydefault;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel, java.lang.String, java.lang.String, boolean):void (m)] (LINE:614) call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.TaskDescription.<init>(com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ TaskDescription(SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(smartArbWithdrawProfitsViewModel, str, str2, (i & 4) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull SmartArbWithdrawProfitsViewModel smartArbWithdrawProfitsViewModel, @NotNull String str, String str2, boolean z) {
            super(str, str2, z);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = smartArbWithdrawProfitsViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(@NotNull List<TickersData> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData != null) {
                this.copydefault.djBIcL.tryEmit(tickersData);
            } else {
                this.copydefault.djBIcL.tryEmit(null);
            }
        }
    }

    public final void copydefault() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(uzCIH());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new SmartArbWithdrawProfitsViewModel$connectWsTasks$1(this, null), 2, null);
    }

    public static final class Dialog {
        public final Pair<String, String> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int EZpvd(Pair<? extends String, ? extends String> pair) {
            return pair.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ Dialog OLrzqt(Pair pair) {
            return new Dialog(pair);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean OLrzqt(Pair<? extends String, ? extends String> pair, Object obj) {
            return (obj instanceof Dialog) && Intrinsics.EZpvd(pair, ((Dialog) obj).KWHzl());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Pair<? extends String, ? extends String> copydefault(@NotNull Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return pair;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String gEmmrt(Pair<? extends String, ? extends String> pair) {
            return "InputContent(pair=" + pair + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ Pair KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            return OLrzqt(this.EZpvd, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return EZpvd(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return gEmmrt(this.EZpvd);
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Dialog.OLrzqt(kotlin.Pair):com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$Dialog] */
        public /* synthetic */ Dialog(Pair pair) {
            this.EZpvd = pair;
        }

        public static Pair<? extends String, ? extends String> EZpvd(String str, String str2) {
            return copydefault(C56390yDp.OLrzqt(str, str2));
        }

        public static final String KWHzl(Pair<? extends String, ? extends String> pair) {
            return pair.getFirst();
        }

        public static final String AEQbTJ(Pair<? extends String, ? extends String> pair) {
            return pair.getSecond();
        }
    }

    public interface Activity {
        boolean EZpvd();

        String KWHzl();

        String copydefault();

        public static final class Application implements Activity {
            public final String KWHzl;
            public final String OLrzqt;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.KWHzl;
                }
                if ((i & 2) != 0) {
                    z = application.copydefault;
                }
                if ((i & 4) != 0) {
                    str2 = application.OLrzqt;
                }
                return application.AEQbTJ(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public boolean EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && this.copydefault == application.copydefault && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) application.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WithdrawableArbProfit(labelText=" + this.KWHzl + ", labelClickable=" + this.copydefault + ", valueText=" + this.OLrzqt + ")";
            }

            public Application(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.KWHzl = str;
                this.copydefault = z;
                this.OLrzqt = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:653) call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity.Application.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ Application(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z, str2);
            }
        }

        public static final class StateListAnimator implements Activity {
            public final boolean EZpvd;
            public final String KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.OLrzqt;
                }
                if ((i & 2) != 0) {
                    z = stateListAnimator.EZpvd;
                }
                if ((i & 4) != 0) {
                    str2 = stateListAnimator.KWHzl;
                }
                return stateListAnimator.EZpvd(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new StateListAnimator(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public boolean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WithdrawableStakingProfit(labelText=" + this.OLrzqt + ", labelClickable=" + this.EZpvd + ", valueText=" + this.KWHzl + ")";
            }

            public StateListAnimator(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = str;
                this.EZpvd = z;
                this.KWHzl = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:659) call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity.StateListAnimator.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ StateListAnimator(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z, str2);
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0661Activity implements Activity {
            public final String AEQbTJ;
            public final String KWHzl;
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0661Activity copy$default(C0661Activity c0661Activity, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0661Activity.KWHzl;
                }
                if ((i & 2) != 0) {
                    z = c0661Activity.copydefault;
                }
                if ((i & 4) != 0) {
                    str2 = c0661Activity.AEQbTJ;
                }
                return c0661Activity.AEQbTJ(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0661Activity AEQbTJ(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new C0661Activity(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public boolean EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0661Activity)) {
                    return false;
                }
                C0661Activity c0661Activity = (C0661Activity) obj;
                return Intrinsics.EZpvd((Object) this.KWHzl, (Object) c0661Activity.KWHzl) && this.copydefault == c0661Activity.copydefault && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) c0661Activity.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "EstLiquidationPrice(labelText=" + this.KWHzl + ", labelClickable=" + this.copydefault + ", valueText=" + this.AEQbTJ + ")";
            }

            public C0661Activity(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.KWHzl = str;
                this.copydefault = z;
                this.AEQbTJ = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, boolean, java.lang.String):void (m)] (LINE:665) call: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity.Activity.<init>(java.lang.String, boolean, java.lang.String):void type: THIS */
            public /* synthetic */ C0661Activity(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z, str2);
            }
        }

        public static final class ActionBar implements Activity {
            public final boolean AEQbTJ;
            public final String EZpvd;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, boolean z, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    z = actionBar.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    str2 = actionBar.OLrzqt;
                }
                return actionBar.AEQbTJ(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new ActionBar(str, z, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public boolean EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel.Activity
            public String copydefault() {
                return this.OLrzqt;
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
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Default(labelText=" + this.EZpvd + ", labelClickable=" + this.AEQbTJ + ", valueText=" + this.OLrzqt + ")";
            }

            public ActionBar(@NotNull String str, boolean z, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.EZpvd = str;
                this.AEQbTJ = z;
                this.OLrzqt = str2;
            }
        }
    }
}
