package com.okinc.auth.impl.passkey.ui.sync.stepper;

import androidx.lifecycle.ViewModelKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C3082AfI;
import o.C56391yDq;
import o.C56442yFn;
import o.C5765aCe;
import o.C58831zQz;
import o.InterfaceC58830zQy;
import o.pUU;
import o.yCM;
import o.yDY;
import o.zPM;
import o.zPO;
import o.zPW;
import o.zQB;
import o.zQK;
import org.jetbrains.annotations.NotNull;
import uniffi.account.SyncViolatedPrecondition;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeySyncStepperViewModel extends AbstractC33073mpa implements zQB, zPO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<List<C3082AfI>> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final InterfaceC58830zQy AkhnZx;
    public final SharedFlow<String> AuCTel;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final StateFlow<String> djBIcL;
    public final SharedFlow<String> ejfBZ;
    public final SharedFlow<Unit> fARcdN;
    public final SharedFlow<Unit> fIwbmz;
    public final SharedFlow<SyncViolatedPrecondition> fJNWhG;
    public final C5765aCe fetchVPNInfo;
    public final MutableSharedFlow<SyncViolatedPrecondition> gEmmrt;
    public final zPW isConnected;
    public final MutableSharedFlow<String> valueOf;
    public final StateFlow<List<C3082AfI>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<C3082AfI>> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> copydefault() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SyncViolatedPrecondition> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> valueOf() {
        return this.DbNXlk;
    }

    @yCM
    public PasskeySyncStepperViewModel(@NotNull InterfaceC58830zQy interfaceC58830zQy, @NotNull zPW zpw, @NotNull C5765aCe c5765aCe) {
        Intrinsics.checkNotNullParameter(interfaceC58830zQy, "");
        Intrinsics.checkNotNullParameter(zpw, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        this.AkhnZx = interfaceC58830zQy;
        this.isConnected = zpw;
        this.fetchVPNInfo = c5765aCe;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.EZpvd = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<C3082AfI>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AEQbTJ = MutableStateFlow2;
        this.values = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<SyncViolatedPrecondition> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default2;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default3;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default4;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default5;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AkhnZx() {
        pUU.KWHzl("PasskeySyncStepperViewModel", "onPageLoad: setting callbacks");
        this.isConnected.OLrzqt(this);
        this.isConnected.KWHzl(this);
    }

    public final void AhwBna() {
        pUU.KWHzl("PasskeySyncStepperViewModel", "initiate: starting sync flow");
        this.isConnected.AEQbTJ();
    }

    public final void djBIcL() {
        String value = this.OLrzqt.getValue();
        if (value == null || value.length() == 0) {
            pUU.copydefault("PasskeySyncStepperViewModel", "onGetStartedClicked: business is null or empty");
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeySyncStepperViewModel$onGetStartedClicked$1(this, null), 3, null);
            return;
        }
        pUU.KWHzl("PasskeySyncStepperViewModel", "onGetStartedClicked: creating MFA session with business=" + value);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeySyncStepperViewModel$onGetStartedClicked$2(this, value, null), 3, null);
    }

    public final void fetchVPNInfo() {
        pUU.KWHzl("PasskeySyncStepperViewModel", "onMfaSuccess: completing sync");
        this.isConnected.KWHzl();
    }

    public final void AYXKKw() {
        pUU.KWHzl("PasskeySyncStepperViewModel", "onMfaFailed");
        this.AkhnZx.AEQbTJ(new zQK.ActionBar("MFA verification failed"));
    }

    public final void values() {
        pUU.KWHzl("PasskeySyncStepperViewModel", "onSuccessOkClicked: dismissing flow");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeySyncStepperViewModel$onSuccessOkClicked$1(this, null), 3, null);
    }

    @Override // o.zQB
    public void AEQbTJ(@NotNull C58831zQz c58831zQz) {
        Intrinsics.checkNotNullParameter(c58831zQz, "");
        pUU.KWHzl("PasskeySyncStepperViewModel", "onChanged: isLoading=" + c58831zQz.copydefault() + ", devices=" + c58831zQz.AEQbTJ().size() + ", business=" + c58831zQz.EZpvd());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeySyncStepperViewModel$onChanged$1(this, c58831zQz, null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.sync.stepper.PasskeySyncStepperViewModel$onEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ zPM $event;
        int label;
        final /* synthetic */ PasskeySyncStepperViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zPM zpm, PasskeySyncStepperViewModel passkeySyncStepperViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = zpm;
            this.this$0 = passkeySyncStepperViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$event, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                zPM zpm = this.$event;
                if (zpm instanceof zPM.TaskDescription) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.valueOf;
                    String strKWHzl = ((zPM.TaskDescription) this.$event).KWHzl();
                    this.label = 1;
                    if (mutableSharedFlow.emit(strKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (zpm instanceof zPM.StateListAnimator) {
                    pUU.KWHzl("PasskeySyncStepperViewModel", "Device list updated");
                } else if (zpm instanceof zPM.Activity) {
                    MutableSharedFlow mutableSharedFlow2 = this.this$0.gEmmrt;
                    SyncViolatedPrecondition syncViolatedPreconditionAEQbTJ = ((zPM.Activity) this.$event).AEQbTJ();
                    this.label = 2;
                    if (mutableSharedFlow2.emit(syncViolatedPreconditionAEQbTJ, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.zPO
    public void onEvent(@NotNull zPM zpm) {
        Intrinsics.checkNotNullParameter(zpm, "");
        pUU.KWHzl("PasskeySyncStepperViewModel", "onEvent: " + zpm);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(zpm, this, null), 3, null);
    }
}
