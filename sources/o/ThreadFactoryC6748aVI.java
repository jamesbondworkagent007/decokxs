package o;

import com.okinc.base.thread.TPM;
import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC6748aVI implements ThreadFactory {
    public final boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final AtomicInteger KWHzl;
    public final TPM.Priority OLrzqt;
    public final Thread.UncaughtExceptionHandler copydefault;

    public ThreadFactoryC6748aVI(@NotNull java.lang.String str, @NotNull TPM.Priority priority, boolean z, @NotNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priority, "");
        Intrinsics.checkNotNullParameter(uncaughtExceptionHandler, "");
        this.EZpvd = str;
        this.OLrzqt = priority;
        this.AEQbTJ = z;
        this.copydefault = uncaughtExceptionHandler;
        this.KWHzl = new AtomicInteger(1);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:com.okinc.base.thread.TPM$Priority:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.base.thread.TPM$Priority:0x0004: SGET  A[WRAPPED] (LINE:15) com.okinc.base.thread.TPM.Priority.NORMAL com.okinc.base.thread.TPM$Priority) : (r2v0 com.okinc.base.thread.TPM$Priority))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:java.lang.Thread$UncaughtExceptionHandler:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Thread$UncaughtExceptionHandler:0x0011: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.aVJ.<init>():void type: CONSTRUCTOR) : (r4v0 java.lang.Thread$UncaughtExceptionHandler))
 A[MD:(java.lang.String, com.okinc.base.thread.TPM$Priority, boolean, java.lang.Thread$UncaughtExceptionHandler):void (m)] (LINE:13) call: o.aVI.<init>(java.lang.String, com.okinc.base.thread.TPM$Priority, boolean, java.lang.Thread$UncaughtExceptionHandler):void type: THIS */
    public /* synthetic */ ThreadFactoryC6748aVI(java.lang.String str, TPM.Priority priority, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TPM.Priority.NORMAL : priority, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new Thread.UncaughtExceptionHandler() { // from class: o.aVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                ThreadFactoryC6748aVI.KWHzl(thread, th);
            }
        } : uncaughtExceptionHandler);
    }

    public static final void KWHzl(java.lang.Thread thread, java.lang.Throwable th) {
        pUU.AEQbTJ("Monitor.TPM", "Uncaught exception in thread " + thread.getName(), th);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        java.lang.Thread thread = new java.lang.Thread(runnable, this.EZpvd + "-" + this.KWHzl.getAndIncrement());
        thread.setDaemon(this.AEQbTJ);
        thread.setPriority(this.OLrzqt.getValue());
        thread.setUncaughtExceptionHandler(this.copydefault);
        return thread;
    }
}
