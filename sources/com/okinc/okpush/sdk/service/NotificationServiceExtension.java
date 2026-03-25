package com.okinc.okpush.sdk.service;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okpush.sdk.service.NotificationServiceExtension;
import com.okinc.okpush.sdk.utils.NotificationChannel;
import com.onesignal.OneSignal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C32866mlf;
import o.C32979mnm;
import o.C46914tgE;
import o.C46923tgN;
import o.C46934tgY;
import o.C46937tgb;
import o.C46952tgq;
import o.C46953tgr;
import o.C46954tgs;
import o.C46989tha;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C57739yoB;
import o.C57746yoI;
import o.C57789yoz;
import o.InterfaceC46949tgn;
import o.pUU;
import o.xVV;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class NotificationServiceExtension implements OneSignal.SharedElementCallback {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final CoroutineScope KWHzl = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));

    @Override // com.onesignal.OneSignal.SharedElementCallback
    public void remoteNotificationReceived(Context context, C57746yoI c57746yoI) {
        C57789yoz c57789yozKWHzl;
        if (c57746yoI == null || (c57789yozKWHzl = c57746yoI.KWHzl()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.KWHzl, null, null, new AnonymousClass1(context, c57746yoI, c57789yozKWHzl, c57789yozKWHzl.gEmmrt(), null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.okpush.sdk.service.NotificationServiceExtension$remoteNotificationReceived$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ C57789yoz $notification;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ C57746yoI $notificationReceivedEvent;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, C57746yoI c57746yoI, C57789yoz c57789yoz, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$notificationReceivedEvent = c57746yoI;
            this.$notification = c57789yoz;
            this.$notificationId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotificationServiceExtension.this.new AnonymousClass1(this.$context, this.$notificationReceivedEvent, this.$notification, this.$notificationId, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                NotificationServiceExtension notificationServiceExtension = NotificationServiceExtension.this;
                Context context = this.$context;
                C57746yoI c57746yoI = this.$notificationReceivedEvent;
                C57789yoz c57789yoz = this.$notification;
                String str = this.$notificationId;
                Intrinsics.copydefault((Object) str);
                this.label = 1;
                if (notificationServiceExtension.OLrzqt(context, c57746yoI, c57789yoz, str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x0041, B:27:0x0074, B:29:0x007d, B:31:0x0083, B:35:0x00b2, B:38:0x00b9, B:42:0x00c3, B:44:0x00db, B:46:0x00f5, B:50:0x0107, B:52:0x011d, B:54:0x0122, B:56:0x0128, B:60:0x0130, B:61:0x0132, B:63:0x0136, B:65:0x0175, B:67:0x017d, B:69:0x0181, B:70:0x0196, B:71:0x019d), top: B:83:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x0041, B:27:0x0074, B:29:0x007d, B:31:0x0083, B:35:0x00b2, B:38:0x00b9, B:42:0x00c3, B:44:0x00db, B:46:0x00f5, B:50:0x0107, B:52:0x011d, B:54:0x0122, B:56:0x0128, B:60:0x0130, B:61:0x0132, B:63:0x0136, B:65:0x0175, B:67:0x017d, B:69:0x0181, B:70:0x0196, B:71:0x019d), top: B:83:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Context context, C57746yoI c57746yoI, C57789yoz c57789yoz, String str, Continuation<? super Unit> continuation) throws Throwable {
        NotificationServiceExtension$processNotification$1 notificationServiceExtension$processNotification$1;
        C57746yoI c57746yoI2;
        C57789yoz c57789yoz2;
        final C57789yoz c57789yoz3;
        Context context2;
        Object objAEQbTJ;
        NotificationServiceExtension notificationServiceExtension;
        C46953tgr c46953tgrOLrzqt;
        String str2 = str;
        if (continuation instanceof NotificationServiceExtension$processNotification$1) {
            notificationServiceExtension$processNotification$1 = (NotificationServiceExtension$processNotification$1) continuation;
            int i = notificationServiceExtension$processNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationServiceExtension$processNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationServiceExtension$processNotification$1 = new NotificationServiceExtension$processNotification$1(this, continuation);
            }
        }
        Object obj = notificationServiceExtension$processNotification$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = notificationServiceExtension$processNotification$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                notificationServiceExtension$processNotification$1.L$0 = this;
                context2 = context;
                notificationServiceExtension$processNotification$1.L$1 = context2;
                c57746yoI2 = c57746yoI;
                try {
                    notificationServiceExtension$processNotification$1.L$2 = c57746yoI2;
                    c57789yoz2 = c57789yoz;
                    try {
                        notificationServiceExtension$processNotification$1.L$3 = c57789yoz2;
                        notificationServiceExtension$processNotification$1.L$4 = str2;
                        notificationServiceExtension$processNotification$1.label = 1;
                        objAEQbTJ = AEQbTJ(str2, notificationServiceExtension$processNotification$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        c57789yoz3 = c57789yoz2;
                        notificationServiceExtension = this;
                        if (!((Boolean) objAEQbTJ).booleanValue()) {
                        }
                    } catch (Exception e) {
                        e = e;
                        c57789yoz3 = c57789yoz2;
                        pUU.AEQbTJ("NotificationServiceExtension", "Error processing notification: " + e.getMessage(), e);
                        c57746yoI2.EZpvd(c57789yoz3.values());
                    }
                } catch (Exception e2) {
                    e = e2;
                    c57789yoz2 = c57789yoz;
                    c57789yoz3 = c57789yoz2;
                    pUU.AEQbTJ("NotificationServiceExtension", "Error processing notification: " + e.getMessage(), e);
                    c57746yoI2.EZpvd(c57789yoz3.values());
                    return Unit.INSTANCE;
                }
            } catch (Exception e3) {
                e = e3;
                c57746yoI2 = c57746yoI;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) notificationServiceExtension$processNotification$1.L$4;
            c57789yoz3 = (C57789yoz) notificationServiceExtension$processNotification$1.L$3;
            c57746yoI2 = (C57746yoI) notificationServiceExtension$processNotification$1.L$2;
            Context context3 = (Context) notificationServiceExtension$processNotification$1.L$1;
            NotificationServiceExtension notificationServiceExtension2 = (NotificationServiceExtension) notificationServiceExtension$processNotification$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                context2 = context3;
                notificationServiceExtension = notificationServiceExtension2;
                if (!((Boolean) objAEQbTJ).booleanValue()) {
                    c57746yoI2.EZpvd(null);
                    return Unit.INSTANCE;
                }
                C32979mnm c32979mnm = C32979mnm.EZpvd;
                xVV.EZpvd(c32979mnm.OLrzqt());
                notificationServiceExtension.OLrzqt(c57746yoI2);
                pUU.KWHzl("NotificationServiceExtension", "dispatchPushMessage notification: " + c57789yoz3);
                C46934tgY c46934tgY = C46934tgY.AEQbTJ;
                NotificationChannel notificationChannel = NotificationChannel.OneSignalFCM;
                String strDbNXlk = c57789yoz3.DbNXlk();
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                String strEZpvd = c57789yoz3.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                String strAYXKKw = c57789yoz3.AYXKKw();
                c46934tgY.OLrzqt(notificationChannel, new C46914tgE(str2, strDbNXlk, strEZpvd, strAYXKKw == null ? "" : strAYXKKw));
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                C46952tgq c46952tgqOLrzqt = notificationServiceExtension.OLrzqt(c57789yoz3);
                if (c46952tgqOLrzqt != null) {
                    pUU.KWHzl("NotificationServiceExtension", "dispatchPushMessage message: " + c46952tgqOLrzqt);
                    String strAEQbTJ = c46952tgqOLrzqt.AEQbTJ();
                    if (strAEQbTJ != null) {
                        objectRef.element = c46952tgqOLrzqt.copydefault();
                        InterfaceC46949tgn interfaceC46949tgnCopydefault = C46954tgs.OLrzqt.copydefault(strAEQbTJ);
                        pUU.KWHzl("NotificationServiceExtension", "OKPushListener is null : " + (interfaceC46949tgnCopydefault == null));
                        if (interfaceC46949tgnCopydefault != null) {
                            interfaceC46949tgnCopydefault.copydefault(c46952tgqOLrzqt);
                        }
                        if (interfaceC46949tgnCopydefault != null && (c46953tgrOLrzqt = interfaceC46949tgnCopydefault.OLrzqt()) != null && c46953tgrOLrzqt.KWHzl()) {
                            z = false;
                        }
                        booleanRef.element = z;
                    }
                }
                if (booleanRef.element) {
                    final PendingIntent pendingIntentCreateDeepLinkPendingIntent$default = C46989tha.createDeepLinkPendingIntent$default(C46989tha.copydefault, c32979mnm.OLrzqt(), (String) objectRef.element, 0, 4, null);
                    pUU.KWHzl("NotificationServiceExtension", "remoteNotificationReceived-> Show Default Notification: " + c57789yoz3);
                    C57739yoB c57739yoBValues = c57789yoz3.values();
                    Intrinsics.checkNotNullExpressionValue(c57739yoBValues, "");
                    c57739yoBValues.EZpvd(new NotificationCompat.Extender() { // from class: o.tgS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // androidx.core.app.NotificationCompat.Extender
                        public final NotificationCompat.Builder extend(NotificationCompat.Builder builder) {
                            return NotificationServiceExtension.KWHzl(c57789yoz3, pendingIntentCreateDeepLinkPendingIntent$default, builder);
                        }
                    });
                    JSONObject jSONObjectKWHzl = c57789yoz3.KWHzl();
                    String strOptString = jSONObjectKWHzl != null ? jSONObjectKWHzl.optString("url") : null;
                    OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
                    if (strOptString == null) {
                        strOptString = " remote notification received router is null, notificationId: " + c57789yoz3.copydefault();
                    }
                    OneSignal.AEQbTJ(log_level, strOptString);
                    c57746yoI2.EZpvd(c57739yoBValues);
                } else {
                    pUU.KWHzl("NotificationServiceExtension", "remoteNotificationReceived-> Notification handled by OKPushListener in OKPushListenerRegistry, notificationId: " + c57789yoz3.copydefault());
                    c57746yoI2.EZpvd(null);
                    c57746yoI2.AEQbTJ(context2, c57789yoz3.gEmmrt());
                }
            } catch (Exception e4) {
                e = e4;
                pUU.AEQbTJ("NotificationServiceExtension", "Error processing notification: " + e.getMessage(), e);
                c57746yoI2.EZpvd(c57789yoz3.values());
            }
        }
        return Unit.INSTANCE;
    }

    public static final NotificationCompat.Builder KWHzl(C57789yoz c57789yoz, PendingIntent pendingIntent, NotificationCompat.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        builder.setContentTitle(c57789yoz.DbNXlk());
        builder.setContentText(c57789yoz.EZpvd());
        builder.setCategory("msg");
        builder.setPriority(2);
        builder.setContentIntent(pendingIntent);
        return builder;
    }

    public final void OLrzqt(C57746yoI c57746yoI) {
        if (c57746yoI != null) {
            try {
                final C57789yoz c57789yozKWHzl = c57746yoI.KWHzl();
                if (c57789yozKWHzl != null) {
                    C32866mlf.onEvent$default("Notification_Push_Receive_Hover", (TrackChannel[]) null, new Function1() { // from class: o.tgO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return NotificationServiceExtension.AEQbTJ(c57789yozKWHzl, (EventParamsList) obj);
                        }
                    }, 1, (Object) null);
                }
            } catch (Exception e) {
                pUU.AEQbTJ("NotificationServiceExtension", "Failed logging Notification_Push_Receive_Hover event", e);
            }
        }
    }

    public static final Unit AEQbTJ(C57789yoz c57789yoz, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "source", "OneSignal", false, 4, null);
        String strGEmmrt = c57789yoz.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
        EventParamsList.put$default(eventParamsList, MTPushConstants.Message.KEY_NOTIFICATION_ID, strGEmmrt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "android_notification_id", String.valueOf(c57789yoz.copydefault()), false, 4, null);
        String strAYXKKw = c57789yoz.AYXKKw();
        Intrinsics.checkNotNullExpressionValue(strAYXKKw, "");
        EventParamsList.put$default(eventParamsList, "template_id", strAYXKKw, false, 4, null);
        String strFetchVPNInfo = c57789yoz.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(strFetchVPNInfo, "");
        EventParamsList.put$default(eventParamsList, "template_name", strFetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sent_time", String.valueOf(c57789yoz.djBIcL()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Continuation<? super Boolean> continuation) throws Throwable {
        NotificationServiceExtension$isDuplicateNotification$1 notificationServiceExtension$isDuplicateNotification$1;
        if (continuation instanceof NotificationServiceExtension$isDuplicateNotification$1) {
            notificationServiceExtension$isDuplicateNotification$1 = (NotificationServiceExtension$isDuplicateNotification$1) continuation;
            int i = notificationServiceExtension$isDuplicateNotification$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationServiceExtension$isDuplicateNotification$1.label = i - Integer.MIN_VALUE;
            } else {
                notificationServiceExtension$isDuplicateNotification$1 = new NotificationServiceExtension$isDuplicateNotification$1(this, continuation);
            }
        }
        Object objKWHzl = notificationServiceExtension$isDuplicateNotification$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = notificationServiceExtension$isDuplicateNotification$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (!C46937tgb.OLrzqt.KWHzl()) {
                return C56443yFo.KWHzl(false);
            }
            C46923tgN c46923tgN = C46923tgN.KWHzl;
            notificationServiceExtension$isDuplicateNotification$1.label = 1;
            objKWHzl = c46923tgN.KWHzl(str, notificationServiceExtension$isDuplicateNotification$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return C56443yFo.KWHzl(!((Boolean) objKWHzl).booleanValue());
    }

    public final C46952tgq OLrzqt(C57789yoz c57789yoz) {
        JSONObject jSONObjectKWHzl;
        try {
            pUU.KWHzl("NotificationServiceExtension", "parserMsg notification: " + c57789yoz);
            if (c57789yoz == null || (jSONObjectKWHzl = c57789yoz.KWHzl()) == null) {
                return null;
            }
            return new C46952tgq(jSONObjectKWHzl.optString("link"), jSONObjectKWHzl.optString("data"), c57789yoz.DbNXlk(), c57789yoz.EZpvd(), c57789yoz.AEQbTJ(), c57789yoz.AhwBna());
        } catch (Exception e) {
            pUU.AEQbTJ("NotificationServiceExtension", e);
            return null;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpush.sdk.service.NotificationServiceExtension.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
