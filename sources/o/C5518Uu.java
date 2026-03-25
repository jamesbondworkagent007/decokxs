package o;

/* JADX INFO: renamed from: o.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5518Uu extends java.io.OutputStream {
    public final java.io.DataOutput AEQbTJ;

    public C5518Uu(java.io.DataOutput dataOutput) {
        this.AEQbTJ = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        this.AEQbTJ.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws java.io.IOException {
        this.AEQbTJ.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.AEQbTJ.write(bArr, i, i2);
    }
}
