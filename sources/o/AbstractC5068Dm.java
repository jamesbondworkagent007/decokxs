package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5068Dm implements InterfaceC5060De {
    public final InterfaceC5060De EZpvd;
    public final Buffer.UnsafeCursor copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.EZpvd.close();
    }

    public abstract void copydefault(@NotNull byte[] bArr, int i, int i2);

    public AbstractC5068Dm(@NotNull InterfaceC5060De interfaceC5060De) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        this.EZpvd = interfaceC5060De;
        this.copydefault = new Buffer.UnsafeCursor();
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        okio.Buffer bufferEZpvd = C5066Dk.EZpvd(cq);
        long jKWHzl = this.EZpvd.KWHzl(cq, j);
        if (jKWHzl <= 0) {
            return jKWHzl;
        }
        bufferEZpvd.readUnsafe(this.copydefault);
        try {
            int iSeek = this.copydefault.seek(cq.AhwBna() - jKWHzl);
            long j2 = jKWHzl;
            while (j2 > 0 && iSeek > 0) {
                int iMin = java.lang.Math.min(iSeek, (int) j2);
                Buffer.UnsafeCursor unsafeCursor = this.copydefault;
                byte[] bArr = unsafeCursor.data;
                if (bArr == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                copydefault(bArr, unsafeCursor.start, iMin);
                j2 -= (long) iMin;
                iSeek = this.copydefault.next();
            }
            return jKWHzl;
        } finally {
            this.copydefault.close();
        }
    }
}
