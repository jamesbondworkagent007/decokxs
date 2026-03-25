package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.InHouseIMGetAgoraTokenResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C35340ntV;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$initiateCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>>, Object> {
    final /* synthetic */ String $calleeUserId;
    final /* synthetic */ String $targetId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$initiateCall$2(String str, C35235nrW c35235nrW, String str2, Continuation<? super CallRepositoryImpl$initiateCall$2> continuation) {
        super(2, continuation);
        this.$targetId = str;
        this.this$0 = c35235nrW;
        this.$calleeUserId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$initiateCall$2(this.$targetId, this.this$0, this.$calleeUserId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC35226nrN<CallSessionV2>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC35226nrN<CallSessionV2>> continuation) {
        return ((CallRepositoryImpl$initiateCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object agoraToken;
        String str2;
        Object objAEQbTJ;
        CallSessionV2 callSessionV2;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                str = this.$targetId;
                this.this$0.KWHzl("initiateCall: conversationId=" + str + ", calleeUserId=" + this.$calleeUserId);
                String strKWHzl = C44157sFk.KWHzl();
                if (strKWHzl != null) {
                    this.this$0.KWHzl("initiateCall: Fetching Agora token from backend");
                    InHouseIMCallServiceApi inHouseIMCallServiceApi = this.this$0.AEQbTJ;
                    this.L$0 = str;
                    this.L$1 = strKWHzl;
                    this.label = 1;
                    agoraToken = inHouseIMCallServiceApi.getAgoraToken(str, 0, this);
                    if (agoraToken == objCopydefault) {
                        return objCopydefault;
                    }
                    str2 = strKWHzl;
                } else {
                    C35235nrW.logError$default(this.this$0, "initiateCall: User not logged in", null, 2, null);
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor("User not logged in", null, 2, null));
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    callSessionV2 = (CallSessionV2) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objAEQbTJ = obj;
                    this.this$0.KWHzl("initiateCall: Call initiated successfully, callId=" + callSessionV2.gEmmrt());
                    return AbstractC35226nrN.Companion.copydefault(callSessionV2);
                }
                String str3 = (String) this.L$1;
                String str4 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str3;
                str = str4;
                agoraToken = obj;
            }
            InHouseIMGetAgoraTokenResponse inHouseIMGetAgoraTokenResponse = (InHouseIMGetAgoraTokenResponse) ((ResponseData) agoraToken).getData();
            String strEZpvd = inHouseIMGetAgoraTokenResponse != null ? inHouseIMGetAgoraTokenResponse.EZpvd() : null;
            String strCopydefault = inHouseIMGetAgoraTokenResponse != null ? inHouseIMGetAgoraTokenResponse.copydefault() : null;
            Integer intOrNull = (inHouseIMGetAgoraTokenResponse == null || (strAEQbTJ = inHouseIMGetAgoraTokenResponse.AEQbTJ()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(strAEQbTJ);
            if (strEZpvd != null && !StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                if (strCopydefault != null && !StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault)) {
                    if (intOrNull == null) {
                        C35235nrW.logError$default(this.this$0, "initiateCall: Failed to get Agora UID", null, 2, null);
                        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Failed to get Agora UID"));
                    }
                    this.this$0.KWHzl("initiateCall: Received Agora credentials, uid=" + intOrNull);
                    CallSessionV2 callSessionV2ForOutgoingCall$default = CallSessionV2.Companion.forOutgoingCall$default(CallSessionV2.Companion, str, str2, this.$calleeUserId, null, 8, null);
                    CallSessionV2 callSessionV2KWHzl = callSessionV2ForOutgoingCall$default.KWHzl((131055 & 1) != 0 ? callSessionV2ForOutgoingCall$default.callId : null, (131055 & 2) != 0 ? callSessionV2ForOutgoingCall$default.conversationId : null, (131055 & 4) != 0 ? callSessionV2ForOutgoingCall$default.calleeUserId : null, (131055 & 8) != 0 ? callSessionV2ForOutgoingCall$default.callerUserId : null, (131055 & 16) != 0 ? callSessionV2ForOutgoingCall$default.selfUserId : null, (131055 & 32) != 0 ? callSessionV2ForOutgoingCall$default.agoraToken : strEZpvd, (131055 & 64) != 0 ? callSessionV2ForOutgoingCall$default.agoraAppId : strCopydefault, (131055 & 128) != 0 ? callSessionV2ForOutgoingCall$default.agoraUid : intOrNull.intValue(), (131055 & 256) != 0 ? callSessionV2ForOutgoingCall$default.callType : null, (131055 & 512) != 0 ? callSessionV2ForOutgoingCall$default.mediaType : null, (131055 & 1024) != 0 ? callSessionV2ForOutgoingCall$default.meetingId : null, (131055 & 2048) != 0 ? callSessionV2ForOutgoingCall$default.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV2ForOutgoingCall$default.nonLoginUUID : null, (131055 & 8192) != 0 ? callSessionV2ForOutgoingCall$default.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV2ForOutgoingCall$default.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV2ForOutgoingCall$default.groupId : null, (131055 & 65536) != 0 ? callSessionV2ForOutgoingCall$default.isGroupCallInitiator : false);
                    this.this$0.KWHzl("initiateCall: Sending INIT signal via WebSocket");
                    C35340ntV c35340ntV = this.this$0.djBIcL;
                    OKMessage oKMessageCopydefault = c35340ntV.copydefault(str);
                    this.L$0 = callSessionV2KWHzl;
                    this.L$1 = null;
                    this.label = 2;
                    objAEQbTJ = c35340ntV.AEQbTJ(oKMessageCopydefault, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    callSessionV2 = callSessionV2KWHzl;
                    this.this$0.KWHzl("initiateCall: Call initiated successfully, callId=" + callSessionV2.gEmmrt());
                    return AbstractC35226nrN.Companion.copydefault(callSessionV2);
                }
                C35235nrW.logError$default(this.this$0, "initiateCall: Failed to get Agora app ID", null, 2, null);
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Failed to get Agora app ID"));
            }
            C35235nrW.logError$default(this.this$0, "initiateCall: Failed to get Agora token", null, 2, null);
            return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Failed to get Agora token"));
        } catch (Exception e) {
            this.this$0.KWHzl("initiateCall: Exception - " + e.getMessage(), e);
            AbstractC35226nrN.TaskDescription taskDescription = AbstractC35226nrN.Companion;
            String message = e.getMessage();
            if (message == null) {
                message = "Failed to initiate call";
            }
            return taskDescription.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor(message, e));
        }
    }
}
