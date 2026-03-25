package com.geetest.gtc4;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class u1 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f517a;
    public boolean b = true;
    public InputStream c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u1(c0 c0Var) {
        this.f517a = c0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final t a() throws IOException {
        c0 c0Var = this.f517a;
        int i = c0Var.f428a.read();
        f fVarA = i < 0 ? null : c0Var.a(i);
        if (fVarA == null) {
            return null;
        }
        if (fVarA instanceof t) {
            return (t) fVarA;
        }
        throw new IOException("unknown object encountered: " + fVarA.getClass());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        t tVarA;
        int i3 = 0;
        if (this.c == null) {
            if (!this.b || (tVarA = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = tVarA.c();
        }
        while (true) {
            int i4 = this.c.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                t tVarA2 = a();
                if (tVarA2 == null) {
                    this.c = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.c = tVarA2.c();
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        t tVarA;
        if (this.c == null) {
            if (!this.b || (tVarA = a()) == null) {
                return -1;
            }
            this.b = false;
            this.c = tVarA.c();
        }
        while (true) {
            int i = this.c.read();
            if (i >= 0) {
                return i;
            }
            t tVarA2 = a();
            if (tVarA2 == null) {
                this.c = null;
                return -1;
            }
            this.c = tVarA2.c();
        }
    }
}
