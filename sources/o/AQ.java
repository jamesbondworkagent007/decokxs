package o;

import kotlin.jvm.internal.Intrinsics;
import o.GI;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AQ implements Sink {
    public final GI AEQbTJ;
    public final InterfaceC57843yq EZpvd;
    public final BufferedSink OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.OLrzqt.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // okio.Sink
    public Timeout timeout() {
        return this.OLrzqt.timeout();
    }

    public AQ(@NotNull BufferedSink bufferedSink, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(bufferedSink, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.OLrzqt = bufferedSink;
        this.AEQbTJ = gi;
        this.EZpvd = interfaceC57843yq;
    }

    @Override // okio.Sink
    public void write(@NotNull okio.Buffer buffer, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(buffer, "");
        this.OLrzqt.write(buffer, j);
        GI.TaskDescription.add$default(this.AEQbTJ, j, this.EZpvd, null, 4, null);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.OLrzqt.emit();
        this.OLrzqt.close();
    }
}
