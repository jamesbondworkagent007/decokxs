package com.okinc.im.imui.messages.audio.call;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel;
import com.okinc.im.imui.messages.audio.call.model.AudioCallUIParams;
import com.okinc.im.imui.messages.audio.call.model.CallRequest;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.okimcore.model.im.AudioCallStatus;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.OKCallSession;
import com.okinc.okimcore.model.im.group.voicecall.GroupVoiceCallConfig;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
import o.AbstractC33073mpa;
import o.AbstractC37160oob;
import o.AbstractC37171oom;
import o.C33070mpX;
import o.C35399nuc;
import o.C35797oEa;
import o.C35859oGi;
import o.C35863oGm;
import o.C37169ook;
import o.C37170ool;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C59449zhJ;
import o.InterfaceC35259nru;
import o.oDI;
import o.oDT;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallViewModel extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final MutableStateFlow<StateListAnimator> AEQbTJ;
    public final MutableStateFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<Application> AhwBna;
    public final oDT AkhnZx;
    public final StateFlow<StateListAnimator> AuCTel;
    public final SharedFlow<Application> AuCTelauCTel;
    public final C37169ook AubY;
    public final StateFlow<String> DbNXlk;
    public final MutableStateFlow<String> KWHzl;
    public final MutableStateFlow<String> OLrzqt;
    public final MutableStateFlow<Boolean> copydefault;
    public final MutableStateFlow<OfficialTagInfo> djBIcL;
    public final StateFlow<GroupInfo> ejfBZ;
    public final boolean fARcdN;
    public final C35797oEa fIwbmz;
    public final C35859oGi fJNWhG;
    public final StateFlow<GroupVoiceCallData> fetchVPNInfo;
    public final MutableStateFlow<Boolean> gEmmrt;
    public final StateFlow<CallStatus> gHZMYf;
    public final StateFlow<OfficialTagInfo> getFieldNames;
    public final oDI getNewProxyInstance;
    public final C35863oGm hDKMBd;
    public final StateFlow<Long> isConnected;
    public final StateFlow<Boolean> iwGUEr;
    public final StateFlow<Boolean> uzCIH;
    public final InterfaceC35259nru valueOf;
    public final StateFlow<String> values;
    public final SavedStateHandle wlaJM;
    public final StateFlow<RelationInfo> zLjUOn;
    public final StateFlow<Boolean> zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Long> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<GroupInfo> AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AuCTel() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<GroupVoiceCallData> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> djBIcL() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> fARcdN() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CallStatus> fIwbmz() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<OfficialTagInfo> fetchVPNInfo() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isConnected() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<RelationInfo> values() {
        return this.zLjUOn;
    }

    public static final class Activity implements Flow<GroupVoiceCallData> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel$Activity$4, reason: invalid class name */
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
                OKIMAudioCallViewModel$special$$inlined$map$1$2$1 oKIMAudioCallViewModel$special$$inlined$map$1$2$1;
                GroupVoiceCallConfig groupVoiceCallConfig;
                if (continuation instanceof OKIMAudioCallViewModel$special$$inlined$map$1$2$1) {
                    oKIMAudioCallViewModel$special$$inlined$map$1$2$1 = (OKIMAudioCallViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = oKIMAudioCallViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMAudioCallViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMAudioCallViewModel$special$$inlined$map$1$2$1 = new OKIMAudioCallViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = oKIMAudioCallViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMAudioCallViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    GroupInfo groupInfo = (GroupInfo) obj;
                    GroupVoiceCallData currentCall = (groupInfo == null || (groupVoiceCallConfig = groupInfo.getGroupVoiceCallConfig()) == null) ? null : groupVoiceCallConfig.getCurrentCall();
                    oKIMAudioCallViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(currentCall, oKIMAudioCallViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super GroupVoiceCallData> flowCollector, Continuation continuation) {
            Object objCollect = this.KWHzl.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @yCM
    public OKIMAudioCallViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC35259nru interfaceC35259nru, @NotNull C37169ook c37169ook, @NotNull oDI odi, @NotNull C35863oGm c35863oGm, @NotNull C35859oGi c35859oGi, @NotNull oDT odt, @NotNull C35797oEa c35797oEa) {
        Flow<RelationInfo> flowEZpvd;
        CallRequest.OneToOne oneToOne;
        String strAEQbTJ;
        String strEZpvd;
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC35259nru, "");
        Intrinsics.checkNotNullParameter(c37169ook, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(c35859oGi, "");
        Intrinsics.checkNotNullParameter(odt, "");
        Intrinsics.checkNotNullParameter(c35797oEa, "");
        this.wlaJM = savedStateHandle;
        this.valueOf = interfaceC35259nru;
        this.AubY = c37169ook;
        this.getNewProxyInstance = odi;
        this.hDKMBd = c35863oGm;
        this.fJNWhG = c35859oGi;
        this.AkhnZx = odt;
        this.fIwbmz = c35797oEa;
        CallRequest callRequestCopydefault = copydefault();
        this.fARcdN = callRequestCopydefault != null && (!(callRequestCopydefault instanceof CallRequest.OneToOne) ? !(callRequestCopydefault instanceof CallRequest.GroupCall) || StringsKt__StringsKt.fARcdN((CharSequence) ((CallRequest.GroupCall) callRequestCopydefault).AEQbTJ()) : (strAEQbTJ = (oneToOne = (CallRequest.OneToOne) callRequestCopydefault).AEQbTJ()) == null || !(StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ) ^ true) || (strEZpvd = oneToOne.EZpvd()) == null || !(StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd) ^ true));
        AudioCallUIParams fieldNames = getFieldNames();
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(fieldNames != null ? fieldNames.KWHzl() : null);
        this.KWHzl = MutableStateFlow;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<StateListAnimator> MutableStateFlow2 = StateFlowKt.MutableStateFlow(StateListAnimator.ActionBar.copydefault);
        this.AEQbTJ = MutableStateFlow2;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow2);
        AudioCallUIParams fieldNames2 = getFieldNames();
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(fieldNames2 != null ? fieldNames2.OLrzqt() : null);
        this.OLrzqt = MutableStateFlow3;
        this.values = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<OfficialTagInfo> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow4;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.copydefault = MutableStateFlow5;
        this.iwGUEr = FlowKt.asStateFlow(MutableStateFlow5);
        this.gHZMYf = c37169ook.EZpvd();
        this.isConnected = C37170ool.AEQbTJ.AEQbTJ();
        AudioCallUIParams fieldNames3 = getFieldNames();
        MutableStateFlow<Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(Boolean.valueOf(fieldNames3 != null ? fieldNames3.AYXKKw() : true));
        this.gEmmrt = MutableStateFlow6;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow6);
        AudioCallUIParams fieldNames4 = getFieldNames();
        MutableStateFlow<Boolean> MutableStateFlow7 = StateFlowKt.MutableStateFlow(Boolean.valueOf(fieldNames4 != null ? fieldNames4.valueOf() : false));
        this.AYXKKw = MutableStateFlow7;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow7);
        String strValueOf = valueOf();
        Flow<GroupInfo> flowFlowOf = (strValueOf == null || (flowFlowOf = odi.AEQbTJ(strValueOf)) == null) ? FlowKt.flowOf((Object) null) : flowFlowOf;
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<GroupInfo> stateFlowStateIn = FlowKt.stateIn(flowFlowOf, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        this.ejfBZ = stateFlowStateIn;
        this.fetchVPNInfo = FlowKt.stateIn(new Activity(stateFlowStateIn), ViewModelKt.getViewModelScope(this), companion.getEagerly(), null);
        String strFJNWhG = fJNWhG();
        this.zLjUOn = FlowKt.stateIn((strFJNWhG == null || (flowEZpvd = c35863oGm.EZpvd(strFJNWhG)) == null) ? FlowKt.flowOf((Object) null) : flowEZpvd, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(companion, 5000L, 0L, 2, null), null);
        pUU.KWHzl("OKIMAudioCallViewModel", "init: callRequest=" + copydefault() + ", uiParams=" + getFieldNames());
        wlaJM();
        AwvSrB();
        String strFJNWhG2 = fJNWhG();
        if (strFJNWhG2 != null) {
            copydefault(strFJNWhG2);
        }
        MutableSharedFlow<Application> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default;
        this.AuCTelauCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final AudioCallUIParams getFieldNames() {
        return (AudioCallUIParams) this.wlaJM.get("key_audio_call_ui_params");
    }

    public final CallRequest copydefault() {
        return (CallRequest) this.wlaJM.get("key_audio_call_request");
    }

    public final String fJNWhG() {
        CallRequest callRequestCopydefault = copydefault();
        CallRequest.OneToOne oneToOne = callRequestCopydefault instanceof CallRequest.OneToOne ? (CallRequest.OneToOne) callRequestCopydefault : null;
        if (oneToOne == null) {
            return null;
        }
        String strAEQbTJ = oneToOne.AEQbTJ();
        if (strAEQbTJ != null) {
            String str = StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ) ^ true ? strAEQbTJ : null;
            if (str != null) {
                return str;
            }
        }
        return oneToOne.EZpvd();
    }

    public final String valueOf() {
        CallRequest callRequestCopydefault = copydefault();
        CallRequest.GroupCall groupCall = callRequestCopydefault instanceof CallRequest.GroupCall ? (CallRequest.GroupCall) callRequestCopydefault : null;
        if (groupCall != null) {
            return groupCall.AEQbTJ();
        }
        return null;
    }

    public final boolean AuCTelauCTel() {
        String strValueOf = valueOf();
        return strValueOf != null && (StringsKt__StringsKt.fARcdN((CharSequence) strValueOf) ^ true);
    }

    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        public static final class Activity extends StateListAnimator {
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SingleUser(displayName=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        public static final class Application extends StateListAnimator {
            public final String AEQbTJ;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    str2 = application.copydefault;
                }
                return application.copydefault(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Application(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TwoUsers(displayName1=" + this.AEQbTJ + ", displayName2=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.AEQbTJ = str;
                this.copydefault = str2;
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0466StateListAnimator extends StateListAnimator {
            public final int AEQbTJ;
            public final String OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0466StateListAnimator copy$default(C0466StateListAnimator c0466StateListAnimator, String str, String str2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = c0466StateListAnimator.copydefault;
                }
                if ((i2 & 2) != 0) {
                    str2 = c0466StateListAnimator.OLrzqt;
                }
                if ((i2 & 4) != 0) {
                    i = c0466StateListAnimator.AEQbTJ;
                }
                return c0466StateListAnimator.KWHzl(str, str2, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0466StateListAnimator KWHzl(@NotNull String str, @NotNull String str2, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new C0466StateListAnimator(str, str2, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0466StateListAnimator)) {
                    return false;
                }
                C0466StateListAnimator c0466StateListAnimator = (C0466StateListAnimator) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) c0466StateListAnimator.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) c0466StateListAnimator.OLrzqt) && this.AEQbTJ == c0466StateListAnimator.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "MultipleUsers(displayName1=" + this.copydefault + ", displayName2=" + this.OLrzqt + ", remainingCount=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0466StateListAnimator(@NotNull String str, @NotNull String str2, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = str;
                this.OLrzqt = str2;
                this.AEQbTJ = i;
            }
        }

        public static final class ActionBar extends StateListAnimator {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    public final boolean getNewProxyInstance() {
        return this.gHZMYf.getValue().isEnding();
    }

    public final boolean uzCIH() {
        return this.gHZMYf.getValue().isActive();
    }

    public final AudioCallStatus AYXKKw() {
        return this.valueOf.OLrzqt().getFirst();
    }

    public final OKCallSession gEmmrt() {
        return this.valueOf.OLrzqt().getSecond();
    }

    public final boolean zsXlph() {
        return AYXKKw() != AudioCallStatus.Idle;
    }

    public final void ORxRYg() {
        boolean z = !this.gEmmrt.getValue().booleanValue();
        boolean zKWHzl = this.valueOf.KWHzl(z);
        this.gEmmrt.setValue(Boolean.valueOf(zKWHzl));
        C44124sEe.imLogVoiceCall$default("ViewModel: toggleMic desired=" + z + " actual=" + zKWHzl, null, 2, null);
    }

    public final void OcIXYQ() {
        boolean z = !this.AYXKKw.getValue().booleanValue();
        boolean zAEQbTJ = this.valueOf.AEQbTJ(z);
        this.AYXKKw.setValue(Boolean.valueOf(zAEQbTJ));
        C44124sEe.imLogVoiceCall$default("ViewModel: toggleSpeaker desired=" + z + " actual=" + zAEQbTJ, null, 2, null);
    }

    public final void QKVWgx() {
        if (zsXlph()) {
            this.gEmmrt.setValue(Boolean.valueOf(this.valueOf.AEQbTJ()));
            this.AYXKKw.setValue(Boolean.valueOf(this.valueOf.copydefault()));
            C44124sEe.imLogVoiceCall$default("ViewModel: syncAudioState micEnabled=" + this.gEmmrt.getValue() + " speakerEnabled=" + this.AYXKKw.getValue(), null, 2, null);
        }
    }

    public final void EZpvd(boolean z) {
        this.valueOf.copydefault(z);
    }

    public static /* synthetic */ void hangUpCall$default(OKIMAudioCallViewModel oKIMAudioCallViewModel, String str, long j, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        oKIMAudioCallViewModel.EZpvd(str, j, z);
    }

    public final void EZpvd(@NotNull String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf.copydefault(str, Long.valueOf(j), z);
    }

    public final boolean hDKMBd() {
        AudioCallUIParams fieldNames = getFieldNames();
        if (fieldNames != null) {
            return fieldNames.EZpvd();
        }
        return false;
    }

    public final boolean zLjUOn() {
        AudioCallUIParams fieldNames = getFieldNames();
        if (fieldNames != null) {
            return fieldNames.gEmmrt();
        }
        return false;
    }

    public final boolean iwGUEr() {
        AudioCallUIParams fieldNames = getFieldNames();
        if (fieldNames != null) {
            return fieldNames.AEQbTJ();
        }
        return false;
    }

    public final boolean AubY() {
        AudioCallUIParams fieldNames = getFieldNames();
        if (fieldNames != null) {
            return fieldNames.copydefault();
        }
        return false;
    }

    public final void QOLQEE() {
        C37170ool.AEQbTJ.EZpvd();
    }

    public final SharedFlow<AbstractC37171oom> ejfBZ() {
        return this.AubY.OLrzqt();
    }

    public final void AxsJAY() {
        this.AubY.OLrzqt(AbstractC37160oob.Application.AEQbTJ);
    }

    public final void zuBGHE() {
        this.AubY.OLrzqt(AbstractC37160oob.StateListAnimator.KWHzl);
    }

    public final void gHZMYf() {
        this.AubY.OLrzqt(AbstractC37160oob.TaskDescription.EZpvd);
    }

    public final void DTwDnp() {
        this.AubY.OLrzqt(AbstractC37160oob.PendingIntent.OLrzqt);
    }

    public final void sSMYrx() {
        this.AubY.OLrzqt(AbstractC37160oob.ActionBar.copydefault);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AuCTelauCTel()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKIMAudioCallViewModel$fetchRelationInfoFromRemote$1(this, str, null), 3, null);
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0465Application extends Application {
            public static final C0465Application KWHzl = new C0465Application();

            private C0465Application() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class TaskDescription extends Application {
            public final int AEQbTJ;
            public final Throwable copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, Throwable th, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = taskDescription.AEQbTJ;
                }
                if ((i2 & 2) != 0) {
                    th = taskDescription.copydefault;
                }
                return taskDescription.OLrzqt(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription OLrzqt(int i, @NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new TaskDescription(i, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.copydefault, taskDescription.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Failed(code=" + this.AEQbTJ + ", error=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(int i, @NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = i;
                this.copydefault = th;
            }
        }
    }

    public final void KWHzl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        String strValueOf = valueOf();
        if (strValueOf == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKIMAudioCallViewModel$ringSelectedMembers$1(list, this, strValueOf, null), 3, null);
    }

    public final List<String> EZpvd() {
        List listAhwBna;
        List<GroupVoiceCallUser> activeUsers;
        GroupVoiceCallData value = this.fetchVPNInfo.getValue();
        if (value == null || (activeUsers = value.getActiveUsers()) == null) {
            listAhwBna = null;
        } else {
            listAhwBna = new ArrayList();
            Iterator<T> it = activeUsers.iterator();
            while (it.hasNext()) {
                String userUid = ((GroupVoiceCallUser) it.next()).getUserUid();
                if (userUid != null) {
                    listAhwBna.add(userUid);
                }
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        GroupVoiceCallData value2 = this.fetchVPNInfo.getValue();
        List<String> targetUids = value2 != null ? value2.getTargetUids() : null;
        if (targetUids == null) {
            targetUids = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) targetUids));
    }

    public final void wlaJM() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKIMAudioCallViewModel$observeGroupInfoChanges$1(this, null), 3, null);
    }

    public final void AwvSrB() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKIMAudioCallViewModel$observeRelationInfoChanges$1(this, null), 3, null);
    }

    public final void copydefault(GroupInfo groupInfo) {
        this.KWHzl.setValue(groupInfo.getName());
        this.OLrzqt.setValue(groupInfo.getAvatar());
        this.djBIcL.setValue(groupInfo.getOfficialTags());
        C44124sEe.imLogVoiceCall$default("ViewModel: updated UI from group info - name=" + groupInfo.getName(), null, 2, null);
    }

    public final void KWHzl(GroupVoiceCallData groupVoiceCallData) {
        Object objM7377constructorimpl;
        String startTime = groupVoiceCallData.getStartTime();
        if (startTime != null) {
            try {
                Result.Application application = Result.Companion;
                C37170ool.AEQbTJ.EZpvd(Long.parseLong(startTime));
                C44124sEe.imLogVoiceCall$default("ViewModel: started CallTimer from startTime=" + startTime, null, 2, null);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("OKIMAudioCallViewModel", "Failed to parse startTime: " + startTime, thM7380exceptionOrNullimpl);
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
        EZpvd(groupVoiceCallData);
        C44124sEe.imLogVoiceCall$default("ViewModel: updated UI from current call - state=" + groupVoiceCallData.getState(), null, 2, null);
    }

    public final void EZpvd(GroupVoiceCallData groupVoiceCallData) {
        String strValueOf = valueOf();
        if (strValueOf == null) {
            return;
        }
        List<String> targetUids = groupVoiceCallData.getTargetUids();
        if (targetUids != null && !targetUids.isEmpty()) {
            this.AEQbTJ.setValue(StateListAnimator.TaskDescription.OLrzqt);
            C44124sEe.imLogVoiceCall$default("ViewModel: subheader state = Calling (targetUids not empty)", null, 2, null);
            return;
        }
        List<GroupVoiceCallUser> listOLrzqt = OLrzqt(groupVoiceCallData);
        int size = listOLrzqt.size();
        if (size == 0) {
            QUSxYX();
            return;
        }
        if (size == 1) {
            EZpvd(strValueOf, listOLrzqt);
        } else if (size == 2) {
            copydefault(strValueOf, listOLrzqt);
        } else {
            AEQbTJ(strValueOf, listOLrzqt);
        }
    }

    public final List<GroupVoiceCallUser> OLrzqt(GroupVoiceCallData groupVoiceCallData) {
        ArrayList arrayList;
        List<GroupVoiceCallUser> activeUsers = groupVoiceCallData.getActiveUsers();
        if (activeUsers != null) {
            arrayList = new ArrayList();
            for (Object obj : activeUsers) {
                if (!Intrinsics.EZpvd((Object) ((GroupVoiceCallUser) obj).getUserUid(), (Object) C44157sFk.KWHzl())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final void QUSxYX() {
        this.AEQbTJ.setValue(StateListAnimator.ActionBar.copydefault);
        C44124sEe.imLogVoiceCall$default("ViewModel: subheader state = Hidden (no other active users)", null, 2, null);
    }

    public final void EZpvd(String str, List<GroupVoiceCallUser> list) {
        String userUid = list.get(0).getUserUid();
        if (userUid != null) {
            copydefault(str, C56402yEa.EZpvd(userUid), new Function1() { // from class: o.onK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKIMAudioCallViewModel.OLrzqt(this.KWHzl, (java.util.List) obj);
                }
            });
        } else {
            this.AEQbTJ.setValue(StateListAnimator.ActionBar.copydefault);
        }
    }

    public static final Unit OLrzqt(OKIMAudioCallViewModel oKIMAudioCallViewModel, List list) {
        StateListAnimator activity;
        Intrinsics.checkNotNullParameter(list, "");
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(list);
        MutableStateFlow<StateListAnimator> mutableStateFlow = oKIMAudioCallViewModel.AEQbTJ;
        if (str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            activity = new StateListAnimator.Activity(str);
        } else {
            activity = StateListAnimator.ActionBar.copydefault;
        }
        mutableStateFlow.setValue(activity);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OKIMAudioCallViewModel oKIMAudioCallViewModel, List list) {
        StateListAnimator application;
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<StateListAnimator> mutableStateFlow = oKIMAudioCallViewModel.AEQbTJ;
        if (list.size() != 2) {
            application = StateListAnimator.ActionBar.copydefault;
            break;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!(!StringsKt__StringsKt.fARcdN((CharSequence) it.next()))) {
                    application = StateListAnimator.ActionBar.copydefault;
                    break;
                }
            }
        }
        application = new StateListAnimator.Application((String) list.get(0), (String) list.get(1));
        mutableStateFlow.setValue(application);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(String str, final List<GroupVoiceCallUser> list) {
        List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) list, 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = listAhwBna.iterator();
        while (it.hasNext()) {
            String userUid = ((GroupVoiceCallUser) it.next()).getUserUid();
            if (userUid != null) {
                arrayList.add(userUid);
            }
        }
        if (arrayList.size() == 2) {
            copydefault(str, arrayList, new Function1() { // from class: o.onJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKIMAudioCallViewModel.KWHzl(this.OLrzqt, list, (java.util.List) obj);
                }
            });
        } else {
            this.AEQbTJ.setValue(StateListAnimator.ActionBar.copydefault);
        }
    }

    public static final Unit KWHzl(OKIMAudioCallViewModel oKIMAudioCallViewModel, List list, List list2) {
        StateListAnimator c0466StateListAnimator;
        Intrinsics.checkNotNullParameter(list2, "");
        MutableStateFlow<StateListAnimator> mutableStateFlow = oKIMAudioCallViewModel.AEQbTJ;
        if (list2.size() != 2) {
            c0466StateListAnimator = StateListAnimator.ActionBar.copydefault;
            break;
        }
        if (!list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!(!StringsKt__StringsKt.fARcdN((CharSequence) it.next()))) {
                    c0466StateListAnimator = StateListAnimator.ActionBar.copydefault;
                    break;
                }
            }
        }
        c0466StateListAnimator = new StateListAnimator.C0466StateListAnimator((String) list2.get(0), (String) list2.get(1), list.size() - 2);
        mutableStateFlow.setValue(c0466StateListAnimator);
        return Unit.INSTANCE;
    }

    public final void copydefault(String str, List<String> list, Function1<? super List<String>, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OKIMAudioCallViewModel$fetchDisplayNamesForSubheader$1(list, function1, this, str, null), 3, null);
    }

    public final void OLrzqt(RelationInfo relationInfo) {
        String strFJNWhG;
        String value = this.KWHzl.getValue();
        if (value == null || StringsKt__StringsKt.fARcdN((CharSequence) value)) {
            String displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
            MutableStateFlow<String> mutableStateFlow = this.KWHzl;
            if ((displayName$default == null || StringsKt__StringsKt.fARcdN((CharSequence) displayName$default)) && (strFJNWhG = fJNWhG()) != null && C59449zhJ.startsWith$default(strFJNWhG, "-", false, 2, null)) {
                displayName$default = C33070mpX.AYXKKw(C35399nuc.LoaderManager.gmHjFq);
            }
            mutableStateFlow.setValue(displayName$default);
        }
        String value2 = this.OLrzqt.getValue();
        if (value2 == null || StringsKt__StringsKt.fARcdN((CharSequence) value2)) {
            this.OLrzqt.setValue(relationInfo.getAvatar());
        }
        this.djBIcL.setValue(relationInfo.getOfficialTags());
        C44124sEe.imLogVoiceCall$default("ViewModel: updated UI from relation info - name=" + ((Object) this.KWHzl.getValue()), null, 2, null);
    }

    public final void copydefault(String str, List<GroupVoiceCallUser> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String userUid = ((GroupVoiceCallUser) it.next()).getUserUid();
            if (userUid != null) {
                arrayList.add(userUid);
            }
        }
        if (arrayList.size() == 2) {
            copydefault(str, arrayList, new Function1() { // from class: o.onI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKIMAudioCallViewModel.KWHzl(this.copydefault, (java.util.List) obj);
                }
            });
        } else {
            this.AEQbTJ.setValue(StateListAnimator.ActionBar.copydefault);
        }
    }
}
