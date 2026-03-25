package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import o.AbstractC58253yxm;

/* JADX INFO: loaded from: classes13.dex */
public final class yAW extends AbstractC58253yxm {
    public static final RxThreadFactory copydefault = new RxThreadFactory("RxNewThreadScheduler", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory KWHzl;

    public yAW() {
        this(copydefault);
    }

    public yAW(ThreadFactory threadFactory) {
        this.KWHzl = threadFactory;
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new yAT(this.KWHzl);
    }
}
