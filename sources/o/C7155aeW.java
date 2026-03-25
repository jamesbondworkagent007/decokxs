package o;

import o.InterfaceC7141aeI;

/* JADX INFO: renamed from: o.aeW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7155aeW implements InterfaceC7141aeI {
    public java.util.List<InterfaceC7141aeI> AYXKKw = null;
    public boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.copydefault = true;
    }

    public void OLrzqt(InterfaceC7141aeI interfaceC7141aeI) {
        if (this.AYXKKw == null) {
            this.AYXKKw = new java.util.ArrayList();
        }
        this.AYXKKw.add(interfaceC7141aeI);
    }

    public int EZpvd() {
        java.util.List<InterfaceC7141aeI> list = this.AYXKKw;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // o.InterfaceC7141aeI
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        if (this.AYXKKw == null) {
            return false;
        }
        C7145aeM c7145aeM2 = new C7145aeM();
        c7145aeM2.EZpvd(c7145aeM);
        int iAEQbTJ = c7031acE.AEQbTJ();
        int i = 0;
        boolean z = true;
        while (i < this.AYXKKw.size()) {
            InterfaceC7141aeI interfaceC7141aeI = this.AYXKKw.get(i);
            int iAEQbTJ2 = c7031acE.AEQbTJ();
            boolean zAEQbTJ = c7031acE.length() != 0 ? interfaceC7141aeI.AEQbTJ(c7031acE, c7145aeM) : true;
            boolean z2 = c7031acE.AEQbTJ() != iAEQbTJ2;
            boolean z3 = interfaceC7141aeI instanceof InterfaceC7141aeI.Activity;
            if (!z2 || !z3) {
                if (z2) {
                    i++;
                    if (i < this.AYXKKw.size()) {
                        int iAEQbTJ3 = c7031acE.AEQbTJ();
                        int i2 = c7145aeM.EZpvd;
                        if (iAEQbTJ3 != i2 && i2 > iAEQbTJ2) {
                            c7031acE.AEQbTJ(i2);
                        }
                    }
                } else {
                    if (!z3) {
                        c7031acE.AEQbTJ(iAEQbTJ);
                        c7145aeM.EZpvd(c7145aeM2);
                        return zAEQbTJ;
                    }
                    i++;
                }
            }
            z = zAEQbTJ;
        }
        return z;
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        java.util.List<InterfaceC7141aeI> list = this.AYXKKw;
        if (list == null) {
            return false;
        }
        return list.get(0).OLrzqt(c7031acE);
    }

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
        if (this.AYXKKw == null) {
            return;
        }
        for (int i = 0; i < this.AYXKKw.size(); i++) {
            this.AYXKKw.get(i).KWHzl(c7145aeM);
        }
    }

    public java.lang.String toString() {
        return "<SeriesMatcher " + this.AYXKKw + ">";
    }
}
