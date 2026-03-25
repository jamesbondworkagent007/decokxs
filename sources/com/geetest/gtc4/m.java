package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f476a;
    public final boolean b;
    public final byte[][] c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char[] a(h3 h3Var) throws IOException {
        int i = h3Var.d;
        if ((i & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i2 = i / 2;
        char[] cArr = new char[i2];
        byte[] bArr = new byte[8];
        int i3 = 0;
        int i4 = 0;
        while (i >= 8) {
            if (l7.a(h3Var, bArr, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i4] = (char) ((bArr[0] << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE));
            cArr[i4 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE));
            cArr[i4 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UnsignedBytes.MAX_VALUE));
            cArr[i4 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UnsignedBytes.MAX_VALUE));
            i4 += 4;
            i -= 8;
        }
        if (i > 0) {
            if (l7.a(h3Var, bArr, i) != i) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            while (true) {
                int i5 = i3 + 2;
                cArr[i4] = (char) ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) | (bArr[i3] << 8));
                i4++;
                if (i5 >= i) {
                    break;
                }
                i3 = i5;
            }
        }
        if (h3Var.d == 0 && i2 == i4) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g b(h3 h3Var) throws IOException {
        int i = h3Var.d;
        if (i < 1) {
            return new g(0);
        }
        m mVar = new m(h3Var, i, this.b, this.c);
        w wVarA = mVar.a();
        if (wVarA == null) {
            return new g(0);
        }
        g gVar = new g(10);
        do {
            gVar.a(wVarA);
            wVarA = mVar.a();
        } while (wVarA != null);
        return gVar;
    }

    public m(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        super(byteArrayInputStream);
        this.f476a = i;
        this.b = z;
        this.c = new byte[11][];
    }

    public m(h3 h3Var, int i, boolean z, byte[][] bArr) {
        super(h3Var);
        this.f476a = i;
        this.b = z;
        this.c = bArr;
    }

    public static byte[] a(h3 h3Var, byte[][] bArr) throws IOException {
        int i = h3Var.d;
        if (i >= bArr.length) {
            return h3Var.b();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i != 0) {
            int i2 = h3Var.b;
            if (i < i2) {
                int iA = i - l7.a(h3Var.f488a, bArr2, bArr2.length);
                h3Var.d = iA;
                if (iA == 0) {
                    h3Var.a();
                } else {
                    throw new EOFException("DEF length " + h3Var.c + " object truncated by " + h3Var.d);
                }
            } else {
                throw new IOException("corrupted stream - out of bounds length found: " + h3Var.d + " >= " + i2);
            }
        }
        return bArr2;
    }

    public final w a(int i, int i2, int i3) throws IOException {
        h3 h3Var = new h3(this, i3, this.f476a);
        if ((i & 224) == 0) {
            return a(i2, h3Var, this.c);
        }
        int i4 = i & 192;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                g gVarB = b(h3Var);
                int i6 = gVarB.b;
                if (i6 == 1) {
                    return new d3(3, i4, i2, gVarB.a(0));
                }
                z2 z2Var = x2.f532a;
                if (i6 >= 1) {
                    z2Var = new z2(gVarB);
                }
                return new d3(4, i4, i2, z2Var);
            }
            return new d3(4, i4, i2, new i2(h3Var.b()));
        }
        if (i2 == 3) {
            g gVarB2 = b(h3Var);
            int i7 = gVarB2.b;
            b[] bVarArr = new b[i7];
            while (i5 != i7) {
                f fVarA = gVarB2.a(i5);
                if (fVarA instanceof b) {
                    bVarArr[i5] = (b) fVarA;
                    i5++;
                } else {
                    throw new i("unknown object encountered in constructed BIT STRING: " + fVarA.getClass());
                }
            }
            return new b1(bVarArr);
        }
        if (i2 == 4) {
            g gVarB3 = b(h3Var);
            int i8 = gVarB3.b;
            s[] sVarArr = new s[i8];
            while (i5 != i8) {
                f fVarA2 = gVarB3.a(i5);
                if (fVarA2 instanceof s) {
                    sVarArr[i5] = (s) fVarA2;
                    i5++;
                } else {
                    throw new i("unknown object encountered in constructed OCTET STRING: " + fVarA2.getClass());
                }
            }
            return new e1(sVarArr);
        }
        if (i2 == 8) {
            g gVarB4 = b(h3Var);
            z2 z2Var2 = x2.f532a;
            if (gVarB4.b >= 1) {
                z2Var2 = new z2(gVarB4);
            }
            return new w2(z2Var2);
        }
        if (i2 != 16) {
            if (i2 == 17) {
                return x2.a(b(h3Var));
            }
            throw new IOException("unknown tag " + i2 + " encountered");
        }
        if (h3Var.d < 1) {
            return x2.f532a;
        }
        if (this.b) {
            return new l5(h3Var.b());
        }
        g gVarB5 = b(h3Var);
        return gVarB5.b < 1 ? x2.f532a : new z2(gVarB5);
    }

    public final w a() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iA = a(this, i);
        int iA2 = a((InputStream) this, this.f476a, false);
        if (iA2 >= 0) {
            try {
                return a(i, iA, iA2);
            } catch (IllegalArgumentException e) {
                throw new i("corrupted stream detected", e);
            }
        }
        if ((i & 32) != 0) {
            c0 c0Var = new c0(new j5(this, this.f476a), this.f476a, this.c);
            int i2 = i & 192;
            if (i2 != 0) {
                return c0Var.a(i2, iA);
            }
            if (iA == 3) {
                t1 t1Var = new t1(c0Var);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i3 = t1Var.read(bArr, 0, 4096);
                    if (i3 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i3);
                    } else {
                        return new b1(byteArrayOutputStream.toByteArray(), t1Var.c);
                    }
                }
            } else {
                if (iA != 4) {
                    if (iA == 8) {
                        try {
                            return new w2(new z2(c0Var.a()));
                        } catch (IllegalArgumentException e2) {
                            throw new i(e2.getMessage(), e2);
                        }
                    }
                    if (iA == 16) {
                        return new g1(c0Var.a());
                    }
                    if (iA == 17) {
                        return new i1(c0Var.a());
                    }
                    throw new IOException("unknown BER object encountered");
                }
                u1 u1Var = new u1(c0Var);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[4096];
                while (true) {
                    int i4 = u1Var.read(bArr2, 0, 4096);
                    if (i4 >= 0) {
                        byteArrayOutputStream2.write(bArr2, 0, i4);
                    } else {
                        return new e1(byteArrayOutputStream2.toByteArray());
                    }
                }
            }
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public static int a(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i4 = i3 & 127;
        if (i4 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) == 0) {
                i3 = inputStream.read();
                if (i3 < 0) {
                    throw new EOFException("EOF found inside tag value.");
                }
                i4 = (i4 << 7) | (i3 & 127);
            } else {
                throw new IOException("Tag number more than 31 bits");
            }
        }
        return i4;
    }

    public static int a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i2) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = inputStream.read();
            if (i5 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i3 = (i3 << 8) + i5;
            i4++;
        } while (i4 < (i2 & 127));
        if (i3 < i || z) {
            return i3;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i3 + " >= " + i);
    }

    public static w a(int i, h3 h3Var, byte[][] bArr) throws IOException {
        e eVar;
        try {
            switch (i) {
                case 1:
                    byte[] bArrA = a(h3Var, bArr);
                    if (bArrA.length == 1) {
                        byte b = bArrA[0];
                        if (b == -1) {
                            eVar = e.c;
                        } else {
                            if (b != 0) {
                                return new e(b);
                            }
                            eVar = e.b;
                        }
                        return eVar;
                    }
                    throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                case 2:
                    return new n(h3Var.b());
                case 3:
                    return b.a(h3Var.b());
                case 4:
                    return new i2(h3Var.b());
                case 5:
                    if (h3Var.b().length == 0) {
                        return g2.f451a;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    int i2 = h3Var.d;
                    ConcurrentHashMap concurrentHashMap = q.c;
                    if (i2 <= 4096) {
                        byte[] bArrA2 = a(h3Var, bArr);
                        if (bArrA2.length <= 4096) {
                            q qVar = (q) concurrentHashMap.get(new p(bArrA2));
                            if (qVar != null) {
                                return qVar;
                            }
                            if (x.a(bArrA2)) {
                                return new q(o0.a(bArrA2));
                            }
                            throw new IllegalArgumentException("invalid OID contents");
                        }
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    throw new IllegalArgumentException("exceeded OID contents length limit");
                case 7:
                    return new o(new e2(h3Var.b()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i + " encountered");
                case 10:
                    return h.a(a(h3Var, bArr), true);
                case 12:
                    return new q2(h3Var.b());
                case 13:
                    int i3 = h3Var.d;
                    ConcurrentHashMap concurrentHashMap2 = x.c;
                    if (i3 <= 4096) {
                        byte[] bArrA3 = a(h3Var, bArr);
                        if (bArrA3.length <= 4096) {
                            x xVar = (x) concurrentHashMap2.get(new p(bArrA3));
                            if (xVar != null) {
                                return xVar;
                            }
                            if (x.a(bArrA3)) {
                                return new x(o0.a(bArrA3));
                            }
                            throw new IllegalArgumentException("invalid relative OID contents");
                        }
                        throw new IllegalArgumentException("exceeded relative OID contents length limit");
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i + " encountered");
                case 18:
                    return new h2(h3Var.b());
                case 19:
                    return new l2(h3Var.b());
                case 20:
                    return new o2(h3Var.b());
                case 21:
                    return new s2(h3Var.b());
                case 22:
                    return new f2(h3Var.b());
                case 23:
                    return new e0(h3Var.b());
                case 24:
                    return new k(h3Var.b());
                case 25:
                    return new e2(h3Var.b());
                case 26:
                    return new t2(h3Var.b());
                case 27:
                    return new c2(h3Var.b());
                case 28:
                    return new r2(h3Var.b());
                case 30:
                    return new y1(a(h3Var));
            }
        } catch (IllegalArgumentException e) {
            throw new i(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new i(e2.getMessage(), e2);
        }
    }
}
