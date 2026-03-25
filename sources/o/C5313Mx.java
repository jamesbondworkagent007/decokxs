package o;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5313Mx {
    public ScheduledFuture<?> EZpvd;
    public final ScheduledExecutorService KWHzl;
    public final long OLrzqt;
    public final Function0<Unit> copydefault;

    public C5313Mx(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull Function0<Unit> function0, long j) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = scheduledExecutorService;
        this.copydefault = function0;
        this.OLrzqt = j;
    }

    public static final void OLrzqt(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    public final void OLrzqt() {
        ScheduledExecutorService scheduledExecutorService = this.KWHzl;
        final Function0<Unit> function0 = this.copydefault;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.Mv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C5313Mx.OLrzqt(function0);
            }
        };
        long j = this.OLrzqt;
        this.EZpvd = scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
