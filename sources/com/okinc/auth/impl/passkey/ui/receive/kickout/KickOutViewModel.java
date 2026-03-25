package com.okinc.auth.impl.passkey.ui.receive.kickout;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C5706aBY;
import o.C5882aEp;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class KickOutViewModel extends ViewModel {
    public final SharedFlow<String> AYXKKw;
    public final SharedFlow<Unit> AhwBna;
    public final SharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<String> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final SharedFlow<Boolean> gEmmrt;
    public final MutableStateFlow<String> isConnected;
    public final C5706aBY valueOf;
    public final SharedFlow<Unit> values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.values;
    }

    @yCM
    public KickOutViewModel(@NotNull C5706aBY c5706aBY) {
        Intrinsics.checkNotNullParameter(c5706aBY, "");
        this.valueOf = c5706aBY;
        this.isConnected = StateFlowKt.MutableStateFlow("");
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default4;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default5;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C5882aEp.KWHzl.KWHzl("[Receive verification request][Kick out]", "on page loaded, sessionId=" + str);
        this.isConnected.setValue(str);
    }

    public final Job copydefault(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KickOutViewModel$kickOut$1(this, fragment, null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.receive.kickout.KickOutViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
