package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C4356Bc implements InterfaceC5060De {
    public final java.lang.String EZpvd;
    public final CM copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.copydefault.close();
    }

    public C4356Bc(@NotNull java.lang.String str, @NotNull CM cm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cm, "");
        this.EZpvd = str;
        this.copydefault = cm;
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        long jKWHzl = this.copydefault.KWHzl(cq, j);
        if (jKWHzl == -1) {
            C4490Bg.copydefault(this.EZpvd, C5162Hc.OLrzqt(this.copydefault.KWHzl()));
        }
        return jKWHzl;
    }
}
