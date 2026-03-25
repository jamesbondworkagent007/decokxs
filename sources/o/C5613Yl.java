package o;

/* JADX INFO: renamed from: o.Yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5613Yl extends java.io.OutputStream {
    public final java.nio.ByteBuffer KWHzl;

    public C5613Yl(java.nio.ByteBuffer byteBuffer) {
        this.KWHzl = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.KWHzl.put((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.KWHzl.put(bArr, i, i2);
    }
}
