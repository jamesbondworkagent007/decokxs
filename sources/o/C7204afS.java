package o;

import androidx.core.internal.view.SupportMenu;
import o.C7111adf;

/* JADX INFO: renamed from: o.afS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7204afS {
    public C7114adi AEQbTJ;
    public int EZpvd;
    public C7286agv KWHzl;
    public byte OLrzqt;
    public AbstractC7052acZ copydefault;
    public java.lang.String valueOf;

    public static final int AEQbTJ(long j, int i) {
        return (((int) j) << 16) | ((i >> 8) & 65280) | (i & 63);
    }

    public static final boolean KWHzl(long j) {
        return (j & 281470698455103L) != 0;
    }

    public static final int copydefault(int i) {
        return (i >>> 16) & 65535;
    }

    public static final int copydefault(long j, int i) {
        return (((int) j) & SupportMenu.CATEGORY_MASK) | ((i >> 16) & 65280) | ((i >> 8) & 255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte AEQbTJ() {
        byte b = this.OLrzqt;
        if (b == 1) {
            return (byte) 0;
        }
        return b;
    }

    public int hashCode() {
        return 42;
    }

    public C7204afS(C7286agv c7286agv) {
        this.copydefault = null;
        this.KWHzl = c7286agv;
        this.EZpvd = 0;
        this.OLrzqt = (byte) 0;
        this.AEQbTJ = null;
    }

    public C7204afS(java.lang.String str, C7286agv c7286agv) {
        this(c7286agv);
        copydefault(str);
    }

    public int EZpvd() {
        C7114adi c7114adi;
        if (this.OLrzqt < 0 && (c7114adi = this.AEQbTJ) != null && !c7114adi.AEQbTJ()) {
            int iGEmmrt = this.copydefault.gEmmrt();
            if (this.EZpvd != 0) {
                iGEmmrt++;
            }
            return this.AEQbTJ.OLrzqt(iGEmmrt);
        }
        return this.copydefault.djBIcL();
    }

    public int KWHzl() {
        byte b = this.OLrzqt;
        if (b > 1) {
            int i = this.EZpvd;
            if (i != 0) {
                this.EZpvd = 0;
                return i;
            }
        } else {
            if (b != 1 && b != 0) {
                throw new java.lang.IllegalStateException("Illegal change of direction");
            }
            this.OLrzqt = (byte) 2;
        }
        this.copydefault.copydefault();
        long jAYXKKw = this.copydefault.AYXKKw();
        if (jAYXKKw == 4311744768L) {
            return -1;
        }
        long j = jAYXKKw >>> 32;
        int i2 = (int) jAYXKKw;
        int iCopydefault = copydefault(j, i2);
        int iAEQbTJ = AEQbTJ(j, i2);
        if (iAEQbTJ != 0) {
            this.EZpvd = iAEQbTJ | 192;
        }
        return iCopydefault;
    }

    public void copydefault(java.lang.String str) {
        AbstractC7052acZ c7107adb;
        this.valueOf = str;
        boolean zValueOf = ((C7110ade) this.KWHzl.gEmmrt.OLrzqt()).valueOf();
        if (((C7110ade) this.KWHzl.gEmmrt.OLrzqt()).copydefault()) {
            c7107adb = new C7112adg(this.KWHzl.AhwBna, zValueOf, this.valueOf, 0);
        } else {
            c7107adb = new C7107adb(this.KWHzl.AhwBna, zValueOf, this.valueOf, 0);
        }
        this.copydefault = c7107adb;
        this.EZpvd = 0;
        this.OLrzqt = (byte) 0;
    }

    /* JADX INFO: renamed from: o.afS$TaskDescription */
    public static final class TaskDescription implements C7111adf.Application {
        public java.util.Map<java.lang.Integer, java.lang.Integer> AEQbTJ;

        @Override // o.C7111adf.Application
        public void OLrzqt(long j) {
        }

        public TaskDescription(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
            this.AEQbTJ = map;
        }

        @Override // o.C7111adf.Application
        public void copydefault(long[] jArr, int i, int i2) {
            if (i2 <= 1) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 += C7204afS.KWHzl(jArr[i + i4]) ? 2 : 1;
            }
            long j = jArr[(i + i2) - 1];
            long j2 = j >>> 32;
            int i5 = (int) j;
            int iAEQbTJ = C7204afS.AEQbTJ(j2, i5);
            int iCopydefault = iAEQbTJ == 0 ? C7204afS.copydefault(j2, i5) : iAEQbTJ | 192;
            java.lang.Integer num = this.AEQbTJ.get(java.lang.Integer.valueOf(iCopydefault));
            if (num == null || i3 > num.intValue()) {
                this.AEQbTJ.put(java.lang.Integer.valueOf(iCopydefault), java.lang.Integer.valueOf(i3));
            }
        }
    }

    public static final java.util.Map<java.lang.Integer, java.lang.Integer> copydefault(C7048acV c7048acV) {
        java.util.HashMap map = new java.util.HashMap();
        new C7111adf(null, null, new TaskDescription(map), true).copydefault(c7048acV);
        return map;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7204afS)) {
            return false;
        }
        C7204afS c7204afS = (C7204afS) obj;
        return this.KWHzl.equals(c7204afS.KWHzl) && this.EZpvd == c7204afS.EZpvd && AEQbTJ() == c7204afS.AEQbTJ() && this.valueOf.equals(c7204afS.valueOf) && this.copydefault.equals(c7204afS.copydefault);
    }
}
