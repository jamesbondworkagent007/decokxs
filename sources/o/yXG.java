package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import o.yXQ;

/* JADX INFO: loaded from: classes13.dex */
public final class yXG {
    public int AEQbTJ;
    public int AYXKKw;
    public boolean AhwBna;
    public TaskDescription DbNXlk;
    public final byte[] EZpvd;
    public int KWHzl;
    public final boolean OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int fetchVPNInfo;
    public final java.io.InputStream gEmmrt;
    public int isConnected;
    public int valueOf;
    public int values;

    public interface TaskDescription {
        void EZpvd();
    }

    public static int OLrzqt(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long copydefault(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        int i = this.valueOf;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.values + this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void wlaJM() {
        int i = this.AEQbTJ + this.copydefault;
        this.AEQbTJ = i;
        int i2 = this.values + i;
        int i3 = this.valueOf;
        if (i2 <= i3) {
            this.copydefault = 0;
            return;
        }
        int i4 = i2 - i3;
        this.copydefault = i4;
        this.AEQbTJ = i - i4;
    }

    public static yXG copydefault(java.io.InputStream inputStream) {
        return new yXG(inputStream);
    }

    public static yXG KWHzl(yXR yxr) {
        yXG yxg = new yXG(yxr);
        try {
            yxg.AEQbTJ(yxr.EZpvd());
            return yxg;
        } catch (InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public int hDKMBd() throws java.io.IOException {
        if (AEQbTJ()) {
            this.djBIcL = 0;
            return 0;
        }
        int iAkhnZx = AkhnZx();
        this.djBIcL = iAkhnZx;
        if (WireFormat.copydefault(iAkhnZx) != 0) {
            return this.djBIcL;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public void EZpvd(int i) throws InvalidProtocolBufferException {
        if (this.djBIcL != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public boolean OLrzqt(int i, CodedOutputStream codedOutputStream) throws java.io.IOException {
        int iKWHzl = WireFormat.KWHzl(i);
        if (iKWHzl == 0) {
            long jValues = values();
            codedOutputStream.ejfBZ(i);
            codedOutputStream.AkhnZx(jValues);
            return true;
        }
        if (iKWHzl == 1) {
            long jFetchVPNInfo = fetchVPNInfo();
            codedOutputStream.ejfBZ(i);
            codedOutputStream.AYXKKw(jFetchVPNInfo);
            return true;
        }
        if (iKWHzl == 2) {
            yXD yxdKWHzl = KWHzl();
            codedOutputStream.ejfBZ(i);
            codedOutputStream.EZpvd(yxdKWHzl);
            return true;
        }
        if (iKWHzl == 3) {
            codedOutputStream.ejfBZ(i);
            copydefault(codedOutputStream);
            int iKWHzl2 = WireFormat.KWHzl(WireFormat.copydefault(i), 4);
            EZpvd(iKWHzl2);
            codedOutputStream.ejfBZ(iKWHzl2);
            return true;
        }
        if (iKWHzl == 4) {
            return false;
        }
        if (iKWHzl == 5) {
            int iIsConnected = isConnected();
            codedOutputStream.ejfBZ(i);
            codedOutputStream.AkhnZx(iIsConnected);
            return true;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    public void copydefault(CodedOutputStream codedOutputStream) throws java.io.IOException {
        int iHDKMBd;
        do {
            iHDKMBd = hDKMBd();
            if (iHDKMBd == 0) {
                return;
            }
        } while (OLrzqt(iHDKMBd, codedOutputStream));
    }

    public double EZpvd() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(fetchVPNInfo());
    }

    public float valueOf() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(isConnected());
    }

    public long zLjUOn() throws java.io.IOException {
        return fIwbmz();
    }

    public long values() throws java.io.IOException {
        return fIwbmz();
    }

    public int AhwBna() throws java.io.IOException {
        return AkhnZx();
    }

    public long gEmmrt() throws java.io.IOException {
        return fetchVPNInfo();
    }

    public int djBIcL() throws java.io.IOException {
        return isConnected();
    }

    public boolean copydefault() throws java.io.IOException {
        return fIwbmz() != 0;
    }

    public java.lang.String uzCIH() throws java.io.IOException {
        int iAkhnZx = AkhnZx();
        int i = this.AEQbTJ;
        int i2 = this.KWHzl;
        if (iAkhnZx > i - i2 || iAkhnZx <= 0) {
            return iAkhnZx == 0 ? "" : new java.lang.String(gEmmrt(iAkhnZx), com.google.android.exoplayer2.C.UTF8_NAME);
        }
        java.lang.String str = new java.lang.String(this.EZpvd, i2, iAkhnZx, com.google.android.exoplayer2.C.UTF8_NAME);
        this.KWHzl += iAkhnZx;
        return str;
    }

    public java.lang.String iwGUEr() throws java.io.IOException {
        byte[] bArrGEmmrt;
        int iAkhnZx = AkhnZx();
        int i = this.KWHzl;
        if (iAkhnZx <= this.AEQbTJ - i && iAkhnZx > 0) {
            bArrGEmmrt = this.EZpvd;
            this.KWHzl = i + iAkhnZx;
        } else {
            if (iAkhnZx == 0) {
                return "";
            }
            bArrGEmmrt = gEmmrt(iAkhnZx);
            i = 0;
        }
        if (!yXZ.EZpvd(bArrGEmmrt, i, i + iAkhnZx)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        return new java.lang.String(bArrGEmmrt, i, iAkhnZx, com.google.android.exoplayer2.C.UTF8_NAME);
    }

    public void AEQbTJ(int i, yXQ.StateListAnimator stateListAnimator, yXE yxe) throws java.io.IOException {
        int i2 = this.AYXKKw;
        if (i2 >= this.fetchVPNInfo) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.AYXKKw = i2 + 1;
        stateListAnimator.OLrzqt(this, yxe);
        EZpvd(WireFormat.KWHzl(i, 4));
        this.AYXKKw--;
    }

    public void AEQbTJ(yXQ.StateListAnimator stateListAnimator, yXE yxe) throws java.io.IOException {
        int iAkhnZx = AkhnZx();
        if (this.AYXKKw >= this.fetchVPNInfo) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iAEQbTJ = AEQbTJ(iAkhnZx);
        this.AYXKKw++;
        stateListAnimator.OLrzqt(this, yxe);
        EZpvd(0);
        this.AYXKKw--;
        copydefault(iAEQbTJ);
    }

    public <T extends yXQ> T copydefault(yXV<T> yxv, yXE yxe) throws java.io.IOException {
        int iAkhnZx = AkhnZx();
        if (this.AYXKKw >= this.fetchVPNInfo) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iAEQbTJ = AEQbTJ(iAkhnZx);
        this.AYXKKw++;
        T tEZpvd = yxv.EZpvd(this, yxe);
        EZpvd(0);
        this.AYXKKw--;
        copydefault(iAEQbTJ);
        return tEZpvd;
    }

    public yXD KWHzl() throws java.io.IOException {
        int iAkhnZx = AkhnZx();
        int i = this.AEQbTJ;
        int i2 = this.KWHzl;
        if (iAkhnZx > i - i2 || iAkhnZx <= 0) {
            if (iAkhnZx == 0) {
                return yXD.OLrzqt;
            }
            return new yXR(gEmmrt(iAkhnZx));
        }
        yXD yxf = (this.OLrzqt && this.AhwBna) ? new yXF(this.EZpvd, this.KWHzl, iAkhnZx) : yXD.OLrzqt(this.EZpvd, i2, iAkhnZx);
        this.KWHzl += iAkhnZx;
        return yxf;
    }

    public int getFieldNames() throws java.io.IOException {
        return AkhnZx();
    }

    public int AYXKKw() throws java.io.IOException {
        return AkhnZx();
    }

    public int ejfBZ() throws java.io.IOException {
        return isConnected();
    }

    public long fARcdN() throws java.io.IOException {
        return fetchVPNInfo();
    }

    public int AuCTel() throws java.io.IOException {
        return OLrzqt(AkhnZx());
    }

    public long getNewProxyInstance() throws java.io.IOException {
        return copydefault(fIwbmz());
    }

    public int AkhnZx() throws java.io.IOException {
        int i;
        int i2 = this.KWHzl;
        int i3 = this.AEQbTJ;
        if (i3 != i2) {
            byte[] bArr = this.EZpvd;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.KWHzl = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << Ascii.FS))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.KWHzl = i5;
                return i;
            }
        }
        return (int) fJNWhG();
    }

    public static int KWHzl(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public long fIwbmz() throws java.io.IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.KWHzl;
        int i2 = this.AEQbTJ;
        if (i2 != i) {
            byte[] bArr = this.EZpvd;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.KWHzl = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j5 = (bArr[i3] << 7) ^ b;
                if (j5 >= 0) {
                    int i5 = i + 3;
                    long j6 = j5 ^ ((long) (bArr[i4] << Ascii.SO));
                    if (j6 >= 0) {
                        j4 = 16256;
                    } else {
                        i4 = i + 4;
                        j5 = j6 ^ ((long) (bArr[i5] << Ascii.NAK));
                        if (j5 < 0) {
                            j3 = -2080896;
                        } else {
                            i5 = i + 5;
                            j6 = j5 ^ (((long) bArr[i4]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                i4 = i + 6;
                                j5 = j6 ^ (((long) bArr[i5]) << 35);
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i + 7;
                                    j6 = j5 ^ (((long) bArr[i4]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (((long) bArr[i5]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i + 9;
                                            long j7 = (j5 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j7 >= 0) {
                                                j = j7;
                                                j2 = j;
                                                i4 = i5;
                                                this.KWHzl = i4;
                                                return j2;
                                            }
                                            i4 = i + 10;
                                            if (bArr[i5] >= 0) {
                                                j2 = j7;
                                                this.KWHzl = i4;
                                                return j2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j = j4 ^ j6;
                    j2 = j;
                    i4 = i5;
                    this.KWHzl = i4;
                    return j2;
                }
                j3 = -128;
                j2 = j5 ^ j3;
                this.KWHzl = i4;
                return j2;
            }
        }
        return fJNWhG();
    }

    public long fJNWhG() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bDbNXlk = DbNXlk();
            j |= ((long) (bDbNXlk & 127)) << i;
            if ((bDbNXlk & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int isConnected() throws java.io.IOException {
        int i = this.KWHzl;
        if (this.AEQbTJ - i < 4) {
            AYXKKw(4);
            i = this.KWHzl;
        }
        byte[] bArr = this.EZpvd;
        this.KWHzl = i + 4;
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public long fetchVPNInfo() throws java.io.IOException {
        int i = this.KWHzl;
        if (this.AEQbTJ - i < 8) {
            AYXKKw(8);
            i = this.KWHzl;
        }
        byte[] bArr = this.EZpvd;
        this.KWHzl = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public yXG(java.io.InputStream inputStream) {
        this.AhwBna = false;
        this.valueOf = Integer.MAX_VALUE;
        this.fetchVPNInfo = 64;
        this.isConnected = 67108864;
        this.DbNXlk = null;
        this.EZpvd = new byte[4096];
        this.AEQbTJ = 0;
        this.KWHzl = 0;
        this.values = 0;
        this.gEmmrt = inputStream;
        this.OLrzqt = false;
    }

    public yXG(yXR yxr) {
        this.AhwBna = false;
        this.valueOf = Integer.MAX_VALUE;
        this.fetchVPNInfo = 64;
        this.isConnected = 67108864;
        this.DbNXlk = null;
        this.EZpvd = yxr.AEQbTJ;
        int iCopydefault = yxr.copydefault();
        this.KWHzl = iCopydefault;
        this.AEQbTJ = iCopydefault + yxr.EZpvd();
        this.values = -this.KWHzl;
        this.gEmmrt = null;
        this.OLrzqt = true;
    }

    public int AEQbTJ(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.values + this.KWHzl;
        int i3 = this.valueOf;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.valueOf = i2;
        wlaJM();
        return i3;
    }

    public void copydefault(int i) {
        this.valueOf = i;
        wlaJM();
    }

    public boolean AEQbTJ() throws java.io.IOException {
        return this.KWHzl == this.AEQbTJ && !AhwBna(1);
    }

    public final void KWHzl(int i) throws java.io.IOException {
        if (this.AEQbTJ - this.KWHzl < i) {
            AYXKKw(i);
        }
    }

    public final void AYXKKw(int i) throws java.io.IOException {
        if (!AhwBna(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final boolean AhwBna(int i) throws java.io.IOException {
        int i2 = this.KWHzl;
        if (i2 + i <= this.AEQbTJ) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.values + i2 + i > this.valueOf) {
            return false;
        }
        TaskDescription taskDescription = this.DbNXlk;
        if (taskDescription != null) {
            taskDescription.EZpvd();
        }
        if (this.gEmmrt != null) {
            int i3 = this.KWHzl;
            if (i3 > 0) {
                int i4 = this.AEQbTJ;
                if (i4 > i3) {
                    byte[] bArr = this.EZpvd;
                    java.lang.System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                }
                this.values += i3;
                this.AEQbTJ -= i3;
                this.KWHzl = 0;
            }
            java.io.InputStream inputStream = this.gEmmrt;
            byte[] bArr2 = this.EZpvd;
            int i5 = this.AEQbTJ;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.EZpvd.length) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.AEQbTJ += i6;
                if ((this.values + i) - this.isConnected > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                wlaJM();
                if (this.AEQbTJ >= i) {
                    return true;
                }
                return AhwBna(i);
            }
        }
        return false;
    }

    public byte DbNXlk() throws java.io.IOException {
        if (this.KWHzl == this.AEQbTJ) {
            AYXKKw(1);
        }
        byte[] bArr = this.EZpvd;
        int i = this.KWHzl;
        this.KWHzl = i + 1;
        return bArr[i];
    }

    public final byte[] gEmmrt(int i) throws java.io.IOException {
        if (i <= 0) {
            if (i == 0) {
                return yXJ.EZpvd;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.values;
        int i3 = this.KWHzl;
        int i4 = this.valueOf;
        if (i2 + i3 + i > i4) {
            valueOf((i4 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i5 = this.AEQbTJ - i3;
            java.lang.System.arraycopy(this.EZpvd, i3, bArr, 0, i5);
            this.KWHzl = this.AEQbTJ;
            int i6 = i - i5;
            KWHzl(i6);
            java.lang.System.arraycopy(this.EZpvd, 0, bArr, i5, i6);
            this.KWHzl = i6;
            return bArr;
        }
        int i7 = this.AEQbTJ;
        this.values = i2 + i7;
        this.KWHzl = 0;
        this.AEQbTJ = 0;
        int length = i7 - i3;
        int i8 = i - length;
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        while (i8 > 0) {
            int iMin = java.lang.Math.min(i8, 4096);
            byte[] bArr2 = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                java.io.InputStream inputStream = this.gEmmrt;
                int i10 = inputStream == null ? -1 : inputStream.read(bArr2, i9, iMin - i9);
                if (i10 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.values += i10;
                i9 += i10;
            }
            i8 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(this.EZpvd, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public void valueOf(int i) throws java.io.IOException {
        int i2 = this.AEQbTJ;
        int i3 = this.KWHzl;
        if (i > i2 - i3 || i < 0) {
            djBIcL(i);
        } else {
            this.KWHzl = i3 + i;
        }
    }

    public final void djBIcL(int i) throws java.io.IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.values;
        int i3 = this.KWHzl;
        int i4 = this.valueOf;
        if (i2 + i3 + i > i4) {
            valueOf((i4 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i5 = this.AEQbTJ;
        int i6 = i5 - i3;
        this.KWHzl = i5;
        AYXKKw(1);
        while (true) {
            int i7 = i - i6;
            int i8 = this.AEQbTJ;
            if (i7 <= i8) {
                this.KWHzl = i7;
                return;
            } else {
                i6 += i8;
                this.KWHzl = i8;
                AYXKKw(1);
            }
        }
    }
}
