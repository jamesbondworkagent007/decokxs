package o;

import java.util.LinkedList;

/* JADX INFO: renamed from: o.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5537Vn extends java.io.OutputStream {
    public static final byte[] AEQbTJ = new byte[0];
    public final C5536Vm EZpvd;
    public final LinkedList<byte[]> KWHzl;
    public byte[] OLrzqt;
    public int copydefault;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.copydefault = i;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.copydefault;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public C5537Vn() {
        this((C5536Vm) null);
    }

    public C5537Vn(C5536Vm c5536Vm) {
        this(c5536Vm, 500);
    }

    public C5537Vn(int i) {
        this(null, i);
    }

    public C5537Vn(C5536Vm c5536Vm, int i) {
        this.KWHzl = new LinkedList<>();
        this.EZpvd = c5536Vm;
        this.OLrzqt = c5536Vm == null ? new byte[i > 131072 ? 131072 : i] : c5536Vm.AEQbTJ(2);
    }

    public C5537Vn(C5536Vm c5536Vm, byte[] bArr, int i) {
        this.KWHzl = new LinkedList<>();
        this.EZpvd = null;
        this.OLrzqt = bArr;
        this.copydefault = i;
    }

    public static C5537Vn AEQbTJ(byte[] bArr, int i) {
        return new C5537Vn(null, bArr, i);
    }

    public void djBIcL() {
        this.gEmmrt = 0;
        this.copydefault = 0;
        if (this.KWHzl.isEmpty()) {
            return;
        }
        this.KWHzl.clear();
    }

    public void OLrzqt() {
        byte[] bArr;
        djBIcL();
        C5536Vm c5536Vm = this.EZpvd;
        if (c5536Vm == null || (bArr = this.OLrzqt) == null) {
            return;
        }
        c5536Vm.EZpvd(2, bArr);
        this.OLrzqt = null;
    }

    public void copydefault(int i) {
        if (this.copydefault >= this.OLrzqt.length) {
            AEQbTJ();
        }
        byte[] bArr = this.OLrzqt;
        int i2 = this.copydefault;
        this.copydefault = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void OLrzqt(int i) {
        int i2 = this.copydefault;
        byte[] bArr = this.OLrzqt;
        int i3 = i2 + 1;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 8);
            this.copydefault = i2 + 2;
            bArr[i3] = (byte) i;
        } else {
            copydefault(i >> 8);
            copydefault(i);
        }
    }

    public void EZpvd(int i) {
        int i2 = this.copydefault;
        byte[] bArr = this.OLrzqt;
        int i3 = i2 + 2;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 16);
            bArr[i2 + 1] = (byte) (i >> 8);
            this.copydefault = i2 + 3;
            bArr[i3] = (byte) i;
            return;
        }
        copydefault(i >> 16);
        copydefault(i >> 8);
        copydefault(i);
    }

    public byte[] AYXKKw() {
        int i = this.gEmmrt + this.copydefault;
        if (i == 0) {
            return AEQbTJ;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this.KWHzl) {
            int length = bArr2.length;
            java.lang.System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        java.lang.System.arraycopy(this.OLrzqt, 0, bArr, i2, this.copydefault);
        int i3 = i2 + this.copydefault;
        if (i3 != i) {
            throw new java.lang.RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this.KWHzl.isEmpty()) {
            djBIcL();
        }
        return bArr;
    }

    public byte[] valueOf() {
        djBIcL();
        return this.OLrzqt;
    }

    public byte[] KWHzl() {
        AEQbTJ();
        return this.OLrzqt;
    }

    public byte[] AEQbTJ(int i) {
        this.copydefault = i;
        return AYXKKw();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = java.lang.Math.min(this.OLrzqt.length - this.copydefault, i2);
            if (iMin > 0) {
                java.lang.System.arraycopy(bArr, i, this.OLrzqt, this.copydefault, iMin);
                i += iMin;
                this.copydefault += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                AEQbTJ();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        copydefault(i);
    }

    public final void AEQbTJ() {
        int length = this.gEmmrt + this.OLrzqt.length;
        if (length < 0) {
            throw new java.lang.IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.gEmmrt = length;
        int iMax = java.lang.Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.KWHzl.add(this.OLrzqt);
        this.OLrzqt = new byte[iMax];
        this.copydefault = 0;
    }
}
