package o;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5050Cu implements CR {
    public final BufferedSource KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BufferedSource EZpvd() {
        return this.KWHzl;
    }

    public AbstractC5050Cu(@NotNull BufferedSource bufferedSource) {
        Intrinsics.checkNotNullParameter(bufferedSource, "");
        this.KWHzl = bufferedSource;
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        return this.KWHzl.read(C5066Dk.EZpvd(cq), j);
    }

    @Override // o.CR
    public byte[] KWHzl() {
        return this.KWHzl.readByteArray();
    }

    @Override // o.CR
    public boolean c_() {
        return this.KWHzl.exhausted();
    }

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.KWHzl.close();
    }
}
