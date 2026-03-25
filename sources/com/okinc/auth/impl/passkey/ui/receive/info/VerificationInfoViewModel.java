package com.okinc.auth.impl.passkey.ui.receive.info;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.TargetDeviceVerificationInfo;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
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
import o.C5705aBX;
import o.C5761aCa;
import o.C5770aCj;
import o.C5882aEp;
import o.pTA;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerificationInfoViewModel extends ViewModel {
    public final MutableSharedFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<Boolean> AhwBna;
    public final C5705aBX AkhnZx;
    public final SharedFlow<Unit> AuCTel;
    public final StateFlow<TargetDeviceVerificationInfo> AubY;
    public final C5761aCa DbNXlk;
    public final MutableStateFlow<Integer> EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Boolean> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final SharedFlow<Boolean> ejfBZ;
    public final SharedFlow<String> fARcdN;
    public final SharedFlow<Boolean> fIwbmz;
    public final SharedFlow<Boolean> fJNWhG;
    public final StateFlow<Boolean> fetchVPNInfo;
    public final MutableSharedFlow<String> gEmmrt;
    public final SharedFlow<Unit> getFieldNames;
    public final MutableStateFlow<String> getNewProxyInstance;
    public final SharedFlow<Boolean> hDKMBd;
    public final StateFlow<Integer> isConnected;
    public final C5770aCj iwGUEr;
    public final SharedFlow<Unit> uzCIH;
    public final MutableSharedFlow<Unit> valueOf;
    public final MutableStateFlow<TargetDeviceVerificationInfo> values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> AEQbTJ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AYXKKw() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TargetDeviceVerificationInfo> AhwBna() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> EZpvd() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> KWHzl() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> copydefault() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> gEmmrt() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> valueOf() {
        return this.fJNWhG;
    }

    @yCM
    public VerificationInfoViewModel(@NotNull C5705aBX c5705aBX, @NotNull C5770aCj c5770aCj, @NotNull C5761aCa c5761aCa) {
        Intrinsics.checkNotNullParameter(c5705aBX, "");
        Intrinsics.checkNotNullParameter(c5770aCj, "");
        Intrinsics.checkNotNullParameter(c5761aCa, "");
        this.AkhnZx = c5705aBX;
        this.iwGUEr = c5770aCj;
        this.DbNXlk = c5761aCa;
        this.getNewProxyInstance = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<TargetDeviceVerificationInfo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.values = MutableStateFlow;
        this.AubY = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default2;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default3;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default4;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default5;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default6;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default7;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default8;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(5);
        this.EZpvd = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        this.fetchVPNInfo = FlowKt.stateIn(new ActionBar(MutableStateFlow2), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Boolean.FALSE);
    }

    public static final class ActionBar implements Flow<Boolean> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoViewModel$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                VerificationInfoViewModel$special$$inlined$map$1$2$1 verificationInfoViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof VerificationInfoViewModel$special$$inlined$map$1$2$1) {
                    verificationInfoViewModel$special$$inlined$map$1$2$1 = (VerificationInfoViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = verificationInfoViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        verificationInfoViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        verificationInfoViewModel$special$$inlined$map$1$2$1 = new VerificationInfoViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = verificationInfoViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = verificationInfoViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((Number) obj).intValue() <= 0);
                    verificationInfoViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, verificationInfoViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C5882aEp.KWHzl.KWHzl("[Receive verification request][Info]", "on page loaded, sessionId=" + str);
        this.getNewProxyInstance.setValue(str);
        KWHzl(str);
        isConnected();
    }

    public final Job KWHzl(String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationInfoViewModel$loadTargetDeviceVerificationInfo$1(this, str, null), 3, null);
    }

    public final Job isConnected() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationInfoViewModel$startCountdownForApproveButton$1(this, null), 3, null);
    }

    public final Job copydefault(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationInfoViewModel$onApproveButtonClicked$1(this, fragment, null), 3, null);
    }

    public final Job values() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerificationInfoViewModel$onRejectButtonClicked$1(this, null), 3, null);
    }

    public final String EZpvd(Long l) {
        return (l == null || l.longValue() <= 0) ? "-" : pTA.formatSimpleDateTime$default(new Date(l.longValue()), null, 1, null);
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new VerificationInfoViewModel$onClosed$1(this, null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.receive.info.VerificationInfoViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
