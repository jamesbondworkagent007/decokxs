package com.okinc.okmarket.ui.market.remind.fragment;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.EditAlertReq;
import com.okinc.market.common.biz_spot.bean.PriceRemindAddReq;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC49411unz;
import o.C27553jxP;
import o.C33070mpX;
import o.C33129mqd;
import o.C40440qVy;
import o.C43296rmc;
import o.C46690tbt;
import o.C46806teC;
import o.C46811teH;
import o.C46854tey;
import o.C46901tfs;
import o.C56391yDq;
import o.C56442yFn;
import o.qZH;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PriceEditViewModel extends AbstractC49411unz<C46811teH> {
    public final MutableStateFlow<String> AEQbTJ;
    public final C46854tey AYXKKw;
    public String AhwBna;
    public final C46806teC EZpvd;
    public final MutableStateFlow<C46901tfs> KWHzl;
    public final StateFlow<String> OLrzqt;
    public Job copydefault;
    public int djBIcL;
    public String gEmmrt;
    public final StateFlow<C46901tfs> isConnected;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(String str) {
        this.AhwBna = str;
    }

    public final int EZpvd(int i) {
        if (i != 3) {
            if (i != 4) {
                switch (i) {
                    case 7:
                    case 9:
                    case 11:
                        break;
                    case 8:
                    case 10:
                    case 12:
                        break;
                    default:
                        return i;
                }
            }
            return 4;
        }
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> EZpvd() {
        return this.OLrzqt;
    }

    public final int KWHzl(int i, int i2) {
        if (i == 3) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return 9;
                }
                if (i2 == 2) {
                    return 11;
                }
                if (i2 == 3) {
                    return 3;
                }
            }
            return 7;
        }
        if (i != 4) {
            return i;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                return 10;
            }
            if (i2 == 2) {
                return 12;
            }
            if (i2 == 3) {
                return 4;
            }
        }
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl(int i) {
        if (i == 1 || i == 2 || i == 5) {
            return this.AhwBna;
        }
        return null;
    }

    public final int OLrzqt(int i) {
        if (i == 3 || i == 4) {
            return 3;
        }
        switch (i) {
        }
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C46901tfs> copydefault() {
        return this.isConnected;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public PriceEditViewModel(@NotNull C46854tey c46854tey, @NotNull C46806teC c46806teC) {
        super(new C46811teH(null, 1, null));
        Intrinsics.checkNotNullParameter(c46854tey, "");
        Intrinsics.checkNotNullParameter(c46806teC, "");
        this.AYXKKw = c46854tey;
        this.EZpvd = c46806teC;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C46901tfs> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C46901tfs(new AlertRemindPo(0L, 0, 0, (String) null, (String) null, 0, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, 8388607, (DefaultConstructorMarker) null), null, 2, null));
        this.KWHzl = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        this.valueOf = "";
        this.gEmmrt = "";
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt();
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PriceEditViewModel$subDexMarketPrice$1(this, str, str2, null), 3, null);
    }

    public final void OLrzqt() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void AEQbTJ(@NotNull AlertRemindPo alertRemindPo, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = 1;
        alertRemindPo.setPercentageTime(OLrzqt(alertRemindPo.getPromptType()));
        alertRemindPo.setPromptType(EZpvd(alertRemindPo.getPromptType()));
        this.KWHzl.setValue(new C46901tfs(alertRemindPo, null, 2, null));
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = 0;
        this.valueOf = str2;
        this.gEmmrt = str;
        this.KWHzl.setValue(new C46901tfs(new AlertRemindPo(0L, 0, OLrzqt(str2), str, (String) null, 5, 0, (String) null, 0L, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, 8322963, (DefaultConstructorMarker) null), null, 2, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1156=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int OLrzqt(String str) {
        switch (str.hashCode()) {
            case -2027980370:
                if (str.equals("MARGIN")) {
                    return C27553jxP.KWHzl.OLrzqt();
                }
                break;
            case -1956807563:
                if (str.equals("OPTION")) {
                    return C27553jxP.KWHzl.EZpvd();
                }
                break;
            case 2552066:
                if (str.equals("SPOT")) {
                    return C27553jxP.KWHzl.OLrzqt();
                }
                break;
            case 2558355:
                if (str.equals("SWAP")) {
                    return C27553jxP.KWHzl.AEQbTJ();
                }
                break;
            case 214415088:
                if (str.equals("FUTURES")) {
                    return C27553jxP.KWHzl.KWHzl();
                }
                break;
        }
        return C27553jxP.KWHzl.OLrzqt();
    }

    public final void AEQbTJ(int i) {
        C43296rmc.AEQbTJ("PriceRemindEditFragment", "updateAlertType() called with: promptType = " + i);
        if (i == this.KWHzl.getValue().AEQbTJ().getPromptType()) {
            return;
        }
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        while (true) {
            C46901tfs value = mutableStateFlow.getValue();
            C46901tfs c46901tfs = value;
            AlertRemindPo alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            String strKWHzl = KWHzl(i);
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            MutableStateFlow<C46901tfs> mutableStateFlow2 = mutableStateFlow;
            AlertRemindPo alertRemindPoCopy = alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : i, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : 0, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : strKWHzl, (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : null, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : 0, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : 0, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : null, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : null, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : null, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : null, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : 0);
            if (mutableStateFlow2.compareAndSet(value, c46901tfs.OLrzqt(alertRemindPoCopy, OLrzqt(alertRemindPoCopy)))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void copydefault(int i) {
        C46901tfs value;
        C46901tfs c46901tfs;
        AlertRemindPo alertRemindPoCopy;
        if (i == this.KWHzl.getValue().AEQbTJ().getPercentageTime()) {
            return;
        }
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            c46901tfs = value;
            AlertRemindPo alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            alertRemindPoCopy = alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : 0, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : 0, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : "", (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : null, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : i, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : 0, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : null, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : null, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : null, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : null, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : 0);
        } while (!mutableStateFlow.compareAndSet(value, c46901tfs.OLrzqt(alertRemindPoCopy, OLrzqt(alertRemindPoCopy))));
    }

    public final void gEmmrt(int i) {
        C43296rmc.AEQbTJ("PriceRemindEditFragment", "updateRate() called with: repeatType = " + i);
        if (i == this.KWHzl.getValue().AEQbTJ().getRepeatType()) {
            return;
        }
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        while (true) {
            C46901tfs value = mutableStateFlow.getValue();
            C46901tfs c46901tfs = value;
            AlertRemindPo alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            MutableStateFlow<C46901tfs> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, C46901tfs.copy$default(c46901tfs, alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : 0, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : i, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : null, (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : null, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : 0, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : 0, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : null, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : null, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : null, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : null, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : 0), null, 2, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C43296rmc.AEQbTJ("PriceRemindEditFragment", "updateThreshold() called with: threshold = " + str);
        if (Intrinsics.EZpvd((Object) str, (Object) this.KWHzl.getValue().AEQbTJ().getPromptThreshold())) {
            return;
        }
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        while (true) {
            C46901tfs value = mutableStateFlow.getValue();
            C46901tfs c46901tfs = value;
            AlertRemindPo alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            MutableStateFlow<C46901tfs> mutableStateFlow2 = mutableStateFlow;
            AlertRemindPo alertRemindPoCopy = alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : 0, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : 0, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : str, (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : null, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : 0, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : 0, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : null, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : null, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : null, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : null, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : 0);
            if (mutableStateFlow2.compareAndSet(value, c46901tfs.OLrzqt(alertRemindPoCopy, OLrzqt(alertRemindPoCopy)))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) this.KWHzl.getValue().AEQbTJ().getCustomMsg())) {
            return;
        }
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        while (true) {
            C46901tfs value = mutableStateFlow.getValue();
            C46901tfs c46901tfs = value;
            AlertRemindPo alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            MutableStateFlow<C46901tfs> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, C46901tfs.copy$default(c46901tfs, alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : 0, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : 0, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : null, (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : str, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : 0, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : 0, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : null, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : null, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : null, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : null, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : 0), null, 2, null))) {
                return;
            } else {
                mutableStateFlow = mutableStateFlow2;
            }
        }
    }

    public final String OLrzqt(@NotNull AlertRemindPo alertRemindPo) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        if (alertRemindPo.getPromptThreshold().length() == 0) {
            return "";
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(alertRemindPo.getPromptThreshold());
        if (dAEQbTJ == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.OLrzqt((CharSequence) alertRemindPo.getPromptThreshold())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.DPHNDa);
        }
        if (alertRemindPo.getPromptType() != 4 || dAEQbTJ < 100.0d) {
            return null;
        }
        return C33070mpX.AYXKKw(qZH.PendingIntent.RAQtXZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(int i, @NotNull TokenInfoForAlert tokenInfoForAlert, @NotNull Continuation<? super ResponseData<Unit>> continuation) throws Throwable {
        PriceEditViewModel$requestEdit$1 priceEditViewModel$requestEdit$1;
        if (continuation instanceof PriceEditViewModel$requestEdit$1) {
            priceEditViewModel$requestEdit$1 = (PriceEditViewModel$requestEdit$1) continuation;
            int i2 = priceEditViewModel$requestEdit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                priceEditViewModel$requestEdit$1.label = i2 - Integer.MIN_VALUE;
            } else {
                priceEditViewModel$requestEdit$1 = new PriceEditViewModel$requestEdit$1(this, continuation);
            }
        }
        Object objWithContext = priceEditViewModel$requestEdit$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = priceEditViewModel$requestEdit$1.label;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    C56391yDq.AEQbTJ(objWithContext);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
            Intrinsics.copydefault(objWithContext);
            return (ResponseData) objWithContext;
        }
        C56391yDq.AEQbTJ(objWithContext);
        AlertRemindPo alertRemindPoAEQbTJ = this.isConnected.getValue().AEQbTJ();
        alertRemindPoAEQbTJ.setPromptType(KWHzl(alertRemindPoAEQbTJ.getPromptType(), alertRemindPoAEQbTJ.getPercentageTime()));
        if (this.djBIcL == 0) {
            CoroutineDispatcher coroutineDispatcherAEQbTJ = C40440qVy.Companion.AEQbTJ();
            PriceEditViewModel$requestEdit$2 priceEditViewModel$requestEdit$2 = new PriceEditViewModel$requestEdit$2(this, i, alertRemindPoAEQbTJ, tokenInfoForAlert, null);
            priceEditViewModel$requestEdit$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, priceEditViewModel$requestEdit$2, priceEditViewModel$requestEdit$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            Intrinsics.copydefault(objWithContext);
            return (ResponseData) objWithContext;
        }
        CoroutineDispatcher coroutineDispatcherAEQbTJ2 = C40440qVy.Companion.AEQbTJ();
        PriceEditViewModel$requestEdit$3 priceEditViewModel$requestEdit$3 = new PriceEditViewModel$requestEdit$3(this, i, alertRemindPoAEQbTJ, null);
        priceEditViewModel$requestEdit$1.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ2, priceEditViewModel$requestEdit$3, priceEditViewModel$requestEdit$1);
        return objWithContext == objCopydefault ? objCopydefault : objWithContext;
    }

    public final EditAlertReq AEQbTJ(int i, AlertRemindPo alertRemindPo) {
        if (i == 4) {
            long ruleId = alertRemindPo.getRuleId();
            int repeatType = alertRemindPo.getRepeatType();
            String promptThreshold = alertRemindPo.getPromptThreshold();
            String customMsg = alertRemindPo.getCustomMsg();
            int timePeriod = alertRemindPo.getTimePeriod();
            return new EditAlertReq(i, ruleId, 0, repeatType, promptThreshold, customMsg, Integer.valueOf(timePeriod), alertRemindPo.getIndicatorType(), alertRemindPo.getSignalType(), alertRemindPo.getCondition1(), alertRemindPo.getCondition2(), Integer.valueOf(alertRemindPo.getPresetCondition()), 4, (DefaultConstructorMarker) null);
        }
        return new EditAlertReq(i, alertRemindPo.getRuleId(), alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), alertRemindPo.getPromptThreshold(), alertRemindPo.getCustomMsg(), (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 4032, (DefaultConstructorMarker) null);
    }

    public final PriceRemindAddReq copydefault(int i, @NotNull AlertRemindPo alertRemindPo, @NotNull TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
        if (i == 1) {
            int bizType = alertRemindPo.getBizType();
            return new PriceRemindAddReq(i, Integer.valueOf(bizType), alertRemindPo.getInstrumentName(), alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), alertRemindPo.getPromptThreshold(), alertRemindPo.getCustomMsg(), (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 130944, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new PriceRemindAddReq(i, (Integer) null, (String) null, alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), alertRemindPo.getPromptThreshold(), alertRemindPo.getCustomMsg(), tokenInfoForAlert.OLrzqt(), tokenInfoForAlert.copydefault(), (String) null, tokenInfoForAlert.AYXKKw(), (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 129542, (DefaultConstructorMarker) null);
        }
        if (i == 4) {
            int bizType2 = alertRemindPo.getBizType();
            String instrumentName = alertRemindPo.getInstrumentName();
            int repeatType = alertRemindPo.getRepeatType();
            String customMsg = alertRemindPo.getCustomMsg();
            int timePeriod = alertRemindPo.getTimePeriod();
            return new PriceRemindAddReq(i, Integer.valueOf(bizType2), instrumentName, 0, repeatType, (String) null, customMsg, (String) null, (String) null, (String) null, (String) null, Integer.valueOf(timePeriod), alertRemindPo.getIndicatorType(), alertRemindPo.getSignalType(), alertRemindPo.getCondition1(), alertRemindPo.getCondition2(), Integer.valueOf(alertRemindPo.getPresetCondition()), 1960, (DefaultConstructorMarker) null);
        }
        int bizType3 = alertRemindPo.getBizType();
        return new PriceRemindAddReq(i, Integer.valueOf(bizType3), alertRemindPo.getInstrumentName(), alertRemindPo.getPromptType(), alertRemindPo.getRepeatType(), alertRemindPo.getPromptThreshold(), alertRemindPo.getCustomMsg(), (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 130944, (DefaultConstructorMarker) null);
    }

    public final Object copydefault(int i, @NotNull Continuation<? super ResponseData<Unit>> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new PriceEditViewModel$delete$2(i, this.isConnected.getValue().AEQbTJ(), null), continuation);
    }

    public final String AEQbTJ(@NotNull AlertRemindPo alertRemindPo) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        List listGEmmrt = yDY.gEmmrt("Price", "MA5", "MA10", "MA20", "MA50", "MA100", "MA200");
        if (alertRemindPo.getPresetCondition() != 0) {
            return null;
        }
        if (listGEmmrt.contains(alertRemindPo.getCondition1()) && listGEmmrt.contains(alertRemindPo.getCondition2())) {
            return null;
        }
        return "";
    }

    public final void copydefault(@NotNull C46690tbt c46690tbt) {
        C46901tfs value;
        C46901tfs c46901tfs;
        AlertRemindPo alertRemindPoAEQbTJ;
        int iGEmmrt;
        String strAEQbTJ;
        String strKWHzl;
        String str;
        String strEZpvd;
        Intrinsics.checkNotNullParameter(c46690tbt, "");
        MutableStateFlow<C46901tfs> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            c46901tfs = value;
            alertRemindPoAEQbTJ = c46901tfs.AEQbTJ();
            iGEmmrt = c46690tbt.gEmmrt();
            strAEQbTJ = c46690tbt.AEQbTJ();
            strKWHzl = c46690tbt.KWHzl();
            String strCopydefault = c46690tbt.copydefault();
            str = strCopydefault == null ? "" : strCopydefault;
            strEZpvd = c46690tbt.EZpvd();
        } while (!mutableStateFlow.compareAndSet(value, C46901tfs.copy$default(c46901tfs, alertRemindPoAEQbTJ.copy((8388447 & 1) != 0 ? alertRemindPoAEQbTJ.ruleId : 0L, (8388447 & 2) != 0 ? alertRemindPoAEQbTJ.sourceType : 0, (8388447 & 4) != 0 ? alertRemindPoAEQbTJ.bizType : 0, (8388447 & 8) != 0 ? alertRemindPoAEQbTJ.instrumentName : null, (8388447 & 16) != 0 ? alertRemindPoAEQbTJ.displayId : null, (8388447 & 32) != 0 ? alertRemindPoAEQbTJ.promptType : 0, (8388447 & 64) != 0 ? alertRemindPoAEQbTJ.repeatType : 0, (8388447 & 128) != 0 ? alertRemindPoAEQbTJ.promptThreshold : null, (8388447 & 256) != 0 ? alertRemindPoAEQbTJ.modifyTime : 0L, (8388447 & 512) != 0 ? alertRemindPoAEQbTJ.active : 0, (8388447 & 1024) != 0 ? alertRemindPoAEQbTJ.customMsg : null, (8388447 & 2048) != 0 ? alertRemindPoAEQbTJ.chainId : null, (8388447 & 4096) != 0 ? alertRemindPoAEQbTJ.token : null, (8388447 & 8192) != 0 ? alertRemindPoAEQbTJ.tokenAddress : null, (8388447 & 16384) != 0 ? alertRemindPoAEQbTJ.chainLogoUrl : null, (8388447 & 32768) != 0 ? alertRemindPoAEQbTJ.tokenLogoUrl : null, (8388447 & 65536) != 0 ? alertRemindPoAEQbTJ.percentageTime : 0, (8388447 & 131072) != 0 ? alertRemindPoAEQbTJ.timePeriod : iGEmmrt, (8388447 & 262144) != 0 ? alertRemindPoAEQbTJ.indicatorType : strAEQbTJ, (8388447 & 524288) != 0 ? alertRemindPoAEQbTJ.signalType : strKWHzl, (8388447 & 1048576) != 0 ? alertRemindPoAEQbTJ.condition1 : str, (8388447 & 2097152) != 0 ? alertRemindPoAEQbTJ.condition2 : strEZpvd == null ? "" : strEZpvd, (8388447 & 4194304) != 0 ? alertRemindPoAEQbTJ.presetCondition : c46690tbt.OLrzqt()), null, 2, null)));
    }
}
