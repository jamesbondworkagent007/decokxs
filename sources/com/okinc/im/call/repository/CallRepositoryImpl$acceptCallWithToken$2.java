package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$acceptCallWithToken$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>>, Object> {
    final /* synthetic */ String $agoraAppId;
    final /* synthetic */ String $agoraToken;
    final /* synthetic */ int $agoraUid;
    final /* synthetic */ String $callerUserId;
    final /* synthetic */ String $meetingId;
    final /* synthetic */ String $nonLoginUUID;
    final /* synthetic */ String $selfUserId;
    final /* synthetic */ String $targetId;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$acceptCallWithToken$2(String str, C35235nrW c35235nrW, String str2, String str3, String str4, String str5, String str6, int i, String str7, Continuation<? super CallRepositoryImpl$acceptCallWithToken$2> continuation) {
        super(2, continuation);
        this.$targetId = str;
        this.this$0 = c35235nrW;
        this.$selfUserId = str2;
        this.$meetingId = str3;
        this.$callerUserId = str4;
        this.$agoraToken = str5;
        this.$agoraAppId = str6;
        this.$agoraUid = i;
        this.$nonLoginUUID = str7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$acceptCallWithToken$2(this.$targetId, this.this$0, this.$selfUserId, this.$meetingId, this.$callerUserId, this.$agoraToken, this.$agoraAppId, this.$agoraUid, this.$nonLoginUUID, continuation);
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
        return ((CallRepositoryImpl$acceptCallWithToken$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = this.$targetId;
            this.this$0.KWHzl("acceptCallWithToken: conversationId=" + str + ", selfUserId=" + this.$selfUserId + ", meetingId=" + this.$meetingId);
            try {
                CallSessionV2 callSessionV2Copydefault = CallSessionV2.Companion.copydefault(str, this.$callerUserId, this.$selfUserId, CallType.QUEUE);
                String str2 = this.$agoraToken;
                String str3 = this.$agoraAppId;
                int i = this.$agoraUid;
                String str4 = this.$meetingId;
                if (StringsKt__StringsKt.fARcdN((CharSequence) str4)) {
                    str4 = null;
                }
                return AbstractC35226nrN.Companion.copydefault(callSessionV2Copydefault.KWHzl((131055 & 1) != 0 ? callSessionV2Copydefault.callId : null, (131055 & 2) != 0 ? callSessionV2Copydefault.conversationId : null, (131055 & 4) != 0 ? callSessionV2Copydefault.calleeUserId : null, (131055 & 8) != 0 ? callSessionV2Copydefault.callerUserId : null, (131055 & 16) != 0 ? callSessionV2Copydefault.selfUserId : null, (131055 & 32) != 0 ? callSessionV2Copydefault.agoraToken : str2, (131055 & 64) != 0 ? callSessionV2Copydefault.agoraAppId : str3, (131055 & 128) != 0 ? callSessionV2Copydefault.agoraUid : i, (131055 & 256) != 0 ? callSessionV2Copydefault.callType : null, (131055 & 512) != 0 ? callSessionV2Copydefault.mediaType : null, (131055 & 1024) != 0 ? callSessionV2Copydefault.meetingId : str4, (131055 & 2048) != 0 ? callSessionV2Copydefault.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV2Copydefault.nonLoginUUID : this.$nonLoginUUID, (131055 & 8192) != 0 ? callSessionV2Copydefault.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV2Copydefault.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV2Copydefault.groupId : null, (131055 & 65536) != 0 ? callSessionV2Copydefault.isGroupCallInitiator : false));
            } catch (Exception e) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor("Failed to accept call with token: " + e.getMessage(), e));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
