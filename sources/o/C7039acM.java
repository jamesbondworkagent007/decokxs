package o;

/* JADX INFO: renamed from: o.acM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7039acM {
    public int AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public char[] OLrzqt = new char[8];

    public final boolean EZpvd(char[] cArr, int i) {
        this.OLrzqt = null;
        this.AEQbTJ = 0;
        this.KWHzl = 0;
        int i2 = i + 1;
        char c = cArr[i];
        this.EZpvd = c;
        if ((32768 & c) != 0) {
            int i3 = c & 32767;
            this.EZpvd = i3;
            int i4 = i + 2;
            if (cArr.length < i3 + i4) {
                this.EZpvd = 0;
                throw new java.lang.IndexOutOfBoundsException();
            }
            this.AEQbTJ = cArr[i2];
            i2 = i4;
        } else {
            if (cArr.length < i2 + c) {
                this.EZpvd = 0;
                throw new java.lang.IndexOutOfBoundsException();
            }
            this.AEQbTJ = c;
        }
        int i5 = this.EZpvd;
        char[] cArr2 = new char[i5];
        this.OLrzqt = cArr2;
        java.lang.System.arraycopy(cArr, i2, cArr2, 0, i5);
        return true;
    }

    public final boolean EZpvd(int i, int[] iArr) {
        if (i < 0) {
            return false;
        }
        if (this.OLrzqt == null) {
            this.OLrzqt = new char[8];
        }
        if (iArr == null || iArr.length < 2) {
            throw new java.lang.IllegalArgumentException();
        }
        int i2 = i * 2;
        int i3 = this.AEQbTJ;
        if (i2 < i3) {
            char[] cArr = this.OLrzqt;
            int i4 = i2 + 1;
            iArr[0] = cArr[i2];
            if (i4 < i3) {
                iArr[1] = cArr[i4] - 1;
            } else if (i4 < this.EZpvd) {
                iArr[1] = (cArr[i2 + 2] | (cArr[i4] << 16)) - 1;
            } else {
                iArr[1] = 1114111;
            }
            return true;
        }
        int i5 = (i2 - i3) * 2;
        int i6 = this.EZpvd - i3;
        if (i5 >= i6) {
            return false;
        }
        int i7 = this.KWHzl + i3;
        char[] cArr2 = this.OLrzqt;
        int i8 = i7 + i5;
        iArr[0] = cArr2[i8 + 1] | (cArr2[i8] << 16);
        int i9 = i5 + 2;
        if (i9 < i6) {
            int i10 = i7 + i9;
            iArr[1] = ((cArr2[i10] << 16) | cArr2[i10 + 1]) - 1;
        } else {
            iArr[1] = 1114111;
        }
        return true;
    }

    public final int KWHzl() {
        int i = this.AEQbTJ;
        return ((i + ((this.EZpvd - i) / 2)) + 1) / 2;
    }
}
