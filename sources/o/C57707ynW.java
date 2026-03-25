package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OneSignal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57707ynW {
    public static void AEQbTJ(android.content.Context context, InterfaceC57833ypq interfaceC57833ypq, int i) {
        android.database.Cursor cursorKWHzl = interfaceC57833ypq.KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"group_id"}, "android_notification_id = " + i, null, null, null, null);
        if (cursorKWHzl.moveToFirst()) {
            java.lang.String string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("group_id"));
            cursorKWHzl.close();
            if (string != null) {
                KWHzl(context, interfaceC57833ypq, string, true);
                return;
            }
            return;
        }
        cursorKWHzl.close();
    }

    public static void KWHzl(android.content.Context context, InterfaceC57833ypq interfaceC57833ypq, java.lang.String str, boolean z) {
        try {
            android.database.Cursor cursorCopydefault = copydefault(context, interfaceC57833ypq, str, z);
            if (cursorCopydefault == null || cursorCopydefault.isClosed()) {
                return;
            }
            cursorCopydefault.close();
        } catch (java.lang.Throwable th) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }

    public static android.database.Cursor copydefault(android.content.Context context, InterfaceC57833ypq interfaceC57833ypq, java.lang.String str, boolean z) {
        android.database.Cursor cursorKWHzl = interfaceC57833ypq.KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new java.lang.String[]{str}, null, null, "_id DESC");
        int count = cursorKWHzl.getCount();
        if (count == 0 && !str.equals(C57836ypt.OLrzqt())) {
            cursorKWHzl.close();
            java.lang.Integer numEZpvd = EZpvd(interfaceC57833ypq, str);
            if (numEZpvd == null) {
                return cursorKWHzl;
            }
            C57836ypt.KWHzl(context).cancel(numEZpvd.intValue());
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(z ? "dismissed" : "opened", (java.lang.Integer) 1);
            interfaceC57833ypq.AEQbTJ(RemoteMessageConst.NOTIFICATION, contentValues, "android_notification_id = " + numEZpvd, null);
            return cursorKWHzl;
        }
        if (count == 1) {
            cursorKWHzl.close();
            if (EZpvd(interfaceC57833ypq, str) == null) {
                return cursorKWHzl;
            }
            EZpvd(context, str);
            return cursorKWHzl;
        }
        try {
            cursorKWHzl.moveToFirst();
            long j = cursorKWHzl.getLong(cursorKWHzl.getColumnIndex("created_time"));
            java.lang.String string = cursorKWHzl.getString(cursorKWHzl.getColumnIndex("full_data"));
            cursorKWHzl.close();
            if (EZpvd(interfaceC57833ypq, str) == null) {
                return cursorKWHzl;
            }
            C57745yoH c57745yoH = new C57745yoH(context);
            c57745yoH.OLrzqt(true);
            c57745yoH.copydefault(java.lang.Long.valueOf(j));
            c57745yoH.AEQbTJ(new JSONObject(string));
            C57729yns.EZpvd(c57745yoH);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return cursorKWHzl;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, IF, INVOKE] complete} */
    public static void EZpvd(android.content.Context context, java.lang.String str) {
        java.lang.String[] strArr = {str};
        android.database.Cursor cursorKWHzl = null;
        try {
            cursorKWHzl = C57830ypn.KWHzl(context).KWHzl(RemoteMessageConst.NOTIFICATION, OSNotificationRestoreWorkManager.OLrzqt, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, null, null, null);
            OSNotificationRestoreWorkManager.EZpvd(context, cursorKWHzl, 0);
            if (cursorKWHzl == null || cursorKWHzl.isClosed()) {
            }
        } catch (java.lang.Throwable th) {
            try {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error restoring notification records! ", th);
            } finally {
                if (cursorKWHzl != null && !cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [189=4, 190=4] */
    public static java.lang.Integer EZpvd(InterfaceC57833ypq interfaceC57833ypq, java.lang.String str) {
        java.lang.Throwable th;
        java.lang.Integer num;
        android.database.Cursor cursorKWHzl;
        android.database.Cursor cursor = null;
        try {
            cursorKWHzl = interfaceC57833ypq.KWHzl(RemoteMessageConst.NOTIFICATION, new java.lang.String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new java.lang.String[]{str}, null, null, null);
        } catch (java.lang.Throwable th2) {
            th = th2;
            num = null;
        }
        try {
            if (!cursorKWHzl.moveToFirst()) {
                cursorKWHzl.close();
                if (!cursorKWHzl.isClosed()) {
                    cursorKWHzl.close();
                }
                return null;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(cursorKWHzl.getInt(cursorKWHzl.getColumnIndex("android_notification_id")));
            cursorKWHzl.close();
            if (cursorKWHzl.isClosed()) {
                return numValueOf;
            }
            cursorKWHzl.close();
            return numValueOf;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = cursorKWHzl;
            num = null;
            try {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error getting android notification id for summary notification group: " + str, th);
                return num;
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    public static void EZpvd(android.content.Context context, C57830ypn c57830ypn, java.lang.String str) {
        java.lang.Integer numEZpvd = EZpvd(c57830ypn, str);
        boolean zEquals = str.equals(C57836ypt.OLrzqt());
        android.app.NotificationManager notificationManagerKWHzl = C57836ypt.KWHzl(context);
        java.lang.Integer numAEQbTJ = C57836ypt.AEQbTJ(c57830ypn, str, zEquals);
        if (numAEQbTJ != null) {
            if (!OneSignal.uzCIH()) {
                OneSignal.AEQbTJ(numAEQbTJ.intValue());
                return;
            }
            if (zEquals) {
                numEZpvd = java.lang.Integer.valueOf(C57836ypt.KWHzl());
            }
            if (numEZpvd != null) {
                notificationManagerKWHzl.cancel(numEZpvd.intValue());
            }
        }
    }
}
