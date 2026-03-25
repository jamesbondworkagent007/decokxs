package o;

import com.okinc.im.call.adapter.CallOrchestratorAdapter$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$acceptCall$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$acceptCallByToken$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$hangUpCall$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$isAudioCallEnable$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$joinGroupCall$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$ringGroupCallUsers$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$startAudioCall$1;
import com.okinc.im.call.adapter.CallOrchestratorAdapter$startGroupCall$1;
import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.okimcore.model.im.AudioCallStatus;
import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.OKCallSession;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.StateFlow;
import o.sNK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35255nrq implements InterfaceC35259nru {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineScope AEQbTJ;
    public final InterfaceC35234nrV EZpvd;
    public final C35217nrE KWHzl;
    public final CopyOnWriteArrayList<InterfaceC35215nrC> OLrzqt;

    /* JADX INFO: renamed from: o.nrq$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCallCommon.OKCallDisconnectedReason.values().length];
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.CANCEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.HANGUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.BUSY_LINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NETWORK_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_CANCEL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_REJECT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_BUSY_LINE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NO_RESPONSE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_ENGINE_UNSUPPORTED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NETWORK_ERROR.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public C35255nrq(@NotNull C35217nrE c35217nrE, @NotNull InterfaceC35234nrV interfaceC35234nrV) {
        Intrinsics.checkNotNullParameter(c35217nrE, "");
        Intrinsics.checkNotNullParameter(interfaceC35234nrV, "");
        this.KWHzl = c35217nrE;
        this.EZpvd = interfaceC35234nrV;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(sDN.copydefault.OLrzqt()));
        this.AEQbTJ = CoroutineScope;
        this.OLrzqt = new CopyOnWriteArrayList<>();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new CallOrchestratorAdapter$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.nrq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl(CallStateV2 callStateV2) {
        final C44455sQl c44455sQlEZpvd = C35258nrt.EZpvd(callStateV2);
        if (c44455sQlEZpvd == null) {
            return;
        }
        if (callStateV2 instanceof CallStateV2.Ringing) {
            if (((CallStateV2.Ringing) callStateV2).valueOf() == CallDirection.INCOMING) {
                copydefault("bridgeStateToEvents: Notifying onReceiveCallEvent (incoming)");
                OLrzqt(new Function1() { // from class: o.nrr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C35255nrq.KWHzl(c44455sQlEZpvd, (InterfaceC35215nrC) obj);
                    }
                });
                return;
            } else {
                copydefault("bridgeStateToEvents: Notifying onCallOutgoingEvent");
                OLrzqt(new Function1() { // from class: o.nrv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C35255nrq.gEmmrt(c44455sQlEZpvd, (InterfaceC35215nrC) obj);
                    }
                });
                return;
            }
        }
        if (callStateV2 instanceof CallStateV2.Connected) {
            copydefault("bridgeStateToEvents: Notifying onCallConnectedEvent");
            OLrzqt(new Function1() { // from class: o.nrw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35255nrq.djBIcL(c44455sQlEZpvd, (InterfaceC35215nrC) obj);
                }
            });
        } else if (callStateV2 instanceof CallStateV2.Disconnected) {
            copydefault("bridgeStateToEvents: Notifying onCallDisconnectedEvent, reason=" + ((CallStateV2.Disconnected) callStateV2).valueOf());
            OLrzqt(new Function1() { // from class: o.nrx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35255nrq.valueOf(c44455sQlEZpvd, (InterfaceC35215nrC) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(C44455sQl c44455sQl, InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        interfaceC35215nrC.AEQbTJ(c44455sQl, false);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C44455sQl c44455sQl, InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        interfaceC35215nrC.copydefault(c44455sQl);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C44455sQl c44455sQl, InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        interfaceC35215nrC.EZpvd(c44455sQl);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C44455sQl c44455sQl, InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        interfaceC35215nrC.KWHzl(c44455sQl);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35259nru
    public void AEQbTJ(@NotNull InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        this.OLrzqt.add(interfaceC35215nrC);
    }

    @Override // o.InterfaceC35259nru
    public void EZpvd(@NotNull InterfaceC35215nrC interfaceC35215nrC) {
        Intrinsics.checkNotNullParameter(interfaceC35215nrC, "");
        this.OLrzqt.remove(interfaceC35215nrC);
    }

    @Override // o.InterfaceC35259nru
    public boolean KWHzl() {
        return this.KWHzl.AEQbTJ();
    }

    @Override // o.InterfaceC35259nru
    public kotlin.Pair<AudioCallStatus, OKCallSession> OLrzqt() {
        CallStateV2 value = this.KWHzl.KWHzl().getValue();
        AudioCallStatus audioCallStatusKWHzl = C35258nrt.KWHzl(value);
        CallSessionV2 callSessionV2AEQbTJ = value.AEQbTJ();
        return C56390yDp.OLrzqt(audioCallStatusKWHzl, callSessionV2AEQbTJ != null ? C35258nrt.KWHzl(callSessionV2AEQbTJ) : null);
    }

    @Override // o.InterfaceC35259nru
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super InterfaceC35336ntR, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault("startAudioCall: conversationId=" + str + ", calleeUserId=" + str2);
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$startAudioCall$1(this, str, str2, function1, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("acceptCall: callId=" + str);
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$acceptCall$1(this, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull OKCallCommon.OKVoiceCallType oKVoiceCallType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(oKVoiceCallType, "");
        copydefault("initFromPushNotification: conversationId=" + str + ", remoteUserId=" + str3 + ", callType=" + oKVoiceCallType);
        this.KWHzl.AEQbTJ(str, str2, str3, oKVoiceCallType);
    }

    @Override // o.InterfaceC35259nru
    public void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        copydefault("acceptCallByToken: conversationId=" + str + ", meetingId=" + str4 + ", hasToken=" + (true ^ (str5 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str5))));
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$acceptCallByToken$1(str8, str2, this, str5, str6, str7, str, str3, str4, str9, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void copydefault(@NotNull java.lang.String str, java.lang.Long l, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault("hangUpCall: callId=" + str + ", duration=" + l + ", bypassWebsocket=" + z);
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$hangUpCall$1(this, z, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void copydefault(boolean z) {
        copydefault("notifyPermissionGranted: isGranted=" + z);
        if (z) {
            this.KWHzl.AYXKKw();
        }
    }

    @Override // o.InterfaceC35259nru
    public boolean KWHzl(boolean z) {
        return this.KWHzl.AEQbTJ(z);
    }

    @Override // o.InterfaceC35259nru
    public boolean AEQbTJ() {
        return this.KWHzl.OLrzqt();
    }

    @Override // o.InterfaceC35259nru
    public boolean AEQbTJ(boolean z) {
        return this.KWHzl.copydefault(z);
    }

    @Override // o.InterfaceC35259nru
    public boolean copydefault() {
        return this.KWHzl.djBIcL();
    }

    @Override // o.InterfaceC35259nru
    public void OLrzqt(boolean z) {
        this.KWHzl.copydefault(z);
    }

    @Override // o.InterfaceC35259nru
    public OKCallCommon.OKCallDisconnectedReason AEQbTJ(@NotNull OKAudioCallRecordMessage oKAudioCallRecordMessage) {
        Intrinsics.checkNotNullParameter(oKAudioCallRecordMessage, "");
        java.lang.String caller = oKAudioCallRecordMessage.getCaller();
        if (caller == null || caller.length() == 0 || C44157sFk.KWHzl(caller)) {
            return oKAudioCallRecordMessage.getReason();
        }
        OKCallCommon.OKCallDisconnectedReason reason = oKAudioCallRecordMessage.getReason();
        switch (reason == null ? -1 : ActionBar.EZpvd[reason.ordinal()]) {
            case 1:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_CANCEL;
            case 2:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_REJECT;
            case 3:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP;
            case 4:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_BUSY_LINE;
            case 5:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_NO_RESPONSE;
            case 6:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_ENGINE_UNSUPPORTED;
            case 7:
                return OKCallCommon.OKCallDisconnectedReason.REMOTE_NETWORK_ERROR;
            case 8:
                return OKCallCommon.OKCallDisconnectedReason.CANCEL;
            case 9:
                return OKCallCommon.OKCallDisconnectedReason.REJECT;
            case 10:
                return OKCallCommon.OKCallDisconnectedReason.HANGUP;
            case 11:
                return OKCallCommon.OKCallDisconnectedReason.BUSY_LINE;
            case 12:
                return OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE;
            case 13:
                return OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED;
            case 14:
                return OKCallCommon.OKCallDisconnectedReason.NETWORK_ERROR;
            default:
                return oKAudioCallRecordMessage.getReason();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35259nru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super sNK> continuation) throws java.lang.Throwable {
        CallOrchestratorAdapter$isAudioCallEnable$1 callOrchestratorAdapter$isAudioCallEnable$1;
        C35255nrq c35255nrq;
        if (continuation instanceof CallOrchestratorAdapter$isAudioCallEnable$1) {
            callOrchestratorAdapter$isAudioCallEnable$1 = (CallOrchestratorAdapter$isAudioCallEnable$1) continuation;
            int i = callOrchestratorAdapter$isAudioCallEnable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callOrchestratorAdapter$isAudioCallEnable$1.label = i - Integer.MIN_VALUE;
            } else {
                callOrchestratorAdapter$isAudioCallEnable$1 = new CallOrchestratorAdapter$isAudioCallEnable$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = callOrchestratorAdapter$isAudioCallEnable$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = callOrchestratorAdapter$isAudioCallEnable$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            copydefault("isAudioCallEnable: conversationId=" + str);
            if (Intrinsics.EZpvd((java.lang.Object) C44157sFk.KWHzl(), (java.lang.Object) str)) {
                copydefault("isAudioCallEnable: REJECTED - calling self");
                return sNK.TaskDescription.KWHzl;
            }
            InterfaceC35234nrV interfaceC35234nrV = this.EZpvd;
            callOrchestratorAdapter$isAudioCallEnable$1.L$0 = this;
            callOrchestratorAdapter$isAudioCallEnable$1.label = 1;
            objAEQbTJ = interfaceC35234nrV.AEQbTJ(str, callOrchestratorAdapter$isAudioCallEnable$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c35255nrq = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c35255nrq = (C35255nrq) callOrchestratorAdapter$isAudioCallEnable$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
                    c35255nrq.copydefault("isAudioCallEnable: REJECTED - microphone unavailable");
                    return sNK.StateListAnimator.copydefault;
                }
                c35255nrq.copydefault("isAudioCallEnable: SUCCESS - all checks passed");
                return sNK.Application.AEQbTJ;
            }
            c35255nrq = (C35255nrq) callOrchestratorAdapter$isAudioCallEnable$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        kotlin.Pair pair = (kotlin.Pair) objAEQbTJ;
        boolean zBooleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
        java.lang.String str2 = (java.lang.String) pair.component2();
        if (zBooleanValue) {
            c35255nrq.copydefault("isAudioCallEnable: REJECTED - target blocked, displayName=" + str2);
            return new sNK.Activity(str2);
        }
        InterfaceC35234nrV interfaceC35234nrV2 = c35255nrq.EZpvd;
        callOrchestratorAdapter$isAudioCallEnable$1.L$0 = c35255nrq;
        callOrchestratorAdapter$isAudioCallEnable$1.label = 2;
        objAEQbTJ = interfaceC35234nrV2.KWHzl(callOrchestratorAdapter$isAudioCallEnable$1);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        if (((java.lang.Boolean) objAEQbTJ).booleanValue()) {
        }
    }

    @Override // o.InterfaceC35259nru
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.EZpvd.KWHzl(continuation);
    }

    @Override // o.InterfaceC35259nru
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault("startGroupCall: groupId=" + str + ", targetUids=" + list.size());
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$startGroupCall$1(this, str, list, function0, function1, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void AEQbTJ(@NotNull java.lang.String str, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault("joinGroupCall: groupId=" + str);
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$joinGroupCall$1(this, str, function0, function1, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public void OLrzqt(@NotNull java.util.List<java.lang.String> list, Function1<? super InterfaceC35336ntR, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        copydefault("ringGroupCallUsers: targetUids=" + list.size());
        BuildersKt__Builders_commonKt.launch$default(this.AEQbTJ, null, null, new CallOrchestratorAdapter$ringGroupCallUsers$1(this, list, function0, function1, null), 3, null);
    }

    @Override // o.InterfaceC35259nru
    public StateFlow<C35233nrU> EZpvd() {
        return this.KWHzl.EZpvd();
    }

    public final void copydefault(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("CallOrchestratorAdapter: " + str, null, 2, null);
    }

    public final void OLrzqt(Function1<? super InterfaceC35215nrC, Unit> function1) {
        for (InterfaceC35215nrC interfaceC35215nrC : this.OLrzqt) {
            try {
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(interfaceC35215nrC);
                function1.invoke(interfaceC35215nrC);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }
}
