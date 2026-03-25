package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065Dj implements InterfaceC5060De {
    public final Source copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Source OLrzqt() {
        return this.copydefault;
    }

    public C5065Dj(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "");
        this.copydefault = source;
    }

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.copydefault.close();
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        return this.copydefault.read(C5066Dk.EZpvd(cq), j);
    }
}
