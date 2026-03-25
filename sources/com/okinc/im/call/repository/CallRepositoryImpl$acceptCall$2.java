package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMCallServiceApi;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.InHouseIMGetAgoraTokenResponse;
import kotlin.Result;
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
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$acceptCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>>, Object> {
    final /* synthetic */ CallSessionV2 $session;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$acceptCall$2(C35235nrW c35235nrW, CallSessionV2 callSessionV2, Continuation<? super CallRepositoryImpl$acceptCall$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$session = callSessionV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CallRepositoryImpl$acceptCall$2 callRepositoryImpl$acceptCall$2 = new CallRepositoryImpl$acceptCall$2(this.this$0, this.$session, continuation);
        callRepositoryImpl$acceptCall$2.L$0 = obj;
        return callRepositoryImpl$acceptCall$2;
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
        return ((CallRepositoryImpl$acceptCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0170 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Exception exc;
        Object objEZpvd;
        Exception exc2;
        CoroutineScope coroutineScope;
        CallSessionV2 callSessionV2KWHzl;
        Object agoraToken;
        Object objAEQbTJ;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            exc = e;
            this.this$0.KWHzl("acceptCall: Exception - " + exc.getMessage(), exc);
            C35235nrW c35235nrW = this.this$0;
            CallSessionV2 callSessionV2 = this.$session;
            try {
                Result.Application application = Result.Companion;
                this.L$0 = exc;
                this.L$1 = null;
                this.label = 4;
                objEZpvd = c35235nrW.EZpvd(callSessionV2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                exc2 = exc;
            } catch (Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                exc2 = exc;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.this$0.KWHzl("acceptCall: callId=" + this.$session.gEmmrt() + ", hasCredentials=" + this.$session.AkhnZx());
            CallSessionV2 callSessionV22 = this.$session;
            if (!callSessionV22.AkhnZx()) {
                this.this$0.KWHzl("acceptCall: Fetching Agora credentials from backend");
                InHouseIMCallServiceApi inHouseIMCallServiceApi = this.this$0.AEQbTJ;
                String strAYXKKw = this.$session.AYXKKw();
                this.L$0 = coroutineScope;
                this.label = 1;
                agoraToken = inHouseIMCallServiceApi.getAgoraToken(strAYXKKw, 1, this);
                if (agoraToken == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                callSessionV2KWHzl = callSessionV22;
                this.this$0.KWHzl("acceptCall: Sending ACCEPT signal via WebSocket");
                C35340ntV c35340ntV = this.this$0.djBIcL;
                CallSessionV2 callSessionV23 = this.$session;
                OKMessage oKMessageEZpvd = c35340ntV.EZpvd(callSessionV23.AYXKKw(), callSessionV23.AhwBna());
                this.L$0 = coroutineScope;
                this.L$1 = callSessionV2KWHzl;
                this.label = 3;
                objAEQbTJ = c35340ntV.AEQbTJ(oKMessageEZpvd, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.KWHzl("acceptCall: Call accepted successfully");
                return AbstractC35226nrN.Companion.copydefault(callSessionV2KWHzl);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Failed to get Agora credentials"));
                }
                if (i == 3) {
                    CallSessionV2 callSessionV24 = (CallSessionV2) this.L$1;
                    C56391yDq.AEQbTJ(obj);
                    callSessionV2KWHzl = callSessionV24;
                    objAEQbTJ = obj;
                    this.this$0.KWHzl("acceptCall: Call accepted successfully");
                    return AbstractC35226nrN.Companion.copydefault(callSessionV2KWHzl);
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                exc2 = (Exception) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = obj;
                    Result.m7377constructorimpl((AbstractC35226nrN) objEZpvd);
                } catch (Throwable th2) {
                    th = th2;
                    exc = exc2;
                    Result.Application application22 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    exc2 = exc;
                }
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor("Failed to accept call: " + exc2.getMessage(), exc2));
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            agoraToken = obj;
        }
        InHouseIMGetAgoraTokenResponse inHouseIMGetAgoraTokenResponse = (InHouseIMGetAgoraTokenResponse) ((ResponseData) agoraToken).getData();
        String strEZpvd = inHouseIMGetAgoraTokenResponse != null ? inHouseIMGetAgoraTokenResponse.EZpvd() : null;
        String strCopydefault = inHouseIMGetAgoraTokenResponse != null ? inHouseIMGetAgoraTokenResponse.copydefault() : null;
        Integer intOrNull = (inHouseIMGetAgoraTokenResponse == null || (strAEQbTJ = inHouseIMGetAgoraTokenResponse.AEQbTJ()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(strAEQbTJ);
        if (strEZpvd != null && !StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd) && strCopydefault != null && !StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault) && intOrNull != null) {
            this.this$0.KWHzl("acceptCall: Received Agora credentials, uid=" + intOrNull);
            CallSessionV2 callSessionV25 = this.$session;
            callSessionV2KWHzl = callSessionV25.KWHzl((131055 & 1) != 0 ? callSessionV25.callId : null, (131055 & 2) != 0 ? callSessionV25.conversationId : null, (131055 & 4) != 0 ? callSessionV25.calleeUserId : null, (131055 & 8) != 0 ? callSessionV25.callerUserId : null, (131055 & 16) != 0 ? callSessionV25.selfUserId : null, (131055 & 32) != 0 ? callSessionV25.agoraToken : strEZpvd, (131055 & 64) != 0 ? callSessionV25.agoraAppId : strCopydefault, (131055 & 128) != 0 ? callSessionV25.agoraUid : intOrNull.intValue(), (131055 & 256) != 0 ? callSessionV25.callType : null, (131055 & 512) != 0 ? callSessionV25.mediaType : null, (131055 & 1024) != 0 ? callSessionV25.meetingId : null, (131055 & 2048) != 0 ? callSessionV25.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV25.nonLoginUUID : null, (131055 & 8192) != 0 ? callSessionV25.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV25.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV25.groupId : null, (131055 & 65536) != 0 ? callSessionV25.isGroupCallInitiator : false);
            this.this$0.KWHzl("acceptCall: Sending ACCEPT signal via WebSocket");
            C35340ntV c35340ntV2 = this.this$0.djBIcL;
            CallSessionV2 callSessionV232 = this.$session;
            OKMessage oKMessageEZpvd2 = c35340ntV2.EZpvd(callSessionV232.AYXKKw(), callSessionV232.AhwBna());
            this.L$0 = coroutineScope;
            this.L$1 = callSessionV2KWHzl;
            this.label = 3;
            objAEQbTJ = c35340ntV2.AEQbTJ(oKMessageEZpvd2, this);
            if (objAEQbTJ == objCopydefault) {
            }
            this.this$0.KWHzl("acceptCall: Call accepted successfully");
            return AbstractC35226nrN.Companion.copydefault(callSessionV2KWHzl);
        }
        C35235nrW.logError$default(this.this$0, "acceptCall: Failed to get Agora credentials, rejecting call", null, 2, null);
        C35235nrW c35235nrW2 = this.this$0;
        CallSessionV2 callSessionV26 = this.$session;
        this.L$0 = coroutineScope;
        this.label = 2;
        if (c35235nrW2.EZpvd(callSessionV26, this) == objCopydefault) {
            return objCopydefault;
        }
        return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.SharedElementCallback("Failed to get Agora credentials"));
    }
}
