package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.OneSignal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import o.C57700ynP;
import o.C57719yni;
import o.C57826ypj;
import o.C57830ypn;
import o.C57836ypt;

/* JADX INFO: loaded from: classes12.dex */
public class OSNotificationRestoreWorkManager {
    public static boolean KWHzl;
    public static final String[] OLrzqt = {MTPushConstants.Message.KEY_NOTIFICATION_ID, "android_notification_id", "full_data", "created_time"};
    public static final String EZpvd = NotificationRestoreWorker.class.getCanonicalName();

    public static void OLrzqt(Context context, boolean z) {
        C57826ypj.OLrzqt(context).enqueueUniqueWork(EZpvd, ExistingWorkPolicy.KEEP, new OneTimeWorkRequest.Builder(NotificationRestoreWorker.class).setInitialDelay(z ? 15 : 0, TimeUnit.SECONDS).build());
    }

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() {
            Context applicationContext = getApplicationContext();
            if (OneSignal.AEQbTJ == null) {
                OneSignal.fetchVPNInfo(applicationContext);
            }
            if (!OSUtils.AEQbTJ(applicationContext)) {
                return ListenableWorker.Result.failure();
            }
            if (OSNotificationRestoreWorkManager.KWHzl) {
                return ListenableWorker.Result.failure();
            }
            OSNotificationRestoreWorkManager.KWHzl = true;
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Restoring notifications");
            C57830ypn c57830ypnKWHzl = C57830ypn.KWHzl(applicationContext);
            StringBuilder sbAEQbTJ = C57830ypn.AEQbTJ();
            OSNotificationRestoreWorkManager.EZpvd(applicationContext, sbAEQbTJ);
            OSNotificationRestoreWorkManager.OLrzqt(applicationContext, c57830ypnKWHzl, sbAEQbTJ);
            return ListenableWorker.Result.success();
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, IF, INVOKE] complete} */
    public static void OLrzqt(Context context, C57830ypn c57830ypn, StringBuilder sb) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursorCopydefault = null;
        try {
            cursorCopydefault = c57830ypn.copydefault(RemoteMessageConst.NOTIFICATION, OLrzqt, sb.toString(), null, null, null, "_id DESC", C57700ynP.AEQbTJ);
            EZpvd(context, cursorCopydefault, 200);
            C57719yni.EZpvd(c57830ypn, context);
            if (cursorCopydefault == null || cursorCopydefault.isClosed()) {
            }
        } catch (Throwable th) {
            try {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error restoring notification records! ", th);
            } finally {
                if (cursorCopydefault != null && !cursorCopydefault.isClosed()) {
                    cursorCopydefault.close();
                }
            }
        }
    }

    public static void EZpvd(Context context, StringBuilder sb) {
        StatusBarNotification[] statusBarNotificationArrOLrzqt = C57836ypt.OLrzqt(context);
        if (statusBarNotificationArrOLrzqt.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrOLrzqt) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        sb.append(" AND android_notification_id NOT IN (");
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
    }

    public static void EZpvd(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.copydefault(context, cursor.getString(cursor.getColumnIndex(MTPushConstants.Message.KEY_NOTIFICATION_ID)), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i > 0) {
                    OSUtils.OLrzqt(i);
                }
            } while (cursor.moveToNext());
        }
    }
}
