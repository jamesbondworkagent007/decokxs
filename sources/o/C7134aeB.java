package o;

import o.C7105adZ;

/* JADX INFO: renamed from: o.aeB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7134aeB extends C7155aeW implements C7105adZ.Activity {
    public C7139aeG AEQbTJ;
    public int EZpvd;
    public C7135aeC KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C7155aeW
    public java.lang.String toString() {
        return this.OLrzqt;
    }

    public C7134aeB(java.lang.String str) {
        this.OLrzqt = str;
    }

    public static C7134aeB copydefault(java.lang.String str, C7135aeC c7135aeC, int i) {
        if (str.isEmpty()) {
            return null;
        }
        C7134aeB c7134aeB = new C7134aeB(str);
        c7134aeB.KWHzl = c7135aeC;
        c7134aeB.AEQbTJ = (i & 512) != 0 ? null : c7135aeC.copydefault();
        c7134aeB.EZpvd = 0;
        C7105adZ.KWHzl(str, c7134aeB);
        c7134aeB.KWHzl = null;
        c7134aeB.AEQbTJ = null;
        c7134aeB.EZpvd = 0;
        c7134aeB.OLrzqt();
        return c7134aeB;
    }

    @Override // o.C7105adZ.Activity
    public void OLrzqt(int i) {
        if (this.AEQbTJ != null && EZpvd() > 0 && (this.EZpvd < 0 || !this.AEQbTJ.EZpvd().AEQbTJ(this.EZpvd))) {
            OLrzqt(this.AEQbTJ);
        }
        if (i < 0) {
            switch (i) {
                case -9:
                case -8:
                case -7:
                case -6:
                case -5:
                    OLrzqt(this.KWHzl.AEQbTJ());
                    break;
                case -4:
                    OLrzqt(this.KWHzl.EZpvd());
                    break;
                case -3:
                    OLrzqt(this.KWHzl.KWHzl());
                    break;
                case -2:
                    OLrzqt(this.KWHzl.djBIcL());
                    break;
                case -1:
                    OLrzqt(this.KWHzl.OLrzqt());
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        } else {
            C7139aeG c7139aeG = this.AEQbTJ;
            if (c7139aeG == null || !c7139aeG.EZpvd().AEQbTJ(i)) {
                OLrzqt(C7184aez.copydefault(i));
            }
        }
        this.EZpvd = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7134aeB) {
            return this.OLrzqt.equals(((C7134aeB) obj).OLrzqt);
        }
        return false;
    }

    public int hashCode() {
        return this.OLrzqt.hashCode();
    }
}
