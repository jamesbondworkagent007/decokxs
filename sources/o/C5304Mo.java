package o;

import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5307Mr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5304Mo<T> {
    public AbstractC5307Mr<T> AEQbTJ;
    public final java.lang.Object KWHzl = new java.lang.Object();

    public static /* synthetic */ AbstractC5307Mr wait$default(C5304Mo c5304Mo, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return c5304Mo.EZpvd(j);
    }

    public final AbstractC5307Mr<T> EZpvd(long j) {
        AbstractC5307Mr<T> actionBar;
        synchronized (this.KWHzl) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jCurrentTimeMillis2 = jCurrentTimeMillis;
            while (true) {
                if ((jCurrentTimeMillis2 - jCurrentTimeMillis >= j && j != 0) || this.AEQbTJ != null) {
                    break;
                }
                try {
                    this.KWHzl.wait(j);
                    jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                } catch (java.lang.InterruptedException e) {
                    this.AEQbTJ = new AbstractC5307Mr.ActionBar(e);
                }
            }
            actionBar = this.AEQbTJ;
            if (actionBar == null) {
                actionBar = new AbstractC5307Mr.ActionBar(new TimeoutException("Lock timed out waiting " + j + " ms for notify."));
            }
        }
        return actionBar;
    }

    public final void EZpvd(@NotNull AbstractC5307Mr<T> abstractC5307Mr) {
        Intrinsics.checkNotNullParameter(abstractC5307Mr, "");
        synchronized (this.KWHzl) {
            this.AEQbTJ = abstractC5307Mr;
            this.KWHzl.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
