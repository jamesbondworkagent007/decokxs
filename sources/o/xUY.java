package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class xUY {
    public final android.os.Handler AEQbTJ = new android.os.Handler();
    public final ActionBar KWHzl = new ActionBar();
    public Function1<? super java.lang.Long, Unit> copydefault;

    public static final class ActionBar implements java.lang.Runnable {
        public long AEQbTJ;
        public long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(long j) {
            this.KWHzl = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.AEQbTJ = j;
        }

        public ActionBar() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = this.KWHzl - this.AEQbTJ;
            this.KWHzl = j;
            if (j < 0) {
                Function1 function1 = xUY.this.copydefault;
                if (function1 != null) {
                    function1.invoke(null);
                }
                xUY.this.AEQbTJ();
                return;
            }
            Function1 function12 = xUY.this.copydefault;
            if (function12 != null) {
                function12.invoke(java.lang.Long.valueOf(this.KWHzl));
            }
            xUY.this.AEQbTJ.postDelayed(this, this.AEQbTJ);
        }
    }

    public static /* synthetic */ void start$default(xUY xuy, long j, long j2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        xuy.copydefault(j, j2, function1);
    }

    public final void copydefault(long j, long j2, Function1<? super java.lang.Long, Unit> function1) {
        this.AEQbTJ.removeCallbacks(this.KWHzl);
        this.KWHzl.KWHzl(j);
        this.KWHzl.OLrzqt(j2);
        this.copydefault = function1;
        this.AEQbTJ.postDelayed(this.KWHzl, j2);
    }

    public final void AEQbTJ() {
        this.copydefault = null;
        this.AEQbTJ.removeCallbacks(this.KWHzl);
    }
}
