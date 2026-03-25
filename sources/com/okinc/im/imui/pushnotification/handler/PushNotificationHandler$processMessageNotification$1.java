package com.okinc.im.imui.pushnotification.handler;

import com.okinc.okimcore.feature.notification.model.LaunchUrlData;
import com.okinc.okimcore.feature.notification.model.NotificationData;
import com.okinc.okimcore.feature.notification.model.NotificationType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.ContactEntity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C37207opV;
import o.C46952tgq;
import o.C56391yDq;
import o.C56442yFn;
import o.rXQ;
import o.sDZ;
import o.sIB;
import o.sSY;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationHandler$processMessageNotification$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LaunchUrlData $launchUrlData;
    final /* synthetic */ C46952tgq $notification;
    final /* synthetic */ NotificationData $notificationData;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationHandler$processMessageNotification$1(LaunchUrlData launchUrlData, NotificationData notificationData, C46952tgq c46952tgq, Continuation<? super PushNotificationHandler$processMessageNotification$1> continuation) {
        super(2, continuation);
        this.$launchUrlData = launchUrlData;
        this.$notificationData = notificationData;
        this.$notification = c46952tgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationHandler$processMessageNotification$1(this.$launchUrlData, this.$notificationData, this.$notification, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushNotificationHandler$processMessageNotification$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [338=4] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        sIB sibCopydefault;
        ContactEntity contactEntity;
        String str;
        String str2;
        String str3;
        int i;
        sSY ssy;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            sibCopydefault = sDZ.AEQbTJ.djBIcL().copydefault();
            sSY ssy2 = sSY.AEQbTJ;
            String senderUid = this.$launchUrlData.getSenderUid();
            this.L$0 = sibCopydefault;
            this.label = 1;
            obj = ssy2.AEQbTJ(sibCopydefault, senderUid, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = this.I$0;
                    String str4 = (String) this.L$2;
                    String str5 = (String) this.L$1;
                    String str6 = (String) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    str = str4;
                    str3 = str5;
                    str2 = str6;
                    i = i3;
                    ssy = sSY.AEQbTJ;
                    String strCopydefault = ssy.copydefault(this.$launchUrlData, (OKConversation) obj);
                    if (ssy.copydefault(this.$notificationData)) {
                        Iterator<T> it = ssy.EZpvd(this.$launchUrlData.getConversationId(), this.$notificationData).iterator();
                        while (it.hasNext()) {
                            C37207opV.copydefault.AYXKKw().KWHzl(((Number) it.next()).intValue());
                        }
                    }
                    C37207opV c37207opV = C37207opV.copydefault;
                    rXQ.Activity.showSystemNotification$default(c37207opV.AYXKKw(), "okex_im_message_v2", c37207opV.AEQbTJ(), i, str2, str3, str, false, null, strCopydefault, true, false, 128, null);
                    return Unit.INSTANCE;
                }
                ContactEntity contactEntity2 = (ContactEntity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                contactEntity = contactEntity2;
                Map<String, String> map = (Map) obj;
                sSY ssy3 = sSY.AEQbTJ;
                int iOLrzqt = ssy3.OLrzqt(this.$launchUrlData.getConversationId(), C33129mqd.AhwBna(this.$notificationData.getSeq()));
                LaunchUrlData launchUrlData = this.$launchUrlData;
                NotificationType notificationType = NotificationType.MESSAGE;
                String strCopydefault2 = ssy3.copydefault(launchUrlData, notificationType);
                String strCopydefault3 = ssy3.copydefault(contactEntity, this.$notification, notificationType, this.$launchUrlData);
                String strKWHzl = ssy3.KWHzl(this.$launchUrlData, contactEntity, map, this.$notificationData, this.$notification);
                LaunchUrlData launchUrlData2 = this.$launchUrlData;
                this.L$0 = strCopydefault2;
                this.L$1 = strCopydefault3;
                this.L$2 = strKWHzl;
                this.I$0 = iOLrzqt;
                this.label = 3;
                obj = ssy3.KWHzl(launchUrlData2, notificationType, this);
                if (obj != objCopydefault) {
                    return objCopydefault;
                }
                str = strKWHzl;
                str2 = strCopydefault2;
                str3 = strCopydefault3;
                i = iOLrzqt;
                ssy = sSY.AEQbTJ;
                String strCopydefault4 = ssy.copydefault(this.$launchUrlData, (OKConversation) obj);
                if (ssy.copydefault(this.$notificationData)) {
                }
                C37207opV c37207opV2 = C37207opV.copydefault;
                rXQ.Activity.showSystemNotification$default(c37207opV2.AYXKKw(), "okex_im_message_v2", c37207opV2.AEQbTJ(), i, str2, str3, str, false, null, strCopydefault4, true, false, 128, null);
                return Unit.INSTANCE;
            }
            sibCopydefault = (sIB) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        ContactEntity contactEntity3 = (ContactEntity) obj;
        sSY ssy4 = sSY.AEQbTJ;
        List<String> atTargetUids = this.$launchUrlData.getAtTargetUids();
        this.L$0 = contactEntity3;
        this.label = 2;
        Object objKWHzl = ssy4.KWHzl(sibCopydefault, atTargetUids, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        contactEntity = contactEntity3;
        obj = objKWHzl;
        Map<String, String> map2 = (Map) obj;
        sSY ssy32 = sSY.AEQbTJ;
        int iOLrzqt2 = ssy32.OLrzqt(this.$launchUrlData.getConversationId(), C33129mqd.AhwBna(this.$notificationData.getSeq()));
        LaunchUrlData launchUrlData3 = this.$launchUrlData;
        NotificationType notificationType2 = NotificationType.MESSAGE;
        String strCopydefault22 = ssy32.copydefault(launchUrlData3, notificationType2);
        String strCopydefault32 = ssy32.copydefault(contactEntity, this.$notification, notificationType2, this.$launchUrlData);
        String strKWHzl2 = ssy32.KWHzl(this.$launchUrlData, contactEntity, map2, this.$notificationData, this.$notification);
        LaunchUrlData launchUrlData22 = this.$launchUrlData;
        this.L$0 = strCopydefault22;
        this.L$1 = strCopydefault32;
        this.L$2 = strKWHzl2;
        this.I$0 = iOLrzqt2;
        this.label = 3;
        obj = ssy32.KWHzl(launchUrlData22, notificationType2, this);
        if (obj != objCopydefault) {
        }
    }
}
