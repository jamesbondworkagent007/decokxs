package com.onesignal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.OneSignal;
import java.util.Set;
import o.C57740yoC;
import o.C57746yoI;
import o.C57789yoz;
import o.C57826ypj;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OSNotificationWorkManager {
    public static Set<String> KWHzl = OSUtils.AuCTel();

    public static boolean KWHzl(String str) {
        if (!OSUtils.EZpvd(str)) {
            return true;
        }
        if (KWHzl.contains(str)) {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
            return false;
        }
        KWHzl.add(str);
        return true;
    }

    public static void EZpvd(String str) {
        if (OSUtils.EZpvd(str)) {
            KWHzl.remove(str);
        }
    }

    public static void copydefault(Context context, String str, int i, String str2, long j, boolean z, boolean z2) {
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(NotificationWorker.class).setInputData(new Data.Builder().putInt("android_notif_id", i).putString("json_payload", str2).putLong("timestamp", j).putBoolean("is_restoring", z).build()).build();
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        C57826ypj.OLrzqt(context).enqueueUniqueWork(str, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
    }

    public static class NotificationWorker extends Worker {
        public NotificationWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.Result doWork() {
            Data inputData = getInputData();
            try {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "NotificationWorker running doWork with data: " + inputData);
                AEQbTJ(getApplicationContext(), inputData.getInt("android_notif_id", 0), new JSONObject(inputData.getString("json_payload")), inputData.getBoolean("is_restoring", false), Long.valueOf(inputData.getLong("timestamp", System.currentTimeMillis() / 1000)));
                return ListenableWorker.Result.success();
            } catch (JSONException e) {
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.ERROR, "Error occurred doing work for job with id: " + getId().toString());
                e.printStackTrace();
                return ListenableWorker.Result.failure();
            }
        }

        public final void AEQbTJ(Context context, int i, JSONObject jSONObject, boolean z, Long l) {
            C57789yoz c57789yoz = new C57789yoz(null, jSONObject, i);
            C57746yoI c57746yoI = new C57746yoI(new C57740yoC(context, c57789yoz, jSONObject, z, true, l), c57789yoz);
            OneSignal.SharedElementCallback sharedElementCallback = OneSignal.finit;
            if (sharedElementCallback != null) {
                try {
                    sharedElementCallback.remoteNotificationReceived(context, c57746yoI);
                    return;
                } catch (Throwable th) {
                    OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    c57746yoI.EZpvd(c57789yoz);
                    throw th;
                }
            }
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
            c57746yoI.EZpvd(c57789yoz);
        }
    }
}
