package o;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5049Ct implements CO {
    public final BufferedSink copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BufferedSink KWHzl() {
        return this.copydefault;
    }

    public AbstractC5049Ct(@NotNull BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "");
        this.copydefault = bufferedSink;
    }

    public java.lang.String toString() {
        return this.copydefault.toString();
    }

    @Override // o.CO
    public CQ copydefault() {
        return C5066Dk.AEQbTJ(this.copydefault.getBuffer());
    }

    @Override // o.CO
    public void OLrzqt(@NotNull byte[] bArr, int i, int i2) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.copydefault.write(bArr, i, i2);
    }

    @Override // o.InterfaceC5058Dc
    public void AEQbTJ(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        this.copydefault.write(C5066Dk.EZpvd(cq), j);
    }

    @Override // o.CO
    public long KWHzl(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        return this.copydefault.writeAll(C5066Dk.copydefault(interfaceC5060De));
    }

    @Override // o.CO
    public void OLrzqt(@NotNull java.lang.String str, int i, int i2) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.writeUtf8(str, i, i2);
    }

    @Override // o.InterfaceC5058Dc
    public void EZpvd() throws java.io.IOException {
        this.copydefault.flush();
    }

    @Override // o.CO
    public void AEQbTJ() throws java.io.IOException {
        this.copydefault.emit();
    }

    @Override // o.InterfaceC5058Dc, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws java.io.IOException {
        this.copydefault.close();
    }
}
