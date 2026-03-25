package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5615Yn extends java.io.InputStream {
    public final java.nio.ByteBuffer AEQbTJ;

    public C5615Yn(java.nio.ByteBuffer byteBuffer) {
        this.AEQbTJ = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.AEQbTJ.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        if (this.AEQbTJ.hasRemaining()) {
            return this.AEQbTJ.get() & UnsignedBytes.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (!this.AEQbTJ.hasRemaining()) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, this.AEQbTJ.remaining());
        this.AEQbTJ.get(bArr, i, iMin);
        return iMin;
    }
}
