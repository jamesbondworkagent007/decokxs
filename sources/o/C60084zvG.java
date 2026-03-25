package o;

/* JADX INFO: renamed from: o.zvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60084zvG {
    public final java.math.BigInteger AEQbTJ;
    public final java.math.BigInteger KWHzl;

    public C60084zvG(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.AEQbTJ = bigInteger;
        this.KWHzl = bigInteger2;
    }

    public boolean OLrzqt() {
        return this.KWHzl.compareTo(C60091zvN.AEQbTJ) <= 0;
    }

    public C60084zvG copydefault() {
        return !OLrzqt() ? new C60084zvG(this.AEQbTJ, C60091zvN.KWHzl.getN().subtract(this.KWHzl)) : this;
    }
}
