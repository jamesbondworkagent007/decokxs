package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5069Dn implements InterfaceC5058Dc {
    public final InterfaceC5058Dc AEQbTJ;
    public final Buffer.UnsafeCursor KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5058Dc
    public void EZpvd() throws java.io.IOException {
        this.AEQbTJ.EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5058Dc, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws java.io.IOException {
        this.AEQbTJ.close();
    }

    public abstract void copydefault(@NotNull byte[] bArr, int i, int i2);

    public AbstractC5069Dn(@NotNull InterfaceC5058Dc interfaceC5058Dc) {
        Intrinsics.checkNotNullParameter(interfaceC5058Dc, "");
        this.AEQbTJ = interfaceC5058Dc;
        this.KWHzl = new Buffer.UnsafeCursor();
    }

    @Override // o.InterfaceC5058Dc
    public void AEQbTJ(@NotNull CQ cq, long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        C5066Dk.EZpvd(cq).readUnsafe(this.KWHzl);
        try {
            int iSeek = this.KWHzl.seek(0L);
            long j2 = j;
            while (iSeek > 0 && j2 > 0) {
                int iMin = java.lang.Math.min(iSeek, (int) j2);
                Buffer.UnsafeCursor unsafeCursor = this.KWHzl;
                byte[] bArr = unsafeCursor.data;
                if (bArr == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                copydefault(bArr, unsafeCursor.start, iMin);
                j2 -= (long) iMin;
                iSeek = this.KWHzl.next();
            }
            this.KWHzl.close();
            this.AEQbTJ.AEQbTJ(cq, j);
        } catch (java.lang.Throwable th) {
            this.KWHzl.close();
            throw th;
        }
    }
}
