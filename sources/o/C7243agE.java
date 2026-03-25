package o;

import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.agE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7243agE {
    public static int EZpvd = -1;

    @java.lang.Deprecated
    public int AEQbTJ;

    @java.lang.Deprecated
    public int AYXKKw;
    public int OLrzqt;
    public int copydefault;
    public UnicodeSet gEmmrt;
    public java.lang.String valueOf;
    public int KWHzl = 0;
    public int AhwBna = 0;
    public java.util.Iterator<java.lang.String> djBIcL = null;

    public C7243agE(UnicodeSet unicodeSet) {
        KWHzl(unicodeSet);
    }

    public C7243agE() {
        KWHzl(new UnicodeSet());
    }

    public boolean EZpvd() {
        int i = this.AYXKKw;
        if (i <= this.AEQbTJ) {
            this.AYXKKw = i + 1;
            this.copydefault = i;
            this.OLrzqt = i;
            return true;
        }
        int i2 = this.AhwBna;
        if (i2 < this.KWHzl) {
            int i3 = i2 + 1;
            this.AhwBna = i3;
            KWHzl(i3);
            int i4 = this.AYXKKw;
            this.AYXKKw = i4 + 1;
            this.copydefault = i4;
            this.OLrzqt = i4;
            return true;
        }
        java.util.Iterator<java.lang.String> it = this.djBIcL;
        if (it == null) {
            return false;
        }
        this.OLrzqt = EZpvd;
        this.valueOf = it.next();
        if (!this.djBIcL.hasNext()) {
            this.djBIcL = null;
        }
        return true;
    }

    public void KWHzl(UnicodeSet unicodeSet) {
        this.gEmmrt = unicodeSet;
        copydefault();
    }

    public void copydefault() {
        int iDjBIcL = this.gEmmrt.djBIcL() - 1;
        this.KWHzl = iDjBIcL;
        this.AhwBna = 0;
        this.AEQbTJ = -1;
        this.AYXKKw = 0;
        if (iDjBIcL >= 0) {
            KWHzl(0);
        }
        this.djBIcL = this.gEmmrt.AhwBna() ? this.gEmmrt.values.iterator() : null;
    }

    @java.lang.Deprecated
    public void KWHzl(int i) {
        this.AYXKKw = this.gEmmrt.AYXKKw(i);
        this.AEQbTJ = this.gEmmrt.djBIcL(i);
    }
}
