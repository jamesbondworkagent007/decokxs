package com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.mfa.model.MfaFailure;
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
import o.C5762aCb;
import o.C5772aCl;
import o.C5882aEp;
import o.InterfaceC8166axc;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationRequestViewModel extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<Integer> AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final SharedFlow<String> AkhnZx;
    public final SharedFlow<MfaFailure> DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableSharedFlow<MfaFailure> OLrzqt;
    public final StateFlow<Integer> djBIcL;
    public final InterfaceC8166axc fetchVPNInfo;
    public final StateFlow<Boolean> gEmmrt;
    public final SharedFlow<Unit> isConnected;
    public final C5762aCb valueOf;
    public final C5772aCl values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> copydefault() {
        return this.DbNXlk;
    }

    @yCM
    public VerificationRequestViewModel(@NotNull C5772aCl c5772aCl, @NotNull C5762aCb c5762aCb, @NotNull InterfaceC8166axc interfaceC8166axc) {
        Intrinsics.checkNotNullParameter(c5772aCl, "");
        Intrinsics.checkNotNullParameter(c5762aCb, "");
        Intrinsics.checkNotNullParameter(interfaceC8166axc, "");
        this.values = c5772aCl;
        this.valueOf = c5762aCb;
        this.fetchVPNInfo = interfaceC8166axc;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(60);
        this.AEQbTJ = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default4;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        this.gEmmrt = FlowKt.stateIn(new Application(MutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Boolean.FALSE);
        valueOf();
    }

    public static final class Application implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestViewModel$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                VerificationRequestViewModel$special$$inlined$map$1$2$1 verificationRequestViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof VerificationRequestViewModel$special$$inlined$map$1$2$1) {
                    verificationRequestViewModel$special$$inlined$map$1$2$1 = (VerificationRequestViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = verificationRequestViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        verificationRequestViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        verificationRequestViewModel$special$$inlined$map$1$2$1 = new VerificationRequestViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = verificationRequestViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = verificationRequestViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((Number) obj).intValue() <= 0);
                    verificationRequestViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, verificationRequestViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "on page loaded");
        EZpvd(str, str2);
    }

    public final void EZpvd(String str, String str2) {
        FlowKt.launchIn(FlowKt.onEach(this.fetchVPNInfo.AEQbTJ(), new VerificationRequestViewModel$observeVerificationStatus$1(this, str, str2, null)), ViewModelKt.getViewModelScope(this));
    }

    public final Job valueOf() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationRequestViewModel$startCountDown$1(this, null), 3, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C5882aEp.KWHzl.KWHzl("[Send verification request][Verification]", "on complete verification button clicked, challenge=" + str + ", targetCredentialId=" + str2);
        OLrzqt(str, str2);
    }

    public final Job OLrzqt(String str, String str2) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationRequestViewModel$checkVerificationResult$1(this, str, str2, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationRequestViewModel$onResendLinkClicked$1(str, str2, this, null), 3, null);
    }

    public final String copydefault(Long l) {
        return (l == null || l.longValue() <= 0) ? "-" : pTA.formatSimpleDate$default(new Date(l.longValue()), null, 1, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.passkey.crossdevice.send.verification.VerificationRequestViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
