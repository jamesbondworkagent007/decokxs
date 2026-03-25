package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MC {
    public C5213Jb EZpvd;
    public final LN KWHzl;
    public final java.lang.Object OLrzqt;
    public final java.util.Set<LH> copydefault;

    public MC(@NotNull LN ln) {
        Intrinsics.checkNotNullParameter(ln, "");
        this.KWHzl = ln;
        this.OLrzqt = new java.lang.Object();
        this.copydefault = new LinkedHashSet();
        this.EZpvd = new C5213Jb(null, null, null, 7, null);
    }

    public static /* synthetic */ void track$default(MC mc, LH lh, LF lf, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lf = null;
        }
        mc.OLrzqt(lh, lf);
    }

    public final void OLrzqt(@NotNull LH lh, LF lf) {
        Intrinsics.checkNotNullParameter(lh, "");
        synchronized (this.OLrzqt) {
            C5213Jb c5213JbAEQbTJ = MA.AEQbTJ(lf);
            if (!MA.AEQbTJ(this.EZpvd, c5213JbAEQbTJ)) {
                this.copydefault.clear();
            }
            this.EZpvd = c5213JbAEQbTJ;
            if (this.copydefault.contains(lh)) {
                return;
            }
            this.copydefault.add(lh);
            this.KWHzl.copydefault(lh);
        }
    }
}
