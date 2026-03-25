package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class yAZ {
    public static final int AEQbTJ;
    public static final AtomicReference<ScheduledExecutorService> EZpvd = new AtomicReference<>();
    public static final java.util.Map<ScheduledThreadPoolExecutor, java.lang.Object> OLrzqt = new ConcurrentHashMap();
    public static final boolean copydefault;

    private yAZ() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    static {
        TaskDescription taskDescription = new TaskDescription();
        boolean zEZpvd = EZpvd(true, "rx2.purge-enabled", true, true, (InterfaceC58229yxO<java.lang.String, java.lang.String>) taskDescription);
        copydefault = zEZpvd;
        AEQbTJ = EZpvd(zEZpvd, "rx2.purge-period-seconds", 1, 1, taskDescription);
        EZpvd();
    }

    public static void EZpvd() {
        OLrzqt(copydefault);
    }

    public static void OLrzqt(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = EZpvd;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                StateListAnimator stateListAnimator = new StateListAnimator();
                long j = AEQbTJ;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(stateListAnimator, j, j, java.util.concurrent.TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    public static int EZpvd(boolean z, java.lang.String str, int i, int i2, InterfaceC58229yxO<java.lang.String, java.lang.String> interfaceC58229yxO) {
        if (!z) {
            return i2;
        }
        try {
            java.lang.String strApply = interfaceC58229yxO.apply(str);
            return strApply == null ? i : java.lang.Integer.parseInt(strApply);
        } catch (java.lang.Throwable unused) {
            return i;
        }
    }

    public static boolean EZpvd(boolean z, java.lang.String str, boolean z2, boolean z3, InterfaceC58229yxO<java.lang.String, java.lang.String> interfaceC58229yxO) {
        if (!z) {
            return z3;
        }
        try {
            java.lang.String strApply = interfaceC58229yxO.apply(str);
            return strApply == null ? z2 : "true".equals(strApply);
        } catch (java.lang.Throwable unused) {
            return z2;
        }
    }

    public static final class TaskDescription implements InterfaceC58229yxO<java.lang.String, java.lang.String> {
        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC58229yxO
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.String apply(java.lang.String str) throws java.lang.Exception {
            return java.lang.System.getProperty(str);
        }
    }

    public static ScheduledExecutorService copydefault(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        OLrzqt(copydefault, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void OLrzqt(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            OLrzqt.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static final class StateListAnimator implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new java.util.ArrayList(yAZ.OLrzqt.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    yAZ.OLrzqt.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
