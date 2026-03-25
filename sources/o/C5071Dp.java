package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5071Dp implements Source {
    public final InterfaceC5060De EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5060De KWHzl() {
        return this.EZpvd;
    }

    public C5071Dp(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        this.EZpvd = interfaceC5060De;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.EZpvd.close();
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Source
    public long read(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "");
        return this.EZpvd.KWHzl(new CQ(buffer), j);
    }
}
