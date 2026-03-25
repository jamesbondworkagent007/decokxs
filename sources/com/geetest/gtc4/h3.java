package com.geetest.gtc4;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class h3 extends o5 {
    public static final byte[] e = new byte[0];
    public final int c;
    public int d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h3(InputStream inputStream, int i, int i2) {
        super(inputStream, i2);
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            a();
        }
        this.c = i;
        this.d = i;
    }

    public final byte[] b() throws IOException {
        int i = this.d;
        if (i == 0) {
            return e;
        }
        int i2 = this.b;
        if (i < i2) {
            byte[] bArr = new byte[i];
            int iA = i - l7.a(this.f488a, bArr, i);
            this.d = iA;
            if (iA == 0) {
                a();
                return bArr;
            }
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        throw new IOException("corrupted stream - out of bounds length found: " + this.d + " >= " + i2);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int i = this.f488a.read();
        if (i >= 0) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                a();
            }
            return i;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.f488a.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            int i5 = this.d - i4;
            this.d = i5;
            if (i5 == 0) {
                a();
            }
            return i4;
        }
        throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
    }
}
