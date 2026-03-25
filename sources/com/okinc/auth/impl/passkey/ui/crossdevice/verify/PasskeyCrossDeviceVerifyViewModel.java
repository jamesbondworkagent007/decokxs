package com.okinc.auth.impl.passkey.ui.crossdevice.verify;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyActivity;
import com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C58893zTh;
import o.InterfaceC56387yDm;
import o.InterfaceC58858zRz;
import o.InterfaceC8166axc;
import o.pUU;
import o.yCM;
import o.zQQ;
import o.zQT;
import o.zRL;
import o.zRO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyCrossDeviceVerifyViewModel extends AbstractC33073mpa implements zRO, zQT {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final String copydefault = "PasskeyCrossDeviceVerifyViewModel";
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC58858zRz AhwBna;
    public boolean AkhnZx;
    public final SharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableSharedFlow<zRL> djBIcL;
    public final SharedFlow<Unit> fARcdN;
    public final SharedFlow<zQQ> fIwbmz;
    public final SharedFlow<zRL> fJNWhG;
    public final InterfaceC8166axc fetchVPNInfo;
    public final SharedFlow<Unit> gEmmrt;
    public final SavedStateHandle isConnected;
    public final MutableSharedFlow<zQQ> valueOf;
    public final C58893zTh values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<zRL> AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<zQQ> gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.fARcdN;
    }

    @yCM
    public PasskeyCrossDeviceVerifyViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC58858zRz interfaceC58858zRz, @NotNull InterfaceC8166axc interfaceC8166axc, @NotNull C58893zTh c58893zTh) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC58858zRz, "");
        Intrinsics.checkNotNullParameter(interfaceC8166axc, "");
        Intrinsics.checkNotNullParameter(c58893zTh, "");
        this.isConnected = savedStateHandle;
        this.AhwBna = interfaceC58858zRz;
        this.fetchVPNInfo = interfaceC8166axc;
        this.values = c58893zTh;
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyCrossDeviceVerifyViewModel.AkhnZx(this.AEQbTJ);
            }
        });
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<zQQ> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<zRL> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default4;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default5;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final PasskeyCrossDeviceVerifyActivity.Input copydefault() {
        return (PasskeyCrossDeviceVerifyActivity.Input) this.AYXKKw.getValue();
    }

    public static final PasskeyCrossDeviceVerifyActivity.Input AkhnZx(PasskeyCrossDeviceVerifyViewModel passkeyCrossDeviceVerifyViewModel) {
        return (PasskeyCrossDeviceVerifyActivity.Input) passkeyCrossDeviceVerifyViewModel.isConnected.get("KEY_INPUT");
    }

    public final void djBIcL() {
        this.AhwBna.KWHzl(this);
        this.AhwBna.OLrzqt(this);
        FlowKt.launchIn(FlowKt.onEach(this.fetchVPNInfo.AEQbTJ(), new PasskeyCrossDeviceVerifyViewModel$onPageLoad$1(this, null)), ViewModelKt.getViewModelScope(this));
    }

    @Override // o.zRO
    public void OLrzqt(@NotNull zRL zrl) {
        Intrinsics.checkNotNullParameter(zrl, "");
        pUU.KWHzl(copydefault, "onChanged: qrCodeDeeplink=" + zrl.EZpvd() + ", isApproveButtonEnabled=" + zrl.copydefault() + ", isWaitingForApproval=" + zrl.AEQbTJ());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$onChanged$1(this, zrl, null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.crossdevice.verify.PasskeyCrossDeviceVerifyViewModel$onEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ zQQ $event;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(zQQ zqq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = zqq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PasskeyCrossDeviceVerifyViewModel.this.new AnonymousClass1(this.$event, continuation);
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
                MutableSharedFlow mutableSharedFlow = PasskeyCrossDeviceVerifyViewModel.this.valueOf;
                zQQ zqq = this.$event;
                this.label = 1;
                if (mutableSharedFlow.emit(zqq, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.zQT
    public void onEvent(@NotNull zQQ zqq) {
        Intrinsics.checkNotNullParameter(zqq, "");
        pUU.KWHzl(copydefault, "onEvent: " + zqq);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(zqq, null), 3, null);
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$startAuthFlow$1(this, null), 3, null);
    }

    public final Job values() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$startConnecting$1(this, null), 3, null);
    }

    public final Job isConnected() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$startConnected$1(this, null), 3, null);
    }

    public final Job EZpvd() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$approved$1(this, null), 3, null);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$dismiss$1(this, null), 3, null);
    }

    public final Job DbNXlk() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyCrossDeviceVerifyViewModel$onSuccessEventTrack$1(this, null), 3, null);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.AhwBna.copydefault();
    }
}
