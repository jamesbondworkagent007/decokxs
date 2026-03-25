package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f490a;
    public final u7 b;
    public final z5 c;
    public final n1 d;
    public final s7 e;
    public final m0 f;
    public final r5 g;
    public final p7 h;
    public final j7 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p1(ByteArrayInputStream byteArrayInputStream) {
        this.f490a = byteArrayInputStream;
        this.b = new u7(this, byteArrayInputStream);
        this.c = new z5(this, byteArrayInputStream);
        this.d = new n1(this, byteArrayInputStream);
        this.e = new s7(this, byteArrayInputStream);
        this.f = new m0(this, byteArrayInputStream);
        this.g = new r5(this, byteArrayInputStream);
        this.h = new p7(this, byteArrayInputStream);
        this.i = new j7(this, byteArrayInputStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f3 a() {
        f3 u6Var;
        double dPow;
        double dPow2;
        float f;
        try {
            int i = this.f490a.read();
            if (i == -1) {
                return null;
            }
            long j = 0;
            switch (o1.f484a[p5.ofByte(i).ordinal()]) {
                case 1:
                    m0 m0Var = this.f;
                    long jA = m0Var.a(i);
                    if (jA != -1) {
                        l0 l0Var = new l0(Math.abs((int) jA));
                        while (j < jA) {
                            f3 f3VarA = m0Var.b.a();
                            if (f3VarA == null) {
                                throw new q1("Unexpected end of stream");
                            }
                            l0Var.d.add(f3VarA);
                            j++;
                        }
                        return l0Var;
                    }
                    l0 l0Var2 = new l0();
                    l0Var2.c = true;
                    m0Var.b.getClass();
                    while (true) {
                        f3 f3VarA2 = m0Var.b.a();
                        if (f3VarA2 == null) {
                            throw new q1("Unexpected end of stream");
                        }
                        h7 h7Var = h7.d;
                        if (h7Var.equals(f3VarA2)) {
                            l0Var2.d.add(h7Var);
                            return l0Var2;
                        }
                        l0Var2.d.add(f3VarA2);
                    }
                    break;
                case 2:
                    n1 n1Var = this.d;
                    long jA2 = n1Var.a(i);
                    if (jA2 != -1) {
                        return new m1(n1Var.a(jA2));
                    }
                    n1Var.b.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        f3 f3VarA3 = n1Var.b.a();
                        if (f3VarA3 == null) {
                            throw new q1("Unexpected end of stream");
                        }
                        p5 p5Var = f3VarA3.f446a;
                        if (h7.d.equals(f3VarA3)) {
                            return new m1(byteArrayOutputStream.toByteArray());
                        }
                        if (p5Var != p5.BYTE_STRING) {
                            throw new q1("Unexpected major type " + p5Var);
                        }
                        byte[] bArr = ((m1) f3VarA3).d;
                        if (bArr == null) {
                            bArr = null;
                        }
                        if (bArr != null) {
                            byteArrayOutputStream.write(bArr, 0, bArr.length);
                        }
                    }
                    break;
                case 3:
                    r5 r5Var = this.g;
                    long jA3 = r5Var.a(i);
                    if (jA3 != -1) {
                        q5 q5Var = new q5(Math.abs((int) jA3));
                        while (j < jA3) {
                            f3 f3VarA4 = r5Var.b.a();
                            f3 f3VarA5 = r5Var.b.a();
                            if (f3VarA4 == null || f3VarA5 == null) {
                                throw new q1("Unexpected end of stream");
                            }
                            r5Var.b.getClass();
                            if (q5Var.d.put(f3VarA4, f3VarA5) == null) {
                                q5Var.e.add(f3VarA4);
                            }
                            j++;
                        }
                        return q5Var;
                    }
                    q5 q5Var2 = new q5();
                    q5Var2.c = true;
                    r5Var.b.getClass();
                    while (true) {
                        f3 f3VarA6 = r5Var.b.a();
                        if (h7.d.equals(f3VarA6)) {
                            return q5Var2;
                        }
                        f3 f3VarA7 = r5Var.b.a();
                        if (f3VarA6 != null && f3VarA7 != null) {
                            r5Var.b.getClass();
                            if (q5Var2.d.put(f3VarA6, f3VarA7) == null) {
                                q5Var2.e.add(f3VarA6);
                            }
                        }
                    }
                    throw new q1("Unexpected end of stream");
                case 4:
                    return new y5(z5.c.subtract(this.c.b(i)));
                case 5:
                    return this.e.d(i);
                case 6:
                    return new t7(this.b.b(i));
                case 7:
                    j7 j7Var = this.i;
                    j7Var.getClass();
                    switch (i7.b[k7.ofByte(i).ordinal()]) {
                        case 1:
                            return h7.d;
                        case 2:
                            int i2 = i7.f463a[v6.ofByte(i).ordinal()];
                            if (i2 == 1) {
                                return u6.g;
                            }
                            if (i2 == 2) {
                                return u6.h;
                            }
                            if (i2 == 3) {
                                return u6.i;
                            }
                            if (i2 == 4) {
                                return u6.j;
                            }
                            if (i2 != 5) {
                                throw new q1("Not implemented");
                            }
                            u6Var = new u6(i & 31);
                            break;
                            break;
                        case 3:
                            byte[] bArrC = j7Var.c.c(2);
                            int i3 = (bArrC[1] & UnsignedBytes.MAX_VALUE) | ((bArrC[0] & UnsignedBytes.MAX_VALUE) << 8);
                            int i4 = (32768 & i3) >> 15;
                            int i5 = (i3 & 31744) >> 10;
                            int i6 = i3 & 1023;
                            if (i5 == 0) {
                                dPow = Math.pow(2.0d, -14.0d) * ((double) (i4 == 0 ? 1 : -1));
                                dPow2 = ((double) i6) / Math.pow(2.0d, 10.0d);
                            } else if (i5 == 31) {
                                f = i6 != 0 ? Float.NaN : (i4 == 0 ? 1 : -1) * Float.POSITIVE_INFINITY;
                                u6Var = new z3(f);
                            } else {
                                dPow = ((double) (i4 == 0 ? 1 : -1)) * Math.pow(2.0d, i5 - 15);
                                dPow2 = (((double) i6) / Math.pow(2.0d, 10.0d)) + 1.0d;
                            }
                            f = (float) (dPow2 * dPow);
                            u6Var = new z3(f);
                            break;
                        case 4:
                            byte[] bArrC2 = j7Var.d.c(4);
                            return new w6(Float.intBitsToFloat((bArrC2[3] & UnsignedBytes.MAX_VALUE) | ((((((bArrC2[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArrC2[1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArrC2[2] & UnsignedBytes.MAX_VALUE)) << 8)));
                        case 5:
                            byte[] bArrC3 = j7Var.e.c(8);
                            long j2 = bArrC3[0] & UnsignedBytes.MAX_VALUE;
                            return new j3(Double.longBitsToDouble(((long) (bArrC3[7] & UnsignedBytes.MAX_VALUE)) | (((((((((((((j2 << 8) | (bArrC3[1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArrC3[2] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrC3[3] & UnsignedBytes.MAX_VALUE))) << 8) | ((long) (bArrC3[4] & UnsignedBytes.MAX_VALUE))) << 8) | ((long) (bArrC3[5] & UnsignedBytes.MAX_VALUE))) << 8) | ((long) (bArrC3[6] & UnsignedBytes.MAX_VALUE))) << 8)));
                        case 6:
                            return new u6(j7Var.a());
                        default:
                            throw new q1("Not implemented");
                    }
                    return u6Var;
                case 8:
                    o7 o7Var = new o7(this.h.a(i));
                    f3 f3VarA8 = a();
                    if (f3VarA8 == null) {
                        throw new q1("Unexpected end of stream: tag without following data item.");
                    }
                    long j3 = o7Var.c;
                    if (j3 == 30) {
                        if (!(f3VarA8 instanceof l0)) {
                            throw new q1("Error decoding RationalNumber: not an array");
                        }
                        l0 l0Var3 = (l0) f3VarA8;
                        if (l0Var3.d.size() != 2) {
                            throw new q1("Error decoding RationalNumber: array size is not 2");
                        }
                        f3 f3Var = (f3) l0Var3.d.get(0);
                        if (!(f3Var instanceof d6)) {
                            throw new q1("Error decoding RationalNumber: first data item is not a number");
                        }
                        f3 f3Var2 = (f3) l0Var3.d.get(1);
                        if (f3Var2 instanceof d6) {
                            return new q6((d6) f3Var, (d6) f3Var2);
                        }
                        throw new q1("Error decoding RationalNumber: second data item is not a number");
                    }
                    if (j3 == 38) {
                        if (!(f3VarA8 instanceof l0)) {
                            throw new q1("Error decoding LanguageTaggedString: not an array");
                        }
                        l0 l0Var4 = (l0) f3VarA8;
                        if (l0Var4.d.size() != 2) {
                            throw new q1("Error decoding LanguageTaggedString: array size is not 2");
                        }
                        f3 f3Var3 = (f3) l0Var4.d.get(0);
                        if (!(f3Var3 instanceof r7)) {
                            throw new q1("Error decoding LanguageTaggedString: first data item is not an UnicodeString");
                        }
                        f3 f3Var4 = (f3) l0Var4.d.get(1);
                        if (f3Var4 instanceof r7) {
                            return new k5((r7) f3Var3, (r7) f3Var4);
                        }
                        throw new q1("Error decoding LanguageTaggedString: second data item is not an UnicodeString");
                    }
                    f3 f3Var5 = f3VarA8;
                    while (true) {
                        o7 o7Var2 = f3Var5.b;
                        if (o7Var2 == null) {
                            f3Var5.b = o7Var;
                            return f3VarA8;
                        }
                        f3Var5 = o7Var2;
                    }
                    break;
                default:
                    throw new q1("Not implemented major type " + i);
            }
        } catch (IOException e) {
            throw new q1(e);
        }
    }
}
