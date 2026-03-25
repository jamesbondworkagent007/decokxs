package o;

import kotlin.jvm.internal.Intrinsics;
import o.GI;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AN implements Source {
    public final GI AEQbTJ;
    public final InterfaceC57843yq EZpvd;
    public final Source OLrzqt;

    public AN(@NotNull Source source, @NotNull GI gi, @NotNull InterfaceC57843yq interfaceC57843yq) {
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(gi, "");
        Intrinsics.checkNotNullParameter(interfaceC57843yq, "");
        this.OLrzqt = source;
        this.AEQbTJ = gi;
        this.EZpvd = interfaceC57843yq;
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.OLrzqt.timeout();
    }

    @Override // okio.Source
    public long read(@NotNull okio.Buffer buffer, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(buffer, "");
        long j2 = this.OLrzqt.read(buffer, j);
        if (j2 > 0) {
            GI.TaskDescription.add$default(this.AEQbTJ, j2, this.EZpvd, null, 4, null);
        }
        return j2;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.OLrzqt.close();
    }
}
