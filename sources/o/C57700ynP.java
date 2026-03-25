package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OneSignal;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.ynP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57700ynP {
    public static final java.lang.String AEQbTJ = java.lang.Integer.toString(49);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String AEQbTJ() {
        return AEQbTJ;
    }

    public static int KWHzl() {
        return 49;
    }

    public static void OLrzqt(android.content.Context context, int i) {
        try {
            EZpvd(context, i);
        } catch (java.lang.Throwable unused) {
            KWHzl(context, i);
        }
    }

    public static void EZpvd(android.content.Context context, int i) throws java.lang.Throwable {
        android.service.notification.StatusBarNotification[] statusBarNotificationArrOLrzqt = C57836ypt.OLrzqt(context);
        int length = (statusBarNotificationArrOLrzqt.length - KWHzl()) + i;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (android.service.notification.StatusBarNotification statusBarNotification : statusBarNotificationArrOLrzqt) {
            if (!copydefault(statusBarNotification)) {
                treeMap.put(java.lang.Long.valueOf(statusBarNotification.getNotification().when), java.lang.Integer.valueOf(statusBarNotification.getId()));
            }
        }
        java.util.Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            OneSignal.AEQbTJ(((java.lang.Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [110=4] */
    public static void KWHzl(android.content.Context context, int i) {
        C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(context);
        android.database.Cursor cursorCopydefault = null;
        try {
            cursorCopydefault = c57830ypnKWHzl.copydefault(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"android_notification_id"}, C57830ypn.AEQbTJ().toString(), null, null, null, "_id", AEQbTJ() + i);
            int count = (cursorCopydefault.getCount() - KWHzl()) + i;
            if (count < 1) {
                if (cursorCopydefault.isClosed()) {
                    return;
                }
                cursorCopydefault.close();
            } else {
                while (cursorCopydefault.moveToNext()) {
                    OneSignal.AEQbTJ(cursorCopydefault.getInt(cursorCopydefault.getColumnIndex("android_notification_id")));
                    count--;
                    if (count <= 0) {
                        break;
                    }
                }
                if (cursorCopydefault.isClosed()) {
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error clearing oldest notifications over limit! ", th);
            } finally {
                if (cursorCopydefault != null && !cursorCopydefault.isClosed()) {
                    cursorCopydefault.close();
                }
            }
        }
    }

    public static boolean copydefault(android.service.notification.StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
