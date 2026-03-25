package com.tencent.matrix.lifecycle;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56392yDr;
import o.C57919yrW;
import o.C58011ytI;
import o.InterfaceC56387yDm;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MatrixLifecycleThread {
    public static final ArrayList<String> AhwBna;
    public static final InterfaceC56387yDm OLrzqt;
    public static final ConcurrentHashMap<Thread, StateListAnimator> copydefault;
    public static final MatrixLifecycleThread EZpvd = new MatrixLifecycleThread();
    public static C57919yrW KWHzl = new C57919yrW(null, 0, 0, null, null, 31, null);
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<Handler>() { // from class: com.tencent.matrix.lifecycle.MatrixLifecycleThread$handler$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(C58011ytI.AEQbTJ("matrix_li", 5).getLooper());
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C57919yrW c57919yrW) {
        Intrinsics.checkNotNullParameter(c57919yrW, "");
        KWHzl = c57919yrW;
    }

    private MatrixLifecycleThread() {
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add("matrix_x_" + i);
        }
        AhwBna = arrayList;
        OLrzqt = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, MatrixLifecycleThread$executor$2.INSTANCE);
        copydefault = new ConcurrentHashMap<>();
    }

    public final Handler OLrzqt() {
        return (Handler) AEQbTJ.getValue();
    }

    public final Executor copydefault() {
        return (Executor) OLrzqt.getValue();
    }

    public static final class StateListAnimator {
        public static final TaskDescription Companion = new TaskDescription(null);
        public final long KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 0L, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                j = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TaskInfo(task=" + this.copydefault + ", time=" + this.KWHzl + ')';
        }

        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.tencent.matrix.lifecycle.MatrixLifecycleThread.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final StateListAnimator KWHzl(Runnable runnable) {
                if (runnable == null) {
                    return new StateListAnimator("", System.currentTimeMillis());
                }
                return new StateListAnimator(runnable.toString(), System.currentTimeMillis());
            }
        }

        public StateListAnimator(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.KWHzl = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(java.lang.String, long):void (m)] (LINE:90) call: com.tencent.matrix.lifecycle.MatrixLifecycleThread.StateListAnimator.<init>(java.lang.String, long):void type: THIS */
        public /* synthetic */ StateListAnimator(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
        }
    }

    public static final class Activity implements Runnable {
        public final /* synthetic */ Runnable copydefault;

        public Activity(Runnable runnable) {
            this.copydefault = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StateListAnimator.TaskDescription taskDescription = StateListAnimator.Companion;
            StateListAnimator stateListAnimatorKWHzl = taskDescription.KWHzl(this.copydefault);
            ConcurrentHashMap concurrentHashMap = MatrixLifecycleThread.copydefault;
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "");
            concurrentHashMap.put(threadCurrentThread, stateListAnimatorKWHzl);
            this.copydefault.run();
            ConcurrentHashMap concurrentHashMap2 = MatrixLifecycleThread.copydefault;
            Thread threadCurrentThread2 = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread2, "");
            concurrentHashMap2.put(threadCurrentThread2, taskDescription.KWHzl(null));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 > 500) {
                MatrixLifecycleThread.KWHzl.OLrzqt().invoke(toString(), Long.valueOf(jCurrentTimeMillis2));
            }
        }

        public String toString() {
            return this.copydefault.toString();
        }
    }

    public final Activity OLrzqt(Runnable runnable) {
        return new Activity(runnable);
    }

    public static final class IdleSynchronousQueue extends SynchronousQueue<Runnable> {
        private final LinkedBlockingQueue<Runnable> idleQueue = new LinkedBlockingQueue<>();

        @Override // java.util.concurrent.SynchronousQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof Runnable)) {
                return contains((Runnable) obj);
            }
            return false;
        }

        public /* bridge */ boolean contains(Runnable runnable) {
            return super.contains((Object) runnable);
        }

        public int getSize() {
            return super.size();
        }

        @Override // java.util.concurrent.SynchronousQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null || (obj instanceof Runnable)) {
                return remove((Runnable) obj);
            }
            return false;
        }

        public /* bridge */ boolean remove(Runnable runnable) {
            return super.remove((Object) runnable);
        }

        @Override // java.util.concurrent.SynchronousQueue, java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return getSize();
        }

        /* JADX DEBUG: Method merged with bridge method: poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object; */
        @Override // java.util.concurrent.SynchronousQueue, java.util.concurrent.BlockingQueue
        public Runnable poll(long j, TimeUnit timeUnit) {
            Runnable runnablePoll = this.idleQueue.poll();
            return runnablePoll == null ? (Runnable) super.poll(j, timeUnit) : runnablePoll;
        }

        /* JADX DEBUG: Method merged with bridge method: poll()Ljava/lang/Object; */
        @Override // java.util.concurrent.SynchronousQueue, java.util.Queue
        public Runnable poll() {
            Runnable runnablePoll = this.idleQueue.poll();
            return runnablePoll == null ? (Runnable) super.poll() : runnablePoll;
        }

        /* JADX DEBUG: Method merged with bridge method: take()Ljava/lang/Object; */
        @Override // java.util.concurrent.SynchronousQueue, java.util.concurrent.BlockingQueue
        public Runnable take() throws InterruptedException {
            Runnable runnablePoll = this.idleQueue.poll();
            if (runnablePoll != null) {
                return runnablePoll;
            }
            Object objTake = super.take();
            Intrinsics.checkNotNullExpressionValue(objTake, "");
            return (Runnable) objTake;
        }

        public final void idle(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "");
            MatrixLifecycleThread.EZpvd.copydefault(MatrixLifecycleThread.copydefault);
            this.idleQueue.offer(runnable);
        }
    }

    public final void copydefault(ConcurrentHashMap<Thread, StateListAnimator> concurrentHashMap) {
        for (Map.Entry<Thread, StateListAnimator> entry : concurrentHashMap.entrySet()) {
            if (entry.getValue().AEQbTJ().length() != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - entry.getValue().KWHzl();
                if (jCurrentTimeMillis > TimeUnit.SECONDS.toMillis(30L)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Dispatcher Thread Not Responding:\n");
                    StackTraceElement[] stackTrace = entry.getKey().getStackTrace();
                    Intrinsics.checkNotNullExpressionValue(stackTrace, "");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append("\tat " + stackTraceElement + '\n');
                    }
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    yHO<String, String, Long, Unit> yhoAEQbTJ = KWHzl.AEQbTJ();
                    String name = entry.getKey().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    yhoAEQbTJ.invoke(name, string, Long.valueOf(jCurrentTimeMillis));
                }
            }
        }
    }
}
