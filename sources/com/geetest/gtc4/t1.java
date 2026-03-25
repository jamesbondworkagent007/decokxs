package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class t1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f512a;
    public boolean b = true;
    public int c = 0;
    public c d;
    public InputStream e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t1(c0 c0Var) {
        this.f512a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final c a() throws IOException {
        c0 c0Var = this.f512a;
        int i = c0Var.f428a.read();
        f fVarA = i < 0 ? null : c0Var.a(i);
        if (fVarA == null) {
            return null;
        }
        if (fVarA instanceof c) {
            if (this.c == 0) {
                return (c) fVarA;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + fVarA.getClass());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = 0;
        if (this.e == null) {
            if (!this.b) {
                return -1;
            }
            c cVarA = a();
            this.d = cVarA;
            if (cVarA == null) {
                return -1;
            }
            this.b = false;
            this.e = cVarA.a();
        }
        while (true) {
            int i4 = this.e.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.c = this.d.e();
                c cVarA2 = a();
                this.d = cVarA2;
                if (cVarA2 == null) {
                    this.e = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.e = cVarA2.a();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.e == null) {
            if (!this.b) {
                return -1;
            }
            c cVarA = a();
            this.d = cVarA;
            if (cVarA == null) {
                return -1;
            }
            this.b = false;
            this.e = cVarA.a();
        }
        while (true) {
            int i = this.e.read();
            if (i >= 0) {
                return i;
            }
            this.c = this.d.e();
            c cVarA2 = a();
            this.d = cVarA2;
            if (cVarA2 == null) {
                this.e = null;
                return -1;
            }
            this.e = cVarA2.a();
        }
    }
}
