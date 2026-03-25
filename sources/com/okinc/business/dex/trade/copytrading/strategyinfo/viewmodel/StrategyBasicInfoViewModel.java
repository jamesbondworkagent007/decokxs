package com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingPnLResponse;
import com.okinc.business.dex.trade.copytrading.home.data.StrategyStatus;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC20007gXl;
import o.AbstractC33073mpa;
import o.C19702gMd;
import o.C20013gXr;
import o.C25389ivm;
import o.C33129mqd;
import o.InterfaceC19701gMc;
import o.gLQ;
import o.gWG;
import o.gWI;
import o.gWJ;
import o.gWM;
import o.gWN;
import o.gWU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class StrategyBasicInfoViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<gWU> AEQbTJ;
    public final gWM AYXKKw;
    public final StateFlow<gWU> AhwBna;
    public InterfaceC19701gMc AkhnZx;
    public final C19702gMd DbNXlk;
    public final MutableSharedFlow<AbstractC20007gXl> EZpvd;
    public final gWI OLrzqt;
    public final gWJ copydefault;
    public final C20013gXr djBIcL;
    public final gWG fetchVPNInfo;
    public int gEmmrt;
    public final SharedFlow<AbstractC20007gXl> isConnected;
    public String valueOf;
    public final gWN values;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[StrategyStatus.values().length];
            try {
                iArr[StrategyStatus.Pause.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyStatus.SystemSuspended.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyStatus.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyStatus.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyStatus.Expired.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StrategyStatus.Delete.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC20007gXl> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gWU> OLrzqt() {
        return this.AhwBna;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @yCM
    public StrategyBasicInfoViewModel(@NotNull gWJ gwj, @NotNull C20013gXr c20013gXr, @NotNull gWM gwm, @NotNull C19702gMd c19702gMd, @NotNull gWG gwg, @NotNull gWN gwn, @NotNull gWI gwi) {
        Intrinsics.checkNotNullParameter(gwj, "");
        Intrinsics.checkNotNullParameter(c20013gXr, "");
        Intrinsics.checkNotNullParameter(gwm, "");
        Intrinsics.checkNotNullParameter(c19702gMd, "");
        Intrinsics.checkNotNullParameter(gwg, "");
        Intrinsics.checkNotNullParameter(gwn, "");
        Intrinsics.checkNotNullParameter(gwi, "");
        this.copydefault = gwj;
        this.djBIcL = c20013gXr;
        this.AYXKKw = gwm;
        this.DbNXlk = c19702gMd;
        this.fetchVPNInfo = gwg;
        this.values = gwn;
        this.OLrzqt = gwi;
        this.valueOf = "";
        MutableStateFlow<gWU> MutableStateFlow = StateFlowKt.MutableStateFlow(gWU.TaskDescription.OLrzqt);
        this.AEQbTJ = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<AbstractC20007gXl> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final CopyTradingPnLResponse EZpvd() {
        gWU value = this.AEQbTJ.getValue();
        gWU.Activity activity = value instanceof gWU.Activity ? (gWU.Activity) value : null;
        if (activity != null) {
            return activity.OLrzqt();
        }
        return null;
    }

    public final void gEmmrt() {
        this.AkhnZx = this.DbNXlk.EZpvd(new Function1() { // from class: o.gYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return StrategyBasicInfoViewModel.copydefault(this.KWHzl, (TeeWsOriginData) obj);
            }
        });
    }

    public static final Unit copydefault(StrategyBasicInfoViewModel strategyBasicInfoViewModel, TeeWsOriginData teeWsOriginData) {
        Intrinsics.checkNotNullParameter(teeWsOriginData, "");
        TeeWsData teeWsData = teeWsOriginData.getTeeWsData();
        if (!Intrinsics.EZpvd((Object) (teeWsData != null ? teeWsData.getStrategyId() : null), (Object) strategyBasicInfoViewModel.valueOf)) {
            return Unit.INSTANCE;
        }
        if (teeWsOriginData.getType() == TeeWsOriginData.EventType.PnlUpdated && (strategyBasicInfoViewModel.AEQbTJ.getValue() instanceof gWU.Activity)) {
            gWU value = strategyBasicInfoViewModel.AEQbTJ.getValue();
            Intrinsics.copydefault(value, "");
            CopyTradingPnLResponse copyTradingPnLResponseOLrzqt = ((gWU.Activity) value).OLrzqt();
            MutableStateFlow<gWU> mutableStateFlow = strategyBasicInfoViewModel.AEQbTJ;
            WsPnlStatDto wsPnlStatDtoAEQbTJ = strategyBasicInfoViewModel.fetchVPNInfo.AEQbTJ(teeWsOriginData);
            mutableStateFlow.setValue(new gWU.Activity(C33129mqd.gEmmrt(wsPnlStatDtoAEQbTJ != null ? wsPnlStatDtoAEQbTJ.getTotalPnlUsd() : null), copyTradingPnLResponseOLrzqt));
        } else {
            if (teeWsOriginData.getType() == TeeWsOriginData.EventType.StrategyOrderStatusChanged) {
                TeeWsData teeWsData2 = teeWsOriginData.getTeeWsData();
                if (teeWsData2 != null) {
                    StrategyStatus strategyStatusKWHzl = StrategyStatus.Companion.KWHzl(teeWsData2.getStatus());
                    if (strategyStatusKWHzl != null) {
                        TeeWsData teeWsData3 = teeWsOriginData.getTeeWsData();
                        strategyBasicInfoViewModel.KWHzl(new AbstractC20007gXl.TaskDescription("", strategyStatusKWHzl), teeWsData3 != null ? teeWsData3.getStoppedTime() : null);
                    }
                }
                return Unit.INSTANCE;
            }
            if (teeWsOriginData.getType() == TeeWsOriginData.EventType.StrategyCreateUpdate) {
                strategyBasicInfoViewModel.AEQbTJ(false);
            }
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, String str2) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyBasicInfoViewModel$subscribeCTSocket$1(this, str, str2, null), 3, null);
    }

    public final void DbNXlk() {
        InterfaceC19701gMc interfaceC19701gMc = this.AkhnZx;
        if (interfaceC19701gMc != null) {
            interfaceC19701gMc.KWHzl();
        }
        this.AkhnZx = null;
    }

    public static /* synthetic */ void loadData$default(StrategyBasicInfoViewModel strategyBasicInfoViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        strategyBasicInfoViewModel.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.AEQbTJ.setValue(gWU.TaskDescription.OLrzqt);
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyBasicInfoViewModel$loadData$1(this, null), 3, null);
    }

    public final void valueOf() {
        KWHzl(StrategyStatus.Delete);
    }

    public final void djBIcL() {
        KWHzl(StrategyStatus.Pause);
    }

    public final void copydefault() {
        KWHzl(StrategyStatus.Active);
    }

    public final void KWHzl(@NotNull StrategyStatus strategyStatus) {
        Intrinsics.checkNotNullParameter(strategyStatus, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyBasicInfoViewModel$updateOrderStatus$1(this, strategyStatus, null), 3, null);
    }

    public final Flow<Boolean> KWHzl() {
        CopyTradingPnLResponse copyTradingPnLResponseOLrzqt;
        String chainId;
        gWU value = this.AEQbTJ.getValue();
        gWU.Activity activity = value instanceof gWU.Activity ? (gWU.Activity) value : null;
        if (activity == null || (copyTradingPnLResponseOLrzqt = activity.OLrzqt()) == null || (chainId = copyTradingPnLResponseOLrzqt.getChainId()) == null) {
            return FlowKt.flow(new StrategyBasicInfoViewModel$canEditStrategy$chainId$1(null));
        }
        return FlowKt.flow(new StrategyBasicInfoViewModel$canEditStrategy$1(this, chainId, null));
    }

    public final String AhwBna() {
        gWU value = this.AEQbTJ.getValue();
        if (!(value instanceof gWU.Activity)) {
            return "";
        }
        switch (ActionBar.copydefault[((gWU.Activity) value).OLrzqt().getStrategyStatus().ordinal()]) {
            case 1:
            case 2:
                return DexTrackEventParameter.StrategyType.ONGOING_PAUSED_STRATEGY.getValue();
            case 3:
                return DexTrackEventParameter.StrategyType.ONGOING_RUNNING_STRATEGY.getValue();
            case 4:
            case 5:
            case 6:
                return DexTrackEventParameter.StrategyType.HISTORY_STRATEGY.getValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void copydefault(AbstractC20007gXl abstractC20007gXl) {
        CopyTradingPnLResponse copyTradingPnLResponseOLrzqt;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyBasicInfoViewModel$postOrderStatus$1(this, abstractC20007gXl, null), 3, null);
        if (abstractC20007gXl instanceof AbstractC20007gXl.TaskDescription) {
            gWU value = this.AEQbTJ.getValue();
            gWU.Activity activity = value instanceof gWU.Activity ? (gWU.Activity) value : null;
            CopyTradingPnLResponse copyTradingPnLResponseCopy = (activity == null || (copyTradingPnLResponseOLrzqt = activity.OLrzqt()) == null) ? null : copyTradingPnLResponseOLrzqt.copy((65455 & 1) != 0 ? copyTradingPnLResponseOLrzqt.pnlInfo : null, (65455 & 2) != 0 ? copyTradingPnLResponseOLrzqt.name : null, (65455 & 4) != 0 ? copyTradingPnLResponseOLrzqt.createTime : null, (65455 & 8) != 0 ? copyTradingPnLResponseOLrzqt.expireTime : null, (65455 & 16) != 0 ? copyTradingPnLResponseOLrzqt.stoppedTime : null, (65455 & 32) != 0 ? copyTradingPnLResponseOLrzqt.trackedWalletAddress : null, (65455 & 64) != 0 ? copyTradingPnLResponseOLrzqt.status : ((AbstractC20007gXl.TaskDescription) abstractC20007gXl).KWHzl().getStatus(), (65455 & 128) != 0 ? copyTradingPnLResponseOLrzqt.buyCount : 0, (65455 & 256) != 0 ? copyTradingPnLResponseOLrzqt.buyUsdValue : null, (65455 & 512) != 0 ? copyTradingPnLResponseOLrzqt.sellCount : 0, (65455 & 1024) != 0 ? copyTradingPnLResponseOLrzqt.sellUsdValue : null, (65455 & 2048) != 0 ? copyTradingPnLResponseOLrzqt.copyTradeStatGraphList : null, (65455 & 4096) != 0 ? copyTradingPnLResponseOLrzqt.chainName : null, (65455 & 8192) != 0 ? copyTradingPnLResponseOLrzqt.chainIcon : null, (65455 & 16384) != 0 ? copyTradingPnLResponseOLrzqt.chainId : null, (65455 & 32768) != 0 ? copyTradingPnLResponseOLrzqt.kolInfo : null);
            if (copyTradingPnLResponseCopy == null) {
                AEQbTJ(false);
                return;
            }
            MutableStateFlow<gWU> mutableStateFlow = this.AEQbTJ;
            gWU value2 = mutableStateFlow.getValue();
            gWU.Activity activity2 = value2 instanceof gWU.Activity ? (gWU.Activity) value2 : null;
            String strCopydefault = activity2 != null ? activity2.copydefault() : null;
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            mutableStateFlow.setValue(new gWU.Activity(strCopydefault, copyTradingPnLResponseCopy));
        }
    }

    public final void KWHzl(AbstractC20007gXl abstractC20007gXl, String str) {
        CopyTradingPnLResponse copyTradingPnLResponseCopy;
        CopyTradingPnLResponse copyTradingPnLResponseOLrzqt;
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new StrategyBasicInfoViewModel$postOrderStatusEndTime$1(this, abstractC20007gXl, null), 3, null);
        if (abstractC20007gXl instanceof AbstractC20007gXl.TaskDescription) {
            gWU value = this.AEQbTJ.getValue();
            gWU.Activity activity = value instanceof gWU.Activity ? (gWU.Activity) value : null;
            if (activity == null || (copyTradingPnLResponseOLrzqt = activity.OLrzqt()) == null) {
                copyTradingPnLResponseCopy = null;
            } else {
                copyTradingPnLResponseCopy = copyTradingPnLResponseOLrzqt.copy((65455 & 1) != 0 ? copyTradingPnLResponseOLrzqt.pnlInfo : null, (65455 & 2) != 0 ? copyTradingPnLResponseOLrzqt.name : null, (65455 & 4) != 0 ? copyTradingPnLResponseOLrzqt.createTime : null, (65455 & 8) != 0 ? copyTradingPnLResponseOLrzqt.expireTime : null, (65455 & 16) != 0 ? copyTradingPnLResponseOLrzqt.stoppedTime : str == null ? "" : str, (65455 & 32) != 0 ? copyTradingPnLResponseOLrzqt.trackedWalletAddress : null, (65455 & 64) != 0 ? copyTradingPnLResponseOLrzqt.status : ((AbstractC20007gXl.TaskDescription) abstractC20007gXl).KWHzl().getStatus(), (65455 & 128) != 0 ? copyTradingPnLResponseOLrzqt.buyCount : 0, (65455 & 256) != 0 ? copyTradingPnLResponseOLrzqt.buyUsdValue : null, (65455 & 512) != 0 ? copyTradingPnLResponseOLrzqt.sellCount : 0, (65455 & 1024) != 0 ? copyTradingPnLResponseOLrzqt.sellUsdValue : null, (65455 & 2048) != 0 ? copyTradingPnLResponseOLrzqt.copyTradeStatGraphList : null, (65455 & 4096) != 0 ? copyTradingPnLResponseOLrzqt.chainName : null, (65455 & 8192) != 0 ? copyTradingPnLResponseOLrzqt.chainIcon : null, (65455 & 16384) != 0 ? copyTradingPnLResponseOLrzqt.chainId : null, (65455 & 32768) != 0 ? copyTradingPnLResponseOLrzqt.kolInfo : null);
            }
            if (copyTradingPnLResponseCopy == null) {
                AEQbTJ(false);
                return;
            }
            MutableStateFlow<gWU> mutableStateFlow = this.AEQbTJ;
            gWU value2 = mutableStateFlow.getValue();
            gWU.Activity activity2 = value2 instanceof gWU.Activity ? (gWU.Activity) value2 : null;
            String strCopydefault = activity2 != null ? activity2.copydefault() : null;
            mutableStateFlow.setValue(new gWU.Activity(strCopydefault != null ? strCopydefault : "", copyTradingPnLResponseCopy));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AEQbTJ(gLQ glq) {
        return (glq instanceof gLQ.TaskDescription) || (glq instanceof gLQ.Application);
    }
}
