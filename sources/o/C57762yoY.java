package o;

import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: renamed from: o.yoY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57762yoY extends AbstractC57764yoa {
    public static final java.lang.Object AEQbTJ = new java.lang.Object();
    public static C57762yoY KWHzl;
    public java.lang.Long djBIcL = 0L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57764yoa
    public java.lang.String EZpvd() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    @Override // o.AbstractC57764yoa
    public int KWHzl() {
        return 2071862118;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57764yoa
    public java.lang.Class OLrzqt() {
        return JobServiceC57797ypG.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57764yoa
    public java.lang.Class copydefault() {
        return ServiceC57801ypK.class;
    }

    public static C57762yoY valueOf() {
        if (KWHzl == null) {
            synchronized (AEQbTJ) {
                if (KWHzl == null) {
                    KWHzl = new C57762yoY();
                }
            }
        }
        return KWHzl;
    }

    public void djBIcL(android.content.Context context) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        EZpvd(context, 30000L);
    }

    public void EZpvd(android.content.Context context, long j) {
        synchronized (AbstractC57764yoa.EZpvd) {
            if (this.djBIcL.longValue() != 0 && OneSignal.aKErDB().KWHzl() + j > this.djBIcL.longValue()) {
                OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.djBIcL);
                return;
            }
            if (j < 5000) {
                j = 5000;
            }
            KWHzl(context, j);
            this.djBIcL = java.lang.Long.valueOf(OneSignal.aKErDB().KWHzl() + j);
        }
    }

    public void copydefault(android.content.Context context, long j) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.VERBOSE, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j);
        EZpvd(context, j);
    }

    public void copydefault(android.content.Context context) {
        synchronized (AbstractC57764yoa.EZpvd) {
            this.djBIcL = 0L;
            if (LocationController.copydefault(context)) {
                return;
            }
            EZpvd(context);
        }
    }

    /* JADX INFO: renamed from: o.yoY$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class Application implements java.lang.Runnable {
        public abstract void AEQbTJ();

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AbstractC57764yoa.EZpvd) {
                C57762yoY.valueOf().djBIcL = 0L;
            }
            if (OneSignal.finit() == null) {
                AEQbTJ();
                return;
            }
            OneSignal.AhwBna = OneSignal.QbewEr();
            OneSignalStateSynchronizer.values();
            try {
                final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                LocationController.OLrzqt(OneSignal.AEQbTJ, false, false, new LocationController.StateListAnimator() { // from class: o.yoY.Application.2
                    @Override // com.onesignal.LocationController.StateListAnimator
                    public LocationController.PermissionType OLrzqt() {
                        return LocationController.PermissionType.SYNC_SERVICE;
                    }

                    @Override // com.onesignal.LocationController.StateListAnimator
                    public void EZpvd(LocationController.ActionBar actionBar) {
                        java.lang.Object obj = actionBar;
                        if (actionBar == null) {
                            obj = new java.lang.Object();
                        }
                        arrayBlockingQueue.offer(obj);
                    }
                });
                java.lang.Object objTake = arrayBlockingQueue.take();
                if (objTake instanceof LocationController.ActionBar) {
                    OneSignalStateSynchronizer.EZpvd((LocationController.ActionBar) objTake);
                }
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            OneSignalStateSynchronizer.EZpvd(true);
            OneSignal.wlaJM().OLrzqt();
            AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.yoY$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static class StateListAnimator extends Application {
        public WeakReference<android.app.job.JobService> KWHzl;
        public android.app.job.JobParameters OLrzqt;

        public StateListAnimator(android.app.job.JobService jobService, android.app.job.JobParameters jobParameters) {
            this.KWHzl = new WeakReference<>(jobService);
            this.OLrzqt = jobParameters;
        }

        @Override // o.C57762yoY.Application
        public void AEQbTJ() {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + C57762yoY.valueOf().copydefault);
            boolean z = C57762yoY.valueOf().copydefault;
            C57762yoY.valueOf().copydefault = false;
            if (this.KWHzl.get() != null) {
                this.KWHzl.get().jobFinished(this.OLrzqt, z);
            }
        }
    }

    /* JADX INFO: renamed from: o.yoY$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static class Activity extends Application {
        public WeakReference<android.app.Service> KWHzl;

        public Activity(android.app.Service service) {
            this.KWHzl = new WeakReference<>(service);
        }

        @Override // o.C57762yoY.Application
        public void AEQbTJ() {
            OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.KWHzl.get() != null) {
                this.KWHzl.get().stopSelf();
            }
        }
    }
}
