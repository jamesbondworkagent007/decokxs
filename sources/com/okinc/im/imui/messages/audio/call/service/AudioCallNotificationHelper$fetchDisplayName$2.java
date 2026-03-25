package com.okinc.im.imui.messages.audio.call.service;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C33070mpX;
import o.C35399nuc;
import o.C35864oGn;
import o.C44124sEe;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C58114yvF;
import o.C59449zhJ;
import o.InterfaceC35331ntM;
import o.oDB;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioCallNotificationHelper$fetchDisplayName$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ String $callerName;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ boolean $isGroupCall;
    final /* synthetic */ String $remoteUserId;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallNotificationHelper$fetchDisplayName$2(boolean z, String str, String str2, String str3, Continuation<? super AudioCallNotificationHelper$fetchDisplayName$2> continuation) {
        super(2, continuation);
        this.$isGroupCall = z;
        this.$conversationId = str;
        this.$remoteUserId = str2;
        this.$callerName = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallNotificationHelper$fetchDisplayName$2(this.$isGroupCall, this.$conversationId, this.$remoteUserId, this.$callerName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((AudioCallNotificationHelper$fetchDisplayName$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        GroupInfo groupInfo;
        RelationInfo relationInfo;
        String displayName$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                groupInfo = (GroupInfo) obj;
                if (groupInfo == null) {
                    C44124sEe.imLogVoiceCall$default("NotificationHelper:fetchDisplayName: group info is null for groupId=" + this.$conversationId + ", using fallback", null, 2, null);
                }
                String name = groupInfo != null ? groupInfo.getName() : null;
                return (name != null || StringsKt__StringsKt.fARcdN((CharSequence) name)) ? this.$conversationId : name;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            relationInfo = (RelationInfo) obj;
            if (relationInfo == null) {
                C44124sEe.imLogVoiceCall$default("NotificationHelper:fetchDisplayName: relation info is null for remoteUserId=" + str + ", using fallback", null, 2, null);
            }
            displayName$default = relationInfo == null ? C44157sFk.getDisplayName$default(relationInfo, null, 1, null) : null;
            if (displayName$default == null && !StringsKt__StringsKt.fARcdN((CharSequence) displayName$default)) {
                return displayName$default;
            }
            String str2 = this.$callerName;
            return (str2 != null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) ? !C59449zhJ.startsWith$default(str, "-", false, 2, null) ? C33070mpX.AYXKKw(C35399nuc.LoaderManager.gmHjFq) : str : this.$callerName;
        }
        C56391yDq.AEQbTJ(obj);
        InterfaceC35331ntM interfaceC35331ntM = (InterfaceC35331ntM) C58114yvF.OLrzqt(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class);
        if (this.$isGroupCall) {
            oDB odbZuWLRA = interfaceC35331ntM.zuWLRA();
            String str3 = this.$conversationId;
            this.label = 1;
            obj = odbZuWLRA.AEQbTJ(str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            groupInfo = (GroupInfo) obj;
            if (groupInfo == null) {
            }
            if (groupInfo != null) {
            }
            if (name != null) {
            }
        }
        String str4 = this.$remoteUserId;
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str4))) {
            str4 = null;
        }
        if (str4 == null) {
            str4 = this.$conversationId;
        }
        C35864oGn c35864oGnQkdxfA = interfaceC35331ntM.QkdxfA();
        this.L$0 = str4;
        this.label = 2;
        obj = c35864oGnQkdxfA.AEQbTJ(str4, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        str = str4;
        relationInfo = (RelationInfo) obj;
        if (relationInfo == null) {
        }
        if (relationInfo == null) {
        }
        if (displayName$default == null) {
        }
        String str22 = this.$callerName;
        if (str22 != null) {
        }
    }
}
