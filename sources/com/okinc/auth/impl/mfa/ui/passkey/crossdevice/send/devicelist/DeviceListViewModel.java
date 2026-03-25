package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5772aCl;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceListViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<MfaFailure> AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final SharedFlow<MfaFailure> AhwBna;
    public final MutableSharedFlow<String> EZpvd;
    public final MutableSharedFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<AuthenticationStartResponse.AdditionalData> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final MutableStateFlow<AuthenticationStartResponse.AdditionalData> fetchVPNInfo;
    public final SharedFlow<AuthenticationStartResponse.AdditionalData> gEmmrt;
    public final C5772aCl isConnected;
    public final SharedFlow<String> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<AuthenticationStartResponse.AdditionalData> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse.AdditionalData> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> gEmmrt() {
        return this.djBIcL;
    }

    @yCM
    public DeviceListViewModel(@NotNull C5772aCl c5772aCl) {
        Intrinsics.checkNotNullParameter(c5772aCl, "");
        this.isConnected = c5772aCl;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default3;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<AuthenticationStartResponse.AdditionalData> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default4;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableStateFlow<AuthenticationStartResponse.AdditionalData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.fetchVPNInfo = MutableStateFlow;
        this.djBIcL = FlowKt.stateIn(new StateListAnimator(MutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Boolean.FALSE);
    }

    public static final class StateListAnimator implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DeviceListViewModel$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                DeviceListViewModel$special$$inlined$map$1$2$1 deviceListViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof DeviceListViewModel$special$$inlined$map$1$2$1) {
                    deviceListViewModel$special$$inlined$map$1$2$1 = (DeviceListViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = deviceListViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        deviceListViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        deviceListViewModel$special$$inlined$map$1$2$1 = new DeviceListViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = deviceListViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = deviceListViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((AuthenticationStartResponse.AdditionalData) obj) != null);
                    deviceListViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, deviceListViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final Job KWHzl(@NotNull AuthenticationStartResponse.AdditionalData additionalData) {
        Intrinsics.checkNotNullParameter(additionalData, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceListViewModel$onPageLoaded$1(additionalData, this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceListViewModel$onContinueButtonClicked$1(str, this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull AuthenticationStartResponse.AdditionalData additionalData) {
        Intrinsics.checkNotNullParameter(additionalData, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeviceListViewModel$onDeviceSelected$1(additionalData, this, null), 3, null);
    }

    public final String AEQbTJ(Long l) {
        return (l == null || l.longValue() <= 0) ? "-" : pTA.formatSimpleDate$default(new Date(l.longValue()), null, 1, null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.devicelist.DeviceListViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
