package o;

/* JADX INFO: renamed from: o.ywO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58176ywO {
    public final int AkhnZx;
    public final int DbNXlk;
    public final int fIwbmz;
    public final byte fetchVPNInfo;

    @java.lang.Deprecated
    public final byte isConnected;
    public final int values;

    /* JADX INFO: renamed from: o.ywO$StateListAnimator */
    public static class StateListAnimator {
        public boolean AEQbTJ;
        public int AYXKKw;
        public int AhwBna;
        public long EZpvd;
        public int KWHzl;
        public byte[] OLrzqt;
        public int copydefault;
        public int valueOf;
    }

    public static boolean EZpvd(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    public abstract void AEQbTJ(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator);

    public abstract boolean AEQbTJ(byte b);

    public int copydefault() {
        return 8192;
    }

    public abstract void copydefault(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator);

    public AbstractC58176ywO(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, (byte) 61);
    }

    public AbstractC58176ywO(int i, int i2, int i3, int i4, byte b) {
        this.isConnected = (byte) 61;
        this.fIwbmz = i;
        this.values = i2;
        this.AkhnZx = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.DbNXlk = i4;
        this.fetchVPNInfo = b;
    }

    public int AEQbTJ(StateListAnimator stateListAnimator) {
        if (stateListAnimator.OLrzqt != null) {
            return stateListAnimator.AYXKKw - stateListAnimator.valueOf;
        }
        return 0;
    }

    public final byte[] OLrzqt(StateListAnimator stateListAnimator) {
        byte[] bArr = stateListAnimator.OLrzqt;
        if (bArr == null) {
            stateListAnimator.OLrzqt = new byte[copydefault()];
            stateListAnimator.AYXKKw = 0;
            stateListAnimator.valueOf = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            stateListAnimator.OLrzqt = bArr2;
        }
        return stateListAnimator.OLrzqt;
    }

    public byte[] copydefault(int i, StateListAnimator stateListAnimator) {
        byte[] bArr = stateListAnimator.OLrzqt;
        return (bArr == null || bArr.length < stateListAnimator.AYXKKw + i) ? OLrzqt(stateListAnimator) : bArr;
    }

    public int EZpvd(byte[] bArr, int i, int i2, StateListAnimator stateListAnimator) {
        if (stateListAnimator.OLrzqt == null) {
            return stateListAnimator.AEQbTJ ? -1 : 0;
        }
        int iMin = java.lang.Math.min(AEQbTJ(stateListAnimator), i2);
        java.lang.System.arraycopy(stateListAnimator.OLrzqt, stateListAnimator.valueOf, bArr, i, iMin);
        int i3 = stateListAnimator.valueOf + iMin;
        stateListAnimator.valueOf = i3;
        if (i3 >= stateListAnimator.AYXKKw) {
            stateListAnimator.OLrzqt = null;
        }
        return iMin;
    }

    public byte[] copydefault(java.lang.String str) {
        return valueOf(C58178ywQ.AEQbTJ(str));
    }

    public byte[] valueOf(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        copydefault(bArr, 0, bArr.length, stateListAnimator);
        copydefault(bArr, 0, -1, stateListAnimator);
        int i = stateListAnimator.AYXKKw;
        byte[] bArr2 = new byte[i];
        EZpvd(bArr2, 0, i, stateListAnimator);
        return bArr2;
    }

    public byte[] gEmmrt(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? bArr : OLrzqt(bArr, 0, bArr.length);
    }

    public byte[] OLrzqt(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        StateListAnimator stateListAnimator = new StateListAnimator();
        AEQbTJ(bArr, i, i2, stateListAnimator);
        AEQbTJ(bArr, i, -1, stateListAnimator);
        int i3 = stateListAnimator.AYXKKw - stateListAnimator.valueOf;
        byte[] bArr2 = new byte[i3];
        EZpvd(bArr2, 0, i3, stateListAnimator);
        return bArr2;
    }

    public boolean OLrzqt(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.fetchVPNInfo == b || AEQbTJ(b)) {
                return true;
            }
        }
        return false;
    }

    public long AYXKKw(byte[] bArr) {
        int length = bArr.length;
        long j = ((long) (((length + r0) - 1) / this.fIwbmz)) * ((long) this.values);
        int i = this.AkhnZx;
        if (i <= 0) {
            return j;
        }
        long j2 = i;
        return j + ((((j2 + j) - 1) / j2) * ((long) this.DbNXlk));
    }
}
