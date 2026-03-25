package com.okinc.im.imui.pushnotification.handler;

import com.okinc.im.imui.pushnotification.model.VoiceCallNotificationData;
import com.okinc.okimcore.feature.notification.model.LaunchUrlData;
import com.okinc.okimcore.feature.notification.model.NotificationData;
import com.okinc.okimcore.feature.notification.model.PayloadData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C37207opV;
import o.C46952tgq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationHandler$processVoiceCallNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LaunchUrlData $launchUrlData;
    final /* synthetic */ C46952tgq $notification;
    final /* synthetic */ NotificationData $notificationData;
    final /* synthetic */ PayloadData $payloadData;
    final /* synthetic */ VoiceCallNotificationData $voiceCallData;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationHandler$processVoiceCallNotification$1(C46952tgq c46952tgq, NotificationData notificationData, LaunchUrlData launchUrlData, VoiceCallNotificationData voiceCallNotificationData, PayloadData payloadData, Continuation<? super PushNotificationHandler$processVoiceCallNotification$1> continuation) {
        super(2, continuation);
        this.$notification = c46952tgq;
        this.$notificationData = notificationData;
        this.$launchUrlData = launchUrlData;
        this.$voiceCallData = voiceCallNotificationData;
        this.$payloadData = payloadData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationHandler$processVoiceCallNotification$1(this.$notification, this.$notificationData, this.$launchUrlData, this.$voiceCallData, this.$payloadData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushNotificationHandler$processVoiceCallNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C37207opV c37207opV = C37207opV.copydefault;
            C46952tgq c46952tgq = this.$notification;
            NotificationData notificationData = this.$notificationData;
            LaunchUrlData launchUrlData = this.$launchUrlData;
            VoiceCallNotificationData voiceCallNotificationData = this.$voiceCallData;
            PayloadData payloadData = this.$payloadData;
            this.label = 1;
            obj = c37207opV.KWHzl(c46952tgq, notificationData, launchUrlData, voiceCallNotificationData, payloadData, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C37207opV.Application application = (C37207opV.Application) obj;
        C37207opV c37207opV2 = C37207opV.copydefault;
        c37207opV2.copydefault(this.$launchUrlData.getConversationId(), this.$notificationData);
        if (c37207opV2.AEQbTJ(application.AkhnZx())) {
            c37207opV2.AEQbTJ(application, this.$voiceCallData);
        } else {
            c37207opV2.AEQbTJ(application);
        }
        return Unit.INSTANCE;
    }
}
