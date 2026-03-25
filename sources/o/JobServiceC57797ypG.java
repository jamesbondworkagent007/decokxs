package o;

import com.onesignal.OneSignal;
import o.C57762yoY;

/* JADX INFO: renamed from: o.ypG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class JobServiceC57797ypG extends android.app.job.JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters jobParameters) {
        C57762yoY.valueOf().OLrzqt(this, new C57762yoY.StateListAnimator(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters jobParameters) {
        boolean zAYXKKw = C57762yoY.valueOf().AYXKKw();
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "SyncJobService onStopJob called, system conditions not available reschedule: " + zAYXKKw);
        return zAYXKKw;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
