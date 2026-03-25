package com.okinc.network.util;

import com.okinc.network.okg.core.ThreadPoolType;
import com.okinc.network.util.DOHDispatcherIO;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import o.C43357rnk;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes9.dex */
public final class DOHDispatcherIO {
    private final CoroutineDispatcher dispatcher;
    private final ThreadPoolExecutor threadPool;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    private static final InterfaceC56387yDm<DOHDispatcherIO> instance$delegate = C56392yDr.copydefault(new Function0() { // from class: o.rph
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DOHDispatcherIO.instance_delegate$lambda$0();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThreadPoolExecutor getThreadPool() {
        return this.threadPool;
    }

    public DOHDispatcherIO() {
        ThreadPoolExecutor threadPoolExecutorKWHzl = C43357rnk.KWHzl.KWHzl(ThreadPoolType.DOH);
        this.threadPool = threadPoolExecutorKWHzl;
        this.dispatcher = ExecutorsKt.from((ExecutorService) threadPoolExecutorKWHzl);
    }

    public final void shutdown() {
        this.threadPool.shutdown();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.util.DOHDispatcherIO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DOHDispatcherIO KWHzl() {
            return (DOHDispatcherIO) DOHDispatcherIO.instance$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DOHDispatcherIO instance_delegate$lambda$0() {
        return new DOHDispatcherIO();
    }
}
