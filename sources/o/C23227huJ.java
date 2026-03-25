package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.huJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23227huJ {
    public final long AEQbTJ;
    public long EZpvd;
    public final int copydefault;
    public android.os.Handler OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
    public java.util.ArrayList<java.lang.Exception> KWHzl = new java.util.ArrayList<>();

    public C23227huJ(long j, int i) {
        this.AEQbTJ = j;
        this.copydefault = i;
        this.EZpvd = j;
    }

    public final void KWHzl(@NotNull java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (C23313hvq.KWHzl(java.lang.Integer.valueOf(this.KWHzl.size()), java.lang.Integer.valueOf(this.copydefault))) {
            this.KWHzl.add(exc);
        }
    }

    public final void OLrzqt() {
        this.KWHzl.clear();
    }

    public final void AEQbTJ(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.KWHzl.isEmpty()) {
            this.EZpvd = this.AEQbTJ;
        } else if (C23313hvq.KWHzl(java.lang.Long.valueOf(this.EZpvd), java.lang.Long.valueOf(this.AEQbTJ * ((long) this.copydefault))) & C23313hvq.copydefault(java.lang.Integer.valueOf(this.KWHzl.size()), java.lang.Integer.valueOf(this.copydefault))) {
            this.EZpvd += this.AEQbTJ;
        }
        this.OLrzqt.postDelayed(new java.lang.Runnable() { // from class: o.huI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C23227huJ.copydefault(function0);
            }
        }, this.EZpvd);
    }

    public static final void copydefault(Function0 function0) {
        function0.invoke();
    }

    public final void EZpvd() {
        OLrzqt();
        this.EZpvd = this.AEQbTJ;
        this.OLrzqt.removeCallbacksAndMessages(null);
    }

    public final void KWHzl() {
        this.OLrzqt.removeCallbacksAndMessages(null);
    }
}
