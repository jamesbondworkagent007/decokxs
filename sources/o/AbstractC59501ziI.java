package o;

/* JADX INFO: renamed from: o.ziI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59501ziI {
    public final int AkhnZx;
    public final int DbNXlk;
    public final byte fetchVPNInfo;

    @java.lang.Deprecated
    public final byte gEmmrt;
    public final int isConnected;
    public final int values;

    public abstract void AEQbTJ(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator);

    public int copydefault() {
        return 8192;
    }

    public abstract void copydefault(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator);

    public abstract boolean copydefault(byte b);

    /* JADX INFO: renamed from: o.ziI$StateListAnimator */
    public static class StateListAnimator {
        public boolean AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public int EZpvd;
        public byte[] KWHzl;
        public int OLrzqt;
        public long copydefault;
        public int djBIcL;

        public java.lang.String toString() {
            return java.lang.String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), java.util.Arrays.toString(this.KWHzl), java.lang.Integer.valueOf(this.OLrzqt), java.lang.Boolean.valueOf(this.AEQbTJ), java.lang.Integer.valueOf(this.EZpvd), java.lang.Long.valueOf(this.copydefault), java.lang.Integer.valueOf(this.djBIcL), java.lang.Integer.valueOf(this.AhwBna), java.lang.Integer.valueOf(this.AYXKKw));
        }
    }

    public AbstractC59501ziI(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    public AbstractC59501ziI(int i, int i2, int i3, int i4, byte b) {
        this.gEmmrt = (byte) 61;
        this.AkhnZx = i;
        this.DbNXlk = i2;
        this.isConnected = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.values = i4;
        this.fetchVPNInfo = b;
    }

    public int EZpvd(StateListAnimator stateListAnimator) {
        if (stateListAnimator.KWHzl != null) {
            return stateListAnimator.AhwBna - stateListAnimator.AYXKKw;
        }
        return 0;
    }

    public final byte[] OLrzqt(StateListAnimator stateListAnimator) {
        byte[] bArr = stateListAnimator.KWHzl;
        if (bArr == null) {
            stateListAnimator.KWHzl = new byte[copydefault()];
            stateListAnimator.AhwBna = 0;
            stateListAnimator.AYXKKw = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            stateListAnimator.KWHzl = bArr2;
        }
        return stateListAnimator.KWHzl;
    }

    public byte[] copydefault(int i, StateListAnimator stateListAnimator) {
        byte[] bArr = stateListAnimator.KWHzl;
        return (bArr == null || bArr.length < stateListAnimator.AhwBna + i) ? OLrzqt(stateListAnimator) : bArr;
    }

    public int OLrzqt(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator) {
        if (stateListAnimator.KWHzl == null) {
            return stateListAnimator.AEQbTJ ? -1 : 0;
        }
        int iMin = java.lang.Math.min(EZpvd(stateListAnimator), i2);
        java.lang.System.arraycopy(stateListAnimator.KWHzl, stateListAnimator.AYXKKw, bArr, i, iMin);
        int i3 = stateListAnimator.AYXKKw + iMin;
        stateListAnimator.AYXKKw = i3;
        if (i3 >= stateListAnimator.AhwBna) {
            stateListAnimator.KWHzl = null;
        }
        return iMin;
    }

    public byte[] EZpvd(java.lang.String str) {
        return valueOf(C59500ziH.copydefault(str));
    }

    public byte[] valueOf(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        AEQbTJ(bArr, 0, bArr.length, stateListAnimator);
        AEQbTJ(bArr, 0, -1, stateListAnimator);
        int i = stateListAnimator.AhwBna;
        byte[] bArr2 = new byte[i];
        OLrzqt(bArr2, 0, i, stateListAnimator);
        return bArr2;
    }

    public byte[] AYXKKw(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        copydefault(bArr, 0, bArr.length, stateListAnimator);
        copydefault(bArr, 0, -1, stateListAnimator);
        int i = stateListAnimator.AhwBna - stateListAnimator.AYXKKw;
        byte[] bArr2 = new byte[i];
        OLrzqt(bArr2, 0, i, stateListAnimator);
        return bArr2;
    }

    public boolean AhwBna(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.fetchVPNInfo == b || copydefault(b)) {
                return true;
            }
        }
        return false;
    }

    public long gEmmrt(byte[] bArr) {
        int length = bArr.length;
        long j = ((long) (((length + r0) - 1) / this.AkhnZx)) * ((long) this.DbNXlk);
        int i = this.isConnected;
        if (i <= 0) {
            return j;
        }
        long j2 = i;
        return j + ((((j2 + j) - 1) / j2) * ((long) this.values));
    }
}
