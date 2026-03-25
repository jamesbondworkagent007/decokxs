package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class xUS {
    public Function1<? super java.lang.Long, Unit> EZpvd;
    public final android.os.Handler KWHzl = new android.os.Handler();
    public final StateListAnimator copydefault = new StateListAnimator();

    public static final class StateListAnimator implements java.lang.Runnable {
        public long EZpvd;
        public long KWHzl;
        public long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(long j) {
            this.OLrzqt = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(long j) {
            this.KWHzl = j;
        }

        public StateListAnimator() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = this.KWHzl - this.OLrzqt;
            this.KWHzl = j;
            if (j < 0) {
                Function1 function1 = xUS.this.EZpvd;
                if (function1 != null) {
                    function1.invoke(null);
                }
                xUS.this.copydefault();
                return;
            }
            if (j <= this.EZpvd) {
                Function1 function12 = xUS.this.EZpvd;
                if (function12 != null) {
                    function12.invoke(java.lang.Long.valueOf(this.KWHzl));
                }
                xUS.this.KWHzl.postDelayed(this, this.OLrzqt);
                return;
            }
            Function1 function13 = xUS.this.EZpvd;
            if (function13 != null) {
                function13.invoke(null);
            }
            xUS.this.KWHzl.postDelayed(this, this.OLrzqt);
        }
    }

    public final void KWHzl(long j, long j2, long j3, Function1<? super java.lang.Long, Unit> function1) {
        this.KWHzl.removeCallbacks(this.copydefault);
        this.copydefault.copydefault(j);
        this.copydefault.AEQbTJ(j2);
        this.copydefault.KWHzl(j3);
        this.EZpvd = function1;
        this.KWHzl.postDelayed(this.copydefault, j3);
    }

    public final void copydefault() {
        this.EZpvd = null;
        this.KWHzl.removeCallbacks(this.copydefault);
    }
}
