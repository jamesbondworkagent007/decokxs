package com.okinc.biz.net.common;

import com.okinc.biz.net.common.InterceptorTimeoutMonitor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import o.pUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InterceptorTimeoutMonitor {
    public static final InterceptorTimeoutMonitor AEQbTJ;
    public static ScheduledExecutorService AhwBna;
    public static final int EZpvd;
    public static final AtomicBoolean KWHzl;
    public static final ConcurrentHashMap<Long, TaskDescription> OLrzqt;
    public static final AtomicBoolean copydefault;
    public static final AtomicLong djBIcL;

    private InterceptorTimeoutMonitor() {
    }

    static {
        InterceptorTimeoutMonitor interceptorTimeoutMonitor = new InterceptorTimeoutMonitor();
        AEQbTJ = interceptorTimeoutMonitor;
        djBIcL = new AtomicLong(0L);
        KWHzl = new AtomicBoolean(false);
        copydefault = new AtomicBoolean(true);
        OLrzqt = new ConcurrentHashMap<>();
        AhwBna = interceptorTimeoutMonitor.OLrzqt();
        EZpvd = 8;
    }

    public final ScheduledExecutorService OLrzqt() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: o.aXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return InterceptorTimeoutMonitor.copydefault(runnable);
            }
        });
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static final Thread copydefault(Runnable runnable) {
        return new Thread(runnable, "interceptor-timeout-monitor");
    }

    public static final class TaskDescription {
        public final long AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final long OLrzqt;
        public final long copydefault;
        public final String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new TaskDescription(j, j2, str, str2, str3, j3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) taskDescription.gEmmrt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd) && this.OLrzqt == taskDescription.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Long.hashCode(this.copydefault) * 31) + Long.hashCode(this.AEQbTJ)) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RequestExecutionInfo(requestId=" + this.copydefault + ", startTime=" + this.AEQbTJ + ", url=" + this.gEmmrt + ", method=" + this.KWHzl + ", interceptorName=" + this.EZpvd + ", timeoutMs=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.gEmmrt;
        }

        public TaskDescription(long j, long j2, @NotNull String str, @NotNull String str2, @NotNull String str3, long j3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = j;
            this.AEQbTJ = j2;
            this.gEmmrt = str;
            this.KWHzl = str2;
            this.EZpvd = str3;
            this.OLrzqt = j3;
        }
    }

    public static /* synthetic */ long markStart$default(InterceptorTimeoutMonitor interceptorTimeoutMonitor, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 2000;
        }
        return interceptorTimeoutMonitor.OLrzqt(str, str2, str3, j);
    }

    public final long OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!KWHzl.get()) {
            return -1L;
        }
        long jIncrementAndGet = djBIcL.incrementAndGet();
        OLrzqt.put(Long.valueOf(jIncrementAndGet), new TaskDescription(jIncrementAndGet, System.currentTimeMillis(), str, str2, str3, j));
        return jIncrementAndGet;
    }

    public final void AEQbTJ(long j) {
        if (KWHzl.get()) {
            TaskDescription taskDescriptionRemove = OLrzqt.remove(Long.valueOf(j));
            if (taskDescriptionRemove != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - taskDescriptionRemove.AEQbTJ();
                if (jCurrentTimeMillis > taskDescriptionRemove.KWHzl()) {
                    pUU.valueOf("InterceptorTimeoutMonitor", "Interceptor execution time exceeded but completed - ID: " + j + ", Duration: " + jCurrentTimeMillis + "ms, Threshold: " + taskDescriptionRemove.KWHzl() + "ms, URL: " + taskDescriptionRemove.valueOf() + ", Method: " + taskDescriptionRemove.copydefault() + ", Interceptor: " + taskDescriptionRemove.OLrzqt());
                    return;
                }
                return;
            }
            pUU.valueOf("InterceptorTimeoutMonitor", "No corresponding execution record found - ID: " + j);
        }
    }

    public final void AhwBna() {
        synchronized (this) {
            AtomicBoolean atomicBoolean = KWHzl;
            if (atomicBoolean.get()) {
                return;
            }
            if (AhwBna.isShutdown() || AhwBna.isTerminated()) {
                AhwBna = OLrzqt();
            }
            atomicBoolean.set(true);
            AhwBna.scheduleWithFixedDelay(new Runnable() { // from class: o.aXl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    InterceptorTimeoutMonitor.KWHzl();
                }
            }, 1000L, 1000L, TimeUnit.MILLISECONDS);
            pUU.KWHzl("InterceptorTimeoutMonitor", "Interceptor timeout monitoring started, check interval: 1000ms");
        }
    }

    public static final void KWHzl() {
        try {
            AEQbTJ.copydefault();
        } catch (Exception e) {
            pUU.AEQbTJ("InterceptorTimeoutMonitor", "Monitoring task execution exception", e);
        }
    }

    public final void copydefault() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<TaskDescription> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<TaskDescription> collectionValues = OLrzqt.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        for (TaskDescription taskDescription : collectionValues) {
            long jAEQbTJ = jCurrentTimeMillis - taskDescription.AEQbTJ();
            if (jAEQbTJ > taskDescription.KWHzl()) {
                Intrinsics.copydefault(taskDescription);
                arrayList.add(taskDescription);
            }
            if (jAEQbTJ > taskDescription.KWHzl() * ((long) 10)) {
                arrayList2.add(Long.valueOf(taskDescription.EZpvd()));
            }
        }
        for (TaskDescription taskDescription2 : arrayList) {
            long jAEQbTJ2 = taskDescription2.AEQbTJ();
            String str = "Interceptor execution timeout! ID: " + taskDescription2.EZpvd() + ", Duration: " + (jCurrentTimeMillis - jAEQbTJ2) + "ms, Threshold: " + taskDescription2.KWHzl() + "ms, URL: " + taskDescription2.valueOf() + ", Method: " + taskDescription2.copydefault() + ", Interceptor: " + taskDescription2.OLrzqt();
            pUU.copydefault("InterceptorTimeoutMonitor", str);
            AEQbTJ.AEQbTJ(new InterceptorTimeoutException(str));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            OLrzqt.remove(Long.valueOf(((Number) it.next()).longValue()));
        }
    }

    public final void EZpvd() {
        synchronized (this) {
            AtomicBoolean atomicBoolean = KWHzl;
            if (atomicBoolean.get()) {
                atomicBoolean.set(false);
                AhwBna.shutdown();
                OLrzqt.clear();
                copydefault.set(true);
                pUU.KWHzl("InterceptorTimeoutMonitor", "Interceptor timeout monitoring has been shut down");
            }
        }
    }

    public final void AEQbTJ(InterceptorTimeoutException interceptorTimeoutException) {
        if (copydefault.compareAndSet(true, false)) {
            pUX.OLrzqt.AEQbTJ(interceptorTimeoutException);
        }
    }

    public static final class InterceptorTimeoutException extends Exception {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterceptorTimeoutException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public InterceptorTimeoutException(String str) {
            super(str);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:195) call: com.okinc.biz.net.common.InterceptorTimeoutMonitor.InterceptorTimeoutException.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ InterceptorTimeoutException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
