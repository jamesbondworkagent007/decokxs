package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.JobIntentService$JobWorkEnqueuer$$ExternalSyntheticApiModelOutline1;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes24.dex */
public abstract class JobIntentService extends Service {
    public static final Object EZpvd = new Object();
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> KWHzl = new HashMap<>();
    public CommandProcessor AEQbTJ;
    public WorkEnqueuer OLrzqt;
    public CompatJobEngine valueOf;
    public boolean AYXKKw = false;
    public boolean djBIcL = false;
    public boolean gEmmrt = false;
    public final ArrayList<CompatWorkItem> copydefault = new ArrayList<>();

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    public boolean EZpvd() {
        return true;
    }

    public abstract void copydefault(@NonNull Intent intent);

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName, boolean z) {
            this.componentName = componentName;
            this.useWakefulService = z;
        }
    }

    public static abstract class WorkEnqueuer {
        final ComponentName mComponentName;
        boolean mHasJobId;
        int mJobId;

        public abstract void enqueueWork(Intent intent);

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public void ensureJobId(int i) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else {
                if (this.mJobId == i) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.mJobId);
            }
        }
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000L);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000L);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }
    }

    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        static final boolean DEBUG = false;
        static final String TAG = "JobServiceEngineImpl";
        final Object mLock;
        JobParameters mParams;
        final JobIntentService mService;

        public final class WrapperWorkItem implements GenericWorkItem {
            final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }

            @Override // com.onesignal.JobIntentService.GenericWorkItem
            public void complete() {
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (IllegalArgumentException | SecurityException unused) {
                        }
                    }
                }
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mLock = new Object();
            this.mService = jobIntentService;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.OLrzqt(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zCopydefault = this.mService.copydefault();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return zCopydefault;
        }

        @Override // com.onesignal.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            synchronized (this.mLock) {
                JobParameters jobParameters = this.mParams;
                if (jobParameters == null) {
                    return null;
                }
                try {
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                    return new WrapperWorkItem(jobWorkItemDequeueWork);
                } catch (SecurityException unused) {
                    return null;
                }
            }
        }
    }

    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // com.onesignal.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, JobIntentService$JobWorkEnqueuer$$ExternalSyntheticApiModelOutline1.m(intent));
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        final Intent mIntent;
        final int mStartId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.mIntent;
        }

        public CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override // com.onesignal.JobIntentService.GenericWorkItem
        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }
    }

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem genericWorkItemKWHzl = JobIntentService.this.KWHzl();
                if (genericWorkItemKWHzl == null) {
                    return null;
                }
                JobIntentService.this.copydefault(genericWorkItemKWHzl.getIntent());
                genericWorkItemKWHzl.complete();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCancelled(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        public void onCancelled(Void r1) {
            JobIntentService.this.AEQbTJ();
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        public void onPostExecute(Void r1) {
            JobIntentService.this.AEQbTJ();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.valueOf = new JobServiceEngineImpl(this);
            this.OLrzqt = null;
        }
        this.OLrzqt = copydefault((Context) this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        this.OLrzqt.serviceStartReceived();
        synchronized (this.copydefault) {
            ArrayList<CompatWorkItem> arrayList = this.copydefault;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            OLrzqt(true);
        }
        return 3;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        CompatJobEngine compatJobEngine = this.valueOf;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        copydefault();
        synchronized (this.copydefault) {
            this.gEmmrt = true;
            this.OLrzqt.serviceProcessingFinished();
        }
    }

    public static void EZpvd(@NonNull Context context, @NonNull Class cls, int i, @NonNull Intent intent, boolean z) {
        copydefault(context, new ComponentName(context, (Class<?>) cls), i, intent, z);
    }

    public static void copydefault(@NonNull Context context, @NonNull ComponentName componentName, int i, @NonNull Intent intent, boolean z) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (EZpvd) {
            WorkEnqueuer workEnqueuerCopydefault = copydefault(context, componentName, true, i, z);
            workEnqueuerCopydefault.ensureJobId(i);
            try {
                workEnqueuerCopydefault.enqueueWork(intent);
            } catch (IllegalStateException e) {
                if (z) {
                    copydefault(context, componentName, true, i, false).enqueueWork(intent);
                } else {
                    throw e;
                }
            }
        }
    }

    public static WorkEnqueuer copydefault(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        WorkEnqueuer compatWorkEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> map = KWHzl;
        WorkEnqueuer workEnqueuer = map.get(componentNameWithWakeful);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i);
        }
        WorkEnqueuer workEnqueuer2 = compatWorkEnqueuer;
        map.put(componentNameWithWakeful, workEnqueuer2);
        return workEnqueuer2;
    }

    public boolean copydefault() {
        CommandProcessor commandProcessor = this.AEQbTJ;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.AYXKKw);
        }
        this.djBIcL = true;
        return EZpvd();
    }

    public void OLrzqt(boolean z) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.OLrzqt;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.AEQbTJ.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void AEQbTJ() {
        ArrayList<CompatWorkItem> arrayList = this.copydefault;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.AEQbTJ = null;
                ArrayList<CompatWorkItem> arrayList2 = this.copydefault;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    OLrzqt(false);
                } else if (!this.gEmmrt) {
                    this.OLrzqt.serviceProcessingFinished();
                }
            }
        }
    }

    public GenericWorkItem KWHzl() {
        GenericWorkItem genericWorkItemDequeueWork;
        CompatJobEngine compatJobEngine = this.valueOf;
        if (compatJobEngine != null && (genericWorkItemDequeueWork = compatJobEngine.dequeueWork()) != null) {
            return genericWorkItemDequeueWork;
        }
        synchronized (this.copydefault) {
            if (this.copydefault.size() > 0) {
                return this.copydefault.remove(0);
            }
            return null;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
