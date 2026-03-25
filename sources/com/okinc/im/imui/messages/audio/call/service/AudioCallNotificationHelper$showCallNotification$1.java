package com.okinc.im.imui.messages.audio.call.service;

import android.app.PendingIntent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C37161ooc;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35259nru;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioCallNotificationHelper$showCallNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC35259nru $audioCallManager;
    final /* synthetic */ String $callerName;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ int $currentGeneration;
    final /* synthetic */ boolean $isGroupCall;
    final /* synthetic */ Function0<Boolean> $isScreenLocked;
    final /* synthetic */ PendingIntent $pendingIntent;
    final /* synthetic */ String $remoteUserId;
    int label;
    final /* synthetic */ C37161ooc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallNotificationHelper$showCallNotification$1(C37161ooc c37161ooc, String str, String str2, boolean z, String str3, int i, PendingIntent pendingIntent, InterfaceC35259nru interfaceC35259nru, Function0<Boolean> function0, Continuation<? super AudioCallNotificationHelper$showCallNotification$1> continuation) {
        super(2, continuation);
        this.this$0 = c37161ooc;
        this.$conversationId = str;
        this.$remoteUserId = str2;
        this.$isGroupCall = z;
        this.$callerName = str3;
        this.$currentGeneration = i;
        this.$pendingIntent = pendingIntent;
        this.$audioCallManager = interfaceC35259nru;
        this.$isScreenLocked = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallNotificationHelper$showCallNotification$1(this.this$0, this.$conversationId, this.$remoteUserId, this.$isGroupCall, this.$callerName, this.$currentGeneration, this.$pendingIntent, this.$audioCallManager, this.$isScreenLocked, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioCallNotificationHelper$showCallNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C37161ooc c37161ooc = this.this$0;
            String str = this.$conversationId;
            String str2 = this.$remoteUserId;
            boolean z = this.$isGroupCall;
            String str3 = this.$callerName;
            this.label = 1;
            obj = c37161ooc.copydefault(str, str2, z, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str4 = (String) obj;
        if (this.$currentGeneration != this.this$0.KWHzl) {
            C44124sEe.imLogVoiceCall$default("NotificationHelper:showCallNotification skipping stale notification (generation " + this.$currentGeneration + " vs current " + this.this$0.KWHzl + ")", null, 2, null);
            return Unit.INSTANCE;
        }
        C37161ooc c37161ooc2 = this.this$0;
        PendingIntent pendingIntent = this.$pendingIntent;
        String str5 = this.$conversationId;
        String str6 = this.$remoteUserId;
        boolean z2 = this.$isGroupCall;
        InterfaceC35259nru interfaceC35259nru = this.$audioCallManager;
        Function0<Boolean> function0 = this.$isScreenLocked;
        this.label = 2;
        if (c37161ooc2.EZpvd(str4, pendingIntent, str5, str6, z2, interfaceC35259nru, function0, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
