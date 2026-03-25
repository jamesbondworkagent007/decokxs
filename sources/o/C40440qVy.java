package o;

import com.okinc.core.util.SPUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: renamed from: o.qVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40440qVy {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final InterfaceC56387yDm<ExecutorCoroutineDispatcher> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.qVu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40440qVy.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.qVy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qVy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final CoroutineDispatcher AEQbTJ() {
            return (CoroutineDispatcher) C40440qVy.copydefault.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.concurrent.ThreadPoolExecutor] */
    public static final ExecutorCoroutineDispatcher AEQbTJ() {
        Dispatchers.getDefault();
        SPUtils.getBoolean("switch_check_market_executor", false, "market_debug_pre_file");
        int iCopydefault = C56548yJl.copydefault(java.lang.Runtime.getRuntime().availableProcessors(), 12);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? threadPoolExecutor = new ThreadPoolExecutor(iCopydefault, iCopydefault * 2, 60L, java.util.concurrent.TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: o.qVw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return C40440qVy.AEQbTJ(objectRef, runnable);
            }
        }, new ThreadPoolExecutor.CallerRunsPolicy());
        objectRef.element = threadPoolExecutor;
        return ExecutorsKt.from((ExecutorService) threadPoolExecutor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Thread AEQbTJ(Ref.ObjectRef objectRef, java.lang.Runnable runnable) {
        try {
            Result.Application application = Result.Companion;
            T t = objectRef.element;
            ThreadPoolExecutor threadPoolExecutor = t instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) t : null;
            java.lang.Integer numValueOf = threadPoolExecutor != null ? java.lang.Integer.valueOf(threadPoolExecutor.getActiveCount()) : null;
            T t2 = objectRef.element;
            ThreadPoolExecutor threadPoolExecutor2 = t2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) t2 : null;
            pUU.KWHzl("Market_SchedulerExecutor", "current Market ThreadPoolExecutor active Count : " + numValueOf + " and PoolCount: " + (threadPoolExecutor2 != null ? java.lang.Integer.valueOf(threadPoolExecutor2.getPoolSize()) : null));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return new java.lang.Thread(runnable, "market-" + java.lang.System.nanoTime());
    }
}
