package o;

/* JADX INFO: loaded from: classes21.dex */
public final class UQ {
    public int AEQbTJ;
    public final byte[] KWHzl = new byte[24];

    private UQ() {
    }

    public static java.lang.String copydefault(double d) {
        return new UQ().AEQbTJ(d);
    }

    public final java.lang.String AEQbTJ(double d) {
        int iOLrzqt = OLrzqt(d);
        if (iOLrzqt != 0) {
            return iOLrzqt != 1 ? iOLrzqt != 2 ? iOLrzqt != 3 ? iOLrzqt != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return KWHzl();
    }

    public final int OLrzqt(double d) {
        long jDoubleToRawLongBits = java.lang.Double.doubleToRawLongBits(d);
        long j = 4503599627370495L & jDoubleToRawLongBits;
        int i = ((int) (jDoubleToRawLongBits >>> 52)) & 2047;
        if (i >= 2047) {
            if (j != 0) {
                return 5;
            }
            return jDoubleToRawLongBits > 0 ? 3 : 4;
        }
        this.AEQbTJ = -1;
        if (jDoubleToRawLongBits < 0) {
            EZpvd(45);
        }
        if (i == 0) {
            if (j == 0) {
                return jDoubleToRawLongBits == 0 ? 1 : 2;
            }
            if (j < 3) {
                return AEQbTJ(-1074, j * 10, -1);
            }
            return AEQbTJ(-1074, j, 0);
        }
        int i2 = 1075 - i;
        long j2 = j | 4503599627370496L;
        if ((i2 < 53) & (i2 > 0)) {
            long j3 = j2 >> i2;
            if ((j3 << i2) == j2) {
                return EZpvd(j3, 0);
            }
        }
        return AEQbTJ(-i2, j2, 0);
    }

    public final int AEQbTJ(int i, long j, int i2) {
        long j2;
        int iEZpvd;
        long j3;
        long j4;
        int i3 = ((int) j) & 1;
        long j5 = j << 2;
        if ((j != 4503599627370496L) | (i == -1074)) {
            j2 = j5 - 2;
            iEZpvd = US.KWHzl(i);
        } else {
            j2 = j5 - 1;
            iEZpvd = US.EZpvd(i);
        }
        int iCopydefault = i + US.copydefault(-iEZpvd) + 2;
        long jAEQbTJ = US.AEQbTJ(iEZpvd);
        long jOLrzqt = US.OLrzqt(iEZpvd);
        long jOLrzqt2 = OLrzqt(jAEQbTJ, jOLrzqt, j5 << iCopydefault);
        long jOLrzqt3 = OLrzqt(jAEQbTJ, jOLrzqt, j2 << iCopydefault);
        long jOLrzqt4 = OLrzqt(jAEQbTJ, jOLrzqt, (j5 + 2) << iCopydefault);
        long j6 = jOLrzqt2 >> 2;
        if (j6 >= 100) {
            long jEZpvd = US.EZpvd(j6, 1844674407370955168L) * 10;
            long j7 = 10 + jEZpvd;
            j3 = j6;
            long j8 = i3;
            boolean z = jOLrzqt3 + j8 <= (jEZpvd << 2);
            if (z != ((j7 << 2) + j8 <= jOLrzqt4)) {
                if (!z) {
                    jEZpvd = j7;
                }
                return EZpvd(jEZpvd, iEZpvd);
            }
            j4 = 1;
        } else {
            j3 = j6;
            j4 = 1;
        }
        long j9 = j3 + j4;
        long j10 = i3;
        boolean z2 = jOLrzqt3 + j10 <= (j3 << 2);
        if (z2 != ((j9 << 2) + j10 <= jOLrzqt4)) {
            return EZpvd(z2 ? j3 : j9, iEZpvd + i2);
        }
        long j11 = jOLrzqt2 - ((j3 + j9) << 1);
        return EZpvd((j11 < 0 || (j11 == 0 && (j3 & 1) == 0)) ? j3 : j9, iEZpvd + i2);
    }

    public static long OLrzqt(long j, long j2, long j3) {
        long jEZpvd = US.EZpvd(j2, j3);
        long jEZpvd2 = US.EZpvd(j, j3);
        long j4 = ((j * j3) >>> 1) + jEZpvd;
        return (((j4 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63) | (jEZpvd2 + (j4 >>> 63));
    }

    public final int EZpvd(long j, int i) {
        int iKWHzl = US.KWHzl(64 - java.lang.Long.numberOfLeadingZeros(j));
        if (j >= US.djBIcL(iKWHzl)) {
            iKWHzl++;
        }
        long jDjBIcL = j * US.djBIcL(17 - iKWHzl);
        int i2 = i + iKWHzl;
        long jEZpvd = US.EZpvd(jDjBIcL, 193428131138340668L) >>> 20;
        int i3 = (int) (jDjBIcL - (100000000 * jEZpvd));
        int i4 = (int) ((1441151881 * jEZpvd) >>> 57);
        int i5 = (int) (jEZpvd - ((long) (100000000 * i4)));
        if (i2 > 0 && i2 <= 7) {
            return copydefault(i4, i5, i3, i2);
        }
        if (-3 < i2 && i2 <= 0) {
            return AEQbTJ(i4, i5, i3, i2);
        }
        return OLrzqt(i4, i5, i3, i2);
    }

    public final int copydefault(int i, int i2, int i3, int i4) {
        copydefault(i);
        int iAYXKKw = AYXKKw(i2);
        int i5 = 1;
        while (i5 < i4) {
            int i6 = iAYXKKw * 10;
            copydefault(i6 >>> 28);
            iAYXKKw = i6 & 268435455;
            i5++;
        }
        EZpvd(46);
        while (i5 <= 8) {
            int i7 = iAYXKKw * 10;
            copydefault(i7 >>> 28);
            iAYXKKw = i7 & 268435455;
            i5++;
        }
        OLrzqt(i3);
        return 0;
    }

    public final int AEQbTJ(int i, int i2, int i3, int i4) {
        copydefault(0);
        EZpvd(46);
        while (i4 < 0) {
            copydefault(0);
            i4++;
        }
        copydefault(i);
        AEQbTJ(i2);
        OLrzqt(i3);
        return 0;
    }

    public final int OLrzqt(int i, int i2, int i3, int i4) {
        copydefault(i);
        EZpvd(46);
        AEQbTJ(i2);
        OLrzqt(i3);
        KWHzl(i4 - 1);
        return 0;
    }

    public final void OLrzqt(int i) {
        if (i != 0) {
            AEQbTJ(i);
        }
        EZpvd();
    }

    public final void AEQbTJ(int i) {
        int iAYXKKw = AYXKKw(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iAYXKKw * 10;
            copydefault(i3 >>> 28);
            iAYXKKw = i3 & 268435455;
        }
    }

    public final void EZpvd() {
        int i;
        byte b;
        while (true) {
            byte[] bArr = this.KWHzl;
            i = this.AEQbTJ;
            b = bArr[i];
            if (b != 48) {
                break;
            } else {
                this.AEQbTJ = i - 1;
            }
        }
        if (b == 46) {
            this.AEQbTJ = i + 1;
        }
    }

    public final int AYXKKw(int i) {
        return ((int) (US.EZpvd(((long) (i + 1)) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    public final void KWHzl(int i) {
        EZpvd(69);
        if (i < 0) {
            EZpvd(45);
            i = -i;
        }
        if (i < 10) {
            copydefault(i);
            return;
        }
        if (i >= 100) {
            int i2 = (i * 1311) >>> 17;
            copydefault(i2);
            i -= i2 * 100;
        }
        int i3 = (i * 103) >>> 10;
        copydefault(i3);
        copydefault(i - (i3 * 10));
    }

    public final void EZpvd(int i) {
        byte[] bArr = this.KWHzl;
        int i2 = this.AEQbTJ + 1;
        this.AEQbTJ = i2;
        bArr[i2] = (byte) i;
    }

    public final void copydefault(int i) {
        byte[] bArr = this.KWHzl;
        int i2 = this.AEQbTJ + 1;
        this.AEQbTJ = i2;
        bArr[i2] = (byte) (i + 48);
    }

    public final java.lang.String KWHzl() {
        return new java.lang.String(this.KWHzl, 0, 0, this.AEQbTJ + 1);
    }
}
