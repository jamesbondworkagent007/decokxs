package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.C5362Ou;

/* JADX INFO: renamed from: o.Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348Og {
    public volatile boolean AEQbTJ;
    public C5362Ou.Activity EZpvd;
    public volatile Application KWHzl;
    public final java.util.Map<NH, TaskDescription> OLrzqt;
    public final boolean copydefault;
    public final java.util.concurrent.Executor djBIcL;
    public final ReferenceQueue<C5362Ou<?>> valueOf;

    /* JADX INFO: renamed from: o.Og$Application */
    public interface Application {
        void AEQbTJ();
    }

    public C5348Og(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.Og.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(@androidx.annotation.NonNull final java.lang.Runnable runnable) {
                return new java.lang.Thread(new java.lang.Runnable() { // from class: o.Og.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    public C5348Og(boolean z, java.util.concurrent.Executor executor) {
        this.OLrzqt = new java.util.HashMap();
        this.valueOf = new ReferenceQueue<>();
        this.copydefault = z;
        this.djBIcL = executor;
        executor.execute(new java.lang.Runnable() { // from class: o.Og.4
            @Override // java.lang.Runnable
            public void run() {
                C5348Og.this.copydefault();
            }
        });
    }

    public void AEQbTJ(C5362Ou.Activity activity) {
        synchronized (activity) {
            synchronized (this) {
                this.EZpvd = activity;
            }
        }
    }

    public void KWHzl(NH nh, C5362Ou<?> c5362Ou) {
        synchronized (this) {
            TaskDescription taskDescriptionPut = this.OLrzqt.put(nh, new TaskDescription(nh, c5362Ou, this.valueOf, this.copydefault));
            if (taskDescriptionPut != null) {
                taskDescriptionPut.copydefault();
            }
        }
    }

    public void EZpvd(NH nh) {
        synchronized (this) {
            TaskDescription taskDescriptionRemove = this.OLrzqt.remove(nh);
            if (taskDescriptionRemove != null) {
                taskDescriptionRemove.copydefault();
            }
        }
    }

    public C5362Ou<?> OLrzqt(NH nh) {
        synchronized (this) {
            TaskDescription taskDescription = this.OLrzqt.get(nh);
            if (taskDescription == null) {
                return null;
            }
            C5362Ou<?> c5362Ou = taskDescription.get();
            if (c5362Ou == null) {
                AEQbTJ(taskDescription);
            }
            return c5362Ou;
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull TaskDescription taskDescription) {
        OC<?> oc;
        synchronized (this) {
            this.OLrzqt.remove(taskDescription.OLrzqt);
            if (taskDescription.KWHzl && (oc = taskDescription.AEQbTJ) != null) {
                this.EZpvd.EZpvd(taskDescription.OLrzqt, new C5362Ou<>(oc, true, false, taskDescription.OLrzqt, this.EZpvd));
            }
        }
    }

    public void copydefault() {
        while (!this.AEQbTJ) {
            try {
                AEQbTJ((TaskDescription) this.valueOf.remove());
                Application application = this.KWHzl;
                if (application != null) {
                    application.AEQbTJ();
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX INFO: renamed from: o.Og$TaskDescription */
    public static final class TaskDescription extends WeakReference<C5362Ou<?>> {
        public OC<?> AEQbTJ;
        public final boolean KWHzl;
        public final NH OLrzqt;

        public TaskDescription(@androidx.annotation.NonNull NH nh, @androidx.annotation.NonNull C5362Ou<?> c5362Ou, @androidx.annotation.NonNull ReferenceQueue<? super C5362Ou<?>> referenceQueue, boolean z) {
            super(c5362Ou, referenceQueue);
            this.OLrzqt = (NH) SE.OLrzqt(nh);
            this.AEQbTJ = (c5362Ou.AhwBna() && z) ? (OC) SE.OLrzqt(c5362Ou.KWHzl()) : null;
            this.KWHzl = c5362Ou.AhwBna();
        }

        public void copydefault() {
            this.AEQbTJ = null;
            clear();
        }
    }
}
