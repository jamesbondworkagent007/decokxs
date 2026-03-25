package com.okinc.im.imui.pushnotification.handler;

import android.os.Handler;
import android.os.Looper;
import com.okinc.im.imui.pushnotification.handler.PushNotificationHandler$dispatchWSPushNotification$2;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C32986mnt;
import o.C37207opV;
import o.C44364sNb;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rXQ;
import o.sMY;
import o.sSY;
import o.xVV;

/* JADX INFO: loaded from: classes8.dex */
public final class PushNotificationHandler$dispatchWSPushNotification$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isFiltered;
    final /* synthetic */ C44364sNb $notification;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationHandler$dispatchWSPushNotification$2(C44364sNb c44364sNb, boolean z, Continuation<? super PushNotificationHandler$dispatchWSPushNotification$2> continuation) {
        super(2, continuation);
        this.$notification = c44364sNb;
        this.$isFiltered = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PushNotificationHandler$dispatchWSPushNotification$2(this.$notification, this.$isFiltered, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PushNotificationHandler$dispatchWSPushNotification$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        String str;
        final String str2;
        int i2;
        String str3;
        String str4;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            int iOLrzqt = this.$notification.OLrzqt();
            OKConversation oKConversationCopydefault = this.$notification.copydefault();
            String targetId = oKConversationCopydefault != null ? oKConversationCopydefault.getTargetId() : null;
            String strEZpvd = sSY.AEQbTJ.EZpvd(this.$notification.copydefault());
            pUU.KWHzl("PushNotificationHandler", "notifyId=" + iOLrzqt + ", notifyGroupId=" + targetId);
            if (C32986mnt.EZpvd.valueOf()) {
                pUU.KWHzl("PushNotificationHandler", "app in foreground, set unread count from conversation manager");
                C37207opV c37207opV = C37207opV.copydefault;
                this.L$0 = targetId;
                this.L$1 = strEZpvd;
                this.I$0 = iOLrzqt;
                this.label = 1;
                if (c37207opV.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = iOLrzqt;
                str3 = targetId;
                str4 = strEZpvd;
            } else {
                pUU.KWHzl("PushNotificationHandler", "app in background, increase badge count");
                xVV.EZpvd(C32979mnm.EZpvd.OLrzqt());
                i = iOLrzqt;
                str = targetId;
                str2 = strEZpvd;
                if (!this.$isFiltered) {
                    return Unit.INSTANCE;
                }
                sMY smyOLrzqt = sSY.AEQbTJ.OLrzqt();
                if (Intrinsics.EZpvd(smyOLrzqt, sMY.Activity.OLrzqt) && C32986mnt.EZpvd.valueOf()) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final C44364sNb c44364sNb = this.$notification;
                    handler.post(new Runnable() { // from class: o.opZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            PushNotificationHandler$dispatchWSPushNotification$2.invokeSuspend$lambda$0(c44364sNb, str2);
                        }
                    });
                } else if (Intrinsics.EZpvd(smyOLrzqt, sMY.StateListAnimator.KWHzl)) {
                    C37207opV c37207opV2 = C37207opV.copydefault;
                    rXQ.Activity.showSystemNotification$default(c37207opV2.AYXKKw(), "okex_im_message_v2", c37207opV2.AEQbTJ(), i, str, this.$notification.EZpvd(), this.$notification.KWHzl(), this.$notification.AEQbTJ(), null, str2, true, false, 128, null);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$0;
            str4 = (String) this.L$1;
            str3 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        i = i2;
        str2 = str4;
        str = str3;
        if (!this.$isFiltered) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C44364sNb c44364sNb, String str) {
        C37207opV.copydefault.AYXKKw().AEQbTJ(c44364sNb.EZpvd(), c44364sNb.KWHzl(), str);
    }
}
