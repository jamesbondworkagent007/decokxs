package com.okinc.dexkline.market.features.risk_control.ui;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C34531ndo;
import o.C34533ndq;
import o.mUR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RiskControlViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<Boolean> AEQbTJ;
    public boolean AYXKKw;
    public C34533ndq AhwBna;
    public final StateFlow<Integer> AkhnZx;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Integer> KWHzl;
    public final MutableStateFlow<Boolean> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final StateFlow<Boolean> gEmmrt;
    public boolean valueOf;
    public final C34531ndo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34533ndq copydefault() {
        return this.AhwBna;
    }

    @yCM
    public RiskControlViewModel(@NotNull C34531ndo c34531ndo) {
        Intrinsics.checkNotNullParameter(c34531ndo, "");
        this.values = c34531ndo;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.KWHzl = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.EZpvd = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        this.copydefault = MutableStateFlow3;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.AEQbTJ = MutableStateFlow4;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static /* synthetic */ void fetchRiskControlBanner$default(RiskControlViewModel riskControlViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "0";
        }
        riskControlViewModel.AEQbTJ(str, str2, str3);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RiskControlViewModel$fetchRiskControlBanner$1(this, str, str2, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        mUR.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new RiskControlViewModel$queryCeDeFiRiskInfo$1(this, str, str2, str3, null), 3, null);
    }
}
