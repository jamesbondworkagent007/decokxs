package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48827ucy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48827ucy {
    public static final C48827ucy KWHzl = new C48827ucy();
    public static final StateListAnimator EZpvd = new StateListAnimator(null, 1, 0 == true ? 1 : 0);
    public static final int AEQbTJ = 8;

    private C48827ucy() {
    }

    public final void copydefault() {
        EZpvd.AEQbTJ();
    }

    public static /* synthetic */ java.lang.Object runWithTimeout$default(C48827ucy c48827ucy, Function0 function0, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 500;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        return c48827ucy.EZpvd(function0, j, str);
    }

    public static final Unit copydefault(java.lang.String str, long j) {
        pUU.valueOf("AsyncWithTimeoutHandler", str + " runner timed out after " + j + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.copydefault("AsyncWithTimeoutHandler", str + " timeout runner error: " + exc.getMessage());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void runWithTimeoutForUnit$default(C48827ucy c48827ucy, Function0 function0, long j, Function0 function02, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 500;
        }
        c48827ucy.AEQbTJ(function0, j, function02, function1);
    }

    public final void AEQbTJ(@NotNull final Function0<Unit> function0, long j, @NotNull Function0<Unit> function02, @NotNull Function1<? super java.lang.Exception, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd.OLrzqt(new Function0() { // from class: o.ucG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C48827ucy.AEQbTJ(function0));
            }
        }, j, function02, function1);
    }

    public static final boolean AEQbTJ(Function0 function0) {
        function0.invoke();
        return true;
    }

    public static /* synthetic */ java.lang.Object parseObject$default(C48827ucy c48827ucy, java.lang.String str, java.lang.Class cls, long j, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j = 500;
        }
        return c48827ucy.OLrzqt(str, cls, j);
    }

    public final <T> T OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        if (KWHzl()) {
            return (T) AEQbTJ(str, cls);
        }
        return (T) AEQbTJ(str, cls, j);
    }

    public final <T> T AEQbTJ(final java.lang.String str, final java.lang.Class<T> cls, final long j) {
        return (T) EZpvd.OLrzqt(new Function0() { // from class: o.ucC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48827ucy.copydefault(str, cls);
            }
        }, j, new Function0() { // from class: o.ucH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48827ucy.OLrzqt(j);
            }
        }, new Function1() { // from class: o.ucF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48827ucy.KWHzl((java.lang.Exception) obj);
            }
        });
    }

    public static final java.lang.Object copydefault(java.lang.String str, java.lang.Class cls) {
        java.lang.String str2 = "parseWithTimeout size: " + str.length();
        long jNanoTime = java.lang.System.nanoTime();
        try {
            return C33490mxT.EZpvd(str, cls);
        } finally {
            pUU.EZpvd("AsyncWithTimeoutHandler", str2 + " took " + ((java.lang.System.nanoTime() - jNanoTime) / ((long) 1000000)) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        }
    }

    public static final Unit OLrzqt(long j) {
        pUU.valueOf("AsyncWithTimeoutHandler", "parseWithTimeout runner timed out after " + j + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.copydefault("AsyncWithTimeoutHandler", "parseWithTimeout timeout runner error: " + exc.getMessage());
        return Unit.INSTANCE;
    }

    public final <T> T AEQbTJ(java.lang.String str, java.lang.Class<T> cls) {
        try {
            java.lang.String str2 = "parseObjectDirectly size: " + str.length();
            long jNanoTime = java.lang.System.nanoTime();
            try {
                T t = (T) C33490mxT.EZpvd(str, (java.lang.Class) cls);
                pUU.EZpvd("AsyncWithTimeoutHandler", str2 + " took " + ((java.lang.System.nanoTime() - jNanoTime) / ((long) 1000000)) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                return t;
            } catch (java.lang.Throwable th) {
                pUU.EZpvd("AsyncWithTimeoutHandler", str2 + " took " + ((java.lang.System.nanoTime() - jNanoTime) / ((long) 1000000)) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
                throw th;
            }
        } catch (java.lang.Exception e) {
            pUU.valueOf("AsyncWithTimeoutHandler", "parseObjectDirectly error:" + e.getMessage());
            return null;
        }
    }

    public final boolean KWHzl() {
        try {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            return true ^ Intrinsics.EZpvd(mainLooper != null ? mainLooper.getThread() : null, java.lang.Thread.currentThread());
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: o.ucy$StateListAnimator */
    public static final class StateListAnimator {
        public final ExecutorService AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public StateListAnimator(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "");
            this.AEQbTJ = executorService;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:java.util.concurrent.ExecutorService:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.ExecutorService:0x001a: CONSTRUCTOR 
  (0 int)
  (10 int)
  (30 long)
  (wrap:java.util.concurrent.TimeUnit:0x0004: SGET  A[WRAPPED] (LINE:115) java.util.concurrent.TimeUnit.SECONDS java.util.concurrent.TimeUnit)
  (wrap:java.util.concurrent.LinkedBlockingQueue:0x000a: CONSTRUCTOR (20 int) A[MD:(int):void (c), WRAPPED] (LINE:116) call: java.util.concurrent.LinkedBlockingQueue.<init>(int):void type: CONSTRUCTOR)
  (wrap:java.util.concurrent.ThreadFactory:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:117) call: o.ucE.<init>():void type: CONSTRUCTOR)
 A[MD:(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue<java.lang.Runnable>, java.util.concurrent.ThreadFactory):void (c), WRAPPED] (LINE:115) call: java.util.concurrent.ThreadPoolExecutor.<init>(int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory):void type: CONSTRUCTOR) : (r9v0 java.util.concurrent.ExecutorService))
 A[MD:(java.util.concurrent.ExecutorService):void (m)] (LINE:109) call: o.ucy.StateListAnimator.<init>(java.util.concurrent.ExecutorService):void type: THIS */
        public /* synthetic */ StateListAnimator(ExecutorService executorService, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ThreadPoolExecutor(0, 10, 30L, java.util.concurrent.TimeUnit.SECONDS, new LinkedBlockingQueue(20), new ThreadFactory() { // from class: o.ucE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.ThreadFactory
                public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                    return C48827ucy.StateListAnimator.EZpvd(runnable);
                }
            }) : executorService);
        }

        public static final java.lang.Thread EZpvd(java.lang.Runnable runnable) {
            java.lang.Thread thread = new java.lang.Thread(runnable, "TimeoutRunner");
            thread.setPriority(5);
            thread.setDaemon(false);
            return thread;
        }

        public static final java.lang.Object AEQbTJ(Function0 function0) {
            return function0.invoke();
        }

        public final <T> T OLrzqt(@NotNull final Function0<? extends T> function0, long j, @NotNull Function0<Unit> function02, @NotNull Function1<? super java.lang.Exception, Unit> function1) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Future<T> futureSubmit = this.AEQbTJ.submit(new Callable() { // from class: o.ucD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return C48827ucy.StateListAnimator.AEQbTJ(function0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "");
            try {
                return futureSubmit.get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                futureSubmit.cancel(true);
                function02.invoke();
                return null;
            } catch (java.lang.Exception e) {
                function1.invoke(e);
                return null;
            }
        }

        public final void AEQbTJ() {
            this.AEQbTJ.shutdownNow();
        }
    }

    public final <T> T EZpvd(@NotNull Function0<? extends T> function0, final long j, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        StateListAnimator stateListAnimator = EZpvd;
        pUU.EZpvd("AsyncWithTimeoutHandler", str + " took " + ((java.lang.System.nanoTime() - java.lang.System.nanoTime()) / ((long) 1000000)) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return (T) stateListAnimator.OLrzqt(function0, j, new Function0() { // from class: o.ucz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48827ucy.copydefault(str, j);
            }
        }, new Function1() { // from class: o.ucA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48827ucy.EZpvd(str, (java.lang.Exception) obj);
            }
        });
    }
}
