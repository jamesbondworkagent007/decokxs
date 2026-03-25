package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5 f428a;
    public final int b;
    public final byte[][] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c0(o5 o5Var, int i, byte[][] bArr) {
        this.f428a = o5Var;
        this.b = i;
        this.c = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k1 a(int i, int i2) {
        g gVarA = a();
        int i3 = gVarA.b;
        if (i3 == 1) {
            return new k1(3, i, i2, gVarA.a(0));
        }
        g1 g1Var = d1.f435a;
        if (i3 >= 1) {
            g1Var = new g1(gVarA);
        }
        return new k1(4, i, i2, g1Var);
    }

    public final g a() {
        int i = this.f428a.read();
        if (i < 0) {
            return new g(0);
        }
        g gVar = new g(10);
        do {
            f fVarA = a(i);
            if (fVarA instanceof i5) {
                gVar.a(((i5) fVarA).b());
            } else {
                gVar.a(fVarA.d());
            }
            i = this.f428a.read();
        } while (i >= 0);
        return gVar;
    }

    public final f a(int i) throws IOException {
        o5 o5Var = this.f428a;
        if (o5Var instanceof j5) {
            j5 j5Var = (j5) o5Var;
            j5Var.f = false;
            j5Var.b();
        }
        int iA = m.a(this.f428a, i);
        int iA2 = m.a(this.f428a, this.b, iA == 3 || iA == 4 || iA == 16 || iA == 17 || iA == 8);
        if (iA2 < 0) {
            if ((i & 32) != 0) {
                c0 c0Var = new c0(new j5(this.f428a, this.b), this.b, this.c);
                int i2 = i & 192;
                if (i2 != 0) {
                    return new l1(i2, iA, c0Var);
                }
                if (iA == 3) {
                    return new c1(c0Var);
                }
                if (iA == 4) {
                    return new f1(c0Var);
                }
                if (iA == 8) {
                    return new b2(c0Var);
                }
                if (iA == 16) {
                    return new h1(c0Var);
                }
                if (iA == 17) {
                    return new j1(c0Var);
                }
                throw new i("unknown BER object encountered: 0x" + Integer.toHexString(iA));
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        h3 h3Var = new h3(this.f428a, iA2, this.b);
        if ((i & 224) == 0) {
            if (iA == 3) {
                return new v2(h3Var);
            }
            if (iA == 4) {
                return new j2(h3Var);
            }
            if (iA == 8) {
                throw new i("externals must use constructed encoding (see X.690 8.18)");
            }
            if (iA == 16) {
                throw new i("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (iA != 17) {
                try {
                    return m.a(iA, h3Var, this.c);
                } catch (IllegalArgumentException e) {
                    throw new i("corrupted stream detected", e);
                }
            }
            throw new i("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        c0 c0Var2 = new c0(h3Var, h3Var.b, this.c);
        int i3 = i & 192;
        if (i3 != 0) {
            return new e3(i3, iA, (i & 32) != 0, c0Var2);
        }
        if (iA == 3) {
            return new c1(c0Var2);
        }
        if (iA == 4) {
            return new f1(c0Var2);
        }
        if (iA == 8) {
            return new b2(c0Var2);
        }
        if (iA == 16) {
            return new a3(c0Var2);
        }
        if (iA == 17) {
            return new c3(c0Var2);
        }
        throw new i("unknown DL object encountered: 0x" + Integer.toHexString(iA));
    }
}
