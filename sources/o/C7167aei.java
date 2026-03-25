package o;

import androidx.camera.video.AudioStats;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.aei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7167aei extends AbstractC7164aef {
    public byte[] DbNXlk;
    public long AkhnZx = 0;
    public boolean isConnected = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7164aef
    public void ejfBZ() {
        if (this.isConnected) {
            this.DbNXlk = null;
            this.isConnected = false;
        }
        this.AkhnZx = 0L;
        this.values = 0;
        this.djBIcL = 0;
        this.AYXKKw = false;
        this.AhwBna = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.valueOf = 0;
        this.EZpvd = 0;
    }

    public C7167aei() {
        ejfBZ();
        this.AEQbTJ = (byte) 0;
    }

    public C7167aei(long j) {
        copydefault(j);
    }

    public C7167aei(int i) {
        values(i);
    }

    public C7167aei(double d) {
        KWHzl(d);
    }

    public C7167aei(java.math.BigInteger bigInteger) {
        OLrzqt(bigInteger);
    }

    public C7167aei(BigDecimal bigDecimal) {
        AEQbTJ(bigDecimal);
    }

    public C7167aei(C7167aei c7167aei) {
        OLrzqt(c7167aei);
    }

    public C7167aei(java.lang.Number number) {
        if (number instanceof java.lang.Long) {
            copydefault(number.longValue());
            return;
        }
        if (number instanceof java.lang.Integer) {
            values(number.intValue());
            return;
        }
        if (number instanceof java.lang.Float) {
            KWHzl(number.doubleValue());
            return;
        }
        if (number instanceof java.lang.Double) {
            KWHzl(number.doubleValue());
            return;
        }
        if (number instanceof java.math.BigInteger) {
            OLrzqt((java.math.BigInteger) number);
            return;
        }
        if (number instanceof BigDecimal) {
            AEQbTJ((BigDecimal) number);
        } else {
            if (number instanceof com.ibm.icu.math.BigDecimal) {
                AEQbTJ(((com.ibm.icu.math.BigDecimal) number).toBigDecimal());
                return;
            }
            throw new java.lang.IllegalArgumentException("Number is of an unsupported type: " + number.getClass().getName());
        }
    }

    @Override // o.InterfaceC7163aee
    public InterfaceC7163aee OLrzqt() {
        return new C7167aei(this);
    }

    @Override // o.AbstractC7164aef
    public byte gEmmrt(int i) {
        if (this.isConnected) {
            if (i < 0 || i >= this.djBIcL) {
                return (byte) 0;
            }
            return this.DbNXlk[i];
        }
        if (i < 0 || i >= 16) {
            return (byte) 0;
        }
        return (byte) ((this.AkhnZx >>> (i * 4)) & 15);
    }

    @Override // o.AbstractC7164aef
    public void EZpvd(int i, byte b) {
        if (this.isConnected) {
            fetchVPNInfo(i + 1);
            this.DbNXlk[i] = b;
        } else if (i >= 16) {
            getFieldNames();
            fetchVPNInfo(i + 1);
            this.DbNXlk[i] = b;
        } else {
            int i2 = i * 4;
            long j = ((long) b) << i2;
            this.AkhnZx = ((~(15 << i2)) & this.AkhnZx) | j;
        }
    }

    @Override // o.AbstractC7164aef
    public void AkhnZx(int i) {
        if (!this.isConnected && this.djBIcL + i > 16) {
            getFieldNames();
        }
        if (this.isConnected) {
            fetchVPNInfo(this.djBIcL + i);
            byte[] bArr = this.DbNXlk;
            java.lang.System.arraycopy(bArr, 0, bArr, i, this.djBIcL);
            java.util.Arrays.fill(this.DbNXlk, 0, i, (byte) 0);
        } else {
            this.AkhnZx <<= i * 4;
        }
        this.values -= i;
        this.djBIcL += i;
    }

    @Override // o.AbstractC7164aef
    public void isConnected(int i) {
        if (this.isConnected) {
            int i2 = 0;
            while (i2 < this.djBIcL - i) {
                byte[] bArr = this.DbNXlk;
                bArr[i2] = bArr[i2 + i];
                i2++;
            }
            while (i2 < this.djBIcL) {
                this.DbNXlk[i2] = 0;
                i2++;
            }
        } else {
            this.AkhnZx >>>= i * 4;
        }
        this.values += i;
        this.djBIcL -= i;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:5:0x0008 */
    @Override // o.AbstractC7164aef
    public void AhwBna(int i) {
        if (this.isConnected) {
            int i2 = this.djBIcL;
            while (true) {
                i2--;
                if (i2 < this.djBIcL - i) {
                    break;
                } else {
                    this.DbNXlk[i2] = 0;
                }
            }
        } else {
            this.AkhnZx &= (1 << ((this.djBIcL - i) * 4)) - 1;
        }
        this.djBIcL -= i;
    }

    @Override // o.AbstractC7164aef
    public void AYXKKw(int i) {
        long j = 0;
        int i2 = 16;
        while (i != 0) {
            j = (j >>> 4) + ((((long) i) % 10) << 60);
            i /= 10;
            i2--;
        }
        this.AkhnZx = j >>> (i2 * 4);
        this.values = 0;
        this.djBIcL = 16 - i2;
    }

    @Override // o.AbstractC7164aef
    public void OLrzqt(long j) {
        if (j >= 10000000000000000L) {
            hDKMBd();
            int i = 0;
            while (j != 0) {
                this.DbNXlk[i] = (byte) (j % 10);
                j /= 10;
                i++;
            }
            this.values = 0;
            this.djBIcL = i;
            return;
        }
        int i2 = 16;
        long j2 = 0;
        while (j != 0) {
            j2 = (j2 >>> 4) + ((j % 10) << 60);
            j /= 10;
            i2--;
        }
        this.AkhnZx = j2 >>> (i2 * 4);
        this.values = 0;
        this.djBIcL = 16 - i2;
    }

    @Override // o.AbstractC7164aef
    public void KWHzl(java.math.BigInteger bigInteger) {
        hDKMBd();
        int i = 0;
        while (bigInteger.signum() != 0) {
            java.math.BigInteger[] bigIntegerArrDivideAndRemainder = bigInteger.divideAndRemainder(java.math.BigInteger.TEN);
            int i2 = i + 1;
            fetchVPNInfo(i2);
            this.DbNXlk[i] = bigIntegerArrDivideAndRemainder[1].byteValue();
            bigInteger = bigIntegerArrDivideAndRemainder[0];
            i = i2;
        }
        this.values = 0;
        this.djBIcL = i;
    }

    @Override // o.AbstractC7164aef
    public BigDecimal isConnected() {
        BigDecimal bigDecimalScaleByPowerOfTen;
        if (this.isConnected) {
            BigDecimal bigDecimal = new BigDecimal(getNewProxyInstance());
            return copydefault() ? bigDecimal.negate() : bigDecimal;
        }
        long jGEmmrt = 0;
        for (int i = this.djBIcL - 1; i >= 0; i--) {
            jGEmmrt = (jGEmmrt * 10) + ((long) gEmmrt(i));
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jGEmmrt);
        int iScale = bigDecimalValueOf.scale();
        int i2 = this.values;
        int i3 = this.EZpvd;
        if (iScale + i2 + i3 <= -2147483648L) {
            bigDecimalScaleByPowerOfTen = BigDecimal.ZERO;
        } else {
            bigDecimalScaleByPowerOfTen = bigDecimalValueOf.scaleByPowerOfTen(i2 + i3);
        }
        return copydefault() ? bigDecimalScaleByPowerOfTen.negate() : bigDecimalScaleByPowerOfTen;
    }

    @Override // o.AbstractC7164aef
    public void fetchVPNInfo() {
        int i;
        if (!this.isConnected) {
            long j = this.AkhnZx;
            if (j == 0) {
                ejfBZ();
                return;
            }
            int iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j) / 4;
            long j2 = this.AkhnZx >>> (iNumberOfTrailingZeros * 4);
            this.AkhnZx = j2;
            this.values += iNumberOfTrailingZeros;
            this.djBIcL = 16 - (java.lang.Long.numberOfLeadingZeros(j2) / 4);
            return;
        }
        int i2 = 0;
        while (true) {
            i = this.djBIcL;
            if (i2 >= i || this.DbNXlk[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == i) {
            ejfBZ();
            return;
        }
        isConnected(i2);
        int i3 = this.djBIcL - 1;
        while (i3 >= 0 && this.DbNXlk[i3] == 0) {
            i3--;
        }
        int i4 = i3 + 1;
        this.djBIcL = i4;
        if (i4 <= 16) {
            getFieldNames();
        }
    }

    public final void hDKMBd() {
        fetchVPNInfo(40);
    }

    public final void fetchVPNInfo(int i) {
        if (i == 0) {
            return;
        }
        boolean z = this.isConnected;
        int length = z ? this.DbNXlk.length : 0;
        if (!z) {
            this.DbNXlk = new byte[i];
        } else if (length < i) {
            byte[] bArr = new byte[i * 2];
            java.lang.System.arraycopy(this.DbNXlk, 0, bArr, 0, length);
            this.DbNXlk = bArr;
        }
        this.isConnected = true;
    }

    public final void getFieldNames() {
        if (!this.isConnected) {
            hDKMBd();
            for (int i = 0; i < this.djBIcL; i++) {
                byte[] bArr = this.DbNXlk;
                long j = this.AkhnZx;
                bArr[i] = (byte) (15 & j);
                this.AkhnZx = j >>> 4;
            }
            return;
        }
        this.AkhnZx = 0L;
        for (int i2 = this.djBIcL - 1; i2 >= 0; i2--) {
            this.AkhnZx = (this.AkhnZx << 4) | ((long) this.DbNXlk[i2]);
        }
        this.DbNXlk = null;
        this.isConnected = false;
    }

    @Override // o.AbstractC7164aef
    public void EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7167aei c7167aei = (C7167aei) interfaceC7163aee;
        ejfBZ();
        if (c7167aei.isConnected) {
            fetchVPNInfo(c7167aei.djBIcL);
            java.lang.System.arraycopy(c7167aei.DbNXlk, 0, this.DbNXlk, 0, c7167aei.djBIcL);
        } else {
            this.AkhnZx = c7167aei.AkhnZx;
        }
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(this.gEmmrt);
        objArr[1] = java.lang.Integer.valueOf(this.fetchVPNInfo);
        objArr[2] = this.isConnected ? "bytes" : "long";
        objArr[3] = copydefault() ? "-" : "";
        objArr[4] = getNewProxyInstance();
        return java.lang.String.format("<DecimalQuantity %d:%d %s %s%s>", objArr);
    }

    public final java.lang.String getNewProxyInstance() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.isConnected) {
            if (this.djBIcL == 0) {
                sb.append('0');
            }
            for (int i = this.djBIcL - 1; i >= 0; i--) {
                sb.append((int) this.DbNXlk[i]);
            }
        } else {
            sb.append(java.lang.Long.toHexString(this.AkhnZx));
        }
        sb.append("E");
        sb.append(this.values);
        return sb.toString();
    }
}
