package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CQ implements CR, CO {
    public final okio.Buffer AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final okio.Buffer OLrzqt() {
        return this.AEQbTJ;
    }

    @Override // o.CO
    public CQ copydefault() {
        return this;
    }

    public CQ() {
        this(new okio.Buffer());
    }

    public CQ(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "");
        this.AEQbTJ = buffer;
    }

    public final long AhwBna() {
        return this.AEQbTJ.size();
    }

    public java.lang.String toString() {
        return this.AEQbTJ.toString();
    }

    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CQ) {
            return Intrinsics.EZpvd(this.AEQbTJ, ((CQ) obj).AEQbTJ);
        }
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return this.AEQbTJ.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return this.AEQbTJ.write(byteBuffer);
    }

    @Override // o.CO
    public void AEQbTJ() {
        this.AEQbTJ.emit();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.AEQbTJ.isOpen();
    }

    public java.io.OutputStream gEmmrt() {
        return this.AEQbTJ.outputStream();
    }

    public byte valueOf() {
        return OLrzqt().readByte();
    }

    public int AEQbTJ(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return OLrzqt().read(bArr, i, i2);
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        return OLrzqt().read(cq.OLrzqt(), j);
    }

    @Override // o.CR
    public byte[] KWHzl() {
        return OLrzqt().readByteArray();
    }

    public byte[] EZpvd(long j) {
        return OLrzqt().readByteArray(j);
    }

    public java.lang.String AYXKKw() {
        return OLrzqt().readUtf8();
    }

    @Override // o.CR
    public boolean c_() {
        return OLrzqt().exhausted();
    }

    @Override // o.CO
    public void OLrzqt(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        OLrzqt().write(bArr, i, i2);
    }

    @Override // o.InterfaceC5058Dc
    public void AEQbTJ(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        OLrzqt().write(C5066Dk.EZpvd(cq), j);
    }

    @Override // o.CO
    public long KWHzl(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        return OLrzqt().writeAll(C5066Dk.copydefault(interfaceC5060De));
    }

    @Override // o.CO
    public void OLrzqt(@NotNull java.lang.String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt().writeUtf8(str, i, i2);
    }

    @Override // o.InterfaceC5058Dc
    public void EZpvd() {
        OLrzqt().flush();
    }

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        OLrzqt().close();
    }
}
