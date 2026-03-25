package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pSw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C38278pSw {
    public static ExecutorService OLrzqt;
    public static final C38278pSw KWHzl = new C38278pSw();
    public static final int copydefault = 8;

    private C38278pSw() {
    }

    public final void OLrzqt(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        ExecutorService executorService = OLrzqt;
        if (executorService != null) {
            Intrinsics.copydefault(executorService);
            if (executorService.isShutdown()) {
                OLrzqt = null;
            }
        }
        copydefault();
        ExecutorService executorService2 = OLrzqt;
        if (executorService2 != null) {
            executorService2.submit(runnable);
        }
    }

    public final ExecutorService copydefault() {
        if (OLrzqt == null) {
            synchronized (C38278pSw.class) {
                if (OLrzqt == null) {
                    OLrzqt = Executors.newCachedThreadPool();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return OLrzqt;
    }
}
