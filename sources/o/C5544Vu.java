package o;

/* JADX INFO: renamed from: o.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5544Vu {
    public static final char[] EZpvd = new char[0];
    public boolean AEQbTJ;
    public int AYXKKw;
    public char[] AhwBna;
    public int AkhnZx;
    public char[] KWHzl;
    public int OLrzqt;
    public final C5536Vm copydefault;
    public java.lang.String djBIcL;
    public java.util.ArrayList<char[]> fetchVPNInfo;
    public char[] gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char[] AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DbNXlk() {
        return this.valueOf >= 0 || this.gEmmrt != null || this.djBIcL == null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int isConnected() {
        int i = this.valueOf;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public C5544Vu(C5536Vm c5536Vm) {
        this.copydefault = c5536Vm;
    }

    public C5544Vu(C5536Vm c5536Vm, char[] cArr) {
        this.copydefault = c5536Vm;
        this.KWHzl = cArr;
        this.OLrzqt = cArr.length;
        this.valueOf = -1;
    }

    public static C5544Vu OLrzqt(char[] cArr) {
        return new C5544Vu(null, cArr);
    }

    public void fetchVPNInfo() {
        char[] cArr;
        this.valueOf = -1;
        this.OLrzqt = 0;
        this.AYXKKw = 0;
        this.AhwBna = null;
        this.gEmmrt = null;
        if (this.AEQbTJ) {
            AEQbTJ();
        }
        C5536Vm c5536Vm = this.copydefault;
        if (c5536Vm == null || (cArr = this.KWHzl) == null) {
            return;
        }
        this.KWHzl = null;
        c5536Vm.KWHzl(2, cArr);
    }

    public void EZpvd(char[] cArr, int i, int i2) {
        this.djBIcL = null;
        this.gEmmrt = null;
        this.AhwBna = cArr;
        this.valueOf = i;
        this.AYXKKw = i2;
        if (this.AEQbTJ) {
            AEQbTJ();
        }
    }

    public void copydefault(char[] cArr, int i, int i2) {
        this.AhwBna = null;
        this.valueOf = -1;
        this.AYXKKw = 0;
        this.djBIcL = null;
        this.gEmmrt = null;
        if (this.AEQbTJ) {
            AEQbTJ();
        } else if (this.KWHzl == null) {
            this.KWHzl = OLrzqt(i2);
        }
        this.AkhnZx = 0;
        this.OLrzqt = 0;
        OLrzqt(cArr, i, i2);
    }

    public void AEQbTJ(java.lang.String str, int i, int i2) {
        this.AhwBna = null;
        this.valueOf = -1;
        this.AYXKKw = 0;
        this.djBIcL = null;
        this.gEmmrt = null;
        if (this.AEQbTJ) {
            AEQbTJ();
        } else if (this.KWHzl == null) {
            this.KWHzl = OLrzqt(i2);
        }
        this.AkhnZx = 0;
        this.OLrzqt = 0;
        EZpvd(str, i, i2);
    }

    public void KWHzl(java.lang.String str) {
        this.AhwBna = null;
        this.valueOf = -1;
        this.AYXKKw = 0;
        this.djBIcL = str;
        this.gEmmrt = null;
        if (this.AEQbTJ) {
            AEQbTJ();
        }
        this.OLrzqt = 0;
    }

    public final char[] OLrzqt(int i) {
        C5536Vm c5536Vm = this.copydefault;
        if (c5536Vm != null) {
            return c5536Vm.copydefault(2, i);
        }
        return new char[java.lang.Math.max(i, 500)];
    }

    public final void AEQbTJ() {
        this.AEQbTJ = false;
        this.fetchVPNInfo.clear();
        this.AkhnZx = 0;
        this.OLrzqt = 0;
    }

    public int values() {
        if (this.valueOf >= 0) {
            return this.AYXKKw;
        }
        char[] cArr = this.gEmmrt;
        if (cArr != null) {
            return cArr.length;
        }
        java.lang.String str = this.djBIcL;
        return str != null ? str.length() : this.AkhnZx + this.OLrzqt;
    }

    public char[] valueOf() {
        if (this.valueOf >= 0) {
            return this.AhwBna;
        }
        char[] cArr = this.gEmmrt;
        if (cArr != null) {
            return cArr;
        }
        java.lang.String str = this.djBIcL;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.gEmmrt = charArray;
            return charArray;
        }
        if (this.AEQbTJ) {
            return KWHzl();
        }
        char[] cArr2 = this.KWHzl;
        return cArr2 == null ? EZpvd : cArr2;
    }

    public java.lang.String copydefault() {
        if (this.djBIcL == null) {
            char[] cArr = this.gEmmrt;
            if (cArr != null) {
                this.djBIcL = new java.lang.String(cArr);
            } else {
                int i = this.valueOf;
                if (i >= 0) {
                    int i2 = this.AYXKKw;
                    if (i2 < 1) {
                        this.djBIcL = "";
                        return "";
                    }
                    this.djBIcL = new java.lang.String(this.AhwBna, i, i2);
                } else {
                    int i3 = this.AkhnZx;
                    int i4 = this.OLrzqt;
                    if (i3 == 0) {
                        this.djBIcL = i4 != 0 ? new java.lang.String(this.KWHzl, 0, i4) : "";
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(i3 + i4);
                        java.util.ArrayList<char[]> arrayList = this.fetchVPNInfo;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.fetchVPNInfo.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.KWHzl, 0, this.OLrzqt);
                        this.djBIcL = sb.toString();
                    }
                }
            }
        }
        return this.djBIcL;
    }

    public char[] KWHzl() {
        char[] cArr = this.gEmmrt;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrAkhnZx = AkhnZx();
        this.gEmmrt = cArrAkhnZx;
        return cArrAkhnZx;
    }

    public double AEQbTJ(boolean z) throws java.lang.NumberFormatException {
        return C5522Uy.KWHzl(copydefault(), z);
    }

    public float OLrzqt(boolean z) throws java.lang.NumberFormatException {
        return C5522Uy.OLrzqt(copydefault(), z);
    }

    public int EZpvd(boolean z) {
        char[] cArr;
        int i = this.valueOf;
        if (i < 0 || (cArr = this.AhwBna) == null) {
            if (z) {
                return -C5522Uy.EZpvd(this.KWHzl, 1, this.OLrzqt - 1);
            }
            return C5522Uy.EZpvd(this.KWHzl, 0, this.OLrzqt);
        }
        if (z) {
            return -C5522Uy.EZpvd(cArr, i + 1, this.AYXKKw - 1);
        }
        return C5522Uy.EZpvd(cArr, i, this.AYXKKw);
    }

    public long KWHzl(boolean z) {
        char[] cArr;
        int i = this.valueOf;
        if (i < 0 || (cArr = this.AhwBna) == null) {
            if (z) {
                return -C5522Uy.copydefault(this.KWHzl, 1, this.OLrzqt - 1);
            }
            return C5522Uy.copydefault(this.KWHzl, 0, this.OLrzqt);
        }
        if (z) {
            return -C5522Uy.copydefault(cArr, i + 1, this.AYXKKw - 1);
        }
        return C5522Uy.copydefault(cArr, i, this.AYXKKw);
    }

    public void KWHzl(char c) {
        if (this.valueOf >= 0) {
            djBIcL(16);
        }
        this.djBIcL = null;
        this.gEmmrt = null;
        char[] cArr = this.KWHzl;
        if (this.OLrzqt >= cArr.length) {
            EZpvd(1);
            cArr = this.KWHzl;
        }
        int i = this.OLrzqt;
        this.OLrzqt = i + 1;
        cArr[i] = c;
    }

    public void OLrzqt(char[] cArr, int i, int i2) {
        if (this.valueOf >= 0) {
            djBIcL(i2);
        }
        this.djBIcL = null;
        this.gEmmrt = null;
        char[] cArr2 = this.KWHzl;
        int length = cArr2.length;
        int i3 = this.OLrzqt;
        int i4 = length - i3;
        if (i4 >= i2) {
            java.lang.System.arraycopy(cArr, i, cArr2, i3, i2);
            this.OLrzqt += i2;
            return;
        }
        if (i4 > 0) {
            java.lang.System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            EZpvd(i2);
            int iMin = java.lang.Math.min(this.KWHzl.length, i2);
            java.lang.System.arraycopy(cArr, i, this.KWHzl, 0, iMin);
            this.OLrzqt += iMin;
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public void EZpvd(java.lang.String str, int i, int i2) {
        if (this.valueOf >= 0) {
            djBIcL(i2);
        }
        this.djBIcL = null;
        this.gEmmrt = null;
        char[] cArr = this.KWHzl;
        int length = cArr.length;
        int i3 = this.OLrzqt;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.OLrzqt += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            EZpvd(i2);
            int iMin = java.lang.Math.min(this.KWHzl.length, i2);
            int i6 = i + iMin;
            str.getChars(i, i6, this.KWHzl, 0);
            this.OLrzqt += iMin;
            i2 -= iMin;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public char[] AhwBna() {
        if (this.valueOf >= 0) {
            djBIcL(1);
        } else {
            char[] cArr = this.KWHzl;
            if (cArr == null) {
                this.KWHzl = OLrzqt(0);
            } else if (this.OLrzqt >= cArr.length) {
                EZpvd(1);
            }
        }
        return this.KWHzl;
    }

    public char[] EZpvd() {
        this.valueOf = -1;
        this.OLrzqt = 0;
        this.AYXKKw = 0;
        this.AhwBna = null;
        this.djBIcL = null;
        this.gEmmrt = null;
        if (this.AEQbTJ) {
            AEQbTJ();
        }
        char[] cArr = this.KWHzl;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrOLrzqt = OLrzqt(0);
        this.KWHzl = cArrOLrzqt;
        return cArrOLrzqt;
    }

    public java.lang.String KWHzl(int i) {
        this.OLrzqt = i;
        if (this.AkhnZx > 0) {
            return copydefault();
        }
        java.lang.String str = i == 0 ? "" : new java.lang.String(this.KWHzl, 0, i);
        this.djBIcL = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:6:0x0025, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] gEmmrt() {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = new java.util.ArrayList<>();
        }
        this.AEQbTJ = true;
        this.fetchVPNInfo.add(this.KWHzl);
        int length = this.KWHzl.length;
        this.AkhnZx += length;
        this.OLrzqt = 0;
        int i = length + (length >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = 65536;
            if (i > 65536) {
            }
        }
        char[] cArrAEQbTJ = AEQbTJ(i);
        this.KWHzl = cArrAEQbTJ;
        return cArrAEQbTJ;
    }

    public char[] OLrzqt() {
        char[] cArr = this.KWHzl;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] cArrCopyOf = java.util.Arrays.copyOf(cArr, i);
        this.KWHzl = cArrCopyOf;
        return cArrCopyOf;
    }

    public java.lang.String toString() {
        return copydefault();
    }

    public final void djBIcL(int i) {
        int i2 = this.AYXKKw;
        this.AYXKKw = 0;
        char[] cArr = this.AhwBna;
        this.AhwBna = null;
        int i3 = this.valueOf;
        this.valueOf = -1;
        int i4 = i + i2;
        char[] cArr2 = this.KWHzl;
        if (cArr2 == null || i4 > cArr2.length) {
            this.KWHzl = OLrzqt(i4);
        }
        if (i2 > 0) {
            java.lang.System.arraycopy(cArr, i3, this.KWHzl, 0, i2);
        }
        this.AkhnZx = 0;
        this.OLrzqt = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r0
  0x0026: PHI (r0v8 int) = (r0v6 int), (r0v7 int) binds: [B:6:0x0024, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(int i) {
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = new java.util.ArrayList<>();
        }
        char[] cArr = this.KWHzl;
        this.AEQbTJ = true;
        this.fetchVPNInfo.add(cArr);
        this.AkhnZx += cArr.length;
        this.OLrzqt = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = 65536;
            if (i2 > 65536) {
            }
        }
        this.KWHzl = AEQbTJ(i2);
    }

    public final char[] AkhnZx() {
        int i;
        java.lang.String str = this.djBIcL;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.valueOf;
        if (i2 >= 0) {
            int i3 = this.AYXKKw;
            if (i3 < 1) {
                return EZpvd;
            }
            if (i2 == 0) {
                return java.util.Arrays.copyOf(this.AhwBna, i3);
            }
            return java.util.Arrays.copyOfRange(this.AhwBna, i2, i3 + i2);
        }
        int iValues = values();
        if (iValues < 1) {
            return EZpvd;
        }
        char[] cArrAEQbTJ = AEQbTJ(iValues);
        java.util.ArrayList<char[]> arrayList = this.fetchVPNInfo;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.fetchVPNInfo.get(i4);
                int length = cArr.length;
                java.lang.System.arraycopy(cArr, 0, cArrAEQbTJ, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        java.lang.System.arraycopy(this.KWHzl, 0, cArrAEQbTJ, i, this.OLrzqt);
        return cArrAEQbTJ;
    }

    public final char[] AEQbTJ(int i) {
        return new char[i];
    }
}
