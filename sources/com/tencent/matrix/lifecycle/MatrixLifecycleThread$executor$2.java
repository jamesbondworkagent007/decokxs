package com.tencent.matrix.lifecycle;

import android.os.Process;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread;
import com.tencent.matrix.lifecycle.MatrixLifecycleThread$executor$2;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56406yEe;
import o.C58013ytK;

/* JADX INFO: loaded from: classes12.dex */
public final class MatrixLifecycleThread$executor$2 extends Lambda implements Function0<Executor> {
    public static final MatrixLifecycleThread$executor$2 INSTANCE = new MatrixLifecycleThread$executor$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MatrixLifecycleThread$executor$2() {
        super(0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        if (MatrixLifecycleThread.KWHzl.copydefault() != null) {
            Executor executorCopydefault = MatrixLifecycleThread.KWHzl.copydefault();
            Intrinsics.copydefault(executorCopydefault);
            return executorCopydefault;
        }
        final MatrixLifecycleThread.IdleSynchronousQueue idleSynchronousQueue = new MatrixLifecycleThread.IdleSynchronousQueue();
        return new ThreadPoolExecutor(idleSynchronousQueue, TimeUnit.SECONDS, new ThreadFactory() { // from class: o.ysa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return MatrixLifecycleThread$executor$2.invoke$lambda$3(runnable);
            }
        }, new RejectedExecutionHandler() { // from class: o.ysf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                MatrixLifecycleThread$executor$2.invoke$lambda$4(idleSynchronousQueue, runnable, threadPoolExecutor);
            }
        }) { // from class: com.tencent.matrix.lifecycle.MatrixLifecycleThread$executor$2.1
            @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                super.execute(runnable != null ? MatrixLifecycleThread.EZpvd.OLrzqt(runnable) : null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread invoke$lambda$3(final Runnable runnable) {
        String str;
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Runnable runnable2 = new Runnable() { // from class: o.ysd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                MatrixLifecycleThread$executor$2.invoke$lambda$3$lambda$1(runnable);
            }
        };
        synchronized (MatrixLifecycleThread.AhwBna) {
            str = (String) C56406yEe.uzCIH(MatrixLifecycleThread.AhwBna);
        }
        return new Thread(threadGroup, runnable2, str == null ? "matrix_x_x" : str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$3$lambda$1(Runnable runnable) {
        String name = Thread.currentThread().getName();
        int iMyTid = Process.myTid();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C58013ytK.EZpvd("Matrix.Thread", "thread: tid = " + iMyTid + ",name= " + name, new Object[0]);
        runnable.run();
        synchronized (MatrixLifecycleThread.AhwBna) {
            MatrixLifecycleThread.AhwBna.add(name);
            C58013ytK.EZpvd("Matrix.Thread", "thread(" + iMyTid + AbstractJsonLexerKt.COMMA + name + ") finished, alive time " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", now pool size = " + (5 - MatrixLifecycleThread.AhwBna.size()), new Object[0]);
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MatrixLifecycleThread.IdleSynchronousQueue idleSynchronousQueue, Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Intrinsics.checkNotNullParameter(idleSynchronousQueue, "");
        Intrinsics.checkNotNullExpressionValue(runnable, "");
        idleSynchronousQueue.idle(runnable);
    }
}
