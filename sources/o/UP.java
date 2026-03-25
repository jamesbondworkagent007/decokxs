package o;

import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes21.dex */
public final class UP {
    public int EZpvd;
    public final byte[] KWHzl = new byte[15];

    private UP() {
    }

    public static java.lang.String KWHzl(float f) {
        return new UP().EZpvd(f);
    }

    public final java.lang.String EZpvd(float f) {
        int iAEQbTJ = AEQbTJ(f);
        if (iAEQbTJ != 0) {
            return iAEQbTJ != 1 ? iAEQbTJ != 2 ? iAEQbTJ != 3 ? iAEQbTJ != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0";
        }
        return copydefault();
    }

    public final int AEQbTJ(float f) {
        int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        int i = 8388607 & iFloatToRawIntBits;
        int i2 = (iFloatToRawIntBits >>> 23) & 255;
        if (i2 >= 255) {
            if (i != 0) {
                return 5;
            }
            return iFloatToRawIntBits > 0 ? 3 : 4;
        }
        this.EZpvd = -1;
        if (iFloatToRawIntBits < 0) {
            KWHzl(45);
        }
        if (i2 == 0) {
            if (i == 0) {
                return iFloatToRawIntBits == 0 ? 1 : 2;
            }
            if (i < 8) {
                return OLrzqt(-149, i * 10, -1);
            }
            return OLrzqt(-149, i, 0);
        }
        int i3 = 150 - i2;
        int i4 = i | 8388608;
        if ((i3 > 0) & (i3 < 24)) {
            int i5 = i4 >> i3;
            if ((i5 << i3) == i4) {
                return AEQbTJ(i5, 0);
            }
        }
        return OLrzqt(-i3, i4, 0);
    }

    public final int OLrzqt(int i, int i2, int i3) {
        long j;
        int iEZpvd;
        int i4 = i2 & 1;
        long j2 = i2 << 2;
        if ((i2 != 8388608) | (i == -149)) {
            j = j2 - 2;
            iEZpvd = US.KWHzl(i);
        } else {
            j = j2 - 1;
            iEZpvd = US.EZpvd(i);
        }
        int iCopydefault = i + US.copydefault(-iEZpvd) + 33;
        long jAEQbTJ = 1 + US.AEQbTJ(iEZpvd);
        int iCopydefault2 = copydefault(jAEQbTJ, j2 << iCopydefault);
        int iCopydefault3 = copydefault(jAEQbTJ, j << iCopydefault);
        int iCopydefault4 = copydefault(jAEQbTJ, (j2 + 2) << iCopydefault);
        int i5 = iCopydefault2 >> 2;
        if (i5 >= 100) {
            int i6 = ((int) ((((long) i5) * 1717986919) >>> 34)) * 10;
            int i7 = i6 + 10;
            boolean z = iCopydefault3 + i4 <= (i6 << 2);
            if (z != ((i7 << 2) + i4 <= iCopydefault4)) {
                if (!z) {
                    i6 = i7;
                }
                return AEQbTJ(i6, iEZpvd);
            }
        }
        int i8 = i5 + 1;
        boolean z2 = iCopydefault3 + i4 <= (i5 << 2);
        if (z2 != ((i8 << 2) + i4 <= iCopydefault4)) {
            if (!z2) {
                i5 = i8;
            }
            return AEQbTJ(i5, iEZpvd + i3);
        }
        int i9 = iCopydefault2 - ((i5 + i8) << 1);
        if (i9 >= 0 && (i9 != 0 || (i5 & 1) != 0)) {
            i5 = i8;
        }
        return AEQbTJ(i5, iEZpvd + i3);
    }

    public static int copydefault(long j, long j2) {
        long jEZpvd = US.EZpvd(j, j2);
        return (int) ((jEZpvd >>> 31) | (((jEZpvd & BodyPartID.bodyIdMax) + BodyPartID.bodyIdMax) >>> 32));
    }

    public final int AEQbTJ(int i, int i2) {
        int iKWHzl = US.KWHzl(32 - java.lang.Integer.numberOfLeadingZeros(i));
        if (i >= US.djBIcL(iKWHzl)) {
            iKWHzl++;
        }
        int iDjBIcL = i * ((int) US.djBIcL(9 - iKWHzl));
        int i3 = i2 + iKWHzl;
        int i4 = (int) ((((long) iDjBIcL) * 1441151881) >>> 57);
        int i5 = iDjBIcL - (100000000 * i4);
        if (i3 > 0 && i3 <= 7) {
            return EZpvd(i4, i5, i3);
        }
        if (-3 < i3 && i3 <= 0) {
            return copydefault(i4, i5, i3);
        }
        return AEQbTJ(i4, i5, i3);
    }

    public final int EZpvd(int i, int i2, int i3) {
        EZpvd(i);
        int iOLrzqt = OLrzqt(i2);
        int i4 = 1;
        while (i4 < i3) {
            int i5 = iOLrzqt * 10;
            EZpvd(i5 >>> 28);
            iOLrzqt = i5 & 268435455;
            i4++;
        }
        KWHzl(46);
        while (i4 <= 8) {
            int i6 = iOLrzqt * 10;
            EZpvd(i6 >>> 28);
            iOLrzqt = i6 & 268435455;
            i4++;
        }
        KWHzl();
        return 0;
    }

    public final int copydefault(int i, int i2, int i3) {
        EZpvd(0);
        KWHzl(46);
        while (i3 < 0) {
            EZpvd(0);
            i3++;
        }
        EZpvd(i);
        AEQbTJ(i2);
        KWHzl();
        return 0;
    }

    public final int AEQbTJ(int i, int i2, int i3) {
        EZpvd(i);
        KWHzl(46);
        AEQbTJ(i2);
        KWHzl();
        copydefault(i3 - 1);
        return 0;
    }

    public final void AEQbTJ(int i) {
        int iOLrzqt = OLrzqt(i);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iOLrzqt * 10;
            EZpvd(i3 >>> 28);
            iOLrzqt = i3 & 268435455;
        }
    }

    public final void KWHzl() {
        int i;
        byte b;
        while (true) {
            byte[] bArr = this.KWHzl;
            i = this.EZpvd;
            b = bArr[i];
            if (b != 48) {
                break;
            } else {
                this.EZpvd = i - 1;
            }
        }
        if (b == 46) {
            this.EZpvd = i + 1;
        }
    }

    public final int OLrzqt(int i) {
        return ((int) (US.EZpvd(((long) (i + 1)) << 28, 193428131138340668L) >>> 20)) - 1;
    }

    public final void copydefault(int i) {
        KWHzl(69);
        if (i < 0) {
            KWHzl(45);
            i = -i;
        }
        if (i < 10) {
            EZpvd(i);
            return;
        }
        int i2 = (i * 103) >>> 10;
        EZpvd(i2);
        EZpvd(i - (i2 * 10));
    }

    public final void KWHzl(int i) {
        byte[] bArr = this.KWHzl;
        int i2 = this.EZpvd + 1;
        this.EZpvd = i2;
        bArr[i2] = (byte) i;
    }

    public final void EZpvd(int i) {
        byte[] bArr = this.KWHzl;
        int i2 = this.EZpvd + 1;
        this.EZpvd = i2;
        bArr[i2] = (byte) (i + 48);
    }

    public final java.lang.String copydefault() {
        return new java.lang.String(this.KWHzl, 0, 0, this.EZpvd + 1);
    }
}
