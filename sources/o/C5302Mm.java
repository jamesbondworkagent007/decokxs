package o;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5302Mm {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public final ScheduledExecutorService EZpvd;
    public final C5303Mn KWHzl;
    public final java.lang.Object OLrzqt;
    public Future<?> copydefault;

    public C5302Mm(@NotNull C5303Mn c5303Mn, @NotNull ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(c5303Mn, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.KWHzl = c5303Mn;
        this.EZpvd = scheduledExecutorService;
        this.OLrzqt = new java.lang.Object();
    }

    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        synchronized (this.OLrzqt) {
            if (this.AYXKKw) {
                return;
            }
            this.AYXKKw = true;
            copydefault(0, this.KWHzl.EZpvd(), function0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void copydefault() {
        synchronized (this.OLrzqt) {
            if (!this.AEQbTJ) {
                this.AEQbTJ = true;
                Future<?> future = this.copydefault;
                if (future != null) {
                    future.cancel(true);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void copydefault(final int i, final long j, final Function0<Unit> function0) {
        synchronized (this.OLrzqt) {
            this.copydefault = this.EZpvd.schedule(new java.lang.Runnable() { // from class: o.Mj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C5302Mm.EZpvd(this.OLrzqt, function0, i, j);
                }
            }, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void EZpvd(C5302Mm c5302Mm, Function0 function0, int i, long j) {
        Intrinsics.checkNotNullParameter(c5302Mm, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (c5302Mm.AEQbTJ) {
            return;
        }
        try {
            function0.invoke();
        } catch (java.lang.Exception unused) {
            int i2 = i + 1;
            if (i2 < c5302Mm.KWHzl.copydefault()) {
                c5302Mm.copydefault(i2, (long) java.lang.Math.min(j * c5302Mm.KWHzl.KWHzl(), c5302Mm.KWHzl.AEQbTJ()), function0);
            }
        }
    }
}
