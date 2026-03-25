package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5063Dh implements InterfaceC5058Dc {
    public final Sink EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Sink copydefault() {
        return this.EZpvd;
    }

    public C5063Dh(@NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "");
        this.EZpvd = sink;
    }

    @Override // o.InterfaceC5058Dc, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws java.io.IOException {
        this.EZpvd.close();
    }

    @Override // o.InterfaceC5058Dc
    public void EZpvd() throws java.io.IOException {
        this.EZpvd.flush();
    }

    @Override // o.InterfaceC5058Dc
    public void AEQbTJ(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        this.EZpvd.write(C5066Dk.EZpvd(cq), j);
    }
}
