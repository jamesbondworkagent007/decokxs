package o;

import android.media.AudioRecord;
import androidx.core.content.ContextCompat;
import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallType;
import com.okinc.im.call.repository.CallRepositoryImpl$acceptCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$acceptCallForNonLoginUser$2;
import com.okinc.im.call.repository.CallRepositoryImpl$acceptCallWithToken$2;
import com.okinc.im.call.repository.CallRepositoryImpl$cancelCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$checkTargetBlocked$1;
import com.okinc.im.call.repository.CallRepositoryImpl$endCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$initiateCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$isMicrophoneAvailable$1;
import com.okinc.im.call.repository.CallRepositoryImpl$isMicrophoneAvailable$2$1;
import com.okinc.im.call.repository.CallRepositoryImpl$joinChannel$2;
import com.okinc.im.call.repository.CallRepositoryImpl$joinGroupCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$leaveChannel$2;
import com.okinc.im.call.repository.CallRepositoryImpl$observeGroupVoiceCallMessages$1;
import com.okinc.im.call.repository.CallRepositoryImpl$observeWebSocketMessages$1;
import com.okinc.im.call.repository.CallRepositoryImpl$rejectCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$ringGroupCall$2;
import com.okinc.im.call.repository.CallRepositoryImpl$sendAcceptSignal$2;
import com.okinc.im.call.repository.CallRepositoryImpl$sendTerminateSignal$2;
import com.okinc.im.call.repository.CallRepositoryImpl$startGroupCall$2;
import com.okinc.okimcore.feature.group.repository.remote.InHouseIMGroupService;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi;
import com.okinc.okimcore.model.im.GroupVoiceCallData;
import com.okinc.okimcore.model.im.GroupVoiceCallUser;
import com.okinc.okimcore.model.im.OKGroupVoiceCallMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC35238nrZ;
import o.InterfaceC42569rXs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C35235nrW implements InterfaceC35234nrV {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InHouseIMCallServiceApi AEQbTJ;
    public final sKH AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final MutableSharedFlow<AbstractC35238nrZ> EZpvd;
    public final sHU KWHzl;
    public final InterfaceC42569rXs OLrzqt;
    public final C35340ntV djBIcL;
    public final InHouseIMGroupService gEmmrt;
    public final CoroutineScope isConnected;
    public final android.content.Context valueOf;

    @yCM
    public C35235nrW(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sKH skh, @NotNull InHouseIMCallServiceApi inHouseIMCallServiceApi, @NotNull C35340ntV c35340ntV, InterfaceC42569rXs interfaceC42569rXs, @NotNull InHouseIMGroupService inHouseIMGroupService, @NotNull sHU shu) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(inHouseIMCallServiceApi, "");
        Intrinsics.checkNotNullParameter(c35340ntV, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupService, "");
        Intrinsics.checkNotNullParameter(shu, "");
        this.valueOf = context;
        this.AhwBna = coroutineDispatcher;
        this.AYXKKw = skh;
        this.AEQbTJ = inHouseIMCallServiceApi;
        this.djBIcL = c35340ntV;
        this.OLrzqt = interfaceC42569rXs;
        this.gEmmrt = inHouseIMGroupService;
        this.KWHzl = shu;
        this.isConnected = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.EZpvd = SharedFlowKt.MutableSharedFlow$default(0, 16, null, 4, null);
        djBIcL();
        AYXKKw();
        valueOf();
    }

    /* JADX INFO: renamed from: o.nrW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC35234nrV
    public Flow<AbstractC35238nrZ> KWHzl() {
        return FlowKt.asSharedFlow(this.EZpvd);
    }

    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new CallRepositoryImpl$observeWebSocketMessages$1(this, null), 3, null);
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(this.isConnected, null, null, new CallRepositoryImpl$observeGroupVoiceCallMessages$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InHouseIMMessageEntity inHouseIMMessageEntity, Continuation<? super Unit> continuation) {
        java.lang.String strKWHzl;
        boolean z;
        CustomMessageData customMessage = inHouseIMMessageEntity.getCustomMessage();
        if (customMessage == null) {
            return Unit.INSTANCE;
        }
        java.lang.String bizName = customMessage.getBizName();
        java.lang.String content = customMessage.getContent();
        java.lang.String channelId = inHouseIMMessageEntity.getChannelId();
        if (channelId != null && (strKWHzl = C44157sFk.KWHzl()) != null) {
            KWHzl("processGroupVoiceCallMessage: bizName=" + bizName + ", groupId=" + channelId);
            GroupVoiceCallData groupVoiceCallData = new OKGroupVoiceCallMessage().decodeFromInHouseCustomContent(content).getGroupVoiceCallData();
            if (groupVoiceCallData == null) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_ONGOING)) {
                java.util.List<java.lang.String> targetUids = groupVoiceCallData.getTargetUids();
                if (targetUids != null) {
                    z = targetUids.contains(strKWHzl);
                }
                java.util.List<GroupVoiceCallUser> activeUsers = groupVoiceCallData.getActiveUsers();
                KWHzl("processGroupVoiceCallMessage: ONGOING - isTargeted=" + z + ", activeUsers=" + (activeUsers != null ? activeUsers.size() : 0));
                if (z) {
                    KWHzl("processGroupVoiceCallMessage: Emitting GroupCallIncoming signal");
                    MutableSharedFlow<AbstractC35238nrZ> mutableSharedFlow = this.EZpvd;
                    java.lang.String initiatorUid = groupVoiceCallData.getInitiatorUid();
                    java.util.List<GroupVoiceCallUser> activeUsers2 = groupVoiceCallData.getActiveUsers();
                    if (activeUsers2 == null) {
                        activeUsers2 = yDY.AhwBna();
                    }
                    java.util.List<java.lang.String> targetUids2 = groupVoiceCallData.getTargetUids();
                    if (targetUids2 == null) {
                        targetUids2 = yDY.AhwBna();
                    }
                    java.lang.Object objEmit = mutableSharedFlow.emit(new AbstractC35238nrZ.PendingIntent(channelId, initiatorUid, activeUsers2, targetUids2), continuation);
                    return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                }
                KWHzl("processGroupVoiceCallMessage: Emitting GroupCallParticipantsUpdated signal");
                MutableSharedFlow<AbstractC35238nrZ> mutableSharedFlow2 = this.EZpvd;
                java.util.List<GroupVoiceCallUser> activeUsers3 = groupVoiceCallData.getActiveUsers();
                if (activeUsers3 == null) {
                    activeUsers3 = yDY.AhwBna();
                }
                java.util.List<java.lang.String> historicalUids = groupVoiceCallData.getHistoricalUids();
                if (historicalUids == null) {
                    historicalUids = yDY.AhwBna();
                }
                java.util.List<java.lang.String> targetUids3 = groupVoiceCallData.getTargetUids();
                if (targetUids3 == null) {
                    targetUids3 = yDY.AhwBna();
                }
                java.lang.Object objEmit2 = mutableSharedFlow2.emit(new AbstractC35238nrZ.Dialog(channelId, activeUsers3, historicalUids, targetUids3), continuation);
                return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
            }
            if (Intrinsics.EZpvd((java.lang.Object) bizName, (java.lang.Object) OKGroupVoiceCallMessage.BIZ_NAME_AGORA_CALL_END)) {
                KWHzl("processGroupVoiceCallMessage: Emitting GroupCallEnded signal");
                java.lang.Object objEmit3 = this.EZpvd.emit(new AbstractC35238nrZ.FragmentManager(channelId), continuation);
                return objEmit3 == C56442yFn.copydefault() ? objEmit3 : Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC35238nrZ copydefault(java.lang.Integer num, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.Object objM7377constructorimpl;
        JsonPrimitive jsonPrimitive;
        java.lang.String content;
        AbstractC35238nrZ application;
        java.lang.Object objM7377constructorimpl2;
        CallType callType;
        JsonPrimitive jsonPrimitive2;
        java.lang.Long l = null;
        if (num != null && num.intValue() == 1) {
            if (z || str == null || str2 == null || str4 == null) {
                return null;
            }
            if (str3 != null) {
                try {
                    Result.Application application2 = Result.Companion;
                    JsonElement toJsonElement = Json.Default.parseToJsonElement(str3);
                    JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(toJsonElement).get((java.lang.Object) "callType");
                    java.lang.String content2 = (jsonElement == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive2.getContent();
                    boolean zContainsKey = JsonElementKt.getJsonObject(toJsonElement).containsKey((java.lang.Object) "ticketId");
                    if (Intrinsics.EZpvd((java.lang.Object) content2, (java.lang.Object) "queue") || zContainsKey) {
                        callType = CallType.QUEUE;
                    } else {
                        callType = CallType.P2P;
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(callType);
                } catch (java.lang.Throwable th) {
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                CallType callType2 = (CallType) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2);
                if (callType2 == null) {
                    callType2 = CallType.P2P;
                }
                KWHzl("convertWebSocketMessageToSignal: INIT extra=" + str3 + ", resolved callType=" + callType2);
                application = new AbstractC35238nrZ.Fragment(str, str2, str4, callType2);
            }
        } else {
            if (num != null && num.intValue() == 4) {
                if (!z) {
                    return AbstractC35238nrZ.StateListAnimator.EZpvd;
                }
                return AbstractC35238nrZ.TaskDescription.OLrzqt;
            }
            if (num != null && num.intValue() == 5) {
                if (z) {
                    return null;
                }
                return AbstractC35238nrZ.VoiceInteractor.EZpvd;
            }
            if (num != null && num.intValue() == 2) {
                if (z) {
                    return null;
                }
                return AbstractC35238nrZ.ActionBar.EZpvd;
            }
            if (num != null && num.intValue() == 3) {
                return AbstractC35238nrZ.PictureInPictureParams.AEQbTJ;
            }
            if (num != null && num.intValue() == 7) {
                return AbstractC35238nrZ.ComponentName.AEQbTJ;
            }
            if (num == null || num.intValue() != 8) {
                return null;
            }
            if (str3 != null) {
                try {
                    Result.Application application4 = Result.Companion;
                    JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(str3)).get((java.lang.Object) "duration");
                    objM7377constructorimpl = Result.m7377constructorimpl((jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content = jsonPrimitive.getContent()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(content));
                } catch (java.lang.Throwable th2) {
                    Result.Application application5 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                l = (java.lang.Long) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
            application = new AbstractC35238nrZ.Application(l);
        }
        return application;
    }

    public final void valueOf() {
        if (this.OLrzqt == null) {
            KWHzl("setupAgoraCallbacks: Skipping - audio service unavailable");
        } else {
            KWHzl("setupAgoraCallbacks: Configuring Agora SDK callbacks");
            this.OLrzqt.AEQbTJ(new StateListAnimator());
        }
    }

    /* JADX INFO: renamed from: o.nrW$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator implements InterfaceC42569rXs.StateListAnimator {
        public StateListAnimator() {
        }
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$initiateCall$2(str, this, str2, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object AEQbTJ(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$cancelCall$2(this, callSessionV2, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object KWHzl(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$acceptCall$2(this, callSessionV2, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object EZpvd(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$rejectCall$2(callSessionV2, this, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object KWHzl(@NotNull CallSessionV2 callSessionV2, long j, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$endCall$2(this, callSessionV2, j, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object AhwBna(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$sendTerminateSignal$2(this, callSessionV2, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object OLrzqt(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$joinChannel$2(this, callSessionV2, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$leaveChannel$2(this, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public boolean EZpvd(boolean z) {
        InterfaceC42569rXs interfaceC42569rXs = this.OLrzqt;
        if (interfaceC42569rXs == null) {
            KWHzl("setMicrophoneEnabled: Audio service unavailable, returning false");
            return false;
        }
        interfaceC42569rXs.AEQbTJ(z);
        return this.OLrzqt.copydefault();
    }

    @Override // o.InterfaceC35234nrV
    public boolean AEQbTJ() {
        InterfaceC42569rXs interfaceC42569rXs = this.OLrzqt;
        if (interfaceC42569rXs == null) {
            return false;
        }
        return interfaceC42569rXs.copydefault();
    }

    @Override // o.InterfaceC35234nrV
    public boolean OLrzqt(boolean z) {
        InterfaceC42569rXs interfaceC42569rXs = this.OLrzqt;
        if (interfaceC42569rXs == null) {
            KWHzl("setSpeakerEnabled: Audio service unavailable, returning false");
            return false;
        }
        return interfaceC42569rXs.OLrzqt(z);
    }

    @Override // o.InterfaceC35234nrV
    public boolean OLrzqt() {
        InterfaceC42569rXs interfaceC42569rXs = this.OLrzqt;
        if (interfaceC42569rXs == null) {
            return false;
        }
        return interfaceC42569rXs.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35234nrV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CallRepositoryImpl$isMicrophoneAvailable$1 callRepositoryImpl$isMicrophoneAvailable$1;
        C35235nrW c35235nrW;
        int minBufferSize;
        boolean zBooleanValue;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        if (continuation instanceof CallRepositoryImpl$isMicrophoneAvailable$1) {
            callRepositoryImpl$isMicrophoneAvailable$1 = (CallRepositoryImpl$isMicrophoneAvailable$1) continuation;
            int i = callRepositoryImpl$isMicrophoneAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callRepositoryImpl$isMicrophoneAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                callRepositoryImpl$isMicrophoneAvailable$1 = new CallRepositoryImpl$isMicrophoneAvailable$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = callRepositoryImpl$isMicrophoneAvailable$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = callRepositoryImpl$isMicrophoneAvailable$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (ContextCompat.checkSelfPermission(this.valueOf, "android.permission.RECORD_AUDIO") != 0) {
                KWHzl("isMicrophoneAvailable: Permission not granted");
                return C56443yFo.KWHzl(false);
            }
            try {
                Result.Application application = Result.Companion;
                minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
            } catch (java.lang.Throwable th) {
                th = th;
                c35235nrW = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (minBufferSize == -2 || minBufferSize == -1) {
                KWHzl("isMicrophoneAvailable: Invalid buffer size for AudioRecord");
                c35235nrW = this;
                zBooleanValue = false;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    return objM7377constructorimpl;
                }
                c35235nrW.KWHzl("Error checking microphone availability: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                return C56443yFo.KWHzl(false);
            }
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            CallRepositoryImpl$isMicrophoneAvailable$2$1 callRepositoryImpl$isMicrophoneAvailable$2$1 = new CallRepositoryImpl$isMicrophoneAvailable$2$1(minBufferSize, this, null);
            callRepositoryImpl$isMicrophoneAvailable$1.L$0 = this;
            callRepositoryImpl$isMicrophoneAvailable$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, callRepositoryImpl$isMicrophoneAvailable$2$1, callRepositoryImpl$isMicrophoneAvailable$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c35235nrW = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35235nrW = (C35235nrW) callRepositoryImpl$isMicrophoneAvailable$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        zBooleanValue = ((java.lang.Boolean) objWithContext).booleanValue();
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(zBooleanValue));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
    }

    @Override // o.InterfaceC35234nrV
    public boolean EZpvd() {
        return C43453rpa.AEQbTJ.KWHzl(this.valueOf) && this.KWHzl.fetchVPNInfo();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC35234nrV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> continuation) throws java.lang.Throwable {
        CallRepositoryImpl$checkTargetBlocked$1 callRepositoryImpl$checkTargetBlocked$1;
        C35235nrW c35235nrW;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CallRepositoryImpl$checkTargetBlocked$1) {
            callRepositoryImpl$checkTargetBlocked$1 = (CallRepositoryImpl$checkTargetBlocked$1) continuation;
            int i = callRepositoryImpl$checkTargetBlocked$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                callRepositoryImpl$checkTargetBlocked$1.label = i - Integer.MIN_VALUE;
            } else {
                callRepositoryImpl$checkTargetBlocked$1 = new CallRepositoryImpl$checkTargetBlocked$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = callRepositoryImpl$checkTargetBlocked$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = callRepositoryImpl$checkTargetBlocked$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = sDZ.AEQbTJ.AhwBna().AEQbTJ();
                callRepositoryImpl$checkTargetBlocked$1.L$0 = this;
                callRepositoryImpl$checkTargetBlocked$1.L$1 = str;
                callRepositoryImpl$checkTargetBlocked$1.label = 1;
                objEZpvd = interfaceC44177sGdAEQbTJ.EZpvd(str, (java.lang.String) null, callRepositoryImpl$checkTargetBlocked$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c35235nrW = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c35235nrW = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) callRepositoryImpl$checkTargetBlocked$1.L$1;
            c35235nrW = (C35235nrW) callRepositoryImpl$checkTargetBlocked$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) objEZpvd);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            c35235nrW.KWHzl("checkTargetBlocked: Fetch failed, using local cache... " + thM7380exceptionOrNullimpl.getMessage());
            objM7377constructorimpl = sDZ.AEQbTJ.valueOf().KWHzl(str);
        }
        RelationInfo relationInfo = (RelationInfo) objM7377constructorimpl;
        if (relationInfo != null) {
            return C56390yDp.OLrzqt(C56443yFo.KWHzl(relationInfo.isBlackList()), C44157sFk.getDisplayName$default(relationInfo, null, 1, null));
        }
        return C56390yDp.OLrzqt(C56443yFo.KWHzl(false), "");
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$acceptCallWithToken$2(str, this, str5, str6, str4, str2, str3, i, str7, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object copydefault(@NotNull CallSessionV2 callSessionV2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$sendAcceptSignal$2(callSessionV2, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        KWHzl("updateOnlineServiceCallStatus: meetingId=" + str + ", callSignal=" + i);
        InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.OLrzqt(InterfaceC6804aWL.class);
        if (interfaceC6804aWL != null) {
            interfaceC6804aWL.EZpvd(str, str2, str3, i, new Function2() { // from class: o.nrT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C35235nrW.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.Throwable) obj2);
                }
            });
        }
    }

    public static final Unit AEQbTJ(C35235nrW c35235nrW, boolean z, java.lang.Throwable th) {
        if (z) {
            c35235nrW.KWHzl("updateOnlineServiceCallStatus: success");
        } else {
            c35235nrW.KWHzl("updateOnlineServiceCallStatus: failed - " + (th != null ? th.getMessage() : null), th);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object KWHzl(@NotNull C35251nrm c35251nrm, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$acceptCallForNonLoginUser$2(this, c35251nrm, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public void copydefault() {
        KWHzl("preConnectWebSocket: Starting WebSocket connection in advance");
        this.KWHzl.EZpvd();
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$startGroupCall$2(this, str, list, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$joinGroupCall$2(this, str, null), continuation);
    }

    @Override // o.InterfaceC35234nrV
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC35226nrN<Unit>> continuation) {
        return BuildersKt.withContext(this.AhwBna, new CallRepositoryImpl$ringGroupCall$2(this, str, list, null), continuation);
    }

    public final void KWHzl(java.lang.String str) {
        C44124sEe.imLogVoiceCall$default("CallRepositoryImpl: " + str, null, 2, null);
    }

    public static /* synthetic */ void logError$default(C35235nrW c35235nrW, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        c35235nrW.KWHzl(str, th);
    }

    public final void KWHzl(java.lang.String str, java.lang.Throwable th) {
        C44124sEe.fIwbmz("CallRepositoryImpl: ERROR - " + str, th);
    }
}
