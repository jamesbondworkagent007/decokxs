package com.okinc.im.call.adapter;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C35217nrE;
import o.C35255nrq;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CallOrchestratorAdapter$acceptCallByToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $agoraToken;
    final /* synthetic */ String $agoraUId;
    final /* synthetic */ String $appIdFromBE;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ String $currentUserId;
    final /* synthetic */ String $meetingId;
    final /* synthetic */ String $nonLoginUUID;
    final /* synthetic */ String $nonLoginUserId;
    final /* synthetic */ String $remoteUserId;
    int label;
    final /* synthetic */ C35255nrq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallOrchestratorAdapter$acceptCallByToken$1(String str, String str2, C35255nrq c35255nrq, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Continuation<? super CallOrchestratorAdapter$acceptCallByToken$1> continuation) {
        super(2, continuation);
        this.$nonLoginUserId = str;
        this.$currentUserId = str2;
        this.this$0 = c35255nrq;
        this.$agoraToken = str3;
        this.$appIdFromBE = str4;
        this.$agoraUId = str5;
        this.$conversationId = str6;
        this.$remoteUserId = str7;
        this.$meetingId = str8;
        this.$nonLoginUUID = str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallOrchestratorAdapter$acceptCallByToken$1(this.$nonLoginUserId, this.$currentUserId, this.this$0, this.$agoraToken, this.$appIdFromBE, this.$agoraUId, this.$conversationId, this.$remoteUserId, this.$meetingId, this.$nonLoginUUID, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallOrchestratorAdapter$acceptCallByToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strKWHzl;
        String str;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str3 = this.$nonLoginUserId;
            if (str3 == null || StringsKt__StringsKt.fARcdN((CharSequence) str3)) {
                strKWHzl = this.$currentUserId;
                if (strKWHzl == null && (strKWHzl = C44157sFk.KWHzl()) == null) {
                    strKWHzl = "";
                }
            } else {
                strKWHzl = this.$nonLoginUserId;
            }
            String str4 = strKWHzl;
            this.this$0.copydefault("acceptCallByToken: selfUserId=" + str4);
            String str5 = this.$agoraToken;
            if (str5 == null || StringsKt__StringsKt.fARcdN((CharSequence) str5) || (str = this.$appIdFromBE) == null || StringsKt__StringsKt.fARcdN((CharSequence) str) || (str2 = this.$agoraUId) == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                this.this$0.copydefault("acceptCallByToken: No pre-provided credentials, falling back to normal accept");
                C35217nrE c35217nrE = this.this$0.KWHzl;
                this.label = 2;
                obj = c35217nrE.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                this.this$0.copydefault("acceptCallByToken: Using pre-provided Agora credentials");
                C35217nrE c35217nrE2 = this.this$0.KWHzl;
                String str6 = this.$conversationId;
                String str7 = this.$agoraToken;
                String str8 = this.$appIdFromBE;
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$agoraUId);
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                String str9 = this.$remoteUserId;
                String str10 = this.$meetingId;
                String str11 = this.$nonLoginUUID;
                this.label = 1;
                obj = c35217nrE2.KWHzl(str6, str7, str8, iIntValue, str9, str4, str10, str11, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
