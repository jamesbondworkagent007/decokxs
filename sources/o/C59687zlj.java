package o;

import java.security.MessageDigest;

/* JADX INFO: renamed from: o.zlj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59687zlj extends java.io.OutputStream {
    public final MessageDigest AEQbTJ;
    public byte[] KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] EZpvd() {
        return this.KWHzl;
    }

    public C59687zlj(MessageDigest messageDigest) {
        this.AEQbTJ = messageDigest;
        messageDigest.reset();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        if (this.OLrzqt) {
            throw new java.io.IOException("Stream has been already closed");
        }
        this.AEQbTJ.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.OLrzqt) {
            throw new java.io.IOException("Stream has been already closed");
        }
        this.AEQbTJ.update(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.KWHzl = this.AEQbTJ.digest();
        super.close();
    }
}
