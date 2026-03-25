package o;

import o.C23274hvD;
import o.C52761wXj;

/* JADX INFO: renamed from: o.kjK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28888kjK {
    public static final long AEQbTJ;
    public static final long KWHzl;
    public static final long OLrzqt;
    public static final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int KWHzl(long j) {
        return j < OLrzqt ? C52761wXj.ActionBar.values : j < KWHzl ? C52761wXj.Activity.hdpuIA : j < copydefault ? C52761wXj.Activity.hNurIN : j < AEQbTJ ? C52761wXj.ActionBar.OuxcSI : C23274hvD.StateListAnimator.AEQbTJ;
    }

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        OLrzqt = timeUnit.toMillis(10L);
        KWHzl = timeUnit.toMillis(30L);
        copydefault = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        AEQbTJ = java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
    }
}
