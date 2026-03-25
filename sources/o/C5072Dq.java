package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5072Dq implements Sink {
    public final InterfaceC5058Dc KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5058Dc EZpvd() {
        return this.KWHzl;
    }

    public C5072Dq(@NotNull InterfaceC5058Dc interfaceC5058Dc) {
        Intrinsics.checkNotNullParameter(interfaceC5058Dc, "");
        this.KWHzl = interfaceC5058Dc;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.KWHzl.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.KWHzl.EZpvd();
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(@NotNull okio.Buffer buffer, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(buffer, "");
        this.KWHzl.AEQbTJ(new CQ(buffer), j);
    }
}
