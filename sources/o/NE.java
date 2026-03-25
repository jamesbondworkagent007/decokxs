package o;

import android.graphics.Bitmap;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import o.InterfaceC5341Nz;

/* JADX INFO: loaded from: classes2.dex */
public class NE implements InterfaceC5341Nz {
    public static final java.lang.String EZpvd = "StandardGifDecoder";
    public Bitmap.Config AEQbTJ;
    public int AYXKKw;
    public NA AhwBna;
    public byte[] AkhnZx;
    public android.graphics.Bitmap AuCTel;
    public final int[] DbNXlk;
    public byte[] KWHzl;
    public final InterfaceC5341Nz.Application OLrzqt;
    public int[] copydefault;
    public java.lang.Boolean djBIcL;
    public boolean ejfBZ;
    public java.nio.ByteBuffer fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public short[] fetchVPNInfo;
    public int gEmmrt;
    public int[] isConnected;
    public byte[] iwGUEr;
    public int valueOf;
    public byte[] values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5341Nz
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5341Nz
    public java.nio.ByteBuffer copydefault() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5341Nz
    public void djBIcL() {
        this.AYXKKw = -1;
    }

    public NE(@androidx.annotation.NonNull InterfaceC5341Nz.Application application, NA na, java.nio.ByteBuffer byteBuffer, int i) {
        this(application);
        copydefault(na, byteBuffer, i);
    }

    public NE(@androidx.annotation.NonNull InterfaceC5341Nz.Application application) {
        this.DbNXlk = new int[256];
        this.AEQbTJ = Bitmap.Config.ARGB_8888;
        this.OLrzqt = application;
        this.AhwBna = new NA();
    }

    @Override // o.InterfaceC5341Nz
    public void OLrzqt() {
        this.AYXKKw = (this.AYXKKw + 1) % this.AhwBna.KWHzl;
    }

    public int AEQbTJ(int i) {
        if (i >= 0) {
            NA na = this.AhwBna;
            if (i < na.KWHzl) {
                return na.AEQbTJ.get(i).KWHzl;
            }
        }
        return -1;
    }

    @Override // o.InterfaceC5341Nz
    public int AhwBna() {
        int i;
        if (this.AhwBna.KWHzl <= 0 || (i = this.AYXKKw) < 0) {
            return 0;
        }
        return AEQbTJ(i);
    }

    @Override // o.InterfaceC5341Nz
    public int gEmmrt() {
        return this.AhwBna.KWHzl;
    }

    @Override // o.InterfaceC5341Nz
    public int EZpvd() {
        return this.fARcdN.limit() + this.values.length + (this.isConnected.length * 4);
    }

    @Override // o.InterfaceC5341Nz
    public android.graphics.Bitmap AYXKKw() {
        synchronized (this) {
            if (this.AhwBna.KWHzl <= 0 || this.AYXKKw < 0) {
                if (android.util.Log.isLoggable(EZpvd, 3)) {
                    int i = this.AhwBna.KWHzl;
                }
                this.fJNWhG = 1;
            }
            int i2 = this.fJNWhG;
            if (i2 != 1 && i2 != 2) {
                this.fJNWhG = 0;
                if (this.KWHzl == null) {
                    this.KWHzl = this.OLrzqt.AEQbTJ(255);
                }
                C5340Ny c5340Ny = this.AhwBna.AEQbTJ.get(this.AYXKKw);
                int i3 = this.AYXKKw - 1;
                C5340Ny c5340Ny2 = i3 >= 0 ? this.AhwBna.AEQbTJ.get(i3) : null;
                int[] iArr = c5340Ny.AhwBna;
                if (iArr == null) {
                    iArr = this.AhwBna.djBIcL;
                }
                this.copydefault = iArr;
                if (iArr == null) {
                    android.util.Log.isLoggable(EZpvd, 3);
                    this.fJNWhG = 1;
                    return null;
                }
                if (c5340Ny.DbNXlk) {
                    java.lang.System.arraycopy(iArr, 0, this.DbNXlk, 0, iArr.length);
                    int[] iArr2 = this.DbNXlk;
                    this.copydefault = iArr2;
                    iArr2[c5340Ny.AYXKKw] = 0;
                    if (c5340Ny.OLrzqt == 2 && this.AYXKKw == 0) {
                        this.djBIcL = java.lang.Boolean.TRUE;
                    }
                }
                return EZpvd(c5340Ny, c5340Ny2);
            }
            android.util.Log.isLoggable(EZpvd, 3);
            return null;
        }
    }

    @Override // o.InterfaceC5341Nz
    public void KWHzl() {
        this.AhwBna = null;
        byte[] bArr = this.values;
        if (bArr != null) {
            this.OLrzqt.copydefault(bArr);
        }
        int[] iArr = this.isConnected;
        if (iArr != null) {
            this.OLrzqt.EZpvd(iArr);
        }
        android.graphics.Bitmap bitmap = this.AuCTel;
        if (bitmap != null) {
            this.OLrzqt.OLrzqt(bitmap);
        }
        this.AuCTel = null;
        this.fARcdN = null;
        this.djBIcL = null;
        byte[] bArr2 = this.KWHzl;
        if (bArr2 != null) {
            this.OLrzqt.copydefault(bArr2);
        }
    }

    public void copydefault(@androidx.annotation.NonNull NA na, @androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, int i) {
        synchronized (this) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = java.lang.Integer.highestOneBit(i);
            this.fJNWhG = 0;
            this.AhwBna = na;
            this.AYXKKw = -1;
            java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.fARcdN = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.fARcdN.order(ByteOrder.LITTLE_ENDIAN);
            this.ejfBZ = false;
            java.util.Iterator<C5340Ny> it = na.AEQbTJ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().OLrzqt == 3) {
                    this.ejfBZ = true;
                    break;
                }
            }
            this.fIwbmz = iHighestOneBit;
            int i2 = na.DbNXlk;
            this.valueOf = i2 / iHighestOneBit;
            int i3 = na.AhwBna;
            this.gEmmrt = i3 / iHighestOneBit;
            this.values = this.OLrzqt.AEQbTJ(i2 * i3);
            this.isConnected = this.OLrzqt.OLrzqt(this.valueOf * this.gEmmrt);
        }
    }

    @Override // o.InterfaceC5341Nz
    public void KWHzl(@androidx.annotation.NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.AEQbTJ = config;
            return;
        }
        throw new java.lang.IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public final android.graphics.Bitmap EZpvd(C5340Ny c5340Ny, C5340Ny c5340Ny2) {
        int i;
        int i2;
        android.graphics.Bitmap bitmap;
        int[] iArr = this.isConnected;
        int i3 = 0;
        if (c5340Ny2 == null) {
            android.graphics.Bitmap bitmap2 = this.AuCTel;
            if (bitmap2 != null) {
                this.OLrzqt.OLrzqt(bitmap2);
            }
            this.AuCTel = null;
            java.util.Arrays.fill(iArr, 0);
        }
        if (c5340Ny2 != null && c5340Ny2.OLrzqt == 3 && this.AuCTel == null) {
            java.util.Arrays.fill(iArr, 0);
        }
        if (c5340Ny2 != null && (i2 = c5340Ny2.OLrzqt) > 0) {
            if (i2 == 2) {
                if (!c5340Ny.DbNXlk) {
                    NA na = this.AhwBna;
                    int i4 = na.EZpvd;
                    if (c5340Ny.AhwBna == null || na.copydefault != c5340Ny.AYXKKw) {
                        i3 = i4;
                    }
                }
                int i5 = c5340Ny2.copydefault;
                int i6 = this.fIwbmz;
                int i7 = i5 / i6;
                int i8 = c5340Ny2.gEmmrt / i6;
                int i9 = c5340Ny2.valueOf / i6;
                int i10 = c5340Ny2.djBIcL / i6;
                int i11 = this.valueOf;
                int i12 = (i8 * i11) + i10;
                int i13 = i12;
                while (i13 < (i7 * i11) + i12) {
                    for (int i14 = i13; i14 < i13 + i9; i14++) {
                        iArr[i14] = i3;
                    }
                    i13 += this.valueOf;
                }
            } else if (i2 == 3 && (bitmap = this.AuCTel) != null) {
                int i15 = this.valueOf;
                bitmap.getPixels(iArr, 0, i15, 0, 0, i15, this.gEmmrt);
            }
        }
        OLrzqt(c5340Ny);
        if (c5340Ny.EZpvd || this.fIwbmz != 1) {
            EZpvd(c5340Ny);
        } else {
            AEQbTJ(c5340Ny);
        }
        if (this.ejfBZ && ((i = c5340Ny.OLrzqt) == 0 || i == 1)) {
            if (this.AuCTel == null) {
                this.AuCTel = valueOf();
            }
            android.graphics.Bitmap bitmap3 = this.AuCTel;
            int i16 = this.valueOf;
            bitmap3.setPixels(iArr, 0, i16, 0, 0, i16, this.gEmmrt);
        }
        android.graphics.Bitmap bitmapValueOf = valueOf();
        int i17 = this.valueOf;
        bitmapValueOf.setPixels(iArr, 0, i17, 0, 0, i17, this.gEmmrt);
        return bitmapValueOf;
    }

    public final void AEQbTJ(C5340Ny c5340Ny) {
        C5340Ny c5340Ny2 = c5340Ny;
        int[] iArr = this.isConnected;
        int i = c5340Ny2.copydefault;
        int i2 = c5340Ny2.gEmmrt;
        int i3 = c5340Ny2.valueOf;
        int i4 = c5340Ny2.djBIcL;
        boolean z = this.AYXKKw == 0;
        int i5 = this.valueOf;
        byte[] bArr = this.values;
        int[] iArr2 = this.copydefault;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = c5340Ny2.valueOf * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                int i14 = b2 & UnsignedBytes.MAX_VALUE;
                if (i14 != b) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            c5340Ny2 = c5340Ny;
        }
        java.lang.Boolean bool = this.djBIcL;
        this.djBIcL = java.lang.Boolean.valueOf((bool != null && bool.booleanValue()) || (this.djBIcL == null && z && b != -1));
    }

    public final void EZpvd(C5340Ny c5340Ny) {
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr = this.isConnected;
        int i5 = c5340Ny.copydefault;
        int i6 = this.fIwbmz;
        int i7 = i5 / i6;
        int i8 = c5340Ny.gEmmrt / i6;
        int i9 = c5340Ny.valueOf / i6;
        int i10 = c5340Ny.djBIcL / i6;
        boolean z = this.AYXKKw == 0;
        int i11 = this.valueOf;
        int i12 = this.gEmmrt;
        byte[] bArr = this.values;
        int[] iArr2 = this.copydefault;
        java.lang.Boolean bool = this.djBIcL;
        int i13 = 8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        while (i14 < i7) {
            java.lang.Boolean bool2 = bool;
            if (c5340Ny.EZpvd) {
                if (i15 >= i7) {
                    int i17 = i16 + 1;
                    i = i7;
                    if (i17 == 2) {
                        i15 = 4;
                    } else if (i17 == 3) {
                        i13 = 4;
                        i16 = i17;
                        i15 = 2;
                    } else if (i17 == 4) {
                        i16 = i17;
                        i15 = 1;
                        i13 = 2;
                    }
                    i16 = i17;
                } else {
                    i = i7;
                }
                i2 = i15 + i13;
            } else {
                i = i7;
                i2 = i15;
                i15 = i14;
            }
            int i18 = i15 + i8;
            boolean z2 = i6 == 1;
            if (i18 < i12) {
                int i19 = i18 * i11;
                int i20 = i19 + i10;
                int i21 = i20 + i9;
                int i22 = i19 + i11;
                if (i22 < i21) {
                    i21 = i22;
                }
                i3 = i2;
                int i23 = i14 * i6 * c5340Ny.valueOf;
                if (z2) {
                    int i24 = i20;
                    while (true) {
                        i4 = i8;
                        if (i24 >= i21) {
                            break;
                        }
                        int i25 = iArr2[bArr[i23] & UnsignedBytes.MAX_VALUE];
                        if (i25 != 0) {
                            iArr[i24] = i25;
                        } else if (z && bool2 == null) {
                            bool2 = java.lang.Boolean.TRUE;
                        }
                        i23 += i6;
                        i24++;
                        i8 = i4;
                    }
                } else {
                    i4 = i8;
                    int i26 = i23;
                    int i27 = i20;
                    while (i27 < i21) {
                        int i28 = i9;
                        int i29 = i10;
                        int iOLrzqt = OLrzqt(i26, ((i21 - i20) * i6) + i23, c5340Ny.valueOf);
                        if (iOLrzqt != 0) {
                            iArr[i27] = iOLrzqt;
                        } else if (z && bool2 == null) {
                            bool2 = java.lang.Boolean.TRUE;
                        }
                        i26 += i6;
                        i27++;
                        i10 = i29;
                        i9 = i28;
                    }
                }
            } else {
                i3 = i2;
                i4 = i8;
            }
            bool = bool2;
            i14++;
            i8 = i4;
            i7 = i;
            i15 = i3;
            i10 = i10;
            i9 = i9;
        }
        java.lang.Boolean bool3 = bool;
        if (this.djBIcL == null) {
            this.djBIcL = java.lang.Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    public final int OLrzqt(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.fIwbmz + i; i9++) {
            byte[] bArr = this.values;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.copydefault[bArr[i9] & UnsignedBytes.MAX_VALUE];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.fIwbmz + i11; i12++) {
            byte[] bArr2 = this.values;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.copydefault[bArr2[i12] & UnsignedBytes.MAX_VALUE];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v18, types: [short] */
    /* JADX WARN: Type inference failed for: r7v21 */
    public final void OLrzqt(C5340Ny c5340Ny) {
        int i;
        int i2;
        short s;
        NE ne = this;
        if (c5340Ny != null) {
            ne.fARcdN.position(c5340Ny.AEQbTJ);
        }
        if (c5340Ny == null) {
            NA na = ne.AhwBna;
            i = na.DbNXlk;
            i2 = na.AhwBna;
        } else {
            i = c5340Ny.valueOf;
            i2 = c5340Ny.copydefault;
        }
        int i3 = i * i2;
        byte[] bArr = ne.values;
        if (bArr == null || bArr.length < i3) {
            ne.values = ne.OLrzqt.AEQbTJ(i3);
        }
        byte[] bArr2 = ne.values;
        if (ne.fetchVPNInfo == null) {
            ne.fetchVPNInfo = new short[4096];
        }
        short[] sArr = ne.fetchVPNInfo;
        if (ne.iwGUEr == null) {
            ne.iwGUEr = new byte[4096];
        }
        byte[] bArr3 = ne.iwGUEr;
        if (ne.AkhnZx == null) {
            ne.AkhnZx = new byte[androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = ne.AkhnZx;
        int iFetchVPNInfo = fetchVPNInfo();
        int i4 = 1 << iFetchVPNInfo;
        int i5 = i4 + 2;
        int i6 = iFetchVPNInfo + 1;
        int i7 = (1 << i6) - 1;
        byte b = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            sArr[i8] = 0;
            bArr3[i8] = (byte) i8;
        }
        byte[] bArr5 = ne.KWHzl;
        int i9 = i6;
        int i10 = i5;
        int i11 = i7;
        int i12 = 0;
        int iAkhnZx = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        while (true) {
            if (i12 >= i3) {
                break;
            }
            if (iAkhnZx == 0) {
                iAkhnZx = AkhnZx();
                if (iAkhnZx <= 0) {
                    ne.fJNWhG = 3;
                    break;
                }
                i16 = b;
            }
            i13 += (bArr5[i16] & UnsignedBytes.MAX_VALUE) << i15;
            i16++;
            iAkhnZx--;
            int i20 = i10;
            int i21 = i9;
            int i22 = i19;
            int i23 = i14;
            int i24 = i15 + 8;
            while (true) {
                if (i24 < i21) {
                    ne = this;
                    i19 = i22;
                    i10 = i20;
                    i15 = i24;
                    b = 0;
                    i9 = i21;
                    i14 = i23;
                    i6 = i6;
                    break;
                }
                int i25 = i13 & i11;
                i13 >>= i21;
                i24 -= i21;
                if (i25 == i4) {
                    i22 = -1;
                    i21 = i6;
                    i20 = i5;
                    i11 = i7;
                } else {
                    int i26 = i6;
                    if (i25 == i4 + 1) {
                        ne = this;
                        i9 = i21;
                        i19 = i22;
                        i10 = i20;
                        i15 = i24;
                        i6 = i26;
                        i14 = i23;
                        b = 0;
                        break;
                    }
                    if (i22 == -1) {
                        bArr2[i17] = bArr3[i25];
                        i17++;
                        i12++;
                        i22 = i25;
                        i23 = i22;
                        i6 = i26;
                    } else {
                        if (i25 >= i20) {
                            bArr4[i18] = (byte) i23;
                            i18++;
                            s = i22;
                        } else {
                            s = i25;
                        }
                        while (s >= i4) {
                            bArr4[i18] = bArr3[s];
                            i18++;
                            s = sArr[s];
                        }
                        int i27 = bArr3[s] & UnsignedBytes.MAX_VALUE;
                        byte b2 = (byte) i27;
                        bArr2[i17] = b2;
                        while (true) {
                            i17++;
                            i12++;
                            if (i18 <= 0) {
                                break;
                            }
                            i18--;
                            bArr2[i17] = bArr4[i18];
                        }
                        byte[] bArr6 = bArr4;
                        if (i20 < 4096) {
                            sArr[i20] = (short) i22;
                            bArr3[i20] = b2;
                            i20++;
                            if ((i20 & i11) == 0 && i20 < 4096) {
                                i21++;
                                i11 += i20;
                            }
                        }
                        i22 = i25;
                        bArr4 = bArr6;
                        i23 = i27;
                        i6 = i26;
                    }
                }
            }
        }
        java.util.Arrays.fill(bArr2, i17, i3, b);
    }

    public final int fetchVPNInfo() {
        return this.fARcdN.get() & UnsignedBytes.MAX_VALUE;
    }

    public final int AkhnZx() {
        int iFetchVPNInfo = fetchVPNInfo();
        if (iFetchVPNInfo <= 0) {
            return iFetchVPNInfo;
        }
        java.nio.ByteBuffer byteBuffer = this.fARcdN;
        byteBuffer.get(this.KWHzl, 0, java.lang.Math.min(iFetchVPNInfo, byteBuffer.remaining()));
        return iFetchVPNInfo;
    }

    public final android.graphics.Bitmap valueOf() {
        java.lang.Boolean bool = this.djBIcL;
        android.graphics.Bitmap bitmapEZpvd = this.OLrzqt.EZpvd(this.valueOf, this.gEmmrt, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.AEQbTJ);
        bitmapEZpvd.setHasAlpha(true);
        return bitmapEZpvd;
    }
}
