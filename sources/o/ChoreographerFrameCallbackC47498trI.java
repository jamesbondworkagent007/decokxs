package o;

import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ChoreographerFrameCallbackC47498trI implements Choreographer.FrameCallback {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public long AYXKKw;
    public final android.os.Handler EZpvd;
    public final StateListAnimator OLrzqt;
    public int copydefault;
    public final yHO<java.lang.String, java.lang.String, java.lang.String, Unit> djBIcL;
    public long gEmmrt;
    public long valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChoreographerFrameCallbackC47498trI(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.djBIcL = yho;
        this.EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());
        this.OLrzqt = new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.trI$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.trI.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.trI$StateListAnimator */
    public static final class StateListAnimator implements java.lang.Runnable {
        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - ChoreographerFrameCallbackC47498trI.this.valueOf;
            long j = jCurrentTimeMillis > 0 ? ((long) (ChoreographerFrameCallbackC47498trI.this.AEQbTJ * 1000)) / jCurrentTimeMillis : 0L;
            if (j <= 45) {
                ChoreographerFrameCallbackC47498trI.this.copydefault++;
            }
            ChoreographerFrameCallbackC47498trI.this.gEmmrt += j;
            ChoreographerFrameCallbackC47498trI.this.AYXKKw++;
            ChoreographerFrameCallbackC47498trI.this.AEQbTJ = 0;
            ChoreographerFrameCallbackC47498trI.this.valueOf = java.lang.System.currentTimeMillis();
            ChoreographerFrameCallbackC47498trI.this.EZpvd.postDelayed(this, 1000L);
        }
    }

    public final void KWHzl() {
        this.AEQbTJ = 0;
        this.AYXKKw = 0L;
        this.gEmmrt = 0L;
        this.copydefault = 0;
        this.valueOf = java.lang.System.currentTimeMillis();
        this.EZpvd.removeCallbacksAndMessages(null);
        android.view.Choreographer.getInstance().postFrameCallback(this);
        this.EZpvd.postDelayed(this.OLrzqt, 1000L);
    }

    public final void OLrzqt() {
        long j = this.AYXKKw;
        if (j > 0) {
            long j2 = this.gEmmrt / j;
            this.djBIcL.invoke(java.lang.String.valueOf(j2), java.lang.String.valueOf(this.copydefault), java.lang.String.valueOf(this.AYXKKw));
            pUU.KWHzl("FPSCollector", "avgFps: " + j2 + ", lowFpsCnt: " + this.copydefault + " , stayDuration: " + this.AYXKKw);
        }
        android.view.Choreographer.getInstance().removeFrameCallback(this);
        this.EZpvd.removeCallbacksAndMessages(null);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.AEQbTJ++;
        android.view.Choreographer.getInstance().postFrameCallback(this);
    }
}
