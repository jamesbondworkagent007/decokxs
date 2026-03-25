package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5523Uz extends java.io.Reader {
    public final boolean AEQbTJ;
    public int AYXKKw;
    public java.io.InputStream AhwBna;
    public byte[] EZpvd;
    public int KWHzl;
    public final C5517Ut OLrzqt;
    public int copydefault;
    public char djBIcL = 0;
    public int gEmmrt;
    public char[] isConnected;
    public final boolean valueOf;

    public C5523Uz(C5517Ut c5517Ut, java.io.InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.OLrzqt = c5517Ut;
        this.AhwBna = inputStream;
        this.EZpvd = bArr;
        this.AYXKKw = i;
        this.gEmmrt = i2;
        this.AEQbTJ = z;
        this.valueOf = inputStream != null;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.io.InputStream inputStream = this.AhwBna;
        if (inputStream != null) {
            this.AhwBna = null;
            copydefault();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws java.io.IOException {
        if (this.isConnected == null) {
            this.isConnected = new char[1];
        }
        if (read(this.isConnected, 0, 1) < 1) {
            return -1;
        }
        return this.isConnected[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4;
        int i5;
        if (this.EZpvd == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            KWHzl(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c = this.djBIcL;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.djBIcL = (char) 0;
        } else {
            int i7 = this.gEmmrt - this.AYXKKw;
            if (i7 < 4 && !KWHzl(i7)) {
                if (i7 == 0) {
                    return -1;
                }
                EZpvd(this.gEmmrt - this.AYXKKw, 4);
            }
            i3 = i;
        }
        int i8 = this.gEmmrt;
        while (true) {
            if (i3 >= i6) {
                break;
            }
            int i9 = this.AYXKKw;
            if (i9 > i8 - 4) {
                break;
            }
            if (this.AEQbTJ) {
                byte[] bArr = this.EZpvd;
                i4 = (bArr[i9] << 8) | (bArr[i9 + 1] & UnsignedBytes.MAX_VALUE);
                i5 = (bArr[i9 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i9 + 2] & UnsignedBytes.MAX_VALUE) << 8);
            } else {
                byte[] bArr2 = this.EZpvd;
                byte b = bArr2[i9];
                byte b2 = bArr2[i9 + 1];
                int i10 = (bArr2[i9 + 3] << 8) | (bArr2[i9 + 2] & UnsignedBytes.MAX_VALUE);
                int i11 = (b & UnsignedBytes.MAX_VALUE) | ((b2 & UnsignedBytes.MAX_VALUE) << 8);
                i4 = i10;
                i5 = i11;
            }
            this.AYXKKw = i9 + 4;
            if (i4 != 0) {
                int i12 = 65535 & i4;
                int i13 = i5 | ((i12 - 1) << 16);
                if (i12 > 16) {
                    copydefault(i13, i3 - i, java.lang.String.format(" (above 0x%08x)", 1114111));
                }
                int i14 = i3 + 1;
                cArr[i3] = (char) ((i13 >> 10) + 55296);
                if (i14 >= i6) {
                    this.djBIcL = (char) i13;
                    i3 = i14;
                    break;
                }
                i5 = 56320 | (i13 & 1023);
                i3 = i14;
            }
            cArr[i3] = (char) i5;
            i3++;
        }
        int i15 = i3 - i;
        this.copydefault += i15;
        return i15;
    }

    public final void EZpvd(int i, int i2) throws java.io.IOException {
        int i3 = this.KWHzl;
        throw new java.io.CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + this.copydefault + ", byte #" + (i3 + i) + ")");
    }

    public final void copydefault(int i, int i2, java.lang.String str) throws java.io.IOException {
        int i3 = this.KWHzl;
        int i4 = this.AYXKKw;
        int i5 = this.copydefault;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(java.lang.Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i5 + i2);
        sb.append(", byte #");
        sb.append((i3 + i4) - 1);
        sb.append(")");
        throw new java.io.CharConversionException(sb.toString());
    }

    public final boolean KWHzl(int i) throws java.io.IOException {
        byte[] bArr;
        java.io.InputStream inputStream = this.AhwBna;
        if (inputStream == null || (bArr = this.EZpvd) == null) {
            return false;
        }
        this.KWHzl += this.gEmmrt - i;
        if (i > 0) {
            int i2 = this.AYXKKw;
            if (i2 > 0) {
                java.lang.System.arraycopy(bArr, i2, bArr, 0, i);
                this.AYXKKw = 0;
            }
            this.gEmmrt = i;
        } else {
            this.AYXKKw = 0;
            int i3 = inputStream.read(bArr);
            if (i3 < 1) {
                this.gEmmrt = 0;
                if (i3 < 0) {
                    if (this.valueOf) {
                        copydefault();
                    }
                    return false;
                }
                EZpvd();
            }
            this.gEmmrt = i3;
        }
        while (true) {
            int i4 = this.gEmmrt;
            if (i4 >= 4) {
                return true;
            }
            java.io.InputStream inputStream2 = this.AhwBna;
            byte[] bArr2 = this.EZpvd;
            int i5 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            if (i5 < 1) {
                if (i5 < 0) {
                    if (this.valueOf) {
                        copydefault();
                    }
                    EZpvd(this.gEmmrt, 4);
                }
                EZpvd();
            }
            this.gEmmrt += i5;
        }
    }

    public final void copydefault() {
        byte[] bArr = this.EZpvd;
        if (bArr != null) {
            this.EZpvd = null;
            C5517Ut c5517Ut = this.OLrzqt;
            if (c5517Ut != null) {
                c5517Ut.copydefault(bArr);
            }
        }
    }

    public final void KWHzl(char[] cArr, int i, int i2) throws java.io.IOException {
        throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("read(buf,%d,%d), cbuf[%d]", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(cArr.length)));
    }

    public final void EZpvd() throws java.io.IOException {
        throw new java.io.IOException("Strange I/O stream, returned 0 bytes on read");
    }
}
