package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36561odL {
    public final android.os.Handler KWHzl;
    public final long OLrzqt;

    public C36561odL(@NotNull android.os.Handler handler, long j) {
        Intrinsics.checkNotNullParameter(handler, "");
        this.KWHzl = handler;
        this.OLrzqt = j;
    }

    public final void OLrzqt(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl.removeCallbacksAndMessages(null);
        this.KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.odO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36561odL.EZpvd(function0);
            }
        }, this.OLrzqt);
    }

    public static final void EZpvd(Function0 function0) {
        function0.invoke();
    }

    public final void OLrzqt() {
        this.KWHzl.removeCallbacksAndMessages(null);
    }
}
