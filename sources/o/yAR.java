package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC58253yxm;
import o.InterfaceC56322yBb;

/* JADX INFO: loaded from: classes13.dex */
public final class yAR extends AbstractC58253yxm implements InterfaceC56322yBb {
    public static final StateListAnimator AEQbTJ;
    public static final int EZpvd = KWHzl(java.lang.Runtime.getRuntime().availableProcessors(), java.lang.Integer.getInteger("rx2.computation-threads", 0).intValue());
    public static final ActionBar OLrzqt;
    public static final RxThreadFactory copydefault;
    public final ThreadFactory AhwBna;
    public final AtomicReference<ActionBar> KWHzl;

    public static int KWHzl(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    static {
        StateListAnimator stateListAnimator = new StateListAnimator(new RxThreadFactory("RxComputationShutdown"));
        AEQbTJ = stateListAnimator;
        stateListAnimator.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", java.lang.Math.max(1, java.lang.Math.min(10, java.lang.Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        copydefault = rxThreadFactory;
        ActionBar actionBar = new ActionBar(0, rxThreadFactory);
        OLrzqt = actionBar;
        actionBar.AEQbTJ();
    }

    public static final class ActionBar implements InterfaceC56322yBb {
        public long AEQbTJ;
        public final int KWHzl;
        public final StateListAnimator[] OLrzqt;

        public ActionBar(int i, ThreadFactory threadFactory) {
            this.KWHzl = i;
            this.OLrzqt = new StateListAnimator[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.OLrzqt[i2] = new StateListAnimator(threadFactory);
            }
        }

        public StateListAnimator copydefault() {
            int i = this.KWHzl;
            if (i == 0) {
                return yAR.AEQbTJ;
            }
            StateListAnimator[] stateListAnimatorArr = this.OLrzqt;
            long j = this.AEQbTJ;
            this.AEQbTJ = 1 + j;
            return stateListAnimatorArr[(int) (j % ((long) i))];
        }

        public void AEQbTJ() {
            for (StateListAnimator stateListAnimator : this.OLrzqt) {
                stateListAnimator.dispose();
            }
        }

        @Override // o.InterfaceC56322yBb
        public void copydefault(int i, InterfaceC56322yBb.ActionBar actionBar) {
            int i2 = this.KWHzl;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    actionBar.KWHzl(i3, yAR.AEQbTJ);
                }
                return;
            }
            int i4 = ((int) this.AEQbTJ) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                actionBar.KWHzl(i5, new Activity(this.OLrzqt[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.AEQbTJ = i4;
        }
    }

    public yAR() {
        this(copydefault);
    }

    public yAR(ThreadFactory threadFactory) {
        this.AhwBna = threadFactory;
        this.KWHzl = new AtomicReference<>(OLrzqt);
        start();
    }

    @Override // o.AbstractC58253yxm
    public AbstractC58253yxm.StateListAnimator createWorker() {
        return new Activity(this.KWHzl.get().copydefault());
    }

    @Override // o.InterfaceC56322yBb
    public void copydefault(int i, InterfaceC56322yBb.ActionBar actionBar) {
        C58297yyd.OLrzqt(i, "number > 0 required");
        this.KWHzl.get().copydefault(i, actionBar);
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC scheduleDirect(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.KWHzl.get().copydefault().EZpvd(runnable, j, timeUnit);
    }

    @Override // o.AbstractC58253yxm
    public InterfaceC58217yxC schedulePeriodicallyDirect(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return this.KWHzl.get().copydefault().copydefault(runnable, j, j2, timeUnit);
    }

    @Override // o.AbstractC58253yxm
    public void start() {
        ActionBar actionBar = new ActionBar(EZpvd, this.AhwBna);
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.KWHzl, OLrzqt, actionBar)) {
            return;
        }
        actionBar.AEQbTJ();
    }

    @Override // o.AbstractC58253yxm
    public void shutdown() {
        ActionBar actionBar;
        ActionBar actionBar2;
        do {
            actionBar = this.KWHzl.get();
            actionBar2 = OLrzqt;
            if (actionBar == actionBar2) {
                return;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.KWHzl, actionBar, actionBar2));
        actionBar.AEQbTJ();
    }

    public static final class Activity extends AbstractC58253yxm.StateListAnimator {
        public final C58237yxW AEQbTJ;
        public final StateListAnimator EZpvd;
        public final C58216yxB KWHzl;
        public volatile boolean OLrzqt;
        public final C58237yxW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58217yxC
        public boolean isDisposed() {
            return this.OLrzqt;
        }

        public Activity(StateListAnimator stateListAnimator) {
            this.EZpvd = stateListAnimator;
            C58237yxW c58237yxW = new C58237yxW();
            this.copydefault = c58237yxW;
            C58216yxB c58216yxB = new C58216yxB();
            this.KWHzl = c58216yxB;
            C58237yxW c58237yxW2 = new C58237yxW();
            this.AEQbTJ = c58237yxW2;
            c58237yxW2.AEQbTJ(c58237yxW);
            c58237yxW2.AEQbTJ(c58216yxB);
        }

        @Override // o.InterfaceC58217yxC
        public void dispose() {
            if (this.OLrzqt) {
                return;
            }
            this.OLrzqt = true;
            this.AEQbTJ.dispose();
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable) {
            if (this.OLrzqt) {
                return EmptyDisposable.INSTANCE;
            }
            return this.EZpvd.OLrzqt(runnable, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, this.copydefault);
        }

        @Override // o.AbstractC58253yxm.StateListAnimator
        public InterfaceC58217yxC schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (this.OLrzqt) {
                return EmptyDisposable.INSTANCE;
            }
            return this.EZpvd.OLrzqt(runnable, j, timeUnit, this.KWHzl);
        }
    }

    public static final class StateListAnimator extends yAT {
        public StateListAnimator(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
