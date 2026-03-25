package com.okinc.im.call.repository;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC35221nrI;
import o.AbstractC35226nrN;
import o.C35235nrW;
import o.C35251nrm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC42569rXs;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$acceptCallForNonLoginUser$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC35226nrN<? extends CallSessionV2>>, Object> {
    final /* synthetic */ C35251nrm $config;
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$acceptCallForNonLoginUser$2(C35235nrW c35235nrW, C35251nrm c35251nrm, Continuation<? super CallRepositoryImpl$acceptCallForNonLoginUser$2> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
        this.$config = c35251nrm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$acceptCallForNonLoginUser$2(this.this$0, this.$config, continuation);
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
        return ((CallRepositoryImpl$acceptCallForNonLoginUser$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl("acceptCallForNonLoginUser: channelId=" + this.$config.copydefault());
            if (this.this$0.OLrzqt == null) {
                C35235nrW.logError$default(this.this$0, "acceptCallForNonLoginUser: Audio service unavailable", null, 2, null);
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.ActionBar(-1, "Audio service unavailable - call feature not supported"));
            }
            try {
                CallSessionV2 callSessionV2Copydefault = CallSessionV2.Companion.copydefault(this.$config.copydefault(), this.$config.EZpvd(), this.$config.KWHzl(), CallType.QUEUE);
                String strAEQbTJ = this.$config.AEQbTJ();
                String strOLrzqt = this.$config.OLrzqt();
                Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$config.KWHzl());
                CallSessionV2 callSessionV2KWHzl = callSessionV2Copydefault.KWHzl((131055 & 1) != 0 ? callSessionV2Copydefault.callId : null, (131055 & 2) != 0 ? callSessionV2Copydefault.conversationId : null, (131055 & 4) != 0 ? callSessionV2Copydefault.calleeUserId : null, (131055 & 8) != 0 ? callSessionV2Copydefault.callerUserId : null, (131055 & 16) != 0 ? callSessionV2Copydefault.selfUserId : null, (131055 & 32) != 0 ? callSessionV2Copydefault.agoraToken : strAEQbTJ, (131055 & 64) != 0 ? callSessionV2Copydefault.agoraAppId : strOLrzqt, (131055 & 128) != 0 ? callSessionV2Copydefault.agoraUid : intOrNull != null ? intOrNull.intValue() : 0, (131055 & 256) != 0 ? callSessionV2Copydefault.callType : null, (131055 & 512) != 0 ? callSessionV2Copydefault.mediaType : null, (131055 & 1024) != 0 ? callSessionV2Copydefault.meetingId : null, (131055 & 2048) != 0 ? callSessionV2Copydefault.nonLoginUserId : null, (131055 & 4096) != 0 ? callSessionV2Copydefault.nonLoginUUID : null, (131055 & 8192) != 0 ? callSessionV2Copydefault.createdAt : 0L, (131055 & 16384) != 0 ? callSessionV2Copydefault.agoraGroupChannelName : null, (32768 & 131055) != 0 ? callSessionV2Copydefault.groupId : null, (131055 & 65536) != 0 ? callSessionV2Copydefault.isGroupCallInitiator : false);
                this.this$0.OLrzqt.copydefault(this.this$0.valueOf, this.$config.OLrzqt(), this.$config.KWHzl());
                InterfaceC42569rXs interfaceC42569rXs = this.this$0.OLrzqt;
                String strCopydefault = this.$config.copydefault();
                String strAEQbTJ2 = this.$config.AEQbTJ();
                Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$config.KWHzl());
                int iKWHzl = interfaceC42569rXs.KWHzl(strCopydefault, strAEQbTJ2, intOrNull2 != null ? intOrNull2.intValue() : 0);
                if (this.this$0.OLrzqt.copydefault(iKWHzl)) {
                    String strOLrzqt2 = this.this$0.OLrzqt.OLrzqt(iKWHzl);
                    return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.ActionBar(iKWHzl, "Failed to join channel: " + strOLrzqt2));
                }
                return AbstractC35226nrN.Companion.copydefault(callSessionV2KWHzl);
            } catch (Exception e) {
                return AbstractC35226nrN.Companion.copydefault((AbstractC35221nrI) new AbstractC35221nrI.VoiceInteractor("Failed to accept call for non-login user: " + e.getMessage(), e));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
