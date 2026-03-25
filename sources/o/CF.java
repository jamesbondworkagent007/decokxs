package o;

import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CF implements InterfaceC5060De {
    public final CQ EZpvd;
    public final GZIPOutputStream OLrzqt;
    public final InterfaceC5060De copydefault;

    public CF(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        this.copydefault = interfaceC5060De;
        CQ cq = new CQ();
        this.EZpvd = cq;
        this.OLrzqt = new GZIPOutputStream(cq.gEmmrt(), true);
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (j == 0) {
            return 0L;
        }
        CQ cq2 = new CQ();
        long jKWHzl = this.copydefault.KWHzl(cq2, j);
        if (jKWHzl == -1) {
            this.OLrzqt.close();
        }
        if (jKWHzl == -1 && this.EZpvd.c_()) {
            return -1L;
        }
        if (jKWHzl >= 0) {
            this.OLrzqt.write(cq2.KWHzl());
            this.OLrzqt.flush();
        }
        return this.EZpvd.KWHzl(cq, j);
    }

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.OLrzqt.close();
        this.copydefault.close();
    }
}
