package o;

import android.app.job.JobInfo;
import androidx.core.app.NotificationCompat;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import o.C57720ynj;

/* JADX INFO: renamed from: o.yoa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57764yoa {
    public static final java.lang.Object EZpvd = new java.lang.Object();
    public java.lang.Thread OLrzqt;
    public boolean copydefault = false;

    public static boolean AEQbTJ() {
        return true;
    }

    public abstract java.lang.String EZpvd();

    public abstract int KWHzl();

    public abstract java.lang.Class OLrzqt();

    public abstract java.lang.Class copydefault();

    public void OLrzqt(android.content.Context context, java.lang.Runnable runnable) {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "OSBackground sync, calling initWithContext");
        OneSignal.fetchVPNInfo(context);
        java.lang.Thread thread = new java.lang.Thread(runnable, EZpvd());
        this.OLrzqt = thread;
        OSUtils.KWHzl(thread);
    }

    public boolean AYXKKw() {
        java.lang.Thread thread = this.OLrzqt;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.OLrzqt.interrupt();
        return true;
    }

    public void KWHzl(android.content.Context context, long j) {
        synchronized (EZpvd) {
            if (AEQbTJ()) {
                AEQbTJ(context, j);
            } else {
                OLrzqt(context, j);
            }
        }
    }

    public final boolean AEQbTJ(android.content.Context context) {
        return C57720ynj.Activity.copydefault(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    public final boolean OLrzqt(android.content.Context context) {
        java.lang.Thread thread;
        java.util.Iterator<android.app.job.JobInfo> it = ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == KWHzl() && (thread = this.OLrzqt) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public final void AEQbTJ(android.content.Context context, long j) {
        OneSignal.LOG_LEVEL log_level = OneSignal.LOG_LEVEL.VERBOSE;
        OneSignal.KWHzl(log_level, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j);
        if (OLrzqt(context)) {
            OneSignal.KWHzl(log_level, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.copydefault = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(KWHzl(), new android.content.ComponentName(context, (java.lang.Class<?>) OLrzqt()));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (AEQbTJ(context)) {
            builder.setPersisted(true);
        }
        try {
            int iSchedule = ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.INFO, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + iSchedule);
        } catch (java.lang.NullPointerException e) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    public final void OLrzqt(android.content.Context context, long j) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j);
        ((android.app.AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(0, OneSignal.aKErDB().KWHzl() + j, KWHzl(context));
    }

    public void EZpvd(android.content.Context context) {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, getClass().getSimpleName() + " cancel background sync");
        synchronized (EZpvd) {
            if (AEQbTJ()) {
                ((android.app.job.JobScheduler) context.getSystemService("jobscheduler")).cancel(KWHzl());
            } else {
                ((android.app.AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(KWHzl(context));
            }
        }
    }

    public final android.app.PendingIntent KWHzl(android.content.Context context) {
        return android.app.PendingIntent.getService(context, KWHzl(), new android.content.Intent(context, (java.lang.Class<?>) copydefault()), 201326592);
    }
}
