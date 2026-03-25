package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5532Vi {
    public int AEQbTJ;
    public final boolean AYXKKw;
    public java.lang.String[] AhwBna;
    public final int AkhnZx;
    public int DbNXlk;
    public int EZpvd;
    public boolean KWHzl;
    public int[] OLrzqt;
    public final boolean copydefault;
    public int djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public final AtomicReference<Application> isConnected;
    public final C5532Vi valueOf;
    public int values;

    public static int copydefault(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ(int i, int i2) {
        int i3 = i + (i >>> 15);
        int i4 = ((i3 ^ (i3 >>> 9)) + (i2 * 33)) ^ this.AkhnZx;
        int i5 = i4 + (i4 >>> 16);
        int i6 = i5 ^ (i5 >>> 4);
        return i6 + (i6 << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl(int i) {
        return (i & (this.EZpvd - 1)) << 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl(int i, int i2, int i3) {
        int i4 = i ^ this.AkhnZx;
        int i5 = (((i4 + (i4 >>> 9)) * 31) + i2) * 33;
        int i6 = (i5 + (i5 >>> 15)) ^ i3;
        int i7 = i6 + (i6 >>> 4);
        int i8 = i7 + (i7 >>> 15);
        return i8 ^ (i8 << 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        int i = this.EZpvd;
        return (i << 3) - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL(int i) {
        int i2 = i ^ this.AkhnZx;
        int i3 = i2 + (i2 >>> 16);
        int i4 = i3 ^ (i3 << 3);
        return i4 + (i4 >>> 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return !this.KWHzl;
    }

    public C5532Vi(int i, int i2) {
        this.valueOf = null;
        this.AEQbTJ = 0;
        this.KWHzl = true;
        this.AkhnZx = i2;
        this.AYXKKw = false;
        this.copydefault = true;
        int i3 = 16;
        if (i < 16) {
            i = i3;
        } else if (((i - 1) & i) != 0) {
            while (i3 < i) {
                i3 += i3;
            }
            i = i3;
        }
        this.isConnected = new AtomicReference<>(Application.AEQbTJ(i));
    }

    public C5532Vi(C5532Vi c5532Vi, int i, Application application, boolean z, boolean z2) {
        this.valueOf = c5532Vi;
        this.AkhnZx = i;
        this.AYXKKw = z;
        this.copydefault = z2;
        this.isConnected = null;
        this.AEQbTJ = application.OLrzqt;
        int i2 = application.EZpvd;
        this.EZpvd = i2;
        int i3 = i2 << 2;
        this.djBIcL = i3;
        this.values = i3 + (i3 >> 1);
        this.DbNXlk = application.AhwBna;
        this.OLrzqt = application.AEQbTJ;
        this.AhwBna = application.KWHzl;
        this.fetchVPNInfo = application.djBIcL;
        this.gEmmrt = application.copydefault;
        this.KWHzl = true;
    }

    public static C5532Vi AEQbTJ() {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        return OLrzqt((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static C5532Vi OLrzqt(int i) {
        return new C5532Vi(64, i);
    }

    public C5532Vi AhwBna(int i) {
        return new C5532Vi(this, this.AkhnZx, this.isConnected.get(), JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i), JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i));
    }

    public void AhwBna() {
        if (this.valueOf == null || !valueOf()) {
            return;
        }
        this.valueOf.OLrzqt(new Application(this));
        this.KWHzl = true;
    }

    public final void OLrzqt(Application application) {
        int i = application.OLrzqt;
        Application application2 = this.isConnected.get();
        if (i == application2.OLrzqt) {
            return;
        }
        if (i > 6000) {
            application = Application.AEQbTJ(64);
        }
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.isConnected, application2, application);
    }

    public int gEmmrt() {
        int i = this.djBIcL;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.OLrzqt[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int AYXKKw() {
        int i = this.values;
        int i2 = 0;
        for (int i3 = this.djBIcL + 3; i3 < i; i3 += 4) {
            if (this.OLrzqt[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public int DbNXlk() {
        int i = this.values + 3;
        int i2 = this.EZpvd;
        int i3 = 0;
        for (int i4 = i; i4 < i2 + i; i4 += 4) {
            if (this.OLrzqt[i4] != 0) {
                i3++;
            }
        }
        return i3;
    }

    public int AkhnZx() {
        return (this.fetchVPNInfo - OLrzqt()) >> 2;
    }

    public int isConnected() {
        int i = this.EZpvd;
        int i2 = 0;
        for (int i3 = 3; i3 < (i << 3); i3 += 4) {
            if (this.OLrzqt[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public java.lang.String toString() {
        int iGEmmrt = gEmmrt();
        int iAYXKKw = AYXKKw();
        int iDbNXlk = DbNXlk();
        int iAkhnZx = AkhnZx();
        int iIsConnected = isConnected();
        return java.lang.String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C5532Vi.class.getName(), java.lang.Integer.valueOf(this.AEQbTJ), java.lang.Integer.valueOf(this.EZpvd), java.lang.Integer.valueOf(iGEmmrt), java.lang.Integer.valueOf(iAYXKKw), java.lang.Integer.valueOf(iDbNXlk), java.lang.Integer.valueOf(iAkhnZx), java.lang.Integer.valueOf(iGEmmrt + iAYXKKw + iDbNXlk + iAkhnZx), java.lang.Integer.valueOf(iIsConnected));
    }

    public java.lang.String AYXKKw(int i) {
        int iKWHzl = KWHzl(djBIcL(i));
        int[] iArr = this.OLrzqt;
        int i2 = iArr[iKWHzl + 3];
        if (i2 == 1) {
            if (iArr[iKWHzl] == i) {
                return this.AhwBna[iKWHzl >> 2];
            }
        } else if (i2 == 0) {
            return null;
        }
        int i3 = this.djBIcL + ((iKWHzl >> 3) << 2);
        int i4 = iArr[i3 + 3];
        if (i4 == 1) {
            if (iArr[i3] == i) {
                return this.AhwBna[i3 >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        return EZpvd(iKWHzl, i);
    }

    public java.lang.String copydefault(int i, int i2) {
        int iKWHzl = KWHzl(AEQbTJ(i, i2));
        int[] iArr = this.OLrzqt;
        int i3 = iArr[iKWHzl + 3];
        if (i3 == 2) {
            if (i == iArr[iKWHzl] && i2 == iArr[iKWHzl + 1]) {
                return this.AhwBna[iKWHzl >> 2];
            }
        } else if (i3 == 0) {
            return null;
        }
        int i4 = this.djBIcL + ((iKWHzl >> 3) << 2);
        int i5 = iArr[i4 + 3];
        if (i5 == 2) {
            if (i == iArr[i4] && i2 == iArr[i4 + 1]) {
                return this.AhwBna[i4 >> 2];
            }
        } else if (i5 == 0) {
            return null;
        }
        return copydefault(iKWHzl, i, i2);
    }

    public java.lang.String AEQbTJ(int i, int i2, int i3) {
        int iKWHzl = KWHzl(KWHzl(i, i2, i3));
        int[] iArr = this.OLrzqt;
        int i4 = iArr[iKWHzl + 3];
        if (i4 == 3) {
            if (i == iArr[iKWHzl] && iArr[iKWHzl + 1] == i2 && iArr[iKWHzl + 2] == i3) {
                return this.AhwBna[iKWHzl >> 2];
            }
        } else if (i4 == 0) {
            return null;
        }
        int i5 = this.djBIcL + ((iKWHzl >> 3) << 2);
        int i6 = iArr[i5 + 3];
        if (i6 == 3) {
            if (i == iArr[i5] && iArr[i5 + 1] == i2 && iArr[i5 + 2] == i3) {
                return this.AhwBna[i5 >> 2];
            }
        } else if (i6 == 0) {
            return null;
        }
        return EZpvd(iKWHzl, i, i2, i3);
    }

    public java.lang.String OLrzqt(int[] iArr, int i) {
        if (i < 4) {
            if (i == 1) {
                return AYXKKw(iArr[0]);
            }
            if (i != 2) {
                return i != 3 ? "" : AEQbTJ(iArr[0], iArr[1], iArr[2]);
            }
            return copydefault(iArr[0], iArr[1]);
        }
        int iEZpvd = EZpvd(iArr, i);
        int iKWHzl = KWHzl(iEZpvd);
        int[] iArr2 = this.OLrzqt;
        int i2 = iArr2[iKWHzl + 3];
        if (iEZpvd == iArr2[iKWHzl] && i2 == i && AEQbTJ(iArr, i, iArr2[iKWHzl + 1])) {
            return this.AhwBna[iKWHzl >> 2];
        }
        if (i2 == 0) {
            return null;
        }
        int i3 = this.djBIcL + ((iKWHzl >> 3) << 2);
        int i4 = iArr2[i3 + 3];
        if (iEZpvd == iArr2[i3] && i4 == i && AEQbTJ(iArr, i, iArr2[i3 + 1])) {
            return this.AhwBna[i3 >> 2];
        }
        return copydefault(iKWHzl, iEZpvd, iArr, i);
    }

    public final java.lang.String EZpvd(int i, int i2) {
        int i3 = this.values;
        int i4 = this.DbNXlk;
        int i5 = i3 + ((i >> (i4 + 2)) << i4);
        int[] iArr = this.OLrzqt;
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            int i7 = iArr[i6 + 3];
            if (i2 == iArr[i6] && 1 == i7) {
                return this.AhwBna[i6 >> 2];
            }
            if (i7 == 0) {
                return null;
            }
        }
        for (int iOLrzqt = OLrzqt(); iOLrzqt < this.fetchVPNInfo; iOLrzqt += 4) {
            if (i2 == iArr[iOLrzqt] && 1 == iArr[iOLrzqt + 3]) {
                return this.AhwBna[iOLrzqt >> 2];
            }
        }
        return null;
    }

    public final java.lang.String copydefault(int i, int i2, int i3) {
        int i4 = this.values;
        int i5 = this.DbNXlk;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr = this.OLrzqt;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i2 == iArr[i7] && i3 == iArr[i7 + 1] && 2 == i8) {
                return this.AhwBna[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int iOLrzqt = OLrzqt(); iOLrzqt < this.fetchVPNInfo; iOLrzqt += 4) {
            if (i2 == iArr[iOLrzqt] && i3 == iArr[iOLrzqt + 1] && 2 == iArr[iOLrzqt + 3]) {
                return this.AhwBna[iOLrzqt >> 2];
            }
        }
        return null;
    }

    public final java.lang.String EZpvd(int i, int i2, int i3, int i4) {
        int i5 = this.values;
        int i6 = this.DbNXlk;
        int i7 = i5 + ((i >> (i6 + 2)) << i6);
        int[] iArr = this.OLrzqt;
        for (int i8 = i7; i8 < (1 << i6) + i7; i8 += 4) {
            int i9 = iArr[i8 + 3];
            if (i2 == iArr[i8] && i3 == iArr[i8 + 1] && i4 == iArr[i8 + 2] && 3 == i9) {
                return this.AhwBna[i8 >> 2];
            }
            if (i9 == 0) {
                return null;
            }
        }
        for (int iOLrzqt = OLrzqt(); iOLrzqt < this.fetchVPNInfo; iOLrzqt += 4) {
            if (i2 == iArr[iOLrzqt] && i3 == iArr[iOLrzqt + 1] && i4 == iArr[iOLrzqt + 2] && 3 == iArr[iOLrzqt + 3]) {
                return this.AhwBna[iOLrzqt >> 2];
            }
        }
        return null;
    }

    public final java.lang.String copydefault(int i, int i2, int[] iArr, int i3) {
        int i4 = this.values;
        int i5 = this.DbNXlk;
        int i6 = i4 + ((i >> (i5 + 2)) << i5);
        int[] iArr2 = this.OLrzqt;
        for (int i7 = i6; i7 < (1 << i5) + i6; i7 += 4) {
            int i8 = iArr2[i7 + 3];
            if (i2 == iArr2[i7] && i3 == i8 && AEQbTJ(iArr, i3, iArr2[i7 + 1])) {
                return this.AhwBna[i7 >> 2];
            }
            if (i8 == 0) {
                return null;
            }
        }
        for (int iOLrzqt = OLrzqt(); iOLrzqt < this.fetchVPNInfo; iOLrzqt += 4) {
            if (i2 == iArr2[iOLrzqt] && i3 == iArr2[iOLrzqt + 3] && AEQbTJ(iArr, i3, iArr2[iOLrzqt + 1])) {
                return this.AhwBna[iOLrzqt >> 2];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr2 = this.OLrzqt;
        switch (i) {
            case 4:
                i3 = 0;
                return iArr[i3] != iArr2[i2] && iArr[i3 + 1] == iArr2[i2 + 1] && iArr[i3 + 2] == iArr2[i2 + 2] && iArr[i3 + 3] == iArr2[i2 + 3];
            case 5:
                i4 = 0;
                i3 = i4 + 1;
                if (iArr[i4] == iArr2[i2]) {
                    return false;
                }
                i2++;
                if (iArr[i3] != iArr2[i2]) {
                    return false;
                }
            case 6:
                i5 = 0;
                i4 = i5 + 1;
                if (iArr[i5] == iArr2[i2]) {
                    return false;
                }
                i2++;
                i3 = i4 + 1;
                if (iArr[i4] == iArr2[i2]) {
                }
                break;
            case 7:
                i6 = 0;
                i5 = i6 + 1;
                if (iArr[i6] == iArr2[i2]) {
                    return false;
                }
                i2++;
                i4 = i5 + 1;
                if (iArr[i5] == iArr2[i2]) {
                }
                break;
            case 8:
                if (iArr[0] != iArr2[i2]) {
                    return false;
                }
                i2++;
                i6 = 1;
                i5 = i6 + 1;
                if (iArr[i6] == iArr2[i2]) {
                }
                break;
            default:
                return OLrzqt(iArr, i, i2);
        }
    }

    public final boolean OLrzqt(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (iArr[i3] != this.OLrzqt[i2]) {
                return false;
            }
            if (i4 >= i) {
                return true;
            }
            i2++;
            i3 = i4;
        }
    }

    public java.lang.String EZpvd(java.lang.String str, int[] iArr, int i) {
        int iAEQbTJ;
        KWHzl();
        if (this.AYXKKw) {
            str = InternCache.instance.intern(str);
        }
        if (i == 1) {
            iAEQbTJ = AEQbTJ(djBIcL(iArr[0]));
            int[] iArr2 = this.OLrzqt;
            iArr2[iAEQbTJ] = iArr[0];
            iArr2[iAEQbTJ + 3] = 1;
        } else if (i == 2) {
            iAEQbTJ = AEQbTJ(AEQbTJ(iArr[0], iArr[1]));
            int[] iArr3 = this.OLrzqt;
            iArr3[iAEQbTJ] = iArr[0];
            iArr3[iAEQbTJ + 1] = iArr[1];
            iArr3[iAEQbTJ + 3] = 2;
        } else if (i == 3) {
            int iAEQbTJ2 = AEQbTJ(KWHzl(iArr[0], iArr[1], iArr[2]));
            int[] iArr4 = this.OLrzqt;
            iArr4[iAEQbTJ2] = iArr[0];
            iArr4[iAEQbTJ2 + 1] = iArr[1];
            iArr4[iAEQbTJ2 + 2] = iArr[2];
            iArr4[iAEQbTJ2 + 3] = 3;
            iAEQbTJ = iAEQbTJ2;
        } else {
            int iEZpvd = EZpvd(iArr, i);
            iAEQbTJ = AEQbTJ(iEZpvd);
            this.OLrzqt[iAEQbTJ] = iEZpvd;
            int iCopydefault = copydefault(iArr, i);
            int[] iArr5 = this.OLrzqt;
            iArr5[iAEQbTJ + 1] = iCopydefault;
            iArr5[iAEQbTJ + 3] = i;
        }
        this.AhwBna[iAEQbTJ >> 2] = str;
        this.AEQbTJ++;
        return str;
    }

    public final void KWHzl() {
        if (this.KWHzl) {
            if (this.valueOf == null) {
                if (this.AEQbTJ == 0) {
                    throw new java.lang.IllegalStateException("Cannot add names to Root symbol table");
                }
                throw new java.lang.IllegalStateException("Cannot add names to Placeholder symbol table");
            }
            int[] iArr = this.OLrzqt;
            this.OLrzqt = java.util.Arrays.copyOf(iArr, iArr.length);
            java.lang.String[] strArr = this.AhwBna;
            this.AhwBna = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            this.KWHzl = false;
        }
    }

    public final int AEQbTJ(int i) {
        int iKWHzl = KWHzl(i);
        int[] iArr = this.OLrzqt;
        if (iArr[iKWHzl + 3] == 0) {
            return iKWHzl;
        }
        if (EZpvd()) {
            return EZpvd(i);
        }
        int i2 = this.djBIcL + ((iKWHzl >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.values;
        int i4 = this.DbNXlk;
        int i5 = i3 + ((iKWHzl >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.fetchVPNInfo;
        int i8 = i7 + 4;
        this.fetchVPNInfo = i8;
        if (i8 < (this.EZpvd << 3)) {
            return i7;
        }
        if (this.copydefault) {
            copydefault();
        }
        return EZpvd(i);
    }

    public final int EZpvd(int i) {
        djBIcL();
        int iKWHzl = KWHzl(i);
        int[] iArr = this.OLrzqt;
        if (iArr[iKWHzl + 3] == 0) {
            return iKWHzl;
        }
        int i2 = this.djBIcL + ((iKWHzl >> 3) << 2);
        if (iArr[i2 + 3] == 0) {
            return i2;
        }
        int i3 = this.values;
        int i4 = this.DbNXlk;
        int i5 = i3 + ((iKWHzl >> (i4 + 2)) << i4);
        for (int i6 = i5; i6 < (1 << i4) + i5; i6 += 4) {
            if (iArr[i6 + 3] == 0) {
                return i6;
            }
        }
        int i7 = this.fetchVPNInfo;
        this.fetchVPNInfo = i7 + 4;
        return i7;
    }

    public final boolean EZpvd() {
        if (this.AEQbTJ <= (this.EZpvd >> 1)) {
            return false;
        }
        int i = this.fetchVPNInfo;
        int iOLrzqt = OLrzqt();
        int i2 = this.AEQbTJ;
        return ((i - iOLrzqt) >> 2) > ((i2 + 1) >> 7) || ((double) i2) > ((double) this.EZpvd) * 0.8d;
    }

    public final int copydefault(int[] iArr, int i) {
        int i2 = this.gEmmrt;
        int i3 = i2 + i;
        int[] iArr2 = this.OLrzqt;
        if (i3 > iArr2.length) {
            int length = iArr2.length;
            this.OLrzqt = java.util.Arrays.copyOf(this.OLrzqt, this.OLrzqt.length + java.lang.Math.max(i3 - length, java.lang.Math.min(4096, this.EZpvd)));
        }
        java.lang.System.arraycopy(iArr, 0, this.OLrzqt, i2, i);
        this.gEmmrt += i;
        return i2;
    }

    public int EZpvd(int[] iArr, int i) {
        if (i < 4) {
            throw new java.lang.IllegalArgumentException();
        }
        int i2 = iArr[0] ^ this.AkhnZx;
        int i3 = i2 + (i2 >>> 9) + iArr[1];
        int i4 = ((i3 + (i3 >>> 15)) * 33) ^ iArr[2];
        int i5 = i4 + (i4 >>> 4);
        for (int i6 = 3; i6 < i; i6++) {
            int i7 = iArr[i6];
            i5 += i7 ^ (i7 >> 21);
        }
        int i8 = i5 * 65599;
        int i9 = i8 + (i8 >>> 19);
        return (i9 << 5) ^ i9;
    }

    public final void djBIcL() {
        this.KWHzl = false;
        int[] iArr = this.OLrzqt;
        java.lang.String[] strArr = this.AhwBna;
        int i = this.EZpvd;
        int i2 = this.AEQbTJ;
        int i3 = i + i;
        int i4 = this.fetchVPNInfo;
        if (i3 > 65536) {
            copydefault(true);
            return;
        }
        this.OLrzqt = new int[iArr.length + (i << 3)];
        this.EZpvd = i3;
        int i5 = i3 << 2;
        this.djBIcL = i5;
        this.values = i5 + (i5 >> 1);
        this.DbNXlk = copydefault(i3);
        this.AhwBna = new java.lang.String[strArr.length << 1];
        copydefault(false);
        int[] iArr2 = new int[16];
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7 += 4) {
            int i8 = iArr[i7 + 3];
            if (i8 != 0) {
                i6++;
                java.lang.String str = strArr[i7 >> 2];
                if (i8 == 1) {
                    iArr2[0] = iArr[i7];
                    EZpvd(str, iArr2, 1);
                } else if (i8 == 2) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    EZpvd(str, iArr2, 2);
                } else if (i8 == 3) {
                    iArr2[0] = iArr[i7];
                    iArr2[1] = iArr[i7 + 1];
                    iArr2[2] = iArr[i7 + 2];
                    EZpvd(str, iArr2, 3);
                } else {
                    if (i8 > iArr2.length) {
                        iArr2 = new int[i8];
                    }
                    java.lang.System.arraycopy(iArr, iArr[i7 + 1], iArr2, 0, i8);
                    EZpvd(str, iArr2, i8);
                }
            }
        }
        if (i6 == i2) {
            return;
        }
        throw new java.lang.IllegalStateException("Failed rehash(): old count=" + i2 + ", copyCount=" + i6);
    }

    public final void copydefault(boolean z) {
        this.AEQbTJ = 0;
        this.fetchVPNInfo = OLrzqt();
        this.gEmmrt = this.EZpvd << 3;
        if (z) {
            java.util.Arrays.fill(this.OLrzqt, 0);
            java.util.Arrays.fill(this.AhwBna, (java.lang.Object) null);
        }
    }

    public void copydefault() {
        if (this.EZpvd <= 1024) {
            return;
        }
        throw new java.lang.IllegalStateException("Spill-over slots in symbol table with " + this.AEQbTJ + " entries, hash area of " + this.EZpvd + " slots is now full (all " + (this.EZpvd >> 3) + " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
    }

    /* JADX INFO: renamed from: o.Vi$Application */
    public static final class Application {
        public final int[] AEQbTJ;
        public final int AhwBna;
        public final int EZpvd;
        public final java.lang.String[] KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final int djBIcL;

        public Application(int i, int i2, int i3, int[] iArr, java.lang.String[] strArr, int i4, int i5) {
            this.EZpvd = i;
            this.OLrzqt = i2;
            this.AhwBna = i3;
            this.AEQbTJ = iArr;
            this.KWHzl = strArr;
            this.djBIcL = i4;
            this.copydefault = i5;
        }

        public Application(C5532Vi c5532Vi) {
            this.EZpvd = c5532Vi.EZpvd;
            this.OLrzqt = c5532Vi.AEQbTJ;
            this.AhwBna = c5532Vi.DbNXlk;
            this.AEQbTJ = c5532Vi.OLrzqt;
            this.KWHzl = c5532Vi.AhwBna;
            this.djBIcL = c5532Vi.fetchVPNInfo;
            this.copydefault = c5532Vi.gEmmrt;
        }

        public static Application AEQbTJ(int i) {
            int i2 = i << 3;
            return new Application(i, 0, C5532Vi.copydefault(i), new int[i2], new java.lang.String[i << 1], i2 - i, i2);
        }
    }
}
