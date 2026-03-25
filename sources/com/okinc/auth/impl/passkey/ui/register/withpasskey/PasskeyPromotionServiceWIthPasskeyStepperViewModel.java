package com.okinc.auth.impl.passkey.ui.register.withpasskey;

import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5763aCc;
import o.C5765aCe;
import o.C5905aFL;
import o.C5944aFy;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceWIthPasskeyStepperViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<String> AYXKKw;
    public final MutableSharedFlow<String> AhwBna;
    public final C5765aCe AkhnZx;
    public final C5905aFL AuCTel;
    public final SharedFlow<String> DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableSharedFlow<String> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final C5763aCc djBIcL;
    public final SharedFlow<String> fARcdN;
    public final SharedFlow<String> fIwbmz;
    public final SharedFlow<String> fJNWhG;
    public final C5944aFy fetchVPNInfo;
    public final MutableSharedFlow<String> gEmmrt;
    public final SharedFlow<Boolean> isConnected;
    public final SharedFlow<String> valueOf;
    public final SharedFlow<Unit> values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AhwBna() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> valueOf() {
        return this.fJNWhG;
    }

    @yCM
    public PasskeyPromotionServiceWIthPasskeyStepperViewModel(@NotNull C5905aFL c5905aFL, @NotNull C5765aCe c5765aCe, @NotNull C5763aCc c5763aCc, @NotNull C5944aFy c5944aFy) {
        Intrinsics.checkNotNullParameter(c5905aFL, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5763aCc, "");
        Intrinsics.checkNotNullParameter(c5944aFy, "");
        this.AuCTel = c5905aFL;
        this.AkhnZx = c5765aCe;
        this.djBIcL = c5763aCc;
        this.fetchVPNInfo = c5944aFy;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default4;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default6;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default7;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.register.withpasskey.PasskeyPromotionServiceWIthPasskeyStepperViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickClose$1(this, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceWIthPasskeyStepperViewModel$clickEnable$1(passkeyScenario, this, null), 3, null);
    }

    public final Job djBIcL() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceWIthPasskeyStepperViewModel$proceedMfa$1(this, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceWIthPasskeyStepperViewModel$checkMfaResult$1(this, str, null), 3, null);
    }
}
