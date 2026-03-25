package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;

/* JADX INFO: renamed from: o.xNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54585xNv {
    public static final C54585xNv KWHzl = new C54585xNv();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xNB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54585xNv.KWHzl();
        }
    });
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xNx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54585xNv.AEQbTJ();
        }
    });
    public static CoroutineDispatcher OLrzqt = ThreadPoolDispatcherKt.newSingleThreadContext("trade_core_manager");
    public static final int EZpvd = 8;

    private C54585xNv() {
    }

    public final CoroutineDispatcher EZpvd() {
        return (CoroutineDispatcher) AEQbTJ.getValue();
    }

    public static final ExecutorCoroutineDispatcher KWHzl() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "");
        return ExecutorsKt.from(executorServiceNewCachedThreadPool);
    }

    public final CoroutineScope djBIcL() {
        return (CoroutineScope) copydefault.getValue();
    }

    public static final CoroutineScope AEQbTJ() {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(KWHzl.AYXKKw()).plus(new TaskDescription(CoroutineExceptionHandler.Key)));
    }

    /* JADX INFO: renamed from: o.xNv$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("trade_init", "TradeCoreScope CoroutineExceptionHandler", th);
        }
    }

    public final CoroutineDispatcher AYXKKw() {
        if (OLrzqt == null) {
            OLrzqt = ThreadPoolDispatcherKt.newSingleThreadContext("trade_core_manager");
            pUU.KWHzl("TradeCoreDispatcherUtils", "create single thread");
        }
        CoroutineDispatcher coroutineDispatcher = OLrzqt;
        return coroutineDispatcher == null ? Dispatchers.getIO() : coroutineDispatcher;
    }

    public final CoroutineDispatcher gEmmrt() {
        return EZpvd();
    }

    public final CoroutineScope AhwBna() {
        return djBIcL();
    }
}
