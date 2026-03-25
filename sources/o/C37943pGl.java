package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: renamed from: o.pGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37943pGl {
    public static final C37943pGl OLrzqt = new C37943pGl();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pGh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37943pGl.copydefault();
        }
    });
    public static final int EZpvd = 8;

    private C37943pGl() {
    }

    public final CoroutineDispatcher OLrzqt() {
        return (CoroutineDispatcher) AEQbTJ.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, java.util.concurrent.ExecutorService] */
    public static final ExecutorCoroutineDispatcher copydefault() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? NewCachedThreadPool = Executors.newCachedThreadPool(new ThreadFactory() { // from class: o.pGi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return C37943pGl.copydefault(objectRef, runnable);
            }
        });
        objectRef.element = NewCachedThreadPool;
        Intrinsics.checkNotNullExpressionValue(NewCachedThreadPool, "");
        return ExecutorsKt.from((ExecutorService) NewCachedThreadPool);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Thread copydefault(Ref.ObjectRef objectRef, java.lang.Runnable runnable) {
        try {
            Result.Application application = Result.Companion;
            T t = objectRef.element;
            ThreadPoolExecutor threadPoolExecutor = t instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) t : null;
            java.lang.Integer numValueOf = threadPoolExecutor != null ? java.lang.Integer.valueOf(threadPoolExecutor.getActiveCount()) : null;
            T t2 = objectRef.element;
            ThreadPoolExecutor threadPoolExecutor2 = t2 instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) t2 : null;
            pUU.KWHzl("KlineSchedulerExecutor", "current Kline CachedThreadPool active Count :  " + numValueOf + " and PoolCount: " + (threadPoolExecutor2 != null ? java.lang.Integer.valueOf(threadPoolExecutor2.getPoolSize()) : null));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return new java.lang.Thread(runnable, "market-" + java.lang.System.nanoTime());
    }
}
