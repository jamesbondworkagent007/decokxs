package o;

import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.ok_kyc_core.notification.RecallNotificationType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rDX extends android.content.BroadcastReceiver {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return C52761wXj.TaskDescription.iqeXgQ;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rDX.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull android.content.Context context, @NotNull android.content.Intent intent) {
        RecallNotificationType recallNotificationType;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        if (Build.VERSION.SDK_INT >= 33) {
            recallNotificationType = (RecallNotificationType) intent.getParcelableExtra("extra_notification_type", RecallNotificationType.class);
        } else {
            recallNotificationType = (RecallNotificationType) intent.getParcelableExtra("extra_notification_type");
        }
        if (recallNotificationType == null) {
            recallNotificationType = RecallNotificationType.UNKNOWN;
        }
        pUU.EZpvd("RecallReceiver", "Received notification trigger | type: " + recallNotificationType.getValue());
        OLrzqt(context, recallNotificationType);
    }

    public final void OLrzqt(android.content.Context context, RecallNotificationType recallNotificationType) {
        android.net.Uri uri;
        java.lang.Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        Intrinsics.copydefault(systemService, "");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
            android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m("kyc_recall_channel", "KYC Reminders", 4);
            notificationChannelM.setDescription("Reminders to complete your KYC verification");
            notificationChannelM.enableVibration(true);
            notificationChannelM.enableLights(true);
            notificationManager.createNotificationChannel(notificationChannelM);
        }
        if (recallNotificationType == RecallNotificationType.UNKNOWN) {
            uri = android.net.Uri.parse("okx://app/kyc");
        } else {
            uri = android.net.Uri.parse("okx://app/kyc?" + recallNotificationType.getDeeplinkParam().getParam() + "=true");
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.setFlags(335544320);
        try {
            Intrinsics.copydefault(intent.setClassName(context, "com.okinc.okex.deeplink.SchemeActivity"));
        } catch (java.lang.Exception e) {
            pUU.valueOf("RecallReceiver", "SchemeActivity not found: " + e.getMessage());
        }
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 20001, intent, 201326592);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C43662rtX.Dialog.DCUTEI);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C43662rtX.Dialog.getPostValueLengthLimit);
        android.app.Notification notificationBuild = new NotificationCompat.Builder(context, "kyc_recall_channel").setSmallIcon(OLrzqt()).setContentTitle(strAYXKKw).setContentText(strAYXKKw2).setStyle(new NotificationCompat.BigTextStyle().bigText(strAYXKKw2)).setPriority(1).setAutoCancel(true).setContentIntent(activity).setDefaults(-1).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
        notificationManager.notify(20001, notificationBuild);
        pUU.KWHzl("RecallReceiver", "Notification displayed | type: " + recallNotificationType.getValue());
    }
}
