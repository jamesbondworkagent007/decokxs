package o;

import android.app.Notification;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: renamed from: o.ypt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57836ypt {
    public static int KWHzl() {
        return -718463522;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String OLrzqt() {
        return "os_group_undefined";
    }

    public static android.app.NotificationManager KWHzl(android.content.Context context) {
        return (android.app.NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
    }

    public static java.lang.Integer AEQbTJ(android.content.Context context) {
        int i = 0;
        for (android.service.notification.StatusBarNotification statusBarNotification : OLrzqt(context)) {
            if (!NotificationCompat.isGroupSummary(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    public static android.service.notification.StatusBarNotification[] OLrzqt(android.content.Context context) {
        android.service.notification.StatusBarNotification[] statusBarNotificationArr = new android.service.notification.StatusBarNotification[0];
        try {
            return KWHzl(context).getActiveNotifications();
        } catch (java.lang.Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public static java.util.ArrayList<android.service.notification.StatusBarNotification> EZpvd(android.content.Context context) {
        java.util.ArrayList<android.service.notification.StatusBarNotification> arrayList = new java.util.ArrayList<>();
        for (android.service.notification.StatusBarNotification statusBarNotification : OLrzqt(context)) {
            android.app.Notification notification = statusBarNotification.getNotification();
            boolean zCopydefault = C57700ynP.copydefault(statusBarNotification);
            boolean z = notification.getGroup() == null || notification.getGroup().equals(OLrzqt());
            if (!zCopydefault && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public static void copydefault(android.content.Context context, java.util.ArrayList<android.service.notification.StatusBarNotification> arrayList) {
        for (android.service.notification.StatusBarNotification statusBarNotification : arrayList) {
            NotificationManagerCompat.from(context).notify(statusBarNotification.getId(), Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    public static java.lang.Integer AEQbTJ(C57830ypn c57830ypn, java.lang.String str, boolean z) {
        android.database.Cursor cursorCopydefault = c57830ypn.copydefault(RemoteMessageConst.NOTIFICATION, null, (z ? "group_id IS NULL" : "group_id = ?") + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z ? null : new java.lang.String[]{str}, null, null, "created_time DESC", "1");
        if (!cursorCopydefault.moveToFirst()) {
            cursorCopydefault.close();
            return null;
        }
        int i = cursorCopydefault.getInt(cursorCopydefault.getColumnIndex("android_notification_id"));
        cursorCopydefault.close();
        return java.lang.Integer.valueOf(i);
    }

    public static boolean KWHzl(android.content.Context context, java.lang.String str) {
        if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        android.app.NotificationChannel notificationChannel = KWHzl(context).getNotificationChannel(str);
        return notificationChannel == null || notificationChannel.getImportance() != 0;
    }
}
