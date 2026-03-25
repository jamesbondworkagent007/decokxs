package com.okinc.tradingbot.impl.strategy.fragment.detail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33069mpW;
import o.C33070mpX;
import o.C48033uCm;
import o.C51015vez;
import o.C52674wUd;
import o.C52675wUe;
import o.C52680wUj;
import o.C53418wlC;
import o.C55688xof;
import o.C56033xvF;
import o.C56068xvo;
import o.C56390yDp;
import o.C56423yEv;
import o.uLN;
import o.vNB;
import o.wTV;
import o.wTX;
import o.wTY;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class DcaOngoingViewModel extends uLN<ActionBar> {
    public final MutableStateFlow<vNB<StrategyResponse>> AEQbTJ;
    public final StateFlow<vNB<StrategyResponse>> AYXKKw;
    public final wTV AhwBna;
    public final wTX AkhnZx;
    public final StateFlow<vNB<StrategyPositionResponse>> DbNXlk;
    public final MutableStateFlow<vNB<StrategyPositionResponse>> EZpvd;
    public final MutableStateFlow<vNB<C51015vez>> KWHzl;
    public Set<String> OLrzqt;
    public final MutableStateFlow<vNB<List<TradeListResp>>> copydefault;
    public final CoroutineDispatcher djBIcL;
    public Job ejfBZ;
    public final C52680wUj fARcdN;
    public final StateFlow<vNB<List<TradeListResp>>> fJNWhG;
    public final C52675wUe fetchVPNInfo;
    public final StateFlow<vNB<C51015vez>> gEmmrt;
    public final C52674wUd isConnected;
    public final CoroutineDispatcher valueOf;
    public final wTY values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<C51015vez>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<StrategyResponse>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<StrategyPositionResponse>> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<vNB<List<TradeListResp>>> copydefault() {
        return this.fJNWhG;
    }

    @yCM
    public DcaOngoingViewModel(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull C52680wUj c52680wUj, @NotNull wTV wtv, @NotNull wTY wty, @NotNull wTX wtx, @NotNull C52674wUd c52674wUd, @NotNull C52675wUe c52675wUe) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(c52680wUj, "");
        Intrinsics.checkNotNullParameter(wtv, "");
        Intrinsics.checkNotNullParameter(wty, "");
        Intrinsics.checkNotNullParameter(wtx, "");
        Intrinsics.checkNotNullParameter(c52674wUd, "");
        Intrinsics.checkNotNullParameter(c52675wUe, "");
        this.djBIcL = coroutineDispatcher;
        this.valueOf = coroutineDispatcher2;
        this.fARcdN = c52680wUj;
        this.AhwBna = wtv;
        this.values = wty;
        this.AkhnZx = wtx;
        this.isConnected = c52674wUd;
        this.fetchVPNInfo = c52675wUe;
        vNB.Activity activity = vNB.Activity.copydefault;
        MutableStateFlow<vNB<StrategyPositionResponse>> MutableStateFlow = StateFlowKt.MutableStateFlow(activity);
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<vNB<C51015vez>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(activity);
        this.KWHzl = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<vNB<List<TradeListResp>>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(activity);
        this.copydefault = MutableStateFlow3;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<vNB<StrategyResponse>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(activity);
        this.AEQbTJ = MutableStateFlow4;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow4);
        this.OLrzqt = new LinkedHashSet();
    }

    public final Set<String> KWHzl() {
        return CollectionsKt___CollectionsKt.OqFWZa(this.OLrzqt);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$fetchStrategyPositions$1(this, str, null), 2, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$fetchEndCycleInfo$1(this, str, null), 2, null);
    }

    public static /* synthetic */ List getContractParamList$default(DcaOngoingViewModel dcaOngoingViewModel, StrategyPositionResponse strategyPositionResponse, String str, int i, Object obj) {
        DcaOngoingViewModel dcaOngoingViewModel2;
        String str2;
        StrategyPositionResponse strategyPositionResponse2 = (i & 1) != 0 ? new StrategyPositionResponse((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 63, (DefaultConstructorMarker) null) : strategyPositionResponse;
        if ((i & 2) != 0) {
            str2 = "";
            dcaOngoingViewModel2 = dcaOngoingViewModel;
        } else {
            dcaOngoingViewModel2 = dcaOngoingViewModel;
            str2 = str;
        }
        return dcaOngoingViewModel2.EZpvd(strategyPositionResponse2, str2);
    }

    public static final String OLrzqt(StrategyPositionResponse strategyPositionResponse, String str) {
        return C56033xvF.getBotPrice$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), str, false, false, null, null, 120, null);
    }

    public final List<TacticsInsideItemData> EZpvd(@NotNull StrategyPositionResponse strategyPositionResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(strategyPositionResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        String strKWHzl = C53418wlC.KWHzl(C56033xvF.getBotAmountUnit$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), null, null, 12, null));
        String botAmount$default = C56033xvF.getBotAmount$default(strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getPos(), null, false, null, 56, null);
        TacticsInsideItemData[] tacticsInsideItemDataArr = new TacticsInsideItemData[6];
        tacticsInsideItemDataArr[0] = new TacticsInsideItemData(C33069mpW.copydefault(C48033uCm.Fragment.aWuQzD, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strKWHzl))), botAmount$default, null, 0, 0, 0, 0, 0, null, Intrinsics.EZpvd((Object) botAmount$default, (Object) "--") ? TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl : TacticsUiConst.BotListSubItemType.BotSubPosition.KWHzl, null, null, null, null, null, null, null, 130556, null);
        tacticsInsideItemDataArr[1] = new TacticsInsideItemData(C33070mpX.AYXKKw(C48033uCm.Fragment.apNbdB), C53418wlC.KWHzl(C56033xvF.getBotLever$default(strategyPositionResponse.getActualLever(), false, 2, null)), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncherresultContract21);
        String strFmtBotPnlPercent$default = C56033xvF.fmtBotPnlPercent$default(strategyPositionResponse.getMgnRatio(), false, 0, 6, null);
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r22 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        tacticsInsideItemDataArr[2] = new TacticsInsideItemData(strAYXKKw, strFmtBotPnlPercent$default, C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl), 0, 0, 0, 0, 0, null, r22, null, null, null, null, null, null, null, 130552, null);
        tacticsInsideItemDataArr[3] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), OLrzqt(strategyPositionResponse, strategyPositionResponse.getAvgPx()), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24CallbackProxy), 0, 0, 0, 0, 0, null, r22, null, null, null, null, null, null, null, 130552, null);
        tacticsInsideItemDataArr[4] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPdNQGVJ), OLrzqt(strategyPositionResponse, strategyPositionResponse.getMarkPx()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        tacticsInsideItemDataArr[5] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy), C56068xvo.getForcedClosePrice$default(C56068xvo.copydefault, strategyPositionResponse.getInstType(), strategyPositionResponse.getInstId(), strategyPositionResponse.getLiqPx(), str, false, false, 48, null), C33070mpX.AYXKKw(C55688xof.Application.FSMca), 0, 0, 0, 0, 0, null, r22, null, null, null, null, null, null, null, 130552, null);
        return yDY.gEmmrt(tacticsInsideItemDataArr);
    }

    public static final String OLrzqt(StrategyDetailsResponse strategyDetailsResponse, String str) {
        return C56033xvF.getBotPrice$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), str, false, false, null, null, 120, null);
    }

    public final List<TacticsInsideItemData> copydefault(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        String strKWHzl = C53418wlC.KWHzl(C56033xvF.getBotAmountUnit$default(strategyDetailsResponse.getInstType(), strategyDetailsResponse.getInstId(), null, null, 12, null));
        TacticsInsideItemData[] tacticsInsideItemDataArr = new TacticsInsideItemData[3];
        String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.htlTjW, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strKWHzl)));
        String cycleBaseAmt = strategyDetailsResponse.getCycleBaseAmt();
        if (cycleBaseAmt == null) {
            cycleBaseAmt = "";
        }
        tacticsInsideItemDataArr[0] = new TacticsInsideItemData(strCopydefault, C56033xvF.fmtBotValueBySymbol$default(strKWHzl, cycleBaseAmt, null, false, null, false, null, null, null, null, null, 2044, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
        String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DAIeex);
        String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strategyDetailsResponse.getInvestmentCcy(), strategyDetailsResponse.getInvestmentAmt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r13 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        tacticsInsideItemDataArr[1] = new TacticsInsideItemData(strAYXKKw, strFmtBotValueBySymbol$default, C33070mpX.AYXKKw(C55688xof.Application.DarRvM), 0, 0, 0, 0, 0, null, r13, null, C33070mpX.AYXKKw(C55688xof.Application.DAIeex), null, null, null, null, null, 128504, null);
        tacticsInsideItemDataArr[2] = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), OLrzqt(strategyDetailsResponse, strategyDetailsResponse.getAvgPx()), C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi24CallbackProxy), 0, 0, 0, 0, 0, null, r13, null, null, null, null, null, null, null, 130552, null);
        return yDY.gEmmrt(tacticsInsideItemDataArr);
    }

    public final void EZpvd(@NotNull Lifecycle lifecycle, @NotNull String str) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (this.ejfBZ == null) {
            this.ejfBZ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.valueOf, null, new DcaOngoingViewModel$startWs$1(lifecycle, this, str, null), 2, null);
        }
    }

    public final void valueOf() {
        Job job = this.ejfBZ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.ejfBZ = null;
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$stopContractDcaCycle$1(this, str, str2, null), 2, null);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$fetchTradeList$1(this, str, str2, str3, null), 2, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.OLrzqt.contains(str)) {
            this.OLrzqt.remove(str);
        } else {
            this.OLrzqt.add(str);
        }
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$stopContractManualOrder$1(this, str, str2, null), 2, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.setValue(vNB.Activity.copydefault);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new DcaOngoingViewModel$stopSpotManualOrder$1(this, str, str2, null), 2, null);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface ActionBar {

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Activity implements ActionBar {
            public static final int OLrzqt = StrategyPositionResponse.$stable;
            public final StrategyPositionResponse EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, StrategyPositionResponse strategyPositionResponse, int i, Object obj) {
                if ((i & 1) != 0) {
                    strategyPositionResponse = activity.EZpvd;
                }
                return activity.AEQbTJ(strategyPositionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull StrategyPositionResponse strategyPositionResponse) {
                Intrinsics.checkNotNullParameter(strategyPositionResponse, "");
                return new Activity(strategyPositionResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StrategyPositionResponse OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowEndCycleDialog(resp=" + this.EZpvd + ")";
            }

            public Activity(@NotNull StrategyPositionResponse strategyPositionResponse) {
                Intrinsics.checkNotNullParameter(strategyPositionResponse, "");
                this.EZpvd = strategyPositionResponse;
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator implements ActionBar {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(String str) {
                return new StateListAnimator(str);
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
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((StateListAnimator) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.AEQbTJ;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowErrorToast(message=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(String str) {
                this.AEQbTJ = str;
            }
        }
    }
}
