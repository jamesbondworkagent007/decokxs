package o;

import com.okinc.base.thread.TPM;
import com.okinc.base.thread.pool.PoolType;
import java.util.EnumMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6786aVu implements InterfaceC6785aVt {
    public final RejectedExecutionHandler AEQbTJ;
    public final EnumMap<PoolType, java.util.Map<TPM.Priority, ExecutorService>> KWHzl;
    public final TPM.TaskDescription copydefault;

    /* JADX INFO: renamed from: o.aVu$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PoolType.values().length];
            try {
                iArr[PoolType.CPU.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PoolType.IO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PoolType.SINGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PoolType.SCHEDULE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[TPM.Priority.values().length];
            try {
                iArr2[TPM.Priority.HIGH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[TPM.Priority.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[TPM.Priority.LOW.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr2;
        }
    }

    public C6786aVu(@NotNull TPM.TaskDescription taskDescription, @NotNull RejectedExecutionHandler rejectedExecutionHandler) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(rejectedExecutionHandler, "");
        this.copydefault = taskDescription;
        this.AEQbTJ = rejectedExecutionHandler;
        this.KWHzl = new EnumMap<>(PoolType.class);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 com.okinc.base.thread.TPM$TaskDescription)
  (wrap:java.util.concurrent.RejectedExecutionHandler:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.RejectedExecutionHandler:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:33) call: java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.concurrent.RejectedExecutionHandler))
 A[MD:(com.okinc.base.thread.TPM$TaskDescription, java.util.concurrent.RejectedExecutionHandler):void (m)] (LINE:31) call: o.aVu.<init>(com.okinc.base.thread.TPM$TaskDescription, java.util.concurrent.RejectedExecutionHandler):void type: THIS */
    public /* synthetic */ C6786aVu(TPM.TaskDescription taskDescription, RejectedExecutionHandler rejectedExecutionHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription, (i & 2) != 0 ? new ThreadPoolExecutor.CallerRunsPolicy() : rejectedExecutionHandler);
    }

    @Override // o.InterfaceC6785aVt
    public void KWHzl() {
        for (PoolType poolType : PoolType.getEntries()) {
            this.KWHzl.put(poolType, copydefault(poolType));
        }
    }

    @Override // o.InterfaceC6785aVt
    public ExecutorService KWHzl(@NotNull PoolType poolType, @NotNull TPM.Priority priority) {
        ExecutorService executorService;
        Intrinsics.checkNotNullParameter(poolType, "");
        Intrinsics.checkNotNullParameter(priority, "");
        java.util.Map<TPM.Priority, ExecutorService> map = this.KWHzl.get(poolType);
        if (map != null && (executorService = map.get(priority)) != null) {
            return executorService;
        }
        throw new java.lang.IllegalStateException("No executor found for " + poolType + " with priority " + priority);
    }

    public final java.util.Map<TPM.Priority, ExecutorService> copydefault(PoolType poolType) {
        EnumMap enumMap = new EnumMap(TPM.Priority.class);
        int i = TaskDescription.AEQbTJ[poolType.ordinal()];
        if (i == 1) {
            TPM.Priority priority = TPM.Priority.HIGH;
            int iKWHzl = this.copydefault.KWHzl();
            int iEZpvd = this.copydefault.EZpvd();
            long jOLrzqt = this.copydefault.OLrzqt();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            enumMap.put(priority, new ThreadPoolExecutor(iKWHzl, iEZpvd, jOLrzqt, timeUnit, new LinkedBlockingQueue(EZpvd(poolType, priority)), new ThreadFactoryC6748aVI("CPU-HIGH", priority, false, null, 12, null), this.AEQbTJ));
            TPM.Priority priority2 = TPM.Priority.NORMAL;
            enumMap.put(priority2, new ThreadPoolExecutor(this.copydefault.AYXKKw(), this.copydefault.valueOf(), this.copydefault.AhwBna(), timeUnit, new LinkedBlockingQueue(EZpvd(poolType, priority2)), new ThreadFactoryC6748aVI("CPU-NORMAL", priority2, false, null, 12, null), this.AEQbTJ));
            TPM.Priority priority3 = TPM.Priority.LOW;
            enumMap.put(priority3, new ThreadPoolExecutor(this.copydefault.AEQbTJ(), this.copydefault.gEmmrt(), this.copydefault.copydefault(), timeUnit, new LinkedBlockingQueue(EZpvd(poolType, priority3)), new ThreadFactoryC6748aVI("CPU-LOW", priority3, false, null, 12, null), this.AEQbTJ));
        } else if (i == 2) {
            TPM.Priority priority4 = TPM.Priority.HIGH;
            int iAkhnZx = this.copydefault.AkhnZx();
            int iDbNXlk = this.copydefault.DbNXlk();
            long jIsConnected = this.copydefault.isConnected();
            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
            enumMap.put(priority4, new ThreadPoolExecutor(iAkhnZx, iDbNXlk, jIsConnected, timeUnit2, new LinkedBlockingQueue(EZpvd(poolType, priority4)), new ThreadFactoryC6748aVI("IO-HIGH", priority4, false, null, 12, null), this.AEQbTJ));
            TPM.Priority priority5 = TPM.Priority.NORMAL;
            enumMap.put(priority5, new ThreadPoolExecutor(this.copydefault.fARcdN(), this.copydefault.AuCTel(), this.copydefault.fJNWhG(), timeUnit2, new LinkedBlockingQueue(EZpvd(poolType, priority5)), new ThreadFactoryC6748aVI("IO-NORMAL", priority5, false, null, 12, null), this.AEQbTJ));
            TPM.Priority priority6 = TPM.Priority.LOW;
            enumMap.put(priority6, new ThreadPoolExecutor(this.copydefault.fetchVPNInfo(), this.copydefault.ejfBZ(), this.copydefault.values(), timeUnit2, new LinkedBlockingQueue(EZpvd(poolType, priority6)), new ThreadFactoryC6748aVI("IO-LOW", priority6, false, null, 12, null), this.AEQbTJ));
        } else if (i == 3) {
            TPM.Priority priority7 = TPM.Priority.HIGH;
            long keepAliveTime = poolType.getKeepAliveTime();
            java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
            enumMap.put(priority7, new ThreadPoolExecutor(1, 2, keepAliveTime, timeUnit3, new LinkedBlockingQueue(EZpvd(poolType, priority7)), new ThreadFactoryC6748aVI("SINGLE-HIGH", null, false, null, 14, null), this.AEQbTJ));
            TPM.Priority priority8 = TPM.Priority.NORMAL;
            enumMap.put(priority8, new ThreadPoolExecutor(1, 2, poolType.getKeepAliveTime(), timeUnit3, new LinkedBlockingQueue(EZpvd(poolType, priority8)), new ThreadFactoryC6748aVI("SINGLE-NORMAL", null, false, null, 14, null), this.AEQbTJ));
            TPM.Priority priority9 = TPM.Priority.LOW;
            enumMap.put(priority9, new ThreadPoolExecutor(1, 2, poolType.getKeepAliveTime(), timeUnit3, new LinkedBlockingQueue(EZpvd(poolType, priority9)), new ThreadFactoryC6748aVI("SINGLE-LOW", null, false, null, 14, null), this.AEQbTJ));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            enumMap.put(TPM.Priority.HIGH, OLrzqt("SCHEDULE-HIGH", this.copydefault.uzCIH(), this.copydefault.hDKMBd()));
            enumMap.put(TPM.Priority.NORMAL, OLrzqt("SCHEDULE-NORMAL", this.copydefault.AuCTelauCTel(), this.copydefault.wlaJM()));
            enumMap.put(TPM.Priority.LOW, OLrzqt("SCHEDULE-LOW", this.copydefault.getNewProxyInstance(), this.copydefault.getFieldNames()));
        }
        return enumMap;
    }

    public final ExecutorService OLrzqt(java.lang.String str, int i, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new ThreadFactoryC6748aVI(str, null, false, null, 14, null));
        scheduledThreadPoolExecutor.setKeepAliveTime(j, java.util.concurrent.TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        scheduledThreadPoolExecutor.setRejectedExecutionHandler(this.AEQbTJ);
        return scheduledThreadPoolExecutor;
    }

    public final int EZpvd(PoolType poolType, TPM.Priority priority) {
        int i;
        int queueSize = poolType.getQueueSize();
        int i2 = TaskDescription.OLrzqt[priority.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 4;
            }
        } else {
            i = 1;
        }
        return java.lang.Math.min(queueSize * i, C56548yJl.copydefault(this.copydefault.iwGUEr(), 1));
    }
}
