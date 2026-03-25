package o;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ozC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37718ozC {
    public boolean AEQbTJ;
    public boolean KWHzl;
    public boolean OLrzqt;
    public final Queue<java.lang.Runnable> copydefault = new ArrayDeque();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl || !this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.ozC$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public final /* synthetic */ java.lang.Runnable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.Runnable runnable) {
            this.OLrzqt = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C37718ozC.this.KWHzl(this.OLrzqt);
        }
    }

    public final void copydefault() {
        if (this.AEQbTJ) {
            return;
        }
        try {
            this.AEQbTJ = true;
            while ((!this.copydefault.isEmpty()) && OLrzqt()) {
                java.lang.Runnable runnablePoll = this.copydefault.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.AEQbTJ = false;
        }
    }

    public final void AEQbTJ(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        CoroutineDispatcher coroutineDispatcherOLrzqt = sDN.copydefault.OLrzqt();
        if (coroutineDispatcherOLrzqt.isDispatchNeeded(coroutineContext) || OLrzqt()) {
            coroutineDispatcherOLrzqt.mo7471dispatch(coroutineContext, new StateListAnimator(runnable));
        } else {
            KWHzl(runnable);
        }
    }

    public final void KWHzl(java.lang.Runnable runnable) {
        if (!this.copydefault.offer(runnable)) {
            throw new java.lang.IllegalStateException("cannot enqueue any more runnables".toString());
        }
        copydefault();
    }
}
