package o;

/* JADX INFO: renamed from: o.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5338Nw implements java.io.Closeable {
    public int AEQbTJ;
    public int EZpvd;
    public final java.io.InputStream KWHzl;
    public final java.nio.charset.Charset OLrzqt;
    public byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.AEQbTJ == -1;
    }

    public C5338Nw(java.io.InputStream inputStream, java.nio.charset.Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C5338Nw(java.io.InputStream inputStream, int i, java.nio.charset.Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(C5339Nx.AEQbTJ)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.KWHzl = inputStream;
        this.OLrzqt = charset;
        this.copydefault = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        synchronized (this.KWHzl) {
            if (this.copydefault != null) {
                this.copydefault = null;
                this.KWHzl.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt() throws java.io.IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.KWHzl) {
            if (this.copydefault == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.EZpvd >= this.AEQbTJ) {
                KWHzl();
            }
            for (int i3 = this.EZpvd; i3 != this.AEQbTJ; i3++) {
                byte[] bArr2 = this.copydefault;
                if (bArr2[i3] == 10) {
                    int i4 = this.EZpvd;
                    if (i3 != i4) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    }
                    java.lang.String str = new java.lang.String(bArr2, i4, i2 - i4, this.OLrzqt.name());
                    this.EZpvd = i3 + 1;
                    return str;
                }
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((this.AEQbTJ - this.EZpvd) + 80) { // from class: o.Nw.5
                @Override // java.io.ByteArrayOutputStream
                public java.lang.String toString() {
                    int i5 = ((java.io.ByteArrayOutputStream) this).count;
                    if (i5 > 0) {
                        int i6 = i5 - 1;
                        if (((java.io.ByteArrayOutputStream) this).buf[i6] == 13) {
                            i5 = i6;
                        }
                    }
                    try {
                        return new java.lang.String(((java.io.ByteArrayOutputStream) this).buf, 0, i5, C5338Nw.this.OLrzqt.name());
                    } catch (java.io.UnsupportedEncodingException e) {
                        throw new java.lang.AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr3 = this.copydefault;
                int i5 = this.EZpvd;
                byteArrayOutputStream.write(bArr3, i5, this.AEQbTJ - i5);
                this.AEQbTJ = -1;
                KWHzl();
                i = this.EZpvd;
                while (i != this.AEQbTJ) {
                    bArr = this.copydefault;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.EZpvd;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.EZpvd = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public final void KWHzl() throws java.io.IOException {
        java.io.InputStream inputStream = this.KWHzl;
        byte[] bArr = this.copydefault;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new java.io.EOFException();
        }
        this.EZpvd = 0;
        this.AEQbTJ = i;
    }
}
