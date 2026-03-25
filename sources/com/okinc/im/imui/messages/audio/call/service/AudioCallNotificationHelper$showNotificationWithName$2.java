package com.okinc.im.imui.messages.audio.call.service;

import android.app.Notification;
import android.app.PendingIntent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32986mnt;
import o.C37161ooc;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35259nru;

/* JADX INFO: loaded from: classes8.dex */
public final class AudioCallNotificationHelper$showNotificationWithName$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC35259nru $audioCallManager;
    final /* synthetic */ String $conversationId;
    final /* synthetic */ boolean $isGroupCall;
    final /* synthetic */ Function0<Boolean> $isScreenLocked;
    final /* synthetic */ String $name;
    final /* synthetic */ PendingIntent $pendingIntent;
    final /* synthetic */ String $remoteUserId;
    int label;
    final /* synthetic */ C37161ooc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCallNotificationHelper$showNotificationWithName$2(C37161ooc c37161ooc, String str, InterfaceC35259nru interfaceC35259nru, Function0<Boolean> function0, PendingIntent pendingIntent, String str2, String str3, boolean z, Continuation<? super AudioCallNotificationHelper$showNotificationWithName$2> continuation) {
        super(2, continuation);
        this.this$0 = c37161ooc;
        this.$name = str;
        this.$audioCallManager = interfaceC35259nru;
        this.$isScreenLocked = function0;
        this.$pendingIntent = pendingIntent;
        this.$conversationId = str2;
        this.$remoteUserId = str3;
        this.$isGroupCall = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioCallNotificationHelper$showNotificationWithName$2(this.this$0, this.$name, this.$audioCallManager, this.$isScreenLocked, this.$pendingIntent, this.$conversationId, this.$remoteUserId, this.$isGroupCall, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AudioCallNotificationHelper$showNotificationWithName$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pairCopydefault = this.this$0.copydefault(this.$name, this.$audioCallManager);
            String str = (String) pairCopydefault.component1();
            String str2 = (String) pairCopydefault.component2();
            boolean zBooleanValue = this.$isScreenLocked.invoke().booleanValue();
            boolean zValueOf = C32986mnt.EZpvd.valueOf();
            boolean z = !zValueOf;
            Notification notificationOLrzqt = this.this$0.OLrzqt(str, str2, this.$pendingIntent, zValueOf && !zBooleanValue);
            C44124sEe.imLogVoiceCall$default("NotificationHelper:showNotification conversationId[" + this.$conversationId + "] remoteUserId[" + this.$remoteUserId + "] isGroupCall[" + this.$isGroupCall + "] isScreenLocked[" + zBooleanValue + "] isAppInBackground[" + z + "] title[" + str + "]", null, 2, null);
            this.this$0.KWHzl(notificationOLrzqt, zBooleanValue || z, this.$conversationId, this.$remoteUserId);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
